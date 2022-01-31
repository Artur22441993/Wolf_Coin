package com.wooollf.ccooiin.utedsd.dus;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import com.wooollf.ccooiin.utedsd.MainActivity;
import com.wooollf.ccooiin.utedsd.WC;

public class INsm extends WebViewClient {

    Act act;
    @SuppressLint("StaticFieldLeak")
    public static WC wc;

    public INsm(Act act) {
        this.act = act;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains(Hids.deeeee("NDA0"))){
            act.startActivity(new Intent(act.getApplicationContext(), MainActivity.class));
            act.finishAffinity();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        wc.getSharedPreferences(wc.getPackageName(), wc.MODE_PRIVATE).edit().putString(Hids.deeeee("c2F2ZWRVcmw="),url).apply();
    }
}
