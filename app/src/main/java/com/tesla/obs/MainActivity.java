package com.tesla.obs;

import com.tesla.obs.service.StayService;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);
            startService(new Intent(this, StayService.class));
            finishAffinity();
        }
}