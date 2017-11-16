package com.tencent.mm.ab;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static String Dg()
  {
    GMTrace.i(20069845303296L, 149532);
    String str = "audio" + aa.RP(new StringBuilder().append(System.currentTimeMillis()).toString());
    GMTrace.o(20069845303296L, 149532);
    return str;
  }
  
  public static boolean hG(String paramString)
  {
    GMTrace.i(20069979521024L, 149533);
    w.i("MicroMsg.AudioPlayerHelper", "resumeAudio, audioId:%s", new Object[] { paramString });
    t localt = new t();
    localt.eAJ.action = 1;
    localt.eAJ.eAL = paramString;
    a.vgX.m(localt);
    boolean bool = localt.eAK.eAO;
    GMTrace.o(20069979521024L, 149533);
    return bool;
  }
  
  public static boolean hH(String paramString)
  {
    GMTrace.i(20070113738752L, 149534);
    t localt = new t();
    localt.eAJ.action = 7;
    localt.eAJ.eAL = paramString;
    a.vgX.m(localt);
    boolean bool = localt.eAK.eAO;
    GMTrace.o(20070113738752L, 149534);
    return bool;
  }
  
  public static boolean hI(String paramString)
  {
    GMTrace.i(20070247956480L, 149535);
    t localt = new t();
    localt.eAJ.action = 8;
    localt.eAJ.eAL = paramString;
    a.vgX.m(localt);
    boolean bool = localt.eAK.eAO;
    GMTrace.o(20070247956480L, 149535);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ab\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */