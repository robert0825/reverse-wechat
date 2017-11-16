package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x;
import com.tencent.mm.plugin.webview.ui.tools.widget.a.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.b;
import com.tencent.mm.plugin.webview.ui.tools.widget.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;

public final class h
  extends a
{
  public h(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    super(paramContext, params, paramViewGroup);
    GMTrace.i(15277467107328L, 113826);
    GMTrace.o(15277467107328L, 113826);
  }
  
  protected final void bkI()
  {
    GMTrace.i(15277601325056L, 113827);
    WebView localWebView;
    Object localObject;
    String str1;
    if ((x)bkA() != null)
    {
      localWebView = (WebView)getView();
      localObject = (x)bkA();
      if ((TextUtils.isEmpty(((x)localObject).url)) || (TextUtils.isEmpty(((x)localObject).pyc))) {
        break label186;
      }
      String str2 = AdLandingPagesProxy.getInstance().getUin();
      str1 = ab.k(((x)localObject).url, new String[] { "uxinfo=" + ((x)localObject).pyc, "uin=" + str2 });
      if (((x)localObject).eCt != 1) {
        break label194;
      }
      localObject = AdLandingPagesProxy.getInstance().getAdVoteInfo(((x)localObject).url, ((x)localObject).pyc, str2);
      if (bg.nm((String)localObject)) {
        break label194;
      }
      str1 = str1 + "&" + (String)localObject;
    }
    label186:
    label194:
    for (;;)
    {
      localWebView.loadUrl(str1);
      GMTrace.o(15277601325056L, 113827);
      return;
      str1 = ((x)localObject).url;
    }
  }
  
  protected final View bkJ()
  {
    GMTrace.i(15277735542784L, 113828);
    MMWebView localMMWebView = c.a.rVm.cb(this.context);
    localMMWebView.getSettings().csb();
    localMMWebView.getSettings().csf();
    localMMWebView.getSettings().cse();
    localMMWebView.setWebViewClient(a.a.rVl.a(localMMWebView, new b()
    {
      public final boolean m(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(20835960094720L, 155240);
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(20835960094720L, 155240);
          return false;
          x localx = (x)h.this.bkA();
          paramAnonymousInt = paramAnonymousBundle.getInt("sns_landing_pages_ad_vote_index");
          AdLandingPagesProxy.getInstance().saveAdVoteInfo(localx.url, localx.pyc, localx.uin, paramAnonymousInt, 0);
        }
      }
    }));
    GMTrace.o(15277735542784L, 113828);
    return localMMWebView;
  }
  
  public final void bkl()
  {
    GMTrace.i(20835825876992L, 155239);
    super.bkl();
    WebView localWebView = (WebView)getView();
    if ((localWebView != null) && (localWebView.getParent() != null))
    {
      ((ViewGroup)localWebView.getParent()).removeView(localWebView);
      localWebView.setTag(null);
      localWebView.destroy();
    }
    this.hqF = null;
    GMTrace.o(20835825876992L, 155239);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */