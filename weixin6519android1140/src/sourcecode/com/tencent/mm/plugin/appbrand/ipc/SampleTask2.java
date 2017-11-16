package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class SampleTask2
  extends MainProcessTask
{
  public static final Parcelable.Creator<SampleTask2> CREATOR;
  
  static
  {
    GMTrace.i(10289533681664L, 76663);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10289533681664L, 76663);
  }
  
  public SampleTask2()
  {
    GMTrace.i(10289265246208L, 76661);
    GMTrace.o(10289265246208L, 76661);
  }
  
  public final void RY()
  {
    GMTrace.i(10289399463936L, 76662);
    w.e("SampleTask2", "Run in Main Process");
    GMTrace.o(10289399463936L, 76662);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\SampleTask2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */