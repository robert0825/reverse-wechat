package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AddListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<AddListenerRequest> CREATOR = new ab();
  public final w aAS;
  public final IntentFilter[] aAT;
  public final String aAU;
  public final String aAV;
  final int mVersionCode;
  
  AddListenerRequest(int paramInt, IBinder paramIBinder, IntentFilter[] paramArrayOfIntentFilter, String paramString1, String paramString2)
  {
    this.mVersionCode = paramInt;
    if (paramIBinder != null) {}
    for (this.aAS = w.a.s(paramIBinder);; this.aAS = null)
    {
      this.aAT = paramArrayOfIntentFilter;
      this.aAU = paramString1;
      this.aAV = paramString2;
      return;
    }
  }
  
  public AddListenerRequest(ap paramap)
  {
    this.mVersionCode = 1;
    this.aAS = paramap;
    this.aAT = paramap.aCo;
    this.aAU = paramap.aCp;
    this.aAV = paramap.aCq;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ab.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\AddListenerRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */