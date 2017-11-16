package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import java.util.Arrays;

public class AccountChangeEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new e();
  final int afp;
  final long afq;
  final String afr;
  final int afs;
  final int aft;
  final String afu;
  
  AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.afp = paramInt1;
    this.afq = paramLong;
    this.afr = ((String)w.aa(paramString1));
    this.afs = paramInt2;
    this.aft = paramInt3;
    this.afu = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof AccountChangeEvent)) {
        break;
      }
      paramObject = (AccountChangeEvent)paramObject;
    } while ((this.afp == ((AccountChangeEvent)paramObject).afp) && (this.afq == ((AccountChangeEvent)paramObject).afq) && (v.d(this.afr, ((AccountChangeEvent)paramObject).afr)) && (this.afs == ((AccountChangeEvent)paramObject).afs) && (this.aft == ((AccountChangeEvent)paramObject).aft) && (v.d(this.afu, ((AccountChangeEvent)paramObject).afu)));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.afp), Long.valueOf(this.afq), this.afr, Integer.valueOf(this.afs), Integer.valueOf(this.aft), this.afu });
  }
  
  public String toString()
  {
    String str = "UNKNOWN";
    switch (this.afs)
    {
    }
    for (;;)
    {
      return "AccountChangeEvent {accountName = " + this.afr + ", changeType = " + str + ", changeData = " + this.afu + ", eventIndex = " + this.aft + "}";
      str = "ADDED";
      continue;
      str = "REMOVED";
      continue;
      str = "RENAMED_TO";
      continue;
      str = "RENAMED_FROM";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    e.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\AccountChangeEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */