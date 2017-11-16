package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.setting.a.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class SettingsAliasUI
  extends MMActivity
  implements e
{
  private String fsF;
  private ImageView hqG;
  private ProgressDialog htG;
  private TextView jpV;
  private TextView lkq;
  private e oHG;
  private EditText oIM;
  private b oIN;
  private boolean oIO;
  private TextView oIP;
  
  public SettingsAliasUI()
  {
    GMTrace.i(4648362573824L, 34633);
    this.htG = null;
    this.oIO = false;
    this.oHG = null;
    GMTrace.o(4648362573824L, 34633);
  }
  
  protected final void MP()
  {
    GMTrace.i(4649033662464L, 34638);
    oM(R.l.dJb);
    this.hqG = ((ImageView)findViewById(R.h.bfq));
    this.jpV = ((TextView)findViewById(R.h.bQX));
    this.oIP = ((TextView)findViewById(R.h.cjN));
    this.lkq = ((TextView)findViewById(R.h.bOi));
    this.oIM = ((EditText)findViewById(R.h.bYj));
    String str = q.zE();
    if (!x.Ts(str))
    {
      this.oIM.setText(q.zE());
      this.oIP.setText(getString(R.l.cRJ, new Object[] { str }));
    }
    this.oIM.setSelection(this.oIM.getText().length());
    this.oIM.setFocusable(true);
    this.oIM.setFocusableInTouchMode(true);
    this.oIM.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(4673998159872L, 34824);
        GMTrace.o(4673998159872L, 34824);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(4673729724416L, 34822);
        GMTrace.o(4673729724416L, 34822);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(4673863942144L, 34823);
        SettingsAliasUI localSettingsAliasUI = SettingsAliasUI.this;
        a locala = new a();
        if ((paramAnonymousCharSequence.length() < 6) || (paramAnonymousCharSequence.length() > 20))
        {
          locala.eAR = localSettingsAliasUI.getString(R.l.efV);
          locala.eFc = false;
          if (!locala.eFc) {
            break label353;
          }
          SettingsAliasUI.this.lf(true);
          SettingsAliasUI.a(SettingsAliasUI.this).setTextColor(SettingsAliasUI.this.getResources().getColorStateList(R.e.aOa));
        }
        for (;;)
        {
          SettingsAliasUI.a(SettingsAliasUI.this).setText(locala.eAR);
          SettingsAliasUI.b(SettingsAliasUI.this).setText(SettingsAliasUI.this.getString(R.l.cRJ, new Object[] { paramAnonymousCharSequence }));
          GMTrace.o(4673863942144L, 34823);
          return;
          if (!bg.k(paramAnonymousCharSequence.charAt(0)))
          {
            locala.eAR = localSettingsAliasUI.getString(R.l.efT);
            locala.eFc = false;
            break;
          }
          paramAnonymousInt1 = paramAnonymousCharSequence.length() - 1;
          for (;;)
          {
            if (paramAnonymousInt1 <= 0) {
              break label331;
            }
            char c = paramAnonymousCharSequence.charAt(paramAnonymousInt1);
            if ((!bg.k(c)) && (c != '-') && (c != '_') && (!bg.l(c)))
            {
              if (Character.isSpace(c))
              {
                locala.eAR = localSettingsAliasUI.getString(R.l.efS);
                locala.eFc = false;
                break;
              }
              if (bg.h(c))
              {
                locala.eAR = localSettingsAliasUI.getString(R.l.efR);
                locala.eFc = false;
                break;
              }
              locala.eAR = localSettingsAliasUI.getString(R.l.efV);
              locala.eFc = false;
              break;
            }
            paramAnonymousInt1 -= 1;
          }
          label331:
          locala.eAR = localSettingsAliasUI.getString(R.l.dJe);
          locala.eFc = true;
          break;
          label353:
          SettingsAliasUI.this.lf(false);
          SettingsAliasUI.a(SettingsAliasUI.this).setTextColor(SettingsAliasUI.this.getResources().getColorStateList(R.e.aOX));
        }
      }
    });
    this.jpV.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this, bg.nl(q.zG()), this.jpV.getTextSize()));
    a.b.a(this.hqG, str);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4619774197760L, 34420);
        SettingsAliasUI.this.aLo();
        SettingsAliasUI.this.finish();
        GMTrace.o(4619774197760L, 34420);
        return true;
      }
    });
    a(0, getString(R.l.cUp), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4693459730432L, 34969);
        SettingsAliasUI.a(SettingsAliasUI.this, SettingsAliasUI.c(SettingsAliasUI.this).getText().toString().trim());
        if (q.zE().equalsIgnoreCase(SettingsAliasUI.d(SettingsAliasUI.this)))
        {
          SettingsAliasUI.this.aLo();
          SettingsAliasUI.this.finish();
          GMTrace.o(4693459730432L, 34969);
          return true;
        }
        com.tencent.mm.ui.base.h.a(SettingsAliasUI.this.vKB.vKW, SettingsAliasUI.this.getString(R.l.dJc, new Object[] { SettingsAliasUI.d(SettingsAliasUI.this) }), SettingsAliasUI.this.getString(R.l.diA), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(4610110521344L, 34348);
            SettingsAliasUI.e(SettingsAliasUI.this);
            GMTrace.o(4610110521344L, 34348);
          }
        }, null);
        GMTrace.o(4693459730432L, 34969);
        return true;
      }
    }, p.b.vLG);
    lf(false);
    GMTrace.o(4649033662464L, 34638);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    int i = 1;
    GMTrace.i(4649167880192L, 34639);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.oIO) {
        g.ork.A(10358, "1");
      }
      aLo();
      at.AR();
      c.xh().set(42, this.fsF);
      paramString = at.wS();
      paramk = new e()
      {
        public final void a(final int paramAnonymousInt1, final int paramAnonymousInt2, String paramAnonymousString, final k paramAnonymousk)
        {
          GMTrace.i(4603131199488L, 34296);
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SettingsAliasUI", "onSceneEnd " + paramAnonymousInt1 + " errCode " + paramAnonymousInt2 + " errMsg " + paramAnonymousString + "  " + paramAnonymousk.getType());
          at.wS().b(255, SettingsAliasUI.g(SettingsAliasUI.this));
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4720705929216L, 35172);
              if (SettingsAliasUI.h(SettingsAliasUI.this) != null)
              {
                SettingsAliasUI.h(SettingsAliasUI.this).dismiss();
                SettingsAliasUI.i(SettingsAliasUI.this);
              }
              SettingsAliasUI.j(SettingsAliasUI.this);
              if (paramAnonymousk.getType() == 255) {
                if ((paramAnonymousInt2 == -3) && (paramAnonymousInt1 == 4)) {
                  break label143;
                }
              }
              label143:
              for (boolean bool = true;; bool = false)
              {
                Intent localIntent = new Intent(SettingsAliasUI.this, SettingsAliasResultUI.class);
                localIntent.putExtra("has_pwd", bool);
                SettingsAliasUI.this.startActivity(localIntent);
                SettingsAliasUI.this.finish();
                GMTrace.o(4720705929216L, 35172);
                return;
              }
            }
          });
          GMTrace.o(4603131199488L, 34296);
        }
      };
      this.oHG = paramk;
      paramString.a(255, paramk);
      paramString = new com.tencent.mm.modelsimple.w(1);
      at.wS().a(paramString, 0);
      GMTrace.o(4649167880192L, 34639);
      return;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (com.tencent.mm.plugin.setting.a.hnI.a(this.vKB.vKW, paramInt1, paramInt2, paramString)) {
      paramInt1 = i;
    }
    while (paramInt1 != 0)
    {
      GMTrace.o(4649167880192L, 34639);
      return;
      switch (paramInt1)
      {
      }
      do
      {
        paramInt1 = 0;
        break;
      } while ((paramInt2 != -7) && (paramInt2 != -10));
      com.tencent.mm.ui.base.h.h(this.vKB.vKW, R.l.dQG, R.l.dJf);
      paramInt1 = i;
    }
    GMTrace.o(4649167880192L, 34639);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4648631009280L, 34635);
    int i = R.i.cGa;
    GMTrace.o(4648631009280L, 34635);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4648496791552L, 34634);
    super.onCreate(paramBundle);
    this.oIO = getIntent().getBooleanExtra("KFromSetAliasTips", false);
    MP();
    at.wS().a(177, this);
    GMTrace.o(4648496791552L, 34634);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4648899444736L, 34637);
    if (this.oIN != null) {
      at.wS().c(this.oIN);
    }
    at.wS().b(177, this);
    super.onDestroy();
    GMTrace.o(4648899444736L, 34637);
  }
  
  public void onPause()
  {
    GMTrace.i(4648765227008L, 34636);
    super.onPause();
    GMTrace.o(4648765227008L, 34636);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SettingsAliasUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */