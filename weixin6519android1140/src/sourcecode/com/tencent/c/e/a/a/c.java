package com.tencent.c.e.a.a;

public abstract class c
  implements Runnable
{
  public abstract void cnA();
  
  public abstract void cnB();
  
  public void run()
  {
    try
    {
      cnA();
      return;
    }
    catch (Throwable localThrowable)
    {
      cnB();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\e\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */