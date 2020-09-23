package com.mintu.libraryexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.mintu.logutil.LogDebug.logMsg;
import static com.mintu.logutil.Utils.toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logMsg("");   //Method Used from a library for logging in logcat
        toast(this,"hello"); //Method Used from a library for toast message
    }
}
