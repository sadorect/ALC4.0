package com.example.activitylauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static com.example.activitylauncher.R.*;


public class ALCProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_alcprofile);


        WebView myWebView = findViewById(id.profile_webview);
        myWebView.setWebViewClient(new WebViewClient()
                                   {
                                       public void onReceivedSslError(WebView myWebView, SslErrorHandler handler, SslError error)
                                       {handler.proceed();}
                                   }
        );
        myWebView.loadUrl("https://www.andela.com/alc");

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /*
        public void onBackPressed()

        {
            if (myWebView.canGoBack()){
                myWebView.goBack();
            }else{
                super.onBackPressed();
            }
        }
        */
    }

}
