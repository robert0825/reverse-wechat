package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public final class e
  implements Parcelable.Creator<SafeParcelResponse>
{
  static void a(SafeParcelResponse paramSafeParcelResponse, Parcel paramParcel, int paramInt)
  {
    int i = b.t(paramParcel, 20293);
    b.c(paramParcel, 1, paramSafeParcelResponse.mVersionCode);
    Parcel localParcel = paramSafeParcelResponse.kT();
    if (localParcel != null)
    {
      int j = b.t(paramParcel, 2);
      paramParcel.appendFrom(localParcel, 0, localParcel.dataSize());
      b.u(paramParcel, j);
    }
    switch (paramSafeParcelResponse.ami)
    {
    default: 
      throw new IllegalStateException("Invalid creation type: " + paramSafeParcelResponse.ami);
    case 0: 
      paramSafeParcelResponse = null;
    }
    for (;;)
    {
      b.a(paramParcel, 3, paramSafeParcelResponse, paramInt);
      b.u(paramParcel, i);
      return;
      paramSafeParcelResponse = paramSafeParcelResponse.alZ;
      continue;
      paramSafeParcelResponse = paramSafeParcelResponse.alZ;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\server\response\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */