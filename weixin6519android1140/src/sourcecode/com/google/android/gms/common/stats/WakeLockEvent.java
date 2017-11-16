package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class WakeLockEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator<WakeLockEvent> CREATOR = new g();
  int amA;
  final String amB;
  final String amC;
  final float amD;
  final long aml;
  int amm;
  final long amt;
  private long amv;
  final String amw;
  final int amx;
  final List<String> amy;
  final String amz;
  final int mVersionCode;
  
  WakeLockEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, int paramInt3, List<String> paramList, String paramString2, long paramLong2, int paramInt4, String paramString3, String paramString4, float paramFloat)
  {
    this.mVersionCode = paramInt1;
    this.aml = paramLong1;
    this.amm = paramInt2;
    this.amw = paramString1;
    this.amB = paramString3;
    this.amx = paramInt3;
    this.amv = -1L;
    this.amy = paramList;
    this.amz = paramString2;
    this.amt = paramLong2;
    this.amA = paramInt4;
    this.amC = paramString4;
    this.amD = paramFloat;
  }
  
  public WakeLockEvent(long paramLong1, int paramInt1, String paramString1, int paramInt2, List<String> paramList, String paramString2, long paramLong2, int paramInt3, String paramString3, String paramString4, float paramFloat)
  {
    this(1, paramLong1, paramInt1, paramString1, paramInt2, paramList, paramString2, paramLong2, paramInt3, paramString3, paramString4, paramFloat);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\stats\WakeLockEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */