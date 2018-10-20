package com.example.dsm2018.firebasenotify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FirebaseNotifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_notify);

        Bundle customData = getIntent().getExtras();

        if (customData != null) {
            TextView textView = (TextView) findViewById(R.id.myTextView);
            textView.setText(customData.getString("MyKey1"));
        }
    }
}
