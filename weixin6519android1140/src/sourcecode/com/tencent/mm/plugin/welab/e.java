package com.tencent.mm.plugin.welab;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.welab.c.a.a;
import com.tencent.mm.sdk.platformtools.w;

public final class e
{
  public static void a(a parama)
  {
    GMTrace.i(15679180767232L, 116819);
    d locald = new d();
    locald.q("expid", parama.saN + ",");
    locald.q("appid", parama.eSd + ",");
    locald.q("action", parama.action + ",");
    locald.q("timestamp", parama.gVB + ",");
    StringBuilder localStringBuilder = new StringBuilder();
    if (parama.saO) {}
    for (int i = 1;; i = 0)
    {
      locald.q("hasRedPoint", i + ",");
      w.i("WelabReporter", "report " + locald.LT());
      g.ork.i(14206, new Object[] { locald });
      GMTrace.o(15679180767232L, 116819);
      return;
    }
  }
  
  public static void o(String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(16419928408064L, 122338);
    a locala = new a();
    locala.eSd = paramString;
    locala.action = paramInt;
    locala.gVB = System.currentTimeMillis();
    locala.saN = b.bGu().Nl(paramString).field_expId;
    locala.saO = paramBoolean;
    a(locala);
    GMTrace.o(16419928408064L, 122338);
  }
  
  public static final class a
  {
    public int action;
    public String eSd;
    public long gVB;
    public String saN;
    public boolean saO;
    
    public a()
    {
      GMTrace.i(15664685252608L, 116711);
      GMTrace.o(15664685252608L, 116711);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */