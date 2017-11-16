package com.tencent.mm.plugin.secinforeport.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aoh;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class a
  extends Enum<a>
{
  private static b oEZ;
  
  static
  {
    GMTrace.i(19116228345856L, 142427);
    oEY = 1;
    oFa = new int[] { oEY };
    oEZ = new b()
    {
      public final void a(int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(20978499321856L, 156302);
        w.i("MicroMsg.ClipBordReport", "!! Dummy implementation !!");
        GMTrace.o(20978499321856L, 156302);
      }
    };
    GMTrace.o(19116228345856L, 142427);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(19115959910400L, 142425);
    if (paramb != null) {
      oEZ = paramb;
    }
    GMTrace.o(19115959910400L, 142425);
  }
  
  public static void c(int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(19116094128128L, 142426);
    w.v("MicroMsg.ClipBordReport", "report ClipboardOperation %d, %s, %d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    oEZ.a(paramInt1, paramString, paramInt2, null);
    GMTrace.o(19116094128128L, 142426);
  }
  
  public static void q(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(20978901975040L, 156305);
    w.v("MicroMsg.ClipBordReport", "report reportMiniProgram %d, %d, %s, %s", new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt), paramString1, paramString2 });
    aoh localaoh = new aoh();
    localaoh.eSd = paramString1;
    localaoh.uEh = paramString2;
    paramString1 = null;
    try
    {
      paramString2 = localaoh.toByteArray();
      paramString1 = paramString2;
    }
    catch (IOException paramString2)
    {
      for (;;)
      {
        w.w("MicroMsg.ClipBordReport", "getExtInfo exp %s", new Object[] { paramString2.getMessage() });
      }
    }
    oEZ.a(5, "", paramInt, paramString1);
    GMTrace.o(20978901975040L, 156305);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\secinforeport\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */