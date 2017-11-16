package com.tencent.mm.plugin.auto.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.util.HashMap;

public final class b
  implements aq
{
  private a iUT;
  
  public b()
  {
    GMTrace.i(5210466418688L, 38821);
    this.iUT = new a();
    GMTrace.o(5210466418688L, 38821);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5210734854144L, 38823);
    w.i("MicroMsg.auto.SubCoreAuto", "onAccountPostReset");
    a locala = this.iUT;
    com.tencent.mm.sdk.b.a.vgX.b(locala.iUR);
    GMTrace.o(5210734854144L, 38823);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5210869071872L, 38824);
    GMTrace.o(5210869071872L, 38824);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5210600636416L, 38822);
    GMTrace.o(5210600636416L, 38822);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5211003289600L, 38825);
    w.i("MicroMsg.auto.SubCoreAuto", "onAccountRelease");
    a locala = this.iUT;
    com.tencent.mm.sdk.b.a.vgX.c(locala.iUR);
    GMTrace.o(5211003289600L, 38825);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5210332200960L, 38820);
    GMTrace.o(5210332200960L, 38820);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\auto\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */