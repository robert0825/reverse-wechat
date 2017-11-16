package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class s
  implements Parcelable.Creator<Asset>
{
  static void a(Asset paramAsset, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAsset.mVersionCode);
    b.a(paramParcel, 2, paramAsset.aAe);
    b.a(paramParcel, 3, paramAsset.aAf);
    b.a(paramParcel, 4, paramAsset.aAg, paramInt);
    b.a(paramParcel, 5, paramAsset.uri, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */