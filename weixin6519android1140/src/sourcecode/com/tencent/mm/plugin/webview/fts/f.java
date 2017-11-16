package com.tencent.mm.plugin.webview.fts;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  public static final JSONObject a(i parami, String paramString, List<String> paramList)
  {
    GMTrace.i(18175898943488L, 135421);
    at.AR();
    x localx = c.yK().TE(parami.lwH);
    String str2 = null;
    int k = 0;
    int j = 0;
    int i = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool1 = false;
    String str3 = r.fs(parami.lwH);
    String str1;
    switch (parami.gRk)
    {
    case 8: 
    case 9: 
    case 10: 
    case 12: 
    case 13: 
    case 14: 
    default: 
      i = 0;
      str1 = null;
      j = 0;
      bool1 = false;
    case 3: 
    case 2: 
    case 1: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
    case 15: 
    case 16: 
      for (;;)
      {
        if (k != 0)
        {
          if (i != 0)
          {
            str3 = e.a(str3, paramList, bool1, paramString);
            label179:
            localObject = str1;
            if (j != 0)
            {
              if (i == 0) {
                break label619;
              }
              paramString = e.a(str1, paramList, bool1, paramString);
              label202:
              localObject = str2 + paramString;
            }
            paramString = new JSONObject();
          }
          try
          {
            paramString.put("nickName", r.c(localx));
            paramString.put("userName", parami.lwH);
            if (k != 0) {
              paramString.put("nickNameHighlight", str3);
            }
            if (j != 0) {
              paramString.put("extraHighlight", localObject);
            }
          }
          catch (JSONException parami)
          {
            int m;
            for (;;) {}
          }
          GMTrace.o(18175898943488L, 135421);
          return paramString;
          bool1 = true;
          i = 1;
          bool2 = bool1;
          k = 1;
          bool1 = bool2;
          str1 = null;
          j = 0;
          continue;
          bool3 = true;
          j = 1;
          bool4 = bool3;
          str1 = localx.field_nickname;
          str2 = ab.getContext().getString(R.l.dWi);
          m = 1;
          bool1 = bool4;
          i = j;
          j = m;
          continue;
          str1 = localx.fjt;
          str2 = ab.getContext().getString(R.l.dWf);
          j = 1;
          bool1 = false;
          i = 0;
          continue;
          str2 = localx.qQ();
          str1 = str2;
          if (bg.nm(str2)) {
            str1 = localx.field_username;
          }
          str2 = ab.getContext().getString(R.l.dWm);
          j = 1;
          i = 0;
          bool1 = false;
          continue;
          j = 1;
          str1 = parami.content;
          if (bg.nm(str1)) {
            break label637;
          }
          Object localObject = str1.split("​");
          m = localObject.length;
          i = 0;
          label472:
          if (i >= m) {
            break label637;
          }
          str2 = localObject[i];
          if (str2.startsWith(paramString)) {
            str1 = str2;
          }
        }
      }
    }
    label619:
    label637:
    for (;;)
    {
      str2 = ab.getContext().getString(R.l.dWh);
      i = 0;
      bool1 = false;
      break;
      i += 1;
      break label472;
      str1 = parami.content;
      str2 = ab.getContext().getString(R.l.dWj);
      j = 1;
      bool1 = false;
      i = 0;
      break;
      str1 = parami.content;
      str2 = ab.getContext().getString(R.l.dWe);
      j = 1;
      bool1 = false;
      i = 0;
      break;
      str1 = parami.lxi;
      str2 = ab.getContext().getString(R.l.dWl);
      j = 1;
      bool1 = false;
      i = 0;
      break;
      str3 = e.b(str3, paramList, paramString);
      break label179;
      paramString = e.b(str1, paramList, paramString);
      break label202;
      break label179;
    }
  }
  
  public static int c(Map<String, Object> paramMap, String paramString, int paramInt)
  {
    GMTrace.i(12469632237568L, 92906);
    paramMap = o(paramMap, paramString);
    if (bg.nm(paramMap))
    {
      GMTrace.o(12469632237568L, 92906);
      return paramInt;
    }
    try
    {
      int i = Integer.valueOf(paramMap).intValue();
      GMTrace.o(12469632237568L, 92906);
      return i;
    }
    catch (Exception paramMap)
    {
      GMTrace.o(12469632237568L, 92906);
    }
    return paramInt;
  }
  
  public static String o(Map<String, Object> paramMap, String paramString)
  {
    GMTrace.i(12469363802112L, 92904);
    if (paramMap.containsKey(paramString))
    {
      if (paramMap.get(paramString) != null)
      {
        paramMap = paramMap.get(paramString).toString();
        GMTrace.o(12469363802112L, 92904);
        return paramMap;
      }
      GMTrace.o(12469363802112L, 92904);
      return "";
    }
    GMTrace.o(12469363802112L, 92904);
    return "";
  }
  
  public static boolean q(Map<String, Object> paramMap, String paramString)
  {
    GMTrace.i(12469498019840L, 92905);
    paramMap = o(paramMap, paramString);
    if (bg.nm(paramMap))
    {
      GMTrace.o(12469498019840L, 92905);
      return false;
    }
    try
    {
      boolean bool = "1".equals(paramMap);
      if (bool)
      {
        GMTrace.o(12469498019840L, 92905);
        return true;
      }
      bool = "0".equals(paramMap);
      if (bool)
      {
        GMTrace.o(12469498019840L, 92905);
        return false;
      }
      bool = Boolean.valueOf(paramMap).booleanValue();
      GMTrace.o(12469498019840L, 92905);
      return bool;
    }
    catch (Exception paramMap)
    {
      GMTrace.o(12469498019840L, 92905);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */