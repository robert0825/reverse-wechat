package com.tencent.mm.plugin.webview.wepkg.ipc;

import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Set;

public abstract class WepkgMainProcessTask
  implements Parcelable
{
  private static final Set<Object> lGl;
  Messenger hXl;
  int mTaskId;
  
  static
  {
    GMTrace.i(12402926026752L, 92409);
    lGl = new HashSet();
    GMTrace.o(12402926026752L, 92409);
  }
  
  public WepkgMainProcessTask()
  {
    GMTrace.i(12401718067200L, 92400);
    GMTrace.o(12401718067200L, 92400);
  }
  
  public abstract void RY();
  
  public void VK()
  {
    GMTrace.i(12401986502656L, 92402);
    GMTrace.o(12401986502656L, 92402);
  }
  
  public final void VM()
  {
    GMTrace.i(12402657591296L, 92407);
    lGl.add(this);
    GMTrace.o(12402657591296L, 92407);
  }
  
  public final void VN()
  {
    GMTrace.i(12402791809024L, 92408);
    lGl.remove(this);
    GMTrace.o(12402791809024L, 92408);
  }
  
  public int describeContents()
  {
    GMTrace.i(12402389155840L, 92405);
    GMTrace.o(12402389155840L, 92405);
    return 0;
  }
  
  public void f(Parcel paramParcel)
  {
    GMTrace.i(12402120720384L, 92403);
    GMTrace.o(12402120720384L, 92403);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(12402254938112L, 92404);
    GMTrace.o(12402254938112L, 92404);
  }
  
  public final void xC()
  {
    GMTrace.i(12402523373568L, 92406);
    if (this.hXl == null)
    {
      GMTrace.o(12402523373568L, 92406);
      return;
    }
    Message localMessage = Message.obtain();
    localMessage.what = this.mTaskId;
    localMessage.setData(WepkgMainProcessService.c(this));
    try
    {
      this.hXl.send(localMessage);
      GMTrace.o(12402523373568L, 92406);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.Wepkg.WepkgMainProcessTask", localException.getMessage());
      GMTrace.o(12402523373568L, 92406);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\ipc\WepkgMainProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */