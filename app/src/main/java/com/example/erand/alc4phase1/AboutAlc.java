package com.example.erand.alc4phase1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class AboutAlc extends AppCompatActivity {
    private static final int LOAD = 100;
    ProgressBar progressBar;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        webView = (WebView) findViewById(R.id.web);

//        progressBar = (ProgressBar) findViewById(R.id.progress);
//        progressBar.setVisibility(View.VISIBLE);
//        progressBar.setProgress(LOAD);

        webView.loadUrl("https:www.andela.com/alc");

    }
}
