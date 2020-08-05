package com.example.photoeditor.college;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

import com.example.photoeditor.R;

public class CollegeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);

        findViewById(R.id.collageBgView).setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                return true;
            }
        });

        findViewById(R.id.collageView1).setOnTouchListener(new MultiTouchListener());
        findViewById(R.id.collageView2).setOnTouchListener(new MultiTouchListener());
        findViewById(R.id.collageView3).setOnTouchListener(new MultiTouchListener());
        findViewById(R.id.collageView4).setOnTouchListener(new MultiTouchListener());
    }
}