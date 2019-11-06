package com.example.android;
import android.content.Context;
import android.graphics.*;
import android.view.View;

public class MyView2 extends View {
    public MyView2(Context context) {
        super(context);
    }
Paint paint = new Paint();
    long lastTime = System.currentTimeMillis();
    float x=0;
    @Override
    protected void onDraw(Canvas canvas) {
canvas.drawCircle(x,300,20,paint);
long nowTime =System.currentTimeMillis();
x+=0.01f*(nowTime-lastTime);
lastTime=nowTime;
        invalidate();
    }
    }


