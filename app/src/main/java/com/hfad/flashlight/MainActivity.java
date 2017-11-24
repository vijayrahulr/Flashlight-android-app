package com.hfad.flashlight;

import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

import java.lang.reflect.Parameter;
import java.security.Policy;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSwitch;
    private Camera camera;
    private boolean isFlashOn;
    private boolean isFlashOff;
    private boolean hasFlash;
    Policy.Parameters params;
    MediaPlayer mp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwitch =(ImageButton)findViewById(R.id.btnSwitch);
        hasFlash=getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);


        if(!hasFlash){
            AlertDialog alert=""
        }
    }
}
