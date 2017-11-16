package com.tencent.mm.modelappbrand;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class LogInfo
  implements Parcelable
{
  public static final Parcelable.Creator<LogInfo> CREATOR;
  public long gra;
  public int level;
  public String message;
  
  static
  {
    GMTrace.i(17866258644992L, 133114);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17866258644992L, 133114);
  }
  
  public LogInfo()
  {
    GMTrace.i(17865855991808L, 133111);
    GMTrace.o(17865855991808L, 133111);
  }
  
  public int describeContents()
  {
    GMTrace.i(17865990209536L, 133112);
    GMTrace.o(17865990209536L, 133112);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17866124427264L, 133113);
    paramParcel.writeLong(this.gra);
    paramParcel.writeInt(this.level);
    paramParcel.writeString(this.message);
    GMTrace.o(17866124427264L, 133113);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\modelappbrand\LogInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */