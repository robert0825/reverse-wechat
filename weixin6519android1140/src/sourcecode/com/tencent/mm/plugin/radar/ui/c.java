package com.tencent.mm.plugin.radar.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.awx;

public final class c
{
  public static String b(awx paramawx)
  {
    GMTrace.i(8922526121984L, 66478);
    if (paramawx.jhi != null)
    {
      paramawx = paramawx.jhi;
      GMTrace.o(8922526121984L, 66478);
      return paramawx;
    }
    paramawx = paramawx.ujf;
    GMTrace.o(8922526121984L, 66478);
    return paramawx;
  }
  
  public static String c(awx paramawx)
  {
    GMTrace.i(8922660339712L, 66479);
    if (paramawx == null)
    {
      GMTrace.o(8922660339712L, 66479);
      return "";
    }
    if (paramawx.ujf != null)
    {
      paramawx = paramawx.ujf;
      GMTrace.o(8922660339712L, 66479);
      return paramawx;
    }
    paramawx = paramawx.jhi;
    GMTrace.o(8922660339712L, 66479);
    return paramawx;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\radar\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */