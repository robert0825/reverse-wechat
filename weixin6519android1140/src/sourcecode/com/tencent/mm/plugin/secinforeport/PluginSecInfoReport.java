package com.tencent.mm.plugin.secinforeport;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.y.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;

public class PluginSecInfoReport
  extends com.tencent.mm.kernel.b.d
  implements b
{
  private static HandlerThread oEP;
  private static ae oEQ;
  
  static
  {
    GMTrace.i(18975031296000L, 141375);
    oEP = null;
    oEQ = null;
    GMTrace.o(18975031296000L, 141375);
  }
  
  public PluginSecInfoReport()
  {
    GMTrace.i(17518366294016L, 130522);
    GMTrace.o(17518366294016L, 130522);
  }
  
  public void configure(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(17518768947200L, 130525);
    com.tencent.mm.plugin.secinforeport.a.d.a(c.oET);
    com.tencent.mm.plugin.secinforeport.a.a.a(a.oEN);
    GMTrace.o(17518768947200L, 130525);
  }
  
  public void dependency()
  {
    GMTrace.i(17518634729472L, 130524);
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    dependsOn(com.tencent.mm.plugin.report.b.class);
    dependsOn(com.tencent.mm.plugin.normsg.a.class);
    GMTrace.o(17518634729472L, 130524);
  }
  
  public void execute(com.tencent.mm.kernel.b.e parame)
  {
    GMTrace.i(17518903164928L, 130526);
    if (oEP == null) {}
    try
    {
      parame = com.tencent.mm.sdk.f.e.SV("SIRWorker");
      oEP = parame;
      parame.start();
      oEQ = new ae(oEP.getLooper());
      com.tencent.mm.sdk.b.a.vgX.a(new com.tencent.mm.sdk.b.c() {});
      com.tencent.mm.sdk.b.a.vgX.a(new com.tencent.mm.sdk.b.c() {});
      ((com.tencent.mm.plugin.auth.a.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.auth.a.b.class)).addHandleAuthResponse(new com.tencent.mm.plugin.auth.a.a()
      {
        public final void a(i.f paramAnonymousf, i.g paramAnonymousg, boolean paramAnonymousBoolean)
        {
          GMTrace.i(18974360207360L, 141370);
          if (paramAnonymousBoolean) {}
          for (int i = 0;; i = 540999680)
          {
            PluginSecInfoReport.this.reportSecurityInfoAsync(i);
            GMTrace.o(18974360207360L, 141370);
            return;
          }
        }
        
        public final void a(y.b paramAnonymousb, String paramAnonymousString1, int paramAnonymousInt1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt2)
        {
          GMTrace.i(18974494425088L, 141371);
          PluginSecInfoReport.this.reportSecurityInfoAsync(540999681);
          GMTrace.o(18974494425088L, 141371);
        }
      });
      GMTrace.o(17518903164928L, 130526);
      return;
    }
    catch (Throwable parame)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.PSIR", parame, "[tomys] unexpected exception.", new Object[0]);
      }
    }
  }
  
  public void installed()
  {
    GMTrace.i(17518500511744L, 130523);
    alias(b.class);
    GMTrace.o(17518500511744L, 130523);
  }
  
  public void reportSecurityInfoAsync(final int paramInt)
  {
    GMTrace.i(18974897078272L, 141374);
    if (oEQ == null)
    {
      w.e("MicroMsg.PSIR", "[tomys] workerposter is null, give up doing rest ops.");
      GMTrace.o(18974897078272L, 141374);
      return;
    }
    oEQ.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18975299731456L, 141377);
        for (;;)
        {
          int j;
          int k;
          try
          {
            if (com.tencent.mm.plugin.secinforeport.a.d.oFb.F(1, 86400000L))
            {
              i = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getInt("DisableRiskScanSdkProb", 0);
              j = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getInt("DisableInstalledPkgInfoReportProb", 0);
              com.tencent.mm.kernel.h.xw();
              k = com.tencent.mm.a.h.aw(com.tencent.mm.kernel.a.ww(), 101);
              if ((i > 0) && (k >= 0) && (k <= i))
              {
                i = 1;
                break label212;
                Object localObject = com.tencent.mm.plugin.normsg.a.d.nxJ;
                if (i != 0) {
                  continue;
                }
                bool1 = true;
                break label230;
                localObject = ((com.tencent.mm.plugin.normsg.a.d)localObject).n(bool1, bool2);
                com.tencent.mm.plugin.secinforeport.a.d.oFb.Gj((String)localObject);
                com.tencent.mm.plugin.secinforeport.a.d.oFb.bI((String)localObject, paramInt);
              }
            }
            else
            {
              if (com.tencent.mm.plugin.secinforeport.a.d.oFb.F(2, 129600000L)) {
                com.tencent.mm.plugin.secinforeport.a.d.oFb.bed();
              }
              GMTrace.o(18975299731456L, 141377);
              return;
            }
            int i = 0;
            break label212;
            j = 0;
            continue;
            boolean bool1 = false;
          }
          catch (Throwable localThrowable)
          {
            w.printErrStackTrace("MicroMsg.PSIR", localThrowable, "unexpected exception was thrown.", new Object[0]);
            GMTrace.o(18975299731456L, 141377);
            return;
          }
          boolean bool2 = false;
          continue;
          label212:
          if ((j > 0) && (k >= 0) && (k <= j))
          {
            j = 1;
            continue;
            label230:
            if (j == 0) {
              bool2 = true;
            }
          }
        }
      }
    });
    GMTrace.o(18974897078272L, 141374);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\secinforeport\PluginSecInfoReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */