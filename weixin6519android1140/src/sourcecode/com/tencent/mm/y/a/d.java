package com.tencent.mm.y.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;

public final class d
  implements com.tencent.mm.ad.d
{
  public d()
  {
    GMTrace.i(692295041024L, 5158);
    GMTrace.o(692295041024L, 5158);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(692429258752L, 5159);
    parama = parama.gtM;
    if ((parama == null) || (parama.tPY == null))
    {
      w.f("MicroMsg.abtest.AbTestMsgExtension", "[Abtest] AbTestMsgExtension failed, invalid cmdAM");
      GMTrace.o(692429258752L, 5159);
      return null;
    }
    String str = n.a(parama.tPY);
    h.xy().xh().set(328193, str);
    parama = g.BY();
    long l = System.currentTimeMillis();
    try
    {
      parama.hc(str);
      str = (String)h.xy().xh().get(328197, null);
      if ((bg.nm(str)) || ((parama.gpF != null) && (!str.equals(parama.gpF.gpB))))
      {
        h.xy().xh().set(328197, parama.gpF.gpB);
        h.xy().xh().set(328195, Boolean.valueOf(false));
        h.xy().xh().set(328194, Boolean.valueOf(false));
        h.xy().xh().set(328196, Boolean.valueOf(false));
        w.i("MicroMsg.abtest.AbTestManager", "[cpan] new case id or new case id , reset click value.");
      }
    }
    catch (Exception parama)
    {
      for (;;)
      {
        w.e("MicroMsg.abtest.AbTestManager", "[Abtest] updateAbTestCase exception:%s", new Object[] { parama.toString() });
      }
    }
    w.i("MicroMsg.abtest.AbTestManager", "[Abtest] update use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    if (g.BY().BW()) {
      f.he(g.BY().gpF.gpB);
    }
    GMTrace.o(692429258752L, 5159);
    return null;
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(692563476480L, 5160);
    GMTrace.o(692563476480L, 5160);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */