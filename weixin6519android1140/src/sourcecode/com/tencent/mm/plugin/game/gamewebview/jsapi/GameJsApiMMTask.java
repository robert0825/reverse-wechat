package com.tencent.mm.plugin.game.gamewebview.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

public class GameJsApiMMTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<GameJsApiMMTask> CREATOR;
  public int hYL;
  public String iaE;
  public String lGC;
  public String lGD;
  public com.tencent.mm.plugin.game.gamewebview.ui.d lGz;
  
  static
  {
    GMTrace.i(17028337369088L, 126871);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17028337369088L, 126871);
  }
  
  public GameJsApiMMTask()
  {
    GMTrace.i(17027934715904L, 126868);
    GMTrace.o(17027934715904L, 126868);
  }
  
  public GameJsApiMMTask(Parcel paramParcel)
  {
    GMTrace.i(17028068933632L, 126869);
    f(paramParcel);
    GMTrace.o(17028068933632L, 126869);
  }
  
  public final void RY()
  {
    GMTrace.i(17027397844992L, 126864);
    Object localObject = d.aDS();
    if (localObject != null)
    {
      localObject = (c)((Map)localObject).get(this.lGC);
      if (!(localObject instanceof e)) {
        ((a)localObject).a(ab.getContext(), this.iaE, new a()
        {
          public final void qp(String paramAnonymousString)
          {
            GMTrace.i(17070481735680L, 127185);
            GameJsApiMMTask.this.lGD = paramAnonymousString;
            GameJsApiMMTask.a(GameJsApiMMTask.this);
            GMTrace.o(17070481735680L, 127185);
          }
        });
      }
    }
    GMTrace.o(17027397844992L, 126864);
  }
  
  public final void VK()
  {
    GMTrace.i(17027532062720L, 126865);
    VN();
    if (this.lGz != null) {
      this.lGz.v(this.hYL, this.lGD);
    }
    GMTrace.o(17027532062720L, 126865);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(17027666280448L, 126866);
    this.iaE = paramParcel.readString();
    this.lGC = paramParcel.readString();
    this.lGD = paramParcel.readString();
    GMTrace.o(17027666280448L, 126866);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17027800498176L, 126867);
    paramParcel.writeString(this.iaE);
    paramParcel.writeString(this.lGC);
    paramParcel.writeString(this.lGD);
    GMTrace.o(17027800498176L, 126867);
  }
  
  public static abstract interface a
  {
    public abstract void qp(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\GameJsApiMMTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */