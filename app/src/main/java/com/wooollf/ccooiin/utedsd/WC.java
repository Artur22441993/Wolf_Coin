package com.wooollf.ccooiin.utedsd;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.github.ybq.android.spinkit.SpinKitView;
import com.onesignal.OneSignal;
import com.wooollf.ccooiin.utedsd.dus.Hids;
import com.wooollf.ccooiin.utedsd.dus.INsm;
import com.wooollf.ccooiin.utedsd.dus.Uaaap;


public class WC extends Activity {

    SpinKitView spins;
    Button bS,bP,bC;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.wc);

        INsm.wc = this;
        spins = findViewById(R.id.spins);
        bS = findViewById(R.id.bS);
        bP = findViewById(R.id.bP);
        bC = findViewById(R.id.bC);
        ddfds();
        Sddd sddd = new Sddd(spins,bS,bP,bC,this);
        sddd.usk();



    }

    private void ddfds(){
        bS.setText("start game");
        bP.setText("Privacy Policy");
        bC.setText("close games");
        bS.setBackgroundColor(getResources().getColor(R.color.white));
        bP.setBackgroundColor(getResources().getColor(R.color.white));
        bC.setBackgroundColor(getResources().getColor(R.color.white));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onStart() {
        super.onStart();
        Uaaap.wc = this;
        Uaaap.uaap();

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String fddd(String idjs, String okms, String qwqa, String pomnnd){
         String oinsa;
         String oiunsa;
         String oknsa;
         String poimds;
         String bbbhcx;
         String nnnmnj;
         String oooooiu;


        String[] iuhb = idjs.split("::");

        try {
            oinsa = iuhb[0];
        }catch (Exception e){
            oinsa = "";
        }
        try {
            oiunsa = iuhb[1];
        }catch (Exception e){
            oiunsa = "";
        }

        try {
            oknsa = iuhb[2];
        }catch (Exception e){
            oknsa = "";

        }

        try {
            poimds = iuhb[3];
        }catch (Exception e){
            poimds = "";
        }

        try {
            bbbhcx = iuhb[4];
        }catch (Exception e){
            bbbhcx = "";
        }


        try {
            nnnmnj = iuhb[5];
        }catch (Exception e){
            nnnmnj = "";
        }

        try {
            oooooiu = iuhb[6];
        }catch (Exception e){
            oooooiu = "";
        }

        OneSignal.sendTag(Hids.deeeee("c3ViX2FwcA=="), oiunsa);

        String cccxcza = oinsa + Hids.deeeee("P2J1bmRsZT0=") + okms + Hids.deeeee("JmFkX2lkPQ==") + qwqa + Hids.deeeee("JmFwcHNfaWQ9") + pomnnd +
                Hids.deeeee("JnN1YjY9") + oiunsa +
                Hids.deeeee("JnN1Yjc9") + oknsa +
                Hids.deeeee("JnN1YjI9") + poimds +
                Hids.deeeee("JnN1YjM9") + bbbhcx +
                Hids.deeeee("JnN1YjQ9") + nnnmnj +
                Hids.deeeee("JnN1YjU9") + oooooiu +
                Hids.deeeee("JmRldl9rZXk9") + Hids.deeeee(Uaaap.aap);
        return cccxcza;
    }
}
