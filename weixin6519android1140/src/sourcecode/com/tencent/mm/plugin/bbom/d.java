package com.tencent.mm.plugin.bbom;

import android.app.Service;
import android.content.ContentResolver;
import android.content.IntentFilter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.booter.TrafficStatsReceiver;
import com.tencent.mm.modelfriend.AddrBookObserver;
import com.tencent.mm.modelstat.WatchDogPushReceiver;

public final class d
  implements com.tencent.mm.plugin.zero.a.a
{
  private AddrBookObserver jjM;
  private WatchDogPushReceiver jjN;
  private TrafficStatsReceiver jjO;
  
  public d()
  {
    GMTrace.i(8023133126656L, 59777);
    GMTrace.o(8023133126656L, 59777);
  }
  
  public final void a(Service paramService)
  {
    GMTrace.i(8023267344384L, 59778);
    this.jjM = new AddrBookObserver(paramService);
    paramService.getContentResolver().registerContentObserver(com.tencent.mm.pluginsdk.a.bIO(), true, this.jjM);
    this.jjN = new WatchDogPushReceiver();
    paramService.registerReceiver(this.jjN, new IntentFilter("com.tencent.mm.WatchDogPushReceiver"));
    this.jjO = new TrafficStatsReceiver();
    paramService.registerReceiver(this.jjO, new IntentFilter("com.tencent.mm.TrafficStatsReceiver"));
    TrafficStatsReceiver.aA(paramService);
    GMTrace.o(8023267344384L, 59778);
  }
  
  public final void b(Service paramService)
  {
    GMTrace.i(8023401562112L, 59779);
    paramService.getContentResolver().unregisterContentObserver(this.jjM);
    paramService.unregisterReceiver(this.jjN);
    paramService.unregisterReceiver(this.jjO);
    TrafficStatsReceiver.aB(paramService);
    GMTrace.o(8023401562112L, 59779);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\bbom\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */