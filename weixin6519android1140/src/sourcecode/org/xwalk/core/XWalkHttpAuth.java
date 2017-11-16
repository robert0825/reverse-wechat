package org.xwalk.core;

public abstract interface XWalkHttpAuth
{
  public abstract void cancel();
  
  public abstract boolean isFirstAttempt();
  
  public abstract void proceed(String paramString1, String paramString2);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\XWalkHttpAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */