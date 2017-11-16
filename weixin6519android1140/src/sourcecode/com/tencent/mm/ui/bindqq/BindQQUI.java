package com.tencent.mm.ui.bindqq;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class BindQQUI
  extends MMWizardActivity
  implements e
{
  r hsU;
  private String oJs;
  private String oJt;
  private int type;
  
  public BindQQUI()
  {
    GMTrace.i(1903073165312L, 14179);
    this.type = 0;
    this.oJs = null;
    this.oJt = null;
    GMTrace.o(1903073165312L, 14179);
  }
  
  protected final void MP()
  {
    GMTrace.i(1903744253952L, 14184);
    at.AR();
    long l = new o(bg.e((Integer)c.xh().get(9, null))).longValue();
    Object localObject;
    if (l == 0L)
    {
      oM(R.l.dan);
      localObject = (TextView)findViewById(R.h.ccL);
      ((TextView)localObject).setVisibility(8);
      ((TextView)localObject).setText(R.l.dam);
      ((TextView)findViewById(R.h.ccM)).setVisibility(8);
      localObject = (Button)findViewById(R.h.bhg);
      ((Button)localObject).setVisibility(0);
      ((Button)localObject).setText(R.l.bhg);
      ((Button)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1899180851200L, 14150);
          MMWizardActivity.A(BindQQUI.this, new Intent(BindQQUI.this, VerifyQQUI.class));
          GMTrace.o(1899180851200L, 14150);
        }
      });
      AZ(1);
    }
    while (this.type == 1)
    {
      a(0, getString(R.l.cTq), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1887772344320L, 14065);
          BindQQUI.a(BindQQUI.this);
          GMTrace.o(1887772344320L, 14065);
          return true;
        }
      });
      GMTrace.o(1903744253952L, 14184);
      return;
      oM(R.l.dal);
      localObject = (TextView)findViewById(R.h.ccL);
      ((TextView)localObject).setVisibility(8);
      ((TextView)localObject).setText(R.l.daj);
      localObject = (TextView)findViewById(R.h.ccM);
      ((TextView)localObject).setVisibility(0);
      ((TextView)localObject).setText(getString(R.l.dak) + l);
      localObject = (Button)findViewById(R.h.bhg);
      ((Button)localObject).setVisibility(8);
      ((Button)localObject).setText(R.l.dCi);
      ((Button)localObject).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1891798876160L, 14095);
          GMTrace.o(1891798876160L, 14095);
        }
      });
      a(1, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1887503908864L, 14063);
          paramAnonymousMenuItem = new l(BindQQUI.this.vKB.vKW);
          paramAnonymousMenuItem.qik = new p.c()
          {
            public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
            {
              GMTrace.i(1902938947584L, 14178);
              paramAnonymous2n.setHeaderTitle(R.l.cZC);
              paramAnonymous2n.em(0, R.l.eaY);
              GMTrace.o(1902938947584L, 14178);
            }
          };
          paramAnonymousMenuItem.qil = new p.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(1889651392512L, 14079);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(1889651392512L, 14079);
                return;
                paramAnonymous2MenuItem = BindQQUI.this;
                com.tencent.mm.modelsimple.h localh = new com.tencent.mm.modelsimple.h(com.tencent.mm.modelsimple.h.gTJ);
                at.wS().a(localh, 0);
                paramAnonymous2MenuItem.getString(R.l.cUG);
                paramAnonymous2MenuItem.hsU = com.tencent.mm.ui.base.h.a(paramAnonymous2MenuItem, paramAnonymous2MenuItem.getString(R.l.dZg), true, new BindQQUI.2(paramAnonymous2MenuItem));
              }
            }
          };
          paramAnonymousMenuItem.bpI();
          GMTrace.o(1887503908864L, 14063);
          return false;
        }
      });
    }
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1888309215232L, 14069);
        BindQQUI.this.aLo();
        BindQQUI.this.finish();
        GMTrace.o(1888309215232L, 14069);
        return true;
      }
    });
    GMTrace.o(1903744253952L, 14184);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1903878471680L, 14185);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BindQQUI", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramk.getType());
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if (paramk.getType() == 254)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.oJs = ((com.tencent.mm.modelsimple.h)paramk).La();
        if ((this.oJs != null) && (this.oJs.length() > 0))
        {
          at.AR();
          c.xh().set(102407, this.oJs);
        }
        if (!bg.nm(this.oJt))
        {
          paramString = new Intent(this, StartUnbindQQ.class);
          paramString.putExtra("notice", this.oJt);
          A(this, paramString);
          GMTrace.o(1903878471680L, 14185);
          return;
        }
        paramString = new com.tencent.mm.modelsimple.w(2);
        at.wS().a(paramString, 0);
        GMTrace.o(1903878471680L, 14185);
        return;
      }
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      if (paramInt2 == -3)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BindQQUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.ebb), null, getString(R.l.ebc), getString(R.l.eba), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1899449286656L, 14152);
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.putExtra("kintent_hint", BindQQUI.this.getString(R.l.eaZ));
            paramAnonymousDialogInterface.putExtra("from_unbind", true);
            d.b(BindQQUI.this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", paramAnonymousDialogInterface, 1);
            GMTrace.o(1899449286656L, 14152);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(1887235473408L, 14061);
            GMTrace.o(1887235473408L, 14061);
          }
        });
        GMTrace.o(1903878471680L, 14185);
        return;
      }
      if (paramInt2 == -81)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYc, R.l.cUG, null);
        GMTrace.o(1903878471680L, 14185);
        return;
      }
      if (paramInt2 == -82)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYd, R.l.cUG, null);
        GMTrace.o(1903878471680L, 14185);
        return;
      }
      if (paramInt2 == -83)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYa, R.l.cUG, null);
        GMTrace.o(1903878471680L, 14185);
        return;
      }
      if (paramInt2 == -84)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYb, R.l.cUG, null);
        GMTrace.o(1903878471680L, 14185);
        return;
      }
      if (paramInt2 == -85)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dXZ, R.l.cUG, null);
        GMTrace.o(1903878471680L, 14185);
        return;
      }
      if (paramInt2 == -86)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYe, R.l.cUG, null);
        GMTrace.o(1903878471680L, 14185);
      }
    }
    else if (paramk.getType() == 255)
    {
      if (paramInt2 == 0)
      {
        A(this, new Intent(this, StartUnbindQQ.class));
        GMTrace.o(1903878471680L, 14185);
        return;
      }
      com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.ebb), null, getString(R.l.ebc), getString(R.l.eba), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1891530440704L, 14093);
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("kintent_hint", BindQQUI.this.getString(R.l.eaZ));
          paramAnonymousDialogInterface.putExtra("from_unbind", true);
          d.b(BindQQUI.this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", paramAnonymousDialogInterface, 1);
          GMTrace.o(1891530440704L, 14093);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(1898643980288L, 14146);
          GMTrace.o(1898643980288L, 14146);
        }
      });
    }
    GMTrace.o(1903878471680L, 14185);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1903610036224L, 14183);
    int i = R.i.cqi;
    GMTrace.o(1903610036224L, 14183);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(1904012689408L, 14186);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BindQQUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(1904012689408L, 14186);
      return;
      if (paramInt2 == -1)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BindQQUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again qq");
        paramIntent = new com.tencent.mm.modelsimple.h(com.tencent.mm.modelsimple.h.gTJ);
        at.wS().a(paramIntent, 0);
        getString(R.l.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a(this, getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(1904683778048L, 14191);
            GMTrace.o(1904683778048L, 14191);
          }
        });
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1903207383040L, 14180);
    super.onCreate(paramBundle);
    this.type = getIntent().getIntExtra("bindqq_regbymobile", 0);
    at.wS().a(254, this);
    at.wS().a(255, this);
    GMTrace.o(1903207383040L, 14180);
  }
  
  public void onDestroy()
  {
    GMTrace.i(1903341600768L, 14181);
    at.wS().b(254, this);
    at.wS().b(255, this);
    super.onDestroy();
    GMTrace.o(1903341600768L, 14181);
  }
  
  protected void onResume()
  {
    GMTrace.i(1903475818496L, 14182);
    super.onResume();
    MP();
    GMTrace.o(1903475818496L, 14182);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindqq\BindQQUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */