package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.at.a;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.b.b;

public final class jn
  extends b
{
  public a eNp;
  
  public jn()
  {
    this((byte)0);
    GMTrace.i(4187995766784L, 31203);
    GMTrace.o(4187995766784L, 31203);
  }
  
  private jn(byte paramByte)
  {
    GMTrace.i(4188129984512L, 31204);
    this.eNp = new a();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(4188129984512L, 31204);
  }
  
  public static final class a
  {
    public int action;
    public String appId;
    public long duration;
    public String eAR;
    public apv eNl;
    public a eNq;
    public boolean eNr;
    public int errCode;
    public String state;
    
    public a()
    {
      GMTrace.i(4257117896704L, 31718);
      GMTrace.o(4257117896704L, 31718);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\g\a\jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */