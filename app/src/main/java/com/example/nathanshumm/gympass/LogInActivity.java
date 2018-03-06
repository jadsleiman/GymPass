package com.example.nathanshumm.gympass;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class LogInActivity extends AppCompatActivity {

    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        window = this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorAccent));
    }
}