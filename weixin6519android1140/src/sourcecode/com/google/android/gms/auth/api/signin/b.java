package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class b
  implements Parcelable.Creator<FacebookSignInConfig>
{
  static void a(FacebookSignInConfig paramFacebookSignInConfig, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramFacebookSignInConfig.versionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramFacebookSignInConfig.Jt, paramInt);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, new ArrayList(paramFacebookSignInConfig.agr));
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\auth\api\signin\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */