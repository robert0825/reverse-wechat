package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.ui.widget.celltextview.CellTextView;
import com.tencent.mm.ui.widget.celltextview.e.a;

public final class dv
  extends a
{
  private k wFQ;
  
  public dv(k paramk)
  {
    GMTrace.i(17907463487488L, 133421);
    this.wFQ = paramk;
    GMTrace.o(17907463487488L, 133421);
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(17907597705216L, 133422);
    int i = (int)paramMotionEvent.getRawX();
    int j = (int)paramMotionEvent.getRawY();
    paramView.setTag(R.h.cie, new int[] { i, j });
    if ((paramView instanceof CellTextView))
    {
      CellTextView localCellTextView = (CellTextView)paramView;
      if (localCellTextView.xtf)
      {
        bool = this.wFQ.onTouch(localCellTextView.xte, paramMotionEvent);
        GMTrace.o(17907597705216L, 133422);
        return bool;
      }
    }
    boolean bool = super.onTouch(paramView, paramMotionEvent);
    GMTrace.o(17907597705216L, 133422);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */