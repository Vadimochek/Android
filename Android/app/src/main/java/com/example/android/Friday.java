package com.example.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ru.samsung.itschool.book.equation243.R;

public class Friday extends Activity {
    public static final String APP_PREFERENCES="mysettings";
    public static final String APP_PREFERENCES_NAME="ZA";
    Button back;
    SharedPreferences mSettings;
    EditText zam;
    String zame;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fri);
        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        zam=findViewById(R.id.editText);
        back = findViewById(R.id.button8);

    }
    @Override
    public void onPause(){
        super.onPause();
        zame=zam.getText().toString();
        SharedPreferences.Editor editor = mSettings.edit();
        editor.putString(APP_PREFERENCES_NAME,zame);
        editor.apply();
    }


    public void Login(View view) {

        Intent intent = new Intent(Friday.this, Game.class);
        startActivity(intent);
    }
}
