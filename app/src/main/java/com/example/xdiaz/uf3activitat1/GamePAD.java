package com.example.xdiaz.uf3activitat1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class GamePAD extends AppCompatActivity {

    Button barriba,babajo,bderecha,bizquierda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_pad);

        barriba= findViewById(R.id.buttonArriba);
        babajo= findViewById(R.id.buttonAbajo);
        bderecha= findViewById(R.id.buttonDerecha);
        bizquierda= findViewById(R.id.buttonIzquierda);

        barriba.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_BUTTON_PRESS){
                    barriba.setBackgroundColor(Color.BLUE);
                }

                if(event.getAction() == MotionEvent.ACTION_BUTTON_RELEASE){
                    barriba.setBackgroundColor(Color.RED);
                }


                return true;
            }
        });
    }




    public void onTouchAbajo(View v, MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_BUTTON_PRESS){
            babajo.setBackgroundColor(Color.BLUE);
        }

    }
    public void onTouchDerecha(View v, MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_BUTTON_PRESS){
            bderecha.setBackgroundColor(Color.BLUE);
        }

    }
    public void onTouchIzquerda(View v, MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_BUTTON_PRESS){
            bizquierda.setBackgroundColor(Color.BLUE);
        }

    }




}
