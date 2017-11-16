package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class av
  implements Parcelable.Creator<AncsNotificationParcelable>
{
  static void a(AncsNotificationParcelable paramAncsNotificationParcelable, Parcel paramParcel)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramAncsNotificationParcelable.mVersionCode);
    b.c(paramParcel, 2, paramAncsNotificationParcelable.mId);
    b.a(paramParcel, 3, paramAncsNotificationParcelable.avt);
    b.a(paramParcel, 4, paramAncsNotificationParcelable.aAY);
    b.a(paramParcel, 5, paramAncsNotificationParcelable.aAZ);
    b.a(paramParcel, 6, paramAncsNotificationParcelable.aBa);
    b.a(paramParcel, 7, paramAncsNotificationParcelable.aBb);
    if (paramAncsNotificationParcelable.axF == null) {}
    for (String str = paramAncsNotificationParcelable.avt;; str = paramAncsNotificationParcelable.axF)
    {
      b.a(paramParcel, 8, str);
      b.a(paramParcel, 9, paramAncsNotificationParcelable.aBc);
      b.a(paramParcel, 10, paramAncsNotificationParcelable.aBd);
      b.a(paramParcel, 11, paramAncsNotificationParcelable.aBe);
      b.a(paramParcel, 12, paramAncsNotificationParcelable.aBf);
      b.u(paramParcel, i);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */