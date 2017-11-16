package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DeleteDataItemsResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<DeleteDataItemsResponse> CREATOR = new g();
  public final int aBr;
  public final int statusCode;
  public final int versionCode;
  
  DeleteDataItemsResponse(int paramInt1, int paramInt2, int paramInt3)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.aBr = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\DeleteDataItemsResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */