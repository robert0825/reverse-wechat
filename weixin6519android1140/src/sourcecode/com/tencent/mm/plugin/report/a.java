package com.tencent.mm.plugin.report;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private int mID;
  private long mInterval;
  private long oqb;
  private HashMap<Integer, Long> oqc;
  
  public a()
  {
    GMTrace.i(20314926874624L, 151358);
    this.oqc = new HashMap();
    this.mID = 463;
    this.mInterval = 300000L;
    GMTrace.o(20314926874624L, 151358);
  }
  
  private void C(int paramInt, long paramLong)
  {
    GMTrace.i(20315195310080L, 151360);
    Long localLong = (Long)this.oqc.get(Integer.valueOf(paramInt));
    long l = paramLong;
    if (localLong != null) {
      l = paramLong + localLong.longValue();
    }
    this.oqc.put(Integer.valueOf(paramInt), Long.valueOf(l));
    GMTrace.o(20315195310080L, 151360);
  }
  
  public final void e(int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(20315061092352L, 151359);
    try
    {
      C(paramInt1, paramLong);
      C(paramInt2, 1L);
      paramLong = System.currentTimeMillis();
      if (paramLong - this.oqb > this.mInterval)
      {
        Iterator localIterator = this.oqc.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          d.oqe.a(this.mID, ((Integer)localEntry.getKey()).intValue(), ((Long)localEntry.getValue()).longValue(), false);
        }
        this.oqb = paramLong;
      }
    }
    finally {}
    GMTrace.o(20315061092352L, 151359);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */