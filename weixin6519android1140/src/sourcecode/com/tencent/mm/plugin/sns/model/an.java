package com.tencent.mm.plugin.sns.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.as;
import com.tencent.mm.g.a.f;
import com.tencent.mm.g.a.pt;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Date;

public final class an
{
  public boolean hbs;
  public boolean hbt;
  long pvF;
  private boolean pvG;
  int pvH;
  int pvI;
  c<pt> pvJ;
  c pvK;
  c pvL;
  
  an()
  {
    GMTrace.i(17152757202944L, 127798);
    this.pvF = 0L;
    this.hbs = false;
    this.hbt = false;
    this.pvG = false;
    this.pvH = 0;
    this.pvI = 1440;
    this.pvJ = new c()
    {
      private boolean bjF()
      {
        int i = 1200;
        GMTrace.i(17153965162496L, 127807);
        an localan = an.this;
        int j;
        try
        {
          if (localan.bjE())
          {
            Date localDate = new Date();
            j = localDate.getHours();
            j = localDate.getMinutes() + j * 60;
            if ((j >= localan.pvH) && (j <= localan.pvI))
            {
              w.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  %d in [%d, %d]", new Object[] { Integer.valueOf(j), Integer.valueOf(localan.pvH), Integer.valueOf(localan.pvI) });
              GMTrace.o(17153965162496L, 127807);
              return false;
            }
          }
        }
        catch (Exception localException)
        {
          int k;
          int m;
          int n;
          do
          {
            k = g.ut().getInt("SnsImgPreLoadingSmallImage", 1);
            m = g.ut().getInt("SnsImgPreLoadingBigImage", 1);
            n = g.ut().getInt("SnsPreLoadingVideo", 1);
            j = g.ut().getInt("SnsImgPreLoadingInterval", 1200);
            w.i("MicroMsg.SnsPreTimelineService", " preloadingSamllImage %d preloadingBigImage %d preloadingVideo %d preloadingInterval %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j) });
          } while ((k <= 0) && (m <= 0) && (n <= 0));
          if (j > 0) {}
        }
        for (;;)
        {
          if ((localan.hbs) || (localan.hbt) || (bg.aG(localan.pvF) < i))
          {
            w.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked,  isInChatting:%b, isInSnsTimeline:%b", new Object[] { Boolean.valueOf(localan.hbs), Boolean.valueOf(localan.hbt) });
            break;
          }
          if (!x.Hl("@__weixintimtline"))
          {
            w.i("MicroMsg.SnsPreTimelineService", "newObjectSync blocked: doing timeline");
            break;
          }
          h.xz();
          if (!h.xx().fYr.a(new s(), 0))
          {
            w.i("MicroMsg.SnsPreTimelineService", "newObjectSync triggered");
            x.Hm("@__weixintimtline");
          }
          localan.pvF = bg.Pu();
          break;
          i = j;
        }
      }
    };
    this.pvK = new c() {};
    this.pvL = new c() {};
    GMTrace.o(17152757202944L, 127798);
  }
  
  final boolean bjE()
  {
    GMTrace.i(17152891420672L, 127799);
    Object localObject = g.ut().getValue("SnsImgPreLoadingTimeLimit");
    w.i("MicroMsg.SnsPreTimelineService", "preloadLimit:%s", new Object[] { localObject });
    if (bg.nm((String)localObject))
    {
      GMTrace.o(17152891420672L, 127799);
      return false;
    }
    try
    {
      localObject = ((String)localObject).split("-");
      String[] arrayOfString = localObject[0].split(":");
      int i = bg.Sy(arrayOfString[0]);
      this.pvH = (bg.Sy(arrayOfString[1]) + i * 60);
      localObject = localObject[1].split(":");
      i = bg.Sy(localObject[0]);
      this.pvI = (bg.Sy(localObject[1]) + i * 60);
      w.d("MicroMsg.SnsPreTimelineService", "preloadLimit:%d-%d", new Object[] { Integer.valueOf(this.pvH), Integer.valueOf(this.pvI) });
      GMTrace.o(17152891420672L, 127799);
      return true;
    }
    catch (Exception localException)
    {
      GMTrace.o(17152891420672L, 127799);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */