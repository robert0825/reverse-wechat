package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.be.a;
import com.tencent.mm.sdk.platformtools.w;

public class GameKeepPageTopTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<GameKeepPageTopTask> CREATOR;
  public boolean lGm;
  public String title;
  public int type;
  public String url;
  public String username;
  
  static
  {
    GMTrace.i(16960020545536L, 126362);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16960020545536L, 126362);
  }
  
  public GameKeepPageTopTask()
  {
    GMTrace.i(16959752110080L, 126360);
    GMTrace.o(16959752110080L, 126360);
  }
  
  public GameKeepPageTopTask(Parcel paramParcel)
  {
    GMTrace.i(16959886327808L, 126361);
    f(paramParcel);
    GMTrace.o(16959886327808L, 126361);
  }
  
  public final void RY()
  {
    GMTrace.i(16959215239168L, 126356);
    w.i("MicroMsg.GameKeepPageTopTask", "type = " + this.type);
    switch (this.type)
    {
    }
    for (;;)
    {
      GMTrace.o(16959215239168L, 126356);
      return;
      a locala = a.hfY;
      this.lGm = a.Ok();
      locala = a.hfY;
      this.url = a.Ol();
      GMTrace.o(16959215239168L, 126356);
      return;
      locala = a.hfY;
      a.p(this.url, this.title, this.username);
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(16959617892352L, 126359);
    GMTrace.o(16959617892352L, 126359);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    boolean bool = true;
    GMTrace.i(16959349456896L, 126357);
    this.type = paramParcel.readInt();
    if (paramParcel.readByte() == 1) {}
    for (;;)
    {
      this.lGm = bool;
      this.url = paramParcel.readString();
      this.title = paramParcel.readString();
      this.username = paramParcel.readString();
      GMTrace.o(16959349456896L, 126357);
      return;
      bool = false;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16959483674624L, 126358);
    paramParcel.writeInt(this.type);
    if (this.lGm) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeString(this.url);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.username);
      GMTrace.o(16959483674624L, 126358);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ipc\GameKeepPageTopTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */