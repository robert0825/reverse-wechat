package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.u;
import com.tencent.mm.plugin.c.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMAutoCompleteTextView;
import com.tencent.mm.ui.base.MMAutoCompleteTextView.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.Map;
import java.util.Set;

public class RegByEmailUI
  extends MMActivity
  implements e
{
  private static String[] vRH;
  private String fjd;
  private ProgressDialog htG;
  private String osl;
  private String vQY;
  private MMAutoCompleteTextView vRC;
  private EditText vRD;
  private CheckBox vRE;
  private String vRF;
  private Map<String, String> vRG;
  
  public RegByEmailUI()
  {
    GMTrace.i(2690662793216L, 20047);
    this.htG = null;
    GMTrace.o(2690662793216L, 20047);
  }
  
  private void goBack()
  {
    GMTrace.i(2691468099584L, 20053);
    h.a(this, R.l.dQK, R.l.dQN, R.l.cTM, R.l.cSk, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(2728914845696L, 20332);
        b.nz(RegByEmailUI.f(RegByEmailUI.this));
        RegByEmailUI.this.aLo();
        RegByEmailUI.this.finish();
        GMTrace.o(2728914845696L, 20332);
      }
    }, null);
    GMTrace.o(2691468099584L, 20053);
  }
  
  protected final void MP()
  {
    GMTrace.i(2691333881856L, 20052);
    this.vRC = ((MMAutoCompleteTextView)findViewById(R.h.bXT));
    this.vRD = ((EditText)findViewById(R.h.bXZ));
    this.vRE = ((CheckBox)findViewById(R.h.bds));
    if (!bg.nm(this.vRF))
    {
      this.vRD.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(2686367825920L, 20015);
          RegByEmailUI.a(RegByEmailUI.this).requestFocus();
          GMTrace.o(2686367825920L, 20015);
        }
      }, 500L);
      this.vRC.setText(this.vRF);
    }
    if (vRH != null)
    {
      c localc = new c(this, vRH, "@");
      MMAutoCompleteTextView localMMAutoCompleteTextView = this.vRC;
      if (!bg.nm("@"))
      {
        localMMAutoCompleteTextView.waS = new MMAutoCompleteTextView.a(localMMAutoCompleteTextView, "@");
        localMMAutoCompleteTextView.addTextChangedListener(localMMAutoCompleteTextView.waS);
      }
      this.vRC.setDropDownAnchor(R.h.bXU);
      this.vRC.setDropDownVerticalOffset(this.vRC.getPaddingBottom());
      this.vRC.setAdapter(localc);
    }
    findViewById(R.h.bdr).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(2656974143488L, 19796);
        bg.E(RegByEmailUI.this, RegByEmailUI.this.getString(R.l.efA));
        GMTrace.o(2656974143488L, 19796);
      }
    });
    this.vRE.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(2781796630528L, 20726);
        RegByEmailUI.b(RegByEmailUI.this);
        GMTrace.o(2781796630528L, 20726);
      }
    });
    a(0, getString(R.l.cTI), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2733209812992L, 20364);
        RegByEmailUI.c(RegByEmailUI.this);
        GMTrace.o(2733209812992L, 20364);
        return true;
      }
    });
    lf(false);
    this.vRC.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(2641136451584L, 19678);
        RegByEmailUI.b(RegByEmailUI.this);
        GMTrace.o(2641136451584L, 19678);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2641270669312L, 19679);
        GMTrace.o(2641270669312L, 19679);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2641404887040L, 19680);
        GMTrace.o(2641404887040L, 19680);
      }
    });
    this.vRD.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(2650800128000L, 19750);
        RegByEmailUI.b(RegByEmailUI.this);
        GMTrace.o(2650800128000L, 19750);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2650934345728L, 19751);
        GMTrace.o(2650934345728L, 19751);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2651068563456L, 19752);
        GMTrace.o(2651068563456L, 19752);
      }
    });
    this.vRD.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(2669859045376L, 19892);
        if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
        {
          if (!RegByEmailUI.d(RegByEmailUI.this).isChecked())
          {
            GMTrace.o(2669859045376L, 19892);
            return false;
          }
          RegByEmailUI.c(RegByEmailUI.this);
          GMTrace.o(2669859045376L, 19892);
          return true;
        }
        GMTrace.o(2669859045376L, 19892);
        return false;
      }
    });
    this.vRD.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(2785017856000L, 20750);
        if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
        {
          if (!RegByEmailUI.d(RegByEmailUI.this).isChecked())
          {
            GMTrace.o(2785017856000L, 20750);
            return false;
          }
          RegByEmailUI.c(RegByEmailUI.this);
          GMTrace.o(2785017856000L, 20750);
          return true;
        }
        GMTrace.o(2785017856000L, 20750);
        return false;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2639257403392L, 19664);
        RegByEmailUI.e(RegByEmailUI.this);
        GMTrace.o(2639257403392L, 19664);
        return true;
      }
    });
    GMTrace.o(2691333881856L, 20052);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2691736535040L, 20055);
    w.i("MicroMsg.RegByEmailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((this.htG != null) && (this.htG.isShowing()))
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (paramk.getType() != 481)
    {
      w.e("MicroMsg.RegByEmailUI", "error cgi type callback:[%d]", new Object[] { Integer.valueOf(paramk.getType()) });
      GMTrace.o(2691736535040L, 20055);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      b.nz("R500_200");
      paramString = new Intent(this, EmailVerifyUI.class);
      paramString.putExtra("email_address", this.fjd);
      paramString.putExtra("password", this.vQY);
      if ((this.vRG != null) && (!this.vRG.isEmpty()))
      {
        paramk = this.fjd.split("@");
        if ((paramk != null) && (paramk.length == 2))
        {
          paramk = paramk[1];
          paramString.putExtra("email_login_page", (String)this.vRG.get(paramk));
        }
      }
      startActivity(paramString);
      GMTrace.o(2691736535040L, 20055);
      return;
    }
    int i;
    if (com.tencent.mm.plugin.c.a.hnI.a(this, paramInt1, paramInt2, paramString)) {
      i = 1;
    }
    while (i != 0)
    {
      GMTrace.o(2691736535040L, 20055);
      return;
      i = 0;
      switch (paramInt2)
      {
      default: 
        break;
      case -111: 
        h.h(this, R.l.dQQ, R.l.dQN);
        i = 1;
        break;
      case -7: 
        b.nA(at.wN() + "," + getClass().getName() + ",R20_email_duplicate_confirm," + at.eK("R20_email_duplicate_confirm") + ",3");
        h.a(this, R.l.dQX, R.l.dQN, R.l.dQZ, R.l.dQY, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2781528195072L, 20724);
            RegByEmailUI.this.finish();
            b.nz("L2_signup");
            paramAnonymousDialogInterface = new Intent(RegByEmailUI.this, LoginPasswordUI.class);
            paramAnonymousDialogInterface.putExtra("email_address", RegByEmailUI.g(RegByEmailUI.this));
            RegByEmailUI.this.startActivity(paramAnonymousDialogInterface);
            GMTrace.o(2781528195072L, 20724);
          }
        }, null);
        i = 1;
        break;
      case -34: 
        Toast.makeText(this, R.l.dQL, 0).show();
        i = 1;
        break;
      case -75: 
        h.h(this, R.l.cRG, R.l.dQH);
        i = 1;
      }
    }
    if (!bg.nm(paramString))
    {
      paramString = bh.q(paramString, "e");
      if ((paramString != null) && (paramString.size() > 0))
      {
        paramString = (String)paramString.get(".e.Content");
        if (!bg.nm(paramString))
        {
          h.b(this, paramString, getString(R.l.dQN), true);
          GMTrace.o(2691736535040L, 20055);
          return;
        }
      }
    }
    Toast.makeText(this, getString(R.l.dQU, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(2691736535040L, 20055);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2691199664128L, 20051);
    int i = R.i.cEH;
    GMTrace.o(2691199664128L, 20051);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2690797010944L, 20048);
    super.onCreate(paramBundle);
    paramBundle = getString(R.l.dQW);
    if (com.tencent.mm.protocal.d.tJF) {
      paramBundle = getString(R.l.app_name) + getString(R.l.cRD);
    }
    sq(paramBundle);
    com.tencent.mm.plugin.c.a.hnI.pu();
    this.vRF = com.tencent.mm.modelsimple.d.br(this);
    w.i("MicroMsg.RegByEmailUI", "get google account:[%s]", new Object[] { this.vRF });
    this.vRG = com.tencent.mm.plugin.accountsync.b.a.htk.bA(this);
    if ((this.vRG != null) && (!this.vRG.isEmpty()))
    {
      vRH = new String[this.vRG.size()];
      this.vRG.keySet().toArray(vRH);
    }
    this.osl = b.Qu();
    MP();
    GMTrace.o(2690797010944L, 20048);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2691602317312L, 20054);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      GMTrace.o(2691602317312L, 20054);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2691602317312L, 20054);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(2691065446400L, 20050);
    super.onPause();
    at.wS().b(481, this);
    b.b(false, at.wN() + "," + getClass().getName() + ",R500_100," + at.eK("R500_100") + ",2");
    GMTrace.o(2691065446400L, 20050);
  }
  
  protected void onResume()
  {
    GMTrace.i(2690931228672L, 20049);
    super.onResume();
    at.wS().a(481, this);
    b.b(true, at.wN() + "," + getClass().getName() + ",R500_100," + at.eK("R500_100") + ",1");
    b.ny("R500_100");
    GMTrace.o(2690931228672L, 20049);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\RegByEmailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */