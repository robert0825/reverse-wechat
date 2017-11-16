package com.tencent.mm.console.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements a
{
  static
  {
    GMTrace.i(416611827712L, 3104);
    com.tencent.mm.pluginsdk.b.b.a(new c(), new String[] { "//normsg" });
    GMTrace.o(416611827712L, 3104);
  }
  
  public c()
  {
    GMTrace.i(416209174528L, 3101);
    GMTrace.o(416209174528L, 3101);
  }
  
  public static void init()
  {
    GMTrace.i(416343392256L, 3102);
    GMTrace.o(416343392256L, 3102);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    GMTrace.i(416477609984L, 3103);
    if (!com.tencent.mm.sdk.a.b.bPq())
    {
      GMTrace.o(416477609984L, 3103);
      return false;
    }
    if (paramArrayOfString.length < 2)
    {
      GMTrace.o(416477609984L, 3103);
      return false;
    }
    int i = 1;
    int j = i;
    try
    {
      if (paramArrayOfString.length >= 3) {
        j = Integer.valueOf(paramArrayOfString[2]).intValue();
      }
      String str = paramArrayOfString[1].toLowerCase();
      long l1 = System.nanoTime();
      i = -1;
      switch (str.hashCode())
      {
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          GMTrace.o(416477609984L, 3103);
          return false;
          if (str.equals("checkmsglevel"))
          {
            i = 0;
            continue;
            if (str.equals("checksofttype"))
            {
              i = 1;
              continue;
              if (str.equals("checksofttype2"))
              {
                i = 2;
                continue;
                if (str.equals("checksofttype3"))
                {
                  i = 3;
                  continue;
                  if (str.equals("checksofttype4"))
                  {
                    i = 4;
                    continue;
                    if (str.equals("checksofttype5"))
                    {
                      i = 5;
                      continue;
                      if (str.equals("checksofttype6"))
                      {
                        i = 6;
                        continue;
                        if (str.equals("checksofttype7"))
                        {
                          i = 7;
                          continue;
                          if (str.equals("testrpp"))
                          {
                            i = 8;
                            continue;
                            if (str.equals("testturing")) {
                              i = 9;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          break;
        }
      }
      com.tencent.mm.plugin.normsg.a.c.nxG.rS(j);
      for (;;)
      {
        long l2 = System.nanoTime();
        paramArrayOfString = String.format("[NorMsgTest] cmd: %s, time: %d ns.", new Object[] { paramArrayOfString[1], Long.valueOf(l2 - l1) });
        w.i("MicroMsg.NorMsgTest", paramArrayOfString);
        Toast.makeText(paramContext, paramArrayOfString, 0).show();
        GMTrace.o(416477609984L, 3103);
        return true;
        com.tencent.mm.plugin.normsg.a.c.nxG.rT(j);
        continue;
        com.tencent.mm.plugin.normsg.a.c.nxG.rU(j);
        continue;
        com.tencent.mm.plugin.normsg.a.c.nxG.rV(j);
        continue;
        com.tencent.mm.plugin.normsg.a.c.nxG.rW(j);
        continue;
        com.tencent.mm.plugin.normsg.a.c.nxG.rX(j);
        continue;
        com.tencent.mm.plugin.normsg.a.c.nxG.rY(j);
        continue;
        com.tencent.mm.plugin.normsg.a.c.nxG.rZ(j);
        continue;
        str = com.tencent.mm.plugin.normsg.a.d.nxJ.n(true, true);
        com.tencent.mm.plugin.secinforeport.a.d.oFb.Gj(str);
        com.tencent.mm.plugin.secinforeport.a.d.oFb.bI(str, 0);
        com.tencent.mm.pluginsdk.i.c.a(paramContext, "normsg", str);
        Toast.makeText(paramContext, "result is copied to clipboard.", 0).show();
        continue;
        com.tencent.mm.plugin.normsg.a.d.nxJ.K(1, 1, 4);
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(20385793835008L, 151886);
            com.tencent.mm.plugin.secinforeport.a.d.oFb.bed();
            GMTrace.o(20385793835008L, 151886);
          }
        }, 4000L);
        Toast.makeText(paramContext, "turing info is reported.", 0).show();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        j = i;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */