package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class t
  implements Parcelable.Creator<Status>
{
  static void a(Status paramStatus, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramStatus.agz);
    b.c(paramParcel, 1000, paramStatus.mVersionCode);
    b.a(paramParcel, 2, paramStatus.ahr);
    b.a(paramParcel, 3, paramStatus.agA, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\api\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */