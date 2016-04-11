package com.example.android.drawdemo;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Canvas;

/**
 * Created by Kevin on 4/11/2016.
 */
public class MyPanel extends View {
    Paint paint = new Paint();

    float startX, startY, endX, endY = 0;

    public MyPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawARGB(255, 255, 255, 0);
        paint.setARGB(255, 0, 0, 255);
        Log.d("KSM", "Draw");
        canvas.drawRect(
                Math.min(startX, endX),
                Math.min(startY, endY),
                Math.max(startX, endX),
                Math.max(startY, endY),
                paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                endX = startX = event.getX();
                endY = startY = event.getY();
                break;

            case MotionEvent.ACTION_UP:
                endX = event.getX();
                endY = event.getY();


                break;

            default:
                break;
        }
        invalidate();

        return true;
    }
}
