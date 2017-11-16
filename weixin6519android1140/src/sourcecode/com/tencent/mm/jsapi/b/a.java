package com.tencent.mm.jsapi.b;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public class a
  extends b<JSONObject, JSONObject>
  implements e
{
  public a(String paramString, int paramInt)
  {
    super(paramString, paramInt);
    GMTrace.i(20016560865280L, 149135);
    GMTrace.o(20016560865280L, 149135);
  }
  
  private static void k(Map paramMap)
  {
    GMTrace.i(20017366171648L, 149141);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      Object localObject1 = ((Map.Entry)localObject2).getKey();
      localObject2 = ((Map.Entry)localObject2).getValue();
      if (((localObject1 instanceof String)) && ((localObject2 instanceof Map)))
      {
        k((Map)localObject2);
        paramMap.put(localObject1, new JSONObject((Map)localObject2));
      }
    }
    GMTrace.o(20017366171648L, 149141);
  }
  
  public final JSONObject a(boolean paramBoolean, String paramString, Bundle paramBundle)
  {
    GMTrace.i(20016963518464L, 149138);
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(this.name);
    ((StringBuilder)localObject2).append(":");
    if (paramBoolean) {}
    for (Object localObject1 = "ok";; localObject1 = "fail")
    {
      ((StringBuilder)localObject2).append((String)localObject1);
      if (!TextUtils.isEmpty(paramString))
      {
        ((StringBuilder)localObject2).append(":");
        ((StringBuilder)localObject2).append(bg.nl(paramString));
      }
      paramString = new HashMap();
      paramString.put("errMsg", ((StringBuilder)localObject2).toString());
      if (paramBundle == null) {
        break;
      }
      localObject1 = paramBundle.keySet();
      if ((localObject1 == null) || (((Set)localObject1).isEmpty())) {
        break;
      }
      localObject1 = ((Set)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        paramString.put(localObject2, paramBundle.get((String)localObject2));
      }
    }
    k(paramString);
    paramString = new JSONObject(paramString);
    GMTrace.o(20016963518464L, 149138);
    return paramString;
  }
  
  public final JSONObject a(boolean paramBoolean, String paramString, Map<String, ? extends Object> paramMap)
  {
    GMTrace.i(20016829300736L, 149137);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.name);
    localStringBuilder.append(":");
    if (paramBoolean) {}
    for (String str = "ok";; str = "fail")
    {
      localStringBuilder.append(str);
      if (!TextUtils.isEmpty(paramString))
      {
        localStringBuilder.append(":");
        localStringBuilder.append(bg.nl(paramString));
      }
      paramString = new HashMap();
      paramString.put("errMsg", localStringBuilder.toString());
      if (paramMap != null) {
        paramString.putAll(paramMap);
      }
      k(paramString);
      paramString = new JSONObject(paramString);
      GMTrace.o(20016829300736L, 149137);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\jsapi\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */