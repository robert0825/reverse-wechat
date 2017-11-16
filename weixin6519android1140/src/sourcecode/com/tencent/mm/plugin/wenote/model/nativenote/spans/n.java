package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;

public final class n
  extends e
{
  final boolean sgX;
  public final boolean sgY;
  
  public n(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramInt1, paramInt2);
    GMTrace.i(20629667446784L, 153703);
    this.sgX = paramBoolean1;
    this.sgY = paramBoolean2;
    GMTrace.o(20629667446784L, 153703);
  }
  
  public final boolean a(e parame)
  {
    GMTrace.i(20629801664512L, 153704);
    if (parame == null)
    {
      GMTrace.o(20629801664512L, 153704);
      return false;
    }
    if (parame.isEmpty())
    {
      int i;
      if ((parame.Vw >= this.Vw) && (parame.vt < this.vt))
      {
        i = 1;
        if ((parame.Vw < this.Vw) || (parame.vt > this.vt)) {
          break label107;
        }
      }
      label107:
      for (int j = 1;; j = 0)
      {
        if ((i == 0) && ((j == 0) || (!this.sgY))) {
          break label112;
        }
        GMTrace.o(20629801664512L, 153704);
        return true;
        i = 0;
        break;
      }
      label112:
      GMTrace.o(20629801664512L, 153704);
      return false;
    }
    if (Math.max(this.Vw, parame.Vw) < Math.min(this.vt, parame.vt))
    {
      GMTrace.o(20629801664512L, 153704);
      return true;
    }
    GMTrace.o(20629801664512L, 153704);
    return false;
  }
  
  public final int bIw()
  {
    GMTrace.i(20629935882240L, 153705);
    int i = Math.abs(this.vt - this.Vw);
    GMTrace.o(20629935882240L, 153705);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */