package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.ipcall.a.a.b;
import com.tencent.mm.plugin.ipcall.a.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class c
  extends b
{
  private h mmG;
  
  public c()
  {
    GMTrace.i(11595740610560L, 86395);
    GMTrace.o(11595740610560L, 86395);
  }
  
  public final int Fd()
  {
    GMTrace.i(11596143263744L, 86398);
    GMTrace.o(11596143263744L, 86398);
    return 5;
  }
  
  public final int[] aIA()
  {
    GMTrace.i(11595874828288L, 86396);
    GMTrace.o(11595874828288L, 86396);
    return new int[] { 824 };
  }
  
  public final void aIB()
  {
    GMTrace.i(11596277481472L, 86399);
    GMTrace.o(11596277481472L, 86399);
  }
  
  public final int aIC()
  {
    GMTrace.i(11596680134656L, 86402);
    GMTrace.o(11596680134656L, 86402);
    return 50000;
  }
  
  public final void aID()
  {
    GMTrace.i(11596814352384L, 86403);
    w.d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopSuccess");
    GMTrace.o(11596814352384L, 86403);
  }
  
  public final void aIE()
  {
    GMTrace.i(11596948570112L, 86404);
    w.d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopFailed");
    GMTrace.o(11596948570112L, 86404);
  }
  
  public final void b(com.tencent.mm.plugin.ipcall.a.a.c paramc)
  {
    GMTrace.i(11596545916928L, 86401);
    if (this.miY != null)
    {
      this.mmG = new h(this.miY.mjF, this.miY.mjG, this.miY.mjH);
      at.wS().a(this.mmG, 0);
    }
    GMTrace.o(11596545916928L, 86401);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11596411699200L, 86400);
    GMTrace.o(11596411699200L, 86400);
  }
  
  public final void onStop()
  {
    GMTrace.i(11596009046016L, 86397);
    if (this.mmG != null) {
      at.wS().c(this.mmG);
    }
    GMTrace.o(11596009046016L, 86397);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */