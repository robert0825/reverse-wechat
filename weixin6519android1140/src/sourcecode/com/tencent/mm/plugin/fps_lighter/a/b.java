package com.tencent.mm.plugin.fps_lighter.a;

import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.fps_lighter.e.a;
import com.tencent.mm.plugin.fps_lighter.e.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class b
  implements c
{
  public com.tencent.mm.plugin.fps_lighter.b.c lmg;
  private long lmk;
  public long[] lml;
  public int lmm;
  public int lmn;
  SparseArray<ArrayList<a>> lmo;
  
  public b(com.tencent.mm.plugin.fps_lighter.b.c paramc)
  {
    GMTrace.i(5234088738816L, 38997);
    this.lmk = System.currentTimeMillis();
    this.lml = new long['ᰠ'];
    this.lmm = 0;
    this.lmn = 0;
    this.lmo = new SparseArray();
    this.lmg = paramc;
    GMTrace.o(5234088738816L, 38997);
  }
  
  public final void a(int paramInt1, long paramLong1, long paramLong2, int paramInt2, int paramInt3, boolean paramBoolean1, long paramLong3, boolean paramBoolean2)
  {
    GMTrace.i(5234222956544L, 38998);
    if (System.currentTimeMillis() - this.lmk > com.tencent.mm.plugin.fps_lighter.b.c.aAh()) {}
    for (paramInt2 = 1; paramInt2 != 0; paramInt2 = 0)
    {
      com.tencent.mm.plugin.fps_lighter.b.g.aAl();
      com.tencent.mm.plugin.fps_lighter.b.g.OW().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(5235162480640L, 39005);
          b localb;
          Object localObject1;
          int m;
          int[] arrayOfInt1;
          int[] arrayOfInt2;
          int i;
          int k;
          int n;
          label147:
          long l1;
          Object localObject2;
          Object localObject3;
          if (b.this.lmm != b.this.lmn)
          {
            localb = b.this;
            localObject1 = b.this.lml;
            m = b.this.lmm;
            if (localObject1 == null)
            {
              w.w("MicroMsg.FrameReportCallback", "null == datas");
              GMTrace.o(5235162480640L, 39005);
              return;
            }
            arrayOfInt1 = new int[5];
            arrayOfInt2 = new int[5];
            if (localb.lmn >= m)
            {
              j = localObject1.length;
              i = 1;
              w.d("MicroMsg.FrameReportCallback", "isSpecial:%s mLastIndex:%s mNowIndex:%s", new Object[] { Boolean.valueOf(true), Integer.valueOf(localb.lmn), Integer.valueOf(m) });
              k = localb.lmn;
              n = i;
              i = j;
              j = n;
              if ((k >= i) || (localObject1[k] == 0L)) {
                break label311;
              }
              l1 = localObject1[k];
              long l2 = l1 >> 58;
              localObject2 = new b.a(localb, (int)l2, Long.valueOf(l1 & 0x3FFFFFFFFFFFFFF));
              localObject3 = (ArrayList)localb.lmo.get((int)l2);
              if (localObject3 != null) {
                break label300;
              }
              localObject3 = new ArrayList(7800);
              ((ArrayList)localObject3).add(localObject2);
              localb.lmo.append((int)l2, localObject3);
              label251:
              if ((k != i - 1) || (j == 0)) {
                break label845;
              }
              k = -1;
              i = 0;
            }
          }
          for (int j = m;; j = n)
          {
            localb.lmn = (k + 1);
            n = j;
            k += 1;
            j = i;
            i = n;
            break label147;
            i = 0;
            j = m;
            break;
            label300:
            ((ArrayList)localObject3).add(localObject2);
            break label251;
            label311:
            localObject1 = null;
            k = 0;
            if (k < localb.lmo.size())
            {
              l1 = 0L;
              i = 0;
              while (i < 5)
              {
                arrayOfInt1[i] = 0;
                arrayOfInt2[i] = 0;
                i += 1;
              }
              m = localb.lmo.keyAt(k);
              localObject2 = (ArrayList)localb.lmo.get(m);
              w.i("MicroMsg.FrameReportCallback", "scene:%s size:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(((ArrayList)localObject2).size()) });
              i = 0;
              j = -1;
              label415:
              if (i < ((ArrayList)localObject2).size())
              {
                localObject3 = (b.a)((ArrayList)localObject2).get(i);
                if (((b.a)localObject3).lmr <= 0L) {
                  w.e("MicroMsg.FrameReportCallback", "[reportSample] %s", new Object[] { localObject3 });
                }
                l1 = ((b.a)localObject3).lmr + l1;
                if (((b.a)localObject3).lmq == a.a.lnJ)
                {
                  arrayOfInt1[0] += 1;
                  n = arrayOfInt2[0];
                  arrayOfInt2[0] = (((b.a)localObject3).lms + n);
                  label510:
                  if (l1 < com.tencent.mm.plugin.fps_lighter.b.c.aAi()) {
                    break label842;
                  }
                  localb.a(m, arrayOfInt1, arrayOfInt2, l1);
                  arrayOfInt1 = new int[5];
                  arrayOfInt2 = new int[5];
                  l1 = 0L;
                  j = i;
                }
              }
            }
            label740:
            label842:
            for (;;)
            {
              i += 1;
              break label415;
              if (((b.a)localObject3).lmq == a.a.lnK)
              {
                arrayOfInt1[1] += 1;
                n = arrayOfInt2[1];
                arrayOfInt2[1] = (((b.a)localObject3).lms + n);
                break label510;
              }
              if (((b.a)localObject3).lmq == a.a.lnI)
              {
                arrayOfInt1[2] += 1;
                n = arrayOfInt2[2];
                arrayOfInt2[2] = (((b.a)localObject3).lms + n);
                break label510;
              }
              if (((b.a)localObject3).lmq == a.a.lnH)
              {
                arrayOfInt1[3] += 1;
                n = arrayOfInt2[3];
                arrayOfInt2[3] = (((b.a)localObject3).lms + n);
                break label510;
              }
              if (((b.a)localObject3).lmq != a.a.lnL) {
                break label510;
              }
              arrayOfInt1[4] += 1;
              arrayOfInt2[4] += 0;
              break label510;
              if (-1 != j) {
                if (localObject1 == null)
                {
                  localObject1 = new ArrayList(((ArrayList)localObject2).size() - j);
                  i = j + 1;
                  while (i < ((ArrayList)localObject2).size())
                  {
                    ((List)localObject1).add(((ArrayList)localObject2).get(i));
                    i += 1;
                  }
                  ((ArrayList)localObject2).clear();
                  i = 0;
                  while (i < ((List)localObject1).size())
                  {
                    ((ArrayList)localObject2).add(((List)localObject1).get(i));
                    i += 1;
                  }
                  ((List)localObject1).clear();
                }
              }
              for (;;)
              {
                k += 1;
                break;
                GMTrace.o(5235162480640L, 39005);
                return;
                break label740;
              }
            }
            label845:
            n = i;
            i = j;
          }
        }
      });
      this.lmk = System.currentTimeMillis();
      GMTrace.o(5234222956544L, 38998);
      return;
    }
    if (paramInt1 != -1)
    {
      paramLong3 = paramInt1;
      paramLong1 = TimeUnit.NANOSECONDS.convert(paramLong2 - paramLong1, TimeUnit.MILLISECONDS);
      this.lml[this.lmm] = ((0L | paramLong3) << 58 | paramLong1);
      this.lmm += 1;
      if (this.lmm == this.lml.length) {
        this.lmm = 0;
      }
    }
    GMTrace.o(5234222956544L, 38998);
  }
  
  final void a(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, long paramLong)
  {
    GMTrace.i(5234491392000L, 39000);
    if (this.lmg == null)
    {
      w.d("MicroMsg.FrameReportCallback", "it maybe was stopped!");
      GMTrace.o(5234491392000L, 39000);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int j = 0;
    if (i < 5)
    {
      double d;
      label62:
      IDKey localIDKey1;
      IDKey localIDKey2;
      IDKey localIDKey3;
      if (paramArrayOfInt1[i] == 0)
      {
        d = 0.0D;
        w.i("MicroMsg.FrameReportCallback", "scene:%s  DeviceLevel:%s frame state[index:%s],count:%s avery dropcount:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lmg.lmI), Integer.valueOf(i), Integer.valueOf(paramArrayOfInt1[i]), Double.valueOf(d) });
        j += paramArrayOfInt1[i];
        if (j > 1800) {
          w.e("MicroMsg.FrameReportCallback", "frame rate is not normal! %s", new Object[] { Integer.valueOf(j) });
        }
        w.i("MicroMsg.FrameReportCallback", "scene:%s index:%s metrics[index]:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(paramArrayOfInt1[i]) });
        localIDKey1 = new IDKey();
        localIDKey2 = new IDKey();
        localIDKey3 = new IDKey();
        switch (paramInt)
        {
        }
      }
      for (;;)
      {
        localIDKey1.SetKey(i * 4 + 24 + this.lmg.lmI);
        localIDKey1.SetValue((int)Math.round(d));
        localIDKey2.SetKey(this.lmg.lmI * 5 + i);
        localIDKey2.SetValue(paramArrayOfInt1[i]);
        localIDKey3.SetKey(i * 4 + 200 + this.lmg.lmI);
        if (d > 0.0D) {
          localIDKey3.SetValue(1L);
        }
        if (localIDKey1.GetValue() > 0L) {
          localArrayList.add(localIDKey1);
        }
        if (localIDKey2.GetValue() > 0L) {
          localArrayList.add(localIDKey2);
        }
        if (localIDKey3.GetValue() > 0L) {
          localArrayList.add(localIDKey3);
        }
        i += 1;
        break;
        d = paramArrayOfInt2[i] * 1.0F / (float)paramLong * (float)com.tencent.mm.plugin.fps_lighter.b.c.aAi() / paramArrayOfInt1[i];
        break label62;
        localIDKey1.SetID(349);
        localIDKey2.SetID(349);
        localIDKey3.SetID(349);
        continue;
        localIDKey1.SetID(350);
        localIDKey2.SetID(350);
        localIDKey3.SetID(350);
        continue;
        localIDKey1.SetID(351);
        localIDKey2.SetID(351);
        localIDKey3.SetID(351);
        continue;
        localIDKey1.SetID(352);
        localIDKey2.SetID(352);
        localIDKey3.SetID(352);
        continue;
        localIDKey1.SetID(353);
        localIDKey2.SetID(353);
        localIDKey3.SetID(353);
        continue;
        localIDKey1.SetID(364);
        localIDKey2.SetID(364);
        localIDKey3.SetID(364);
      }
    }
    paramArrayOfInt1 = new IDKey();
    paramArrayOfInt2 = new IDKey();
    switch (paramInt)
    {
    }
    for (;;)
    {
      paramArrayOfInt1.SetKey(this.lmg.lmI + 20);
      paramInt = Math.round(j * 1.0F / (float)TimeUnit.SECONDS.convert(paramLong, TimeUnit.NANOSECONDS));
      w.i("MicroMsg.FrameReportCallback", "level:%s %s", new Object[] { Integer.valueOf(this.lmg.lmI), Integer.valueOf(paramInt) });
      paramArrayOfInt1.SetValue(paramInt);
      paramArrayOfInt2.SetKey(this.lmg.lmI + 100);
      paramArrayOfInt2.SetValue(1L);
      if (paramArrayOfInt1.GetValue() > 0L) {
        localArrayList.add(paramArrayOfInt1);
      }
      if (paramArrayOfInt2.GetValue() > 0L) {
        localArrayList.add(paramArrayOfInt2);
      }
      com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
      GMTrace.o(5234491392000L, 39000);
      return;
      paramArrayOfInt1.SetID(349);
      paramArrayOfInt2.SetID(349);
      continue;
      paramArrayOfInt1.SetID(350);
      paramArrayOfInt2.SetID(350);
      continue;
      paramArrayOfInt1.SetID(351);
      paramArrayOfInt2.SetID(351);
      continue;
      paramArrayOfInt1.SetID(352);
      paramArrayOfInt2.SetID(352);
      continue;
      paramArrayOfInt1.SetID(353);
      paramArrayOfInt2.SetID(353);
      continue;
      paramArrayOfInt1.SetID(364);
      paramArrayOfInt2.SetID(364);
    }
  }
  
  public final String toString()
  {
    GMTrace.i(5234625609728L, 39001);
    GMTrace.o(5234625609728L, 39001);
    return "MicroMsg.FrameReportCallback";
  }
  
  public final void z(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(5234357174272L, 38999);
    GMTrace.o(5234357174272L, 38999);
  }
  
  final class a
  {
    a.a lmq;
    long lmr;
    int lms;
    int scene;
    
    a(int paramInt, Long paramLong)
    {
      GMTrace.i(5235833569280L, 39010);
      this.scene = paramInt;
      this.lmr = paramLong.longValue();
      this.lms = a.b(paramLong.longValue(), b.this.lmg.lmC);
      this.lmq = a.nL(this.lms);
      GMTrace.o(5235833569280L, 39010);
    }
    
    public final String toString()
    {
      GMTrace.i(5235967787008L, 39011);
      String str = "scene:" + this.scene + ",durtime:" + this.lmr + ",answer:" + this.lmq.toString();
      GMTrace.o(5235967787008L, 39011);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */