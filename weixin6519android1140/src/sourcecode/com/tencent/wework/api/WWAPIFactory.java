package com.tencent.wework.api;

import android.content.Context;

public class WWAPIFactory
{
  public static IWWAPI in(Context paramContext)
  {
    return new WWAPIImpl(paramContext);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wework\api\WWAPIFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */