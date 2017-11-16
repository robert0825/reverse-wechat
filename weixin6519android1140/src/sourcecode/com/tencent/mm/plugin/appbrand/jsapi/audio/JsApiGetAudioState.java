package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ab.c;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.media.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class JsApiGetAudioState
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 293;
  public static final String NAME = "getAudioState";
  
  public JsApiGetAudioState()
  {
    GMTrace.i(19742219829248L, 147091);
    GMTrace.o(19742219829248L, 147091);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19742354046976L, 147092);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiGetAudioState", "getAudioState data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19742354046976L, 147092);
      return;
    }
    paramJSONObject = paramJSONObject.optString("audioId");
    if (TextUtils.isEmpty(paramJSONObject))
    {
      w.e("MicroMsg.JsApiGetAudioState", "getAudioState audioId is empty");
      paramj.v(paramInt, d("fail:audioId is empty", null));
      GMTrace.o(19742354046976L, 147092);
      return;
    }
    GetAudioStateTask localGetAudioStateTask = new GetAudioStateTask(this, paramj, paramInt);
    localGetAudioStateTask.appId = paramj.hyD;
    localGetAudioStateTask.eAL = paramJSONObject;
    AppBrandMainProcessService.a(localGetAudioStateTask);
    GMTrace.o(19742354046976L, 147092);
  }
  
  private static class GetAudioStateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetAudioStateTask> CREATOR;
    public String appId;
    public int duration;
    public String eAL;
    public int eAM;
    public int grQ;
    public int grX;
    public String grY;
    private d hYJ;
    public j hYK;
    public int hYL;
    public String hZP;
    public boolean hZR;
    public int hZS;
    
    static
    {
      GMTrace.i(19729066491904L, 146993);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19729066491904L, 146993);
    }
    
    public GetAudioStateTask(Parcel paramParcel)
    {
      GMTrace.i(19728395403264L, 146988);
      this.appId = "";
      this.eAL = "";
      this.duration = 0;
      this.hZR = false;
      f(paramParcel);
      GMTrace.o(19728395403264L, 146988);
    }
    
    public GetAudioStateTask(d paramd, j paramj, int paramInt)
    {
      GMTrace.i(19728261185536L, 146987);
      this.appId = "";
      this.eAL = "";
      this.duration = 0;
      this.hZR = false;
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19728261185536L, 146987);
    }
    
    public final void RY()
    {
      GMTrace.i(19728529620992L, 146989);
      Object localObject = b.YC();
      if ((!bg.nm((String)localObject)) && (!((String)localObject).equals(this.appId)))
      {
        w.i("MicroMsg.JsApiGetAudioState", "appId not match, cannot get audio state, currentPlayAppId:%s, appId:%s", new Object[] { localObject, this.appId });
        this.hZR = true;
        this.hZP = "appId not match, cannot get audio state";
        VL();
        GMTrace.o(19728529620992L, 146989);
        return;
      }
      localObject = this.eAL;
      t localt = new t();
      localt.eAJ.action = 6;
      localt.eAJ.eAL = ((String)localObject);
      com.tencent.mm.sdk.b.a.vgX.m(localt);
      localObject = localt.eAK.eAP;
      if (localObject == null)
      {
        w.e("MicroMsg.JsApiGetAudioState", "return parameter is invalid, audioState is null");
        this.hZR = true;
        this.hZP = "return parameter is invalid";
        VL();
        GMTrace.o(19728529620992L, 146989);
        return;
      }
      if ((((c)localObject).duration < 0) || (((c)localObject).eAM < 0))
      {
        w.e("MicroMsg.JsApiGetAudioState", "return parameter is invalid, duration:%d, currentTime:%d", new Object[] { Integer.valueOf(((c)localObject).duration), Integer.valueOf(((c)localObject).eAM) });
        this.hZR = true;
        this.hZP = "return parameter is invalid";
        VL();
        GMTrace.o(19728529620992L, 146989);
        return;
      }
      this.duration = ((c)localObject).duration;
      this.eAM = ((c)localObject).eAM;
      if (((c)localObject).grV) {}
      for (int i = 1;; i = 0)
      {
        this.hZS = i;
        this.grY = ((c)localObject).grY;
        this.grX = ((c)localObject).grX;
        this.grQ = ((c)localObject).grQ;
        w.d("MicroMsg.JsApiGetAudioState", "duration: %d , currentTime: %d ,paused: %d , buffered: %d , src: %s, startTime:%d", new Object[] { Integer.valueOf(this.duration), Integer.valueOf(this.eAM), Integer.valueOf(this.hZS), Integer.valueOf(this.grX), this.grY, Integer.valueOf(this.grQ) });
        VL();
        GMTrace.o(19728529620992L, 146989);
        return;
      }
    }
    
    public final void VK()
    {
      GMTrace.i(19728663838720L, 146990);
      if (this.hYK == null)
      {
        w.e("MicroMsg.JsApiGetAudioState", "service is null");
        GMTrace.o(19728663838720L, 146990);
        return;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("duration", Integer.valueOf(this.duration));
      localHashMap.put("currentTime", Integer.valueOf(this.eAM));
      boolean bool;
      if (this.hZS == 1)
      {
        bool = true;
        localHashMap.put("paused", Boolean.valueOf(bool));
        localHashMap.put("buffered", Integer.valueOf(this.grX));
        localHashMap.put("src", this.grY);
        localHashMap.put("startTime", Integer.valueOf(this.grQ));
        if (!TextUtils.isEmpty(this.hZP)) {
          break label223;
        }
      }
      label223:
      for (String str = "";; str = this.hZP)
      {
        if (!this.hZR) {
          break label231;
        }
        w.e("MicroMsg.JsApiGetAudioState", "getAudioState fail, err:%s", new Object[] { str });
        this.hYK.v(this.hYL, this.hYJ.d("fail:" + str, null));
        GMTrace.o(19728663838720L, 146990);
        return;
        bool = false;
        break;
      }
      label231:
      this.hYK.v(this.hYL, this.hYJ.d("ok", localHashMap));
      GMTrace.o(19728663838720L, 146990);
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19728798056448L, 146991);
      this.appId = paramParcel.readString();
      this.eAL = paramParcel.readString();
      this.duration = paramParcel.readInt();
      this.eAM = paramParcel.readInt();
      this.hZS = paramParcel.readInt();
      this.grX = paramParcel.readInt();
      this.grY = paramParcel.readString();
      this.grQ = paramParcel.readInt();
      GMTrace.o(19728798056448L, 146991);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19728932274176L, 146992);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.eAL);
      paramParcel.writeInt(this.duration);
      paramParcel.writeInt(this.eAM);
      paramParcel.writeInt(this.hZS);
      paramParcel.writeInt(this.grX);
      paramParcel.writeString(this.grY);
      paramParcel.writeInt(this.grQ);
      GMTrace.o(19728932274176L, 146992);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiGetAudioState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */