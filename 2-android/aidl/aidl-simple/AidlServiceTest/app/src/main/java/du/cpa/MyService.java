package du.cpa;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import example.com.aidlservicetest.IMyAidlInterface;

public class MyService extends Service {
    public MyService() {
    }

    public class MyServiceImpl extends IMyAidlInterface.Stub {

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public String sayHello(String words) throws RemoteException {
            return "You say:" + words;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new MyServiceImpl();
    }
}
