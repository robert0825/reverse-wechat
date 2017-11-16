package com.tencent.liteav.basic.util;

public class TXCTimeUtil
{
  static {}
  
  public static long getTimeTick()
  {
    return nativeGetTimeTick();
  }
  
  public static long getUtcTimeTick()
  {
    return nativeGetUtcTimeTick();
  }
  
  private static native long nativeGetTimeTick();
  
  private static native long nativeGetUtcTimeTick();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\liteav\basic\util\TXCTimeUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */