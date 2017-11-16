package com.tencent.mm.plugin.address.b.b;

import android.app.Dialog;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;

public final class a
  implements e
{
  public HashSet<k> huj;
  public HashSet<k> huk;
  public Dialog hul;
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(15199755042816L, 113247);
    if (this.huk.contains(paramk))
    {
      this.huk.remove(paramk);
      w.d("MicroMsg.InvoiceNetSceneMgr", "has find scene ");
    }
    for (;;)
    {
      if ((this.huk.isEmpty()) && (this.huj.isEmpty()) && (this.hul != null))
      {
        this.hul.dismiss();
        this.hul = null;
      }
      GMTrace.o(15199755042816L, 113247);
      return;
      if (this.huj.contains(paramk))
      {
        this.huj.remove(paramk);
        w.d("MicroMsg.InvoiceNetSceneMgr", "has find forcescenes ");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\b\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */