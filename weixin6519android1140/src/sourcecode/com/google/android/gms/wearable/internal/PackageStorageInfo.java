package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PackageStorageInfo
  implements SafeParcelable
{
  public static final Parcelable.Creator<PackageStorageInfo> CREATOR = new af();
  public final long aBH;
  public final String label;
  public final String packageName;
  public final int versionCode;
  
  PackageStorageInfo(int paramInt, String paramString1, String paramString2, long paramLong)
  {
    this.versionCode = paramInt;
    this.packageName = paramString1;
    this.label = paramString2;
    this.aBH = paramLong;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    af.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\PackageStorageInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */