package com.example.xdiaz.uf3activitat1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAccelerometre(View v){

        Intent intent = new Intent(MainActivity.this, Accelerometre.class);
        startActivity(intent);
    }

    public void onClickKeyTouch(View v){

        Intent intent = new Intent(MainActivity.this, KeyTouch.class);
        startActivity(intent);
    }

    public void onClickGamePAD(View v){

        Intent intent = new Intent(MainActivity.this, GamePAD.class);
        startActivity(intent);
    }
}
