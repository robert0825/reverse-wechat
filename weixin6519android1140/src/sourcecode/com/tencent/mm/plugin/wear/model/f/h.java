package com.tencent.mm.plugin.wear.model.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bse;
import com.tencent.mm.protocal.c.bsf;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
  extends b
{
  private long eDr;
  private long eYB;
  private String eYC;
  private List<String> eYD;
  
  public h(long paramLong1, long paramLong2, String paramString, List<String> paramList)
  {
    GMTrace.i(9190424707072L, 68474);
    this.eDr = paramLong1;
    this.eYB = paramLong2;
    this.eYC = paramString;
    this.eYD = paramList;
    GMTrace.o(9190424707072L, 68474);
  }
  
  public final String getName()
  {
    GMTrace.i(9190693142528L, 68476);
    GMTrace.o(9190693142528L, 68476);
    return "WearLuckyReceiveTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9190558924800L, 68475);
    bse localbse = new bse();
    localbse.vbx = this.eYB;
    localbse.vbw = this.eDr;
    localbse.vby = this.eYC;
    try
    {
      if (this.eYD != null)
      {
        Iterator localIterator = this.eYD.iterator();
        while (localIterator.hasNext())
        {
          String[] arrayOfString = ((String)localIterator.next()).split("=");
          bsf localbsf = new bsf();
          localbsf.vbv = arrayOfString[0];
          localbsf.jio = arrayOfString[1];
          if (localbsf.jio.startsWith("wxid")) {
            localbsf.jio = com.tencent.mm.y.r.fs(localbsf.jio);
          }
          localbsf.vbx = Long.valueOf(arrayOfString[2]).longValue();
          localbse.vbz.add(localbsf);
        }
      }
      return;
    }
    catch (Exception localException)
    {
      while (this.eYB > 0L)
      {
        com.tencent.mm.plugin.wear.model.c.a.jn(true);
        GMTrace.o(9190558924800L, 68475);
        return;
        com.tencent.mm.plugin.wear.model.a.bBm();
        com.tencent.mm.plugin.wear.model.e.r.a(20015, localException.toByteArray(), true);
      }
      com.tencent.mm.plugin.wear.model.c.a.jn(false);
      GMTrace.o(9190558924800L, 68475);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\f\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */