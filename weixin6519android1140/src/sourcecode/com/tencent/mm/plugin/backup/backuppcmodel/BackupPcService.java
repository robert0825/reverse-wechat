package com.tencent.mm.plugin.backup.backuppcmodel;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class BackupPcService
  extends Service
{
  private boolean jaN;
  private boolean jaO;
  
  public BackupPcService()
  {
    GMTrace.i(9597507076096L, 71507);
    this.jaN = false;
    this.jaO = false;
    GMTrace.o(9597507076096L, 71507);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(9597909729280L, 71510);
    GMTrace.o(9597909729280L, 71510);
    return null;
  }
  
  public void onCreate()
  {
    GMTrace.i(9597641293824L, 71508);
    w.i("MicroMsg.BackupPcService", "onCreate.");
    super.onCreate();
    GMTrace.o(9597641293824L, 71508);
  }
  
  public void onDestroy()
  {
    GMTrace.i(9598043947008L, 71511);
    super.onDestroy();
    w.i("MicroMsg.BackupPcService", "onDestroy thread:" + Thread.currentThread().getName());
    GMTrace.o(9598043947008L, 71511);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(9597775511552L, 71509);
    w.i("MicroMsg.BackupPcService", "onStartCommand.");
    if (paramIntent == null)
    {
      w.w("MicroMsg.BackupPcService", "onStartCommand intent is null");
      GMTrace.o(9597775511552L, 71509);
      return 2;
    }
    final String str = paramIntent.getStringExtra("url");
    if (bg.nm(str))
    {
      w.e("MicroMsg.BackupPcService", "onStartCommand url is null");
      stopSelf();
      GMTrace.o(9597775511552L, 71509);
      return 2;
    }
    if (str.contains("mm.gj.qq.com"))
    {
      w.i("MicroMsg.BackupPcService", "onStartCommand url from gj stop and start BakOldUSBService");
      startService(new Intent(this, BakOldUSBService.class).putExtra("url", paramIntent.getStringExtra("url")).putExtra("isFromWifi", true));
      stopSelf();
      GMTrace.o(9597775511552L, 71509);
      return 2;
    }
    this.jaN = paramIntent.getBooleanExtra("isFromWifi", false);
    this.jaO = paramIntent.getBooleanExtra("isMove", false);
    w.i("MicroMsg.BackupPcService", "onStartCommand Broadcast url:%s, isFromWifi:%b, isMove:%b", new Object[] { str, Boolean.valueOf(this.jaN), Boolean.valueOf(this.jaO) });
    if ((!this.jaO) && (!at.AT()))
    {
      w.e("MicroMsg.BackupPcService", "onStartCommand onStartCommand not in Login state");
      paramIntent = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
      paramIntent.addFlags(335544320);
      paramIntent.putExtra("nofification_type", "back_to_pcmgr_notification");
      startActivity(paramIntent);
      GMTrace.o(9597775511552L, 71509);
      return 2;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(9599922995200L, 71525);
        Object localObject = b.afh().afi();
        String str = str;
        w.w("MicroMsg.BackupPcProcessMgr", "~~~~~~~~~~~~  start by url:%s", new Object[] { str });
        com.tencent.mm.plugin.backup.a.e.ku(1);
        at.AR();
        ((c)localObject).jaw = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vvP, Integer.valueOf(0))).intValue();
        b.afh();
        SharedPreferences.Editor localEditor = b.aen().edit();
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0);
        localEditor.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L);
        localEditor.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L);
        localEditor.commit();
        ((c)localObject).jax = true;
        at.wS().a(595, ((c)localObject).iYb);
        localObject = new com.tencent.mm.plugin.backup.f.e(str);
        at.wS().a((k)localObject, 0);
        GMTrace.o(9599922995200L, 71525);
      }
    });
    GMTrace.o(9597775511552L, 71509);
    return 2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\backup\backuppcmodel\BackupPcService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */