package com.tencent.mm.plugin.game.model;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.protocal.c.baq;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class p
  implements e
{
  private static boolean aDI;
  public static LinkedList<j> lMA;
  private static af lMB;
  public static int lMz;
  public int offset;
  
  static
  {
    GMTrace.i(12594320506880L, 93835);
    lMz = 20;
    aDI = false;
    lMA = new LinkedList();
    GMTrace.o(12594320506880L, 93835);
  }
  
  public p()
  {
    GMTrace.i(12593112547328L, 93826);
    this.offset = 0;
    GMTrace.o(12593112547328L, 93826);
  }
  
  public static void update()
  {
    GMTrace.i(12593246765056L, 93827);
    at.AR();
    long l = ((Long)c.xh().get(w.a.vpW, Long.valueOf(0L))).longValue();
    if (System.currentTimeMillis() - l > 86400000L) {}
    for (int i = 1; i == 0; i = 0)
    {
      w.i("MicroMsg.GameListUpdater", "No need to update");
      GMTrace.o(12593246765056L, 93827);
      return;
    }
    if (aDI)
    {
      w.e("MicroMsg.GameListUpdater", "Already running");
      GMTrace.o(12593246765056L, 93827);
      return;
    }
    lMB = new af("GameListUpdate");
    lMA.clear();
    p localp = new p();
    at.wS().a(1215, localp);
    at.wS().a(new aw(localp.offset, lMz), 0);
    aDI = true;
    GMTrace.o(12593246765056L, 93827);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, final k paramk)
  {
    GMTrace.i(12593380982784L, 93828);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      aFq();
      GMTrace.o(12593380982784L, 93828);
      return;
    }
    lMB.A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12620224528384L, 94028);
        p.this.offset += p.lMz;
        Object localObject = (baq)((aw)paramk).kzP.gtD.gtK;
        if (localObject == null) {
          w.e("MicroMsg.NetSceneSearchGameList", "resp == null");
        }
        for (localObject = null;; localObject = ((baq)localObject).uni)
        {
          localObject = new j((String)localObject);
          ((j)localObject).aFm();
          p.lMA.add(localObject);
          int i = ((i)localObject).lMl.optInt("remainingCount");
          w.i("MicroMsg.GameListUpdater", "remainingCount: %d", new Object[] { Integer.valueOf(i) });
          if (i <= 0) {
            break;
          }
          at.wS().a(new aw(p.this.offset, p.lMz), 0);
          GMTrace.o(12620224528384L, 94028);
          return;
        }
        p.this.aFq();
        at.AR();
        c.xh().a(w.a.vpW, Long.valueOf(System.currentTimeMillis()));
        localObject = p.lMA;
        if (!bg.cc((List)localObject)) {
          at.xB().A(new j.1((LinkedList)localObject));
        }
        GMTrace.o(12620224528384L, 94028);
      }
    });
    GMTrace.o(12593380982784L, 93828);
  }
  
  public final void aFq()
  {
    GMTrace.i(12593515200512L, 93829);
    aDI = false;
    lMB.ngv.quit();
    at.wS().b(1215, this);
    GMTrace.o(12593515200512L, 93829);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */