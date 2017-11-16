package com.tencent.recovery.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class RecoveryData
  implements Parcelable
{
  public static final Parcelable.Creator<RecoveryData> CREATOR = new Parcelable.Creator() {};
  public String clientVersion;
  public String lOv;
  public String processName;
  public String xPH;
  public List<RecoveryStatusItem> xPI;
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.processName);
    paramParcel.writeString(this.lOv);
    paramParcel.writeString(this.clientVersion);
    paramParcel.writeString(this.xPH);
    paramParcel.writeList(this.xPI);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\recovery\model\RecoveryData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */