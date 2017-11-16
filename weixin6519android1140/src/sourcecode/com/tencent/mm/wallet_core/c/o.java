package com.tencent.mm.wallet_core.c;

import com.tencent.gmtrace.GMTrace;
import java.util.UUID;

public final class o
{
  private static boolean xDv;
  private static int xDw;
  private static String xDx;
  
  static
  {
    GMTrace.i(16671049777152L, 124209);
    xDv = false;
    xDw = -1;
    xDx = "";
    GMTrace.o(16671049777152L, 124209);
  }
  
  public static void EL(int paramInt)
  {
    GMTrace.i(16670781341696L, 124207);
    if (!xDv)
    {
      xDv = true;
      xDw = paramInt;
      xDx = UUID.randomUUID().toString();
    }
    GMTrace.o(16670781341696L, 124207);
  }
  
  public static boolean clM()
  {
    GMTrace.i(16670378688512L, 124204);
    boolean bool = xDv;
    GMTrace.o(16670378688512L, 124204);
    return bool;
  }
  
  public static int clN()
  {
    GMTrace.i(16670512906240L, 124205);
    int i = xDw;
    GMTrace.o(16670512906240L, 124205);
    return i;
  }
  
  public static String clO()
  {
    GMTrace.i(16670647123968L, 124206);
    String str = xDx;
    GMTrace.o(16670647123968L, 124206);
    return str;
  }
  
  public static void clP()
  {
    GMTrace.i(16670915559424L, 124208);
    xDv = false;
    xDw = -1;
    xDx = "";
    GMTrace.o(16670915559424L, 124208);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */