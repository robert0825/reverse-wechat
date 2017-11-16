package com.tencent.mm.ui.widget.celltextview.c;

import android.graphics.RectF;
import android.text.style.ClickableSpan;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  public int Vw;
  public int iCQ;
  public int vt;
  public ClickableSpan xtu;
  public LinkedList<RectF> xtv;
  
  public b(ClickableSpan paramClickableSpan, int paramInt1, int paramInt2)
  {
    GMTrace.i(18755316875264L, 139738);
    this.Vw = paramInt1;
    this.vt = paramInt2;
    this.iCQ = -5908174;
    this.xtu = paramClickableSpan;
    GMTrace.o(18755316875264L, 139738);
  }
  
  public final boolean eK(int paramInt1, int paramInt2)
  {
    GMTrace.i(18755451092992L, 139739);
    Iterator localIterator = this.xtv.iterator();
    while (localIterator.hasNext()) {
      if (((RectF)localIterator.next()).contains(paramInt1, paramInt2))
      {
        GMTrace.o(18755451092992L, 139739);
        return true;
      }
    }
    GMTrace.o(18755451092992L, 139739);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */