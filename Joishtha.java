package com.example.tablayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Joishtha extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myview= inflater.inflate(R.layout.activity_joishtha,container,false);

        WebView webView = myview.findViewById(R.id.web);

        // this will enable the javascript.
        webView.getSettings().setJavaScriptEnabled(true);

        // loading https://www.geeksforgeeks.org url in the WebView.
        webView.loadUrl("https://www.dse.com.bd/");



        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.setWebViewClient(new WebViewClient());





        return myview;
    }
}