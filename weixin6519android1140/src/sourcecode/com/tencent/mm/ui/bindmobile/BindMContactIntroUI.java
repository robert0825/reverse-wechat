package com.tencent.mm.ui.bindmobile;

import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ap.b.a;
import com.tencent.mm.g.a.rt;
import com.tencent.mm.modelfriend.m.a;
import com.tencent.mm.protocal.c.mr;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.friend.i;
import com.tencent.mm.ui.friend.i.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class BindMContactIntroUI
  extends MMWizardActivity
  implements com.tencent.mm.ad.e
{
  private String eMW;
  private r hsU;
  private boolean iZm;
  private String oJs;
  private String oJt;
  private ImageView vUG;
  private i vUX;
  private boolean vVm;
  private TextView wmW;
  private TextView wmX;
  private Button wmY;
  private Button wmZ;
  private m.a wna;
  private boolean wnb;
  private int wnc;
  
  public BindMContactIntroUI()
  {
    GMTrace.i(3094255501312L, 23054);
    this.hsU = null;
    this.oJs = null;
    this.oJt = null;
    this.vVm = false;
    this.iZm = false;
    this.wnb = false;
    this.wnc = 0;
    GMTrace.o(3094255501312L, 23054);
  }
  
  private void bci()
  {
    GMTrace.i(3095195025408L, 23061);
    aLo();
    if (this.wnb)
    {
      cancel();
      finish();
      GMTrace.o(3095195025408L, 23061);
      return;
    }
    Bh(1);
    GMTrace.o(3095195025408L, 23061);
  }
  
  private void lT(boolean paramBoolean)
  {
    GMTrace.i(3095329243136L, 23062);
    Intent localIntent = new Intent(this, BindMContactUI.class);
    localIntent.putExtra("is_bind_for_safe_device", this.vVm);
    localIntent.putExtra("is_bind_for_contact_sync", this.wnb);
    localIntent.putExtra("is_bind_for_change_mobile", paramBoolean);
    Object localObject = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
    if (!bg.nm((String)localObject))
    {
      localObject = com.tencent.mm.ap.b.h(this, (String)localObject, getString(R.l.bsf));
      if (localObject != null)
      {
        localIntent.putExtra("country_name", ((b.a)localObject).gLy);
        localIntent.putExtra("couttry_code", ((b.a)localObject).gLx);
      }
    }
    A(this, localIntent);
    GMTrace.o(3095329243136L, 23062);
  }
  
  protected final void MP()
  {
    GMTrace.i(3094926589952L, 23059);
    this.vVm = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.wnb = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.iZm = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.wnc = getIntent().getIntExtra("key_upload_scene", 0);
    this.wna = com.tencent.mm.modelfriend.m.Ho();
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BindMContactIntroUI", "state " + this.wna);
    at.AR();
    this.eMW = ((String)c.xh().get(6, null));
    if ((this.eMW == null) || (this.eMW.equals("")))
    {
      at.AR();
      this.eMW = ((String)c.xh().get(4097, null));
    }
    this.vUG = ((ImageView)findViewById(R.h.ccK));
    this.wmW = ((TextView)findViewById(R.h.ccI));
    this.wmX = ((TextView)findViewById(R.h.ccH));
    this.wmY = ((Button)findViewById(R.h.ccG));
    this.wmZ = ((Button)findViewById(R.h.ccJ));
    this.wmY.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3141768577024L, 23408);
        BindMContactIntroUI.a(BindMContactIntroUI.this);
        GMTrace.o(3141768577024L, 23408);
      }
    });
    this.wmZ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3125796667392L, 23289);
        BindMContactIntroUI.b(BindMContactIntroUI.this);
        GMTrace.o(3125796667392L, 23289);
      }
    });
    if (getIntent().getBooleanExtra("skip", false))
    {
      a(0, getString(R.l.cTq), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(3103650742272L, 23124);
          BindMContactIntroUI.c(BindMContactIntroUI.this);
          GMTrace.o(3103650742272L, 23124);
          return true;
        }
      });
      if ((this.wna == m.a.gDn) || (this.wna == m.a.gDm))
      {
        String str = com.tencent.mm.k.g.ut().getValue("ShowUnbindPhone");
        final int i = 2;
        if (!bg.nm(str)) {
          i = bg.Sy(str);
        }
        if (i != 0) {
          a(1, R.g.aXV, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(3122441224192L, 23264);
              paramAnonymousMenuItem = new com.tencent.mm.ui.tools.l(BindMContactIntroUI.this.vKB.vKW);
              paramAnonymousMenuItem.qik = new p.c()
              {
                public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
                {
                  GMTrace.i(3126333538304L, 23293);
                  paramAnonymous2n.setHeaderTitle(R.l.cZC);
                  if ((BindMContactIntroUI.23.this.wng & 0x2) != 0) {
                    paramAnonymous2n.em(0, R.l.cZP);
                  }
                  if ((BindMContactIntroUI.23.this.wng & 0x1) != 0) {
                    paramAnonymous2n.em(1, R.l.cZk);
                  }
                  GMTrace.o(3126333538304L, 23293);
                }
              };
              paramAnonymousMenuItem.qil = new p.d()
              {
                public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
                {
                  GMTrace.i(3107945709568L, 23156);
                  switch (paramAnonymous2MenuItem.getItemId())
                  {
                  }
                  for (;;)
                  {
                    GMTrace.o(3107945709568L, 23156);
                    return;
                    BindMContactIntroUI.d(BindMContactIntroUI.this);
                    GMTrace.o(3107945709568L, 23156);
                    return;
                    paramAnonymous2MenuItem = new Intent();
                    paramAnonymous2MenuItem.putExtra("need_matte_high_light_item", "settings_find_me_by_mobile");
                    com.tencent.mm.bj.d.b(BindMContactIntroUI.this, "setting", ".ui.setting.SettingsPrivacyUI", paramAnonymous2MenuItem);
                  }
                }
              };
              paramAnonymousMenuItem.bpI();
              GMTrace.o(3122441224192L, 23264);
              return false;
            }
          });
        }
      }
      switch (20.wnf[this.wna.ordinal()])
      {
      }
    }
    for (;;)
    {
      GMTrace.o(3094926589952L, 23059);
      return;
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(3109153669120L, 23165);
          BindMContactIntroUI.c(BindMContactIntroUI.this);
          GMTrace.o(3109153669120L, 23165);
          return true;
        }
      });
      break;
      Z(1, false);
      this.vUG.setImageResource(R.k.cMY);
      this.wmX.setVisibility(0);
      this.wmZ.setVisibility(8);
      this.wmW.setText(R.l.cZA);
      this.wmX.setText(R.l.cZz);
      this.wmY.setText(R.l.cZc);
      GMTrace.o(3094926589952L, 23059);
      return;
      Z(1, false);
      this.vUG.setImageResource(R.k.cMY);
      this.wmX.setVisibility(0);
      this.wmZ.setVisibility(0);
      this.wmW.setText(String.format(getString(R.l.daa), new Object[] { this.eMW }));
      this.wmX.setText(R.l.cZS);
      this.wmY.setText(R.l.cZV);
      this.wmZ.setText(R.l.cZl);
      GMTrace.o(3094926589952L, 23059);
      return;
      Z(1, true);
      this.vUG.setImageResource(R.k.cMX);
      this.wmX.setVisibility(0);
      this.wmZ.setVisibility(0);
      this.wmW.setText(String.format(getString(R.l.daa), new Object[] { this.eMW }));
      this.wmX.setText(R.l.cZh);
      this.wmY.setText(R.l.cZT);
      this.wmZ.setText(R.l.cZj);
      GMTrace.o(3094926589952L, 23059);
      return;
      Z(1, true);
      this.vUG.setImageResource(R.k.cMX);
      this.wmX.setVisibility(0);
      this.wmZ.setVisibility(0);
      this.wmW.setText(String.format(getString(R.l.daa), new Object[] { this.eMW }));
      this.wmX.setText(R.l.cZh);
      this.wmY.setText(R.l.cZy);
      this.wmZ.setText(R.l.cZj);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(3095463460864L, 23063);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BindMContactIntroUI", "summerunbind onSceneEnd type: " + paramk.getType() + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramk.getType() == 132) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      if (((com.tencent.mm.modelfriend.t)paramk).CD() == 3)
      {
        com.tencent.mm.modelsimple.d.bl(this);
        if (!bg.nm(this.oJt))
        {
          com.tencent.mm.ui.base.h.a(this, this.oJt, "", getString(R.l.cPO), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(3149016334336L, 23462);
              MMWizardActivity.A(BindMContactIntroUI.this, new Intent(BindMContactIntroUI.this, BindMContactStatusUI.class));
              GMTrace.o(3149016334336L, 23462);
            }
          });
          GMTrace.o(3095463460864L, 23063);
          return;
        }
        A(this, new Intent(this, BindMContactStatusUI.class));
      }
      GMTrace.o(3095463460864L, 23063);
      return;
    }
    int i;
    if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString)) {
      i = 1;
    }
    while (i != 0)
    {
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      GMTrace.o(3095463460864L, 23063);
      return;
      i = 0;
      switch (paramInt2)
      {
      default: 
        break;
      case -214: 
        paramString = com.tencent.mm.h.a.dH(paramString);
        if (paramString != null) {
          paramString.a(this, null, null);
        }
        i = 1;
        break;
      case -34: 
        Toast.makeText(this, R.l.cZq, 0).show();
        i = 1;
        break;
      case -43: 
        Toast.makeText(this, R.l.cZn, 0).show();
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
      }
    }
    if (paramk.getType() == 254)
    {
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.oJt = ((com.tencent.mm.modelsimple.h)paramk).Lb().udv;
        this.oJs = ((com.tencent.mm.modelsimple.h)paramk).La();
        if (!bg.nm(this.oJt))
        {
          paramString = new com.tencent.mm.modelfriend.t(this.eMW, 3, "", 0, "");
          at.wS().a(paramString, 0);
          paramk = this.vKB.vKW;
          getString(R.l.cUG);
          this.hsU = com.tencent.mm.ui.base.h.a(paramk, getString(R.l.cZR), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(3129286328320L, 23315);
              at.wS().c(paramString);
              GMTrace.o(3129286328320L, 23315);
            }
          });
          GMTrace.o(3095463460864L, 23063);
          return;
        }
        paramString = new com.tencent.mm.modelsimple.w(2);
        at.wS().a(paramString, 0);
        GMTrace.o(3095463460864L, 23063);
        return;
      }
      if (paramInt2 == -3)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BindMContactIntroUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.ebb), null, getString(R.l.ebc), getString(R.l.eba), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(3148211027968L, 23456);
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.putExtra("kintent_hint", BindMContactIntroUI.this.getString(R.l.eaZ));
            paramAnonymousDialogInterface.putExtra("from_unbind", true);
            com.tencent.mm.bj.d.b(BindMContactIntroUI.this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", paramAnonymousDialogInterface, 1);
            GMTrace.o(3148211027968L, 23456);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(3147942592512L, 23454);
            GMTrace.o(3147942592512L, 23454);
          }
        });
      }
    }
    else if (paramk.getType() == 255)
    {
      if (this.hsU != null)
      {
        this.hsU.dismiss();
        this.hsU = null;
      }
      if (paramInt2 != 0) {
        break label1020;
      }
      paramString = new com.tencent.mm.modelfriend.t(this.eMW, 3, "", 0, "");
      at.wS().a(paramString, 0);
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      getString(R.l.cUG);
      this.hsU = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(R.l.cZR), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(3140157964288L, 23396);
          at.wS().c(paramString);
          GMTrace.o(3140157964288L, 23396);
        }
      });
    }
    for (;;)
    {
      if (paramk.getType() == 132)
      {
        if (this.hsU != null)
        {
          this.hsU.dismiss();
          this.hsU = null;
        }
        if (((com.tencent.mm.modelfriend.t)paramk).CD() == 3)
        {
          if (paramInt2 == -82)
          {
            com.tencent.mm.ui.base.h.a(this, R.l.dYd, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(3126601973760L, 23295);
                GMTrace.o(3126601973760L, 23295);
              }
            });
            GMTrace.o(3095463460864L, 23063);
            return;
            if (paramInt2 == -81)
            {
              com.tencent.mm.ui.base.h.a(this, R.l.dYc, R.l.cUG, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(3110764281856L, 23177);
                  GMTrace.o(3110764281856L, 23177);
                }
              });
              break;
            }
            if (paramInt2 == -82)
            {
              com.tencent.mm.ui.base.h.a(this, R.l.dYd, R.l.cUG, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(3129017892864L, 23313);
                  GMTrace.o(3129017892864L, 23313);
                }
              });
              break;
            }
            if (paramInt2 == -83)
            {
              com.tencent.mm.ui.base.h.a(this, R.l.dYa, R.l.cUG, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(3122709659648L, 23266);
                  GMTrace.o(3122709659648L, 23266);
                }
              });
              break;
            }
            if (paramInt2 == -84)
            {
              com.tencent.mm.ui.base.h.a(this, R.l.dYb, R.l.cUG, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(3121635917824L, 23258);
                  GMTrace.o(3121635917824L, 23258);
                }
              });
              break;
            }
            if (paramInt2 == -85)
            {
              com.tencent.mm.ui.base.h.a(this, R.l.dXY, R.l.cUG, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                  GMTrace.i(3133447077888L, 23346);
                  GMTrace.o(3133447077888L, 23346);
                }
              });
              break;
            }
            if (paramInt2 != -86) {
              break;
            }
            com.tencent.mm.ui.base.h.a(this, R.l.dYe, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(3122978095104L, 23268);
                GMTrace.o(3122978095104L, 23268);
              }
            });
            break;
            label1020:
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BindMContactIntroUI", "summerunbind old err_password");
            com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.ebb), null, getString(R.l.ebc), getString(R.l.eba), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(3115193466880L, 23210);
                paramAnonymousDialogInterface = new Intent();
                paramAnonymousDialogInterface.putExtra("kintent_hint", BindMContactIntroUI.this.getString(R.l.eaZ));
                paramAnonymousDialogInterface.putExtra("from_unbind", true);
                com.tencent.mm.bj.d.b(BindMContactIntroUI.this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", paramAnonymousDialogInterface, 1);
                GMTrace.o(3115193466880L, 23210);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(3138144698368L, 23381);
                GMTrace.o(3138144698368L, 23381);
              }
            });
            continue;
          }
          if (paramInt2 == -83)
          {
            com.tencent.mm.ui.base.h.a(this, R.l.dYa, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(3126065102848L, 23291);
                GMTrace.o(3126065102848L, 23291);
              }
            });
            GMTrace.o(3095463460864L, 23063);
            return;
          }
          if (paramInt2 == -84)
          {
            com.tencent.mm.ui.base.h.a(this, R.l.dYb, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(3139621093376L, 23392);
                GMTrace.o(3139621093376L, 23392);
              }
            });
            GMTrace.o(3095463460864L, 23063);
            return;
          }
          if (paramInt2 == -85)
          {
            com.tencent.mm.ui.base.h.a(this, R.l.dXY, R.l.cUG, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(3147674157056L, 23452);
                GMTrace.o(3147674157056L, 23452);
              }
            });
            GMTrace.o(3095463460864L, 23063);
            return;
          }
          Toast.makeText(this, getString(R.l.cZO, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        }
      }
    }
    GMTrace.o(3095463460864L, 23063);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3094389719040L, 23055);
    int i = R.i.cqd;
    GMTrace.o(3094389719040L, 23055);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(3095597678592L, 23064);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.BindMContactIntroUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(3095597678592L, 23064);
      return;
      if (paramInt2 == -1)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BindMContactIntroUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again mobile: " + this.eMW);
        paramIntent = new com.tencent.mm.modelsimple.h(com.tencent.mm.modelsimple.h.gTK);
        at.wS().a(paramIntent, 0);
        getString(R.l.cUG);
        this.hsU = com.tencent.mm.ui.base.h.a(this, getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(3141231706112L, 23404);
            GMTrace.o(3141231706112L, 23404);
          }
        });
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3094523936768L, 23056);
    super.onCreate(paramBundle);
    at.wS().a(132, this);
    at.wS().a(255, this);
    at.wS().a(254, this);
    oM(R.l.cZJ);
    GMTrace.o(3094523936768L, 23056);
  }
  
  public void onDestroy()
  {
    GMTrace.i(3094658154496L, 23057);
    at.wS().b(132, this);
    at.wS().b(255, this);
    at.wS().b(254, this);
    if (this.vUX != null)
    {
      getContentResolver().unregisterContentObserver(this.vUX);
      this.vUX.recycle();
    }
    super.onDestroy();
    GMTrace.o(3094658154496L, 23057);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(3095060807680L, 23060);
    if (paramInt == 4)
    {
      bci();
      GMTrace.o(3095060807680L, 23060);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(3095060807680L, 23060);
    return bool;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(3095731896320L, 23065);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      if (paramArrayOfInt == null) {}
      for (int i = -1;; i = paramArrayOfInt.length)
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.BindMContactIntroUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bg.bQW() });
        GMTrace.o(3095731896320L, 23065);
        return;
      }
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.BindMContactIntroUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(3095731896320L, 23065);
      return;
      if ((paramArrayOfInt[0] == 0) && (this.vUX != null)) {
        this.vUX.bYZ();
      }
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(3094792372224L, 23058);
    super.onResume();
    MP();
    GMTrace.o(3094792372224L, 23058);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindmobile\BindMContactIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */