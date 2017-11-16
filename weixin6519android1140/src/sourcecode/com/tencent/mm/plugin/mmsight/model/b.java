package com.tencent.mm.plugin.mmsight.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class b
{
  long hii;
  long mXL;
  long mXM;
  private String tag;
  long value;
  
  public b(String paramString)
  {
    GMTrace.i(18673041408000L, 139125);
    this.tag = "default";
    this.mXL = bg.Pw();
    this.mXM = bg.Pw();
    this.value = 0L;
    this.hii = 0L;
    this.tag = paramString;
    GMTrace.o(18673041408000L, 139125);
  }
  
  public final String aOT()
  {
    GMTrace.i(18673444061184L, 139128);
    if (this.hii == 0L)
    {
      GMTrace.o(18673444061184L, 139128);
      return "";
    }
    double d2 = (this.mXM - this.mXL) / 1000.0D;
    double d1 = d2;
    if (d2 == 0.0D) {
      d1 = 1.0D;
    }
    String str = 1.0D * this.hii / d1;
    GMTrace.o(18673444061184L, 139128);
    return str;
  }
  
  public final void cS(long paramLong)
  {
    GMTrace.i(18673175625728L, 139126);
    if (this.hii == 0L) {
      this.mXL = bg.Pw();
    }
    this.value += paramLong;
    this.hii += 1L;
    this.mXM = bg.Pw();
    GMTrace.o(18673175625728L, 139126);
  }
  
  public final String getValue()
  {
    GMTrace.i(18673309843456L, 139127);
    if (this.hii == 0L)
    {
      GMTrace.o(18673309843456L, 139127);
      return "";
    }
    double d2 = (this.mXM - this.mXL) / 1000.0D;
    double d1 = d2;
    if (d2 == 0.0D) {
      d1 = 1.0D;
    }
    String str = String.format("CounterUtil %s tag %s count %s passed %.3f perValue %.3f/count counttime %.3f/s valuetime %.3f/s st:%s ed:%s diff%s", new Object[] { "", this.tag, Long.valueOf(this.hii), Double.valueOf(d1), Double.valueOf(this.value * 1.0D / this.hii), Double.valueOf(this.hii * 1.0D / d1), Double.valueOf(this.value * 1.0D / d1), Long.valueOf(this.mXL), Long.valueOf(this.mXM), Long.valueOf(this.mXM - this.mXL) });
    GMTrace.o(18673309843456L, 139127);
    return str;
  }
  
  public final void reset()
  {
    GMTrace.i(18673578278912L, 139129);
    this.value = 0L;
    this.hii = 0L;
    GMTrace.o(18673578278912L, 139129);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */