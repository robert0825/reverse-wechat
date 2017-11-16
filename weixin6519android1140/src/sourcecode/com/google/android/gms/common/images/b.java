package com.google.android.gms.common.images;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<WebImage>
{
  static void a(WebImage paramWebImage, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramWebImage.mVersionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramWebImage.ajK, paramInt);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 3, paramWebImage.ajL);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 4, paramWebImage.ajM);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\common\images\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */