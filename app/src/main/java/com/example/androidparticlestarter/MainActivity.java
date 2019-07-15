package com.example.androidparticlestarter;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.particle.android.sdk.cloud.ParticleCloud;
import io.particle.android.sdk.cloud.ParticleCloudSDK;
import io.particle.android.sdk.cloud.ParticleDevice;
import io.particle.android.sdk.cloud.exceptions.ParticleCloudException;
import io.particle.android.sdk.utils.Async;

public class MainActivity extends AppCompatActivity {
    // MARK: Debug info
    private final String TAG="JENELLE";

    // creating  buttons for the piano
    Button a, b, c, d , e, f, g, ab, cd, de,c1,fg;

    // MARK: Particle Account Info
    private final String PARTICLE_USERNAME = "dhyanee.bhatt@gmail.com";
    private final String PARTICLE_PASSWORD = "niti9945";

    // MARK: Particle device-specific info
    private final String DEVICE_ID = "310045001047363333343437";

    // MARK: Particle Publish / Subscribe variables
    private long subscriptionId;

    // MARK: Particle device
    private ParticleDevice mDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        c1 = findViewById(R.id.c1);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        g = findViewById(R.id.g);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        ab = findViewById(R.id.ab);
        cd = findViewById(R.id.cd);
        de = findViewById(R.id.de);
        fg = findViewById(R.id.fg);

        // 1. Initialize your connection to the Particle API
        ParticleCloudSDK.init(this.getApplicationContext());

        // 2. Setup your device variable
        getDeviceFromCloud();

    }


    /**
     * Custom function to connect to the Particle Cloud and get the device
     */
    public void getDeviceFromCloud() {
        // This function runs in the background
        // It tries to connect to the Particle Cloud and get your device
        Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

            @Override
            public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                particleCloud.logIn(PARTICLE_USERNAME, PARTICLE_PASSWORD);
                mDevice = particleCloud.getDevice(DEVICE_ID);
                return -1;


            }

            @Override
            public void onSuccess(Object o) {
                Log.d(TAG, "Successfully got device from Cloud");
            }

            @Override
            public void onFailure(ParticleCloudException exception) {
                Log.d(TAG, exception.getBestMessage());
            }
        });
    }


    public void buttonClick(View v)
    {

        switch (v.getId()) {

            case R.id.a:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("A");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing A");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

            case R.id.b:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("B");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing B");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

            case R.id.c:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("C");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing C");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

            case R.id.d:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("D");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing D");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

            case R.id.e:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("E");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing E");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

            case R.id.f:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("F");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing F");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

            case R.id.g:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("G");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing G");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;


            case R.id.c1:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("C1");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing C1");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

            case R.id.de:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("DE");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing DE");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;


            case R.id.cd:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("CD");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing CD");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

            case R.id.ab:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("AB");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing AB");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

            case R.id.ga:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("GA");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing GA");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;


            case R.id.fg:
                Async.executeAsync(ParticleCloudSDK.getCloud(), new Async.ApiWork<ParticleCloud, Object>() {

                    @Override
                    public Object callApi(@NonNull ParticleCloud particleCloud) throws ParticleCloudException, IOException {

                        List<String> param = new ArrayList<String>();
                        param.add("FG");
                        try {

                            mDevice.callFunction("key",param);
                        }
                        catch(Exception e)
                        {
                        }
                        return -1;
                    }
                    @Override
                    public void onSuccess(Object o) {
                        Log.d(TAG, "Successfully playing FG");
                    }

                    @Override
                    public void onFailure(ParticleCloudException exception) {
                        Log.d(TAG, exception.getBestMessage());
                    }
                });
                break;

        }

    }
}
