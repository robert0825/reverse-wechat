package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.report.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;

public final class b
{
  private String eAv;
  public b iyM;
  public int iyN;
  public String iyO;
  private long iyP;
  public a iyQ;
  
  public b()
  {
    GMTrace.i(16185315819520L, 120590);
    GMTrace.o(16185315819520L, 120590);
  }
  
  public final void rw()
  {
    GMTrace.i(16185450037248L, 120591);
    if ((this.iyM == null) || (this.iyQ == null))
    {
      GMTrace.o(16185450037248L, 120591);
      return;
    }
    this.iyP = bg.Pv();
    g.ork.i(13917, d.g(new Object[] { Integer.valueOf(this.iyM.value), Integer.valueOf(this.iyN), this.iyO, Long.valueOf(this.iyP), this.eAv, Integer.valueOf(this.iyQ.value) }));
    GMTrace.o(16185450037248L, 120591);
  }
  
  public static enum a
  {
    public final int value;
    
    static
    {
      GMTrace.i(16185181601792L, 120589);
      iyR = new a("NEARBY_H5", 0, 1);
      iyS = new a("EMPTY_PAGE", 1, 2);
      iyT = new a("LBS_NOT_ALLOW", 2, 3);
      iyU = new a[] { iyR, iyS, iyT };
      GMTrace.o(16185181601792L, 120589);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(16185047384064L, 120588);
      this.value = paramInt;
      GMTrace.o(16185047384064L, 120588);
    }
  }
  
  public static enum b
  {
    public final int value;
    
    static
    {
      GMTrace.i(16184644730880L, 120585);
      iyV = new b("DESKTOP_SEARCH", 0, 1);
      iyW = new b("RESUME_FROM_WEAPP_EXIT", 1, 2);
      iyX = new b("BOTTOM_ENTRANCE_IN_DESKTOP", 2, 3);
      iyY = new b("TOP_ENTRANCE_IN_DESKTOP", 3, 4);
      iyZ = new b[] { iyV, iyW, iyX, iyY };
      GMTrace.o(16184644730880L, 120585);
    }
    
    private b(int paramInt)
    {
      GMTrace.i(16184510513152L, 120584);
      this.value = paramInt;
      GMTrace.o(16184510513152L, 120584);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\report\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */