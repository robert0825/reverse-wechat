package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class c
  implements Parcelable.Creator<ProxyResponse>
{
  static void a(ProxyResponse paramProxyResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramProxyResponse.agm);
    b.c(paramParcel, 1000, paramProxyResponse.versionCode);
    b.a(paramParcel, 2, paramProxyResponse.agn, paramInt);
    b.c(paramParcel, 3, paramProxyResponse.statusCode);
    b.a(paramParcel, 4, paramProxyResponse.agl);
    b.a(paramParcel, 5, paramProxyResponse.body);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\api\proxy\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */