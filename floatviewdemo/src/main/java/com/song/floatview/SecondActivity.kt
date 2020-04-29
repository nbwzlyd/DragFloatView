package com.song.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

/**
 * @author : songjun
 * @create : 2020/4/29
 */

class SecondActivity : AppCompatActivity() {
    private lateinit var floatView : View
    private lateinit var ivImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        floatView = layoutInflater.inflate(R.layout.layout_float_view,null,false)
        ivImage = floatView.findViewById<ImageView>(R.id.iv_image);
        ivImage.setOnClickListener {
            Toast.makeText(MainActivity@this,"点击了一下",Toast.LENGTH_SHORT).show()
        }
        float_view.setView(floatView
                , ScreenUtil.widthPixels -ScreenUtil.dpToPx(100f,this)
                ,ScreenUtil.heightPixels -ScreenUtil.dpToPx(400f,this))

    }
}
