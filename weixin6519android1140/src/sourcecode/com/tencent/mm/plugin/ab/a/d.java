package com.tencent.mm.plugin.ab.a;

import com.tencent.gmtrace.GMTrace;

public final class d
{
  public int eDg;
  public int eDh;
  public String result;
  
  public d()
  {
    GMTrace.i(6672768565248L, 49716);
    this.result = "";
    this.eDg = 0;
    this.eDh = 0;
    GMTrace.o(6672768565248L, 49716);
  }
  
  public final String toString()
  {
    GMTrace.i(6672902782976L, 49717);
    String str = String.format("result: %s, codeType: %s, codeVersion: %s", new Object[] { this.result, Integer.valueOf(this.eDg), Integer.valueOf(this.eDh) });
    GMTrace.o(6672902782976L, 49717);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ab\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */