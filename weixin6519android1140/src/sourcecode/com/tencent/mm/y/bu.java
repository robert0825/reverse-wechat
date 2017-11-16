package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import java.util.Map;

public final class bu
  implements d
{
  public bu()
  {
    GMTrace.i(644379312128L, 4801);
    GMTrace.o(644379312128L, 4801);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(644513529856L, 4802);
    parama = parama.gtM;
    if (parama == null)
    {
      w.e("MicroMsg.SysNoticeMsgExtension", "onPreAddMessage cmdAM is null");
      GMTrace.o(644513529856L, 4802);
      return null;
    }
    try
    {
      parama = bh.q("<root>" + parama.tPY + "</root>", "root");
      int i = Integer.valueOf((String)parama.get(".root.newcount")).intValue();
      int j = Integer.valueOf((String)parama.get(".root.version")).intValue();
      at.AR();
      parama = c.xh();
      if (j == bg.e((Integer)parama.get(12305, null)))
      {
        w.i("MicroMsg.SysNoticeMsgExtension", "ignore new sys notice count, same version");
        GMTrace.o(644513529856L, 4802);
        return null;
      }
      parama.set(12304, Integer.valueOf(i));
      parama.set(12305, Integer.valueOf(j));
    }
    catch (Exception parama)
    {
      for (;;)
      {
        w.e("MicroMsg.SysNoticeMsgExtension", "exception:%s", new Object[] { bg.f(parama) });
      }
    }
    GMTrace.o(644513529856L, 4802);
    return null;
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(644647747584L, 4803);
    GMTrace.o(644647747584L, 4803);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */