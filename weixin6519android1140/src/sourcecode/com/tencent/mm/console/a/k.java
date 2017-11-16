package com.tencent.mm.console.a;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.bm;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.u;

public final class k
  implements com.tencent.mm.pluginsdk.b.a
{
  static
  {
    GMTrace.i(20386330705920L, 151890);
    b.a(new k(), new String[] { "//cleanwx", "//showfile", "//hidefile" });
    GMTrace.o(20386330705920L, 151890);
  }
  
  public k()
  {
    GMTrace.i(20385928052736L, 151887);
    GMTrace.o(20385928052736L, 151887);
  }
  
  public static void init()
  {
    GMTrace.i(20386062270464L, 151888);
    GMTrace.o(20386062270464L, 151888);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    GMTrace.i(20386196488192L, 151889);
    paramArrayOfString = paramArrayOfString[0];
    int i = -1;
    switch (paramArrayOfString.hashCode())
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        GMTrace.o(20386196488192L, 151889);
        return false;
        if (paramArrayOfString.equals("//cleanwx"))
        {
          i = 0;
          continue;
          if (paramArrayOfString.equals("//showfile"))
          {
            i = 1;
            continue;
            if (paramArrayOfString.equals("//hidefile")) {
              i = 2;
            }
          }
        }
        break;
      }
    }
    paramArrayOfString = new bm();
    com.tencent.mm.sdk.b.a.vgX.m(paramArrayOfString);
    u.makeText(paramContext, "clean wx file index now.", 0).show();
    GMTrace.o(20386196488192L, 151889);
    return true;
    try
    {
      h.xy().xh().a(w.a.vyZ, Integer.valueOf(1));
      u.makeText(paramContext, "show file now.", 0).show();
      GMTrace.o(20386196488192L, 151889);
      return true;
      try
      {
        h.xy().xh().a(w.a.vyZ, Integer.valueOf(0));
        u.makeText(paramContext, "hide file now.", 0).show();
        GMTrace.o(20386196488192L, 151889);
        return true;
      }
      catch (Exception paramContext)
      {
        for (;;) {}
      }
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */