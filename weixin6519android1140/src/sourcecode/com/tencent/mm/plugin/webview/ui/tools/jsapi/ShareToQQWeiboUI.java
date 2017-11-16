package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
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
import com.tencent.mm.modelsimple.ac;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText.c;
import com.tencent.mm.y.at;

public class ShareToQQWeiboUI
  extends MMActivity
  implements e
{
  private ProgressDialog htG;
  private EditText nUE;
  private TextView oGq;
  
  public ShareToQQWeiboUI()
  {
    GMTrace.i(12177574461440L, 90730);
    this.htG = null;
    GMTrace.o(12177574461440L, 90730);
  }
  
  protected final void MP()
  {
    GMTrace.i(12178111332352L, 90734);
    oM(R.l.ecD);
    this.nUE = ((EditText)findViewById(R.h.content));
    this.oGq = ((TextView)findViewById(R.h.coE));
    String str1 = getIntent().getStringExtra("content");
    String str2 = getIntent().getStringExtra("shortUrl");
    this.nUE.addTextChangedListener(new MMEditText.c(this.nUE, this.oGq, 280));
    if (str1.contains(str2)) {
      this.nUE.setText(str1.trim());
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12135832748032L, 90419);
          ShareToQQWeiboUI.this.aLo();
          ShareToQQWeiboUI.this.finish();
          GMTrace.o(12135832748032L, 90419);
          return true;
        }
      });
      a(0, getString(R.l.cUw), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(final MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(12143080505344L, 90473);
          paramAnonymousMenuItem = new ac(ShareToQQWeiboUI.this.getIntent().getIntExtra("type", 0), ShareToQQWeiboUI.this.getIntent().getStringExtra("shortUrl"), ShareToQQWeiboUI.a(ShareToQQWeiboUI.this).getText().toString());
          at.wS().a(paramAnonymousMenuItem, 0);
          ShareToQQWeiboUI localShareToQQWeiboUI = ShareToQQWeiboUI.this;
          ActionBarActivity localActionBarActivity = ShareToQQWeiboUI.this.vKB.vKW;
          ShareToQQWeiboUI.this.getString(R.l.cUG);
          ShareToQQWeiboUI.a(localShareToQQWeiboUI, h.a(localActionBarActivity, ShareToQQWeiboUI.this.getString(R.l.dIe), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(12147778125824L, 90508);
              at.wS().c(paramAnonymousMenuItem);
              GMTrace.o(12147778125824L, 90508);
            }
          }));
          GMTrace.o(12143080505344L, 90473);
          return true;
        }
      });
      GMTrace.o(12178111332352L, 90734);
      return;
      this.nUE.setText(str1 + " " + str2);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12178245550080L, 90735);
    w.i("MicroMsg.ShareToQQWeiboUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramk.getType() != 26)
    {
      GMTrace.o(12178245550080L, 90735);
      return;
    }
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      aLo();
      setResult(-1);
      finish();
      GMTrace.o(12178245550080L, 90735);
      return;
    }
    setResult(1, new Intent().putExtra("err_code", paramInt2));
    Toast.makeText(this, getString(R.l.ecA, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    GMTrace.o(12178245550080L, 90735);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12177708679168L, 90731);
    int i = R.i.cuv;
    GMTrace.o(12177708679168L, 90731);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12177842896896L, 90732);
    super.onCreate(paramBundle);
    at.wS().a(26, this);
    MP();
    GMTrace.o(12177842896896L, 90732);
  }
  
  public void onDestroy()
  {
    GMTrace.i(12177977114624L, 90733);
    at.wS().b(26, this);
    super.onDestroy();
    GMTrace.o(12177977114624L, 90733);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\ShareToQQWeiboUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */