package com.example.xdiaz.uf3activitat1;

import android.graphics.Color;
import android.support.v4.view.TintableBackgroundView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GamePAD extends AppCompatActivity {

    TextView text;
    ImageView tarriba,tabajo,tderecha,tizquierda;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_pad);
        text=findViewById(R.id.TextGamePAD);
        tarriba=findViewById(R.id.arriba);
        tabajo=findViewById(R.id.abajo);
        tizquierda=findViewById(R.id.izquierda);
        tderecha=findViewById(R.id.derecha);
        text.setText("Null");




        tarriba.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    tarriba.setImageResource(R.drawable.keyboardbuttonnegative);
                    text.setText("Arriba");

                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    tarriba.setImageResource(R.drawable.keyboardbuttonred);
                    text.setText("Null");

                }
                return true;
            }

        });

        tabajo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    tabajo.setImageResource(R.drawable.keyboardbuttonnegative);
                    text.setText("Abajo");

                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    tabajo.setImageResource(R.drawable.keyboardbuttonred);
                    text.setText("Null");

                }
                return true;
            }

        });

        tizquierda.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    tizquierda.setImageResource(R.drawable.keyboardbuttonnegative);
                    text.setText("Izquierda");

                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    tizquierda.setImageResource(R.drawable.keyboardbuttonred);
                    text.setText("Null");

                }
                return true;
            }

        });

        tderecha.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    tderecha.setImageResource(R.drawable.keyboardbuttonnegative);
                    text.setText("Derecha");

                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    tderecha.setImageResource(R.drawable.keyboardbuttonred);
                    text.setText("Null");

                }
                return true;
            }

        });

}


    /*
    
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
    
    */

}
