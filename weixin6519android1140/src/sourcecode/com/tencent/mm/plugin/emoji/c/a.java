package com.tencent.mm.plugin.emoji.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.f.s;
import com.tencent.mm.plugin.emoji.model.h;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public final class a
  extends com.tencent.mm.sdk.b.c<lq>
{
  public a()
  {
    GMTrace.i(11358577885184L, 84628);
    this.vhf = lq.class.getName().hashCode();
    GMTrace.o(11358577885184L, 84628);
  }
  
  public static void aqr()
  {
    GMTrace.i(11358980538368L, 84631);
    at.AR();
    boolean bool = bg.a((Boolean)com.tencent.mm.y.c.xh().get(348162, null), false);
    at.AR();
    Object localObject;
    if ((!bg.a((Boolean)com.tencent.mm.y.c.xh().get(w.a.vpY, null), false)) && (bool))
    {
      at.AR();
      localObject = com.tencent.mm.y.c.xh().get(348163, null);
      if ((localObject == null) || (!(localObject instanceof Long))) {
        break label402;
      }
    }
    label402:
    for (long l = ((Long)localObject).longValue();; l = 0L)
    {
      int i;
      if (System.currentTimeMillis() - l > 3600000L) {
        i = 1;
      }
      while (i != 0)
      {
        w.i("MicroMsg.emoji.EmojiPostTaskListener", "[cpan] start do backup emoji.");
        localObject = (ArrayList)h.arl().kjy.bUW();
        if (((ArrayList)localObject).size() <= 0)
        {
          w.i("MicroMsg.emoji.EmojiPostTaskListener", "[cpan] no local emoji need not to backup ");
          at.AR();
          com.tencent.mm.y.c.xh().set(348162, Boolean.valueOf(false));
          GMTrace.o(11358980538368L, 84631);
          return;
          i = 0;
          continue;
          i = 0;
        }
        else
        {
          at.AR();
          com.tencent.mm.y.c.xh().set(348163, Long.valueOf(System.currentTimeMillis()));
          w.i("MicroMsg.emoji.EmojiPostTaskListener", "[cpan] start backup local emoji ");
          if (((ArrayList)localObject).size() > 50)
          {
            int k = ((ArrayList)localObject).size();
            int m = k / 50;
            w.i("MicroMsg.emoji.EmojiPostTaskListener", "count:%d", new Object[] { Integer.valueOf(m) });
            i = 0;
            if (i <= m)
            {
              ArrayList localArrayList = new ArrayList();
              int n = i * 50;
              if ((i + 1) * 50 - 1 >= k) {}
              for (int j = k;; j = (i + 1) * 50)
              {
                w.i("MicroMsg.emoji.EmojiPostTaskListener", "start index:%d to index:%d", new Object[] { Integer.valueOf(n), Integer.valueOf(j) });
                if (j > n)
                {
                  localArrayList.addAll(((ArrayList)localObject).subList(n, j));
                  at.wS().a(new com.tencent.mm.plugin.emoji.f.d(localArrayList), 0);
                }
                i += 1;
                break;
              }
            }
            GMTrace.o(11358980538368L, 84631);
            return;
          }
          at.wS().a(new com.tencent.mm.plugin.emoji.f.d((ArrayList)localObject), 0);
        }
      }
      GMTrace.o(11358980538368L, 84631);
      return;
    }
  }
  
  public static void dM(boolean paramBoolean)
  {
    GMTrace.i(11358712102912L, 84629);
    at.AR();
    Object localObject = com.tencent.mm.y.c.xh().get(w.a.vpZ, null);
    if ((localObject != null) && ((localObject instanceof Long))) {}
    for (long l = ((Long)localObject).longValue();; l = 0L)
    {
      int i;
      if (System.currentTimeMillis() - l > 86400000L) {
        i = 1;
      }
      while ((i != 0) || (paramBoolean))
      {
        boolean bool = h.arl().kjz.bUI();
        w.i("MicroMsg.emoji.EmojiPostTaskListener", "uploadStoreEmoji need upload:%b", new Object[] { Boolean.valueOf(bool) });
        if ((bool) || (paramBoolean))
        {
          localObject = new s(h.arl().kjz.bUK(), 1);
          at.wS().a((k)localObject, 0);
          GMTrace.o(11358712102912L, 84629);
          return;
          i = 0;
        }
        else
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vqc, Boolean.valueOf(true));
        }
      }
      GMTrace.o(11358712102912L, 84629);
      return;
    }
  }
  
  public static void dN(boolean paramBoolean)
  {
    GMTrace.i(11358846320640L, 84630);
    at.AR();
    Object localObject;
    if (bg.a((Boolean)com.tencent.mm.y.c.xh().get(348165, null), false))
    {
      at.AR();
      localObject = com.tencent.mm.y.c.xh().get(348166, null);
      if ((localObject == null) || (!(localObject instanceof Long))) {
        break label286;
      }
    }
    label259:
    label286:
    for (long l = ((Long)localObject).longValue();; l = 0L)
    {
      int i;
      if (System.currentTimeMillis() - l > 3600000L) {
        i = 1;
      }
      while ((i != 0) || (paramBoolean))
      {
        localObject = h.arl().kjy.bVa();
        if (((ArrayList)localObject).size() <= 0) {
          break label259;
        }
        w.i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji uploadEmojiList:%d", new Object[] { Integer.valueOf(((ArrayList)localObject).size()) });
        ArrayList localArrayList = new ArrayList();
        int j = ((ArrayList)localObject).size();
        i = 0;
        for (;;)
        {
          if (i < j)
          {
            localArrayList.add(new com.tencent.mm.plugin.emoji.sync.a.d((String)((ArrayList)localObject).get(i)));
            w.i("MicroMsg.emoji.EmojiPostTaskListener", "try to sync emoji upload Emoji:%s", new Object[] { ((ArrayList)localObject).get(i) });
            i += 1;
            continue;
            i = 0;
            break;
            i = 0;
            break;
          }
        }
        h.ari().kmc.ar(localArrayList);
        h.ari().kmc.arG();
      }
      for (;;)
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(348166, Long.valueOf(System.currentTimeMillis()));
        GMTrace.o(11358846320640L, 84630);
        return;
        w.i("MicroMsg.emoji.EmojiPostTaskListener", "no things need to upload.");
        at.AR();
        com.tencent.mm.y.c.xh().set(348165, Boolean.valueOf(false));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */