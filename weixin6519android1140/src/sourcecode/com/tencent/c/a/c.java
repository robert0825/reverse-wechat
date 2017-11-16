package com.tencent.c.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  private static com.tencent.c.b.a xQb = null;
  
  public static void a(Context paramContext, a parama)
  {
    if (xQb == null) {
      xQb = new com.tencent.c.b.a(paramContext);
    }
    paramContext = xQb;
    try
    {
      List localList = com.tencent.c.f.a.fW(paramContext.mContext);
      if (localList.size() == 0)
      {
        parama.e(-10, null);
        return;
      }
      com.tencent.c.c.b.a locala = new com.tencent.c.c.b.a();
      locala.xQJ = com.tencent.c.b.a.cnq();
      locala.xQH = new com.tencent.c.c.b.c();
      locala.xQH.xRk = 6;
      locala.xQH.xQB = 1;
      locala.xQH.requestType = 0;
      locala.xQH.xRl = 0;
      locala.xQH.xRm = 0;
      locala.xQH.xRn = null;
      locala.xQH.xRo = 0;
      locala.xQH.xRs = 1;
      locala.xQI = new ArrayList();
      int i = 0;
      while (i < localList.size())
      {
        com.tencent.c.c.b.b localb = com.tencent.c.b.a.a(paramContext.mContext, (a)localList.get(i), i);
        locala.xQI.add(localb);
        i += 1;
      }
      paramContext = paramContext.xQe.a(locala);
      if (paramContext == null)
      {
        parama.e(-20, null);
        return;
      }
    }
    catch (Throwable paramContext)
    {
      parama.e(-100, null);
      return;
    }
    parama.e(0, paramContext);
  }
  
  public static abstract interface a
  {
    public abstract void e(int paramInt, byte[] paramArrayOfByte);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */