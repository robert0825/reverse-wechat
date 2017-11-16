package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.webview.a.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.n;

public class ContactQZoneWebView
  extends WebViewUI
{
  private String nIk;
  private boolean rIh;
  private String rIi;
  
  public ContactQZoneWebView()
  {
    GMTrace.i(12266292379648L, 91391);
    this.rIh = false;
    this.rIi = "";
    this.nIk = "";
    GMTrace.o(12266292379648L, 91391);
  }
  
  final void LU(String paramString)
  {
    GMTrace.i(12266695032832L, 91394);
    if (this.rIh)
    {
      GMTrace.o(12266695032832L, 91394);
      return;
    }
    this.rIh = true;
    Object localObject = paramString.substring(19);
    w.d("MicroMsg.ContactQZoneWebView", "get url :" + (String)localObject);
    paramString = new Intent();
    paramString.putExtra("nowUrl", (String)localObject);
    paramString.putExtra("tweetid", bg.nl(getIntent().getStringExtra("tweetid")));
    paramString.putExtra("htmlData", this.rIi);
    paramString.putExtra("type", getIntent().getIntExtra("type", 0));
    localObject = new Bundle();
    ((Bundle)localObject).putInt("stat_scene", 4);
    ((Bundle)localObject).putString("stat_url", aEr());
    paramString.putExtra("_stat_obj", (Bundle)localObject);
    startActivity(paramString);
    a.hnH.t(paramString, this);
    GMTrace.o(12266695032832L, 91394);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(12266426597376L, 91392);
    super.onCreate(paramBundle);
    sq(getString(R.l.dkj));
    this.nXD.setWebViewClient(new n()
    {
      public final void b(WebView paramAnonymousWebView, String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(19394193260544L, 144498);
        if (paramAnonymousString.startsWith("weixin://viewimage/"))
        {
          ContactQZoneWebView.this.LU(paramAnonymousString);
          paramAnonymousWebView.stopLoading();
          GMTrace.o(19394193260544L, 144498);
          return;
        }
        if (paramAnonymousString.equals(ContactQZoneWebView.a(ContactQZoneWebView.this)))
        {
          bg.E(ContactQZoneWebView.this, paramAnonymousString);
          paramAnonymousWebView.stopLoading();
          GMTrace.o(19394193260544L, 144498);
          return;
        }
        super.b(paramAnonymousWebView, paramAnonymousString, paramAnonymousBitmap);
        GMTrace.o(19394193260544L, 144498);
      }
      
      public final boolean b(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        GMTrace.i(19394059042816L, 144497);
        if (paramAnonymousString.startsWith("weixin://viewimage/"))
        {
          ContactQZoneWebView.this.LU(paramAnonymousString);
          paramAnonymousWebView.stopLoading();
        }
        for (;;)
        {
          GMTrace.o(19394059042816L, 144497);
          return true;
          if ((paramAnonymousString.startsWith("weixinping://iframe")) || (paramAnonymousString.startsWith("weixinpreinject://iframe")))
          {
            GMTrace.o(19394059042816L, 144497);
            return true;
          }
          paramAnonymousWebView.loadUrl(paramAnonymousString);
        }
      }
    });
    this.nXD.loadUrl(this.eVw);
    w.d("MicroMsg.ContactQZoneWebView", "loadUrl:loadUrl, url = " + this.eVw);
    GMTrace.o(12266426597376L, 91392);
  }
  
  protected void onResume()
  {
    GMTrace.i(12266560815104L, 91393);
    super.onResume();
    this.rIh = false;
    GMTrace.o(12266560815104L, 91393);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\ContactQZoneWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */