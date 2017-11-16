package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class v
  implements Parcelable.Creator<PutDataRequest>
{
  static void a(PutDataRequest paramPutDataRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramPutDataRequest.mVersionCode);
    b.a(paramParcel, 2, paramPutDataRequest.mUri, paramInt);
    b.a(paramParcel, 4, paramPutDataRequest.aAr);
    b.a(paramParcel, 5, paramPutDataRequest.aAe);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */