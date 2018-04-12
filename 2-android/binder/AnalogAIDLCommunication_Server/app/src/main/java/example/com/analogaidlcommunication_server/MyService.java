package example.com.analogaidlcommunication_server;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;


public class MyService extends Service {
    public static final String MYBINDER = "myservice";//这就是那个特殊字符，可以通过他获取IInterface对象。
    public static String TAG = "gaogao" + "_MyService";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind");
        MyBinder binder = new MyBinder();
        MyBusiness business = new MyBusiness();
        Log.d(TAG, "onBind business=" + business);
        binder.attachInterface(business, MYBINDER);//这就是以键值进行存储IInterface引用。
        return binder;
    }
}

class MyBinder extends Binder {
    @Override
    protected boolean onTransact(int code, @NonNull Parcel data, @Nullable Parcel reply, int flags) throws RemoteException {
        Log.d(MyService.TAG, "onTransact, code=" + code);
        switch (code) {//跟B应用的transact方法第一个参数一样。是判断要执行哪个方法和哪个数据。
            case 1:
                data.enforceInterface(MyService.MYBINDER);//这个是验证接收数据的目标接口与B应用的parcel.writeInterfaceToke一样
                int a = data.readInt();//获取a
                int b = data.readInt();//获取b
                IInterface iinterface = queryLocalInterface(MyService.MYBINDER);
                int add = ((MyBusiness) iinterface).add(a, b);//返回结果
                //通过特殊字符串获取myBinder.attachInterface设置进去的IInterface对象，（也就是那个特殊任务）并调用add方法进行加法运算。
                reply.writeNoException();
                Log.d(MyService.TAG, "onTransact, add=" + add);
                reply.writeInt(add);//将结果写给B应用
                return true;//返回true告诉数据指令接收成功
        }
        return super.onTransact(code, data, reply, flags);
    }
}

class MyBusiness implements IInterface {
    public int add(int a, int b) {
        Log.d(MyService.TAG, "MyBusiness add");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }

    /**
     * Retrieve the Binder object associated with this interface.
     * You must use this instead of a plain cast, so that proxy objects
     * can return the correct result.
     */
    @Override
    public IBinder asBinder() {//此方法来自IInterface
        return null;
//        return (IBinder) this;
    }
}