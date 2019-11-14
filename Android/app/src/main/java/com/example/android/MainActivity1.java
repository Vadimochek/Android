package com.example.android;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import ru.samsung.itschool.book.equation243.R;

public class MainActivity1 extends Activity {
    // Вызывается при создании Активности
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Инициализирует Активность.
        setContentView(R.layout.activity_main);
    }

    /** Вызывается при нажатии пользователем на кнопку Решить */
    public void solveEquation(View view) {
        // ax+b=c
        double a = Double.parseDouble(((EditText)
                findViewById(R.id.coefficient_a)).getText().toString());
        double b = Double.parseDouble(((EditText)
                findViewById(R.id.coefficient_b)).getText().toString());
        double c = Double.parseDouble(((EditText)
                findViewById(R.id.coefficient_c)).getText().toString());
        TextView result = (TextView) findViewById(R.id.result);
        if (a == 0 && b!=0) {
            if ((c==0 && b<0)){
                result.setText(" " + String.valueOf((Math.abs((-c) / b))));
            }
        else result.setText(" " + String.valueOf(((-c) / b)));
        } else if (b == 0 && a!=0) {
            if (c == 0) {
                result.setText(" " + String.valueOf((0)));
            } else {
                result.setText(" " + String.valueOf((Math.sqrt(-c / a))) + "  " + String.valueOf((-Math.sqrt(-c / a))));
            }
        }
        else {
            if (b * b - 4 * a * c >= 0) {
                if (b*b-4*a*c==0) {

                    result.setText(" " + String.valueOf(((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a)));
                } else {
                    result.setText(" " + String.valueOf(((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a)) + "  " + String.valueOf((-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a));
                }
            }
            else result.setText(" no solution");
        }
            if (a==0 && b==0 && c==0){
                result.setText(" any x");
            }
            if (a==0 && b==0 && c!=0){
                result.setText(" no solution");
        }
    }

}
