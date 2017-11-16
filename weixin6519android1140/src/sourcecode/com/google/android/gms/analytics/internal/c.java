package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  final Map<String, String> abX;
  final List<Command> abY;
  final long abZ;
  final long aca;
  final int acb;
  final boolean acc;
  private final String acd;
  
  public c(n paramn, Map<String, String> paramMap, long paramLong)
  {
    this(paramn, paramMap, paramLong, true, 0L, 0, null);
  }
  
  public c(n paramn, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt)
  {
    this(paramn, paramMap, paramLong1, paramBoolean, paramLong2, paramInt, null);
  }
  
  public c(n paramn, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt, List<Command> paramList)
  {
    w.aa(paramn);
    w.aa(paramMap);
    this.aca = paramLong1;
    this.acc = paramBoolean;
    this.abZ = paramLong2;
    this.acb = paramInt;
    if (paramList != null) {}
    Object localObject2;
    for (Object localObject1 = paramList;; localObject1 = Collections.EMPTY_LIST)
    {
      this.abY = ((List)localObject1);
      this.acd = i(paramList);
      paramList = new HashMap();
      localObject1 = paramMap.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if (T(((Map.Entry)localObject2).getKey()))
        {
          String str = a(paramn, ((Map.Entry)localObject2).getKey());
          if (str != null) {
            paramList.put(str, b(paramn, ((Map.Entry)localObject2).getValue()));
          }
        }
      }
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject1 = (Map.Entry)paramMap.next();
      if (!T(((Map.Entry)localObject1).getKey()))
      {
        localObject2 = a(paramn, ((Map.Entry)localObject1).getKey());
        if (localObject2 != null) {
          paramList.put(localObject2, b(paramn, ((Map.Entry)localObject1).getValue()));
        }
      }
    }
    if (!TextUtils.isEmpty(this.acd))
    {
      k.a(paramList, "_v", this.acd);
      if ((this.acd.equals("ma4.0.0")) || (this.acd.equals("ma4.0.1"))) {
        paramList.remove("adid");
      }
    }
    this.abX = Collections.unmodifiableMap(paramList);
  }
  
  private static boolean T(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    return paramObject.toString().startsWith("&");
  }
  
  private static String a(n paramn, Object paramObject)
  {
    if (paramObject == null) {
      paramn = null;
    }
    Object localObject;
    do
    {
      return paramn;
      localObject = paramObject.toString();
      paramObject = localObject;
      if (((String)localObject).startsWith("&")) {
        paramObject = ((String)localObject).substring(1);
      }
      int i = ((String)paramObject).length();
      localObject = paramObject;
      if (i > 256)
      {
        localObject = ((String)paramObject).substring(0, 256);
        paramn.c("Hit param name is too long and will be trimmed", Integer.valueOf(i), localObject);
      }
      paramn = (n)localObject;
    } while (!TextUtils.isEmpty((CharSequence)localObject));
    return null;
  }
  
  private static String b(n paramn, Object paramObject)
  {
    if (paramObject == null) {}
    for (paramObject = "";; paramObject = paramObject.toString())
    {
      int i = ((String)paramObject).length();
      Object localObject = paramObject;
      if (i > 8192)
      {
        localObject = ((String)paramObject).substring(0, 8192);
        paramn.c("Hit param value is too long and will be trimmed", Integer.valueOf(i), localObject);
      }
      return (String)localObject;
    }
  }
  
  private static String i(List<Command> paramList)
  {
    Command localCommand;
    if (paramList != null)
    {
      paramList = paramList.iterator();
      do
      {
        if (!paramList.hasNext()) {
          break;
        }
        localCommand = (Command)paramList.next();
      } while (!"appendVersion".equals(localCommand.abK));
    }
    for (paramList = localCommand.mValue;; paramList = null)
    {
      if (TextUtils.isEmpty(paramList)) {
        return null;
      }
      return paramList;
    }
  }
  
  final String c(String paramString1, String paramString2)
  {
    w.af(paramString1);
    if (!paramString1.startsWith("&")) {}
    for (boolean bool = true;; bool = false)
    {
      w.c(bool, "Short param name required");
      paramString1 = (String)this.abX.get(paramString1);
      if (paramString1 == null) {
        break;
      }
      return paramString1;
    }
    return paramString2;
  }
  
  public final String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ht=").append(this.aca);
    if (this.abZ != 0L) {
      localStringBuffer.append(", dbId=").append(this.abZ);
    }
    if (this.acb != 0L) {
      localStringBuffer.append(", appUID=").append(this.acb);
    }
    Object localObject = new ArrayList(this.abX.keySet());
    Collections.sort((List)localObject);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuffer.append(", ");
      localStringBuffer.append(str);
      localStringBuffer.append("=");
      localStringBuffer.append((String)this.abX.get(str));
    }
    return localStringBuffer.toString();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */