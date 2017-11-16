package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class f
  implements Parcelable.Creator<AccountChangeEventsRequest>
{
  static void a(AccountChangeEventsRequest paramAccountChangeEventsRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAccountChangeEventsRequest.afp);
    b.c(paramParcel, 2, paramAccountChangeEventsRequest.aft);
    b.a(paramParcel, 3, paramAccountChangeEventsRequest.afr);
    b.a(paramParcel, 4, paramAccountChangeEventsRequest.afv, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */