package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<SignInConfiguration>
{
  static void a(SignInConfiguration paramSignInConfiguration, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramSignInConfiguration.versionCode);
    b.a(paramParcel, 2, paramSignInConfiguration.ags);
    b.a(paramParcel, 3, paramSignInConfiguration.agt);
    b.a(paramParcel, 4, paramSignInConfiguration.agu, paramInt);
    b.a(paramParcel, 5, paramSignInConfiguration.agv, paramInt);
    b.a(paramParcel, 6, paramSignInConfiguration.agw, paramInt);
    b.a(paramParcel, 7, paramSignInConfiguration.agx);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */