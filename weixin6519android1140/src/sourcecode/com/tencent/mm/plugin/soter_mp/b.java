package com.tencent.mm.plugin.soter_mp;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.util.HashMap;

public final class b
  implements aq
{
  private static com.tencent.mm.plugin.soter_mp.b.b qpM;
  private static com.tencent.mm.plugin.soter_mp.b.a qpN;
  
  static
  {
    GMTrace.i(18990868987904L, 141493);
    qpM = new com.tencent.mm.plugin.soter_mp.b.b();
    qpN = new com.tencent.mm.plugin.soter_mp.b.a();
    GMTrace.o(18990868987904L, 141493);
  }
  
  public b()
  {
    GMTrace.i(7070992564224L, 52683);
    GMTrace.o(7070992564224L, 52683);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7071395217408L, 52686);
    w.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoter onAccountPostReset");
    if (!com.tencent.mm.sdk.b.a.vgX.d(qpM)) {
      com.tencent.mm.sdk.b.a.vgX.b(qpM);
    }
    if (!com.tencent.mm.sdk.b.a.vgX.d(qpN)) {
      com.tencent.mm.sdk.b.a.vgX.b(qpN);
    }
    GMTrace.o(7071395217408L, 52686);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7071529435136L, 52687);
    w.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoterMp onSdcardMount");
    GMTrace.o(7071529435136L, 52687);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7071260999680L, 52685);
    w.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoter clearPluginData");
    GMTrace.o(7071260999680L, 52685);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7071663652864L, 52688);
    w.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoterMp onAccountRelease");
    GMTrace.o(7071663652864L, 52688);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7071126781952L, 52684);
    w.i("MicroMsg.SubCoreSoterMp", "hy: on SubCoreSoter getBaseDBFactories");
    GMTrace.o(7071126781952L, 52684);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\soter_mp\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */