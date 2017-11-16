package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<FieldMappingDictionary.FieldMapPair>
{
  static void a(FieldMappingDictionary.FieldMapPair paramFieldMapPair, Parcel paramParcel, int paramInt)
  {
    int i = com.google.android.gms.common.internal.safeparcel.b.t(paramParcel, 20293);
    com.google.android.gms.common.internal.safeparcel.b.c(paramParcel, 1, paramFieldMapPair.versionCode);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 2, paramFieldMapPair.amf);
    com.google.android.gms.common.internal.safeparcel.b.a(paramParcel, 3, paramFieldMapPair.amg, paramInt);
    com.google.android.gms.common.internal.safeparcel.b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\server\response\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */