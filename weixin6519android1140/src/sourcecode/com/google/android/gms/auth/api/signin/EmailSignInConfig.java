package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Patterns;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSignInConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator<EmailSignInConfig> CREATOR = new a();
  final Uri ago;
  String agp;
  Uri agq;
  final int versionCode;
  
  EmailSignInConfig(int paramInt, Uri paramUri1, String paramString, Uri paramUri2)
  {
    w.j(paramUri1, "Server widget url cannot be null in order to use email/password sign in.");
    w.h(paramUri1.toString(), "Server widget url cannot be null in order to use email/password sign in.");
    w.c(Patterns.WEB_URL.matcher(paramUri1.toString()).matches(), "Invalid server widget url");
    this.versionCode = paramInt;
    this.ago = paramUri1;
    this.agp = paramString;
    this.agq = paramUri2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\signin\EmailSignInConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */