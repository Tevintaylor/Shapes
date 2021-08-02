package com.example.shapes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.shapes.views.CustomView;

import static android.icu.lang.UCharacter.IndicPositionalCategory.NA;
import static java.lang.Boolean.TRUE;


public class MainActivity extends AppCompatActivity{
    private CustomView customView;


    private Button mButton;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      import custom view via id
        final CustomView customView = findViewById(R.id.customView);

//      import button via id
        Button Arc = findViewById(R.id.Arc);
        Button Circle = findViewById(R.id.Circle);
        Button Line = findViewById(R.id.Line);
        Button Rectangle = findViewById(R.id.Rectangle);
        Button Trinagle = findViewById(R.id.Trinagle);
        Button Sqaure = findViewById(R.id.Sqaure);


        Arc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customView.DrawArc();
            }
        });

        Circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customView.DrawCircle();
            }
        });

        Line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customView.DrawLine();
            }
        });

        Rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             customView.DrawRectangle();
            }
        });

        Sqaure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customView.DrawSqaure();

            }
        });

        Trinagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customView.DrawTriangle();

            }
        });



    }

}
