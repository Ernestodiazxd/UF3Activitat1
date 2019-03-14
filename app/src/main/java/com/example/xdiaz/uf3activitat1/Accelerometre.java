package com.example.xdiaz.uf3activitat1;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class Accelerometre extends AppCompatActivity implements SensorEventListener {

    TextView valueX, valueY, valueZ;
    SensorManager sensorMgr;
    Sensor sensor;
    View background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometre);

        background=this.getWindow().getDecorView();
        valueX = (TextView) findViewById(R.id.numX);
        valueY = (TextView) findViewById(R.id.numY);
        valueZ = (TextView) findViewById(R.id.numZ);
        sensorMgr = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorMgr.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorMgr.registerListener(this, sensor , SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorMgr.unregisterListener(this);
    }
    @Override
    protected void onResume() {
        super.onResume();
        sensorMgr.registerListener(this,sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            valueX.setText(String.valueOf(sensorEvent.values[0]));
            valueY.setText(String.valueOf(sensorEvent.values[1]));
            valueZ.setText(String.valueOf(sensorEvent.values[2]));
            background.setBackgroundColor((Color.rgb((int)sensorEvent.values[0]*100,(int)sensorEvent.values[1]*100,(int)sensorEvent.values[2]*100)));

        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
