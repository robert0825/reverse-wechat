package com.tencent.mm.plugin.appbrand.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a;

public final class c
  extends a
{
  public c()
  {
    GMTrace.i(16547032596480L, 123285);
    GMTrace.o(16547032596480L, 123285);
  }
  
  public final String getName()
  {
    GMTrace.i(16547435249664L, 123288);
    GMTrace.o(16547435249664L, 123288);
    return "FTS5WeAppStorage";
  }
  
  public final int getPriority()
  {
    GMTrace.i(16547703685120L, 123290);
    GMTrace.o(16547703685120L, 123290);
    return 512;
  }
  
  protected final String getTableName()
  {
    GMTrace.i(16547301031936L, 123287);
    GMTrace.o(16547301031936L, 123287);
    return "WeApp";
  }
  
  public final int getType()
  {
    GMTrace.i(16547569467392L, 123289);
    GMTrace.o(16547569467392L, 123289);
    return 512;
  }
  
  protected final void vr()
  {
    GMTrace.i(16547166814208L, 123286);
    if (vs()) {
      l(-104L, 1L);
    }
    GMTrace.o(16547166814208L, 123286);
  }
  
  protected final boolean vs()
  {
    GMTrace.i(16547837902848L, 123291);
    if (!ch(-104, 1))
    {
      GMTrace.o(16547837902848L, 123291);
      return true;
    }
    GMTrace.o(16547837902848L, 123291);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */