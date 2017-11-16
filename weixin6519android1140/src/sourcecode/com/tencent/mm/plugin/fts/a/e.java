package com.tencent.mm.plugin.fts.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.ArrayList;

public final class e
{
  public static final int[] lwB;
  
  static
  {
    GMTrace.i(18637742145536L, 138862);
    lwB = new int[] { 8, 9, 10, 11, 12, 14, 19, 20, 21, 22, 24, 25 };
    GMTrace.o(18637742145536L, 138862);
  }
  
  public static final void a(String paramString1, int paramInt, long paramLong, String paramString2)
  {
    GMTrace.i(18637205274624L, 138858);
    if (!d.b(paramInt, lwB))
    {
      GMTrace.o(18637205274624L, 138858);
      return;
    }
    if (com.tencent.mm.protocal.d.tJD)
    {
      h.xw();
      if (a.ww() % 50L != 1L)
      {
        GMTrace.o(18637205274624L, 138858);
        return;
      }
    }
    if ((paramInt > 0) && (!bg.nm(paramString1)))
    {
      h.xz();
      long l = ((Long)h.xy().xh().get(w.a.vwF, Long.valueOf(0L))).longValue();
      w.v("MicroMsg.FTS.FTSReportLogic", "reportKVSearchTime: %d %s %d %d %s %d", new Object[] { Integer.valueOf(14175), paramString1, Integer.valueOf(paramInt), Long.valueOf(paramLong), bg.aq(paramString2, ""), Long.valueOf(l) });
      com.tencent.mm.plugin.report.d.oqe.i(14175, new Object[] { bg.aq(paramString1, ""), Integer.valueOf(paramInt), Long.valueOf(paramLong), bg.aq(paramString2, ""), Long.valueOf(l) });
    }
    GMTrace.o(18637205274624L, 138858);
  }
  
  public static void nX(int paramInt)
  {
    GMTrace.i(18637607927808L, 138861);
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(146);
    localIDKey.SetKey(0);
    localIDKey.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey);
    if (paramInt != 1)
    {
      localIDKey = new IDKey();
      localIDKey.SetID(146);
      localIDKey.SetKey(2);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(146);
      localIDKey.SetKey(paramInt);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.d.oqe.b(localArrayList, false);
      GMTrace.o(18637607927808L, 138861);
      return;
      localIDKey = new IDKey();
      localIDKey.SetID(146);
      localIDKey.SetKey(1);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
  }
  
  public static final void nY(int paramInt)
  {
    GMTrace.i(20049041555456L, 149377);
    w.i("MicroMsg.FTS.FTSReportLogic", "reportCommonChatroom: %d %d", new Object[] { Integer.valueOf(14731), Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.report.d.oqe.i(14731, new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(20049041555456L, 149377);
  }
  
  public static void t(int paramInt, long paramLong)
  {
    GMTrace.i(18637339492352L, 138859);
    if (paramInt > 0)
    {
      int i = (paramInt - 1) * 2 + 1;
      w.v("MicroMsg.FTS.FTSReportLogic", "reportIDKeySearchTime: reportKey=%d taskId=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(601);
      localIDKey.SetKey(i);
      localIDKey.SetValue((int)paramLong);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(601);
      localIDKey.SetKey(i + 1);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      com.tencent.mm.plugin.report.d.oqe.b(localArrayList, false);
    }
    GMTrace.o(18637339492352L, 138859);
  }
  
  public static void u(int paramInt, long paramLong)
  {
    GMTrace.i(18637473710080L, 138860);
    ArrayList localArrayList;
    IDKey localIDKey;
    if (paramInt > 0)
    {
      paramInt = (paramInt - 1) * 4 + 1;
      localArrayList = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(602);
      localIDKey.SetKey(paramInt);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      if (paramLong > 100L) {
        break label127;
      }
      localIDKey = new IDKey();
      localIDKey.SetID(602);
      localIDKey.SetKey(paramInt + 1);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.d.oqe.b(localArrayList, false);
      GMTrace.o(18637473710080L, 138860);
      return;
      label127:
      if (paramLong <= 500L)
      {
        localIDKey = new IDKey();
        localIDKey.SetID(602);
        localIDKey.SetKey(paramInt + 2);
        localIDKey.SetValue(1L);
        localArrayList.add(localIDKey);
      }
      else
      {
        localIDKey = new IDKey();
        localIDKey.SetID(602);
        localIDKey.SetKey(paramInt + 3);
        localIDKey.SetValue(1L);
        localArrayList.add(localIDKey);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */