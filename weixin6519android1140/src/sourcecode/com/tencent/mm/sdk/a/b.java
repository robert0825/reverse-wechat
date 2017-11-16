package com.tencent.mm.sdk.a;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  public static boolean foreground;
  public static String vgQ;
  private static c vgR;
  private static boolean vgS;
  private static String vgT;
  private static boolean vgU;
  private static boolean vgV;
  
  static
  {
    GMTrace.i(13866973003776L, 103317);
    foreground = false;
    vgQ = "unknow";
    vgR = null;
    vgS = false;
    vgT = null;
    vgU = false;
    vgV = false;
    GMTrace.o(13866973003776L, 103317);
  }
  
  public static void Rx(String paramString)
  {
    GMTrace.i(13865899261952L, 103309);
    vgQ = paramString;
    GMTrace.o(13865899261952L, 103309);
  }
  
  public static void Ry(String paramString)
  {
    GMTrace.i(13866704568320L, 103315);
    vgT = paramString;
    GMTrace.o(13866704568320L, 103315);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13866033479680L, 103310);
    if (vgR != null) {
      vgR.a(parama);
    }
    GMTrace.o(13866033479680L, 103310);
  }
  
  public static void a(c paramc)
  {
    GMTrace.i(13865362391040L, 103305);
    vgR = paramc;
    GMTrace.o(13865362391040L, 103305);
  }
  
  public static boolean bPo()
  {
    GMTrace.i(13866301915136L, 103312);
    boolean bool = vgU;
    GMTrace.o(13866301915136L, 103312);
    return bool;
  }
  
  public static void bPp()
  {
    GMTrace.i(13866436132864L, 103313);
    vgS = true;
    GMTrace.o(13866436132864L, 103313);
  }
  
  public static boolean bPq()
  {
    GMTrace.i(13866570350592L, 103314);
    boolean bool = vgS;
    GMTrace.o(13866570350592L, 103314);
    return bool;
  }
  
  public static String bPr()
  {
    GMTrace.i(13866838786048L, 103316);
    String str = vgT;
    GMTrace.o(13866838786048L, 103316);
    return str;
  }
  
  public static boolean bPs()
  {
    GMTrace.i(18798400765952L, 140059);
    boolean bool = vgV;
    GMTrace.o(18798400765952L, 140059);
    return bool;
  }
  
  public static void bk(boolean paramBoolean)
  {
    GMTrace.i(13865765044224L, 103308);
    foreground = paramBoolean;
    GMTrace.o(13865765044224L, 103308);
  }
  
  public static void g(int paramInt, String paramString)
  {
    GMTrace.i(13865630826496L, 103307);
    if (vgR != null) {
      vgR.g(paramInt, paramString);
    }
    GMTrace.o(13865630826496L, 103307);
  }
  
  public static void kC(boolean paramBoolean)
  {
    GMTrace.i(13866167697408L, 103311);
    vgU = paramBoolean;
    GMTrace.o(13866167697408L, 103311);
  }
  
  public static void kD(boolean paramBoolean)
  {
    GMTrace.i(18982144835584L, 141428);
    vgV = paramBoolean;
    GMTrace.o(18982144835584L, 141428);
  }
  
  public static void r(String paramString1, String paramString2)
  {
    GMTrace.i(13865496608768L, 103306);
    if (vgR != null) {
      vgR.r(paramString1, paramString2);
    }
    GMTrace.o(13865496608768L, 103306);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */