package com.tencent.wcdb;

public class SQLException
  extends RuntimeException
{
  public SQLException() {}
  
  public SQLException(String paramString)
  {
    super(paramString);
  }
  
  public SQLException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\SQLException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */