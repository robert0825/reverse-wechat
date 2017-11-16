package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyRequest> CREATOR = new b();
  public static final int agb = 0;
  public static final int agc = 1;
  public static final int agd = 2;
  public static final int age = 3;
  public static final int agf = 4;
  public static final int agg = 5;
  public static final int agh = 6;
  public static final int agi = 7;
  public static final int agj = 7;
  public final long aga;
  public final int agk;
  Bundle agl;
  public final byte[] body;
  public final String url;
  final int versionCode;
  
  ProxyRequest(int paramInt1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    this.versionCode = paramInt1;
    this.url = paramString;
    this.agk = paramInt2;
    this.aga = paramLong;
    this.body = paramArrayOfByte;
    this.agl = paramBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "ProxyRequest[ url: " + this.url + ", method: " + this.agk + " ]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\auth\api\proxy\ProxyRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */