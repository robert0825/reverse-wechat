package com.tencent.mm.plugin.fingerprint.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.d.b.f.f;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.r;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.y.q;

@com.tencent.mm.ui.base.a(7)
public class FingerPrintAuthTransparentUI
  extends WalletBaseUI
  implements com.tencent.mm.pluginsdk.wallet.a
{
  private com.tencent.mm.pluginsdk.wallet.c lkY;
  private com.tencent.mm.ui.base.k llJ;
  Dialog llK;
  private i llL;
  private int llM;
  private Animation llN;
  private int llO;
  private boolean llP;
  private int llQ;
  private boolean llR;
  View view;
  
  public FingerPrintAuthTransparentUI()
  {
    GMTrace.i(10762651172864L, 80188);
    this.view = null;
    this.llJ = null;
    this.llL = null;
    this.llM = -1;
    this.llO = 0;
    this.llP = false;
    this.llQ = 0;
    this.llR = false;
    this.lkY = new com.tencent.mm.pluginsdk.wallet.c()
    {
      public final void av(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10759832600576L, 80167);
        switch (paramAnonymousInt1)
        {
        }
        for (;;)
        {
          GMTrace.o(10759832600576L, 80167);
          return;
          w.i("MicroMsg.FingerPrintAuthTransparentUI", "identify success");
          FingerPrintAuthTransparentUI.a(FingerPrintAuthTransparentUI.this, paramAnonymousInt2);
          FingerPrintAuthTransparentUI.a(FingerPrintAuthTransparentUI.this);
          GMTrace.o(10759832600576L, 80167);
          return;
          w.i("MicroMsg.FingerPrintAuthTransparentUI", "identify FingerPrintConst.RESULT_NO_MATCH");
          FingerPrintAuthTransparentUI.b(FingerPrintAuthTransparentUI.this);
          FingerPrintAuthTransparentUI.a(FingerPrintAuthTransparentUI.this, true);
          GMTrace.o(10759832600576L, 80167);
          return;
          w.i("MicroMsg.FingerPrintAuthTransparentUI", "identify timeout");
          GMTrace.o(10759832600576L, 80167);
          return;
          w.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
          String str = ab.getContext().getString(a.i.sYB);
          if (paramAnonymousInt1 == 10308)
          {
            str = ab.getContext().getString(a.i.sYC);
            com.tencent.mm.plugin.soter.c.a.c(6, -1000223, -1, "too many trial");
          }
          for (;;)
          {
            FingerPrintAuthTransparentUI.a(FingerPrintAuthTransparentUI.this, str);
            GMTrace.o(10759832600576L, 80167);
            return;
            com.tencent.mm.plugin.soter.c.a.c(1000, -1000223, paramAnonymousInt1, "fingerprint error");
          }
          w.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
          str = ab.getContext().getString(a.i.sYB);
          com.tencent.mm.plugin.soter.c.a.c(1000, -1000223, paramAnonymousInt1, "fingerprint error");
          com.tencent.mm.plugin.soter.c.a.vM(2);
          FingerPrintAuthTransparentUI.a(FingerPrintAuthTransparentUI.this, str);
        }
      }
    };
    GMTrace.o(10762651172864L, 80188);
  }
  
  private void U(int paramInt, String paramString)
  {
    GMTrace.i(10763859132416L, 80197);
    if (TextUtils.isEmpty(paramString)) {
      paramString = getString(-1);
    }
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(a.i.tbT), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16565957296128L, 123426);
          w.i("MicroMsg.FingerPrintAuthTransparentUI", "showErrorAlert, finish ui!");
          paramAnonymousDialogInterface.dismiss();
          FingerPrintAuthTransparentUI.this.finish();
          GMTrace.o(16565957296128L, 123426);
        }
      });
      GMTrace.o(10763859132416L, 80197);
      return;
    }
  }
  
  private static void aAe()
  {
    GMTrace.i(10763322261504L, 80193);
    w.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled");
    com.tencent.mm.plugin.fingerprint.a.azq();
    if (com.tencent.mm.plugin.fingerprint.a.azr() != null) {
      com.tencent.mm.plugin.fingerprint.b.c.azx();
    }
    GMTrace.o(10763322261504L, 80193);
  }
  
  private void eI(boolean paramBoolean)
  {
    GMTrace.i(10763188043776L, 80192);
    com.tencent.mm.plugin.fingerprint.a.azq();
    com.tencent.mm.plugin.fingerprint.a.azr();
    com.tencent.mm.plugin.fingerprint.b.c.abort();
    com.tencent.mm.plugin.fingerprint.b.c.release();
    if (!com.tencent.mm.plugin.fingerprint.b.c.azy())
    {
      w.e("MicroMsg.FingerPrintAuthTransparentUI", "no fingerprints enrolled, use settings to enroll fingerprints first");
      GMTrace.o(10763188043776L, 80192);
      return;
    }
    if (com.tencent.mm.plugin.fingerprint.b.c.a(this.lkY, paramBoolean) != 0) {
      w.e("MicroMsg.FingerPrintAuthTransparentUI", "startFingerprintAuth failed!");
    }
    GMTrace.o(10763188043776L, 80192);
  }
  
  protected final int Qf()
  {
    GMTrace.i(10764261785600L, 80200);
    GMTrace.o(10764261785600L, 80200);
    return 1;
  }
  
  public final void R(int paramInt, String paramString)
  {
    GMTrace.i(10764396003328L, 80201);
    du(false);
    if (paramInt == 0)
    {
      w.i("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay success");
      b(new o(null), false);
      paramString = LayoutInflater.from(this).inflate(a.g.sMs, null);
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, false, null, paramString, getString(a.i.tbT), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(10756745592832L, 80144);
          paramAnonymousDialogInterface.dismiss();
          w.i("MicroMsg.FingerPrintAuthTransparentUI", "showSuccessAlert, finish ui!");
          FingerPrintAuthTransparentUI.this.finish();
          GMTrace.o(10756745592832L, 80144);
        }
      }, null);
      GMTrace.o(10764396003328L, 80201);
      return;
    }
    if (paramInt == -2)
    {
      w.e("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay failed");
      paramInt = a.i.sTp;
      if (!TextUtils.isEmpty(paramString)) {
        break label189;
      }
      paramString = getString(paramInt);
    }
    label189:
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(a.i.sTr), getString(a.i.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16565151989760L, 123420);
          w.i("MicroMsg.FingerPrintAuthTransparentUI", "try fingerprint auth again!");
          FingerPrintAuthTransparentUI.d(FingerPrintAuthTransparentUI.this);
          FingerPrintAuthTransparentUI.a(FingerPrintAuthTransparentUI.this, false);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(16565151989760L, 123420);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16565688860672L, 123424);
          FingerPrintAuthTransparentUI.this.finish();
          GMTrace.o(16565688860672L, 123424);
        }
      });
      GMTrace.o(10764396003328L, 80201);
      return;
      U(-1, paramString);
      GMTrace.o(10764396003328L, 80201);
      return;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(10763456479232L, 80194);
    boolean bool = this.llL.d(paramInt1, paramInt2, paramString, paramk);
    GMTrace.o(10763456479232L, 80194);
    return bool;
  }
  
  protected final void du(boolean paramBoolean)
  {
    GMTrace.i(10763993350144L, 80198);
    if (paramBoolean)
    {
      this.llK = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
      GMTrace.o(10763993350144L, 80198);
      return;
    }
    if ((this.llK != null) && (this.llK.isShowing()))
    {
      this.llK.dismiss();
      this.llK = null;
    }
    GMTrace.o(10763993350144L, 80198);
  }
  
  public void finish()
  {
    GMTrace.i(10763724914688L, 80196);
    if (this.llL != null) {
      this.llL.clear();
    }
    super.finish();
    GMTrace.o(10763724914688L, 80196);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10763590696960L, 80195);
    GMTrace.o(10763590696960L, 80195);
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10762785390592L, 80189);
    super.onCreate(paramBundle);
    w.i("MicroMsg.FingerPrintAuthTransparentUI", "launch FingerPrintAuthTransparentUI");
    if (!com.tencent.mm.plugin.fingerprint.b.e.azF())
    {
      w.e("MicroMsg.FingerPrintAuthTransparentUI", "device is not support FingerPrintAuth or load fingerpringauth so failed, finish UI!");
      finish();
      GMTrace.o(10762785390592L, 80189);
      return;
    }
    if (q.zR())
    {
      w.e("MicroMsg.FingerPrintAuthTransparentUI", "now account is isPayUPay, finish UI!");
      finish();
      GMTrace.o(10762785390592L, 80189);
      return;
    }
    if (com.tencent.mm.plugin.fingerprint.b.e.azR())
    {
      w.e("MicroMsg.FingerPrintAuthTransparentUI", "getIsOpenFPFromLocal is true, finish UI!");
      finish();
      GMTrace.o(10762785390592L, 80189);
      return;
    }
    com.tencent.mm.plugin.fingerprint.a.azq();
    com.tencent.mm.plugin.fingerprint.a.azr();
    if (!com.tencent.mm.plugin.fingerprint.b.c.azy())
    {
      w.e("MicroMsg.FingerPrintAuthTransparentUI", "isWxHasFingerPrint is false, finish UI!");
      finish();
      GMTrace.o(10762785390592L, 80189);
      return;
    }
    if (com.tencent.mm.compatible.d.p.fQG.fQO != 1)
    {
      w.e("MicroMsg.FingerPrintAuthTransparentUI", "hy: device config force to not support");
      finish();
    }
    paramBundle = n.byx();
    com.tencent.mm.plugin.fingerprint.a.azq();
    com.tencent.mm.plugin.fingerprint.a.azr();
    this.llL = com.tencent.mm.plugin.fingerprint.b.c.azz();
    this.llR = com.tencent.mm.kernel.h.xy().xh().getBoolean(w.a.vrE, false);
    if ((paramBundle.byS()) && (!com.tencent.mm.plugin.fingerprint.b.e.azR()))
    {
      w.e("MicroMsg.FingerPrintAuthTransparentUI", "show fingerprint auth open guide!");
      f.cpS().cpT();
      com.tencent.mm.plugin.report.service.g.ork.i(12924, new Object[] { Integer.valueOf(1) });
      com.tencent.mm.plugin.soter.c.a.vK(0);
      if (com.tencent.mm.kernel.h.xy().xh().getBoolean(w.a.vrB, true))
      {
        w.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: first show. no check box");
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vrB, Boolean.valueOf(false));
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vrE, Boolean.valueOf(false));
        if (this.llR) {}
        for (paramBundle = getString(a.i.sTu);; paramBundle = getString(a.i.sTt))
        {
          com.tencent.mm.ui.base.h.a(this, paramBundle, "", getString(a.i.sSi), getString(a.i.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(10762516955136L, 80187);
              FingerPrintAuthTransparentUI.c(FingerPrintAuthTransparentUI.this);
              GMTrace.o(10762516955136L, 80187);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(10760637906944L, 80173);
              FingerPrintAuthTransparentUI.b(FingerPrintAuthTransparentUI.this, false);
              GMTrace.o(10760637906944L, 80173);
            }
          });
          com.tencent.mm.kernel.h.xy().xh().a(w.a.vrD, Integer.valueOf(1));
          this.llQ = 1;
          com.tencent.mm.plugin.soter.c.a.dm(1, this.llQ);
          GMTrace.o(10762785390592L, 80189);
          return;
        }
      }
      w.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: already shown before. show dialog with check box");
      paramBundle = LayoutInflater.from(this).inflate(a.g.sMv, null);
      final CheckBox localCheckBox = (CheckBox)paramBundle.findViewById(a.f.svM);
      this.llQ = (((Integer)com.tencent.mm.kernel.h.xy().xh().get(w.a.vrD, null)).intValue() + 1);
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vrD, Integer.valueOf(this.llQ));
      com.tencent.mm.plugin.soter.c.a.dm(1, this.llQ);
      com.tencent.mm.ui.base.h.a(this, false, null, paramBundle, getString(a.i.sSi), getString(a.i.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16566762602496L, 123432);
          FingerPrintAuthTransparentUI.c(FingerPrintAuthTransparentUI.this);
          GMTrace.o(16566762602496L, 123432);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16564883554304L, 123418);
          FingerPrintAuthTransparentUI.b(FingerPrintAuthTransparentUI.this, localCheckBox.isChecked());
          GMTrace.o(16564883554304L, 123418);
        }
      });
      GMTrace.o(10762785390592L, 80189);
      return;
    }
    w.i("MicroMsg.FingerPrintAuthTransparentUI", "isReg?:" + paramBundle.byS() + ";isOpenTouch:" + com.tencent.mm.plugin.fingerprint.b.e.azR());
    w.e("MicroMsg.FingerPrintAuthTransparentUI", "finish FingerPrintAuthTransparentUI, not show the open guide!");
    finish();
    GMTrace.o(10762785390592L, 80189);
  }
  
  public void onDestroy()
  {
    GMTrace.i(10764127567872L, 80199);
    if ((this.llJ != null) && (this.llJ.isShowing()))
    {
      this.llJ.dismiss();
      this.llJ = null;
    }
    if (this.llN != null) {
      this.llN.cancel();
    }
    du(false);
    super.onDestroy();
    GMTrace.o(10764127567872L, 80199);
  }
  
  public void onPause()
  {
    GMTrace.i(10763053826048L, 80191);
    super.onPause();
    w.i("MicroMsg.FingerPrintAuthTransparentUI", "alvinluo onPause");
    PowerManager.WakeLock localWakeLock = ((PowerManager)this.vKB.vKW.getSystemService("power")).newWakeLock(536870913, "PostLocationService");
    if (localWakeLock != null) {
      localWakeLock.acquire();
    }
    aAe();
    if (localWakeLock != null) {
      localWakeLock.release();
    }
    GMTrace.o(10763053826048L, 80191);
  }
  
  public void onResume()
  {
    GMTrace.i(10762919608320L, 80190);
    super.onResume();
    if (this.llP) {
      eI(false);
    }
    GMTrace.o(10762919608320L, 80190);
  }
  
  protected void onStop()
  {
    GMTrace.i(16566091513856L, 123427);
    super.onStop();
    finish();
    GMTrace.o(16566091513856L, 123427);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\ui\FingerPrintAuthTransparentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */