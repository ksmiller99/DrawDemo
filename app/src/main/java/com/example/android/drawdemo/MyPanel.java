package com.example.android.drawdemo;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
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
                Math.min(SharedXYvalues.startX, SharedXYvalues.endX),
                Math.min(SharedXYvalues.startY, SharedXYvalues.endY),
                Math.max(SharedXYvalues.startX, SharedXYvalues.endX),
                Math.max(SharedXYvalues.startY, SharedXYvalues.endY),
                paint);
        invalidate();
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                SharedXYvalues.endX = SharedXYvalues.startX = event.getX();
//                SharedXYvalues.endY = SharedXYvalues.startY = event.getY();
//                break;
//
//            case MotionEvent.ACTION_UP:
//                SharedXYvalues.endX = event.getX();
//                SharedXYvalues.endY = event.getY();
//
//
//                break;
//
//            default:
//                break;
//        }
//        invalidate();
//
//        return true;
//    }

}
