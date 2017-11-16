package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public class FacebookSignInConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator<FacebookSignInConfig> CREATOR = new b();
  Intent Jt;
  final ArrayList<String> agr;
  final int versionCode;
  
  public FacebookSignInConfig()
  {
    this(1, null, new ArrayList());
  }
  
  FacebookSignInConfig(int paramInt, Intent paramIntent, ArrayList<String> paramArrayList)
  {
    this.versionCode = paramInt;
    this.Jt = paramIntent;
    this.agr = paramArrayList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\auth\api\signin\FacebookSignInConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */