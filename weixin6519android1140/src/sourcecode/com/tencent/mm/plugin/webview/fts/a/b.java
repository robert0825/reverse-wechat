package com.tencent.mm.plugin.webview.fts.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class b
  implements c
{
  public Map<a, c.a> fUk;
  public Map<a, CountDownLatch> rCM;
  private j rCN;
  private j rCO;
  
  public b()
  {
    GMTrace.i(19475663421440L, 145105);
    this.rCM = new ConcurrentHashMap();
    this.fUk = new HashMap();
    this.rCN = new j()
    {
      public final void a(g paramAnonymousg)
      {
        GMTrace.i(19476334510080L, 145110);
        a locala = (a)paramAnonymousg.lwZ.lwD;
        if (locala == null)
        {
          GMTrace.o(19476334510080L, 145110);
          return;
        }
        CountDownLatch localCountDownLatch = (CountDownLatch)b.this.rCM.remove(locala);
        switch (paramAnonymousg.aGY)
        {
        }
        for (;;)
        {
          localCountDownLatch.countDown();
          GMTrace.o(19476334510080L, 145110);
          return;
          if ((paramAnonymousg.lxb == null) || (paramAnonymousg.lxb.size() == 0))
          {
            w.i("FTSMatchContact", "local contact search size 0");
            locala.bR(Collections.emptyList());
            localCountDownLatch.countDown();
            GMTrace.o(19476334510080L, 145110);
            return;
          }
          locala.bR(paramAnonymousg.lxb);
          continue;
          locala.bR(Collections.emptyList());
        }
      }
    };
    this.rCO = new j()
    {
      public final void a(g paramAnonymousg)
      {
        GMTrace.i(19477542469632L, 145119);
        a locala = (a)paramAnonymousg.lwZ.lwD;
        if (locala == null)
        {
          GMTrace.o(19477542469632L, 145119);
          return;
        }
        c.a locala1 = (c.a)b.this.fUk.remove(locala);
        if (locala1 == null)
        {
          GMTrace.o(19477542469632L, 145119);
          return;
        }
        switch (paramAnonymousg.aGY)
        {
        }
        for (;;)
        {
          locala1.bBK();
          GMTrace.o(19477542469632L, 145119);
          return;
          if ((paramAnonymousg.lxb == null) || (paramAnonymousg.lxb.size() == 0))
          {
            w.i("FTSMatchContact", "local contact search size 0");
            locala1.bBK();
            GMTrace.o(19477542469632L, 145119);
            return;
          }
          locala.bR(paramAnonymousg.lxb);
          continue;
          locala.bR(Collections.emptyList());
        }
      }
    };
    GMTrace.o(19475663421440L, 145105);
  }
  
  private static boolean a(a parama, j paramj)
  {
    GMTrace.i(19476066074624L, 145108);
    if (bg.nm(parama.eQb))
    {
      GMTrace.o(19476066074624L, 145108);
      return false;
    }
    f localf = new f();
    localf.eQb = parama.eQb;
    localf.lwT = new int[] { 131072 };
    localf.lwU = new int[] { 1, 5 };
    localf.lwV = parama.rCL;
    localf.lwX = com.tencent.mm.plugin.fts.a.b.b.lxs;
    localf.lwW = new HashSet();
    localf.lwY = paramj;
    localf.scene = 1;
    ((l)h.j(l.class)).search(2, localf).lwD = parama;
    GMTrace.o(19476066074624L, 145108);
    return true;
  }
  
  public final a Ld(String paramString)
  {
    GMTrace.i(19475797639168L, 145106);
    e locale = new e(paramString, Integer.MAX_VALUE);
    CountDownLatch localCountDownLatch = (CountDownLatch)this.rCM.get(locale);
    if (localCountDownLatch == null) {
      if (a(locale, this.rCN))
      {
        w.i("FTSMatchContact", "not have a running task ,start new task, query %s,maxMatch %d", new Object[] { paramString, Integer.valueOf(Integer.MAX_VALUE) });
        paramString = new CountDownLatch(1);
        this.rCM.put(locale, paramString);
      }
    }
    for (;;)
    {
      if (paramString != null) {}
      try
      {
        paramString.await(2000L, TimeUnit.MILLISECONDS);
        this.rCM.remove(locale);
        GMTrace.o(19475797639168L, 145106);
        return locale;
        w.i("FTSMatchContact", "start new task fail, query %s,maxMatch %d", new Object[] { paramString, Integer.valueOf(Integer.MAX_VALUE) });
        paramString = localCountDownLatch;
        continue;
        w.i("FTSMatchContact", "have a running task ,wait for result, query %s,maxMatch %d", new Object[] { paramString, Integer.valueOf(Integer.MAX_VALUE) });
        paramString = localCountDownLatch;
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          w.printErrStackTrace("FTSMatchContact", paramString, "", new Object[0]);
        }
      }
    }
  }
  
  public final void a(a parama, c.a parama1)
  {
    GMTrace.i(19475931856896L, 145107);
    this.fUk.put(parama, parama1);
    a(parama, this.rCO);
    GMTrace.o(19475931856896L, 145107);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */