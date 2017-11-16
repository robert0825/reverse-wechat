package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.backup.f.b;
import com.tencent.mm.plugin.backup.h.ab;
import com.tencent.mm.plugin.backup.h.ac;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends b
{
  private ab jgj;
  private ac jgk;
  
  public a(int paramInt)
  {
    GMTrace.i(14736838098944L, 109798);
    this.jgj = new ab();
    this.jgk = new ac();
    this.jgj.jgO = paramInt;
    GMTrace.o(14736838098944L, 109798);
  }
  
  public final com.tencent.mm.bm.a afr()
  {
    GMTrace.i(14736972316672L, 109799);
    ac localac = this.jgk;
    GMTrace.o(14736972316672L, 109799);
    return localac;
  }
  
  public final com.tencent.mm.bm.a afs()
  {
    GMTrace.i(14737106534400L, 109800);
    ab localab = this.jgj;
    GMTrace.o(14737106534400L, 109800);
    return localab;
  }
  
  public final void aft()
  {
    GMTrace.i(14737240752128L, 109801);
    if (this.jgk.jhA == 0)
    {
      f(0, 0, "ok");
      GMTrace.o(14737240752128L, 109801);
      return;
    }
    w.e("MicroMsg.BakSceneCommand", " type:%d  errCode:%d", new Object[] { Integer.valueOf(this.jgj.jgO), Integer.valueOf(this.jgk.jhA) });
    f(4, this.jgk.jhA, "fail");
    GMTrace.o(14737240752128L, 109801);
  }
  
  public final int getType()
  {
    GMTrace.i(14737374969856L, 109802);
    GMTrace.o(14737374969856L, 109802);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */