package com.tencent.mm.g.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class ah
  extends b
{
  public a eBh;
  public b eBi;
  
  public ah()
  {
    this((byte)0);
    GMTrace.i(4313220907008L, 32136);
    GMTrace.o(4313220907008L, 32136);
  }
  
  private ah(byte paramByte)
  {
    GMTrace.i(4313355124736L, 32137);
    this.eBh = new a();
    this.eBi = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4313355124736L, 32137);
  }
  
  public static final class a
  {
    public int action;
    public Context context;
    public String eBj;
    public long eBk;
    public boolean eBl;
    public Runnable eBm;
    public int fromScene;
    public int offset;
    public String title;
    
    public a()
    {
      GMTrace.i(4354828402688L, 32446);
      this.fromScene = 0;
      this.eBk = 0L;
      this.offset = 0;
      this.action = 0;
      this.eBl = false;
      GMTrace.o(4354828402688L, 32446);
    }
  }
  
  public static final class b
  {
    public boolean eBn;
    
    public b()
    {
      GMTrace.i(4329863905280L, 32260);
      this.eBn = false;
      GMTrace.o(4329863905280L, 32260);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */