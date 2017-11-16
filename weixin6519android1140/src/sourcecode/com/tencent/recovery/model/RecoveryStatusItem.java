package com.tencent.recovery.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class RecoveryStatusItem
  extends RecoveryPersistentItem
{
  public static final Parcelable.Creator<RecoveryStatusItem> CREATOR = new Parcelable.Creator() {};
  public String clientVersion;
  public String lOv;
  public String processName;
  public long timestamp;
  public int xPu;
  public int xPw;
  public int xPx;
  
  public final boolean XM(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    try
    {
      paramString = paramString.split(",");
      this.processName = paramString[0];
      this.lOv = paramString[1];
      this.clientVersion = paramString[2];
      this.xPu = Integer.valueOf(paramString[3]).intValue();
      this.xPx = Integer.valueOf(paramString[4]).intValue();
      this.xPw = Integer.valueOf(paramString[5]).intValue();
      this.timestamp = Long.valueOf(paramString[6]).longValue();
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public final String cnl()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.processName);
    localStringBuffer.append(",");
    localStringBuffer.append(this.lOv);
    localStringBuffer.append(",");
    localStringBuffer.append(this.clientVersion);
    localStringBuffer.append(",");
    localStringBuffer.append(this.xPu);
    localStringBuffer.append(",");
    localStringBuffer.append(this.xPx);
    localStringBuffer.append(",");
    localStringBuffer.append(this.xPw);
    localStringBuffer.append(",");
    localStringBuffer.append(this.timestamp);
    return localStringBuffer.toString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.lOv);
    paramParcel.writeString(this.clientVersion);
    paramParcel.writeInt(this.xPu);
    paramParcel.writeInt(this.xPx);
    paramParcel.writeInt(this.xPw);
    paramParcel.writeLong(this.timestamp);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\model\RecoveryStatusItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */