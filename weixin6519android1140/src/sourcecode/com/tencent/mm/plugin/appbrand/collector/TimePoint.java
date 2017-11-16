package com.tencent.mm.plugin.appbrand.collector;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class TimePoint
  implements Parcelable
{
  public static final Parcelable.Creator<TimePoint> CREATOR;
  final AtomicInteger hOM;
  final AtomicLong hON;
  final AtomicReference<TimePoint> hOO;
  String name;
  
  static
  {
    GMTrace.i(20002870657024L, 149033);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20002870657024L, 149033);
  }
  
  TimePoint()
  {
    GMTrace.i(20002333786112L, 149029);
    this.hOM = new AtomicInteger();
    this.hON = new AtomicLong();
    this.hOO = new AtomicReference();
    this.name = "";
    GMTrace.o(20002333786112L, 149029);
  }
  
  public TimePoint(String paramString, long paramLong)
  {
    GMTrace.i(20002468003840L, 149030);
    this.hOM = new AtomicInteger();
    this.hON = new AtomicLong();
    this.hOO = new AtomicReference();
    this.name = paramString;
    this.hON.set(paramLong);
    GMTrace.o(20002468003840L, 149030);
  }
  
  public int describeContents()
  {
    GMTrace.i(20002602221568L, 149031);
    GMTrace.o(20002602221568L, 149031);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20002736439296L, 149032);
    paramParcel.writeString(this.name);
    paramParcel.writeLong(this.hON.get());
    paramParcel.writeInt(this.hOM.get());
    paramParcel.writeParcelable((Parcelable)this.hOO.get(), paramInt);
    GMTrace.o(20002736439296L, 149032);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\collector\TimePoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */