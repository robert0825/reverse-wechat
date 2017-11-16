package com.google.android.gms.c;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class au
{
  private static int a(String paramString, av.a.a[] paramArrayOfa)
  {
    int m = paramArrayOfa.length;
    int i = 0;
    int j = 14;
    if (i < m)
    {
      av.a.a locala = paramArrayOfa[i];
      int k;
      if (j == 14) {
        if ((locala.type == 9) || (locala.type == 2) || (locala.type == 6)) {
          k = locala.type;
        }
      }
      do
      {
        do
        {
          i += 1;
          j = k;
          break;
          k = j;
        } while (locala.type == 14);
        throw new IllegalArgumentException("Unexpected TypedValue type: " + locala.type + " for key " + paramString);
        k = j;
      } while (locala.type == j);
      throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + paramString + " contains items of type " + j + " and " + locala.type);
    }
    return j;
  }
  
  private static av.a.a a(List<Asset> paramList, Object paramObject)
  {
    av.a.a locala1 = new av.a.a();
    if (paramObject == null)
    {
      locala1.type = 14;
      return locala1;
    }
    locala1.awy = new av.a.a.a();
    if ((paramObject instanceof String))
    {
      locala1.type = 2;
      locala1.awy.awA = ((String)paramObject);
    }
    Object localObject1;
    Object localObject2;
    int i;
    Object localObject3;
    for (;;)
    {
      return locala1;
      if ((paramObject instanceof Integer))
      {
        locala1.type = 6;
        locala1.awy.awE = ((Integer)paramObject).intValue();
      }
      else if ((paramObject instanceof Long))
      {
        locala1.type = 5;
        locala1.awy.awD = ((Long)paramObject).longValue();
      }
      else if ((paramObject instanceof Double))
      {
        locala1.type = 3;
        locala1.awy.awB = ((Double)paramObject).doubleValue();
      }
      else if ((paramObject instanceof Float))
      {
        locala1.type = 4;
        locala1.awy.awC = ((Float)paramObject).floatValue();
      }
      else if ((paramObject instanceof Boolean))
      {
        locala1.type = 8;
        locala1.awy.awG = ((Boolean)paramObject).booleanValue();
      }
      else if ((paramObject instanceof Byte))
      {
        locala1.type = 7;
        locala1.awy.awF = ((Byte)paramObject).byteValue();
      }
      else if ((paramObject instanceof byte[]))
      {
        locala1.type = 1;
        locala1.awy.awz = ((byte[])paramObject);
      }
      else if ((paramObject instanceof String[]))
      {
        locala1.type = 11;
        locala1.awy.awJ = ((String[])paramObject);
      }
      else if ((paramObject instanceof long[]))
      {
        locala1.type = 12;
        locala1.awy.awK = ((long[])paramObject);
      }
      else if ((paramObject instanceof float[]))
      {
        locala1.type = 15;
        locala1.awy.awL = ((float[])paramObject);
      }
      else if ((paramObject instanceof Asset))
      {
        locala1.type = 13;
        localObject1 = locala1.awy;
        paramList.add((Asset)paramObject);
        ((av.a.a.a)localObject1).awM = (paramList.size() - 1);
      }
      else
      {
        if (!(paramObject instanceof i)) {
          break;
        }
        locala1.type = 9;
        paramObject = (i)paramObject;
        localObject2 = new TreeSet(((i)paramObject).aAn.keySet());
        localObject1 = new av.a[((TreeSet)localObject2).size()];
        localObject2 = ((TreeSet)localObject2).iterator();
        i = 0;
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          localObject1[i] = new av.a();
          localObject1[i].name = ((String)localObject3);
          localObject1[i].aww = a(paramList, ((i)paramObject).get((String)localObject3));
          i += 1;
        }
        locala1.awy.awH = ((av.a[])localObject1);
      }
    }
    int j;
    label605:
    av.a.a locala2;
    if ((paramObject instanceof ArrayList))
    {
      locala1.type = 10;
      localObject2 = (ArrayList)paramObject;
      localObject3 = new av.a.a[((ArrayList)localObject2).size()];
      paramObject = null;
      int k = ((ArrayList)localObject2).size();
      j = 0;
      i = 14;
      if (j < k)
      {
        localObject1 = ((ArrayList)localObject2).get(j);
        locala2 = a(paramList, localObject1);
        if ((locala2.type != 14) && (locala2.type != 2) && (locala2.type != 6) && (locala2.type != 9)) {
          throw new IllegalArgumentException("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a " + localObject1.getClass());
        }
        if ((i == 14) && (locala2.type != 14))
        {
          i = locala2.type;
          paramObject = localObject1;
        }
      }
    }
    for (;;)
    {
      localObject3[j] = locala2;
      j += 1;
      break label605;
      if (locala2.type != i)
      {
        throw new IllegalArgumentException("ArrayList elements must all be of the sameclass, but this one contains a " + paramObject.getClass() + " and a " + localObject1.getClass());
        locala1.awy.awI = ((av.a.a[])localObject3);
        break;
        throw new RuntimeException("newFieldValueFromValue: unexpected value " + paramObject.getClass().getSimpleName());
      }
    }
  }
  
  public static i a(a parama)
  {
    i locali = new i();
    av.a[] arrayOfa = parama.aws.awu;
    int j = arrayOfa.length;
    int i = 0;
    while (i < j)
    {
      av.a locala = arrayOfa[i];
      a(parama.awt, locali, locala.name, locala.aww);
      i += 1;
    }
    return locali;
  }
  
  private static ArrayList a(List<Asset> paramList, av.a.a.a parama, int paramInt)
  {
    ArrayList localArrayList = new ArrayList(parama.awI.length);
    parama = parama.awI;
    int k = parama.length;
    int i = 0;
    if (i < k)
    {
      av.a[] arrayOfa = parama[i];
      if (arrayOfa.type == 14) {
        localArrayList.add(null);
      }
      for (;;)
      {
        i += 1;
        break;
        if (paramInt == 9)
        {
          i locali = new i();
          arrayOfa = arrayOfa.awy.awH;
          int m = arrayOfa.length;
          int j = 0;
          while (j < m)
          {
            av.a locala = arrayOfa[j];
            a(paramList, locali, locala.name, locala.aww);
            j += 1;
          }
          localArrayList.add(locali);
        }
        else if (paramInt == 2)
        {
          localArrayList.add(arrayOfa.awy.awA);
        }
        else
        {
          if (paramInt != 6) {
            break label191;
          }
          localArrayList.add(Integer.valueOf(arrayOfa.awy.awE));
        }
      }
      label191:
      throw new IllegalArgumentException("Unexpected typeOfArrayList: " + paramInt);
    }
    return localArrayList;
  }
  
  private static void a(List<Asset> paramList, i parami, String paramString, av.a.a parama)
  {
    int i = parama.type;
    if (i == 14)
    {
      parami.putString(paramString, null);
      return;
    }
    Object localObject1 = parama.awy;
    if (i == 1)
    {
      paramList = ((av.a.a.a)localObject1).awz;
      parami.aAn.put(paramString, paramList);
      return;
    }
    if (i == 11)
    {
      paramList = ((av.a.a.a)localObject1).awJ;
      parami.aAn.put(paramString, paramList);
      return;
    }
    if (i == 12)
    {
      paramList = ((av.a.a.a)localObject1).awK;
      parami.aAn.put(paramString, paramList);
      return;
    }
    if (i == 15)
    {
      paramList = ((av.a.a.a)localObject1).awL;
      parami.aAn.put(paramString, paramList);
      return;
    }
    if (i == 2)
    {
      parami.putString(paramString, ((av.a.a.a)localObject1).awA);
      return;
    }
    if (i == 3)
    {
      double d = ((av.a.a.a)localObject1).awB;
      parami.aAn.put(paramString, Double.valueOf(d));
      return;
    }
    if (i == 4)
    {
      float f = ((av.a.a.a)localObject1).awC;
      parami.aAn.put(paramString, Float.valueOf(f));
      return;
    }
    if (i == 5)
    {
      parami.putLong(paramString, ((av.a.a.a)localObject1).awD);
      return;
    }
    if (i == 6)
    {
      i = ((av.a.a.a)localObject1).awE;
      parami.aAn.put(paramString, Integer.valueOf(i));
      return;
    }
    if (i == 7)
    {
      byte b = (byte)((av.a.a.a)localObject1).awF;
      parami.aAn.put(paramString, Byte.valueOf(b));
      return;
    }
    if (i == 8)
    {
      boolean bool = ((av.a.a.a)localObject1).awG;
      parami.aAn.put(paramString, Boolean.valueOf(bool));
      return;
    }
    if (i == 13)
    {
      if (paramList == null) {
        throw new RuntimeException("populateBundle: unexpected type for: " + paramString);
      }
      parami.a(paramString, (Asset)paramList.get((int)((av.a.a.a)localObject1).awM));
      return;
    }
    if (i == 9)
    {
      parama = new i();
      localObject1 = ((av.a.a.a)localObject1).awH;
      int j = localObject1.length;
      i = 0;
      while (i < j)
      {
        Object localObject2 = localObject1[i];
        a(paramList, parama, ((av.a)localObject2).name, ((av.a)localObject2).aww);
        i += 1;
      }
      parami.aAn.put(paramString, parama);
      return;
    }
    if (i == 10)
    {
      i = a(paramString, ((av.a.a.a)localObject1).awI);
      paramList = a(paramList, (av.a.a.a)localObject1, i);
      if (i == 14)
      {
        parami.putStringArrayList(paramString, paramList);
        return;
      }
      if (i == 9)
      {
        parami.aAn.put(paramString, paramList);
        return;
      }
      if (i == 2)
      {
        parami.putStringArrayList(paramString, paramList);
        return;
      }
      if (i == 6)
      {
        parami.aAn.put(paramString, paramList);
        return;
      }
      throw new IllegalStateException("Unexpected typeOfArrayList: " + i);
    }
    throw new RuntimeException("populateBundle: unexpected type " + i);
  }
  
  public static av.a[] a(i parami, List<Asset> paramList)
  {
    Object localObject1 = new TreeSet(parami.aAn.keySet());
    av.a[] arrayOfa = new av.a[((TreeSet)localObject1).size()];
    localObject1 = ((TreeSet)localObject1).iterator();
    int i = 0;
    while (((Iterator)localObject1).hasNext())
    {
      String str = (String)((Iterator)localObject1).next();
      Object localObject2 = parami.get(str);
      arrayOfa[i] = new av.a();
      arrayOfa[i].name = str;
      arrayOfa[i].aww = a(paramList, localObject2);
      i += 1;
    }
    return arrayOfa;
  }
  
  public static final class a
  {
    public final av aws;
    public final List<Asset> awt;
    
    public a(av paramav, List<Asset> paramList)
    {
      this.aws = paramav;
      this.awt = paramList;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */