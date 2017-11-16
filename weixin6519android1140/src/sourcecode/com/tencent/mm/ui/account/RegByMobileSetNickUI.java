package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.av.g;
import com.tencent.mm.modelsimple.x;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.bindqq.BindQQUI;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText.c;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

@Deprecated
public class RegByMobileSetNickUI
  extends MMActivity
  implements e
{
  private String eMW;
  private ProgressDialog htG;
  private EditText vSI;
  private i vSJ;
  private boolean vSK;
  
  public RegByMobileSetNickUI()
  {
    GMTrace.i(2756832133120L, 20540);
    this.htG = null;
    this.vSJ = null;
    GMTrace.o(2756832133120L, 20540);
  }
  
  protected final void MP()
  {
    GMTrace.i(2757369004032L, 20544);
    oM(R.l.dRA);
    this.vSI = ((EditText)findViewById(R.h.bYg));
    this.vSI.addTextChangedListener(new MMEditText.c(this.vSI, null, 16));
    a(0, getString(R.l.cTh), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2751060770816L, 20497);
        paramAnonymousMenuItem = RegByMobileSetNickUI.a(RegByMobileSetNickUI.this).getText().toString().trim();
        if ((paramAnonymousMenuItem == null) || (paramAnonymousMenuItem.length() <= 0))
        {
          h.h(RegByMobileSetNickUI.this, R.l.efU, R.l.dRD);
          GMTrace.o(2751060770816L, 20497);
          return true;
        }
        RegByMobileSetNickUI.this.aLo();
        Object localObject1 = RegByMobileSetNickUI.this.getIntent().getExtras().getString("regbymobile_pwd");
        Object localObject2 = RegByMobileSetNickUI.this.getIntent().getExtras().getString("regbymobile_ticket");
        paramAnonymousMenuItem = new x("", (String)localObject1, paramAnonymousMenuItem, 0, "", RegByMobileSetNickUI.b(RegByMobileSetNickUI.this), (String)localObject2, 4);
        at.wS().a(paramAnonymousMenuItem, 0);
        localObject1 = RegByMobileSetNickUI.this;
        localObject2 = RegByMobileSetNickUI.this;
        RegByMobileSetNickUI.this.getString(R.l.cUG);
        RegByMobileSetNickUI.a((RegByMobileSetNickUI)localObject1, h.a((Context)localObject2, RegByMobileSetNickUI.this.getString(R.l.dRT), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(2686904696832L, 20019);
            at.wS().c(paramAnonymousMenuItem);
            GMTrace.o(2686904696832L, 20019);
          }
        }));
        GMTrace.o(2751060770816L, 20497);
        return true;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2579396296704L, 19218);
        RegByMobileSetNickUI.this.aLo();
        RegByMobileSetNickUI.this.finish();
        GMTrace.o(2579396296704L, 19218);
        return true;
      }
    });
    GMTrace.o(2757369004032L, 20544);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2757637439488L, 20546);
    w.i("MicroMsg.RegByMobileSetNickUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (!bg.bx(this))
    {
      GMTrace.o(2757637439488L, 20546);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramInt1 = q.zI();
      w.d("MicroMsg.RegByMobileSetNickUI", "Reg By mobile status = " + paramInt1 + " isSync = " + this.vSK);
      if (this.vSK)
      {
        paramInt1 &= 0xFFFDFFFF;
        com.tencent.mm.modelfriend.m.Hl();
        getApplicationContext();
        com.tencent.mm.modelfriend.a.GO();
        w.d("MicroMsg.RegByMobileSetNickUI", "Reg By mobile update = " + paramInt1);
        at.AR();
        c.xh().set(7, Integer.valueOf(paramInt1));
        if (this.vSK) {
          break label321;
        }
      }
      label321:
      for (paramInt1 = 1;; paramInt1 = 2)
      {
        at.AR();
        c.yJ().b(new g(17, paramInt1));
        com.tencent.mm.plugin.c.a.hnI.pr();
        as.gnb.M("login_user_name", this.eMW);
        paramString = com.tencent.mm.plugin.c.a.hnH.ao(this);
        paramString.putExtra("LauncherUI.enter_from_reg", true);
        paramString.addFlags(67108864);
        if (!((x)paramk).gUX) {
          break label326;
        }
        MMWizardActivity.b(this, new Intent(this, BindQQUI.class).putExtra("bindqq_regbymobile", 1), paramString);
        GMTrace.o(2757637439488L, 20546);
        return;
        paramInt1 |= 0x20000;
        break;
      }
      label326:
      MMWizardActivity.b(this, new Intent(this, BindFacebookUI.class), paramString);
      GMTrace.o(2757637439488L, 20546);
      return;
    }
    if (paramk.getType() == 126)
    {
      paramk = com.tencent.mm.h.a.dH(paramString);
      if (paramk != null)
      {
        paramk.a(this, null, null);
        GMTrace.o(2757637439488L, 20546);
        return;
      }
    }
    int i;
    if (com.tencent.mm.plugin.c.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString)) {
      i = 1;
    }
    while (i != 0)
    {
      GMTrace.o(2757637439488L, 20546);
      return;
      switch (paramInt1)
      {
      }
      do
      {
        i = 0;
        break;
        if ((paramInt2 == -7) || (paramInt2 == -10))
        {
          h.h(this, R.l.dQG, R.l.dQH);
          i = 1;
          break;
        }
      } while (paramInt2 != -75);
      h.h(this, R.l.cRG, R.l.dQH);
      i = 1;
    }
    Toast.makeText(this, getString(R.l.dwY, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(2757637439488L, 20546);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2757234786304L, 20543);
    int i = R.i.cEM;
    GMTrace.o(2757234786304L, 20543);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2756966350848L, 20541);
    super.onCreate(paramBundle);
    this.vSK = getIntent().getBooleanExtra("is_sync_addr", false);
    this.eMW = getIntent().getExtras().getString("bindmcontact_mobile");
    MP();
    at.wS().a(126, this);
    GMTrace.o(2756966350848L, 20541);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2757100568576L, 20542);
    if (this.vSJ != null)
    {
      i locali = this.vSJ;
      u localu = locali.vRB;
      localu.cancel();
      localu.euU.stopTimer();
      localu.reset();
      locali.text = null;
    }
    at.wS().b(126, this);
    super.onDestroy();
    GMTrace.o(2757100568576L, 20542);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2757503221760L, 20545);
    if (paramInt == 4)
    {
      finish();
      GMTrace.o(2757503221760L, 20545);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2757503221760L, 20545);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\account\RegByMobileSetNickUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */