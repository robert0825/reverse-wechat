package org.a.f;

import java.util.Random;

public final class d
  implements c
{
  private a yul = new a();
  
  private static Long ctI()
  {
    return Long.valueOf(Long.valueOf(System.currentTimeMillis()).longValue() / 1000L);
  }
  
  public final String ctH()
  {
    return String.valueOf(ctI());
  }
  
  public final String getNonce()
  {
    return String.valueOf(ctI().longValue() + Integer.valueOf(new Random().nextInt()).intValue());
  }
  
  static final class a {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\org\a\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */