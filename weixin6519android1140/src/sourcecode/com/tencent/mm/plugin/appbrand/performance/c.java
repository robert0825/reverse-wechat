package com.tencent.mm.plugin.appbrand.performance;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.RandomAccessFile;

public final class c
{
  private final int ixg;
  private volatile RandomAccessFile ixh;
  private volatile RandomAccessFile ixi;
  private long ixj;
  private long ixk;
  private long ixl;
  
  public c(int paramInt)
  {
    GMTrace.i(15449802670080L, 115110);
    this.ixg = paramInt;
    GMTrace.o(15449802670080L, 115110);
  }
  
  public final double ZP()
  {
    GMTrace.i(15449936887808L, 115111);
    for (;;)
    {
      try
      {
        if (this.ixi == null) {
          this.ixi = new RandomAccessFile("/proc/" + this.ixg + "/stat", "r");
        }
        this.ixi.seek(0L);
        Object localObject1 = this.ixi.readLine();
        boolean bool = bg.nm((String)localObject1);
        if (bool)
        {
          GMTrace.o(15449936887808L, 115111);
          return 0.0D;
        }
        localObject1 = ((String)localObject1).split(" ");
        int i = localObject1.length;
        if (i < 17)
        {
          GMTrace.o(15449936887808L, 115111);
          return 0.0D;
        }
        if (this.ixh == null) {
          this.ixh = new RandomAccessFile("/proc/stat", "r");
        }
        this.ixh.seek(0L);
        localObject2 = this.ixh.readLine();
        if (bg.nm((String)localObject2))
        {
          l1 = 0L;
          l2 = Long.parseLong(localObject1[13]);
          l3 = Long.parseLong(localObject1[14]);
          if (this.ixj == 0L) {
            continue;
          }
          double d2 = (l2 - this.ixk) * 100L / (l1 - this.ixj);
          d1 = (l3 - this.ixl) * 100L / (l1 - this.ixj);
          d2 = Math.max(0.0D, d2);
          d1 = Math.max(0.0D, d1);
          d1 = d2 + d1;
        }
      }
      catch (Exception localException1)
      {
        Object localObject2;
        long l1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        double d1 = 0.0D;
        w.e(" MicroMsg.CpuSampler", "read pid stat file error: " + localException1);
        continue;
        d1 = 0.0D;
        continue;
      }
      try
      {
        this.ixj = l1;
        this.ixk = l2;
        this.ixl = l3;
        GMTrace.o(15449936887808L, 115111);
        return d1;
      }
      catch (Exception localException2)
      {
        continue;
      }
      localObject2 = ((String)localObject2).split(" ");
      if (localObject2.length < 9)
      {
        l1 = 0L;
      }
      else
      {
        l1 = Long.parseLong(localObject2[2]);
        l2 = Long.parseLong(localObject2[3]);
        l3 = Long.parseLong(localObject2[4]);
        l4 = Long.parseLong(localObject2[5]);
        l5 = Long.parseLong(localObject2[6]);
        l6 = Long.parseLong(localObject2[7]);
        l7 = Long.parseLong(localObject2[8]);
        l8 = Long.parseLong(localObject2[9]);
        l1 = l8 + (l1 + l2 + l3 + l4 + l5 + l6 + l7);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\performance\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */