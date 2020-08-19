package com.google.android.gms.fit.samples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.fit.samples.basicsensorsapi.R;
import com.google.android.gms.fit.samples.common.logger.Log;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.tasks.Task;


import java.util.Arrays;

public class BLE extends AppCompatActivity {
    public static final String TAG = "BLE";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ble);
       // startBleScan();
       /* BleScanCallback bleScanCallbacks = new BleScanCallback() {
            @Override
            public void onDeviceFound(BleDevice device) {
                Log.i(TAG, "Successfully subscribed!");
               //device.getName();
            }
            @Override
            public void onScanStopped() {
                Log.i(TAG, "ERROR subscribed!");
                // The scan timed out or was interrupted
            }*/
        };

    @Override
    protected void onStart() {
        super.onStart();
        int a = 1 ;
        if(a == 1 ) Log.d(TAG,"TEST");
        else Log.i(TAG, "Ready");
    }

    public void startBleScan() {
        BleScanCallback callback = new BleScanCallback() {
            @Override
            public void onDeviceFound(BleDevice device) {
                Log.i(TAG, "BLE Device Found: " + device.getName());
                //claimDevice(device);
            }

            @Override
            public void onScanStopped() {

                Log.i(TAG, "BLE scan stopped");
            }
        };

    }
    }

