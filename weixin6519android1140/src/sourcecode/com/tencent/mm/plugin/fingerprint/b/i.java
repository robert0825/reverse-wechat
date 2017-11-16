package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lc;
import com.tencent.mm.g.a.lc.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.sdk.b.c<lc>
{
  private String eHG;
  public boolean lkV;
  private a llq;
  public lc llr;
  private j lls;
  private Runnable llt;
  
  public i()
  {
    GMTrace.i(10783186485248L, 80341);
    this.lls = null;
    this.llt = null;
    this.lkV = false;
    this.eHG = "";
    this.vhf = lc.class.getName().hashCode();
    GMTrace.o(10783186485248L, 80341);
  }
  
  public static void azW()
  {
    GMTrace.i(10783454920704L, 80343);
    com.tencent.mm.plugin.fingerprint.a.azq();
    if (com.tencent.mm.plugin.fingerprint.a.azr() != null)
    {
      com.tencent.mm.plugin.fingerprint.a.azq();
      com.tencent.mm.plugin.fingerprint.a.azr();
      c.abort();
      com.tencent.mm.plugin.fingerprint.a.azq();
      com.tencent.mm.plugin.fingerprint.a.azr();
      c.release();
      com.tencent.mm.plugin.fingerprint.a.azq();
      com.tencent.mm.plugin.fingerprint.a.azr();
      if (((k)h.h(k.class)).type() != 2) {
        break label94;
      }
    }
    label94:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.OpenFingerPrintAuthEventListener", "stopIdentify() isSoter: %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(10783454920704L, 80343);
      return;
    }
  }
  
  public final void G(int paramInt, String paramString)
  {
    GMTrace.i(10783723356160L, 80345);
    w.i("MicroMsg.OpenFingerPrintAuthEventListener", "onFail()");
    com.tencent.mm.plugin.fingerprint.a.azq();
    com.tencent.mm.plugin.fingerprint.a.azr();
    lc locallc = this.llr;
    ((k)h.h(k.class)).a(locallc, paramInt, paramString);
    if (this.lkV) {
      this.llr = null;
    }
    w.i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onFail()");
    GMTrace.o(10783723356160L, 80345);
  }
  
  public final boolean eH(boolean paramBoolean)
  {
    GMTrace.i(10783589138432L, 80344);
    azW();
    com.tencent.mm.plugin.fingerprint.a.azq();
    com.tencent.mm.plugin.fingerprint.a.azr();
    if (!c.azy())
    {
      w.e("MicroMsg.OpenFingerPrintAuthEventListener", "no fingerprints enrolled, use settings to enroll fingerprints first");
      release();
      this.lkV = true;
      G(1, "");
      GMTrace.o(10783589138432L, 80344);
      return false;
    }
    com.tencent.mm.plugin.fingerprint.a.azq();
    com.tencent.mm.plugin.fingerprint.a.azr();
    if (c.a(this.llq, paramBoolean) != 0)
    {
      w.e("MicroMsg.OpenFingerPrintAuthEventListener", "failed to start identify");
      release();
      this.lkV = true;
      G(1, "");
      GMTrace.o(10783589138432L, 80344);
      return false;
    }
    w.i("MicroMsg.OpenFingerPrintAuthEventListener", "startIdentify()");
    GMTrace.o(10783589138432L, 80344);
    return true;
  }
  
  public final void release()
  {
    GMTrace.i(10783320702976L, 80342);
    com.tencent.mm.plugin.fingerprint.a.azq();
    if (com.tencent.mm.plugin.fingerprint.a.azr() != null)
    {
      com.tencent.mm.plugin.fingerprint.a.azq();
      com.tencent.mm.plugin.fingerprint.a.azr();
      c.release();
    }
    this.llr = null;
    GMTrace.o(10783320702976L, 80342);
  }
  
  public final class a
    implements com.tencent.mm.pluginsdk.wallet.c
  {
    public a()
    {
      GMTrace.i(10774999203840L, 80280);
      GMTrace.o(10774999203840L, 80280);
    }
    
    public final void av(int paramInt1, int paramInt2)
    {
      GMTrace.i(10775133421568L, 80281);
      if (i.this.lkV)
      {
        w.e("MicroMsg.OpenFingerPrintAuthEventListener", "hy: event already end. ignore");
        GMTrace.o(10775133421568L, 80281);
        return;
      }
      switch (paramInt1)
      {
      }
      for (;;)
      {
        GMTrace.o(10775133421568L, 80281);
        return;
        w.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_SUCCESS");
        Object localObject1 = i.this;
        w.i("MicroMsg.OpenFingerPrintAuthEventListener", "onSuccess()");
        ((i)localObject1).lkV = true;
        com.tencent.mm.plugin.fingerprint.a.azq();
        com.tencent.mm.plugin.fingerprint.a.azr();
        Object localObject2 = ((i)localObject1).llr;
        ((k)h.h(k.class)).a((lc)localObject2, paramInt2);
        if (((i)localObject1).lkV) {
          ((i)localObject1).llr = null;
        }
        w.i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onSuccess()");
        i.azW();
        GMTrace.o(10775133421568L, 80281);
        return;
        w.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_NO_MATCH");
        i.this.lkV = false;
        i.azW();
        i.this.eH(true);
        i.this.G(1, "");
        GMTrace.o(10775133421568L, 80281);
        return;
        i.this.eH(false);
        w.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_TIMEOUT");
        GMTrace.o(10775133421568L, 80281);
        return;
        w.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify timeout");
        GMTrace.o(10775133421568L, 80281);
        return;
        w.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
        i.this.lkV = true;
        localObject2 = ab.getContext().getString(a.i.sYB);
        if (paramInt1 == 10308) {
          localObject1 = ab.getContext().getString(a.i.sYC);
        }
        for (;;)
        {
          i.azW();
          i.this.G(2, (String)localObject1);
          GMTrace.o(10775133421568L, 80281);
          return;
          localObject1 = localObject2;
          if (paramInt1 == 2007)
          {
            r.riJ.llE = true;
            localObject1 = localObject2;
          }
        }
        w.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
        if (i.this.llr != null) {
          com.tencent.mm.plugin.soter.c.a.vM(i.this.llr.ePm.ePp);
        }
        i.this.lkV = true;
        localObject1 = ab.getContext().getString(a.i.sYB);
        i.azW();
        i.this.G(paramInt1, (String)localObject1);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */