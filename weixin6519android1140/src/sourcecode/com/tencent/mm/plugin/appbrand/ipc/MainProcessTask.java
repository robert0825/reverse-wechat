package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Set;

public abstract class MainProcessTask
  implements Parcelable
{
  private static final Set<Object> hXk;
  Messenger hXl;
  public String hXm;
  
  static
  {
    GMTrace.i(10283628101632L, 76619);
    hXk = new HashSet();
    GMTrace.o(10283628101632L, 76619);
  }
  
  public MainProcessTask()
  {
    GMTrace.i(10282420142080L, 76610);
    this.hXm = (Process.myPid() + hashCode());
    GMTrace.o(10282420142080L, 76610);
  }
  
  public abstract void RY();
  
  public void VK()
  {
    GMTrace.i(10282688577536L, 76612);
    GMTrace.o(10282688577536L, 76612);
  }
  
  public final boolean VL()
  {
    GMTrace.i(10283225448448L, 76616);
    if (this.hXl == null)
    {
      GMTrace.o(10283225448448L, 76616);
      return false;
    }
    Message localMessage = Message.obtain();
    localMessage.setData(AppBrandMainProcessService.a(this, false));
    try
    {
      this.hXl.send(localMessage);
      GMTrace.o(10283225448448L, 76616);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MainProcessTask", localException.getMessage());
      GMTrace.o(10283225448448L, 76616);
    }
    return false;
  }
  
  public final void VM()
  {
    GMTrace.i(10283359666176L, 76617);
    hXk.add(this);
    GMTrace.o(10283359666176L, 76617);
  }
  
  public final void VN()
  {
    GMTrace.i(10283493883904L, 76618);
    hXk.remove(this);
    GMTrace.o(10283493883904L, 76618);
  }
  
  public int describeContents()
  {
    GMTrace.i(10283091230720L, 76615);
    GMTrace.o(10283091230720L, 76615);
    return 0;
  }
  
  public void f(Parcel paramParcel)
  {
    GMTrace.i(10282822795264L, 76613);
    GMTrace.o(10282822795264L, 76613);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10282957012992L, 76614);
    GMTrace.o(10282957012992L, 76614);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\MainProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */