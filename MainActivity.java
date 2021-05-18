package com.example.shwetank.demodrawing2record;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#000000"));
        Bitmap bg = Bitmap.createBitmap(480,800, Bitmap.Config.ARGB_8888);


        Canvas canvas = new Canvas(bg);
        canvas.drawRect(100, 50, 200, 100, paint);
        LinearLayout ll = (LinearLayout) findViewById(R.id.rect);
        ll.setBackgroundDrawable(new BitmapDrawable(bg));

    }

}
