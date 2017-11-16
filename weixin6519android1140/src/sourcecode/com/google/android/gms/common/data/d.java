package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class d
  implements Parcelable.Creator<BitmapTeleporter>
{
  static void a(BitmapTeleporter paramBitmapTeleporter, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramBitmapTeleporter.mVersionCode);
    b.a(paramParcel, 2, paramBitmapTeleporter.aiZ, paramInt);
    b.c(paramParcel, 3, paramBitmapTeleporter.aja);
    b.u(paramParcel, i);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\data\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */