package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Set;

public abstract class GWMainProcessTask
  implements Parcelable
{
  private static final Set<Object> lGl;
  Messenger hXl;
  String hXm;
  
  static
  {
    GMTrace.i(16947806732288L, 126271);
    lGl = new HashSet();
    GMTrace.o(16947806732288L, 126271);
  }
  
  public GWMainProcessTask()
  {
    GMTrace.i(16946598772736L, 126262);
    this.hXm = (Process.myPid() + hashCode());
    GMTrace.o(16946598772736L, 126262);
  }
  
  public abstract void RY();
  
  public void VK()
  {
    GMTrace.i(16946867208192L, 126264);
    GMTrace.o(16946867208192L, 126264);
  }
  
  public final boolean VL()
  {
    GMTrace.i(16947404079104L, 126268);
    if (this.hXl == null)
    {
      GMTrace.o(16947404079104L, 126268);
      return false;
    }
    Message localMessage = Message.obtain();
    localMessage.setData(GameWebViewMainProcessService.a(this, false));
    try
    {
      this.hXl.send(localMessage);
      GMTrace.o(16947404079104L, 126268);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.GWMainProcessTask", localException.getMessage());
      GMTrace.o(16947404079104L, 126268);
    }
    return false;
  }
  
  public final void VM()
  {
    GMTrace.i(16947538296832L, 126269);
    lGl.add(this);
    GMTrace.o(16947538296832L, 126269);
  }
  
  public final void VN()
  {
    GMTrace.i(16947672514560L, 126270);
    lGl.remove(this);
    GMTrace.o(16947672514560L, 126270);
  }
  
  public int describeContents()
  {
    GMTrace.i(16947269861376L, 126267);
    GMTrace.o(16947269861376L, 126267);
    return 0;
  }
  
  public void f(Parcel paramParcel)
  {
    GMTrace.i(16947001425920L, 126265);
    GMTrace.o(16947001425920L, 126265);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16947135643648L, 126266);
    GMTrace.o(16947135643648L, 126266);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\GWMainProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */