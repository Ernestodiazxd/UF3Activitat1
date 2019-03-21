package com.example.xdiaz.uf3activitat1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class KeyTouch extends AppCompatActivity {
    ImageView arriba,abajo;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_touch);
        arriba=findViewById(R.id.Arriba);
        abajo=findViewById(R.id.Abajo);
        texto=findViewById(R.id.volumen);
        arriba.setVisibility(View.INVISIBLE);
        abajo.setVisibility(View.INVISIBLE);


    }


    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        if(keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            texto.setVisibility(View.INVISIBLE);
            arriba.setVisibility(View.VISIBLE);
            abajo.setVisibility(View.INVISIBLE);
            // Codi de pujar volum
            return true;

        }

        if(keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            texto.setVisibility(View.INVISIBLE);
            arriba.setVisibility(View.INVISIBLE);
            abajo.setVisibility(View.VISIBLE);
            // Codi de baixar volum
            return true;

        }

        return super.onKeyUp(keyCode, event);
    }
}
