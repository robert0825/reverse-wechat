package com.tencent.mm.plugin.radar.a;

import com.tencent.gmtrace.GMTrace;

public enum d
{
  public int eMK;
  public int nZA;
  public long nZB;
  public long nZC;
  public long nZD;
  public int nZE;
  
  static
  {
    GMTrace.i(8898366930944L, 66298);
    nZz = new d("INSTANCE");
    nZF = new d[] { nZz };
    GMTrace.o(8898366930944L, 66298);
  }
  
  private d()
  {
    GMTrace.i(8898098495488L, 66296);
    this.nZA = 0;
    this.nZB = 0L;
    this.nZC = 0L;
    this.nZD = 0L;
    this.eMK = 0;
    this.nZE = 0;
    GMTrace.o(8898098495488L, 66296);
  }
  
  public static long aZG()
  {
    GMTrace.i(8898232713216L, 66297);
    long l = System.currentTimeMillis();
    GMTrace.o(8898232713216L, 66297);
    return l;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */