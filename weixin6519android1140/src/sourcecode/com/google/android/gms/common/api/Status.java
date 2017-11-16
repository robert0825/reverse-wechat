package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.v.a;
import java.util.Arrays;

public final class Status
  implements g, SafeParcelable
{
  public static final Parcelable.Creator<Status> CREATOR = new t();
  public static final Status ahm = new Status(0);
  public static final Status ahn = new Status(14);
  public static final Status aho = new Status(8);
  public static final Status ahp = new Status(15);
  public static final Status ahq = new Status(16);
  final PendingIntent agA;
  public final int agz;
  public final String ahr;
  final int mVersionCode;
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.mVersionCode = paramInt1;
    this.agz = paramInt2;
    this.ahr = paramString;
    this.agA = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(String paramString)
  {
    this(1, 8, paramString, null);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {}
    do
    {
      return false;
      paramObject = (Status)paramObject;
    } while ((this.mVersionCode != ((Status)paramObject).mVersionCode) || (this.agz != ((Status)paramObject).agz) || (!v.d(this.ahr, ((Status)paramObject).ahr)) || (!v.d(this.agA, ((Status)paramObject).agA)));
    return true;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.mVersionCode), Integer.valueOf(this.agz), this.ahr, this.agA });
  }
  
  public final boolean isSuccess()
  {
    return this.agz <= 0;
  }
  
  public final Status jT()
  {
    return this;
  }
  
  public final String toString()
  {
    v.a locala = v.Z(this);
    if (this.ahr != null) {}
    for (String str = this.ahr;; str = b.bT(this.agz)) {
      return locala.g("statusCode", str).g("resolution", this.agA).toString();
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */