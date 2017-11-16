package com.tencent.xweb.a;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebView.FindListener;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.h;
import com.tencent.xweb.l;
import com.tencent.xweb.m;
import com.tencent.xweb.n;
import com.tencent.xweb.x5.a.a.a.a.b;
import java.util.Map;

public abstract interface e
{
  public abstract void addJavascriptInterface(Object paramObject, String paramString);
  
  public abstract boolean canGoBack();
  
  public abstract void clearMatches();
  
  public abstract void clearSslPreferences();
  
  public abstract void clearView();
  
  public abstract void destroy();
  
  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);
  
  public abstract void findAllAsync(String paramString);
  
  public abstract void findNext(boolean paramBoolean);
  
  public abstract int getContentHeight();
  
  public abstract h getCurWebChromeClient();
  
  public abstract n getCurWebviewClient();
  
  public abstract c getDefalutOpProvider();
  
  public abstract WebView.a getHitTestResult();
  
  public abstract float getScale();
  
  public abstract l getSettings();
  
  public abstract String getTitle();
  
  public abstract ViewGroup getTopView();
  
  public abstract String getUrl();
  
  public abstract String getVersionInfo();
  
  public abstract View getView();
  
  public abstract int getVisibleTitleHeight();
  
  public abstract int getWebScrollX();
  
  public abstract int getWebScrollY();
  
  public abstract View getWebViewUI();
  
  public abstract Object getX5WebViewExtension();
  
  public abstract void goBack();
  
  public abstract boolean hasEnteredFullscreen();
  
  public abstract boolean isOverScrollStart();
  
  public abstract void leaveFullscreen();
  
  public abstract void loadData(String paramString1, String paramString2, String paramString3);
  
  public abstract void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);
  
  public abstract void loadUrl(String paramString);
  
  @TargetApi(8)
  public abstract void loadUrl(String paramString, Map<String, String> paramMap);
  
  public abstract void onPause();
  
  public abstract void onResume();
  
  public abstract boolean overlayHorizontalScrollbar();
  
  public abstract void reload();
  
  public abstract void removeJavascriptInterface(String paramString);
  
  public abstract void setDownloadListener(DownloadListener paramDownloadListener);
  
  public abstract void setFindListener(WebView.FindListener paramFindListener);
  
  public abstract void setWebChromeClient(h paramh);
  
  public abstract void setWebViewCallbackClient(m paramm);
  
  public abstract void setWebViewClient(n paramn);
  
  public abstract void setWebViewClientExtension(b paramb);
  
  public abstract void stopLoading();
  
  public abstract void super_computeScroll();
  
  public abstract boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent);
  
  public abstract boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent);
  
  public abstract void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract boolean super_onTouchEvent(MotionEvent paramMotionEvent);
  
  public abstract boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean);
  
  public abstract boolean zoomIn();
  
  public abstract boolean zoomOut();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */