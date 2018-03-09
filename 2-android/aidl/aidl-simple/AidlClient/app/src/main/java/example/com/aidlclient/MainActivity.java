package example.com.aidlclient;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 方法1, 可以拷贝服务端的IMyAidlInterface.java到对应的目录
 * 方法2, 拷贝IMyAidlInterface.aidl到对应的目录
 * */
public class MainActivity extends AppCompatActivity {
    Button btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mIMyService == null) {
//                    final Intent intent = new Intent();
//                    intent.setClassName("example.com.aidlservicetest", "du.cpa.MyService");
//                    bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
//                } else {
//                    try {
//                        Toast.makeText(MainActivity.this, mIMyService.sayHello("Hello"), Toast.LENGTH_SHORT).show();
//                    } catch (RemoteException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
    }

//    IMyAidlInterface mIMyService;
//    private ServiceConnection mConnection = new ServiceConnection() {
//
//        public void onServiceConnected(ComponentName name, IBinder service) {
//            // 绑定成功,得到远程服务端的对象，目标完成！！！
//            mIMyService = IMyAidlInterface.Stub.asInterface(service);
//
//        }
//
//        public void onServiceDisconnected(ComponentName name) {
//            mIMyService = null;
//        }
//
//    };
}
