package com.tencent.mm.pluginsdk;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class r
{
  private static boolean tmm;
  public String mTag;
  public boolean tml;
  
  static
  {
    GMTrace.i(20296002174976L, 151217);
    tmm = false;
    GMTrace.o(20296002174976L, 151217);
  }
  
  public r(String paramString)
  {
    GMTrace.i(20295599521792L, 151214);
    this.tml = false;
    this.mTag = "";
    this.mTag = paramString;
    GMTrace.o(20295599521792L, 151214);
  }
  
  public static void bIX()
  {
    GMTrace.i(20295733739520L, 151215);
    tmm = true;
    GMTrace.o(20295733739520L, 151215);
  }
  
  public final boolean br(String paramString)
  {
    GMTrace.i(20295867957248L, 151216);
    if (tmm)
    {
      w.i("MicroMsg.SplashOptimizing", "[%s], check cancel", new Object[] { this.mTag });
      GMTrace.o(20295867957248L, 151216);
      return false;
    }
    if (this.tml)
    {
      w.i("MicroMsg.SplashOptimizing", "[%s], recreate activity, skip this %s", new Object[] { this.mTag, paramString });
      GMTrace.o(20295867957248L, 151216);
      return true;
    }
    GMTrace.o(20295867957248L, 151216);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */