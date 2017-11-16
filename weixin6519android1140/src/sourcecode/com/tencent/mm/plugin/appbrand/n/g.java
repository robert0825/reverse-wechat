package com.tencent.mm.plugin.appbrand.n;

import com.tencent.gmtrace.GMTrace;

public final class g
{
  public static String aO(long paramLong)
  {
    GMTrace.i(18661096030208L, 139036);
    String str = "Token@" + paramLong;
    GMTrace.o(18661096030208L, 139036);
    return str;
  }
  
  public static String aQ(Object paramObject)
  {
    GMTrace.i(17774185283584L, 132428);
    StringBuilder localStringBuilder = new StringBuilder("Token@");
    if (paramObject != null) {}
    for (paramObject = Integer.valueOf(paramObject.hashCode());; paramObject = "null")
    {
      paramObject = paramObject;
      GMTrace.o(17774185283584L, 132428);
      return (String)paramObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\n\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */