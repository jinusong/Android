package com.example.dsm2018.notifydemo;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NotifyDemoActivity extends AppCompatActivity {

    final  static String GROUP_KEY_NOTIFY = "group_key_notify";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify_demo);
    }

    public void sendNotification(View view) {
        Uri defaultSoundUri = RingtoneManager.getDefaultUri(
                RingtoneManager.TYPE_NOTIFICATION);

        NotificationCompat.Builder builderSummary =
                new NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("A Bundle Example")
                .setContentText("You have 3 new messages")
                .setSound(defaultSoundUri)
                .setGroup(GROUP_KEY_NOTIFY)
                .setGroupSummary(true);

        NotificationCompat.Builder builder1 =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(android.R.drawable.ic_dialog_info)
                        .setContentTitle("New Message")
                        .setContentText("You have a new message from Kassidy")
                        .setSound(defaultSoundUri)
                        .setGroup(GROUP_KEY_NOTIFY);

        NotificationCompat.Builder builder2 =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(android.R.drawable.ic_dialog_info)
                        .setContentTitle("New Message")
                        .setContentText("You have a new message from Caitlyn")
                        .setSound(defaultSoundUri)
                        .setGroup(GROUP_KEY_NOTIFY);

        NotificationCompat.Builder builder3 =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(android.R.drawable.ic_dialog_info)
                        .setContentTitle("New Message")
                        .setContentText("You have a new message from Jason")
                        .setSound(defaultSoundUri)
                        .setGroup(GROUP_KEY_NOTIFY);

        Intent resultIntent = new Intent(this, ResultActivity.class);
        PendingIntent pendingIntent =
                PendingIntent.getActivity(
                        this,
                        0,
                        resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );

        builderSummary.setContentIntent(pendingIntent);
        builder1.setContentIntent(pendingIntent);
        builder2.setContentIntent(pendingIntent);
        builder3.setContentIntent(pendingIntent);

        int notificationId0 = 100;
        int notificationId1 = 101;
        int notificationId2 = 102;
        int notificationId3 = 103;

        NotificationManager notifyMgr =
                (NotificationManager)
                        getSystemService(NOTIFICATION_SERVICE);

        notifyMgr.notify(notificationId1, builder1.build());
        notifyMgr.notify(notificationId2, builder2.build());
        notifyMgr.notify(notificationId2, builder2.build());
        notifyMgr.notify(notificationId3, builder3.build());
        notifyMgr.notify(notificationId0, builderSummary.build());
    }
}
