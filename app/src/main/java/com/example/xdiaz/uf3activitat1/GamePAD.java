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
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    barriba.setBackgroundColor(Color.BLUE);
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    barriba.setBackgroundColor(Color.RED);
                }
                return true;
            }

        });
}
    
     babajo.setOnTouchListener(new View.OnTouchListener() {  
        @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    babajo.setBackgroundColor(Color.BLUE);
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    abajo.setBackgroundColor(Color.RED);
                }
                return true;
            }

        });
}

 bderecha.setOnTouchListener(new View.OnTouchListener() {  
        @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    bderecha.setBackgroundColor(Color.BLUE);
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    bderecha.setBackgroundColor(Color.RED);
                }
                return true;
            }

        });
}

 bizquierda.setOnTouchListener(new View.OnTouchListener() {  
        @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    bizquierda.setBackgroundColor(Color.BLUE);
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    bizquierda.setBackgroundColor(Color.RED);
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
