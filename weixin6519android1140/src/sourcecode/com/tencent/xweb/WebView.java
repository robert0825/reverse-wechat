package com.tencent.xweb;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebView.FindListener;
import android.widget.FrameLayout;
import com.tencent.xweb.a.a.a;
import com.tencent.xweb.a.a.b;
import com.tencent.xweb.a.e;
import com.tencent.xweb.a.g;
import com.tencent.xweb.a.g.a;
import com.tencent.xweb.util.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public class WebView
  extends FrameLayout
  implements e
{
  static com.tencent.xweb.x5.sdk.c ynC;
  static c yny = c.ynE;
  public boolean isX5Kernel = false;
  View.OnLongClickListener xXA;
  c ynA = c.ynE;
  com.tencent.xweb.a.b ynB;
  e ynz;
  
  static {}
  
  public WebView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public WebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public WebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (this.ynA == c.ynE)
    {
      if (getCurWebType() == c.ynE)
      {
        initWebviewCore(getContext(), c.ynH, null);
        Log.e("xweb.Webview", "use xweb without init, force to use sys web");
      }
      this.ynA = getCurWebType();
      this.ynz = g.a(this.ynA, this);
      if (this.ynz == null)
      {
        Log.e("xweb.WebView", "create mWebViewWrapper failed, force to use sys type ");
        this.ynA = c.ynH;
        this.ynz = g.a(this.ynA, this);
      }
      addView(this.ynz.getWebViewUI());
      if ((this.ynA == c.ynG) && (this.ynz.getX5WebViewExtension() != null)) {
        this.isX5Kernel = true;
      }
      if (this.ynz.getCurWebviewClient() != null) {
        this.ynz.getCurWebviewClient().ynk = this.ynz.getDefalutOpProvider();
      }
      if (this.ynz.getCurWebChromeClient() != null) {
        this.ynz.getCurWebChromeClient().ynk = this.ynz.getDefalutOpProvider();
      }
      this.ynz.getView().setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          if (WebView.this.xXA != null) {
            return WebView.this.xXA.onLongClick(WebView.this);
          }
          return false;
        }
      });
      this.ynB = ((com.tencent.xweb.a.b)g.a(c.ynF).excute("STR_CMD_GET_DEBUG_VIEW", new Object[] { this }));
      this.ynB.csh();
    }
  }
  
  private List<TextureView> dL(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramView instanceof TextureView)) {
      localArrayList.add((TextureView)paramView);
    }
    for (;;)
    {
      return localArrayList;
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i = 0;
        while (i < paramView.getChildCount())
        {
          localArrayList.addAll(dL(paramView.getChildAt(i)));
          i += 1;
        }
      }
    }
  }
  
  @Deprecated
  public static void disablePlatformNotifications()
  {
    if (getCurWebType() == c.ynH) {
      d.fF("android.webkit.WebView", "disablePlatformNotifications");
    }
  }
  
  @Deprecated
  public static void enablePlatformNotifications()
  {
    if (getCurWebType() == c.ynH) {
      d.fF("android.webkit.WebView", "enablePlatformNotifications");
    }
  }
  
  public static boolean getCanReboot()
  {
    if (getCurWebType() == c.ynG)
    {
      if (ynC != null) {
        return ynC.getCanReboot();
      }
      Log.e("xweb.WebView", "getCanReboot: sImp is null");
    }
    return true;
  }
  
  public static String getCrashExtraMessage(Context paramContext)
  {
    if (ynC != null) {
      return ynC.getCrashExtraMessage(paramContext);
    }
    Log.e("xweb.WebView", "getCrashExtraMessage: sImp is null");
    return "";
  }
  
  public static c getCurWebType()
  {
    return yny;
  }
  
  public static int getTbsCoreVersion(Context paramContext)
  {
    if (ynC != null) {
      return ynC.getTbsCoreVersion(paramContext);
    }
    Log.e("xweb.WebView", "getTbsCoreVersion: sImp is null");
    return 0;
  }
  
  public static int getTbsSDKVersion(Context paramContext)
  {
    if (ynC != null) {
      return ynC.getTbsSDKVersion(paramContext);
    }
    Log.e("xweb.WebView", "getTbsSDKVersion: sImp is null");
    return 0;
  }
  
  public static boolean hasInited()
  {
    if (getCurWebType() == c.ynE) {}
    while (g.a(getCurWebType()) == null) {
      return false;
    }
    return g.a(getCurWebType()).hasInited();
  }
  
  public static void initWebviewCore(Context paramContext, c paramc, b paramb)
  {
    if (yny != c.ynE)
    {
      if (yny != paramc) {
        Log.i("xweb.WebView", "invalid set webview kind to diffrent type");
      }
      return;
    }
    XWalkEnvironment.init(paramContext);
    i.ip(paramContext);
    if (i.crW().ynn != c.ynE)
    {
      paramc = i.crW().ynn;
      XWalkEnvironment.addXWalkInitializeLog("XWeb", "use hard code web type = " + paramc);
    }
    for (;;)
    {
      g.a locala2 = g.a(paramc);
      g.a locala1 = locala2;
      if (!locala2.initWebviewCore(paramContext, paramb))
      {
        locala1 = g.a(c.ynH);
        paramc = c.ynH;
      }
      b.crS().ymV = locala1.getCookieManager();
      c.ymX = locala1.getCookieSyncManager();
      yny = paramc;
      return;
      if (a.crP() != c.ynE)
      {
        paramc = a.crP();
        XWalkEnvironment.addXWalkInitializeLog("XWeb", "use cmd web type = " + paramc);
      }
    }
  }
  
  public static void setX5Interface(com.tencent.xweb.x5.sdk.c paramc)
  {
    ynC = paramc;
  }
  
  public void _disablePlatformNotifications() {}
  
  public void _enablePlatformNotifications() {}
  
  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.ynz.addJavascriptInterface(paramObject, paramString);
  }
  
  public boolean canGoBack()
  {
    return this.ynz.canGoBack();
  }
  
  public void clearMatches()
  {
    this.ynz.clearMatches();
  }
  
  public void clearSslPreferences()
  {
    this.ynz.clearSslPreferences();
  }
  
  public void clearView()
  {
    this.ynz.clearView();
  }
  
  public void destroy()
  {
    this.ynz.destroy();
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    super.dispatchDraw(paramCanvas);
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    this.ynz.evaluateJavascript(paramString, paramValueCallback);
  }
  
  public void findAllAsync(String paramString)
  {
    this.ynz.findAllAsync(paramString);
  }
  
  public void findNext(boolean paramBoolean)
  {
    this.ynz.findNext(paramBoolean);
  }
  
  public Bitmap getBitmap()
  {
    Bitmap localBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
    if (localBitmap != null)
    {
      localBitmap.eraseColor(-1);
      Canvas localCanvas1 = new Canvas(localBitmap);
      if (isXWalkKernel()) {}
      try
      {
        Paint localPaint = new Paint();
        localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        Object localObject = dL(this).iterator();
        while (((Iterator)localObject).hasNext()) {
          localCanvas1.drawBitmap(((TextureView)((Iterator)localObject).next()).getBitmap(), 0.0F, 0.0F, localPaint);
        }
        localObject = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas localCanvas2 = new Canvas((Bitmap)localObject);
        getTopView().draw(localCanvas2);
        localCanvas1.drawBitmap((Bitmap)localObject, 0.0F, 0.0F, localPaint);
        return localBitmap;
      }
      catch (Exception localException) {}
      draw(localCanvas1);
      return localBitmap;
    }
    return localBitmap;
  }
  
  public int getContentHeight()
  {
    return this.ynz.getContentHeight();
  }
  
  public a.a getCookieManager()
  {
    return null;
  }
  
  public a.b getCookieSyncManager()
  {
    return null;
  }
  
  public h getCurWebChromeClient()
  {
    return this.ynz.getCurWebChromeClient();
  }
  
  public n getCurWebviewClient()
  {
    return this.ynz.getCurWebviewClient();
  }
  
  public com.tencent.xweb.a.c getDefalutOpProvider()
  {
    return null;
  }
  
  public a getHitTestResult()
  {
    return this.ynz.getHitTestResult();
  }
  
  public float getScale()
  {
    return this.ynz.getScale();
  }
  
  public l getSettings()
  {
    return this.ynz.getSettings();
  }
  
  public String getTitle()
  {
    return this.ynz.getTitle();
  }
  
  public ViewGroup getTopView()
  {
    return this.ynz.getTopView();
  }
  
  public String getUrl()
  {
    return this.ynz.getUrl();
  }
  
  public String getVersionInfo()
  {
    return this.ynz.getVersionInfo();
  }
  
  public View getView()
  {
    return this.ynz.getView();
  }
  
  public int getVisibleTitleHeight()
  {
    return this.ynz.getVisibleTitleHeight();
  }
  
  public int getWebScrollX()
  {
    return this.ynz.getWebScrollX();
  }
  
  public int getWebScrollY()
  {
    return this.ynz.getWebScrollY();
  }
  
  public View getWebViewUI()
  {
    return this.ynz.getWebViewUI();
  }
  
  public Object getX5WebViewExtension()
  {
    return this.ynz.getX5WebViewExtension();
  }
  
  public void goBack()
  {
    this.ynz.goBack();
  }
  
  public boolean hasEnteredFullscreen()
  {
    return this.ynz.hasEnteredFullscreen();
  }
  
  public boolean isOverScrollStart()
  {
    return this.ynz.isOverScrollStart();
  }
  
  public boolean isXWalkKernel()
  {
    return this.ynA == c.ynF;
  }
  
  public void leaveFullscreen()
  {
    this.ynz.leaveFullscreen();
  }
  
  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    this.ynz.loadData(paramString1, paramString2, paramString3);
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.ynz.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public void loadUrl(String paramString)
  {
    if (this.ynB.Zg(paramString)) {
      return;
    }
    this.ynz.loadUrl(paramString);
  }
  
  @TargetApi(8)
  public void loadUrl(String paramString, Map<String, String> paramMap)
  {
    if (this.ynB.Zg(paramString)) {
      return;
    }
    this.ynz.loadUrl(paramString, paramMap);
  }
  
  public void onPause()
  {
    this.ynz.onPause();
  }
  
  public void onResume()
  {
    this.ynz.onResume();
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (this.ynz != null) {
      this.ynz.getView().setVisibility(paramInt);
    }
  }
  
  public void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public boolean overlayHorizontalScrollbar()
  {
    return this.ynz.overlayHorizontalScrollbar();
  }
  
  public void reload()
  {
    this.ynz.reload();
  }
  
  public void removeJavascriptInterface(String paramString)
  {
    this.ynz.removeJavascriptInterface(paramString);
  }
  
  public void setBackgroundColor(int paramInt)
  {
    super.setBackgroundColor(paramInt);
    if (this.ynz != null) {
      this.ynz.getWebViewUI().setBackgroundColor(paramInt);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.ynz != null) {
      this.ynz.getWebViewUI().setBackgroundResource(paramInt);
    }
  }
  
  public void setDownloadListener(DownloadListener paramDownloadListener)
  {
    this.ynz.setDownloadListener(paramDownloadListener);
  }
  
  public void setFindListener(WebView.FindListener paramFindListener)
  {
    this.ynz.setFindListener(paramFindListener);
  }
  
  public void setFocusable(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      setDescendantFocusability(393216);
      super.setFocusable(false);
      return;
    }
    setDescendantFocusability(131072);
    super.setFocusable(false);
  }
  
  public void setFocusableInTouchMode(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      setDescendantFocusability(393216);
      super.setFocusableInTouchMode(false);
      return;
    }
    setDescendantFocusability(131072);
    super.setFocusableInTouchMode(false);
  }
  
  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.xXA = paramOnLongClickListener;
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.ynz.getWebViewUI().setOnTouchListener(paramOnTouchListener);
  }
  
  public void setWebChromeClient(h paramh)
  {
    if (paramh != null) {
      paramh.ynk = this.ynz.getDefalutOpProvider();
    }
    this.ynz.setWebChromeClient(paramh);
  }
  
  public void setWebViewCallbackClient(m paramm)
  {
    this.ynz.setWebViewCallbackClient(paramm);
  }
  
  public void setWebViewClient(n paramn)
  {
    if (paramn != null) {
      paramn.ynk = this.ynz.getDefalutOpProvider();
    }
    this.ynz.setWebViewClient(paramn);
  }
  
  public void setWebViewClientExtension(com.tencent.xweb.x5.a.a.a.a.b paramb)
  {
    this.ynz.setWebViewClientExtension(paramb);
  }
  
  public void stopLoading()
  {
    this.ynz.stopLoading();
  }
  
  public void super_computeScroll()
  {
    this.ynz.super_computeScroll();
  }
  
  public boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.ynz.super_dispatchTouchEvent(paramMotionEvent);
  }
  
  public boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.ynz.super_onInterceptTouchEvent(paramMotionEvent);
  }
  
  public void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.ynz.super_onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
  }
  
  public void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.ynz.super_onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean super_onTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.ynz.super_onTouchEvent(paramMotionEvent);
  }
  
  public boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    return this.ynz.super_overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
  }
  
  public boolean zoomIn()
  {
    return this.ynz.zoomIn();
  }
  
  public boolean zoomOut()
  {
    return this.ynz.zoomOut();
  }
  
  public static final class a
  {
    public String mExtra;
    public int mType = 0;
  }
  
  public static abstract interface b
  {
    public abstract void oR();
    
    public abstract void oS();
  }
  
  public static enum c
  {
    private c() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\WebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */