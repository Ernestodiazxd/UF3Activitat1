package com.example.xdiaz.uf3activitat1;

import android.graphics.Color;
import android.support.v4.view.TintableBackgroundView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GamePAD extends AppCompatActivity {

    Button barriba,babajo,bderecha,bizquierda;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_pad);
        text=findViewById(R.id.TextGamePAD);
        barriba= findViewById(R.id.buttonArriba);
        babajo= findViewById(R.id.buttonAbajo);
        bderecha= findViewById(R.id.buttonDerecha);
        bizquierda= findViewById(R.id.buttonIzquierda);
        text.setText("Null");


        barriba.setOnTouchListener(new View.OnTouchListener() {
        @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    barriba.setBackgroundColor(getResources().getColor(R.color.blue));
                    text.setText("Arriba");

                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    barriba.setBackgroundColor(getResources().getColor(R.color.red));
                    text.setText("Null");

                }
                return true;
            }

        });

    
     babajo.setOnTouchListener(new View.OnTouchListener() {  
        @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    babajo.setBackgroundColor(getResources().getColor(R.color.blue));
                    text.setText("Abajo");
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    babajo.setBackgroundColor(getResources().getColor(R.color.red));
                    text.setText("Null");

                }
                return true;
            }

        });


 bderecha.setOnTouchListener(new View.OnTouchListener() {  
        @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    bderecha.setBackgroundColor(getResources().getColor(R.color.blue));
                    text.setText("Derecha");
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    bderecha.setBackgroundColor(getResources().getColor(R.color.red));
                    text.setText("Null");

                }
                return true;
            }

        });


 bizquierda.setOnTouchListener(new View.OnTouchListener() {  
        @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    bizquierda.setBackgroundColor(getResources().getColor(R.color.blue));
                    text.setText("Izquierda");
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    bizquierda.setBackgroundColor(getResources().getColor(R.color.red));
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
