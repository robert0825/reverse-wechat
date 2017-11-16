package com.tencent.mm.plugin.translate;

import android.os.Looper;
import android.util.SparseArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.rg;
import com.tencent.mm.g.a.rg.a;
import com.tencent.mm.g.a.rh;
import com.tencent.mm.g.a.ri;
import com.tencent.mm.plugin.translate.a.c.a;
import com.tencent.mm.plugin.translate.a.c.b;
import com.tencent.mm.plugin.translate.a.c.c;
import com.tencent.mm.plugin.translate.a.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public final class a
  implements aq
{
  public ae handler;
  public com.tencent.mm.plugin.translate.a.c qBa;
  public ar qBb;
  private c.a qBc;
  private com.tencent.mm.sdk.b.c qBd;
  private com.tencent.mm.sdk.b.c qBe;
  
  public a()
  {
    GMTrace.i(7273795551232L, 54194);
    this.qBa = c.b.qBo;
    this.qBb = new ar(5, "ProcessTranslatedMessage", 1, Looper.getMainLooper());
    this.qBc = new c.a()
    {
      public final void a(final int paramAnonymousInt, SparseArray<c.c> paramAnonymousSparseArray)
      {
        GMTrace.i(7274735075328L, 54201);
        int i = 0;
        while (i < paramAnonymousSparseArray.size())
        {
          final c.c localc = (c.c)paramAnonymousSparseArray.valueAt(i);
          if (localc != null) {
            a.this.qBb.c(new ar.a()
            {
              public final boolean Dj()
              {
                GMTrace.i(7270037454848L, 54166);
                w.d("MicroMsg.SubCoreTranslate", "finish translated, id: %s", new Object[] { localc.id });
                if (paramAnonymousInt != 0)
                {
                  w.e("MicroMsg.SubCoreTranslate", "translate error");
                  GMTrace.o(7270037454848L, 54166);
                  return true;
                }
                if (localc.ret != 0)
                {
                  w.e("MicroMsg.SubCoreTranslate", "translate ret not ok : %s", new Object[] { Integer.valueOf(localc.ret) });
                  GMTrace.o(7270037454848L, 54166);
                  return true;
                }
                if (bg.nm(localc.eWm))
                {
                  w.e("MicroMsg.SubCoreTranslate", "translate return null");
                  GMTrace.o(7270037454848L, 54166);
                  return true;
                }
                if ((localc.type == 0) || (localc.type == 1))
                {
                  w.d("MicroMsg.SubCoreTranslate", "we recieved one translated message");
                  String str1 = localc.id;
                  String str2 = localc.aEe;
                  String str3 = localc.eWm;
                  String str4 = localc.eUL;
                  at.AR();
                  com.tencent.mm.y.c.yM().a(bg.Sz(str1), str2, str3, str4);
                }
                GMTrace.o(7270037454848L, 54166);
                return true;
              }
              
              public final boolean Dk()
              {
                GMTrace.i(7269903237120L, 54165);
                if (paramAnonymousInt != 0) {}
                for (int i = paramAnonymousInt;; i = localc.ret)
                {
                  ri localri = new ri();
                  localri.eWl.ret = i;
                  localri.eWl.eWg = localc.eWg;
                  localri.eWl.id = localc.id;
                  localri.eWl.eWm = localc.eWm;
                  localri.eWl.type = localc.type;
                  localri.eWl.aEe = localc.aEe;
                  localri.eWl.eUL = localc.eUL;
                  com.tencent.mm.sdk.b.a.vgX.m(localri);
                  GMTrace.o(7269903237120L, 54165);
                  return false;
                }
              }
            });
          }
          i += 1;
        }
        GMTrace.o(7274735075328L, 54201);
      }
    };
    this.handler = new ae(Looper.getMainLooper());
    this.qBd = new com.tencent.mm.sdk.b.c() {};
    this.qBe = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7273795551232L, 54194);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7274198204416L, 54197);
    com.tencent.mm.plugin.translate.a.c localc = this.qBa;
    c.a locala = this.qBc;
    if ((locala == null) || (localc.fUn.contains(locala))) {}
    for (;;)
    {
      com.tencent.mm.sdk.b.a.vgX.b(this.qBd);
      com.tencent.mm.sdk.b.a.vgX.b(this.qBe);
      GMTrace.o(7274198204416L, 54197);
      return;
      localc.fUn.add(locala);
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7274332422144L, 54198);
    GMTrace.o(7274332422144L, 54198);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7274063986688L, 54196);
    GMTrace.o(7274063986688L, 54196);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7274466639872L, 54199);
    com.tencent.mm.sdk.b.a.vgX.c(this.qBd);
    com.tencent.mm.sdk.b.a.vgX.c(this.qBe);
    com.tencent.mm.plugin.translate.a.c localc = this.qBa;
    Object localObject = this.qBc;
    if ((localObject == null) || (!localc.fUn.contains(localObject))) {}
    for (;;)
    {
      localc = this.qBa;
      if (localc.qBl == null) {
        break;
      }
      localObject = localc.qBl;
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        e locale = localObject[i];
        if (locale != null)
        {
          at.wS().b(631, locale);
          if (locale.qBu != null)
          {
            locale.qBw.stopTimer();
            at.wS().c(locale.qBu);
          }
          locale.bsY();
          locale.qBs = null;
        }
        i += 1;
      }
      localc.fUn.remove(localObject);
    }
    localc.qBn.clear();
    localc.qBm.clear();
    localc.fUn.clear();
    localc.jxh = 0;
    GMTrace.o(7274466639872L, 54199);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7273929768960L, 54195);
    GMTrace.o(7273929768960L, 54195);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\translate\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */