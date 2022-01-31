package com.wooollf.ccooiin.utedsd;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.github.ybq.android.spinkit.SpinKitView;
import com.wooollf.ccooiin.utedsd.dus.Pods;

public class Odod {

    private static SpinKitView spins;
    @SuppressLint("StaticFieldLeak")
    private static Button bS,bP,bC;
    @SuppressLint("StaticFieldLeak")
    private static WC wc;

    public SpinKitView getSpins() {
        return spins;
    }

    public void setSpins(SpinKitView spins) {
        this.spins = spins;
    }

    public Button getbS() {
        return bS;
    }

    public void setbS(Button bS) {
        this.bS = bS;
    }

    public Button getbP() {
        return bP;
    }

    public void setbP(Button bP) {
        this.bP = bP;
    }

    public Button getbC() {
        return bC;
    }

    public void setbC(Button bC) {
        this.bC = bC;
    }

    public WC getWc() {
        return wc;
    }

    public void setWc(WC wc) {
        this.wc = wc;
    }

    public static void oodos(){
        spins.setVisibility(View.INVISIBLE);
        bS.setVisibility(View.VISIBLE);
        bC.setVisibility(View.VISIBLE);
        bP.setVisibility(View.VISIBLE);

        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wc.startActivity(new Intent(wc.getApplicationContext(),MainActivity.class));

            }
        });

        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pods.ifnd = "aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49ZmtBZ05yYVVuaDRyZ3VLOFNFZmFmR3dFTmM2RFNlN2E=";
                wc.startActivity(new Intent(wc.getApplicationContext(),Pods.class));
            }
        });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wc.finishAffinity();
            }
        });


    }
}
