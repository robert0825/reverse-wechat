package com.tencent.mm.pluginsdk.model;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.k.c;
import com.tencent.mm.sdk.platformtools.bg;

public final class u
{
  private static volatile u tnq;
  
  static
  {
    GMTrace.i(751887712256L, 5602);
    tnq = null;
    GMTrace.o(751887712256L, 5602);
  }
  
  private u()
  {
    GMTrace.i(750813970432L, 5594);
    GMTrace.o(750813970432L, 5594);
  }
  
  public static u bJl()
  {
    GMTrace.i(750948188160L, 5595);
    if (tnq == null) {}
    try
    {
      if (tnq == null) {
        tnq = new u();
      }
      u localu = tnq;
      GMTrace.o(750948188160L, 5595);
      return localu;
    }
    finally {}
  }
  
  public static t s(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(751082405888L, 5596);
    switch (paramInt)
    {
    default: 
      paramBundle = new q();
      GMTrace.o(751082405888L, 5596);
      return paramBundle;
    case 2: 
      paramBundle = new a(paramBundle);
      GMTrace.o(751082405888L, 5596);
      return paramBundle;
    }
    paramBundle = new x();
    GMTrace.o(751082405888L, 5596);
    return paramBundle;
  }
  
  public static int yL(int paramInt)
  {
    GMTrace.i(751216623616L, 5597);
    switch (paramInt)
    {
    default: 
      GMTrace.o(751216623616L, 5597);
      return 5;
    case 0: 
      paramInt = bg.getInt(com.tencent.mm.k.g.uu().z("QQBroswer", "RecommendCount"), 5);
      GMTrace.o(751216623616L, 5597);
      return paramInt;
    }
    GMTrace.o(751216623616L, 5597);
    return Integer.MAX_VALUE;
  }
  
  public static void yM(int paramInt)
  {
    GMTrace.i(751350841344L, 5598);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(751350841344L, 5598);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(10998, new Object[] { Integer.valueOf(0) });
      GMTrace.o(751350841344L, 5598);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(11091, new Object[] { Integer.valueOf(0) });
    }
  }
  
  public static void yN(int paramInt)
  {
    GMTrace.i(751485059072L, 5599);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(751485059072L, 5599);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(10998, new Object[] { Integer.valueOf(1) });
      GMTrace.o(751485059072L, 5599);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(11091, new Object[] { Integer.valueOf(1) });
    }
  }
  
  public static void yO(int paramInt)
  {
    GMTrace.i(751619276800L, 5600);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(751619276800L, 5600);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(10998, new Object[] { Integer.valueOf(3) });
      GMTrace.o(751619276800L, 5600);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(11091, new Object[] { Integer.valueOf(3) });
    }
  }
  
  public static void yP(int paramInt)
  {
    GMTrace.i(751753494528L, 5601);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(751753494528L, 5601);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(10998, new Object[] { Integer.valueOf(2) });
      GMTrace.o(751753494528L, 5601);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(11091, new Object[] { Integer.valueOf(2) });
    }
  }
  
  public static final class a
  {
    public int tnr;
    public int tns;
    public String tnt;
    public int tnu;
    public String tnv;
    
    public a()
    {
      GMTrace.i(759940775936L, 5662);
      GMTrace.o(759940775936L, 5662);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */