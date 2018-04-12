package example.com.outofmemorytestforleakcanary;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(MainActivity.class.getSimpleName());
    }

    public void onClick(View view) {
//click();
        gs();
    }

    private void click() {
        Toast.makeText(this, "aaa", Toast.LENGTH_SHORT).show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("gaogao " + new Date());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Intent intent = new Intent(this, SecondMainActivity.class);
        startActivity(intent);
    }

    /**
     * 通过反射获取activityManagerNative, 然后修改locale配置
     */
    private void gs() {
        try {
            ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
            am.getDeviceConfigurationInfo();




            Class<?> activityManagerNative = Class.forName("android.app.ActivityManagerNative");
            Log.i("amnType", activityManagerNative.toString());

            Object am = activityManagerNative.getMethod("getDefault").invoke(activityManagerNative);
            Log.i("amType", am.getClass().toString());

            Object config = am.getClass().getMethod("getConfiguration").invoke(am);
            Log.i("configType", config.getClass().toString());
            config.getClass().getDeclaredField("locale").set(config, Locale.CHINA);
            config.getClass().getDeclaredField("userSetLocale").setBoolean(config, true);

            am.getClass().getMethod("updateConfiguration", android.content.res.Configuration.class).invoke(am, config);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 在 Manifest.xml 中添加权限
    //<uses-permission android:name="android.permission.WRITE_SETTINGS" />
    //<uses-permission android:name="android.permission.CHANGE_CONFIGURATION" />
 /*   private Configuration mConfiguration = new Configuration();


    private void updateConfiguration() {
        try {
            Class<?> activityManagerNative = Class.forName("android.app.ActivityManagerNative");
            try {
                Object am = activityManagerNative.getMethod("getDefault").invoke(activityManagerNative);
                Object config = am.getClass().getMethod("getConfiguration").invoke(am);
                Configuration configs = (Configuration) config;
                mConfiguration.updateFrom(configs);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    private void grantPermision() {
        try {
            String cmd = "pm grant " + getPackageName() + " android.permission.CHANGE_CONFIGURATION";
            CommandCapture command = new CommandCapture(0, false, cmd);
            RootTools.getShell(true).add(command);
            commandWait(Shell.startRootShell(), command);
            boolean result = command.getExitCode() == 0;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (RootDeniedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void commandWait(Shell shell, Command cmd) throws Exception {

        while (!cmd.isFinished()) {

            RootTools.log(TAG, shell.getCommandQueuePositionString(cmd));

            synchronized (cmd) {
                try {
                    if (!cmd.isFinished()) {
                        cmd.wait(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (!cmd.isExecuting() && !cmd.isFinished()) {
                if (!shell.isExecuting && !shell.isReading) {
                    Log.e(TAG, "Waiting for a command to be executed in a shell that is not executing and not reading! \n\n Command: " + cmd.getCommand());
                    Exception e = new Exception();
                    e.setStackTrace(Thread.currentThread().getStackTrace());
                    e.printStackTrace();
                } else if (shell.isExecuting && !shell.isReading) {
                    Log.e(TAG, "Waiting for a command to be executed in a shell that is executing but not reading! \n\n Command: " + cmd.getCommand());
                    Exception e = new Exception();
                    e.setStackTrace(Thread.currentThread().getStackTrace());
                    e.printStackTrace();
                } else {
                    Log.e(TAG, "Waiting for a command to be executed in a shell that is not reading! \n\n Command: " + cmd.getCommand());
                    Exception e = new Exception();
                    e.setStackTrace(Thread.currentThread().getStackTrace());
                    e.printStackTrace();
                }
            }

        }
    }


    public void setFontSize() {
        Method method;
        try {
            Class<?> activityManagerNative = Class.forName("android.app.ActivityManagerNative");
            try {
                Object am = activityManagerNative.getMethod("getDefault").invoke(activityManagerNative);
                method = am.getClass().getMethod("updatePersistentConfiguration", android.content.res.Configuration.class);

                method.invoke(am, mConfiguration);

            } catch (Exception e) {
                e.printStackTrace();

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    */
}
