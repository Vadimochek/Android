package com.example.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
import ru.samsung.itschool.book.equation243.R;

public class Game extends MainActivity1 implements OnClickListener {
    private Button mon;
    private Button tue;
    private Button wed;
    private Button thur;
    private Button fri;
    private Button sat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        mon = findViewById(R.id.button);
        tue = findViewById(R.id.button2);
        wed = findViewById(R.id.button4);
        thur = findViewById(R.id.button5);
        fri = findViewById(R.id.button6);
        sat = findViewById(R.id.button7);
        mon.setOnClickListener(this);
        tue.setOnClickListener(this);
        wed.setOnClickListener(this);
        thur.setOnClickListener(this);
        fri.setOnClickListener(this);
        sat.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent(Game.this, Mon.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 = new Intent(Game.this, Tuesday.class);
                startActivity(intent1);
                break;
            case R.id.button4:
                Intent intent2 = new Intent(Game.this, Wednes.class);
                startActivity(intent2);
                break;
            case R.id.button5:
                Intent intent3 = new Intent(Game.this, Thursday.class);
                startActivity(intent3);
                break;
            case R.id.button6:
                Intent intent4 = new Intent(Game.this, Friday.class);
                startActivity(intent4);
                break;
            case R.id.button7:
                Intent intent5 = new Intent(Game.this, Satur.class);
                startActivity(intent5);
                break;
        }
    }
}




