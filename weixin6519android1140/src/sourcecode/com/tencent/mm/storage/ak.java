package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;

public final class ak
{
  public String eEa;
  public String kry;
  public int vAK;
  private boolean vAL;
  public int vAM;
  public int vAN;
  public String vAO;
  
  public ak()
  {
    GMTrace.i(1567931498496L, 11682);
    this.vAL = false;
    this.vAK = -1;
    GMTrace.o(1567931498496L, 11682);
  }
  
  public ak(String paramString)
  {
    GMTrace.i(1568065716224L, 11683);
    this.vAL = false;
    this.eEa = paramString;
    this.vAK = -1;
    GMTrace.o(1568065716224L, 11683);
  }
  
  public final void Au(int paramInt)
  {
    GMTrace.i(1568199933952L, 11684);
    if ((this.vAK != -1) && (this.vAK != paramInt) && (paramInt == 7)) {
      this.vAL = true;
    }
    this.vAK = paramInt;
    GMTrace.o(1568199933952L, 11684);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */