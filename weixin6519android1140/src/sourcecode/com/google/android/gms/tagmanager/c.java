package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
{
  public static final Object ayk = new Object();
  static final String[] ayl = "gtm.lifetime".toString().split("\\.");
  private static final Pattern aym = Pattern.compile("(\\d+)\\s*([smhd]?)");
  private final ConcurrentHashMap<b, Integer> ayn;
  private final Map<String, Object> ayo;
  private final ReentrantLock ayp;
  private final LinkedList<Map<String, Object>> ayq;
  private final c ayr;
  public final CountDownLatch ays;
  
  c()
  {
    this(new c()
    {
      public final void a(c.c.a paramAnonymousa)
      {
        paramAnonymousa.m(new ArrayList());
      }
      
      public final void a(List<c.a> paramAnonymousList, long paramAnonymousLong) {}
    });
  }
  
  c(c paramc)
  {
    this.ayr = paramc;
    this.ayn = new ConcurrentHashMap();
    this.ayo = new HashMap();
    this.ayp = new ReentrantLock();
    this.ayq = new LinkedList();
    this.ays = new CountDownLatch(1);
    this.ayr.a(new c.c.a()
    {
      public final void m(List<c.a> paramAnonymousList)
      {
        paramAnonymousList = paramAnonymousList.iterator();
        while (paramAnonymousList.hasNext())
        {
          c.a locala = (c.a)paramAnonymousList.next();
          c.this.e(c.j(locala.aut, locala.ayu));
        }
        c.this.ays.countDown();
      }
    });
  }
  
  private void a(Map<String, Object> paramMap, String paramString, Collection<a> paramCollection)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      StringBuilder localStringBuilder = new StringBuilder().append(paramString);
      if (paramString.length() == 0) {}
      for (paramMap = "";; paramMap = ".")
      {
        paramMap = paramMap + (String)localEntry.getKey();
        if (!(localEntry.getValue() instanceof Map)) {
          break label119;
        }
        a((Map)localEntry.getValue(), paramMap, paramCollection);
        break;
      }
      label119:
      if (!paramMap.equals("gtm.lifetime")) {
        paramCollection.add(new a(paramMap, localEntry.getValue()));
      }
    }
  }
  
  private void a(Map<String, Object> paramMap1, Map<String, Object> paramMap2)
  {
    Iterator localIterator = paramMap1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap1.get(str);
      if ((localObject instanceof List))
      {
        if (!(paramMap2.get(str) instanceof List)) {
          paramMap2.put(str, new ArrayList());
        }
        b((List)localObject, (List)paramMap2.get(str));
      }
      else if ((localObject instanceof Map))
      {
        if (!(paramMap2.get(str) instanceof Map)) {
          paramMap2.put(str, new HashMap());
        }
        a((Map)localObject, (Map)paramMap2.get(str));
      }
      else
      {
        paramMap2.put(str, localObject);
      }
    }
  }
  
  private static Long aw(String paramString)
  {
    Object localObject = aym.matcher(paramString);
    if (!((Matcher)localObject).matches())
    {
      new StringBuilder("unknown _lifetime: ").append(paramString);
      m.mr();
      return null;
    }
    long l;
    try
    {
      l = Long.parseLong(((Matcher)localObject).group(1));
      if (l <= 0L)
      {
        new StringBuilder("non-positive _lifetime: ").append(paramString);
        m.mr();
        return null;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        new StringBuilder("illegal number in _lifetime value: ").append(paramString);
        l = 0L;
        m.mq();
      }
      localObject = ((Matcher)localObject).group(2);
      if (((String)localObject).length() == 0) {
        return Long.valueOf(l);
      }
      switch (((String)localObject).charAt(0))
      {
      default: 
        new StringBuilder("unknown units in _lifetime: ").append(paramString);
        m.mq();
        return null;
      }
    }
    return Long.valueOf(l * 1000L);
    return Long.valueOf(l * 1000L * 60L);
    return Long.valueOf(l * 1000L * 60L * 60L);
    return Long.valueOf(l * 1000L * 60L * 60L * 24L);
  }
  
  private void b(List<Object> paramList1, List<Object> paramList2)
  {
    while (paramList2.size() < paramList1.size()) {
      paramList2.add(null);
    }
    int i = 0;
    if (i < paramList1.size())
    {
      Object localObject = paramList1.get(i);
      if ((localObject instanceof List))
      {
        if (!(paramList2.get(i) instanceof List)) {
          paramList2.set(i, new ArrayList());
        }
        b((List)localObject, (List)paramList2.get(i));
      }
      for (;;)
      {
        i += 1;
        break;
        if ((localObject instanceof Map))
        {
          if (!(paramList2.get(i) instanceof Map)) {
            paramList2.set(i, new HashMap());
          }
          a((Map)localObject, (Map)paramList2.get(i));
        }
        else if (localObject != ayk)
        {
          paramList2.set(i, localObject);
        }
      }
    }
  }
  
  private static Object f(Map<String, Object> paramMap)
  {
    String[] arrayOfString = ayl;
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      Object localObject = paramMap;
      if (i < j)
      {
        localObject = arrayOfString[i];
        if (!(paramMap instanceof Map)) {
          localObject = null;
        }
      }
      else
      {
        return localObject;
      }
      paramMap = ((Map)paramMap).get(localObject);
      i += 1;
    }
  }
  
  static Map<String, Object> j(String paramString, Object paramObject)
  {
    HashMap localHashMap1 = new HashMap();
    String[] arrayOfString = paramString.toString().split("\\.");
    int i = 0;
    HashMap localHashMap2;
    for (paramString = localHashMap1; i < arrayOfString.length - 1; paramString = localHashMap2)
    {
      localHashMap2 = new HashMap();
      paramString.put(arrayOfString[i], localHashMap2);
      i += 1;
    }
    paramString.put(arrayOfString[(arrayOfString.length - 1)], paramObject);
    return localHashMap1;
  }
  
  final void a(b paramb)
  {
    this.ayn.put(paramb, Integer.valueOf(0));
  }
  
  public final void d(Map<String, Object> paramMap)
  {
    try
    {
      this.ays.await();
      e(paramMap);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        m.mq();
      }
    }
  }
  
  public final void e(Map<String, Object> paramMap)
  {
    this.ayp.lock();
    for (;;)
    {
      int i;
      Object localObject1;
      try
      {
        this.ayq.offer(paramMap);
        if (this.ayp.getHoldCount() != 1) {
          break label203;
        }
        i = 0;
        localObject1 = (Map)this.ayq.poll();
        if (localObject1 == null) {
          break label203;
        }
        synchronized (this.ayo)
        {
          Iterator localIterator = ((Map)localObject1).keySet().iterator();
          if (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            a(j(str, ((Map)localObject1).get(str)), this.ayo);
          }
        }
      }
      finally
      {
        this.ayp.unlock();
      }
      ??? = this.ayn.keySet().iterator();
      while (((Iterator)???).hasNext()) {
        ((b)((Iterator)???).next()).g((Map)localObject1);
      }
      i += 1;
      if (i > 500)
      {
        this.ayq.clear();
        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
        label203:
        localObject1 = f(paramMap);
        if (localObject1 == null) {}
        for (localObject1 = null;; localObject1 = aw(localObject1.toString()))
        {
          if (localObject1 != null)
          {
            ??? = new ArrayList();
            a(paramMap, "", (Collection)???);
            ((List)???).remove("gtm.lifetime");
            this.ayr.a((List)???, ((Long)localObject1).longValue());
          }
          this.ayp.unlock();
          return;
        }
      }
    }
  }
  
  public final String toString()
  {
    synchronized (this.ayo)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = this.ayo.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] { localEntry.getKey(), localEntry.getValue() }));
      }
    }
    String str = ((StringBuilder)localObject).toString();
    return str;
  }
  
  static final class a
  {
    public final String aut;
    public final Object ayu;
    
    a(String paramString, Object paramObject)
    {
      this.aut = paramString;
      this.ayu = paramObject;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {}
      do
      {
        return false;
        paramObject = (a)paramObject;
      } while ((!this.aut.equals(((a)paramObject).aut)) || (!this.ayu.equals(((a)paramObject).ayu)));
      return true;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Integer[] { Integer.valueOf(this.aut.hashCode()), Integer.valueOf(this.ayu.hashCode()) });
    }
    
    public final String toString()
    {
      return "Key: " + this.aut + " value: " + this.ayu.toString();
    }
  }
  
  static abstract interface b
  {
    public abstract void g(Map<String, Object> paramMap);
  }
  
  static abstract interface c
  {
    public abstract void a(a parama);
    
    public abstract void a(List<c.a> paramList, long paramLong);
    
    public static abstract interface a
    {
      public abstract void m(List<c.a> paramList);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */