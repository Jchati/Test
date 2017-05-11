package com.example.lenovo.myapplication;

import android.content.SyncStatusObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello WOrLD!!");
        }
        for (int i = 0; i < 10; i++) {
            Log.e("gaat fout", "o shit waddup");
        }
    }
}
