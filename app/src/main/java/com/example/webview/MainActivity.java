package com.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView web;
    EditText edtadd;
    Button btngo;
    String http = "http://";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        act();

    }

    private void act() {

        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String address = edtadd.getText().toString();
                web.loadUrl(http + address);
            }
        });
    }

    private void init() {
        edtadd = findViewById(R.id.edtadd);
        btngo = findViewById(R.id.btngo);
        web = findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
    }
}
