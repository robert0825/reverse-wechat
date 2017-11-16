package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.v.a;
import java.util.Arrays;

public final class ConnectionResult
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionResult> CREATOR = new i();
  public static final ConnectionResult agy = new ConnectionResult(0, null);
  public final PendingIntent agA;
  public final int agz;
  final int mVersionCode;
  
  ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent)
  {
    this.mVersionCode = paramInt1;
    this.agz = paramInt2;
    this.agA = paramPendingIntent;
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramPendingIntent);
  }
  
  public final void a(Activity paramActivity, int paramInt)
  {
    if (!jD()) {
      return;
    }
    paramActivity.startIntentSenderForResult(this.agA.getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ConnectionResult)) {
        return false;
      }
      paramObject = (ConnectionResult)paramObject;
    } while ((this.agz == ((ConnectionResult)paramObject).agz) && (v.d(this.agA, ((ConnectionResult)paramObject).agA)));
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.agz), this.agA });
  }
  
  public final boolean isSuccess()
  {
    return this.agz == 0;
  }
  
  public final boolean jD()
  {
    return (this.agz != 0) && (this.agA != null);
  }
  
  public final String toString()
  {
    v.a locala = v.Z(this);
    int i = this.agz;
    String str;
    switch (i)
    {
    case 12: 
    default: 
      str = "UNKNOWN_ERROR_CODE(" + i + ")";
    }
    for (;;)
    {
      return locala.g("statusCode", str).g("resolution", this.agA).toString();
      str = "SUCCESS";
      continue;
      str = "SERVICE_MISSING";
      continue;
      str = "SERVICE_VERSION_UPDATE_REQUIRED";
      continue;
      str = "SERVICE_DISABLED";
      continue;
      str = "SIGN_IN_REQUIRED";
      continue;
      str = "INVALID_ACCOUNT";
      continue;
      str = "RESOLUTION_REQUIRED";
      continue;
      str = "NETWORK_ERROR";
      continue;
      str = "INTERNAL_ERROR";
      continue;
      str = "SERVICE_INVALID";
      continue;
      str = "DEVELOPER_ERROR";
      continue;
      str = "LICENSE_CHECK_FAILED";
      continue;
      str = "CANCELED";
      continue;
      str = "TIMEOUT";
      continue;
      str = "INTERRUPTED";
      continue;
      str = "API_UNAVAILABLE";
      continue;
      str = "SIGN_IN_FAILED";
      continue;
      str = "SERVICE_UPDATING";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\ConnectionResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */