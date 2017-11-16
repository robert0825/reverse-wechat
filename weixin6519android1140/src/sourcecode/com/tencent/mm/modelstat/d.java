package com.tencent.mm.modelstat;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;

public final class d
{
  private static d gXw;
  private HashSet<String> gXv;
  
  private d()
  {
    GMTrace.i(1390093008896L, 10357);
    this.gXv = new HashSet();
    this.gXv.add("com.tencent.mm.ui.LauncherUI");
    this.gXv.add("com.tencent.mm.plugin.profile.ui.ContactInfoUI");
    this.gXv.add("com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
    this.gXv.add("com.tencent.mm.ui.conversation.BizConversationUI");
    this.gXv.add("com.tencent.mm.ui.chatting.En_5b8fbb1e");
    this.gXv.add("com.tencent.mm.plugin.label.ui.ContactLabelEditUI");
    this.gXv.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
    this.gXv.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI1");
    this.gXv.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI2");
    this.gXv.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI3");
    this.gXv.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI4");
    GMTrace.o(1390093008896L, 10357);
  }
  
  public static d Mj()
  {
    GMTrace.i(1390227226624L, 10358);
    if (gXw == null) {}
    try
    {
      if (gXw == null) {
        gXw = new d();
      }
      d locald = gXw;
      GMTrace.o(1390227226624L, 10358);
      return locald;
    }
    finally {}
  }
  
  public static void a(int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(1389958791168L, 10356);
    Intent localIntent = new Intent("com.tencent.mm.Intent.ACTION_CLICK_FLOW_REPORT");
    localIntent.putExtra("opCode", paramInt1);
    localIntent.putExtra("ui", paramString);
    localIntent.putExtra("uiHashCode", paramInt2);
    localIntent.putExtra("nowMilliSecond", bg.Pv());
    localIntent.putExtra("elapsedRealtime", SystemClock.elapsedRealtime());
    paramString = ab.getContext();
    if (paramString != null)
    {
      if (ab.bPY())
      {
        c.Mh().r(localIntent);
        GMTrace.o(1389958791168L, 10356);
        return;
      }
      w.d("MicroMsg.ClickFlowStatSender", "sendBroadcast, Intent: %s, Extra: %s", new Object[] { localIntent, localIntent.getExtras() });
      paramString.sendBroadcast(localIntent);
    }
    GMTrace.o(1389958791168L, 10356);
  }
  
  public static void b(Application paramApplication)
  {
    GMTrace.i(1389824573440L, 10355);
    paramApplication.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks()
    {
      public final void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
      {
        GMTrace.i(1395461718016L, 10397);
        d.Mj().a(1, paramAnonymousActivity);
        GMTrace.o(1395461718016L, 10397);
      }
      
      public final void onActivityDestroyed(Activity paramAnonymousActivity)
      {
        GMTrace.i(1396267024384L, 10403);
        d.Mj().a(6, paramAnonymousActivity);
        GMTrace.o(1396267024384L, 10403);
      }
      
      public final void onActivityPaused(Activity paramAnonymousActivity)
      {
        GMTrace.i(1395864371200L, 10400);
        d.Mj().a(4, paramAnonymousActivity);
        GMTrace.o(1395864371200L, 10400);
      }
      
      public final void onActivityResumed(Activity paramAnonymousActivity)
      {
        GMTrace.i(1395730153472L, 10399);
        d.Mj().a(3, paramAnonymousActivity);
        GMTrace.o(1395730153472L, 10399);
      }
      
      public final void onActivitySaveInstanceState(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
      {
        GMTrace.i(1396132806656L, 10402);
        GMTrace.o(1396132806656L, 10402);
      }
      
      public final void onActivityStarted(Activity paramAnonymousActivity)
      {
        GMTrace.i(1395595935744L, 10398);
        d.Mj().a(2, paramAnonymousActivity);
        GMTrace.o(1395595935744L, 10398);
      }
      
      public final void onActivityStopped(Activity paramAnonymousActivity)
      {
        GMTrace.i(1395998588928L, 10401);
        d.Mj().a(5, paramAnonymousActivity);
        GMTrace.o(1395998588928L, 10401);
      }
    });
    GMTrace.o(1389824573440L, 10355);
  }
  
  public static void e(String paramString, long paramLong1, long paramLong2)
  {
    GMTrace.i(1390361444352L, 10359);
    if ((com.tencent.mm.protocal.d.tJF) || (com.tencent.mm.protocal.d.tJG) || (com.tencent.mm.protocal.d.tJE))
    {
      w.i("MicroMsg.ClickFlowStatSender", "kvCheck :%s [%s,%s,%s]", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong2 - paramLong1) });
      com.tencent.mm.plugin.report.d.oqe.A(13393, "99999,0,0," + paramLong1 + "," + paramLong2 + "," + paramString);
    }
    GMTrace.o(1390361444352L, 10359);
  }
  
  public final void a(int paramInt, Activity paramActivity)
  {
    GMTrace.i(16012980256768L, 119306);
    int i = paramActivity.hashCode();
    paramActivity = paramActivity.getComponentName().getClassName();
    boolean bool = this.gXv.contains(paramActivity);
    w.v("MicroMsg.ClickFlowStatSender", "callback opCode:%d activity:%s hash:%d ignore:%s %s", new Object[] { Integer.valueOf(paramInt), paramActivity, Integer.valueOf(i), Boolean.valueOf(bool), bg.bQW() });
    if (bool)
    {
      GMTrace.o(16012980256768L, 119306);
      return;
    }
    a(paramInt, paramActivity, i);
    GMTrace.o(16012980256768L, 119306);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */