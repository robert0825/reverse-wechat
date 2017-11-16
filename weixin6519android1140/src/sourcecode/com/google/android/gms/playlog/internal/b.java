package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<PlayLoggerContext>
{
  static void a(PlayLoggerContext paramPlayLoggerContext, Parcel paramParcel)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramPlayLoggerContext.versionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramPlayLoggerContext.packageName);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 3, paramPlayLoggerContext.axw);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 4, paramPlayLoggerContext.axx);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 5, paramPlayLoggerContext.axy);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 6, paramPlayLoggerContext.axz);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 7, paramPlayLoggerContext.axA);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 8, paramPlayLoggerContext.axB);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 9, paramPlayLoggerContext.axC);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 10, paramPlayLoggerContext.axD);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\playlog\internal\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */