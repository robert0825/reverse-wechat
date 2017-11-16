package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.backup.h.n;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.sdk.platformtools.w;

public final class b
  extends com.tencent.mm.plugin.backup.f.b
{
  private int iVq;
  private n jbJ;
  public o jbK;
  
  public b(String paramString)
  {
    GMTrace.i(14808778801152L, 110334);
    this.jbJ = new n();
    this.jbK = new o();
    w.i("MicroMsg.BakOldStartScene", "init id:%s", new Object[] { paramString });
    this.jbJ.ID = paramString;
    this.iVq = -22;
    GMTrace.o(14808778801152L, 110334);
  }
  
  public final a afr()
  {
    GMTrace.i(14809047236608L, 110336);
    o localo = this.jbK;
    GMTrace.o(14809047236608L, 110336);
    return localo;
  }
  
  public final a afs()
  {
    GMTrace.i(14809181454336L, 110337);
    n localn = this.jbJ;
    GMTrace.o(14809181454336L, 110337);
    return localn;
  }
  
  public final void aft()
  {
    GMTrace.i(14809315672064L, 110338);
    w.i("MicroMsg.BakOldStartScene", "onSceneEnd");
    if (this.jbK.jhA == 0)
    {
      f(0, this.jbK.jhA, "BakOldStartScene ok");
      GMTrace.o(14809315672064L, 110338);
      return;
    }
    w.e("MicroMsg.BakOldStartScene", "errType %d", new Object[] { Integer.valueOf(this.jbK.jhA) });
    f(4, this.jbK.jhA, "BakOldStartScene not success");
    GMTrace.o(14809315672064L, 110338);
  }
  
  public final int getType()
  {
    GMTrace.i(14808913018880L, 110335);
    GMTrace.o(14808913018880L, 110335);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\bakoldlogic\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */