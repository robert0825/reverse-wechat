package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CookieManager
{
  public static String LOGTAG = "CookieManager";
  private static CookieManager xTe;
  ArrayList<b> xTf;
  String xTg;
  int xTh = a.xTk;
  private boolean xTi = false;
  private boolean xTj = false;
  
  public static CookieManager getInstance()
  {
    if (xTe == null) {}
    try
    {
      if (xTe == null) {
        xTe = new CookieManager();
      }
      return xTe;
    }
    finally {}
  }
  
  public static int getROMCookieDBVersion(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    for (paramContext = paramContext.getSharedPreferences("cookiedb_info", 4);; paramContext = paramContext.getSharedPreferences("cookiedb_info", 0)) {
      return paramContext.getInt("db_version", -1);
    }
  }
  
  public static void setROMCookieDBVersion(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 11) {}
    for (paramContext = paramContext.getSharedPreferences("cookiedb_info", 4);; paramContext = paramContext.getSharedPreferences("cookiedb_info", 0))
    {
      paramContext = paramContext.edit();
      paramContext.putInt("db_version", paramInt);
      paramContext.commit();
      return;
    }
  }
  
  public boolean acceptCookie()
  {
    Object localObject = ab.coW();
    if ((localObject != null) && (((ab)localObject).coX()))
    {
      localObject = ((ab)localObject).coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_acceptCookie", new Class[0], new Object[0]);
      if (localObject == null) {
        return false;
      }
      return ((Boolean)localObject).booleanValue();
    }
    return android.webkit.CookieManager.getInstance().acceptCookie();
  }
  
  /* Error */
  public boolean acceptThirdPartyCookies(WebView paramWebView)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 93	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   5: astore_3
    //   6: aload_3
    //   7: ifnull +70 -> 77
    //   10: aload_3
    //   11: invokevirtual 96	com/tencent/smtt/sdk/ab:coX	()Z
    //   14: ifeq +63 -> 77
    //   17: aload_3
    //   18: invokevirtual 100	com/tencent/smtt/sdk/ab:coY	()Lcom/tencent/smtt/sdk/ac;
    //   21: getfield 106	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   24: astore_3
    //   25: aload_1
    //   26: invokevirtual 138	com/tencent/smtt/sdk/WebView:getView	()Landroid/view/View;
    //   29: astore_1
    //   30: aload_3
    //   31: ldc 108
    //   33: ldc -116
    //   35: iconst_1
    //   36: anewarray 112	java/lang/Class
    //   39: dup
    //   40: iconst_0
    //   41: ldc 4
    //   43: aastore
    //   44: iconst_1
    //   45: anewarray 4	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aload_1
    //   51: aastore
    //   52: invokevirtual 118	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   55: astore_1
    //   56: aload_1
    //   57: ifnull +15 -> 72
    //   60: aload_1
    //   61: checkcast 120	java/lang/Boolean
    //   64: invokevirtual 123	java/lang/Boolean:booleanValue	()Z
    //   67: istore_2
    //   68: aload_0
    //   69: monitorexit
    //   70: iload_2
    //   71: ireturn
    //   72: iconst_1
    //   73: istore_2
    //   74: goto -6 -> 68
    //   77: getstatic 54	android/os/Build$VERSION:SDK_INT	I
    //   80: bipush 21
    //   82: if_icmpge +8 -> 90
    //   85: iconst_1
    //   86: istore_2
    //   87: goto -19 -> 68
    //   90: invokestatic 128	android/webkit/CookieManager:getInstance	()Landroid/webkit/CookieManager;
    //   93: astore_3
    //   94: aload_1
    //   95: invokevirtual 138	com/tencent/smtt/sdk/WebView:getView	()Landroid/view/View;
    //   98: astore_1
    //   99: aload_3
    //   100: ldc -115
    //   102: iconst_1
    //   103: anewarray 112	java/lang/Class
    //   106: dup
    //   107: iconst_0
    //   108: ldc -113
    //   110: aastore
    //   111: iconst_1
    //   112: anewarray 4	java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: aload_1
    //   118: aastore
    //   119: invokestatic 148	com/tencent/smtt/utils/o:a	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   122: astore_1
    //   123: aload_1
    //   124: ifnull +14 -> 138
    //   127: aload_1
    //   128: checkcast 120	java/lang/Boolean
    //   131: invokevirtual 123	java/lang/Boolean:booleanValue	()Z
    //   134: istore_2
    //   135: goto -67 -> 68
    //   138: iconst_0
    //   139: istore_2
    //   140: goto -72 -> 68
    //   143: astore_1
    //   144: aload_0
    //   145: monitorexit
    //   146: aload_1
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	CookieManager
    //   0	148	1	paramWebView	WebView
    //   67	73	2	bool	boolean
    //   5	95	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	143	finally
    //   10	56	143	finally
    //   60	68	143	finally
    //   77	85	143	finally
    //   90	123	143	finally
    //   127	135	143	finally
  }
  
  final void cnL()
  {
    label26:
    label52:
    Object localObject3;
    for (;;)
    {
      try
      {
        this.xTj = true;
        if (this.xTf != null)
        {
          int i = this.xTf.size();
          if (i != 0) {}
        }
        else
        {
          return;
        }
        Object localObject1 = ab.coW();
        if ((localObject1 == null) || (!((ab)localObject1).coX())) {
          break;
        }
        localObject1 = this.xTf.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label292;
        }
        localObject3 = (b)((Iterator)localObject1).next();
        switch (((b)localObject3).xTo)
        {
        case 1: 
          setCookie(((b)localObject3).url, ((b)localObject3).value, ((b)localObject3).xTp);
          break;
        case 2: 
          setCookie(((b)localObject3).url, ((b)localObject3).value);
        }
      }
      finally {}
    }
    Iterator localIterator = this.xTf.iterator();
    for (;;)
    {
      Object localObject4;
      if (localIterator.hasNext()) {
        localObject4 = (b)localIterator.next();
      }
      switch (((b)localObject4).xTo)
      {
      case 1: 
        if (Build.VERSION.SDK_INT >= 21)
        {
          localObject3 = android.webkit.CookieManager.getInstance();
          String str1 = ((b)localObject4).url;
          String str2 = ((b)localObject4).value;
          localObject4 = ((b)localObject4).xTp;
          o.a(localObject3, "setCookie", new Class[] { String.class, String.class, ValueCallback.class }, new Object[] { str1, str2, localObject4 });
        }
        break;
      case 2: 
        android.webkit.CookieManager.getInstance().setCookie(((b)localObject4).url, ((b)localObject4).value);
        continue;
        label292:
        this.xTf.clear();
        break label26;
        break label52;
      }
    }
  }
  
  public void flush()
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX())) {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_flush", new Class[0], new Object[0]);
    }
    while (Build.VERSION.SDK_INT < 21) {
      return;
    }
    o.a(android.webkit.CookieManager.getInstance(), "flush", new Class[0], new Object[0]);
  }
  
  public String getCookie(String paramString)
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX()))
    {
      paramString = localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getCookie", new Class[] { String.class }, new Object[] { paramString });
      if (paramString == null) {
        return null;
      }
      return (String)paramString;
    }
    try
    {
      paramString = android.webkit.CookieManager.getInstance().getCookie(paramString);
      return paramString;
    }
    catch (Throwable paramString) {}
    return null;
  }
  
  public boolean hasCookies()
  {
    Object localObject = ab.coW();
    if ((localObject != null) && (((ab)localObject).coX()))
    {
      localObject = ((ab)localObject).coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_hasCookies", new Class[0], new Object[0]);
      if (localObject == null) {
        return false;
      }
      return ((Boolean)localObject).booleanValue();
    }
    return android.webkit.CookieManager.getInstance().hasCookies();
  }
  
  protected final void o(Context paramContext, boolean paramBoolean)
  {
    int k = 0;
    int i = 0;
    for (;;)
    {
      boolean bool;
      long l2;
      long l1;
      r.b localb;
      label246:
      try
      {
        if ((this.xTh != a.xTk) && (paramContext != null) && (m.cot().bz(paramContext, "cookie_switch.txt")))
        {
          bool = this.xTi;
          if (!bool) {}
        }
        else
        {
          return;
        }
        l2 = System.currentTimeMillis();
        l1 = 0L;
        TbsLog.i(LOGTAG, "compatiableCookieDatabaseIfNeed,isX5Inited:true" + ",useX5:" + paramBoolean);
        if ((QbSdk.getIsSysWebViewForcedByOuter()) || (QbSdk.xTH)) {
          break label479;
        }
        bool = m.cot().bz(paramContext, "usex5.txt");
        TbsLog.i(LOGTAG, "usex5 : mUseX5LastProcess->" + bool + ",useX5:" + paramBoolean);
        m.cot().n(paramContext, "usex5.txt", paramBoolean);
        if (bool == paramBoolean) {
          continue;
        }
        r.gR(paramContext);
        localb = r.coy();
        if (TextUtils.isEmpty(this.xTg)) {
          break label450;
        }
        if ((p.cov().gE(paramContext) > 0) && (p.cov().gE(paramContext) < 36001)) {
          continue;
        }
        if (!bool) {
          break label329;
        }
        i = g.gg(paramContext);
        j = i;
        if (i <= 0) {
          break label393;
        }
        j = getROMCookieDBVersion(paramContext);
        if (j > 0) {
          break label464;
        }
        k = i;
        paramBoolean = true;
        i = j;
        j = k;
      }
      finally {}
      localb.setErrorCode(702);
      label254:
      localb.Yk("x5->sys:" + bool + " from:" + j + " to:" + i + ",timeused:" + l1);
      r.gR(paramContext).a(r.a.xWf, localb);
      continue;
      label329:
      i = g.gg(paramContext);
      int j = i;
      if (i > 0)
      {
        String str = p.cov().bD(paramContext, "cookies_database_version");
        paramBoolean = TextUtils.isEmpty(str);
        j = i;
        if (!paramBoolean) {
          try
          {
            j = Integer.parseInt(str);
            k = i;
            paramBoolean = false;
            i = j;
            j = k;
          }
          catch (Exception localException)
          {
            j = i;
          }
        }
      }
      label393:
      paramBoolean = false;
      i = k;
      label450:
      label464:
      label479:
      do
      {
        do
        {
          if (i >= j)
          {
            localb.setErrorCode(703);
            break label254;
          }
          g.a(paramContext, this.xTh, this.xTg, paramBoolean);
          localb.setErrorCode(704);
          l1 = System.currentTimeMillis() - l2;
          break label254;
          localb.setErrorCode(701);
          j = 0;
          break label254;
          k = i;
          paramBoolean = false;
          i = j;
          j = k;
          continue;
          paramBoolean = false;
          break;
        } while (paramBoolean);
        if (j <= 0) {
          break label246;
        }
      } while (i > 0);
    }
  }
  
  public void removeAllCookie()
  {
    if (this.xTf != null) {
      this.xTf.clear();
    }
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX()))
    {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeAllCookie", new Class[0], new Object[0]);
      return;
    }
    android.webkit.CookieManager.getInstance().removeAllCookie();
  }
  
  public void removeAllCookies(x<Boolean> paramx)
  {
    if (this.xTf != null) {
      this.xTf.clear();
    }
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX())) {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeAllCookies", new Class[] { ValueCallback.class }, new Object[] { paramx });
    }
    while (Build.VERSION.SDK_INT < 21) {
      return;
    }
    o.a(android.webkit.CookieManager.getInstance(), "removeAllCookies", new Class[] { ValueCallback.class }, new Object[] { paramx });
  }
  
  public void removeExpiredCookie()
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX()))
    {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeExpiredCookie", new Class[0], new Object[0]);
      return;
    }
    android.webkit.CookieManager.getInstance().removeExpiredCookie();
  }
  
  public void removeSessionCookie()
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX()))
    {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookie", new Class[0], new Object[0]);
      return;
    }
    android.webkit.CookieManager.getInstance().removeSessionCookie();
  }
  
  public void removeSessionCookies(x<Boolean> paramx)
  {
    ab localab = ab.coW();
    if ((localab != null) && (localab.coX())) {
      localab.coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookies", new Class[] { ValueCallback.class }, new Object[] { paramx });
    }
    while (Build.VERSION.SDK_INT < 21) {
      return;
    }
    o.a(android.webkit.CookieManager.getInstance(), "removeSessionCookies", new Class[] { ValueCallback.class }, new Object[] { paramx });
  }
  
  /* Error */
  public void setAcceptCookie(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 93	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   5: astore_2
    //   6: aload_2
    //   7: ifnull +50 -> 57
    //   10: aload_2
    //   11: invokevirtual 96	com/tencent/smtt/sdk/ab:coX	()Z
    //   14: ifeq +43 -> 57
    //   17: aload_2
    //   18: invokevirtual 100	com/tencent/smtt/sdk/ab:coY	()Lcom/tencent/smtt/sdk/ac;
    //   21: getfield 106	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   24: ldc 108
    //   26: ldc_w 390
    //   29: iconst_1
    //   30: anewarray 112	java/lang/Class
    //   33: dup
    //   34: iconst_0
    //   35: getstatic 394	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   38: aastore
    //   39: iconst_1
    //   40: anewarray 4	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: iload_1
    //   46: invokestatic 398	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   49: aastore
    //   50: invokevirtual 118	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   53: pop
    //   54: aload_0
    //   55: monitorexit
    //   56: return
    //   57: invokestatic 128	android/webkit/CookieManager:getInstance	()Landroid/webkit/CookieManager;
    //   60: iload_1
    //   61: invokevirtual 400	android/webkit/CookieManager:setAcceptCookie	(Z)V
    //   64: goto -10 -> 54
    //   67: astore_2
    //   68: goto -14 -> 54
    //   71: astore_2
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_2
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	CookieManager
    //   0	76	1	paramBoolean	boolean
    //   5	13	2	localab	ab
    //   67	1	2	localThrowable	Throwable
    //   71	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   57	64	67	java/lang/Throwable
    //   2	6	71	finally
    //   10	54	71	finally
    //   57	64	71	finally
  }
  
  /* Error */
  public void setAcceptThirdPartyCookies(WebView paramWebView, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 93	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   5: astore_3
    //   6: aload_3
    //   7: ifnull +70 -> 77
    //   10: aload_3
    //   11: invokevirtual 96	com/tencent/smtt/sdk/ab:coX	()Z
    //   14: ifeq +63 -> 77
    //   17: aload_3
    //   18: invokevirtual 100	com/tencent/smtt/sdk/ab:coY	()Lcom/tencent/smtt/sdk/ac;
    //   21: getfield 106	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   24: astore_3
    //   25: getstatic 394	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   28: astore 4
    //   30: aload_1
    //   31: invokevirtual 138	com/tencent/smtt/sdk/WebView:getView	()Landroid/view/View;
    //   34: astore_1
    //   35: aload_3
    //   36: ldc 108
    //   38: ldc_w 404
    //   41: iconst_2
    //   42: anewarray 112	java/lang/Class
    //   45: dup
    //   46: iconst_0
    //   47: ldc 4
    //   49: aastore
    //   50: dup
    //   51: iconst_1
    //   52: aload 4
    //   54: aastore
    //   55: iconst_2
    //   56: anewarray 4	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: aload_1
    //   62: aastore
    //   63: dup
    //   64: iconst_1
    //   65: iload_2
    //   66: invokestatic 398	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   69: aastore
    //   70: invokevirtual 118	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   73: pop
    //   74: aload_0
    //   75: monitorexit
    //   76: return
    //   77: getstatic 54	android/os/Build$VERSION:SDK_INT	I
    //   80: bipush 21
    //   82: if_icmplt -8 -> 74
    //   85: invokestatic 128	android/webkit/CookieManager:getInstance	()Landroid/webkit/CookieManager;
    //   88: astore_3
    //   89: getstatic 394	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   92: astore 4
    //   94: aload_1
    //   95: invokevirtual 138	com/tencent/smtt/sdk/WebView:getView	()Landroid/view/View;
    //   98: astore_1
    //   99: aload_3
    //   100: ldc_w 405
    //   103: iconst_2
    //   104: anewarray 112	java/lang/Class
    //   107: dup
    //   108: iconst_0
    //   109: ldc -113
    //   111: aastore
    //   112: dup
    //   113: iconst_1
    //   114: aload 4
    //   116: aastore
    //   117: iconst_2
    //   118: anewarray 4	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload_1
    //   124: aastore
    //   125: dup
    //   126: iconst_1
    //   127: iload_2
    //   128: invokestatic 398	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   131: aastore
    //   132: invokestatic 148	com/tencent/smtt/utils/o:a	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   135: pop
    //   136: goto -62 -> 74
    //   139: astore_1
    //   140: aload_0
    //   141: monitorexit
    //   142: aload_1
    //   143: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	this	CookieManager
    //   0	144	1	paramWebView	WebView
    //   0	144	2	paramBoolean	boolean
    //   5	95	3	localObject	Object
    //   28	87	4	localClass	Class
    // Exception table:
    //   from	to	target	type
    //   2	6	139	finally
    //   10	74	139	finally
    //   77	136	139	finally
  }
  
  public void setCookie(String paramString1, String paramString2)
  {
    try
    {
      setCookie(paramString1, paramString2, false);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  /* Error */
  public void setCookie(String paramString1, String paramString2, x<Boolean> paramx)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 93	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   5: astore 4
    //   7: aload 4
    //   9: ifnull +66 -> 75
    //   12: aload 4
    //   14: invokevirtual 96	com/tencent/smtt/sdk/ab:coX	()Z
    //   17: ifeq +58 -> 75
    //   20: aload 4
    //   22: invokevirtual 100	com/tencent/smtt/sdk/ab:coY	()Lcom/tencent/smtt/sdk/ac;
    //   25: getfield 106	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   28: ldc 108
    //   30: ldc_w 410
    //   33: iconst_3
    //   34: anewarray 112	java/lang/Class
    //   37: dup
    //   38: iconst_0
    //   39: ldc -63
    //   41: aastore
    //   42: dup
    //   43: iconst_1
    //   44: ldc -63
    //   46: aastore
    //   47: dup
    //   48: iconst_2
    //   49: ldc -61
    //   51: aastore
    //   52: iconst_3
    //   53: anewarray 4	java/lang/Object
    //   56: dup
    //   57: iconst_0
    //   58: aload_1
    //   59: aastore
    //   60: dup
    //   61: iconst_1
    //   62: aload_2
    //   63: aastore
    //   64: dup
    //   65: iconst_2
    //   66: aload_3
    //   67: aastore
    //   68: invokevirtual 118	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   71: pop
    //   72: aload_0
    //   73: monitorexit
    //   74: return
    //   75: invokestatic 93	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   78: getfield 413	com/tencent/smtt/sdk/ab:xUk	Z
    //   81: ifne +65 -> 146
    //   84: new 9	com/tencent/smtt/sdk/CookieManager$b
    //   87: dup
    //   88: aload_0
    //   89: invokespecial 416	com/tencent/smtt/sdk/CookieManager$b:<init>	(Lcom/tencent/smtt/sdk/CookieManager;)V
    //   92: astore 4
    //   94: aload 4
    //   96: iconst_1
    //   97: putfield 173	com/tencent/smtt/sdk/CookieManager$b:xTo	I
    //   100: aload 4
    //   102: aload_1
    //   103: putfield 176	com/tencent/smtt/sdk/CookieManager$b:url	Ljava/lang/String;
    //   106: aload 4
    //   108: aload_2
    //   109: putfield 179	com/tencent/smtt/sdk/CookieManager$b:value	Ljava/lang/String;
    //   112: aload 4
    //   114: aload_3
    //   115: putfield 183	com/tencent/smtt/sdk/CookieManager$b:xTp	Lcom/tencent/smtt/sdk/x;
    //   118: aload_0
    //   119: getfield 151	com/tencent/smtt/sdk/CookieManager:xTf	Ljava/util/ArrayList;
    //   122: ifnonnull +14 -> 136
    //   125: aload_0
    //   126: new 153	java/util/ArrayList
    //   129: dup
    //   130: invokespecial 417	java/util/ArrayList:<init>	()V
    //   133: putfield 151	com/tencent/smtt/sdk/CookieManager:xTf	Ljava/util/ArrayList;
    //   136: aload_0
    //   137: getfield 151	com/tencent/smtt/sdk/CookieManager:xTf	Ljava/util/ArrayList;
    //   140: aload 4
    //   142: invokevirtual 421	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   145: pop
    //   146: aload_0
    //   147: getfield 42	com/tencent/smtt/sdk/CookieManager:xTj	Z
    //   150: ifeq -78 -> 72
    //   153: getstatic 54	android/os/Build$VERSION:SDK_INT	I
    //   156: bipush 21
    //   158: if_icmplt -86 -> 72
    //   161: invokestatic 128	android/webkit/CookieManager:getInstance	()Landroid/webkit/CookieManager;
    //   164: ldc -65
    //   166: iconst_3
    //   167: anewarray 112	java/lang/Class
    //   170: dup
    //   171: iconst_0
    //   172: ldc -63
    //   174: aastore
    //   175: dup
    //   176: iconst_1
    //   177: ldc -63
    //   179: aastore
    //   180: dup
    //   181: iconst_2
    //   182: ldc -61
    //   184: aastore
    //   185: iconst_3
    //   186: anewarray 4	java/lang/Object
    //   189: dup
    //   190: iconst_0
    //   191: aload_1
    //   192: aastore
    //   193: dup
    //   194: iconst_1
    //   195: aload_2
    //   196: aastore
    //   197: dup
    //   198: iconst_2
    //   199: aload_3
    //   200: aastore
    //   201: invokestatic 148	com/tencent/smtt/utils/o:a	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   204: pop
    //   205: goto -133 -> 72
    //   208: astore_1
    //   209: aload_0
    //   210: monitorexit
    //   211: aload_1
    //   212: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	213	0	this	CookieManager
    //   0	213	1	paramString1	String
    //   0	213	2	paramString2	String
    //   0	213	3	paramx	x<Boolean>
    //   5	136	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	208	finally
    //   12	72	208	finally
    //   75	136	208	finally
    //   136	146	208	finally
    //   146	205	208	finally
  }
  
  /* Error */
  public void setCookie(String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: invokestatic 93	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   5: astore 4
    //   7: aload 4
    //   9: ifnull +57 -> 66
    //   12: aload 4
    //   14: invokevirtual 96	com/tencent/smtt/sdk/ab:coX	()Z
    //   17: ifeq +49 -> 66
    //   20: aload 4
    //   22: invokevirtual 100	com/tencent/smtt/sdk/ab:coY	()Lcom/tencent/smtt/sdk/ac;
    //   25: getfield 106	com/tencent/smtt/sdk/ac:xWV	Lcom/tencent/smtt/export/external/DexLoader;
    //   28: ldc 108
    //   30: ldc_w 410
    //   33: iconst_2
    //   34: anewarray 112	java/lang/Class
    //   37: dup
    //   38: iconst_0
    //   39: ldc -63
    //   41: aastore
    //   42: dup
    //   43: iconst_1
    //   44: ldc -63
    //   46: aastore
    //   47: iconst_2
    //   48: anewarray 4	java/lang/Object
    //   51: dup
    //   52: iconst_0
    //   53: aload_1
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: aload_2
    //   58: aastore
    //   59: invokevirtual 118	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: aload_0
    //   64: monitorexit
    //   65: return
    //   66: aload_0
    //   67: getfield 42	com/tencent/smtt/sdk/CookieManager:xTj	Z
    //   70: ifne +7 -> 77
    //   73: iload_3
    //   74: ifeq +11 -> 85
    //   77: invokestatic 128	android/webkit/CookieManager:getInstance	()Landroid/webkit/CookieManager;
    //   80: aload_1
    //   81: aload_2
    //   82: invokevirtual 196	android/webkit/CookieManager:setCookie	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: invokestatic 93	com/tencent/smtt/sdk/ab:coW	()Lcom/tencent/smtt/sdk/ab;
    //   88: getfield 413	com/tencent/smtt/sdk/ab:xUk	Z
    //   91: ifne -28 -> 63
    //   94: new 9	com/tencent/smtt/sdk/CookieManager$b
    //   97: dup
    //   98: aload_0
    //   99: invokespecial 416	com/tencent/smtt/sdk/CookieManager$b:<init>	(Lcom/tencent/smtt/sdk/CookieManager;)V
    //   102: astore 4
    //   104: aload 4
    //   106: iconst_2
    //   107: putfield 173	com/tencent/smtt/sdk/CookieManager$b:xTo	I
    //   110: aload 4
    //   112: aload_1
    //   113: putfield 176	com/tencent/smtt/sdk/CookieManager$b:url	Ljava/lang/String;
    //   116: aload 4
    //   118: aload_2
    //   119: putfield 179	com/tencent/smtt/sdk/CookieManager$b:value	Ljava/lang/String;
    //   122: aload 4
    //   124: aconst_null
    //   125: putfield 183	com/tencent/smtt/sdk/CookieManager$b:xTp	Lcom/tencent/smtt/sdk/x;
    //   128: aload_0
    //   129: getfield 151	com/tencent/smtt/sdk/CookieManager:xTf	Ljava/util/ArrayList;
    //   132: ifnonnull +14 -> 146
    //   135: aload_0
    //   136: new 153	java/util/ArrayList
    //   139: dup
    //   140: invokespecial 417	java/util/ArrayList:<init>	()V
    //   143: putfield 151	com/tencent/smtt/sdk/CookieManager:xTf	Ljava/util/ArrayList;
    //   146: aload_0
    //   147: getfield 151	com/tencent/smtt/sdk/CookieManager:xTf	Ljava/util/ArrayList;
    //   150: aload 4
    //   152: invokevirtual 421	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   155: pop
    //   156: goto -93 -> 63
    //   159: astore_1
    //   160: aload_0
    //   161: monitorexit
    //   162: aload_1
    //   163: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	this	CookieManager
    //   0	164	1	paramString1	String
    //   0	164	2	paramString2	String
    //   0	164	3	paramBoolean	boolean
    //   5	146	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	159	finally
    //   12	63	159	finally
    //   66	73	159	finally
    //   77	85	159	finally
    //   85	146	159	finally
    //   146	156	159	finally
  }
  
  public boolean setCookieCompatialbeMode$4fb4c7d(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    System.currentTimeMillis();
    if ((paramContext == null) || (!m.cot().bz(paramContext, "cookie_switch.txt"))) {
      return false;
    }
    this.xTh = paramInt;
    if (paramString != null) {
      this.xTg = paramString;
    }
    if ((this.xTh != a.xTk) && (paramBoolean) && (!ab.coW().xUk)) {
      ab.coW().b(paramContext, null);
    }
    return true;
  }
  
  public void setCookies(Map<String, String[]> paramMap)
  {
    Object localObject = ab.coW();
    boolean bool;
    if ((localObject != null) && (((ab)localObject).coX()))
    {
      localObject = ((ab)localObject).coY().xWV.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookies", new Class[] { Map.class }, new Object[] { paramMap });
      if (localObject == null) {
        bool = false;
      }
    }
    for (;;)
    {
      if (!bool)
      {
        localObject = paramMap.keySet().iterator();
        for (;;)
        {
          if (((Iterator)localObject).hasNext())
          {
            String str = (String)((Iterator)localObject).next();
            String[] arrayOfString = (String[])paramMap.get(str);
            int j = arrayOfString.length;
            int i = 0;
            while (i < j)
            {
              setCookie(str, arrayOfString[i]);
              i += 1;
            }
            continue;
            bool = ((Boolean)localObject).booleanValue();
            break;
          }
        }
      }
      return;
      bool = false;
    }
  }
  
  public static enum a {}
  
  final class b
  {
    String url;
    String value;
    int xTo;
    x<Boolean> xTp;
    
    b() {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\CookieManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */