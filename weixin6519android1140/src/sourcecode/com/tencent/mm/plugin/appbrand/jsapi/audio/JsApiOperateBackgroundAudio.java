package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.at.b;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsApiOperateBackgroundAudio
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 161;
  public static final String NAME = "operateBackgroundAudio";
  public OperateBackgroundAudioTask iah;
  
  public JsApiOperateBackgroundAudio()
  {
    GMTrace.i(19747722756096L, 147132);
    GMTrace.o(19747722756096L, 147132);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19747856973824L, 147133);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio data is null");
      GMTrace.o(19747856973824L, 147133);
      return;
    }
    ??? = paramj.hyD;
    w.i("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio appId:%s", new Object[] { ??? });
    if (this.iah == null) {
      this.iah = new OperateBackgroundAudioTask(this, paramj, paramInt);
    }
    this.iah.hYL = paramInt;
    this.iah.appId = ((String)???);
    this.iah.iam = paramJSONObject.toString();
    final AppBrandSysConfig localAppBrandSysConfig1 = com.tencent.mm.plugin.appbrand.a.nK((String)???);
    this.iah.eII = localAppBrandSysConfig1.hRg.hKB;
    this.iah.eEs = localAppBrandSysConfig1.eEs;
    this.iah.eIH = localAppBrandSysConfig1.eAr;
    paramJSONObject = u.gy("AppBrandService#" + paramj.hashCode());
    for (;;)
    {
      synchronized (u.Av().p(paramJSONObject, true))
      {
        paramJSONObject = (com.tencent.mm.plugin.appbrand.ui.banner.e)((u.b)???).get("StickyBannerChangeListener", null);
        if (paramJSONObject == null)
        {
          paramJSONObject = new com.tencent.mm.plugin.appbrand.ui.banner.e()
          {
            public final void Y(String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(19745709490176L, 147117);
              String str = localObject.getString("appId", "");
              int i = localObject.getInt("pkgType", 0);
              if (((!str.equals(paramAnonymousString)) || (i != paramAnonymousInt)) && (localObject.gz("operateBackgroundAudio#isPlaying")) && (com.tencent.mm.plugin.appbrand.c.nX(str) != com.tencent.mm.plugin.appbrand.c.a.hyn))
              {
                w.i("MicroMsg.JsApiOperateBackgroundAudio", "onStickyBannerChanged, pause the music");
                paramAnonymousString = new JSONObject();
              }
              try
              {
                paramAnonymousString.put("operationType", "pause");
                if (JsApiOperateBackgroundAudio.this.iah == null) {
                  JsApiOperateBackgroundAudio.this.iah = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask(JsApiOperateBackgroundAudio.this, paramj, paramInt);
                }
                JsApiOperateBackgroundAudio.this.iah.iam = paramAnonymousString.toString();
                JsApiOperateBackgroundAudio.this.iah.appId = str;
                JsApiOperateBackgroundAudio.this.iah.hTC = localObject;
                JsApiOperateBackgroundAudio.this.iah.eII = localAppBrandSysConfig1.hRg.hKB;
                JsApiOperateBackgroundAudio.this.iah.eEs = localAppBrandSysConfig1.eEs;
                JsApiOperateBackgroundAudio.this.iah.eIH = localAppBrandSysConfig1.eAr;
                AppBrandMainProcessService.a(JsApiOperateBackgroundAudio.this.iah);
                GMTrace.o(19745709490176L, 147117);
                return;
              }
              catch (JSONException localJSONException)
              {
                for (;;) {}
              }
            }
          };
          AppBrandSysConfig localAppBrandSysConfig2 = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
          if (localAppBrandSysConfig2 != null) {
            ((u.b)???).o("pkgType", Integer.valueOf(localAppBrandSysConfig2.hRg.hKB));
          }
          ((u.b)???).o("StickyBannerChangeListener", paramJSONObject);
          ((u.b)???).o("appId", paramj.hyD);
          if ((c.b)((u.b)???).get("AppBrandLifeCycle.Listener", null) == null)
          {
            paramj = new c.b()
            {
              public final void onDestroy()
              {
                GMTrace.i(19727321661440L, 146980);
                String str = localObject.getString("appId", "");
                w.i("MicroMsg.JsApiOperateBackgroundAudio", "onDestroy, appId:%s", new Object[] { str });
                JSONObject localJSONObject = new JSONObject();
                try
                {
                  localJSONObject.put("operationType", "stop");
                  if (JsApiOperateBackgroundAudio.this.iah == null) {
                    JsApiOperateBackgroundAudio.this.iah = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask(JsApiOperateBackgroundAudio.this, paramj, paramInt);
                  }
                  JsApiOperateBackgroundAudio.this.iah.iam = localJSONObject.toString();
                  JsApiOperateBackgroundAudio.this.iah.appId = str;
                  JsApiOperateBackgroundAudio.this.iah.action = -1;
                  JsApiOperateBackgroundAudio.this.iah.hTC = localObject;
                  JsApiOperateBackgroundAudio.this.iah.eII = localAppBrandSysConfig1.hRg.hKB;
                  JsApiOperateBackgroundAudio.this.iah.eEs = localAppBrandSysConfig1.eEs;
                  JsApiOperateBackgroundAudio.this.iah.eIH = localAppBrandSysConfig1.eAr;
                  AppBrandMainProcessService.b(JsApiOperateBackgroundAudio.this.iah);
                  GMTrace.o(19727321661440L, 146980);
                  return;
                }
                catch (JSONException localJSONException)
                {
                  for (;;) {}
                }
              }
            };
            ((u.b)???).o("AppBrandLifeCycle.Listener", paramj);
            this.iah.ial = paramj;
          }
          this.iah.iak = paramJSONObject;
          this.iah.hTC = ((u.b)???);
          AppBrandMainProcessService.a(this.iah);
          GMTrace.o(19747856973824L, 147133);
          return;
        }
      }
    }
  }
  
  private static class OperateBackgroundAudioTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateBackgroundAudioTask> CREATOR;
    public int action;
    public String appId;
    public String eEs;
    public String eIH;
    public int eII;
    u.b hTC;
    private d hYJ;
    public j hYK;
    public int hYL;
    public String hZP;
    public boolean hZR;
    public String iae;
    com.tencent.mm.plugin.appbrand.ui.banner.e iak;
    c.b ial;
    public String iam;
    private final com.tencent.mm.sdk.b.c ian;
    
    static
    {
      GMTrace.i(19722087170048L, 146941);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19722087170048L, 146941);
    }
    
    public OperateBackgroundAudioTask(Parcel paramParcel)
    {
      GMTrace.i(19721147645952L, 146934);
      this.hZR = false;
      this.hZP = "";
      this.ian = new com.tencent.mm.sdk.b.c() {};
      f(paramParcel);
      GMTrace.o(19721147645952L, 146934);
    }
    
    public OperateBackgroundAudioTask(com.tencent.mm.plugin.appbrand.jsapi.a parama, j paramj, int paramInt)
    {
      GMTrace.i(19721013428224L, 146933);
      this.hZR = false;
      this.hZP = "";
      this.ian = new com.tencent.mm.sdk.b.c() {};
      this.hYJ = parama;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19721013428224L, 146933);
    }
    
    public final void RY()
    {
      GMTrace.i(19721281863680L, 146935);
      w.i("MicroMsg.JsApiOperateBackgroundAudio", "runInMainProcess");
      String str1 = com.tencent.mm.plugin.appbrand.media.c.a.irp.irn;
      if ((!bg.nm(str1)) && (!str1.equals(this.appId)))
      {
        w.i("MicroMsg.JsApiOperateBackgroundAudio", "appid not match cannot operate, preAppId:%s, appId:%s", new Object[] { str1, this.appId });
        this.hZR = true;
        this.hZP = "appid not match cannot operate";
        VL();
        GMTrace.o(19721281863680L, 146935);
        return;
      }
      String str2;
      int i;
      try
      {
        JSONObject localJSONObject = new JSONObject(this.iam);
        str2 = localJSONObject.optString("operationType");
        i = localJSONObject.optInt("currentTime", -1);
        if (TextUtils.isEmpty(str2))
        {
          w.e("MicroMsg.JsApiOperateBackgroundAudio", "operationType is null");
          this.hZR = true;
          this.action = -1;
          this.hZP = "operationType is null";
          VL();
          GMTrace.o(19721281863680L, 146935);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.JsApiOperateBackgroundAudio", "new json exists exception, data is invalid, jsonStr:%s", new Object[] { this.iam });
        this.hZR = true;
        this.action = -1;
        this.hZP = "parser data fail, data is invalid";
        w.e("MicroMsg.JsApiOperateBackgroundAudio", "exception:%s" + localJSONException.getMessage());
        VL();
        GMTrace.o(19721281863680L, 146935);
        return;
      }
      w.i("MicroMsg.JsApiOperateBackgroundAudio", "operationType;%s, currentTime:%d", new Object[] { str2, Integer.valueOf(i) });
      this.hZR = false;
      this.action = -1;
      if (str2.equalsIgnoreCase("play"))
      {
        if (!bg.nm(localJSONException))
        {
          w.i("MicroMsg.JsApiOperateBackgroundAudio", "remove listener preAppid is %s, appid is %s", new Object[] { localJSONException, this.appId });
          com.tencent.mm.plugin.appbrand.media.c.a.irp.qi(localJSONException);
        }
        com.tencent.mm.plugin.appbrand.media.c.a.irp.a(this.ian, this.appId);
        com.tencent.mm.plugin.appbrand.media.c.a.irp.c(this.appId, this.eII, this.eEs, this.eIH);
        apv localapv = b.JS();
        if (localapv != null) {
          com.tencent.mm.plugin.appbrand.media.c.a.irp.iro = localapv.ucY;
        }
        if (com.tencent.mm.at.c.JU()) {
          w.i("MicroMsg.JsApiOperateBackgroundAudio", "play music ok");
        }
      }
      for (;;)
      {
        if (this.hZR) {
          w.e("MicroMsg.JsApiOperateBackgroundAudio", this.hZP);
        }
        VL();
        GMTrace.o(19721281863680L, 146935);
        return;
        if (b.JQ())
        {
          this.hZR = true;
          this.hZP = "music is playing, don't play again";
        }
        else
        {
          this.hZR = true;
          this.hZP = "play music fail";
          continue;
          if (str2.equalsIgnoreCase("pause"))
          {
            if (com.tencent.mm.at.c.JV())
            {
              w.i("MicroMsg.JsApiOperateBackgroundAudio", "pause music ok");
            }
            else
            {
              this.hZR = true;
              this.hZP = "pause music fail";
            }
          }
          else if (str2.equalsIgnoreCase("seek"))
          {
            if (i < 0)
            {
              w.e("MicroMsg.JsApiOperateBackgroundAudio", "currentTime is invalid!");
              this.hZR = true;
              this.hZP = "currentTime is invalid";
            }
            else if (b.gG(i * 1000))
            {
              w.i("MicroMsg.JsApiOperateBackgroundAudio", "seek music ok");
            }
            else
            {
              this.hZR = true;
              this.hZP = "seek music fail";
            }
          }
          else if (str2.equalsIgnoreCase("stop"))
          {
            if (com.tencent.mm.at.c.JW())
            {
              w.i("MicroMsg.JsApiOperateBackgroundAudio", "stop music ok");
            }
            else
            {
              this.hZR = true;
              this.hZP = "stop music fail";
            }
          }
          else
          {
            w.e("MicroMsg.JsApiOperateBackgroundAudio", "operationType is invalid");
            this.hZR = true;
            this.hZP = "operationType is invalid";
          }
        }
      }
    }
    
    public final void VK()
    {
      GMTrace.i(19721416081408L, 146936);
      if (this.hYK == null)
      {
        w.e("MicroMsg.JsApiOperateBackgroundAudio", "service is null, don't callback");
        GMTrace.o(19721416081408L, 146936);
        return;
      }
      if (this.action == -1)
      {
        if (!this.hZR)
        {
          w.i("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio ok");
          this.hYK.v(this.hYL, this.hYJ.d("ok", null));
          GMTrace.o(19721416081408L, 146936);
          return;
        }
        w.e("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio fail:%s", new Object[] { this.hZP });
        this.hYK.v(this.hYL, this.hYJ.d("fail:" + this.hZP, null));
        GMTrace.o(19721416081408L, 146936);
        return;
      }
      switch (this.action)
      {
      }
      for (;;)
      {
        w.i("MicroMsg.JsApiOperateBackgroundAudio", "operateBackgroundAudio onBackgroundAudioStateChange callback action:%d, retJson:%s, lockCount:%d", new Object[] { Integer.valueOf(this.action), this.iae, Integer.valueOf(JsApiSetBackgroundAudioState.iaO) });
        com.tencent.mm.plugin.appbrand.jsapi.e locale = new JsApiOperateBackgroundAudio.a().a(this.hYK);
        locale.mData = this.iae;
        locale.VR();
        GMTrace.o(19721416081408L, 146936);
        return;
        this.hTC.o("operateBackgroundAudio#isPlaying", Boolean.valueOf(true));
        AppBrandStickyBannerLogic.a.d(this.iak);
        com.tencent.mm.plugin.appbrand.c.a(this.appId, this.ial);
        AppBrandMusicClientService.irl.irm = this.appId;
        if (JsApiSetBackgroundAudioState.iaO > 0)
        {
          JsApiSetBackgroundAudioState.iaO -= 1;
          this.hYK.hzM.RJ();
        }
        if (JsApiSetBackgroundAudioState.iaO == 0)
        {
          JsApiSetBackgroundAudioState.iaO += 1;
          this.hYK.hzM.RI();
          continue;
          this.hTC.o("operateBackgroundAudio#isPlaying", Boolean.valueOf(false));
          AppBrandStickyBannerLogic.a.c(this.iak);
          com.tencent.mm.plugin.appbrand.c.b(this.appId, this.ial);
          if (JsApiSetBackgroundAudioState.iaO > 0)
          {
            JsApiSetBackgroundAudioState.iaO -= 1;
            this.hYK.hzM.RJ();
          }
          AppBrandMusicClientService.irl.iX(this.action);
          continue;
          AppBrandMusicClientService.irl.iX(this.action);
        }
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(19721550299136L, 146937);
      this.appId = paramParcel.readString();
      this.iam = paramParcel.readString();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.hZR = bool;
        this.hZP = paramParcel.readString();
        this.iae = paramParcel.readString();
        this.action = paramParcel.readInt();
        this.eII = paramParcel.readInt();
        this.eEs = paramParcel.readString();
        this.eIH = paramParcel.readString();
        GMTrace.o(19721550299136L, 146937);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19721684516864L, 146938);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.iam);
      if (this.hZR) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.hZP);
        paramParcel.writeString(this.iae);
        paramParcel.writeInt(this.action);
        paramParcel.writeInt(this.eII);
        paramParcel.writeString(this.eEs);
        paramParcel.writeString(this.eIH);
        GMTrace.o(19721684516864L, 146938);
        return;
      }
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 162;
    private static final String NAME = "onBackgroundAudioStateChange";
    
    public a()
    {
      GMTrace.i(19740609216512L, 147079);
      GMTrace.o(19740609216512L, 147079);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiOperateBackgroundAudio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */