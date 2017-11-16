package com.tencent.mm.ui.bindqq;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ac.d;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ae.b;
import com.tencent.mm.bu.g;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.modelfriend.ac;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class StartUnbindQQ
  extends MMWizardActivity
  implements e
{
  private r hsU;
  private com.tencent.mm.ui.base.i oIo;
  private String oJt;
  private View wol;
  
  public StartUnbindQQ()
  {
    GMTrace.i(1899851939840L, 14155);
    this.oJt = null;
    GMTrace.o(1899851939840L, 14155);
  }
  
  protected final void MP()
  {
    GMTrace.i(1900523028480L, 14160);
    oM(R.l.eeU);
    this.wol = findViewById(R.h.ccN);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1899717722112L, 14154);
        StartUnbindQQ.this.finish();
        GMTrace.o(1899717722112L, 14154);
        return true;
      }
    });
    this.wol.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1890456698880L, 14085);
        if (StartUnbindQQ.a(StartUnbindQQ.this) == null)
        {
          StartUnbindQQ.a(StartUnbindQQ.this, h.a(StartUnbindQQ.this, StartUnbindQQ.this.getString(R.l.dYf), null, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(1888846086144L, 14073);
              paramAnonymous2DialogInterface = new b("");
              at.wS().a(paramAnonymous2DialogInterface, 0);
              paramAnonymous2DialogInterface = StartUnbindQQ.this;
              StartUnbindQQ localStartUnbindQQ = StartUnbindQQ.this;
              StartUnbindQQ.this.getString(R.l.cUG);
              StartUnbindQQ.a(paramAnonymous2DialogInterface, h.a(localStartUnbindQQ, StartUnbindQQ.this.getString(R.l.dYg), true, null));
              GMTrace.o(1888846086144L, 14073);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(1888040779776L, 14067);
              GMTrace.o(1888040779776L, 14067);
            }
          }));
          GMTrace.o(1890456698880L, 14085);
          return;
        }
        StartUnbindQQ.a(StartUnbindQQ.this).show();
        GMTrace.o(1890456698880L, 14085);
      }
    });
    GMTrace.o(1900523028480L, 14160);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1900657246208L, 14161);
    w.d("MicroMsg.StartUnbindQQ", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramk.getType());
    if (paramk.getType() == 253)
    {
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        at.AR();
        paramInt1 = bg.a((Integer)c.xh().get(9, null), 0);
        w.d("MicroMsg.StartUnbindQQ", "iBindUin " + paramInt1);
        if (paramInt1 != 0)
        {
          at.AR();
          c.yS().iD(new o(paramInt1) + "@qqim");
        }
        at.AR();
        paramk = c.xh().get(102407, null);
        if ((paramk != null) && (((String)paramk).length() > 0))
        {
          at.AR();
          c.xh().set(102407, null);
        }
      }
      try
      {
        com.tencent.mm.sdk.b.a.vgX.m(new ag());
        at.AR();
        paramInt1 = bg.a((Integer)c.xh().get(9, null), 0);
        paramk = new o(paramInt1) + "@qqim";
        at.AR();
        c.yS().iD(paramk);
        at.AR();
        c.yK().TK(paramk);
        com.tencent.mm.ac.n.Di().ih(paramk);
        String str = q.zE() + "@qqim";
        com.tencent.mm.ac.n.Di().ih(str);
        com.tencent.mm.ac.n.Dh();
        d.u(paramk, false);
        com.tencent.mm.ac.n.Dh();
        d.u(paramk, true);
        com.tencent.mm.ac.n.Dh();
        d.u(str, false);
        com.tencent.mm.ac.n.Dh();
        d.u(str, true);
        paramk = af.Ii();
        w.d("MicroMsg.QQGroupStorage", "delete all");
        if (paramk.goN.delete("qqgroup", null, null) > 0) {
          paramk.doNotify();
        }
        com.tencent.mm.plugin.c.a.hnI.pr();
      }
      catch (Exception paramk)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.StartUnbindQQ", paramk, "", new Object[0]);
          w.printErrStackTrace("MicroMsg.StartUnbindQQ", paramk, "", new Object[0]);
          continue;
          Bh(1);
        }
      }
      at.AR();
      c.xh().set(9, Integer.valueOf(0));
      paramk = new rt();
      paramk.eWA.eWB = false;
      paramk.eWA.eWC = true;
      com.tencent.mm.sdk.b.a.vgX.m(paramk);
      if (!bg.nm(this.oJt))
      {
        h.a(this, this.oJt, "", getString(R.l.cPO), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1893006835712L, 14104);
            StartUnbindQQ.b(StartUnbindQQ.this);
            GMTrace.o(1893006835712L, 14104);
          }
        });
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString == null) {
          break label602;
        }
        paramString.a(this, null, null);
        GMTrace.o(1900657246208L, 14161);
      }
    }
    label602:
    GMTrace.o(1900657246208L, 14161);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1900388810752L, 14159);
    int i = R.i.cGQ;
    GMTrace.o(1900388810752L, 14159);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1899986157568L, 14156);
    super.onCreate(paramBundle);
    at.wS().a(253, this);
    this.oJt = getIntent().getStringExtra("notice");
    GMTrace.o(1899986157568L, 14156);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1900120375296L, 14157);
    at.wS().b(253, this);
    super.onDestroy();
    GMTrace.o(1900120375296L, 14157);
  }
  
  protected void onResume()
  {
    GMTrace.i(1900254593024L, 14158);
    super.onResume();
    MP();
    GMTrace.o(1900254593024L, 14158);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindqq\StartUnbindQQ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */