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

    private EditText login;
    private EditText password;
    private Button log;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Инициализирует Активность.
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.editText2);
        password = findViewById(R.id.editText3);
        log = findViewById(R.id.button3);

    }

    public void Login(View view) {

        // Если введенные логин и пароль будут словом "admin",
        // показываем Toast сообщение об успешном входе:
        if (login.getText().toString().equals("sams@mail") &&
                password.getText().toString().equals("12345")) {
            Toast.makeText(getApplicationContext(), "Вход выполнен!", Toast.LENGTH_SHORT).show();

            // Выполняем переход на другой экран:
            Intent intent = new Intent(MainActivity1.this, Game.class);
            startActivity(intent);
        }

        // В другом случае выдаем сообщение с ошибкой:
        else {
            Toast.makeText(getApplicationContext(), "Неправильные данные!", Toast.LENGTH_SHORT).show();


        }
    }
}

