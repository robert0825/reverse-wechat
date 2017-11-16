package com.tencent.mapsdk.rastercore.tile.b;

import java.net.MalformedURLException;
import java.net.URL;

public final class d
  extends a
{
  private String[] a = { "https://p0.map.gtimg.com/sateTiles", "https://p1.map.gtimg.com/sateTiles", "https://p2.map.gtimg.com/sateTiles", "https://p3.map.gtimg.com/sateTiles" };
  
  public d(int paramInt)
  {
    super(paramInt);
  }
  
  public final URL getTileUrl(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs)
  {
    paramInt2 = (int)(Math.pow(2.0D, paramInt3) - paramInt2 - 1.0D);
    int i = a(paramInt1 + paramInt2, 4);
    paramVarArgs = this.a[i] + '/' + paramInt3 + '/' + (paramInt1 >> 4) + '/' + (paramInt2 >> 4) + '/' + paramInt1 + '_' + paramInt2 + ".jpg";
    try
    {
      paramVarArgs = new URL(paramVarArgs);
      return paramVarArgs;
    }
    catch (MalformedURLException paramVarArgs) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */