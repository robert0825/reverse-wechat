package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView.FindListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebSettingsExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.extension.proxy.X5ProxyWebViewClientExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.FindListener;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.HitTestResult;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.PictureListener;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import com.tencent.smtt.sdk.a.c;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.r;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WebView
  extends FrameLayout
  implements View.OnLongClickListener
{
  public static final int GETPVERROR = -1;
  public static int NIGHT_MODE_ALPHA = 153;
  public static final int NIGHT_MODE_COLOR = -16777216;
  public static final int NORMAL_MODE_ALPHA = 255;
  public static final String SCHEME_GEO = "geo:0,0?q=";
  public static final String SCHEME_MAILTO = "mailto:";
  public static final String SCHEME_TEL = "tel:";
  public static boolean mSysWebviewCreated;
  private static Context sN;
  private static final Lock xXc = new ReentrantLock();
  private static OutputStream xXd = null;
  private static BroadcastReceiver xXm;
  private static r xXn;
  private static Method xXo;
  private static String xXr;
  private static Paint xXx;
  private static boolean xXy;
  private final String Dj = "WebView";
  private Context mContext = null;
  public aa mWebViewCallbackClient;
  private View.OnLongClickListener xXA = null;
  boolean xXe = false;
  IX5WebViewBase xXf;
  SystemWebView xXg;
  private WebSettings xXh = null;
  int xXi = 0;
  private boolean xXj = false;
  private o xXk = null;
  private boolean xXl = false;
  private WebViewClient xXp = null;
  private WebChromeClient xXq = null;
  private final int xXs = 1;
  private final int xXt = 2;
  private final int xXu = 3;
  private final String xXv = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
  private final String xXw = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
  private Object xXz = null;
  
  static
  {
    sN = null;
    xXm = null;
    xXn = null;
    xXo = null;
    xXr = null;
    mSysWebviewCreated = false;
    xXx = null;
    xXy = true;
  }
  
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
    this(paramContext, paramAttributeSet, paramInt, false);
  }
  
  @TargetApi(11)
  public WebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, Map<String, Object> paramMap, boolean paramBoolean)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.xXk.a("init_all", (byte)1);
    if ((QbSdk.getIsSysWebViewForcedByOuter()) && (t.gU(paramContext)))
    {
      this.mContext = paramContext;
      this.xXf = null;
      this.xXe = false;
      QbSdk.by(paramContext, "failed to createTBSWebview!");
      this.xXg = new SystemWebView(paramContext, paramAttributeSet);
      CookieManager.getInstance().o(paramContext, false);
      CookieSyncManager.createInstance(this.mContext).startSync();
    }
    try
    {
      paramAttributeSet = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", new Class[0]);
      paramAttributeSet.setAccessible(true);
      ((Handler)paramAttributeSet.invoke(null, new Object[0])).getLooper().getThread().setUncaughtExceptionHandler(new SQLiteUncaughtExceptionHandler());
      mSysWebviewCreated = true;
      CookieManager.getInstance().cnL();
      this.xXg.setFocusableInTouchMode(true);
      addView(this.xXg, new FrameLayout.LayoutParams(-1, -1));
      TbsLog.i("WebView", "SystemWebView Created Success! #3");
      TbsLog.e("WebView", "sys WebView: IsSysWebViewForcedByOuter = true", true);
      i.cnZ().a(paramContext, 402, new Throwable());
      for (;;)
      {
        return;
        if (t.gU(paramContext)) {
          TbsLog.setWriteLogJIT(true);
        }
        for (;;)
        {
          this.xXk.a("tbslog_init", (byte)1);
          TbsLog.initIfNeed(paramContext);
          this.xXk.a("tbslog_init", (byte)2);
          if (paramContext != null) {
            break;
          }
          throw new IllegalArgumentException("Invalid context argument");
          TbsLog.setWriteLogJIT(false);
        }
        if (xXn == null) {
          xXn = r.hB(paramContext);
        }
        if (xXn.xZf)
        {
          TbsLog.e("WebView", "sys WebView: debug.conf force syswebview", true);
          QbSdk.by(paramContext, "debug.conf force syswebview!");
        }
        b(paramContext, this.xXk);
        this.mContext = paramContext;
        if (paramContext != null) {
          sN = paramContext.getApplicationContext();
        }
        if ((this.xXe) && (!QbSdk.xTH))
        {
          this.xXk.a("init_x5_webview", (byte)1);
          this.xXf = ab.coW().xXD.hh(paramContext);
          this.xXk.a("init_x5_webview", (byte)2);
          if ((this.xXf == null) || (this.xXf.getView() == null))
          {
            TbsLog.e("WebView", "sys WebView: failed to createTBSWebview", true);
            this.xXf = null;
            this.xXe = false;
            QbSdk.by(paramContext, "failed to createTBSWebview!");
            b(paramContext, this.xXk);
            if (t.gU(this.mContext))
            {
              this.xXg = new SystemWebView(paramContext, paramAttributeSet);
              label548:
              TbsLog.i("WebView", "SystemWebView Created Success! #1");
              CookieManager.getInstance().o(paramContext, false);
              CookieManager.getInstance().cnL();
              this.xXg.setFocusableInTouchMode(true);
              addView(this.xXg, new FrameLayout.LayoutParams(-1, -1));
            }
          }
        }
        try
        {
          if (Build.VERSION.SDK_INT >= 11)
          {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
          }
          hb(paramContext);
          TbsLog.writeLogToDisk();
          p.gs(paramContext);
          return;
          this.xXg = new SystemWebView(paramContext);
          break label548;
          TbsLog.i("WebView", "X5 WebView Created Success!!");
          this.xXf.getView().setFocusableInTouchMode(true);
          e(paramAttributeSet);
          addView(this.xXf.getView(), new FrameLayout.LayoutParams(-1, -1));
          this.xXf.setDownloadListener(new b(this, null));
          paramMap = this.xXf.getX5WebViewExtension();
          paramAttributeSet = ab.coW().xXD.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDefaultX5WebChromeClientExtension", new Class[0], new Object[0]);
          if (paramAttributeSet == null)
          {
            paramAttributeSet = null;
            label763:
            paramMap.setWebViewClientExtension(new X5ProxyWebViewClientExtension(paramAttributeSet)
            {
              public void invalidate() {}
              
              public void onScrollChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
              {
                super.onScrollChanged(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousInt3, paramAnonymousInt4);
                WebView.a(WebView.this, paramAnonymousInt3, paramAnonymousInt4, paramAnonymousInt1, paramAnonymousInt2);
              }
            });
          }
          try
          {
            if (Build.VERSION.SDK_INT >= 11)
            {
              removeJavascriptInterface("searchBoxJavaBridge_");
              removeJavascriptInterface("accessibility");
              removeJavascriptInterface("accessibilityTraversal");
            }
            if (("com.tencent.mobileqq".equals(this.mContext.getApplicationInfo().packageName)) || ("com.tencent.mm".equals(this.mContext.getApplicationInfo().packageName)))
            {
              d.mW(true);
              if ((d.useSoftWare()) && (Build.VERSION.SDK_INT >= 11)) {
                setLayerType(1, null);
              }
            }
            if (this.xXk != null) {
              this.xXk.a("init_all", (byte)2);
            }
            if (this.xXf == null) {
              continue;
            }
            TbsLog.writeLogToDisk();
            if (t.gU(paramContext)) {
              continue;
            }
            paramInt = k.gl(paramContext).xVi.getInt("tbs_decouplecoreversion", 0);
            if (paramInt > 0)
            {
              p.cov();
              if ((paramInt != p.gB(paramContext)) && (paramInt == p.cov().gC(paramContext)))
              {
                p.cov().gG(paramContext);
                return;
                paramAttributeSet = (IX5WebViewClientExtension)paramAttributeSet;
                break label763;
                this.xXf = null;
                if (t.gU(this.mContext)) {}
                for (this.xXg = new SystemWebView(paramContext, paramAttributeSet);; this.xXg = new SystemWebView(paramContext))
                {
                  TbsLog.i("WebView", "SystemWebView Created Success! #2");
                  CookieManager.getInstance().o(paramContext, false);
                  CookieManager.getInstance().cnL();
                  this.xXg.setFocusableInTouchMode(true);
                  addView(this.xXg, new FrameLayout.LayoutParams(-1, -1));
                  setDownloadListener(null);
                  hb(paramContext);
                  TbsLog.writeLogToDisk();
                  p.gs(paramContext);
                  break;
                }
              }
            }
            paramAttributeSet = new StringBuilder("webview construction #1 deCoupleCoreVersion is ").append(paramInt).append(" getTbsCoreShareDecoupleCoreVersion is ");
            p.cov();
            TbsLog.i("WebView", p.gB(paramContext) + " getTbsCoreInstalledVerInNolock is " + p.cov().gC(paramContext));
            return;
          }
          catch (Throwable paramAttributeSet)
          {
            for (;;) {}
          }
        }
        catch (Throwable paramAttributeSet)
        {
          for (;;) {}
        }
      }
    }
    catch (Exception paramAttributeSet)
    {
      for (;;) {}
    }
  }
  
  public WebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, boolean paramBoolean)
  {
    this(paramContext, paramAttributeSet, paramInt, null, paramBoolean);
  }
  
  private void b(Context paramContext, o paramo)
  {
    if ((QbSdk.xTS) && (t.gU(paramContext))) {
      m.cot().gr(paramContext);
    }
    if (paramo != null) {
      paramo.a("x5_core_engine_init_sync", (byte)1);
    }
    ab localab = ab.coW();
    localab.b(paramContext, paramo);
    this.xXe = localab.coX();
  }
  
  private static long coQ()
  {
    synchronized (QbSdk.xTR)
    {
      if (QbSdk.xTP)
      {
        QbSdk.sWifiConnectedTime += System.currentTimeMillis() - QbSdk.xTQ;
        TbsLog.d("sdkreport", "pv report, WebView.getWifiConnectedTime QbSdk.sWifiConnectedTime=" + QbSdk.sWifiConnectedTime);
      }
      long l = QbSdk.sWifiConnectedTime / 1000L;
      QbSdk.sWifiConnectedTime = 0L;
      QbSdk.xTQ = System.currentTimeMillis();
      return l;
    }
  }
  
  static void coR()
  {
    new Thread()
    {
      public final void run()
      {
        if (WebView.coU() == null) {
          TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--mAppContext == null");
        }
        int i;
        int j;
        do
        {
          return;
          d.mW(true);
          if (d.xUn)
          {
            TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--needReboot = true");
            return;
          }
          j localj = j.gk(WebView.coU());
          i = localj.Ye("install_status");
          TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--installStatus = " + i);
          if (i == 2)
          {
            TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--install setTbsNeedReboot true");
            d.Yd(String.valueOf(localj.Yf("install_core_ver")));
            d.cnR();
            return;
          }
          j = localj.Ye("copy_status");
          TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copyStatus = " + j);
          if (j == 1)
          {
            TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copy setTbsNeedReboot true");
            d.Yd(String.valueOf(localj.Yf("copy_core_ver")));
            d.cnR();
            return;
          }
        } while ((ab.coW().coX()) || ((i != 3) && (j != 3)));
        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--setTbsNeedReboot true");
        d.Yd(String.valueOf(d.cnQ()));
        d.cnR();
      }
    }.start();
  }
  
  private boolean dK(View paramView)
  {
    if ((this.mContext != null) && (getTbsCoreVersion(this.mContext) > 36200)) {
      return false;
    }
    paramView = com.tencent.smtt.utils.o.a(this.xXz, "onLongClick", new Class[] { View.class }, new Object[] { paramView });
    if (paramView != null) {
      return ((Boolean)paramView).booleanValue();
    }
    return false;
  }
  
  @Deprecated
  public static void disablePlatformNotifications()
  {
    if (!ab.coW().coX()) {
      com.tencent.smtt.utils.o.fF("android.webkit.WebView", "disablePlatformNotifications");
    }
  }
  
  private void e(AttributeSet paramAttributeSet)
  {
    int i = 0;
    if (paramAttributeSet != null) {
      try
      {
        int j = paramAttributeSet.getAttributeCount();
        while (i < j)
        {
          if (paramAttributeSet.getAttributeName(i).equalsIgnoreCase("scrollbars"))
          {
            int[] arrayOfInt = getResources().getIntArray(16842974);
            int k = paramAttributeSet.getAttributeIntValue(i, -1);
            if (k == arrayOfInt[1])
            {
              this.xXf.getView().setVerticalScrollBarEnabled(false);
              this.xXf.getView().setHorizontalScrollBarEnabled(false);
            }
            else if (k == arrayOfInt[2])
            {
              this.xXf.getView().setVerticalScrollBarEnabled(false);
            }
            else if (k == arrayOfInt[3])
            {
              this.xXf.getView().setHorizontalScrollBarEnabled(false);
            }
          }
          i += 1;
        }
        return;
      }
      catch (Exception paramAttributeSet) {}
    }
  }
  
  @Deprecated
  public static void enablePlatformNotifications()
  {
    if (!ab.coW().coX()) {
      com.tencent.smtt.utils.o.fF("android.webkit.WebView", "enablePlatformNotifications");
    }
  }
  
  public static String findAddress(String paramString)
  {
    if (!ab.coW().coX()) {
      return android.webkit.WebView.findAddress(paramString);
    }
    return null;
  }
  
  public static String getCrashExtraMessage(Context paramContext)
  {
    String str1 = null;
    if (paramContext == null) {
      return "";
    }
    String str2 = "tbs_core_version:" + QbSdk.getTbsVersion(paramContext) + ";tbs_sdk_version:43601" + ";";
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject1 = d.mW(true);
    if ((((d)localObject1).xUh == null) || (QbSdk.xTH)) {
      localObject1 = "system webview get nothing...";
    }
    for (;;)
    {
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append("\n");
      localStringBuilder.append(str2);
      if ((!t.gU(paramContext)) && (QbSdk.xUc != null) && (QbSdk.xUc.containsKey("weapp_id")) && (QbSdk.xUc.containsKey("weapp_name")))
      {
        paramContext = "weapp_id:" + QbSdk.xUc.get("weapp_id") + ";weapp_name:" + QbSdk.xUc.get("weapp_name") + ";";
        localStringBuilder.append("\n");
        localStringBuilder.append(paramContext);
      }
      if (localStringBuilder.length() <= 8192) {
        break;
      }
      return localStringBuilder.substring(localStringBuilder.length() - 8192);
      w localw = ((d)localObject1).xUh;
      Object localObject2 = localw.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMethod", new Class[] { Boolean.TYPE, String.class, String.class, Class[].class, Object[].class }, new Object[] { Boolean.valueOf(true), "com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0] });
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = localw.xWV.invokeStaticMethod("com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
      }
      if (localObject1 != null)
      {
        str1 = String.valueOf(localObject1);
        str1 = str1 + " ReaderPackName=" + s.xWz + " ReaderPackVersion=" + s.xWA;
      }
      localObject1 = str1;
      if (str1 == null) {
        localObject1 = "X5 core get nothing...";
      }
    }
    return localStringBuilder.toString();
  }
  
  public static PackageInfo getCurrentWebViewPackage()
  {
    if (!ab.coW().coX())
    {
      if (Build.VERSION.SDK_INT < 26) {
        return null;
      }
      try
      {
        PackageInfo localPackageInfo = (PackageInfo)com.tencent.smtt.utils.o.fF("android.webkit.WebView", "getCurrentWebViewPackage");
        return localPackageInfo;
      }
      catch (Exception localException)
      {
        return null;
      }
    }
    return null;
  }
  
  /* Error */
  @Deprecated
  public static Object getPluginList()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 380	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   6: invokevirtual 592	com/tencent/smtt/sdk/ab:coX	()Z
    //   9: ifne +18 -> 27
    //   12: ldc_w 657
    //   15: ldc_w 803
    //   18: invokestatic 662	com/tencent/smtt/utils/o:fF	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   21: astore_0
    //   22: ldc 2
    //   24: monitorexit
    //   25: aload_0
    //   26: areturn
    //   27: aconst_null
    //   28: astore_0
    //   29: goto -7 -> 22
    //   32: astore_0
    //   33: ldc 2
    //   35: monitorexit
    //   36: aload_0
    //   37: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   21	8	0	localObject1	Object
    //   32	5	0	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   3	22	32	finally
  }
  
  public static int getTbsCoreVersion(Context paramContext)
  {
    return QbSdk.getTbsVersion(paramContext);
  }
  
  public static boolean getTbsNeedReboot()
  {
    coR();
    return d.mW(true).getTbsNeedReboot();
  }
  
  public static int getTbsSDKVersion(Context paramContext)
  {
    return 43601;
  }
  
  private void hb(final Context paramContext)
  {
    if (xXm != null) {
      return;
    }
    xXm = new ConnectivityChangedReceiver(null);
    new Thread()
    {
      public void run()
      {
        try
        {
          if (com.tencent.smtt.utils.b.ho(paramContext) == 3) {}
          for (boolean bool = true;; bool = false)
          {
            QbSdk.xTP = bool;
            QbSdk.xTQ = System.currentTimeMillis();
            IntentFilter localIntentFilter = new IntentFilter();
            localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            paramContext.getApplicationContext().registerReceiver(WebView.coS(), localIntentFilter);
            return;
          }
          return;
        }
        catch (Throwable localThrowable) {}
      }
    }.start();
  }
  
  private static boolean hc(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageName().indexOf("com.tencent.mobileqq");
      if (i >= 0) {
        return true;
      }
    }
    catch (Throwable paramContext) {}
    return false;
  }
  
  /* Error */
  private static int hd(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: ldc_w 828
    //   5: invokestatic 834	com/tencent/smtt/utils/f:c	(Landroid/content/Context;ZLjava/lang/String;)Ljava/io/FileOutputStream;
    //   8: astore 5
    //   10: aload 5
    //   12: ifnull +15 -> 27
    //   15: aload 5
    //   17: invokestatic 837	com/tencent/smtt/utils/f:a	(Ljava/io/FileOutputStream;)Ljava/nio/channels/FileLock;
    //   20: astore 6
    //   22: aload 6
    //   24: ifnonnull +5 -> 29
    //   27: iconst_m1
    //   28: ireturn
    //   29: getstatic 110	com/tencent/smtt/sdk/WebView:xXc	Ljava/util/concurrent/locks/Lock;
    //   32: invokeinterface 842 1 0
    //   37: ifeq +384 -> 421
    //   40: aconst_null
    //   41: astore 4
    //   43: aload_0
    //   44: ldc_w 844
    //   47: iconst_0
    //   48: invokevirtual 848	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   51: astore_0
    //   52: new 850	java/io/File
    //   55: dup
    //   56: new 545	java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial 720	java/lang/StringBuilder:<init>	()V
    //   63: aload_0
    //   64: invokevirtual 750	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   67: getstatic 853	java/io/File:separator	Ljava/lang/String;
    //   70: invokevirtual 557	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: ldc_w 855
    //   76: invokevirtual 557	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 563	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: ldc_w 857
    //   85: invokespecial 859	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: astore_0
    //   89: aload_0
    //   90: invokevirtual 862	java/io/File:exists	()Z
    //   93: istore_2
    //   94: iload_2
    //   95: ifne +20 -> 115
    //   98: getstatic 110	com/tencent/smtt/sdk/WebView:xXc	Ljava/util/concurrent/locks/Lock;
    //   101: invokeinterface 865 1 0
    //   106: aload 6
    //   108: aload 5
    //   110: invokestatic 868	com/tencent/smtt/utils/f:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   113: iconst_m1
    //   114: ireturn
    //   115: new 870	java/util/Properties
    //   118: dup
    //   119: invokespecial 871	java/util/Properties:<init>	()V
    //   122: astore 7
    //   124: new 873	java/io/FileInputStream
    //   127: dup
    //   128: aload_0
    //   129: invokespecial 876	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   132: astore_3
    //   133: aload_3
    //   134: astore_0
    //   135: aload 7
    //   137: aload_3
    //   138: invokevirtual 880	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   141: aload_3
    //   142: astore_0
    //   143: aload_3
    //   144: invokevirtual 883	java/io/FileInputStream:close	()V
    //   147: aload_3
    //   148: astore_0
    //   149: aload 7
    //   151: ldc_w 885
    //   154: invokevirtual 888	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   157: astore 4
    //   159: aload 4
    //   161: ifnonnull +54 -> 215
    //   164: aload_3
    //   165: invokevirtual 883	java/io/FileInputStream:close	()V
    //   168: getstatic 110	com/tencent/smtt/sdk/WebView:xXc	Ljava/util/concurrent/locks/Lock;
    //   171: invokeinterface 865 1 0
    //   176: aload 6
    //   178: aload 5
    //   180: invokestatic 868	com/tencent/smtt/utils/f:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   183: iconst_m1
    //   184: ireturn
    //   185: astore_0
    //   186: ldc_w 890
    //   189: new 545	java/lang/StringBuilder
    //   192: dup
    //   193: ldc_w 892
    //   196: invokespecial 548	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   199: aload_0
    //   200: invokevirtual 893	java/io/IOException:toString	()Ljava/lang/String;
    //   203: invokevirtual 557	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 563	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokestatic 895	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   212: goto -44 -> 168
    //   215: aload_3
    //   216: astore_0
    //   217: aload 4
    //   219: invokestatic 900	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   222: istore_1
    //   223: aload_3
    //   224: invokevirtual 883	java/io/FileInputStream:close	()V
    //   227: getstatic 110	com/tencent/smtt/sdk/WebView:xXc	Ljava/util/concurrent/locks/Lock;
    //   230: invokeinterface 865 1 0
    //   235: aload 6
    //   237: aload 5
    //   239: invokestatic 868	com/tencent/smtt/utils/f:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   242: iload_1
    //   243: ireturn
    //   244: astore_0
    //   245: ldc_w 890
    //   248: new 545	java/lang/StringBuilder
    //   251: dup
    //   252: ldc_w 892
    //   255: invokespecial 548	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   258: aload_0
    //   259: invokevirtual 893	java/io/IOException:toString	()Ljava/lang/String;
    //   262: invokevirtual 557	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: invokevirtual 563	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   268: invokestatic 895	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   271: goto -44 -> 227
    //   274: astore 4
    //   276: aconst_null
    //   277: astore_3
    //   278: aload_3
    //   279: astore_0
    //   280: ldc_w 890
    //   283: new 545	java/lang/StringBuilder
    //   286: dup
    //   287: ldc_w 902
    //   290: invokespecial 548	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   293: aload 4
    //   295: invokevirtual 903	java/lang/Exception:toString	()Ljava/lang/String;
    //   298: invokevirtual 557	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: invokevirtual 563	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   304: invokestatic 895	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   307: aload_3
    //   308: ifnull +7 -> 315
    //   311: aload_3
    //   312: invokevirtual 883	java/io/FileInputStream:close	()V
    //   315: getstatic 110	com/tencent/smtt/sdk/WebView:xXc	Ljava/util/concurrent/locks/Lock;
    //   318: invokeinterface 865 1 0
    //   323: aload 6
    //   325: aload 5
    //   327: invokestatic 868	com/tencent/smtt/utils/f:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   330: iconst_m1
    //   331: ireturn
    //   332: astore_0
    //   333: ldc_w 890
    //   336: new 545	java/lang/StringBuilder
    //   339: dup
    //   340: ldc_w 892
    //   343: invokespecial 548	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   346: aload_0
    //   347: invokevirtual 893	java/io/IOException:toString	()Ljava/lang/String;
    //   350: invokevirtual 557	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: invokevirtual 563	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: invokestatic 895	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   359: goto -44 -> 315
    //   362: astore_0
    //   363: aload 4
    //   365: astore_3
    //   366: aload_3
    //   367: ifnull +7 -> 374
    //   370: aload_3
    //   371: invokevirtual 883	java/io/FileInputStream:close	()V
    //   374: getstatic 110	com/tencent/smtt/sdk/WebView:xXc	Ljava/util/concurrent/locks/Lock;
    //   377: invokeinterface 865 1 0
    //   382: aload 6
    //   384: aload 5
    //   386: invokestatic 868	com/tencent/smtt/utils/f:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   389: aload_0
    //   390: athrow
    //   391: astore_3
    //   392: ldc_w 890
    //   395: new 545	java/lang/StringBuilder
    //   398: dup
    //   399: ldc_w 892
    //   402: invokespecial 548	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   405: aload_3
    //   406: invokevirtual 893	java/io/IOException:toString	()Ljava/lang/String;
    //   409: invokevirtual 557	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: invokevirtual 563	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   415: invokestatic 895	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   418: goto -44 -> 374
    //   421: aload 6
    //   423: aload 5
    //   425: invokestatic 868	com/tencent/smtt/utils/f:a	(Ljava/nio/channels/FileLock;Ljava/io/FileOutputStream;)V
    //   428: iconst_m1
    //   429: ireturn
    //   430: astore 4
    //   432: aload_0
    //   433: astore_3
    //   434: aload 4
    //   436: astore_0
    //   437: goto -71 -> 366
    //   440: astore 4
    //   442: goto -164 -> 278
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	445	0	paramContext	Context
    //   222	21	1	i	int
    //   93	2	2	bool	boolean
    //   132	239	3	localObject1	Object
    //   391	15	3	localIOException	java.io.IOException
    //   433	1	3	localContext	Context
    //   41	177	4	str	String
    //   274	90	4	localException1	Exception
    //   430	5	4	localObject2	Object
    //   440	1	4	localException2	Exception
    //   8	416	5	localFileOutputStream	FileOutputStream
    //   20	402	6	localFileLock	java.nio.channels.FileLock
    //   122	28	7	localProperties	java.util.Properties
    // Exception table:
    //   from	to	target	type
    //   164	168	185	java/io/IOException
    //   223	227	244	java/io/IOException
    //   43	94	274	java/lang/Exception
    //   115	133	274	java/lang/Exception
    //   311	315	332	java/io/IOException
    //   43	94	362	finally
    //   115	133	362	finally
    //   370	374	391	java/io/IOException
    //   135	141	430	finally
    //   143	147	430	finally
    //   149	159	430	finally
    //   217	223	430	finally
    //   280	307	430	finally
    //   135	141	440	java/lang/Exception
    //   143	147	440	java/lang/Exception
    //   149	159	440	java/lang/Exception
    //   217	223	440	java/lang/Exception
  }
  
  static void he(Context paramContext)
  {
    int i = hd(paramContext);
    if (i != -1) {}
    for (String str = "PV=" + String.valueOf(i + 1);; str = "PV=1")
    {
      paramContext = paramContext.getDir("tbs", 0);
      paramContext = new File(paramContext + File.separator + "core_private", "pv.db");
      try
      {
        paramContext.getParentFile().mkdirs();
        if ((!paramContext.isFile()) || (!paramContext.exists())) {
          paramContext.createNewFile();
        }
        paramContext = new FileOutputStream(paramContext, false);
        xXd = paramContext;
        paramContext.write(str.getBytes());
      }
      finally
      {
        if (xXd != null) {
          xXd.flush();
        }
      }
      try
      {
        if (xXd != null) {
          xXd.flush();
        }
        return;
      }
      catch (Throwable paramContext) {}
    }
  }
  
  private static void hf(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getDir("tbs", 0);
      paramContext = new File(paramContext + File.separator + "core_private", "pv.db");
      if (!paramContext.exists()) {
        return;
      }
      paramContext.delete();
      return;
    }
    catch (Exception paramContext)
    {
      TbsLog.i("getTbsCorePV", "TbsInstaller--getTbsCorePV Exception=" + paramContext.toString());
    }
  }
  
  public static void setSysDayOrNight(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        boolean bool = xXy;
        if (paramBoolean == bool) {
          return;
        }
        xXy = paramBoolean;
        if (xXx == null)
        {
          Paint localPaint = new Paint();
          xXx = localPaint;
          localPaint.setColor(-16777216);
        }
        if (!paramBoolean)
        {
          if (xXx.getAlpha() == NIGHT_MODE_ALPHA) {
            continue;
          }
          xXx.setAlpha(NIGHT_MODE_ALPHA);
          continue;
        }
        if (xXx.getAlpha() == 255) {
          continue;
        }
      }
      finally {}
      xXx.setAlpha(255);
    }
  }
  
  public static void setWebContentsDebuggingEnabled(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    try
    {
      Method localMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("setWebContentsDebuggingEnabled", new Class[] { Boolean.TYPE });
      xXo = localMethod;
      if (localMethod != null)
      {
        xXo.setAccessible(true);
        xXo.invoke(null, new Object[] { Boolean.valueOf(paramBoolean) });
      }
      return;
    }
    catch (Exception localException)
    {
      TbsLog.e("QbSdk", "Exception:" + localException.getStackTrace());
    }
  }
  
  public void addJavascriptInterface(Object paramObject, String paramString)
  {
    if (!this.xXe)
    {
      this.xXg.addJavascriptInterface(paramObject, paramString);
      return;
    }
    this.xXf.addJavascriptInterface(paramObject, paramString);
  }
  
  public void addView(View paramView)
  {
    if (!this.xXe)
    {
      this.xXg.addView(paramView);
      return;
    }
    View localView = this.xXf.getView();
    try
    {
      Method localMethod = com.tencent.smtt.utils.o.b(localView, "addView", new Class[] { View.class });
      localMethod.setAccessible(true);
      localMethod.invoke(localView, new Object[] { paramView });
      return;
    }
    catch (Throwable paramView) {}
  }
  
  public boolean canGoBack()
  {
    if (!this.xXe) {
      return this.xXg.canGoBack();
    }
    return this.xXf.canGoBack();
  }
  
  public boolean canGoBackOrForward(int paramInt)
  {
    if (!this.xXe) {
      return this.xXg.canGoBackOrForward(paramInt);
    }
    return this.xXf.canGoBackOrForward(paramInt);
  }
  
  public boolean canGoForward()
  {
    if (!this.xXe) {
      return this.xXg.canGoForward();
    }
    return this.xXf.canGoForward();
  }
  
  @Deprecated
  public boolean canZoomIn()
  {
    if (!this.xXe)
    {
      if (Build.VERSION.SDK_INT >= 11)
      {
        Object localObject = com.tencent.smtt.utils.o.c(this.xXg, "canZoomIn");
        if (localObject == null) {
          return false;
        }
        return ((Boolean)localObject).booleanValue();
      }
      return false;
    }
    return this.xXf.canZoomIn();
  }
  
  @Deprecated
  public boolean canZoomOut()
  {
    if (!this.xXe)
    {
      if (Build.VERSION.SDK_INT >= 11)
      {
        Object localObject = com.tencent.smtt.utils.o.c(this.xXg, "canZoomOut");
        if (localObject == null) {
          return false;
        }
        return ((Boolean)localObject).booleanValue();
      }
      return false;
    }
    return this.xXf.canZoomOut();
  }
  
  @Deprecated
  public Picture capturePicture()
  {
    if (!this.xXe)
    {
      Object localObject = com.tencent.smtt.utils.o.c(this.xXg, "capturePicture");
      if (localObject == null) {
        return null;
      }
      return (Picture)localObject;
    }
    return this.xXf.capturePicture();
  }
  
  public void clearCache(boolean paramBoolean)
  {
    if (!this.xXe)
    {
      this.xXg.clearCache(paramBoolean);
      return;
    }
    this.xXf.clearCache(paramBoolean);
  }
  
  public void clearFormData()
  {
    if (!this.xXe)
    {
      this.xXg.clearFormData();
      return;
    }
    this.xXf.clearFormData();
  }
  
  public void clearHistory()
  {
    if (!this.xXe)
    {
      this.xXg.clearHistory();
      return;
    }
    this.xXf.clearHistory();
  }
  
  @TargetApi(3)
  public void clearMatches()
  {
    if (!this.xXe)
    {
      this.xXg.clearMatches();
      return;
    }
    this.xXf.clearMatches();
  }
  
  public void clearSslPreferences()
  {
    if (!this.xXe)
    {
      this.xXg.clearSslPreferences();
      return;
    }
    this.xXf.clearSslPreferences();
  }
  
  @Deprecated
  public void clearView()
  {
    if (!this.xXe)
    {
      com.tencent.smtt.utils.o.c(this.xXg, "clearView");
      return;
    }
    this.xXf.clearView();
  }
  
  public int computeHorizontalScrollExtent()
  {
    try
    {
      if (this.xXe)
      {
        localMethod = com.tencent.smtt.utils.o.b(this.xXf.getView(), "computeHorizontalScrollExtent", new Class[0]);
        localMethod.setAccessible(true);
        return ((Integer)localMethod.invoke(this.xXf.getView(), null)).intValue();
      }
      Method localMethod = com.tencent.smtt.utils.o.b(this.xXg, "computeHorizontalScrollExtent", new Class[0]);
      localMethod.setAccessible(true);
      int i = ((Integer)localMethod.invoke(this.xXg, null)).intValue();
      return i;
    }
    catch (Exception localException) {}
    return -1;
  }
  
  public int computeHorizontalScrollOffset()
  {
    try
    {
      if (this.xXe)
      {
        localMethod = com.tencent.smtt.utils.o.b(this.xXf.getView(), "computeHorizontalScrollOffset", new Class[0]);
        localMethod.setAccessible(true);
        return ((Integer)localMethod.invoke(this.xXf.getView(), null)).intValue();
      }
      Method localMethod = com.tencent.smtt.utils.o.b(this.xXg, "computeHorizontalScrollOffset", new Class[0]);
      localMethod.setAccessible(true);
      int i = ((Integer)localMethod.invoke(this.xXg, null)).intValue();
      return i;
    }
    catch (Exception localException) {}
    return -1;
  }
  
  public int computeHorizontalScrollRange()
  {
    try
    {
      if (this.xXe) {
        return ((Integer)com.tencent.smtt.utils.o.a(this.xXf.getView(), "computeHorizontalScrollRange", new Class[0], new Object[0])).intValue();
      }
      Method localMethod = com.tencent.smtt.utils.o.b(this.xXg, "computeHorizontalScrollRange", new Class[0]);
      localMethod.setAccessible(true);
      int i = ((Integer)localMethod.invoke(this.xXg, null)).intValue();
      return i;
    }
    catch (Exception localException) {}
    return -1;
  }
  
  public void computeScroll()
  {
    if (!this.xXe)
    {
      this.xXg.computeScroll();
      return;
    }
    this.xXf.computeScroll();
  }
  
  public int computeVerticalScrollExtent()
  {
    try
    {
      if (this.xXe)
      {
        localMethod = com.tencent.smtt.utils.o.b(this.xXf.getView(), "computeVerticalScrollExtent", new Class[0]);
        localMethod.setAccessible(true);
        return ((Integer)localMethod.invoke(this.xXf.getView(), null)).intValue();
      }
      Method localMethod = com.tencent.smtt.utils.o.b(this.xXg, "computeVerticalScrollExtent", new Class[0]);
      localMethod.setAccessible(true);
      int i = ((Integer)localMethod.invoke(this.xXg, null)).intValue();
      return i;
    }
    catch (Exception localException) {}
    return -1;
  }
  
  public int computeVerticalScrollOffset()
  {
    try
    {
      if (this.xXe)
      {
        localMethod = com.tencent.smtt.utils.o.b(this.xXf.getView(), "computeVerticalScrollOffset", new Class[0]);
        localMethod.setAccessible(true);
        return ((Integer)localMethod.invoke(this.xXf.getView(), null)).intValue();
      }
      Method localMethod = com.tencent.smtt.utils.o.b(this.xXg, "computeVerticalScrollOffset", new Class[0]);
      localMethod.setAccessible(true);
      int i = ((Integer)localMethod.invoke(this.xXg, null)).intValue();
      return i;
    }
    catch (Exception localException) {}
    return -1;
  }
  
  public int computeVerticalScrollRange()
  {
    try
    {
      if (this.xXe) {
        return ((Integer)com.tencent.smtt.utils.o.a(this.xXf.getView(), "computeVerticalScrollRange", new Class[0], new Object[0])).intValue();
      }
      Method localMethod = com.tencent.smtt.utils.o.b(this.xXg, "computeVerticalScrollRange", new Class[0]);
      localMethod.setAccessible(true);
      int i = ((Integer)localMethod.invoke(this.xXg, null)).intValue();
      return i;
    }
    catch (Exception localException) {}
    return -1;
  }
  
  public WebBackForwardList copyBackForwardList()
  {
    if (this.xXe) {
      return WebBackForwardList.a(this.xXf.copyBackForwardList());
    }
    return WebBackForwardList.a(this.xXg.copyBackForwardList());
  }
  
  public Object createPrintDocumentAdapter(String paramString)
  {
    Object localObject = null;
    if (this.xXe) {}
    for (;;)
    {
      try
      {
        localObject = this.xXf.createPrintDocumentAdapter(paramString);
        return localObject;
      }
      catch (Throwable paramString) {}
      if (Build.VERSION.SDK_INT >= 21) {
        return com.tencent.smtt.utils.o.a(this.xXg, "createPrintDocumentAdapter", new Class[] { String.class }, new Object[] { paramString });
      }
    }
    return null;
  }
  
  public void customDiskCachePathEnabled(boolean paramBoolean, String paramString)
  {
    if ((this.xXe) && (getX5WebViewExtension() != null))
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("enabled", paramBoolean);
      localBundle.putString("path", paramString);
      getX5WebViewExtension().invokeMiscMethod("customDiskCachePathEnabled", localBundle);
    }
  }
  
  public void destroy()
  {
    Object localObject4;
    Object localObject1;
    int i;
    if ((!this.xXj) && (this.xXi != 0))
    {
      this.xXj = true;
      String str1 = "";
      String str2 = "";
      String str3 = "";
      localObject4 = str1;
      ??? = str2;
      localObject1 = str3;
      if (this.xXe)
      {
        Bundle localBundle = this.xXf.getX5WebViewExtension().getSdkQBStatisticsInfo();
        localObject4 = str1;
        ??? = str2;
        localObject1 = str3;
        if (localBundle != null)
        {
          localObject4 = localBundle.getString("guid");
          ??? = localBundle.getString("qua2");
          localObject1 = localBundle.getString("lc");
        }
      }
      if ("com.qzone".equals(this.mContext.getApplicationInfo().packageName))
      {
        int j = hd(this.mContext);
        i = j;
        if (j == -1) {
          i = this.xXi;
        }
        this.xXi = i;
        hf(this.mContext);
      }
      com.tencent.smtt.sdk.a.b.a(this.mContext, (String)localObject4, (String)???, (String)localObject1, this.xXi, this.xXe, coQ());
      this.xXi = 0;
      this.xXj = false;
    }
    if (!this.xXe) {}
    try
    {
      localObject1 = Class.forName("android.webkit.WebViewClassic");
      ??? = ((Class)localObject1).getMethod("fromWebView", new Class[] { android.webkit.WebView.class });
      ((Method)???).setAccessible(true);
      ??? = ((Method)???).invoke(null, new Object[] { this.xXg });
      if (??? != null)
      {
        localObject1 = ((Class)localObject1).getDeclaredField("mListBoxDialog");
        ((Field)localObject1).setAccessible(true);
        localObject1 = ((Field)localObject1).get(???);
        if (localObject1 != null)
        {
          localObject1 = (Dialog)localObject1;
          ((Dialog)localObject1).setOnCancelListener(null);
          ??? = Class.forName("android.app.Dialog");
          localObject4 = ((Class)???).getDeclaredField("CANCEL");
          ((Field)localObject4).setAccessible(true);
          i = ((Integer)((Field)localObject4).get(localObject1)).intValue();
          ??? = ((Class)???).getDeclaredField("mListenersHandler");
          ((Field)???).setAccessible(true);
          ((Handler)((Field)???).get(localObject1)).removeMessages(i);
        }
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
    this.xXg.destroy();
    for (;;)
    {
      try
      {
        ??? = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
        ((Field)???).setAccessible(true);
        localObject1 = (ComponentCallbacks)((Field)???).get(null);
        if (localObject1 != null)
        {
          ((Field)???).set(null, null);
          ??? = Class.forName("android.view.ViewRoot").getDeclaredField("sConfigCallbacks");
          ((Field)???).setAccessible(true);
          ??? = ((Field)???).get(null);
          if (??? == null) {}
        }
      }
      catch (Exception localException1)
      {
        continue;
      }
      synchronized ((List)???)
      {
        ((List)???).remove(localObject1);
        TbsLog.i("WebView", "X5 GUID = " + QbSdk.cnO());
        return;
      }
      this.xXf.destroy();
    }
  }
  
  public void documentHasImages(Message paramMessage)
  {
    if (!this.xXe)
    {
      this.xXg.documentHasImages(paramMessage);
      return;
    }
    this.xXf.documentHasImages(paramMessage);
  }
  
  public void dumpViewHierarchyWithProperties(BufferedWriter paramBufferedWriter, int paramInt)
  {
    if (!this.xXe)
    {
      com.tencent.smtt.utils.o.a(this.xXg, "dumpViewHierarchyWithProperties", new Class[] { BufferedWriter.class, Integer.TYPE }, new Object[] { paramBufferedWriter, Integer.valueOf(paramInt) });
      return;
    }
    this.xXf.dumpViewHierarchyWithProperties(paramBufferedWriter, paramInt);
  }
  
  public void evaluateJavascript(String paramString, x<String> paramx)
  {
    if (this.xXe) {}
    Method localMethod;
    while (Build.VERSION.SDK_INT < 19) {
      try
      {
        localMethod = com.tencent.smtt.utils.o.b(this.xXf.getView(), "evaluateJavascript", new Class[] { String.class, ValueCallback.class });
        localMethod.setAccessible(true);
        localMethod.invoke(this.xXf.getView(), new Object[] { paramString, paramx });
        return;
      }
      catch (Exception paramx)
      {
        loadUrl(paramString);
        return;
      }
    }
    try
    {
      localMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("evaluateJavascript", new Class[] { String.class, ValueCallback.class });
      localMethod.setAccessible(true);
      localMethod.invoke(this.xXg, new Object[] { paramString, paramx });
      return;
    }
    catch (Exception paramString) {}
  }
  
  @Deprecated
  public int findAll(String paramString)
  {
    if (!this.xXe)
    {
      paramString = com.tencent.smtt.utils.o.a(this.xXg, "findAll", new Class[] { String.class }, new Object[] { paramString });
      if (paramString == null) {
        return 0;
      }
      return ((Integer)paramString).intValue();
    }
    return this.xXf.findAll(paramString);
  }
  
  @TargetApi(16)
  public void findAllAsync(String paramString)
  {
    if (!this.xXe)
    {
      if (Build.VERSION.SDK_INT >= 16) {
        com.tencent.smtt.utils.o.a(this.xXg, "findAllAsync", new Class[] { String.class }, new Object[] { paramString });
      }
      return;
    }
    this.xXf.findAllAsync(paramString);
  }
  
  public View findHierarchyView(String paramString, int paramInt)
  {
    if (!this.xXe) {
      return (View)com.tencent.smtt.utils.o.a(this.xXg, "findHierarchyView", new Class[] { String.class, Integer.TYPE }, new Object[] { paramString, Integer.valueOf(paramInt) });
    }
    return this.xXf.findHierarchyView(paramString, paramInt);
  }
  
  @TargetApi(3)
  public void findNext(boolean paramBoolean)
  {
    if (!this.xXe)
    {
      this.xXg.findNext(paramBoolean);
      return;
    }
    this.xXf.findNext(paramBoolean);
  }
  
  public void flingScroll(int paramInt1, int paramInt2)
  {
    if (!this.xXe)
    {
      this.xXg.flingScroll(paramInt1, paramInt2);
      return;
    }
    this.xXf.flingScroll(paramInt1, paramInt2);
  }
  
  @Deprecated
  public void freeMemory()
  {
    if (!this.xXe)
    {
      com.tencent.smtt.utils.o.c(this.xXg, "freeMemory");
      return;
    }
    this.xXf.freeMemory();
  }
  
  public SslCertificate getCertificate()
  {
    if (!this.xXe) {
      return this.xXg.getCertificate();
    }
    return this.xXf.getCertificate();
  }
  
  public int getContentHeight()
  {
    if (!this.xXe) {
      return this.xXg.getContentHeight();
    }
    return this.xXf.getContentHeight();
  }
  
  public int getContentWidth()
  {
    if (!this.xXe)
    {
      Object localObject = com.tencent.smtt.utils.o.c(this.xXg, "getContentWidth");
      if (localObject == null) {
        return 0;
      }
      return ((Integer)localObject).intValue();
    }
    return this.xXf.getContentWidth();
  }
  
  public Bitmap getFavicon()
  {
    if (!this.xXe) {
      return this.xXg.getFavicon();
    }
    return this.xXf.getFavicon();
  }
  
  public HitTestResult getHitTestResult()
  {
    if (!this.xXe) {
      return new HitTestResult(this.xXg.getHitTestResult());
    }
    return new HitTestResult(this.xXf.getHitTestResult());
  }
  
  public String[] getHttpAuthUsernamePassword(String paramString1, String paramString2)
  {
    if (!this.xXe) {
      return this.xXg.getHttpAuthUsernamePassword(paramString1, paramString2);
    }
    return this.xXf.getHttpAuthUsernamePassword(paramString1, paramString2);
  }
  
  @TargetApi(3)
  public String getOriginalUrl()
  {
    if (!this.xXe) {
      return this.xXg.getOriginalUrl();
    }
    return this.xXf.getOriginalUrl();
  }
  
  public int getProgress()
  {
    if (!this.xXe) {
      return this.xXg.getProgress();
    }
    return this.xXf.getProgress();
  }
  
  public boolean getRendererPriorityWaivedWhenNotVisible()
  {
    try
    {
      if (!this.xXe)
      {
        if (Build.VERSION.SDK_INT < 26) {
          return false;
        }
        Object localObject = com.tencent.smtt.utils.o.c(this.xXg, "getRendererPriorityWaivedWhenNotVisible");
        if (localObject == null) {
          return false;
        }
        boolean bool = ((Boolean)localObject).booleanValue();
        return bool;
      }
      return false;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public int getRendererRequestedPriority()
  {
    try
    {
      if (!this.xXe)
      {
        if (Build.VERSION.SDK_INT < 26) {
          return 0;
        }
        Object localObject = com.tencent.smtt.utils.o.c(this.xXg, "getRendererRequestedPriority");
        if (localObject == null) {
          return 0;
        }
        int i = ((Integer)localObject).intValue();
        return i;
      }
      return 0;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  @Deprecated
  public float getScale()
  {
    if (!this.xXe)
    {
      Object localObject = com.tencent.smtt.utils.o.c(this.xXg, "getScale");
      if (localObject == null) {
        return 0.0F;
      }
      return ((Float)localObject).floatValue();
    }
    return this.xXf.getScale();
  }
  
  public int getScrollBarDefaultDelayBeforeFade()
  {
    if (getView() == null) {
      return 0;
    }
    return getView().getScrollBarDefaultDelayBeforeFade();
  }
  
  public int getScrollBarFadeDuration()
  {
    if (getView() == null) {
      return 0;
    }
    return getView().getScrollBarFadeDuration();
  }
  
  public int getScrollBarSize()
  {
    if (getView() == null) {
      return 0;
    }
    return getView().getScrollBarSize();
  }
  
  public int getScrollBarStyle()
  {
    if (getView() == null) {
      return 0;
    }
    return getView().getScrollBarStyle();
  }
  
  public WebSettings getSettings()
  {
    if (this.xXh != null) {
      return this.xXh;
    }
    if (this.xXe)
    {
      localWebSettings = new WebSettings(this.xXf.getSettings());
      this.xXh = localWebSettings;
      return localWebSettings;
    }
    WebSettings localWebSettings = new WebSettings(this.xXg.getSettings());
    this.xXh = localWebSettings;
    return localWebSettings;
  }
  
  public IX5WebSettingsExtension getSettingsExtension()
  {
    if (!this.xXe) {
      return null;
    }
    return this.xXf.getX5WebViewExtension().getSettingsExtension();
  }
  
  public int getSysNightModeAlpha()
  {
    return NIGHT_MODE_ALPHA;
  }
  
  public String getTitle()
  {
    if (!this.xXe) {
      return this.xXg.getTitle();
    }
    return this.xXf.getTitle();
  }
  
  public String getUrl()
  {
    if (!this.xXe) {
      return this.xXg.getUrl();
    }
    return this.xXf.getUrl();
  }
  
  public View getView()
  {
    if (!this.xXe) {
      return this.xXg;
    }
    return this.xXf.getView();
  }
  
  public int getVisibleTitleHeight()
  {
    if (!this.xXe)
    {
      Object localObject = com.tencent.smtt.utils.o.c(this.xXg, "getVisibleTitleHeight");
      if (localObject == null) {
        return 0;
      }
      return ((Integer)localObject).intValue();
    }
    return this.xXf.getVisibleTitleHeight();
  }
  
  public WebChromeClient getWebChromeClient()
  {
    return this.xXq;
  }
  
  public IX5WebChromeClientExtension getWebChromeClientExtension()
  {
    if (!this.xXe) {
      return null;
    }
    return this.xXf.getX5WebViewExtension().getWebChromeClientExtension();
  }
  
  public int getWebScrollX()
  {
    if (this.xXe) {
      return this.xXf.getView().getScrollX();
    }
    return this.xXg.getScrollX();
  }
  
  public int getWebScrollY()
  {
    if (this.xXe) {
      return this.xXf.getView().getScrollY();
    }
    return this.xXg.getScrollY();
  }
  
  public WebViewClient getWebViewClient()
  {
    return this.xXp;
  }
  
  public IX5WebViewClientExtension getWebViewClientExtension()
  {
    if (!this.xXe) {
      return null;
    }
    return this.xXf.getX5WebViewExtension().getWebViewClientExtension();
  }
  
  public IX5WebViewExtension getX5WebViewExtension()
  {
    if (!this.xXe) {
      return null;
    }
    return this.xXf.getX5WebViewExtension();
  }
  
  @Deprecated
  public View getZoomControls()
  {
    if (!this.xXe) {
      return (View)com.tencent.smtt.utils.o.c(this.xXg, "getZoomControls");
    }
    return this.xXf.getZoomControls();
  }
  
  public void goBack()
  {
    if (!this.xXe)
    {
      this.xXg.goBack();
      return;
    }
    this.xXf.goBack();
  }
  
  public void goBackOrForward(int paramInt)
  {
    if (!this.xXe)
    {
      this.xXg.goBackOrForward(paramInt);
      return;
    }
    this.xXf.goBackOrForward(paramInt);
  }
  
  public void goForward()
  {
    if (!this.xXe)
    {
      this.xXg.goForward();
      return;
    }
    this.xXf.goForward();
  }
  
  public void invokeZoomPicker()
  {
    if (!this.xXe)
    {
      this.xXg.invokeZoomPicker();
      return;
    }
    this.xXf.invokeZoomPicker();
  }
  
  public boolean isDayMode()
  {
    return xXy;
  }
  
  public boolean isPrivateBrowsingEnabled()
  {
    if (!this.xXe)
    {
      if (Build.VERSION.SDK_INT >= 11)
      {
        Object localObject = com.tencent.smtt.utils.o.c(this.xXg, "isPrivateBrowsingEnabled");
        if (localObject == null) {
          return false;
        }
        return ((Boolean)localObject).booleanValue();
      }
      return false;
    }
    return this.xXf.isPrivateBrowsingEnable();
  }
  
  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    if (!this.xXe)
    {
      this.xXg.loadData(paramString1, paramString2, paramString3);
      return;
    }
    this.xXf.loadData(paramString1, paramString2, paramString3);
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    if (!this.xXe)
    {
      this.xXg.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
      return;
    }
    this.xXf.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public void loadUrl(String paramString)
  {
    if ((this.xXe) && (this.xXk != null)) {
      this.xXk.aR(this.xXf.hashCode(), paramString);
    }
    if ((paramString == null) || (showDebugView(paramString))) {
      return;
    }
    if (!this.xXe)
    {
      this.xXg.loadUrl(paramString);
      return;
    }
    this.xXf.loadUrl(paramString);
  }
  
  @TargetApi(8)
  public void loadUrl(String paramString, Map<String, String> paramMap)
  {
    if ((this.xXe) && (this.xXk != null)) {
      this.xXk.aR(this.xXf.hashCode(), paramString);
    }
    if ((paramString == null) || (showDebugView(paramString))) {}
    do
    {
      return;
      if (this.xXe) {
        break;
      }
    } while (Build.VERSION.SDK_INT < 8);
    this.xXg.loadUrl(paramString, paramMap);
    return;
    this.xXf.loadUrl(paramString, paramMap);
  }
  
  protected void onDetachedFromWindow()
  {
    if ((!this.xXj) && (this.xXi != 0))
    {
      this.xXj = true;
      String str4 = "";
      String str5 = "";
      String str6 = "";
      String str3 = str4;
      String str2 = str5;
      String str1 = str6;
      if (this.xXe)
      {
        Bundle localBundle = this.xXf.getX5WebViewExtension().getSdkQBStatisticsInfo();
        str3 = str4;
        str2 = str5;
        str1 = str6;
        if (localBundle != null)
        {
          str3 = localBundle.getString("guid");
          str2 = localBundle.getString("qua2");
          str1 = localBundle.getString("lc");
        }
      }
      if ("com.qzone".equals(this.mContext.getApplicationInfo().packageName))
      {
        int j = hd(this.mContext);
        int i = j;
        if (j == -1) {
          i = this.xXi;
        }
        this.xXi = i;
        hf(this.mContext);
      }
      com.tencent.smtt.sdk.a.b.a(this.mContext, str3, str2, str1, this.xXi, this.xXe, coQ());
      this.xXi = 0;
      this.xXj = false;
    }
    super.onDetachedFromWindow();
  }
  
  public boolean onLongClick(View paramView)
  {
    if (this.xXA != null)
    {
      if (!this.xXA.onLongClick(paramView)) {
        return dK(paramView);
      }
      return true;
    }
    return dK(paramView);
  }
  
  public void onPause()
  {
    if (!this.xXe)
    {
      com.tencent.smtt.utils.o.c(this.xXg, "onPause");
      return;
    }
    this.xXf.onPause();
  }
  
  public void onResume()
  {
    if (!this.xXe)
    {
      com.tencent.smtt.utils.o.c(this.xXg, "onResume");
      return;
    }
    this.xXf.onResume();
  }
  
  @TargetApi(11)
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((Build.VERSION.SDK_INT >= 21) && (hc(this.mContext)) && (isHardwareAccelerated()) && (paramInt1 > 0) && (paramInt2 > 0)) {
      getLayerType();
    }
  }
  
  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    if (this.mContext == null)
    {
      super.onVisibilityChanged(paramView, paramInt);
      return;
    }
    if (xXr == null) {
      xXr = this.mContext.getApplicationInfo().packageName;
    }
    if ((xXr != null) && ((xXr.equals("com.tencent.mm")) || (xXr.equals("com.tencent.mobileqq"))))
    {
      super.onVisibilityChanged(paramView, paramInt);
      return;
    }
    if ((paramInt != 0) && (!this.xXj) && (this.xXi != 0))
    {
      this.xXj = true;
      String str4 = "";
      String str5 = "";
      String str6 = "";
      String str3 = str4;
      String str2 = str5;
      String str1 = str6;
      if (this.xXe)
      {
        Bundle localBundle = this.xXf.getX5WebViewExtension().getSdkQBStatisticsInfo();
        str3 = str4;
        str2 = str5;
        str1 = str6;
        if (localBundle != null)
        {
          str3 = localBundle.getString("guid");
          str2 = localBundle.getString("qua2");
          str1 = localBundle.getString("lc");
        }
      }
      if ("com.qzone".equals(this.mContext.getApplicationInfo().packageName))
      {
        int j = hd(this.mContext);
        int i = j;
        if (j == -1) {
          i = this.xXi;
        }
        this.xXi = i;
        hf(this.mContext);
      }
      com.tencent.smtt.sdk.a.b.a(this.mContext, str3, str2, str1, this.xXi, this.xXe, coQ());
      this.xXi = 0;
      this.xXj = false;
    }
    super.onVisibilityChanged(paramView, paramInt);
  }
  
  public boolean overlayHorizontalScrollbar()
  {
    if (!this.xXe) {
      return this.xXg.overlayHorizontalScrollbar();
    }
    return this.xXf.overlayHorizontalScrollbar();
  }
  
  public boolean overlayVerticalScrollbar()
  {
    if (this.xXe) {
      return this.xXf.overlayVerticalScrollbar();
    }
    return this.xXg.overlayVerticalScrollbar();
  }
  
  public boolean pageDown(boolean paramBoolean)
  {
    if (!this.xXe) {
      return this.xXg.pageDown(paramBoolean);
    }
    return this.xXf.pageDown(paramBoolean, -1);
  }
  
  public boolean pageUp(boolean paramBoolean)
  {
    if (!this.xXe) {
      return this.xXg.pageUp(paramBoolean);
    }
    return this.xXf.pageUp(paramBoolean, -1);
  }
  
  public void pauseTimers()
  {
    if (!this.xXe)
    {
      this.xXg.pauseTimers();
      return;
    }
    this.xXf.pauseTimers();
  }
  
  @TargetApi(5)
  public void postUrl(String paramString, byte[] paramArrayOfByte)
  {
    if (!this.xXe)
    {
      this.xXg.postUrl(paramString, paramArrayOfByte);
      return;
    }
    this.xXf.postUrl(paramString, paramArrayOfByte);
  }
  
  @Deprecated
  public void refreshPlugins(boolean paramBoolean)
  {
    if (!this.xXe)
    {
      com.tencent.smtt.utils.o.a(this.xXg, "refreshPlugins", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    }
    this.xXf.refreshPlugins(paramBoolean);
  }
  
  public void reload()
  {
    if (!this.xXe)
    {
      this.xXg.reload();
      return;
    }
    this.xXf.reload();
  }
  
  @TargetApi(11)
  public void removeJavascriptInterface(String paramString)
  {
    if (!this.xXe)
    {
      if (Build.VERSION.SDK_INT >= 11) {
        com.tencent.smtt.utils.o.a(this.xXg, "removeJavascriptInterface", new Class[] { String.class }, new Object[] { paramString });
      }
    }
    else {
      return;
    }
    this.xXf.removeJavascriptInterface(paramString);
  }
  
  public void removeView(View paramView)
  {
    if (!this.xXe)
    {
      this.xXg.removeView(paramView);
      return;
    }
    View localView = this.xXf.getView();
    try
    {
      Method localMethod = com.tencent.smtt.utils.o.b(localView, "removeView", new Class[] { View.class });
      localMethod.setAccessible(true);
      localMethod.invoke(localView, new Object[] { paramView });
      return;
    }
    catch (Throwable paramView) {}
  }
  
  public void reportInitPerformance(long paramLong1, int paramInt, long paramLong2, long paramLong3)
  {
    TbsLog.i("sdkreport", "reportInitPerformance initType is " + paramLong1 + " isX5Core is " + this.xXe + " isPerformanceDataRecorded" + this.xXl);
    if ((this.xXe) && (this.xXk != null))
    {
      this.xXk.ao("init_type", paramLong1);
      this.xXk.ao("time_oncreate", paramLong2);
      this.xXk.ao("webview_type", paramInt);
      this.xXk.ao("time_webaccelerator", paramLong3);
      this.xXk.aR(this.xXf.hashCode(), getUrl());
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    if (this.xXe)
    {
      localObject1 = this.xXf.getView();
      if ((localObject1 instanceof ViewGroup))
      {
        localObject2 = (ViewGroup)localObject1;
        if (paramView == this) {
          paramView = (View)localObject1;
        }
        for (;;)
        {
          return ((ViewGroup)localObject2).requestChildRectangleOnScreen(paramView, paramRect, paramBoolean);
        }
      }
      return false;
    }
    Object localObject2 = this.xXg;
    Object localObject1 = paramView;
    if (paramView == this) {
      localObject1 = this.xXg;
    }
    return ((android.webkit.WebView)localObject2).requestChildRectangleOnScreen((View)localObject1, paramRect, paramBoolean);
  }
  
  public void requestFocusNodeHref(Message paramMessage)
  {
    if (!this.xXe)
    {
      this.xXg.requestFocusNodeHref(paramMessage);
      return;
    }
    this.xXf.requestFocusNodeHref(paramMessage);
  }
  
  public void requestImageRef(Message paramMessage)
  {
    if (!this.xXe)
    {
      this.xXg.requestImageRef(paramMessage);
      return;
    }
    this.xXf.requestImageRef(paramMessage);
  }
  
  @Deprecated
  public boolean restorePicture(Bundle paramBundle, File paramFile)
  {
    if (!this.xXe)
    {
      paramBundle = com.tencent.smtt.utils.o.a(this.xXg, "restorePicture", new Class[] { Bundle.class, File.class }, new Object[] { paramBundle, paramFile });
      if (paramBundle == null) {
        return false;
      }
      return ((Boolean)paramBundle).booleanValue();
    }
    return this.xXf.restorePicture(paramBundle, paramFile);
  }
  
  public WebBackForwardList restoreState(Bundle paramBundle)
  {
    if (!this.xXe) {
      return WebBackForwardList.a(this.xXg.restoreState(paramBundle));
    }
    return WebBackForwardList.a(this.xXf.restoreState(paramBundle));
  }
  
  public void resumeTimers()
  {
    if (!this.xXe)
    {
      this.xXg.resumeTimers();
      return;
    }
    this.xXf.resumeTimers();
  }
  
  @Deprecated
  public void savePassword(String paramString1, String paramString2, String paramString3)
  {
    if (!this.xXe)
    {
      com.tencent.smtt.utils.o.a(this.xXg, "savePassword", new Class[] { String.class, String.class, String.class }, new Object[] { paramString1, paramString2, paramString3 });
      return;
    }
    this.xXf.savePassword(paramString1, paramString2, paramString3);
  }
  
  @Deprecated
  public boolean savePicture(Bundle paramBundle, File paramFile)
  {
    if (!this.xXe)
    {
      paramBundle = com.tencent.smtt.utils.o.a(this.xXg, "savePicture", new Class[] { Bundle.class, File.class }, new Object[] { paramBundle, paramFile });
      if (paramBundle == null) {
        return false;
      }
      return ((Boolean)paramBundle).booleanValue();
    }
    return this.xXf.savePicture(paramBundle, paramFile);
  }
  
  public WebBackForwardList saveState(Bundle paramBundle)
  {
    if (!this.xXe) {
      return WebBackForwardList.a(this.xXg.saveState(paramBundle));
    }
    return WebBackForwardList.a(this.xXf.saveState(paramBundle));
  }
  
  @TargetApi(11)
  public void saveWebArchive(String paramString)
  {
    if (!this.xXe)
    {
      if (Build.VERSION.SDK_INT >= 11) {
        com.tencent.smtt.utils.o.a(this.xXg, "saveWebArchive", new Class[] { String.class }, new Object[] { paramString });
      }
      return;
    }
    this.xXf.saveWebArchive(paramString);
  }
  
  @TargetApi(11)
  public void saveWebArchive(String paramString, boolean paramBoolean, x<String> paramx)
  {
    if (!this.xXe)
    {
      if (Build.VERSION.SDK_INT >= 11) {
        com.tencent.smtt.utils.o.a(this.xXg, "saveWebArchive", new Class[] { String.class, Boolean.TYPE, ValueCallback.class }, new Object[] { paramString, Boolean.valueOf(paramBoolean), paramx });
      }
      return;
    }
    this.xXf.saveWebArchive(paramString, paramBoolean, paramx);
  }
  
  public void setARModeEnable(boolean paramBoolean)
  {
    try
    {
      if (this.xXe) {
        getSettingsExtension().setARModeEnable(paramBoolean);
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void setBackgroundColor(int paramInt)
  {
    if (!this.xXe) {
      this.xXg.setBackgroundColor(paramInt);
    }
    for (;;)
    {
      super.setBackgroundColor(paramInt);
      return;
      this.xXf.setBackgroundColor(paramInt);
    }
  }
  
  @Deprecated
  public void setCertificate(SslCertificate paramSslCertificate)
  {
    if (!this.xXe)
    {
      this.xXg.setCertificate(paramSslCertificate);
      return;
    }
    this.xXf.setCertificate(paramSslCertificate);
  }
  
  public void setDayOrNight(boolean paramBoolean)
  {
    try
    {
      if (this.xXe) {
        getSettingsExtension().setDayOrNight(paramBoolean);
      }
      setSysDayOrNight(paramBoolean);
      getView().postInvalidate();
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void setDownloadListener(final DownloadListener paramDownloadListener)
  {
    if (!this.xXe)
    {
      this.xXg.setDownloadListener(new android.webkit.DownloadListener()
      {
        public void onDownloadStart(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, String paramAnonymousString4, long paramAnonymousLong)
        {
          if (paramDownloadListener == null)
          {
            c.a(WebView.a(WebView.this), paramAnonymousString1, null, null);
            return;
          }
          paramDownloadListener.onDownloadStart(paramAnonymousString1, paramAnonymousString2, paramAnonymousString3, paramAnonymousString4, paramAnonymousLong);
        }
      });
      return;
    }
    this.xXf.setDownloadListener(new b(this, paramDownloadListener));
  }
  
  @TargetApi(16)
  public void setFindListener(final IX5WebViewBase.FindListener paramFindListener)
  {
    if (!this.xXe)
    {
      if (Build.VERSION.SDK_INT >= 16) {
        this.xXg.setFindListener(new WebView.FindListener()
        {
          public void onFindResultReceived(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean)
          {
            paramFindListener.onFindResultReceived(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean);
          }
        });
      }
      return;
    }
    this.xXf.setFindListener(paramFindListener);
  }
  
  public void setHorizontalScrollbarOverlay(boolean paramBoolean)
  {
    if (!this.xXe)
    {
      this.xXg.setHorizontalScrollbarOverlay(paramBoolean);
      return;
    }
    this.xXf.setHorizontalScrollbarOverlay(paramBoolean);
  }
  
  public void setHttpAuthUsernamePassword(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (!this.xXe)
    {
      this.xXg.setHttpAuthUsernamePassword(paramString1, paramString2, paramString3, paramString4);
      return;
    }
    this.xXf.setHttpAuthUsernamePassword(paramString1, paramString2, paramString3, paramString4);
  }
  
  public void setInitialScale(int paramInt)
  {
    if (!this.xXe)
    {
      this.xXg.setInitialScale(paramInt);
      return;
    }
    this.xXf.setInitialScale(paramInt);
  }
  
  @Deprecated
  public void setMapTrackballToArrowKeys(boolean paramBoolean)
  {
    if (!this.xXe)
    {
      com.tencent.smtt.utils.o.a(this.xXg, "setMapTrackballToArrowKeys", new Class[] { Boolean.TYPE }, new Object[] { Boolean.valueOf(paramBoolean) });
      return;
    }
    this.xXf.setMapTrackballToArrowKeys(paramBoolean);
  }
  
  public void setNetworkAvailable(boolean paramBoolean)
  {
    if (!this.xXe)
    {
      if (Build.VERSION.SDK_INT >= 3) {
        this.xXg.setNetworkAvailable(paramBoolean);
      }
      return;
    }
    this.xXf.setNetworkAvailable(paramBoolean);
  }
  
  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    if (!this.xXe)
    {
      this.xXg.setOnLongClickListener(paramOnLongClickListener);
      return;
    }
    Object localObject1 = this.xXf.getView();
    try
    {
      if (this.xXz == null)
      {
        Object localObject2 = com.tencent.smtt.utils.o.b(localObject1, "getListenerInfo", new Class[0]);
        ((Method)localObject2).setAccessible(true);
        localObject1 = ((Method)localObject2).invoke(localObject1, null);
        localObject2 = localObject1.getClass().getDeclaredField("mOnLongClickListener");
        ((Field)localObject2).setAccessible(true);
        this.xXz = ((Field)localObject2).get(localObject1);
      }
      this.xXA = paramOnLongClickListener;
      getView().setOnLongClickListener(this);
      return;
    }
    catch (Throwable paramOnLongClickListener) {}
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    getView().setOnTouchListener(paramOnTouchListener);
  }
  
  public void setPictureListener(final PictureListener paramPictureListener)
  {
    if (!this.xXe)
    {
      if (paramPictureListener == null)
      {
        this.xXg.setPictureListener(null);
        return;
      }
      this.xXg.setPictureListener(new android.webkit.WebView.PictureListener()
      {
        public void onNewPicture(android.webkit.WebView paramAnonymousWebView, Picture paramAnonymousPicture)
        {
          paramPictureListener.onNewPicture(WebView.this, paramAnonymousPicture);
        }
      });
      return;
    }
    if (paramPictureListener == null)
    {
      this.xXf.setPictureListener(null);
      return;
    }
    this.xXf.setPictureListener(new IX5WebViewBase.PictureListener()
    {
      public void onNewPicture(IX5WebViewBase paramAnonymousIX5WebViewBase, Picture paramAnonymousPicture, boolean paramAnonymousBoolean)
      {
        WebView.this.xXf = paramAnonymousIX5WebViewBase;
        paramPictureListener.onNewPicture(WebView.this, paramAnonymousPicture);
      }
      
      public void onNewPictureIfHaveContent(IX5WebViewBase paramAnonymousIX5WebViewBase, Picture paramAnonymousPicture) {}
    });
  }
  
  public void setRendererPriorityPolicy(int paramInt, boolean paramBoolean)
  {
    try
    {
      if (!this.xXe)
      {
        if (Build.VERSION.SDK_INT < 26) {
          return;
        }
        com.tencent.smtt.utils.o.a(this.xXg, "setRendererPriorityPolicy", new Class[] { Integer.TYPE, Boolean.TYPE }, new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
        return;
      }
    }
    catch (Exception localException) {}
  }
  
  public void setScrollBarStyle(int paramInt)
  {
    if (this.xXe)
    {
      this.xXf.getView().setScrollBarStyle(paramInt);
      return;
    }
    this.xXg.setScrollBarStyle(paramInt);
  }
  
  public void setSysNightModeAlpha(int paramInt)
  {
    NIGHT_MODE_ALPHA = paramInt;
  }
  
  public void setVerticalScrollbarOverlay(boolean paramBoolean)
  {
    if (!this.xXe)
    {
      this.xXg.setVerticalScrollbarOverlay(paramBoolean);
      return;
    }
    this.xXf.setVerticalScrollbarOverlay(paramBoolean);
  }
  
  public boolean setVideoFullScreen(Context paramContext, boolean paramBoolean)
  {
    if ((paramContext.getApplicationInfo().processName.contains("com.tencent.android.qqdownloader")) && (this.xXf != null))
    {
      paramContext = new Bundle();
      if (paramBoolean) {
        paramContext.putInt("DefaultVideoScreen", 2);
      }
      for (;;)
      {
        this.xXf.getX5WebViewExtension().invokeMiscMethod("setVideoParams", paramContext);
        return true;
        paramContext.putInt("DefaultVideoScreen", 1);
      }
    }
    return false;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (getView() == null) {
      return;
    }
    getView().setVisibility(paramInt);
  }
  
  public void setWebChromeClient(WebChromeClient paramWebChromeClient)
  {
    IX5WebViewBase localIX5WebViewBase = null;
    Object localObject = null;
    if (this.xXe)
    {
      localIX5WebViewBase = this.xXf;
      if (paramWebChromeClient == null)
      {
        localIX5WebViewBase.setWebChromeClient((IX5WebChromeClient)localObject);
        this.xXq = paramWebChromeClient;
        return;
      }
      localObject = ab.coW().xXD;
      if (((ac)localObject).xWV == null) {
        localObject = null;
      }
      for (;;)
      {
        localObject = new e((IX5WebChromeClient)localObject, this, paramWebChromeClient);
        break;
        localObject = ((ac)localObject).xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDefaultX5WebChromeClient", new Class[0], new Object[0]);
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = (IX5WebChromeClient)localObject;
        }
      }
    }
    SystemWebView localSystemWebView = this.xXg;
    if (paramWebChromeClient == null) {}
    for (localObject = localIX5WebViewBase;; localObject = new SystemWebChromeClient(this, paramWebChromeClient))
    {
      localSystemWebView.setWebChromeClient((android.webkit.WebChromeClient)localObject);
      break;
    }
  }
  
  public void setWebChromeClientExtension(IX5WebChromeClientExtension paramIX5WebChromeClientExtension)
  {
    if (!this.xXe) {
      return;
    }
    this.xXf.getX5WebViewExtension().setWebChromeClientExtension(paramIX5WebChromeClientExtension);
  }
  
  public void setWebViewCallbackClient(aa paramaa)
  {
    this.mWebViewCallbackClient = paramaa;
    if ((this.xXe) && (getX5WebViewExtension() != null))
    {
      paramaa = new Bundle();
      paramaa.putBoolean("flag", true);
      getX5WebViewExtension().invokeMiscMethod("setWebViewCallbackClientFlag", paramaa);
    }
  }
  
  public void setWebViewClient(WebViewClient paramWebViewClient)
  {
    IX5WebViewBase localIX5WebViewBase = null;
    Object localObject = null;
    if (this.xXe)
    {
      localIX5WebViewBase = this.xXf;
      if (paramWebViewClient == null)
      {
        localIX5WebViewBase.setWebViewClient((IX5WebViewClient)localObject);
        this.xXp = paramWebViewClient;
        return;
      }
      localObject = ab.coW().xXD.xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createDefaultX5WebViewClient", new Class[0], new Object[0]);
      if (localObject == null) {}
      for (localObject = null;; localObject = (IX5WebViewClient)localObject)
      {
        localObject = new f((IX5WebViewClient)localObject, this, paramWebViewClient);
        break;
      }
    }
    SystemWebView localSystemWebView = this.xXg;
    if (paramWebViewClient == null) {}
    for (localObject = localIX5WebViewBase;; localObject = new SystemWebViewClient(this, paramWebViewClient))
    {
      localSystemWebView.setWebViewClient((android.webkit.WebViewClient)localObject);
      break;
    }
  }
  
  public void setWebViewClientExtension(IX5WebViewClientExtension paramIX5WebViewClientExtension)
  {
    if (!this.xXe) {
      return;
    }
    this.xXf.getX5WebViewExtension().setWebViewClientExtension(paramIX5WebViewClientExtension);
  }
  
  @SuppressLint({"NewApi"})
  public boolean showDebugView(String paramString)
  {
    boolean bool2 = false;
    paramString = paramString.toLowerCase();
    boolean bool1;
    if (paramString.startsWith("http://debugtbs.qq.com"))
    {
      getView().setVisibility(4);
      com.tencent.smtt.utils.e.ht(this.mContext).a(paramString, this, this.mContext, n.cou().getLooper());
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!paramString.startsWith("http://debugx5.qq.com"));
      bool1 = bool2;
    } while (this.xXe);
    paramString = new StringBuilder();
    paramString.append("<!DOCTYPE html><html><body>");
    paramString.append("<head>");
    paramString.append("<title>无法打开debugx5</title>");
    paramString.append("<meta name=\"viewport\" content=\"width=device-width, user-scalable=no\" />");
    paramString.append("</head>");
    paramString.append("<br/><br /><h2>debugx5页面仅在使用了X5内核时有效，由于当前没有使用X5内核，无法打开debugx5！</h2><br />");
    paramString.append("尝试<a href=\"http://debugtbs.qq.com?10000\">进入DebugTbs安装或打开X5内核</a>");
    paramString.append("</body></html>");
    loadDataWithBaseURL(null, paramString.toString(), "text/html", "utf-8", null);
    return true;
  }
  
  public boolean showFindDialog(String paramString, boolean paramBoolean)
  {
    return false;
  }
  
  public void stopLoading()
  {
    if (!this.xXe)
    {
      this.xXg.stopLoading();
      return;
    }
    this.xXf.stopLoading();
  }
  
  public void super_computeScroll()
  {
    if (!this.xXe)
    {
      this.xXg.super_computeScroll();
      return;
    }
    View localView = this.xXf.getView();
    try
    {
      com.tencent.smtt.utils.o.c(localView, "super_computeScroll");
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.xXe) {
      return this.xXg.super_dispatchTouchEvent(paramMotionEvent);
    }
    View localView = this.xXf.getView();
    try
    {
      paramMotionEvent = com.tencent.smtt.utils.o.a(localView, "super_dispatchTouchEvent", new Class[] { MotionEvent.class }, new Object[] { paramMotionEvent });
      if (paramMotionEvent == null) {
        return false;
      }
      boolean bool = ((Boolean)paramMotionEvent).booleanValue();
      return bool;
    }
    catch (Throwable paramMotionEvent) {}
    return false;
  }
  
  public boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.xXe) {
      return this.xXg.super_onInterceptTouchEvent(paramMotionEvent);
    }
    View localView = this.xXf.getView();
    try
    {
      paramMotionEvent = com.tencent.smtt.utils.o.a(localView, "super_onInterceptTouchEvent", new Class[] { MotionEvent.class }, new Object[] { paramMotionEvent });
      if (paramMotionEvent == null) {
        return false;
      }
      boolean bool = ((Boolean)paramMotionEvent).booleanValue();
      return bool;
    }
    catch (Throwable paramMotionEvent) {}
    return false;
  }
  
  public void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!this.xXe)
    {
      this.xXg.super_onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      return;
    }
    View localView = this.xXf.getView();
    try
    {
      com.tencent.smtt.utils.o.a(localView, "super_onOverScrolled", new Class[] { Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE }, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.xXe)
    {
      this.xXg.super_onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    View localView = this.xXf.getView();
    try
    {
      com.tencent.smtt.utils.o.a(localView, "super_onScrollChanged", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE }, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public boolean super_onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.xXe) {
      return this.xXg.super_onTouchEvent(paramMotionEvent);
    }
    View localView = this.xXf.getView();
    try
    {
      paramMotionEvent = com.tencent.smtt.utils.o.a(localView, "super_onTouchEvent", new Class[] { MotionEvent.class }, new Object[] { paramMotionEvent });
      if (paramMotionEvent == null) {
        return false;
      }
      boolean bool = ((Boolean)paramMotionEvent).booleanValue();
      return bool;
    }
    catch (Throwable paramMotionEvent) {}
    return false;
  }
  
  public boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    if (!this.xXe) {
      return this.xXg.super_overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    }
    Object localObject = this.xXf.getView();
    try
    {
      localObject = com.tencent.smtt.utils.o.a(localObject, "super_overScrollBy", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE }, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Integer.valueOf(paramInt5), Integer.valueOf(paramInt6), Integer.valueOf(paramInt7), Integer.valueOf(paramInt8), Boolean.valueOf(paramBoolean) });
      if (localObject == null) {
        return false;
      }
      paramBoolean = ((Boolean)localObject).booleanValue();
      return paramBoolean;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public void switchNightMode(boolean paramBoolean)
  {
    if (paramBoolean == xXy) {
      return;
    }
    xXy = paramBoolean;
    if (paramBoolean)
    {
      TbsLog.e("QB_SDK", "deleteNightMode");
      loadUrl("javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));");
      return;
    }
    TbsLog.e("QB_SDK", "nightMode");
    loadUrl("javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);");
  }
  
  public void switchToNightMode()
  {
    TbsLog.e("QB_SDK", "switchToNightMode 01");
    if (!xXy)
    {
      TbsLog.e("QB_SDK", "switchToNightMode");
      loadUrl("javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);");
    }
  }
  
  public boolean zoomIn()
  {
    if (!this.xXe) {
      return this.xXg.zoomIn();
    }
    return this.xXf.zoomIn();
  }
  
  public boolean zoomOut()
  {
    if (!this.xXe) {
      return this.xXg.zoomOut();
    }
    return this.xXf.zoomOut();
  }
  
  private static class ConnectivityChangedReceiver
    extends BroadcastReceiver
  {
    public void onReceive(Context arg1, Intent paramIntent)
    {
      if (paramIntent != null) {}
      for (;;)
      {
        try
        {
          int i;
          long l;
          if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction()))
          {
            i = com.tencent.smtt.utils.b.ho(???);
            l = System.currentTimeMillis();
          }
          synchronized (QbSdk.xTR)
          {
            if (QbSdk.xTP) {
              QbSdk.sWifiConnectedTime += l - QbSdk.xTQ;
            }
            QbSdk.xTQ = l;
            TbsLog.d("sdkreport", "pv report, SdkEngine.registerConnectivityChangedReceiver QbSdk.sWifiConnectTime=" + QbSdk.sWifiConnectedTime + " apnType=" + i);
            if (i == 3)
            {
              bool = true;
              QbSdk.xTP = bool;
              return;
            }
          }
          boolean bool = false;
        }
        catch (Throwable ???)
        {
          return;
        }
      }
    }
  }
  
  public static class HitTestResult
  {
    @Deprecated
    public static final int ANCHOR_TYPE = 1;
    public static final int EDIT_TEXT_TYPE = 9;
    public static final int EMAIL_TYPE = 4;
    public static final int GEO_TYPE = 3;
    @Deprecated
    public static final int IMAGE_ANCHOR_TYPE = 6;
    public static final int IMAGE_TYPE = 5;
    public static final int PHONE_TYPE = 2;
    public static final int SRC_ANCHOR_TYPE = 7;
    public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
    public static final int UNKNOWN_TYPE = 0;
    private IX5WebViewBase.HitTestResult mHitTestResultImpl;
    private android.webkit.WebView.HitTestResult mSysHitTestResult = null;
    
    public HitTestResult()
    {
      this.mHitTestResultImpl = null;
      this.mSysHitTestResult = null;
    }
    
    public HitTestResult(android.webkit.WebView.HitTestResult paramHitTestResult)
    {
      this.mHitTestResultImpl = null;
      this.mSysHitTestResult = paramHitTestResult;
    }
    
    public HitTestResult(IX5WebViewBase.HitTestResult paramHitTestResult)
    {
      this.mHitTestResultImpl = paramHitTestResult;
      this.mSysHitTestResult = null;
    }
    
    public String getExtra()
    {
      String str = "";
      if (this.mHitTestResultImpl != null) {
        str = this.mHitTestResultImpl.getExtra();
      }
      while (this.mSysHitTestResult == null) {
        return str;
      }
      return this.mSysHitTestResult.getExtra();
    }
    
    public int getType()
    {
      int i = 0;
      if (this.mHitTestResultImpl != null) {
        i = this.mHitTestResultImpl.getType();
      }
      while (this.mSysHitTestResult == null) {
        return i;
      }
      return this.mSysHitTestResult.getType();
    }
    
    public void setExtra(String paramString)
    {
      if (this.mHitTestResultImpl != null) {
        this.mHitTestResultImpl.setExtra(paramString);
      }
    }
    
    public void setType(int paramInt)
    {
      if (this.mHitTestResultImpl != null) {
        this.mHitTestResultImpl.setType(paramInt);
      }
    }
  }
  
  public static abstract interface PictureListener
  {
    public abstract void onNewPicture(WebView paramWebView, Picture paramPicture);
  }
  
  private class SystemWebView
    extends android.webkit.WebView
  {
    public SystemWebView(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public SystemWebView(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      if ((!QbSdk.getIsSysWebViewForcedByOuter()) || (!t.gU(paramContext))) {
        CookieSyncManager.createInstance(WebView.a(WebView.this)).startSync();
      }
      try
      {
        this$1 = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", new Class[0]);
        WebView.this.setAccessible(true);
        ((Handler)WebView.this.invoke(null, new Object[0])).getLooper().getThread().setUncaughtExceptionHandler(new SQLiteUncaughtExceptionHandler());
        WebView.mSysWebviewCreated = true;
        return;
      }
      catch (Exception this$1) {}
    }
    
    public void computeScroll()
    {
      if (WebView.this.mWebViewCallbackClient != null)
      {
        WebView.this.mWebViewCallbackClient.computeScroll(this);
        return;
      }
      super.computeScroll();
    }
    
    protected void dispatchDraw(Canvas paramCanvas)
    {
      try
      {
        super.dispatchDraw(paramCanvas);
        if ((!WebView.cn()) && (WebView.coT() != null))
        {
          paramCanvas.save();
          paramCanvas.drawPaint(WebView.coT());
          paramCanvas.restore();
        }
        return;
      }
      catch (Throwable paramCanvas) {}
    }
    
    public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
    {
      if (WebView.this.mWebViewCallbackClient != null) {
        return WebView.this.mWebViewCallbackClient.dispatchTouchEvent(paramMotionEvent, this);
      }
      return super.dispatchTouchEvent(paramMotionEvent);
    }
    
    public android.webkit.WebSettings getSettings()
    {
      try
      {
        android.webkit.WebSettings localWebSettings = super.getSettings();
        return localWebSettings;
      }
      catch (Exception localException) {}
      return null;
    }
    
    public void invalidate()
    {
      super.invalidate();
      if (WebView.this.mWebViewCallbackClient != null) {
        aa localaa = WebView.this.mWebViewCallbackClient;
      }
    }
    
    public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if (WebView.this.mWebViewCallbackClient != null) {
        return WebView.this.mWebViewCallbackClient.onInterceptTouchEvent(paramMotionEvent, this);
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    @TargetApi(9)
    public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (WebView.this.mWebViewCallbackClient != null) {
        WebView.this.mWebViewCallbackClient.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2, this);
      }
      while (Build.VERSION.SDK_INT < 9) {
        return;
      }
      super.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    }
    
    protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (WebView.this.mWebViewCallbackClient != null)
      {
        WebView.this.mWebViewCallbackClient.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4, this);
        return;
      }
      super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      WebView.b(WebView.this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      if (!hasFocus()) {
        requestFocus();
      }
      if (WebView.this.mWebViewCallbackClient != null) {
        return WebView.this.mWebViewCallbackClient.onTouchEvent(paramMotionEvent, this);
      }
      try
      {
        boolean bool = super.onTouchEvent(paramMotionEvent);
        return bool;
      }
      catch (Exception paramMotionEvent) {}
      return false;
    }
    
    @TargetApi(9)
    public boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
    {
      if (WebView.this.mWebViewCallbackClient != null) {
        return WebView.this.mWebViewCallbackClient.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean, this);
      }
      if (Build.VERSION.SDK_INT >= 9) {
        return super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
      }
      return false;
    }
    
    public void setOverScrollMode(int paramInt)
    {
      try
      {
        super.setOverScrollMode(paramInt);
        return;
      }
      catch (Exception localException) {}
    }
    
    public void super_computeScroll()
    {
      super.computeScroll();
    }
    
    public boolean super_dispatchTouchEvent(MotionEvent paramMotionEvent)
    {
      return super.dispatchTouchEvent(paramMotionEvent);
    }
    
    public boolean super_onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    @TargetApi(9)
    public void super_onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    {
      if (Build.VERSION.SDK_INT >= 9) {
        super.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      }
    }
    
    public void super_onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public boolean super_onTouchEvent(MotionEvent paramMotionEvent)
    {
      return super.onTouchEvent(paramMotionEvent);
    }
    
    @TargetApi(9)
    public boolean super_overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
    {
      if (Build.VERSION.SDK_INT >= 9) {
        return super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
      }
      return false;
    }
  }
  
  public class WebViewTransport
  {
    private WebView mWebview;
    
    public WebViewTransport() {}
    
    public WebView getWebView()
    {
      try
      {
        WebView localWebView = this.mWebview;
        return localWebView;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public void setWebView(WebView paramWebView)
    {
      try
      {
        this.mWebview = paramWebView;
        return;
      }
      finally
      {
        paramWebView = finally;
        throw paramWebView;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\WebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */