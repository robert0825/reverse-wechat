package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class a
  implements Parcelable.Creator<FavaDiagnosticsEntity>
{
  static void a(FavaDiagnosticsEntity paramFavaDiagnosticsEntity, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramFavaDiagnosticsEntity.mVersionCode);
    b.a(paramParcel, 2, paramFavaDiagnosticsEntity.alJ);
    b.c(paramParcel, 3, paramFavaDiagnosticsEntity.alK);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\common\server\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */