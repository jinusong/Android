package com.example.dsm2018.onclickevent_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EventExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Button button = (Button) findViewById(R.id.myButton);
        button.setOnClickListener(
                //익명의 내부 클래스 정의 시작 부분
            new Button.OnClickListener() {
                public void onClick(View v){
                    TextView statusText =
                            (TextView)findViewById(R.id.statusText);
                    statusText.setText("Button clicked");
                }
            }
            //익명의 내부 클래스 정의 끝 부분
        );  //setOnClickListener() 메서드 호출의 끝 부분

        button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView statusText =
                                (TextView) findViewById(R.id.statusText);
                        statusText.setText("Long button click");
                        return true;
                    }
                }
        );
    }
}
