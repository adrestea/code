package example.com.analogaidlcommunication_client;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * https://blog.csdn.net/bjp000111/article/details/51919640
 */
public class MainActivity extends AppCompatActivity {
    public static String MYBINDER = "myservice";//这就是那个特殊字符，可以通过他获取IInterface对象。
    private IBinder service;
    String TAG = "gaogao" + this.getClass().getSimpleName();
    ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MainActivity.this.service = service;
            Log.d(TAG, "onServiceConnected service = " + service + "   ,name = " + name);
            setData();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d("gao", "service null");
            MainActivity.this.service = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean isConnected = false;

    public void onClick(View view) {

        if (isConnected) {
            unbindService(conn);
            isConnected = false;
            Log.d(TAG, "unbindService");
        } else {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("example.com.analogaidlcommunication_server", "example.com.analogaidlcommunication_server.MyService"));
//            intent.setComponent(new ComponentName(this, "example.com.analogaidlcommunication_client.MyService"));
            isConnected = bindService(intent, conn, BIND_AUTO_CREATE);
            Log.d(TAG, "bindService = " + isConnected);
        }
    }

    private void setData() {
        Parcel parcel = Parcel.obtain();//传输的数据
        Parcel obtain = Parcel.obtain();//返回的数据
        parcel.writeInterfaceToken(MYBINDER);//这个字符串可以随意写，但是在A应用那个地方接收传输数据的时候也要用这个字符串。这个方法作用是用来验证要传输的目标接口
        parcel.writeInt(5);//传输a = 5
        parcel.writeInt(6);//传输b = 5
        try {
            boolean transact = this.service.transact(1, parcel, obtain, 0);//传输过去后，返回一个boolean值表示是否传输成功。
            Log.d(TAG, "setData transact=" + transact);
            if (transact) {//如果成功，那么我就开始读取返回的结果。
                obtain.readException();
                int i = obtain.readInt();
                Log.d(TAG, "setData transact i=" + i);
                Toast.makeText(MainActivity.this, String.valueOf(i), Toast.LENGTH_SHORT).show();
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
