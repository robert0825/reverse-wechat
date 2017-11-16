package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.s;
import com.tencent.mm.sdk.platformtools.af;

public final class d
{
  public static final class a
    implements MMReceivers.a
  {
    public a()
    {
      GMTrace.i(504792875008L, 3761);
      GMTrace.o(504792875008L, 3761);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(504927092736L, 3762);
      if ((paramContext == null) || (paramIntent == null))
      {
        GMTrace.o(504927092736L, 3762);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SandBoxProcessReceiver", "onReceive");
      com.tencent.xweb.x5.sdk.d.reset(paramContext);
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(497545117696L, 3707);
          Process.killProcess(Process.myPid());
          GMTrace.o(497545117696L, 3707);
        }
      }, 5000L);
      GMTrace.o(504927092736L, 3762);
    }
  }
  
  public static final class b
    implements MMReceivers.a
  {
    public b()
    {
      GMTrace.i(496605593600L, 3700);
      GMTrace.o(496605593600L, 3700);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(496739811328L, 3701);
      if ((paramContext == null) || (paramIntent == null))
      {
        GMTrace.o(496739811328L, 3701);
        return;
      }
      String str = paramIntent.getStringExtra("tools_process_action_code_key");
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProcessReceiver", "onReceive, action = " + str);
      boolean bool;
      if (str.equals("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS"))
      {
        com.tencent.mm.sdk.platformtools.w.bPN();
        bool = s.isLocked();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProcessReceiver", "onReceive, ACTION_KILL_TOOLS_PROCESS, x5 kernel video isLocked = %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool) {
          Process.killProcess(Process.myPid());
        }
        GMTrace.o(496739811328L, 3701);
        return;
      }
      if (str.equals("com.tencent.mm.intent.ACTION_TOOLS_REMOVE_COOKIE")) {
        try
        {
          com.tencent.xweb.x5.sdk.d.clearAllWebViewCache(paramContext.getApplicationContext(), true);
          GMTrace.o(496739811328L, 3701);
          return;
        }
        catch (Exception paramContext)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProcessReceiver", "clear cookie faild : " + paramContext.getMessage());
          GMTrace.o(496739811328L, 3701);
          return;
        }
      }
      if (!str.equals("com.tencent.mm.intent.ACIONT_TOOLS_LOAD_DEX"))
      {
        if (str.equals("com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE"))
        {
          bool = paramIntent.getBooleanExtra("tools_clean_webview_cache_ignore_cookie", true);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProcessReceiver", "WebViewCacheClearTask, clearAllWebViewCache, includeCookie = %b", new Object[] { Boolean.valueOf(bool) });
          if (bool)
          {
            com.tencent.xweb.x5.sdk.d.clearAllWebViewCache(paramContext.getApplicationContext(), true);
            GMTrace.o(496739811328L, 3701);
            return;
          }
          com.tencent.xweb.x5.sdk.d.clearAllWebViewCache(paramContext.getApplicationContext(), false);
          GMTrace.o(496739811328L, 3701);
          return;
        }
        if (str.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS"))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProcessReceiver", "start tools process task, try to pre load tbs");
          GMTrace.o(496739811328L, 3701);
          return;
        }
        if (str.equals("com.tencent.mm.intent.ACTION_LOCK_TOOLS_PROCESS"))
        {
          s.lock();
          GMTrace.o(496739811328L, 3701);
          return;
        }
        if (str.equals("com.tencent.mm.intent.ACTION_UNLOCK_TOOLS_PROCESS"))
        {
          s.unlock();
          GMTrace.o(496739811328L, 3701);
          return;
        }
        if (str.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS_DO_NOTHING"))
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.ToolsProcessReceiver", "start tools process and do nothing");
          GMTrace.o(496739811328L, 3701);
          return;
        }
        if (str.equals("com.tencent.mm.intent.ACTION_CHECK_MINIQB_CAN_OPEN_FILE")) {
          com.tencent.mm.pluginsdk.model.w.ac(paramIntent);
        }
      }
      GMTrace.o(496739811328L, 3701);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */