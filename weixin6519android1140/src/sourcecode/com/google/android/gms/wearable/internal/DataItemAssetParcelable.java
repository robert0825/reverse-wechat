package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.wearable.g;

public class DataItemAssetParcelable
  implements SafeParcelable, g
{
  public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new b();
  final String abK;
  final String aut;
  final int mVersionCode;
  
  DataItemAssetParcelable(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.abK = paramString1;
    this.aut = paramString2;
  }
  
  public DataItemAssetParcelable(g paramg)
  {
    this.mVersionCode = 1;
    this.abK = ((String)w.aa(paramg.getId()));
    this.aut = ((String)w.aa(paramg.nc()));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String getId()
  {
    return this.abK;
  }
  
  public final String nc()
  {
    return this.aut;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataItemAssetParcelable[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.abK == null) {
      localStringBuilder.append(",noid");
    }
    for (;;)
    {
      localStringBuilder.append(", key=");
      localStringBuilder.append(this.aut);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      localStringBuilder.append(this.abK);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\DataItemAssetParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */