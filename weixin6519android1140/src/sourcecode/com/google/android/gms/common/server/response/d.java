package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class d
  implements Parcelable.Creator<FieldMappingDictionary.Entry>
{
  static void a(FieldMappingDictionary.Entry paramEntry, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramEntry.versionCode);
    b.a(paramParcel, 2, paramEntry.className);
    b.b(paramParcel, 3, paramEntry.ame);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\server\response\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */