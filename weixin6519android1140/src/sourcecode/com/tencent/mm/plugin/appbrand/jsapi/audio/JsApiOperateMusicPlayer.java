package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsApiOperateMusicPlayer
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 47;
  public static final String NAME = "operateMusicPlayer";
  public OperateMusicPlayer iap;
  
  public JsApiOperateMusicPlayer()
  {
    GMTrace.i(19722221387776L, 146942);
    GMTrace.o(19722221387776L, 146942);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19722355605504L, 146943);
    this.iap = new OperateMusicPlayer(this, paramj, paramInt);
    Object localObject1 = u.gy("AppBrandService#" + paramj.hashCode());
    for (;;)
    {
      synchronized (u.Av().p((String)localObject1, true))
      {
        localObject1 = (com.tencent.mm.plugin.appbrand.ui.banner.e)???.get("StickyBannerChangeListener", null);
        if (localObject1 == null)
        {
          localObject1 = new com.tencent.mm.plugin.appbrand.ui.banner.e()
          {
            public final void Y(String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(19717121114112L, 146904);
              String str = localb.getString("appId", "");
              int i = localb.getInt("pkgType", 0);
              if (((!str.equals(paramAnonymousString)) || (i != paramAnonymousInt)) && (localb.gz("Music#isPlaying")) && (com.tencent.mm.plugin.appbrand.c.nX(str) != com.tencent.mm.plugin.appbrand.c.a.hyn)) {
                paramAnonymousString = new JSONObject();
              }
              try
              {
                paramAnonymousString.put("operationType", "pause");
                JsApiOperateMusicPlayer.OperateMusicPlayer localOperateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(JsApiOperateMusicPlayer.this, paramj, JsApiOperateMusicPlayer.this.iap.hYL);
                localOperateMusicPlayer.eOQ = paramAnonymousString.toString();
                localOperateMusicPlayer.eSd = str;
                localOperateMusicPlayer.hTC = localb;
                AppBrandMainProcessService.a(localOperateMusicPlayer);
                GMTrace.o(19717121114112L, 146904);
                return;
              }
              catch (JSONException localJSONException)
              {
                for (;;) {}
              }
            }
          };
          Object localObject2 = com.tencent.mm.plugin.appbrand.a.nK(paramj.hyD);
          if (localObject2 != null) {
            ???.o("pkgType", Integer.valueOf(((AppBrandSysConfig)localObject2).hRg.hKB));
          }
          ???.o("StickyBannerChangeListener", localObject1);
          ???.o("appId", paramj.hyD);
          if ((c.b)???.get("AppBrandLifeCycle.Listener", null) == null)
          {
            localObject2 = new c.b()
            {
              public final void a(c.c paramAnonymousc)
              {
                GMTrace.i(19748796497920L, 147140);
                String str = localb.getString("appId", "");
                int i = localb.getInt("pkgType", 0);
                switch (JsApiOperateMusicPlayer.3.hLp[paramAnonymousc.ordinal()])
                {
                }
                for (;;)
                {
                  GMTrace.o(19748796497920L, 147140);
                  return;
                  int j = com.tencent.mm.plugin.appbrand.a.nL(str).scene;
                  if ((AppBrandStickyBannerLogic.a.av(str, i)) || (j == 1023)) {
                    continue;
                  }
                  paramAnonymousc = new JSONObject();
                  try
                  {
                    paramAnonymousc.put("operationType", "pause");
                    JsApiOperateMusicPlayer.OperateMusicPlayer localOperateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(JsApiOperateMusicPlayer.this, paramj, JsApiOperateMusicPlayer.this.iap.hYL);
                    localOperateMusicPlayer.eOQ = paramAnonymousc.toString();
                    localOperateMusicPlayer.eSd = str;
                    localOperateMusicPlayer.hTC = localb;
                    AppBrandMainProcessService.a(localOperateMusicPlayer);
                  }
                  catch (JSONException localJSONException)
                  {
                    for (;;) {}
                  }
                }
              }
              
              public final void onDestroy()
              {
                GMTrace.i(19748930715648L, 147141);
                w.d("MicroMsg.JsApiOperateMusicPlayer", "onDestroy");
                String str = localb.getString("appId", "");
                localb.getInt("pkgType", 0);
                JSONObject localJSONObject = new JSONObject();
                try
                {
                  localJSONObject.put("operationType", "stop");
                  JsApiOperateMusicPlayer.OperateMusicPlayer localOperateMusicPlayer = new JsApiOperateMusicPlayer.OperateMusicPlayer(JsApiOperateMusicPlayer.this, paramj, JsApiOperateMusicPlayer.this.iap.hYL);
                  localOperateMusicPlayer.eOQ = localJSONObject.toString();
                  localOperateMusicPlayer.eSd = str;
                  localOperateMusicPlayer.action = -1;
                  localOperateMusicPlayer.hTC = localb;
                  AppBrandMainProcessService.b(localOperateMusicPlayer);
                  GMTrace.o(19748930715648L, 147141);
                  return;
                }
                catch (JSONException localJSONException)
                {
                  for (;;) {}
                }
              }
            };
            ???.o("AppBrandLifeCycle.Listener", localObject2);
            this.iap.ial = ((c.b)localObject2);
          }
          this.iap.iak = ((com.tencent.mm.plugin.appbrand.ui.banner.e)localObject1);
          this.iap.hTC = ???;
          this.iap.eOQ = paramJSONObject.toString();
          this.iap.eSd = paramj.hyD;
          AppBrandMainProcessService.a(this.iap);
          GMTrace.o(19722355605504L, 146943);
          return;
        }
      }
    }
  }
  
  private static class OperateMusicPlayer
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateMusicPlayer> CREATOR;
    public int action;
    public String eOQ;
    public String eSd;
    public String errorMsg;
    u.b hTC;
    private d hYJ;
    private j hYK;
    public int hYL;
    public boolean hZR;
    public String iae;
    com.tencent.mm.plugin.appbrand.ui.banner.e iak;
    c.b ial;
    public final com.tencent.mm.sdk.b.c ian;
    
    static
    {
      GMTrace.i(19724100435968L, 146956);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19724100435968L, 146956);
    }
    
    public OperateMusicPlayer(Parcel paramParcel)
    {
      GMTrace.i(19722624040960L, 146945);
      this.hZR = false;
      this.ian = new com.tencent.mm.sdk.b.c() {};
      f(paramParcel);
      GMTrace.o(19722624040960L, 146945);
    }
    
    public OperateMusicPlayer(d paramd, j paramj, int paramInt)
    {
      GMTrace.i(19722489823232L, 146944);
      this.hZR = false;
      this.ian = new com.tencent.mm.sdk.b.c() {};
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19722489823232L, 146944);
    }
    
    public final void RY()
    {
      GMTrace.i(19722758258688L, 146946);
      final Object localObject2;
      final String str1;
      final String str2;
      try
      {
        localObject2 = new JSONObject(this.eOQ);
        str1 = ((JSONObject)localObject2).optString("operationType");
        str2 = ((JSONObject)localObject2).optString("dataUrl");
        if (bg.nm(str1))
        {
          this.action = -1;
          this.hZR = true;
          this.errorMsg = "operationType is null or nil";
          VL();
          GMTrace.o(19722758258688L, 146946);
          return;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.JsApiOperateMusicPlayer", localException.toString());
        this.action = -1;
        this.hZR = true;
        this.errorMsg = "data is null";
        VL();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      if (!com.tencent.mm.plugin.appbrand.media.c.a.irp.be(this.eSd, str1))
      {
        w.i("MicroMsg.JsApiOperateMusicPlayer", "appid not match cannot operate");
        this.action = -1;
        this.hZR = true;
        this.errorMsg = "appid not match cannot operate";
        VL();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      final Object localObject1 = str1;
      if (com.tencent.mm.at.b.JR())
      {
        localObject1 = str1;
        if (!com.tencent.mm.at.b.JQ())
        {
          localObject1 = str1;
          if (str1.equalsIgnoreCase("play"))
          {
            localObject1 = com.tencent.mm.at.b.JS();
            if ((localObject1 == null) || ((!bg.nm(str2)) && (!str2.equals(((apv)localObject1).uFw)))) {
              break label346;
            }
            if (!com.tencent.mm.plugin.appbrand.media.c.a.irp.be(this.eSd, "resume")) {
              break label334;
            }
            w.i("MicroMsg.JsApiOperateMusicPlayer", "same appid %s, change play to resume", new Object[] { this.eSd });
            localObject1 = "resume";
          }
        }
      }
      while (((String)localObject1).equalsIgnoreCase("play"))
      {
        localObject1 = ((JSONObject)localObject2).optString("title");
        str1 = ((JSONObject)localObject2).optString("singer");
        final String str3 = ((JSONObject)localObject2).optString("epname");
        localObject2 = ((JSONObject)localObject2).optString("coverImgUrl");
        if (bg.nm(str2))
        {
          this.action = -1;
          this.hZR = true;
          this.errorMsg = "dataUrl is null or nil";
          VL();
          GMTrace.o(19722758258688L, 146946);
          return;
          label334:
          w.i("MicroMsg.JsApiOperateMusicPlayer", "not same not same appid ,restart play");
          localObject1 = str1;
          continue;
          label346:
          w.i("MicroMsg.JsApiOperateMusicPlayer", "data url has changed ,restart play");
          localObject1 = str1;
        }
        else
        {
          w.i("MicroMsg.JsApiOperateMusicPlayer", "title : %s, singer : %s, epName : %s, coverImgUrl : %s, dataUrl : %s, lowbandUrl : %s, webUrl : %s", new Object[] { localObject1, str1, str3, localObject2, str2, str2, str2 });
          com.tencent.mm.at.b.JO();
          String str4 = com.tencent.mm.plugin.appbrand.media.c.a.irp.irn;
          if (!bg.nm(str4))
          {
            w.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", new Object[] { str4, this.eSd });
            com.tencent.mm.plugin.appbrand.media.c.a.irp.qi(str4);
          }
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19717792202752L, 146909);
              Object localObject = new StringBuilder().append(JsApiOperateMusicPlayer.OperateMusicPlayer.this.eSd).append(str2).append(localObject2).toString().hashCode();
              localObject = ((com.tencent.mm.at.a.a)h.h(com.tencent.mm.at.a.a.class)).a(localObject2, localObject2, localObject1, str1, str2, str2, str2, (String)localObject, com.tencent.mm.compatible.util.e.ghz, com.tencent.mm.plugin.n.b.yU() + localObject2.hashCode(), str3, "");
              ((apv)localObject).uFJ = true;
              com.tencent.mm.at.b.b((apv)localObject);
              com.tencent.mm.plugin.appbrand.media.c.a.irp.a(JsApiOperateMusicPlayer.OperateMusicPlayer.this.ian, JsApiOperateMusicPlayer.OperateMusicPlayer.this.eSd);
              com.tencent.mm.plugin.appbrand.media.c.a.irp.irn = JsApiOperateMusicPlayer.OperateMusicPlayer.this.eSd;
              com.tencent.mm.plugin.appbrand.media.c.a.irp.iro = ((apv)localObject).ucY;
              w.i("MicroMsg.JsApiOperateMusicPlayer", "startPlayMusic");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.hZR = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.a(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19717792202752L, 146909);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
      }
      if (((String)localObject1).equalsIgnoreCase("resume"))
      {
        localObject1 = com.tencent.mm.plugin.appbrand.media.c.a.irp.irn;
        if (!bg.nm((String)localObject1))
        {
          w.i("MicroMsg.JsApiOperateMusicPlayer", "remove listener preAppid is %s, appid is %s", new Object[] { localObject1, this.eSd });
          com.tencent.mm.plugin.appbrand.media.c.a.irp.qi((String)localObject1);
        }
        com.tencent.mm.plugin.appbrand.media.c.a.irp.a(this.ian, this.eSd);
        com.tencent.mm.plugin.appbrand.media.c.a.irp.irn = this.eSd;
        localObject1 = com.tencent.mm.at.b.JS();
        if (localObject1 != null) {
          com.tencent.mm.plugin.appbrand.media.c.a.irp.iro = ((apv)localObject1).ucY;
        }
        if (com.tencent.mm.at.c.JU())
        {
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19740877651968L, 147081);
              w.i("MicroMsg.JsApiOperateMusicPlayer", "resume ok");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.hZR = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.b(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19740877651968L, 147081);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
        w.i("MicroMsg.JsApiOperateMusicPlayer", "resume fail");
        this.action = -1;
        this.hZR = true;
        this.errorMsg = "resume play fail";
        VL();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      if (((String)localObject1).equalsIgnoreCase("pause"))
      {
        if (com.tencent.mm.at.c.JV())
        {
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19742890917888L, 147096);
              w.i("MicroMsg.JsApiOperateMusicPlayer", "pause ok");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.hZR = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.c(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19742890917888L, 147096);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
        w.i("MicroMsg.JsApiOperateMusicPlayer", "pause fail");
        this.action = -1;
        this.hZR = true;
        this.errorMsg = "pause play fail";
        VL();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      if (((String)localObject1).equalsIgnoreCase("seek"))
      {
        if (com.tencent.mm.at.b.gG(bg.getInt(bg.bG(((JSONObject)localObject2).optString("position")), -1) * 1000))
        {
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19733629894656L, 147027);
              w.i("MicroMsg.JsApiOperateMusicPlayer", "seek ok");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.hZR = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.d(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19733629894656L, 147027);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
        w.i("MicroMsg.JsApiOperateMusicPlayer", "seek fail");
        this.action = -1;
        this.hZR = true;
        this.errorMsg = "seek fail";
        VL();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      if (((String)localObject1).equalsIgnoreCase("stop"))
      {
        if (com.tencent.mm.at.c.JW())
        {
          af.i(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19729871798272L, 146999);
              w.i("MicroMsg.JsApiOperateMusicPlayer", "stop ok");
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.action = -1;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.hZR = false;
              JsApiOperateMusicPlayer.OperateMusicPlayer.this.errorMsg = "";
              JsApiOperateMusicPlayer.OperateMusicPlayer.e(JsApiOperateMusicPlayer.OperateMusicPlayer.this);
              GMTrace.o(19729871798272L, 146999);
            }
          }, 500L);
          GMTrace.o(19722758258688L, 146946);
          return;
        }
        w.i("MicroMsg.JsApiOperateMusicPlayer", "stop fail");
        this.action = -1;
        this.hZR = false;
        this.errorMsg = "stop play fail";
        VL();
        GMTrace.o(19722758258688L, 146946);
        return;
      }
      this.action = -1;
      this.hZR = true;
      VL();
      GMTrace.o(19722758258688L, 146946);
    }
    
    public final void VK()
    {
      GMTrace.i(19722892476416L, 146947);
      w.i("MicroMsg.JsApiOperateMusicPlayer", "runInClientProcess(action : %s)", new Object[] { Integer.valueOf(this.action) });
      j localj = this.hYK;
      int i = this.hYL;
      d locald = this.hYJ;
      Object localObject;
      if (this.hZR)
      {
        StringBuilder localStringBuilder = new StringBuilder("fail");
        if (TextUtils.isEmpty(this.errorMsg))
        {
          localObject = "";
          localObject = (String)localObject;
          label90:
          localj.v(i, locald.d((String)localObject, null));
          switch (this.action)
          {
          }
        }
      }
      for (;;)
      {
        GMTrace.o(19722892476416L, 146947);
        return;
        localObject = ":" + this.errorMsg;
        break;
        localObject = "ok";
        break label90;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPlay in");
        localObject = new JsApiOperateMusicPlayer.c().a(this.hYK);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = this.iae;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        this.hTC.o("Music#isPlaying", Boolean.valueOf(true));
        AppBrandStickyBannerLogic.a.d(this.iak);
        com.tencent.mm.plugin.appbrand.c.a(this.hYK.hyD, this.ial);
        GMTrace.o(19722892476416L, 146947);
        return;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicResume in");
        this.hTC.o("Music#isPlaying", Boolean.valueOf(true));
        AppBrandStickyBannerLogic.a.d(this.iak);
        com.tencent.mm.plugin.appbrand.c.a(this.hYK.hyD, this.ial);
        GMTrace.o(19722892476416L, 146947);
        return;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicStop in");
        localObject = new JsApiOperateMusicPlayer.a().a(this.hYK);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = this.iae;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicEnd in");
        this.hTC.o("Music#isPlaying", Boolean.valueOf(false));
        AppBrandStickyBannerLogic.a.c(this.iak);
        com.tencent.mm.plugin.appbrand.c.b(this.hYK.hyD, this.ial);
        GMTrace.o(19722892476416L, 146947);
        return;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicPause in");
        localObject = new JsApiOperateMusicPlayer.b().a(this.hYK);
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).mData = this.iae;
        ((com.tencent.mm.plugin.appbrand.jsapi.e)localObject).VR();
        this.hTC.o("Music#isPlaying", Boolean.valueOf(false));
        AppBrandStickyBannerLogic.a.c(this.iak);
        com.tencent.mm.plugin.appbrand.c.b(this.hYK.hyD, this.ial);
        GMTrace.o(19722892476416L, 146947);
        return;
        w.i("MicroMsg.JsApiOperateMusicPlayer", "onMusicError in");
        this.hYK.h("onMusicError", this.iae, 0);
        this.hTC.o("Music#isPlaying", Boolean.valueOf(false));
        AppBrandStickyBannerLogic.a.c(this.iak);
        com.tencent.mm.plugin.appbrand.c.b(this.hYK.hyD, this.ial);
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19723026694144L, 146948);
      this.eOQ = paramParcel.readString();
      this.eSd = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.hZR = bool;
        this.iae = paramParcel.readString();
        this.action = paramParcel.readInt();
        this.errorMsg = paramParcel.readString();
        GMTrace.o(19723026694144L, 146948);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19723160911872L, 146949);
      paramParcel.writeString(this.eOQ);
      paramParcel.writeString(this.eSd);
      if (this.hZR) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        paramParcel.writeString(this.iae);
        paramParcel.writeInt(this.action);
        paramParcel.writeString(this.errorMsg);
        GMTrace.o(19723160911872L, 146949);
        return;
      }
    }
  }
  
  private static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 82;
    private static final String NAME = "onMusicEnd";
    
    public a()
    {
      GMTrace.i(19743696224256L, 147102);
      GMTrace.o(19743696224256L, 147102);
    }
  }
  
  private static final class b
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 81;
    private static final String NAME = "onMusicPause";
    
    public b()
    {
      GMTrace.i(19750004457472L, 147149);
      GMTrace.o(19750004457472L, 147149);
    }
  }
  
  private static final class c
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 80;
    private static final String NAME = "onMusicPlay";
    
    public c()
    {
      GMTrace.i(19746112143360L, 147120);
      GMTrace.o(19746112143360L, 147120);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiOperateMusicPlayer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */