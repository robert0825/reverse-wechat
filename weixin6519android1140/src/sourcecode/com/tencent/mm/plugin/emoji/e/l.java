package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.a.ms;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.f;
import com.tencent.mm.storage.emotion.j;
import com.tencent.mm.storage.emotion.n;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.storage.emotion.r;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class l
{
  private static int eZs;
  public static boolean kjJ;
  public static boolean kjK;
  public static boolean kjL;
  public static boolean kjM;
  public static ArrayList<EmojiGroupInfo> kjN;
  public static HashMap<String, ArrayList<EmojiInfo>> kjO;
  public com.tencent.mm.storage.emotion.c kjA;
  public p kjB;
  public j kjC;
  public com.tencent.mm.storage.emotion.l kjD;
  public com.tencent.mm.storage.emotion.h kjE;
  public n kjF;
  r kjG;
  com.tencent.mm.storage.emotion.t kjH;
  f kjI;
  public final j.a kjP;
  public final j.a kjQ;
  public final j.a kjR;
  public final com.tencent.mm.sdk.b.c kjS;
  public com.tencent.mm.storage.emotion.d kjy;
  public com.tencent.mm.storage.emotion.a kjz;
  
  static
  {
    GMTrace.i(11564333662208L, 86161);
    kjJ = false;
    kjK = false;
    kjL = false;
    kjM = false;
    kjN = new ArrayList();
    kjO = new HashMap();
    eZs = -1;
    GMTrace.o(11564333662208L, 86161);
  }
  
  public l()
  {
    GMTrace.i(11563931009024L, 86158);
    this.kjP = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(11544066785280L, 86010);
        if ((!bg.nm(paramAnonymousString)) && (paramAnonymousString.equals("event_update_group")))
        {
          w.d("MicroMsg.emoji.EmojiStorageMgr", "onNotifyChange event:%s", new Object[] { (String)paramAnonymousl.obj });
          if (!com.tencent.mm.kernel.h.xw().wL())
          {
            GMTrace.o(11544066785280L, 86010);
            return;
          }
          com.tencent.mm.plugin.emoji.model.h.arg().aqs();
        }
        if ((!bg.nm(paramAnonymousString)) && ((paramAnonymousString.equals("event_update_group")) || (paramAnonymousString.equalsIgnoreCase("productID"))))
        {
          w.d("MicroMsg.emoji.EmojiStorageMgr", "modify emoji gorup .");
          l.kjJ = true;
          l.kjM = true;
        }
        GMTrace.o(11544066785280L, 86010);
      }
    };
    this.kjQ = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(11554267332608L, 86086);
        com.tencent.mm.plugin.emoji.model.h.arg().aqs();
        GMTrace.o(11554267332608L, 86086);
      }
    };
    this.kjR = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(11556683251712L, 86104);
        if (paramAnonymousString == null)
        {
          GMTrace.o(11556683251712L, 86104);
          return;
        }
        if (paramAnonymousString.equalsIgnoreCase("delete_emoji_info_notify"))
        {
          l.kjK = true;
          GMTrace.o(11556683251712L, 86104);
          return;
        }
        paramAnonymousString = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramAnonymousString);
        if ((paramAnonymousString != null) && (paramAnonymousString.field_catalog == EmojiInfo.vCu)) {
          l.kjK = true;
        }
        GMTrace.o(11556683251712L, 86104);
      }
    };
    this.kjS = new com.tencent.mm.sdk.b.c() {};
    at.AR();
    this.kjy = new com.tencent.mm.storage.emotion.d(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjz = new com.tencent.mm.storage.emotion.a(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjA = new com.tencent.mm.storage.emotion.c(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjC = new j(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjD = new com.tencent.mm.storage.emotion.l(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjE = new com.tencent.mm.storage.emotion.h(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjB = new p(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjF = new n(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjG = new r(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjH = new com.tencent.mm.storage.emotion.t(com.tencent.mm.y.c.yH());
    at.AR();
    this.kjI = new f(com.tencent.mm.y.c.yH());
    GMTrace.o(11563931009024L, 86158);
  }
  
  public final com.tencent.mm.storage.emotion.d afO()
  {
    GMTrace.i(15572611891200L, 116025);
    com.tencent.mm.storage.emotion.d locald = this.kjy;
    GMTrace.o(15572611891200L, 116025);
    return locald;
  }
  
  public final ArrayList<EmojiGroupInfo> aqG()
  {
    GMTrace.i(19274873700352L, 143609);
    if (kjN == null) {
      kjN = new ArrayList();
    }
    if ((kjN.size() == 0) || (kjJ))
    {
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable()) {
        break label77;
      }
    }
    label77:
    for (kjN = this.kjz.bUE();; kjN = (ArrayList)this.kjz.bUw())
    {
      kjJ = false;
      ArrayList localArrayList = kjN;
      GMTrace.o(19274873700352L, 143609);
      return localArrayList;
    }
  }
  
  public final int aqH()
  {
    GMTrace.i(19275007918080L, 143610);
    if ((eZs == -1) || (kjM)) {
      eZs = this.kjz.bUA();
    }
    int i = eZs;
    GMTrace.o(19275007918080L, 143610);
    return i;
  }
  
  public final ArrayList<EmojiInfo> aqI()
  {
    GMTrace.i(11564199444480L, 86160);
    if (kjO == null) {
      kjO = new HashMap();
    }
    if ((!kjO.containsKey("custom")) || (kjK)) {
      kjO.put("custom", (ArrayList)this.kjy.bUV());
    }
    kjK = false;
    ArrayList localArrayList = (ArrayList)kjO.get("custom");
    GMTrace.o(11564199444480L, 86160);
    return localArrayList;
  }
  
  public final void aqP()
  {
    GMTrace.i(11564065226752L, 86159);
    Object localObject1 = ab.getContext();
    boolean bool;
    if (localObject1 != null)
    {
      at.AR();
      bool = ((Boolean)com.tencent.mm.y.c.xh().get(274480, Boolean.valueOf(true))).booleanValue();
      w.i("MicroMsg.emoji.EmojiStorageMgr", "[oneliang]initCore,need init emoji:%s", new Object[] { String.valueOf(bool) });
      if (bool)
      {
        this.kjy.eR((Context)localObject1);
        this.kjz.eR((Context)localObject1);
      }
      at.AR();
      com.tencent.mm.y.c.xh().set(274480, Boolean.valueOf(false));
    }
    at.AR();
    if (((Integer)com.tencent.mm.y.c.xh().get(w.a.vqo, Integer.valueOf(0))).intValue() != com.tencent.mm.protocal.d.tJC)
    {
      l1 = System.currentTimeMillis();
      com.tencent.mm.plugin.emoji.model.h.arl().kjz.bUM();
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vqo, Integer.valueOf(com.tencent.mm.protocal.d.tJC));
      w.i("MicroMsg.emoji.EmojiStorageMgr", "recoverCustomEmojiGroup use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    }
    at.AR();
    long l2;
    Object localObject2;
    if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vqp, Boolean.valueOf(true))).booleanValue())
    {
      l2 = System.currentTimeMillis();
      localObject2 = com.tencent.mm.plugin.emoji.model.h.arl().kjz;
      if (!(((com.tencent.mm.storage.emotion.a)localObject2).fTZ instanceof g)) {
        break label494;
      }
      localObject1 = (g)((com.tencent.mm.storage.emotion.a)localObject2).fTZ;
    }
    for (long l1 = ((g)localObject1).cE(Thread.currentThread().getId());; l1 = -1L)
    {
      Object localObject3 = ((com.tencent.mm.storage.emotion.a)localObject2).bUz();
      if (!((ArrayList)localObject3).isEmpty())
      {
        localObject3 = ((ArrayList)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)((Iterator)localObject3).next();
          if ((localEmojiGroupInfo != null) && (!bg.nm(localEmojiGroupInfo.field_productID)))
          {
            i = ((com.tencent.mm.storage.emotion.a)localObject2).vZ(localEmojiGroupInfo.field_productID);
            if (localEmojiGroupInfo.field_count != i)
            {
              localEmojiGroupInfo.field_count = i;
              ((com.tencent.mm.storage.emotion.a)localObject2).fTZ.update("EmojiGroupInfo", localEmojiGroupInfo.qL(), "productID=?", new String[] { localEmojiGroupInfo.field_productID });
            }
          }
        }
      }
      if (localObject1 != null) {}
      for (int i = ((g)localObject1).aL(l1);; i = -1)
      {
        ((com.tencent.mm.storage.emotion.a)localObject2).a("event_update_group", 0, bg.bQW().toString());
        if (i >= 0)
        {
          i = 1;
          at.AR();
          localObject1 = com.tencent.mm.y.c.xh();
          localObject2 = w.a.vqp;
          if (i != 0) {
            break label484;
          }
        }
        label484:
        for (bool = true;; bool = false)
        {
          ((com.tencent.mm.storage.t)localObject1).a((w.a)localObject2, Boolean.valueOf(bool));
          w.i("MicroMsg.emoji.EmojiStorageMgr", "updateEmojiGroupCount use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          GMTrace.o(11564065226752L, 86159);
          return;
          i = 0;
          break;
        }
      }
      label494:
      localObject1 = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */