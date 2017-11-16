package com.tencent.mm.modelcontrol;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class VideoTransPara
  implements Parcelable
{
  public static final Parcelable.Creator<VideoTransPara> CREATOR;
  public int audioSampleRate;
  public int duration;
  public int fps;
  public int gBk;
  public int gBl;
  public int gBm;
  public int gBn;
  public int gBx;
  public int height;
  public boolean isDefault;
  public int videoBitrate;
  public int width;
  
  static
  {
    GMTrace.i(4103975469056L, 30577);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4103975469056L, 30577);
  }
  
  public VideoTransPara()
  {
    GMTrace.i(4103304380416L, 30572);
    this.gBx = 0;
    GMTrace.o(4103304380416L, 30572);
  }
  
  protected VideoTransPara(Parcel paramParcel)
  {
    GMTrace.i(4103438598144L, 30573);
    this.gBx = 0;
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    this.fps = paramParcel.readInt();
    this.videoBitrate = paramParcel.readInt();
    this.duration = paramParcel.readInt();
    this.gBl = paramParcel.readInt();
    this.gBk = paramParcel.readInt();
    this.audioSampleRate = paramParcel.readInt();
    this.gBm = paramParcel.readInt();
    this.gBn = paramParcel.readInt();
    if (paramParcel.readInt() > 0) {
      bool = true;
    }
    this.isDefault = bool;
    this.gBx = paramParcel.readInt();
    GMTrace.o(4103438598144L, 30573);
  }
  
  public int describeContents()
  {
    GMTrace.i(4103707033600L, 30575);
    GMTrace.o(4103707033600L, 30575);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(4103841251328L, 30576);
    String str = "[isDefault " + this.isDefault + "width " + this.width + " height " + this.height + " fps " + this.fps + " video bitrate " + this.videoBitrate + " iFrame " + this.gBl + " audio bitrate " + this.gBk + " audioSampleRate " + this.audioSampleRate + " duration " + this.duration + " profile index " + this.gBm + " preset index " + this.gBn + " thumbSize " + this.gBx + "]";
    GMTrace.o(4103841251328L, 30576);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(4103572815872L, 30574);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    paramParcel.writeInt(this.fps);
    paramParcel.writeInt(this.videoBitrate);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.gBl);
    paramParcel.writeInt(this.gBk);
    paramParcel.writeInt(this.audioSampleRate);
    paramParcel.writeInt(this.gBm);
    paramParcel.writeInt(this.gBn);
    if (this.isDefault) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.gBx);
      GMTrace.o(4103572815872L, 30574);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelcontrol\VideoTransPara.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */