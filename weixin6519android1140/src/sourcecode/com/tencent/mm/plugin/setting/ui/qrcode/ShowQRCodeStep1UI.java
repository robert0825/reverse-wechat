package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
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
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class ShowQRCodeStep1UI
  extends MMActivity
  implements e
{
  private ProgressDialog htG;
  private int oGr;
  private ImageView oGw;
  byte[] oGx;
  
  public ShowQRCodeStep1UI()
  {
    GMTrace.i(4726745726976L, 35217);
    this.htG = null;
    this.oGw = null;
    this.oGr = 1;
    this.oGx = null;
    GMTrace.o(4726745726976L, 35217);
  }
  
  protected final void MP()
  {
    GMTrace.i(4727282597888L, 35221);
    oM(R.l.dXB);
    this.oGw = ((ImageView)findViewById(R.h.cbV));
    this.oGr = getIntent().getIntExtra("show_to", 1);
    TextView localTextView = (TextView)findViewById(R.h.ceP);
    if (this.oGr == 3) {
      localTextView.setText(getString(R.l.dXf, new Object[] { getString(R.l.dXj) }));
    }
    for (;;)
    {
      beg();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4732114436096L, 35257);
          ShowQRCodeStep1UI.this.aLo();
          ShowQRCodeStep1UI.this.finish();
          GMTrace.o(4732114436096L, 35257);
          return true;
        }
      });
      a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(4729698516992L, 35239);
          paramAnonymousMenuItem = ShowQRCodeStep1UI.this;
          String str1 = paramAnonymousMenuItem.getString(R.l.dXa);
          String str2 = paramAnonymousMenuItem.getString(R.l.dXe);
          ShowQRCodeStep1UI.4 local4 = new ShowQRCodeStep1UI.4(paramAnonymousMenuItem);
          h.a(paramAnonymousMenuItem, "", new String[] { str1, str2 }, "", false, local4);
          GMTrace.o(4729698516992L, 35239);
          return true;
        }
      });
      ((Button)findViewById(R.h.cbW)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4729430081536L, 35237);
          if (ShowQRCodeStep1UI.a(ShowQRCodeStep1UI.this) == 3)
          {
            paramAnonymousView = at.wR();
            Object localObject = q.zE();
            at.AR();
            int i = bg.e((Integer)c.xh().get(66561, null));
            w.d("MicroMsg.ShowQRCodeStep1UI", "sessionKey[%s], userName[%s], style[%d]", new Object[] { bg.SJ(bg.bs(paramAnonymousView)), localObject, Integer.valueOf(i) });
            paramAnonymousView = "http://weixin.qq.com/cgi-bin/rweibourl?sid=" + g.n(paramAnonymousView) + "&u=" + (String)localObject + "&qr=" + i + "&device=" + com.tencent.mm.protocal.d.DEVICE_TYPE + "&version=" + com.tencent.mm.protocal.d.tJC;
            w.d("MicroMsg.ShowQRCodeStep1UI", "[%s]", new Object[] { paramAnonymousView });
            localObject = new Intent();
            ((Intent)localObject).putExtra("rawUrl", paramAnonymousView);
            ((Intent)localObject).putExtra("title", ShowQRCodeStep1UI.this.getString(R.l.dXn));
            com.tencent.mm.bj.d.b(ShowQRCodeStep1UI.this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            ShowQRCodeStep1UI.this.finish();
            GMTrace.o(4729430081536L, 35237);
            return;
          }
          if (ShowQRCodeStep1UI.a(ShowQRCodeStep1UI.this) == 4)
          {
            if (q.Af())
            {
              paramAnonymousView = new Intent(ShowQRCodeStep1UI.this, ShareToQQUI.class);
              paramAnonymousView.putExtra("show_to", 4);
              ShowQRCodeStep1UI.this.startActivity(paramAnonymousView);
            }
            for (;;)
            {
              ShowQRCodeStep1UI.this.finish();
              GMTrace.o(4729430081536L, 35237);
              return;
              ShowQRCodeStep1UI.a(ShowQRCodeStep1UI.this, FacebookAuthUI.class);
            }
          }
          if (ShowQRCodeStep1UI.a(ShowQRCodeStep1UI.this) == 2)
          {
            paramAnonymousView = new Intent(ShowQRCodeStep1UI.this, ShareToQQUI.class);
            paramAnonymousView.putExtra("show_to", 2);
            ShowQRCodeStep1UI.this.startActivity(paramAnonymousView);
            ShowQRCodeStep1UI.this.finish();
            GMTrace.o(4729430081536L, 35237);
            return;
          }
          paramAnonymousView = new Intent(ShowQRCodeStep1UI.this, ShareToQQUI.class);
          paramAnonymousView.putExtra("show_to", 1);
          ShowQRCodeStep1UI.this.startActivity(paramAnonymousView);
          ShowQRCodeStep1UI.this.finish();
          GMTrace.o(4729430081536L, 35237);
        }
      });
      GMTrace.o(4727282597888L, 35221);
      return;
      if (this.oGr == 4) {
        localTextView.setText(getString(R.l.dXf, new Object[] { getString(R.l.dXg) }));
      } else if (this.oGr == 2) {
        localTextView.setText(getString(R.l.dXf, new Object[] { getString(R.l.dXi) }));
      } else {
        localTextView.setText(getString(R.l.dXf, new Object[] { getString(R.l.dXh) }));
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(4727551033344L, 35223);
    w.i("MicroMsg.ShowQRCodeStep1UI", "onSceneEnd: errType = %d errCode = %d errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if (com.tencent.mm.plugin.setting.a.hnI.b(this.vKB.vKW, paramInt1, paramInt2, paramString))
    {
      GMTrace.o(4727551033344L, 35223);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Toast.makeText(this, getString(R.l.dxf, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(4727551033344L, 35223);
      return;
    }
    this.oGx = ((com.tencent.mm.ax.a)paramk).gQw;
    this.oGw.setImageBitmap(com.tencent.mm.sdk.platformtools.d.bg(this.oGx));
    GMTrace.o(4727551033344L, 35223);
  }
  
  final void beg()
  {
    GMTrace.i(4727416815616L, 35222);
    final com.tencent.mm.ax.a locala = new com.tencent.mm.ax.a();
    at.wS().a(locala, 0);
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    getString(R.l.cUG);
    this.htG = h.a(localActionBarActivity, getString(R.l.dXd), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(4735067226112L, 35279);
        at.wS().c(locala);
        GMTrace.o(4735067226112L, 35279);
      }
    });
    GMTrace.o(4727416815616L, 35222);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4726879944704L, 35218);
    int i = R.i.cGE;
    GMTrace.o(4726879944704L, 35218);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4727014162432L, 35219);
    super.onCreate(paramBundle);
    MP();
    at.wS().a(168, this);
    GMTrace.o(4727014162432L, 35219);
  }
  
  public void onDestroy()
  {
    GMTrace.i(4727148380160L, 35220);
    at.wS().b(168, this);
    super.onDestroy();
    GMTrace.o(4727148380160L, 35220);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\qrcode\ShowQRCodeStep1UI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */