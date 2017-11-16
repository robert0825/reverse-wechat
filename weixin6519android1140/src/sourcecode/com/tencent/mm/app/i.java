package com.tencent.mm.app;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bz.c;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.h;

public final class i
{
  static i esv;
  HandlerThread esw;
  d esx;
  ae handler;
  
  public i(String paramString)
  {
    GMTrace.i(12977914773504L, 96693);
    this.esw = e.cK(paramString, 10);
    this.esw.start();
    this.handler = new ae(this.esw.getLooper());
    this.esx = new h(c.c(this.handler), paramString);
    GMTrace.o(12977914773504L, 96693);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\app\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */