package com.tencent.mm.console.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Method;

public final class i
  implements a
{
  static
  {
    GMTrace.i(17868271910912L, 133129);
    b.a(new i(), new String[] { "//warpgate" });
    GMTrace.o(17868271910912L, 133129);
  }
  
  public i()
  {
    GMTrace.i(17867869257728L, 133126);
    GMTrace.o(17867869257728L, 133126);
  }
  
  public static void init()
  {
    GMTrace.i(17868003475456L, 133127);
    GMTrace.o(17868003475456L, 133127);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    GMTrace.i(17868137693184L, 133128);
    if (w.getLogLevel() > 1)
    {
      GMTrace.o(17868137693184L, 133128);
      return false;
    }
    if (paramArrayOfString.length < 2)
    {
      GMTrace.o(17868137693184L, 133128);
      return true;
    }
    paramContext = paramArrayOfString[1];
    int i = -1;
    switch (paramContext.hashCode())
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(17868137693184L, 133128);
      return true;
      if (!paramContext.equals("on")) {
        break;
      }
      i = 0;
      break;
      if (!paramContext.equals("off")) {
        break;
      }
      i = 1;
      break;
      if (!paramContext.equals("start")) {
        break;
      }
      i = 2;
      break;
      if (!paramContext.equals("stop")) {
        break;
      }
      i = 3;
      break;
      com.tencent.mm.platformtools.r.hla = true;
      com.tencent.mm.platformtools.r.hkZ = true;
      continue;
      com.tencent.mm.platformtools.r.hla = false;
      com.tencent.mm.platformtools.r.hkZ = false;
      continue;
      i = 8888;
      if (paramArrayOfString.length >= 3) {
        i = bg.getInt(paramArrayOfString[2], 8888);
      }
      try
      {
        Class.forName("com.tencent.mm.plugin.sl_warpgate.server.WarpGateHttpServer").getMethod("startServer", new Class[] { Integer.TYPE }).invoke(null, new Object[] { Integer.valueOf(i) });
        Toast.makeText(ab.getContext(), "start server on " + i, 1).show();
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.WarpgateCommand", paramContext, "", new Object[0]);
      }
      continue;
      try
      {
        Class.forName("com.tencent.mm.plugin.sl_warpgate.server.WarpGateHttpServer").getMethod("stopServer", new Class[0]).invoke(null, new Object[0]);
        Toast.makeText(ab.getContext(), "stop server", 1).show();
      }
      catch (Exception paramContext)
      {
        w.printErrStackTrace("MicroMsg.WarpgateCommand", paramContext, "", new Object[0]);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */