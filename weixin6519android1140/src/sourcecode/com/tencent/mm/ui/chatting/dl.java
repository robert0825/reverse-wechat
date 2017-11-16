package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.view.ViewStub;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.ad.n;
import com.tencent.mm.bt.f.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.j.a.b.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class dl
{
  public List<au> jxx;
  ae mHandler;
  ChattingAnimFrame wCc;
  public Activity wCd;
  
  public dl()
  {
    GMTrace.i(2256334225408L, 16811);
    this.wCc = null;
    this.mHandler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(2305860567040L, 17180);
        if ((dl.this.jxx == null) || (!at.AU()))
        {
          GMTrace.o(2305860567040L, 17180);
          return;
        }
        w.d("MicroMsg.EggMgr", "post start egg");
        dl.this.a(dl.this.wCd, dl.this.jxx);
        GMTrace.o(2305860567040L, 17180);
      }
    };
    GMTrace.o(2256334225408L, 16811);
  }
  
  private static void ad(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(2256736878592L, 16814);
    for (;;)
    {
      Object localObject2;
      try
      {
        Object localObject1 = new StringBuilder();
        at.AR();
        localObject1 = com.tencent.mm.a.e.d(com.tencent.mm.y.c.zn() + "eggresult.rep", 0, -1);
        com.tencent.mm.aw.g localg;
        if (localObject1 != null)
        {
          w.d("MicroMsg.EggMgr", "data not null, parse it");
          localObject1 = (com.tencent.mm.aw.h)new com.tencent.mm.aw.h().aD((byte[])localObject1);
          localObject2 = ((com.tencent.mm.aw.h)localObject1).gQb.iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break label319;
          }
          localg = (com.tencent.mm.aw.g)((Iterator)localObject2).next();
          if (localg.gPO != paramInt) {
            continue;
          }
          if (paramBoolean)
          {
            localg.gPZ += 1;
            break label324;
            if (i == 0)
            {
              localObject2 = new com.tencent.mm.aw.g();
              ((com.tencent.mm.aw.g)localObject2).gPO = paramInt;
              if (!paramBoolean) {
                break label310;
              }
              ((com.tencent.mm.aw.g)localObject2).gPZ = 1;
              ((com.tencent.mm.aw.h)localObject1).gQb.add(localObject2);
            }
            localObject2 = ((com.tencent.mm.aw.h)localObject1).toByteArray();
            w.d("MicroMsg.EggMgr", "report list is %s, then save it", new Object[] { localObject1.toString() });
            localObject1 = new StringBuilder();
            at.AR();
            com.tencent.mm.a.e.b(com.tencent.mm.y.c.zn() + "eggresult.rep", (byte[])localObject2, localObject2.length);
            GMTrace.o(2256736878592L, 16814);
          }
        }
        else
        {
          w.d("MicroMsg.EggMgr", "data is null, new one");
          localObject1 = new com.tencent.mm.aw.h();
          continue;
        }
        localg.gQa += 1;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.EggMgr", "statistics crash : %s", new Object[] { localException.getLocalizedMessage() });
        w.printErrStackTrace("MicroMsg.EggMgr", localException, "", new Object[0]);
        GMTrace.o(2256736878592L, 16814);
        return;
      }
      label310:
      ((com.tencent.mm.aw.g)localObject2).gQa = 1;
      continue;
      label319:
      int i = 0;
      continue;
      label324:
      i = 1;
    }
  }
  
  private static boolean ak(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(2256602660864L, 16813);
    if ((com.tencent.mm.platformtools.t.nm(paramString1)) || (com.tencent.mm.platformtools.t.nm(paramString2)) || (ab.getContext() == null))
    {
      GMTrace.o(2256602660864L, 16813);
      return false;
    }
    String str = paramString1.toLowerCase();
    j = str.indexOf(paramString2.toLowerCase());
    int i = j;
    if (j == -1)
    {
      GMTrace.o(2256602660864L, 16813);
      return false;
    }
    do
    {
      for (;;)
      {
        try
        {
          if ((i >= str.length() - 1) || (com.tencent.mm.platformtools.t.nm(paramString3))) {
            continue;
          }
          if ((i <= 0) || (str.charAt(i - 1) < 'a') || (str.charAt(i - 1) > 'z')) {
            continue;
          }
          w.v("MicroMsg.EggMgr", "letter in the prefix");
          localObject = paramString1.substring(0, i);
          int k = ((String)localObject).lastIndexOf('/');
          j = k;
          if (k == -1) {
            continue;
          }
          localObject = ((String)localObject).subSequence(k, ((String)localObject).length());
          com.tencent.mm.bt.g.bRE();
          localObject = com.tencent.mm.bt.f.bRB().Ta((String)localObject);
          if (localObject == null) {
            continue;
          }
          localObject = ((f.a)localObject).text;
          j = k;
          if (com.tencent.mm.platformtools.t.nm((String)localObject)) {
            continue;
          }
          j = k;
          if (((String)localObject).length() + k != i) {
            continue;
          }
          j = -2;
          w.v("MicroMsg.EggMgr", "letter in the prefix is smiley");
        }
        catch (Exception paramString1)
        {
          Object localObject;
          w.v("MicroMsg.EggMgr", "Exception in isKeywordMatch, %s", new Object[] { paramString1.getMessage() });
          w.printErrStackTrace("MicroMsg.EggMgr", paramString1, "", new Object[0]);
          continue;
          boolean bool1 = true;
          continue;
          boolean bool2 = true;
          continue;
          if (j == -2) {
            continue;
          }
          bool1 = false;
          continue;
        }
        bool2 = bool1;
        if (bool1)
        {
          bool2 = bool1;
          if (paramString2.length() + i < str.length())
          {
            bool2 = bool1;
            if (str.charAt(paramString2.length() + i) >= 'a')
            {
              bool2 = bool1;
              if (str.charAt(paramString2.length() + i) <= 'z')
              {
                w.v("MicroMsg.EggMgr", "letter in the suffix");
                bool2 = false;
              }
            }
          }
        }
        if (!bool2) {
          continue;
        }
        w.v("MicroMsg.EggMgr", "full match, matchPos = %s, TextLength = %s, keyLength = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(str.length()), Integer.valueOf(paramString2.length()) });
        GMTrace.o(2256602660864L, 16813);
        return bool2;
        localObject = null;
      }
      j = str.indexOf(paramString2.toLowerCase(), i + 1);
      i = j;
    } while (j != -1);
    GMTrace.o(2256602660864L, 16813);
    return false;
  }
  
  public final void a(Activity paramActivity, List<au> paramList)
  {
    GMTrace.i(2256468443136L, 16812);
    if (paramList == null)
    {
      GMTrace.o(2256468443136L, 16812);
      return;
    }
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      au localau = (au)localIterator1.next();
      at.AR();
      if (com.tencent.mm.platformtools.t.aG(com.tencent.mm.platformtools.t.d((Long)com.tencent.mm.y.c.xh().get(68108, null))) * 1000L > 21600000L) {
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(2295257366528L, 17101);
            if (!at.AU())
            {
              GMTrace.o(2295257366528L, 17101);
              return;
            }
            m localm = new m(37);
            at.wS().a(localm, 0);
            at.AR();
            com.tencent.mm.y.c.xh().set(68108, Long.valueOf(com.tencent.mm.platformtools.t.Pu()));
            GMTrace.o(2295257366528L, 17101);
          }
        }, 10000L);
      }
      paramList = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().aqD();
      int i;
      if (paramList == null)
      {
        w.d("MicroMsg.EggMgr", "eggList is null");
        i = 0;
      }
      while (i != 0)
      {
        GMTrace.o(2256468443136L, 16812);
        return;
        int m = (int)bg.Pu();
        w.d("MicroMsg.EggMgr", "cursecond is %d, getEggList.size is %d", new Object[] { Integer.valueOf(m), Integer.valueOf(paramList.gPX.size()) });
        Iterator localIterator2 = paramList.gPX.iterator();
        for (;;)
        {
          if (localIterator2.hasNext())
          {
            com.tencent.mm.aw.d locald = (com.tencent.mm.aw.d)localIterator2.next();
            paramList = locald.gPR;
            int k = 0;
            label245:
            Iterator localIterator3;
            if (com.tencent.mm.platformtools.t.nm(paramList))
            {
              i = 1;
              if (i == 0) {
                break label348;
              }
              localIterator3 = locald.gPM.iterator();
            }
            String str2;
            for (;;)
            {
              if (!localIterator3.hasNext()) {
                break label477;
              }
              com.tencent.mm.aw.e locale = (com.tencent.mm.aw.e)localIterator3.next();
              str2 = locale.gPW;
              if (com.tencent.mm.platformtools.t.nm(str2))
              {
                w.e("MicroMsg.EggMgr", "error egg keyWord");
                continue;
                paramList = paramList.split(",");
                int n = paramList.length;
                int j = 0;
                for (;;)
                {
                  i = k;
                  if (j >= n) {
                    break label245;
                  }
                  if (paramList[j].equals(v.bPK()))
                  {
                    i = 1;
                    break label245;
                    label348:
                    break;
                  }
                  j += 1;
                }
              }
              else
              {
                String str1 = localau.field_content;
                paramList = str1;
                if (s.eb(localau.field_talker))
                {
                  i = bc.gO(str1);
                  paramList = str1;
                  if (i != -1) {
                    paramList = str1.substring(i + 1).trim();
                  }
                }
                if (ak(paramList, str2, locale.lang))
                {
                  if (this.wCc == null)
                  {
                    paramList = (ViewStub)paramActivity.findViewById(R.h.ckY);
                    if (paramList != null) {
                      paramList.inflate();
                    }
                    this.wCc = ((ChattingAnimFrame)paramActivity.findViewById(R.h.bmm));
                  }
                  if (this.wCc != null) {
                    break label479;
                  }
                  w.e("MicroMsg.EggMgr", "AnimFrameView should not be null");
                }
              }
            }
            label477:
            continue;
            label479:
            boolean bool;
            if ((locald.gPP <= m) && (m <= locald.gPQ + 86400L))
            {
              this.wCc.a(locald);
              i = locald.gPO;
              if (localau.field_isSend == 1) {}
              for (bool = true;; bool = false)
              {
                ad(i, bool);
                w.d("MicroMsg.EggMgr", "match keyWord[%s], time[%d - %d]", new Object[] { str2, Integer.valueOf(locald.gPP), Integer.valueOf(locald.gPQ) });
                i = 1;
                break;
              }
            }
            if ((locald.gPP == locald.gPQ) && (locald.gPP == 0))
            {
              this.wCc.a(locald);
              i = locald.gPO;
              if (localau.field_isSend == 1) {}
              for (bool = true;; bool = false)
              {
                ad(i, bool);
                w.d("MicroMsg.EggMgr", "match keyWord[%s], time[0 - 0]", new Object[] { str2 });
                i = 1;
                break;
              }
            }
            w.d("MicroMsg.EggMgr", "match keyWord[%s], but not match time[%d - %d]", new Object[] { str2, Integer.valueOf(locald.gPP), Integer.valueOf(locald.gPQ) });
            i = 0;
            break;
          }
        }
        w.d("MicroMsg.EggMgr", "no match");
        i = 0;
      }
    }
    GMTrace.o(2256468443136L, 16812);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */