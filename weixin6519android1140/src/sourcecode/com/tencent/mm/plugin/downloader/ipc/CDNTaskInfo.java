package com.tencent.mm.plugin.downloader.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class CDNTaskInfo
  implements Parcelable
{
  public static final Parcelable.Creator<CDNTaskInfo> CREATOR;
  public String downloadUrl;
  public String filePath;
  public boolean gAI;
  public String ket;
  public String keu;
  public int kev;
  public int kew;
  public boolean kex;
  public boolean kez;
  public String mediaId;
  
  static
  {
    GMTrace.i(20083267076096L, 149632);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20083267076096L, 149632);
  }
  
  public CDNTaskInfo()
  {
    GMTrace.i(20082998640640L, 149630);
    GMTrace.o(20082998640640L, 149630);
  }
  
  public CDNTaskInfo(Parcel paramParcel)
  {
    GMTrace.i(20082595987456L, 149627);
    if (paramParcel.readByte() == 1)
    {
      bool1 = true;
      this.gAI = bool1;
      this.downloadUrl = paramParcel.readString();
      this.mediaId = paramParcel.readString();
      this.filePath = paramParcel.readString();
      this.ket = paramParcel.readString();
      this.keu = paramParcel.readString();
      this.kev = paramParcel.readInt();
      this.kew = paramParcel.readInt();
      if (paramParcel.readByte() != 1) {
        break label129;
      }
      bool1 = true;
      label95:
      this.kex = bool1;
      if (paramParcel.readByte() != 1) {
        break label134;
      }
    }
    label129:
    label134:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.kez = bool1;
      GMTrace.o(20082595987456L, 149627);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label95;
    }
  }
  
  public CDNTaskInfo(String paramString)
  {
    GMTrace.i(20083132858368L, 149631);
    this.downloadUrl = paramString;
    GMTrace.o(20083132858368L, 149631);
  }
  
  public int describeContents()
  {
    GMTrace.i(20082327552000L, 149625);
    GMTrace.o(20082327552000L, 149625);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(20082730205184L, 149628);
    if ((paramObject == this) || ((paramObject != null) && ((paramObject instanceof CDNTaskInfo)) && (((CDNTaskInfo)paramObject).downloadUrl.equals(this.downloadUrl))))
    {
      GMTrace.o(20082730205184L, 149628);
      return true;
    }
    GMTrace.o(20082730205184L, 149628);
    return false;
  }
  
  public int hashCode()
  {
    GMTrace.i(20082864422912L, 149629);
    int i = this.downloadUrl.hashCode();
    GMTrace.o(20082864422912L, 149629);
    return i;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte b2 = 1;
    GMTrace.i(20082461769728L, 149626);
    if (this.gAI)
    {
      b1 = 1;
      paramParcel.writeByte(b1);
      paramParcel.writeString(this.downloadUrl);
      paramParcel.writeString(this.mediaId);
      paramParcel.writeString(this.filePath);
      paramParcel.writeString(this.ket);
      paramParcel.writeString(this.keu);
      paramParcel.writeInt(this.kev);
      paramParcel.writeInt(this.kew);
      if (!this.kex) {
        break label124;
      }
      b1 = 1;
      label90:
      paramParcel.writeByte(b1);
      if (!this.kez) {
        break label129;
      }
    }
    label124:
    label129:
    for (byte b1 = b2;; b1 = 0)
    {
      paramParcel.writeByte(b1);
      GMTrace.o(20082461769728L, 149626);
      return;
      b1 = 0;
      break;
      b1 = 0;
      break label90;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\downloader\ipc\CDNTaskInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */