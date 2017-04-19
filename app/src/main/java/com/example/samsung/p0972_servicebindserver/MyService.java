package com.example.samsung.p0972_servicebindserver;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;

public class MyService extends Service {

    private final String LOG_TAG = "myLogs";
    private String message = "";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        message = "MyService onCreate()";
        Log.d(LOG_TAG, message);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        message = "MyService onStartCommand()";
        Log.d(LOG_TAG, message);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        message = "MyService onBind()";
        Log.d(LOG_TAG, message);
        return new Binder();
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        message = "MyService onRebind()";
    }

    @Override
    public boolean onUnbind(Intent intent) {
        message = "MyService onUnbind()";
        Log.d(LOG_TAG, message);
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        message = "MyService onDestroy()";
        Log.d(LOG_TAG, message);
    }
}
