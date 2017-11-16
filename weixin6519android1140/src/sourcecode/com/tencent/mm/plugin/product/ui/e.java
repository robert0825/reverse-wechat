package com.tencent.mm.plugin.product.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  int nJw;
  int nJx;
  
  public e(int paramInt1, int paramInt2)
  {
    GMTrace.i(6036039663616L, 44972);
    this.nJx = paramInt1;
    this.nJw = paramInt2;
    GMTrace.o(6036039663616L, 44972);
  }
  
  public final boolean aXv()
  {
    GMTrace.i(6036173881344L, 44973);
    if ((this.nJx & 0x1) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MallProductConfig", "isFreePost, ret = " + bool);
      GMTrace.o(6036173881344L, 44973);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */