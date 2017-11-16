package com.tencent.mm.plugin.ac;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import java.util.List;

public final class a
  implements com.tencent.mm.kernel.api.bucket.b, com.tencent.mm.kernel.b.b
{
  private static a oiP;
  
  private a()
  {
    GMTrace.i(16418452013056L, 122327);
    GMTrace.o(16418452013056L, 122327);
  }
  
  public static a bbe()
  {
    try
    {
      GMTrace.i(16418720448512L, 122329);
      if (oiP == null) {
        oiP = new a();
      }
      a locala = oiP;
      GMTrace.o(16418720448512L, 122329);
      return locala;
    }
    finally {}
  }
  
  public static String yW()
  {
    GMTrace.i(16418854666240L, 122330);
    String str = h.xy().fYU + "remark/";
    GMTrace.o(16418854666240L, 122330);
    return str;
  }
  
  public final List<String> collectStoragePaths()
  {
    GMTrace.i(16418586230784L, 122328);
    GMTrace.o(16418586230784L, 122328);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\ac\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */