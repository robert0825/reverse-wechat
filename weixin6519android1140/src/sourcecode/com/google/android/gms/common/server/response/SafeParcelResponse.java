package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.c.r;
import com.google.android.gms.c.s;
import com.google.android.gms.c.x;
import com.google.android.gms.c.y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.w;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse
  extends FastJsonResponse
  implements SafeParcelable
{
  public static final e CREATOR = new e();
  final FieldMappingDictionary alZ;
  private final Parcel amh;
  final int ami;
  private int amj;
  private int amk;
  final int mVersionCode;
  private final String qj;
  
  SafeParcelResponse(int paramInt, Parcel paramParcel, FieldMappingDictionary paramFieldMappingDictionary)
  {
    this.mVersionCode = paramInt;
    this.amh = ((Parcel)w.aa(paramParcel));
    this.ami = 2;
    this.alZ = paramFieldMappingDictionary;
    if (this.alZ == null) {}
    for (this.qj = null;; this.qj = this.alZ.amd)
    {
      this.amj = 2;
      return;
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Unknown type = " + paramInt);
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      paramStringBuilder.append(paramObject);
      return;
    case 7: 
      paramStringBuilder.append("\"").append(x.ar(paramObject.toString())).append("\"");
      return;
    case 8: 
      paramStringBuilder.append("\"").append(s.e((byte[])paramObject)).append("\"");
      return;
    case 9: 
      paramStringBuilder.append("\"").append(s.f((byte[])paramObject));
      paramStringBuilder.append("\"");
      return;
    case 10: 
      y.a(paramStringBuilder, (HashMap)paramObject);
      return;
    }
    throw new IllegalArgumentException("Method does not accept concrete type.");
  }
  
  private void a(StringBuilder paramStringBuilder, FastJsonResponse.Field<?, ?> paramField, Parcel paramParcel, int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    String str = null;
    int j = 0;
    int i = 0;
    if (paramField.kL())
    {
      paramStringBuilder.append("[");
      int k;
      switch (paramField.kK())
      {
      default: 
        throw new IllegalStateException("Unknown field type out.");
      case 0: 
        paramInt = a.a(paramParcel, paramInt);
        j = paramParcel.dataPosition();
        if (paramInt == 0) {
          paramField = str;
        }
        for (;;)
        {
          j = paramField.length;
          paramInt = i;
          while (paramInt < j)
          {
            if (paramInt != 0) {
              paramStringBuilder.append(",");
            }
            paramStringBuilder.append(Integer.toString(paramField[paramInt]));
            paramInt += 1;
          }
          paramField = paramParcel.createIntArray();
          paramParcel.setDataPosition(paramInt + j);
        }
      case 1: 
        i = a.a(paramParcel, paramInt);
        k = paramParcel.dataPosition();
        if (i == 0)
        {
          paramField = (FastJsonResponse.Field<?, ?>)localObject1;
          r.a(paramStringBuilder, paramField);
        }
        break;
      }
      for (;;)
      {
        paramStringBuilder.append("]");
        return;
        int m = paramParcel.readInt();
        paramField = new BigInteger[m];
        paramInt = j;
        while (paramInt < m)
        {
          paramField[paramInt] = new BigInteger(paramParcel.createByteArray());
          paramInt += 1;
        }
        paramParcel.setDataPosition(i + k);
        break;
        paramInt = a.a(paramParcel, paramInt);
        i = paramParcel.dataPosition();
        if (paramInt == 0) {
          paramField = (FastJsonResponse.Field<?, ?>)localObject2;
        }
        for (;;)
        {
          r.a(paramStringBuilder, paramField);
          break;
          paramField = paramParcel.createLongArray();
          paramParcel.setDataPosition(paramInt + i);
        }
        paramInt = a.a(paramParcel, paramInt);
        i = paramParcel.dataPosition();
        if (paramInt == 0) {
          paramField = (FastJsonResponse.Field<?, ?>)localObject3;
        }
        for (;;)
        {
          r.a(paramStringBuilder, paramField);
          break;
          paramField = paramParcel.createFloatArray();
          paramParcel.setDataPosition(paramInt + i);
        }
        paramInt = a.a(paramParcel, paramInt);
        i = paramParcel.dataPosition();
        if (paramInt == 0) {
          paramField = (FastJsonResponse.Field<?, ?>)localObject4;
        }
        for (;;)
        {
          r.a(paramStringBuilder, paramField);
          break;
          paramField = paramParcel.createDoubleArray();
          paramParcel.setDataPosition(paramInt + i);
        }
        r.a(paramStringBuilder, a.o(paramParcel, paramInt));
        continue;
        paramInt = a.a(paramParcel, paramInt);
        i = paramParcel.dataPosition();
        if (paramInt == 0) {
          paramField = (FastJsonResponse.Field<?, ?>)localObject5;
        }
        for (;;)
        {
          r.a(paramStringBuilder, paramField);
          break;
          paramField = paramParcel.createBooleanArray();
          paramParcel.setDataPosition(paramInt + i);
        }
        r.a(paramStringBuilder, a.p(paramParcel, paramInt));
        continue;
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
        paramParcel = a.s(paramParcel, paramInt);
        i = paramParcel.length;
        paramInt = 0;
        while (paramInt < i)
        {
          if (paramInt > 0) {
            paramStringBuilder.append(",");
          }
          paramParcel[paramInt].setDataPosition(0);
          a(paramStringBuilder, paramField.kQ(), paramParcel[paramInt]);
          paramInt += 1;
        }
      }
    }
    switch (paramField.kK())
    {
    default: 
      throw new IllegalStateException("Unknown field type out");
    case 0: 
      paramStringBuilder.append(a.e(paramParcel, paramInt));
      return;
    case 1: 
      paramStringBuilder.append(a.g(paramParcel, paramInt));
      return;
    case 2: 
      paramStringBuilder.append(a.f(paramParcel, paramInt));
      return;
    case 3: 
      paramStringBuilder.append(a.h(paramParcel, paramInt));
      return;
    case 4: 
      paramStringBuilder.append(a.i(paramParcel, paramInt));
      return;
    case 5: 
      paramStringBuilder.append(a.j(paramParcel, paramInt));
      return;
    case 6: 
      paramStringBuilder.append(a.c(paramParcel, paramInt));
      return;
    case 7: 
      paramField = a.k(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(x.ar(paramField)).append("\"");
      return;
    case 8: 
      paramField = a.n(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(s.e(paramField)).append("\"");
      return;
    case 9: 
      paramField = a.n(paramParcel, paramInt);
      paramStringBuilder.append("\"").append(s.f(paramField));
      paramStringBuilder.append("\"");
      return;
    case 10: 
      paramField = a.m(paramParcel, paramInt);
      paramParcel = paramField.keySet();
      paramParcel.size();
      paramStringBuilder.append("{");
      paramParcel = paramParcel.iterator();
      for (paramInt = 1; paramParcel.hasNext(); paramInt = 0)
      {
        str = (String)paramParcel.next();
        if (paramInt == 0) {
          paramStringBuilder.append(",");
        }
        paramStringBuilder.append("\"").append(str).append("\"");
        paramStringBuilder.append(":");
        paramStringBuilder.append("\"").append(x.ar(paramField.getString(str))).append("\"");
      }
      paramStringBuilder.append("}");
      return;
    }
    paramParcel = a.r(paramParcel, paramInt);
    paramParcel.setDataPosition(0);
    a(paramStringBuilder, paramField.kQ(), paramParcel);
  }
  
  private void a(StringBuilder paramStringBuilder, Map<String, FastJsonResponse.Field<?, ?>> paramMap, Parcel paramParcel)
  {
    HashMap localHashMap = new HashMap();
    paramMap = paramMap.entrySet().iterator();
    Object localObject;
    while (paramMap.hasNext())
    {
      localObject = (Map.Entry)paramMap.next();
      localHashMap.put(Integer.valueOf(((FastJsonResponse.Field)((Map.Entry)localObject).getValue()).kN()), localObject);
    }
    paramStringBuilder.append('{');
    int j = a.b(paramParcel);
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      localObject = (Map.Entry)localHashMap.get(Integer.valueOf(0xFFFF & k));
      if (localObject != null)
      {
        if (i != 0) {
          paramStringBuilder.append(",");
        }
        paramMap = (String)((Map.Entry)localObject).getKey();
        localObject = (FastJsonResponse.Field)((Map.Entry)localObject).getValue();
        paramStringBuilder.append("\"").append(paramMap).append("\":");
        if (((FastJsonResponse.Field)localObject).ama != null) {
          i = 1;
        }
        while (i != 0) {
          switch (((FastJsonResponse.Field)localObject).kK())
          {
          default: 
            throw new IllegalArgumentException("Unknown field out type = " + ((FastJsonResponse.Field)localObject).kK());
            i = 0;
            break;
          case 0: 
            b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, Integer.valueOf(a.e(paramParcel, k))));
          }
        }
        for (;;)
        {
          i = 1;
          break;
          b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, a.g(paramParcel, k)));
          continue;
          b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, Long.valueOf(a.f(paramParcel, k))));
          continue;
          b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, Float.valueOf(a.h(paramParcel, k))));
          continue;
          b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, Double.valueOf(a.i(paramParcel, k))));
          continue;
          b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, a.j(paramParcel, k)));
          continue;
          b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, Boolean.valueOf(a.c(paramParcel, k))));
          continue;
          b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, a.k(paramParcel, k)));
          continue;
          b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, a.n(paramParcel, k)));
          continue;
          b(paramStringBuilder, (FastJsonResponse.Field)localObject, a((FastJsonResponse.Field)localObject, h(a.m(paramParcel, k))));
          continue;
          throw new IllegalArgumentException("Method does not accept concrete type.");
          a(paramStringBuilder, (FastJsonResponse.Field)localObject, paramParcel, k);
        }
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    paramStringBuilder.append('}');
  }
  
  private void b(StringBuilder paramStringBuilder, FastJsonResponse.Field<?, ?> paramField, Object paramObject)
  {
    if (paramField.kJ())
    {
      paramObject = (ArrayList)paramObject;
      paramStringBuilder.append("[");
      int j = ((ArrayList)paramObject).size();
      int i = 0;
      while (i < j)
      {
        if (i != 0) {
          paramStringBuilder.append(",");
        }
        a(paramStringBuilder, paramField.kI(), ((ArrayList)paramObject).get(i));
        i += 1;
      }
      paramStringBuilder.append("]");
      return;
    }
    a(paramStringBuilder, paramField.kI(), paramObject);
  }
  
  private static HashMap<String, String> h(Bundle paramBundle)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramBundle.getString(str));
    }
    return localHashMap;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final Map<String, FastJsonResponse.Field<?, ?>> kF()
  {
    if (this.alZ == null) {
      return null;
    }
    return this.alZ.ai(this.qj);
  }
  
  protected final Object kG()
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  protected final boolean kH()
  {
    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
  }
  
  public final Parcel kT()
  {
    switch (this.amj)
    {
    }
    for (;;)
    {
      return this.amh;
      this.amk = b.t(this.amh, 20293);
      b.u(this.amh, this.amk);
      this.amj = 2;
    }
  }
  
  public String toString()
  {
    w.j(this.alZ, "Cannot convert to JSON on client side.");
    Parcel localParcel = kT();
    localParcel.setDataPosition(0);
    StringBuilder localStringBuilder = new StringBuilder(100);
    a(localStringBuilder, this.alZ.ai(this.qj), localParcel);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\server\response\SafeParcelResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */