package com.tencent.mm.plugin.i.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.File;

public final class b
  implements Runnable
{
  private int count;
  public boolean isStop;
  
  public b()
  {
    GMTrace.i(20654766161920L, 153890);
    this.isStop = false;
    this.count = 0;
    GMTrace.o(20654766161920L, 153890);
  }
  
  private long a(String paramString, PLong paramPLong)
  {
    GMTrace.i(20655034597376L, 153892);
    if (this.count >= 10)
    {
      if (this.isStop)
      {
        GMTrace.o(20655034597376L, 153892);
        return -1L;
      }
      this.count = 0;
    }
    Object localObject = new File(paramString);
    if (((File)localObject).isDirectory())
    {
      String[] arrayOfString = ((File)localObject).list();
      if (arrayOfString != null)
      {
        l1 = 0L;
        int j = arrayOfString.length;
        int i = 0;
        while (i < j)
        {
          localObject = arrayOfString[i];
          StringBuilder localStringBuilder = new StringBuilder().append(paramString);
          if (paramString.endsWith("/")) {}
          long l2;
          for (;;)
          {
            l2 = a((String)localObject, paramPLong);
            if (l2 != -1L) {
              break;
            }
            GMTrace.o(20655034597376L, 153892);
            return -1L;
            localObject = "/" + (String)localObject;
          }
          l1 += l2;
          i += 1;
        }
        GMTrace.o(20655034597376L, 153892);
        return l1;
      }
    }
    long l1 = ((File)localObject).length();
    if (l1 > 0L) {
      paramPLong.value += 1L;
    }
    GMTrace.o(20655034597376L, 153892);
    return l1;
  }
  
  public final void run()
  {
    GMTrace.i(20654900379648L, 153891);
    if (this.isStop)
    {
      GMTrace.o(20654900379648L, 153891);
      return;
    }
    Object localObject1 = com.tencent.mm.plugin.n.b.yU();
    this.count = 0;
    PLong localPLong1 = new PLong();
    long l1 = a((String)localObject1, localPLong1);
    if (this.isStop)
    {
      GMTrace.o(20654900379648L, 153891);
      return;
    }
    Object localObject2 = com.tencent.mm.plugin.n.b.yV();
    this.count = 0;
    localObject1 = new PLong();
    long l2 = a((String)localObject2, (PLong)localObject1);
    if (this.isStop)
    {
      GMTrace.o(20654900379648L, 153891);
      return;
    }
    at.AR();
    String str = c.getAccVideoPath();
    this.count = 0;
    localObject2 = new PLong();
    long l3 = a(str, (PLong)localObject2);
    if (this.isStop)
    {
      GMTrace.o(20654900379648L, 153891);
      return;
    }
    at.AR();
    str = c.yY();
    this.count = 0;
    PLong localPLong2 = new PLong();
    long l4 = a(str, localPLong2);
    if (this.isStop)
    {
      GMTrace.o(20654900379648L, 153891);
      return;
    }
    long l5 = com.tencent.mm.plugin.i.b.aiA().aiB().lz(43) + com.tencent.mm.plugin.i.b.aiA().aiB().lz(62) + com.tencent.mm.plugin.i.b.aiA().aiB().lz(44);
    long l6 = com.tencent.mm.plugin.i.b.aiA().aiB().lA(43) + com.tencent.mm.plugin.i.b.aiA().aiB().lA(62) + com.tencent.mm.plugin.i.b.aiA().aiB().lA(44);
    if (this.isStop)
    {
      GMTrace.o(20654900379648L, 153891);
      return;
    }
    long l7 = com.tencent.mm.plugin.i.b.aiA().aiB().lz(3);
    long l8 = com.tencent.mm.plugin.i.b.aiA().aiB().lA(3);
    if (this.isStop)
    {
      GMTrace.o(20654900379648L, 153891);
      return;
    }
    long l9 = com.tencent.mm.plugin.i.b.aiA().aiB().lz(34);
    long l10 = com.tencent.mm.plugin.i.b.aiA().aiB().lA(34);
    long l11 = com.tencent.mm.plugin.i.b.aiA().aiB().lz(49);
    long l12 = com.tencent.mm.plugin.i.b.aiA().aiB().lA(49);
    g.ork.i(14556, new Object[] { Integer.valueOf(43), Long.valueOf(l5), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(l6) });
    g.ork.i(14556, new Object[] { Integer.valueOf(3), Long.valueOf(l7), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(l8) });
    g.ork.i(14556, new Object[] { Integer.valueOf(34), Long.valueOf(l9), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(l10) });
    g.ork.i(14556, new Object[] { Integer.valueOf(49), Long.valueOf(l11), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(l12) });
    g.ork.i(14556, new Object[] { Integer.valueOf("image".hashCode()), Long.valueOf(l1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(localPLong1.value) });
    g.ork.i(14556, new Object[] { Integer.valueOf("image2".hashCode()), Long.valueOf(l2), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(((PLong)localObject1).value) });
    g.ork.i(14556, new Object[] { Integer.valueOf("video".hashCode()), Long.valueOf(l3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(((PLong)localObject2).value) });
    g.ork.i(14556, new Object[] { Integer.valueOf("voice".hashCode()), Long.valueOf(l4), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Long.valueOf(localPLong2.value) });
    long l13 = ((Long)h.xy().xh().get(w.a.vyX, Long.valueOf(0L))).longValue();
    long l14 = ((Long)h.xy().xh().get(w.a.vyY, Long.valueOf(0L))).longValue();
    g.ork.i(14556, new Object[] { Integer.valueOf("cost".hashCode()), Integer.valueOf(0), Long.valueOf(l13), Long.valueOf(l14), Long.valueOf(l14 - l13) });
    w.i("MicroMsg.ReportTask", "report wx[%d %d %d %d] folder[%d %d %d %d] count_wx[%d %d %d %d] count_folder[%d %d %d %d]", new Object[] { Long.valueOf(l5), Long.valueOf(l7), Long.valueOf(l9), Long.valueOf(l11), Long.valueOf(l3), Long.valueOf(l2), Long.valueOf(l4), Long.valueOf(l1), Long.valueOf(l6), Long.valueOf(l8), Long.valueOf(l10), Long.valueOf(l12), Long.valueOf(((PLong)localObject2).value), Long.valueOf(((PLong)localObject1).value), Long.valueOf(localPLong2.value), Long.valueOf(localPLong1.value) });
    GMTrace.o(20654900379648L, 153891);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */