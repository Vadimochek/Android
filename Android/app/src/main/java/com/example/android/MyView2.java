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
        paint.setColor(Color.RED);
        int x = 0; int y=0;
        while(x<getHeight()){
            canvas.drawLine(x,0,0,y,paint);
            x+=50;
            y+=50;
        }
        int z=0;
        while (z<canvas.getHeight())
        {
            z+=1;
        }
        while (x<z*2)
        {
            canvas.drawLine(x,0,0,y,paint);
            x+=30;
            y+=30;
        }
    }
}
