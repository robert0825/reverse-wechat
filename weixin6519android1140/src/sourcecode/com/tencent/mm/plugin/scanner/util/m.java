package com.tencent.mm.plugin.scanner.util;

import com.tencent.gmtrace.GMTrace;

public final class m
{
  private static m oBp;
  byte[] oBq;
  byte[] oBr;
  
  private m()
  {
    GMTrace.i(6180860592128L, 46051);
    this.oBq = null;
    this.oBr = null;
    GMTrace.o(6180860592128L, 46051);
  }
  
  public static m bdA()
  {
    GMTrace.i(6180994809856L, 46052);
    if (oBp == null) {
      oBp = new m();
    }
    m localm = oBp;
    GMTrace.o(6180994809856L, 46052);
    return localm;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */