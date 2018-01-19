package com.example.administrator.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2018/1/19.
 */

public class MeiziView extends View {
//    定义相关变量,依次是妹子显示位置的X,Y坐标
    public float bitmapX;
    public float bitmapY;
    public MeiziView(Context context) {
        super(context);
        bitmapX = 0;
        bitmapY = 200;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        //根据图片生成位图对象
        Bitmap meizi = BitmapFactory.decodeResource(getResources(), R.drawable.meizi);
        canvas.drawBitmap(meizi,bitmapX,bitmapY,paint);
        if(meizi.isRecycled()){
            meizi.recycle();
        }

    }
}
