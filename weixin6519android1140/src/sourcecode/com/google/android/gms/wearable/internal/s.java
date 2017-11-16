package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class s
  implements Parcelable.Creator<GetFdForAssetResponse>
{
  static void a(GetFdForAssetResponse paramGetFdForAssetResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramGetFdForAssetResponse.versionCode);
    b.c(paramParcel, 2, paramGetFdForAssetResponse.statusCode);
    b.a(paramParcel, 3, paramGetFdForAssetResponse.aBC, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */