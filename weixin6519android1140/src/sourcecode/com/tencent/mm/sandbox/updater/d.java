package com.tencent.mm.sandbox.updater;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.y.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.tools.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.e.g;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;
import com.tencent.xweb.util.b;
import com.tencent.xweb.x5.sdk.f;
import com.tencent.xweb.x5.sdk.h;

public final class d
  implements a
{
  private Intent intent;
  Notification qwY;
  private a vfM;
  int vfN;
  boolean vfO;
  private boolean vfP;
  
  static
  {
    GMTrace.i(3599853682688L, 26821);
    p.a(ab.getContext(), new b()
    {
      public final void d(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19597398900736L, 146012);
        w.d(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19597398900736L, 146012);
      }
      
      public final void e(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19597130465280L, 146010);
        w.e(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19597130465280L, 146010);
      }
      
      public final void i(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19596996247552L, 146009);
        w.i(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19596996247552L, 146009);
      }
      
      public final void v(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19597533118464L, 146013);
        w.v(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19597533118464L, 146013);
      }
      
      public final void w(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(19597264683008L, 146011);
        w.w(paramAnonymousString1, paramAnonymousString2);
        GMTrace.o(19597264683008L, 146011);
      }
    });
    GMTrace.o(3599853682688L, 26821);
  }
  
  public d()
  {
    GMTrace.i(3598779940864L, 26813);
    this.vfM = null;
    this.intent = new Intent();
    this.qwY = null;
    this.vfN = 999;
    this.vfO = false;
    this.vfP = false;
    GMTrace.o(3598779940864L, 26813);
  }
  
  public static d bOS()
  {
    GMTrace.i(3598645723136L, 26812);
    d locald = b.vfR;
    GMTrace.o(3598645723136L, 26812);
    return locald;
  }
  
  private void bOT()
  {
    GMTrace.i(3599048376320L, 26815);
    f.gn(ab.getContext());
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    if (localSharedPreferences != null)
    {
      w.i("MicroMsg.TBSDownloadMgr", "now start download,hasDownloadOverSea over sea = %b, is now oversea = %b", new Object[] { Boolean.valueOf(this.vfP), Boolean.valueOf(this.vfO) });
      if ((this.vfP) || (this.vfO)) {
        localSharedPreferences.edit().putBoolean("tbs_download_oversea", true).commit();
      }
    }
    GMTrace.o(3599048376320L, 26815);
  }
  
  public final boolean af(Intent paramIntent)
  {
    GMTrace.i(3599182594048L, 26816);
    this.intent = paramIntent;
    if (this.intent.getIntExtra("intent_extra_download_type", 1) == 2) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      this.vfO = bool1;
      paramIntent = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
      if (paramIntent != null) {
        this.vfP = paramIntent.getBoolean("tbs_download_oversea", false);
      }
      w.i("MicroMsg.TBSDownloadMgr", "isOverSea = %b, hasDownloadOverSea = %b", new Object[] { Boolean.valueOf(this.vfO), Boolean.valueOf(this.vfP) });
      if (!f.isDownloading()) {
        break;
      }
      w.i("MicroMsg.TBSDownloadMgr", "TBS already downloading, ignore duplicated request");
      GMTrace.o(3599182594048L, 26816);
      return true;
    }
    paramIntent = ab.getContext();
    int i = WebView.getTbsCoreVersion(paramIntent);
    bool1 = f.y(paramIntent, this.vfO | this.vfP);
    boolean bool2 = am.isWifi(paramIntent);
    boolean bool3 = this.intent.getBooleanExtra("intent_extra_download_ignore_network_type", false);
    w.i("MicroMsg.TBSDownloadMgr", "TBS download, tbsCoreVersion = %d, needDownload = %b, isWifi = %b, ignoreNetworkType = %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
    if (((bool2) || (bool3)) && (bool1))
    {
      if (this.vfM == null)
      {
        this.vfM = new a();
        com.tencent.xweb.x5.sdk.d.a(this.vfM);
        j.nU(2);
      }
      bOT();
      j.nU(3);
      GMTrace.o(3599182594048L, 26816);
      return true;
    }
    GMTrace.o(3599182594048L, 26816);
    return false;
  }
  
  public final boolean isBusy()
  {
    GMTrace.i(3599316811776L, 26817);
    boolean bool1 = f.isDownloading();
    boolean bool2 = com.tencent.xweb.x5.sdk.d.getTBSInstalling();
    w.i("MicroMsg.TBSDownloadMgr", "isBusy isDownloading = %b, isInstalling = %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if ((bool1) || (bool2))
    {
      GMTrace.o(3599316811776L, 26817);
      return true;
    }
    GMTrace.o(3599316811776L, 26817);
    return false;
  }
  
  public final void kz(boolean paramBoolean)
  {
    GMTrace.i(3598914158592L, 26814);
    if (this.vfM == null)
    {
      w.w("MicroMsg.TBSDownloadMgr", "TBS download not inited, ignore");
      GMTrace.o(3598914158592L, 26814);
      return;
    }
    Context localContext = ab.getContext();
    boolean bool1 = f.isDownloading();
    boolean bool2 = f.y(localContext, this.vfO | this.vfP);
    boolean bool3 = this.intent.getBooleanExtra("intent_extra_download_ignore_network_type", false);
    boolean bool4 = f.col();
    w.i("MicroMsg.TBSDownloadMgr", "setNetStatChanged, isWifi = %b, downloading = %b, needDownload = %b, ignoreNetworkType = %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
    if (((paramBoolean) || (bool3)) && (!bool1) && (bool2))
    {
      bOT();
      j.nU(3);
      GMTrace.o(3598914158592L, 26814);
      return;
    }
    if ((!paramBoolean) && (!bool3) && (bool1) && (!bool4))
    {
      f.stopDownload();
      j.nU(4);
    }
    GMTrace.o(3598914158592L, 26814);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(3599451029504L, 26818);
    w.i("MicroMsg.TBSDownloadMgr", "onDestroy");
    GMTrace.o(3599451029504L, 26818);
  }
  
  private final class a
    implements h
  {
    public a()
    {
      GMTrace.i(3575828709376L, 26642);
      GMTrace.o(3575828709376L, 26642);
    }
    
    public final void jA(int paramInt)
    {
      GMTrace.i(3575962927104L, 26643);
      w.i("MicroMsg.MyTbsListener", "onDownloadFinish, result = %d", new Object[] { Integer.valueOf(paramInt) });
      j.dX(5, paramInt);
      if (paramInt != 110)
      {
        if (paramInt != 100) {
          break label113;
        }
        g.ork.a(64, 64, 4, 3, 1, 1, false);
      }
      for (;;)
      {
        Object localObject = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
        if (localObject != null)
        {
          w.i("MicroMsg.MyTbsListener", "tbs has download finished, save to sharedpreference");
          localObject = ((SharedPreferences)localObject).edit();
          ((SharedPreferences.Editor)localObject).putBoolean("tbs_download_finished", true);
          ((SharedPreferences.Editor)localObject).apply();
        }
        GMTrace.o(3575962927104L, 26643);
        return;
        label113:
        g.ork.a(64L, 3L, 1L, false);
      }
    }
    
    public final void jB(int paramInt)
    {
      GMTrace.i(3576097144832L, 26644);
      w.i("MicroMsg.MyTbsListener", "onInstallFinish, result = %d", new Object[] { Integer.valueOf(paramInt) });
      j.dX(6, paramInt);
      if ((paramInt == 200) || (paramInt == 220))
      {
        g.ork.a(64, 64, 7, 6, 1, 1, false);
        Object localObject1 = d.this;
        if (((d)localObject1).vfO)
        {
          Object localObject2 = bg.bs(ab.getContext());
          w.i("MicroMsg.TBSDownloadMgr", "topActivityName = %s", new Object[] { localObject2 });
          if ((bg.nm((String)localObject2)) || (!((String)localObject2).equalsIgnoreCase("com.tencent.mm.plugin.webview.ui.tools.WebViewUI")))
          {
            localObject2 = new Intent();
            ((Intent)localObject2).setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
            ((Intent)localObject2).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
            ab.getContext().sendBroadcast((Intent)localObject2);
            Object localObject3 = ab.getContext();
            localObject2 = new y.d((Context)localObject3);
            NotificationManager localNotificationManager = (NotificationManager)((Context)localObject3).getSystemService("notification");
            ((y.d)localObject2).L(com.tencent.mm.bi.a.bIN());
            ((y.d)localObject2).a(((Context)localObject3).getString(R.l.eko));
            ((y.d)localObject2).b(((Context)localObject3).getString(R.l.ekn));
            ((y.d)localObject2).b(2, false);
            ((y.d)localObject2).o(true);
            localObject3 = new Intent();
            ((y.d)localObject2).rg = PendingIntent.getActivity(ab.getContext(), 0, (Intent)localObject3, 0);
            ((d)localObject1).qwY = ((y.d)localObject2).build();
            localNotificationManager.notify(((d)localObject1).vfN, ((d)localObject1).qwY);
            localObject1 = new Intent();
            ((Intent)localObject1).setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
            ((Intent)localObject1).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
            ab.getContext().sendBroadcast((Intent)localObject1);
          }
        }
        GMTrace.o(3576097144832L, 26644);
        return;
      }
      g.ork.a(64L, 6L, 1L, false);
      GMTrace.o(3576097144832L, 26644);
    }
    
    public final void jC(int paramInt)
    {
      GMTrace.i(3576231362560L, 26645);
      GMTrace.o(3576231362560L, 26645);
    }
  }
  
  private static final class b
  {
    public static final d vfR;
    
    static
    {
      GMTrace.i(3569520476160L, 26595);
      vfR = new d();
      GMTrace.o(3569520476160L, 26595);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */