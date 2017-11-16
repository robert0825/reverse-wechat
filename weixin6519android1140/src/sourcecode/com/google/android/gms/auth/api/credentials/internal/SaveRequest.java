package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class SaveRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<SaveRequest> CREATOR = new b();
  final Credential afZ;
  final int mVersionCode;
  
  SaveRequest(int paramInt, Credential paramCredential)
  {
    this.mVersionCode = paramInt;
    this.afZ = paramCredential;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\credentials\internal\SaveRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */