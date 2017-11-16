package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;

public final class c
  implements Iterator<View>
{
  private int iCk;
  private final ViewGroup iKx;
  
  public c(ViewGroup paramViewGroup)
  {
    GMTrace.i(19882880008192L, 148139);
    this.iCk = 0;
    this.iKx = paramViewGroup;
    GMTrace.o(19882880008192L, 148139);
  }
  
  public final boolean hasNext()
  {
    GMTrace.i(19883014225920L, 148140);
    if (this.iCk < this.iKx.getChildCount())
    {
      GMTrace.o(19883014225920L, 148140);
      return true;
    }
    GMTrace.o(19883014225920L, 148140);
    return false;
  }
  
  public final void remove()
  {
    GMTrace.i(19883148443648L, 148141);
    this.iKx.removeViewAt(this.iCk - 1);
    GMTrace.o(19883148443648L, 148141);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */