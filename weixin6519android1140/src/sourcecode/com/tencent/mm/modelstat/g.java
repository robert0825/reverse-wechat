package com.tencent.mm.modelstat;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
{
  long beginTime;
  boolean eYr;
  long endTime;
  long gYm;
  long gYn;
  long gYo;
  int rtType;
  
  public g()
  {
    GMTrace.i(1392911581184L, 10378);
    GMTrace.o(1392911581184L, 10378);
  }
  
  public g(int paramInt, boolean paramBoolean, long paramLong)
  {
    GMTrace.i(1393045798912L, 10379);
    this.rtType = paramInt;
    this.eYr = paramBoolean;
    this.gYm = paramLong;
    this.gYn = 0L;
    GMTrace.o(1393045798912L, 10379);
  }
  
  public final void Mn()
  {
    GMTrace.i(1393180016640L, 10380);
    if (this.gYn == 0L)
    {
      this.beginTime = bg.Pv();
      this.gYo = bg.Pw();
    }
    this.gYn += 1L;
    GMTrace.o(1393180016640L, 10380);
  }
  
  public final void ay(long paramLong)
  {
    GMTrace.i(1393314234368L, 10381);
    if (this.gYm == 0L) {
      this.gYm = paramLong;
    }
    this.gYo = (bg.Pw() - this.gYo);
    this.endTime = bg.Pv();
    w.d("MicroMsg.MultiSceneStat", "FIN: TIME:" + (this.endTime - this.beginTime) + " datalen:" + this.gYm + " Count:" + this.gYn + " type:" + this.rtType);
    WatchDogPushReceiver.a(this);
    GMTrace.o(1393314234368L, 10381);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */