package com.tencent.mm.plugin.traceroute.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.jx;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.network.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;

public class NetworkDiagnoseAllInOneUI
  extends MMActivity
  implements View.OnClickListener
{
  private ImageView eId;
  private a.a fJt;
  private aj htb;
  private Button jgH;
  private com.tencent.mm.modelgeo.c mEj;
  private com.tencent.mm.sdk.b.c<jx> qAA;
  private boolean qAB;
  private boolean qAC;
  private boolean qAD;
  private int qAs;
  private TextView qAt;
  private TextView qAu;
  private TextView qAv;
  private TextView qAw;
  private r qAx;
  private int qAy;
  private String qAz;
  
  public NetworkDiagnoseAllInOneUI()
  {
    GMTrace.i(20411832074240L, 152080);
    GMTrace.o(20411832074240L, 152080);
  }
  
  private void aWO()
  {
    GMTrace.i(20412368945152L, 152084);
    w.i("MicroMsg.NetworkDiagnoseAllInOneUI", "refreshUI, state:%d", new Object[] { Integer.valueOf(this.qAs) });
    switch (this.qAs)
    {
    }
    for (;;)
    {
      GMTrace.o(20412368945152L, 152084);
      return;
      this.eId.setImageResource(R.k.cNt);
      this.qAv.setText(getString(R.l.dmP, new Object[] { Integer.valueOf(this.qAy) }));
      this.qAw.setText(R.l.dmK);
      this.jgH.setVisibility(4);
      this.qAu.setVisibility(4);
      GMTrace.o(20412368945152L, 152084);
      return;
      this.eId.setImageResource(R.k.cNt);
      this.qAv.setText(R.l.dmT);
      this.qAw.setText(R.l.dmN);
      this.jgH.setVisibility(0);
      this.qAu.setVisibility(4);
      GMTrace.o(20412368945152L, 152084);
      return;
      this.eId.setImageResource(R.k.cNr);
      this.qAv.setText(R.l.dmS);
      this.qAw.setText(R.l.dmL);
      this.jgH.setVisibility(0);
      this.jgH.setText(R.l.dmI);
      this.qAu.setVisibility(0);
      GMTrace.o(20412368945152L, 152084);
      return;
      this.eId.setImageResource(R.k.cNr);
      this.qAv.setText(R.l.dmQ);
      this.qAw.setText(R.l.dmL);
      this.jgH.setVisibility(0);
      this.jgH.setText(R.l.dmI);
      this.qAu.setVisibility(0);
      GMTrace.o(20412368945152L, 152084);
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("title", R.l.dLh);
      localIntent.putExtra("rawUrl", getString(R.l.dLe));
      localIntent.putExtra("showShare", false);
      com.tencent.mm.bj.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
      iq(false);
      finish();
      GMTrace.o(20412368945152L, 152084);
      return;
      this.eId.setImageResource(R.k.cNs);
      this.qAv.setText(R.l.dmR);
      this.qAw.setText(R.l.dmM);
      this.jgH.setVisibility(0);
      this.jgH.setText(R.l.dmH);
      this.qAu.setVisibility(4);
    }
  }
  
  private void iq(boolean paramBoolean)
  {
    GMTrace.i(20412503162880L, 152085);
    if (bg.nm(this.qAz))
    {
      GMTrace.o(20412503162880L, 152085);
      return;
    }
    w.i("MicroMsg.NetworkDiagnoseAllInOneUI", "submit action, bSendLoaction:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      if (com.tencent.mm.pluginsdk.h.a.a(this, "android.permission.ACCESS_COARSE_LOCATION", 71, "", ""))
      {
        getString(R.l.cUG);
        this.qAx = h.a(this, getString(R.l.dmU), true, null);
        this.jgH.setEnabled(false);
        if (this.mEj == null) {
          this.mEj = com.tencent.mm.modelgeo.c.Ir();
        }
        this.mEj.a(this.fJt, true);
      }
    }
    for (;;)
    {
      this.qAz = null;
      GMTrace.o(20412503162880L, 152085);
      return;
      g.ork.A(14533, "," + this.qAz);
    }
  }
  
  public void finish()
  {
    GMTrace.i(20412100509696L, 152082);
    super.finish();
    overridePendingTransition(R.a.aLj, R.a.aLE);
    GMTrace.o(20412100509696L, 152082);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(20412234727424L, 152083);
    int i = R.i.cCY;
    GMTrace.o(20412234727424L, 152083);
    return i;
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(20412637380608L, 152086);
    if (((this.qAs == 5) || (this.qAs == 4)) && (paramView == this.jgH))
    {
      iq(true);
      GMTrace.o(20412637380608L, 152086);
      return;
    }
    iq(false);
    finish();
    GMTrace.o(20412637380608L, 152086);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(20411966291968L, 152081);
    super.onCreate(paramBundle);
    overridePendingTransition(R.a.aLG, R.a.aLj);
    sq("");
    cN().cO().hide();
    paramBundle = getIntent();
    this.qAs = paramBundle.getIntExtra("diagnose_state", 0);
    this.qAy = paramBundle.getIntExtra("diagnose_percent", 1);
    this.qAz = paramBundle.getStringExtra("diagnose_kvInfo");
    w.i("MicroMsg.NetworkDiagnoseAllInOneUI", "get state: %d percent: %d, kv: %s", new Object[] { Integer.valueOf(this.qAs), Integer.valueOf(this.qAy), this.qAz });
    if (this.qAs == 0)
    {
      this.qAs = 1;
      w.i("MicroMsg.NetworkDiagnoseAllInOneUI", "start diagnose");
      at.wS().a(new bf(new bf.a()
      {
        public final void a(e paramAnonymouse)
        {
          GMTrace.i(20416127041536L, 152112);
          if (paramAnonymouse == null)
          {
            GMTrace.o(20416127041536L, 152112);
            return;
          }
          try
          {
            paramAnonymouse.Eb();
            GMTrace.o(20416127041536L, 152112);
            return;
          }
          catch (Exception paramAnonymouse)
          {
            GMTrace.o(20416127041536L, 152112);
          }
        }
      }), 0);
    }
    this.jgH = ((Button)findViewById(R.h.btP));
    this.qAt = ((TextView)findViewById(R.h.btN));
    this.qAu = ((TextView)findViewById(R.h.btM));
    this.eId = ((ImageView)findViewById(R.h.btR));
    this.qAv = ((TextView)findViewById(R.h.btS));
    this.qAw = ((TextView)findViewById(R.h.btO));
    this.qAt.setOnClickListener(this);
    this.jgH.setOnClickListener(this);
    this.qAu.setOnClickListener(this);
    aWO();
    this.qAA = new com.tencent.mm.sdk.b.c() {};
    com.tencent.mm.sdk.b.a.vgX.a(this.qAA);
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(20411697856512L, 152079);
        w.i("MicroMsg.NetworkDiagnoseAllInOneUI", "get location, isOK:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        NetworkDiagnoseAllInOneUI.g(NetworkDiagnoseAllInOneUI.this).c(NetworkDiagnoseAllInOneUI.f(NetworkDiagnoseAllInOneUI.this));
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20410892550144L, 152073);
            NetworkDiagnoseAllInOneUI.h(NetworkDiagnoseAllInOneUI.this).setEnabled(true);
            if ((NetworkDiagnoseAllInOneUI.i(NetworkDiagnoseAllInOneUI.this) != null) && (NetworkDiagnoseAllInOneUI.i(NetworkDiagnoseAllInOneUI.this).isShowing())) {
              NetworkDiagnoseAllInOneUI.i(NetworkDiagnoseAllInOneUI.this).dismiss();
            }
            NetworkDiagnoseAllInOneUI.b(NetworkDiagnoseAllInOneUI.this, 6);
            NetworkDiagnoseAllInOneUI.b(NetworkDiagnoseAllInOneUI.this);
            GMTrace.o(20410892550144L, 152073);
          }
        });
        NetworkDiagnoseAllInOneUI.j(NetworkDiagnoseAllInOneUI.this);
        if (paramAnonymousBoolean) {
          str = String.valueOf(paramAnonymousFloat2) + "-" + String.valueOf(paramAnonymousFloat1);
        }
        for (String str = str + "," + NetworkDiagnoseAllInOneUI.j(NetworkDiagnoseAllInOneUI.this);; str = "," + NetworkDiagnoseAllInOneUI.j(NetworkDiagnoseAllInOneUI.this))
        {
          g.ork.A(14533, str);
          GMTrace.o(20411697856512L, 152079);
          return false;
          w.e("MicroMsg.NetworkDiagnoseAllInOneUI", "get geolocation fail");
        }
      }
    };
    this.htb = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(20411160985600L, 152075);
        NetworkDiagnoseAllInOneUI.a(NetworkDiagnoseAllInOneUI.this, NetworkDiagnoseAllInOneUI.k(NetworkDiagnoseAllInOneUI.this) + 1);
        w.v("MicroMsg.NetworkDiagnoseAllInOneUI", "timer fired, percent:%d", new Object[] { Integer.valueOf(NetworkDiagnoseAllInOneUI.k(NetworkDiagnoseAllInOneUI.this)) });
        if (NetworkDiagnoseAllInOneUI.k(NetworkDiagnoseAllInOneUI.this) > 99)
        {
          GMTrace.o(20411160985600L, 152075);
          return false;
        }
        if (NetworkDiagnoseAllInOneUI.a(NetworkDiagnoseAllInOneUI.this) == 1) {
          NetworkDiagnoseAllInOneUI.l(NetworkDiagnoseAllInOneUI.this).setText(NetworkDiagnoseAllInOneUI.this.getString(R.l.dmP, new Object[] { Integer.valueOf(NetworkDiagnoseAllInOneUI.k(NetworkDiagnoseAllInOneUI.this)) }));
        }
        GMTrace.o(20411160985600L, 152075);
        return true;
      }
    }, true);
    if ((this.qAs == 0) || (this.qAs == 1)) {
      this.htb.z(1000L, 1000L);
    }
    GMTrace.o(20411966291968L, 152081);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(20412771598336L, 152087);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.vgX.c(this.qAA);
    if (this.mEj != null)
    {
      this.mEj.c(this.fJt);
      this.mEj = null;
    }
    if (this.htb != null)
    {
      this.htb.stopTimer();
      this.htb = null;
    }
    GMTrace.o(20412771598336L, 152087);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(20412905816064L, 152088);
    w.i("MicroMsg.NetworkDiagnoseAllInOneUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(20412905816064L, 152088);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        iq(true);
        GMTrace.o(20412905816064L, 152088);
        return;
      }
      h.a(this, getString(R.l.dNq), getString(R.l.dNu), getString(R.l.dFX), getString(R.l.dNo), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20416663912448L, 152116);
          NetworkDiagnoseAllInOneUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(20416663912448L, 152116);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(20416395476992L, 152114);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(20416395476992L, 152114);
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\traceroute\ui\NetworkDiagnoseAllInOneUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */