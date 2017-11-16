package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.at.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.media.c;
import com.tencent.mm.plugin.appbrand.media.c.a;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class JsApiGetBackgroundAudioState
  extends a
{
  public static final int CTRL_INDEX = 159;
  public static final String NAME = "getBackgroundAudioState";
  
  public JsApiGetBackgroundAudioState()
  {
    GMTrace.i(19731213975552L, 147009);
    GMTrace.o(19731213975552L, 147009);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19731348193280L, 147010);
    paramJSONObject = paramj.hyD;
    paramj = new GetBackgroundAudioStateTask(this, paramj, paramInt);
    paramj.appId = paramJSONObject;
    AppBrandMainProcessService.a(paramj);
    GMTrace.o(19731348193280L, 147010);
  }
  
  private static class GetBackgroundAudioStateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<GetBackgroundAudioStateTask> CREATOR;
    public String appId;
    public int duration;
    public int eAM;
    public int grQ;
    public int grX;
    public String grY;
    private com.tencent.mm.plugin.appbrand.jsapi.d hYJ;
    public j hYK;
    public int hYL;
    public String hZP;
    public boolean hZR;
    public int hZS;
    public String hZT;
    public String hZU;
    public String hZV;
    public String hZW;
    public int hZX;
    public String title;
    
    static
    {
      GMTrace.i(19741817176064L, 147088);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19741817176064L, 147088);
    }
    
    public GetBackgroundAudioStateTask(Parcel paramParcel)
    {
      GMTrace.i(19741146087424L, 147083);
      this.appId = "";
      this.duration = 0;
      this.hZR = false;
      f(paramParcel);
      GMTrace.o(19741146087424L, 147083);
    }
    
    public GetBackgroundAudioStateTask(com.tencent.mm.plugin.appbrand.jsapi.d paramd, j paramj, int paramInt)
    {
      GMTrace.i(19741011869696L, 147082);
      this.appId = "";
      this.duration = 0;
      this.hZR = false;
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19741011869696L, 147082);
    }
    
    public final void RY()
    {
      GMTrace.i(19741280305152L, 147084);
      Object localObject = c.a.irp.irn;
      if ((!bg.nm((String)localObject)) && (!((String)localObject).equals(this.appId)))
      {
        w.i("MicroMsg.JsApiGetBackgroundAudioState", "appid not match cannot get background audio state, preAppId:%s, appId:%s", new Object[] { localObject, this.appId });
        this.hZR = true;
        this.hZP = "appid not match cannot get background audio state";
        VL();
        GMTrace.o(19741280305152L, 147084);
        return;
      }
      localObject = b.JS();
      int j;
      int k;
      int m;
      if (localObject != null)
      {
        com.tencent.mm.at.d locald = b.JT();
        j = -1;
        i = -1;
        if (locald != null)
        {
          j = locald.kE;
          i = locald.jP;
        }
        if ((locald == null) || (j < 0) || (i < 0))
        {
          w.e("MicroMsg.JsApiGetBackgroundAudioState", "return parameter is invalid, duration_t:%d, position:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          this.hZR = true;
          this.hZP = "return parameter is invalid";
          VL();
          GMTrace.o(19741280305152L, 147084);
          return;
        }
        j /= 1000;
        k = i / 1000;
        m = locald.mStatus;
        i = locald.gOP;
        if (j <= 0) {
          break label456;
        }
      }
      label456:
      for (int i = i * j / 100;; i = 0)
      {
        this.duration = j;
        this.eAM = k;
        if (m == 1)
        {
          j = 0;
          this.hZS = j;
          this.grY = ((apv)localObject).uFw;
          this.grX = i;
          this.title = ((apv)localObject).uFs;
          this.hZT = ((apv)localObject).uFu;
          this.hZU = ((apv)localObject).uFt;
          this.hZV = ((apv)localObject).uFv;
          this.hZW = ((apv)localObject).uFy;
          this.hZX = 0;
          this.grQ = ((apv)localObject).grQ;
          w.d("MicroMsg.JsApiGetBackgroundAudioState", "duration: %d , currentTime: %d ,paused: %d , buffered: %d , src: %s, startTime:%d, title:%s, singer:%s, webUrl:%s, coverImgUrl:%s", new Object[] { Integer.valueOf(this.duration), Integer.valueOf(this.eAM), Integer.valueOf(this.hZS), Integer.valueOf(this.grX), this.grY, Integer.valueOf(this.grQ), this.title, this.hZU, this.hZW, this.hZV });
        }
        for (;;)
        {
          VL();
          GMTrace.o(19741280305152L, 147084);
          return;
          j = 1;
          break;
          w.e("MicroMsg.JsApiGetBackgroundAudioState", "currentWrapper is null");
          this.hZR = true;
          this.hZP = "currentWrapper is null";
        }
      }
    }
    
    public final void VK()
    {
      GMTrace.i(19741414522880L, 147085);
      if (this.hYK == null)
      {
        w.e("MicroMsg.JsApiGetBackgroundAudioState", "service is null");
        GMTrace.o(19741414522880L, 147085);
        return;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("duration", Integer.valueOf(this.duration));
      localHashMap.put("currentTime", Integer.valueOf(this.eAM));
      boolean bool;
      label209:
      label259:
      label282:
      j localj;
      int i;
      com.tencent.mm.plugin.appbrand.jsapi.d locald;
      if (this.hZS == 1)
      {
        bool = true;
        localHashMap.put("paused", Boolean.valueOf(bool));
        localHashMap.put("buffered", Integer.valueOf(this.grX));
        localHashMap.put("src", this.grY);
        localHashMap.put("title", this.title);
        localHashMap.put("epname", this.hZT);
        localHashMap.put("singer", this.hZU);
        localHashMap.put("coverImgUrl", this.hZV);
        localHashMap.put("webUrl", this.hZW);
        if (this.hZX != 1) {
          break label352;
        }
        bool = true;
        localHashMap.put("isLive", Boolean.valueOf(bool));
        localHashMap.put("startTime", Integer.valueOf(this.grQ / 1000));
        if (!TextUtils.isEmpty(this.hZP)) {
          break label357;
        }
        str = "";
        if (!this.hZR) {
          break label365;
        }
        w.e("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState fail, err:%s", new Object[] { str });
        localj = this.hYK;
        i = this.hYL;
        locald = this.hYJ;
        if (!this.hZR) {
          break label376;
        }
      }
      label352:
      label357:
      label365:
      label376:
      for (String str = "fail:" + str;; str = "ok")
      {
        localj.v(i, locald.d(str, localHashMap));
        GMTrace.o(19741414522880L, 147085);
        return;
        bool = false;
        break;
        bool = false;
        break label209;
        str = this.hZP;
        break label259;
        w.d("MicroMsg.JsApiGetBackgroundAudioState", "getBackgroundAudioState is ok");
        break label282;
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19741548740608L, 147086);
      this.appId = paramParcel.readString();
      this.duration = paramParcel.readInt();
      this.eAM = paramParcel.readInt();
      this.hZS = paramParcel.readInt();
      this.grX = paramParcel.readInt();
      this.grY = paramParcel.readString();
      this.title = paramParcel.readString();
      this.hZT = paramParcel.readString();
      this.hZU = paramParcel.readString();
      this.hZV = paramParcel.readString();
      this.hZW = paramParcel.readString();
      this.hZX = paramParcel.readInt();
      this.grQ = paramParcel.readInt();
      GMTrace.o(19741548740608L, 147086);
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19741682958336L, 147087);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.duration);
      paramParcel.writeInt(this.eAM);
      paramParcel.writeInt(this.hZS);
      paramParcel.writeInt(this.grX);
      paramParcel.writeString(this.grY);
      paramParcel.writeString(this.title);
      paramParcel.writeString(this.hZT);
      paramParcel.writeString(this.hZU);
      paramParcel.writeString(this.hZV);
      paramParcel.writeString(this.hZW);
      paramParcel.writeInt(this.hZX);
      paramParcel.writeInt(this.grQ);
      GMTrace.o(19741682958336L, 147087);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiGetBackgroundAudioState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */