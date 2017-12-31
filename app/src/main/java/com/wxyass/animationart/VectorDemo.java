package com.wxyass.animationart;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class VectorDemo extends AppCompatActivity {

    static{
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vectordemo);
    }


    /*路径变换动画*/
    public void another(View view){
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){// 21
            startActivity(new Intent(VectorDemo.this,MainLActivity.class));
        }else{
            Toast.makeText(VectorDemo.this,"当前系统不支持L Plus",Toast.LENGTH_SHORT).show();
        }

    }

    /*平移动画*/
    public void anima(View view){
        ImageView imageView = (ImageView) view;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }
    }


    /*颜色变化的动画*/
    public void square(View view){
        ImageView imageView = (ImageView) view;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }
    }

    /*路径绘制的动画 一重动画 */
    public void searchbar(View view){
        ImageView imageView = (ImageView) view;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }
    }

    /*路径绘制的动画 多重动画*/
    public void path(View view){
        ImageView imageView = (ImageView) view;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }
    }

}
