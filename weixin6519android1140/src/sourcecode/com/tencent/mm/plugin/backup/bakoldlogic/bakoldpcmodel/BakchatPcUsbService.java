package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.jg.JgClassChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui.BakMoveErrUI;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui.BakMoveNewUI;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.protocal.c.ze;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.LinkedList;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.SERVICESCHECK})
public class BakchatPcUsbService
  extends Service
  implements com.tencent.mm.ad.e
{
  private boolean jaN;
  private boolean jaO;
  
  public BakchatPcUsbService()
  {
    GMTrace.i(14790793625600L, 110200);
    this.jaN = false;
    this.jaO = false;
    GMTrace.o(14790793625600L, 110200);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(14791464714240L, 110205);
    if ((paramk instanceof com.tencent.mm.plugin.backup.f.b))
    {
      if ((paramk.getType() == 1) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
        paramString.addFlags(335544320);
        paramString.putExtra("nofification_type", "back_to_pcmgr_notification");
        startActivity(paramString);
      }
      stopSelf();
      GMTrace.o(14791464714240L, 110205);
      return;
    }
    if ((paramk instanceof com.tencent.mm.plugin.backup.bakoldlogic.c.e))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = ((com.tencent.mm.plugin.backup.bakoldlogic.c.e)paramk).agC();
        if (this.jaO)
        {
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().iVm = paramk.ID;
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().iVn = paramk.tSX;
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().iVo = paramk.tSY;
          com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().afY());
          com.tencent.mm.plugin.backup.f.b.a(com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().aeI());
          com.tencent.mm.plugin.backup.f.b.ku(2);
          paramString = null;
          paramInt1 = 0;
          if (paramk.tSN > 0)
          {
            Object localObject = (nu)paramk.tSO.getFirst();
            paramString = ((nu)localObject).uez;
            paramInt1 = ((Integer)((nu)localObject).ueA.getFirst()).intValue();
            if (!q.zE().equals(paramk.tSQ))
            {
              w.e("MicroMsg.BakchatPcUsbService", "convName not equal:self:%s, resp.acc:%s", new Object[] { q.zE(), paramk.tSQ });
              paramString = null;
            }
            if (bg.nm(paramString)) {
              break label403;
            }
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel.a.afV().aeI().connect(paramString, paramInt1);
            localObject = new Intent(ab.getContext(), BakMoveNewUI.class);
            ((Intent)localObject).putExtra("WifiName", paramk.tSR);
            ((Intent)localObject).putExtra("DataSize", paramk.jhw);
            ((Intent)localObject).putExtra("ip", paramString);
            w.i("MicroMsg.BakchatPcUsbService", "WifiName %s, DataSize:%d, ip:%s, port:%d", new Object[] { paramk.tSR, Long.valueOf(paramk.jhw), paramString, Integer.valueOf(paramInt1) });
            ((Intent)localObject).addFlags(335544320);
            ab.getContext().startActivity((Intent)localObject);
          }
          for (;;)
          {
            stopSelf();
            GMTrace.o(14791464714240L, 110205);
            return;
            w.e("MicroMsg.BakchatPcUsbService", "addr convMsgCount is empty");
            break;
            label403:
            paramString = new Intent(ab.getContext(), BakMoveErrUI.class);
            paramString.putExtra("getConnectInfoErr", true);
            paramString.addFlags(335544320);
            ab.getContext().startActivity(paramString);
          }
        }
        if (this.jaN)
        {
          w.i("MicroMsg.BakchatPcUsbService", "from wifi, reconnect");
          a.agk().agn().ago();
        }
        if ((!this.jaN) && (paramk.jib == 1))
        {
          w.e("MicroMsg.BakchatPcUsbService", "broast from usb but type is wifi, url may be fake!!!!");
          stopSelf();
          GMTrace.o(14791464714240L, 110205);
          return;
        }
        a.agk().iVm = paramk.ID;
        a.agk().iVn = paramk.tSX;
        a.agk().iVo = paramk.tSY;
        a.agk().agl().bs(paramk.tSP, paramk.tSQ);
        com.tencent.mm.plugin.backup.f.b.a(a.agk().agl());
        com.tencent.mm.plugin.backup.f.b.a(a.agk().agn());
        com.tencent.mm.plugin.backup.f.b.ku(1);
        a.agk().agn().b(paramk.jib, paramk.tSO);
        GMTrace.o(14791464714240L, 110205);
        return;
      }
      if (this.jaO)
      {
        paramString = new Intent(ab.getContext(), BakMoveErrUI.class);
        paramString.putExtra("getConnectInfoErr", true);
        paramString.addFlags(335544320);
        ab.getContext().startActivity(paramString);
        stopSelf();
        GMTrace.o(14791464714240L, 110205);
        return;
      }
      a.agk().agm().jfz = 2;
      a.agk().agm().BH();
      if ((paramInt1 != 4) || (paramInt2 != 63525)) {
        break label728;
      }
      w.i("MicroMsg.BakchatPcUsbService", "getConnect info: INVALID URL");
      if (!this.jaN) {}
    }
    for (;;)
    {
      a.agk().agl();
      e.agt();
      stopSelf();
      GMTrace.o(14791464714240L, 110205);
      return;
      label728:
      w.i("MicroMsg.BakchatPcUsbService", "getConnect info other error");
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(14790927843328L, 110201);
    GMTrace.o(14790927843328L, 110201);
    return null;
  }
  
  public void onCreate()
  {
    GMTrace.i(14791062061056L, 110202);
    w.i("MicroMsg.BakchatPcUsbService", "onCreate()");
    super.onCreate();
    at.wS().a(595, this);
    com.tencent.mm.plugin.backup.f.b.a(1, this);
    GMTrace.o(14791062061056L, 110202);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14791330496512L, 110204);
    at.wS().b(595, this);
    com.tencent.mm.plugin.backup.f.b.b(1, this);
    super.onDestroy();
    w.i("MicroMsg.BakchatPcUsbService", "onDestroy" + Thread.currentThread().getName());
    GMTrace.o(14791330496512L, 110204);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    paramInt1 = 1;
    GMTrace.i(14791196278784L, 110203);
    w.i("MicroMsg.BakchatPcUsbService", "onStartCommand()");
    if (paramIntent == null)
    {
      w.w("MicroMsg.BakchatPcUsbService", "onStartCommand intent is null");
      GMTrace.o(14791196278784L, 110203);
      return 2;
    }
    String str = paramIntent.getStringExtra("url");
    if (bg.nm(str))
    {
      w.e("MicroMsg.BakchatPcUsbService", "onStartCommand url is null");
      stopSelf();
      GMTrace.o(14791196278784L, 110203);
      return 2;
    }
    this.jaN = paramIntent.getBooleanExtra("isFromWifi", false);
    this.jaO = paramIntent.getBooleanExtra("isMove", false);
    w.i("MicroMsg.BakchatPcUsbService", "Broadcast url:%s, isFromWifi:%b, isMove:%b", new Object[] { str, Boolean.valueOf(this.jaN), Boolean.valueOf(this.jaO) });
    if (this.jaO)
    {
      paramIntent = new com.tencent.mm.plugin.backup.bakoldlogic.c.e(str);
      at.wS().a(paramIntent, 0);
      com.tencent.mm.plugin.backup.f.b.b(1, this);
      GMTrace.o(14791196278784L, 110203);
      return 2;
    }
    a.agk().agm().BH();
    paramIntent = a.agk().agm();
    if (this.jaN) {
      paramInt1 = 2;
    }
    paramIntent.jfy = paramInt1;
    if ((!this.jaO) && (!at.AT()))
    {
      w.e("MicroMsg.BakchatPcUsbService", "onStartCommand not in Login state");
      paramIntent = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
      paramIntent.addFlags(335544320);
      paramIntent.putExtra("nofification_type", "back_to_pcmgr_notification");
      startActivity(paramIntent);
      GMTrace.o(14791196278784L, 110203);
      return 2;
    }
    paramIntent = new com.tencent.mm.plugin.backup.bakoldlogic.c.e(str);
    at.wS().a(paramIntent, 0);
    GMTrace.o(14791196278784L, 110203);
    return 2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldpcmodel\BakchatPcUsbService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */