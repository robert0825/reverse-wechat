package com.tencent.mm.opensdk.channel.a;

import com.tencent.gmtrace.GMTrace;

public final class b
{
  public static byte[] a(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(402653184L, 3);
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString1 != null) {
      localStringBuffer.append(paramString1);
    }
    localStringBuffer.append(paramInt);
    localStringBuffer.append(paramString2);
    localStringBuffer.append("mMcShCsTr");
    paramString1 = com.tencent.mm.opensdk.utils.b.c(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    GMTrace.o(402653184L, 3);
    return paramString1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\opensdk\channel\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */