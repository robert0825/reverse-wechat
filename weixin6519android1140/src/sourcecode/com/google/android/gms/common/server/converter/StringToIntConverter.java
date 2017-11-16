package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class StringToIntConverter
  implements SafeParcelable, FastJsonResponse.a<String, Integer>
{
  public static final b CREATOR = new b();
  final HashMap<String, Integer> alM;
  private final HashMap<Integer, String> alN;
  private final ArrayList<Entry> alO;
  final int mVersionCode;
  
  public StringToIntConverter()
  {
    this.mVersionCode = 1;
    this.alM = new HashMap();
    this.alN = new HashMap();
    this.alO = null;
  }
  
  StringToIntConverter(int paramInt, ArrayList<Entry> paramArrayList)
  {
    this.mVersionCode = paramInt;
    this.alM = new HashMap();
    this.alN = new HashMap();
    this.alO = null;
    b(paramArrayList);
  }
  
  private void b(ArrayList<Entry> paramArrayList)
  {
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Entry localEntry = (Entry)paramArrayList.next();
      String str = localEntry.alP;
      int i = localEntry.alQ;
      this.alM.put(str, Integer.valueOf(i));
      this.alN.put(Integer.valueOf(i), str);
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
  
  public static final class Entry
    implements SafeParcelable
  {
    public static final c CREATOR = new c();
    final String alP;
    final int alQ;
    final int versionCode;
    
    Entry(int paramInt1, String paramString, int paramInt2)
    {
      this.versionCode = paramInt1;
      this.alP = paramString;
      this.alQ = paramInt2;
    }
    
    Entry(String paramString, int paramInt)
    {
      this.versionCode = 1;
      this.alP = paramString;
      this.alQ = paramInt;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      c.a(this, paramParcel);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\server\converter\StringToIntConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */