package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class g
  implements Parcelable.Creator<WakeLockEvent>
{
  static void a(WakeLockEvent paramWakeLockEvent, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramWakeLockEvent.mVersionCode);
    b.a(paramParcel, 2, paramWakeLockEvent.aml);
    b.a(paramParcel, 4, paramWakeLockEvent.amw);
    b.c(paramParcel, 5, paramWakeLockEvent.amx);
    b.a(paramParcel, 6, paramWakeLockEvent.amy);
    b.a(paramParcel, 8, paramWakeLockEvent.amt);
    b.a(paramParcel, 10, paramWakeLockEvent.amB);
    b.c(paramParcel, 11, paramWakeLockEvent.amm);
    b.a(paramParcel, 12, paramWakeLockEvent.amz);
    b.a(paramParcel, 13, paramWakeLockEvent.amC);
    b.c(paramParcel, 14, paramWakeLockEvent.amA);
    float f = paramWakeLockEvent.amD;
    b.b(paramParcel, 15, 4);
    paramParcel.writeFloat(f);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\stats\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */