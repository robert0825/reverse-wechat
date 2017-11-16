package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.mr;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class SettingsModifyEmailAddrUI
  extends MMActivity
  implements e
{
  private ProgressDialog htG;
  private EditText oJn;
  private String oJo;
  private String oJp;
  private TextView oJq;
  private TextView oJr;
  private String oJs;
  private String oJt;
  
  public SettingsModifyEmailAddrUI()
  {
    GMTrace.i(4674669248512L, 34829);
    this.oJs = null;
    this.oJt = null;
    GMTrace.o(4674669248512L, 34829);
  }
  
  private void beA()
  {
    GMTrace.i(4675340337152L, 34834);
    this.oJq.setVisibility(8);
    this.oJq.setText(getString(R.l.eaY));
    this.oJr.setText(getString(R.l.dZp));
    this.oJr.setTextColor(getResources().getColor(R.e.aMA));
    this.oJn.setEnabled(true);
    this.oJn.setFilters(new InputFilter[] { new InputFilter()
    {
      public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
      {
        GMTrace.i(4601789022208L, 34286);
        GMTrace.o(4601789022208L, 34286);
        return null;
      }
    } });
    String str = com.tencent.mm.modelsimple.d.br(this);
    if (!bg.nm(str)) {
      this.oJn.setText(str);
    }
    a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4687285714944L, 34923);
        SettingsModifyEmailAddrUI.a(SettingsModifyEmailAddrUI.this, SettingsModifyEmailAddrUI.b(SettingsModifyEmailAddrUI.this).getText().toString().trim());
        if (!bg.Sj(SettingsModifyEmailAddrUI.c(SettingsModifyEmailAddrUI.this)))
        {
          com.tencent.mm.ui.base.h.h(SettingsModifyEmailAddrUI.this.vKB.vKW, R.l.efY, R.l.cUG);
          GMTrace.o(4687285714944L, 34923);
          return true;
        }
        at.AR();
        paramAnonymousMenuItem = (Integer)c.xh().get(7, null);
        boolean bool;
        if ((paramAnonymousMenuItem != null) && ((paramAnonymousMenuItem.intValue() & 0x2) != 0))
        {
          bool = true;
          if ((SettingsModifyEmailAddrUI.c(SettingsModifyEmailAddrUI.this).equals(SettingsModifyEmailAddrUI.d(SettingsModifyEmailAddrUI.this))) && (Boolean.valueOf(bool).booleanValue())) {
            break label238;
          }
          paramAnonymousMenuItem = new com.tencent.mm.aa.a(com.tencent.mm.aa.a.gqU, SettingsModifyEmailAddrUI.c(SettingsModifyEmailAddrUI.this));
          at.wS().a(paramAnonymousMenuItem, 0);
          SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI1 = SettingsModifyEmailAddrUI.this;
          SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI2 = SettingsModifyEmailAddrUI.this;
          SettingsModifyEmailAddrUI.this.getString(R.l.cUG);
          SettingsModifyEmailAddrUI.a(localSettingsModifyEmailAddrUI1, com.tencent.mm.ui.base.h.a(localSettingsModifyEmailAddrUI2, SettingsModifyEmailAddrUI.this.getString(R.l.dYB), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(4676950949888L, 34846);
              at.wS().c(paramAnonymousMenuItem);
              GMTrace.o(4676950949888L, 34846);
            }
          }));
          SettingsModifyEmailAddrUI.this.aLo();
        }
        for (;;)
        {
          GMTrace.o(4687285714944L, 34923);
          return true;
          bool = false;
          break;
          label238:
          SettingsModifyEmailAddrUI.this.finish();
        }
      }
    });
    GMTrace.o(4675340337152L, 34834);
  }
  
  protected final void MP()
  {
    GMTrace.i(4675206119424L, 34833);
    oM(R.l.cGe);
    this.oJn = ((EditText)findViewById(R.h.cdb));
    this.oJq = ((TextView)findViewById(R.h.cjd));
    this.oJr = ((TextView)findViewById(R.h.bOg));
    at.AR();
    this.oJo = ((String)c.xh().get(5, null));
    this.oJn.setText(this.oJo);
    at.AR();
    Integer localInteger = (Integer)c.xh().get(7, null);
    if ((localInteger != null) && ((localInteger.intValue() & 0x2) != 0)) {}
    for (boolean bool = true;; bool = false)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4609842085888L, 34346);
          SettingsModifyEmailAddrUI.this.aLo();
          SettingsModifyEmailAddrUI.this.finish();
          GMTrace.o(4609842085888L, 34346);
          return true;
        }
      });
      if (!Boolean.valueOf(bool).booleanValue()) {
        break;
      }
      this.oJq.setVisibility(0);
      this.oJq.setText(getString(R.l.eaY));
      this.oJr.setText(getString(R.l.dZp));
      this.oJr.setTextColor(getResources().getColor(R.e.aMA));
      this.oJn.setEnabled(false);
      this.oJn.setFilters(new InputFilter[] { new InputFilter()
      {
        public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
        {
          GMTrace.i(4610915827712L, 34354);
          if (paramAnonymousCharSequence.length() <= 0)
          {
            paramAnonymousCharSequence = paramAnonymousSpanned.subSequence(paramAnonymousInt3, paramAnonymousInt4);
            GMTrace.o(4610915827712L, 34354);
            return paramAnonymousCharSequence;
          }
          GMTrace.o(4610915827712L, 34354);
          return "";
        }
      } });
      this.oJq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4665945096192L, 34764);
          paramAnonymousView = new com.tencent.mm.modelsimple.h(com.tencent.mm.modelsimple.h.gTM);
          at.wS().a(paramAnonymousView, 0);
          paramAnonymousView = SettingsModifyEmailAddrUI.this;
          SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI = SettingsModifyEmailAddrUI.this;
          SettingsModifyEmailAddrUI.this.getString(R.l.cUG);
          SettingsModifyEmailAddrUI.a(paramAnonymousView, com.tencent.mm.ui.base.h.a(localSettingsModifyEmailAddrUI, SettingsModifyEmailAddrUI.this.getString(R.l.ebd), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(4677890473984L, 34853);
              GMTrace.o(4677890473984L, 34853);
            }
          }));
          SettingsModifyEmailAddrUI.this.aLo();
          GMTrace.o(4665945096192L, 34764);
        }
      });
      db(this.oJn);
      GMTrace.o(4675206119424L, 34833);
      return;
    }
    if (!bg.nm(this.oJo))
    {
      this.oJq.setVisibility(0);
      this.oJq.setText(getString(R.l.dXO));
      this.oJr.setText(getString(R.l.dXN));
      this.oJr.setTextColor(getResources().getColor(R.e.aOL));
      this.oJn.setEnabled(false);
      this.oJn.setFilters(new InputFilter[] { new InputFilter()
      {
        public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
        {
          GMTrace.i(4616016101376L, 34392);
          if (paramAnonymousCharSequence.length() <= 0)
          {
            paramAnonymousCharSequence = paramAnonymousSpanned.subSequence(paramAnonymousInt3, paramAnonymousInt4);
            GMTrace.o(4616016101376L, 34392);
            return paramAnonymousCharSequence;
          }
          GMTrace.o(4616016101376L, 34392);
          return "";
        }
      } });
      this.oJq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          GMTrace.i(4710773817344L, 35098);
          at.AR();
          paramAnonymousView = new ae((String)c.xh().get(2, null));
          at.wS().a(paramAnonymousView, 0);
          SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI = SettingsModifyEmailAddrUI.this;
          ActionBarActivity localActionBarActivity = SettingsModifyEmailAddrUI.this.vKB.vKW;
          SettingsModifyEmailAddrUI.this.getString(R.l.cUG);
          SettingsModifyEmailAddrUI.a(localSettingsModifyEmailAddrUI, com.tencent.mm.ui.base.h.a(localActionBarActivity, SettingsModifyEmailAddrUI.this.getString(R.l.dYI), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(4686748844032L, 34919);
              at.wS().c(paramAnonymousView);
              GMTrace.o(4686748844032L, 34919);
            }
          }));
          SettingsModifyEmailAddrUI.this.aLo();
          GMTrace.o(4710773817344L, 35098);
        }
      });
      a(0, getString(R.l.cSC), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4664200265728L, 34751);
          SettingsModifyEmailAddrUI.a(SettingsModifyEmailAddrUI.this);
          GMTrace.o(4664200265728L, 34751);
          return true;
        }
      });
      db(this.oJn);
      GMTrace.o(4675206119424L, 34833);
      return;
    }
    beA();
    GMTrace.o(4675206119424L, 34833);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4675474554880L, 34835);
    com.tencent.mm.sdk.platformtools.w.i("MiroMsg.SettingsModifyEmailAddrUI", "onSceneEnd: sceneType = " + paramk.getType() + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (com.tencent.mm.plugin.setting.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(4675474554880L, 34835);
      return;
    }
    if (paramk.getType() == 254)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.oJt = ((com.tencent.mm.modelsimple.h)paramk).Lb().udv;
        this.oJs = ((com.tencent.mm.modelsimple.h)paramk).La();
        if (!bg.nm(this.oJt))
        {
          paramString = new com.tencent.mm.aa.a(com.tencent.mm.aa.a.gqV, this.oJn.getText().toString().trim());
          at.wS().a(paramString, 0);
          GMTrace.o(4675474554880L, 34835);
          return;
        }
        paramString = new com.tencent.mm.modelsimple.w(2);
        at.wS().a(paramString, 0);
        GMTrace.o(4675474554880L, 34835);
        return;
      }
      if (this.htG != null)
      {
        this.htG.dismiss();
        this.htG = null;
      }
      if (paramInt2 == -3)
      {
        com.tencent.mm.sdk.platformtools.w.d("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.ebb), null, getString(R.l.ebc), getString(R.l.eba), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4646886178816L, 34622);
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.putExtra("kintent_hint", SettingsModifyEmailAddrUI.this.getString(R.l.eaZ));
            paramAnonymousDialogInterface.putExtra("from_unbind", true);
            com.tencent.mm.bj.d.b(SettingsModifyEmailAddrUI.this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", paramAnonymousDialogInterface, 1);
            GMTrace.o(4646886178816L, 34622);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4631182704640L, 34505);
            GMTrace.o(4631182704640L, 34505);
          }
        });
        GMTrace.o(4675474554880L, 34835);
        return;
      }
      if (paramInt2 == -82)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYd, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4614002835456L, 34377);
            GMTrace.o(4614002835456L, 34377);
          }
        });
        GMTrace.o(4675474554880L, 34835);
        return;
      }
      if (paramInt2 == -83)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYa, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4684198707200L, 34900);
            GMTrace.o(4684198707200L, 34900);
          }
        });
        GMTrace.o(4675474554880L, 34835);
        return;
      }
      if (paramInt2 == -84)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dYb, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4655207677952L, 34684);
            GMTrace.o(4655207677952L, 34684);
          }
        });
        GMTrace.o(4675474554880L, 34835);
        return;
      }
      if (paramInt2 == -85)
      {
        com.tencent.mm.ui.base.h.a(this, R.l.dXW, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4666884620288L, 34771);
            GMTrace.o(4666884620288L, 34771);
          }
        });
        GMTrace.o(4675474554880L, 34835);
      }
    }
    else if (paramk.getType() == 256)
    {
      com.tencent.mm.plugin.setting.a.hnI.pr();
      if (((com.tencent.mm.aa.a)paramk).CD() == com.tencent.mm.aa.a.gqU)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ui.base.h.a(this.vKB.vKW, R.l.dYH, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4705941979136L, 35062);
              SettingsModifyEmailAddrUI.this.finish();
              GMTrace.o(4705941979136L, 35062);
            }
          });
          GMTrace.o(4675474554880L, 34835);
          return;
        }
        if (this.htG != null)
        {
          this.htG.dismiss();
          this.htG = null;
        }
        if (paramInt2 == -82)
        {
          com.tencent.mm.ui.base.h.a(this, R.l.dYd, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4713055518720L, 35115);
              SettingsModifyEmailAddrUI.this.finish();
              GMTrace.o(4713055518720L, 35115);
            }
          });
          GMTrace.o(4675474554880L, 34835);
          return;
        }
        if (paramInt2 == -83)
        {
          com.tencent.mm.ui.base.h.a(this, R.l.dYa, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4711042252800L, 35100);
              SettingsModifyEmailAddrUI.this.finish();
              GMTrace.o(4711042252800L, 35100);
            }
          });
          GMTrace.o(4675474554880L, 34835);
          return;
        }
        if (paramInt2 == -84)
        {
          com.tencent.mm.ui.base.h.a(this, R.l.dYb, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4617895149568L, 34406);
              SettingsModifyEmailAddrUI.this.finish();
              GMTrace.o(4617895149568L, 34406);
            }
          });
          GMTrace.o(4675474554880L, 34835);
          return;
        }
        if (paramInt2 == -85)
        {
          com.tencent.mm.ui.base.h.a(this, R.l.dXW, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4602057457664L, 34288);
              SettingsModifyEmailAddrUI.this.finish();
              GMTrace.o(4602057457664L, 34288);
            }
          });
          GMTrace.o(4675474554880L, 34835);
          return;
        }
        if (paramInt2 == -86)
        {
          com.tencent.mm.ui.base.h.a(this, R.l.dYe, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4672924418048L, 34816);
              SettingsModifyEmailAddrUI.this.finish();
              GMTrace.o(4672924418048L, 34816);
            }
          });
          GMTrace.o(4675474554880L, 34835);
          return;
        }
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dYG, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), getString(R.l.cUG), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4630377398272L, 34499);
            SettingsModifyEmailAddrUI.this.finish();
            GMTrace.o(4630377398272L, 34499);
          }
        });
        GMTrace.o(4675474554880L, 34835);
        return;
      }
      if (((com.tencent.mm.aa.a)paramk).CD() == com.tencent.mm.aa.a.gqV)
      {
        if (this.htG != null)
        {
          this.htG.dismiss();
          this.htG = null;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          at.AR();
          paramInt1 = ((Integer)c.xh().get(7, null)).intValue();
          at.AR();
          c.xh().set(7, Integer.valueOf(paramInt1 | 0x2));
          if (!bg.nm(this.oJt))
          {
            com.tencent.mm.ui.base.h.a(this.vKB.vKW, this.oJt, "", getString(R.l.cPO), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(4612929093632L, 34369);
                SettingsModifyEmailAddrUI.this.finish();
                GMTrace.o(4612929093632L, 34369);
              }
            });
            GMTrace.o(4675474554880L, 34835);
            return;
          }
          com.tencent.mm.ui.base.h.a(this.vKB.vKW, R.l.dXX, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4637893591040L, 34555);
              SettingsModifyEmailAddrUI.this.finish();
              GMTrace.o(4637893591040L, 34555);
            }
          });
          GMTrace.o(4675474554880L, 34835);
        }
      }
    }
    else if (paramk.getType() != 138)
    {
      if (paramk.getType() == 108)
      {
        if (this.htG != null)
        {
          this.htG.dismiss();
          this.htG = null;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ui.base.h.a(this.vKB.vKW, R.l.dYH, R.l.cUG, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4656952508416L, 34697);
              SettingsModifyEmailAddrUI.this.finish();
              GMTrace.o(4656952508416L, 34697);
            }
          });
          GMTrace.o(4675474554880L, 34835);
          return;
        }
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dYG, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), getString(R.l.cUG), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4612392222720L, 34365);
            SettingsModifyEmailAddrUI.this.finish();
            GMTrace.o(4612392222720L, 34365);
          }
        });
        GMTrace.o(4675474554880L, 34835);
        return;
      }
      if (paramk.getType() == 255)
      {
        if (paramInt2 == 0)
        {
          paramString = new com.tencent.mm.aa.a(com.tencent.mm.aa.a.gqV, this.oJn.getText().toString().trim());
          at.wS().a(paramString, 0);
          GMTrace.o(4675474554880L, 34835);
          return;
        }
        if (this.htG != null)
        {
          this.htG.dismiss();
          this.htG = null;
        }
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.ebb), null, getString(R.l.ebc), getString(R.l.eba), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4663126523904L, 34743);
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.putExtra("kintent_hint", SettingsModifyEmailAddrUI.this.getString(R.l.eaZ));
            paramAnonymousDialogInterface.putExtra("from_unbind", true);
            com.tencent.mm.bj.d.b(SettingsModifyEmailAddrUI.this, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", paramAnonymousDialogInterface, 1);
            GMTrace.o(4663126523904L, 34743);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(4603399634944L, 34298);
            GMTrace.o(4603399634944L, 34298);
          }
        });
      }
    }
    GMTrace.o(4675474554880L, 34835);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4674937683968L, 34831);
    int i = R.i.cGe;
    GMTrace.o(4674937683968L, 34831);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4675608772608L, 34836);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.sdk.platformtools.w.d("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(4675608772608L, 34836);
      return;
      if (paramInt2 == -1)
      {
        com.tencent.mm.sdk.platformtools.w.i("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again oldEmail: " + this.oJo + " newEmail: " + this.oJp);
        paramIntent = new com.tencent.mm.modelsimple.h(com.tencent.mm.modelsimple.h.gTM);
        at.wS().a(paramIntent, 0);
        getString(R.l.cUG);
        this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.dZg), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(4616821407744L, 34398);
            GMTrace.o(4616821407744L, 34398);
          }
        });
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4674803466240L, 34830);
    super.onCreate(paramBundle);
    MP();
    at.wS().a(138, this);
    at.wS().a(254, this);
    at.wS().a(256, this);
    at.wS().a(108, this);
    at.wS().a(255, this);
    GMTrace.o(4674803466240L, 34830);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4675071901696L, 34832);
    at.wS().b(138, this);
    at.wS().b(254, this);
    at.wS().b(256, this);
    at.wS().b(108, this);
    at.wS().b(255, this);
    super.onDestroy();
    GMTrace.o(4675071901696L, 34832);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsModifyEmailAddrUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */