package com.tencent.mm.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public abstract class s
  implements MenuItem.OnMenuItemClickListener
{
  private long oWg;
  
  public s()
  {
    GMTrace.i(2900579319808L, 21611);
    this.oWg = -1L;
    GMTrace.o(2900579319808L, 21611);
  }
  
  public abstract void bxw();
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    GMTrace.i(2900713537536L, 21612);
    w.i("MicroMsg.MMCustomMenuItemClickListener", "button onclick");
    if (this.oWg != -1L)
    {
      long l = (System.nanoTime() - this.oWg) / 1000000L;
      if (l < 500L)
      {
        w.i("MicroMsg.MMCustomMenuItemClickListener", "click time limited limitetime:%d, delaytime:%d", new Object[] { Long.valueOf(l), Long.valueOf(500L) });
        GMTrace.o(2900713537536L, 21612);
        return false;
      }
    }
    this.oWg = System.nanoTime();
    bxw();
    GMTrace.o(2900713537536L, 21612);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */