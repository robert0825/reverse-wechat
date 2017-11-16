package com.tencent.mm.modelstat;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.xlog.LogLogic;
import com.tencent.mars.xlog.Xlog;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.ad.n;
import com.tencent.mm.bw.c;
import com.tencent.mm.g.a.ib;
import com.tencent.mm.g.a.sb;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.a.b.a;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.storage.au;
import java.io.File;
import java.util.Map;

public final class k
  extends b.a
  implements com.tencent.mm.ad.d
{
  public k()
  {
    GMTrace.i(1378818719744L, 10273);
    GMTrace.o(1378818719744L, 10273);
  }
  
  public static long a(File paramFile, long paramLong)
  {
    GMTrace.i(1378952937472L, 10274);
    for (;;)
    {
      try
      {
        paramFile = paramFile.listFiles();
        l1 = 0L;
        i = 0;
        l2 = l1;
      }
      catch (Exception paramFile)
      {
        try
        {
          if (i >= paramFile.length) {
            break label144;
          }
          if (paramFile[i].isDirectory())
          {
            l2 = l1 + a(paramFile[i], paramLong);
            l1 = l2;
          }
          else
          {
            if (paramFile[i].length() > paramLong) {
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "getFolderSize filesize:%s [%s]", new Object[] { Long.valueOf(paramFile[i].length()), paramFile[i].getPath() });
            }
            l2 = paramFile[i].length();
            l1 += l2;
          }
        }
        catch (Exception paramFile)
        {
          long l1;
          int i;
          long l2;
          for (;;) {}
          i += 1;
        }
        paramFile = paramFile;
        l1 = 0L;
      }
      tmp130_127[0] = bg.f(paramFile);
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetStatMsgExtension", "getFolderSize :%s", tmp130_127);
      l2 = l1;
      label144:
      GMTrace.o(1378952937472L, 10274);
      return l2;
    }
  }
  
  public static void b(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    GMTrace.i(1379489808384L, 10278);
    if (!h.xw().wL())
    {
      GMTrace.o(1379489808384L, 10278);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(1379489808384L, 10278);
      return;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetStatMsgExtension", "send bytes flow:" + paramInt3);
      if (paramBoolean)
      {
        m.t(0, paramInt3, paramInt2);
        GMTrace.o(1379489808384L, 10278);
        return;
      }
      m.u(0, paramInt3, paramInt2);
      GMTrace.o(1379489808384L, 10278);
      return;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetStatMsgExtension", "recv bytes flow:" + paramInt3);
      if (paramBoolean)
      {
        m.t(paramInt3, 0, paramInt2);
        GMTrace.o(1379489808384L, 10278);
        return;
      }
      m.u(paramInt3, 0, paramInt2);
      GMTrace.o(1379489808384L, 10278);
      return;
      ad.RS("dns_failed_report");
    }
  }
  
  public final void a(final int paramInt1, final int paramInt2, final String paramString1, final int paramInt3, final String paramString2, final boolean paramBoolean)
  {
    GMTrace.i(1379221372928L, 10276);
    h.xB().h(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1385798041600L, 10325);
        k.b(paramInt1, paramInt2, paramInt3, paramBoolean);
        GMTrace.o(1385798041600L, 10325);
      }
      
      public final String toString()
      {
        GMTrace.i(1385932259328L, 10326);
        String str = super.toString() + "|report";
        GMTrace.o(1385932259328L, 10326);
        return str;
      }
    }, 3000L);
    GMTrace.o(1379221372928L, 10276);
  }
  
  public final d.b b(final com.tencent.mm.ad.d.a parama)
  {
    GMTrace.i(1379087155200L, 10275);
    if (!h.xw().wL())
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.NetStatMsgExtension", "skip ipxx stat while account not set");
      GMTrace.o(1379087155200L, 10275);
      return null;
    }
    Object localObject = parama.gtM.tPY.uNR;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetStatMsgExtension", "onPreAddMessage %s", new Object[] { localObject });
    if (bg.nm((String)localObject))
    {
      GMTrace.o(1379087155200L, 10275);
      return null;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "get ipxx cmd=%s", new Object[] { localObject });
    parama = bh.q((String)localObject, "cmd");
    final int i;
    final long l;
    if (parama != null)
    {
      i = bg.getInt((String)parama.get(".cmd.trace.$code"), -1);
      if (i > 0)
      {
        if (i == 6)
        {
          parama = new sb();
          com.tencent.mm.sdk.b.a.vgX.m(parama);
          GMTrace.o(1379087155200L, 10275);
          return null;
        }
        localObject = (String)parama.get(".cmd.trace.$class");
        int j = bg.getInt((String)parama.get(".cmd.trace.$size"), 0);
        int k = bg.getInt((String)parama.get(".cmd.trace.$type"), 0);
        com.tencent.mm.bw.d.bVG().c(new com.tencent.mm.bw.d.a((String)localObject, i, j, k));
        GMTrace.o(1379087155200L, 10275);
        return null;
      }
      i = bg.getInt((String)parama.get(".cmd.hprof.$type"), -1);
      if (i > 0)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetStatMsgExtension", "hprof type: %d", new Object[] { Integer.valueOf(i) });
        c.AL(i);
        GMTrace.o(1379087155200L, 10275);
        return null;
      }
      if ("android".equalsIgnoreCase((String)parama.get(".cmd.hotpatch.$os")))
      {
        localObject = new ib();
        ((ib)localObject).eLv.eLw = ((String)parama.get(".cmd.hotpatch.xml.$url"));
        ((ib)localObject).eLv.eLx = ((String)parama.get(".cmd.hotpatch.xml.$signature"));
        ((ib)localObject).eLv.eLy = ((String)parama.get(".cmd.hotpatch.$url"));
        ((ib)localObject).eLv.eLz = ((String)parama.get(".cmd.hotpatch.$signature"));
        com.tencent.mm.sdk.b.a.vgX.a((com.tencent.mm.sdk.b.b)localObject, Looper.myLooper());
        GMTrace.o(1379087155200L, 10275);
        return null;
      }
      i = bg.getInt((String)parama.get(".cmd.clearfile.$fb"), -1);
      if (i != 1) {
        break label617;
      }
      l = bg.getInt((String)parama.get(".cmd.clearfile.$ps"), 1048576);
      h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(1396535459840L, 10405);
          long l = bg.Pv();
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(k.a(new File(h.xy().cachePath), l)), h.xy().cachePath });
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(k.a(new File(h.xy().fYT), l)), h.xy().fYT });
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(k.a(new File(h.xy().fYT), l)), h.xy().fYT });
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(k.a(new File(h.xy().fYU), l)), h.xy().fYU });
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "clearfile %s [%s]", new Object[] { Long.valueOf(k.a(new File(com.tencent.mm.storage.w.ghv), l)), com.tencent.mm.storage.w.ghv });
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "clearfile finish %s", new Object[] { Long.valueOf(bg.Pv() - l) });
          GMTrace.o(1396535459840L, 10405);
        }
      });
    }
    for (;;)
    {
      i = bg.getInt((String)parama.get(".cmd.updzh.$pt"), -1);
      parama = (String)parama.get(".cmd.updzh.$pd");
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.NetStatMsgExtension", "StackReportUploader pt:%d pd:%s", new Object[] { Integer.valueOf(i), parama });
      if ((i > 0) && (!bg.nm(parama))) {
        h.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1379892461568L, 10281);
            switch (i)
            {
            }
            for (;;)
            {
              GMTrace.o(1379892461568L, 10281);
              return;
              com.tencent.mm.platformtools.q.a(h.xy().fYU + parama, com.tencent.mm.y.q.zE(), false, true);
              GMTrace.o(1379892461568L, 10281);
              return;
              com.tencent.mm.platformtools.q.a(h.xy().cachePath + parama, com.tencent.mm.y.q.zE(), false, true);
              GMTrace.o(1379892461568L, 10281);
              return;
              com.tencent.mm.platformtools.q.a(parama, com.tencent.mm.y.q.zE(), false, true);
            }
          }
          
          public final String toString()
          {
            GMTrace.i(1380026679296L, 10282);
            String str = super.toString() + "|onPreAddMessage";
            GMTrace.o(1380026679296L, 10282);
            return str;
          }
        });
      }
      com.tencent.mm.sdk.platformtools.w.bPM();
      h.wS().gus.ij((String)localObject);
      try
      {
        Thread.sleep(50L, 0);
        LogLogic.initIPxxLogInfo();
        MMProtocalJni.setProtocalJniLogLevel(new Xlog().getLogLevel());
        GMTrace.o(1379087155200L, 10275);
        return null;
        label617:
        if (i == 2)
        {
          String str = (String)parama.get(".cmd.clearfile.$pd");
          File localFile = new File(str);
          if (localFile.exists())
          {
            l = localFile.length();
            label662:
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "clearfile delete :[%s] length:%s", new Object[] { str, Long.valueOf(l) });
            com.tencent.mm.loader.stub.b.deleteFile(str);
            localFile = new File(str);
            if (!localFile.exists()) {
              break label755;
            }
          }
          label755:
          for (l = localFile.length();; l = -1L)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "clearfile delete finish :[%s] length:%s", new Object[] { str, Long.valueOf(l) });
            break;
            l = -1L;
            break label662;
          }
        }
        if (i != 3) {
          continue;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "running  clearfile start:" + h.xy().xe() + ".tem");
        com.tencent.mm.loader.stub.b.deleteFile(h.xy().xe() + ".tem");
        com.tencent.mm.loader.stub.b.deleteFile(h.xy().xf() + ".tem");
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "running  clearfile end:" + h.xy().xe() + ".tem");
      }
      catch (Exception parama)
      {
        for (;;) {}
      }
    }
  }
  
  public final void h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1379355590656L, 10277);
    if (!h.xw().wL())
    {
      GMTrace.o(1379355590656L, 10277);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStatMsgExtension", "reportNetFlow wifi[%d, %d] mobile[%d, %d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (paramInt1 > 0)
    {
      if (paramInt2 <= 0) {
        break label114;
      }
      label77:
      m.t(paramInt1, paramInt2, 0);
      if (paramInt3 <= 0) {
        break label119;
      }
      label87:
      if (paramInt4 <= 0) {
        break label124;
      }
    }
    for (;;)
    {
      m.u(paramInt3, paramInt4, 0);
      GMTrace.o(1379355590656L, 10277);
      return;
      paramInt1 = 0;
      break;
      label114:
      paramInt2 = 0;
      break label77;
      label119:
      paramInt3 = 0;
      break label87;
      label124:
      paramInt4 = 0;
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(1379624026112L, 10279);
    GMTrace.o(1379624026112L, 10279);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */