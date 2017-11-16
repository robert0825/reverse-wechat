package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class GameJsApiGetOpenDeviceId
  extends a
{
  public static final int CTRL_BYTE = 227;
  public static final String NAME = "getOpenDeviceId";
  
  public GameJsApiGetOpenDeviceId()
  {
    GMTrace.i(17035182473216L, 126922);
    GMTrace.o(17035182473216L, 126922);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17035316690944L, 126923);
    w.i("MicroMsg.GameJsApiGetOpenDeviceId", "invoke");
    Object localObject1 = new GetDeviceIdTask();
    GameWebViewMainProcessService.b((GWMainProcessTask)localObject1);
    Object localObject2 = paramd.aEs();
    if ((!bg.nm(((GetDeviceIdTask)localObject1).esG)) && (!bg.nm(((GetDeviceIdTask)localObject1).lHk)) && (!bg.nm((String)localObject2)))
    {
      paramJSONObject = aa.RP(aa.RP((String)localObject2 + ((GetDeviceIdTask)localObject1).esG));
      localObject1 = aa.RP(aa.RP((String)localObject2 + ((GetDeviceIdTask)localObject1).lHk));
      localObject2 = new HashMap();
      ((Map)localObject2).put("deviceid", paramJSONObject);
      ((Map)localObject2).put("newDeviceId", localObject1);
      paramd.v(paramInt, d("getOpenDeviceId:ok", (Map)localObject2));
      GMTrace.o(17035316690944L, 126923);
      return;
    }
    paramd.v(paramInt, a.d("getOpenDeviceId:fail", null));
    GMTrace.o(17035316690944L, 126923);
  }
  
  private static class GetDeviceIdTask
    extends GWMainProcessTask
  {
    public static final Parcelable.Creator<GetDeviceIdTask> CREATOR;
    public String esG;
    public String lHk;
    
    static
    {
      GMTrace.i(17037195739136L, 126937);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17037195739136L, 126937);
    }
    
    public GetDeviceIdTask()
    {
      GMTrace.i(17036927303680L, 126935);
      GMTrace.o(17036927303680L, 126935);
    }
    
    public GetDeviceIdTask(Parcel paramParcel)
    {
      GMTrace.i(17037061521408L, 126936);
      f(paramParcel);
      GMTrace.o(17037061521408L, 126936);
    }
    
    public final void RY()
    {
      GMTrace.i(17036524650496L, 126932);
      this.esG = p.sZ();
      this.lHk = p.ta();
      GMTrace.o(17036524650496L, 126932);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(17036658868224L, 126933);
      this.esG = paramParcel.readString();
      this.lHk = paramParcel.readString();
      GMTrace.o(17036658868224L, 126933);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17036793085952L, 126934);
      paramParcel.writeString(this.esG);
      paramParcel.writeString(this.lHk);
      GMTrace.o(17036793085952L, 126934);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\GameJsApiGetOpenDeviceId.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */