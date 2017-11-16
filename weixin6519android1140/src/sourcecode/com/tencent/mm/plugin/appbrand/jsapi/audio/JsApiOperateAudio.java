package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.t;
import com.tencent.mm.g.a.t.b;
import com.tencent.mm.g.a.u;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class JsApiOperateAudio
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 297;
  public static final String NAME = "operateAudio";
  private OperateAudioTask iac;
  
  public JsApiOperateAudio()
  {
    GMTrace.i(19741951393792L, 147089);
    GMTrace.o(19741951393792L, 147089);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19742085611520L, 147090);
    if (!JsApiCreateAudioInstance.hZN)
    {
      w.e("MicroMsg.JsApiOperateAudio", "can't do operateAudio, App is paused or background");
      paramj.v(paramInt, d("fail:App is paused or background", null));
      GMTrace.o(19742085611520L, 147090);
      return;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiOperateAudio", "operateAudio data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19742085611520L, 147090);
      return;
    }
    w.i("MicroMsg.JsApiOperateAudio", "operateAudio appId:%s, data:%s", new Object[] { paramj.hyD, paramJSONObject.toString() });
    String str = paramJSONObject.optString("audioId");
    int i = paramJSONObject.optInt("currentTime", 0);
    paramJSONObject = paramJSONObject.optString("operationType");
    if (TextUtils.isEmpty(str))
    {
      w.e("MicroMsg.JsApiOperateAudio", "audioId is empty");
      paramj.v(paramInt, d("fail:audioId is empty", null));
      GMTrace.o(19742085611520L, 147090);
      return;
    }
    if (TextUtils.isEmpty(paramJSONObject))
    {
      w.e("MicroMsg.JsApiOperateAudio", "operationType is empty");
      paramj.v(paramInt, d("fail:operationType is empty", null));
      GMTrace.o(19742085611520L, 147090);
      return;
    }
    if (this.iac == null) {
      this.iac = new OperateAudioTask(this, paramj, paramInt);
    }
    this.iac.appId = paramj.hyD;
    this.iac.eAL = str;
    this.iac.eAM = i;
    this.iac.iad = paramJSONObject;
    AppBrandMainProcessService.a(this.iac);
    GMTrace.o(19742085611520L, 147090);
  }
  
  private static final class OperateAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateAudioTask> CREATOR;
    public int action;
    public String appId;
    public String eAL;
    public int eAM;
    private d hYJ;
    public j hYK;
    public int hYL;
    public String hZP;
    public boolean hZR;
    public String iad;
    public String iae;
    private c iaf;
    
    static
    {
      GMTrace.i(19737119555584L, 147053);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19737119555584L, 147053);
    }
    
    public OperateAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19736314249216L, 147047);
      this.appId = "";
      this.eAL = "";
      this.iad = "";
      this.eAM = 0;
      this.hZR = false;
      this.iaf = new c() {};
      f(paramParcel);
      GMTrace.o(19736314249216L, 147047);
    }
    
    public OperateAudioTask(d paramd, j paramj, int paramInt)
    {
      GMTrace.i(19736180031488L, 147046);
      this.appId = "";
      this.eAL = "";
      this.iad = "";
      this.eAM = 0;
      this.hZR = false;
      this.iaf = new c() {};
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19736180031488L, 147046);
    }
    
    public final void RY()
    {
      boolean bool1 = false;
      boolean bool3 = false;
      boolean bool2 = false;
      GMTrace.i(19736448466944L, 147048);
      w.i("MicroMsg.JsApiOperateAudio", "runInMainProcess");
      String str = com.tencent.mm.plugin.appbrand.media.b.YC();
      if (!JsApiCreateAudioInstance.hZN)
      {
        this.hZR = true;
        this.hZP = "can't do operateAudio, App is paused or background";
        w.e("MicroMsg.JsApiOperateAudio", "can't do operateAudio, App is paused or background");
        VL();
        GMTrace.o(19736448466944L, 147048);
        return;
      }
      if ((!bg.nm(str)) && (!str.equals(this.appId)))
      {
        w.i("MicroMsg.JsApiOperateAudio", "appid not match, cannot operate, currentPlayAppId:%s, appId:%s", new Object[] { str, this.appId });
        this.hZR = true;
        this.hZP = "appid not match,  cannot operate";
        VL();
        GMTrace.o(19736448466944L, 147048);
        return;
      }
      w.i("MicroMsg.JsApiOperateAudio", "operationType;%s, currentTime:%d", new Object[] { this.iad, Integer.valueOf(this.eAM) });
      this.hZR = false;
      this.action = -1;
      str = this.iad;
      if (str.equalsIgnoreCase("play"))
      {
        com.tencent.mm.plugin.appbrand.media.b.rf(this.appId);
        com.tencent.mm.plugin.appbrand.media.b.rd(this.appId);
        com.tencent.mm.plugin.appbrand.media.b.b(this.appId, this.iaf);
        str = this.eAL;
        if (!com.tencent.mm.ab.b.hI(str))
        {
          bool1 = com.tencent.mm.ab.b.hG(str);
          if (!bool1) {
            break label307;
          }
          w.i("MicroMsg.JsApiOperateAudio", "play audio ok");
          this.action = -1;
        }
      }
      for (;;)
      {
        if (this.hZR) {
          w.e("MicroMsg.JsApiOperateAudio", this.hZP);
        }
        VL();
        GMTrace.o(19736448466944L, 147048);
        return;
        bool1 = bool2;
        if (!com.tencent.mm.ab.b.hI(str)) {
          break;
        }
        bool1 = bool2;
        if (com.tencent.mm.ab.b.hH(str)) {
          break;
        }
        bool1 = com.tencent.mm.ab.b.hG(str);
        break;
        label307:
        if (com.tencent.mm.ab.b.hH(this.eAL))
        {
          this.hZR = true;
          this.hZP = "audio is playing, don't play again";
        }
        else
        {
          this.hZR = true;
          this.hZP = "play audio fail";
          continue;
          t localt;
          if (str.equalsIgnoreCase("pause"))
          {
            str = this.eAL;
            if (com.tencent.mm.ab.b.hH(str))
            {
              w.i("MicroMsg.AudioPlayerHelper", "pauseAudio, audioId:%s", new Object[] { str });
              localt = new t();
              localt.eAJ.action = 2;
              localt.eAJ.eAL = str;
              com.tencent.mm.sdk.b.a.vgX.m(localt);
              bool1 = localt.eAK.eAO;
            }
            if (bool1)
            {
              w.i("MicroMsg.JsApiOperateAudio", "pause audio ok");
              this.action = -1;
            }
            else
            {
              this.hZR = true;
              this.hZP = "pause audio fail";
            }
          }
          else if (str.equalsIgnoreCase("seek"))
          {
            if (this.eAM < 0)
            {
              w.e("MicroMsg.JsApiOperateAudio", "currentTime %d is invalid!", new Object[] { Integer.valueOf(this.eAM) });
              this.hZR = true;
              this.hZP = "currentTime is invalid";
            }
            else
            {
              str = this.eAL;
              int i = this.eAM;
              w.i("MicroMsg.AudioPlayerHelper", "seekToAudio, audioId:%s, currentTime:%d", new Object[] { str, Integer.valueOf(i) });
              localt = new t();
              localt.eAJ.action = 4;
              localt.eAJ.eAL = str;
              localt.eAJ.eAM = i;
              com.tencent.mm.sdk.b.a.vgX.m(localt);
              if (localt.eAK.eAO)
              {
                w.i("MicroMsg.JsApiOperateAudio", "seek audio ok");
                this.action = -1;
              }
              else
              {
                this.hZR = true;
                this.hZP = "seek audio fail";
              }
            }
          }
          else if (str.equalsIgnoreCase("stop"))
          {
            str = this.eAL;
            if (com.tencent.mm.ab.b.hI(str))
            {
              w.i("MicroMsg.AudioPlayerHelper", "stopAudio, audioId:%s", new Object[] { str });
              localt = new t();
              localt.eAJ.action = 3;
              localt.eAJ.eAL = str;
              com.tencent.mm.sdk.b.a.vgX.m(localt);
              bool1 = localt.eAK.eAO;
            }
            for (;;)
            {
              if (!bool1) {
                break label859;
              }
              this.action = -1;
              w.i("MicroMsg.JsApiOperateAudio", "stop audio ok");
              break;
              localt = new t();
              localt.eAJ.action = 13;
              localt.eAJ.eAL = str;
              com.tencent.mm.sdk.b.a.vgX.m(localt);
              bool1 = bool3;
              if (localt.eAK.eAO)
              {
                w.i("MicroMsg.AudioPlayerHelper", "stopAudioOnBackground, audioId:%s", new Object[] { str });
                localt = new t();
                localt.eAJ.action = 14;
                localt.eAJ.eAL = str;
                com.tencent.mm.sdk.b.a.vgX.m(localt);
                bool1 = localt.eAK.eAO;
              }
            }
            label859:
            this.hZR = true;
            this.hZP = "stop audio fail";
          }
          else
          {
            w.e("MicroMsg.JsApiOperateAudio", "operationType is invalid");
            this.hZR = true;
            this.hZP = "operationType is invalid";
          }
        }
      }
    }
    
    public final void VK()
    {
      GMTrace.i(19736582684672L, 147049);
      if (this.hYK == null)
      {
        w.e("MicroMsg.JsApiOperateAudio", "server is null");
        GMTrace.o(19736582684672L, 147049);
        return;
      }
      if (this.action == -1)
      {
        if (this.hZR)
        {
          this.hYK.v(this.hYL, this.hYJ.d("fail:" + this.hZP, null));
          GMTrace.o(19736582684672L, 147049);
          return;
        }
        this.hYK.v(this.hYL, this.hYJ.d("ok", null));
        GMTrace.o(19736582684672L, 147049);
        return;
      }
      w.i("MicroMsg.JsApiOperateAudio", "runInClientProcess callback action:%d, retJson:%s", new Object[] { Integer.valueOf(this.action), this.iae });
      e locale = new JsApiSetAudioState.a().a(this.hYK);
      locale.mData = this.iae;
      locale.VR();
      GMTrace.o(19736582684672L, 147049);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(19736716902400L, 147050);
      this.appId = paramParcel.readString();
      this.eAL = paramParcel.readString();
      this.iad = paramParcel.readString();
      this.eAM = paramParcel.readInt();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.hZR = bool;
        this.hZP = paramParcel.readString();
        this.iae = paramParcel.readString();
        this.action = paramParcel.readInt();
        GMTrace.o(19736716902400L, 147050);
        return;
        bool = false;
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19736851120128L, 147051);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.eAL);
      paramParcel.writeString(this.iad);
      paramParcel.writeInt(this.eAM);
      if (this.hZR) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.hZP);
        paramParcel.writeString(this.iae);
        paramParcel.writeInt(this.action);
        GMTrace.o(19736851120128L, 147051);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiOperateAudio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */