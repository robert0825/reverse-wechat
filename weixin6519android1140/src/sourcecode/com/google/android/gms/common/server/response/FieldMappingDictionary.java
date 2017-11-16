package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FieldMappingDictionary
  implements SafeParcelable
{
  public static final c CREATOR = new c();
  final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> amb;
  private final ArrayList<Entry> amc;
  final String amd;
  final int mVersionCode;
  
  FieldMappingDictionary(int paramInt, ArrayList<Entry> paramArrayList, String paramString)
  {
    this.mVersionCode = paramInt;
    this.amc = null;
    this.amb = c(paramArrayList);
    this.amd = ((String)w.aa(paramString));
    kR();
  }
  
  private static HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> c(ArrayList<Entry> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    int j = paramArrayList.size();
    int i = 0;
    while (i < j)
    {
      Entry localEntry = (Entry)paramArrayList.get(i);
      localHashMap.put(localEntry.className, localEntry.kS());
      i += 1;
    }
    return localHashMap;
  }
  
  private void kR()
  {
    Iterator localIterator1 = this.amb.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (String)localIterator1.next();
      localObject = (Map)this.amb.get(localObject);
      Iterator localIterator2 = ((Map)localObject).keySet().iterator();
      while (localIterator2.hasNext()) {
        ((FastJsonResponse.Field)((Map)localObject).get((String)localIterator2.next())).alZ = this;
      }
    }
  }
  
  public final Map<String, FastJsonResponse.Field<?, ?>> ai(String paramString)
  {
    return (Map)this.amb.get(paramString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator1 = this.amb.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (String)localIterator1.next();
      localStringBuilder.append((String)localObject).append(":\n");
      localObject = (Map)this.amb.get(localObject);
      Iterator localIterator2 = ((Map)localObject).keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        localStringBuilder.append("  ").append(str).append(": ");
        localStringBuilder.append(((Map)localObject).get(str));
      }
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel);
  }
  
  public static class Entry
    implements SafeParcelable
  {
    public static final d CREATOR = new d();
    final ArrayList<FieldMappingDictionary.FieldMapPair> ame;
    final String className;
    final int versionCode;
    
    Entry(int paramInt, String paramString, ArrayList<FieldMappingDictionary.FieldMapPair> paramArrayList)
    {
      this.versionCode = paramInt;
      this.className = paramString;
      this.ame = paramArrayList;
    }
    
    Entry(String paramString, Map<String, FastJsonResponse.Field<?, ?>> paramMap)
    {
      this.versionCode = 1;
      this.className = paramString;
      this.ame = b(paramMap);
    }
    
    private static ArrayList<FieldMappingDictionary.FieldMapPair> b(Map<String, FastJsonResponse.Field<?, ?>> paramMap)
    {
      if (paramMap == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localArrayList.add(new FieldMappingDictionary.FieldMapPair(str, (FastJsonResponse.Field)paramMap.get(str)));
      }
      return localArrayList;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    final HashMap<String, FastJsonResponse.Field<?, ?>> kS()
    {
      HashMap localHashMap = new HashMap();
      int j = this.ame.size();
      int i = 0;
      while (i < j)
      {
        FieldMappingDictionary.FieldMapPair localFieldMapPair = (FieldMappingDictionary.FieldMapPair)this.ame.get(i);
        localHashMap.put(localFieldMapPair.amf, localFieldMapPair.amg);
        i += 1;
      }
      return localHashMap;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      d.a(this, paramParcel);
    }
  }
  
  public static class FieldMapPair
    implements SafeParcelable
  {
    public static final b CREATOR = new b();
    final String amf;
    final FastJsonResponse.Field<?, ?> amg;
    final int versionCode;
    
    FieldMapPair(int paramInt, String paramString, FastJsonResponse.Field<?, ?> paramField)
    {
      this.versionCode = paramInt;
      this.amf = paramString;
      this.amg = paramField;
    }
    
    FieldMapPair(String paramString, FastJsonResponse.Field<?, ?> paramField)
    {
      this.versionCode = 1;
      this.amf = paramString;
      this.amg = paramField;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      b.a(this, paramParcel, paramInt);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\server\response\FieldMappingDictionary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */