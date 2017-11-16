package com.tencent.mapsdk.rastercore.tile.b;

import com.tencent.mapsdk.rastercore.b;
import java.net.MalformedURLException;
import java.net.URL;

public final class e
  extends a
{
  private String[] a = { "https://m0.map.gtimg.com/hwap", "https://m1.map.gtimg.com/hwap", "https://m2.map.gtimg.com/hwap", "https://m3.map.gtimg.com/hwap" };
  
  public e(int paramInt)
  {
    super(paramInt);
  }
  
  public final URL getTileUrl(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs)
  {
    int k = 0;
    int i = b.a;
    if (paramVarArgs != null) {}
    for (;;)
    {
      Object localObject;
      try
      {
        if (paramVarArgs.length <= 0) {
          break label321;
        }
        j = Integer.parseInt(paramVarArgs[0].toString());
        i = j;
      }
      catch (Exception paramVarArgs)
      {
        int j;
        boolean bool;
        paramVarArgs = null;
        continue;
      }
      for (;;)
      {
        try
        {
          if (paramVarArgs.length != 3) {
            continue;
          }
          localObject = paramVarArgs[1].toString();
        }
        catch (Exception paramVarArgs)
        {
          paramVarArgs = null;
          break;
          paramVarArgs = null;
          break;
        }
        try
        {
          bool = Boolean.parseBoolean(paramVarArgs[2].toString());
          k = bool;
          paramVarArgs = (Object[])localObject;
        }
        catch (Exception paramVarArgs)
        {
          paramVarArgs = (Object[])localObject;
          break;
        }
      }
      try
      {
        j = a(paramInt1 + paramInt2, this.a.length);
        paramInt2 = (int)(Math.pow(2.0D, paramInt3) - paramInt2 - 1.0D);
        localObject = new StringBuilder(128);
        ((StringBuilder)localObject).append(this.a[j]);
        ((StringBuilder)localObject).append("?");
        ((StringBuilder)localObject).append("z=");
        ((StringBuilder)localObject).append(paramInt3 - 1);
        ((StringBuilder)localObject).append("&x=");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("&y=");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append("&styleid=");
        ((StringBuilder)localObject).append(b.e);
        ((StringBuilder)localObject).append("&version=");
        ((StringBuilder)localObject).append(i);
        localObject = new StringBuffer(((StringBuilder)localObject).toString());
        if (k != 0) {
          ((StringBuffer)localObject).append("&v=").append(com.tencent.mapsdk.rastercore.d.e.v()).append("&md5=").append(paramVarArgs);
        }
        paramVarArgs = new URL(((StringBuffer)localObject).toString());
        return paramVarArgs;
      }
      catch (MalformedURLException paramVarArgs)
      {
        new StringBuilder("Error new URL with str:").append(null);
        return null;
      }
      label321:
      paramVarArgs = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */