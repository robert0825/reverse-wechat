package com.tencent.mm.plugin.gai;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.a.a.a.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.d.b;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;

public class Plugin
  implements c
{
  public Plugin()
  {
    GMTrace.i(6824971468800L, 50850);
    w.i("MicroMsg.Plugin.gai", "gai Plugin!");
    if (!ab.getContext().getSharedPreferences(ab.bPU() + "_google_aid", 4).getBoolean("already_report_googleaid", false)) {
      e.post(new Runnable()
      {
        public final void zb(String paramAnonymousString)
        {
          GMTrace.i(6823897726976L, 50842);
          ab.getContext().getSharedPreferences(ab.bPU() + "_google_aid", 4).edit().putString("getgoogleaid", paramAnonymousString).commit();
          paramAnonymousString = String.format("%s,%s,%s,%s,%s,%s", new Object[] { "", p.getDeviceID(ab.getContext()), p.getAndroidId(), p.tb(), paramAnonymousString, ab.getContext().getSharedPreferences(ab.bPU(), 0).getString("installreferer", "") });
          w.i("MicroMsg.Plugin.gai", "Advertisement MAT rsakv logID:%d val:%s", new Object[] { Integer.valueOf(11238), paramAnonymousString });
          g.ork.a(11238, paramAnonymousString, true, true);
          ab.getContext().getSharedPreferences(ab.bPU() + "_google_aid", 4).edit().putBoolean("already_report_googleaid", true).commit();
          GMTrace.o(6823897726976L, 50842);
        }
      }
      {
        public final void run()
        {
          GMTrace.i(6825642557440L, 50855);
          String str = "";
          Object localObject1 = null;
          Object localObject2 = null;
          try
          {
            a.a locala = com.google.android.gms.a.a.a.s(this.val$context);
            localObject2 = locala;
            localObject1 = locala;
            w.d("MicroMsg.Plugin.gai", "adInfo: %s", new Object[] { locala });
            if (locala != null)
            {
              str = locala.abm;
              w.i("MicroMsg.Plugin.gai", "get GoogleAid : [%s]", new Object[] { str });
            }
            if (this.lAL != null)
            {
              this.lAL.zb(str);
              GMTrace.o(6825642557440L, 50855);
              return;
            }
          }
          catch (Exception localException)
          {
            localObject1 = localObject2;
            w.printErrStackTrace("MicroMsg.Plugin.gai", localException, "AdMatReport:: get Ad Id info error %s", new Object[] { localException.getMessage() });
            localObject1 = localObject2;
            w.e("MicroMsg.Plugin.gai", "AdMatReport:: get Ad Id info error %s", new Object[] { localException.getMessage() });
            if (this.lAL != null)
            {
              this.lAL.zb("");
              GMTrace.o(6825642557440L, 50855);
              return;
            }
          }
          finally
          {
            if (localObject1 != null)
            {
              str = ((a.a)localObject1).abm;
              w.i("MicroMsg.Plugin.gai", "get GoogleAid : [%s]", new Object[] { str });
            }
            if (this.lAL != null) {
              this.lAL.zb(str);
            }
          }
          GMTrace.o(6825642557440L, 50855);
        }
      }, "Advertisement-MAT-thread");
    }
    GMTrace.o(6824971468800L, 50850);
  }
  
  public o createApplication()
  {
    GMTrace.i(6825105686528L, 50851);
    com.tencent.mm.plugin.gai.a.a locala = new com.tencent.mm.plugin.gai.a.a();
    GMTrace.o(6825105686528L, 50851);
    return locala;
  }
  
  public aq createSubCore()
  {
    GMTrace.i(6825374121984L, 50853);
    com.tencent.mm.plugin.gai.b.a locala = new com.tencent.mm.plugin.gai.b.a();
    GMTrace.o(6825374121984L, 50853);
    return locala;
  }
  
  public b getContactWidgetFactory()
  {
    GMTrace.i(6825239904256L, 50852);
    GMTrace.o(6825239904256L, 50852);
    return null;
  }
  
  public static abstract interface a
  {
    public abstract void zb(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\gai\Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */