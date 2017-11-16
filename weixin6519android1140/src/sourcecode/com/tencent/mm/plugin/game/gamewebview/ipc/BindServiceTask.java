package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class BindServiceTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<BindServiceTask> CREATOR;
  public Runnable hYr;
  
  static
  {
    GMTrace.i(16943511764992L, 126239);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16943511764992L, 126239);
  }
  
  public BindServiceTask()
  {
    GMTrace.i(16942572240896L, 126232);
    GMTrace.o(16942572240896L, 126232);
  }
  
  public BindServiceTask(Parcel paramParcel)
  {
    GMTrace.i(16943377547264L, 126238);
    GMTrace.o(16943377547264L, 126238);
  }
  
  public final void RY()
  {
    GMTrace.i(16942706458624L, 126233);
    VL();
    GMTrace.o(16942706458624L, 126233);
  }
  
  public final void VK()
  {
    GMTrace.i(16942840676352L, 126234);
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(16942840676352L, 126234);
  }
  
  public int describeContents()
  {
    GMTrace.i(16942974894080L, 126235);
    GMTrace.o(16942974894080L, 126235);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(16943243329536L, 126237);
    GMTrace.o(16943243329536L, 126237);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16943109111808L, 126236);
    GMTrace.o(16943109111808L, 126236);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\BindServiceTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */