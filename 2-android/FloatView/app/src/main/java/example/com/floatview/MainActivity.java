package example.com.floatview;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.lang.reflect.Method;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "gaogao";
    ImageView im, im_up, im_down;
    Picture picture_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im = findViewById(R.id.im);
        im_up = findViewById(R.id.im1);
        im_down = findViewById(R.id.im2);
        picture_status = new Picture();
//        Button btn = findViewById(R.id.btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                requestPermission();
//            }
//        });
//        Button btn1 = findViewById(R.id.btn1);

//        Configuration c = getResources().getConfiguration();
//        Log.d("gaogao", c.toString());
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FloatWindow fw = new FloatWindow(MainActivity.this);
//                fw.showFloatWindow();
//                createView1();
//                inputMethodSate2(MainActivity.this);
//            }
//        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((flag & last_action_is_volume_donw) != 0 ||
                ((last_action_is_volume_up & flag) != 0)) {
            flag &= (~(last_action_is_volume_up | last_action_is_volume_donw));
        }

        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            flag |= (flag_volume_down_down | last_action_is_volume_donw);
        } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            flag |= (flag_volume_up_down | last_action_is_volume_up);
        }

        Log.d("gaogao", "onKeyDown flag:" + Integer.toBinaryString(flag));
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            flag &= ~(flag_volume_down_down);
        } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            flag &= ~(flag_volume_up_down);
        }

        Log.d("gaogao", "onKeyUp flag:" + Integer.toBinaryString(flag));

        return super.onKeyUp(keyCode, event);
    }

    enum ACTION {Null, down, up}

    int onKey = 1;
    int flag_volume_up_down = 1;
    int last_action_is_volume_up = 2 << 0;
    int flag_volume_down_down = 2 << 2;
    int last_action_is_volume_donw = 2 << 3;


    int flag = 0;

    class Picture {
        ACTION action = ACTION.Null;
        int last_KeyCode;
        KeyEvent last_event;

        public Picture() {

        }

        void updateStatus(ACTION act, int keyCode, KeyEvent event) {
            if (action == ACTION.Null) {
                action = act;
                last_KeyCode = keyCode;
                last_event = event;
            }

        }

    }


    public int geti() {
        return 100;
    }

    public String getR() {
        return getResources().getString(R.string.app_name);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    WindowManager mWindowManager;
    WindowManager.LayoutParams wmParams;
    LinearLayout mFloatLayout;
    Button mFloatView;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 10) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (!Settings.canDrawOverlays(this)) {
                    // SYSTEM_ALERT_WINDOW permission not granted...
                    Toast.makeText(MainActivity.this, "not granted", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

//    private void createView1() {
//        final LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View mView = layoutInflater.inflate(R.layout.activity_win, null);
//        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
//                WindowManager.LayoutParams.MATCH_PARENT,
//                WindowManager.LayoutParams.MATCH_PARENT,
//                WindowManager.LayoutParams.TYPE_SYSTEM_ALERT,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                PixelFormat.TRANSLUCENT);
//        WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
//        params.setTitle(TAG);
//        wm.addView(mView, params);
//    }

    private void requestPermission() {
        //权限判断
        if (Build.VERSION.SDK_INT >= 23) {
            if (!Settings.canDrawOverlays(getApplicationContext())) {
                //启动Activity让用户授权
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
                startActivityForResult(intent, 10);
                return;
            } else {
                //执行6.0以上绘制代码
            }
        } else {
            //执行6.0以下绘制代码
        }
    }

    private void createFloatView() {

        //获取LayoutParams对象
        wmParams = new WindowManager.LayoutParams();

        //获取的是LocalWindowManager对象
        mWindowManager = this.getWindowManager();
        Log.i(TAG, "mWindowManager1--->" + this.getWindowManager());
        //mWindowManager = getWindow().getWindowManager();
        Log.i(TAG, "mWindowManager2--->" + getWindow().getWindowManager());

        //获取的是CompatModeWrapper对象
        //mWindowManager = (WindowManager) getApplication().getSystemService(Context.WINDOW_SERVICE);
        Log.i(TAG, "mWindowManager3--->" + mWindowManager);
        if (Build.VERSION.SDK_INT >= 26) {//8.0新特性
            wmParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            wmParams.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
            //        wmParams.type = WindowManager.LayoutParams.TYPE_PHONE;
        }

        wmParams.format = PixelFormat.RGBA_8888;
        wmParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        wmParams.gravity = Gravity.LEFT | Gravity.TOP;
        wmParams.x = 0;
        wmParams.y = 96;
        wmParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        wmParams.height = WindowManager.LayoutParams.WRAP_CONTENT;

        LayoutInflater inflater = this.getLayoutInflater();//LayoutInflater.from(getApplication());

        mFloatLayout = (LinearLayout) inflater.inflate(R.layout.activity_win, null);
        mWindowManager.addView(mFloatLayout, wmParams);
        //setContentView(R.layout.main);
//        mFloatView = (Button) mFloatLayout.findViewById(R.id.float_id);

        Log.i(TAG, "mFloatView" + mFloatView);
        Log.i(TAG, "mFloatView--parent-->" + mFloatView.getParent());
        Log.i(TAG, "mFloatView--parent--parent-->" + mFloatView.getParent().getParent());
        //绑定触摸移动监听
//        mFloatView.setOnTouchListener(new OnTouchListener() {
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                // TODO Auto-generated method stub
//                wmParams.x = (int) event.getRawX() - mFloatLayout.getWidth() / 2;
//                //25为状态栏高度
//                wmParams.y = (int) event.getRawY() - mFloatLayout.getHeight() / 2 - 40;
//                mWindowManager.updateViewLayout(mFloatLayout, wmParams);
//                return false;
//            }
//        });
//
//        //绑定点击监听
//        mFloatView.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                Intent intent = new Intent(FloatWindowTest.this, ResultActivity.class);
//                startActivity(intent);
//            }
//        });

    }


    /**
     * 软键盘状态判断
     *
     * @param context
     */
    public void inputMethodSate(Context context) {
        //得到默认输入法包名
        String defaultInputName = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.DEFAULT_INPUT_METHOD);
        defaultInputName = defaultInputName.substring(0, defaultInputName.indexOf("/"));

        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> appProcesses = activityManager.getRunningAppProcesses();
        boolean isInputing = false;
        for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
            if (appProcess.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_VISIBLE) {
                if (appProcess.processName.equals(defaultInputName)) {
                    isInputing = true;
                    break;
                }
            }
        }

        if (isInputing) {
            Log.v(TAG, "软键盘显示中");
        } else {
            Log.v(TAG, "软键盘隐藏中");
        }
    }

    /**
     * 软键盘状态判断
     *
     * @param context
     */
//    public void inputMethodSate2(Context context) {
//        //得到默认输入法包名
//        String defaultInputName = Settings.Secure.getString(getContentResolver(), Settings.Secure.DEFAULT_INPUT_METHOD);
//        defaultInputName = defaultInputName.substring(0, defaultInputName.indexOf("/"));
//        boolean isInputing = false;
//        if (android.os.Build.VERSION.SDK_INT > 20) {
//            try {
//                InputMethodManager imm = (InputMethodManager) context.getApplicationContext().getSystemService(Context.INPUT_METHOD_SERVICE);
//                Class clazz = imm.getClass();
//                Method method = clazz.getMethod("getInputMethodWindowVisibleHeight", null);
//                method.setAccessible(true);
//                int height = (Integer) method.invoke(imm, null);
//                Log.v("LOG", "height == " + height);
//                if (height > 100) {
//                    isInputing = true;
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
//            List<ActivityManager.RunningAppProcessInfo> appProcesses = activityManager.getRunningAppProcesses();
//
//            for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
//                if (appProcess.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_VISIBLE) {
//                    if (appProcess.processName.equals(defaultInputName)) {
//                        isInputing = true;
//                        break;
//                    }
//                }
//            }
//        }
//
//        if (isInputing) {
//            Log.v(TAG, "2软键盘显示中");
//        } else {
//            Log.v(TAG, "2软键盘隐藏中");
//        }
//    }

}
