package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetChannelInputStreamResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetChannelInputStreamResponse> CREATOR = new j();
  public final ParcelFileDescriptor aBu;
  public final int statusCode;
  public final int versionCode;
  
  GetChannelInputStreamResponse(int paramInt1, int paramInt2, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.aBu = paramParcelFileDescriptor;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\GetChannelInputStreamResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */