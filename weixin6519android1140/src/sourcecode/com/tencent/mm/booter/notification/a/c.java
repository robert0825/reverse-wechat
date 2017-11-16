package com.tencent.mm.booter.notification.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.bi.a;
import com.tencent.mm.k.f;

public final class c
{
  public int fLg;
  
  public c()
  {
    GMTrace.i(529757372416L, 3947);
    this.fLg = -1;
    GMTrace.o(529757372416L, 3947);
  }
  
  public final int p(String paramString, int paramInt)
  {
    GMTrace.i(529891590144L, 3948);
    this.fLg = a.bIN();
    if ((!f.ez(paramInt)) || (f.dX(paramString))) {}
    try
    {
      this.fLg = R.g.bbQ;
      for (;;)
      {
        if (this.fLg < 0) {
          this.fLg = a.bIN();
        }
        paramInt = this.fLg;
        GMTrace.o(529891590144L, 3948);
        return paramInt;
        if (f.dY(paramString)) {
          try
          {
            this.fLg = R.g.bbQ;
          }
          catch (Exception paramString) {}
        }
      }
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\notification\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */