package com.tencent.mm.kiss.widget.textview;

import android.text.Layout.Alignment;
import android.text.TextPaint;
import com.tencent.gmtrace.GMTrace;

public final class e
{
  private final d[] gbx;
  private final Object mLock;
  private int vw;
  
  public e()
  {
    GMTrace.i(428691423232L, 3194);
    this.mLock = new Object();
    this.gbx = new d[3];
    GMTrace.o(428691423232L, 3194);
  }
  
  public final boolean a(d paramd)
  {
    GMTrace.i(428959858688L, 3196);
    Object localObject = this.mLock;
    int i = 0;
    for (;;)
    {
      try
      {
        if (i >= this.vw) {
          break label64;
        }
        if (this.gbx[i] == paramd)
        {
          i = 1;
          if (i == 0) {
            break;
          }
          throw new IllegalStateException("Already in the pool!");
        }
      }
      finally {}
      i += 1;
      continue;
      label64:
      i = 0;
    }
    paramd.gbk = null;
    paramd.gbl = null;
    paramd.gbm = 0;
    paramd.gbn = 0;
    paramd.gbo = new TextPaint();
    paramd.width = 0;
    paramd.gbp = Layout.Alignment.ALIGN_NORMAL;
    paramd.gravity = 51;
    paramd.gbq = null;
    paramd.gbr = 0;
    paramd.maxLines = Integer.MAX_VALUE;
    paramd.gbs = null;
    paramd.gbt = 0.0F;
    paramd.gbu = 1.0F;
    paramd.gbv = false;
    paramd.maxLength = 0;
    paramd.gbw = null;
    if (this.vw < this.gbx.length)
    {
      this.gbx[this.vw] = paramd;
      this.vw += 1;
      GMTrace.o(428959858688L, 3196);
      return true;
    }
    GMTrace.o(428959858688L, 3196);
    return false;
  }
  
  public final d xP()
  {
    GMTrace.i(428825640960L, 3195);
    synchronized (this.mLock)
    {
      if (this.vw > 0)
      {
        int i = this.vw - 1;
        d locald = this.gbx[i];
        this.gbx[i] = null;
        this.vw -= 1;
        GMTrace.o(428825640960L, 3195);
        return locald;
      }
      GMTrace.o(428825640960L, 3195);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kiss\widget\textview\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */