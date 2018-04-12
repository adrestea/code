package example.com.getotherapplicationimg;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import dalvik.system.DexClassLoader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.iv);
//        iv.setImageDrawable(getImage());

    }


    private int getString() {
//        Log.d("gaogao", "is:" + getResources().getIdentifier("ic_launcher", "mipmap", "example.com.getotherapplicationimg"));
//        Log.d("gaogao", "is:" + getResources().getIdentifier("ic_home", "drawable", "example.com.floatview"));
//        Log.d("gaogao", "is:" + getResources().getIdentifier("app_name", "string", "example.com.getotherapplicationimg"));
//        Log.d("gaogao", "is:" + getResources().getIdentifier("app_name", "string", "example.com.floatview"));

        String dexpath = null;
        try {
            dexpath = getPackageManager().getApplicationInfo("example.com.floatview", 0).sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        DexClassLoader loader = new DexClassLoader(dexpath, getApplicationInfo().dataDir, null, this.getClass().getClassLoader());
        try {
            Class<?> clazz = loader.loadClass("example.com.floatview.MainActivity");
            Method getR = clazz.getMethod("getResources");
            Object o = clazz.newInstance();
            Resources r = (Resources) getR.invoke(o);
            return r.getIdentifier("app_name", "string", "example.com.floatview");


//            Method geti = clazz.getDeclaredMethod("geti");
//            return (int) geti.invoke(clazz.newInstance());
            //调用静态方法
//            int ic_launcher = (Integer) getImageId.invoke(clazz);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void onClick(View v) {
//        int r = getString();
//        int r = getSysBarHeight(getApplication());
//        Log.d("gaogao", "" + r);

        try {
            Context c = createPackageContext("example.com.floatview", Context.CONTEXT_INCLUDE_CODE | Context.CONTEXT_IGNORE_SECURITY);
            //载入这个类
            Class clazz = c.getClassLoader().loadClass("example.com.floatview.MainActivity");
//新建一个实例
            Activity owner = (Activity) clazz.newInstance();
//获取print方法，传入参数并执行
            int i = (int) clazz.getMethod("geti").invoke(owner);
            String obj = (String) clazz.getMethod("getR").invoke(owner);

            getFieldValue("string", "app_name", c);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public int getSysBarHeight(Context contex) {
        Class<?> c;
        Object obj;
        Field field;
        int x;
        int sbar = 0;
        try {
//            c = Class.forName("com.android.internal.R$dimen");
            c = Class.forName("example.com.floatview.R");
            obj = c.newInstance();
            field = c.getField("app_name");
            x = Integer.parseInt(field.get(obj).toString());
            sbar = contex.getResources().getDimensionPixelSize(x);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return sbar;
    }


    /**
     * 根据给定的类型名和字段名，返回R文件中的字段的值
     *
     * @param typeName  属于哪个类别的属性 （id,layout,drawable,string,color,attr......）
     * @param fieldName 字段名
     * @return 字段的值
     * @throws Exception
     */
    public static int getFieldValue(String typeName, String fieldName, Context context) {
        int i = -1;
        try {
            Class<?> clazz = Class.forName(context.getPackageName() + ".R$" + typeName);
            i = clazz.getField(fieldName).getInt(null);
        } catch (Exception e) {
            Log.d("" + context.getClass(), "没有找到" + context.getPackageName() + ".R$" + typeName + "类型资源 " + fieldName + "请copy相应文件到对应的目录.");
            return -1;
        }
        return i;
    }
}
