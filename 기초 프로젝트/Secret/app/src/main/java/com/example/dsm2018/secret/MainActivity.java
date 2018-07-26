package com.example.dsm2018.secret;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText idText = (EditText) findViewById(R.id.ID);
        final EditText pwdText = (EditText) findViewById(R.id.PWD);
        Button LoginButton = (Button) findViewById(R.id.logined);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = idText.getText().toString();
                String pwd = pwdText.getText().toString();
                login(id, pwd);
            }
        });
    }
    public void login(String id, String pwd){
        if (id.equals("") || pwd.equals("")) {
            Toast.makeText(MainActivity.this, "아이디또는 비밀번호를 입력해주세요", Toast.LENGTH_LONG).show();
        } else {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
