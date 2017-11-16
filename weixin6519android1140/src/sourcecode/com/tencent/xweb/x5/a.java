package com.tencent.xweb.x5;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView.FindListener;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.FindListener;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.smtt.sdk.aa;
import com.tencent.smtt.sdk.x;
import com.tencent.xweb.e;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import com.tencent.xweb.m;
import java.util.Map;

public final class a
{
  public static WebResourceResponse b(k paramk)
  {
    if (paramk == null) {
      return null;
    }
    return new WebResourceResponse(paramk.mMimeType, paramk.mEncoding, paramk.mStatusCode, paramk.mReasonPhrase, paramk.mResponseHeaders, paramk.mInputStream);
  }
  
  public static final class a
    implements com.tencent.smtt.sdk.DownloadListener
  {
    android.webkit.DownloadListener yoq;
    
    public a(android.webkit.DownloadListener paramDownloadListener)
    {
      this.yoq = paramDownloadListener;
    }
    
    public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
    {
      if (this.yoq != null) {
        this.yoq.onDownloadStart(paramString1, paramString2, paramString3, paramString4, paramLong);
      }
    }
  }
  
  public static final class b
    implements IX5WebViewBase.FindListener
  {
    WebView.FindListener yor;
    
    public b(WebView.FindListener paramFindListener)
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
  
  public static final class c
    implements JsResult
  {
    public e lJX;
    
    public c(e parame)
    {
      this.lJX = parame;
    }
    
    public final void cancel()
    {
      this.lJX.cancel();
    }
    
    public final void confirm()
    {
      this.lJX.confirm();
    }
  }
  
  public static final class d<T>
    implements x<T>
  {
    ValueCallback<T> yos;
    
    public d(ValueCallback<T> paramValueCallback)
    {
      this.yos = paramValueCallback;
    }
    
    public final void onReceiveValue(T paramT)
    {
      if (this.yos != null) {
        this.yos.onReceiveValue(paramT);
      }
    }
  }
  
  public static final class e
    implements WebResourceRequest
  {
    public j yot;
    
    private e(j paramj)
    {
      this.yot = paramj;
    }
    
    public static WebResourceRequest a(j paramj)
    {
      if (paramj == null) {
        return null;
      }
      return new e(paramj);
    }
    
    public final String getMethod()
    {
      return this.yot.getMethod();
    }
    
    public final Map<String, String> getRequestHeaders()
    {
      return this.yot.getRequestHeaders();
    }
    
    public final Uri getUrl()
    {
      return this.yot.getUrl();
    }
    
    public final boolean hasGesture()
    {
      return this.yot.hasGesture();
    }
    
    public final boolean isForMainFrame()
    {
      return this.yot.isForMainFrame();
    }
  }
  
  public static final class f
    implements aa
  {
    m you;
    
    public f(m paramm)
    {
      this.you = paramm;
    }
    
    public final void computeScroll(View paramView)
    {
      if (this.you != null) {
        this.you.XY();
      }
    }
    
    public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent, View paramView)
    {
      if (this.you != null) {
        return this.you.z(paramMotionEvent);
      }
      return false;
    }
    
    public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent, View paramView)
    {
      if (this.you != null) {
        return this.you.A(paramMotionEvent);
      }
      return false;
    }
    
    public final void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, View paramView)
    {
      if (this.you != null) {
        this.you.b(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      }
    }
    
    public final void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4, View paramView)
    {
      if (this.you != null) {
        this.you.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, paramView);
      }
    }
    
    public final boolean onTouchEvent(MotionEvent paramMotionEvent, View paramView)
    {
      if (this.you != null) {
        return this.you.y(paramMotionEvent);
      }
      return false;
    }
    
    public final boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean, View paramView)
    {
      if (this.you != null) {
        return this.you.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
      }
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\xweb\x5\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */