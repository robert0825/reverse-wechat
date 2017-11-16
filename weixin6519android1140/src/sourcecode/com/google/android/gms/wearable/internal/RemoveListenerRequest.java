package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RemoveListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<RemoveListenerRequest> CREATOR = new ah();
  public final w aAS;
  final int mVersionCode;
  
  RemoveListenerRequest(int paramInt, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    if (paramIBinder != null)
    {
      this.aAS = w.a.s(paramIBinder);
      return;
    }
    this.aAS = null;
  }
  
  public RemoveListenerRequest(w paramw)
  {
    this.mVersionCode = 1;
    this.aAS = paramw;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ah.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\RemoveListenerRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */