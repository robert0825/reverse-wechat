package com.tencent.mm.plugin.hp.b;

import android.util.Base64;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.ib;
import com.tencent.mm.g.a.ib.a;
import com.tencent.mm.plugin.hp.d.a;
import com.tencent.mm.plugin.hp.tinker.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends com.tencent.mm.sdk.b.c<ib>
  implements com.tencent.mm.sdk.f.c
{
  private static final String gLs;
  private a mhc;
  
  static
  {
    GMTrace.i(15366990331904L, 114493);
    gLs = com.tencent.mm.compatible.util.e.ghv + "_temp.hp";
    GMTrace.o(15366990331904L, 114493);
  }
  
  public c()
  {
    GMTrace.i(15366319243264L, 114488);
    this.mhc = null;
    com.tencent.mm.sdk.f.e.a(this);
    this.vhf = ib.class.getName().hashCode();
    GMTrace.o(15366319243264L, 114488);
  }
  
  public static void Ae(String paramString)
  {
    GMTrace.i(15366453460992L, 114489);
    w.w("Tinker.HotPatchApplyService", "hp_apply from file %s", new Object[] { paramString });
    d.Af(paramString);
    GMTrace.o(15366453460992L, 114489);
  }
  
  private boolean a(ib paramib)
  {
    GMTrace.i(15366721896448L, 114491);
    if (this.mhc != null)
    {
      w.e("Tinker.HotPatchApplyService", "hp_apply processing busy, ignore new event");
      GMTrace.o(15366721896448L, 114491);
      return false;
    }
    if (1 == paramib.eLv.eCx)
    {
      d.aHu();
      GMTrace.o(15366721896448L, 114491);
      return false;
    }
    if (paramib.eLv.eLA != null)
    {
      Ae(paramib.eLv.eLA);
      GMTrace.o(15366721896448L, 114491);
      return false;
    }
    b.pb(1);
    if (paramib.eLv.eLy != null) {}
    try
    {
      byte[] arrayOfByte = Base64.decode(paramib.eLv.eLy, 0);
      paramib.eLv.eLy = new String(arrayOfByte);
      if ((!bg.nm(paramib.eLv.eLy)) && (!bg.nm(paramib.eLv.eLz)))
      {
        w.i("Tinker.HotPatchApplyService", "hp_apply request url=%s, signature=%s", new Object[] { paramib.eLv.eLy, paramib.eLv.eLz });
        this.mhc = new a(paramib.eLv.eLy, gLs, paramib.eLv.eLz);
      }
      while ((!bg.nm(paramib.eLv.eLw)) && (!bg.nm(paramib.eLv.eLx)))
      {
        com.tencent.mm.sdk.f.e.post(this.mhc, "hp_apply_download");
        GMTrace.o(15366721896448L, 114491);
        return false;
      }
      GMTrace.o(15366721896448L, 114491);
      return false;
    }
    catch (Error localError)
    {
      for (;;) {}
    }
  }
  
  public final void u(Runnable paramRunnable)
  {
    GMTrace.i(15366587678720L, 114490);
    if (paramRunnable == this.mhc)
    {
      w.d("Tinker.HotPatchApplyService", "hp_apply download url=%s, file=%s, failed=%b", new Object[] { this.mhc.url, this.mhc.hjk, Boolean.valueOf(this.mhc.gsF) });
      if (this.mhc.gsF) {
        break label98;
      }
      b.pc(1);
      Ae(this.mhc.hjk);
    }
    for (;;)
    {
      this.mhc = null;
      GMTrace.o(15366587678720L, 114490);
      return;
      label98:
      b.pd(1);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */