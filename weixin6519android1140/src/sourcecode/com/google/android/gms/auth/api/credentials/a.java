package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<Credential>
{
  static void a(Credential paramCredential, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.a(paramParcel, 1001, paramCredential.afA);
    b.a(paramParcel, 1, paramCredential.abK);
    b.c(paramParcel, 1000, paramCredential.mVersionCode);
    b.a(paramParcel, 2, paramCredential.mName);
    b.a(paramParcel, 3, paramCredential.afC, paramInt);
    b.a(paramParcel, 1002, paramCredential.afB);
    b.b(paramParcel, 4, paramCredential.afD);
    b.a(paramParcel, 5, paramCredential.afE);
    b.a(paramParcel, 6, paramCredential.afF);
    b.a(paramParcel, 7, paramCredential.afG);
    b.a(paramParcel, 8, paramCredential.afH);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\credentials\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */