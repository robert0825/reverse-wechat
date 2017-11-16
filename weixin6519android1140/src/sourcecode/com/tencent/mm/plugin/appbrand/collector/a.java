package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.ConcurrentHashMap;

final class a<K, V>
  extends ConcurrentHashMap<K, V>
{
  a()
  {
    GMTrace.i(20001662697472L, 149024);
    GMTrace.o(20001662697472L, 149024);
  }
  
  public final boolean containsValue(Object paramObject)
  {
    GMTrace.i(20002199568384L, 149028);
    if (paramObject == null)
    {
      GMTrace.o(20002199568384L, 149028);
      return false;
    }
    boolean bool = super.containsValue(paramObject);
    GMTrace.o(20002199568384L, 149028);
    return bool;
  }
  
  public final V get(Object paramObject)
  {
    GMTrace.i(20001796915200L, 149025);
    if (paramObject == null)
    {
      GMTrace.o(20001796915200L, 149025);
      return null;
    }
    paramObject = super.get(paramObject);
    GMTrace.o(20001796915200L, 149025);
    return (V)paramObject;
  }
  
  public final V put(K paramK, V paramV)
  {
    GMTrace.i(20001931132928L, 149026);
    if (paramK == null)
    {
      GMTrace.o(20001931132928L, 149026);
      return null;
    }
    if (paramV == null)
    {
      paramK = super.remove(paramK);
      GMTrace.o(20001931132928L, 149026);
      return paramK;
    }
    paramK = super.put(paramK, paramV);
    GMTrace.o(20001931132928L, 149026);
    return paramK;
  }
  
  public final V remove(Object paramObject)
  {
    GMTrace.i(20002065350656L, 149027);
    if (paramObject == null)
    {
      GMTrace.o(20002065350656L, 149027);
      return null;
    }
    paramObject = super.remove(paramObject);
    GMTrace.o(20002065350656L, 149027);
    return (V)paramObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\collector\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */