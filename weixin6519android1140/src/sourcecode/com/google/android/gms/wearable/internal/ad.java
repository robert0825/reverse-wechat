package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class ad
  implements Parcelable.Creator<NodeParcelable>
{
  static void a(NodeParcelable paramNodeParcelable, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramNodeParcelable.mVersionCode);
    b.a(paramParcel, 2, paramNodeParcelable.abK);
    b.a(paramParcel, 3, paramNodeParcelable.axF);
    b.c(paramParcel, 4, paramNodeParcelable.aBF);
    b.a(paramParcel, 5, paramNodeParcelable.aBG);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */