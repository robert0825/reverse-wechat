package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.ipcall.a.a.b;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class i
  extends b
{
  private o mmK;
  private int mmL;
  
  public i()
  {
    GMTrace.i(11593593126912L, 86379);
    this.mmK = null;
    this.mmL = 0;
    GMTrace.o(11593593126912L, 86379);
  }
  
  public final int Fd()
  {
    GMTrace.i(11593995780096L, 86382);
    GMTrace.o(11593995780096L, 86382);
    return 2;
  }
  
  public final int[] aIA()
  {
    GMTrace.i(11593727344640L, 86380);
    GMTrace.o(11593727344640L, 86380);
    return new int[] { 819 };
  }
  
  public final void aIB()
  {
    GMTrace.i(11594129997824L, 86383);
    GMTrace.o(11594129997824L, 86383);
  }
  
  public final int aIC()
  {
    GMTrace.i(11594532651008L, 86386);
    int i = this.mmL;
    GMTrace.o(11594532651008L, 86386);
    return i;
  }
  
  public final void aID()
  {
    GMTrace.i(11594666868736L, 86387);
    w.d("MicroMsg.IPCallSyncService", "onLoopSuccess");
    GMTrace.o(11594666868736L, 86387);
  }
  
  public final void aIE()
  {
    GMTrace.i(11594801086464L, 86388);
    w.d("MicroMsg.IPCallSyncService", "onLoopFailed");
    GMTrace.o(11594801086464L, 86388);
  }
  
  public final void b(c paramc)
  {
    boolean bool = true;
    GMTrace.i(11594398433280L, 86385);
    if (paramc == null) {}
    for (;;)
    {
      w.d("MicroMsg.IPCallSyncService", "serviceImpl, info==null: %b", new Object[] { Boolean.valueOf(bool) });
      if (this.miY != null)
      {
        this.mmL = this.miY.mjP;
        this.mmK = new o(this.miY.mjF, this.miY.mjG, this.miY.aIF(), this.miY.mjH, false);
        at.wS().a(this.mmK, 0);
      }
      GMTrace.o(11594398433280L, 86385);
      return;
      bool = false;
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(11594264215552L, 86384);
    GMTrace.o(11594264215552L, 86384);
  }
  
  public final void onStop()
  {
    GMTrace.i(11593861562368L, 86381);
    if (this.mmK != null) {
      at.wS().c(this.mmK);
    }
    GMTrace.o(11593861562368L, 86381);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\f\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */