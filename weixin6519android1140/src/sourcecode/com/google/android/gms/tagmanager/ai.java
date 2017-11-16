package com.google.android.gms.tagmanager;

import com.google.android.gms.c.b.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class ai
{
  private static final Object azE = null;
  private static Long azF = new Long(0L);
  private static Double azG = new Double(0.0D);
  private static ah azH = ah.mO();
  private static String azI = new String("");
  private static Boolean azJ = new Boolean(false);
  private static List<Object> azK = new ArrayList(0);
  private static Map<Object, Object> azL = new HashMap();
  private static b.a azM = ah(azI);
  
  private static String ag(Object paramObject)
  {
    if (paramObject == null) {
      return azI;
    }
    return paramObject.toString();
  }
  
  public static b.a ah(Object paramObject)
  {
    int j = 1;
    boolean bool = false;
    Object localObject1 = new b.a();
    if ((paramObject instanceof b.a)) {
      return (b.a)paramObject;
    }
    if ((paramObject instanceof String))
    {
      ((b.a)localObject1).type = 1;
      ((b.a)localObject1).asY = ((String)paramObject);
    }
    for (;;)
    {
      ((b.a)localObject1).ati = bool;
      return (b.a)localObject1;
      Object localObject2;
      Object localObject3;
      if ((paramObject instanceof List))
      {
        ((b.a)localObject1).type = 2;
        localObject2 = (List)paramObject;
        paramObject = new ArrayList(((List)localObject2).size());
        localObject2 = ((List)localObject2).iterator();
        bool = false;
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = ah(((Iterator)localObject2).next());
          if (localObject3 == azM) {
            return azM;
          }
          if ((bool) || (((b.a)localObject3).ati)) {}
          for (bool = true;; bool = false)
          {
            ((List)paramObject).add(localObject3);
            break;
          }
        }
        ((b.a)localObject1).asZ = ((b.a[])((List)paramObject).toArray(new b.a[0]));
      }
      else if ((paramObject instanceof Map))
      {
        ((b.a)localObject1).type = 3;
        localObject3 = ((Map)paramObject).entrySet();
        paramObject = new ArrayList(((Set)localObject3).size());
        localObject2 = new ArrayList(((Set)localObject3).size());
        localObject3 = ((Set)localObject3).iterator();
        bool = false;
        if (((Iterator)localObject3).hasNext())
        {
          Object localObject4 = (Map.Entry)((Iterator)localObject3).next();
          b.a locala = ah(((Map.Entry)localObject4).getKey());
          localObject4 = ah(((Map.Entry)localObject4).getValue());
          if ((locala == azM) || (localObject4 == azM)) {
            return azM;
          }
          if ((bool) || (locala.ati) || (((b.a)localObject4).ati)) {}
          for (bool = true;; bool = false)
          {
            ((List)paramObject).add(locala);
            ((List)localObject2).add(localObject4);
            break;
          }
        }
        ((b.a)localObject1).ata = ((b.a[])((List)paramObject).toArray(new b.a[0]));
        ((b.a)localObject1).atb = ((b.a[])((List)localObject2).toArray(new b.a[0]));
      }
      else
      {
        if ((!(paramObject instanceof Double)) && (!(paramObject instanceof Float)))
        {
          if (!(paramObject instanceof ah)) {
            break label474;
          }
          if (((ah)paramObject).azD) {
            break label469;
          }
          i = 1;
          label441:
          if (i == 0) {
            break label474;
          }
        }
        label469:
        label474:
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label479;
          }
          ((b.a)localObject1).type = 1;
          ((b.a)localObject1).asY = paramObject.toString();
          break;
          i = 0;
          break label441;
        }
        label479:
        i = j;
        if (!(paramObject instanceof Byte))
        {
          i = j;
          if (!(paramObject instanceof Short))
          {
            i = j;
            if (!(paramObject instanceof Integer))
            {
              i = j;
              if (!(paramObject instanceof Long))
              {
                if ((!(paramObject instanceof ah)) || (!((ah)paramObject).azD)) {
                  break label571;
                }
                i = j;
              }
            }
          }
        }
        label534:
        if (i != 0)
        {
          ((b.a)localObject1).type = 6;
          if ((paramObject instanceof Number)) {}
          for (long l = ((Number)paramObject).longValue();; l = 0L)
          {
            ((b.a)localObject1).ate = l;
            break;
            label571:
            i = 0;
            break label534;
            m.mo();
          }
        }
        if (!(paramObject instanceof Boolean)) {
          break;
        }
        ((b.a)localObject1).type = 8;
        ((b.a)localObject1).atf = ((Boolean)paramObject).booleanValue();
      }
    }
    localObject1 = new StringBuilder("Converting to Value from unknown object type: ");
    if (paramObject == null) {}
    for (paramObject = "null";; paramObject = paramObject.getClass().toString())
    {
      ((StringBuilder)localObject1).append((String)paramObject);
      m.mo();
      return azM;
    }
  }
  
  public static String b(b.a parama)
  {
    return ag(d(parama));
  }
  
  public static Boolean c(b.a parama)
  {
    parama = d(parama);
    if ((parama instanceof Boolean)) {
      return (Boolean)parama;
    }
    parama = ag(parama);
    if ("true".equalsIgnoreCase(parama)) {
      return Boolean.TRUE;
    }
    if ("false".equalsIgnoreCase(parama)) {
      return Boolean.FALSE;
    }
    return azJ;
  }
  
  public static Object d(b.a parama)
  {
    int k = 0;
    int j = 0;
    int i = 0;
    if (parama == null) {
      return azE;
    }
    Object localObject1;
    Object localObject2;
    switch (parama.type)
    {
    default: 
      new StringBuilder("Failed to convert a value of type: ").append(parama.type);
      m.mo();
      return azE;
    case 1: 
      return parama.asY;
    case 2: 
      localObject1 = new ArrayList(parama.asZ.length);
      parama = parama.asZ;
      j = parama.length;
      while (i < j)
      {
        localObject2 = d(parama[i]);
        if (localObject2 == azE) {
          return azE;
        }
        ((ArrayList)localObject1).add(localObject2);
        i += 1;
      }
      return localObject1;
    case 3: 
      if (parama.ata.length != parama.atb.length)
      {
        new StringBuilder("Converting an invalid value to object: ").append(parama.toString());
        m.mo();
        return azE;
      }
      localObject1 = new HashMap(parama.atb.length);
      i = k;
      while (i < parama.ata.length)
      {
        localObject2 = d(parama.ata[i]);
        Object localObject3 = d(parama.atb[i]);
        if ((localObject2 == azE) || (localObject3 == azE)) {
          return azE;
        }
        ((Map)localObject1).put(localObject2, localObject3);
        i += 1;
      }
      return localObject1;
    case 4: 
      m.mo();
      return azE;
    case 5: 
      m.mo();
      return azE;
    case 6: 
      return Long.valueOf(parama.ate);
    case 7: 
      localObject1 = new StringBuffer();
      parama = parama.atg;
      k = parama.length;
      i = j;
      while (i < k)
      {
        localObject2 = b(parama[i]);
        if (localObject2 == azI) {
          return azE;
        }
        ((StringBuffer)localObject1).append((String)localObject2);
        i += 1;
      }
      return ((StringBuffer)localObject1).toString();
    }
    return Boolean.valueOf(parama.atf);
  }
  
  public static b.a mP()
  {
    return azM;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */