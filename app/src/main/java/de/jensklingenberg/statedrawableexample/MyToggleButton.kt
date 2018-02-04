package de.jensklingenberg.statedrawableexample

import android.content.Context
import android.util.AttributeSet

class MyToggleButton : android.support.v7.widget.AppCompatButton {

  constructor(context: Context) : super(context) {}

  constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

  constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs,
      defStyleAttr) {
  }

  override fun setPressed(pressed: Boolean) {
    if (pressed) {
      background = resources.getDrawable(R.drawable.ic_assignment_turned_in_black_24dp)

    } else {
      background = resources.getDrawable(R.drawable.ic_assignment_returned_black_24dp)

    }
  }
}