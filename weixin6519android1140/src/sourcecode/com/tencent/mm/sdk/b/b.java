package com.tencent.mm.sdk.b;

import com.tencent.gmtrace.GMTrace;

public abstract class b
{
  public Runnable eDO;
  public boolean vhd;
  private int vhe;
  
  public b()
  {
    GMTrace.i(13957704187904L, 103993);
    this.eDO = null;
    this.vhe = 0;
    GMTrace.o(13957704187904L, 103993);
  }
  
  final int bPt()
  {
    GMTrace.i(13957838405632L, 103994);
    if (this.vhe == 0) {
      this.vhe = getClass().getName().hashCode();
    }
    int i = this.vhe;
    GMTrace.o(13957838405632L, 103994);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */