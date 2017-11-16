package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class SampleTask1
  extends MainProcessTask
{
  public static final Parcelable.Creator<SampleTask1> CREATOR;
  public String hXn;
  public String hXo;
  
  static
  {
    GMTrace.i(10279064698880L, 76585);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10279064698880L, 76585);
  }
  
  public SampleTask1(Parcel paramParcel)
  {
    GMTrace.i(10278393610240L, 76580);
    f(paramParcel);
    GMTrace.o(10278393610240L, 76580);
  }
  
  public final void RY()
  {
    GMTrace.i(10278527827968L, 76581);
    w.e("SampleTask", this.hXn);
    this.hXo = "String from Main Process";
    VL();
    GMTrace.o(10278527827968L, 76581);
  }
  
  public final void VK()
  {
    GMTrace.i(10278662045696L, 76582);
    w.e("SampleTask", this.hXo);
    GMTrace.o(10278662045696L, 76582);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10278796263424L, 76583);
    this.hXn = paramParcel.readString();
    this.hXo = paramParcel.readString();
    GMTrace.o(10278796263424L, 76583);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10278930481152L, 76584);
    paramParcel.writeString(this.hXn);
    paramParcel.writeString(this.hXo);
    GMTrace.o(10278930481152L, 76584);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\SampleTask1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */