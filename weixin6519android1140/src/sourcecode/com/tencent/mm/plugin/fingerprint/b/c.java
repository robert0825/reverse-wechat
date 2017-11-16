package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.j;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements j
{
  public c()
  {
    GMTrace.i(10792850161664L, 80413);
    GMTrace.o(10792850161664L, 80413);
  }
  
  public static int a(com.tencent.mm.pluginsdk.wallet.c paramc, boolean paramBoolean)
  {
    GMTrace.i(10793118597120L, 80415);
    int i = ((k)h.h(k.class)).a(paramc, 0, paramBoolean);
    GMTrace.o(10793118597120L, 80415);
    return i;
  }
  
  public static void abort()
  {
    GMTrace.i(10793387032576L, 80417);
    ((k)h.h(k.class)).azH();
    GMTrace.o(10793387032576L, 80417);
  }
  
  public static boolean azw()
  {
    GMTrace.i(10792984379392L, 80414);
    boolean bool = ((k)h.h(k.class)).azA();
    w.i("MicroMsg.FingerPrintAuthMgr", "isSupportFP is " + bool);
    GMTrace.o(10792984379392L, 80414);
    return bool;
  }
  
  public static void azx()
  {
    GMTrace.i(10793521250304L, 80418);
    ((k)h.h(k.class)).azx();
    GMTrace.o(10793521250304L, 80418);
  }
  
  public static boolean azy()
  {
    GMTrace.i(10793655468032L, 80419);
    boolean bool = ((k)h.h(k.class)).azB();
    GMTrace.o(10793655468032L, 80419);
    return bool;
  }
  
  public static i azz()
  {
    GMTrace.i(10793789685760L, 80420);
    i locali = ((k)h.h(k.class)).azz();
    GMTrace.o(10793789685760L, 80420);
    return locali;
  }
  
  public static void release()
  {
    GMTrace.i(10793252814848L, 80416);
    ((k)h.h(k.class)).azG();
    GMTrace.o(10793252814848L, 80416);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fingerprint\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */