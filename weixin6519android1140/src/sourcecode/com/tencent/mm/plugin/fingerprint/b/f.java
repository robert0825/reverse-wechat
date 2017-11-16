package com.tencent.mm.plugin.fingerprint.b;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.gs;
import com.tencent.mm.g.a.gs.a;
import com.tencent.mm.g.a.gs.b;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fingerprint.FingerPrintAuth;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public final class f
  extends c<gs>
  implements com.tencent.mm.ad.e
{
  private String eHG;
  private boolean lkV;
  private gs llc;
  private int lld;
  ae lle;
  
  public f()
  {
    GMTrace.i(10772985937920L, 80265);
    this.lld = 0;
    this.eHG = "";
    this.lkV = false;
    this.lle = new ae(Looper.getMainLooper());
    this.vhf = gs.class.getName().hashCode();
    GMTrace.o(10772985937920L, 80265);
  }
  
  private boolean a(gs paramgs)
  {
    int i = 0;
    GMTrace.i(10773120155648L, 80266);
    if (!h.xw().wL())
    {
      w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "GenFingerPrintRsaKeyEventListener account is not ready");
      GMTrace.o(10773120155648L, 80266);
      return false;
    }
    w.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "GenFingerPrintRsaKeyEventListener callback");
    this.lkV = false;
    if ((paramgs instanceof gs))
    {
      if (!e.azF())
      {
        w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "device is not support FingerPrintAuth");
        paramgs = new gs.b();
        paramgs.eFN = false;
        this.llc.eJN = paramgs;
        this.lkV = true;
        ajH();
        GMTrace.o(10773120155648L, 80266);
        return true;
      }
      this.llc = paramgs;
      h.xz();
      h.xx().fYr.a(385, this);
      boolean bool = this.llc.eJM.eJO;
      this.lld = this.llc.eJM.eJP;
      this.eHG = this.llc.eJM.eJQ;
      if (!bool)
      {
        paramgs = e.getUserId();
        String str = p.ta();
        paramgs = FingerPrintAuth.getRsaKey(e.cs(ab.getContext()), paramgs, str);
        if (!TextUtils.isEmpty(paramgs))
        {
          w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.getRsaKey() success!");
          paramgs = new com.tencent.mm.plugin.fingerprint.c.e(paramgs);
          h.xz();
          h.xx().fYr.a(paramgs, 0);
        }
      }
      for (;;)
      {
        if (i != 0)
        {
          w.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth begin asyc gen rsa key!");
          new o(new a()).aAb();
        }
        GMTrace.o(10773120155648L, 80266);
        return true;
        w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.getRsaKey() return null");
        i = 1;
        continue;
        w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth should gen rsa key!");
        i = 1;
      }
    }
    GMTrace.o(10773120155648L, 80266);
    return false;
  }
  
  private void ajH()
  {
    GMTrace.i(10773388591104L, 80268);
    w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "doCallback()");
    if (this.llc.eDO != null) {
      this.llc.eDO.run();
    }
    if (this.lkV) {
      this.llc = null;
    }
    GMTrace.o(10773388591104L, 80268);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10773254373376L, 80267);
    gs.b localb;
    if ((paramk instanceof com.tencent.mm.plugin.fingerprint.c.e))
    {
      localb = new gs.b();
      localb.eFN = false;
      w.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene return errcode " + paramInt2 + " errmsg" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label278;
      }
      w.i("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is success");
      paramk = (com.tencent.mm.plugin.fingerprint.c.e)paramk;
      paramString = paramk.lll;
      paramk = paramk.eJS;
      String str1 = e.getUserId();
      String str2 = p.ta();
      String str3 = com.tencent.mm.wallet_core.c.n.clL();
      if (TextUtils.isEmpty(FingerPrintAuth.genOpenFPEncrypt(e.cs(ab.getContext()), str1, str2, String.valueOf(this.lld), str3, "", paramString, paramk, Build.MODEL))) {
        break label267;
      }
      w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt success!");
      localb.eFN = true;
      paramString = FingerPrintAuth.genPayFPEncrypt(e.cs(ab.getContext()), str1, str2, String.valueOf(this.lld), str3, this.eHG, Build.MODEL);
      paramk = FingerPrintAuth.genOpenFPSign(e.cs(ab.getContext()), e.getUserId(), p.ta(), paramString);
      localb.eJR = paramString;
      localb.eJS = paramk;
    }
    for (;;)
    {
      h.xz();
      h.xx().fYr.b(385, this);
      this.llc.eJN = localb;
      this.lkV = true;
      ajH();
      GMTrace.o(10773254373376L, 80267);
      return;
      label267:
      w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "FingerPrintAuth.genOpenFPEncrypt failed!");
      break;
      label278:
      w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "NetSceneTenpayGetOpenTouchCert doscene is fail");
    }
  }
  
  private final class a
    implements o.a
  {
    public a()
    {
      GMTrace.i(10791910637568L, 80406);
      GMTrace.o(10791910637568L, 80406);
    }
    
    public final void qp(final String paramString)
    {
      GMTrace.i(10792044855296L, 80407);
      f.this.lle.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10774596550656L, 80277);
          if (TextUtils.isEmpty(paramString)) {
            w.e("MicroMsg.GenFingerPrintRsaKeyEventListener", "rsaKey is null");
          }
          com.tencent.mm.plugin.fingerprint.c.e locale = new com.tencent.mm.plugin.fingerprint.c.e(paramString);
          h.xz();
          h.xx().fYr.a(locale, 0);
          GMTrace.o(10774596550656L, 80277);
        }
      });
      GMTrace.o(10792044855296L, 80407);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */