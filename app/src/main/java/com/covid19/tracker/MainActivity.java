package com.covid19.tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private static final String STARTUP_URL = "file:///android_asset/welcome.htm";

    private WebView covid19WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.covid19WebView = (WebView) findViewById(R.id.covid19WebView);
        this.covid19WebView.getSettings().setJavaScriptEnabled(true);
        this.covid19WebView.getSettings().setAppCacheEnabled(true);
        this.covid19WebView.setWebViewClient(new COVID19WebViewClient());
        this.covid19WebView.loadUrl(MainActivity.STARTUP_URL);
    }
}
