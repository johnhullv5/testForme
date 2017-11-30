package com.example.a300858525.testforme;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class PlotActivity extends AppCompatActivity {
    String s = "";//getIntent().getStringExtra("EXTRA_SESSION_ID");
    List<String> symbols =null;
    Paint paint;
    Bitmap bitmap;
    Canvas canvas;
    ImageView reusableImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot);
        s = getIntent().getStringExtra("EXTRA_SESSION_ID");
        symbols = new ArrayList<String>();
        for(String stock : s.split(","))
        {
            symbols.add(stock);
        }

        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);

        bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight()/2, Bitmap.Config.ARGB_8888);

        //bitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);


        //
        reusableImageView = (ImageView)findViewById(R.id.imageView);
        //setting a bitmap as content view for the image
        reusableImageView.setImageBitmap(bitmap);

        reusableImageView.setFocusable(true);
        reusableImageView.requestFocus();

        //canvas.drawLine(100,100,1000,1000,paint);
        canvas.drawLine(100, 100, 500, 500, paint);
    }
}
