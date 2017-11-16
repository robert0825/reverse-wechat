package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AncsNotificationParcelable
  implements SafeParcelable
{
  public static final Parcelable.Creator<AncsNotificationParcelable> CREATOR = new av();
  final String aAY;
  final String aAZ;
  final String aBa;
  final String aBb;
  byte aBc;
  byte aBd;
  byte aBe;
  byte aBf;
  final String avt;
  String axF;
  int mId;
  final int mVersionCode;
  
  AncsNotificationParcelable(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    this.mId = paramInt2;
    this.mVersionCode = paramInt1;
    this.avt = paramString1;
    this.aAY = paramString2;
    this.aAZ = paramString3;
    this.aBa = paramString4;
    this.aBb = paramString5;
    this.axF = paramString6;
    this.aBc = paramByte1;
    this.aBd = paramByte2;
    this.aBe = paramByte3;
    this.aBf = paramByte4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (AncsNotificationParcelable)paramObject;
      if (this.aBf != ((AncsNotificationParcelable)paramObject).aBf) {
        return false;
      }
      if (this.aBe != ((AncsNotificationParcelable)paramObject).aBe) {
        return false;
      }
      if (this.aBd != ((AncsNotificationParcelable)paramObject).aBd) {
        return false;
      }
      if (this.aBc != ((AncsNotificationParcelable)paramObject).aBc) {
        return false;
      }
      if (this.mId != ((AncsNotificationParcelable)paramObject).mId) {
        return false;
      }
      if (this.mVersionCode != ((AncsNotificationParcelable)paramObject).mVersionCode) {
        return false;
      }
      if (!this.avt.equals(((AncsNotificationParcelable)paramObject).avt)) {
        return false;
      }
      if (this.aAY != null)
      {
        if (this.aAY.equals(((AncsNotificationParcelable)paramObject).aAY)) {}
      }
      else {
        while (((AncsNotificationParcelable)paramObject).aAY != null) {
          return false;
        }
      }
      if (!this.axF.equals(((AncsNotificationParcelable)paramObject).axF)) {
        return false;
      }
      if (!this.aAZ.equals(((AncsNotificationParcelable)paramObject).aAZ)) {
        return false;
      }
      if (!this.aBb.equals(((AncsNotificationParcelable)paramObject).aBb)) {
        return false;
      }
    } while (this.aBa.equals(((AncsNotificationParcelable)paramObject).aBa));
    return false;
  }
  
  public int hashCode()
  {
    int j = this.mVersionCode;
    int k = this.mId;
    int m = this.avt.hashCode();
    if (this.aAY != null) {}
    for (int i = this.aAY.hashCode();; i = 0) {
      return ((((((((i + ((j * 31 + k) * 31 + m) * 31) * 31 + this.aAZ.hashCode()) * 31 + this.aBa.hashCode()) * 31 + this.aBb.hashCode()) * 31 + this.axF.hashCode()) * 31 + this.aBc) * 31 + this.aBd) * 31 + this.aBe) * 31 + this.aBf;
    }
  }
  
  public String toString()
  {
    return "AncsNotificationParcelable{mVersionCode=" + this.mVersionCode + ", mId=" + this.mId + ", mAppId='" + this.avt + '\'' + ", mDateTime='" + this.aAY + '\'' + ", mNotificationText='" + this.aAZ + '\'' + ", mTitle='" + this.aBa + '\'' + ", mSubtitle='" + this.aBb + '\'' + ", mDisplayName='" + this.axF + '\'' + ", mEventId=" + this.aBc + ", mEventFlags=" + this.aBd + ", mCategoryId=" + this.aBe + ", mCategoryCount=" + this.aBf + '}';
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    av.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\AncsNotificationParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */