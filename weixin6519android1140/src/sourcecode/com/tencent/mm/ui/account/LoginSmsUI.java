package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelfriend.s;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMFormVerifyCodeInputView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public class LoginSmsUI
  extends LoginHistoryUI
{
  private static String TAG;
  
  static
  {
    GMTrace.i(16822715809792L, 125339);
    TAG = "LoginSmsUI";
    GMTrace.o(16822715809792L, 125339);
  }
  
  public LoginSmsUI()
  {
    GMTrace.i(16821776285696L, 125332);
    GMTrace.o(16821776285696L, 125332);
  }
  
  protected final void Wg()
  {
    GMTrace.i(16822044721152L, 125334);
    super.Wg();
    if ((isFinishing()) || (getWindow() == null))
    {
      w.e(TAG, "LoginHistoryUI is finishing");
      GMTrace.o(16822044721152L, 125334);
      return;
    }
    if (!bg.nm(this.vQn))
    {
      this.vQl.gUy = this.vQn;
      aLo();
      bYt();
      final s locals = new s(this.vQn, 17, this.vQx.getText().toString().trim(), 0, "");
      at.wS().a(locals, 0);
      getString(R.l.cUG);
      this.htG = h.a(this, getString(R.l.dHk), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(16843519557632L, 125494);
          at.wS().c(locals);
          GMTrace.o(16843519557632L, 125494);
        }
      });
    }
    GMTrace.o(16822044721152L, 125334);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16821910503424L, 125333);
    super.onCreate(paramBundle);
    if (this.vQy)
    {
      GMTrace.o(16821910503424L, 125333);
      return;
    }
    this.ibA = 3;
    if ((!bg.SH(this.vQs).booleanValue()) && (bg.SH(this.vQn).booleanValue())) {
      this.vQf.setText(Fp(this.vQn));
    }
    this.vQx.setVisibility(0);
    this.vQx.bZK();
    this.vQx.wcc = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16840298332160L, 125470);
        h.a(LoginSmsUI.this, LoginSmsUI.this.getString(R.l.dRJ) + LoginSmsUI.this.vQn, LoginSmsUI.this.getString(R.l.dRK), LoginSmsUI.this.getString(R.l.cTM), LoginSmsUI.this.getString(R.l.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(16834795405312L, 125429);
            LoginSmsUI.this.vQx.bZJ();
            LoginSmsUI.a(LoginSmsUI.this, LoginSmsUI.this.vQn);
            GMTrace.o(16834795405312L, 125429);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(16820836761600L, 125325);
            LoginSmsUI.this.vQx.reset();
            GMTrace.o(16820836761600L, 125325);
          }
        });
        GMTrace.o(16840298332160L, 125470);
      }
    };
    paramBundle = this.vQx;
    TextWatcher local2 = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(16828218736640L, 125380);
        if (LoginSmsUI.this.vQx.getText().toString().length() > 0)
        {
          LoginSmsUI.this.vQg.setEnabled(true);
          GMTrace.o(16828218736640L, 125380);
          return;
        }
        LoginSmsUI.this.vQg.setEnabled(false);
        GMTrace.o(16828218736640L, 125380);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16828352954368L, 125381);
        GMTrace.o(16828352954368L, 125381);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(16828487172096L, 125382);
        GMTrace.o(16828487172096L, 125382);
      }
    };
    if (paramBundle.nUE != null)
    {
      paramBundle.nUE.addTextChangedListener(local2);
      if (this.vQx.getText().toString().length() <= 0) {
        break label215;
      }
      this.vQg.setEnabled(true);
    }
    for (;;)
    {
      this.vQg.setVisibility(0);
      this.vQg.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16840835203072L, 125474);
          LoginSmsUI.this.Wg();
          GMTrace.o(16840835203072L, 125474);
        }
      });
      GMTrace.o(16821910503424L, 125333);
      return;
      w.w("MicroMsg.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", new Object[] { local2, paramBundle.nUE });
      break;
      label215:
      this.vQg.setEnabled(false);
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(16822447374336L, 125337);
    super.onDestroy();
    this.vQx.reset();
    GMTrace.o(16822447374336L, 125337);
  }
  
  public void onResume()
  {
    GMTrace.i(16822178938880L, 125335);
    super.onResume();
    at.wS().a(145, this);
    GMTrace.o(16822178938880L, 125335);
  }
  
  protected void onStop()
  {
    GMTrace.i(16822313156608L, 125336);
    super.onStop();
    at.wS().b(145, this);
    GMTrace.o(16822313156608L, 125336);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\account\LoginSmsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */