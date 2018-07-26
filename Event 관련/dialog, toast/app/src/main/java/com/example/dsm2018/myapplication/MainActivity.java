package com.example.dsm2018.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView tvName, tvEmail;
    Button button1;
    EditText dlgEdtName, dlgEdtEmail;
    TextView toastText;
    View dialogView, toastView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자 정보 입력");

        tvName = (TextView) findViewById(R.id.tvName);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        button1 = (Button) findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dialogView = (View) View.inflate(MainActivity.this, R.layout.dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_launcher);
                dlg.setView(dialogView);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d("click check", "dkjflksjf");

                        dlgEdtName = (EditText) dialogView.findViewById(R.id.dlgEdt1);
                        dlgEdtEmail = (EditText) dialogView.findViewById(R.id.dlgEdt2);

                        tvName.setText(dlgEdtName.getText().toString());
                        tvEmail.setText(dlgEdtEmail.getText().toString());
                    }
                });
                dlg.setNegativeButton("취소",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast toast = new Toast(MainActivity.this);
                                toastView = (View) View.inflate(MainActivity.this,
                                        R.layout.toast1, null);
                                toastText = (TextView) toastView.findViewById(R.id.toastText1);
                                toastText.setText("취소했습니다.");
                                toast.setView(toastView);
                                toast.show();
                            }
                        });

                dlg.show();
            }
        });

    }
}

