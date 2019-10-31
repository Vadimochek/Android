package com.example.android;
import android.content.Context;
import android.graphics.*;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(300,300,200,paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(300,300,200,paint);
    }
/* (1)
int y = 0;
        while (y < canvas.getHeight()) {
            canvas.drawLine(0, y,
                this.getWidth(), y, paint);
            y += 30;*/
    }
