package com.example.dsm2018.secret;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List_Fragment ListView = (List_Fragment) getSupportFragmentManager().findFragmentById(R.id.ViewFragment);
        ListView.addItem(ContextCompat.();

    }
}
