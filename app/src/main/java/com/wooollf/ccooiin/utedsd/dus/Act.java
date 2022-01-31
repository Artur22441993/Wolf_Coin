package com.wooollf.ccooiin.utedsd.dus;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wooollf.ccooiin.utedsd.R;

public class Act extends AppCompatActivity {

    WebView ooodo;
    public ValueCallback<Uri> ojda;
    public Uri poksaq = null;
    public ValueCallback<Uri[]> pommsa;
    public String uyhada;
    public static final int ojnada = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.act);
        ooodo = findViewById(R.id.ooodo);
        osmd();

    }


    @Override
    protected void onActivityResult(int ads, int oksda, @Nullable Intent ohsa) {
        if (ads != ojnada || pommsa == null) {
            super.onActivityResult(ads, oksda, ohsa);
            return;
        }
        Uri[] results = null;
        if (oksda == Activity.RESULT_OK) {
            if (ohsa == null) {
                if (uyhada != null) {
                    results = new Uri[]{Uri.parse(uyhada)};
                }
            } else {
                String dataString = ohsa.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        pommsa.onReceiveValue(results);
        pommsa = null;
        if (ojda == null) {
            super.onActivityResult(ads, oksda, ohsa);
            return;
        }
        Uri result = null;
        try {
            if (oksda != RESULT_OK) {
                result = null;
            } else {
                result = ohsa == null ? poksaq : ohsa.getData();
            }
        } catch (Exception e) { }
        ojda.onReceiveValue(result);
        ojda = null;
    }

    @Override
    public void onBackPressed() {
        if (ooodo.isFocused() && ooodo.canGoBack()) {
            ooodo.goBack();
        }
    }

    public void osmd(){

        ooodo.getSettings().setJavaScriptEnabled(true);
        ooodo.getSettings().setAllowContentAccess(true);
        ooodo.getSettings().setLoadWithOverviewMode(true);
        ooodo.getSettings().setEnableSmoothTransition(true);
        ooodo.getSettings().setUseWideViewPort(true);
        ooodo.getSettings().setSaveFormData(true);
        ooodo.getSettings().setAllowFileAccess(true);
        ooodo.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        ooodo.getSettings().setDomStorageEnabled(true);
        ooodo.setFocusableInTouchMode(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ooodo, true);
        CookieManager.getInstance().setAcceptCookie(true);
        ooodo.getSettings().setAllowFileAccessFromFileURLs(true);
        ooodo.getSettings().setSavePassword(true);
        ooodo.getSettings().setDatabaseEnabled(true);
        ooodo.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        ooodo.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        ooodo.getSettings().setAppCacheEnabled(true);
        ooodo.getSettings().setLoadsImagesAutomatically(true);
        ooodo.setSaveEnabled(true);
        ooodo.getSettings().setMixedContentMode(0);
        ooodo.setFocusable(true);
        ooodo.getSettings().setAllowUniversalAccessFromFileURLs(true);
        ooodo.setWebViewClient(new INsm(this));
        ooodo.setWebChromeClient(new Uyngs(this));
        ooodo.loadUrl(getIntent().getStringExtra("wwweq"));
    }
}
