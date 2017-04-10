package com.smart.melo.tweenanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

//补间动画
public class MainActivity extends AppCompatActivity {
    protected CoustomLoadDialog progressDialog;
    ImageView mImageView;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        progressDialog = new CoustomLoadDialog(this).createDialog();
//        progressDialog.show();

        mImageView= (ImageView) findViewById(R.id.image_translate);
        mButton= (Button) findViewById(R.id.btn_start);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"image被点击了",Toast.LENGTH_SHORT).show();
            }
        });


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 加载动画
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_animation);
//                mImageView.setAnimation(animation);
                mImageView.startAnimation(animation);
            }
        });

    }
}
