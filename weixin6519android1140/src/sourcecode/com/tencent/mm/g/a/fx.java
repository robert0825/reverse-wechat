package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class fx
  extends b
{
  public a eIN;
  public b eIO;
  
  public fx()
  {
    this((byte)0);
    GMTrace.i(4369726570496L, 32557);
    GMTrace.o(4369726570496L, 32557);
  }
  
  private fx(byte paramByte)
  {
    GMTrace.i(4369860788224L, 32558);
    this.eIN = new a();
    this.eIO = new b();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4369860788224L, 32558);
  }
  
  public static final class a
  {
    public String appId;
    public String eIP;
    public String eIQ;
    public String eIR;
    public boolean eIS;
    public boolean eIT;
    public boolean eIU;
    public boolean eIV;
    public String euR;
    public long fileSize;
    public int fileType;
    public String packageName;
    public int scene;
    
    public a()
    {
      GMTrace.i(4188935290880L, 31210);
      this.fileSize = 0L;
      this.fileType = 1;
      this.eIS = false;
      this.eIT = false;
      this.eIU = false;
      this.eIV = false;
      this.scene = 0;
      GMTrace.o(4188935290880L, 31210);
    }
  }
  
  public static final class b
  {
    public long eAf;
    
    public b()
    {
      GMTrace.i(4361941942272L, 32499);
      GMTrace.o(4361941942272L, 32499);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */