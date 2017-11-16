package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;

public final class b
{
  public static final int agC = e.agC;
  private static final b agD = new b();
  
  public static Intent bQ(int paramInt)
  {
    return e.bR(paramInt);
  }
  
  public static b jE()
  {
    return agD;
  }
  
  public static boolean l(Context paramContext, int paramInt)
  {
    return e.l(paramContext, paramInt);
  }
  
  public static int x(Context paramContext)
  {
    int j = e.x(paramContext);
    int i = j;
    if (e.l(paramContext, j)) {
      i = 18;
    }
    return i;
  }
  
  public static void y(Context paramContext)
  {
    e.y(paramContext);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */