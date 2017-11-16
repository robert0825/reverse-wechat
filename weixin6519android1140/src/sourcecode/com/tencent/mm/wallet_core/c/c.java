package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;

public final class c
{
  public String eAR;
  public int errCode;
  public int errType;
  public int xDd;
  
  public c()
  {
    GMTrace.i(1441364180992L, 10739);
    this.xDd = 0;
    this.errType = 0;
    this.errCode = 0;
    this.eAR = "";
    this.xDd = 0;
    GMTrace.o(1441364180992L, 10739);
  }
  
  public c(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(1441095745536L, 10737);
    this.xDd = 0;
    c(paramInt1, paramInt2, paramString, 0);
    GMTrace.o(1441095745536L, 10737);
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    GMTrace.i(1441229963264L, 10738);
    this.errType = paramInt1;
    this.errCode = paramInt2;
    this.eAR = paramString;
    this.xDd = paramInt3;
    GMTrace.o(1441229963264L, 10738);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */