package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
{
  private static List<a> fVK;
  private static Map<String, a> fVL;
  
  static
  {
    GMTrace.i(18713709379584L, 139428);
    fVK = new LinkedList();
    fVL = new HashMap();
    GMTrace.o(18713709379584L, 139428);
  }
  
  public static Object a(String paramString, Parcel paramParcel)
  {
    GMTrace.i(18713440944128L, 139426);
    paramString = (a)fVL.get(paramString);
    if (paramString != null)
    {
      paramString = paramString.d(paramParcel);
      GMTrace.o(18713440944128L, 139426);
      return paramString;
    }
    GMTrace.o(18713440944128L, 139426);
    return null;
  }
  
  public static void a(a parama)
  {
    GMTrace.i(18713575161856L, 139427);
    if ((parama == null) || (fVK.contains(parama)))
    {
      GMTrace.o(18713575161856L, 139427);
      return;
    }
    fVL.put(parama.getClass().getName(), parama);
    fVK.add(parama);
    GMTrace.o(18713575161856L, 139427);
  }
  
  public static void a(Object paramObject, Parcel paramParcel)
  {
    GMTrace.i(18713306726400L, 139425);
    a locala = ao(paramObject);
    if (locala != null) {
      locala.a(paramObject, paramParcel);
    }
    GMTrace.o(18713306726400L, 139425);
  }
  
  public static a ao(Object paramObject)
  {
    GMTrace.i(18713172508672L, 139424);
    Iterator localIterator = fVK.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.an(paramObject))
      {
        GMTrace.o(18713172508672L, 139424);
        return locala;
      }
    }
    GMTrace.o(18713172508672L, 139424);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ipcinvoker\extension\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */