package com.tencent.xweb.x5;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebView.FindListener;
import com.jg.JgClassChecked;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.WebChromeClient.a;
import com.tencent.smtt.sdk.WebView.HitTestResult;
import com.tencent.smtt.sdk.x;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.l;
import com.tencent.xweb.m;
import com.tencent.xweb.n;
import com.tencent.xweb.x5.sdk.ProxyWebViewSuperWrapper;
import java.util.Map;
import org.xwalk.core.Log;

@JgClassChecked(author=30, fComment="checked", lastDate="20171020", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public final class i
  implements com.tencent.xweb.a.e
{
  com.tencent.smtt.sdk.WebView xTx;
  h yoM;
  j yoN;
  private b yoO = new b()
  {
    public final View getVideoLoadingProgressView()
    {
      if (i.this.yod != null) {
        return i.this.yod.getVideoLoadingProgressView();
      }
      return super.getVideoLoadingProgressView();
    }
    
    public final boolean onConsoleMessage(com.tencent.smtt.export.external.interfaces.ConsoleMessage paramAnonymousConsoleMessage)
    {
      Log.i("X5WebView", "onConsoleMessage " + paramAnonymousConsoleMessage.message());
      if (i.this.yod != null)
      {
        com.tencent.xweb.h localh = i.this.yod;
        if (paramAnonymousConsoleMessage == null)
        {
          paramAnonymousConsoleMessage = null;
          return localh.onConsoleMessage(paramAnonymousConsoleMessage);
        }
        ConsoleMessage.MessageLevel localMessageLevel = ConsoleMessage.MessageLevel.DEBUG;
        switch (g.1.yoy[paramAnonymousConsoleMessage.messageLevel().ordinal()])
        {
        }
        for (;;)
        {
          paramAnonymousConsoleMessage = new android.webkit.ConsoleMessage(paramAnonymousConsoleMessage.message(), paramAnonymousConsoleMessage.sourceId(), paramAnonymousConsoleMessage.lineNumber(), localMessageLevel);
          break;
          localMessageLevel = ConsoleMessage.MessageLevel.DEBUG;
          continue;
          localMessageLevel = ConsoleMessage.MessageLevel.ERROR;
          continue;
          localMessageLevel = ConsoleMessage.MessageLevel.LOG;
          continue;
          localMessageLevel = ConsoleMessage.MessageLevel.TIP;
          continue;
          localMessageLevel = ConsoleMessage.MessageLevel.WARNING;
        }
      }
      return super.onConsoleMessage(paramAnonymousConsoleMessage);
    }
    
    public final void onGeolocationPermissionsHidePrompt()
    {
      Log.i("X5WebView", "onGeolocationPermissionsHidePrompt");
      if (i.this.yod == null) {
        super.onGeolocationPermissionsHidePrompt();
      }
    }
    
    public final void onGeolocationPermissionsShowPrompt(String paramAnonymousString, GeolocationPermissionsCallback paramAnonymousGeolocationPermissionsCallback)
    {
      Log.i("X5WebView", "onGeolocationPermissionsShowPrompt");
      if (i.this.yod != null)
      {
        i.this.yod.onGeolocationPermissionsShowPrompt(paramAnonymousString, new g.e(paramAnonymousGeolocationPermissionsCallback));
        return;
      }
      super.onGeolocationPermissionsShowPrompt(paramAnonymousString, paramAnonymousGeolocationPermissionsCallback);
    }
    
    public final void onHideCustomView()
    {
      Log.i("X5WebView", "onHideCustomView");
      if (i.this.yod != null)
      {
        i.this.yod.onHideCustomView();
        return;
      }
      super.onHideCustomView();
    }
    
    public final boolean onJsAlert(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, JsResult paramAnonymousJsResult)
    {
      Log.i("X5WebView", "onJsAlert");
      if (i.this.yod != null) {
        return i.this.yod.a(i.this.yob, paramAnonymousString1, paramAnonymousString2, new g.f(paramAnonymousJsResult));
      }
      return super.onJsAlert(paramAnonymousWebView, paramAnonymousString1, paramAnonymousString2, paramAnonymousJsResult);
    }
    
    public final boolean onJsConfirm(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, JsResult paramAnonymousJsResult)
    {
      Log.i("X5WebView", "onJsConfirm");
      if (i.this.yod != null) {
        return i.this.yod.b(i.this.yob, paramAnonymousString1, paramAnonymousString2, new g.f(paramAnonymousJsResult));
      }
      return super.onJsConfirm(paramAnonymousWebView, paramAnonymousString1, paramAnonymousString2, paramAnonymousJsResult);
    }
    
    public final boolean onJsPrompt(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, JsPromptResult paramAnonymousJsPromptResult)
    {
      Log.i("X5WebView", "onJsPrompt");
      if (i.this.yod != null) {
        return i.this.yod.a(i.this.yob, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, new g.g(paramAnonymousJsPromptResult));
      }
      return super.onJsPrompt(paramAnonymousWebView, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, paramAnonymousJsPromptResult);
    }
    
    public final void onProgressChanged(com.tencent.smtt.sdk.WebView paramAnonymousWebView, int paramAnonymousInt)
    {
      Log.i("X5WebView", "onProgressChanged, progress = " + paramAnonymousInt);
      if (i.this.yod != null)
      {
        i.this.yod.a(i.this.yob, paramAnonymousInt);
        return;
      }
      super.onProgressChanged(paramAnonymousWebView, paramAnonymousInt);
    }
    
    public final void onReceivedTitle(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      Log.i("X5WebView", "onReceivedTitle: " + paramAnonymousString);
      if (i.this.yod != null)
      {
        i.this.yod.c(i.this.yob, paramAnonymousString);
        return;
      }
      super.onReceivedTitle(paramAnonymousWebView, paramAnonymousString);
    }
    
    public final void onShowCustomView(View paramAnonymousView, IX5WebChromeClient.CustomViewCallback paramAnonymousCustomViewCallback)
    {
      Log.i("X5WebView", "onShowCustomView");
      if (i.this.yod != null)
      {
        i.this.yod.onShowCustomView(paramAnonymousView, new g.c(paramAnonymousCustomViewCallback));
        return;
      }
      super.onShowCustomView(paramAnonymousView, paramAnonymousCustomViewCallback);
    }
    
    public final boolean onShowFileChooser(com.tencent.smtt.sdk.WebView paramAnonymousWebView, x<Uri[]> paramAnonymousx, WebChromeClient.a paramAnonymousa)
    {
      Log.i("X5WebView", "onShowFileChooser last method");
      if (i.this.yod != null) {
        return i.this.yod.a(i.this.yob, paramAnonymousx, new g.d(paramAnonymousa));
      }
      return super.onShowFileChooser(paramAnonymousWebView, new a.d(paramAnonymousx), paramAnonymousa);
    }
    
    public final void openFileChooser(x<Uri> paramAnonymousx, String paramAnonymousString1, String paramAnonymousString2)
    {
      Log.i("X5WebView", "openFileChooser with three param");
      if (i.this.yod != null)
      {
        i.this.yod.openFileChooser(paramAnonymousx, paramAnonymousString1, paramAnonymousString2);
        return;
      }
      paramAnonymousx.onReceiveValue(null);
    }
  };
  private c yoP = new c()
  {
    public final void doUpdateVisitedHistory(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString, boolean paramAnonymousBoolean)
    {
      if (i.this.yoc != null)
      {
        i.this.yoc.a(i.this.yob, paramAnonymousString, paramAnonymousBoolean);
        return;
      }
      super.doUpdateVisitedHistory(paramAnonymousWebView, paramAnonymousString, paramAnonymousBoolean);
    }
    
    public final void onLoadResource(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      if (i.this.yoc != null)
      {
        i.this.yoc.f(i.this.yob, paramAnonymousString);
        return;
      }
      super.onLoadResource(paramAnonymousWebView, paramAnonymousString);
    }
    
    public final void onPageFinished(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      Log.i("X5WebView", "onPageFinished " + paramAnonymousString);
      if (i.this.yoc != null) {
        i.this.yoc.a(i.this.yob, paramAnonymousString);
      }
      for (;;)
      {
        com.tencent.xweb.util.e.fy(System.currentTimeMillis() - i.this.yog);
        return;
        super.onPageFinished(paramAnonymousWebView, paramAnonymousString);
      }
    }
    
    public final void onPageStarted(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString, Bitmap paramAnonymousBitmap)
    {
      Log.i("X5WebView", "onPageStarted " + paramAnonymousString);
      if (i.this.yoc != null) {
        i.this.yoc.b(i.this.yob, paramAnonymousString, paramAnonymousBitmap);
      }
      for (;;)
      {
        i.this.yog = System.currentTimeMillis();
        com.tencent.xweb.util.e.csj();
        return;
        super.onPageStarted(paramAnonymousWebView, paramAnonymousString, paramAnonymousBitmap);
      }
    }
    
    public final void onReceivedError(com.tencent.smtt.sdk.WebView paramAnonymousWebView, int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
    {
      if (i.this.yoc != null) {
        i.this.yoc.a(i.this.yob, paramAnonymousInt, paramAnonymousString1, paramAnonymousString2);
      }
      for (;;)
      {
        com.tencent.xweb.util.e.csk();
        return;
        super.onReceivedError(paramAnonymousWebView, paramAnonymousInt, paramAnonymousString1, paramAnonymousString2);
      }
    }
    
    public final void onReceivedHttpError(com.tencent.smtt.sdk.WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest, WebResourceResponse paramAnonymousWebResourceResponse)
    {
      Log.i("X5WebView", "onReceivedHttpError code:" + paramAnonymousWebResourceResponse.getStatusCode());
      if (i.this.yoc != null)
      {
        i.this.yoc.a(new g.b(paramAnonymousWebResourceRequest), g.a(paramAnonymousWebResourceResponse));
        return;
      }
      super.onReceivedHttpError(paramAnonymousWebView, paramAnonymousWebResourceRequest, paramAnonymousWebResourceResponse);
    }
    
    public final void onReceivedSslError(com.tencent.smtt.sdk.WebView paramAnonymousWebView, SslErrorHandler paramAnonymousSslErrorHandler, com.tencent.smtt.export.external.interfaces.SslError paramAnonymousSslError)
    {
      Log.i("X5WebView", "onReceivedSslError " + paramAnonymousSslError.getPrimaryError());
      if (i.this.yoc != null)
      {
        n localn = i.this.yoc;
        com.tencent.xweb.WebView localWebView = i.this.yob;
        paramAnonymousSslErrorHandler = new g.a(paramAnonymousSslErrorHandler);
        if (paramAnonymousSslError != null) {}
        for (paramAnonymousWebView = new android.net.http.SslError(paramAnonymousSslError.getPrimaryError(), paramAnonymousSslError.getCertificate());; paramAnonymousWebView = null)
        {
          localn.a(localWebView, paramAnonymousSslErrorHandler, paramAnonymousWebView);
          return;
        }
      }
      super.onReceivedSslError(paramAnonymousWebView, paramAnonymousSslErrorHandler, paramAnonymousSslError);
    }
    
    public final void onScaleChanged(com.tencent.smtt.sdk.WebView paramAnonymousWebView, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      if (i.this.yoc != null)
      {
        i.this.yoc.aZt();
        return;
      }
      super.onScaleChanged(paramAnonymousWebView, paramAnonymousFloat1, paramAnonymousFloat2);
    }
    
    public final WebResourceResponse shouldInterceptRequest(com.tencent.smtt.sdk.WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest)
    {
      if (i.this.yoc != null)
      {
        paramAnonymousWebView = new g.b(paramAnonymousWebResourceRequest);
        return a.b(i.this.yoc.a(i.this.yob, paramAnonymousWebView));
      }
      return super.shouldInterceptRequest(paramAnonymousWebView, paramAnonymousWebResourceRequest);
    }
    
    public final WebResourceResponse shouldInterceptRequest(com.tencent.smtt.sdk.WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest, Bundle paramAnonymousBundle)
    {
      if (i.this.yoc != null)
      {
        paramAnonymousWebView = new g.b(paramAnonymousWebResourceRequest);
        return a.b(i.this.yoc.a(i.this.yob, paramAnonymousWebView, paramAnonymousBundle));
      }
      return super.shouldInterceptRequest(paramAnonymousWebView, paramAnonymousWebResourceRequest, paramAnonymousBundle);
    }
    
    public final WebResourceResponse shouldInterceptRequest(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      if (i.this.yoc != null) {
        return a.b(i.this.yoc.e(i.this.yob, paramAnonymousString));
      }
      return super.shouldInterceptRequest(paramAnonymousWebView, paramAnonymousString);
    }
    
    public final boolean shouldOverrideUrlLoading(com.tencent.smtt.sdk.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      Log.i("X5WebView", "shouldOverrideUrlLoading " + paramAnonymousString);
      if (i.this.yoc != null) {
        return i.this.yoc.b(i.this.yob, paramAnonymousString);
      }
      return super.shouldOverrideUrlLoading(paramAnonymousWebView, paramAnonymousString);
    }
  };
  com.tencent.xweb.WebView yob;
  n yoc;
  com.tencent.xweb.h yod;
  long yog = 0L;
  
  public i(com.tencent.xweb.WebView paramWebView)
  {
    this.yob = paramWebView;
    this.xTx = new a(paramWebView.getContext());
    this.yoM = new h(this.xTx);
    this.xTx.setWebChromeClient(this.yoO);
    this.xTx.setWebViewClient(this.yoP);
    this.yoM.yoF = this.yoP;
    this.yoM.yoG = this.yoO;
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.xTx.addJavascriptInterface(paramObject, paramString);
  }
  
  public final boolean canGoBack()
  {
    return this.xTx.canGoBack();
  }
  
  public final void clearMatches()
  {
    this.xTx.clearMatches();
  }
  
  public final void clearSslPreferences()
  {
    this.xTx.clearSslPreferences();
  }
  
  public final void clearView()
  {
    this.xTx.clearView();
  }
  
  public final void destroy()
  {
    this.xTx.destroy();
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    this.xTx.evaluateJavascript(paramString, new a.d(paramValueCallback));
  }
  
  public final void findAllAsync(String paramString)
  {
    this.xTx.findAllAsync(paramString);
  }
  
  public final void findNext(boolean paramBoolean)
  {
    this.xTx.findNext(paramBoolean);
  }
  
  public final int getContentHeight()
  {
    return this.xTx.getContentHeight();
  }
  
  public final com.tencent.xweb.h getCurWebChromeClient()
  {
    return this.yod;
  }
  
  public final n getCurWebviewClient()
  {
    return this.yoc;
  }
  
  public final com.tencent.xweb.a.c getDefalutOpProvider()
  {
    return this.yoM;
  }
  
  public final WebView.a getHitTestResult()
  {
    WebView.HitTestResult localHitTestResult = this.xTx.getHitTestResult();
    WebView.a locala = new WebView.a();
    locala.mType = localHitTestResult.getType();
    locala.mExtra = localHitTestResult.getExtra();
    return locala;
  }
  
  public final float getScale()
  {
    return this.xTx.getScale();
  }
  
  public final l getSettings()
  {
    if (this.yoN != null) {
      return this.yoN;
    }
    if (this.xTx == null) {
      return null;
    }
    this.yoN = new j(this.xTx);
    return this.yoN;
  }
  
  public final String getTitle()
  {
    return this.xTx.getTitle();
  }
  
  public final ViewGroup getTopView()
  {
    return (ViewGroup)this.xTx.getView();
  }
  
  public final String getUrl()
  {
    return this.xTx.getUrl();
  }
  
  public final String getVersionInfo()
  {
    if (this.xTx.getX5WebViewExtension() != null) {}
    for (int i = 1; i != 0; i = 0) {
      return "use x5 and x5 kernel, wrapper version = 3";
    }
    return "use x5 but sys kernel, wrapper version = 3";
  }
  
  public final View getView()
  {
    return this.xTx.getView();
  }
  
  public final int getVisibleTitleHeight()
  {
    return this.xTx.getVisibleTitleHeight();
  }
  
  public final int getWebScrollX()
  {
    return getWebViewUI().getScrollX();
  }
  
  public final int getWebScrollY()
  {
    return this.xTx.getWebScrollY();
  }
  
  public final View getWebViewUI()
  {
    return this.xTx;
  }
  
  public final Object getX5WebViewExtension()
  {
    return this.xTx.getX5WebViewExtension();
  }
  
  public final void goBack()
  {
    this.xTx.goBack();
  }
  
  public final boolean hasEnteredFullscreen()
  {
    return false;
  }
  
  public final boolean isOverScrollStart()
  {
    return getView().getScrollY() == 0;
  }
  
  public final void leaveFullscreen() {}
  
  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    this.xTx.loadData(paramString1, paramString2, paramString3);
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.xTx.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final void loadUrl(String paramString)
  {
    this.xTx.loadUrl(paramString);
  }
  
  public final void loadUrl(String paramString, Map<String, String> paramMap)
  {
    this.xTx.loadUrl(paramString, paramMap);
  }
  
  public final void onPause()
  {
    this.xTx.onPause();
  }
  
  public final void onResume()
  {
    this.xTx.onResume();
  }
  
  public final boolean overlayHorizontalScrollbar()
  {
    return this.xTx.overlayHorizontalScrollbar();
  }
  
  public final void reload()
  {
    this.xTx.reload();
  }
  
  public final void removeJavascriptInterface(String paramString)
  {
    this.xTx.removeJavascriptInterface(paramString);
  }
  
  public final void setDownloadListener(DownloadListener paramDownloadListener)
  {
    this.xTx.setDownloadListener(new a.a(paramDownloadListener));
  }
  
  public final void setFindListener(WebView.FindListener paramFindListener)
  {
    this.xTx.setFindListener(new a.b(paramFindListener));
  }
  
  public final void setWebChromeClient(com.tencent.xweb.h paramh)
  {
    this.yod = paramh;
  }
  
  public final void setWebViewCallbackClient(m paramm)
  {
    this.xTx.setWebViewCallbackClient(new a.f(paramm));
  }
  
  public final void setWebViewClient(n paramn)
  {
    this.yoc = paramn;
  }
  
  public final void setWebViewClientExtension(com.tencent.xweb.x5.a.a.a.a.b paramb)
  {
    this.xTx.setWebViewClientExtension(new ProxyWebViewSuperWrapper(paramb));
  }
  
  public final void stopLoading()
  {
    this.xTx.stopLoading();
  }
  
  public final void super_computeScroll()
  {
    this.xTx.super_computeScroll();
  }
  
  public final boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.xTx.super_dispatchTouchEvent(paramMotionEvent);
  }
  
  public final boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.xTx.super_onInterceptTouchEvent(paramMotionEvent);
  }
  
  public final void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.xTx.super_onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
  }
  
  public final void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.xTx.super_onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final boolean super_onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.xTx.super_onTouchEvent(paramMotionEvent);
  }
  
  public final boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    return this.xTx.super_overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
  }
  
  public final boolean zoomIn()
  {
    return this.xTx.zoomIn();
  }
  
  public final boolean zoomOut()
  {
    return this.xTx.zoomOut();
  }
  
  final class a
    extends com.tencent.smtt.sdk.WebView
  {
    public a(Context paramContext)
    {
      super();
    }
    
    protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      if (i.this.yob != null) {
        i.this.yob.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */