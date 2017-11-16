package com.tinkerboots.sdk.a;

import com.tinkerboots.sdk.a.a.b;

public final class a
{
  private static volatile a yqF;
  public b yqE;
  public long yqG = 10800000L;
  public final com.tinkerboots.sdk.a.b.a yqH = com.tinkerboots.sdk.a.b.a.csN();
  public boolean yqI;
  
  private a(b paramb)
  {
    this.yqE = paramb;
  }
  
  public static a a(b paramb)
  {
    if (yqF != null) {
      throw new RuntimeException("tinker server client is already init");
    }
    if (yqF == null) {}
    try
    {
      if (yqF == null) {
        yqF = new a(paramb);
      }
      return yqF;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tinkerboots\sdk\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */