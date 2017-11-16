package com.tencent.xweb.sys;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build.VERSION;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.jg.JgClassChecked;
import com.tencent.xweb.d;
import com.tencent.xweb.e;
import com.tencent.xweb.g;
import com.tencent.xweb.h.a;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import java.util.Map;

public final class c
{
  public static WebResourceResponse a(k paramk)
  {
    if (paramk == null) {
      return null;
    }
    if ((paramk.mStatusCode != 0) && (Build.VERSION.SDK_INT >= 21)) {
      return new WebResourceResponse(paramk.mMimeType, paramk.mEncoding, paramk.mStatusCode, paramk.mReasonPhrase, paramk.mResponseHeaders, paramk.mInputStream);
    }
    return new WebResourceResponse(paramk.mMimeType, paramk.mEncoding, paramk.mInputStream);
  }
  
  @JgClassChecked(author=30, fComment="checked", lastDate="20171024", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
  public static final class a
    implements g
  {
    SslErrorHandler ynT;
    
    public a(SslErrorHandler paramSslErrorHandler)
    {
      this.ynT = paramSslErrorHandler;
    }
    
    public final void cancel()
    {
      this.ynT.cancel();
    }
    
    public final void proceed()
    {
      this.ynT.proceed();
    }
  }
  
  public static final class b
    extends h.a
  {
    public WebChromeClient.FileChooserParams ynU;
    
    public b(WebChromeClient.FileChooserParams paramFileChooserParams)
    {
      this.ynU = paramFileChooserParams;
    }
    
    @TargetApi(21)
    public final String[] getAcceptTypes()
    {
      if (this.ynU != null) {
        return this.ynU.getAcceptTypes();
      }
      return new String[0];
    }
    
    @TargetApi(21)
    public final int getMode()
    {
      if (this.ynU != null) {
        return this.ynU.getMode();
      }
      return 0;
    }
    
    @TargetApi(21)
    public final boolean isCaptureEnabled()
    {
      if (this.ynU != null) {
        return this.ynU.isCaptureEnabled();
      }
      return false;
    }
  }
  
  public static final class c
    extends d
  {
    public JsPromptResult ynV;
    
    public c(JsPromptResult paramJsPromptResult)
    {
      this.ynV = paramJsPromptResult;
    }
    
    public final void cancel()
    {
      if (this.ynV != null) {
        this.ynV.cancel();
      }
    }
    
    public final void confirm()
    {
      if (this.ynV != null) {
        this.ynV.confirm();
      }
    }
    
    public final void confirmWithResult(String paramString) {}
  }
  
  public static final class d
    extends e
  {
    public JsResult mJsResult;
    
    public d(JsResult paramJsResult)
    {
      this.mJsResult = paramJsResult;
    }
    
    public final void cancel()
    {
      if (this.mJsResult != null) {
        this.mJsResult.cancel();
      }
    }
    
    public final void confirm()
    {
      if (this.mJsResult != null) {
        this.mJsResult.confirm();
      }
    }
    
    public final void confirmWithResult(String paramString) {}
  }
  
  public static final class e
    implements j
  {
    private boolean hasUserGesture;
    private boolean isMainFrame;
    private String method;
    private Map<String, String> requestHeaders;
    private Uri ynW;
    
    public e(WebResourceRequest paramWebResourceRequest)
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        this.ynW = paramWebResourceRequest.getUrl();
        this.isMainFrame = paramWebResourceRequest.isForMainFrame();
        this.hasUserGesture = paramWebResourceRequest.hasGesture();
        this.method = paramWebResourceRequest.getMethod();
        this.requestHeaders = paramWebResourceRequest.getRequestHeaders();
      }
    }
    
    public final String getMethod()
    {
      return this.method;
    }
    
    public final Map<String, String> getRequestHeaders()
    {
      return this.requestHeaders;
    }
    
    public final Uri getUrl()
    {
      return this.ynW;
    }
    
    public final boolean hasGesture()
    {
      return this.hasUserGesture;
    }
    
    public final boolean isForMainFrame()
    {
      return this.isMainFrame;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\sys\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */