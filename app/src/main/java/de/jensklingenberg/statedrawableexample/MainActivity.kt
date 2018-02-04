package de.jensklingenberg.statedrawableexample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import kotlinx.android.synthetic.main.activity_main.btn2
import android.view.MotionEvent



class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    btn2.setOnTouchListener { _, event ->
      when {
        event.action == MotionEvent.ACTION_DOWN -> btn2.isPressed=true
        event.action == MotionEvent.ACTION_UP ->   btn2.isPressed=false
      }
      true
    }
  }
}



