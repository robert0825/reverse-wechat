package com.tencent.xweb;

import android.content.Context;
import com.tencent.xweb.a.a.b;

public final class c
{
  private static c ymW;
  static a.b ymX;
  
  private c(Context paramContext)
  {
    if (ymX != null) {
      ymX.init(paramContext);
    }
  }
  
  public static c crU()
  {
    try
    {
      if (ymW == null) {
        throw new IllegalStateException("CookieSyncManager::createInstance() needs to be called before CookieSyncManager::getInstance()");
      }
    }
    finally {}
    c localc = ymW;
    return localc;
  }
  
  public static c io(Context paramContext)
  {
    try
    {
      if (ymW == null) {
        ymW = new c(paramContext.getApplicationContext());
      }
      paramContext = ymW;
      return paramContext;
    }
    finally {}
  }
  
  public static void sync()
  {
    if (ymX != null) {
      ymX.sync();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */