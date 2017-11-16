package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.Map;

public final class s
{
  public static String a(ud paramud)
  {
    int j = 0;
    GMTrace.i(6304340901888L, 46971);
    if ((paramud == null) || ((paramud.ulP.isEmpty()) && (paramud.ulO.isEmpty())))
    {
      w.v("MicroMsg.FavTagParser", "tag list toXml data list empty");
      GMTrace.o(6304340901888L, 46971);
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    int k = paramud.ulP.size();
    localStringBuffer.append("<taglist count='").append(k).append("'>");
    int i = 0;
    while (i < k)
    {
      localStringBuffer.append("<tag>").append(bg.Sw((String)paramud.ulP.get(i))).append("</tag>");
      i += 1;
    }
    localStringBuffer.append("</taglist>");
    k = paramud.ulO.size();
    localStringBuffer.append("<recommendtaglist count='").append(k).append("'>");
    i = j;
    while (i < k)
    {
      localStringBuffer.append("<tag>").append(bg.Sw((String)paramud.ulO.get(i))).append("</tag>");
      i += 1;
    }
    localStringBuffer.append("</recommendtaglist>");
    paramud = localStringBuffer.toString();
    GMTrace.o(6304340901888L, 46971);
    return paramud;
  }
  
  public static void a(Map<String, String> paramMap, ud paramud)
  {
    GMTrace.i(6304206684160L, 46970);
    if ((paramMap == null) || (paramud == null))
    {
      w.w("MicroMsg.FavTagParser", "maps is null or item is null");
      GMTrace.o(6304206684160L, 46970);
      return;
    }
    paramud.ulP.clear();
    int i = 0;
    StringBuilder localStringBuilder;
    Object localObject;
    if (i < 1024)
    {
      localStringBuilder = new StringBuilder(".favitem.taglist.tag");
      if (i > 0) {}
      for (localObject = Integer.valueOf(i);; localObject = "")
      {
        localObject = (String)paramMap.get(localObject);
        if (localObject == null) {
          break label113;
        }
        paramud.ulP.add(localObject);
        i += 1;
        break;
      }
    }
    label113:
    if (!paramud.ulP.isEmpty()) {
      w.d("MicroMsg.FavTagParser", "user def tag not empty, res=%s", new Object[] { paramud.ulP });
    }
    paramud.ulO.clear();
    i = 0;
    if (i < 1024)
    {
      localStringBuilder = new StringBuilder(".favitem.recommendtaglist.tag");
      if (i > 0) {}
      for (localObject = Integer.valueOf(i);; localObject = "")
      {
        localObject = (String)paramMap.get(localObject);
        if (localObject == null) {
          break label222;
        }
        paramud.ulO.add(localObject);
        i += 1;
        break;
      }
    }
    label222:
    if (!paramud.ulO.isEmpty()) {
      w.d("MicroMsg.FavTagParser", "recommended tag not empty, res=%s", new Object[] { paramud.ulO });
    }
    GMTrace.o(6304206684160L, 46970);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */