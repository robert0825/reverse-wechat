package com.tencent.mapsdk.rastercore.tile.b;

import com.tencent.mapsdk.rastercore.d.e;
import java.net.MalformedURLException;
import java.net.URL;

public class b
  extends a
{
  private String[] a = { "https://s0.map.gtimg.com/oversea", "https://s1.map.gtimg.com/oversea", "https://s2.map.gtimg.com/oversea", "https://s3.map.gtimg.com/oversea" };
  
  public b(int paramInt)
  {
    super(paramInt);
  }
  
  public URL getTileUrl(int paramInt1, int paramInt2, int paramInt3, Object... paramVarArgs)
  {
    int i = e.s();
    paramVarArgs = e.u();
    int j = e.t();
    int k = a(paramInt1 + paramInt2, this.a.length);
    String str = this.a[k];
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append("?z=").append(paramInt3).append("&x=").append(paramInt1).append("&y=").append(paramInt2).append("&styleid=").append(j).append("&version=").append(i).append("&ch=").append(paramVarArgs);
    paramVarArgs = localStringBuilder.toString();
    try
    {
      paramVarArgs = new URL(paramVarArgs);
      return paramVarArgs;
    }
    catch (MalformedURLException paramVarArgs) {}
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */