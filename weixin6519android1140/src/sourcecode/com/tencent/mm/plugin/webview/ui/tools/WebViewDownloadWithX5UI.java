package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

@com.tencent.mm.ui.base.a(2)
public class WebViewDownloadWithX5UI
  extends MMActivity
{
  private Context mContext;
  private final com.tencent.mm.plugin.webview.modeltools.a rJG;
  private Button rJs;
  
  public WebViewDownloadWithX5UI()
  {
    GMTrace.i(16334700150784L, 121703);
    this.rJG = new com.tencent.mm.plugin.webview.modeltools.a();
    GMTrace.o(16334700150784L, 121703);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(16335102803968L, 121706);
    int i = R.i.cHT;
    GMTrace.o(16335102803968L, 121706);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(16335237021696L, 121707);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (com.tencent.mm.plugin.webview.modeltools.a.a(this, paramInt1, paramInt2, paramIntent))
    {
      if (-1 == paramInt2) {
        finish();
      }
      GMTrace.o(16335237021696L, 121707);
      return;
    }
    GMTrace.o(16335237021696L, 121707);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16334834368512L, 121704);
    super.onCreate(paramBundle);
    this.mContext = this;
    sq(getString(R.l.ejS));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16336847634432L, 121719);
        WebViewDownloadWithX5UI.this.finish();
        GMTrace.o(16336847634432L, 121719);
        return true;
      }
    });
    overridePendingTransition(MMFragmentActivity.a.vMx, MMFragmentActivity.a.vMy);
    this.rJs = ((Button)findViewById(R.h.buZ));
    paramBundle = (ImageView)findViewById(R.h.bvi);
    TextView localTextView = (TextView)findViewById(R.h.bvk);
    String str1 = getIntent().getStringExtra("task_url");
    String str2 = getIntent().getStringExtra("title");
    final long l = getIntent().getLongExtra("task_size", 0L);
    final String str3 = getIntent().getStringExtra("page_url");
    String str4 = getIntent().getStringExtra("thumb_url");
    w.i("MicroMsg.WebViewDownloadWithX5UI", "onCreate: url=%s,taskSize=%d, thumbUrl=%s", new Object[] { str1, Long.valueOf(l), str4 });
    Object localObject;
    if (l > 0L)
    {
      localObject = bg.eL(l);
      this.rJs.setText(getString(R.l.ejK, new Object[] { localObject }));
    }
    if (at.AU())
    {
      localObject = n.Jd();
      c.a locala = new c.a();
      locala.gKR = R.k.cPH;
      locala.gKC = true;
      ((com.tencent.mm.ao.a.a)localObject).a(str4, paramBundle, locala.Jn());
      localTextView.setVisibility(0);
      if (bg.nm(str2)) {
        break label361;
      }
      localTextView.setText(str2);
    }
    for (;;)
    {
      g.ork.i(14217, new Object[] { "", Integer.valueOf(1), str3, str1, Integer.valueOf(1) });
      this.rJs.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16336444981248L, 121716);
          if (!am.isNetworkConnected(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this)))
          {
            Toast.makeText(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this), WebViewDownloadWithX5UI.this.getString(R.l.dzS), 0).show();
            w.i("MicroMsg.WebViewDownloadWithX5UI", "startDownload fail, network not ready");
            GMTrace.o(16336444981248L, 121716);
            return;
          }
          at.AR();
          if (!c.isSDCardAvailable())
          {
            Toast.makeText(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this), WebViewDownloadWithX5UI.this.getString(R.l.dzU), 0).show();
            w.i("MicroMsg.WebViewDownloadWithX5UI", "startDownload fail, sdcard not ready");
            GMTrace.o(16336444981248L, 121716);
            return;
          }
          if ((l > 0L) && (!f.L(l)))
          {
            Toast.makeText(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this), WebViewDownloadWithX5UI.this.getString(R.l.dzT), 0).show();
            w.i("MicroMsg.WebViewDownloadWithX5UI", "startDownload fail, not enough space, require size = " + l);
            GMTrace.o(16336444981248L, 121716);
            return;
          }
          if (am.isWifi(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this)))
          {
            WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this, str3, this.rJz);
            GMTrace.o(16336444981248L, 121716);
            return;
          }
          h.a(WebViewDownloadWithX5UI.this, WebViewDownloadWithX5UI.this.getString(R.l.ejO), WebViewDownloadWithX5UI.this.getString(R.l.ejP), WebViewDownloadWithX5UI.this.getString(R.l.ejJ), WebViewDownloadWithX5UI.this.getString(R.l.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(18102750281728L, 134876);
              WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this, WebViewDownloadWithX5UI.2.this.val$url, WebViewDownloadWithX5UI.2.this.rJz);
              paramAnonymous2DialogInterface.dismiss();
              GMTrace.o(18102750281728L, 134876);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(18160195469312L, 135304);
              paramAnonymous2DialogInterface.dismiss();
              GMTrace.o(18160195469312L, 135304);
            }
          }, R.e.aPp);
          GMTrace.o(16336444981248L, 121716);
        }
      });
      GMTrace.o(16334834368512L, 121704);
      return;
      paramBundle.setImageResource(R.k.cPH);
      break;
      label361:
      localTextView.setText(getString(R.l.ejR));
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(16334968586240L, 121705);
    super.onDestroy();
    GMTrace.o(16334968586240L, 121705);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\WebViewDownloadWithX5UI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */