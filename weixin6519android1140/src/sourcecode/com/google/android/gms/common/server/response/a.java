package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public final class a
  implements Parcelable.Creator<FastJsonResponse.Field>
{
  static void a(FastJsonResponse.Field paramField, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramField.mVersionCode);
    b.c(paramParcel, 2, paramField.kI());
    b.a(paramParcel, 3, paramField.kJ());
    b.c(paramParcel, 4, paramField.kK());
    b.a(paramParcel, 5, paramField.kL());
    b.a(paramParcel, 6, paramField.kM());
    b.c(paramParcel, 7, paramField.kN());
    b.a(paramParcel, 8, paramField.kP());
    if (paramField.ama == null) {}
    for (paramField = null;; paramField = ConverterWrapper.a(paramField.ama))
    {
      b.a(paramParcel, 9, paramField, paramInt);
      b.u(paramParcel, i);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\server\response\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */