package com.tencent.mm.plugin.game.gamewebview.jsapi;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public class GameJsApiActivityTask
  extends GameProcessActivityTask
{
  public static final Parcelable.Creator<GameJsApiActivityTask> CREATOR;
  public int hYL;
  public String iaE;
  public String lGC;
  public String lGD;
  public com.tencent.mm.plugin.game.gamewebview.ui.d lGz;
  
  static
  {
    GMTrace.i(17071421259776L, 127192);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17071421259776L, 127192);
  }
  
  public GameJsApiActivityTask(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17071152824320L, 127190);
    GMTrace.o(17071152824320L, 127190);
  }
  
  public GameJsApiActivityTask(Parcel paramParcel)
  {
    GMTrace.i(17071287042048L, 127191);
    f(paramParcel);
    GMTrace.o(17071287042048L, 127191);
  }
  
  public final void VK()
  {
    GMTrace.i(17070750171136L, 127187);
    if (this.lGz != null) {
      this.lGz.v(this.hYL, this.lGD);
    }
    GMTrace.o(17070750171136L, 127187);
  }
  
  public final void a(Context paramContext, final GameProcessActivityTask.a parama)
  {
    GMTrace.i(17070615953408L, 127186);
    w.i("MicroMsg.GameJsApiActivityTask", "runInMainProcess, apiName = %s", new Object[] { this.lGC });
    Object localObject = d.aDS();
    if (localObject != null)
    {
      localObject = (c)((Map)localObject).get(this.lGC);
      if (!(localObject instanceof e)) {
        ((a)localObject).a(paramContext, this.iaE, new GameJsApiMMTask.a()
        {
          public final void qp(String paramAnonymousString)
          {
            GMTrace.i(17072226566144L, 127198);
            GameJsApiActivityTask.this.lGD = paramAnonymousString;
            parama.WW();
            GMTrace.o(17072226566144L, 127198);
          }
        });
      }
    }
    GMTrace.o(17070615953408L, 127186);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(17070884388864L, 127188);
    this.iaE = paramParcel.readString();
    this.lGC = paramParcel.readString();
    this.lGD = paramParcel.readString();
    GMTrace.o(17070884388864L, 127188);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17071018606592L, 127189);
    paramParcel.writeString(this.iaE);
    paramParcel.writeString(this.lGC);
    paramParcel.writeString(this.lGD);
    GMTrace.o(17071018606592L, 127189);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\GameJsApiActivityTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */