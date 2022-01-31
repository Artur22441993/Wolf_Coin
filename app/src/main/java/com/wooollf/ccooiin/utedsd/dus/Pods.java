package com.wooollf.ccooiin.utedsd.dus;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.wooollf.ccooiin.utedsd.R;

public class Pods extends AppCompatActivity {

    WebView podids;
    public static String ifnd;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pods);
        podids = findViewById(R.id.podids);
        podids.loadUrl(Hids.deeeee(ifnd));
        getWindow().addFlags(1024);
    }
}
