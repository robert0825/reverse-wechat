package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

final class ah
{
  protected final long vAG;
  private ag vAH;
  
  public ah()
  {
    GMTrace.i(13199105589248L, 98341);
    this.vAG = 86400L;
    this.vAH = new ag();
    Object localObject = new StringBuilder();
    h.xz();
    localObject = com.tencent.mm.a.e.d(h.xy().cachePath + "checkmsgid.ini", 0, -1);
    if (!bg.bq((byte[])localObject)) {
      try
      {
        this.vAH.aD((byte[])localObject);
        if (bTk()) {
          bTj();
        }
        GMTrace.o(13199105589248L, 98341);
        return;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.DelSvrIdMgr", "DelSvrIDs parse Error");
        w.e("MicroMsg.DelSvrIdMgr", "exception:%s", new Object[] { bg.f(localException) });
      }
    }
    GMTrace.o(13199105589248L, 98341);
  }
  
  private void bTj()
  {
    GMTrace.i(13199239806976L, 98342);
    w.i("MicroMsg.DelSvrIdMgr", "summerdel toFile tid[%d] [%d, %d ,%d] stack[%s]", new Object[] { Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(this.vAH.vAD.size()), Integer.valueOf(this.vAH.vAE.size()), Integer.valueOf(this.vAH.vAF.size()), bg.bQW() });
    try
    {
      this.vAH.vAC.clear();
      this.vAH.vAB.clear();
      this.vAH.vAA.clear();
      ag localag = new ag();
      localag.vAD.addAll(this.vAH.vAD);
      localag.vAE.addAll(this.vAH.vAE);
      localag.vAF.addAll(this.vAH.vAF);
      byte[] arrayOfByte = localag.toByteArray();
      StringBuilder localStringBuilder = new StringBuilder();
      h.xz();
      com.tencent.mm.a.e.b(h.xy().cachePath + "checkmsgid.ini", arrayOfByte, arrayOfByte.length);
      int j = localag.vAD.size();
      int k = localag.vAE.size();
      int m = localag.vAF.size();
      if (arrayOfByte == null) {}
      for (int i = -1;; i = arrayOfByte.length)
      {
        w.i("MicroMsg.DelSvrIdMgr", "summerdel toFile done [%d, %d, %d] data len[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i) });
        GMTrace.o(13199239806976L, 98342);
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      d.oqe.a(111L, 168L, 1L, false);
      w.printErrStackTrace("MicroMsg.DelSvrIdMgr", localException, "summerdel ", new Object[0]);
      GMTrace.o(13199239806976L, 98342);
    }
  }
  
  private boolean bTk()
  {
    GMTrace.i(13199910895616L, 98347);
    w.v("MicroMsg.DelSvrIdMgr", "checkOldData todayIndex:%d, t0Size:%d, t1Size:%d, t2Size:%d", new Object[] { Integer.valueOf(this.vAH.vAz), Integer.valueOf(this.vAH.vAD.size()), Integer.valueOf(this.vAH.vAE.size()), Integer.valueOf(this.vAH.vAF.size()) });
    int i = (int)(bg.Pu() / 86400L);
    int j = this.vAH.vAz;
    this.vAH.vAz = i;
    switch (i - j)
    {
    default: 
      this.vAH.vAF.clear();
      this.vAH.vAE.clear();
      this.vAH.vAD.clear();
      GMTrace.o(13199910895616L, 98347);
      return true;
    case 0: 
      GMTrace.o(13199910895616L, 98347);
      return false;
    case 1: 
      this.vAH.vAF = this.vAH.vAE;
      this.vAH.vAE = this.vAH.vAD;
      this.vAH.vAD.clear();
      GMTrace.o(13199910895616L, 98347);
      return true;
    }
    this.vAH.vAF = this.vAH.vAD;
    this.vAH.vAE.clear();
    this.vAH.vAD.clear();
    GMTrace.o(13199910895616L, 98347);
    return true;
  }
  
  protected final void a(int paramInt, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    GMTrace.i(13199642460160L, 98345);
    if (paramLong1 == 0L)
    {
      GMTrace.o(13199642460160L, 98345);
      return;
    }
    if (paramBoolean) {
      bTk();
    }
    paramInt -= (int)(paramLong2 / 86400L);
    switch (paramInt)
    {
    default: 
      w.e("MicroMsg.DelSvrIdMgr", "should not add to thease lists, dayIndex:%d", new Object[] { Integer.valueOf(paramInt) });
    }
    for (;;)
    {
      if (paramBoolean) {
        bTj();
      }
      GMTrace.o(13199642460160L, 98345);
      return;
      this.vAH.vAD.add(Long.valueOf(paramLong1));
      continue;
      this.vAH.vAE.add(Long.valueOf(paramLong1));
      continue;
      this.vAH.vAF.add(Long.valueOf(paramLong1));
    }
  }
  
  protected final void e(int paramInt, long paramLong1, long paramLong2)
  {
    GMTrace.i(13199508242432L, 98344);
    a(paramInt, paramLong1, paramLong2, true);
    GMTrace.o(13199508242432L, 98344);
  }
  
  protected final boolean eR(long paramLong)
  {
    GMTrace.i(13199374024704L, 98343);
    if (bTk()) {
      bTj();
    }
    if ((this.vAH.vAD.contains(Long.valueOf(paramLong))) || (this.vAH.vAE.contains(Long.valueOf(paramLong))) || (this.vAH.vAF.contains(Long.valueOf(paramLong))))
    {
      GMTrace.o(13199374024704L, 98343);
      return true;
    }
    GMTrace.o(13199374024704L, 98343);
    return false;
  }
  
  protected final void i(List<Integer> paramList, List<Long> paramList1)
  {
    GMTrace.i(13199776677888L, 98346);
    w.i("MicroMsg.DelSvrIdMgr", "add size:%d", new Object[] { Integer.valueOf(paramList.size()) });
    bTk();
    int j = (int)(bg.Pu() / 86400L);
    int i = 0;
    while (i < paramList.size())
    {
      a(j, ((Integer)paramList.get(i)).intValue(), ((Long)paramList1.get(i)).longValue(), false);
      i += 1;
    }
    bTj();
    GMTrace.o(13199776677888L, 98346);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */