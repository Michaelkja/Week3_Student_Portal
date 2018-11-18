package com.example.micha.week3_student_portal;


import android.webkit.WebView;


public class WebViewClient extends android.webkit.WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        view.loadUrl(url);
        return true;

    }
}
