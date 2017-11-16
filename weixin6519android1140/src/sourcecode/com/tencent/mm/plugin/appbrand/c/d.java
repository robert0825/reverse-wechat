package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bmg;
import com.tencent.mm.protocal.c.bmh;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.bt.a;
import java.util.Arrays;
import java.util.Map;

public final class d
{
  public static final c hMx;
  
  static
  {
    GMTrace.i(15412758577152L, 114834);
    hMx = new c();
    GMTrace.o(15412758577152L, 114834);
  }
  
  public static boolean TA()
  {
    GMTrace.i(15411819053056L, 114827);
    c.Tr();
    if (!h.xw().wL())
    {
      GMTrace.o(15411819053056L, 114827);
      return false;
    }
    boolean bool = ((Boolean)h.xy().xh().get(w.a.vuR, Boolean.valueOf(false))).booleanValue();
    GMTrace.o(15411819053056L, 114827);
    return bool;
  }
  
  static a TB()
  {
    int i = 0;
    GMTrace.i(15411953270784L, 114828);
    if (!TC())
    {
      localObject = a.hMy;
      GMTrace.o(15411953270784L, 114828);
      return (a)localObject;
    }
    int j = ((Integer)h.xy().xh().get(w.a.vuI, Integer.valueOf(0))).intValue();
    Object localObject = a.values();
    int k = localObject.length;
    while (i < k)
    {
      a locala = localObject[i];
      if (locala.value == j)
      {
        GMTrace.o(15411953270784L, 114828);
        return locala;
      }
      i += 1;
    }
    localObject = a.hMy;
    GMTrace.o(15411953270784L, 114828);
    return (a)localObject;
  }
  
  public static boolean TC()
  {
    GMTrace.i(15412087488512L, 114829);
    if (!h.xw().wL())
    {
      GMTrace.o(15412087488512L, 114829);
      return false;
    }
    long l = ((Long)h.xy().xh().get(w.a.vuF, Long.valueOf(0L))).longValue();
    if (l > bg.Pu()) {}
    for (boolean bool = true;; bool = false)
    {
      if ((!bool) && (l > 0L))
      {
        h.xy().xh().a(w.a.vuF, Long.valueOf(0L));
        e locale = e.hMJ;
        e.a((String)h.xy().xh().get(w.a.vuG, ""), ((Long)h.xy().xh().get(w.a.vuH, Long.valueOf(0L))).longValue(), 3, e.TF());
      }
      GMTrace.o(15412087488512L, 114829);
      return bool;
    }
  }
  
  static void TD()
  {
    GMTrace.i(15412221706240L, 114830);
    c.Tr();
    if (!h.xw().wL())
    {
      GMTrace.o(15412221706240L, 114830);
      return;
    }
    e locale = e.hMJ;
    if (!((Boolean)h.xy().xh().get(w.a.vuL, Boolean.valueOf(false))).booleanValue())
    {
      e.a((String)h.xy().xh().get(w.a.vuG, ""), ((Long)h.xy().xh().get(w.a.vuH, Long.valueOf(0L))).longValue(), 0, e.TF());
      h.xy().xh().a(w.a.vuL, Boolean.valueOf(true));
    }
    GMTrace.o(15412221706240L, 114830);
  }
  
  public static void TE()
  {
    GMTrace.i(15412355923968L, 114831);
    if (!h.xw().wL())
    {
      GMTrace.o(15412355923968L, 114831);
      return;
    }
    if (TC())
    {
      a(false, 0L);
      a(false, 0L, 0L);
      e locale = e.hMJ;
      e.a((String)h.xy().xh().get(w.a.vuG, ""), ((Long)h.xy().xh().get(w.a.vuH, Long.valueOf(0L))).longValue(), 2, e.TF());
    }
    GMTrace.o(15412355923968L, 114831);
  }
  
  public static void a(boolean paramBoolean, long paramLong)
  {
    GMTrace.i(15411550617600L, 114825);
    if (!paramBoolean)
    {
      h.xy().xh().a(w.a.vuF, Long.valueOf(0L));
      GMTrace.o(15411550617600L, 114825);
      return;
    }
    if (paramLong == 0L) {}
    for (paramLong = Long.MAX_VALUE;; paramLong = bg.Pu() + Math.max(0L, paramLong))
    {
      h.xy().xh().a(w.a.vuF, Long.valueOf(paramLong));
      h.xy().xh().a(w.a.vuR, Boolean.valueOf(true));
      h.xy().xh().a(w.a.vuL, Boolean.valueOf(false));
      e locale = e.hMJ;
      e.a((String)h.xy().xh().get(w.a.vuG, ""), ((Long)h.xy().xh().get(w.a.vuH, Long.valueOf(0L))).longValue(), 1, e.TF());
      GMTrace.o(15411550617600L, 114825);
      return;
    }
  }
  
  public static void a(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    long l = 0L;
    GMTrace.i(15411684835328L, 114826);
    t localt = h.xy().xh();
    w.a locala = w.a.vuO;
    if (!paramBoolean) {}
    for (paramLong1 = l;; paramLong1 = Math.max(0L, paramLong1) + l)
    {
      localt.a(locala, Long.valueOf(paramLong1));
      localt = h.xy().xh();
      locala = w.a.vuQ;
      if (!paramBoolean) {
        paramLong2 = Long.MAX_VALUE;
      }
      localt.a(locala, Long.valueOf(paramLong2));
      GMTrace.o(15411684835328L, 114826);
      return;
      l = bg.Pu();
    }
  }
  
  static enum a
  {
    final int value;
    
    static
    {
      GMTrace.i(15411416399872L, 114824);
      hMy = new a("NONE", 0, 0);
      hMz = new a("REDDOT", 1, 1);
      hMA = new a("NEW", 2, 2);
      hMB = new a[] { hMy, hMz, hMA };
      GMTrace.o(15411416399872L, 114824);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(15411282182144L, 114823);
      this.value = paramInt;
      GMTrace.o(15411282182144L, 114823);
    }
  }
  
  public static final class b
    implements bt.a
  {
    private static final b hMC;
    
    static
    {
      GMTrace.i(15416114020352L, 114859);
      hMC = new b();
      GMTrace.o(15416114020352L, 114859);
    }
    
    private b()
    {
      GMTrace.i(15415442931712L, 114854);
      GMTrace.o(15415442931712L, 114854);
    }
    
    public static void oF(String paramString)
    {
      GMTrace.i(16052842921984L, 119603);
      boolean bool = h.xw().wL();
      w.i("MicroMsg.AppBrandPushNewOrRedDotLogic", "parseThenProcess, accReady %b, received xml %s", new Object[] { Boolean.valueOf(bool), paramString });
      if (!bool)
      {
        GMTrace.o(16052842921984L, 119603);
        return;
      }
      paramString = bh.q(paramString, "sysmsg");
      if ((paramString == null) || (paramString.size() <= 0))
      {
        GMTrace.o(16052842921984L, 119603);
        return;
      }
      String str = (String)paramString.get(".sysmsg.wxareddot.id");
      int i = bg.getInt((String)paramString.get(".sysmsg.wxareddot.activitytype"), 0);
      if ((bg.nm(str)) || ((i != 1) && (i != 2)))
      {
        GMTrace.o(16052842921984L, 119603);
        return;
      }
      int j = bg.getInt((String)paramString.get(".sysmsg.wxareddot.close"), 0);
      long l1 = bg.getLong((String)paramString.get(".sysmsg.wxareddot.pushtime"), 0L);
      long l2 = bg.getLong((String)paramString.get(".sysmsg.wxareddot.duration"), 0L);
      long l3 = bg.getLong((String)paramString.get(".sysmsg.wxareddot.frequency"), 0L);
      paramString.get(".sysmsg.wxareddot.tips");
      int k = bg.getInt((String)paramString.get(".sysmsg.wxareddot.showType"), 0);
      int m = bg.getInt((String)paramString.get(".sysmsg.wxareddot.reason"), 0);
      switch (i)
      {
      }
      do
      {
        do
        {
          GMTrace.o(16052842921984L, 119603);
          return;
        } while ((str.equals((String)h.xy().xh().get(w.a.vuG, null))) || (a.Tl()) || (bg.bs(ab.getContext()).equals(AppBrandLauncherUI.class.getName())) || (c.Tt() == c.a.hMp));
        h.xy().xh().a(w.a.vuG, str);
        h.xy().xh().a(w.a.vuH, Long.valueOf(l1));
        h.xy().xh().a(w.a.vuI, Integer.valueOf(k));
        h.xy().xh().a(w.a.vuJ, Integer.valueOf(m));
        if ((j == 1) && (d.TC()))
        {
          paramString = d.e.hMJ;
          d.e.a((String)h.xy().xh().get(w.a.vuG, ""), ((Long)h.xy().xh().get(w.a.vuH, Long.valueOf(0L))).longValue(), 4, d.e.TF());
        }
        if (j != 1) {}
        for (bool = true;; bool = false)
        {
          d.a(bool, l2);
          GMTrace.o(16052842921984L, 119603);
          return;
        }
      } while (str.equals((String)h.xy().xh().get(w.a.vuN, null)));
      if (j != 1) {}
      for (bool = true;; bool = false)
      {
        d.a(bool, l2, l3);
        break;
      }
    }
    
    public static void register()
    {
      GMTrace.i(15415577149440L, 114855);
      c.Tr();
      ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("wxareddot", hMC, true);
      GMTrace.o(15415577149440L, 114855);
    }
    
    public static void unregister()
    {
      GMTrace.i(15415711367168L, 114856);
      c.Tr();
      ((com.tencent.mm.plugin.messenger.foundation.a.n)h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("wxareddot", hMC, true);
      GMTrace.o(15415711367168L, 114856);
    }
    
    public final void a(final com.tencent.mm.ad.d.a parama)
    {
      GMTrace.i(15415845584896L, 114857);
      parama = com.tencent.mm.platformtools.n.a(parama.gtM.tPY);
      if (bg.nm(parama))
      {
        GMTrace.o(15415845584896L, 114857);
        return;
      }
      com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15413295448064L, 114838);
          d.b.oF(parama);
          GMTrace.o(15413295448064L, 114838);
        }
      });
      GMTrace.o(15415845584896L, 114857);
    }
  }
  
  public static final class c
  {
    public c()
    {
      GMTrace.i(15413966536704L, 114843);
      GMTrace.o(15413966536704L, 114843);
    }
  }
  
  public static final class d
  {
    public final String[] hMI;
    
    public d()
    {
      GMTrace.i(15410208440320L, 114815);
      this.hMI = new String[9];
      Arrays.fill(this.hMI, "0");
      this.hMI[0] = ((String)h.xy().xh().get(w.a.vuG, ""));
      this.hMI[1] = String.valueOf(h.xy().xh().get(w.a.vuH, Long.valueOf(0L)));
      this.hMI[2] = String.valueOf(bg.Pu());
      GMTrace.o(15410208440320L, 114815);
    }
  }
  
  static final class e
  {
    static final e hMJ;
    
    static
    {
      GMTrace.i(15410879528960L, 114820);
      hMJ = new e();
      GMTrace.o(15410879528960L, 114820);
    }
    
    e()
    {
      GMTrace.i(15410476875776L, 114817);
      GMTrace.o(15410476875776L, 114817);
    }
    
    static int TF()
    {
      GMTrace.i(15410611093504L, 114818);
      if (h.xy().xh().getBoolean(w.a.vuM, false))
      {
        GMTrace.o(15410611093504L, 114818);
        return 1;
      }
      int j = ((Integer)h.xy().xh().get(w.a.vuJ, Integer.valueOf(0))).intValue();
      int i = j;
      if (j > 0) {
        i = j + 1;
      }
      GMTrace.o(15410611093504L, 114818);
      return i;
    }
    
    static void a(String paramString, long paramLong, int paramInt1, int paramInt2)
    {
      GMTrace.i(15410745311232L, 114819);
      g.ork.i(14112, new Object[] { Integer.valueOf(1), bg.nl(paramString), Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      GMTrace.o(15410745311232L, 114819);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */