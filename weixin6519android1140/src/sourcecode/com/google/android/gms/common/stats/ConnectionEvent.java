package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionEvent> CREATOR = new a();
  final long aml;
  int amm;
  final String amn;
  final String amo;
  final String amp;
  final String amq;
  final String amr;
  final String ams;
  final long amt;
  final long amu;
  private long amv;
  final int mVersionCode;
  
  ConnectionEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this.mVersionCode = paramInt1;
    this.aml = paramLong1;
    this.amm = paramInt2;
    this.amn = paramString1;
    this.amo = paramString2;
    this.amp = paramString3;
    this.amq = paramString4;
    this.amv = -1L;
    this.amr = paramString5;
    this.ams = paramString6;
    this.amt = paramLong2;
    this.amu = paramLong3;
  }
  
  public ConnectionEvent(long paramLong1, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this(1, paramLong1, paramInt, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramLong2, paramLong3);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\google\android\gms\common\stats\ConnectionEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */