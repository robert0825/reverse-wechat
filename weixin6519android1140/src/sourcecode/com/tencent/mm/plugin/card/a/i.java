package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.k.c;
import com.tencent.mm.k.g;
import com.tencent.mm.plugin.card.sharecard.model.f;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class i
  implements e
{
  private List<WeakReference<a>> jwK;
  public ArrayList<String> jxk;
  public ArrayList<String> jxl;
  public ae jxm;
  public HashMap<String, Runnable> jxn;
  
  public i()
  {
    GMTrace.i(5117721968640L, 38130);
    this.jwK = new ArrayList();
    this.jxk = new ArrayList();
    this.jxl = new ArrayList();
    this.jxm = new ae();
    this.jxn = new LinkedHashMap();
    at.wS().a(907, this);
    this.jxk.clear();
    this.jxl.clear();
    this.jxn.clear();
    GMTrace.o(5117721968640L, 38130);
  }
  
  private void a(String paramString, b paramb)
  {
    GMTrace.i(5118124621824L, 38133);
    w.i("MicroMsg.CardMarkCodeMgr", "markSuccess()");
    if (this.jwK == null)
    {
      GMTrace.o(5118124621824L, 38133);
      return;
    }
    if ((!this.jxk.contains(paramString)) && (!this.jxl.contains(paramString)))
    {
      w.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card id is not in mark list and un mark list.");
      GMTrace.o(5118124621824L, 38133);
      return;
    }
    int i = 0;
    if (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null)
        {
          if (!this.jxk.contains(paramString)) {
            break label146;
          }
          ((a)localObject).b(paramString, paramb);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        label146:
        if (this.jxl.contains(paramString)) {
          ((a)localObject).tP(paramString);
        }
      }
    }
    GMTrace.o(5118124621824L, 38133);
  }
  
  private void by(String paramString1, String paramString2)
  {
    GMTrace.i(5118258839552L, 38134);
    w.i("MicroMsg.CardMarkCodeMgr", "onMarkFail()");
    if (this.jwK == null)
    {
      GMTrace.o(5118258839552L, 38134);
      return;
    }
    if ((!this.jxk.contains(paramString1)) || (this.jxl.contains(paramString1)))
    {
      w.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card is not in mark list");
      GMTrace.o(5118258839552L, 38134);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).bz(paramString1, paramString2);
        }
      }
      i += 1;
    }
    GMTrace.o(5118258839552L, 38134);
  }
  
  public static void f(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5118929928192L, 38139);
    if (TextUtils.isEmpty(paramString))
    {
      w.i("MicroMsg.CardMarkCodeMgr", "card_id is empty, don't call NetSceneMarkShareCard cgi");
      GMTrace.o(5118929928192L, 38139);
      return;
    }
    w.i("MicroMsg.CardMarkCodeMgr", "doMarkNetscene()");
    paramString = new f(paramString, paramInt1, paramInt2, paramInt3);
    at.wS().a(paramString, 0);
    GMTrace.o(5118929928192L, 38139);
  }
  
  private void tN(String paramString)
  {
    GMTrace.i(5118393057280L, 38135);
    w.i("MicroMsg.CardMarkCodeMgr", "removeId()");
    if ((this.jxk.contains(paramString)) && (!this.jxl.contains(paramString)))
    {
      this.jxk.remove(paramString);
      w.i("MicroMsg.CardMarkCodeMgr", "remove mark card id in mMarkList. card is " + paramString);
    }
    if ((!this.jxk.contains(paramString)) && (this.jxl.contains(paramString)))
    {
      this.jxl.remove(paramString);
      Runnable localRunnable = (Runnable)this.jxn.get(paramString);
      this.jxn.remove(paramString);
      this.jxm.removeCallbacks(localRunnable);
      w.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + paramString);
      w.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + paramString);
    }
    GMTrace.o(5118393057280L, 38135);
  }
  
  private void tO(String paramString)
  {
    GMTrace.i(5118527275008L, 38136);
    w.i("MicroMsg.CardMarkCodeMgr", "cancelUnmark()");
    if (this.jxl.contains(paramString))
    {
      this.jxl.remove(paramString);
      w.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + paramString);
    }
    if (this.jxn.containsKey(paramString))
    {
      w.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + paramString);
      Runnable localRunnable = (Runnable)this.jxn.get(paramString);
      this.jxn.remove(paramString);
      this.jxm.removeCallbacks(localRunnable);
    }
    GMTrace.o(5118527275008L, 38136);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5119064145920L, 38140);
    w.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof f))
      {
        paramString = (f)paramk;
        paramk = new b();
        paramk.jxs = paramString.jxs;
        paramk.jxt = paramString.jxt;
        paramk.jxu = paramString.jxu;
        paramk.jxv = paramString.jxv;
        paramk.jxw = paramString.jxw;
        w.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markSuccess original_card_id = " + paramString.jAZ);
        w.i("MicroMsg.CardMarkCodeMgr", "mark_user:" + paramk.jxs + " mark_succ:" + paramk.jxt + " mark_card_id:" + paramk.jxu + " expire_time:" + paramk.jxv + " pay_qrcode_wording:" + paramk.jxw);
        a(paramString.jAZ, paramk);
        tN(paramString.jAZ);
        GMTrace.o(5119064145920L, 38140);
      }
    }
    else if ((paramk instanceof f))
    {
      paramk = (f)paramk;
      w.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markFail original_card_id = " + paramk.jAZ);
      by(paramk.jAZ, paramString);
      tN(paramk.jAZ);
    }
    GMTrace.o(5119064145920L, 38140);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(5117856186368L, 38131);
    if (this.jwK == null) {
      this.jwK = new ArrayList();
    }
    if (parama != null) {
      this.jwK.add(new WeakReference(parama));
    }
    GMTrace.o(5117856186368L, 38131);
  }
  
  public final void aG(final String paramString, final int paramInt)
  {
    GMTrace.i(5118795710464L, 38138);
    w.i("MicroMsg.CardMarkCodeMgr", "doUnmarkCode()");
    tO(paramString);
    this.jxl.add(paramString);
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5119466799104L, 38143);
        i.f(paramString, this.jxp, this.jxq, paramInt);
        w.i("MicroMsg.CardMarkCodeMgr", "run the unmark task, the card is " + paramString + " system.time:" + System.currentTimeMillis());
        GMTrace.o(5119466799104L, 38143);
      }
    };
    paramInt = bg.getInt(g.uu().z("ShareCard", "UnMarkDelay"), 0);
    this.jxm.postDelayed(local1, paramInt * 1000);
    this.jxn.put(paramString, local1);
    w.i("MicroMsg.CardMarkCodeMgr", "add unmark card mask id in mId2Runner. card is " + paramString + " system.time:" + System.currentTimeMillis());
    GMTrace.o(5118795710464L, 38138);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(5117990404096L, 38132);
    if ((this.jwK == null) || (parama == null))
    {
      GMTrace.o(5117990404096L, 38132);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      WeakReference localWeakReference = (WeakReference)this.jwK.get(i);
      if (localWeakReference != null)
      {
        a locala = (a)localWeakReference.get();
        if ((locala != null) && (locala.equals(parama)))
        {
          this.jwK.remove(localWeakReference);
          GMTrace.o(5117990404096L, 38132);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(5117990404096L, 38132);
  }
  
  public final void y(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(5118661492736L, 38137);
    w.i("MicroMsg.CardMarkCodeMgr", "doMarkCode()");
    tO(paramString);
    if (!this.jxk.contains(paramString)) {
      this.jxk.add(paramString);
    }
    f(paramString, paramInt1, 1, paramInt2);
    GMTrace.o(5118661492736L, 38137);
  }
  
  public static abstract interface a
  {
    public abstract void b(String paramString, i.b paramb);
    
    public abstract void bz(String paramString1, String paramString2);
    
    public abstract void tP(String paramString);
  }
  
  public static final class b
  {
    public String jxs;
    public int jxt;
    public String jxu;
    public int jxv;
    public String jxw;
    
    public b()
    {
      GMTrace.i(5128325169152L, 38209);
      this.jxt = 0;
      GMTrace.o(5128325169152L, 38209);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */