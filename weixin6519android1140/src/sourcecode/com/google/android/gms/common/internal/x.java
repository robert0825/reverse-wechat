package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class x
  implements Parcelable.Creator<ResolveAccountRequest>
{
  static void a(ResolveAccountRequest paramResolveAccountRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramResolveAccountRequest.mVersionCode);
    b.a(paramParcel, 2, paramResolveAccountRequest.afv, paramInt);
    b.c(paramParcel, 3, paramResolveAccountRequest.akf);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */