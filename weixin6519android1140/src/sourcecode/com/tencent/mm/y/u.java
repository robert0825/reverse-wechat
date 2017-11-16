package com.tencent.mm.y;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class u
{
  private static volatile u gmF;
  private Map<String, c> gmG;
  
  private u()
  {
    GMTrace.i(639950127104L, 4768);
    this.gmG = new a((byte)0);
    GMTrace.o(639950127104L, 4768);
  }
  
  public static u Av()
  {
    GMTrace.i(639815909376L, 4767);
    if (gmF == null) {}
    try
    {
      if (gmF == null) {
        gmF = new u();
      }
      u localu = gmF;
      GMTrace.o(639815909376L, 4767);
      return localu;
    }
    finally {}
  }
  
  public static String gy(String paramString)
  {
    GMTrace.i(640486998016L, 4772);
    paramString = "SessionId@" + paramString + "#" + System.nanoTime();
    GMTrace.o(640486998016L, 4772);
    return paramString;
  }
  
  public final b gw(String paramString)
  {
    GMTrace.i(640084344832L, 4769);
    paramString = (c)this.gmG.get(paramString);
    if (paramString != null)
    {
      paramString = paramString.gmI;
      GMTrace.o(640084344832L, 4769);
      return paramString;
    }
    GMTrace.o(640084344832L, 4769);
    return null;
  }
  
  public final b gx(String paramString)
  {
    GMTrace.i(640352780288L, 4771);
    paramString = (c)this.gmG.remove(paramString);
    if (paramString != null)
    {
      paramString = paramString.gmI;
      GMTrace.o(640352780288L, 4771);
      return paramString;
    }
    GMTrace.o(640352780288L, 4771);
    return null;
  }
  
  public final b p(String paramString, boolean paramBoolean)
  {
    GMTrace.i(640218562560L, 4770);
    c localc2 = (c)this.gmG.get(paramString);
    c localc1 = localc2;
    if (localc2 == null)
    {
      if (!paramBoolean)
      {
        GMTrace.o(640218562560L, 4770);
        return null;
      }
      localc1 = new c();
      this.gmG.put(paramString, localc1);
    }
    paramString = localc1.gmI;
    GMTrace.o(640218562560L, 4770);
    return paramString;
  }
  
  public String toString()
  {
    GMTrace.i(18978789392384L, 141403);
    long l = System.currentTimeMillis();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("DataCenter \nDataStore size : ").append(this.gmG.size());
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(this.gmG.entrySet());
    Iterator localIterator = localLinkedHashSet.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (localEntry != null)
      {
        c localc = (c)localEntry.getValue();
        if (localc != null)
        {
          ((StringBuilder)localObject).append("\nDataStore id : ").append((String)localEntry.getKey());
          ((StringBuilder)localObject).append(", CT : ").append(localc.gmJ).append("ms");
          ((StringBuilder)localObject).append(", TTL : ").append((l - localc.gmJ) / 1000L).append("s");
        }
      }
    }
    localLinkedHashSet.clear();
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(18978789392384L, 141403);
    return (String)localObject;
  }
  
  private static final class a<K, V>
    extends ConcurrentHashMap<K, V>
  {
    private a()
    {
      GMTrace.i(680752316416L, 5072);
      GMTrace.o(680752316416L, 5072);
    }
    
    public final boolean containsValue(Object paramObject)
    {
      GMTrace.i(681289187328L, 5076);
      if (paramObject == null)
      {
        GMTrace.o(681289187328L, 5076);
        return false;
      }
      boolean bool = super.containsValue(paramObject);
      GMTrace.o(681289187328L, 5076);
      return bool;
    }
    
    public final V get(Object paramObject)
    {
      GMTrace.i(680886534144L, 5073);
      if (paramObject == null)
      {
        GMTrace.o(680886534144L, 5073);
        return null;
      }
      paramObject = super.get(paramObject);
      GMTrace.o(680886534144L, 5073);
      return (V)paramObject;
    }
    
    public final V put(K paramK, V paramV)
    {
      GMTrace.i(681020751872L, 5074);
      if (paramK == null)
      {
        GMTrace.o(681020751872L, 5074);
        return null;
      }
      if (paramV == null)
      {
        paramK = super.remove(paramK);
        GMTrace.o(681020751872L, 5074);
        return paramK;
      }
      paramK = super.put(paramK, paramV);
      GMTrace.o(681020751872L, 5074);
      return paramK;
    }
    
    public final V remove(Object paramObject)
    {
      GMTrace.i(681154969600L, 5075);
      if (paramObject == null)
      {
        GMTrace.o(681154969600L, 5075);
        return null;
      }
      paramObject = super.remove(paramObject);
      GMTrace.o(681154969600L, 5075);
      return (V)paramObject;
    }
  }
  
  public static final class b
  {
    public Map<String, Object> gmH;
    
    public b()
    {
      GMTrace.i(619146379264L, 4613);
      this.gmH = new u.a((byte)0);
      GMTrace.o(619146379264L, 4613);
    }
    
    public final Set<String> Aw()
    {
      GMTrace.i(15681596686336L, 116837);
      Set localSet = this.gmH.keySet();
      GMTrace.o(15681596686336L, 116837);
      return localSet;
    }
    
    public final b I(String paramString1, String paramString2)
    {
      GMTrace.i(619683250176L, 4617);
      if (!TextUtils.isEmpty(paramString1)) {
        this.gmH.put(paramString1, paramString2);
      }
      GMTrace.o(619683250176L, 4617);
      return this;
    }
    
    public final boolean containsKey(String paramString)
    {
      GMTrace.i(619280596992L, 4614);
      boolean bool = this.gmH.containsKey(paramString);
      GMTrace.o(619280596992L, 4614);
      return bool;
    }
    
    public final Object get(String paramString)
    {
      GMTrace.i(619951685632L, 4619);
      paramString = this.gmH.get(paramString);
      GMTrace.o(619951685632L, 4619);
      return paramString;
    }
    
    public final <T> T get(String paramString, T paramT)
    {
      GMTrace.i(20285935845376L, 151142);
      paramString = get(paramString);
      if (paramString != null)
      {
        GMTrace.o(20285935845376L, 151142);
        return paramString;
      }
      GMTrace.o(20285935845376L, 151142);
      return paramT;
    }
    
    public final boolean getBoolean(String paramString, boolean paramBoolean)
    {
      GMTrace.i(620220121088L, 4621);
      boolean bool = paramBoolean;
      if (!TextUtils.isEmpty(paramString))
      {
        paramString = this.gmH.get(paramString);
        bool = paramBoolean;
        if ((paramString instanceof Boolean)) {
          bool = ((Boolean)paramString).booleanValue();
        }
      }
      GMTrace.o(620220121088L, 4621);
      return bool;
    }
    
    public final int getInt(String paramString, int paramInt)
    {
      GMTrace.i(14301167353856L, 106552);
      int i = paramInt;
      if (!TextUtils.isEmpty(paramString))
      {
        paramString = this.gmH.get(paramString);
        i = paramInt;
        if ((paramString instanceof Integer)) {
          i = ((Integer)paramString).intValue();
        }
      }
      GMTrace.o(14301167353856L, 106552);
      return i;
    }
    
    public final String getString(String paramString1, String paramString2)
    {
      GMTrace.i(620354338816L, 4622);
      String str = paramString2;
      if (!TextUtils.isEmpty(paramString1))
      {
        paramString1 = this.gmH.get(paramString1);
        str = paramString2;
        if ((paramString1 instanceof String)) {
          str = (String)paramString1;
        }
      }
      GMTrace.o(620354338816L, 4622);
      return str;
    }
    
    public final boolean gz(String paramString)
    {
      GMTrace.i(619817467904L, 4618);
      if (!TextUtils.isEmpty(paramString))
      {
        paramString = this.gmH.get(paramString);
        if (!(paramString instanceof Boolean)) {}
      }
      for (boolean bool = ((Boolean)paramString).booleanValue();; bool = false)
      {
        GMTrace.o(619817467904L, 4618);
        return bool;
      }
    }
    
    public final b o(String paramString, Object paramObject)
    {
      GMTrace.i(619414814720L, 4615);
      if (!TextUtils.isEmpty(paramString)) {
        this.gmH.put(paramString, paramObject);
      }
      GMTrace.o(619414814720L, 4615);
      return this;
    }
    
    public final b q(String paramString, boolean paramBoolean)
    {
      GMTrace.i(619549032448L, 4616);
      if (!TextUtils.isEmpty(paramString)) {
        this.gmH.put(paramString, Boolean.valueOf(paramBoolean));
      }
      GMTrace.o(619549032448L, 4616);
      return this;
    }
    
    public final void recycle()
    {
      GMTrace.i(620622774272L, 4624);
      this.gmH.clear();
      GMTrace.o(620622774272L, 4624);
    }
  }
  
  private static final class c
  {
    u.b gmI;
    long gmJ;
    
    c()
    {
      GMTrace.i(664780406784L, 4953);
      this.gmI = new u.b();
      this.gmJ = System.currentTimeMillis();
      GMTrace.o(664780406784L, 4953);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */