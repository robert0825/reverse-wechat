package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class ai
  extends b
{
  public a eBo;
  public b eBp;
  
  public ai()
  {
    this((byte)0);
    GMTrace.i(13619341295616L, 101472);
    GMTrace.o(13619341295616L, 101472);
  }
  
  private ai(byte paramByte)
  {
    GMTrace.i(13619475513344L, 101473);
    this.eBo = new a();
    this.eBp = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(13619475513344L, 101473);
  }
  
  public static final class a
  {
    public String eBq;
    public int position;
    public int type;
    
    public a()
    {
      GMTrace.i(13619878166528L, 101476);
      this.position = 0;
      GMTrace.o(13619878166528L, 101476);
    }
  }
  
  public static final class b
  {
    public String desc;
    public int eBr;
    public int eBs;
    public String eBt;
    public int eBu;
    public String eBv;
    public int position;
    public int showType;
    public String url;
    public boolean visible;
    
    public b()
    {
      GMTrace.i(13620146601984L, 101478);
      this.visible = false;
      this.eBr = 0;
      this.showType = 0;
      this.eBs = 0;
      this.eBu = 0;
      this.position = 0;
      GMTrace.o(13620146601984L, 101478);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */