package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public class LoginPasswordUI
  extends LoginHistoryUI
{
  private static String TAG;
  
  static
  {
    GMTrace.i(16829024043008L, 125386);
    TAG = "LoginPasswordUI";
    GMTrace.o(16829024043008L, 125386);
  }
  
  public LoginPasswordUI()
  {
    GMTrace.i(16828621389824L, 125383);
    GMTrace.o(16828621389824L, 125383);
  }
  
  protected final void Wg()
  {
    GMTrace.i(16828889825280L, 125385);
    super.Wg();
    if ((isFinishing()) || (getWindow() == null))
    {
      w.e(TAG, "LoginHistoryUI is finishing");
      GMTrace.o(16828889825280L, 125385);
      return;
    }
    this.vQl.vQY = this.kGe.getText().toString();
    if (this.vQl.gUy.equals(""))
    {
      h.h(this, R.l.ege, R.l.dHa);
      GMTrace.o(16828889825280L, 125385);
      return;
    }
    if (this.vQl.vQY.equals(""))
    {
      h.h(this, R.l.egb, R.l.dHa);
      GMTrace.o(16828889825280L, 125385);
      return;
    }
    aLo();
    bYt();
    final u localu = new u(this.vQl.gUy, this.vQl.vQY, this.osh, 0);
    at.wS().a(localu, 0);
    getString(R.l.cUG);
    this.htG = h.a(this, getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(16839224590336L, 125462);
        at.wS().c(localu);
        LoginPasswordUI.this.bYu();
        GMTrace.o(16839224590336L, 125462);
      }
    });
    GMTrace.o(16828889825280L, 125385);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16828755607552L, 125384);
    super.onCreate(paramBundle);
    if (this.vQy)
    {
      GMTrace.o(16828755607552L, 125384);
      return;
    }
    this.ibA = 2;
    this.vQw.setVisibility(0);
    this.vQg.setVisibility(0);
    this.kGe.setTypeface(Typeface.DEFAULT);
    this.kGe.setTransformationMethod(new PasswordTransformationMethod());
    this.kGe.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16818018189312L, 125304);
        if ((paramAnonymousInt == 6) || (paramAnonymousInt == 5))
        {
          LoginPasswordUI.this.Wg();
          GMTrace.o(16818018189312L, 125304);
          return true;
        }
        GMTrace.o(16818018189312L, 125304);
        return false;
      }
    });
    this.kGe.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(16821373632512L, 125329);
        if ((66 == paramAnonymousInt) && (paramAnonymousKeyEvent.getAction() == 0))
        {
          LoginPasswordUI.this.Wg();
          GMTrace.o(16821373632512L, 125329);
          return true;
        }
        GMTrace.o(16821373632512L, 125329);
        return false;
      }
    });
    this.kGe.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(16839493025792L, 125464);
        if (LoginPasswordUI.this.kGe.getText().toString().length() > 0)
        {
          LoginPasswordUI.this.vQg.setEnabled(true);
          GMTrace.o(16839493025792L, 125464);
          return;
        }
        LoginPasswordUI.this.vQg.setEnabled(false);
        GMTrace.o(16839493025792L, 125464);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16839627243520L, 125465);
        GMTrace.o(16839627243520L, 125465);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16839761461248L, 125466);
        GMTrace.o(16839761461248L, 125466);
      }
    });
    if (this.kGe.getText().toString().length() > 0) {
      this.vQg.setEnabled(true);
    }
    for (;;)
    {
      this.vQg.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16827950301184L, 125378);
          LoginPasswordUI.this.Wg();
          GMTrace.o(16827950301184L, 125378);
        }
      });
      this.osh = getIntent().getStringExtra("auth_ticket");
      if (!bg.nm(this.osh))
      {
        this.vQf.setText(bg.nl(f.bYz()));
        this.kGe.setText(bg.nl(f.bYA()));
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16821642067968L, 125331);
            LoginPasswordUI.this.Wg();
            GMTrace.o(16821642067968L, 125331);
          }
        }, 500L);
      }
      GMTrace.o(16828755607552L, 125384);
      return;
      this.vQg.setEnabled(false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\LoginPasswordUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */