package com.tencent.xweb.x5;

import android.net.Uri;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.jg.JgClassChecked;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;
import com.tencent.smtt.export.external.interfaces.JsPromptResult;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.SslErrorHandler;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.WebChromeClient.a;
import com.tencent.xweb.d;
import com.tencent.xweb.e;
import com.tencent.xweb.h.a;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import java.util.Map;

@JgClassChecked(author=30, fComment="checked", lastDate="20171020", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public final class g
{
  public static k a(WebResourceResponse paramWebResourceResponse)
  {
    if (paramWebResourceResponse == null) {
      return null;
    }
    return new k(paramWebResourceResponse.getMimeType(), paramWebResourceResponse.getEncoding(), paramWebResourceResponse.getStatusCode(), paramWebResourceResponse.getReasonPhrase(), paramWebResourceResponse.getResponseHeaders(), paramWebResourceResponse.getData());
  }
  
  public static final class a
    implements com.tencent.xweb.g
  {
    SslErrorHandler yoz;
    
    public a(SslErrorHandler paramSslErrorHandler)
    {
      this.yoz = paramSslErrorHandler;
    }
    
    public final void cancel()
    {
      this.yoz.cancel();
    }
    
    public final void proceed()
    {
      this.yoz.proceed();
    }
  }
  
  public static final class b
    implements j
  {
    private boolean hasUserGesture;
    private boolean isMainFrame;
    private String method;
    private Map<String, String> requestHeaders;
    private Uri ynW;
    
    public b(WebResourceRequest paramWebResourceRequest)
    {
      this.ynW = paramWebResourceRequest.getUrl();
      this.isMainFrame = paramWebResourceRequest.isForMainFrame();
      this.hasUserGesture = paramWebResourceRequest.hasGesture();
      this.method = paramWebResourceRequest.getMethod();
      this.requestHeaders = paramWebResourceRequest.getRequestHeaders();
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
  
  public static final class c
    implements WebChromeClient.CustomViewCallback
  {
    IX5WebChromeClient.CustomViewCallback yoA;
    
    c(IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
    {
      this.yoA = paramCustomViewCallback;
    }
    
    public final void onCustomViewHidden()
    {
      this.yoA.onCustomViewHidden();
    }
  }
  
  public static final class d
    extends h.a
  {
    public WebChromeClient.a yoB;
    
    public d(WebChromeClient.a parama)
    {
      this.yoB = parama;
    }
    
    public final String[] getAcceptTypes()
    {
      if (this.yoB != null) {
        return this.yoB.getAcceptTypes();
      }
      return new String[0];
    }
    
    public final int getMode()
    {
      if (this.yoB != null) {
        return this.yoB.getMode();
      }
      return 0;
    }
    
    public final boolean isCaptureEnabled()
    {
      if (this.yoB != null) {
        return this.yoB.isCaptureEnabled();
      }
      return false;
    }
  }
  
  public static final class e
    implements GeolocationPermissions.Callback
  {
    GeolocationPermissionsCallback yoC;
    
    public e(GeolocationPermissionsCallback paramGeolocationPermissionsCallback)
    {
      this.yoC = paramGeolocationPermissionsCallback;
    }
    
    public final void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (this.yoC != null) {
        this.yoC.invoke(paramString, paramBoolean1, paramBoolean2);
      }
    }
  }
  
  public static final class f
    extends e
  {
    public JsResult yoD;
    
    public f(JsResult paramJsResult)
    {
      this.yoD = paramJsResult;
    }
    
    public final void cancel()
    {
      this.yoD.cancel();
    }
    
    public final void confirm()
    {
      this.yoD.confirm();
    }
    
    public final void confirmWithResult(String paramString) {}
  }
  
  public static final class g
    extends d
  {
    public JsPromptResult yoE;
    
    public g(JsPromptResult paramJsPromptResult)
    {
      this.yoE = paramJsPromptResult;
    }
    
    public final void cancel()
    {
      this.yoE.cancel();
    }
    
    public final void confirm()
    {
      this.yoE.confirm();
    }
    
    public final void confirmWithResult(String paramString) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */