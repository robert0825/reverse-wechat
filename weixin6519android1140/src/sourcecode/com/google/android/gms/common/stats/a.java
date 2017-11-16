package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<ConnectionEvent>
{
  static void a(ConnectionEvent paramConnectionEvent, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramConnectionEvent.mVersionCode);
    b.a(paramParcel, 2, paramConnectionEvent.aml);
    b.a(paramParcel, 4, paramConnectionEvent.amn);
    b.a(paramParcel, 5, paramConnectionEvent.amo);
    b.a(paramParcel, 6, paramConnectionEvent.amp);
    b.a(paramParcel, 7, paramConnectionEvent.amq);
    b.a(paramParcel, 8, paramConnectionEvent.amr);
    b.a(paramParcel, 10, paramConnectionEvent.amt);
    b.a(paramParcel, 11, paramConnectionEvent.amu);
    b.c(paramParcel, 12, paramConnectionEvent.amm);
    b.a(paramParcel, 13, paramConnectionEvent.ams);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\stats\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */