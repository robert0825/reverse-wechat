package com.tencent.mm.plugin.game.ui;

import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;

public final class w
  implements View.OnTouchListener
{
  private int rz;
  
  public w()
  {
    this(Color.argb(221, 136, 136, 136));
    GMTrace.i(12699412987904L, 94618);
    GMTrace.o(12699412987904L, 94618);
  }
  
  private w(int paramInt)
  {
    GMTrace.i(12699547205632L, 94619);
    this.rz = paramInt;
    GMTrace.o(12699547205632L, 94619);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(12699681423360L, 94620);
    int i = paramMotionEvent.getAction();
    if (i == 0) {
      if ((paramView instanceof ImageView))
      {
        paramView = (ImageView)paramView;
        paramMotionEvent = paramView.getDrawable();
        if (paramMotionEvent != null)
        {
          paramMotionEvent.setColorFilter(this.rz, PorterDuff.Mode.MULTIPLY);
          paramView.setImageDrawable(paramMotionEvent);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(12699681423360L, 94620);
      return false;
      if (paramView.getBackground() != null)
      {
        paramView.getBackground().setColorFilter(this.rz, PorterDuff.Mode.MULTIPLY);
        continue;
        if ((i == 1) || (i == 3)) {
          if ((paramView instanceof ImageView))
          {
            paramView = ((ImageView)paramView).getDrawable();
            if (paramView != null) {
              paramView.clearColorFilter();
            }
          }
          else
          {
            paramView = paramView.getBackground();
            if (paramView != null) {
              paramView.clearColorFilter();
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */