package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MeiziView meiziView = new MeiziView(MainActivity.this);
        FrameLayout frame = (FrameLayout) findViewById(R.id.activity_main);

        meiziView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x = event.getX() - 150;
                float y = event.getY() - 150;
                meiziView.bitmapX = x;
                meiziView.bitmapY = y;
                meiziView.invalidate();
                return true;
            }
        });
        frame.addView(meiziView);

    }
}
