package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.kernel.h;
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

public final class JsApiSetBackgroundAudioState
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 160;
  public static final String NAME = "setBackgroundAudioState";
  public static int iaO;
  public SetBackgroundAudioStateTask iaP;
  
  static
  {
    GMTrace.i(19714302541824L, 146883);
    iaO = 0;
    GMTrace.o(19714302541824L, 146883);
  }
  
  public JsApiSetBackgroundAudioState()
  {
    GMTrace.i(19714034106368L, 146881);
    GMTrace.o(19714034106368L, 146881);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19714168324096L, 146882);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null", null));
      w.e("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState data is null");
      GMTrace.o(19714168324096L, 146882);
      return;
    }
    ??? = paramj.hyD;
    w.i("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState appId:%s ,data:%s", new Object[] { ???, paramJSONObject.toString() });
    if (this.iaP == null) {
      this.iaP = new SetBackgroundAudioStateTask(this, paramj, paramInt);
    }
    this.iaP.hYL = paramInt;
    this.iaP.appId = ((String)???);
    this.iaP.iam = paramJSONObject.toString();
    final AppBrandSysConfig localAppBrandSysConfig1 = com.tencent.mm.plugin.appbrand.a.nK((String)???);
    this.iaP.eII = localAppBrandSysConfig1.hRg.hKB;
    this.iaP.eEs = localAppBrandSysConfig1.eEs;
    this.iaP.eIH = localAppBrandSysConfig1.eAr;
    w.i("MicroMsg.JsApiSetBackgroundAudioState", "pkgType:%d, brandName:%s, appUserName", new Object[] { Integer.valueOf(this.iaP.eII), this.iaP.eEs, this.iaP.eIH });
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
              GMTrace.i(19745441054720L, 147115);
              String str = localObject.getString("appId", "");
              int i = localObject.getInt("pkgType", 0);
              if (((!str.equals(paramAnonymousString)) || (i != paramAnonymousInt)) && (localObject.gz("setBackgroundAudioState#isPlaying")) && (com.tencent.mm.plugin.appbrand.c.nX(str) != com.tencent.mm.plugin.appbrand.c.a.hyn))
              {
                w.i("MicroMsg.JsApiSetBackgroundAudioState", "onStickyBannerChanged, pause the music");
                paramAnonymousString = new JSONObject();
              }
              try
              {
                paramAnonymousString.put("operationType", "pause");
                if (JsApiSetBackgroundAudioState.this.iaP == null) {
                  JsApiSetBackgroundAudioState.this.iaP = new JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask(JsApiSetBackgroundAudioState.this, paramj, paramInt);
                }
                JsApiSetBackgroundAudioState.this.iaP.iam = paramAnonymousString.toString();
                JsApiSetBackgroundAudioState.this.iaP.appId = str;
                JsApiSetBackgroundAudioState.this.iaP.hTC = localObject;
                JsApiSetBackgroundAudioState.this.iaP.eII = localAppBrandSysConfig1.hRg.hKB;
                JsApiSetBackgroundAudioState.this.iaP.eEs = localAppBrandSysConfig1.eEs;
                JsApiSetBackgroundAudioState.this.iaP.eIH = localAppBrandSysConfig1.eAr;
                AppBrandMainProcessService.a(JsApiSetBackgroundAudioState.this.iaP);
                GMTrace.o(19745441054720L, 147115);
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
                GMTrace.i(19713899888640L, 146880);
                String str = localObject.getString("appId", "");
                w.i("MicroMsg.JsApiSetBackgroundAudioState", "onDestroy, appId:%s", new Object[] { str });
                JSONObject localJSONObject = new JSONObject();
                try
                {
                  localJSONObject.put("operationType", "stop");
                  if (JsApiSetBackgroundAudioState.this.iaP == null) {
                    JsApiSetBackgroundAudioState.this.iaP = new JsApiSetBackgroundAudioState.SetBackgroundAudioStateTask(JsApiSetBackgroundAudioState.this, paramj, paramInt);
                  }
                  JsApiSetBackgroundAudioState.this.iaP.iam = localJSONObject.toString();
                  JsApiSetBackgroundAudioState.this.iaP.appId = str;
                  JsApiSetBackgroundAudioState.this.iaP.action = -1;
                  JsApiSetBackgroundAudioState.this.iaP.hTC = localObject;
                  JsApiSetBackgroundAudioState.this.iaP.eII = localAppBrandSysConfig1.hRg.hKB;
                  JsApiSetBackgroundAudioState.this.iaP.eEs = localAppBrandSysConfig1.eEs;
                  JsApiSetBackgroundAudioState.this.iaP.eIH = localAppBrandSysConfig1.eAr;
                  AppBrandMainProcessService.b(JsApiSetBackgroundAudioState.this.iaP);
                  GMTrace.o(19713899888640L, 146880);
                  return;
                }
                catch (JSONException localJSONException)
                {
                  for (;;) {}
                }
              }
            };
            ((u.b)???).o("AppBrandLifeCycle.Listener", paramj);
            this.iaP.ial = paramj;
          }
          this.iaP.iak = paramJSONObject;
          this.iaP.hTC = ((u.b)???);
          AppBrandMainProcessService.a(this.iaP);
          GMTrace.o(19714168324096L, 146882);
          return;
        }
      }
    }
  }
  
  private static class SetBackgroundAudioStateTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<SetBackgroundAudioStateTask> CREATOR;
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
      GMTrace.i(19726650572800L, 146975);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19726650572800L, 146975);
    }
    
    public SetBackgroundAudioStateTask(Parcel paramParcel)
    {
      GMTrace.i(19725711048704L, 146968);
      this.hZR = false;
      this.hZP = "";
      this.ian = new com.tencent.mm.sdk.b.c() {};
      f(paramParcel);
      GMTrace.o(19725711048704L, 146968);
    }
    
    public SetBackgroundAudioStateTask(com.tencent.mm.plugin.appbrand.jsapi.a parama, j paramj, int paramInt)
    {
      GMTrace.i(19725576830976L, 146967);
      this.hZR = false;
      this.hZP = "";
      this.ian = new com.tencent.mm.sdk.b.c() {};
      this.hYJ = parama;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19725576830976L, 146967);
    }
    
    public final void RY()
    {
      GMTrace.i(19725845266432L, 146969);
      w.i("MicroMsg.JsApiSetBackgroundAudioState", "runInMainProcess");
      String str3;
      String str4;
      String str5;
      String str6;
      String str7;
      boolean bool;
      int i;
      try
      {
        localObject2 = new JSONObject(this.iam);
        str3 = ((JSONObject)localObject2).optString("src");
        str4 = ((JSONObject)localObject2).optString("title");
        str5 = ((JSONObject)localObject2).optString("epname");
        str6 = ((JSONObject)localObject2).optString("singer");
        str2 = ((JSONObject)localObject2).optString("coverImgUrl");
        str7 = ((JSONObject)localObject2).optString("webUrl");
        bool = ((JSONObject)localObject2).optBoolean("isLive", false);
        i = ((JSONObject)localObject2).optInt("startTime", 0);
        String str1 = com.tencent.mm.plugin.appbrand.media.c.a.irp.irn;
        localObject2 = ((JSONObject)localObject2).optString("operationType");
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          break label357;
        }
        w.i("MicroMsg.JsApiSetBackgroundAudioState", "come from onStickyBannerChanged pause or lifeCycleListener onDestroy");
        str1 = com.tencent.mm.plugin.appbrand.media.c.a.irp.irn;
        if ((!bg.nm(str1)) && (!str1.equals(this.appId)))
        {
          w.i("MicroMsg.JsApiSetBackgroundAudioState", "appid not match cannot operate, preAppId:%s, appId:%s", new Object[] { str1, this.appId });
          GMTrace.o(19725845266432L, 146969);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "new json exists exception, data is invalid");
        this.hZR = true;
        this.action = -1;
        this.hZP = "parser data fail, data is invalid";
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "exception:%s" + localJSONException.getMessage());
        GMTrace.o(19725845266432L, 146969);
        return;
      }
      this.hZR = false;
      this.action = -1;
      if (((String)localObject2).equalsIgnoreCase("pause")) {
        if (com.tencent.mm.at.c.JV())
        {
          w.i("MicroMsg.JsApiSetBackgroundAudioState", "pause music ok");
          this.action = -2;
        }
      }
      for (;;)
      {
        VL();
        GMTrace.o(19725845266432L, 146969);
        return;
        this.hZR = true;
        this.hZP = "pause music fail";
        continue;
        if (((String)localObject2).equalsIgnoreCase("stop")) {
          if (com.tencent.mm.at.c.JW())
          {
            w.i("MicroMsg.JsApiSetBackgroundAudioState", "stop music ok");
            this.action = -2;
          }
          else
          {
            this.hZR = true;
            this.hZP = "stop music fail";
          }
        }
      }
      label357:
      if (TextUtils.isEmpty(str3))
      {
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "src is null");
        this.hZR = true;
        this.action = -1;
        this.hZP = "src is null";
        VL();
        GMTrace.o(19725845266432L, 146969);
        return;
      }
      Object localObject2 = new jn();
      ((jn)localObject2).eNp.action = 10;
      ((jn)localObject2).eNp.state = "preempted";
      ((jn)localObject2).eNp.appId = this.appId;
      ((jn)localObject2).eNp.eNr = true;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      w.i("MicroMsg.JsApiSetBackgroundAudioState", "src;%s, title:%s, epname:%s, singer:%s, coverImgUrl:%s, isLive:%b, webUrl:%s, startTime:%d", new Object[] { str3, str4, str5, str6, str2, Boolean.valueOf(bool), str7, Integer.valueOf(i) });
      if (!bg.nm(localJSONException))
      {
        w.i("MicroMsg.JsApiSetBackgroundAudioState", "remove listener preAppid is %s, appid is %s", new Object[] { localJSONException, this.appId });
        com.tencent.mm.plugin.appbrand.media.c.a.irp.qi(localJSONException);
      }
      Object localObject1 = str2;
      if (str2 == null) {
        localObject1 = "";
      }
      String str2 = new StringBuilder().append(this.appId).append(str3).append((String)localObject1).toString().hashCode();
      localObject1 = ((com.tencent.mm.at.a.a)h.h(com.tencent.mm.at.a.a.class)).a(11, (String)localObject1, str4, str6, str7, str3, str3, str2, com.tencent.mm.compatible.util.e.ghz, com.tencent.mm.plugin.n.b.yU() + ((String)localObject1).hashCode(), str5, "");
      ((apv)localObject1).grQ = (i * 1000);
      com.tencent.mm.plugin.appbrand.media.c.a.irp.a(this.ian, this.appId);
      com.tencent.mm.plugin.appbrand.media.c.a.irp.c(this.appId, this.eII, this.eEs, this.eIH);
      com.tencent.mm.plugin.appbrand.media.c.a.irp.iro = ((apv)localObject1).ucY;
      com.tencent.mm.at.b.b((apv)localObject1);
      w.i("MicroMsg.JsApiSetBackgroundAudioState", "runInMainProcess startPlayMusic");
      w.i("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
      this.hZR = false;
      this.action = -1;
      VL();
      GMTrace.o(19725845266432L, 146969);
    }
    
    public final void VK()
    {
      GMTrace.i(19725979484160L, 146970);
      if (this.hYK == null)
      {
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "service is null, don't callback");
        GMTrace.o(19725979484160L, 146970);
        return;
      }
      if (this.action == -1)
      {
        if (!this.hZR)
        {
          w.i("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState ok");
          this.hYK.v(this.hYL, this.hYJ.d("ok", null));
          GMTrace.o(19725979484160L, 146970);
          return;
        }
        w.e("MicroMsg.JsApiSetBackgroundAudioState", "setBackgroundAudioState fail:%s", new Object[] { this.hZP });
        this.hYK.v(this.hYL, this.hYJ.d("fail:" + this.hZP, null));
        GMTrace.o(19725979484160L, 146970);
        return;
      }
      if (this.action == -2)
      {
        w.i("MicroMsg.JsApiSetBackgroundAudioState", "NOT_CALLBACK_EVENT, do nothing");
        GMTrace.o(19725979484160L, 146970);
        return;
      }
      switch (this.action)
      {
      }
      for (;;)
      {
        w.i("MicroMsg.JsApiSetBackgroundAudioState", "runInClientProcess callback action:%d, retJson:%s, lockCount:%d", new Object[] { Integer.valueOf(this.action), this.iae, Integer.valueOf(JsApiSetBackgroundAudioState.iaO) });
        com.tencent.mm.plugin.appbrand.jsapi.e locale = new JsApiOperateBackgroundAudio.a().a(this.hYK);
        locale.mData = this.iae;
        locale.VR();
        GMTrace.o(19725979484160L, 146970);
        return;
        this.hTC.o("setBackgroundAudioState#isPlaying", Boolean.valueOf(true));
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
          this.hTC.o("setBackgroundAudioState#isPlaying", Boolean.valueOf(false));
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
      GMTrace.i(19726113701888L, 146971);
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
        GMTrace.o(19726113701888L, 146971);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19726247919616L, 146972);
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
        GMTrace.o(19726247919616L, 146972);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiSetBackgroundAudioState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */