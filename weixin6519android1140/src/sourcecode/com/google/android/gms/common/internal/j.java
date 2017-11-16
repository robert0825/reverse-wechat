package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class j
  implements Parcelable.Creator<GetServiceRequest>
{
  static void a(GetServiceRequest paramGetServiceRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramGetServiceRequest.version);
    b.c(paramParcel, 2, paramGetServiceRequest.ajY);
    b.c(paramParcel, 3, paramGetServiceRequest.ajZ);
    b.a(paramParcel, 4, paramGetServiceRequest.aka);
    b.a(paramParcel, 5, paramGetServiceRequest.akb);
    b.a(paramParcel, 6, paramGetServiceRequest.akc, paramInt);
    b.a(paramParcel, 7, paramGetServiceRequest.akd);
    b.a(paramParcel, 8, paramGetServiceRequest.ake, paramInt);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\internal\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */