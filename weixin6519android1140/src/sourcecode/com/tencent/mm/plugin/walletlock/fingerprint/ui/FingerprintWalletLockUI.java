package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.d.b.f.b.a;
import com.tencent.d.b.f.f;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.walletlock.a.a;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.plugin.walletlock.a.d;
import com.tencent.mm.plugin.walletlock.a.e;
import com.tencent.mm.plugin.walletlock.a.g;
import com.tencent.mm.plugin.walletlock.fingerprint.a.c;
import com.tencent.mm.plugin.walletlock.fingerprint.a.d.a;
import com.tencent.mm.plugin.walletlock.fingerprint.a.h.1;
import com.tencent.mm.plugin.walletlock.fingerprint.a.h.2;
import com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.p;
import java.lang.ref.WeakReference;

public class FingerprintWalletLockUI
  extends MMActivity
{
  private TextView iZs;
  private String llG;
  private int llO;
  private String mToken;
  private com.tencent.mm.ui.base.i mgR;
  private boolean nSm;
  private boolean nfT;
  private boolean rxi;
  private TextView rxo;
  private TextView rxp;
  private Animation rxq;
  private String rxr;
  private String rxs;
  private com.tencent.mm.plugin.walletlock.fingerprint.a.d rxt;
  private com.tencent.mm.plugin.walletlock.fingerprint.a.h rxu;
  private com.tencent.mm.plugin.walletlock.b.b rxv;
  private String rxw;
  private ProgressDialog rxx;
  private int rxy;
  private int rxz;
  private String uC;
  
  public FingerprintWalletLockUI()
  {
    GMTrace.i(20258286993408L, 150936);
    this.rxw = "-1";
    this.llO = 0;
    this.rxx = null;
    this.mgR = null;
    this.llG = null;
    this.rxi = false;
    this.nSm = false;
    this.nfT = true;
    this.rxy = -1;
    this.rxz = -1;
    GMTrace.o(20258286993408L, 150936);
  }
  
  private void bAA()
  {
    GMTrace.i(20259226517504L, 150943);
    bwR();
    i.a locala = new i.a(this);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo mAuthType: %d", new Object[] { Integer.valueOf(this.rxy) });
    if (this.rxy == 2) {
      locala.BO(a.g.rwR).BQ(a.g.rwU).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20263118831616L, 150972);
          FingerprintWalletLockUI.g(FingerprintWalletLockUI.this);
          GMTrace.o(20263118831616L, 150972);
        }
      }).BR(a.g.cSk).b(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20263655702528L, 150976);
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo click negative button");
          GMTrace.o(20263655702528L, 150976);
        }
      });
    }
    for (;;)
    {
      this.mgR = locala.aax();
      this.mgR.setCanceledOnTouchOutside(false);
      this.mgR.show();
      GMTrace.o(20259226517504L, 150943);
      return;
      locala.BO(a.g.rwQ).VC(getString(a.g.cTM)).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20258152775680L, 150935);
          FingerprintWalletLockUI.this.finish();
          FingerprintWalletLockUI.bAD();
          GMTrace.o(20258152775680L, 150935);
        }
      });
    }
  }
  
  private void bAB()
  {
    GMTrace.i(20259629170688L, 150946);
    w.i("MicroMsg.FingerprintWalletLockUI", "currentAction: %s", new Object[] { this.rxs });
    if (bg.nm(this.rxs))
    {
      finish();
      GMTrace.o(20259629170688L, 150946);
      return;
    }
    Object localObject1 = this.rxs;
    int i = -1;
    switch (((String)localObject1).hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(20259629170688L, 150946);
      return;
      if (!((String)localObject1).equals("action.switch_on_pattern")) {
        break;
      }
      i = 0;
      break;
      if (!((String)localObject1).equals("action.verify_pattern")) {
        break;
      }
      i = 1;
      break;
      if (!((String)localObject1).equals("next_action.switch_on_pattern")) {
        break;
      }
      i = 2;
      break;
      if (!((String)localObject1).equals("next_action.goto_protected_page")) {
        break;
      }
      i = 3;
      break;
      this.rxv = new a(this);
      this.rxw = "-1";
      if (this.rxu == null) {
        this.rxu = new com.tencent.mm.plugin.walletlock.fingerprint.a.h();
      }
      localObject1 = this.rxu;
      Object localObject2 = this.rxv;
      Object localObject3 = new h.1((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1, (com.tencent.mm.plugin.walletlock.b.b)localObject2);
      ((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1).llw = new com.tencent.d.b.c.a();
      localObject3 = new b.a().hP(this).a(((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1).llw).Yz(com.tencent.mm.plugin.walletlock.b.g.rza.rzb).Fm(3).a((com.tencent.d.b.c.b)localObject3).yaQ;
      com.tencent.mm.plugin.walletlock.b.g.rza.rzc = null;
      w.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo start auth");
      com.tencent.d.b.a.a(new h.2((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1, (com.tencent.mm.plugin.walletlock.b.b)localObject2), (com.tencent.d.b.f.b)localObject3);
      GMTrace.o(20259629170688L, 150946);
      return;
      localObject2 = com.tencent.mm.plugin.walletlock.b.g.rza.rzc;
      if (localObject2 == null)
      {
        qn(getString(a.g.rwI));
        GMTrace.o(20259629170688L, 150946);
        return;
      }
      localObject1 = ((com.tencent.d.a.c.h)localObject2).yaq;
      localObject2 = ((com.tencent.d.a.c.h)localObject2).signature;
      if (this.rxt != null)
      {
        this.rxx = com.tencent.mm.ui.base.h.a(this, getString(a.g.rwN), false, null);
        this.rxt.a(new d.a()
        {
          public final void R(int paramAnonymousInt, String paramAnonymousString)
          {
            GMTrace.i(20257615904768L, 150931);
            w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo open fingerprint lock onFinish errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
            if (paramAnonymousInt == 0)
            {
              FingerprintWalletLockUI.i(FingerprintWalletLockUI.this);
              GMTrace.o(20257615904768L, 150931);
              return;
            }
            FingerprintWalletLockUI.b(FingerprintWalletLockUI.this, FingerprintWalletLockUI.this.getString(a.g.rwF));
            GMTrace.o(20257615904768L, 150931);
          }
        }, this.mToken, (String)localObject1, (String)localObject2);
      }
      GMTrace.o(20259629170688L, 150946);
      return;
      com.tencent.mm.plugin.walletlock.fingerprint.a.a.ej(SystemClock.elapsedRealtime());
      bAC();
    }
  }
  
  private void bAC()
  {
    GMTrace.i(20259763388416L, 150947);
    this.nfT = false;
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20255468421120L, 150915);
        FingerprintWalletLockUI.this.finish();
        GMTrace.o(20255468421120L, 150915);
      }
    }, 200L);
    Intent localIntent = (Intent)getIntent().getParcelableExtra("page_intent");
    if (localIntent != null)
    {
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo go to protected page");
      com.tencent.mm.plugin.walletlock.b.i.rze.jl(true);
      com.tencent.mm.plugin.walletlock.b.i.rze.jm(true);
      localIntent.addFlags(131072);
      startActivity(localIntent);
      overridePendingTransition(a.a.gci, a.a.gcj);
      GMTrace.o(20259763388416L, 150947);
      return;
    }
    w.i("MicroMsg.FingerprintWalletLockUI", "Protected page's intent not found, finish myself only.");
    GMTrace.o(20259763388416L, 150947);
  }
  
  private void bAz()
  {
    GMTrace.i(20258958082048L, 150941);
    if (this.uC.equals("action.verify_pattern"))
    {
      this.rxo.setText(a.g.rwM);
      this.rxo.setTextColor(getResources().getColor(a.b.aOE));
      this.rxp.setVisibility(0);
      GMTrace.o(20258958082048L, 150941);
      return;
    }
    this.rxo.setText(a.g.rwH);
    this.rxo.setTextColor(getResources().getColor(a.b.aOE));
    this.rxp.setVisibility(8);
    GMTrace.o(20258958082048L, 150941);
  }
  
  private void bwR()
  {
    GMTrace.i(20260031823872L, 150949);
    if ((this.rxx != null) && (this.rxx.isShowing())) {
      this.rxx.dismiss();
    }
    GMTrace.o(20260031823872L, 150949);
  }
  
  private void dismissDialog()
  {
    GMTrace.i(20259360735232L, 150944);
    bwR();
    if ((this.mgR != null) && (this.mgR.isShowing())) {
      this.mgR.dismiss();
    }
    GMTrace.o(20259360735232L, 150944);
  }
  
  private void qn(String paramString)
  {
    GMTrace.i(20260300259328L, 150951);
    int i = (int)(System.currentTimeMillis() / 1000L);
    if (i - this.llO > 1)
    {
      this.llO = i;
      dismissDialog();
      if (this.rxo != null)
      {
        this.rxo.setText(paramString);
        this.rxo.setTextColor(getResources().getColor(a.b.aOL));
        this.rxo.setVisibility(4);
        if (this.rxq == null) {
          this.rxq = AnimationUtils.loadAnimation(this.vKB.vKW, a.a.rvI);
        }
        this.rxo.startAnimation(this.rxq);
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20256273727488L, 150921);
            FingerprintWalletLockUI.h(FingerprintWalletLockUI.this).setVisibility(0);
            GMTrace.o(20256273727488L, 150921);
          }
        }, this.rxq.getDuration());
      }
      GMTrace.o(20260300259328L, 150951);
      return;
    }
    GMTrace.o(20260300259328L, 150951);
  }
  
  private void release()
  {
    GMTrace.i(20260434477056L, 150952);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo fingerprint lock ui release isCancelled: %b", new Object[] { Boolean.valueOf(this.nSm) });
    if (this.nSm)
    {
      GMTrace.o(20260434477056L, 150952);
      return;
    }
    this.nSm = true;
    if (this.rxu != null)
    {
      com.tencent.mm.plugin.walletlock.fingerprint.a.h localh = this.rxu;
      w.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo release fingerprint auth");
      if (localh.llw != null) {
        localh.llw.nc(true);
      }
    }
    if (this.rxt != null) {
      this.rxt.release();
    }
    f.cpS().cpT();
    GMTrace.o(20260434477056L, 150952);
  }
  
  private void s(int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(20260568694784L, 150953);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo finish with result, resultCode: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(-1), Integer.valueOf(paramInt2), paramString });
    release();
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt2);
    localIntent.putExtra("key_err_msg", paramString);
    setResult(-1, localIntent);
    finish();
    GMTrace.o(20260568694784L, 150953);
  }
  
  private void wr(String paramString)
  {
    GMTrace.i(20260166041600L, 150950);
    String str = paramString;
    if (bg.nm(paramString)) {
      str = getString(a.g.rwL);
    }
    dismissDialog();
    this.mgR = com.tencent.mm.ui.base.h.a(this, str, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20255736856576L, 150917);
        FingerprintWalletLockUI.this.finish();
        GMTrace.o(20255736856576L, 150917);
      }
    });
    this.mgR.setCanceledOnTouchOutside(false);
    GMTrace.o(20260166041600L, 150950);
  }
  
  private void xd(int paramInt)
  {
    GMTrace.i(20259897606144L, 150948);
    Intent localIntent = new Intent();
    if (paramInt == 1) {
      localIntent.putExtra("action", "action.touchlock_verify_by_paypwd");
    }
    for (;;)
    {
      localIntent.putExtra("key_wallet_lock_type", 2);
      com.tencent.mm.bj.d.b(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt);
      GMTrace.o(20259897606144L, 150948);
      return;
      if (paramInt == 2)
      {
        localIntent.putExtra("action", "action.touchlock_need_verify_paypwd");
        localIntent.putExtra("key_wallet_lock_input_new_fp_tips", getString(a.g.rwP));
      }
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(20258823864320L, 150940);
    super.MP();
    this.rxo = ((TextView)findViewById(a.d.rvS));
    this.rxp = ((TextView)findViewById(a.d.rvV));
    this.iZs = ((TextView)findViewById(a.d.rvR));
    this.rxp.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20255199985664L, 150913);
        FingerprintWalletLockUI.e(FingerprintWalletLockUI.this);
        GMTrace.o(20255199985664L, 150913);
      }
    });
    this.iZs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(20257347469312L, 150929);
        FingerprintWalletLockUI.bAD();
        FingerprintWalletLockUI.a(FingerprintWalletLockUI.this, "user cancel setting fingerprint lock");
        GMTrace.o(20257347469312L, 150929);
      }
    });
    GMTrace.o(20258823864320L, 150940);
  }
  
  public void finish()
  {
    GMTrace.i(20260702912512L, 150954);
    super.finish();
    release();
    GMTrace.o(20260702912512L, 150954);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20259092299776L, 150942);
    int i = a.e.rvX;
    GMTrace.o(20259092299776L, 150942);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(20260837130240L, 150955);
    w.v("MicroMsg.FingerprintWalletLockUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramIntent == null)
    {
      w.e("MicroMsg.FingerprintWalletLockUI", "alvinluo data is null");
      GMTrace.o(20260837130240L, 150955);
      return;
    }
    paramInt2 = paramIntent.getIntExtra("key_err_code", -1);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onActivityResult errCode: %d", new Object[] { Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      if (paramInt2 == 0)
      {
        bAC();
        com.tencent.mm.plugin.walletlock.b.h.bBd();
        GMTrace.o(20260837130240L, 150955);
        return;
      }
      if (paramInt2 == -1)
      {
        this.nfT = false;
        wr(getString(a.g.rwX));
        GMTrace.o(20260837130240L, 150955);
      }
    }
    else if (paramInt1 == 2)
    {
      if (paramInt2 == 0)
      {
        com.tencent.mm.plugin.walletlock.fingerprint.a.a.KO(this.rxw);
        com.tencent.mm.plugin.walletlock.fingerprint.a.a.ej(SystemClock.elapsedRealtime());
        bAC();
        GMTrace.o(20260837130240L, 150955);
        return;
      }
      if (paramInt2 == -1)
      {
        this.nfT = false;
        wr(getString(a.g.rwX));
        GMTrace.o(20260837130240L, 150955);
      }
    }
    else
    {
      if (paramInt1 == 3)
      {
        if (paramInt2 == 0)
        {
          bAC();
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        finish();
        com.tencent.mm.plugin.walletlock.b.i.rze.bBj();
        GMTrace.o(20260837130240L, 150955);
        return;
      }
      if (paramInt1 == 4)
      {
        if (paramInt2 == 0)
        {
          bAC();
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        if (paramInt2 == -1)
        {
          this.nfT = false;
          wr(getString(a.g.rwO));
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        finish();
        com.tencent.mm.plugin.walletlock.b.i.rze.bBj();
        GMTrace.o(20260837130240L, 150955);
        return;
      }
      if (paramInt1 == 5)
      {
        if (paramInt2 == 0)
        {
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).xc(0);
          paramIntent = com.tencent.mm.plugin.walletlock.b.g.rza;
          com.tencent.mm.plugin.walletlock.b.g.bAx();
          Toast.makeText(this, getString(a.g.rwC), 0).show();
          bAC();
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        if (paramInt2 == -1)
        {
          this.nfT = false;
          wr(getString(a.g.rwD));
          GMTrace.o(20260837130240L, 150955);
          return;
        }
        if (paramInt2 == 4)
        {
          finish();
          com.tencent.mm.plugin.walletlock.b.i.rze.bBj();
        }
      }
    }
    GMTrace.o(20260837130240L, 150955);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(20259494952960L, 150945);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onBackPressed");
    finish();
    com.tencent.mm.plugin.walletlock.b.i.rze.bBj();
    GMTrace.o(20259494952960L, 150945);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20258421211136L, 150937);
    super.onCreate(paramBundle);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onCreate %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    if (cN().cO() != null) {
      cN().cO().hide();
    }
    MP();
    paramBundle = getIntent();
    this.uC = paramBundle.getStringExtra("action");
    this.rxs = this.uC;
    this.rxr = paramBundle.getStringExtra("next_action");
    this.mToken = paramBundle.getStringExtra("token");
    this.llG = paramBundle.getStringExtra("key_pay_passwd");
    this.rxz = paramBundle.getIntExtra("scene", -1);
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo mAction: %s, mNextAction: %s", new Object[] { this.uC, this.rxr });
    if (this.uC.equals("action.verify_pattern"))
    {
      this.rxy = 2;
      com.tencent.mm.plugin.walletlock.b.h.bBf();
      GMTrace.o(20258421211136L, 150937);
      return;
    }
    if (this.uC.equals("action.switch_on_pattern")) {
      this.rxy = 1;
    }
    GMTrace.o(20258421211136L, 150937);
  }
  
  protected void onPause()
  {
    GMTrace.i(20258689646592L, 150939);
    super.onPause();
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo FingerprintWalletLockUI onPause");
    dismissDialog();
    release();
    this.nfT = true;
    GMTrace.o(20258689646592L, 150939);
  }
  
  protected void onResume()
  {
    GMTrace.i(20258555428864L, 150938);
    super.onResume();
    w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo needResume: %b", new Object[] { Boolean.valueOf(this.nfT) });
    if (!this.nfT)
    {
      GMTrace.o(20258555428864L, 150938);
      return;
    }
    this.rxt = new c();
    this.rxu = new com.tencent.mm.plugin.walletlock.fingerprint.a.h();
    this.nSm = false;
    f.cpS().cpT();
    this.rxx = com.tencent.mm.ui.base.h.a(this, getString(a.g.cUV), false, null);
    bAz();
    Object localObject;
    if (this.uC.equals("action.switch_on_pattern"))
    {
      this.rxi = false;
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo start prepare, time: %d, isOffline: %b", new Object[] { Long.valueOf(System.currentTimeMillis()), Boolean.valueOf(this.rxi) });
      localObject = com.tencent.mm.plugin.walletlock.b.g.rza;
      boolean bool = com.tencent.mm.plugin.walletlock.b.g.bBb();
      localObject = com.tencent.mm.plugin.walletlock.b.g.rza;
      if ((!com.tencent.mm.plugin.walletlock.b.g.bAv()) || (bool)) {
        break label566;
      }
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user opend fingerprint lock but device not support soter, isSupportFingerprintLock: %b", new Object[] { Boolean.valueOf(bool) });
      if (!com.tencent.mm.plugin.walletlock.gesture.a.e.bAG()) {
        break label464;
      }
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user opened gesture, then switch to gesture");
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).xc(1);
      localObject = com.tencent.mm.plugin.walletlock.b.g.rza;
      com.tencent.mm.plugin.walletlock.b.g.jh(true);
      finish();
      localObject = new Intent(this, GestureGuardLogicUI.class);
      ((Intent)localObject).addFlags(131072);
      ((Intent)localObject).putExtra("action", "action.verify_pattern");
      ((Intent)localObject).putExtra("next_action", "next_action.goto_protected_page");
      ((Intent)localObject).putExtra("page_intent", getIntent().getParcelableExtra("page_intent"));
      ((Intent)localObject).setPackage(ab.getPackageName());
      bool = com.tencent.mm.kernel.h.xy().xh().getBoolean(w.a.vzr, false);
      if (!bool)
      {
        ((Intent)localObject).putExtra("verify_title", getString(a.g.rwW));
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vzr, Boolean.valueOf(true));
        com.tencent.mm.kernel.h.xy().xh().kL(true);
      }
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo start gesture protect ui, isShowed: %b", new Object[] { Boolean.valueOf(bool) });
      startActivity((Intent)localObject);
      com.tencent.mm.plugin.report.service.g.ork.i(12097, new Object[] { Integer.valueOf(8), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
    }
    for (;;)
    {
      w.i("MicroMsg.FingerprintWalletLockUI", "onResume end: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      GMTrace.o(20258555428864L, 150938);
      return;
      this.rxi = true;
      break;
      label464:
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo show not support fingerprint dialog");
      bwR();
      this.mgR = new i.a(this).BO(a.g.rwS).BQ(a.g.rwV).a(new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20263924137984L, 150978);
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user click set gesture");
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).b(FingerprintWalletLockUI.this, 1, 4);
          GMTrace.o(20263924137984L, 150978);
        }
      }).d(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(20263387267072L, 150974);
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo cancel not support fingerprint dialog");
          FingerprintWalletLockUI.this.finish();
          FingerprintWalletLockUI.bAD();
          GMTrace.o(20263387267072L, 150974);
        }
      }).aax();
      this.mgR.setCanceledOnTouchOutside(false);
      this.mgR.b(getString(a.g.rwB), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20257884340224L, 150933);
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user click close wallet lock");
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.walletlock.a.b.class)).i(FingerprintWalletLockUI.this, 5);
          GMTrace.o(20257884340224L, 150933);
        }
      });
      this.mgR.show();
      continue;
      label566:
      if (!com.tencent.d.a.a.hE(this))
      {
        bAA();
      }
      else
      {
        localObject = new Bundle();
        ((Bundle)localObject).putString("key_pay_passwd", this.llG);
        ((Bundle)localObject).putBoolean("key_fp_lock_offline_mode", this.rxi);
        this.rxt.a(new d.a()
        {
          public final void R(int paramAnonymousInt, String paramAnonymousString)
          {
            GMTrace.i(20256005292032L, 150919);
            w.i("MicroMsg.FingerprintWalletLockUI", "prepare onFinish errCode: %d, errMsg: %s, time: %d", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString, Long.valueOf(System.currentTimeMillis()) });
            if (FingerprintWalletLockUI.c(FingerprintWalletLockUI.this))
            {
              w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo has cancelled and return");
              GMTrace.o(20256005292032L, 150919);
              return;
            }
            if (paramAnonymousInt == 0)
            {
              FingerprintWalletLockUI.f(FingerprintWalletLockUI.this);
              GMTrace.o(20256005292032L, 150919);
              return;
            }
            FingerprintWalletLockUI.b(FingerprintWalletLockUI.this, FingerprintWalletLockUI.this.getString(a.g.rwI));
            GMTrace.o(20256005292032L, 150919);
          }
        }, (Bundle)localObject);
      }
    }
  }
  
  public final class a
    implements com.tencent.mm.plugin.walletlock.b.b
  {
    private WeakReference<FingerprintWalletLockUI> lmc;
    
    public a(FingerprintWalletLockUI paramFingerprintWalletLockUI)
    {
      GMTrace.i(20256676380672L, 150924);
      this.lmc = null;
      this.lmc = new WeakReference(paramFingerprintWalletLockUI);
      GMTrace.o(20256676380672L, 150924);
    }
    
    private FingerprintWalletLockUI bAE()
    {
      GMTrace.i(20256810598400L, 150925);
      if (this.lmc != null)
      {
        FingerprintWalletLockUI localFingerprintWalletLockUI = (FingerprintWalletLockUI)this.lmc.get();
        GMTrace.o(20256810598400L, 150925);
        return localFingerprintWalletLockUI;
      }
      GMTrace.o(20256810598400L, 150925);
      return null;
    }
    
    public final void bAF()
    {
      GMTrace.i(20256944816128L, 150926);
      FingerprintWalletLockUI.a(FingerprintWalletLockUI.this);
      FingerprintWalletLockUI.b(FingerprintWalletLockUI.this);
      GMTrace.o(20256944816128L, 150926);
    }
    
    public final void z(int paramInt, String paramString)
    {
      GMTrace.i(20257079033856L, 150927);
      w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onResult result: %d, errMsg: %s, isCancelled: %b", new Object[] { Integer.valueOf(paramInt), paramString, Boolean.valueOf(FingerprintWalletLockUI.c(FingerprintWalletLockUI.this)) });
      if (FingerprintWalletLockUI.c(FingerprintWalletLockUI.this))
      {
        GMTrace.o(20257079033856L, 150927);
        return;
      }
      switch (paramInt)
      {
      }
      for (;;)
      {
        GMTrace.o(20257079033856L, 150927);
        return;
        w.i("MicroMsg.FingerprintWalletLockUI", "identify success");
        if (bAE() != null)
        {
          FingerprintWalletLockUI.d(bAE());
          GMTrace.o(20257079033856L, 150927);
          return;
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user cancel");
          GMTrace.o(20257079033856L, 150927);
          return;
          w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo identify ERR_NO_MATCH");
          if (bAE() != null)
          {
            FingerprintWalletLockUI.a(bAE(), paramInt, FingerprintWalletLockUI.this.getString(a.g.rwK));
            GMTrace.o(20257079033856L, 150927);
            return;
            w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo identify TIMEOUT");
            if (bAE() != null)
            {
              FingerprintWalletLockUI.a(bAE(), paramInt, FingerprintWalletLockUI.this.getString(a.g.rwK));
              GMTrace.o(20257079033856L, 150927);
              return;
              if (bAE() != null)
              {
                FingerprintWalletLockUI.b(bAE(), paramInt, FingerprintWalletLockUI.this.getString(a.g.rwI));
                GMTrace.o(20257079033856L, 150927);
                return;
                if (bAE() != null)
                {
                  FingerprintWalletLockUI.b(bAE(), paramInt, FingerprintWalletLockUI.this.getString(a.g.rwR));
                  GMTrace.o(20257079033856L, 150927);
                  return;
                  w.i("MicroMsg.FingerprintWalletLockUI", "alvinluo on error: %d", new Object[] { Integer.valueOf(paramInt) });
                  if (bAE() != null) {
                    FingerprintWalletLockUI.b(bAE(), paramInt, FingerprintWalletLockUI.this.getString(a.g.rwJ));
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\walletlock\fingerprint\ui\FingerprintWalletLockUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */