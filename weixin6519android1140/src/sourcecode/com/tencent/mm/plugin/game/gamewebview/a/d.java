package com.tencent.mm.plugin.game.gamewebview.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.webkit.URLUtil;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.modeltools.f;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class d
{
  private static volatile af gut;
  private static final Set<Object> hXk;
  private static final Object iGt;
  
  static
  {
    GMTrace.i(16940424757248L, 126216);
    iGt = new Object();
    hXk = new HashSet();
    GMTrace.o(16940424757248L, 126216);
  }
  
  public static String U(Context paramContext, String paramString)
  {
    GMTrace.i(16939351015424L, 126208);
    paramContext = s.aZ(paramContext, paramString);
    paramContext = paramContext + " GameWebView";
    GMTrace.o(16939351015424L, 126208);
    return paramContext;
  }
  
  public static boolean aDJ()
  {
    GMTrace.i(16940156321792L, 126214);
    if (ab.bPY())
    {
      bool = at.AU();
      GMTrace.o(16940156321792L, 126214);
      return bool;
    }
    CommonLogicTask localCommonLogicTask = new CommonLogicTask();
    localCommonLogicTask.type = 6;
    GameWebViewMainProcessService.b(localCommonLogicTask);
    boolean bool = localCommonLogicTask.ler.getBoolean("has_set_uin", false);
    GMTrace.o(16940156321792L, 126214);
    return bool;
  }
  
  public static int aa(int paramInt, String paramString)
  {
    GMTrace.i(16940290539520L, 126215);
    int i = paramInt;
    if (paramInt == 0) {
      if ((paramString == null) || (paramString.length() <= 0)) {
        break label55;
      }
    }
    label55:
    for (i = 1;; i = 0)
    {
      w.i("MicroMsg.GameWebViewUtil", "KGetA8KeyScene = %s", new Object[] { Integer.valueOf(i) });
      GMTrace.o(16940290539520L, 126215);
      return i;
    }
  }
  
  public static void b(Context paramContext, int paramInt, String paramString)
  {
    GMTrace.i(18026111959040L, 134305);
    if (!(paramContext instanceof Activity))
    {
      GMTrace.o(18026111959040L, 134305);
      return;
    }
    paramContext = ((Activity)paramContext).getWindow();
    int i;
    if ((Build.VERSION.SDK_INT >= 23) && (!h.tE()))
    {
      i = paramContext.getDecorView().getSystemUiVisibility();
      if ("black".equals(paramString))
      {
        i |= 0x2000;
        paramContext.getDecorView().setSystemUiVisibility(i);
        i = paramInt;
      }
    }
    for (;;)
    {
      paramContext.setStatusBarColor(i);
      do
      {
        GMTrace.o(18026111959040L, 134305);
        return;
        i &= 0xDFFF;
        break;
      } while (Build.VERSION.SDK_INT < 21);
      i = paramInt;
      if ("black".equals(paramString)) {
        i = com.tencent.mm.ui.ad.d(paramInt, -16777216, 0.78F);
      }
    }
  }
  
  public static void bU(Context paramContext)
  {
    GMTrace.i(18025843523584L, 134303);
    if (!(paramContext instanceof Activity))
    {
      GMTrace.o(18025843523584L, 134303);
      return;
    }
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(16973825, new int[] { 16842936, 16842937 });
    int i = localTypedArray.getResourceId(0, 0);
    int j = localTypedArray.getResourceId(1, 0);
    localTypedArray.recycle();
    ((Activity)paramContext).overridePendingTransition(i, j);
    GMTrace.o(18025843523584L, 134303);
  }
  
  public static void bW(Context paramContext)
  {
    GMTrace.i(18025977741312L, 134304);
    if (!(paramContext instanceof Activity))
    {
      GMTrace.o(18025977741312L, 134304);
      return;
    }
    ((Activity)paramContext).overridePendingTransition(MMFragmentActivity.a.vMB, MMFragmentActivity.a.vMC);
    GMTrace.o(18025977741312L, 134304);
  }
  
  public static String d(String paramString, Map<String, ? extends Object> paramMap)
  {
    GMTrace.i(16939619450880L, 126210);
    HashMap localHashMap = new HashMap();
    localHashMap.put("err_msg", paramString);
    if (paramMap != null) {
      localHashMap.putAll(paramMap);
    }
    k(localHashMap);
    paramString = new JSONObject(localHashMap).toString();
    GMTrace.o(16939619450880L, 126210);
    return paramString;
  }
  
  public static void k(Map paramMap)
  {
    GMTrace.i(16939485233152L, 126209);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      Object localObject1 = ((Map.Entry)localObject2).getKey();
      localObject2 = ((Map.Entry)localObject2).getValue();
      if (((localObject1 instanceof String)) && ((localObject2 instanceof Map)))
      {
        k((Map)localObject2);
        paramMap.put(localObject1, new JSONObject((Map)localObject2));
      }
    }
    GMTrace.o(16939485233152L, 126209);
  }
  
  public static JSONObject qe(String paramString)
  {
    GMTrace.i(16940022104064L, 126213);
    if (bg.nm(paramString))
    {
      GMTrace.o(16940022104064L, 126213);
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString);
      GMTrace.o(16940022104064L, 126213);
      return paramString;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.GameWebViewUtil", paramString.getMessage());
      GMTrace.o(16940022104064L, 126213);
    }
    return null;
  }
  
  public static void runOnUiThread(Runnable paramRunnable)
  {
    GMTrace.i(16939082579968L, 126206);
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      af.t(paramRunnable);
      GMTrace.o(16939082579968L, 126206);
      return;
    }
    paramRunnable.run();
    GMTrace.o(16939082579968L, 126206);
  }
  
  public static boolean sA(String paramString)
  {
    GMTrace.i(16939216797696L, 126207);
    if ((!bg.nm(paramString)) && ((URLUtil.isHttpsUrl(paramString)) || (URLUtil.isHttpUrl(paramString))))
    {
      GMTrace.o(16939216797696L, 126207);
      return true;
    }
    GMTrace.o(16939216797696L, 126207);
    return false;
  }
  
  public static af xB()
  {
    GMTrace.i(16938948362240L, 126205);
    if (gut == null) {}
    synchronized (iGt)
    {
      if (gut == null) {
        gut = new af("SubCoreAppBrand#WorkerThread");
      }
      ??? = gut;
      GMTrace.o(16938948362240L, 126205);
      return (af)???;
    }
  }
  
  public static String zl(String paramString)
  {
    GMTrace.i(20362171514880L, 151710);
    paramString = d(paramString, null);
    GMTrace.o(20362171514880L, 151710);
    return paramString;
  }
  
  public static WebViewJSSDKFileItem zm(String paramString)
  {
    GMTrace.i(16939753668608L, 126211);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.GameWebViewUtil", "get by local id error, local id is null or nil");
      GMTrace.o(16939753668608L, 126211);
      return null;
    }
    if (ab.bPY())
    {
      paramString = f.bCW().Lk(paramString);
      GMTrace.o(16939753668608L, 126211);
      return paramString;
    }
    CommonLogicTask localCommonLogicTask = new CommonLogicTask();
    localCommonLogicTask.type = 3;
    Bundle localBundle = new Bundle();
    localBundle.putString("localId", paramString);
    localCommonLogicTask.ler = localBundle;
    GameWebViewMainProcessService.b(localCommonLogicTask);
    paramString = (WebViewJSSDKFileItem)localCommonLogicTask.ler.getParcelable("item");
    GMTrace.o(16939753668608L, 126211);
    return paramString;
  }
  
  public static String zn(String paramString)
  {
    GMTrace.i(16939887886336L, 126212);
    try
    {
      paramString = Pattern.compile("(?i)^.*filename=\"?([^\"]+)\"?.*$").matcher(paramString);
      if ((paramString.find()) && (paramString.groupCount() == 1))
      {
        paramString = paramString.group(1);
        GMTrace.o(16939887886336L, 126212);
        return paramString;
      }
      GMTrace.o(16939887886336L, 126212);
      return null;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.GameWebViewUtil", "getFileNameFromContentDisposition error " + paramString.getMessage());
      GMTrace.o(16939887886336L, 126212);
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */