package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.c;
import com.tencent.mm.protocal.c.ze;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class BakOldUSBService
  extends Service
  implements com.tencent.mm.ad.e
{
  private boolean jaN;
  private int jdD;
  
  public BakOldUSBService()
  {
    GMTrace.i(14734959050752L, 109784);
    this.jaN = false;
    this.jdD = -1;
    GMTrace.o(14734959050752L, 109784);
  }
  
  private boolean afT()
  {
    GMTrace.i(14735630139392L, 109789);
    if ((this.jdD == 0) || (this.jdD == 1))
    {
      GMTrace.o(14735630139392L, 109789);
      return true;
    }
    GMTrace.o(14735630139392L, 109789);
    return false;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(14735764357120L, 109790);
    String str;
    if (paramk == null)
    {
      str = "";
      w.i("MicroMsg.BakOldUSBService", "summerbak onSceneEnd [%d, %d, %s] [%s] backupScene[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, str, Integer.valueOf(this.jdD) });
      if (!(paramk instanceof com.tencent.mm.plugin.backup.f.b)) {
        break label204;
      }
      w.d("MicroMsg.BakOldUSBService", "summerback BackupBaseScene type[%d], backupScene[%d]", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(this.jdD) });
      if ((paramk.getType() == 1) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
        paramString.addFlags(335544320);
        paramString.putExtra("nofification_type", "back_to_pcmgr_notification");
        if (afT()) {
          break label198;
        }
      }
    }
    label198:
    for (boolean bool = true;; bool = false)
    {
      paramString.putExtra("newPCBackup", bool);
      startActivity(paramString);
      stopSelf();
      GMTrace.o(14735764357120L, 109790);
      return;
      str = paramk.getClass().getSimpleName();
      break;
    }
    label204:
    if ((paramk instanceof com.tencent.mm.plugin.backup.bakoldlogic.c.e))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((com.tencent.mm.plugin.backup.bakoldlogic.c.e)paramk).agC();
        a.agk().iVm = paramString.ID;
        a.agk().iVn = paramString.tSX;
        a.agk().iVo = paramString.tSY;
        this.jdD = paramString.tOG;
        w.d("MicroMsg.BakOldUSBService", "summerbak getconnetinfo type: %d, scene: %d isFromWifi:%b", new Object[] { Integer.valueOf(paramString.jib), Integer.valueOf(paramString.tOG), Boolean.valueOf(this.jaN) });
        if ((!this.jaN) && (paramString.jib == 1))
        {
          w.e("MicroMsg.BakOldUSBService", "broast from usb but type is wifi, url may be fake!!!!");
          stopSelf();
          GMTrace.o(14735764357120L, 109790);
          return;
        }
        if (afT())
        {
          a.agk().agl().bs(paramString.tSP, paramString.tSQ);
          com.tencent.mm.plugin.backup.f.b.a(a.agk().agl());
          com.tencent.mm.plugin.backup.f.b.a(a.agk().agn());
          com.tencent.mm.plugin.backup.f.b.ku(1);
          a.agk().agn().b(paramString.jib, paramString.tSO);
          GMTrace.o(14735764357120L, 109790);
          return;
        }
        w.d("MicroMsg.BakOldUSBService", "summerbak onSceneEnd need todo for new scene:% ", new Object[] { Integer.valueOf(this.jdD) });
        GMTrace.o(14735764357120L, 109790);
        return;
      }
      a.agk().agm().jfz = 2;
      a.agk().agm().BH();
      if ((paramInt1 != 4) || (paramInt2 != 63525)) {
        break label506;
      }
      w.i("MicroMsg.BakOldUSBService", "getConnect info: INVALID URL");
    }
    for (;;)
    {
      a.agk().agl();
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.agt();
      stopSelf();
      GMTrace.o(14735764357120L, 109790);
      return;
      label506:
      w.i("MicroMsg.BakOldUSBService", "getConnect info other error");
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(14735093268480L, 109785);
    w.i("MicroMsg.BakOldUSBService", "onBind()");
    GMTrace.o(14735093268480L, 109785);
    return null;
  }
  
  public void onCreate()
  {
    GMTrace.i(14735227486208L, 109786);
    w.i("MicroMsg.BakOldUSBService", "onCreate()");
    super.onCreate();
    at.wS().a(595, this);
    com.tencent.mm.plugin.backup.f.b.a(1, this);
    GMTrace.o(14735227486208L, 109786);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14735495921664L, 109788);
    at.wS().b(595, this);
    com.tencent.mm.plugin.backup.f.b.b(1, this);
    super.onDestroy();
    w.i("MicroMsg.BakOldUSBService", "onDestroy thread:" + Thread.currentThread().getName());
    GMTrace.o(14735495921664L, 109788);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramInt1 = 1;
    GMTrace.i(14735361703936L, 109787);
    w.i("MicroMsg.BakOldUSBService", "onStartCommand() scene：%d", new Object[] { Integer.valueOf(this.jdD) });
    if (paramIntent == null)
    {
      w.w("MicroMsg.BakOldUSBService", "onStartCommand intent is null");
      GMTrace.o(14735361703936L, 109787);
      return 2;
    }
    String str = paramIntent.getStringExtra("url");
    if (bg.nm(str))
    {
      w.e("MicroMsg.BakOldUSBService", "onStartCommand url is null");
      stopSelf();
      GMTrace.o(14735361703936L, 109787);
      return 2;
    }
    this.jaN = paramIntent.getBooleanExtra("isFromWifi", false);
    w.i("MicroMsg.BakOldUSBService", "Broadcast url:%s, isFromWifi:%b", new Object[] { str, Boolean.valueOf(this.jaN) });
    a.agk().agm().BH();
    paramIntent = a.agk().agm();
    if (this.jaN) {
      paramInt1 = 2;
    }
    paramIntent.jfy = paramInt1;
    if (!at.AT())
    {
      w.e("MicroMsg.BakOldUSBService", "onStartCommand not in Login state");
      paramIntent = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
      paramIntent.addFlags(335544320);
      paramIntent.putExtra("nofification_type", "back_to_pcmgr_notification");
      startActivity(paramIntent);
      GMTrace.o(14735361703936L, 109787);
      return 2;
    }
    paramIntent = new com.tencent.mm.plugin.backup.bakoldlogic.c.e(str);
    at.wS().a(paramIntent, 0);
    GMTrace.o(14735361703936L, 109787);
    return 2;
  }
  
  public boolean stopService(Intent paramIntent)
  {
    GMTrace.i(14735898574848L, 109791);
    w.i("MicroMsg.BakOldUSBService", "stopService.");
    boolean bool = super.stopService(paramIntent);
    GMTrace.o(14735898574848L, 109791);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmodel\BakOldUSBService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */