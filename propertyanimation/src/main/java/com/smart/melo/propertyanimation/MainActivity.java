package com.smart.melo.propertyanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

//属性动画
public class MainActivity extends AppCompatActivity {
    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv= (ImageView) findViewById(R.id.iv);

    }

    public void click(View view){
        AnimatorSet set=new AnimatorSet();
        ObjectAnimator animator=ObjectAnimator.ofFloat(iv,"translationX",0,150,300,450,600).setDuration(3000);
        ObjectAnimator animator2=ObjectAnimator.ofFloat(iv,"translationY",0,300,150,300,0).setDuration(3000);
        set.play(animator).with(animator2);
        set.start();


    }
}
