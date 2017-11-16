package com.tencent.mm.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public abstract class r
  implements View.OnClickListener
{
  private long oWg;
  
  public r()
  {
    GMTrace.i(3055735013376L, 22767);
    this.oWg = -1L;
    GMTrace.o(3055735013376L, 22767);
  }
  
  public abstract void aoJ();
  
  public void onClick(View paramView)
  {
    GMTrace.i(3055869231104L, 22768);
    w.i("MicroMsg.MMCustomClickListener", "button onclick");
    if (this.oWg != -1L)
    {
      long l = (System.nanoTime() - this.oWg) / 1000000L;
      if (l < 3000L)
      {
        w.i("MicroMsg.MMCustomClickListener", "click time limited limitetime:%d, delaytime:%d", new Object[] { Long.valueOf(l), Long.valueOf(3000L) });
        GMTrace.o(3055869231104L, 22768);
        return;
      }
    }
    this.oWg = System.nanoTime();
    aoJ();
    GMTrace.o(3055869231104L, 22768);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */