package com.tencent.mm.plugin.s;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class g
{
  private boolean jGN;
  public boolean mVA;
  boolean mVB;
  boolean mVC;
  public long mVp;
  public long mVq;
  public long mVr;
  public long mVs;
  public long mVt;
  public long mVu;
  public long mVv;
  public long mVw;
  public boolean mVx;
  public boolean mVy;
  public boolean mVz;
  
  public g(boolean paramBoolean)
  {
    GMTrace.i(12909732167680L, 96185);
    this.mVp = 0L;
    this.mVq = 0L;
    this.mVr = -1L;
    this.mVs = 0L;
    this.mVt = 0L;
    this.mVu = 0L;
    this.mVv = 0L;
    this.mVw = 10L;
    this.mVx = true;
    this.mVy = true;
    this.mVz = false;
    this.mVA = false;
    this.mVB = false;
    this.mVC = false;
    this.jGN = paramBoolean;
    GMTrace.o(12909732167680L, 96185);
  }
  
  public final void CE(String paramString)
  {
    GMTrace.i(17458639405056L, 130077);
    if (!this.mVx)
    {
      GMTrace.o(17458639405056L, 130077);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.a(354L, 152L, 1L, false);
    com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(500), Long.valueOf(bg.Pu()), paramString });
    GMTrace.o(17458639405056L, 130077);
  }
  
  public final void CF(String paramString)
  {
    GMTrace.i(17458773622784L, 130078);
    if (!this.mVx)
    {
      GMTrace.o(17458773622784L, 130078);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.a(354L, 153L, 1L, false);
    com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(501), Long.valueOf(bg.Pu()), paramString });
    GMTrace.o(17458773622784L, 130078);
  }
  
  public final void aOC()
  {
    GMTrace.i(17458907840512L, 130079);
    if (!this.mVx)
    {
      GMTrace.o(17458907840512L, 130079);
      return;
    }
    com.tencent.mm.plugin.report.service.g.ork.a(354L, 155L, 1L, false);
    com.tencent.mm.plugin.report.service.g.ork.i(13836, new Object[] { Integer.valueOf(503), Long.valueOf(bg.Pu()), "" });
    GMTrace.o(17458907840512L, 130079);
  }
  
  public final String aiJ()
  {
    GMTrace.i(12909866385408L, 96186);
    String str = hashCode();
    GMTrace.o(12909866385408L, 96186);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\s\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */