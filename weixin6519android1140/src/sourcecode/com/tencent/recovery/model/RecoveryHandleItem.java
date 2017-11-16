package com.tencent.recovery.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class RecoveryHandleItem
  extends RecoveryPersistentItem
{
  public static final Parcelable.Creator<RecoveryHandleItem> CREATOR = new Parcelable.Creator() {};
  public String amf;
  public String clientVersion;
  public String lOv;
  public String processName;
  public long timestamp;
  public String xPJ;
  
  public final boolean XM(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return false;
    }
    try
    {
      paramString = paramString.split(",");
      this.lOv = paramString[0];
      this.clientVersion = paramString[1];
      this.amf = paramString[2];
      this.processName = paramString[3];
      this.xPJ = paramString[4];
      this.timestamp = Long.valueOf(paramString[5]).longValue();
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public final String cnl()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.lOv);
    localStringBuffer.append(",");
    localStringBuffer.append(this.clientVersion);
    localStringBuffer.append(",");
    localStringBuffer.append(this.amf);
    localStringBuffer.append(",");
    localStringBuffer.append(this.processName);
    localStringBuffer.append(",");
    localStringBuffer.append(this.xPJ);
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
    paramParcel.writeString(this.lOv);
    paramParcel.writeString(this.clientVersion);
    paramParcel.writeString(this.amf);
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.xPJ);
    paramParcel.writeLong(this.timestamp);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\model\RecoveryHandleItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */