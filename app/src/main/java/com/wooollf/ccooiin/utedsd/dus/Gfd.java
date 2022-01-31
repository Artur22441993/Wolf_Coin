package com.wooollf.ccooiin.utedsd.dus;

import android.net.Uri;
import android.os.Build;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.wooollf.ccooiin.utedsd.WC;

public class Gfd {


   public static String icbsa;
    public static  String oknsa;

    public static void gfd(String dadaq, WC wc){

        FacebookSdk.setApplicationId(dadaq);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(wc.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);


        AppEventsLogger.activateApp(wc.getApplication());
        AppLinkData.fetchDeferredAppLinkData(wc.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData iuy) {

                if (iuy == null) {
                    iuy = AppLinkData.createFromActivity(wc);
                }
                if (iuy != null) {
                    Uri iuhna = iuy.getTargetUri();
                    icbsa = iuhna.getQuery();
                   oknsa = WC.fddd(icbsa,wc.getPackageName(), Uaaap.AID,Uaaap.appsFlyerUID);

                }else {

                }
            }

        });

    }
}
