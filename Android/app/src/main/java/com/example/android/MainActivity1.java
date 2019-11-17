package com.example.android;

import android.app.Activity;


import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import ru.samsung.itschool.book.equation243.R;

public class MainActivity1 extends Activity {
    private EditText login;
    private EditText password;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Инициализирует Активность.
        setContentView(R.layout.activity_main);
        login =  findViewById(R.id.log);
        password =  findViewById(R.id.Pas);

    }

    /**
     * Вызывается при нажатии пользователем на кнопку Решить
     */
    public void solveEquation(View view) {
        TextView otvet1 =  findViewById(R.id.enter1);
        TextView otvet2 =  findViewById(R.id.enter2);

        if (login.getText().toString().equals("1@1") && password.getText().toString().equals("123")) {

           //Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT).show();

           otvet1.setText("Верно ");
            otvet2.setText("");
        } else {

          // Toast.makeText(getApplicationContext(), "Вы ошиблись в логине или пароле", Toast.LENGTH_SHORT).show();
           otvet2.setText("Вы ошиблись в логине или пароле");
           login.setText("");
           password.setText("");
           otvet1.setText("");
        }
    }
}
