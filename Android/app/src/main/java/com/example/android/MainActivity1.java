package com.example.android;


import android.app.Activity;

import android.os.Bundle;

import ru.samsung.itschool.book.equation243.R;

public class MainActivity1 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));

    }
    }