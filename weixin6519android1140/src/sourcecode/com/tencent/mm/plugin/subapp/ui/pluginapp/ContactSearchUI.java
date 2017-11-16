package com.tencent.mm.plugin.subapp.ui.pluginapp;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
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
import com.tencent.mm.bj.d;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.subapp.b;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.io.IOException;

public class ContactSearchUI
  extends MMActivity
  implements e
{
  private ProgressDialog htG;
  private EditText qus;
  
  public ContactSearchUI()
  {
    GMTrace.i(5779146932224L, 43058);
    this.htG = null;
    GMTrace.o(5779146932224L, 43058);
  }
  
  private static int Jz(String paramString)
  {
    GMTrace.i(5780220674048L, 43066);
    if (bg.Si(paramString))
    {
      GMTrace.o(5780220674048L, 43066);
      return 1;
    }
    if (bg.Sj(paramString))
    {
      GMTrace.o(5780220674048L, 43066);
      return 2;
    }
    if (bg.Sk(paramString))
    {
      GMTrace.o(5780220674048L, 43066);
      return 3;
    }
    GMTrace.o(5780220674048L, 43066);
    return 3;
  }
  
  private void brL()
  {
    GMTrace.i(5779952238592L, 43064);
    final Object localObject = this.qus.getText().toString().trim();
    if ((localObject == null) || (((String)localObject).length() <= 0))
    {
      com.tencent.mm.ui.base.h.h(this.vKB.vKW, R.l.efZ, R.l.cUG);
      GMTrace.o(5779952238592L, 43064);
      return;
    }
    w.d("MicroMsg.ContactSearchUI", "always search contact from internet!!!");
    localObject = new ab((String)localObject, 1);
    at.wS().a((k)localObject, 0);
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    getString(R.l.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(localActionBarActivity, getString(R.l.cRh), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(5774046658560L, 43020);
        at.wS().c(localObject);
        GMTrace.o(5774046658560L, 43020);
      }
    });
    GMTrace.o(5779952238592L, 43064);
  }
  
  protected final void MP()
  {
    GMTrace.i(5779818020864L, 43063);
    oM(R.l.dlG);
    this.qus = ((EditText)findViewById(R.h.brx));
    this.qus.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(5787468431360L, 43120);
        ContactSearchUI localContactSearchUI = ContactSearchUI.this;
        if (paramAnonymousEditable.length() > 0) {}
        for (boolean bool = true;; bool = false)
        {
          localContactSearchUI.lf(bool);
          GMTrace.o(5787468431360L, 43120);
          return;
        }
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5787334213632L, 43119);
        GMTrace.o(5787334213632L, 43119);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(5787199995904L, 43118);
        GMTrace.o(5787199995904L, 43118);
      }
    });
    this.qus.setImeOptions(3);
    this.qus.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(5775120400384L, 43028);
        if ((paramAnonymousKeyEvent != null) && (paramAnonymousKeyEvent.getKeyCode() == 66) && (!bg.nm(ContactSearchUI.a(ContactSearchUI.this).getText().toString().trim()))) {
          ContactSearchUI.b(ContactSearchUI.this);
        }
        GMTrace.o(5775120400384L, 43028);
        return false;
      }
    });
    a(0, getString(R.l.cTg), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5781562851328L, 43076);
        ContactSearchUI.b(ContactSearchUI.this);
        GMTrace.o(5781562851328L, 43076);
        return false;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5791360745472L, 43149);
        ContactSearchUI.this.aLo();
        ContactSearchUI.this.finish();
        GMTrace.o(5791360745472L, 43149);
        return true;
      }
    });
    if (getIntent().getBooleanExtra("from_webview", false))
    {
      String str = getIntent().getStringExtra("userName");
      this.qus.setText(str);
      brL();
    }
    GMTrace.o(5779818020864L, 43063);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5780086456320L, 43065);
    w.i("MicroMsg.ContactSearchUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (b.hnI.b(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(5780086456320L, 43065);
      return;
    }
    if ((paramInt1 == 4) && (paramInt2 == -4))
    {
      com.tencent.mm.ui.base.h.h(this.vKB.vKW, R.l.cRe, R.l.cUG);
      GMTrace.o(5780086456320L, 43065);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Toast.makeText(this, getString(R.l.dxe), 0).show();
      w.w("MicroMsg.ContactSearchUI", getString(R.l.dxd, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
      GMTrace.o(5780086456320L, 43065);
      return;
    }
    paramString = ((ab)paramk).LK();
    if (paramString.uqk > 0)
    {
      paramk = new Intent();
      paramk.setClass(this, ContactSearchResultUI.class);
      try
      {
        paramk.putExtra("result", paramString.toByteArray());
        startActivity(paramk);
        GMTrace.o(5780086456320L, 43065);
        return;
      }
      catch (IOException paramString)
      {
        w.printErrStackTrace("MicroMsg.ContactSearchUI", paramString, "", new Object[0]);
        GMTrace.o(5780086456320L, 43065);
        return;
      }
    }
    paramk = com.tencent.mm.platformtools.n.a(paramString.ufy);
    Intent localIntent = new Intent();
    ((i)com.tencent.mm.kernel.h.h(i.class)).a(localIntent, paramString, Jz(this.qus.getText().toString().trim()));
    if (bg.nl(paramk).length() > 0)
    {
      if ((paramString.uAv & 0x8) > 0) {
        g.ork.A(10298, paramk + "," + Jz(this.qus.getText().toString().trim()));
      }
      d.b(this, "profile", ".ui.ContactInfoUI", localIntent);
    }
    GMTrace.o(5780086456320L, 43065);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5779281149952L, 43059);
    int i = R.i.ctW;
    GMTrace.o(5779281149952L, 43059);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5779415367680L, 43060);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(5779415367680L, 43060);
  }
  
  protected void onPause()
  {
    GMTrace.i(5779683803136L, 43062);
    at.wS().b(106, this);
    super.onPause();
    GMTrace.o(5779683803136L, 43062);
  }
  
  protected void onResume()
  {
    GMTrace.i(5779549585408L, 43061);
    at.wS().a(106, this);
    super.onResume();
    GMTrace.o(5779549585408L, 43061);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\pluginapp\ContactSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */