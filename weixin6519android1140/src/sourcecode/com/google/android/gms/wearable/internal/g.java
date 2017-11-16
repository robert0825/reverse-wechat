package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class g
  implements Parcelable.Creator<DeleteDataItemsResponse>
{
  static void a(DeleteDataItemsResponse paramDeleteDataItemsResponse, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramDeleteDataItemsResponse.versionCode);
    b.c(paramParcel, 2, paramDeleteDataItemsResponse.statusCode);
    b.c(paramParcel, 3, paramDeleteDataItemsResponse.aBr);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */