package com.tencent.mm.plugin.appbrand.dynamic.debugger;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.modelappbrand.h.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static final Map<String, List<h.a>> fVJ;
  private static final Map<String, DebuggerInfo> hTx;
  
  static
  {
    GMTrace.i(18315753816064L, 136463);
    fVJ = new ConcurrentHashMap();
    hTx = new ConcurrentHashMap();
    GMTrace.o(18315753816064L, 136463);
  }
  
  public static void a(String paramString, DebuggerInfo paramDebuggerInfo)
  {
    GMTrace.i(18315082727424L, 136458);
    hTx.put(paramString, paramDebuggerInfo);
    GMTrace.o(18315082727424L, 136458);
  }
  
  public static void a(String paramString, ArrayList<LogInfo> paramArrayList)
  {
    GMTrace.i(18315485380608L, 136461);
    if ((bg.nm(paramString)) || (paramArrayList == null) || (paramArrayList.isEmpty()))
    {
      GMTrace.o(18315485380608L, 136461);
      return;
    }
    paramString = (List)fVJ.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(18315485380608L, 136461);
      return;
    }
    paramString = new LinkedList(paramString).iterator();
    while (paramString.hasNext()) {
      ((h.a)paramString.next()).z(paramArrayList);
    }
    GMTrace.o(18315485380608L, 136461);
  }
  
  public static boolean c(String paramString, h.a parama)
  {
    GMTrace.i(18315216945152L, 136459);
    if ((bg.nm(paramString)) || (parama == null))
    {
      GMTrace.o(18315216945152L, 136459);
      return false;
    }
    Object localObject = (List)fVJ.get(paramString);
    if (localObject == null)
    {
      localObject = new LinkedList();
      fVJ.put(paramString, localObject);
      paramString = (String)localObject;
    }
    do
    {
      boolean bool = paramString.add(parama);
      GMTrace.o(18315216945152L, 136459);
      return bool;
      paramString = (String)localObject;
    } while (!((List)localObject).contains(parama));
    GMTrace.o(18315216945152L, 136459);
    return true;
  }
  
  public static boolean d(String paramString, h.a parama)
  {
    GMTrace.i(18315351162880L, 136460);
    if ((bg.nm(paramString)) || (parama == null))
    {
      GMTrace.o(18315351162880L, 136460);
      return false;
    }
    List localList = (List)fVJ.get(paramString);
    if (localList == null)
    {
      GMTrace.o(18315351162880L, 136460);
      return false;
    }
    boolean bool = localList.remove(parama);
    if (localList.isEmpty()) {
      fVJ.remove(paramString);
    }
    GMTrace.o(18315351162880L, 136460);
    return bool;
  }
  
  public static DebuggerInfo pL(String paramString)
  {
    GMTrace.i(18314948509696L, 136457);
    paramString = (DebuggerInfo)hTx.get(paramString);
    GMTrace.o(18314948509696L, 136457);
    return paramString;
  }
  
  public static void r(String paramString, int paramInt)
  {
    GMTrace.i(18315619598336L, 136462);
    if (bg.nm(paramString))
    {
      GMTrace.o(18315619598336L, 136462);
      return;
    }
    paramString = (List)fVJ.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(18315619598336L, 136462);
      return;
    }
    paramString = new LinkedList(paramString).iterator();
    while (paramString.hasNext()) {
      ((h.a)paramString.next()).fJ(paramInt);
    }
    GMTrace.o(18315619598336L, 136462);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\debugger\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */