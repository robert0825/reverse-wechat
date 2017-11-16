package com.tencent.mm.plugin.fingerprint.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.d.b.f.f;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.g;
import java.lang.ref.WeakReference;

public class FingerPrintAuthUI
  extends WalletBaseUI
  implements com.tencent.mm.pluginsdk.wallet.a
{
  private boolean isPaused;
  private Dialog llK;
  private i llL;
  private Animation llN;
  private int llO;
  private TextView llU;
  private com.tencent.mm.plugin.fingerprint.b.c llV;
  private a llW;
  private boolean llX;
  private final int llY;
  
  public FingerPrintAuthUI()
  {
    GMTrace.i(10756879810560L, 80145);
    this.llK = null;
    this.llX = false;
    this.llY = 1;
    this.llO = 0;
    this.llL = null;
    this.isPaused = false;
    GMTrace.o(10756879810560L, 80145);
  }
  
  private void aY(final String paramString, final int paramInt)
  {
    GMTrace.i(10757953552384L, 80153);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10756208721920L, 80140);
        h.a(FingerPrintAuthUI.this, paramString, "", FingerPrintAuthUI.this.getString(a.i.tbT), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(10760906342400L, 80175);
            com.tencent.mm.wallet_core.a.c(FingerPrintAuthUI.this, new Bundle(), FingerPrintAuthUI.4.this.val$errCode);
            GMTrace.o(10760906342400L, 80175);
          }
        });
        GMTrace.o(10756208721920L, 80140);
      }
    });
    GMTrace.o(10757953552384L, 80153);
  }
  
  private void eI(boolean paramBoolean)
  {
    GMTrace.i(10757416681472L, 80149);
    com.tencent.mm.plugin.fingerprint.a.azq();
    com.tencent.mm.plugin.fingerprint.a.azr();
    com.tencent.mm.plugin.fingerprint.b.c.abort();
    com.tencent.mm.plugin.fingerprint.b.c.release();
    if (!com.tencent.mm.plugin.fingerprint.b.c.azy())
    {
      w.e("MicroMsg.FingerPrintAuthUI", "no fingerprints enrolled, use settings to enroll fingerprints first");
      GMTrace.o(10757416681472L, 80149);
      return;
    }
    if (this.llW == null) {
      this.llW = new a(this);
    }
    if (com.tencent.mm.plugin.fingerprint.b.c.a(this.llW, paramBoolean) != 0) {
      w.e("MicroMsg.FingerPrintAuthUI", "startFingerprintAuth failed!");
    }
    GMTrace.o(10757416681472L, 80149);
  }
  
  protected final int Qf()
  {
    GMTrace.i(10758221987840L, 80155);
    GMTrace.o(10758221987840L, 80155);
    return 1;
  }
  
  public final void R(int paramInt, String paramString)
  {
    GMTrace.i(10758356205568L, 80156);
    if (paramInt == 0)
    {
      w.i("MicroMsg.FingerPrintAuthUI", "open fingerprintpay success");
      b(new o(null), false);
      GMTrace.o(10758356205568L, 80156);
      return;
    }
    du(false);
    w.e("MicroMsg.FingerPrintAuthUI", "open fingerprintpay failed");
    h.a(this, getString(a.i.sTp), "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(10760369471488L, 80171);
        com.tencent.mm.wallet_core.a.c(FingerPrintAuthUI.this, new Bundle(), -1);
        GMTrace.o(10760369471488L, 80171);
      }
    });
    GMTrace.o(10758356205568L, 80156);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10757819334656L, 80152);
    if (this.llL.d(paramInt1, paramInt2, paramString, paramk))
    {
      GMTrace.o(10757819334656L, 80152);
      return true;
    }
    if ((paramk instanceof o))
    {
      du(false);
      com.tencent.mm.wallet_core.a.c(this, new Bundle(), 0);
      Toast.makeText(this, a.i.sTq, 0).show();
      GMTrace.o(10757819334656L, 80152);
      return true;
    }
    GMTrace.o(10757819334656L, 80152);
    return false;
  }
  
  protected final void du(final boolean paramBoolean)
  {
    GMTrace.i(10757148246016L, 80147);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10767617228800L, 80225);
        if (paramBoolean)
        {
          FingerPrintAuthUI.a(FingerPrintAuthUI.this, g.a(FingerPrintAuthUI.this, false, null));
          GMTrace.o(10767617228800L, 80225);
          return;
        }
        if ((FingerPrintAuthUI.d(FingerPrintAuthUI.this) != null) && (FingerPrintAuthUI.d(FingerPrintAuthUI.this).isShowing()))
        {
          FingerPrintAuthUI.d(FingerPrintAuthUI.this).dismiss();
          FingerPrintAuthUI.a(FingerPrintAuthUI.this, null);
        }
        GMTrace.o(10767617228800L, 80225);
      }
    });
    GMTrace.o(10757148246016L, 80147);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10758087770112L, 80154);
    int i = a.g.sMu;
    GMTrace.o(10758087770112L, 80154);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10757014028288L, 80146);
    super.onCreate(paramBundle);
    sq(getString(a.i.sWv));
    this.llU = ((TextView)findViewById(a.f.swg));
    com.tencent.mm.plugin.fingerprint.a.azq();
    this.llV = com.tencent.mm.plugin.fingerprint.a.azr();
    this.llL = com.tencent.mm.plugin.fingerprint.b.c.azz();
    paramBundle = com.tencent.mm.wallet_core.a.ac(this);
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getString("pwd");
      if (TextUtils.isEmpty(paramBundle))
      {
        w.e("MicroMsg.FingerPrintAuthUI", "get user pwd error");
        aY(getString(a.i.sTp), -1);
        com.tencent.mm.plugin.soter.c.a.c(1000, -1000223, -1, "get user pwd error");
        GMTrace.o(10757014028288L, 80146);
      }
    }
    else
    {
      w.e("MicroMsg.FingerPrintAuthUI", "contextdata is null,for that reason program can't get user pwd");
      aY(getString(a.i.sTp), -1);
      com.tencent.mm.plugin.soter.c.a.c(1000, -1000223, -1, "contextdata is null,for that reason program can't get user pwd");
      GMTrace.o(10757014028288L, 80146);
      return;
    }
    if (e.azF())
    {
      du(true);
      f.cpS().cpT();
      this.llL.a(this, new com.tencent.mm.pluginsdk.wallet.a()
      {
        public final void R(int paramAnonymousInt, String paramAnonymousString)
        {
          GMTrace.i(10769764712448L, 80241);
          FingerPrintAuthUI.this.du(false);
          if (paramAnonymousInt == 0)
          {
            FingerPrintAuthUI.b(FingerPrintAuthUI.this);
            if (FingerPrintAuthUI.c(FingerPrintAuthUI.this))
            {
              FingerPrintAuthUI.a(FingerPrintAuthUI.this, false);
              GMTrace.o(10769764712448L, 80241);
            }
          }
          else
          {
            FingerPrintAuthUI.a(FingerPrintAuthUI.this, paramAnonymousString, paramAnonymousInt);
          }
          GMTrace.o(10769764712448L, 80241);
        }
      }, paramBundle);
      GMTrace.o(10757014028288L, 80146);
      return;
    }
    w.e("MicroMsg.FingerPrintAuthUI", "device is not support FingerPrintAuth");
    GMTrace.o(10757014028288L, 80146);
  }
  
  public void onDestroy()
  {
    GMTrace.i(10757685116928L, 80151);
    w.i("MicroMsg.FingerPrintAuthUI", "hy: fingerprint auth ui on destroy");
    if (this.llN != null) {
      this.llN.cancel();
    }
    this.llW = null;
    super.onDestroy();
    GMTrace.o(10757685116928L, 80151);
  }
  
  public void onPause()
  {
    GMTrace.i(10757550899200L, 80150);
    super.onPause();
    this.isPaused = true;
    PowerManager.WakeLock localWakeLock = ((PowerManager)this.vKB.vKW.getSystemService("power")).newWakeLock(536870913, "PostLocationService");
    if (localWakeLock != null) {
      localWakeLock.acquire();
    }
    w.i("MicroMsg.FingerPrintAuthUI", "hy: user cancelled");
    com.tencent.mm.plugin.fingerprint.a.azq();
    if (com.tencent.mm.plugin.fingerprint.a.azr() != null) {
      com.tencent.mm.plugin.fingerprint.b.c.azx();
    }
    if (localWakeLock != null) {
      localWakeLock.release();
    }
    GMTrace.o(10757550899200L, 80150);
  }
  
  public void onResume()
  {
    GMTrace.i(10757282463744L, 80148);
    super.onResume();
    this.isPaused = false;
    if (this.llX) {
      eI(false);
    }
    GMTrace.o(10757282463744L, 80148);
  }
  
  public final class a
    implements com.tencent.mm.pluginsdk.wallet.c
  {
    private WeakReference<FingerPrintAuthUI> lmc;
    
    public a(FingerPrintAuthUI paramFingerPrintAuthUI)
    {
      GMTrace.i(10754866544640L, 80130);
      this.lmc = null;
      this.lmc = new WeakReference(paramFingerPrintAuthUI);
      GMTrace.o(10754866544640L, 80130);
    }
    
    private FingerPrintAuthUI aAg()
    {
      GMTrace.i(10755000762368L, 80131);
      if (this.lmc != null)
      {
        FingerPrintAuthUI localFingerPrintAuthUI = (FingerPrintAuthUI)this.lmc.get();
        GMTrace.o(10755000762368L, 80131);
        return localFingerPrintAuthUI;
      }
      GMTrace.o(10755000762368L, 80131);
      return null;
    }
    
    public final void av(int paramInt1, int paramInt2)
    {
      GMTrace.i(10755134980096L, 80132);
      switch (paramInt1)
      {
      }
      for (;;)
      {
        GMTrace.o(10755134980096L, 80132);
        return;
        w.i("MicroMsg.FingerPrintAuthUI", "identify success");
        if (aAg() != null)
        {
          FingerPrintAuthUI.a(aAg(), paramInt2);
          GMTrace.o(10755134980096L, 80132);
          return;
          w.i("MicroMsg.FingerPrintAuthUI", "identify FingerPrintConst.RESULT_NO_MATCH");
          if (aAg() != null)
          {
            FingerPrintAuthUI.a(aAg());
            FingerPrintAuthUI.a(FingerPrintAuthUI.this, true);
            GMTrace.o(10755134980096L, 80132);
            return;
            w.i("MicroMsg.FingerPrintAuthUI", "identify timeout");
            if (aAg() != null)
            {
              FingerPrintAuthUI.a(FingerPrintAuthUI.this, false);
              GMTrace.o(10755134980096L, 80132);
              return;
              w.i("MicroMsg.FingerPrintAuthUI", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
              String str = ab.getContext().getString(a.i.sYB);
              if (paramInt1 == 10308)
              {
                str = ab.getContext().getString(a.i.sYC);
                com.tencent.mm.plugin.soter.c.a.c(6, -1000223, -1, "too many trial");
              }
              while (aAg() != null)
              {
                FingerPrintAuthUI.a(aAg(), str, -1);
                GMTrace.o(10755134980096L, 80132);
                return;
                com.tencent.mm.plugin.soter.c.a.c(1000, -1000223, paramInt1, "fingerprint error");
              }
              w.i("MicroMsg.FingerPrintAuthUI", "hy: on error: %d", new Object[] { Integer.valueOf(paramInt1) });
              str = ab.getContext().getString(a.i.sYB);
              com.tencent.mm.plugin.soter.c.a.c(1000, -1000223, paramInt1, "fingerprint error");
              com.tencent.mm.plugin.soter.c.a.vM(2);
              if (aAg() != null) {
                FingerPrintAuthUI.a(aAg(), str, -1);
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\ui\FingerPrintAuthUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */