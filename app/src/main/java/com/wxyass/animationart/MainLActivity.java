package com.wxyass.animationart;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageView;

public class MainLActivity extends AppCompatActivity {

    static{
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_l);
    }

    /*只能在5.0以上使用的路径变换动画*/
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void fivestarl(View view){
        ImageView imageView = (ImageView) view;
        AnimatedVectorDrawable drawable = (AnimatedVectorDrawable) getDrawable(R.drawable.fivestar_anim);
        imageView.setImageDrawable(drawable);
        if (drawable !=null){
            drawable.start();
        }
    }
}
