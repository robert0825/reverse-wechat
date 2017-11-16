package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class y
  implements Parcelable.Creator<ResolveAccountResponse>
{
  static void a(ResolveAccountResponse paramResolveAccountResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramResolveAccountResponse.mVersionCode);
    b.a(paramParcel, 2, paramResolveAccountResponse.ajR);
    b.a(paramParcel, 3, paramResolveAccountResponse.aiW, paramInt);
    b.a(paramParcel, 4, paramResolveAccountResponse.ahS);
    b.a(paramParcel, 5, paramResolveAccountResponse.akg);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */