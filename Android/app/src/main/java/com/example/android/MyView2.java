package com.example.android;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.*;
import android.graphics.Paint;
import android.view.View;

public class MyView2 extends View {
    int N = 20;
    float[] x  = new float[N];
    float[] y  = new float[N];
    float[] vx = new float[N];
    float[] vy = new float[N];
    float r;
    public MyView2(Context context) {
        super(context);
    }
    Paint paint = new Paint();
    boolean started;

    @Override

    protected void onDraw(Canvas canvas) {

        if(!started) {
          for (int i = 0; i < N; i++){
        x[i] = (float)(Math.random() * 400);
        y[i] = (float)(Math.random() * 400);
        vx[i] = (float)(Math.random() * 20 - 3);
        vy[i] = (float)(Math.random() * 20 - 3);
        }
        started = true;
        }
        for (int i = 0; i < N; i++) {
           if (i%5==0) {r=(float)(Math.random() * 50);}
            paint.setColor(Color.GREEN);
        canvas.drawCircle(x[i], y[i], 20+r, paint);

        }
        for (int i = 0; i < N; i++) {
        x[i] += vx[i];
        y[i] += vy[i];
        }
        for (int i = 0; i < N; i++) {
            if (x[i] < 0 || x[i] > this.getWidth()) {
                vx[i] = -vx[i];
                paint.setColor(Color.RED);
                canvas.drawCircle(x[i], y[i], 20+5*r, paint);
            }
            if (y[i] < 0 || y[i] > this.getHeight()) {
                vy[i] = -vy[i];paint.setColor(Color.RED);
                canvas.drawCircle(x[i], y[i], 20+5*r, paint);
            }
        }
        for (int i = 0; i < N - 1; i++) {
            paint.setColor(Color.BLUE);
            canvas.drawLine(x[i], y[i], x[i + 1], y[i + 1], paint);

        }
        invalidate();
        }
        }



