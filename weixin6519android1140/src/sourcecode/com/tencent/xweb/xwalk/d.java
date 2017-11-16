package com.tencent.xweb.xwalk;

import android.content.Context;
import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView.FindListener;
import com.tencent.xweb.e;
import com.tencent.xweb.g;
import com.tencent.xweb.j;
import java.util.Map;
import org.xwalk.core.CustomViewCallback;
import org.xwalk.core.XWalkDownloadListener;
import org.xwalk.core.XWalkFindListener;
import org.xwalk.core.XWalkGeolocationPermissionsCallback;
import org.xwalk.core.XWalkJavascriptResult;
import org.xwalk.core.XWalkWebResourceRequest;

public final class d
{
  public static final class a
    implements WebChromeClient.CustomViewCallback
  {
    CustomViewCallback ypo;
    
    a(CustomViewCallback paramCustomViewCallback)
    {
      this.ypo = paramCustomViewCallback;
    }
    
    public final void onCustomViewHidden()
    {
      this.ypo.onCustomViewHidden();
    }
  }
  
  public static final class b
    implements GeolocationPermissions.Callback
  {
    XWalkGeolocationPermissionsCallback ypp;
    
    public b(XWalkGeolocationPermissionsCallback paramXWalkGeolocationPermissionsCallback)
    {
      this.ypp = paramXWalkGeolocationPermissionsCallback;
    }
    
    public final void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (this.ypp != null) {
        this.ypp.invoke(paramString, paramBoolean1, paramBoolean2);
      }
    }
  }
  
  public static final class c
    extends e
  {
    public XWalkJavascriptResult ypq;
    
    public c(XWalkJavascriptResult paramXWalkJavascriptResult)
    {
      this.ypq = paramXWalkJavascriptResult;
    }
    
    public final void cancel()
    {
      this.ypq.cancel();
    }
    
    public final void confirm()
    {
      this.ypq.confirm();
    }
    
    public final void confirmWithResult(String paramString)
    {
      this.ypq.confirmWithResult(paramString);
    }
  }
  
  public static final class d
    extends com.tencent.xweb.d
  {
    public XWalkJavascriptResult ypq;
    
    public d(XWalkJavascriptResult paramXWalkJavascriptResult)
    {
      this.ypq = paramXWalkJavascriptResult;
    }
    
    public final void cancel()
    {
      this.ypq.cancel();
    }
    
    public final void confirm()
    {
      this.ypq.confirm();
    }
    
    public final void confirmWithResult(String paramString)
    {
      this.ypq.confirmWithResult(paramString);
    }
  }
  
  public static final class e
    extends XWalkDownloadListener
  {
    DownloadListener yoq;
    
    public e(Context paramContext, DownloadListener paramDownloadListener)
    {
      super();
      this.yoq = paramDownloadListener;
    }
    
    public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
    {
      if (this.yoq != null) {
        this.yoq.onDownloadStart(paramString1, paramString2, paramString3, paramString4, paramLong);
      }
    }
  }
  
  public static final class f
    extends XWalkFindListener
  {
    WebView.FindListener yor;
    
    public f(WebView.FindListener paramFindListener)
    {
      this.yor = paramFindListener;
    }
    
    public final void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      if (this.yor != null) {
        this.yor.onFindResultReceived(paramInt1, paramInt2, paramBoolean);
      }
    }
  }
  
  public static final class g
    implements g
  {
    ValueCallback<Boolean> ypr;
    
    public g(ValueCallback<Boolean> paramValueCallback)
    {
      this.ypr = paramValueCallback;
    }
    
    public final void cancel()
    {
      this.ypr.onReceiveValue(Boolean.valueOf(false));
    }
    
    public final void proceed()
    {
      this.ypr.onReceiveValue(Boolean.valueOf(true));
    }
  }
  
  public static final class h
    implements j
  {
    private boolean hasUserGesture;
    private boolean isMainFrame;
    private String method;
    private Map<String, String> requestHeaders;
    private Uri ynW;
    
    public h(XWalkWebResourceRequest paramXWalkWebResourceRequest)
    {
      this.ynW = paramXWalkWebResourceRequest.getUrl();
      this.isMainFrame = paramXWalkWebResourceRequest.isForMainFrame();
      this.hasUserGesture = paramXWalkWebResourceRequest.hasGesture();
      this.method = paramXWalkWebResourceRequest.getMethod();
      this.requestHeaders = paramXWalkWebResourceRequest.getRequestHeaders();
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\xwalk\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */