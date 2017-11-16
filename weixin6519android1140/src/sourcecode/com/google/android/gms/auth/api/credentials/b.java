package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<CredentialPickerConfig>
{
  static void a(CredentialPickerConfig paramCredentialPickerConfig, Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 1, paramCredentialPickerConfig.afI);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1000, paramCredentialPickerConfig.mVersionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramCredentialPickerConfig.afJ);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\credentials\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */