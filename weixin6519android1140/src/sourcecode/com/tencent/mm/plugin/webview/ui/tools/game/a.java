package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.f;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi.a;
import com.tencent.mm.plugin.webview.wepkg.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.qqvideo.proxy.api.FactoryProxyManager;
import com.tencent.qqvideo.proxy.api.IPlayManager;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import com.tencent.xweb.l;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
{
  public ViewGroup Ep;
  public MMWebView inX;
  public c lKa;
  public Context mContext;
  public com.tencent.mm.plugin.webview.ui.tools.widget.g rQA;
  public GameWebViewUI rQt;
  public d rQu;
  public com.tencent.mm.plugin.webview.stub.d rQv;
  public com.tencent.mm.plugin.webview.ui.tools.jsapi.d rQw;
  public com.tencent.mm.plugin.webview.wepkg.a rQx;
  public a rQy;
  public f rQz;
  
  public a(GameWebViewUI paramGameWebViewUI, ViewGroup paramViewGroup)
  {
    GMTrace.i(18091207557120L, 134790);
    this.lKa = new c()
    {
      protected final void B(Bundle paramAnonymousBundle)
      {
        GMTrace.i(19385737543680L, 144435);
        try
        {
          if ((a.this.rQv != null) && (paramAnonymousBundle != null)) {
            a.this.rQv.d(96, paramAnonymousBundle);
          }
          GMTrace.o(19385737543680L, 144435);
          return;
        }
        catch (RemoteException paramAnonymousBundle)
        {
          GMTrace.o(19385737543680L, 144435);
        }
      }
    };
    this.rQA = new com.tencent.mm.plugin.webview.ui.tools.widget.g()
    {
      public final void Q(Bundle paramAnonymousBundle)
      {
        GMTrace.i(19390972035072L, 144474);
        w.i("MicroMsg.GameFloatWebView", "closeWindow");
        try
        {
          a.this.Ep.removeView(a.this.inX);
          a.this.onDestroy();
          GMTrace.o(19390972035072L, 144474);
          return;
        }
        catch (Exception paramAnonymousBundle)
        {
          GMTrace.o(19390972035072L, 144474);
        }
      }
      
      public final Bundle d(final int paramAnonymousInt, final Bundle paramAnonymousBundle)
      {
        GMTrace.i(19391106252800L, 144475);
        w.i("MicroMsg.GameFloatWebView", "game float invokeAsResult, actionCode = " + paramAnonymousInt);
        final Bundle localBundle = new Bundle();
        switch (paramAnonymousInt)
        {
        default: 
          w.e("MicroMsg.GameFloatWebView", "undefine action code!!!");
        }
        for (;;)
        {
          GMTrace.o(19391106252800L, 144475);
          return localBundle;
          paramAnonymousBundle.setClassLoader(GameWebViewUI.class.getClassLoader());
          com.tencent.mm.bj.d.b(a.this.mContext, paramAnonymousBundle.getString("open_ui_with_webview_ui_plugin_name"), paramAnonymousBundle.getString("open_ui_with_webview_ui_plugin_entry"), new Intent().putExtras(paramAnonymousBundle.getBundle("open_ui_with_webview_ui_extras")).putExtra("KPublisherId", d.eTu));
          continue;
          localBundle.putString("KPublisherId", d.eTu);
          localBundle.putInt("getA8KeyScene", a.this.cm(d.rQU, d.eZk));
          continue;
          paramAnonymousInt = d.eZk;
          localBundle.putInt("geta8key_scene", paramAnonymousInt);
          w.i("MicroMsg.GameFloatWebView", "Key value: getA8KeyScene(%d)", new Object[] { Integer.valueOf(paramAnonymousInt) });
          continue;
          if (a.this.rQv.isSDCardAvailable())
          {
            long l = av.bQB();
            w.i("MicroMsg.GameFloatWebView", "availableSize = %d", new Object[] { Long.valueOf(l) });
            if (l < 524288000L)
            {
              w.e("MicroMsg.GameFloatWebView", "available size not enough");
              paramAnonymousInt = FactoryProxyManager.getPlayManager().init(a.this.mContext, null);
            }
          }
          boolean bool;
          for (;;)
          {
            localBundle.putInt("webview_video_proxy_init", paramAnonymousInt);
            break;
            paramAnonymousBundle = new File(com.tencent.mm.plugin.webview.a.rBd);
            bool = true;
            if (!paramAnonymousBundle.exists())
            {
              bool = paramAnonymousBundle.mkdirs();
              w.i("MicroMsg.GameFloatWebView", "create proxy cache path : %s, %b", new Object[] { paramAnonymousBundle.getAbsolutePath(), Boolean.valueOf(bool) });
            }
            if (bool)
            {
              paramAnonymousInt = FactoryProxyManager.getPlayManager().init(a.this.mContext, com.tencent.mm.plugin.webview.a.rBd);
              FactoryProxyManager.getPlayManager().setMaxStorageSize(200L);
            }
            else
            {
              paramAnonymousInt = FactoryProxyManager.getPlayManager().init(a.this.mContext, null);
              continue;
              w.i("MicroMsg.GameFloatWebView", "sdcard not available");
              paramAnonymousInt = FactoryProxyManager.getPlayManager().init(a.this.mContext, null);
            }
          }
          final Object localObject1 = paramAnonymousBundle.getString("webview_video_proxy_cdn_urls");
          Object localObject2 = paramAnonymousBundle.getString("webview_video_proxy_fileId");
          paramAnonymousInt = paramAnonymousBundle.getInt("webview_video_proxy_file_size");
          int i = paramAnonymousBundle.getInt("webview_video_proxy_file_duration");
          int j = paramAnonymousBundle.getInt("webview_video_proxy_file_type");
          int k = FactoryProxyManager.getPlayManager().startPlay((String)localObject1, j, (String)localObject2, paramAnonymousInt, i);
          paramAnonymousBundle = FactoryProxyManager.getPlayManager().buildPlayURLMp4(k);
          w.i("MicroMsg.GameFloatWebView", "cdnurls = %s, filedId = %s, fileSize = %d, fileDuration = %d, fileType = %d, playDataId = %d, localUrl = %s", new Object[] { localObject1, localObject2, Integer.valueOf(paramAnonymousInt), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousBundle });
          localBundle.putInt("webview_video_proxy_play_data_id", k);
          localBundle.putString("webview_video_proxy_local_url", paramAnonymousBundle);
          continue;
          paramAnonymousInt = paramAnonymousBundle.getInt("webview_video_proxy_play_data_id");
          w.i("MicroMsg.GameFloatWebView", "webview proxy stop play, play id = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          if (paramAnonymousInt > 0)
          {
            FactoryProxyManager.getPlayManager().stopPlay(paramAnonymousInt);
            continue;
            paramAnonymousInt = paramAnonymousBundle.getInt("webview_video_proxy_play_state");
            FactoryProxyManager.getPlayManager().setPlayerState(paramAnonymousInt);
            continue;
            paramAnonymousInt = paramAnonymousBundle.getInt("webview_video_proxy_net_state");
            FactoryProxyManager.getPlayManager().setNetWorkState(paramAnonymousInt);
            continue;
            paramAnonymousInt = paramAnonymousBundle.getInt("webview_video_proxy_play_data_id");
            i = paramAnonymousBundle.getInt("webview_video_proxy_play_remain_time");
            FactoryProxyManager.getPlayManager().setRemainTime(paramAnonymousInt, i);
            continue;
            paramAnonymousInt = paramAnonymousBundle.getInt("webview_video_proxy_play_data_id");
            i = paramAnonymousBundle.getInt("webview_video_proxy_preload_duration");
            w.i("MicroMsg.GameFloatWebView", "playid = %d, duration = %d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(i) });
            localBundle.putInt("webview_video_proxy_pre_load_result", FactoryProxyManager.getPlayManager().preLoad(paramAnonymousInt, i));
            continue;
            localObject1 = paramAnonymousBundle.getString("show_kb_placeholder");
            paramAnonymousInt = paramAnonymousBundle.getInt("show_kb_max_length");
            a.this.rQt.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19383992713216L, 144422);
                a.this.rQt.cl(localObject1, paramAnonymousInt);
                GMTrace.o(19383992713216L, 144422);
              }
            });
            continue;
            a.this.rQt.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19384663801856L, 144427);
                int i = a.this.rQt.bEc();
                localBundle.putInt("height", i);
                GMTrace.o(19384663801856L, 144427);
              }
            });
            continue;
            localObject1 = paramAnonymousBundle.getString("set_page_title_text");
            paramAnonymousInt = com.tencent.mm.plugin.webview.ui.tools.d.at(paramAnonymousBundle.getString("set_page_title_color"), a.this.rQt.getResources().getColor(R.e.aMC));
            a.this.rQt.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19388690333696L, 144457);
                if (localObject1 != null) {
                  a.this.rQt.sq(localObject1);
                }
                a.this.rQt.AV(paramAnonymousInt);
                GMTrace.o(19388690333696L, 144457);
              }
            });
            continue;
            bool = paramAnonymousBundle.getBoolean("clear_webview_cache_clear_cookie", false);
            w.i("MicroMsg.GameFloatWebView", "includeCookie = %b", new Object[] { Boolean.valueOf(bool) });
            paramAnonymousBundle = new Intent();
            paramAnonymousBundle.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
            paramAnonymousBundle.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
            paramAnonymousBundle.putExtra("tools_clean_webview_cache_ignore_cookie", bool);
            a.this.mContext.sendBroadcast(paramAnonymousBundle);
            continue;
            a.this.rQt.runOnUiThread(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19386005979136L, 144437);
                a.this.rQt.W(paramAnonymousBundle);
                GMTrace.o(19386005979136L, 144437);
              }
            });
            continue;
            paramAnonymousBundle = Zi();
            localObject1 = com.tencent.xweb.b.crS().getCookie(paramAnonymousBundle);
            w.i("MicroMsg.GameFloatWebView", "url = %s, cookie = %s", new Object[] { paramAnonymousBundle, localObject1 });
            localBundle.putString("cookie", (String)localObject1);
            continue;
            localObject1 = paramAnonymousBundle.getString("traceid");
            paramAnonymousBundle = paramAnonymousBundle.getString("username");
            com.tencent.mm.plugin.webview.ui.tools.g.rKp.el((String)localObject1, paramAnonymousBundle);
            continue;
            paramAnonymousBundle = a.this.rQt.bXt();
            localObject1 = Zi();
            localBundle.putString("webview_current_url", (String)localObject1);
            if (paramAnonymousBundle != null) {}
            for (paramAnonymousBundle = paramAnonymousBundle.toString();; paramAnonymousBundle = "")
            {
              localBundle.putString("webview_current_title", paramAnonymousBundle);
              localBundle.putString("webview_current_desc", (String)localObject1);
              break;
            }
            bool = paramAnonymousBundle.getBoolean("add_shortcut_status");
            if (a.this.rQw != null)
            {
              a.this.rQw.jD(bool);
              continue;
              bool = a.this.rQy.rVv;
              paramAnonymousBundle = a.this.rQy.lJI;
              localObject1 = a.this.rQy.rVw;
              if (bool)
              {
                localBundle.putString("result", "not_return");
              }
              else
              {
                localBundle.putString("full_url", bg.nl(paramAnonymousBundle));
                if ((localObject1 != null) && (((Map)localObject1).size() != 0))
                {
                  localBundle.putInt("set_cookie", 1);
                  com.tencent.xweb.c.io(ab.getContext());
                  localObject2 = com.tencent.xweb.b.crS();
                  Iterator localIterator = ((Map)localObject1).keySet().iterator();
                  while (localIterator.hasNext())
                  {
                    String str = (String)localIterator.next();
                    ((com.tencent.xweb.b)localObject2).setCookie(bg.nl(paramAnonymousBundle), str + "=" + (String)((Map)localObject1).get(str));
                  }
                  com.tencent.xweb.c.crU();
                  com.tencent.xweb.c.sync();
                  w.i("MicroMsg.GameFloatWebView", "cookies:%s", new Object[] { ((com.tencent.xweb.b)localObject2).getCookie(bg.nl(paramAnonymousBundle)) });
                }
                else
                {
                  localBundle.putInt("set_cookie", 0);
                  continue;
                  a.this.lKa.rQG.ab(paramAnonymousBundle);
                  w.i("MicroMsg.GameFloatWebView", "set game float page time data");
                }
              }
            }
          }
        }
      }
    };
    this.mContext = paramGameWebViewUI;
    this.rQt = paramGameWebViewUI;
    this.Ep = paramViewGroup;
    paramViewGroup = MMWebViewWithJsApi.a.dx(this.mContext);
    paramViewGroup.setBackgroundResource(17170445);
    paramViewGroup.setBackgroundColor(0);
    paramViewGroup.setVisibility(4);
    this.rQy = new a(paramViewGroup);
    paramViewGroup.setWebViewClient(this.rQy);
    if (paramViewGroup.isX5Kernel) {
      paramViewGroup.setWebViewClientExtension(new b());
    }
    paramViewGroup.getSettings().setJavaScriptEnabled(true);
    paramViewGroup.getSettings().cse();
    paramViewGroup.getSettings().setBuiltInZoomControls(false);
    paramViewGroup.getSettings().setUseWideViewPort(true);
    paramViewGroup.getSettings().setLoadWithOverviewMode(true);
    paramViewGroup.getSettings().crZ();
    paramViewGroup.getSettings().crY();
    paramViewGroup.getSettings().setGeolocationEnabled(true);
    paramViewGroup.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    paramViewGroup.getSettings().csg();
    paramViewGroup.getSettings().csc();
    paramViewGroup.getSettings().setAppCachePath(this.mContext.getDir("webviewcache", 0).getAbsolutePath());
    paramViewGroup.getSettings().csb();
    paramViewGroup.getSettings().csd();
    paramViewGroup.getSettings().setDatabasePath(com.tencent.mm.compatible.util.e.ghu + "databases/");
    com.tencent.xweb.b.crS().crT();
    com.tencent.xweb.b.crS().c(paramViewGroup);
    this.inX = paramViewGroup;
    this.rQu = new d(paramGameWebViewUI.getIntent());
    this.rQx = new com.tencent.mm.plugin.webview.wepkg.a(paramGameWebViewUI, this.inX, this.inX.hashCode());
    GMTrace.o(18091207557120L, 134790);
  }
  
  public final int cm(String paramString, int paramInt)
  {
    GMTrace.i(18091475992576L, 134792);
    int i = paramInt;
    if (paramInt == 0)
    {
      if ((paramString == null) || (paramString.length() <= 0)) {
        break label143;
      }
      if (this.rQv != null) {
        break label64;
      }
      i = 1;
    }
    for (;;)
    {
      w.i("MicroMsg.GameFloatWebView", "KGetA8KeyScene = %s", new Object[] { Integer.valueOf(i) });
      GMTrace.o(18091475992576L, 134792);
      return i;
      try
      {
        label64:
        if (this.rQv.gm(paramString))
        {
          i = 8;
          continue;
        }
        boolean bool = this.rQv.fD(paramString);
        if (bool)
        {
          i = 7;
          continue;
        }
        i = 1;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.GameFloatWebView", "getScene fail, ex = " + paramString.getMessage());
        i = 1;
      }
      continue;
      label143:
      i = 0;
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19391240470528L, 144476);
    this.lKa.rQG.onDestroy();
    GMTrace.o(19391240470528L, 144476);
  }
  
  private final class a
    extends b
  {
    public a(MMWebView paramMMWebView)
    {
      super();
      GMTrace.i(18087449460736L, 134762);
      GMTrace.o(18087449460736L, 134762);
    }
    
    protected final boolean Mg(String paramString)
    {
      GMTrace.i(18088254767104L, 134768);
      boolean bool = a.this.rQx.rWJ;
      GMTrace.o(18088254767104L, 134768);
      return bool;
    }
    
    protected final boolean Mp(String paramString)
    {
      GMTrace.i(18088523202560L, 134770);
      boolean bool = super.Mp(paramString);
      GMTrace.o(18088523202560L, 134770);
      return bool;
    }
    
    protected final void Mq(String paramString)
    {
      GMTrace.i(18088657420288L, 134771);
      try
      {
        w.i("MicroMsg.GameFloatWebView", "onURLFilteredOut url:%s", new Object[] { paramString });
        a.this.Ep.removeView(this.inX);
        GMTrace.o(18088657420288L, 134771);
        return;
      }
      catch (Exception paramString)
      {
        GMTrace.o(18088657420288L, 134771);
      }
    }
    
    protected final com.tencent.mm.plugin.webview.ui.tools.widget.g XZ()
    {
      GMTrace.i(18088925855744L, 134773);
      com.tencent.mm.plugin.webview.ui.tools.widget.g localg = a.this.rQA;
      GMTrace.o(18088925855744L, 134773);
      return localg;
    }
    
    public final k a(WebView paramWebView, j paramj)
    {
      GMTrace.i(19387885027328L, 144451);
      k localk = a.this.rQx.rWQ.a(paramWebView, paramj);
      if (localk != null)
      {
        GMTrace.o(19387885027328L, 144451);
        return localk;
      }
      paramWebView = super.a(paramWebView, paramj);
      GMTrace.o(19387885027328L, 144451);
      return paramWebView;
    }
    
    public final k a(WebView paramWebView, j paramj, Bundle paramBundle)
    {
      GMTrace.i(19388019245056L, 144452);
      k localk = a.this.rQx.rWQ.a(paramWebView, paramj, paramBundle);
      if (localk != null)
      {
        GMTrace.o(19388019245056L, 144452);
        return localk;
      }
      paramWebView = super.a(paramWebView, paramj, paramBundle);
      GMTrace.o(19388019245056L, 144452);
      return paramWebView;
    }
    
    protected final void a(com.tencent.mm.plugin.webview.stub.d paramd, com.tencent.mm.plugin.webview.ui.tools.e parame)
    {
      GMTrace.i(19387616591872L, 144449);
      a.this.rQv = paramd;
      GMTrace.o(19387616591872L, 144449);
    }
    
    protected final void a(com.tencent.mm.plugin.webview.ui.tools.jsapi.d paramd)
    {
      GMTrace.i(18087986331648L, 134766);
      w.i("MicroMsg.GameFloatWebView", "jsapi ready");
      a.this.rQw = paramd;
      GMTrace.o(18087986331648L, 134766);
    }
    
    protected final void a(f paramf)
    {
      GMTrace.i(18088120549376L, 134767);
      w.i("MicroMsg.GameFloatWebView", "jsloader ready");
      a.this.rQz = paramf;
      GMTrace.o(18088120549376L, 134767);
    }
    
    protected final void a(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19387348156416L, 144447);
      w.i("MicroMsg.GameFloatWebView", "onPageStarted opt, url = " + paramString);
      a.this.lKa.rQG.bFh();
      a.this.rQx.rWQ.b(paramWebView, paramString, paramBitmap);
      GMTrace.o(19387348156416L, 144447);
    }
    
    protected final void bFf()
    {
      GMTrace.i(18088791638016L, 134772);
      if (Build.VERSION.SDK_INT >= 11)
      {
        this.inX.removeJavascriptInterface("MicroMsg");
        this.inX.removeJavascriptInterface("JsApi");
      }
      try
      {
        this.inX.setWebChromeClient(null);
        this.inX.setWebViewClient(null);
        this.inX.setOnTouchListener(null);
        this.inX.setOnLongClickListener(null);
        this.inX.setVisibility(8);
        this.inX.removeAllViews();
        this.inX.clearView();
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          try
          {
            this.inX.destroy();
            GMTrace.o(18088791638016L, 134772);
            return;
          }
          catch (Exception localException2)
          {
            w.w("MicroMsg.GameFloatWebView", "onDestroy, viewWV destroy, ex = %s", new Object[] { localException2.getMessage() });
            GMTrace.o(18088791638016L, 134772);
          }
          localException1 = localException1;
          w.e("MicroMsg.GameFloatWebView", "onDestroy, set web infos to null,  ex = %s", new Object[] { localException1.getMessage() });
        }
      }
    }
    
    protected final void d(WebView paramWebView, String paramString)
    {
      GMTrace.i(19387482374144L, 144448);
      w.i("MicroMsg.GameFloatWebView", "onPageFinished opt, url = %s", new Object[] { paramString });
      this.inX.setVisibility(0);
      a.this.rQx.rWQ.a(paramWebView, paramString);
      a.this.rQx.onDestroy();
      a.this.lKa.rQG.bFi();
      GMTrace.o(19387482374144L, 144448);
    }
    
    public final k e(WebView paramWebView, String paramString)
    {
      GMTrace.i(19387750809600L, 144450);
      k localk = a.this.rQx.rWQ.e(paramWebView, paramString);
      if (localk != null)
      {
        GMTrace.o(19387750809600L, 144450);
        return localk;
      }
      paramWebView = super.e(paramWebView, paramString);
      GMTrace.o(19387750809600L, 144450);
      return paramWebView;
    }
    
    protected final void zz(String paramString)
    {
      GMTrace.i(18088388984832L, 134769);
      if (a.this.rQx.bGb())
      {
        this.inX.loadUrl(paramString);
        GMTrace.o(18088388984832L, 134769);
        return;
      }
      super.zz(paramString);
      GMTrace.o(18088388984832L, 134769);
    }
  }
  
  private final class b
    extends com.tencent.xweb.x5.a.a.a.a.b
  {
    public b()
    {
      GMTrace.i(18078322655232L, 134694);
      GMTrace.o(18078322655232L, 134694);
    }
    
    public final Object onMiscCallBack(String paramString, Bundle paramBundle)
    {
      GMTrace.i(18078456872960L, 134695);
      Object localObject = a.this.rQx.rWR.onMiscCallBack(paramString, paramBundle);
      if (localObject != null)
      {
        GMTrace.o(18078456872960L, 134695);
        return localObject;
      }
      paramString = super.onMiscCallBack(paramString, paramBundle);
      GMTrace.o(18078456872960L, 134695);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\game\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */