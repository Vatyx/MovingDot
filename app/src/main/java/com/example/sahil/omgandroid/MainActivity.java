package com.example.sahil.omgandroid;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

    private int posX = 0;
    private int posY = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }

    public class MyView extends View {
        public MyView(Context context) {
            super(context);
            posX = getWidth() / 2;
            posY = getHeight() / 2;
            // TODO Auto-generated constructor stub
        }

        @Override
        protected void onDraw(Canvas canvas) {
            // TODO Auto-generated method stub
            super.onDraw(canvas);
            int x = posX;
            int y = posY;
            int radius;
            radius = 100;
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);
            // Use Color.parseColor to define HTML colors
            paint.setColor(Color.parseColor("#CD5C5C"));
            canvas.drawCircle(x, y, radius, paint);
        }

        @Override
        public boolean onTouchEvent(MotionEvent ev)
        {
            int action = ev.getAction();

            switch(action & MotionEvent.ACTION_MASK)
            {
                case MotionEvent.ACTION_DOWN:
                    int x = (int) ev.getX();
                    int y = (int) ev.getY();
                    posX = x;
                    posY = y;
                    System.out.println("ayyyyyyyyyyyyyyyyy");
                    invalidate();
            }

            return true;
        }
    }
}
