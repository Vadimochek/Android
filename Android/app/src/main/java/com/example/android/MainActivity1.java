package com.example.android;

import android.app.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import ru.samsung.itschool.book.equation243.R;

public class MainActivity1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, MyService.class));
        // setContentView(new DrawView(this));
    }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            stopService(new Intent(this, MyService.class));
        }
    }


