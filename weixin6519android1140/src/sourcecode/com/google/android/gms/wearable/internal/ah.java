package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class ah
  implements Parcelable.Creator<RemoveListenerRequest>
{
  static void a(RemoveListenerRequest paramRemoveListenerRequest, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramRemoveListenerRequest.mVersionCode);
    if (paramRemoveListenerRequest.aAS == null) {}
    for (paramRemoveListenerRequest = null;; paramRemoveListenerRequest = paramRemoveListenerRequest.aAS.asBinder())
    {
      b.a(paramParcel, 2, paramRemoveListenerRequest);
      b.u(paramParcel, i);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */