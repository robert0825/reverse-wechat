package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class n
{
  private static long jBp;
  private static String rfM;
  private static String xDu;
  
  static
  {
    GMTrace.i(1442706358272L, 10749);
    rfM = "";
    jBp = 0L;
    xDu = "";
    GMTrace.o(1442706358272L, 10749);
  }
  
  public static boolean clK()
  {
    GMTrace.i(1442437922816L, 10747);
    long l = bg.aG(jBp);
    w.d("MicroMsg.TimeStampHelper", "pass time " + l);
    if (l > 300L)
    {
      GMTrace.o(1442437922816L, 10747);
      return true;
    }
    GMTrace.o(1442437922816L, 10747);
    return false;
  }
  
  public static String clL()
  {
    GMTrace.i(1442572140544L, 10748);
    if (bg.nm(rfM)) {
      w.i("MicroMsg.TimeStampHelper", "getTimeStamp is null from %s isOverdue %s update_time: %s", new Object[] { xDu, Boolean.valueOf(clK()), Long.valueOf(jBp) });
    }
    String str = rfM;
    GMTrace.o(1442572140544L, 10748);
    return str;
  }
  
  public static void setTimeStamp(String paramString)
  {
    GMTrace.i(1442303705088L, 10746);
    rfM = paramString;
    jBp = System.currentTimeMillis() / 1000L;
    xDu = bg.bQW().toString();
    GMTrace.o(1442303705088L, 10746);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */