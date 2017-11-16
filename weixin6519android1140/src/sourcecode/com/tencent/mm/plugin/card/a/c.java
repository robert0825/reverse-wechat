package com.tencent.mm.plugin.card.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.card.model.ac;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements e
{
  List<WeakReference<a>> jwK;
  public String jwL;
  public LinkedList<String> jwM;
  public int jwN;
  private int jwO;
  private int jwP;
  private int jwQ;
  private int jwR;
  private boolean jwS;
  private aj jwT;
  private aj jwU;
  
  public c()
  {
    GMTrace.i(5125238161408L, 38186);
    this.jwK = new ArrayList();
    this.jwL = "";
    this.jwM = new LinkedList();
    this.jwR = 60;
    this.jwS = false;
    this.jwT = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5117185097728L, 38126);
        w.i("MicroMsg.CardCodeMgr", "onTimerExpired, do request code");
        c.this.tK(c.this.jwL);
        c.this.ajJ();
        GMTrace.o(5117185097728L, 38126);
        return true;
      }
    }, false);
    this.jwU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(5115708702720L, 38115);
        w.i("MicroMsg.CardCodeMgr", "onTimerExpired, do refresh code one minute");
        c localc = c.this;
        w.i("MicroMsg.CardCodeMgr", "onCodeChange()");
        if (localc.jwK != null)
        {
          int i = 0;
          while (i < localc.jwK.size())
          {
            Object localObject = (WeakReference)localc.jwK.get(i);
            if (localObject != null)
            {
              localObject = (c.a)((WeakReference)localObject).get();
              if (localObject != null) {
                ((c.a)localObject).ajN();
              }
            }
            i += 1;
          }
        }
        c.this.ajL();
        GMTrace.o(5115708702720L, 38115);
        return true;
      }
    }, false);
    GMTrace.o(5125238161408L, 38186);
  }
  
  private void ajK()
  {
    GMTrace.i(5126580338688L, 38196);
    w.i("MicroMsg.CardCodeMgr", "stopRequestCodeTimer!");
    if (!this.jwT.bQn()) {
      this.jwT.stopTimer();
    }
    GMTrace.o(5126580338688L, 38196);
  }
  
  private void onSuccess()
  {
    GMTrace.i(5125775032320L, 38190);
    w.i("MicroMsg.CardCodeMgr", "onSuccess()");
    if (this.jwK == null)
    {
      GMTrace.o(5125775032320L, 38190);
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
          ((a)localObject).onSuccess();
        }
      }
      i += 1;
    }
    GMTrace.o(5125775032320L, 38190);
  }
  
  private void tJ(String paramString)
  {
    GMTrace.i(5125909250048L, 38191);
    w.i("MicroMsg.CardCodeMgr", "onFail()");
    if (this.jwK == null)
    {
      GMTrace.o(5125909250048L, 38191);
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
          ((a)localObject).tJ(paramString);
        }
      }
      i += 1;
    }
    GMTrace.o(5125909250048L, 38191);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5126311903232L, 38194);
    w.i("MicroMsg.CardCodeMgr", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof ac))
      {
        this.jwS = false;
        w.e("MicroMsg.CardCodeMgr", "get codes success for card id " + this.jwL);
        paramString = (ac)paramk;
        this.jwO = paramString.jwO;
        this.jwP = paramString.jwP;
        this.jwQ = paramString.jwQ;
        if (paramString.jwM != null)
        {
          this.jwM.clear();
          this.jwM.addAll(paramString.jwM);
          this.jwN = 0;
        }
        onSuccess();
        ajJ();
        if (this.jwQ != 0) {
          ajL();
        }
        GMTrace.o(5126311903232L, 38194);
      }
    }
    else if ((paramk instanceof ac))
    {
      this.jwS = false;
      w.e("MicroMsg.CardCodeMgr", "get codes failed  for card id " + this.jwL);
      tJ(paramString);
    }
    GMTrace.o(5126311903232L, 38194);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(5125506596864L, 38188);
    if (this.jwK == null) {
      this.jwK = new ArrayList();
    }
    if (parama != null) {
      this.jwK.add(new WeakReference(parama));
    }
    GMTrace.o(5125506596864L, 38188);
  }
  
  public final void ajJ()
  {
    GMTrace.i(5126446120960L, 38195);
    ajK();
    w.i("MicroMsg.CardCodeMgr", "startRequestCodeTimer() request_time:" + this.jwO);
    if ((this.jwO > 0) && (!TextUtils.isEmpty(this.jwL)))
    {
      aj localaj = this.jwT;
      long l = this.jwO * 1000;
      localaj.z(l, l);
      w.i("MicroMsg.CardCodeMgr", "start request code timer!");
      GMTrace.o(5126446120960L, 38195);
      return;
    }
    w.e("MicroMsg.CardCodeMgr", "not to start request code timer!");
    GMTrace.o(5126446120960L, 38195);
  }
  
  public final void ajL()
  {
    GMTrace.i(5126714556416L, 38197);
    ajM();
    w.i("MicroMsg.CardCodeMgr", "startRefreshCodeTimer() refresh_interval:" + this.jwQ);
    if (this.jwQ > 0)
    {
      localaj = this.jwU;
      l = this.jwQ * 1000;
      localaj.z(l, l);
      w.i("MicroMsg.CardCodeMgr", "start refresh code timer!");
      GMTrace.o(5126714556416L, 38197);
      return;
    }
    aj localaj = this.jwU;
    long l = this.jwR * 1000;
    localaj.z(l, l);
    w.e("MicroMsg.CardCodeMgr", "not to start refresh code timer!");
    GMTrace.o(5126714556416L, 38197);
  }
  
  public final void ajM()
  {
    GMTrace.i(5126848774144L, 38198);
    w.i("MicroMsg.CardCodeMgr", "stopRefreshCodeTimer()!");
    if (!this.jwU.bQn()) {
      this.jwU.stopTimer();
    }
    GMTrace.o(5126848774144L, 38198);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(5125640814592L, 38189);
    if ((this.jwK == null) || (parama == null))
    {
      GMTrace.o(5125640814592L, 38189);
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
          GMTrace.o(5125640814592L, 38189);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(5125640814592L, 38189);
  }
  
  public final String getCode()
  {
    GMTrace.i(19559012630528L, 145726);
    if ((this.jwM == null) || (this.jwM.size() == 0))
    {
      w.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
      GMTrace.o(19559012630528L, 145726);
      return "";
    }
    if (this.jwN >= this.jwM.size())
    {
      w.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
      tK(this.jwL);
      GMTrace.o(19559012630528L, 145726);
      return "";
    }
    if (this.jwP >= this.jwM.size() - this.jwN)
    {
      w.i("MicroMsg.CardCodeMgr", "do request code, because the request_count >= than (codes.size() - show_count)");
      tK(this.jwL);
    }
    w.i("MicroMsg.CardCodeMgr", "getCode, show_count:" + this.jwN + " request_count:" + this.jwP + " codes size:" + this.jwM.size());
    Object localObject = this.jwM;
    int i = this.jwN;
    this.jwN = (i + 1);
    localObject = (String)((LinkedList)localObject).get(i);
    GMTrace.o(19559012630528L, 145726);
    return (String)localObject;
  }
  
  public final boolean isEmpty()
  {
    GMTrace.i(5126043467776L, 38192);
    if ((this.jwM == null) || (this.jwM.size() == 0))
    {
      w.e("MicroMsg.CardCodeMgr", "getCode, codes is empty");
      GMTrace.o(5126043467776L, 38192);
      return true;
    }
    if (this.jwN >= this.jwM.size())
    {
      w.e("MicroMsg.CardCodeMgr", "getCode, all codes has show! ");
      GMTrace.o(5126043467776L, 38192);
      return true;
    }
    GMTrace.o(5126043467776L, 38192);
    return false;
  }
  
  public final void release()
  {
    GMTrace.i(5125372379136L, 38187);
    at.wS().b(577, this);
    this.jwM.clear();
    this.jwS = false;
    this.jwL = "";
    this.jwN = 0;
    this.jwO = 0;
    this.jwP = 0;
    this.jwQ = 0;
    ajK();
    ajM();
    GMTrace.o(5125372379136L, 38187);
  }
  
  public final void tK(String paramString)
  {
    GMTrace.i(5126177685504L, 38193);
    if (this.jwS)
    {
      w.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), is doing get codes");
      GMTrace.o(5126177685504L, 38193);
      return;
    }
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.CardCodeMgr", "doGetCardCodes(), mCardId is empty!");
      GMTrace.o(5126177685504L, 38193);
      return;
    }
    w.i("MicroMsg.CardCodeMgr", "doGetCardCodes() do get codes, card id " + paramString);
    this.jwS = true;
    this.jwL = paramString;
    paramString = new ac(this.jwL);
    at.wS().a(paramString, 0);
    GMTrace.o(5126177685504L, 38193);
  }
  
  public static abstract interface a
  {
    public abstract void ajN();
    
    public abstract void onSuccess();
    
    public abstract void tJ(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */