package com.tencent.mm.plugin.appbrand.n;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  public static LinkedList<b> fMv;
  private static HashSet<a> iGh;
  private static boolean iGi;
  private static boolean iGj;
  
  static
  {
    GMTrace.i(20048907337728L, 149376);
    fMv = new LinkedList();
    iGh = new HashSet();
    iGi = false;
    iGj = false;
    GMTrace.o(20048907337728L, 149376);
  }
  
  protected static String a(au paramau, boolean paramBoolean, String paramString)
  {
    GMTrace.i(21064532885504L, 156943);
    if (paramau.field_isSend == 1)
    {
      paramau = com.tencent.mm.y.q.zE();
      GMTrace.o(21064532885504L, 156943);
      return paramau;
    }
    String str = null;
    if (paramBoolean) {
      str = bc.gP(paramau.field_content);
    }
    if (bg.nm(str)) {}
    for (;;)
    {
      GMTrace.o(21064532885504L, 156943);
      return paramString;
      paramString = str;
    }
  }
  
  public static void a(String paramString, a parama)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(21064398667776L, 156942);
        if (iGi)
        {
          iGh.add(parama);
          GMTrace.o(21064398667776L, 156942);
          return;
        }
        if (iGj)
        {
          parama.s(fMv);
          GMTrace.o(21064398667776L, 156942);
          continue;
        }
        iGi = true;
      }
      finally {}
      iGh.add(parama);
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20047833595904L, 149368);
          a.fMv.clear();
          if (s.eb(this.fTa)) {}
          label621:
          Object localObject2;
          for (com.tencent.mm.storage.q localq = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT().gC(this.fTa);; localObject2 = null)
          {
            int i = 100;
            int j = 0;
            Cursor localCursor;
            if ((i >= 100) && (a.fMv.size() < this.iGl))
            {
              localCursor = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().bm(this.fTa, j);
              if (localCursor == null) {}
            }
            for (;;)
            {
              try
              {
                i = localCursor.getCount();
                Object localObject4;
                if ((localCursor != null) && (localCursor.moveToNext()))
                {
                  localObject4 = new au();
                  ((au)localObject4).C(localCursor.getLong(0));
                  ((au)localObject4).D(localCursor.getLong(1));
                  ((au)localObject4).E(localCursor.getLong(2));
                  ((au)localObject4).setContent(localCursor.getString(3));
                  ((au)localObject4).dC(localCursor.getInt(4));
                  localObject3 = ((ce)localObject4).field_content;
                  if (localObject3 == null) {
                    continue;
                  }
                  Object localObject5 = f.a.eS((String)localObject3);
                  if ((localObject5 == null) || (!a.jK(((f.a)localObject5).type))) {
                    continue;
                  }
                  String str = a.a((au)localObject4, s.eb(this.fTa), this.fTa);
                  Object localObject6 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(str);
                  localObject3 = "";
                  if (localq != null) {
                    localObject3 = localq.fs(str);
                  }
                  localObject4 = new b(((ce)localObject4).field_createTime, ((f.a)localObject5).type, ((f.a)localObject5).title, ((ce)localObject4).field_msgId, ((com.tencent.mm.g.b.af)localObject6).field_username, ((x)localObject6).vj(), ((com.tencent.mm.g.b.af)localObject6).field_conRemark, (String)localObject3, bg.aq(((f.a)localObject5).gkS, ((f.a)localObject5).appId), (f.a)localObject5, ((ce)localObject4).field_msgSvrId);
                  localObject3 = a.fMv.iterator();
                  if (!((Iterator)localObject3).hasNext()) {
                    break label621;
                  }
                  localObject6 = (b)((Iterator)localObject3).next();
                  if (!bg.eW(((b)localObject4).gkS, ((b)localObject6).gkS)) {
                    continue;
                  }
                  k = 1;
                  if (k == 0)
                  {
                    ((b)localObject4).desc = ((f.a)localObject5).title;
                    localObject5 = ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(((b)localObject4).eRj.gkR);
                    if (localObject5 != null)
                    {
                      localObject3 = ((WxaAttributes)localObject5).field_nickname;
                      ((b)localObject4).title = ((String)localObject3);
                      if (localObject5 == null) {
                        continue;
                      }
                      localObject3 = ((WxaAttributes)localObject5).field_brandIconURL;
                      ((b)localObject4).imagePath = ((String)localObject3);
                      a.fMv.add(localObject4);
                    }
                  }
                  else
                  {
                    k = a.fMv.size();
                    int m = this.iGl;
                    if (k < m) {
                      continue;
                    }
                  }
                }
                else
                {
                  if (localCursor != null) {
                    localCursor.close();
                  }
                  j += i;
                  break;
                  i = 0;
                  continue;
                }
                Object localObject3 = ((b)localObject4).eRj.eTp;
                continue;
                localObject3 = ((b)localObject4).eRj.gla;
                continue;
              }
              finally
              {
                if (localCursor != null) {
                  localCursor.close();
                }
              }
              tmp586_583[0] = Integer.valueOf(a.fMv.size());
              w.i("MicroMsg.AppBrandHistoryListLogic", "[loadData] data:%s", tmp586_583);
              com.tencent.mm.sdk.platformtools.af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20048102031360L, 149370);
                  a.done();
                  GMTrace.o(20048102031360L, 149370);
                }
              });
              GMTrace.o(20047833595904L, 149368);
              return;
              int k = 0;
            }
          }
        }
      });
      GMTrace.o(21064398667776L, 156942);
    }
  }
  
  public static void done()
  {
    try
    {
      GMTrace.i(20048504684544L, 149373);
      w.i("MicroMsg.AppBrandHistoryListLogic", "done");
      iGj = true;
      iGi = false;
      Iterator localIterator = iGh.iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala != null) {
          locala.s(fMv);
        }
      }
      iGh.clear();
    }
    finally {}
    GMTrace.o(20048504684544L, 149373);
  }
  
  public static boolean jK(int paramInt)
  {
    GMTrace.i(20048638902272L, 149374);
    if ((33 == paramInt) || (36 == paramInt))
    {
      GMTrace.o(20048638902272L, 149374);
      return true;
    }
    GMTrace.o(20048638902272L, 149374);
    return false;
  }
  
  public static void reset()
  {
    try
    {
      GMTrace.i(20048236249088L, 149371);
      iGi = false;
      iGj = false;
      fMv.clear();
      iGh.clear();
      GMTrace.o(20048236249088L, 149371);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static abstract interface a
  {
    public abstract void s(LinkedList<b> paramLinkedList);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\n\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */