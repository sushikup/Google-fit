package com.google.android.gms.fit.samples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.google.android.gms.fit.samples.basicsensorsapi.R;

public class home extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button_sensor = (Button) findViewById(R.id.sensor);
        button_sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, sensors.class);
                startActivity(intent);
            }
        });
        Button button_record = (Button) findViewById(R.id.record);
        button_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, recording.class);
                startActivity(intent);
            }
        });
        Button button_ble = (Button) findViewById(R.id.ble);
        button_ble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, BLE.class);
                startActivity(intent);
            }
        });
    }
}
