package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.c.s;
import com.google.android.gms.c.x;
import com.google.android.gms.c.y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class FastJsonResponse
{
  private Object a(Field paramField)
  {
    String str = paramField.kM();
    if (paramField.kO() != null)
    {
      paramField.kM();
      if (kG() == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.a(bool, "Concrete field shouldn't be value object: %s", new Object[] { paramField.kM() });
        paramField.kL();
        try
        {
          paramField = "get" + Character.toUpperCase(str.charAt(0)) + str.substring(1);
          paramField = getClass().getMethod(paramField, new Class[0]).invoke(this, new Object[0]);
          return paramField;
        }
        catch (Exception paramField)
        {
          throw new RuntimeException(paramField);
        }
      }
    }
    paramField.kM();
    return kG();
  }
  
  protected static <O, I> I a(Field<I, O> paramField, Object paramObject)
  {
    Object localObject = paramObject;
    if (paramField.ama != null) {
      localObject = paramField.ama.convertBack(paramObject);
    }
    return (I)localObject;
  }
  
  private static void a(StringBuilder paramStringBuilder, Field paramField, Object paramObject)
  {
    if (paramField.kI() == 11)
    {
      paramStringBuilder.append(((FastJsonResponse)paramField.kO().cast(paramObject)).toString());
      return;
    }
    if (paramField.kI() == 7)
    {
      paramStringBuilder.append("\"");
      paramStringBuilder.append(x.ar((String)paramObject));
      paramStringBuilder.append("\"");
      return;
    }
    paramStringBuilder.append(paramObject);
  }
  
  private static void a(StringBuilder paramStringBuilder, Field paramField, ArrayList<Object> paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0) {
        paramStringBuilder.append(",");
      }
      Object localObject = paramArrayList.get(i);
      if (localObject != null) {
        a(paramStringBuilder, paramField, localObject);
      }
      i += 1;
    }
    paramStringBuilder.append("]");
  }
  
  public abstract Map<String, Field<?, ?>> kF();
  
  protected abstract Object kG();
  
  protected abstract boolean kH();
  
  public String toString()
  {
    Map localMap = kF();
    StringBuilder localStringBuilder = new StringBuilder(100);
    Iterator localIterator = localMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Field localField = (Field)localMap.get(str);
      if (localField.kK() == 11)
      {
        if (localField.kL())
        {
          localField.kM();
          throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        localField.kM();
        throw new UnsupportedOperationException("Concrete types not supported");
      }
      localField.kM();
      if (kH())
      {
        Object localObject = a(localField, a(localField));
        if (localStringBuilder.length() == 0) {
          localStringBuilder.append("{");
        }
        for (;;)
        {
          localStringBuilder.append("\"").append(str).append("\":");
          if (localObject != null) {
            break label192;
          }
          localStringBuilder.append("null");
          break;
          localStringBuilder.append(",");
        }
        label192:
        switch (localField.kK())
        {
        default: 
          if (localField.kJ()) {
            a(localStringBuilder, localField, (ArrayList)localObject);
          }
          break;
        case 8: 
          localStringBuilder.append("\"").append(s.e((byte[])localObject)).append("\"");
          break;
        case 9: 
          localStringBuilder.append("\"").append(s.f((byte[])localObject)).append("\"");
          break;
        case 10: 
          y.a(localStringBuilder, (HashMap)localObject);
          continue;
          a(localStringBuilder, localField, localObject);
        }
      }
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.append("}");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("{}");
    }
  }
  
  public static class Field<I, O>
    implements SafeParcelable
  {
    public static final a CREATOR = new a();
    protected final int alR;
    protected final boolean alS;
    protected final int alT;
    protected final boolean alU;
    protected final String alV;
    protected final int alW;
    protected final Class<? extends FastJsonResponse> alX;
    protected final String alY;
    FieldMappingDictionary alZ;
    public FastJsonResponse.a<I, O> ama;
    final int mVersionCode;
    
    Field(int paramInt1, int paramInt2, boolean paramBoolean1, int paramInt3, boolean paramBoolean2, String paramString1, int paramInt4, String paramString2, ConverterWrapper paramConverterWrapper)
    {
      this.mVersionCode = paramInt1;
      this.alR = paramInt2;
      this.alS = paramBoolean1;
      this.alT = paramInt3;
      this.alU = paramBoolean2;
      this.alV = paramString1;
      this.alW = paramInt4;
      if (paramString2 == null)
      {
        this.alX = null;
        this.alY = null;
        if (paramConverterWrapper != null) {
          break label92;
        }
      }
      for (paramString1 = (String)localObject;; paramString1 = paramConverterWrapper.alL)
      {
        this.ama = paramString1;
        return;
        this.alX = SafeParcelResponse.class;
        this.alY = paramString2;
        break;
        label92:
        if (paramConverterWrapper.alL == null) {
          break label110;
        }
      }
      label110:
      throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public final int kI()
    {
      return this.alR;
    }
    
    public final boolean kJ()
    {
      return this.alS;
    }
    
    public final int kK()
    {
      return this.alT;
    }
    
    public final boolean kL()
    {
      return this.alU;
    }
    
    public final String kM()
    {
      return this.alV;
    }
    
    public final int kN()
    {
      return this.alW;
    }
    
    public final Class<? extends FastJsonResponse> kO()
    {
      return this.alX;
    }
    
    final String kP()
    {
      if (this.alY == null) {
        return null;
      }
      return this.alY;
    }
    
    public final Map<String, Field<?, ?>> kQ()
    {
      w.aa(this.alY);
      w.aa(this.alZ);
      return this.alZ.ai(this.alY);
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("Field\n");
      localStringBuilder1.append("            versionCode=").append(this.mVersionCode).append('\n');
      localStringBuilder1.append("                 typeIn=").append(this.alR).append('\n');
      localStringBuilder1.append("            typeInArray=").append(this.alS).append('\n');
      localStringBuilder1.append("                typeOut=").append(this.alT).append('\n');
      localStringBuilder1.append("           typeOutArray=").append(this.alU).append('\n');
      localStringBuilder1.append("        outputFieldName=").append(this.alV).append('\n');
      localStringBuilder1.append("      safeParcelFieldId=").append(this.alW).append('\n');
      localStringBuilder1.append("       concreteTypeName=").append(kP()).append('\n');
      if (this.alX != null) {
        localStringBuilder1.append("     concreteType.class=").append(this.alX.getCanonicalName()).append('\n');
      }
      StringBuilder localStringBuilder2 = localStringBuilder1.append("          converterName=");
      if (this.ama == null) {}
      for (String str = "null";; str = this.ama.getClass().getCanonicalName())
      {
        localStringBuilder2.append(str).append('\n');
        return localStringBuilder1.toString();
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      a.a(this, paramParcel, paramInt);
    }
  }
  
  public static abstract interface a<I, O>
  {
    public abstract I convertBack(O paramO);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\server\response\FastJsonResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */