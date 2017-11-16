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
import com.tencent.mm.g.a.i;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;

public class WebViewDownloadUI
  extends MMActivity
{
  private TextView jZU;
  private int kfs;
  private long lTL;
  private Context mContext;
  private boolean rJm;
  private Button rJs;
  private TextView rJt;
  private a rJu;
  private String rJv;
  private TextView rJw;
  private com.tencent.mm.plugin.downloader.model.n rJx;
  
  public WebViewDownloadUI()
  {
    GMTrace.i(14404380786688L, 107321);
    this.rJx = new com.tencent.mm.plugin.downloader.model.n()
    {
      public final void bs(long paramAnonymousLong)
      {
        GMTrace.i(14347472470016L, 106897);
        GMTrace.o(14347472470016L, 106897);
      }
      
      public final void c(long paramAnonymousLong, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(14347069816832L, 106894);
        w.i("MicroMsg.WebViewDownloadUI", "onTaskFailed id=%d, errCode=%d, hasChangeUrl=%b", new Object[] { Long.valueOf(paramAnonymousLong), Integer.valueOf(paramAnonymousInt), Boolean.valueOf(paramAnonymousBoolean) });
        Toast.makeText(WebViewDownloadUI.this.vKB.vKW, WebViewDownloadUI.this.getString(R.l.ejN), 1).show();
        WebViewDownloadUI.this.finish();
        GMTrace.o(14347069816832L, 106894);
      }
      
      public final void c(long paramAnonymousLong, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(14346935599104L, 106893);
        w.i("MicroMsg.WebViewDownloadUI", "onTaskFinished id=%d, savedFilePath=%s, hasChangeUrl=%b", new Object[] { Long.valueOf(paramAnonymousLong), paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
        Toast.makeText(WebViewDownloadUI.this.vKB.vKW, WebViewDownloadUI.this.getString(R.l.ejQ), 1).show();
        WebViewDownloadUI.this.finish();
        GMTrace.o(14346935599104L, 106893);
      }
      
      public final void k(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(14347606687744L, 106898);
        w.i("MicroMsg.WebViewDownloadUI", "onTaskResumed id=%d, savedFilePath=%s", new Object[] { Long.valueOf(paramAnonymousLong), paramAnonymousString });
        GMTrace.o(14347606687744L, 106898);
      }
      
      public final void onTaskPaused(long paramAnonymousLong)
      {
        GMTrace.i(14347338252288L, 106896);
        w.i("MicroMsg.WebViewDownloadUI", "onTaskPaused id=%d", new Object[] { Long.valueOf(paramAnonymousLong) });
        GMTrace.o(14347338252288L, 106896);
      }
      
      public final void onTaskRemoved(long paramAnonymousLong)
      {
        GMTrace.i(14347204034560L, 106895);
        w.i("MicroMsg.WebViewDownloadUI", "onTaskRemoved id=%d", new Object[] { Long.valueOf(paramAnonymousLong) });
        WebViewDownloadUI.this.finish();
        GMTrace.o(14347204034560L, 106895);
      }
      
      public final void onTaskStarted(long paramAnonymousLong, String paramAnonymousString)
      {
        GMTrace.i(14346801381376L, 106892);
        w.i("MicroMsg.WebViewDownloadUI", "onTaskStarted id=%d, savedFilePath=%s", new Object[] { Long.valueOf(paramAnonymousLong), paramAnonymousString });
        GMTrace.o(14346801381376L, 106892);
      }
    };
    GMTrace.o(14404380786688L, 107321);
  }
  
  private void a(a parama)
  {
    GMTrace.i(14404917657600L, 107325);
    w.i("MicroMsg.WebViewDownloadUI", "setDownloadState old=%s new=%s", new Object[] { this.rJu, parama });
    this.rJu = parama;
    switch (5.rJC[this.rJu.ordinal()])
    {
    default: 
      GMTrace.o(14404917657600L, 107325);
      return;
    case 1: 
      this.rJs.setVisibility(0);
      this.jZU.setVisibility(8);
      this.rJt.setVisibility(8);
    }
    do
    {
      this.rJw.setVisibility(8);
      break;
      this.rJs.setVisibility(8);
      this.rJt.setVisibility(0);
      this.jZU.setVisibility(0);
    } while (bg.nm(this.rJv));
    this.rJw.setVisibility(0);
    GMTrace.o(14404917657600L, 107325);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(14404783439872L, 107324);
    int i = R.i.cHT;
    GMTrace.o(14404783439872L, 107324);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(14404515004416L, 107322);
    super.onCreate(paramBundle);
    this.mContext = this;
    sq(getString(R.l.ejS));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(14403709698048L, 107316);
        WebViewDownloadUI.this.finish();
        GMTrace.o(14403709698048L, 107316);
        return true;
      }
    });
    overridePendingTransition(MMFragmentActivity.a.vMx, MMFragmentActivity.a.vMy);
    this.rJs = ((Button)findViewById(R.h.buZ));
    this.rJt = ((TextView)findViewById(R.h.buP));
    TextView localTextView = (TextView)findViewById(R.h.bvk);
    this.rJw = ((TextView)findViewById(R.h.bvf));
    ImageView localImageView = (ImageView)findViewById(R.h.bvi);
    this.jZU = ((TextView)findViewById(R.h.bvj));
    a(a.rJD);
    final String str1 = getIntent().getStringExtra("task_name");
    final String str2 = getIntent().getStringExtra("task_url");
    final String str3 = getIntent().getStringExtra("alternative_url");
    long l = getIntent().getLongExtra("task_size", 0L);
    final String str4 = getIntent().getStringExtra("file_md5");
    final String str5 = getIntent().getStringExtra("extInfo");
    paramBundle = getIntent().getStringExtra("fileType");
    final String str6 = getIntent().getStringExtra("appid");
    final String str7 = getIntent().getStringExtra("package_name");
    String str8 = getIntent().getStringExtra("thumb_url");
    Object localObject = getIntent().getStringExtra("title");
    final String str9 = getIntent().getStringExtra("page_url");
    w.i("MicroMsg.WebViewDownloadUI", "onCreate: md5=%s, url=%s, extInfo=%s, fileType=%s, appId=%s, packageName=%s, taskSize=%d, thumbUrl=%s", new Object[] { str4, str2, str5, paramBundle, str6, str7, Long.valueOf(l), str8 });
    g.ork.i(14217, new Object[] { str6, Integer.valueOf(1), str9, str2, Integer.valueOf(0) });
    this.kfs = bg.getInt(paramBundle, 1);
    paramBundle = (Bundle)localObject;
    if (bg.nm((String)localObject)) {
      paramBundle = bg.nl(str1);
    }
    if (!bg.nm(paramBundle))
    {
      localTextView.setText(paramBundle);
      localTextView.setVisibility(0);
    }
    if (l > 0L)
    {
      this.rJv = bg.eL(l);
      this.rJw.setText(this.rJv);
      this.rJs.setText(getString(R.l.ejK, new Object[] { this.rJv }));
    }
    paramBundle = com.tencent.mm.ao.n.Jd();
    localObject = new c.a();
    ((c.a)localObject).gKR = R.k.cPH;
    ((c.a)localObject).gKC = true;
    paramBundle.a(str8, localImageView, ((c.a)localObject).Jn());
    this.rJs.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14363712815104L, 107018);
        w.i("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick state=%s", new Object[] { WebViewDownloadUI.a(WebViewDownloadUI.this) });
        switch (WebViewDownloadUI.5.rJC[WebViewDownloadUI.a(WebViewDownloadUI.this).ordinal()])
        {
        default: 
          w.e("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick unexpected download state");
          GMTrace.o(14363712815104L, 107018);
          return;
        }
        if (!am.isNetworkConnected(WebViewDownloadUI.b(WebViewDownloadUI.this)))
        {
          Toast.makeText(WebViewDownloadUI.b(WebViewDownloadUI.this), WebViewDownloadUI.this.getString(R.l.dzS), 0).show();
          w.i("MicroMsg.WebViewDownloadUI", "startDownload fail, network not ready");
          GMTrace.o(14363712815104L, 107018);
          return;
        }
        if (am.isWifi(WebViewDownloadUI.b(WebViewDownloadUI.this)))
        {
          WebViewDownloadUI.a(WebViewDownloadUI.this, str2, str4, str5, str6, str3, str9, str1, str7);
          GMTrace.o(14363712815104L, 107018);
          return;
        }
        h.a(WebViewDownloadUI.this, WebViewDownloadUI.this.getString(R.l.ejO), WebViewDownloadUI.this.getString(R.l.ejP), WebViewDownloadUI.this.getString(R.l.ejJ), WebViewDownloadUI.this.getString(R.l.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(18174154113024L, 135408);
            WebViewDownloadUI.a(WebViewDownloadUI.this, WebViewDownloadUI.2.this.val$url, WebViewDownloadUI.2.this.ifs, WebViewDownloadUI.2.this.lHp, WebViewDownloadUI.2.this.eud, WebViewDownloadUI.2.this.qzM, WebViewDownloadUI.2.this.rJz, WebViewDownloadUI.2.this.rJA, WebViewDownloadUI.2.this.lMs);
            paramAnonymous2DialogInterface.dismiss();
            GMTrace.o(18174154113024L, 135408);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(18099394838528L, 134851);
            paramAnonymous2DialogInterface.dismiss();
            GMTrace.o(18099394838528L, 134851);
          }
        }, R.e.aPp);
        GMTrace.o(14363712815104L, 107018);
      }
    });
    this.rJt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(14369215741952L, 107059);
        w.i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, downloadId = %d, state=%s", new Object[] { Long.valueOf(WebViewDownloadUI.c(WebViewDownloadUI.this)), WebViewDownloadUI.a(WebViewDownloadUI.this) });
        g.ork.i(14217, new Object[] { str6, Integer.valueOf(3), str9, str2, Integer.valueOf(0) });
        if (WebViewDownloadUI.c(WebViewDownloadUI.this) <= 0L) {
          w.e("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask fail, unexpected branch! ");
        }
        int i;
        do
        {
          Toast.makeText(WebViewDownloadUI.this.vKB.vKW, WebViewDownloadUI.this.getString(R.l.ejL), 1).show();
          GMTrace.o(14369215741952L, 107059);
          return;
          i = f.apJ().bf(WebViewDownloadUI.c(WebViewDownloadUI.this));
          w.i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, ret = %d", new Object[] { Integer.valueOf(i) });
        } while (i <= 0);
        Toast.makeText(WebViewDownloadUI.this.vKB.vKW, WebViewDownloadUI.this.getString(R.l.ejM), 1).show();
        WebViewDownloadUI.this.finish();
        GMTrace.o(14369215741952L, 107059);
      }
    });
    f.apJ();
    c.a(this.rJx);
    GMTrace.o(14404515004416L, 107322);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(14404649222144L, 107323);
    super.onDestroy();
    w.i("MicroMsg.WebViewDownloadUI", "onDestroy hasCallback=%b", new Object[] { Boolean.valueOf(this.rJm) });
    if (!this.rJm)
    {
      i locali = new i();
      locali.eAd.eAe = true;
      com.tencent.mm.sdk.b.a.vgX.m(locali);
      this.rJm = true;
    }
    f.apJ();
    c.b(this.rJx);
    GMTrace.o(14404649222144L, 107323);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(14368678871040L, 107055);
      rJD = new a("TO_DOWNLOAD", 0);
      rJE = new a("DOWNLOADING", 1);
      rJF = new a[] { rJD, rJE };
      GMTrace.o(14368678871040L, 107055);
    }
    
    private a()
    {
      GMTrace.i(14368544653312L, 107054);
      GMTrace.o(14368544653312L, 107054);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\WebViewDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */