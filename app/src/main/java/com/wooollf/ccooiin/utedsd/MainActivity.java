package com.wooollf.ccooiin.utedsd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private ImageView imageView, imageView2, imageView3, imageView4;
    private Display display;
    private Handler handler;
    private TextView textView;
    private int count = 10;
    private int p = 0;
    private int r =0;
    private int width;
    private int height;
    private List<ImageView> allImage;
    private List<ImageView> allImage2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        constraintLayout = findViewById(R.id.constrainLayout);
        textView = findViewById(R.id.textView);

        display = getWindowManager().getDefaultDisplay();
        width = display.getWidth();
        height = display.getHeight();
        allImage = new ArrayList<ImageView>();
        allImage2 = new ArrayList<ImageView>();
        handler = new Handler();

        createImageTop();
        moveImageTop();
        createImageBottom();
        moveImageBottom();
        createImageTop2();
        moveImageTop2();
        createImageBottom2();
        moveImageBottom2();
    }


    private void createImageTop(){
        handler.post(new Runnable() {
            @Override
            public void run() {
              imageView = new ImageView(MainActivity.this);
              imageView.setImageResource(R.drawable.slots_bg);
                ConstraintLayout.LayoutParams imageViewTopLayoutParams =
                        new ConstraintLayout.LayoutParams(width/3,width/3);
                imageView.setLayoutParams(imageViewTopLayoutParams);
                constraintLayout.addView(imageView);

                p++;
                if (p!=1){
                handler.postDelayed(this::run,10);
                }else {
                    imageView.setX(width- width/3);
                    imageView.setY(0+width/8);
                }
            }
        });
    }

    private void createImageTop2(){

        handler.post(new Runnable() {
            @Override
            public void run() {
                imageView3 = new ImageView(MainActivity.this);
                imageView3.setImageResource(R.drawable.slots_bg);
                ConstraintLayout.LayoutParams imageViewTop2LayoutParams =
                        new ConstraintLayout.LayoutParams(width/3,width/3);
                imageView3.setLayoutParams(imageViewTop2LayoutParams);
                constraintLayout.addView(imageView3);
                r++;
                if (p!=1){
                    handler.postDelayed(this::run,10);
                }else {
                    imageView3.setX(0 - width/3);
                    imageView3.setY(0+width/8);
                }
            }
        });

    }

    private void moveImageTop(){
        handler.post(new Runnable() {
            @Override
            public void run() {
                imageView.setX(imageView.getX() - 4);
                if (imageView.getX() < (0 - width/3)){
                    imageView.setX(width);
                }

                handler.postDelayed(this::run,10);
            }
        });

    }

    private void moveImageTop2(){
        handler.post(new Runnable() {
            @Override
            public void run() {
                imageView3.setX(imageView3.getX() + 4);
                if (imageView3.getX()>(width + width/3)){
                    imageView3.setX(0 - width/3);
                }
                handler.postDelayed(this::run,10);
            }
        });
    }

    private void createImageBottom(){

        handler.post(new Runnable() {
            @Override
            public void run() {
                imageView2 = new ImageView(MainActivity.this);
                Random random = new Random();
                int a = random.nextInt(3);
                if (a == 0){
                    imageView2.setImageResource(R.drawable.ic_slot_1);
                }
                if (a == 1){
                    imageView2.setImageResource(R.drawable.ic_slot_2);
                }
                if (a == 2){
                    imageView2.setImageResource(R.drawable.ic_slot_3);
                }

                ConstraintLayout.LayoutParams imageViewBottomLayoutParams =
                        new ConstraintLayout.LayoutParams(width/5,width/5);
                imageView2.setLayoutParams(imageViewBottomLayoutParams);
                constraintLayout.addView(imageView2);
                allImage.add(imageView2);
                imageView2.setX(imageView.getX() + imageView.getWidth()/2);
                imageView2.setY(imageView.getY() + imageView.getHeight());

                handler.postDelayed(this::run,500);
            }
        });

    }

    private void createImageBottom2(){

        handler.post(new Runnable() {
            @Override
            public void run() {
                imageView4 = new ImageView(MainActivity.this);
                Random random = new Random();
                int a = random.nextInt(3);
                if (a == 0){
                    imageView4.setImageResource(R.drawable.ic_slot_1);
                }
                if (a == 1){
                    imageView4.setImageResource(R.drawable.ic_slot_1);
                }
                if (a == 2){
                    imageView4.setImageResource(R.drawable.ic_slot_3);
                }

                ConstraintLayout.LayoutParams imageViewBottom2LayoutParams =
                        new ConstraintLayout.LayoutParams(width/5,width/5);
                imageView4.setLayoutParams(imageViewBottom2LayoutParams);
                constraintLayout.addView(imageView4);
                allImage2.add(imageView4);
                imageView4.setX(imageView3.getX() + imageView3.getWidth()/2);
                imageView4.setY(imageView3.getY() + imageView3.getHeight());

                handler.postDelayed(this::run,500);
            }
        });

    }


    private void moveImageBottom(){

        handler.post(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<allImage.size();i++){
                    ImageView imageView = allImage.get(i);
                    imageView.setY(imageView.getY() + 5);
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            count++;
                            textView.setText(""+count);
                            allImage.remove(imageView);
                            constraintLayout.removeView(imageView);
                        }
                    });

                    if (imageView.getY()> height/2){
                        allImage.remove(imageView);
                        constraintLayout.removeView(imageView);
                        count--;
                        textView.setText("" + count);
                    }
                }

                handler.postDelayed(this::run,10);
            }
        });

    }

    private void moveImageBottom2(){

        handler.post(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<allImage2.size();i++){
                    ImageView imageView = allImage2.get(i);
                    imageView.setY(imageView.getY() + 5);
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            count++;
                            textView.setText(""+count);
                            allImage2.remove(imageView);
                            constraintLayout.removeView(imageView);
                        }
                    });

                    if (imageView.getY()> height/2){
                        allImage2.remove(imageView);
                        constraintLayout.removeView(imageView);
                        count--;
                        textView.setText("" + count);
                    }
                }

                handler.postDelayed(this::run,10);
            }
        });

    }


}