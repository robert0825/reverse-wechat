package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import java.util.Map;
import junit.framework.Assert;

public final class bn
  implements d
{
  public bn()
  {
    GMTrace.i(649076932608L, 4836);
    GMTrace.o(649076932608L, 4836);
  }
  
  public final d.b b(d.a parama)
  {
    boolean bool2 = true;
    GMTrace.i(649211150336L, 4837);
    parama = parama.gtM;
    if (parama != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (parama.tPY == null) {
        break label113;
      }
    }
    label113:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue(bool1);
      parama = (String)bh.q(n.a(parama.tPY), "tips").get(".tips.tip.url");
      w.v("MicroMsg.SoftwareMsgExtension", "url:" + parama);
      at.AR();
      c.xh().set(12308, parama);
      GMTrace.o(649211150336L, 4837);
      return null;
      bool1 = false;
      break;
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(649345368064L, 4838);
    GMTrace.o(649345368064L, 4838);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */