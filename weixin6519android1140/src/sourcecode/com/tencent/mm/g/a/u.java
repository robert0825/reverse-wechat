package com.tencent.mm.g.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.b.b;

public final class u
  extends b
{
  public a eAQ;
  
  public u()
  {
    this((byte)0);
    GMTrace.i(20068905779200L, 149525);
    GMTrace.o(20068905779200L, 149525);
  }
  
  private u(byte paramByte)
  {
    GMTrace.i(20069039996928L, 149526);
    this.eAQ = new a();
    this.vhd = false;
    this.eDO = null;
    GMTrace.o(20069039996928L, 149526);
  }
  
  public static final class a
  {
    public int action;
    public long duration;
    public String eAL;
    public String eAR;
    public int errCode;
    public String state;
    
    public a()
    {
      GMTrace.i(20069576867840L, 149530);
      GMTrace.o(20069576867840L, 149530);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\g\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */