package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.base.model.d;
import com.tencent.mm.plugin.base.model.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class AddShortcutTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<AddShortcutTask> CREATOR;
  public String appId;
  public Runnable hYr;
  public boolean success;
  public String username;
  
  static
  {
    GMTrace.i(16949283127296L, 126282);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16949283127296L, 126282);
  }
  
  public AddShortcutTask()
  {
    GMTrace.i(16948343603200L, 126275);
    GMTrace.o(16948343603200L, 126275);
  }
  
  public AddShortcutTask(Parcel paramParcel)
  {
    GMTrace.i(16949148909568L, 126281);
    f(paramParcel);
    GMTrace.o(16949148909568L, 126281);
  }
  
  public final void RY()
  {
    GMTrace.i(16948477820928L, 126276);
    if ((bg.nm(this.appId)) || (bg.nm(this.username)))
    {
      w.e("MicroMsg.AddShortcutTask", "appid or username is null");
      this.success = false;
      GMTrace.o(16948477820928L, 126276);
      return;
    }
    d.a(ab.getContext(), this.username, this.appId, new d.a()
    {
      public final void dk(boolean paramAnonymousBoolean)
      {
        GMTrace.i(16945525030912L, 126254);
        AddShortcutTask.this.success = paramAnonymousBoolean;
        AddShortcutTask.this.VL();
        GMTrace.o(16945525030912L, 126254);
      }
    });
    GMTrace.o(16948477820928L, 126276);
  }
  
  public final void VK()
  {
    GMTrace.i(16948612038656L, 126277);
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(16948612038656L, 126277);
  }
  
  public int describeContents()
  {
    GMTrace.i(16948746256384L, 126278);
    GMTrace.o(16948746256384L, 126278);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    boolean bool = true;
    GMTrace.i(16948880474112L, 126279);
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    if (paramParcel.readByte() == 1) {}
    for (;;)
    {
      this.success = bool;
      GMTrace.o(16948880474112L, 126279);
      return;
      bool = false;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16949014691840L, 126280);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    if (this.success) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      GMTrace.o(16949014691840L, 126280);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\AddShortcutTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */