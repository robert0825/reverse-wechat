package com.tinkerboots.sdk.a.b;

public class a
{
  public final com.tinkerboots.sdk.a.c.a yqJ;
  
  private a(com.tinkerboots.sdk.a.c.a parama)
  {
    this.yqJ = parama;
  }
  
  public static a csN()
  {
    a locala = new a();
    locala.yqJ = new com.tinkerboots.sdk.a.c.a();
    if (locala.yqJ == null) {
      throw new RuntimeException("You need init conditions property");
    }
    return new a(locala.yqJ);
  }
  
  static final class a
  {
    com.tinkerboots.sdk.a.c.a yqJ;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tinkerboots\sdk\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */