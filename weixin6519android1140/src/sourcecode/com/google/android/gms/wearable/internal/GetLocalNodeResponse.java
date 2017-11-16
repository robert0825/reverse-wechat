package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetLocalNodeResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetLocalNodeResponse> CREATOR = new t();
  public final NodeParcelable aBD;
  public final int statusCode;
  public final int versionCode;
  
  GetLocalNodeResponse(int paramInt1, int paramInt2, NodeParcelable paramNodeParcelable)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.aBD = paramNodeParcelable;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\GetLocalNodeResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */