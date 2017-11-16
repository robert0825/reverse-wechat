package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmovemodel;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldmoveui.BakMoveErrUI;
import com.tencent.mm.plugin.backup.f.b;
import com.tencent.mm.protocal.c.nu;
import com.tencent.mm.protocal.c.ze;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.util.LinkedList;

public class MoveService
  extends Service
  implements com.tencent.mm.ad.e
{
  private boolean jaO;
  
  public MoveService()
  {
    GMTrace.i(14742475243520L, 109840);
    this.jaO = true;
    GMTrace.o(14742475243520L, 109840);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(14743146332160L, 109845);
    if ((paramk instanceof b))
    {
      if ((paramk.getType() == 1) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = new Intent().setClassName(this, "com.tencent.mm.ui.LauncherUI");
        paramString.addFlags(335544320);
        paramString.putExtra("nofification_type", "back_to_pcmgr_notification");
        startActivity(paramString);
      }
      stopSelf();
      GMTrace.o(14743146332160L, 109845);
      return;
    }
    if ((paramk instanceof com.tencent.mm.plugin.backup.bakoldlogic.c.e))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = ((com.tencent.mm.plugin.backup.bakoldlogic.c.e)paramk).agC();
        a.afV().iVm = paramk.ID;
        a.afV().iVn = paramk.tSX;
        a.afV().iVo = paramk.tSY;
        b.a(a.afV().afY());
        b.a(a.afV().aeI());
        b.ku(2);
        paramString = null;
        paramInt1 = 0;
        if (paramk.tSN > 0)
        {
          nu localnu = (nu)paramk.tSO.getFirst();
          paramString = localnu.uez;
          paramInt1 = ((Integer)localnu.ueA.getFirst()).intValue();
          if (!q.zE().equals(paramk.tSQ))
          {
            w.e("summerbak.MicroMsg.MoveService", "convName not equal:self:%s, resp.acc:%s", new Object[] { q.zE(), paramk.tSQ });
            paramString = null;
          }
          if (bg.nm(paramString)) {
            break label307;
          }
          a.afV().aeI().connect(paramString, paramInt1);
          a.afV().afY().a(true, paramk.tSR, paramString, paramInt1);
        }
        for (;;)
        {
          stopSelf();
          GMTrace.o(14743146332160L, 109845);
          return;
          w.e("summerbak.MicroMsg.MoveService", "addr convMsgCount is empty");
          break;
          label307:
          paramString = new Intent(ab.getContext(), BakMoveErrUI.class);
          paramString.putExtra("getConnectInfoErr", true);
          paramString.addFlags(335544320);
          ab.getContext().startActivity(paramString);
        }
      }
      paramString = new Intent(ab.getContext(), BakMoveErrUI.class);
      paramString.putExtra("getConnectInfoErr", true);
      paramString.addFlags(335544320);
      ab.getContext().startActivity(paramString);
      stopSelf();
      GMTrace.o(14743146332160L, 109845);
      return;
    }
    GMTrace.o(14743146332160L, 109845);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(14742609461248L, 109841);
    GMTrace.o(14742609461248L, 109841);
    return null;
  }
  
  public void onCreate()
  {
    GMTrace.i(14742743678976L, 109842);
    w.i("summerbak.MicroMsg.MoveService", "onCreate()");
    super.onCreate();
    at.wS().a(595, this);
    b.a(1, this);
    GMTrace.o(14742743678976L, 109842);
  }
  
  public void onDestroy()
  {
    GMTrace.i(14743012114432L, 109844);
    at.wS().b(595, this);
    b.b(1, this);
    super.onDestroy();
    w.i("summerbak.MicroMsg.MoveService", "onDestroy" + Thread.currentThread().getName());
    GMTrace.o(14743012114432L, 109844);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(14742877896704L, 109843);
    w.i("summerbak.MicroMsg.MoveService", "onStartCommand()");
    if (paramIntent == null)
    {
      w.w("summerbak.MicroMsg.MoveService", "onStartCommand intent is null");
      GMTrace.o(14742877896704L, 109843);
      return 2;
    }
    paramIntent = paramIntent.getStringExtra("url");
    if (bg.nm(paramIntent))
    {
      w.e("summerbak.MicroMsg.MoveService", "onStartCommand url is null");
      stopSelf();
      GMTrace.o(14742877896704L, 109843);
      return 2;
    }
    w.i("summerbak.MicroMsg.MoveService", "Broadcast url:%s, isMove:%b", new Object[] { paramIntent, Boolean.valueOf(this.jaO) });
    paramIntent = new com.tencent.mm.plugin.backup.bakoldlogic.c.e(paramIntent);
    at.wS().a(paramIntent, 0);
    b.b(1, this);
    GMTrace.o(14742877896704L, 109843);
    return 2;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\bakoldmovemodel\MoveService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */