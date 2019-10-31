package com.example.a176risovanieuzorovnacanvas1;
import android.content.Context;
import android.graphics.*;
import android.view.View;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        canvas.drawLine(0,0,canvas.getWidth(),canvas.getHeight(),paint);
    }

}

