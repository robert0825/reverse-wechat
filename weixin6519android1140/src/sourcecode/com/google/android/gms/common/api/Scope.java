package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;

public final class Scope
  implements SafeParcelable
{
  public static final Parcelable.Creator<Scope> CREATOR = new s();
  final String ahl;
  final int mVersionCode;
  
  Scope(int paramInt, String paramString)
  {
    w.h(paramString, "scopeUri must not be null or empty");
    this.mVersionCode = paramInt;
    this.ahl = paramString;
  }
  
  public Scope(String paramString)
  {
    this(1, paramString);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Scope)) {
      return false;
    }
    return this.ahl.equals(((Scope)paramObject).ahl);
  }
  
  public final int hashCode()
  {
    return this.ahl.hashCode();
  }
  
  public final String toString()
  {
    return this.ahl;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    s.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */