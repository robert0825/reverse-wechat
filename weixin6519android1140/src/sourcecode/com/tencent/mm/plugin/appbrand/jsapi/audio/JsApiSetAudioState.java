package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class JsApiSetAudioState
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 292;
  public static final String NAME = "setAudioState";
  private SetAudioTask iaM;
  
  public JsApiSetAudioState()
  {
    GMTrace.i(19749064933376L, 147142);
    GMTrace.o(19749064933376L, 147142);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19749199151104L, 147143);
    if (!JsApiCreateAudioInstance.hZN)
    {
      w.e("MicroMsg.JsApiSetAudioState", "can't do operateAudio, App is paused or background");
      paramj.v(paramInt, d("fail:App is paused or background", null));
      GMTrace.o(19749199151104L, 147143);
      return;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiSetAudioState", "setAudioState data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19749199151104L, 147143);
      return;
    }
    w.i("MicroMsg.JsApiSetAudioState", "setAudioState data:%s", new Object[] { paramJSONObject.toString() });
    String str1 = paramJSONObject.optString("audioId");
    int i = paramJSONObject.optInt("startTime", 0);
    String str2 = paramJSONObject.optString("src");
    boolean bool1 = paramJSONObject.optBoolean("autoplay", false);
    boolean bool2 = paramJSONObject.optBoolean("loop", false);
    if (TextUtils.isEmpty(str1))
    {
      w.e("MicroMsg.JsApiSetAudioState", "audioId is empty");
      paramj.v(paramInt, d("fail:audioId is empty", null));
      GMTrace.o(19749199151104L, 147143);
      return;
    }
    if (TextUtils.isEmpty(str2))
    {
      w.e("MicroMsg.JsApiSetAudioState", "src is empty");
      paramj.v(paramInt, d("fail:src is empty", null));
      GMTrace.o(19749199151104L, 147143);
      return;
    }
    if (this.iaM == null) {
      this.iaM = new SetAudioTask(this, paramj, paramInt);
    }
    this.iaM.appId = paramj.hyD;
    this.iaM.eAL = str1;
    this.iaM.grY = str2;
    this.iaM.grQ = i;
    this.iaM.grR = bool1;
    this.iaM.grS = bool2;
    paramJSONObject = this.iaM;
    if (paramj.hzM == null)
    {
      w.e("MicroMsg.JsApiSetAudioState", "service.getRuntime() is null");
      paramj = "";
    }
    for (;;)
    {
      paramJSONObject.hKI = paramj;
      this.iaM.processName = ab.vM();
      AppBrandMainProcessService.a(this.iaM);
      GMTrace.o(19749199151104L, 147143);
      return;
      if (paramj.hzM.hyG == null)
      {
        w.e("MicroMsg.JsApiSetAudioState", "service.getRuntime().getSysConfig() is null");
        paramj = "";
      }
      else if (paramj.hzM.hyG.hRg == null)
      {
        w.e("MicroMsg.JsApiSetAudioState", "service.getRuntime().getSysConfig().appPkgInfo is null");
        paramj = "";
      }
      else
      {
        w.d("MicroMsg.JsApiSetAudioState", "getPkgPath:%s", new Object[] { paramj.hzM.hyG.hRg.hKI });
        paramj = paramj.hzM.hyG.hRg.hKI;
      }
    }
  }
  
  private static class SetAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<SetAudioTask> CREATOR;
    public int action;
    public String appId;
    public String eAL;
    public int grQ;
    public boolean grR;
    public boolean grS;
    public String grY;
    public String hKI;
    private com.tencent.mm.plugin.appbrand.jsapi.d hYJ;
    public j hYK;
    public int hYL;
    public String hZP;
    public boolean hZR;
    public String iae;
    private com.tencent.mm.sdk.b.c iaf;
    public String processName;
    
    static
    {
      GMTrace.i(19734703636480L, 147035);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19734703636480L, 147035);
    }
    
    public SetAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19733898330112L, 147029);
      this.appId = "";
      this.eAL = "";
      this.grY = "";
      this.grQ = 0;
      this.grR = false;
      this.grS = false;
      this.processName = "";
      this.hZR = false;
      this.iaf = new com.tencent.mm.sdk.b.c() {};
      f(paramParcel);
      GMTrace.o(19733898330112L, 147029);
    }
    
    public SetAudioTask(com.tencent.mm.plugin.appbrand.jsapi.d paramd, j paramj, int paramInt)
    {
      GMTrace.i(19733764112384L, 147028);
      this.appId = "";
      this.eAL = "";
      this.grY = "";
      this.grQ = 0;
      this.grR = false;
      this.grS = false;
      this.processName = "";
      this.hZR = false;
      this.iaf = new com.tencent.mm.sdk.b.c() {};
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19733764112384L, 147028);
    }
    
    public final void RY()
    {
      GMTrace.i(19734032547840L, 147030);
      w.i("MicroMsg.JsApiSetAudioState", "runInMainProcess");
      this.action = -1;
      this.hZR = false;
      this.hZP = "";
      if (!JsApiCreateAudioInstance.hZN)
      {
        this.hZR = true;
        this.hZP = "can't do operateAudio, App is paused or background";
        w.e("MicroMsg.JsApiSetAudioState", "can't do operateAudio, App is paused or background");
      }
      label533:
      for (;;)
      {
        VL();
        GMTrace.o(19734032547840L, 147030);
        return;
        if (com.tencent.mm.ab.b.hH(this.eAL))
        {
          this.hZR = true;
          this.hZP = "is playing audio, not to start again";
          w.e("MicroMsg.JsApiSetAudioState", "is playing audio, not to start again");
        }
        else
        {
          w.i("MicroMsg.JsApiSetAudioState", "appId:%s, audioId:%s, src:%s, startTime:%d", new Object[] { this.appId, this.eAL, this.grY, Integer.valueOf(this.grQ) });
          com.tencent.mm.ab.a locala = new com.tencent.mm.ab.a();
          locala.eAL = this.eAL;
          locala.grP = this.grY;
          locala.grQ = this.grQ;
          locala.grR = this.grR;
          locala.grS = this.grS;
          locala.processName = this.processName;
          locala.fromScene = 0;
          Object localObject;
          if (this.grY.startsWith("wxfile://"))
          {
            localObject = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(this.appId, this.grY);
            if ((localObject == null) || (bg.nm(((AppBrandLocalMediaObject)localObject).gpy)))
            {
              this.hZR = true;
              this.hZP = "the file not exist for src";
              w.e("MicroMsg.JsApiSetAudioState", "the file not found for src %s", new Object[] { this.grY });
            }
          }
          for (;;)
          {
            if (this.hZR) {
              break label533;
            }
            com.tencent.mm.plugin.appbrand.media.b.rf(this.appId);
            com.tencent.mm.plugin.appbrand.media.b.rd(this.appId);
            com.tencent.mm.plugin.appbrand.media.b.b(this.appId, this.iaf);
            com.tencent.mm.plugin.appbrand.media.b.YE();
            w.i("MicroMsg.AudioPlayerHelper", "startAudio, audioId:%s, src:%s, startTime:%d, fromScene:%d", new Object[] { locala.eAL, locala.grP, Integer.valueOf(locala.grQ), Integer.valueOf(locala.fromScene) });
            localObject = new t();
            ((t)localObject).eAJ.action = 0;
            ((t)localObject).eAJ.eAL = locala.eAL;
            ((t)localObject).eAJ.eAN = locala;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
            break;
            locala.filePath = ((AppBrandLocalMediaObject)localObject).gpy;
            w.i("MicroMsg.JsApiSetAudioState", "filePath:%s", new Object[] { locala.filePath });
            continue;
            if ((!this.grY.startsWith("http://")) && (!this.grY.startsWith("https://")))
            {
              localObject = new com.tencent.mm.plugin.appbrand.media.a.a(this.grY, this.hKI);
              if (((com.tencent.mm.plugin.appbrand.media.a.a)localObject).irK == null)
              {
                this.hZR = true;
                this.hZP = "the file not exist for src";
                w.e("MicroMsg.JsApiSetAudioState", "the wxa audioDataSource not found for src %s", new Object[] { this.grY });
                VL();
                GMTrace.o(19734032547840L, 147030);
                return;
              }
              locala.filePath = this.grY;
              locala.grU = ((com.tencent.mm.ab.d)localObject);
            }
          }
        }
      }
    }
    
    public final void VK()
    {
      GMTrace.i(19734166765568L, 147031);
      if (this.hYK == null)
      {
        w.e("MicroMsg.JsApiSetAudioState", "server is null");
        GMTrace.o(19734166765568L, 147031);
        return;
      }
      if (this.action == -1)
      {
        if (this.hZR)
        {
          this.hYK.v(this.hYL, this.hYJ.d("fail:" + this.hZP, null));
          GMTrace.o(19734166765568L, 147031);
          return;
        }
        this.hYK.v(this.hYL, this.hYJ.d("ok", null));
        GMTrace.o(19734166765568L, 147031);
        return;
      }
      w.i("MicroMsg.JsApiSetAudioState", "runInClientProcess callback action:%d, retJson:%s", new Object[] { Integer.valueOf(this.action), this.iae });
      com.tencent.mm.plugin.appbrand.jsapi.e locale = new JsApiSetAudioState.a().a(this.hYK);
      locale.mData = this.iae;
      locale.VR();
      GMTrace.o(19734166765568L, 147031);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19734300983296L, 147032);
      this.appId = paramParcel.readString();
      this.eAL = paramParcel.readString();
      this.grY = paramParcel.readString();
      this.grQ = paramParcel.readInt();
      if (paramParcel.readInt() == 1)
      {
        bool1 = true;
        this.grR = bool1;
        if (paramParcel.readInt() != 1) {
          break label143;
        }
        bool1 = true;
        label68:
        this.grS = bool1;
        if (paramParcel.readInt() != 1) {
          break label148;
        }
      }
      label143:
      label148:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.hZR = bool1;
        this.hZP = paramParcel.readString();
        this.iae = paramParcel.readString();
        this.action = paramParcel.readInt();
        this.hKI = paramParcel.readString();
        this.processName = paramParcel.readString();
        GMTrace.o(19734300983296L, 147032);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label68;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = 1;
      GMTrace.i(19734435201024L, 147033);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.eAL);
      paramParcel.writeString(this.grY);
      paramParcel.writeInt(this.grQ);
      if (this.grR)
      {
        paramInt = 1;
        paramParcel.writeInt(paramInt);
        if (!this.grS) {
          break label140;
        }
        paramInt = 1;
        label66:
        paramParcel.writeInt(paramInt);
        if (!this.hZR) {
          break label145;
        }
      }
      label140:
      label145:
      for (paramInt = i;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.hZP);
        paramParcel.writeString(this.iae);
        paramParcel.writeInt(this.action);
        paramParcel.writeString(this.hKI);
        paramParcel.writeString(this.processName);
        GMTrace.o(19734435201024L, 147033);
        return;
        paramInt = 0;
        break;
        paramInt = 0;
        break label66;
      }
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = -2;
    private static final String NAME = "onAudioStateChange";
    
    public a()
    {
      GMTrace.i(19713228800000L, 146875);
      GMTrace.o(19713228800000L, 146875);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiSetAudioState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */