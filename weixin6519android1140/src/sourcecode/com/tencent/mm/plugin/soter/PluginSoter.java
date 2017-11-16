package com.tencent.mm.plugin.soter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.kernel.e.f;
import com.tencent.mm.plugin.soter.c.h;
import com.tencent.mm.plugin.soter.d.b;
import com.tencent.mm.sdk.platformtools.w;

public class PluginSoter
  extends com.tencent.mm.kernel.b.d
  implements com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.soter.a.a
{
  private com.tencent.mm.plugin.soter.c.d qoT;
  private boolean qoU;
  
  public PluginSoter()
  {
    GMTrace.i(18493055434752L, 137784);
    this.qoT = null;
    this.qoU = false;
    GMTrace.o(18493055434752L, 137784);
  }
  
  private void safeAddListener(com.tencent.mm.sdk.b.c paramc)
  {
    GMTrace.i(18493994958848L, 137791);
    if (paramc == null)
    {
      w.w("MicroMsg.PluginSoter", "hy: listener is null or id is invalid");
      GMTrace.o(18493994958848L, 137791);
      return;
    }
    if (com.tencent.mm.sdk.b.a.vgX.d(paramc))
    {
      w.w("MicroMsg.PluginSoter", "hy: already has listener");
      GMTrace.o(18493994958848L, 137791);
      return;
    }
    com.tencent.mm.sdk.b.a.vgX.b(paramc);
    GMTrace.o(18493994958848L, 137791);
  }
  
  private void safeRemoveListener(com.tencent.mm.sdk.b.c paramc)
  {
    GMTrace.i(18494129176576L, 137792);
    if (paramc == null)
    {
      w.w("MicroMsg.PluginSoter", "alvinluo listener is null");
      GMTrace.o(18494129176576L, 137792);
      return;
    }
    com.tencent.mm.sdk.b.a.vgX.c(paramc);
    GMTrace.o(18494129176576L, 137792);
  }
  
  public void configure(e parame)
  {
    GMTrace.i(18493592305664L, 137788);
    GMTrace.o(18493592305664L, 137788);
  }
  
  public void dependency()
  {
    GMTrace.i(18493458087936L, 137787);
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
    GMTrace.o(18493458087936L, 137787);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(18493726523392L, 137789);
    if (parame.eR(""))
    {
      w.i("MicroMsg.PluginSoter", "alvinluo PluginSoter in process: %s execute and run pipeline", new Object[] { parame.fXf });
      this.qoU = true;
      w.v("MicroMsg.PluginSoter", "alvinluo PluginSoter add SoterDynamicConfigUpdatedEventListener");
      this.qoT = new com.tencent.mm.plugin.soter.c.d();
      safeAddListener(this.qoT);
    }
    GMTrace.o(18493726523392L, 137789);
  }
  
  public void installed()
  {
    GMTrace.i(18493323870208L, 137786);
    alias(com.tencent.mm.plugin.soter.a.a.class);
    GMTrace.o(18493323870208L, 137786);
  }
  
  public String name()
  {
    GMTrace.i(18493189652480L, 137785);
    GMTrace.o(18493189652480L, 137785);
    return "plugin-soter";
  }
  
  public void onAccountInitialized(e.f paramf)
  {
    GMTrace.i(18494263394304L, 137793);
    w.v("MicroMsg.PluginSoter", "alvinluo onAccountInitialized, isMainProcess: %b", new Object[] { Boolean.valueOf(this.qoU) });
    if (this.qoU)
    {
      h.bqC();
      b.a(false, false, null);
    }
    GMTrace.o(18494263394304L, 137793);
  }
  
  public void onAccountRelease()
  {
    GMTrace.i(18494397612032L, 137794);
    w.v("MicroMsg.PluginSoter", "alvinluo onAccountRelease");
    GMTrace.o(18494397612032L, 137794);
  }
  
  public void uninstalled()
  {
    GMTrace.i(18493860741120L, 137790);
    super.uninstalled();
    safeRemoveListener(this.qoT);
    GMTrace.o(18493860741120L, 137790);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\soter\PluginSoter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */