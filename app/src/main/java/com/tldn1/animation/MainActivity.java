package com.tldn1.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);


    }

    public void fadeImage(View view) {
        imageView1.animate().alpha(0f).setDuration(3000);
        imageView2.animate().alpha(1f).setDuration(3000);
    }

    public void rotateImage(View view) {
        imageView2.animate().rotationXBy(360f).setDuration(3000);
        imageView1.animate().rotationXBy(360f).setDuration(3000);
    }
    public void resizeImage(View view){
        imageView1.setScaleX(0f);
        imageView1.setScaleY(0f);

        imageView1.animate().alpha(1f).scaleX(1f).scaleY(1f).setDuration(3000);
        imageView2.animate().alpha(0f).scaleX(0f).scaleY(0f).setDuration(3000);
    }
}
