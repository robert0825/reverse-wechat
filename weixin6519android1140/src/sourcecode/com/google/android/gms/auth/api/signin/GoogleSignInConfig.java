package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class GoogleSignInConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator<GoogleSignInConfig> CREATOR = new c();
  final ArrayList<Scope> agr;
  final int versionCode;
  
  public GoogleSignInConfig()
  {
    this(1, new ArrayList());
  }
  
  GoogleSignInConfig(int paramInt, ArrayList<Scope> paramArrayList)
  {
    this.versionCode = paramInt;
    this.agr = paramArrayList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\auth\api\signin\GoogleSignInConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */