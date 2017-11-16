package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;

final class cz
  implements View.OnTouchListener
{
  private int[] wzW;
  
  public cz()
  {
    GMTrace.i(14663018348544L, 109248);
    this.wzW = new int[2];
    GMTrace.o(14663018348544L, 109248);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(14663152566272L, 109249);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      GMTrace.o(14663152566272L, 109249);
      return false;
      this.wzW[0] = ((int)paramMotionEvent.getRawX());
      this.wzW[1] = ((int)paramMotionEvent.getRawY());
      paramView.setTag(R.h.cie, this.wzW);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */