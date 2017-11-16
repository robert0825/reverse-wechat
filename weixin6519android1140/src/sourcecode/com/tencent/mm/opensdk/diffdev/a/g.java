package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.gmtrace.GMTrace;

public enum g
{
  private int code;
  
  static
  {
    GMTrace.i(8187281408L, 61);
    y = new g("UUID_EXPIRED", 0, 402);
    z = new g("UUID_CANCELED", 1, 403);
    A = new g("UUID_SCANED", 2, 404);
    B = new g("UUID_CONFIRM", 3, 405);
    C = new g("UUID_KEEP_CONNECT", 4, 408);
    D = new g("UUID_ERROR", 5, 500);
    E = new g[] { y, z, A, B, C, D };
    GMTrace.o(8187281408L, 61);
  }
  
  private g(int paramInt)
  {
    GMTrace.i(7784628224L, 58);
    this.code = paramInt;
    GMTrace.o(7784628224L, 58);
  }
  
  public final int getCode()
  {
    GMTrace.i(7918845952L, 59);
    int i = this.code;
    GMTrace.o(7918845952L, 59);
    return i;
  }
  
  public final String toString()
  {
    GMTrace.i(8053063680L, 60);
    String str = "UUIDStatusCode:" + this.code;
    GMTrace.o(8053063680L, 60);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\opensdk\diffdev\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */