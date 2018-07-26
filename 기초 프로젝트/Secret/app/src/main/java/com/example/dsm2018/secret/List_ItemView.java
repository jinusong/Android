package com.example.dsm2018.secret;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class List_ItemView extends LinearLayout {
    TextView textView1;
    TextView textView2;

    public List_ItemView(Context context){
        super(context);
        init(context);
    }

    public List_ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_third, this, true);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
    }

    public void setName(String name) {
        textView1.setText(name);
    }

    public void setSub(String Sub) {
        textView2.setText(Sub);
    }

}
