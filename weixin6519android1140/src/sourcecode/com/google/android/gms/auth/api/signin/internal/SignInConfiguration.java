package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.EmailSignInConfig;
import com.google.android.gms.auth.api.signin.FacebookSignInConfig;
import com.google.android.gms.auth.api.signin.GoogleSignInConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;

public final class SignInConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator<SignInConfiguration> CREATOR = new a();
  final String ags;
  String agt;
  EmailSignInConfig agu;
  GoogleSignInConfig agv;
  FacebookSignInConfig agw;
  String agx;
  final int versionCode;
  
  SignInConfiguration(int paramInt, String paramString1, String paramString2, EmailSignInConfig paramEmailSignInConfig, GoogleSignInConfig paramGoogleSignInConfig, FacebookSignInConfig paramFacebookSignInConfig, String paramString3)
  {
    this.versionCode = paramInt;
    this.ags = w.af(paramString1);
    this.agt = paramString2;
    this.agu = paramEmailSignInConfig;
    this.agv = paramGoogleSignInConfig;
    this.agw = paramFacebookSignInConfig;
    this.agx = paramString3;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\SignInConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */