package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class c
  implements Parcelable.Creator<StringToIntConverter.Entry>
{
  static void a(StringToIntConverter.Entry paramEntry, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramEntry.versionCode);
    b.a(paramParcel, 2, paramEntry.alP);
    b.c(paramParcel, 3, paramEntry.alQ);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\server\converter\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */