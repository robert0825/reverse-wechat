package com.tencent.mapsdk.rastercore.tile.b;

import java.net.MalformedURLException;
import java.net.URL;

public final class f
  extends a
{
  private static final String[] a = { "https://rtt2.map.qq.com", "https://rtt2a.map.qq.com", "https://rtt2b.map.qq.com", "https://rtt2c.map.qq.com" };
  
  public f(int paramInt)
  {
    super(paramInt);
  }
  
  public final URL getTileUrl(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs)
  {
    if (paramInt3 < 10) {
      return null;
    }
    paramVarArgs = a[((paramInt1 + paramInt2) % a.length)];
    paramInt2 = (int)(Math.pow(2.0D, paramInt3) - paramInt2 - 1.0D);
    paramVarArgs = paramVarArgs + "/rtt/?z=" + paramInt3 + "&x=" + paramInt1 + "&y=" + paramInt2 + "&ref=android2DSdk&timeKey=" + System.currentTimeMillis();
    try
    {
      URL localURL = new URL(paramVarArgs);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      getClass().getSimpleName();
      new StringBuilder("Can not convert ").append(paramVarArgs).append(" to URL.");
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */