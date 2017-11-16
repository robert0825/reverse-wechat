package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.protocal.c.bsq;
import java.io.IOException;

public final class k
  extends c
{
  private int code;
  private String eCh;
  
  public k(int paramInt, String paramString)
  {
    GMTrace.i(9191230013440L, 68480);
    this.code = paramInt;
    this.eCh = paramString;
    GMTrace.o(9191230013440L, 68480);
  }
  
  public final String getName()
  {
    GMTrace.i(9191498448896L, 68482);
    GMTrace.o(9191498448896L, 68482);
    return "WearPushPayResponseTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9191364231168L, 68481);
    bsq localbsq = new bsq();
    switch (this.code)
    {
    }
    for (;;)
    {
      localbsq.vaw = this.eCh;
      try
      {
        a.bBm();
        r.a(20016, localbsq.toByteArray(), true);
        GMTrace.o(9191364231168L, 68481);
        return;
      }
      catch (IOException localIOException)
      {
        GMTrace.o(9191364231168L, 68481);
      }
      localbsq.uTi = 0;
      continue;
      localbsq.uTi = 196610;
      continue;
      localbsq.uTi = 196613;
      continue;
      localbsq.uTi = 196614;
      continue;
      localbsq.uTi = 196615;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */