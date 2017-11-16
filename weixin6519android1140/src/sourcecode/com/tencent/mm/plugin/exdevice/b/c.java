package com.tencent.mm.plugin.exdevice.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.exdevice.e.e;

public abstract class c
{
  public long joF;
  public short kwR;
  public e kwS;
  protected a kwT;
  
  public c()
  {
    GMTrace.i(11205301239808L, 83486);
    this.joF = -1L;
    this.kwR = -1;
    this.kwS = null;
    this.kwT = null;
    GMTrace.o(11205301239808L, 83486);
  }
  
  protected final e J(int paramInt, String paramString)
  {
    GMTrace.i(11205838110720L, 83490);
    this.kwS = new e();
    this.kwS.kBk = paramInt;
    this.kwS.kBl = paramString;
    paramString = this.kwS;
    GMTrace.o(11205838110720L, 83490);
    return paramString;
  }
  
  public abstract short atn();
  
  public abstract short ato();
  
  public abstract byte[] atp();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */