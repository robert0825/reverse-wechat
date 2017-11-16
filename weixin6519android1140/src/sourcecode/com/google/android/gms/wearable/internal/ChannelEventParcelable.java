package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.b.a;

public final class ChannelEventParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator<ChannelEventParcelable> CREATOR = new ba();
  final ChannelImpl aBi;
  final int aBj;
  final int aBk;
  final int mVersionCode;
  final int type;
  
  ChannelEventParcelable(int paramInt1, ChannelImpl paramChannelImpl, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mVersionCode = paramInt1;
    this.aBi = paramChannelImpl;
    this.type = paramInt2;
    this.aBj = paramInt3;
    this.aBk = paramInt4;
  }
  
  public final void a(b.a parama)
  {
    switch (this.type)
    {
    default: 
      new StringBuilder("Unknown type: ").append(this.type);
      return;
    case 1: 
      parama.a(this.aBi);
      return;
    case 2: 
      parama.a(this.aBi, this.aBj, this.aBk);
      return;
    case 3: 
      parama.b(this.aBi, this.aBj, this.aBk);
      return;
    }
    parama.c(this.aBi, this.aBj, this.aBk);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ChannelEventParcelable[versionCode=").append(this.mVersionCode).append(", channel=").append(this.aBi).append(", type=");
    int i = this.type;
    String str;
    switch (i)
    {
    default: 
      str = Integer.toString(i);
      localStringBuilder = localStringBuilder.append(str).append(", closeReason=");
      i = this.aBj;
      switch (i)
      {
      default: 
        str = Integer.toString(i);
      }
      break;
    }
    for (;;)
    {
      return str + ", appErrorCode=" + this.aBk + "]";
      str = "CHANNEL_OPENED";
      break;
      str = "CHANNEL_CLOSED";
      break;
      str = "OUTPUT_CLOSED";
      break;
      str = "INPUT_CLOSED";
      break;
      str = "CLOSE_REASON_DISCONNECTED";
      continue;
      str = "CLOSE_REASON_REMOTE_CLOSE";
      continue;
      str = "CLOSE_REASON_LOCAL_CLOSE";
      continue;
      str = "CLOSE_REASON_NORMAL";
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ba.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\ChannelEventParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */