package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.gmtrace.GMTrace;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  private static b hOE;
  private static boolean hOF;
  private static final Set<String> hOG;
  
  static
  {
    GMTrace.i(20006762971136L, 149062);
    hOE = new h();
    hOG = new HashSet();
    GMTrace.o(20006762971136L, 149062);
  }
  
  public static boolean TV()
  {
    GMTrace.i(20004883922944L, 149048);
    boolean bool = hOF;
    GMTrace.o(20004883922944L, 149048);
    return bool;
  }
  
  public static void a(CollectSession paramCollectSession)
  {
    GMTrace.i(20005689229312L, 149054);
    if (paramCollectSession == null)
    {
      GMTrace.o(20005689229312L, 149054);
      return;
    }
    if (!oV(paramCollectSession.groupId))
    {
      GMTrace.o(20005689229312L, 149054);
      return;
    }
    hOE.a(paramCollectSession);
    GMTrace.o(20005689229312L, 149054);
  }
  
  public static CollectSession aM(String paramString1, String paramString2)
  {
    GMTrace.i(20005823447040L, 149055);
    if (!oW(paramString1))
    {
      GMTrace.o(20005823447040L, 149055);
      return null;
    }
    paramString1 = hOE.aM(paramString1, paramString2);
    GMTrace.o(20005823447040L, 149055);
    return paramString1;
  }
  
  public static void aN(String paramString1, String paramString2)
  {
    GMTrace.i(20005555011584L, 149053);
    if (!oW(paramString1))
    {
      GMTrace.o(20005555011584L, 149053);
      return;
    }
    hOE.aN(paramString1, paramString2);
    GMTrace.o(20005555011584L, 149053);
  }
  
  public static int aO(String paramString1, String paramString2)
  {
    GMTrace.i(20006494535680L, 149060);
    if (!oV(paramString1))
    {
      GMTrace.o(20006494535680L, 149060);
      return 0;
    }
    int i = hOE.aO(paramString1, paramString2);
    GMTrace.o(20006494535680L, 149060);
    return i;
  }
  
  public static void c(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(20005420793856L, 149052);
    if (!oV(paramString1))
    {
      GMTrace.o(20005420793856L, 149052);
      return;
    }
    hOE.c(paramString1, paramString2, paramString3, paramBoolean);
    GMTrace.o(20005420793856L, 149052);
  }
  
  public static void ca(boolean paramBoolean)
  {
    GMTrace.i(20004749705216L, 149047);
    hOF = paramBoolean;
    GMTrace.o(20004749705216L, 149047);
  }
  
  public static void clear()
  {
    GMTrace.i(20005286576128L, 149051);
    if (!hOF)
    {
      GMTrace.o(20005286576128L, 149051);
      return;
    }
    hOE.clear();
    GMTrace.o(20005286576128L, 149051);
  }
  
  public static void f(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(20005957664768L, 149056);
    if (!oW(paramString1))
    {
      GMTrace.o(20005957664768L, 149056);
      return;
    }
    hOE.f(paramString1, paramString2, paramBoolean);
    GMTrace.o(20005957664768L, 149056);
  }
  
  public static CollectSession oP(String paramString)
  {
    GMTrace.i(20006091882496L, 149057);
    if (!oW(paramString))
    {
      GMTrace.o(20006091882496L, 149057);
      return null;
    }
    paramString = hOE.oP(paramString);
    GMTrace.o(20006091882496L, 149057);
    return paramString;
  }
  
  public static CollectSession oQ(String paramString)
  {
    GMTrace.i(20006226100224L, 149058);
    if (!hOF)
    {
      GMTrace.o(20006226100224L, 149058);
      return null;
    }
    paramString = hOE.oQ(paramString);
    GMTrace.o(20006226100224L, 149058);
    return paramString;
  }
  
  public static StringBuilder oR(String paramString)
  {
    GMTrace.i(20006628753408L, 149061);
    if (!oV(paramString))
    {
      paramString = new StringBuilder();
      GMTrace.o(20006628753408L, 149061);
      return paramString;
    }
    paramString = hOE.oR(paramString);
    GMTrace.o(20006628753408L, 149061);
    return paramString;
  }
  
  public static void oS(String paramString)
  {
    GMTrace.i(20004347052032L, 149044);
    if (paramString.length() == 0)
    {
      GMTrace.o(20004347052032L, 149044);
      return;
    }
    hOG.add(paramString);
    GMTrace.o(20004347052032L, 149044);
  }
  
  public static void oT(String paramString)
  {
    GMTrace.i(20004481269760L, 149045);
    if (paramString.length() == 0)
    {
      GMTrace.o(20004481269760L, 149045);
      return;
    }
    hOG.remove(paramString);
    GMTrace.o(20004481269760L, 149045);
  }
  
  public static boolean oU(String paramString)
  {
    GMTrace.i(20004615487488L, 149046);
    if (paramString.length() == 0)
    {
      GMTrace.o(20004615487488L, 149046);
      return false;
    }
    boolean bool = hOG.contains(paramString);
    GMTrace.o(20004615487488L, 149046);
    return bool;
  }
  
  private static boolean oV(String paramString)
  {
    GMTrace.i(20005018140672L, 149049);
    if ((hOF) && (hOG.contains(paramString)))
    {
      GMTrace.o(20005018140672L, 149049);
      return true;
    }
    GMTrace.o(20005018140672L, 149049);
    return false;
  }
  
  private static boolean oW(String paramString)
  {
    GMTrace.i(20005152358400L, 149050);
    if (!hOF)
    {
      GMTrace.o(20005152358400L, 149050);
      return false;
    }
    paramString = hOE.oP(paramString);
    if (paramString == null)
    {
      GMTrace.o(20005152358400L, 149050);
      return false;
    }
    if (!hOG.contains(paramString.groupId))
    {
      GMTrace.o(20005152358400L, 149050);
      return false;
    }
    GMTrace.o(20005152358400L, 149050);
    return true;
  }
  
  public static void print(String paramString)
  {
    GMTrace.i(20006360317952L, 149059);
    if (!oW(paramString))
    {
      GMTrace.o(20006360317952L, 149059);
      return;
    }
    hOE.print(paramString);
    GMTrace.o(20006360317952L, 149059);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\collector\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */