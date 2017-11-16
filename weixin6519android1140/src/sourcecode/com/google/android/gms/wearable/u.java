package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class u
  implements Parcelable.Creator<ConnectionConfiguration>
{
  static void a(ConnectionConfiguration paramConnectionConfiguration, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramConnectionConfiguration.mVersionCode);
    b.a(paramParcel, 2, paramConnectionConfiguration.mName);
    b.a(paramParcel, 3, paramConnectionConfiguration.aAh);
    b.c(paramParcel, 4, paramConnectionConfiguration.aja);
    b.c(paramParcel, 5, paramConnectionConfiguration.aAi);
    b.a(paramParcel, 6, paramConnectionConfiguration.aAj);
    b.a(paramParcel, 7, paramConnectionConfiguration.acm);
    b.a(paramParcel, 8, paramConnectionConfiguration.aAk);
    b.a(paramParcel, 9, paramConnectionConfiguration.aAl);
    b.a(paramParcel, 10, paramConnectionConfiguration.aAm);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */