package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class g
  implements Parcelable.Creator<AccountChangeEventsResponse>
{
  static void a(AccountChangeEventsResponse paramAccountChangeEventsResponse, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAccountChangeEventsResponse.afp);
    b.b(paramParcel, 2, paramAccountChangeEventsResponse.afw);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */