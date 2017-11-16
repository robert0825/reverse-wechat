package com.tencent.smtt.sdk;

import android.os.HandlerThread;

final class n
  extends HandlerThread
{
  private static n xVz;
  
  private n(String paramString)
  {
    super(paramString);
  }
  
  public static n cou()
  {
    try
    {
      if (xVz == null)
      {
        localn = new n("TbsHandlerThread");
        xVz = localn;
        localn.start();
      }
      n localn = xVz;
      return localn;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */