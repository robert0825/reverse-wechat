package com.tencent.xweb.xwalk;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView.FindListener;
import android.widget.AbsoluteLayout;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.a.c;
import com.tencent.xweb.f;
import com.tencent.xweb.k;
import com.tencent.xweb.l;
import com.tencent.xweb.m;
import com.tencent.xweb.n;
import com.tencent.xweb.x5.a.a.a.a.b;
import com.tencent.xweb.xwalk.a.d;
import java.util.Map;
import org.xwalk.core.ClientCertRequest;
import org.xwalk.core.CustomViewCallback;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkGeolocationPermissionsCallback;
import org.xwalk.core.XWalkHitTestResult;
import org.xwalk.core.XWalkHitTestResult.type;
import org.xwalk.core.XWalkHttpAuthHandler;
import org.xwalk.core.XWalkJavascriptResult;
import org.xwalk.core.XWalkLibraryLoader;
import org.xwalk.core.XWalkLogMessageListener;
import org.xwalk.core.XWalkNavigationHistory;
import org.xwalk.core.XWalkNavigationHistory.Direction;
import org.xwalk.core.XWalkNavigationItem;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkSettings;
import org.xwalk.core.XWalkUIClient.ConsoleMessageType;
import org.xwalk.core.XWalkUIClient.InitiateBy;
import org.xwalk.core.XWalkUIClient.JavascriptMessageType;
import org.xwalk.core.XWalkUIClient.LoadStatus;
import org.xwalk.core.XWalkView;
import org.xwalk.core.XWalkView.OverScrolledListener;
import org.xwalk.core.XWalkView.ScrollChangedListener;
import org.xwalk.core.XWalkWebResourceRequest;
import org.xwalk.core.XWalkWebResourceResponse;
import org.xwalk.core.resource.XWalkContextWrapper;

public final class g
  implements com.tencent.xweb.a.e
{
  n hUm = new n();
  m iob;
  com.tencent.xweb.h iwr = new com.tencent.xweb.h();
  int mApkVersion = XWalkEnvironment.getAvailableVersion();
  WebView yob;
  long yog = 0L;
  h ypB;
  AbsoluteLayout ypC;
  e ypD;
  boolean ypE = false;
  public boolean ypF = false;
  i yps;
  j ypt;
  XWalkView ypu;
  
  public g(WebView paramWebView)
  {
    XWalkContextWrapper localXWalkContextWrapper = new XWalkContextWrapper(paramWebView.getContext(), this.mApkVersion);
    XWalkLibraryLoader.prepareToInit(localXWalkContextWrapper);
    try
    {
      XWalkPreferences.setValue("xweb-version", String.valueOf(this.mApkVersion));
      XWalkPreferences.setValue("xwebsdk-version", "10");
      this.ypu = new a(localXWalkContextWrapper);
      this.ypC = new AbsoluteLayout(localXWalkContextWrapper);
      this.ypu.getXWalkContentView().addView(this.ypC);
      this.ypu.setCustomOnScrollChangedListener(new XWalkView.ScrollChangedListener()
      {
        public final void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
        {
          g.this.ypC.scrollTo(paramAnonymousInt1, paramAnonymousInt2);
          if (g.this.iob != null) {
            g.this.iob.onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4, g.this.ypu);
          }
        }
      });
      this.ypu.setCustomOnOverScrolledListener(new XWalkView.OverScrolledListener()
      {
        public final void onOverScrolled(boolean paramAnonymousBoolean)
        {
          if (paramAnonymousBoolean)
          {
            g.this.ypF = true;
            return;
          }
          g.this.ypF = false;
        }
      });
      this.ypD = new e(this.ypu);
      this.yob = paramWebView;
      this.ypB = new h(this.ypu);
      this.ypu.getSettings().SetLogCallBack(new XWalkLogMessageListener()
      {
        public final void onLogMessage(int paramAnonymousInt1, String paramAnonymousString1, int paramAnonymousInt2, String paramAnonymousString2)
        {
          Log.i("WCWebview", "[WCWebview] severity:" + paramAnonymousInt1 + ", file:" + paramAnonymousString1 + ", line:" + paramAnonymousInt2 + ", info:" + paramAnonymousString2);
        }
      });
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("XWWebView", localException.getMessage());
      }
    }
  }
  
  private void csy()
  {
    if (this.yps != null) {
      return;
    }
    this.yps = new i(this.ypu)
    {
      String ypG = null;
      
      public final View getVideoLoadingProgressView()
      {
        Log.i("XWWebView", "getVideoLoadingProgressView");
        return g.this.iwr.getVideoLoadingProgressView();
      }
      
      public final boolean onConsoleMessage(XWalkView paramAnonymousXWalkView, String paramAnonymousString1, int paramAnonymousInt, String paramAnonymousString2, XWalkUIClient.ConsoleMessageType paramAnonymousConsoleMessageType)
      {
        Log.i("XWWebView", "onConsoleMessage " + paramAnonymousString1);
        com.tencent.xweb.h localh = g.this.iwr;
        paramAnonymousXWalkView = ConsoleMessage.MessageLevel.DEBUG;
        switch (d.1.ypn[paramAnonymousConsoleMessageType.ordinal()])
        {
        }
        for (;;)
        {
          return localh.onConsoleMessage(new ConsoleMessage(paramAnonymousString1, paramAnonymousString2, paramAnonymousInt, paramAnonymousXWalkView));
          paramAnonymousXWalkView = ConsoleMessage.MessageLevel.DEBUG;
          continue;
          paramAnonymousXWalkView = ConsoleMessage.MessageLevel.ERROR;
          continue;
          paramAnonymousXWalkView = ConsoleMessage.MessageLevel.LOG;
          continue;
          paramAnonymousXWalkView = ConsoleMessage.MessageLevel.TIP;
          continue;
          paramAnonymousXWalkView = ConsoleMessage.MessageLevel.WARNING;
        }
      }
      
      public final boolean onCreateWindowRequested(XWalkView paramAnonymousXWalkView, XWalkUIClient.InitiateBy paramAnonymousInitiateBy, ValueCallback<XWalkView> paramAnonymousValueCallback)
      {
        return super.onCreateWindowRequested(paramAnonymousXWalkView, paramAnonymousInitiateBy, paramAnonymousValueCallback);
      }
      
      public final void onFullscreenToggled(XWalkView paramAnonymousXWalkView, boolean paramAnonymousBoolean)
      {
        super.onFullscreenToggled(paramAnonymousXWalkView, paramAnonymousBoolean);
      }
      
      public final void onGeolocationPermissionsHidePrompt() {}
      
      public final void onGeolocationPermissionsShowPrompt(String paramAnonymousString, XWalkGeolocationPermissionsCallback paramAnonymousXWalkGeolocationPermissionsCallback)
      {
        g.this.iwr.onGeolocationPermissionsShowPrompt(paramAnonymousString, new d.b(paramAnonymousXWalkGeolocationPermissionsCallback));
      }
      
      public final void onHideCustomView()
      {
        Log.i("XWWebView", "onHideCustomView");
        g.this.ypC.setVisibility(0);
        g.this.iwr.onHideCustomView();
      }
      
      public final void onIconAvailable(XWalkView paramAnonymousXWalkView, String paramAnonymousString, Message paramAnonymousMessage)
      {
        super.onIconAvailable(paramAnonymousXWalkView, paramAnonymousString, paramAnonymousMessage);
      }
      
      public final void onJavascriptCloseWindow(XWalkView paramAnonymousXWalkView)
      {
        super.onJavascriptCloseWindow(paramAnonymousXWalkView);
      }
      
      public final boolean onJavascriptModalDialog(XWalkView paramAnonymousXWalkView, XWalkUIClient.JavascriptMessageType paramAnonymousJavascriptMessageType, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, XWalkJavascriptResult paramAnonymousXWalkJavascriptResult)
      {
        return super.onJavascriptModalDialog(paramAnonymousXWalkView, paramAnonymousJavascriptMessageType, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, paramAnonymousXWalkJavascriptResult);
      }
      
      public final boolean onJsAlert(XWalkView paramAnonymousXWalkView, String paramAnonymousString1, String paramAnonymousString2, XWalkJavascriptResult paramAnonymousXWalkJavascriptResult)
      {
        Log.i("XWWebView", "onJsAlert");
        return g.this.iwr.a(g.this.yob, paramAnonymousString1, paramAnonymousString2, new d.c(paramAnonymousXWalkJavascriptResult));
      }
      
      public final boolean onJsConfirm(XWalkView paramAnonymousXWalkView, String paramAnonymousString1, String paramAnonymousString2, XWalkJavascriptResult paramAnonymousXWalkJavascriptResult)
      {
        Log.i("XWWebView", "onJsConfirm");
        return g.this.iwr.b(g.this.yob, paramAnonymousString1, paramAnonymousString2, new d.c(paramAnonymousXWalkJavascriptResult));
      }
      
      public final boolean onJsPrompt(XWalkView paramAnonymousXWalkView, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, XWalkJavascriptResult paramAnonymousXWalkJavascriptResult)
      {
        Log.i("XWWebView", "onJsPrompt");
        return g.this.iwr.a(g.this.yob, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, new d.d(paramAnonymousXWalkJavascriptResult));
      }
      
      public final void onPageLoadStarted(XWalkView paramAnonymousXWalkView, String paramAnonymousString)
      {
        Log.i("XWWebView", "onPageLoadStarted: url = " + paramAnonymousString);
        g.this.hUm.b(g.this.yob, paramAnonymousString, g.this.ypu.getFavicon());
        this.ypG = null;
        g.this.yog = System.currentTimeMillis();
        com.tencent.xweb.util.e.csl();
      }
      
      public final void onPageLoadStopped(XWalkView paramAnonymousXWalkView, String paramAnonymousString, XWalkUIClient.LoadStatus paramAnonymousLoadStatus)
      {
        if ((this.ypG != null) && (this.ypG.equals(paramAnonymousString)))
        {
          Log.i("XWWebView", "abandoned onPageFinished: url = " + paramAnonymousString + " status = " + paramAnonymousLoadStatus);
          return;
        }
        this.ypG = paramAnonymousString;
        Log.i("XWWebView", "onPageFinished: url = " + paramAnonymousString + " status = " + paramAnonymousLoadStatus);
        g.this.hUm.a(g.this.yob, paramAnonymousString);
        paramAnonymousXWalkView = XWalkUIClient.LoadStatus.FAILED;
        com.tencent.xweb.util.e.fz(System.currentTimeMillis() - g.this.yog);
      }
      
      public final void onReceivedIcon(XWalkView paramAnonymousXWalkView, String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        super.onReceivedIcon(paramAnonymousXWalkView, paramAnonymousString, paramAnonymousBitmap);
      }
      
      public final void onReceivedTitle(XWalkView paramAnonymousXWalkView, String paramAnonymousString)
      {
        Log.i("XWWebView", "onReceivedTitle: " + paramAnonymousString);
        super.onReceivedTitle(paramAnonymousXWalkView, paramAnonymousString);
        g.this.iwr.c(null, paramAnonymousString);
      }
      
      public final void onRequestFocus(XWalkView paramAnonymousXWalkView)
      {
        super.onRequestFocus(paramAnonymousXWalkView);
      }
      
      public final void onScaleChanged(XWalkView paramAnonymousXWalkView, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        g.this.hUm.aZt();
      }
      
      public final void onShowCustomView(View paramAnonymousView, int paramAnonymousInt, CustomViewCallback paramAnonymousCustomViewCallback)
      {
        super.onShowCustomView(paramAnonymousView, paramAnonymousInt, paramAnonymousCustomViewCallback);
      }
      
      public final void onShowCustomView(View paramAnonymousView, CustomViewCallback paramAnonymousCustomViewCallback)
      {
        Log.i("XWWebView", "onShowCustomView");
        g.this.ypC.setVisibility(4);
        g.this.iwr.onShowCustomView(paramAnonymousView, new d.a(paramAnonymousCustomViewCallback));
      }
      
      public final void onUnhandledKeyEvent(XWalkView paramAnonymousXWalkView, KeyEvent paramAnonymousKeyEvent)
      {
        super.onUnhandledKeyEvent(paramAnonymousXWalkView, paramAnonymousKeyEvent);
      }
      
      public final void openFileChooser(XWalkView paramAnonymousXWalkView, ValueCallback<Uri> paramAnonymousValueCallback, String paramAnonymousString1, String paramAnonymousString2)
      {
        Log.i("XWWebView", "openFileChooser with three param");
        g.this.iwr.openFileChooser(paramAnonymousValueCallback, paramAnonymousString1, paramAnonymousString2);
      }
      
      public final boolean shouldOverrideKeyEvent(XWalkView paramAnonymousXWalkView, KeyEvent paramAnonymousKeyEvent)
      {
        return super.shouldOverrideKeyEvent(paramAnonymousXWalkView, paramAnonymousKeyEvent);
      }
    };
    this.ypD.yps = this.yps;
    this.ypu.setUIClient(this.yps);
    this.ypt = new j(this.ypu)
    {
      public final void doUpdateVisitedHistory(XWalkView paramAnonymousXWalkView, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        if ((paramAnonymousString != null) && (paramAnonymousString.startsWith("data:text/html;charset=utf-8"))) {
          return;
        }
        g.this.hUm.a(g.this.yob, paramAnonymousString, paramAnonymousBoolean);
      }
      
      public final void onDocumentLoadedInFrame(XWalkView paramAnonymousXWalkView, long paramAnonymousLong)
      {
        super.onDocumentLoadedInFrame(paramAnonymousXWalkView, paramAnonymousLong);
      }
      
      public final void onLoadFinished(XWalkView paramAnonymousXWalkView, String paramAnonymousString)
      {
        super.onLoadFinished(paramAnonymousXWalkView, paramAnonymousString);
      }
      
      public final void onLoadStarted(XWalkView paramAnonymousXWalkView, String paramAnonymousString)
      {
        g.this.hUm.f(g.this.yob, paramAnonymousString);
      }
      
      public final void onProgressChanged(XWalkView paramAnonymousXWalkView, int paramAnonymousInt)
      {
        Log.i("XWWebView", "onProgressChanged, progress = " + paramAnonymousInt);
        g.this.iwr.a(g.this.yob, paramAnonymousInt);
      }
      
      public final void onReceivedClientCertRequest(XWalkView paramAnonymousXWalkView, ClientCertRequest paramAnonymousClientCertRequest)
      {
        super.onReceivedClientCertRequest(paramAnonymousXWalkView, paramAnonymousClientCertRequest);
      }
      
      public final void onReceivedHttpAuthRequest(XWalkView paramAnonymousXWalkView, XWalkHttpAuthHandler paramAnonymousXWalkHttpAuthHandler, String paramAnonymousString1, String paramAnonymousString2)
      {
        super.onReceivedHttpAuthRequest(paramAnonymousXWalkView, paramAnonymousXWalkHttpAuthHandler, paramAnonymousString1, paramAnonymousString2);
      }
      
      public final void onReceivedLoadError(XWalkView paramAnonymousXWalkView, int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
      {
        Log.i("XWWebView", "onReceivedError " + paramAnonymousString2);
        super.onReceivedLoadError(paramAnonymousXWalkView, paramAnonymousInt, paramAnonymousString1, paramAnonymousString2);
        g.this.ypE = true;
        g.this.hUm.a(g.this.yob, paramAnonymousInt, paramAnonymousString1, paramAnonymousString2);
        paramAnonymousXWalkView = String.format("<html>\n<head>\n</head>\n<body>\n<p><b><font size=\"15\">\n\n\n网页无法打开</font></b></p>\n<p><font size=\"7\">位于<b>%s</b>的网页无法加载，因为:</font></p>\n<p><font size=\"7\">错误码:%s</font></p>\n\n</body>\n\n</html>", new Object[] { paramAnonymousString2, paramAnonymousString1 });
        g.this.ypu.loadDataWithBaseURL("file:///android_asset/", paramAnonymousXWalkView, "text/html", "utf-8", null);
        com.tencent.xweb.util.e.csm();
      }
      
      public final void onReceivedResponseHeaders(XWalkView paramAnonymousXWalkView, XWalkWebResourceRequest paramAnonymousXWalkWebResourceRequest, XWalkWebResourceResponse paramAnonymousXWalkWebResourceResponse)
      {
        if (paramAnonymousXWalkWebResourceResponse.getStatusCode() == 302)
        {
          localObject = (String)paramAnonymousXWalkWebResourceResponse.getResponseHeaders().get("Location");
          if ((localObject != null) && (((String)localObject).trim().startsWith("weixin://")))
          {
            g.this.hUm.b(g.this.yob, (String)localObject, null);
            g.this.ypu.postDelayed(new Runnable()
            {
              public final void run()
              {
                g.this.hUm.b(g.this.yob, localObject, null);
              }
            }, 300L);
          }
        }
        while (paramAnonymousXWalkWebResourceResponse.getStatusCode() < 400)
        {
          super.onReceivedResponseHeaders(paramAnonymousXWalkView, paramAnonymousXWalkWebResourceRequest, paramAnonymousXWalkWebResourceResponse);
          return;
        }
        Log.i("XWWebView", "onReceivedHttpError code:" + paramAnonymousXWalkWebResourceResponse.getStatusCode());
        n localn = g.this.hUm;
        d.h localh = new d.h(paramAnonymousXWalkWebResourceRequest);
        if (paramAnonymousXWalkWebResourceResponse == null) {}
        for (final Object localObject = null;; localObject = new k(paramAnonymousXWalkWebResourceResponse.getMimeType(), paramAnonymousXWalkWebResourceResponse.getEncoding(), paramAnonymousXWalkWebResourceResponse.getStatusCode(), paramAnonymousXWalkWebResourceResponse.getReasonPhrase(), paramAnonymousXWalkWebResourceResponse.getResponseHeaders(), paramAnonymousXWalkWebResourceResponse.getData()))
        {
          localn.a(localh, (k)localObject);
          break;
        }
      }
      
      public final void onReceivedSslError(XWalkView paramAnonymousXWalkView, ValueCallback<Boolean> paramAnonymousValueCallback, SslError paramAnonymousSslError)
      {
        Log.i("XWWebView", "onReceivedSslError " + paramAnonymousSslError.getPrimaryError());
        g.this.hUm.a(g.this.yob, new d.g(paramAnonymousValueCallback), paramAnonymousSslError);
      }
      
      public final WebResourceResponse shouldInterceptLoadRequest(XWalkView paramAnonymousXWalkView, String paramAnonymousString)
      {
        paramAnonymousXWalkView = g.this.hUm.e(g.this.yob, paramAnonymousString);
        if (paramAnonymousXWalkView == null) {
          return null;
        }
        if ((paramAnonymousXWalkView.mStatusCode != 0) && (Build.VERSION.SDK_INT >= 21)) {
          return new WebResourceResponse(paramAnonymousXWalkView.mMimeType, paramAnonymousXWalkView.mEncoding, paramAnonymousXWalkView.mStatusCode, paramAnonymousXWalkView.mReasonPhrase, paramAnonymousXWalkView.mResponseHeaders, paramAnonymousXWalkView.mInputStream);
        }
        return new WebResourceResponse(paramAnonymousXWalkView.mMimeType, paramAnonymousXWalkView.mEncoding, paramAnonymousXWalkView.mInputStream);
      }
      
      public final XWalkWebResourceResponse shouldInterceptLoadRequest(XWalkView paramAnonymousXWalkView, XWalkWebResourceRequest paramAnonymousXWalkWebResourceRequest)
      {
        paramAnonymousXWalkView = g.this.hUm.a(g.this.yob, new d.h(paramAnonymousXWalkWebResourceRequest));
        if (paramAnonymousXWalkView != null) {
          return createXWalkWebResourceResponse(paramAnonymousXWalkView.mMimeType, paramAnonymousXWalkView.mEncoding, paramAnonymousXWalkView.mInputStream, paramAnonymousXWalkView.mStatusCode, paramAnonymousXWalkView.mReasonPhrase, paramAnonymousXWalkView.mResponseHeaders);
        }
        return null;
      }
      
      public final boolean shouldOverrideUrlLoading(XWalkView paramAnonymousXWalkView, String paramAnonymousString)
      {
        boolean bool = g.this.hUm.b(g.this.yob, paramAnonymousString);
        Log.i("XWWebView", "shouldOverrideUrlLoading ret =  " + bool + " url = " + paramAnonymousString);
        return bool;
      }
    };
    this.ypD.ypt = this.ypt;
    this.ypu.setResourceClient(this.ypt);
  }
  
  public static boolean dI(Context paramContext)
  {
    try
    {
      d.ir(paramContext);
      boolean bool = d.isXWalkReady();
      return bool;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.ypu.addJavascriptInterface(paramObject, paramString);
  }
  
  public final boolean canGoBack()
  {
    return (!this.ypE) && (this.ypu.getNavigationHistory().canGoBack());
  }
  
  public final void clearMatches()
  {
    this.ypu.clearMatches();
  }
  
  public final void clearSslPreferences()
  {
    this.ypu.clearSslPreferences();
  }
  
  public final void clearView() {}
  
  public final void destroy()
  {
    this.ypu.onDestroy();
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    this.ypu.evaluateJavascript(paramString, paramValueCallback);
  }
  
  public final void findAllAsync(String paramString)
  {
    this.ypu.findAllAsync(paramString);
  }
  
  public final void findNext(boolean paramBoolean)
  {
    this.ypu.findNext(paramBoolean);
  }
  
  public final int getContentHeight()
  {
    return this.ypu.getContentHeight();
  }
  
  public final com.tencent.xweb.h getCurWebChromeClient()
  {
    return this.iwr;
  }
  
  public final n getCurWebviewClient()
  {
    return this.hUm;
  }
  
  public final c getDefalutOpProvider()
  {
    return this.ypD;
  }
  
  public final WebView.a getHitTestResult()
  {
    WebView.a locala = new WebView.a();
    XWalkHitTestResult localXWalkHitTestResult = this.ypu.getHitTestResult();
    locala.mType = localXWalkHitTestResult.getType().ordinal();
    locala.mExtra = localXWalkHitTestResult.getExtra();
    return locala;
  }
  
  public final float getScale()
  {
    return this.ypu.getScale();
  }
  
  public final l getSettings()
  {
    return this.ypB;
  }
  
  public final String getTitle()
  {
    return this.ypu.getTitle();
  }
  
  public final ViewGroup getTopView()
  {
    return this.ypC;
  }
  
  public final String getUrl()
  {
    return this.ypu.getUrl();
  }
  
  public final String getVersionInfo()
  {
    return "webviewType = WV_KIND_CW,V8 type=" + f.crV() + " ,apkversion = " + this.mApkVersion + " , " + XWalkEnvironment.getAvailableVersionDetail() + " sdk = 10";
  }
  
  public final View getView()
  {
    return this.ypu;
  }
  
  public final int getVisibleTitleHeight()
  {
    return 0;
  }
  
  public final int getWebScrollX()
  {
    View localView = getWebViewUI();
    if ((localView instanceof XWalkView)) {
      return ((XWalkView)localView).computeHorizontalScrollOffset();
    }
    return localView.getScrollX();
  }
  
  public final int getWebScrollY()
  {
    return this.ypu.computeVerticalScrollOffset();
  }
  
  public final View getWebViewUI()
  {
    return this.ypu;
  }
  
  public final Object getX5WebViewExtension()
  {
    return null;
  }
  
  public final void goBack()
  {
    if (this.ypu.getNavigationHistory().canGoBack())
    {
      this.ypu.getNavigationHistory().navigate(XWalkNavigationHistory.Direction.BACKWARD, 1);
      if ((this.ypu.getNavigationHistory() != null) && (this.ypu.getNavigationHistory().getCurrentItem() != null)) {
        this.iwr.c(this.yob, this.ypu.getNavigationHistory().getCurrentItem().getTitle());
      }
    }
  }
  
  public final boolean hasEnteredFullscreen()
  {
    return this.ypu.hasEnteredFullscreen();
  }
  
  public final boolean isOverScrollStart()
  {
    boolean bool = this.ypF;
    View localView = getWebViewUI();
    if ((localView instanceof XWalkView)) {}
    for (int i = ((XWalkView)localView).computeVerticalScrollOffset(); (i == 0) && (bool); i = localView.getScrollY()) {
      return true;
    }
    return false;
  }
  
  public final void leaveFullscreen()
  {
    this.ypu.leaveFullscreen();
  }
  
  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    this.ypu.loadData(paramString1, paramString2, paramString3);
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.ypu.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final void loadUrl(String paramString)
  {
    if ((paramString != null) && (paramString.trim().startsWith("javascript:")))
    {
      this.ypu.evaluateJavascript(paramString, null);
      return;
    }
    this.ypE = false;
    this.ypu.loadUrl(paramString);
  }
  
  public final void loadUrl(String paramString, Map<String, String> paramMap)
  {
    this.ypu.loadUrl(paramString, paramMap);
  }
  
  public final void onPause() {}
  
  public final void onResume() {}
  
  public final boolean overlayHorizontalScrollbar()
  {
    int i = this.ypu.getScrollBarStyle();
    return (i == 0) || (i == 33554432);
  }
  
  public final void reload()
  {
    this.ypu.reload(0);
  }
  
  public final void removeJavascriptInterface(String paramString)
  {
    this.ypu.removeJavascriptInterface(paramString);
  }
  
  public final void setDownloadListener(DownloadListener paramDownloadListener)
  {
    this.ypu.setDownloadListener(new d.e(this.yob.getContext(), paramDownloadListener));
  }
  
  public final void setFindListener(WebView.FindListener paramFindListener)
  {
    this.ypu.setFindListener(new d.f(paramFindListener));
  }
  
  public final void setWebChromeClient(com.tencent.xweb.h paramh)
  {
    if (paramh == null)
    {
      this.iwr = new com.tencent.xweb.h();
      return;
    }
    csy();
    this.iwr = paramh;
  }
  
  public final void setWebViewCallbackClient(m paramm)
  {
    this.iob = paramm;
  }
  
  public final void setWebViewClient(n paramn)
  {
    if (paramn == null)
    {
      this.hUm = new n();
      this.hUm.ynk = this.ypD;
      return;
    }
    csy();
    this.hUm = paramn;
  }
  
  public final void setWebViewClientExtension(b paramb) {}
  
  public final void stopLoading()
  {
    this.ypu.stopLoading();
  }
  
  public final void super_computeScroll() {}
  
  public final boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public final void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public final boolean super_onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    return false;
  }
  
  public final boolean zoomIn()
  {
    return this.ypu.zoomIn();
  }
  
  public final boolean zoomOut()
  {
    return this.ypu.zoomOut();
  }
  
  final class a
    extends XWalkView
  {
    public a(Context paramContext)
    {
      super();
    }
    
    public final void onScrollChangedDelegate(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onScrollChangedDelegate(paramInt1, paramInt2, paramInt3, paramInt4);
      if (g.this.yob != null) {
        g.this.yob.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */