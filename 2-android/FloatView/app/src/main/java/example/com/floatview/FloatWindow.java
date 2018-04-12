package example.com.floatview;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.graphics.PixelFormat;
import android.nfc.Tag;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

import java.lang.reflect.Field;
import java.util.List;

public class FloatWindow /*implements View.OnTouchListener */ {

    private Context mContext;
    private WindowManager.LayoutParams mWindowParams;
    private WindowManager mWindowManager;

    private View mFloatLayout;
    private float mInViewX;
    private float mInViewY;
    private float mDownInScreenX;
    private float mDownInScreenY;
    private float mInScreenX;
    private float mInScreenY;

    public FloatWindow(Context context) {
        this.mContext = context;
        initFloatWindow();
    }

    private void initFloatWindow() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        if (inflater == null)
            return;
        mFloatLayout = (View) inflater.inflate(R.layout.activity_win, null);
//        mFloatLayout.setOnTouchListener(this);

        mWindowParams = new WindowManager.LayoutParams();
        mWindowManager = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        if (Build.VERSION.SDK_INT >= 26) {//8.0新特性
            mWindowParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            mWindowParams.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
        }

        mWindowParams.format = PixelFormat.RGBA_8888;
        mWindowParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        mWindowParams.gravity = Gravity.START | Gravity.TOP;
        mWindowParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        mWindowParams.height = WindowManager.LayoutParams.WRAP_CONTENT;


    }

//    @Override
//    public boolean onTouch(View view, MotionEvent motionEvent) {
//        return floatLayoutTouch(motionEvent);
//    }
//
//    private boolean floatLayoutTouch(MotionEvent motionEvent) {
//
//        switch (motionEvent.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                // 获取相对View的坐标，即以此View左上角为原点
//                mInViewX = motionEvent.getX();
//                mInViewY = motionEvent.getY();
//                // 获取相对屏幕的坐标，即以屏幕左上角为原点
//                mDownInScreenX = motionEvent.getRawX();
//                mDownInScreenY = motionEvent.getRawY() - getSysBarHeight(mContext);
//                mInScreenX = motionEvent.getRawX();
//                mInScreenY = motionEvent.getRawY() - getSysBarHeight(mContext);
//                break;
//            case MotionEvent.ACTION_MOVE:
//                // 更新浮动窗口位置参数
//                mInScreenX = motionEvent.getRawX();
//                mInScreenY = motionEvent.getRawY() - getSysBarHeight(mContext);
//                mWindowParams.x = (int) (mInScreenX - mInViewX);
//                mWindowParams.y = (int) (mInScreenY - mInViewY);
//                // 手指移动的时候更新小悬浮窗的位置
//                mWindowManager.updateViewLayout(mFloatLayout, mWindowParams);
//                break;
//            case MotionEvent.ACTION_UP:
//                // 如果手指离开屏幕时，xDownInScreen和xInScreen相等，且yDownInScreen和yInScreen相等，则视为触发了单击事件。
//                if (mDownInScreenX == mInScreenX && mDownInScreenY == mInScreenY) {
//
//                }
//                break;
//        }
//        return true;
//    }

    public void showFloatWindow() {
        if (mFloatLayout.getParent() == null) {
            DisplayMetrics metrics = new DisplayMetrics();
            //默认固定位置，靠屏幕右边缘的中间
            mWindowManager.getDefaultDisplay().getMetrics(metrics);
//            mWindowParams.x = metrics.widthPixels;
//            mWindowParams.y = metrics.heightPixels / 2 - getSysBarHeight(mContext);
//            mWindowParams.y = 0;
            mWindowParams.x = 200;
//            mWindowParams.y = 224;
            mWindowParams.y = 200;
            mWindowManager.addView(mFloatLayout, mWindowParams);
        }
        mFloatLayout.post(new Runnable() {

            @Override
            public void run() {

                int[] location = new int[2] ;
//                mFloatLayout.getLocationInWindow(location); //获取在当前窗口内的绝对坐标
                mFloatLayout.getLocationOnScreen(location);//获取在整个屏幕内的绝对坐标


                Log.d("gaogao",
                        "x=" + location[0] + "  y=" + location[1]
                                + "    getPivotX=" + mFloatLayout.getPivotX() + "  getPivotY=" + mFloatLayout.getPivotY()
                                + "   getMeasuredHeight=" + mFloatLayout.getMeasuredHeight() + "   , getMeasuredWidth=" + mFloatLayout.getMeasuredWidth()
                                + "   getSysBarHeight=" + getSysBarHeight(mContext) + "  getRotationX=" + mFloatLayout.getRotationX());
            }
        });
    }

    public void hideFloatWindow() {
        if (mFloatLayout.getParent() != null)
            mWindowManager.removeView(mFloatLayout);
    }

    public void setFloatLayoutAlpha(boolean alpha) {
        if (alpha)
            mFloatLayout.setAlpha((float) 0.5);
        else
            mFloatLayout.setAlpha(1);
    }

    // 获取系统状态栏高度
    public static int getSysBarHeight(Context contex) {
        Class<?> c;
        Object obj;
        Field field;
        int x;
        int sbar = 0;
        try {
            c = Class.forName("com.android.internal.R$dimen");
            obj = c.newInstance();
            field = c.getField("status_bar_height");
            x = Integer.parseInt(field.get(obj).toString());
            sbar = contex.getResources().getDimensionPixelSize(x);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return sbar;
    }


}
