package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AuthAccountResult
  implements SafeParcelable
{
  public static final Parcelable.Creator<AuthAccountResult> CREATOR = new a();
  final int mVersionCode;
  
  public AuthAccountResult()
  {
    this(1);
  }
  
  AuthAccountResult(int paramInt)
  {
    this.mVersionCode = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\signin\internal\AuthAccountResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */