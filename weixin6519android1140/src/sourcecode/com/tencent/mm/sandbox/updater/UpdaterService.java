package com.tencent.mm.sandbox.updater;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.model.w.a;
import com.tencent.mm.sandbox.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@JgClassChecked(author=20, fComment="checked", lastDate="20141015", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class UpdaterService
  extends Service
{
  private static UpdaterService vgG;
  static final long vgI;
  private boolean gOF;
  Map<Integer, a> vgH;
  private aj vgJ;
  private a vgK;
  
  static
  {
    GMTrace.i(3592471707648L, 26766);
    vgG = null;
    vgI = 1800000L;
    GMTrace.o(3592471707648L, 26766);
  }
  
  public UpdaterService()
  {
    GMTrace.i(3590861094912L, 26754);
    this.vgH = new HashMap();
    this.gOF = false;
    this.vgJ = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(3565091291136L, 26562);
        if (!UpdaterService.a(UpdaterService.this))
        {
          GMTrace.o(3565091291136L, 26562);
          return true;
        }
        GMTrace.o(3565091291136L, 26562);
        return false;
      }
    }, true);
    this.vgK = null;
    GMTrace.o(3590861094912L, 26754);
  }
  
  public static UpdaterService bPm()
  {
    GMTrace.i(3591129530368L, 26756);
    UpdaterService localUpdaterService = vgG;
    GMTrace.o(3591129530368L, 26756);
    return localUpdaterService;
  }
  
  private boolean bPn()
  {
    GMTrace.i(3592069054464L, 26763);
    if (this.vgH.size() > 0)
    {
      Iterator localIterator = this.vgH.values().iterator();
      while (localIterator.hasNext()) {
        if (((a)localIterator.next()).isBusy())
        {
          w.i("MicroMsg.UpdaterService", "checkAndTryStopSelf, dont stop, some download mgr still busy");
          GMTrace.o(3592069054464L, 26763);
          return false;
        }
      }
    }
    w.i("MicroMsg.UpdaterService", "checkAndTryStopSelf, UpdaterService killed self");
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3568849387520L, 26590);
        if (UpdaterService.b(UpdaterService.this).size() > 0)
        {
          Iterator localIterator = UpdaterService.b(UpdaterService.this).values().iterator();
          while (localIterator.hasNext()) {
            if (((a)localIterator.next()).isBusy())
            {
              w.i("MicroMsg.UpdaterService", "checkAndTryStopSelf2, dont stop, some download mgr still busy");
              GMTrace.o(3568849387520L, 26590);
              return;
            }
          }
        }
        if (!w.a.bJm())
        {
          UpdaterService.this.stopSelf();
          GMTrace.o(3568849387520L, 26590);
          return;
        }
        w.i("TBSDownloadMgr", "is still busy");
        GMTrace.o(3568849387520L, 26590);
      }
    }, 10000L);
    GMTrace.o(3592069054464L, 26763);
    return true;
  }
  
  public static void ci()
  {
    GMTrace.i(3590995312640L, 26755);
    w.i("MicroMsg.UpdaterService", "UpdaterService stopInstance()");
    if (vgG != null) {
      vgG.bPn();
    }
    GMTrace.o(3590995312640L, 26755);
  }
  
  private void k(Intent paramIntent)
  {
    GMTrace.i(3591934836736L, 26762);
    if (paramIntent == null)
    {
      GMTrace.o(3591934836736L, 26762);
      return;
    }
    int i = paramIntent.getIntExtra("intent_extra_download_type", 0);
    w.i("MicroMsg.UpdaterService", "handleCommand, downloadType = %d", new Object[] { Integer.valueOf(i) });
    a locala = (a)this.vgH.get(Integer.valueOf(i));
    if (locala != null)
    {
      boolean bool = locala.af(paramIntent);
      w.i("MicroMsg.UpdaterService", "handleCommand ret = %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        bPn();
      }
    }
    GMTrace.o(3591934836736L, 26762);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(3591800619008L, 26761);
    GMTrace.o(3591800619008L, 26761);
    return null;
  }
  
  public void onCreate()
  {
    GMTrace.i(3591263748096L, 26757);
    super.onCreate();
    w.i("MicroMsg.UpdaterService", "onCreate");
    c.f(hashCode(), this);
    vgG = this;
    this.vgH.put(Integer.valueOf(0), j.a.vgF);
    this.vgH.put(Integer.valueOf(1), d.bOS());
    this.vgH.put(Integer.valueOf(2), d.bOS());
    MMActivity.eJ(this);
    Object localObject = this.vgJ;
    long l = vgI;
    ((aj)localObject).z(l, l);
    localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("android.net.conn.CONNECTIVITY_CHANGE");
    this.vgK = new a();
    registerReceiver(this.vgK, (IntentFilter)localObject);
    GMTrace.o(3591263748096L, 26757);
  }
  
  public void onDestroy()
  {
    GMTrace.i(3591666401280L, 26760);
    w.i("MicroMsg.UpdaterService", "onDestroy");
    this.vgJ.stopTimer();
    if (this.vgK != null) {
      unregisterReceiver(this.vgK);
    }
    if (this.gOF) {
      stopForeground(true);
    }
    Iterator localIterator = this.vgH.values().iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).onDestroy();
    }
    this.vgH.clear();
    vgG = null;
    c.g(hashCode(), this);
    super.onDestroy();
    GMTrace.o(3591666401280L, 26760);
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    GMTrace.i(3591397965824L, 26758);
    w.i("MicroMsg.UpdaterService", "onStart intent = %s", new Object[] { paramIntent });
    k(paramIntent);
    GMTrace.o(3591397965824L, 26758);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(3591532183552L, 26759);
    w.i("MicroMsg.UpdaterService", "onStartCommand intent = %s", new Object[] { paramIntent });
    if (paramIntent != null)
    {
      if (!paramIntent.getBooleanExtra("intent_extra_run_in_foreground", false)) {
        break label129;
      }
      w.i("MicroMsg.UpdaterService", "runServiceInForground");
      PendingIntent localPendingIntent = PendingIntent.getService(this, 0, new Intent(), 0);
      startForeground(0, new Notification.Builder(this).setTicker("updater service running forground").setWhen(System.currentTimeMillis()).setContentTitle("Updater Service").setContentText("updater service running forground").setContentIntent(localPendingIntent).getNotification());
    }
    for (this.gOF = true;; this.gOF = true)
    {
      label129:
      do
      {
        k(paramIntent);
        GMTrace.o(3591532183552L, 26759);
        return 2;
      } while ((Build.VERSION.SDK_INT >= 18) || (this.gOF));
      startForeground(64222, new Notification());
    }
  }
  
  @JgClassChecked(author=20, fComment="checked", lastDate="20141015", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  static final class a
    extends BroadcastReceiver
  {
    a()
    {
      GMTrace.i(3593545449472L, 26774);
      GMTrace.o(3593545449472L, 26774);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(3593679667200L, 26775);
      if (UpdaterService.bPm() != null)
      {
        paramIntent = UpdaterService.bPm();
        boolean bool = am.isWifi(paramContext);
        if (paramIntent.vgH.size() > 0)
        {
          paramContext = paramIntent.vgH.values().iterator();
          while (paramContext.hasNext()) {
            ((a)paramContext.next()).kz(bool);
          }
        }
      }
      GMTrace.o(3593679667200L, 26775);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\sandbox\updater\UpdaterService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */