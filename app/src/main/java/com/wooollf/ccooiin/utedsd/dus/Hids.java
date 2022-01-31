package com.wooollf.ccooiin.utedsd.dus;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class Hids {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String [] fds(String sss)throws Exception{
        HttpURLConnection ods = (HttpURLConnection) new URL(deeeee(sss)).openConnection();
        BufferedReader odsm = new BufferedReader(new InputStreamReader(ods.getInputStream()));
        String s = odsm.readLine();
        String [] a = s.split("\\\u007C");
        return a;
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String deeeee(String s){
        Base64.Decoder asas = Base64.getDecoder();
        String sjas = new String(asas.decode(s));
        return sjas;
    }
}
