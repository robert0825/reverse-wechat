package com.tencent.mm.plugin.fingerprint.b;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.mm.plugin.fingerprint.c.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.ae.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public final class h
  implements i
{
  private String eJS;
  public ae lle;
  public com.tencent.mm.pluginsdk.wallet.a lli;
  private com.tencent.mm.pluginsdk.wallet.a llj;
  public WalletBaseUI llk;
  private String lll;
  private String llm;
  
  public h()
  {
    GMTrace.i(10790165807104L, 80393);
    this.lli = null;
    this.llj = null;
    this.llk = null;
    this.lll = null;
    this.eJS = null;
    this.llm = null;
    this.lle = new ae(new ae.a()
    {
      public final boolean handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(10792715943936L, 80412);
        if (1 == paramAnonymousMessage.what)
        {
          String str = paramAnonymousMessage.getData().getString("rsaKey");
          if (TextUtils.isEmpty(str))
          {
            w.e("MicroMsg.HwFingerprintOpenDelegate", "handleMessage msg.what=" + paramAnonymousMessage.what + " rsaKey is null");
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(10775401857024L, 80283);
                h.this.lli.R(-1, h.this.llk.getString(a.i.sTp));
                GMTrace.o(10775401857024L, 80283);
              }
            });
          }
          paramAnonymousMessage = new com.tencent.mm.plugin.fingerprint.c.e(str);
          h.this.llk.b(paramAnonymousMessage, false);
          GMTrace.o(10792715943936L, 80412);
          return true;
        }
        GMTrace.o(10792715943936L, 80412);
        return false;
      }
    });
    GMTrace.o(10790165807104L, 80393);
  }
  
  public final void a(Context paramContext, com.tencent.mm.pluginsdk.wallet.a parama, String paramString)
  {
    GMTrace.i(10790300024832L, 80394);
    this.llk = ((WalletBaseUI)paramContext);
    this.lli = parama;
    this.llm = paramString;
    paramContext = FingerPrintAuth.getRsaKey(e.cs(ab.getContext()), e.getUserId(), p.ta());
    com.tencent.mm.plugin.soter.c.a.bqx();
    if (TextUtils.isEmpty(paramContext))
    {
      w.e("MicroMsg.HwFingerprintOpenDelegate", "FingerPrintAuth.getRsaKey() is null");
      new o(new a()).aAb();
      GMTrace.o(10790300024832L, 80394);
      return;
    }
    w.i("MicroMsg.HwFingerprintOpenDelegate", "do NetSceneTenpayGetOpenTouchCert");
    paramContext = new com.tencent.mm.plugin.fingerprint.c.e(paramContext);
    this.llk.b(paramContext, false);
    GMTrace.o(10790300024832L, 80394);
  }
  
  public final void a(com.tencent.mm.pluginsdk.wallet.a parama, String paramString, int paramInt)
  {
    GMTrace.i(10790702678016L, 80397);
    this.llj = parama;
    if (TextUtils.isEmpty(this.llm))
    {
      w.e("MicroMsg.HwFingerprintOpenDelegate", "get user pwd error");
      parama.R(-1, this.llk.getString(a.i.sTp));
      GMTrace.o(10790702678016L, 80397);
      return;
    }
    String str1 = e.getUserId();
    String str2 = p.ta();
    String str3 = n.clL();
    parama = "";
    if (e.azF())
    {
      paramString = FingerPrintAuth.genOpenFPEncrypt(e.cs(ab.getContext()), str1, str2, paramString, str3, "", this.lll, this.eJS, Build.MODEL);
      parama = FingerPrintAuth.genOpenFPSign(e.cs(ab.getContext()), e.getUserId(), p.ta(), paramString);
    }
    for (;;)
    {
      if (TextUtils.isEmpty(this.lll)) {
        w.e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypted_device_info which return by FingerPrintAuth.genOpenFPEncrypt is null");
      }
      for (;;)
      {
        parama = new f(paramString, parama, this.llm, paramInt);
        this.llk.b(parama, false);
        GMTrace.o(10790702678016L, 80397);
        return;
        if (TextUtils.isEmpty(parama)) {
          w.e("MicroMsg.HwFingerprintOpenDelegate", "The value of encrypto_open_sign which return by FingerPrintAuth.genOpenFPSign is null");
        }
      }
      paramString = "";
    }
  }
  
  public final void clear()
  {
    GMTrace.i(10790434242560L, 80395);
    GMTrace.o(10790434242560L, 80395);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 0;
    GMTrace.i(10790568460288L, 80396);
    if ((paramk instanceof com.tencent.mm.plugin.fingerprint.c.e))
    {
      Object localObject;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        w.i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert success");
        paramString = (com.tencent.mm.plugin.fingerprint.c.e)paramk;
        this.lll = paramString.lll;
        this.eJS = paramString.eJS;
        localObject = this.lli;
        paramk = "";
        paramInt1 = i;
      }
      for (;;)
      {
        ((com.tencent.mm.pluginsdk.wallet.a)localObject).R(paramInt1, paramk);
        GMTrace.o(10790568460288L, 80396);
        return true;
        w.i("MicroMsg.HwFingerprintOpenDelegate", "get FingerPrint cert error");
        com.tencent.mm.pluginsdk.wallet.a locala = this.lli;
        paramInt2 = -1;
        paramInt1 = paramInt2;
        localObject = locala;
        paramk = paramString;
        if (bg.nm(paramString))
        {
          paramk = this.llk.getString(a.i.sTp);
          paramInt1 = paramInt2;
          localObject = locala;
        }
      }
    }
    if ((paramk instanceof f))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.soter.c.a.bqy();
        com.tencent.mm.plugin.soter.c.a.c(0, 0, 0, "OK");
        this.llj.R(0, "");
      }
      for (;;)
      {
        GMTrace.o(10790568460288L, 80396);
        return true;
        this.llj.R(-2, "");
      }
    }
    GMTrace.o(10790568460288L, 80396);
    return false;
  }
  
  private final class a
    implements o.a
  {
    public a()
    {
      GMTrace.i(10787749888000L, 80375);
      GMTrace.o(10787749888000L, 80375);
    }
    
    public final void qp(final String paramString)
    {
      GMTrace.i(10787884105728L, 80376);
      if (TextUtils.isEmpty(paramString))
      {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10777280905216L, 80297);
            h.this.lli.R(-1, h.this.llk.getString(a.i.sTp));
            GMTrace.o(10777280905216L, 80297);
          }
        });
        w.e("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback rsaKey is empty!");
        GMTrace.o(10787884105728L, 80376);
        return;
      }
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10773791244288L, 80271);
          w.i("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback running");
          Message localMessage = h.this.lle.obtainMessage();
          localMessage.what = 1;
          Bundle localBundle = new Bundle();
          localBundle.putString("rsaKey", paramString);
          localMessage.setData(localBundle);
          localMessage.sendToTarget();
          GMTrace.o(10773791244288L, 80271);
        }
      });
      GMTrace.o(10787884105728L, 80376);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */