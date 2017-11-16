package com.tencent.mm.plugin.webview.wepkg.model;

import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessTask;

public abstract class BaseWepkgProcessTask
  extends WepkgMainProcessTask
{
  public boolean eAO;
  
  public BaseWepkgProcessTask()
  {
    GMTrace.i(15180427689984L, 113103);
    this.eAO = false;
    GMTrace.o(15180427689984L, 113103);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(15180561907712L, 113104);
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.eAO = bool;
      j(paramParcel);
      GMTrace.o(15180561907712L, 113104);
      return;
    }
  }
  
  public abstract void j(Parcel paramParcel);
  
  public abstract void v(Parcel paramParcel, int paramInt);
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(15180830343168L, 113106);
    if (this.eAO) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeByte((byte)i);
      v(paramParcel, paramInt);
      GMTrace.o(15180830343168L, 113106);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\BaseWepkgProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */