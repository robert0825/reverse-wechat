package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;
import java.lang.ref.WeakReference;

public final class cl
  extends b
{
  public a eDH;
  public b eDI;
  
  public cl()
  {
    this((byte)0);
    GMTrace.i(19246956412928L, 143401);
    GMTrace.o(19246956412928L, 143401);
  }
  
  private cl(byte paramByte)
  {
    GMTrace.i(19247090630656L, 143402);
    this.eDH = new a();
    this.eDI = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(19247090630656L, 143402);
  }
  
  public static final class a
  {
    public String appId;
    public String eDJ;
    public String eDK;
    public String eDL;
    public String eDM;
    public WeakReference eDN;
    public Runnable eDO;
    public String nonceStr;
    public String packageExt;
    public String signType;
    public String signature;
    
    public a()
    {
      GMTrace.i(19248567025664L, 143413);
      GMTrace.o(19248567025664L, 143413);
    }
  }
  
  public static final class b
  {
    public int retCode;
    
    public b()
    {
      GMTrace.i(19247493283840L, 143405);
      this.retCode = 0;
      GMTrace.o(19247493283840L, 143405);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */