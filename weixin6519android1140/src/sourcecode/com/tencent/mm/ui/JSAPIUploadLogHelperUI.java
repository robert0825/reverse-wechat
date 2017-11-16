package com.tencent.mm.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.ah;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import com.tencent.mm.y.q;

public class JSAPIUploadLogHelperUI
  extends MMBaseActivity
{
  private static volatile boolean mIsRunning;
  private static byte[] vJa;
  
  static
  {
    GMTrace.i(2860448219136L, 21312);
    mIsRunning = false;
    vJa = new byte[0];
    GMTrace.o(2860448219136L, 21312);
  }
  
  public JSAPIUploadLogHelperUI()
  {
    GMTrace.i(2859777130496L, 21307);
    GMTrace.o(2859777130496L, 21307);
  }
  
  protected void onCreate(Bundle arg1)
  {
    GMTrace.i(2859911348224L, 21308);
    w.i("MicroMsg.JSAPIUploadLogHelperUI", "onCreate called, isRunning:%b", new Object[] { Boolean.valueOf(mIsRunning) });
    super.onCreate(???);
    setContentView(R.i.cpE);
    final int i;
    for (;;)
    {
      synchronized (vJa)
      {
        if (mIsRunning)
        {
          w.w("MicroMsg.JSAPIUploadLogHelperUI", "reentered while last one is running, finish myself.");
          finish();
        }
        ??? = getIntent().getStringExtra("key_user");
        i = getIntent().getIntExtra("key_time", 0);
        if ((??? != null) && (???.equals(q.zE())))
        {
          bool = true;
          w.i("MicroMsg.JSAPIUploadLogHelperUI", "upload log from jsapi, in upload activity, username-recv-well:%b, time:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
          if (??? != null) {
            break;
          }
          w.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: userName is null.");
          finish();
          GMTrace.o(2859911348224L, 21308);
          return;
        }
      }
      boolean bool = false;
    }
    if (i < 0)
    {
      w.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: illegal time value: %d", new Object[] { Integer.valueOf(i) });
      finish();
      GMTrace.o(2859911348224L, 21308);
      return;
    }
    getString(R.l.cUG);
    final r localr = h.a(this, getString(R.l.elO), false, null);
    at.wS().a(new bf(new bf.a()
    {
      public final void a(e arg1)
      {
        GMTrace.i(2875212169216L, 21422);
        synchronized (JSAPIUploadLogHelperUI.bXd())
        {
          JSAPIUploadLogHelperUI.kZ(true);
          at.wS().a(1, "", 0, false);
          w.bPM();
          at.wS().a(2, paramBundle, i, at.AU());
          GMTrace.o(2875212169216L, 21422);
          return;
        }
      }
    }), 0);
    at.a(new ah()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(2905545375744L, 21648);
        if (!JSAPIUploadLogHelperUI.this.isFinishing()) {
          JSAPIUploadLogHelperUI.this.finish();
        }
        GMTrace.o(2905545375744L, 21648);
      }
    }
    {
      public final void eD(int paramAnonymousInt)
      {
        GMTrace.i(2102252273664L, 15663);
        if (paramAnonymousInt < 0)
        {
          w.e("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, error happened, percent:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          at.a(null);
          if (localr != null) {
            localr.dismiss();
          }
          ??? = h.h(JSAPIUploadLogHelperUI.this, R.l.efu, R.l.cUG);
          if (??? != null) {
            ((i)???).setOnDismissListener(this.vJc);
          }
          synchronized (JSAPIUploadLogHelperUI.bXd())
          {
            JSAPIUploadLogHelperUI.kZ(false);
            GMTrace.o(2102252273664L, 15663);
            return;
          }
        }
        if (paramAnonymousInt >= 100)
        {
          w.i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi done.");
          at.a(null);
          if (localr != null) {
            localr.dismiss();
          }
          ??? = h.h(JSAPIUploadLogHelperUI.this, R.l.efy, R.l.cUG);
          if (??? != null) {
            ((i)???).setOnDismissListener(this.vJc);
          }
          long l = System.currentTimeMillis() / 1000L;
          g.ork.i(12975, new Object[] { Long.valueOf(l) });
          synchronized (JSAPIUploadLogHelperUI.bXd())
          {
            JSAPIUploadLogHelperUI.kZ(false);
            GMTrace.o(2102252273664L, 15663);
            return;
          }
        }
        w.i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, ipxx progress:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (localr != null) {
          localr.setMessage(JSAPIUploadLogHelperUI.this.getString(R.l.efv) + paramAnonymousInt + "%");
        }
        GMTrace.o(2102252273664L, 15663);
      }
    });
    GMTrace.o(2859911348224L, 21308);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2860045565952L, 21309);
    w.i("MicroMsg.JSAPIUploadLogHelperUI", "onDestroy called, isRunning:%b", new Object[] { Boolean.valueOf(mIsRunning) });
    super.onDestroy();
    GMTrace.o(2860045565952L, 21309);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\JSAPIUploadLogHelperUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */