package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class d
  implements Parcelable.Creator<IdToken>
{
  static void a(IdToken paramIdToken, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.a(paramParcel, 1, paramIdToken.afF);
    b.c(paramParcel, 1000, paramIdToken.mVersionCode);
    b.a(paramParcel, 2, paramIdToken.afO);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\credentials\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */