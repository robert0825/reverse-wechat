package com.tencent.mm.ui.widget;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.c;
import java.lang.reflect.Method;

public class MMWebView
  extends WebView
{
  public static final WebView.c xrT;
  public boolean fRu;
  private View.OnTouchListener qLG;
  protected boolean xrU;
  private boolean xrV;
  public ViewGroup xrW;
  public d xrX;
  
  static
  {
    GMTrace.i(20291036119040L, 151180);
    xrT = WebView.c.ynG;
    GMTrace.o(20291036119040L, 151180);
  }
  
  public MMWebView(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(1631148048384L, 12153);
    GMTrace.o(1631148048384L, 12153);
  }
  
  public MMWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1631282266112L, 12154);
    GMTrace.o(1631282266112L, 12154);
  }
  
  public MMWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1631416483840L, 12155);
    this.fRu = false;
    this.xrU = false;
    this.xrV = false;
    this.xrX = null;
    cjk();
    GMTrace.o(1631416483840L, 12155);
  }
  
  private static boolean a(MMWebView paramMMWebView, String paramString)
  {
    GMTrace.i(1632624443392L, 12164);
    try
    {
      paramMMWebView = new c(new c(new c(paramMMWebView, "mSysWebView", null).get(), "mProvider", null).get(), "mWebViewCore", null).get();
      Method localMethod = paramMMWebView.getClass().getDeclaredMethod("sendMessage", new Class[] { Message.class });
      localMethod.setAccessible(true);
      localMethod.invoke(paramMMWebView, new Object[] { Message.obtain(null, 194, paramString) });
      GMTrace.o(1632624443392L, 12164);
      return true;
    }
    catch (Exception paramMMWebView)
    {
      w.e("MicroMsg.MMWebView", "reflectJSExec, e = %s", new Object[] { paramMMWebView });
      GMTrace.o(1632624443392L, 12164);
    }
    return false;
  }
  
  public static void fI(Context paramContext)
  {
    GMTrace.i(1633832402944L, 12173);
    Object localObject = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    paramContext = ((SharedPreferences)localObject).getString("tbs_webview_disable", "0");
    String str = ((SharedPreferences)localObject).getString("tbs_webview_min_sdk_version", null);
    localObject = ((SharedPreferences)localObject).getString("tbs_webview_max_sdk_version", null);
    w.i("MicroMsg.MMWebView", "initTbsSettings, tbsDisable = %s, minSdkVersion = %s, maxSdkVersion = %s", new Object[] { paramContext, str, localObject });
    if ("1".equals(paramContext))
    {
      int i = bg.getInt(str, 0);
      int j = bg.getInt((String)localObject, 0);
      int k = Build.VERSION.SDK_INT;
      if ((k >= i) && ((k <= j) || (j == 0))) {
        w.i("MicroMsg.MMWebView", "in selection, disable x5");
      }
    }
    for (boolean bool = false;; bool = true)
    {
      w.i("MicroMsg.MMWebView", "initTbsSettings, enableTbsKernel = %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        com.tencent.xweb.x5.sdk.d.forceSysWebView();
      }
      GMTrace.o(1633832402944L, 12173);
      return;
    }
  }
  
  public final boolean K(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    GMTrace.i(1633027096576L, 12167);
    int i = paramMotionEvent.getAction();
    boolean bool2 = super.super_onTouchEvent(paramMotionEvent);
    switch (i & 0xFF)
    {
    case 1: 
    default: 
      if (bool2) {
        if (this.xrV) {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(1633027096576L, 12167);
      return bool1;
      this.xrV = false;
      break;
      if (this.xrW == null) {
        break;
      }
      if (this.xrV)
      {
        this.xrW.requestDisallowInterceptTouchEvent(false);
        break;
      }
      this.xrW.requestDisallowInterceptTouchEvent(true);
      break;
      bool1 = false;
      continue;
      bool1 = bool2;
    }
  }
  
  public final boolean L(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1633295532032L, 12169);
    boolean bool = super.super_dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(1633295532032L, 12169);
    return bool;
  }
  
  public final boolean M(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1633429749760L, 12170);
    boolean bool = super.super_onInterceptTouchEvent(paramMotionEvent);
    GMTrace.o(1633429749760L, 12170);
    return bool;
  }
  
  @TargetApi(9)
  public final boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    GMTrace.i(1632892878848L, 12166);
    paramBoolean = super.super_overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    if ((paramInt4 < 0) || ((paramInt4 == 0) && (paramInt2 < 0))) {
      this.xrV = true;
    }
    GMTrace.o(1632892878848L, 12166);
    return paramBoolean;
  }
  
  @TargetApi(9)
  public final void c(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1633161314304L, 12168);
    super.super_onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    GMTrace.o(1633161314304L, 12168);
  }
  
  @TargetApi(11)
  public final void cjk()
  {
    GMTrace.i(1632087572480L, 12160);
    try
    {
      if (Build.VERSION.SDK_INT >= 11) {
        super.removeJavascriptInterface("searchBoxJavaBridge_");
      }
      GMTrace.o(1632087572480L, 12160);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MMWebView", "removeConfigJsInterface, ex = %s", new Object[] { localException.getMessage() });
      GMTrace.o(1632087572480L, 12160);
    }
  }
  
  public final void cjl()
  {
    GMTrace.i(1632221790208L, 12161);
    if (Build.VERSION.SDK_INT >= 5)
    {
      new c();
      setScrollbarFadingEnabled(true);
      setScrollBarStyle(0);
      GMTrace.o(1632221790208L, 12161);
      return;
    }
    new b();
    setScrollBarStyle(0);
    GMTrace.o(1632221790208L, 12161);
  }
  
  public final void cjm()
  {
    GMTrace.i(1632758661120L, 12165);
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1626181992448L, 12116);
        switch (paramAnonymousMotionEvent.getAction() & 0xFF)
        {
        default: 
          MMWebView.b(MMWebView.this).requestDisallowInterceptTouchEvent(true);
        }
        while (MMWebView.c(MMWebView.this) != null)
        {
          boolean bool = MMWebView.c(MMWebView.this).onTouch(paramAnonymousView, paramAnonymousMotionEvent);
          GMTrace.o(1626181992448L, 12116);
          return bool;
          MMWebView.b(MMWebView.this).requestDisallowInterceptTouchEvent(true);
          continue;
          MMWebView.b(MMWebView.this).requestDisallowInterceptTouchEvent(false);
        }
        GMTrace.o(1626181992448L, 12116);
        return false;
      }
    });
    GMTrace.o(1632758661120L, 12165);
  }
  
  @TargetApi(9)
  public final void cjn()
  {
    GMTrace.i(1633563967488L, 12171);
    super.super_computeScroll();
    GMTrace.o(1633563967488L, 12171);
  }
  
  public void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    GMTrace.i(20290096594944L, 151173);
    if (bg.nm(paramString))
    {
      GMTrace.o(20290096594944L, 151173);
      return;
    }
    if ((com.tencent.mm.compatible.util.d.et(19)) || (this.isX5Kernel)) {}
    for (int i = 1; i != 0; i = 0)
    {
      super.evaluateJavascript(paramString, paramValueCallback);
      GMTrace.o(20290096594944L, 151173);
      return;
    }
    if ((this.xrU) && (a(this, paramString)))
    {
      GMTrace.o(20290096594944L, 151173);
      return;
    }
    paramValueCallback = paramString;
    try
    {
      if (!paramString.startsWith("javascript:")) {
        paramValueCallback = "javascript:" + paramString;
      }
      super.loadUrl(paramValueCallback);
      GMTrace.o(20290096594944L, 151173);
      return;
    }
    catch (Exception paramString)
    {
      w.i("MicroMsg.MMWebView", "evaluateJavascript failed : %s", new Object[] { paramString.getMessage() });
      GMTrace.o(20290096594944L, 151173);
    }
  }
  
  public void loadUrl(String paramString)
  {
    GMTrace.i(1631953354752L, 12159);
    super.loadUrl(paramString);
    GMTrace.o(1631953354752L, 12159);
  }
  
  public void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(21008564092928L, 156526);
    super.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.xrX != null) {
      this.xrX.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    GMTrace.o(21008564092928L, 156526);
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    GMTrace.i(17512460713984L, 130478);
    this.qLG = paramOnTouchListener;
    GMTrace.o(17512460713984L, 130478);
  }
  
  public final void w(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(1633698185216L, 12172);
    super.super_onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(1633698185216L, 12172);
  }
  
  public static final class a
  {
    public static MMWebView cb(Context paramContext)
    {
      GMTrace.i(1626316210176L, 12117);
      w.i("MMWebView", "TRACE_ORDER:MMWebView.java");
      WebView.initWebviewCore(paramContext, MMWebView.xrT, null);
      MMWebView.fI(paramContext);
      paramContext = new MMWebView(paramContext);
      paramContext.fRu = true;
      MMWebView.a(paramContext, paramContext.isX5Kernel);
      GMTrace.o(1626316210176L, 12117);
      return paramContext;
    }
    
    public static MMWebView j(Activity paramActivity, int paramInt)
    {
      boolean bool = true;
      GMTrace.i(1626584645632L, 12119);
      MMWebView.fI(paramActivity);
      paramActivity = (MMWebView)paramActivity.findViewById(paramInt);
      paramActivity.fRu = true;
      if (paramActivity.getX5WebViewExtension() != null) {}
      for (;;)
      {
        MMWebView.b(paramActivity, bool);
        GMTrace.o(1626584645632L, 12119);
        return paramActivity;
        bool = false;
      }
    }
  }
  
  private final class b
  {
    public b()
    {
      GMTrace.i(1634906144768L, 12181);
      GMTrace.o(1634906144768L, 12181);
    }
  }
  
  private final class c
  {
    public c()
    {
      GMTrace.i(1639603765248L, 12216);
      GMTrace.o(1639603765248L, 12216);
    }
  }
  
  public static abstract interface d
  {
    public abstract void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\MMWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */