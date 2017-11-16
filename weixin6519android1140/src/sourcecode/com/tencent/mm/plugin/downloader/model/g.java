package com.tencent.mm.plugin.downloader.model;

import com.tencent.gmtrace.GMTrace;

public final class g
{
  public int gRb;
  public String hJF;
  public String hyD;
  public String kfp;
  public long kfq;
  public String kfr;
  public int kfs;
  public boolean kft;
  public boolean kfu;
  public boolean kfv;
  public boolean kfw;
  public String mFileName;
  public String mPackageName;
  
  public g()
  {
    GMTrace.i(18593450295296L, 138532);
    this.hJF = "";
    this.kfp = "";
    this.kfq = 0L;
    this.mFileName = "";
    this.kfr = "";
    this.kfs = 1;
    this.hyD = "";
    this.mPackageName = "";
    this.kft = false;
    this.kfu = true;
    this.kfv = false;
    this.kfw = false;
    this.gRb = 0;
    GMTrace.o(18593450295296L, 138532);
  }
  
  public static final class a
  {
    public g kfx;
    
    public a()
    {
      GMTrace.i(18609287987200L, 138650);
      this.kfx = new g();
      GMTrace.o(18609287987200L, 138650);
    }
    
    public final void bE(String paramString)
    {
      GMTrace.i(18610630164480L, 138660);
      this.kfx.mPackageName = paramString;
      GMTrace.o(18610630164480L, 138660);
    }
    
    public final void bq(long paramLong)
    {
      GMTrace.i(18609690640384L, 138653);
      this.kfx.kfq = paramLong;
      GMTrace.o(18609690640384L, 138653);
    }
    
    public final void dJ(boolean paramBoolean)
    {
      GMTrace.i(18610361729024L, 138658);
      this.kfx.kft = paramBoolean;
      GMTrace.o(18610361729024L, 138658);
    }
    
    public final void dK(boolean paramBoolean)
    {
      GMTrace.i(18610495946752L, 138659);
      this.kfx.kfu = paramBoolean;
      GMTrace.o(18610495946752L, 138659);
    }
    
    public final void dL(boolean paramBoolean)
    {
      GMTrace.i(18610764382208L, 138661);
      this.kfx.kfw = paramBoolean;
      GMTrace.o(18610764382208L, 138661);
    }
    
    public final void lq(int paramInt)
    {
      GMTrace.i(18610898599936L, 138662);
      this.kfx.gRb = paramInt;
      GMTrace.o(18610898599936L, 138662);
    }
    
    public final void mt(int paramInt)
    {
      GMTrace.i(18610227511296L, 138657);
      this.kfx.kfs = paramInt;
      GMTrace.o(18610227511296L, 138657);
    }
    
    public final void setAppId(String paramString)
    {
      GMTrace.i(18610093293568L, 138656);
      this.kfx.hyD = paramString;
      GMTrace.o(18610093293568L, 138656);
    }
    
    public final void vA(String paramString)
    {
      GMTrace.i(18609824858112L, 138654);
      this.kfx.mFileName = paramString;
      GMTrace.o(18609824858112L, 138654);
    }
    
    public final void vB(String paramString)
    {
      GMTrace.i(18609959075840L, 138655);
      this.kfx.kfr = paramString;
      GMTrace.o(18609959075840L, 138655);
    }
    
    public final void vy(String paramString)
    {
      GMTrace.i(18609422204928L, 138651);
      this.kfx.hJF = paramString;
      GMTrace.o(18609422204928L, 138651);
    }
    
    public final void vz(String paramString)
    {
      GMTrace.i(18609556422656L, 138652);
      this.kfx.kfp = paramString;
      GMTrace.o(18609556422656L, 138652);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */