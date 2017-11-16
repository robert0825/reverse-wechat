package com.tencent.mm.plugin.fts.d;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import java.util.List;

public abstract class b
  implements i
{
  public Context context;
  public i.b lzn;
  public int lzo;
  
  public b(Context paramContext, i.b paramb, int paramInt)
  {
    GMTrace.i(16701517201408L, 124436);
    this.context = paramContext;
    this.lzn = paramb;
    this.lzo = paramInt;
    GMTrace.o(16701517201408L, 124436);
  }
  
  public static boolean aK(List<? extends Object> paramList)
  {
    GMTrace.i(16701651419136L, 124437);
    if ((paramList != null) && (paramList.size() > 0))
    {
      GMTrace.o(16701651419136L, 124437);
      return true;
    }
    GMTrace.o(16701651419136L, 124437);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\fts\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */