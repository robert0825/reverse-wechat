package com.google.android.gms.c;

import android.graphics.drawable.Drawable;
import java.util.Arrays;

public final class l
  extends o<a, Drawable>
{
  public static final class a
  {
    public final int auv;
    public final int auw;
    
    public a(int paramInt1, int paramInt2)
    {
      this.auv = paramInt1;
      this.auw = paramInt2;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof a)) {}
      do
      {
        return false;
        if (this == paramObject) {
          return true;
        }
        paramObject = (a)paramObject;
      } while ((((a)paramObject).auv != this.auv) || (((a)paramObject).auw != this.auw));
      return true;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { Integer.valueOf(this.auv), Integer.valueOf(this.auw) });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */