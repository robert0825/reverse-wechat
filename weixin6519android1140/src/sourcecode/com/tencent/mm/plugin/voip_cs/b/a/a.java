package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.voip.video.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  private static a qSi;
  public h qIy;
  
  private a()
  {
    GMTrace.i(11261001596928L, 83901);
    this.qIy = new h(ab.getContext());
    GMTrace.o(11261001596928L, 83901);
  }
  
  public static a bwv()
  {
    GMTrace.i(11261135814656L, 83902);
    if (qSi == null) {
      qSi = new a();
    }
    a locala = qSi;
    GMTrace.o(11261135814656L, 83902);
    return locala;
  }
  
  public static a bww()
  {
    GMTrace.i(11261270032384L, 83903);
    if (qSi == null) {
      qSi = bwv();
    }
    a locala = qSi;
    GMTrace.o(11261270032384L, 83903);
    return locala;
  }
  
  public final boolean buQ()
  {
    GMTrace.i(11261672685568L, 83906);
    if (this.qIy != null)
    {
      boolean bool = this.qIy.bwb();
      GMTrace.o(11261672685568L, 83906);
      return bool;
    }
    GMTrace.o(11261672685568L, 83906);
    return true;
  }
  
  public final void bwx()
  {
    GMTrace.i(11261404250112L, 83904);
    if (this.qIy != null) {
      this.qIy.m(R.k.cOh, 0, true);
    }
    GMTrace.o(11261404250112L, 83904);
  }
  
  public final void stopRing()
  {
    GMTrace.i(11261538467840L, 83905);
    if (this.qIy != null) {
      this.qIy.stop();
    }
    GMTrace.o(11261538467840L, 83905);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip_cs\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */