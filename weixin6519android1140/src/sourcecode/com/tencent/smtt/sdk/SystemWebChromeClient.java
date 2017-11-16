package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.View;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebStorage.QuotaUpdater;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;

class SystemWebChromeClient
  extends android.webkit.WebChromeClient
{
  private WebView xTx;
  private WebChromeClient xUr;
  
  SystemWebChromeClient(WebView paramWebView, WebChromeClient paramWebChromeClient)
  {
    this.xTx = paramWebView;
    this.xUr = paramWebChromeClient;
  }
  
  @TargetApi(7)
  public Bitmap getDefaultVideoPoster()
  {
    Bitmap localBitmap2 = this.xUr.getDefaultVideoPoster();
    Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null) {
      localBitmap1 = localBitmap2;
    }
    try
    {
      if (Build.VERSION.SDK_INT >= 24) {
        localBitmap1 = BitmapFactory.decodeResource(this.xTx.getResources(), 17301540);
      }
      return localBitmap1;
    }
    catch (Exception localException) {}
    return localBitmap2;
  }
  
  @TargetApi(7)
  public View getVideoLoadingProgressView()
  {
    return this.xUr.getVideoLoadingProgressView();
  }
  
  public void getVisitedHistory(final ValueCallback<String[]> paramValueCallback)
  {
    this.xUr.getVisitedHistory(new x()
    {
      public void onReceiveValue(String[] paramAnonymousArrayOfString)
      {
        paramValueCallback.onReceiveValue(paramAnonymousArrayOfString);
      }
    });
  }
  
  public void onCloseWindow(android.webkit.WebView paramWebView)
  {
    this.xUr.onCloseWindow(this.xTx);
  }
  
  public void onConsoleMessage(String paramString1, int paramInt, String paramString2)
  {
    this.xUr.onConsoleMessage(new ConsoleMessageImpl(paramString1, paramString2, paramInt));
  }
  
  public boolean onConsoleMessage(android.webkit.ConsoleMessage paramConsoleMessage)
  {
    return this.xUr.onConsoleMessage(new ConsoleMessageImpl(paramConsoleMessage));
  }
  
  public boolean onCreateWindow(final android.webkit.WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, final Message paramMessage)
  {
    paramWebView = this.xTx;
    paramWebView.getClass();
    paramWebView = new WebView.WebViewTransport(paramWebView);
    paramMessage = Message.obtain(paramMessage.getTarget(), new Runnable()
    {
      public void run()
      {
        Object localObject = paramWebView.getWebView();
        android.webkit.WebView.WebViewTransport localWebViewTransport;
        if (localObject != null)
        {
          localWebViewTransport = (android.webkit.WebView.WebViewTransport)paramMessage.obj;
          if (((WebView)localObject).xXe) {
            break label48;
          }
        }
        label48:
        for (localObject = ((WebView)localObject).xXg;; localObject = null)
        {
          localWebViewTransport.setWebView((android.webkit.WebView)localObject);
          paramMessage.sendToTarget();
          return;
        }
      }
    });
    paramMessage.obj = paramWebView;
    return this.xUr.onCreateWindow(this.xTx, paramBoolean1, paramBoolean2, paramMessage);
  }
  
  @Deprecated
  @TargetApi(5)
  public void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    this.xUr.onExceededDatabaseQuota(paramString1, paramString2, paramLong1, paramLong2, paramLong3, new QuotaUpdaterImpl(paramQuotaUpdater));
  }
  
  @TargetApi(5)
  public void onGeolocationPermissionsHidePrompt()
  {
    this.xUr.onGeolocationPermissionsHidePrompt();
  }
  
  @TargetApi(5)
  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    this.xUr.onGeolocationPermissionsShowPrompt(paramString, new GeolocationPermissionsCallbackImpl(paramCallback));
  }
  
  @TargetApi(7)
  public void onHideCustomView()
  {
    this.xUr.onHideCustomView();
  }
  
  public boolean onJsAlert(android.webkit.WebView paramWebView, String paramString1, String paramString2, android.webkit.JsResult paramJsResult)
  {
    return this.xUr.onJsAlert(this.xTx, paramString1, paramString2, new JsResultImpl(paramJsResult));
  }
  
  public boolean onJsBeforeUnload(android.webkit.WebView paramWebView, String paramString1, String paramString2, android.webkit.JsResult paramJsResult)
  {
    return this.xUr.onJsBeforeUnload(this.xTx, paramString1, paramString2, new JsResultImpl(paramJsResult));
  }
  
  public boolean onJsConfirm(android.webkit.WebView paramWebView, String paramString1, String paramString2, android.webkit.JsResult paramJsResult)
  {
    return this.xUr.onJsConfirm(this.xTx, paramString1, paramString2, new JsResultImpl(paramJsResult));
  }
  
  public boolean onJsPrompt(android.webkit.WebView paramWebView, String paramString1, String paramString2, String paramString3, android.webkit.JsPromptResult paramJsPromptResult)
  {
    return this.xUr.onJsPrompt(this.xTx, paramString1, paramString2, paramString3, new JsPromptResultImpl(paramJsPromptResult));
  }
  
  @TargetApi(7)
  public boolean onJsTimeout()
  {
    return this.xUr.onJsTimeout();
  }
  
  public void onProgressChanged(android.webkit.WebView paramWebView, int paramInt)
  {
    this.xUr.onProgressChanged(this.xTx, paramInt);
  }
  
  @Deprecated
  @TargetApi(7)
  public void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    this.xUr.onReachedMaxAppCacheSize(paramLong1, paramLong2, new QuotaUpdaterImpl(paramQuotaUpdater));
  }
  
  public void onReceivedIcon(android.webkit.WebView paramWebView, Bitmap paramBitmap)
  {
    this.xUr.onReceivedIcon(this.xTx, paramBitmap);
  }
  
  public void onReceivedTitle(android.webkit.WebView paramWebView, String paramString)
  {
    this.xUr.onReceivedTitle(this.xTx, paramString);
  }
  
  @TargetApi(7)
  public void onReceivedTouchIconUrl(android.webkit.WebView paramWebView, String paramString, boolean paramBoolean)
  {
    this.xUr.onReceivedTouchIconUrl(this.xTx, paramString, paramBoolean);
  }
  
  public void onRequestFocus(android.webkit.WebView paramWebView)
  {
    this.xUr.onRequestFocus(this.xTx);
  }
  
  @Deprecated
  @TargetApi(14)
  public void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.xUr.onShowCustomView(paramView, paramInt, new CustomViewCallbackImpl(paramCustomViewCallback));
  }
  
  @TargetApi(7)
  public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.xUr.onShowCustomView(paramView, new CustomViewCallbackImpl(paramCustomViewCallback));
  }
  
  public boolean onShowFileChooser(android.webkit.WebView paramWebView, final ValueCallback<Uri[]> paramValueCallback, final WebChromeClient.FileChooserParams paramFileChooserParams)
  {
    paramWebView = new x()
    {
      public void onReceiveValue(Uri[] paramAnonymousArrayOfUri)
      {
        paramValueCallback.onReceiveValue(paramAnonymousArrayOfUri);
      }
    };
    paramValueCallback = new WebChromeClient.a()
    {
      public Intent createIntent()
      {
        return paramFileChooserParams.createIntent();
      }
      
      public String[] getAcceptTypes()
      {
        return paramFileChooserParams.getAcceptTypes();
      }
      
      public String getFilenameHint()
      {
        return paramFileChooserParams.getFilenameHint();
      }
      
      public int getMode()
      {
        return paramFileChooserParams.getMode();
      }
      
      public CharSequence getTitle()
      {
        return paramFileChooserParams.getTitle();
      }
      
      public boolean isCaptureEnabled()
      {
        return paramFileChooserParams.isCaptureEnabled();
      }
    };
    return this.xUr.onShowFileChooser(this.xTx, paramWebView, paramValueCallback);
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback)
  {
    openFileChooser(paramValueCallback, null, null);
  }
  
  public void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString)
  {
    openFileChooser(paramValueCallback, paramString, null);
  }
  
  public void openFileChooser(final ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
  {
    this.xUr.openFileChooser(new x()
    {
      public void onReceiveValue(Uri paramAnonymousUri)
      {
        paramValueCallback.onReceiveValue(paramAnonymousUri);
      }
    }, paramString1, paramString2);
  }
  
  public void setupAutoFill(Message paramMessage) {}
  
  private static class ConsoleMessageImpl
    implements com.tencent.smtt.export.external.interfaces.ConsoleMessage
  {
    private int mLineNumber;
    private String mMessage;
    private com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel mMessageLevel;
    private String mSourceId;
    
    ConsoleMessageImpl(android.webkit.ConsoleMessage paramConsoleMessage)
    {
      this.mMessageLevel = com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel.valueOf(paramConsoleMessage.messageLevel().name());
      this.mMessage = paramConsoleMessage.message();
      this.mSourceId = paramConsoleMessage.sourceId();
      this.mLineNumber = paramConsoleMessage.lineNumber();
    }
    
    ConsoleMessageImpl(String paramString1, String paramString2, int paramInt)
    {
      this.mMessageLevel = com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel.LOG;
      this.mMessage = paramString1;
      this.mSourceId = paramString2;
      this.mLineNumber = paramInt;
    }
    
    public int lineNumber()
    {
      return this.mLineNumber;
    }
    
    public String message()
    {
      return this.mMessage;
    }
    
    public com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel messageLevel()
    {
      return this.mMessageLevel;
    }
    
    public String sourceId()
    {
      return this.mSourceId;
    }
  }
  
  class CustomViewCallbackImpl
    implements IX5WebChromeClient.CustomViewCallback
  {
    WebChromeClient.CustomViewCallback mCustomViewCallback;
    
    CustomViewCallbackImpl(WebChromeClient.CustomViewCallback paramCustomViewCallback)
    {
      this.mCustomViewCallback = paramCustomViewCallback;
    }
    
    public void onCustomViewHidden()
    {
      this.mCustomViewCallback.onCustomViewHidden();
    }
  }
  
  class GeolocationPermissionsCallbackImpl
    implements GeolocationPermissionsCallback
  {
    GeolocationPermissions.Callback mCallback;
    
    GeolocationPermissionsCallbackImpl(GeolocationPermissions.Callback paramCallback)
    {
      this.mCallback = paramCallback;
    }
    
    public void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      this.mCallback.invoke(paramString, paramBoolean1, paramBoolean2);
    }
  }
  
  private class JsPromptResultImpl
    implements com.tencent.smtt.export.external.interfaces.JsPromptResult
  {
    android.webkit.JsPromptResult mJsPromptResult;
    
    JsPromptResultImpl(android.webkit.JsPromptResult paramJsPromptResult)
    {
      this.mJsPromptResult = paramJsPromptResult;
    }
    
    public void cancel()
    {
      this.mJsPromptResult.cancel();
    }
    
    public void confirm()
    {
      this.mJsPromptResult.confirm();
    }
    
    public void confirm(String paramString)
    {
      this.mJsPromptResult.confirm(paramString);
    }
  }
  
  private class JsResultImpl
    implements com.tencent.smtt.export.external.interfaces.JsResult
  {
    android.webkit.JsResult mJsResult;
    
    JsResultImpl(android.webkit.JsResult paramJsResult)
    {
      this.mJsResult = paramJsResult;
    }
    
    public void cancel()
    {
      this.mJsResult.cancel();
    }
    
    public void confirm()
    {
      this.mJsResult.confirm();
    }
  }
  
  class QuotaUpdaterImpl
    implements z.a
  {
    WebStorage.QuotaUpdater mQuotaUpdater;
    
    QuotaUpdaterImpl(WebStorage.QuotaUpdater paramQuotaUpdater)
    {
      this.mQuotaUpdater = paramQuotaUpdater;
    }
    
    public void updateQuota(long paramLong)
    {
      this.mQuotaUpdater.updateQuota(paramLong);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\SystemWebChromeClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */