package com.example.dsm2018.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText edtUrl;
    Button btnGo, btnBack;
    WebView web;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUrl = (EditText) findViewById(R.id.edtUrl);
        btnGo = (Button) findViewById(R.id.btnGo);
        btnBack = (Button) findViewById(R.id.btnBack);
        web = (WebView) findViewById(R.id.webView1);

        web.setWebViewClient(new CookWebViewClient());

        WebSettings webSet = web.getSettings();
        webSet.setBuiltInZoomControls(true);

        btnGo.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               web.loadUrl(edtUrl.getText().toString());
           }
        });

        btnBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                web.goBack();
            }
        });
    }
}
class CookWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest url) {

        return super.shouldOverrideUrlLoading(view, url);
    }
}