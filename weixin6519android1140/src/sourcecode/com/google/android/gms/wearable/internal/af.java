package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class af
  implements Parcelable.Creator<PackageStorageInfo>
{
  static void a(PackageStorageInfo paramPackageStorageInfo, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramPackageStorageInfo.versionCode);
    b.a(paramParcel, 2, paramPackageStorageInfo.packageName);
    b.a(paramParcel, 3, paramPackageStorageInfo.label);
    b.a(paramParcel, 4, paramPackageStorageInfo.aBH);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */