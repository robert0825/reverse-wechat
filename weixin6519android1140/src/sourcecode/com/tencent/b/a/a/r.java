package com.tencent.b.a.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class r
{
  private static r aLe = null;
  private Map<Integer, q> aLc = null;
  private int aLd = 0;
  
  private r(Context paramContext)
  {
    this.aLc.put(Integer.valueOf(1), new o(paramContext));
    this.aLc.put(Integer.valueOf(2), new d(paramContext));
    this.aLc.put(Integer.valueOf(4), new k(paramContext));
  }
  
  static r U(Context paramContext)
  {
    try
    {
      if (aLe == null) {
        aLe = new r(paramContext);
      }
      paramContext = aLe;
      return paramContext;
    }
    finally {}
  }
  
  private a p(List<Integer> paramList)
  {
    if (paramList.size() > 0) {
      paramList = paramList.iterator();
    }
    Object localObject;
    do
    {
      do
      {
        if (!paramList.hasNext()) {
          return new a();
        }
        localObject = (Integer)paramList.next();
        localObject = (q)this.aLc.get(localObject);
      } while (localObject == null);
      localObject = ((q)localObject).oq();
    } while (localObject == null);
    return (a)localObject;
  }
  
  final void b(a parama)
  {
    Iterator localIterator = this.aLc.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      ((q)((Map.Entry)localIterator.next()).getValue()).b(parama);
    }
  }
  
  final void b(g paramg)
  {
    Iterator localIterator = this.aLc.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return;
      }
      ((q)((Map.Entry)localIterator.next()).getValue()).b(paramg);
    }
  }
  
  final g o(List<Integer> paramList)
  {
    if (paramList.size() >= 0) {
      paramList = paramList.iterator();
    }
    Object localObject;
    do
    {
      do
      {
        if (!paramList.hasNext()) {
          return new g();
        }
        localObject = (Integer)paramList.next();
        localObject = (q)this.aLc.get(localObject);
      } while (localObject == null);
      localObject = ((q)localObject).op();
    } while ((localObject == null) || (!s.aV(((g)localObject).aKK)));
    return (g)localObject;
  }
  
  final g op()
  {
    return o(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(4) })));
  }
  
  final a oq()
  {
    return p(new ArrayList(Arrays.asList(new Integer[] { Integer.valueOf(1), Integer.valueOf(4) })));
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\b\a\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */