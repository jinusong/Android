package com.example.dsm2018.firebasenotify;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFBMessageService extends FirebaseMessagingService {

    String TAG = "firebasenotify";

    public MyFBMessageService() {
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "Notification Title: " +
        remoteMessage.getNotification().getTitle());
        Log.d(TAG, "Notification Message: " +
        remoteMessage.getNotification().getBody());
    }
}
