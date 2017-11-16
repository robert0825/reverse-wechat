package com.tencent.mm.ui.bindmobile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.hl;
import com.tencent.mm.g.a.hl.b;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.hm.a;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.plugin.messenger.foundation.a.a.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.friend.FindMContactAddUI;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class BindMContactVerifyUI
  extends MMWizardActivity
  implements e
{
  private String eMW;
  private int fromScene;
  private SharedPreferences ghC;
  private r hsU;
  private boolean iZm;
  private int status;
  private EditText vVi;
  private Button vVl;
  private boolean vVm;
  private boolean vVo;
  private TextView vWa;
  private boolean wnb;
  private boolean wnn;
  private boolean wnp;
  
  public BindMContactVerifyUI()
  {
    GMTrace.i(3144855584768L, 23431);
    this.hsU = null;
    this.vVm = false;
    this.wnb = false;
    this.vVo = false;
    this.wnp = false;
    this.wnn = false;
    this.iZm = false;
    this.fromScene = 0;
    GMTrace.o(3144855584768L, 23431);
  }
  
  protected final void MP()
  {
    GMTrace.i(3145392455680L, 23435);
    at.AR();
    this.eMW = ((String)c.xh().get(4097, null));
    this.vVi = ((EditText)findViewById(R.h.bhc));
    this.vVm = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.wnb = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.vVo = getIntent().getBooleanExtra("BIND_FOR_QQ_REG", false);
    this.wnp = getIntent().getBooleanExtra("BIND_FIND_ME_BY_MOBILE", false);
    this.wnn = getIntent().getBooleanExtra("is_bind_for_change_mobile", false);
    this.iZm = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.fromScene = getIntent().getIntExtra("bind_scene", 0);
    Button localButton = (Button)findViewById(R.h.bgZ);
    if ((this.eMW == null) || (this.eMW.equals("")))
    {
      at.AR();
      this.eMW = ((String)c.xh().get(6, null));
    }
    InputFilter local1 = new InputFilter()
    {
      public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(3105798225920L, 23140);
        paramAnonymousCharSequence = bg.M(paramAnonymousCharSequence);
        GMTrace.o(3105798225920L, 23140);
        return paramAnonymousCharSequence;
      }
    };
    this.vVi.setFilters(new InputFilter[] { local1 });
    this.vVl = ((Button)findViewById(R.h.bhe));
    this.vWa = ((TextView)findViewById(R.h.bha));
    boolean bool = this.wnp;
    if (!bool)
    {
      this.status |= 0x200;
      this.ghC.edit().putBoolean("settings_find_me_by_mobile", bool).commit();
      w.d("MicroMsg.BindMContactVerifyUI", "Bind mobile update = " + this.status);
      this.vWa.setText(getString(R.l.cZB, new Object[] { this.eMW }));
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          GMTrace.i(3102979653632L, 23119);
          paramAnonymousView = BindMContactVerifyUI.a(BindMContactVerifyUI.this).getText().toString().trim();
          if (paramAnonymousView.equals(""))
          {
            h.h(BindMContactVerifyUI.this, R.l.dad, R.l.cUG);
            GMTrace.o(3102979653632L, 23119);
            return;
          }
          BindMContactVerifyUI.this.aLo();
          Object localObject1 = new hl();
          ((hl)localObject1).eKJ.context = BindMContactVerifyUI.this;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          localObject1 = ((hl)localObject1).eKK.eKL;
          Object localObject2 = new hm();
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
          localObject2 = ((hm)localObject2).eKM.eKN;
          int i = 2;
          if (BindMContactVerifyUI.b(BindMContactVerifyUI.this)) {
            i = 19;
          }
          paramAnonymousView = new com.tencent.mm.modelfriend.t(BindMContactVerifyUI.c(BindMContactVerifyUI.this), i, paramAnonymousView, "", (String)localObject1, (String)localObject2);
          at.wS().a(paramAnonymousView, 0);
          localObject1 = BindMContactVerifyUI.this;
          localObject2 = BindMContactVerifyUI.this;
          BindMContactVerifyUI.this.getString(R.l.cUG);
          BindMContactVerifyUI.a((BindMContactVerifyUI)localObject1, h.a((Context)localObject2, BindMContactVerifyUI.this.getString(R.l.cZU), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(3129554763776L, 23317);
              at.wS().c(paramAnonymousView);
              GMTrace.o(3129554763776L, 23317);
            }
          }));
          GMTrace.o(3102979653632L, 23119);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(3127944151040L, 23305);
          BindMContactVerifyUI.d(BindMContactVerifyUI.this);
          GMTrace.o(3127944151040L, 23305);
          return true;
        }
      });
      localButton = this.vVl;
      if (!com.tencent.mm.ap.b.ky(this.eMW)) {
        break label425;
      }
    }
    label425:
    for (int i = 0;; i = 8)
    {
      localButton.setVisibility(i);
      this.vVl.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3139889528832L, 23394);
          BindMContactVerifyUI.this.aLo();
          paramAnonymousView = new Intent();
          Bundle localBundle = new Bundle();
          localBundle.putString("bindmcontact_mobile", BindMContactVerifyUI.c(BindMContactVerifyUI.this));
          localBundle.putInt("voice_verify_type", 4);
          paramAnonymousView.putExtras(localBundle);
          com.tencent.mm.plugin.c.a.hnH.e(BindMContactVerifyUI.this, paramAnonymousView);
          GMTrace.o(3139889528832L, 23394);
        }
      });
      GMTrace.o(3145392455680L, 23435);
      return;
      this.status &= 0xFDFF;
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(3145660891136L, 23437);
    w.i("MicroMsg.BindMContactVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((((com.tencent.mm.modelfriend.t)paramk).CD() != 2) && (((com.tencent.mm.modelfriend.t)paramk).CD() != 19))
    {
      GMTrace.o(3145660891136L, 23437);
      return;
    }
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((((com.tencent.mm.modelfriend.t)paramk).CD() == 2) || (((com.tencent.mm.modelfriend.t)paramk).CD() == 19))
      {
        if (this.fromScene == 5)
        {
          w.i("MicroMsg.BindMContactVerifyUI", "onScene end, finish wizard from app brand reg phone");
          Bh(-1);
          GMTrace.o(3145660891136L, 23437);
          return;
        }
        if (this.vVm)
        {
          if (!q.zM())
          {
            paramString = new rt();
            paramString.eWA.eWB = true;
            paramString.eWA.eWC = true;
            com.tencent.mm.sdk.b.a.vgX.m(paramString);
          }
          Bh(1);
          paramString = new Intent();
          paramString.addFlags(67108864);
          com.tencent.mm.plugin.c.a.hnH.d(this, paramString);
          GMTrace.o(3145660891136L, 23437);
          return;
        }
        if (this.vVo)
        {
          Bh(1);
          startActivity(new Intent(this, FindMContactAddUI.class));
          GMTrace.o(3145660891136L, 23437);
          return;
        }
        if ((this.status & 0x200) <= 0) {
          break label480;
        }
        paramInt1 = 1;
        at.AR();
        c.xh().set(7, Integer.valueOf(this.status));
        paramString = new uu();
        paramString.umY = 8;
        if (paramInt1 == 0) {
          break label485;
        }
        paramInt1 = 1;
        label344:
        paramString.umZ = paramInt1;
        at.AR();
        c.yJ().b(new e.a(23, paramString));
        com.tencent.mm.plugin.c.a.hnI.pr();
        if (!this.wnb)
        {
          getApplicationContext();
          com.tencent.mm.modelfriend.a.GO();
        }
        if (this.wnn) {
          h.bm(this, getString(R.l.cZg));
        }
        if (this.iZm)
        {
          if (!this.wnb) {
            break label490;
          }
          g.ork.i(11002, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
        }
      }
      for (;;)
      {
        A(this, new Intent(this, BindMContactStatusUI.class));
        GMTrace.o(3145660891136L, 23437);
        return;
        label480:
        paramInt1 = 0;
        break;
        label485:
        paramInt1 = 2;
        break label344;
        label490:
        g.ork.i(11002, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
      }
    }
    paramk = com.tencent.mm.h.a.dH(paramString);
    if (paramk != null)
    {
      paramk.a(this, null, null);
      GMTrace.o(3145660891136L, 23437);
      return;
    }
    int i;
    if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString)) {
      i = 1;
    }
    while (i != 0)
    {
      GMTrace.o(3145660891136L, 23437);
      return;
      switch (paramInt2)
      {
      default: 
        i = 0;
        break;
      case -34: 
        Toast.makeText(this, R.l.cZq, 0).show();
        i = 1;
        break;
      case -43: 
        Toast.makeText(this, R.l.cZn, 0).show();
        i = 1;
        break;
      case -214: 
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null) {
          paramString.a(this, null, null);
        }
        i = 1;
        break;
      case -41: 
        Toast.makeText(this, R.l.cZp, 0).show();
        i = 1;
        break;
      case -35: 
        Toast.makeText(this, R.l.cZo, 0).show();
        i = 1;
        break;
      case -36: 
        Toast.makeText(this, R.l.cZs, 0).show();
        i = 1;
        break;
      case -32: 
        h.a(this, R.l.cZY, R.l.bhd, null);
        i = 1;
        break;
      case -33: 
        h.a(this, R.l.cZX, R.l.bhd, null);
        i = 1;
      }
    }
    Toast.makeText(this, getString(R.l.cZW, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(3145660891136L, 23437);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3145258237952L, 23434);
    int i = R.i.cqf;
    GMTrace.o(3145258237952L, 23434);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3144989802496L, 23432);
    super.onCreate(paramBundle);
    at.wS().a(132, this);
    oM(R.l.cZK);
    this.ghC = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.status = q.zI();
    MP();
    GMTrace.o(3144989802496L, 23432);
  }
  
  public void onDestroy()
  {
    GMTrace.i(3145124020224L, 23433);
    at.wS().b(132, this);
    super.onDestroy();
    GMTrace.o(3145124020224L, 23433);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(3145526673408L, 23436);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      Bh(1);
      GMTrace.o(3145526673408L, 23436);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(3145526673408L, 23436);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindmobile\BindMContactVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */