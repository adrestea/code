package example.com.analogaidlcommunication_client;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class MyService extends Service {
    public static String MYBINDER = "MyService";//这就是那个特殊字符，可以通过他获取IInterface对象。

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        // throw new UnsupportedOperationException("Not yet implemented");
        MyBinder binder = new MyBinder();
        binder.attachInterface(new MyBusiness(), MYBINDER);//这就是以键值进行存储IInterface引用。
        return new MyBinder();
    }
}

class MyBinder extends Binder {
    @Override
    protected boolean onTransact(int code, @NonNull Parcel data, @Nullable Parcel reply, int flags) throws RemoteException {
        switch (code) {//跟B应用的transact方法第一个参数一样。是判断要执行哪个方法和哪个数据。
            case 1:
                data.enforceInterface("this");//这个是验证接收数据的目标接口与B应用的parcel.writeInterfaceToke一样
                int a = data.readInt();//获取a
                int b = data.readInt();//获取b
                int add = ((MyBusiness) this.queryLocalInterface("this")).add(a, b);//返回结果
                //通过特殊字符串获取myBinder.attachInterface设置进去的IInterface对象，（也就是那个特殊任务）并调用add方法进行加法运算。
                reply.writeNoException();
                reply.writeInt(add);//将结果写给B应用
                return true;//返回true告诉数据指令接收成功
        }
        return super.onTransact(code, data, reply, flags);
    }
}

class MyBusiness implements IInterface {
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Retrieve the Binder object associated with this interface.
     * You must use this instead of a plain cast, so that proxy objects
     * can return the correct result.
     */
    @Override
    public IBinder asBinder() {//此方法来自IInterface
//        return null;
        return (IBinder) this;
    }
}