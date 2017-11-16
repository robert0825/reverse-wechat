package com.tencent.mm.ui.chatting.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.q;

public final class p
{
  private long wJt;
  private q wJu;
  private h wtd;
  
  public p(h paramh)
  {
    GMTrace.i(19217428512768L, 143181);
    this.wtd = paramh;
    GMTrace.o(19217428512768L, 143181);
  }
  
  public final void ceF()
  {
    GMTrace.i(20379888254976L, 151842);
    if (System.currentTimeMillis() - this.wJt < 500L)
    {
      GMTrace.o(20379888254976L, 151842);
      return;
    }
    this.wJt = System.currentTimeMillis();
    ceG();
    GMTrace.o(20379888254976L, 151842);
  }
  
  public final void ceG()
  {
    GMTrace.i(19217696948224L, 143183);
    if (this.wJu != null)
    {
      this.wJu.dismiss();
      this.wJu = null;
    }
    GMTrace.o(19217696948224L, 143183);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */