package com.tencent.tmassistantsdk.downloadclient;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class TMAssistantDownloadTaskInfo
  implements Parcelable
{
  public static final Parcelable.Creator<TMAssistantDownloadTaskInfo> CREATOR = new Parcelable.Creator()
  {
    public final TMAssistantDownloadTaskInfo createFromParcel(Parcel paramAnonymousParcel)
    {
      return new TMAssistantDownloadTaskInfo(paramAnonymousParcel.readString(), paramAnonymousParcel.readString(), paramAnonymousParcel.readInt(), paramAnonymousParcel.readLong(), paramAnonymousParcel.readLong(), paramAnonymousParcel.readString());
    }
    
    public final TMAssistantDownloadTaskInfo[] newArray(int paramAnonymousInt)
    {
      return new TMAssistantDownloadTaskInfo[paramAnonymousInt];
    }
  };
  public String mContentType;
  public long mReceiveDataLen;
  public String mSavePath;
  public int mState;
  public long mTotalDataLen;
  public String mUrl;
  
  public TMAssistantDownloadTaskInfo(String paramString1, String paramString2, int paramInt, long paramLong1, long paramLong2, String paramString3)
  {
    this.mUrl = paramString1;
    this.mSavePath = paramString2;
    this.mState = paramInt;
    this.mReceiveDataLen = paramLong1;
    this.mTotalDataLen = paramLong2;
    this.mContentType = paramString3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.mUrl != null)
    {
      paramParcel.writeString(this.mUrl);
      if (this.mSavePath == null) {
        break label72;
      }
      paramParcel.writeString(this.mSavePath);
    }
    for (;;)
    {
      paramParcel.writeInt(this.mState);
      paramParcel.writeLong(this.mReceiveDataLen);
      paramParcel.writeLong(this.mTotalDataLen);
      paramParcel.writeString(this.mContentType);
      return;
      paramParcel.writeString("");
      break;
      label72:
      paramParcel.writeString("");
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\downloadclient\TMAssistantDownloadTaskInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */