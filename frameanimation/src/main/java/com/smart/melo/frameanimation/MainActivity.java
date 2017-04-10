package com.smart.melo.frameanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

//帧动画
public class MainActivity extends AppCompatActivity {
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.iv_load);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
//        AnimationDrawable播放动画是依附在window上面的，而在Activity onCreate方法中调用时
//       Window还未初始化完毕，所有才会停留在第一帧，要想实现播放必须在onWindowFocusChanged中
        mImageView.setImageResource(R.drawable.loading_animlist);
        AnimationDrawable animationDrawable = (AnimationDrawable) mImageView.getDrawable();
        animationDrawable.start();
//        //停止动画
//        animationDrawable.stop();
//        //动画是否正在播放
//        animationDrawable.isRunning();
//        //设置是否循环播放
//        animationDrawable.setOneShot(true);
//        //添加一张图片，并设置持续时间
//        animationDrawable.addFrame(getResources().getDrawable(R.drawable.loading_01),200);
//        //获取某一帧图片
//        animationDrawable.getFrame(0);
    }

//    动画停止
//    imageView.setImageResource(R.drawable.lottery_animlist);
//    AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
//    animationDrawable.stop();
}
