package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.backup.h.n;
import com.tencent.mm.plugin.backup.h.o;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends b
{
  public n jbJ;
  public o jbK;
  
  public g(String paramString)
  {
    GMTrace.i(9501541400576L, 70792);
    this.jbJ = new n();
    this.jbK = new o();
    w.i("MicroMsg.BackupStartScene", "BackupStartScene, id[%s]", new Object[] { paramString });
    this.jbJ.ID = paramString;
    GMTrace.o(9501541400576L, 70792);
  }
  
  public final a afs()
  {
    GMTrace.i(9501944053760L, 70795);
    n localn = this.jbJ;
    GMTrace.o(9501944053760L, 70795);
    return localn;
  }
  
  public final void aft()
  {
    GMTrace.i(9502078271488L, 70796);
    w.i("MicroMsg.BackupStartScene", "onSceneEnd.");
    if (this.jbK.jhA != 0)
    {
      f(4, this.jbK.jhA, "BackupStartScene onSceneEnd failed");
      GMTrace.o(9502078271488L, 70796);
      return;
    }
    f(0, this.jbK.jhA, "BackupStartScene onSceneEnd success");
    GMTrace.o(9502078271488L, 70796);
  }
  
  public final int getType()
  {
    GMTrace.i(9501675618304L, 70793);
    GMTrace.o(9501675618304L, 70793);
    return 3;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\f\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */