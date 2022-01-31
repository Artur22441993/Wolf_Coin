package com.wooollf.ccooiin.utedsd.dus;

import android.annotation.SuppressLint;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;
import com.wooollf.ccooiin.utedsd.WC;

import java.util.Map;

public class Uaaap {

    public static String appsFlyerUID;
    public static String statusAppsFlyer = "";
    public static String AID;
    public static String params;
    public static final String aap = "V0tESkFyUmFOSlpVRldFd3N0dXNNOQ==";

    @SuppressLint("StaticFieldLeak")
    public static WC wc;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void uaap(){

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(wc.getApplicationContext());
        OneSignal.setAppId(Hids.deeeee("NTgwMmUxYzEtYWUwMC00NzgwLWIzOTEtMWUwYzAzMjJjZDJm"));


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    AID = AdvertisingIdClient.getAdvertisingIdInfo(wc.getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();
        appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(wc.getApplicationContext());


        String ds = Hids.deeeee(aap);

        AppsFlyerLib.getInstance().init(ds, new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                statusAppsFlyer = map.get(Hids.deeeee("YWZfc3RhdHVz")).toString();
                if (statusAppsFlyer.equals(Hids.deeeee("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(Hids.deeeee("Y2FtcGFpZ24=")).toString();
                    params = WC.fddd(str,wc.getPackageName(),AID,appsFlyerUID);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },wc.getApplicationContext());
        AppsFlyerLib.getInstance().start(wc.getApplicationContext());
    }
}
