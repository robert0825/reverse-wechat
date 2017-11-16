package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.config.c;
import com.tencent.mm.protocal.c.adh;
import com.tencent.mm.protocal.c.adi;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.concurrent.TimeUnit;

public final class k
  extends com.tencent.mm.ad.a<adi>
{
  private static final long hNf;
  
  static
  {
    GMTrace.i(19886906540032L, 148169);
    hNf = TimeUnit.MINUTES.toSeconds(5L);
    GMTrace.o(19886906540032L, 148169);
  }
  
  private k(int paramInt)
  {
    GMTrace.i(19886369669120L, 148165);
    b.a locala = new b.a();
    adh localadh = new adh();
    localadh.eMw = (paramInt - 1 + 1);
    locala.gtF = localadh;
    locala.gtG = new adi();
    locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/getsearchshowoutwxaapp";
    locala.gtE = 1314;
    this.fUa = locala.DA();
    GMTrace.o(19886369669120L, 148165);
  }
  
  static adi TJ()
  {
    GMTrace.i(19886638104576L, 148167);
    adi localadi = (adi)com.tencent.mm.plugin.appbrand.app.e.Sq().f("GetSearchShowOutWxaApp_resp", adi.class);
    GMTrace.o(19886638104576L, 148167);
    return localadi;
  }
  
  public static void ih(int paramInt)
  {
    GMTrace.i(19886503886848L, 148166);
    if (!h.xw().fYg)
    {
      GMTrace.o(19886503886848L, 148166);
      return;
    }
    switch (1.hNg[(paramInt - 1)])
    {
    }
    for (;;)
    {
      new k(paramInt).Dy();
      GMTrace.o(19886503886848L, 148166);
      return;
      if (bg.getLong(com.tencent.mm.plugin.appbrand.app.e.Si().get("GetSearchShowOutWxaApp_lastCheck", "$$invalid"), 0L) + bg.getLong(com.tencent.mm.plugin.appbrand.app.e.Si().get("GetSearchShowOutWxaApp_interval", "$$invalid"), hNf) > bg.Pu())
      {
        GMTrace.o(19886503886848L, 148166);
        return;
      }
      com.tencent.mm.plugin.appbrand.app.e.Si().aQ("GetSearchShowOutWxaApp_lastCheck", String.valueOf(bg.Pu()));
      continue;
      if (((Long)h.xy().xh().get(w.a.vuU, Long.valueOf(0L))).longValue() + TimeUnit.DAYS.toSeconds(1L) > bg.Pu())
      {
        GMTrace.o(19886503886848L, 148166);
        return;
      }
      h.xy().xh().a(w.a.vuU, Long.valueOf(bg.Pu()));
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(19888114499584L, 148178);
      hNh = 1;
      hNi = 2;
      hNj = new int[] { hNh, hNi };
      GMTrace.o(19888114499584L, 148178);
    }
    
    public static int[] TK()
    {
      GMTrace.i(19887980281856L, 148177);
      int[] arrayOfInt = (int[])hNj.clone();
      GMTrace.o(19887980281856L, 148177);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */