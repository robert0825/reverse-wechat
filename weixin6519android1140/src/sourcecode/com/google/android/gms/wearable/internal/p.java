package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class p
  implements Parcelable.Creator<GetConfigsResponse>
{
  static void a(GetConfigsResponse paramGetConfigsResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramGetConfigsResponse.versionCode);
    b.c(paramParcel, 2, paramGetConfigsResponse.statusCode);
    b.a(paramParcel, 3, paramGetConfigsResponse.aBz, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */