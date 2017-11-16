package com.tencent.xweb.sys;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView.FindListener;
import android.webkit.WebView.HitTestResult;
import android.webkit.WebViewClient;
import com.jg.JgClassChecked;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.f;
import com.tencent.xweb.h;
import com.tencent.xweb.k;
import com.tencent.xweb.l;
import com.tencent.xweb.m;
import com.tencent.xweb.n;
import com.tencent.xweb.x5.a.a.a.a.b;
import java.util.HashMap;
import java.util.Map;
import org.xwalk.core.Log;

@JgClassChecked(author=30, fComment="checked", lastDate="20171020", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public final class SysWebView
  implements com.tencent.xweb.a.e
{
  android.webkit.WebView ynZ;
  com.tencent.xweb.WebView yob;
  n yoc;
  h yod;
  d yoe;
  e yof;
  long yog = 0L;
  private WebChromeClient yoh = new WebChromeClient()
  {
    public View getVideoLoadingProgressView()
    {
      if (SysWebView.this.yod != null) {
        return SysWebView.this.yod.getVideoLoadingProgressView();
      }
      return super.getVideoLoadingProgressView();
    }
    
    public boolean onConsoleMessage(ConsoleMessage paramAnonymousConsoleMessage)
    {
      Log.i("SysWebView", "onConsoleMessage " + paramAnonymousConsoleMessage.message());
      if (SysWebView.this.yod != null) {
        return SysWebView.this.yod.onConsoleMessage(paramAnonymousConsoleMessage);
      }
      return super.onConsoleMessage(paramAnonymousConsoleMessage);
    }
    
    public void onGeolocationPermissionsHidePrompt()
    {
      Log.i("SysWebView", "onGeolocationPermissionsHidePrompt");
      if (SysWebView.this.yod == null) {
        super.onGeolocationPermissionsHidePrompt();
      }
    }
    
    public void onGeolocationPermissionsShowPrompt(String paramAnonymousString, GeolocationPermissions.Callback paramAnonymousCallback)
    {
      Log.i("SysWebView", "onGeolocationPermissionsShowPrompt");
      if (SysWebView.this.yod != null)
      {
        SysWebView.this.yod.onGeolocationPermissionsShowPrompt(paramAnonymousString, paramAnonymousCallback);
        return;
      }
      super.onGeolocationPermissionsShowPrompt(paramAnonymousString, paramAnonymousCallback);
    }
    
    public void onHideCustomView()
    {
      Log.i("SysWebView", "onHideCustomView");
      if (SysWebView.this.yod != null)
      {
        SysWebView.this.yod.onHideCustomView();
        return;
      }
      super.onHideCustomView();
    }
    
    public boolean onJsAlert(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, JsResult paramAnonymousJsResult)
    {
      Log.i("SysWebView", "onJsAlert");
      if (SysWebView.this.yod != null) {
        return SysWebView.this.yod.a(SysWebView.this.yob, paramAnonymousString1, paramAnonymousString2, new c.d(paramAnonymousJsResult));
      }
      return super.onJsAlert(paramAnonymousWebView, paramAnonymousString1, paramAnonymousString2, paramAnonymousJsResult);
    }
    
    public boolean onJsConfirm(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, JsResult paramAnonymousJsResult)
    {
      Log.i("SysWebView", "onJsConfirm");
      if (SysWebView.this.yod != null) {
        return SysWebView.this.yod.b(SysWebView.this.yob, paramAnonymousString1, paramAnonymousString2, new c.d(paramAnonymousJsResult));
      }
      return super.onJsConfirm(paramAnonymousWebView, paramAnonymousString1, paramAnonymousString2, paramAnonymousJsResult);
    }
    
    public boolean onJsPrompt(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, JsPromptResult paramAnonymousJsPromptResult)
    {
      Log.i("SysWebView", "onJsPrompt");
      if (SysWebView.this.yod != null) {
        return SysWebView.this.yod.a(SysWebView.this.yob, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, new c.c(paramAnonymousJsPromptResult));
      }
      return super.onJsPrompt(paramAnonymousWebView, paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, paramAnonymousJsPromptResult);
    }
    
    public void onProgressChanged(android.webkit.WebView paramAnonymousWebView, int paramAnonymousInt)
    {
      Log.i("SysWebView", "onProgressChanged, progress = " + paramAnonymousInt);
      if (SysWebView.this.yod != null)
      {
        SysWebView.this.yod.a(SysWebView.this.yob, paramAnonymousInt);
        return;
      }
      super.onProgressChanged(paramAnonymousWebView, paramAnonymousInt);
    }
    
    public void onReceivedTitle(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      Log.i("SysWebView", "onReceivedTitle: " + paramAnonymousString);
      if (SysWebView.this.yod != null)
      {
        SysWebView.this.yod.c(SysWebView.this.yob, paramAnonymousString);
        return;
      }
      super.onReceivedTitle(paramAnonymousWebView, paramAnonymousString);
    }
    
    public void onShowCustomView(View paramAnonymousView, WebChromeClient.CustomViewCallback paramAnonymousCustomViewCallback)
    {
      Log.i("SysWebView", "onShowCustomView");
      if (SysWebView.this.yod != null)
      {
        SysWebView.this.yod.onShowCustomView(paramAnonymousView, paramAnonymousCustomViewCallback);
        return;
      }
      super.onShowCustomView(paramAnonymousView, paramAnonymousCustomViewCallback);
    }
    
    public boolean onShowFileChooser(android.webkit.WebView paramAnonymousWebView, ValueCallback<Uri[]> paramAnonymousValueCallback, WebChromeClient.FileChooserParams paramAnonymousFileChooserParams)
    {
      Log.i("SysWebView", "onShowFileChooser last method");
      if (SysWebView.this.yod != null) {
        return SysWebView.this.yod.a(SysWebView.this.yob, paramAnonymousValueCallback, new c.b(paramAnonymousFileChooserParams));
      }
      return super.onShowFileChooser(paramAnonymousWebView, paramAnonymousValueCallback, paramAnonymousFileChooserParams);
    }
    
    public void openFileChooser(ValueCallback<Uri> paramAnonymousValueCallback)
    {
      Log.i("SysWebView", "openFileChooser with one param");
      if (SysWebView.this.yod != null)
      {
        SysWebView.this.yod.openFileChooser(paramAnonymousValueCallback, null, null);
        return;
      }
      paramAnonymousValueCallback.onReceiveValue(null);
    }
    
    public void openFileChooser(ValueCallback<Uri> paramAnonymousValueCallback, String paramAnonymousString)
    {
      Log.i("SysWebView", "openFileChooser with two param");
      if (SysWebView.this.yod != null)
      {
        SysWebView.this.yod.openFileChooser(paramAnonymousValueCallback, paramAnonymousString, null);
        return;
      }
      paramAnonymousValueCallback.onReceiveValue(null);
    }
    
    public void openFileChooser(ValueCallback<Uri> paramAnonymousValueCallback, String paramAnonymousString1, String paramAnonymousString2)
    {
      Log.i("SysWebView", "openFileChooser with three param");
      if (SysWebView.this.yod != null)
      {
        SysWebView.this.yod.openFileChooser(paramAnonymousValueCallback, paramAnonymousString1, paramAnonymousString2);
        return;
      }
      paramAnonymousValueCallback.onReceiveValue(null);
    }
  };
  private WebViewClient yoi = new WebViewClient()
  {
    public final void doUpdateVisitedHistory(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString, boolean paramAnonymousBoolean)
    {
      if (SysWebView.this.yoc != null)
      {
        SysWebView.this.yoc.a(SysWebView.this.yob, paramAnonymousString, paramAnonymousBoolean);
        return;
      }
      super.doUpdateVisitedHistory(paramAnonymousWebView, paramAnonymousString, paramAnonymousBoolean);
    }
    
    public final void onLoadResource(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      if (SysWebView.this.yoc != null)
      {
        SysWebView.this.yoc.f(SysWebView.this.yob, paramAnonymousString);
        return;
      }
      super.onLoadResource(paramAnonymousWebView, paramAnonymousString);
    }
    
    public final void onPageFinished(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      Log.i("SysWebView", "onPageFinished " + paramAnonymousString);
      if (SysWebView.this.yoc != null) {
        SysWebView.this.yoc.a(SysWebView.this.yob, paramAnonymousString);
      }
      for (;;)
      {
        com.tencent.xweb.util.e.fy(System.currentTimeMillis() - SysWebView.this.yog);
        return;
        super.onPageFinished(paramAnonymousWebView, paramAnonymousString);
      }
    }
    
    public final void onPageStarted(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString, Bitmap paramAnonymousBitmap)
    {
      Log.i("SysWebView", "onPageStarted " + paramAnonymousString);
      if (SysWebView.this.yoc != null) {
        SysWebView.this.yoc.b(SysWebView.this.yob, paramAnonymousString, paramAnonymousBitmap);
      }
      for (;;)
      {
        SysWebView.this.yog = System.currentTimeMillis();
        com.tencent.xweb.util.e.csj();
        return;
        super.onPageStarted(paramAnonymousWebView, paramAnonymousString, paramAnonymousBitmap);
      }
    }
    
    public final void onReceivedError(android.webkit.WebView paramAnonymousWebView, int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
    {
      if (SysWebView.this.yoc != null) {
        SysWebView.this.yoc.a(SysWebView.this.yob, paramAnonymousInt, paramAnonymousString1, paramAnonymousString2);
      }
      for (;;)
      {
        com.tencent.xweb.util.e.csk();
        return;
        super.onReceivedError(paramAnonymousWebView, paramAnonymousInt, paramAnonymousString1, paramAnonymousString2);
      }
    }
    
    public final void onReceivedHttpError(android.webkit.WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest, WebResourceResponse paramAnonymousWebResourceResponse)
    {
      Object localObject;
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject = String.valueOf(paramAnonymousWebResourceResponse.getStatusCode());
        Log.i("SysWebView", "onReceivedHttpError code:" + (String)localObject);
        if (SysWebView.this.yoc == null) {
          break label154;
        }
        localObject = SysWebView.this.yoc;
        paramAnonymousWebResourceRequest = new c.e(paramAnonymousWebResourceRequest);
        if (paramAnonymousWebResourceResponse != null) {
          break label88;
        }
        paramAnonymousWebView = null;
      }
      for (;;)
      {
        ((n)localObject).a(paramAnonymousWebResourceRequest, paramAnonymousWebView);
        return;
        localObject = "Invalid";
        break;
        label88:
        if (Build.VERSION.SDK_INT >= 21) {
          paramAnonymousWebView = new k(paramAnonymousWebResourceResponse.getMimeType(), paramAnonymousWebResourceResponse.getEncoding(), paramAnonymousWebResourceResponse.getStatusCode(), paramAnonymousWebResourceResponse.getReasonPhrase(), paramAnonymousWebResourceResponse.getResponseHeaders(), paramAnonymousWebResourceResponse.getData());
        } else {
          paramAnonymousWebView = new k(paramAnonymousWebResourceResponse.getMimeType(), paramAnonymousWebResourceResponse.getEncoding(), paramAnonymousWebResourceResponse.getData());
        }
      }
      label154:
      super.onReceivedHttpError(paramAnonymousWebView, paramAnonymousWebResourceRequest, paramAnonymousWebResourceResponse);
    }
    
    public final void onReceivedSslError(android.webkit.WebView paramAnonymousWebView, SslErrorHandler paramAnonymousSslErrorHandler, SslError paramAnonymousSslError)
    {
      Log.i("SysWebView", "onReceivedSslError " + paramAnonymousSslError.getPrimaryError());
      if (SysWebView.this.yoc != null)
      {
        SysWebView.this.yoc.a(SysWebView.this.yob, new c.a(paramAnonymousSslErrorHandler), paramAnonymousSslError);
        return;
      }
      super.onReceivedSslError(paramAnonymousWebView, paramAnonymousSslErrorHandler, paramAnonymousSslError);
    }
    
    public final void onScaleChanged(android.webkit.WebView paramAnonymousWebView, float paramAnonymousFloat1, float paramAnonymousFloat2)
    {
      if (SysWebView.this.yoc != null)
      {
        SysWebView.this.yoc.aZt();
        return;
      }
      super.onScaleChanged(paramAnonymousWebView, paramAnonymousFloat1, paramAnonymousFloat2);
    }
    
    public final WebResourceResponse shouldInterceptRequest(android.webkit.WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest)
    {
      if (SysWebView.this.yoc != null) {
        return c.a(SysWebView.this.yoc.a(SysWebView.this.yob, new c.e(paramAnonymousWebResourceRequest)));
      }
      return super.shouldInterceptRequest(paramAnonymousWebView, paramAnonymousWebResourceRequest);
    }
    
    public final WebResourceResponse shouldInterceptRequest(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      if (SysWebView.this.yoc != null) {
        return c.a(SysWebView.this.yoc.e(SysWebView.this.yob, paramAnonymousString));
      }
      return super.shouldInterceptRequest(paramAnonymousWebView, paramAnonymousString);
    }
    
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView paramAnonymousWebView, String paramAnonymousString)
    {
      Log.i("SysWebView", "shouldOverrideUrlLoading " + paramAnonymousString);
      if (SysWebView.this.yoc != null) {
        return SysWebView.this.yoc.b(SysWebView.this.yob, paramAnonymousString);
      }
      return super.shouldOverrideUrlLoading(paramAnonymousWebView, paramAnonymousString);
    }
  };
  ValueCallBackWrapper yoj;
  final String yok = "xwalkTempCallBack";
  
  public SysWebView(com.tencent.xweb.WebView paramWebView)
  {
    this.yob = paramWebView;
    this.ynZ = new a(paramWebView.getContext());
    this.yoe = new d(this.ynZ);
    this.ynZ.setWebChromeClient(this.yoh);
    this.ynZ.setWebViewClient(this.yoi);
    if (Build.VERSION.SDK_INT < 19)
    {
      this.yoj = new ValueCallBackWrapper();
      this.ynZ.addJavascriptInterface(this.yoj, "xwalkTempCallBack");
    }
  }
  
  @SuppressLint({"JavascriptInterface"})
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.ynZ.addJavascriptInterface(paramObject, paramString);
  }
  
  public final boolean canGoBack()
  {
    return this.ynZ.canGoBack();
  }
  
  public final void clearMatches()
  {
    this.ynZ.clearMatches();
  }
  
  public final void clearSslPreferences()
  {
    this.ynZ.clearSslPreferences();
  }
  
  public final void clearView()
  {
    this.ynZ.clearView();
  }
  
  public final void destroy()
  {
    this.ynZ.destroy();
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    if (paramString == null) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      this.ynZ.evaluateJavascript(paramString, paramValueCallback);
      return;
    }
    if (paramValueCallback == null)
    {
      this.ynZ.loadUrl(paramString);
      return;
    }
    String str = paramString;
    if (paramString.trim().startsWith("javascript:")) {
      str = paramString.replaceFirst("javascript:", "");
    }
    if (this.yoj == null)
    {
      this.yoj = new ValueCallBackWrapper();
      this.ynZ.addJavascriptInterface(this.yoj, "xwalkTempCallBack");
    }
    ValueCallBackWrapper localValueCallBackWrapper = this.yoj;
    if (paramValueCallback != null)
    {
      paramString = new StringBuilder();
      int i = localValueCallBackWrapper.yon;
      localValueCallBackWrapper.yon = (i + 1);
      paramString = i;
      localValueCallBackWrapper.yom.put(paramString, paramValueCallback);
    }
    for (;;)
    {
      paramString = "javascript:xwalkTempCallBack.notifyJava(" + paramString + ", " + str + ")";
      this.ynZ.loadUrl(paramString);
      return;
      paramString = "";
    }
  }
  
  public final void findAllAsync(String paramString)
  {
    this.ynZ.findAllAsync(paramString);
  }
  
  public final void findNext(boolean paramBoolean)
  {
    this.ynZ.findNext(paramBoolean);
  }
  
  public final int getContentHeight()
  {
    return this.ynZ.getContentHeight();
  }
  
  public final h getCurWebChromeClient()
  {
    return this.yod;
  }
  
  public final n getCurWebviewClient()
  {
    return this.yoc;
  }
  
  public final com.tencent.xweb.a.c getDefalutOpProvider()
  {
    return this.yoe;
  }
  
  public final WebView.a getHitTestResult()
  {
    WebView.HitTestResult localHitTestResult = this.ynZ.getHitTestResult();
    WebView.a locala = new WebView.a();
    locala.mType = localHitTestResult.getType();
    locala.mExtra = localHitTestResult.getExtra();
    return locala;
  }
  
  public final float getScale()
  {
    return this.ynZ.getScale();
  }
  
  public final l getSettings()
  {
    if (this.yof != null) {
      return this.yof;
    }
    if (this.ynZ == null) {
      return null;
    }
    this.yof = new e(this.ynZ);
    return this.yof;
  }
  
  public final String getTitle()
  {
    return this.ynZ.getTitle();
  }
  
  public final ViewGroup getTopView()
  {
    return this.ynZ;
  }
  
  public final String getUrl()
  {
    return this.ynZ.getUrl();
  }
  
  public final String getVersionInfo()
  {
    return "webviewType = WV_KIND_SYS, V8 type=" + f.crV();
  }
  
  public final View getView()
  {
    return this.ynZ;
  }
  
  public final int getVisibleTitleHeight()
  {
    Object localObject = com.tencent.xweb.util.d.d(this.ynZ, "getVisibleTitleHeight");
    if (localObject == null) {
      return 0;
    }
    return ((Integer)localObject).intValue();
  }
  
  public final int getWebScrollX()
  {
    return getWebViewUI().getScrollX();
  }
  
  public final int getWebScrollY()
  {
    return this.ynZ.getScrollY();
  }
  
  public final View getWebViewUI()
  {
    return this.ynZ;
  }
  
  public final Object getX5WebViewExtension()
  {
    return null;
  }
  
  public final void goBack()
  {
    this.ynZ.goBack();
  }
  
  public final boolean hasEnteredFullscreen()
  {
    return false;
  }
  
  public final boolean isOverScrollStart()
  {
    return getWebViewUI().getScrollY() == 0;
  }
  
  public final void leaveFullscreen() {}
  
  public final void loadData(String paramString1, String paramString2, String paramString3)
  {
    this.ynZ.loadData(paramString1, paramString2, paramString3);
  }
  
  public final void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.ynZ.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final void loadUrl(String paramString)
  {
    this.ynZ.loadUrl(paramString);
  }
  
  public final void loadUrl(String paramString, Map<String, String> paramMap)
  {
    this.ynZ.loadUrl(paramString, paramMap);
  }
  
  public final void onPause()
  {
    this.ynZ.onPause();
  }
  
  public final void onResume()
  {
    this.ynZ.onResume();
  }
  
  public final boolean overlayHorizontalScrollbar()
  {
    return this.ynZ.overlayHorizontalScrollbar();
  }
  
  public final void reload()
  {
    this.ynZ.reload();
  }
  
  public final void removeJavascriptInterface(String paramString)
  {
    this.ynZ.removeJavascriptInterface(paramString);
  }
  
  public final void setDownloadListener(DownloadListener paramDownloadListener)
  {
    this.ynZ.setDownloadListener(paramDownloadListener);
  }
  
  public final void setFindListener(WebView.FindListener paramFindListener)
  {
    this.ynZ.setFindListener(paramFindListener);
  }
  
  public final void setWebChromeClient(h paramh)
  {
    this.yod = paramh;
  }
  
  public final void setWebViewCallbackClient(m paramm) {}
  
  public final void setWebViewClient(n paramn)
  {
    this.yoc = paramn;
  }
  
  public final void setWebViewClientExtension(b paramb) {}
  
  public final void stopLoading()
  {
    this.ynZ.stopLoading();
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
    return this.ynZ.zoomIn();
  }
  
  public final boolean zoomOut()
  {
    return this.ynZ.zoomOut();
  }
  
  public static class ValueCallBackWrapper
  {
    HashMap<String, ValueCallback<String>> yom = new HashMap();
    int yon = 0;
    
    @JavascriptInterface
    public void notifyJava(String paramString1, String paramString2)
    {
      ValueCallback localValueCallback = (ValueCallback)this.yom.get(paramString1);
      if (localValueCallback != null)
      {
        localValueCallback.onReceiveValue(paramString2);
        this.yom.remove(paramString1);
      }
    }
  }
  
  final class a
    extends android.webkit.WebView
  {
    public a(Context paramContext)
    {
      super();
    }
    
    protected final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      if (SysWebView.this.yob != null) {
        SysWebView.this.yob.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\sys\SysWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */