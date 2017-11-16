package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyResponse> CREATOR = new c();
  final Bundle agl;
  public final int agm;
  public final PendingIntent agn;
  public final byte[] body;
  public final int statusCode;
  final int versionCode;
  
  ProxyResponse(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, int paramInt3, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this.versionCode = paramInt1;
    this.agm = paramInt2;
    this.statusCode = paramInt3;
    this.agl = paramBundle;
    this.body = paramArrayOfByte;
    this.agn = paramPendingIntent;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    c.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\proxy\ProxyResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */