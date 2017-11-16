package com.tencent.mm.plugin.soter_mp.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.d.a.c.h;
import com.tencent.d.b.f.b.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.plugin.soter_mp.b.d;
import com.tencent.mm.plugin.soter_mp.ui.SoterAuthenticationUI;
import com.tencent.mm.plugin.soter_mp.ui.SoterAuthenticationUI.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import java.lang.ref.WeakReference;

public final class b
  extends c
  implements com.tencent.mm.ad.e
{
  public com.tencent.d.b.c.a llw;
  public TextView mPc;
  public boolean qpQ;
  private i qpR;
  public ImageView qpS;
  private final int qpT;
  private int qpU;
  private final long qpV;
  Animation qpW;
  Animation qpX;
  public Runnable qpY;
  
  public b(WeakReference<Activity> paramWeakReference, d paramd, com.tencent.mm.plugin.soter_mp.b.e parame)
  {
    super(paramWeakReference, paramd, parame);
    GMTrace.i(7081058893824L, 52758);
    this.qpQ = false;
    this.llw = null;
    this.qpR = null;
    this.qpS = null;
    this.mPc = null;
    this.qpT = 3;
    this.qpU = 0;
    this.qpV = 500L;
    this.qpW = null;
    this.qpX = null;
    this.qpY = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18044097134592L, 134439);
        b.this.mPc.setTextColor(b.this.mPc.getResources().getColor(R.e.aNY));
        b.this.mPc.setText(b.this.mPc.getResources().getString(R.l.edt));
        b.this.qpS.setImageResource(R.k.bAe);
        GMTrace.o(18044097134592L, 134439);
      }
    };
    GMTrace.o(7081058893824L, 52758);
  }
  
  private boolean bqH()
  {
    GMTrace.i(7081327329280L, 52760);
    if (SoterAuthenticationUI.qqk != null) {
      SoterAuthenticationUI.qqk.obtainMessage(4).sendToTarget();
    }
    for (;;)
    {
      w.i("MicroMsg.SoterControllerFingerprint", "hy: auth key not valid or auth key not valid");
      com.tencent.d.b.a.a(new com.tencent.d.b.a.b() {}, false, 2, new com.tencent.mm.plugin.soter_mp.b.c(), new com.tencent.mm.plugin.soter.b.e());
      GMTrace.o(7081327329280L, 52760);
      return false;
      w.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7082132635648L, 52766);
    GMTrace.o(7082132635648L, 52766);
  }
  
  public final void bqI()
  {
    GMTrace.i(18042352304128L, 134426);
    this.llw = new com.tencent.d.b.c.a();
    com.tencent.d.b.a.b local3 = new com.tencent.d.b.a.b() {};
    com.tencent.d.b.c.b local4 = new com.tencent.d.b.c.b()
    {
      public final void aAa()
      {
        GMTrace.i(18045036658688L, 134446);
        w.v("MicroMsg.SoterControllerFingerprint", "alvinluo mp onAuthenticationCancelled");
        b.this.llw = null;
        GMTrace.o(18045036658688L, 134446);
      }
      
      public final void azY()
      {
        GMTrace.i(18044499787776L, 134442);
        w.v("MicroMsg.SoterControllerFingerprint", "alvinluo mp onStartAuthencation");
        b.this.qpQ = true;
        GMTrace.o(18044499787776L, 134442);
      }
      
      public final void azZ()
      {
        GMTrace.i(18044768223232L, 134444);
        w.i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen success");
        b.this.qpQ = false;
        b.this.llw = null;
        b localb = b.this;
        localb.mPc.removeCallbacks(localb.qpY);
        localb.qpS.setImageResource(R.k.cME);
        localb.mPc.setTextColor(localb.mPc.getResources().getColor(R.e.aPc));
        localb.mPc.setText(localb.mPc.getResources().getString(R.l.edu));
        GMTrace.o(18044768223232L, 134444);
      }
      
      public final void onAuthenticationError(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
      {
        GMTrace.i(18045170876416L, 134447);
        w.e("MicroMsg.SoterControllerFingerprint", "hy: on mp authen error errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousCharSequence });
        GMTrace.o(18045170876416L, 134447);
      }
      
      public final void onAuthenticationFailed()
      {
        GMTrace.i(18044902440960L, 134445);
        w.w("MicroMsg.SoterControllerFingerprint", "hy: mp user trying failed");
        b localb = b.this;
        String str = ab.getContext().getString(R.l.eds);
        if (localb.qpW == null) {
          localb.qpW = com.tencent.mm.ui.c.a.fg(localb.qpS.getContext());
        }
        if (localb.qpX == null) {
          localb.qpX = com.tencent.mm.ui.c.a.fg(localb.qpS.getContext());
        }
        localb.qpW.setAnimationListener(new b.7(localb, str));
        localb.mPc.startAnimation(localb.qpW);
        localb.qpS.startAnimation(localb.qpX);
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18042754957312L, 134429);
            b.this.qpQ = false;
            b.this.ii(true);
            GMTrace.o(18042754957312L, 134429);
          }
        }, 500L);
        GMTrace.o(18044902440960L, 134445);
      }
      
      public final void onAuthenticationHelp(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
      {
        GMTrace.i(18044634005504L, 134443);
        w.i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen help errCode: %d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousCharSequence });
        GMTrace.o(18044634005504L, 134443);
      }
    };
    b.a locala = new b.a().Fm(2).hP(ab.getContext()).a(this.llw).Yz(this.qqd.llD);
    locala.yaQ.yaO = null;
    com.tencent.d.b.a.a(local3, locala.a(local4).yaQ);
    GMTrace.o(18042352304128L, 134426);
  }
  
  @TargetApi(23)
  public final void cP()
  {
    GMTrace.i(7081193111552L, 52759);
    if (!com.tencent.d.a.a.hE(ab.getContext()))
    {
      this.qqe.errCode = 90011;
      this.qqe.eAR = "no fingerprint enrolled";
      bqM();
    }
    try
    {
      if (ab.getContext().checkSelfPermission("android.permission.USE_FINGERPRINT") != 0)
      {
        if (SoterAuthenticationUI.qqk != null)
        {
          Message localMessage = SoterAuthenticationUI.qqk.obtainMessage(3);
          Bundle localBundle = new Bundle();
          localBundle.putStringArray("permissions", new String[] { "android.permission.USE_FINGERPRINT" });
          localBundle.putInt("request_code", 0);
          localMessage.setData(localBundle);
          localMessage.sendToTarget();
          GMTrace.o(7081193111552L, 52759);
          return;
        }
        w.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        GMTrace.o(7081193111552L, 52759);
        return;
      }
    }
    catch (NoSuchMethodError localNoSuchMethodError)
    {
      w.i("MicroMsg.SoterControllerFingerprint", "hy: not implements the checkSelfPermission. permission already given");
      this.qpQ = true;
      GMTrace.o(7081193111552L, 52759);
      return;
    }
    this.qpQ = true;
    GMTrace.o(7081193111552L, 52759);
  }
  
  @TargetApi(16)
  public final void ii(boolean paramBoolean)
  {
    GMTrace.i(18042218086400L, 134425);
    if ((this.qpR == null) || (!this.qpR.isShowing()))
    {
      if ((this.qqf == null) || (this.qqf.get() == null))
      {
        w.e("MicroMsg.SoterControllerFingerprint", "hy: ui released.");
        this.qqe.errCode = 90007;
        this.qqe.eAR = "internal error occurred: ui released";
        bqM();
      }
    }
    else
    {
      if (!paramBoolean) {
        break label299;
      }
      if (Build.VERSION.SDK_INT >= 23) {
        break label294;
      }
    }
    label294:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        break label299;
      }
      w.i("MicroMsg.SoterControllerFingerprint", "hy: req restart after fail, but no need");
      GMTrace.o(18042218086400L, 134425);
      return;
      if (this.qpR == null)
      {
        Object localObject = (Activity)this.qqf.get();
        i.a locala = new i.a((Context)localObject);
        localObject = ((Activity)localObject).getLayoutInflater().inflate(R.i.cxh, null, false);
        this.qpS = ((ImageView)((View)localObject).findViewById(R.h.bAe));
        this.mPc = ((TextView)((View)localObject).findViewById(R.h.bAf));
        ((TextView)((View)localObject).findViewById(R.h.bAd)).setText(this.qqd.content);
        locala.dg((View)localObject);
        locala.lz(true);
        locala.BR(R.l.cSk).b(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(18044365570048L, 134441);
            w.i("MicroMsg.SoterControllerFingerprint", "hy: user cancelled auth by click button");
            b.this.llw.nc(true);
            b.this.bqL();
            GMTrace.o(18044365570048L, 134441);
          }
        });
        locala.d(new DialogInterface.OnCancelListener()
        {
          @TargetApi(16)
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(18043694481408L, 134436);
            w.i("MicroMsg.SoterControllerFingerprint", "hy: user cancelled auth");
            b.this.bqL();
            GMTrace.o(18043694481408L, 134436);
          }
        });
        this.qpR = locala.aax();
        a(this.qpR);
        this.qpR.setCanceledOnTouchOutside(false);
      }
      if (this.qpR.isShowing()) {
        break;
      }
      this.qpR.show();
      break;
    }
    label299:
    if (this.llw != null)
    {
      w.e("MicroMsg.SoterControllerFingerprint", "alvinluo mFingerprintCanceller not null, cancel and start auth by delaying 500ms.");
      this.llw.nc(true);
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18043828699136L, 134437);
          b.this.llw = new com.tencent.d.b.c.a();
          b.this.bqI();
          GMTrace.o(18043828699136L, 134437);
        }
      }, 500L);
      GMTrace.o(18042218086400L, 134425);
      return;
    }
    bqI();
    GMTrace.o(18042218086400L, 134425);
  }
  
  @TargetApi(16)
  public final void onPause()
  {
    GMTrace.i(7081864200192L, 52764);
    if ((this.qpQ) && (this.llw != null)) {
      this.llw.nc(true);
    }
    if ((this.qpR != null) && (this.qpR.isShowing())) {
      this.qpR.dismiss();
    }
    GMTrace.o(7081864200192L, 52764);
  }
  
  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(7081461547008L, 52761);
    if (paramInt == 0)
    {
      if ((paramArrayOfString.length > 0) && (paramArrayOfInt.length > 0) && ("android.permission.USE_FINGERPRINT".equals(paramArrayOfString[0])) && (paramArrayOfInt[0] == 0))
      {
        w.i("MicroMsg.SoterControllerFingerprint", "hy: permission granted");
        bqH();
        this.qpQ = true;
        GMTrace.o(7081461547008L, 52761);
        return;
      }
      w.w("MicroMsg.SoterControllerFingerprint", "hy: permission not granted");
      this.qqe.errCode = 90002;
      this.qqe.eAR = "user not grant to use fingerprint";
      bqM();
    }
    GMTrace.o(7081461547008L, 52761);
  }
  
  public final void onResume()
  {
    GMTrace.i(7081729982464L, 52763);
    if (this.qpQ) {
      bqH();
    }
    GMTrace.o(7081729982464L, 52763);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter_mp\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */