package com.tencent.mm.pluginsdk.j.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.aza;
import com.tencent.mm.protocal.c.azc;
import com.tencent.mm.protocal.c.azd;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

final class e
{
  private static boolean a(int paramInt, String paramString, Map<String, String> paramMap)
  {
    GMTrace.i(856577540096L, 6382);
    if ((paramMap.get(paramString + ".resType") == null) && (paramMap.get(paramString + ".subType") == null))
    {
      GMTrace.o(856577540096L, 6382);
      return true;
    }
    int i;
    Object localObject;
    if (i.b.yY(paramInt))
    {
      w.d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceDelete()");
      paramInt = bg.getInt((String)paramMap.get(paramString + ".resType"), -1);
      i = bg.getInt((String)paramMap.get(paramString + ".subType"), -1);
      if ((-1 == paramInt) || (-1 == i))
      {
        GMTrace.o(856577540096L, 6382);
        return false;
      }
      localObject = new aza();
      ((aza)localObject).uJY = i;
      ((aza)localObject).uNn = new azd();
      ((aza)localObject).uNn.uNx = bg.getInt((String)paramMap.get(paramString + ".resVer"), 0);
      ((aza)localObject).uNq = ((String)paramMap.get(paramString + ".sampleID"));
      ((aza)localObject).uNp = bg.getInt((String)paramMap.get(paramString + ".reportID"), 0);
      ((aza)localObject).urq = i.b.tqz.eQl;
      b.c.tqk.a(paramInt, (aza)localObject, true);
      j.r(((aza)localObject).uNp, 40L);
      GMTrace.o(856577540096L, 6382);
      return true;
    }
    if (i.b.yW(paramInt))
    {
      w.d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceCache()");
      localObject = (String)paramMap.get(paramString + ".CDNUrl");
      int j = bg.getInt((String)paramMap.get(paramString + ".subType"), -1);
      int k = bg.getInt((String)paramMap.get(paramString + ".resType"), -1);
      String str = (String)paramMap.get(paramString + ".md5");
      int m = bg.getInt((String)paramMap.get(paramString + ".priority"), 0);
      if ((bg.nm((String)localObject)) || (bg.nm(str)) || (-1 == j) || (-1 == k) || (m < 0))
      {
        GMTrace.o(856577540096L, 6382);
        return false;
      }
      aza localaza = new aza();
      localaza.uNn = new azd();
      paramInt = 0;
      if (bg.getInt((String)paramMap.get(paramString + ".fileEncrypt"), 0) > 0) {
        paramInt = i.a.bKd();
      }
      i = paramInt;
      if (bg.getInt((String)paramMap.get(paramString + ".fileCompress"), 0) > 0) {
        i = i.a.yU(paramInt);
      }
      localaza.uJY = j;
      localaza.uNs = bg.getInt((String)paramMap.get(paramString + ".networkType"), 2);
      localaza.tYf = bg.getInt((String)paramMap.get(paramString + ".expireTime"), 1);
      localaza.uNn.lPM = ((String)localObject);
      localaza.uNn.uNx = bg.getInt((String)paramMap.get(paramString + ".resVer"), 0);
      localaza.uNn.ugH = str;
      localaza.uNn.uNA = ((String)paramMap.get(paramString + ".originalmd5"));
      localaza.uNn.uNy = i;
      localaza.uNn.uNz = null;
      localaza.uNn.ugp = null;
      localaza.uxd = m;
      localaza.urq = i.b.tqx.eQl;
      localaza.uNp = bg.getInt((String)paramMap.get(paramString + ".reportID"), 0);
      localaza.uNq = ((String)paramMap.get(paramString + ".sampleID"));
      localaza.uNr = bg.getInt((String)paramMap.get(paramString + ".retryTime"), 3);
      localaza.uNt = bg.getInt((String)paramMap.get(paramString + ".retryInterval"), 0);
      localaza.tqo = 0;
      b.c.tqk.b(k, localaza, true);
      j.r(localaza.uNp, 34L);
      GMTrace.o(856577540096L, 6382);
      return true;
    }
    if (i.b.yX(paramInt))
    {
      w.d("MicroMsg.CheckResUpdateNewXmlParser", "handleResourceDecrypt()");
      paramInt = bg.getInt((String)paramMap.get(paramString + ".resType"), -1);
      i = bg.getInt((String)paramMap.get(paramString + ".subType"), -1);
      if ((-1 == paramInt) || (-1 == i))
      {
        GMTrace.o(856577540096L, 6382);
        return false;
      }
      localObject = new aza();
      ((aza)localObject).uNo = new azc();
      ((aza)localObject).uJY = i;
      ((aza)localObject).uNo.uNw = ((String)paramMap.get(paramString + ".resKey"));
      ((aza)localObject).uNo.uNv = bg.getInt((String)paramMap.get(paramString + ".resKeyVersion"), 0);
      ((aza)localObject).uNq = ((String)paramMap.get(paramString + ".sampleID"));
      ((aza)localObject).uNp = bg.getInt((String)paramMap.get(paramString + ".reportID"), 0);
      ((aza)localObject).urq = i.b.tqy.eQl;
      ((aza)localObject).uNn = new azd();
      ((aza)localObject).uNn.uNA = ((String)paramMap.get(paramString + ".originalmd5"));
      b.c.tqk.c(paramInt, (aza)localObject, true);
      j.r(((aza)localObject).uNp, 37L);
      GMTrace.o(856577540096L, 6382);
      return true;
    }
    GMTrace.o(856577540096L, 6382);
    return false;
  }
  
  static void f(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    GMTrace.i(856309104640L, 6380);
    if (o(String.format("%s.%s", new Object[] { paramString1, paramString2 }), paramMap))
    {
      GMTrace.o(856309104640L, 6380);
      return;
    }
    boolean bool = g(paramString1, paramString2, paramMap) | false;
    int i = 0;
    for (;;)
    {
      i += 1;
      if (o(String.format("%s.%s%d", new Object[] { paramString1, paramString2, Integer.valueOf(i) }), paramMap)) {
        break;
      }
      bool |= g(paramString1, paramString2, paramMap);
    }
    i = i.b.OL(paramString2);
    if (i.b.yW(i))
    {
      j.r(0L, 32L);
      if (!bool)
      {
        j.r(0L, 33L);
        GMTrace.o(856309104640L, 6380);
      }
    }
    else if (i.b.yX(i))
    {
      j.r(0L, 35L);
      if (!bool)
      {
        j.r(0L, 36L);
        GMTrace.o(856309104640L, 6380);
      }
    }
    else if (i.b.yY(i))
    {
      j.r(0L, 38L);
      if (!bool) {
        j.r(0L, 39L);
      }
    }
    GMTrace.o(856309104640L, 6380);
  }
  
  private static boolean g(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    GMTrace.i(856443322368L, 6381);
    String str = String.format("%s.%s.%s", new Object[] { paramString1, paramString2, "Resource" });
    int j = i.b.OL(paramString2);
    if (o(str, paramMap))
    {
      GMTrace.o(856443322368L, 6381);
      return true;
    }
    boolean bool = a(j, str, paramMap) | false;
    int i = 0;
    for (;;)
    {
      i += 1;
      str = String.format("%s.%s.%s%d", new Object[] { paramString1, paramString2, "Resource", Integer.valueOf(i) });
      if (o(str, paramMap)) {
        break;
      }
      bool |= a(j, str, paramMap);
    }
    GMTrace.o(856443322368L, 6381);
    return bool;
  }
  
  private static boolean o(String paramString, Map<String, String> paramMap)
  {
    GMTrace.i(856174886912L, 6379);
    if ((paramMap.get(paramString) == null) && (paramMap.get(paramString + ".resType") == null) && (paramMap.get(paramString + ".subType") == null))
    {
      GMTrace.o(856174886912L, 6379);
      return true;
    }
    GMTrace.o(856174886912L, 6379);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */