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
        super.onDraw(canvas);
        Paint paint = new Paint();
        int x = 0; int y=0;
        while (x < getWidth()|| y<getHeight() ) {
            canvas.drawLine(x, 0, this.getWidth()+x, this.getHeight(), paint);
            canvas.drawLine(0,  x, this.getWidth(), this.getHeight()+x, paint);
            x+=50;y+=50;
        }
    }
}
