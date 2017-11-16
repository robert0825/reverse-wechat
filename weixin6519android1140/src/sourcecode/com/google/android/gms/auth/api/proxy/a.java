package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<ProxyGrpcRequest>
{
  static void a(ProxyGrpcRequest paramProxyGrpcRequest, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.a(paramParcel, 1, paramProxyGrpcRequest.hostname);
    b.c(paramParcel, 1000, paramProxyGrpcRequest.versionCode);
    b.c(paramParcel, 2, paramProxyGrpcRequest.port);
    b.a(paramParcel, 3, paramProxyGrpcRequest.aga);
    b.a(paramParcel, 4, paramProxyGrpcRequest.body);
    b.a(paramParcel, 5, paramProxyGrpcRequest.method);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\auth\api\proxy\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */