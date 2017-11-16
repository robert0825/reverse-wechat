package com.tencent.mm.plugin.favorite;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.b.c;
import java.io.File;

public final class f
  extends c<ft>
{
  public f()
  {
    GMTrace.i(6468623400960L, 48195);
    this.vhf = ft.class.getName().hashCode();
    GMTrace.o(6468623400960L, 48195);
  }
  
  private static String a(th paramth)
  {
    GMTrace.i(6468757618688L, 48196);
    File localFile = new File(x.h(paramth));
    if (!localFile.exists()) {
      if (paramth.eDk == null) {
        paramth = "";
      }
    }
    for (;;)
    {
      GMTrace.o(6468757618688L, 48196);
      return paramth;
      paramth = new File(x.axY() + g.n(paramth.eDk.getBytes()));
      if (paramth.exists())
      {
        paramth = paramth.getAbsolutePath();
      }
      else
      {
        paramth = "";
        continue;
        paramth = localFile.getAbsolutePath();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */