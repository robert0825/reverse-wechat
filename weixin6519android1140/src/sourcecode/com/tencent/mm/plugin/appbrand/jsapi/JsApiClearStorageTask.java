package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

class JsApiClearStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiClearStorageTask> CREATOR;
  public String appId;
  
  static
  {
    GMTrace.i(10433280868352L, 77734);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10433280868352L, 77734);
  }
  
  public JsApiClearStorageTask()
  {
    GMTrace.i(10432609779712L, 77729);
    GMTrace.o(10432609779712L, 77729);
  }
  
  public JsApiClearStorageTask(Parcel paramParcel)
  {
    GMTrace.i(10432743997440L, 77730);
    f(paramParcel);
    GMTrace.o(10432743997440L, 77730);
  }
  
  public final void RY()
  {
    GMTrace.i(10432878215168L, 77731);
    b localb = e.Sd();
    if (localb == null)
    {
      GMTrace.o(10432878215168L, 77731);
      return;
    }
    localb.clear(this.appId);
    GMTrace.o(10432878215168L, 77731);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(10433012432896L, 77732);
    this.appId = paramParcel.readString();
    GMTrace.o(10433012432896L, 77732);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10433146650624L, 77733);
    paramParcel.writeString(this.appId);
    GMTrace.o(10433146650624L, 77733);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\JsApiClearStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */