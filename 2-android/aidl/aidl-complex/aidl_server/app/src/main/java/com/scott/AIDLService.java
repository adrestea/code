package com.scott;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.scott.aidl.IGreetService;
import com.scott.aidl.Person;

public class AIDLService extends Service {

    private static final String TAG = "AIDLService";

    IGreetService.Stub stub = new IGreetService.Stub() {
        @Override
        public String greet(Person person) throws RemoteException {
            Log.i(TAG, "greet(Person person) called");

            String greeting = "hello, " + person.getName();
            switch (person.getSex()) {
                case 0:
                    greeting = greeting + ", you're handsome.";
                    break;
                case 1:
                    greeting = greeting + ", you're beautiful.";
                    break;
            }
            return greeting;
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "onBind() called");
        return stub;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(TAG, "onUnbind() called");
        return true;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }
}