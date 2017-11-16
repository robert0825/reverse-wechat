package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;

public abstract class f
{
  public final DataHolder aiY;
  public int aju;
  private int ajv;
  
  public f(DataHolder paramDataHolder, int paramInt)
  {
    this.aiY = ((DataHolder)w.aa(paramDataHolder));
    if ((paramInt >= 0) && (paramInt < this.aiY.ajj)) {}
    for (boolean bool = true;; bool = false)
    {
      w.ae(bool);
      this.aju = paramInt;
      this.ajv = this.aiY.bY(this.aju);
      return;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      bool1 = bool2;
      if (v.d(Integer.valueOf(((f)paramObject).aju), Integer.valueOf(this.aju)))
      {
        bool1 = bool2;
        if (v.d(Integer.valueOf(((f)paramObject).ajv), Integer.valueOf(this.ajv)))
        {
          bool1 = bool2;
          if (((f)paramObject).aiY == this.aiY) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final byte[] getByteArray(String paramString)
  {
    DataHolder localDataHolder = this.aiY;
    int i = this.aju;
    int j = this.ajv;
    localDataHolder.g(paramString, i);
    return localDataHolder.ajg[j].getBlob(i, localDataHolder.ajf.getInt(paramString));
  }
  
  public final int getInteger(String paramString)
  {
    DataHolder localDataHolder = this.aiY;
    int i = this.aju;
    int j = this.ajv;
    localDataHolder.g(paramString, i);
    return localDataHolder.ajg[j].getInt(i, localDataHolder.ajf.getInt(paramString));
  }
  
  public final String getString(String paramString)
  {
    return this.aiY.b(paramString, this.aju, this.ajv);
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.aju), Integer.valueOf(this.ajv), this.aiY });
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\data\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */