package com.tencent.mm.plugin.soter.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static int qpe;
  private static int qpf;
  
  static
  {
    GMTrace.i(18503121764352L, 137859);
    qpe = -1;
    qpf = -1;
    GMTrace.o(18503121764352L, 137859);
  }
  
  public static boolean bqA()
  {
    GMTrace.i(18502719111168L, 137856);
    if (qpe >= 0)
    {
      GMTrace.o(18502719111168L, 137856);
      return true;
    }
    GMTrace.o(18502719111168L, 137856);
    return false;
  }
  
  public static void bqx()
  {
    GMTrace.i(18502048022528L, 137851);
    if (qpe == -1)
    {
      w.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      GMTrace.o(18502048022528L, 137851);
      return;
    }
    g.ork.i(12925, new Object[] { Integer.valueOf(qpe) });
    GMTrace.o(18502048022528L, 137851);
  }
  
  public static void bqy()
  {
    GMTrace.i(18502182240256L, 137852);
    if (qpe == -1)
    {
      w.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      GMTrace.o(18502182240256L, 137852);
      return;
    }
    g.ork.i(12926, new Object[] { Integer.valueOf(qpe) });
    GMTrace.o(18502182240256L, 137852);
  }
  
  public static void bqz()
  {
    GMTrace.i(18502450675712L, 137854);
    qpf = (int)(System.currentTimeMillis() / 1000L);
    GMTrace.o(18502450675712L, 137854);
  }
  
  public static void c(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    GMTrace.i(18502316457984L, 137853);
    if (qpe == -1)
    {
      w.e("MicroMsg.FingerpirntReporter", "hy: current open scene not set");
      GMTrace.o(18502316457984L, 137853);
      return;
    }
    g.ork.i(13413, new Object[] { Integer.valueOf(qpe), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    GMTrace.o(18502316457984L, 137853);
  }
  
  public static void dm(int paramInt1, int paramInt2)
  {
    GMTrace.i(18502853328896L, 137857);
    w.v("MicroMsg.FingerpirntReporter", "alvinluo report open guide count, actionType: %d, actionCount: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g.ork.i(14381, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(18502853328896L, 137857);
  }
  
  public static void dn(int paramInt1, int paramInt2)
  {
    GMTrace.i(18502987546624L, 137858);
    switch (paramInt2)
    {
    default: 
      paramInt1 = -1;
    }
    for (;;)
    {
      if (paramInt1 != -1)
      {
        w.i("MicroMsg.FingerpirntReporter", "alvinluo soter idkey report id: %d, key: %d, value: %d", new Object[] { Integer.valueOf(672), Integer.valueOf(paramInt1), Long.valueOf(1L) });
        g.ork.a(672L, paramInt1, 1L, false);
      }
      GMTrace.o(18502987546624L, 137858);
      return;
      if (paramInt1 == 3)
      {
        paramInt1 = 0;
        continue;
        paramInt1 = 1;
        continue;
        paramInt1 = 2;
        continue;
        paramInt1 = 3;
        continue;
        paramInt1 = 4;
        continue;
        paramInt1 = 5;
      }
      else
      {
        paramInt1 = -1;
      }
    }
  }
  
  public static void vK(int paramInt)
  {
    GMTrace.i(18501913804800L, 137850);
    qpe = paramInt;
    GMTrace.o(18501913804800L, 137850);
  }
  
  public static void vL(int paramInt)
  {
    GMTrace.i(18502584893440L, 137855);
    if (qpf == -1)
    {
      w.e("MicroMsg.FingerpirntReporter", "hy: no current pay session");
      GMTrace.o(18502584893440L, 137855);
      return;
    }
    g.ork.i(12927, new Object[] { Integer.valueOf(qpf), Integer.valueOf(paramInt) });
    qpe = -1;
    GMTrace.o(18502584893440L, 137855);
  }
  
  public static void vM(int paramInt)
  {
    GMTrace.i(20277345910784L, 151078);
    String str = bg.f(new Throwable());
    w.i("MicroMsg.FingerpirntReporter", "alvinluo soter cLog report, sceneType: %d, detailScene: %d, content: %s", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt), str });
    HashMap localHashMap = new HashMap();
    localHashMap.put("sceneType", "3");
    localHashMap.put("scene", String.valueOf(paramInt));
    g.ork.d("Soter", "Fingerprint pay add authentication task failed: " + str, localHashMap);
    GMTrace.o(20277345910784L, 151078);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\soter\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */