package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
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
import com.tencent.mm.modelsimple.x;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;

public class RegByQQAuthUI
  extends MMActivity
  implements e
{
  private String eEU;
  private String eQt;
  private String gUy;
  private ProgressDialog htG;
  private String vQY;
  private EditText vTl;
  private int vTm;
  
  public RegByQQAuthUI()
  {
    GMTrace.i(2675630407680L, 19935);
    this.htG = null;
    this.vTl = null;
    GMTrace.o(2675630407680L, 19935);
  }
  
  protected final void MP()
  {
    GMTrace.i(2676435714048L, 19941);
    this.vTm = getIntent().getIntExtra("RegByQQ_BindUin", 0);
    this.vQY = getIntent().getStringExtra("RegByQQ_RawPsw");
    this.gUy = getIntent().getStringExtra("RegByQQ_Account");
    this.eEU = getIntent().getStringExtra("RegByQQ_Ticket");
    this.eQt = getIntent().getStringExtra("RegByQQ_Nick");
    w.v("MicroMsg.RegByQQAuthUI", "values : bindUin:" + this.vTm + "  pass:" + this.vQY + "  ticket:" + this.eEU);
    this.vTl = ((EditText)findViewById(R.h.bQT));
    if ((this.eQt != null) && (!this.eQt.equals(""))) {
      this.vTl.setText(this.eQt);
    }
    oM(R.l.dRR);
    a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2665966731264L, 19863);
        RegByQQAuthUI.a(RegByQQAuthUI.this, RegByQQAuthUI.a(RegByQQAuthUI.this).getText().toString().trim());
        if (RegByQQAuthUI.b(RegByQQAuthUI.this).equals(""))
        {
          h.h(RegByQQAuthUI.this, R.l.efU, R.l.cSK);
          GMTrace.o(2665966731264L, 19863);
          return true;
        }
        paramAnonymousMenuItem = new x("", RegByQQAuthUI.c(RegByQQAuthUI.this), RegByQQAuthUI.b(RegByQQAuthUI.this), RegByQQAuthUI.d(RegByQQAuthUI.this), "", "", RegByQQAuthUI.e(RegByQQAuthUI.this), 2);
        at.wS().a(paramAnonymousMenuItem, 0);
        RegByQQAuthUI localRegByQQAuthUI1 = RegByQQAuthUI.this;
        RegByQQAuthUI localRegByQQAuthUI2 = RegByQQAuthUI.this;
        RegByQQAuthUI.this.getString(R.l.cUG);
        RegByQQAuthUI.a(localRegByQQAuthUI1, h.a(localRegByQQAuthUI2, RegByQQAuthUI.this.getString(R.l.dRT), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(2764348325888L, 20596);
            at.wS().c(paramAnonymousMenuItem);
            GMTrace.o(2764348325888L, 20596);
          }
        }));
        GMTrace.o(2665966731264L, 19863);
        return true;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2754818867200L, 20525);
        RegByQQAuthUI.this.aLo();
        RegByQQAuthUI.this.finish();
        GMTrace.o(2754818867200L, 20525);
        return true;
      }
    });
    GMTrace.o(2676435714048L, 19941);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2676569931776L, 19942);
    w.i("MicroMsg.RegByQQAuthUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (!bg.bx(this))
    {
      GMTrace.o(2676569931776L, 19942);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      switch (paramk.getType())
      {
      }
      for (;;)
      {
        GMTrace.o(2676569931776L, 19942);
        return;
        at.unhold();
        as.gnb.M("login_user_name", this.gUy);
        paramString = new Intent(this, BindMContactIntroUI.class);
        paramString.putExtra("key_upload_scene", 1);
        paramString.putExtra("skip", true);
        paramk = com.tencent.mm.plugin.c.a.hnH.ao(this);
        paramk.addFlags(67108864);
        paramk.putExtra("LauncherUI.enter_from_reg", true);
        MMWizardActivity.b(this, paramString, paramk);
      }
    }
    if (paramk.getType() == 126)
    {
      paramk = com.tencent.mm.h.a.dH(paramString);
      if (paramk != null)
      {
        paramk.a(this, null, null);
        GMTrace.o(2676569931776L, 19942);
        return;
      }
    }
    int i;
    if (com.tencent.mm.plugin.c.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString)) {
      i = 1;
    }
    while (i != 0)
    {
      GMTrace.o(2676569931776L, 19942);
      return;
      if (paramInt1 == 4) {}
      switch (paramInt2)
      {
      default: 
        i = 0;
        break;
      case -1: 
        if (at.wS().DN() == 5)
        {
          h.h(this, R.l.dLj, R.l.dLi);
          i = 1;
        }
        break;
      case -3: 
        h.h(this, R.l.cSJ, R.l.dRP);
        i = 1;
        break;
      case -4: 
        h.h(this, R.l.cSI, R.l.dRP);
        i = 1;
        break;
      case -12: 
        h.h(this, R.l.dRQ, R.l.dRP);
        i = 1;
        break;
      case -11: 
        h.h(this, R.l.dRO, R.l.dRP);
        i = 1;
        break;
      case -72: 
        h.h(this.vKB.vKW, R.l.dRN, R.l.cUG);
        i = 1;
        break;
      case -75: 
        h.h(this.vKB.vKW, R.l.cRG, R.l.cUG);
        i = 1;
      }
    }
    Toast.makeText(this, getString(R.l.dwY, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(2676569931776L, 19942);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2675764625408L, 19936);
    int i = R.i.cEO;
    GMTrace.o(2675764625408L, 19936);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2675898843136L, 19937);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(2675898843136L, 19937);
  }
  
  public void onDestroy()
  {
    GMTrace.i(2676033060864L, 19938);
    super.onDestroy();
    GMTrace.o(2676033060864L, 19938);
  }
  
  public void onPause()
  {
    GMTrace.i(2676301496320L, 19940);
    super.onPause();
    at.wS().b(126, this);
    GMTrace.o(2676301496320L, 19940);
  }
  
  public void onResume()
  {
    GMTrace.i(2676167278592L, 19939);
    super.onResume();
    at.wS().a(126, this);
    GMTrace.o(2676167278592L, 19939);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\account\RegByQQAuthUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */