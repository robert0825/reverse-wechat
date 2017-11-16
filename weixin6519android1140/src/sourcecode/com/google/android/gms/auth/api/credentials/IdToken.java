package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class IdToken
  implements SafeParcelable
{
  public static final Parcelable.Creator<IdToken> CREATOR = new d();
  final String afF;
  final String afO;
  final int mVersionCode;
  
  IdToken(int paramInt, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    this.afF = paramString1;
    this.afO = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\credentials\IdToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */