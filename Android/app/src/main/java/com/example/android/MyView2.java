package com.example.android;
import android.content.Context;
import android.graphics.*;
import android.view.View;

public class MyView2 extends View {
    public MyView2(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int x = 0;
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        canvas.drawPaint(paint);
        paint.setColor(Color.CYAN);
        while (x < getWidth()) {
            canvas.drawLine(0, 1000, x, 0, paint);
            x += 50;
        }
        x=0;
            paint.setColor(Color.CYAN);
            while (x < getWidth()) {
                canvas.drawLine(x, getHeight(), getWidth(), 500, paint);
                x += 50;
            }
            paint.setColor(Color.YELLOW);
            canvas.drawCircle(500, 1000, 400, paint);
            paint.setColor(Color.RED);
            canvas.drawCircle(800, 1500, 100, paint);
            paint.setColor(Color.GRAY);
            canvas.drawCircle(700, 400, 150, paint);
            paint.setColor(Color.BLUE);
            canvas.drawCircle(200, 200, 100, paint);
            paint.setColor(Color.WHITE);

        }

    }


