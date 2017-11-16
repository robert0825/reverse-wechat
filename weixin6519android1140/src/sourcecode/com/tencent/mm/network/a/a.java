package com.tencent.mm.network.a;

import com.tencent.gmtrace.GMTrace;

public abstract interface a
{
  public static final class a
  {
    public long beginTime;
    public String clientIp;
    public long endTime;
    public int errCode;
    public int errType;
    public long expand1;
    public long expand2;
    public long gYo;
    public c hie;
    public boolean hif;
    public long hig;
    public long hih;
    public long hii;
    public int hij;
    public int hik;
    public long hil;
    public long him;
    public long hin;
    public long netSignal;
    public int netType;
    public int retryCount;
    public long rtType;
    
    public a()
    {
      GMTrace.i(13661083009024L, 101783);
      this.rtType = 0L;
      this.beginTime = 0L;
      this.endTime = 0L;
      this.gYo = 0L;
      this.hif = false;
      this.netType = 0;
      this.errType = 0;
      this.errCode = 0;
      this.hig = 0L;
      this.hih = 0L;
      this.hii = 0L;
      this.hij = 0;
      this.retryCount = 0;
      this.hik = 0;
      this.hil = 0L;
      this.him = 0L;
      this.hin = 0L;
      this.netSignal = 0L;
      this.expand1 = 0L;
      this.clientIp = "";
      this.expand2 = 0L;
      GMTrace.o(13661083009024L, 101783);
    }
    
    public final String toString()
    {
      GMTrace.i(13661217226752L, 101784);
      long l1 = this.rtType;
      long l2 = this.beginTime;
      long l3 = this.endTime;
      long l4 = this.endTime;
      long l5 = this.beginTime;
      long l6 = this.gYo;
      long l7 = this.hii;
      if (this.hie == null) {}
      for (String str = "null";; str = this.hie.toString())
      {
        str = String.format("rtType:%d begin:%d, end:%d time:%d cost:%d count:%d ipInfo:%s socket:%b netType:%d err:(%d,%d) tx:%d rx:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4 - l5), Long.valueOf(l6), Long.valueOf(l7), str, Boolean.valueOf(this.hif), Integer.valueOf(this.netType), Integer.valueOf(this.errType), Integer.valueOf(this.errCode), Long.valueOf(this.hig), Long.valueOf(this.hih) });
        GMTrace.o(13661217226752L, 101784);
        return str;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\network\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */