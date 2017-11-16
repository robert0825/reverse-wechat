package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.l;

public class MessageEventParcelable
  implements SafeParcelable, l
{
  public static final Parcelable.Creator<MessageEventParcelable> CREATOR = new aa();
  final byte[] aAe;
  final int aBE;
  final String aBm;
  final String avv;
  final int mVersionCode;
  
  MessageEventParcelable(int paramInt1, int paramInt2, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    this.mVersionCode = paramInt1;
    this.aBE = paramInt2;
    this.aBm = paramString1;
    this.aAe = paramArrayOfByte;
    this.avv = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final byte[] getData()
  {
    return this.aAe;
  }
  
  public final String getPath()
  {
    return this.aBm;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MessageEventParcelable[").append(this.aBE).append(",").append(this.aBm).append(", size=");
    if (this.aAe == null) {}
    for (Object localObject = "null";; localObject = Integer.valueOf(this.aAe.length)) {
      return localObject + "]";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    aa.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\MessageEventParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */