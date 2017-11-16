package com.tencent.mm.pluginsdk.ui.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends com.tencent.mm.ui.tools.a.a
{
  public int mSize;
  private String oRS;
  private a tCp;
  
  public a(String paramString)
  {
    GMTrace.i(1202053971968L, 8956);
    this.mSize = 104857600;
    this.oRS = paramString;
    GMTrace.o(1202053971968L, 8956);
  }
  
  protected final int Vk()
  {
    GMTrace.i(1202456625152L, 8959);
    if (bg.nm(this.oRS)) {
      w.w("MicroMsg.VideoBoundaryCheck", "dz[check video but path is null or nil]");
    }
    boolean bool1 = am.is2G(ab.getContext());
    boolean bool2 = c.np(this.oRS);
    int i;
    label62:
    double d;
    if (bool2)
    {
      String str = this.oRS;
      if (bool1)
      {
        i = 10485760;
        if (!bool1) {
          break label213;
        }
        d = 60000.0D;
        label71:
        i = SightVideoJNI.shouldRemuxing(str, 660, 500, i, d, 1000000);
      }
    }
    for (;;)
    {
      w.i("MicroMsg.VideoBoundaryCheck", "check should remuxing, ret %d, isMp4 %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2) });
      switch (i)
      {
      default: 
        w.e("MicroMsg.VideoBoundaryCheck", "unknown check type %d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(1202456625152L, 8959);
        return 1;
        i = this.mSize;
        break label62;
        label213:
        d = this.mSize;
        break label71;
        int j = e.aY(this.oRS);
        if (bool1) {}
        for (i = 10485760;; i = 20971520)
        {
          if (j <= i) {
            break label256;
          }
          i = -1;
          break;
        }
        label256:
        i = 1;
      }
    }
    GMTrace.o(1202456625152L, 8959);
    return 0;
    GMTrace.o(1202456625152L, 8959);
    return 2;
    GMTrace.o(1202456625152L, 8959);
    return 1;
  }
  
  public final int bMU()
  {
    GMTrace.i(1202322407424L, 8958);
    int i = Vk();
    GMTrace.o(1202322407424L, 8958);
    return i;
  }
  
  protected final void bMV()
  {
    GMTrace.i(1202590842880L, 8960);
    if (this.tCp == null)
    {
      w.w("MicroMsg.VideoBoundaryCheck", "dz[callback is null]");
      GMTrace.o(1202590842880L, 8960);
      return;
    }
    Vk();
    GMTrace.o(1202590842880L, 8960);
  }
  
  public static abstract interface a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */