package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class e
  implements Parcelable.Creator<AccountChangeEvent>
{
  static void a(AccountChangeEvent paramAccountChangeEvent, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAccountChangeEvent.afp);
    b.a(paramParcel, 2, paramAccountChangeEvent.afq);
    b.a(paramParcel, 3, paramAccountChangeEvent.afr);
    b.c(paramParcel, 4, paramAccountChangeEvent.afs);
    b.c(paramParcel, 5, paramAccountChangeEvent.aft);
    b.a(paramParcel, 6, paramAccountChangeEvent.afu);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */