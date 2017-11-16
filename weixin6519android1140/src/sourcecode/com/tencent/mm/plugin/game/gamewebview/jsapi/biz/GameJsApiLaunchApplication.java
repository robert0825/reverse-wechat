package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.a.im;
import com.tencent.mm.g.a.im.b;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.g.c;
import com.tencent.mm.protocal.c.aiz;
import com.tencent.mm.protocal.c.aja;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.json.JSONObject;

public final class GameJsApiLaunchApplication
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 260;
  public static final String NAME = "launchApplication";
  
  public GameJsApiLaunchApplication()
  {
    GMTrace.i(17039209005056L, 126952);
    GMTrace.o(17039209005056L, 126952);
  }
  
  public final void a(final d paramd, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17039343222784L, 126953);
    w.i("MicroMsg.GameJsApiLaunchApplication", "invoke");
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.GameJsApiLaunchApplication", "data is null");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:fail", null));
      GMTrace.o(17039343222784L, 126953);
      return;
    }
    final GameWebViewUI localGameWebViewUI = paramd.aEo();
    final Object localObject2 = paramJSONObject.optString("appID");
    final String str1 = paramJSONObject.optString("schemeUrl");
    final Object localObject1 = paramJSONObject.optString("parameter");
    int i = paramJSONObject.optInt("alertType");
    paramJSONObject = paramJSONObject.optString("extInfo");
    w.i("MicroMsg.GameJsApiLaunchApplication", "appid : %s, scheme : %s, extinfo:[%s], parameter : %s", new Object[] { localObject2, str1, paramJSONObject, localObject1 });
    if ((bg.nm((String)localObject2)) && (bg.nm(str1)))
    {
      w.e("MicroMsg.GameJsApiLaunchApplication", "appid and scheme is null or nil");
      paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:fail", null));
      GMTrace.o(17039343222784L, 126953);
      return;
    }
    String str2 = paramd.aEs();
    localObject1 = new Bundle();
    try
    {
      ((Bundle)localObject1).putString("current_page_url", URLEncoder.encode(paramd.aEr(), "UTF-8"));
      ((Bundle)localObject1).putString("current_page_appid", str2);
      if (bg.nm((String)localObject2))
      {
        if (!TextUtils.isEmpty(str2))
        {
          paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:fail", null));
          GMTrace.o(17039343222784L, 126953);
          return;
        }
        localObject2 = new Intent("android.intent.action.VIEW", Uri.parse(str1));
        ((Intent)localObject2).addFlags(268435456);
        paramJSONObject = bg.y(localGameWebViewUI, (Intent)localObject2);
        if ((paramJSONObject != null) && (!paramJSONObject.isEmpty()))
        {
          if ((TextUtils.isEmpty(((Intent)localObject2).getPackage())) && (paramJSONObject.size() == 1)) {}
          for (paramJSONObject = g.b((ResolveInfo)paramJSONObject.get(0)); !bg.nl(ab.getPackageName()).equals(paramJSONObject); paramJSONObject = ((Intent)localObject2).getPackage())
          {
            g.a(localGameWebViewUI, (Intent)localObject2, null, new g.c()
            {
              public final void eP(boolean paramAnonymousBoolean)
              {
                GMTrace.i(17059073228800L, 127100);
                d locald = paramd;
                int i = paramInt;
                GameJsApiLaunchApplication localGameJsApiLaunchApplication = GameJsApiLaunchApplication.this;
                locald.v(i, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:ok", null));
                GMTrace.o(17059073228800L, 127100);
              }
            }, (Bundle)localObject1);
            GMTrace.o(17039343222784L, 126953);
            return;
          }
        }
        paramd.v(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:fail", null));
        GMTrace.o(17039343222784L, 126953);
        return;
      }
      final a.a locala = new a.a(paramd, paramInt);
      com.tencent.mm.ad.b.a locala1 = new com.tencent.mm.ad.b.a();
      locala1.uri = "/cgi-bin/mmbiz-bin/checklaunchapp";
      locala1.gtE = 1125;
      aiz localaiz = new aiz();
      localaiz.eSd = str2;
      localaiz.uyg = ((String)localObject2);
      localaiz.scene = paramd.lJU;
      localaiz.url = paramd.aEr();
      localaiz.uyh = str1;
      localaiz.jWv = i;
      w.i("MicroMsg.GameJsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", new Object[] { str2, localObject2, Integer.valueOf(localaiz.scene), localaiz.url, localaiz.uyh, Integer.valueOf(localaiz.jWv) });
      locala1.gtF = localaiz;
      locala1.gtG = new aja();
      com.tencent.mm.ipcinvoker.wx_extension.b.a(locala1.DA(), new com.tencent.mm.ipcinvoker.wx_extension.b.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
        {
          GMTrace.i(17041222270976L, 126967);
          w.d("MicroMsg.GameJsApiLaunchApplication", "on RunCgi callback errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            paramAnonymousString = locala;
            paramAnonymousb = GameJsApiLaunchApplication.this;
            paramAnonymousString.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:fail_check fail", null));
            GMTrace.o(17041222270976L, 126967);
            return;
          }
          paramAnonymousb = (aja)paramAnonymousb.gtD.gtK;
          switch (paramAnonymousb.eGy)
          {
          case 1: 
          default: 
            paramAnonymousString = locala;
            paramAnonymousb = GameJsApiLaunchApplication.this;
            paramAnonymousString.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:fail_check fail", null));
            GMTrace.o(17041222270976L, 126967);
            return;
          case 2: 
            paramAnonymousString = locala;
            paramAnonymousb = GameJsApiLaunchApplication.this;
            paramAnonymousString.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:fail_check fail forbidden scene", null));
            GMTrace.o(17041222270976L, 126967);
            return;
          }
          if (!bg.nm(str1))
          {
            Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(str1));
            localIntent.addFlags(268435456);
            paramAnonymousString = bg.y(localGameWebViewUI, localIntent);
            if ((paramAnonymousString != null) && (!paramAnonymousString.isEmpty()))
            {
              if ((TextUtils.isEmpty(localIntent.getPackage())) && (paramAnonymousString.size() == 1)) {}
              for (paramAnonymousString = g.b((ResolveInfo)paramAnonymousString.get(0)); !bg.nl(ab.getPackageName()).equals(paramAnonymousString); paramAnonymousString = localIntent.getPackage())
              {
                g.a(localGameWebViewUI, localIntent, null, paramAnonymousb.uyi, new g.c()
                {
                  public final void eP(boolean paramAnonymous2Boolean)
                  {
                    GMTrace.i(17783177871360L, 132495);
                    a.a locala = GameJsApiLaunchApplication.2.this.lGU;
                    GameJsApiLaunchApplication localGameJsApiLaunchApplication = GameJsApiLaunchApplication.this;
                    locala.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:ok", null));
                    GMTrace.o(17783177871360L, 132495);
                  }
                }, localObject1);
                GMTrace.o(17041222270976L, 126967);
                return;
              }
            }
          }
          paramAnonymousString = new GameJsApiLaunchApplication.LaunchApplicationTask(localGameWebViewUI);
          paramAnonymousString.appId = localObject2;
          paramAnonymousString.extInfo = paramJSONObject;
          paramAnonymousString.eDm = localObject1;
          if (paramAnonymousb.uyi == 1) {}
          for (paramAnonymousInt1 = 1;; paramAnonymousInt1 = 0)
          {
            paramAnonymousString.showType = paramAnonymousInt1;
            paramAnonymousString.hYr = new Runnable()
            {
              public final void run()
              {
                GMTrace.i(17782775218176L, 132492);
                w.i("MicroMsg.GameJsApiLaunchApplication", "callback");
                if (!paramAnonymousString.success)
                {
                  locala = GameJsApiLaunchApplication.2.this.lGU;
                  localGameJsApiLaunchApplication = GameJsApiLaunchApplication.this;
                  locala.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:fail", null));
                  GMTrace.o(17782775218176L, 132492);
                  return;
                }
                a.a locala = GameJsApiLaunchApplication.2.this.lGU;
                GameJsApiLaunchApplication localGameJsApiLaunchApplication = GameJsApiLaunchApplication.this;
                locala.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launchApplication:ok", null));
                GMTrace.o(17782775218176L, 132492);
              }
            };
            paramAnonymousString.aAb();
            GMTrace.o(17041222270976L, 126967);
            return;
          }
        }
      });
      GMTrace.o(17039343222784L, 126953);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;) {}
    }
  }
  
  private static class LaunchApplicationTask
    extends GameProcessActivityTask
  {
    public static final Parcelable.Creator<LaunchApplicationTask> CREATOR;
    public String appId;
    public Bundle eDm;
    public String extInfo;
    public Runnable hYr;
    public String lHs;
    public int showType;
    public boolean success;
    
    static
    {
      GMTrace.i(17040953835520L, 126965);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(17040953835520L, 126965);
    }
    
    public LaunchApplicationTask(Parcel paramParcel)
    {
      GMTrace.i(17040819617792L, 126964);
      f(paramParcel);
      GMTrace.o(17040819617792L, 126964);
    }
    
    public LaunchApplicationTask(MMActivity paramMMActivity)
    {
      super();
      GMTrace.i(17040685400064L, 126963);
      GMTrace.o(17040685400064L, 126963);
    }
    
    public final void VK()
    {
      GMTrace.i(17040282746880L, 126960);
      if (this.hYr != null) {
        this.hYr.run();
      }
      GMTrace.o(17040282746880L, 126960);
    }
    
    public final void a(Context paramContext, final GameProcessActivityTask.a parama)
    {
      GMTrace.i(17040148529152L, 126959);
      if (!g.n(paramContext, this.appId))
      {
        w.e("MicroMsg.GameJsApiLaunchApplication", "app is not installed, appid:[%s]", new Object[] { this.appId });
        this.success = false;
        parama.WW();
        GMTrace.o(17040148529152L, 126959);
        return;
      }
      Object localObject1 = new WXAppExtendObject();
      ((WXAppExtendObject)localObject1).extInfo = this.extInfo;
      localObject1 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject1);
      ((WXMediaMessage)localObject1).sdkVer = 620822528;
      ((WXMediaMessage)localObject1).messageExt = this.extInfo;
      final Object localObject2 = new im();
      ((im)localObject2).eLS.eLU = ((WXMediaMessage)localObject1);
      ((im)localObject2).eLS.appId = this.appId;
      ((im)localObject2).eLS.showType = this.showType;
      ((im)localObject2).eLS.context = paramContext;
      ((im)localObject2).eLS.eDm = this.eDm;
      ((im)localObject2).eLS.eLV = new g.c()
      {
        public final void eP(boolean paramAnonymousBoolean)
        {
          GMTrace.i(17048067375104L, 127018);
          if ((localObject2.eLT.eLW) || (paramAnonymousBoolean))
          {
            GameJsApiLaunchApplication.LaunchApplicationTask.this.success = true;
            parama.WW();
          }
          GMTrace.o(17048067375104L, 127018);
        }
      };
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      if (!((im)localObject2).eLT.eLW)
      {
        localObject1 = this.appId + "://" + this.lHs;
        localObject2 = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject1));
        w.i("MicroMsg.GameJsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", new Object[] { localObject1 });
        ((Intent)localObject2).addFlags(268435456);
        localObject1 = bg.y(paramContext, (Intent)localObject2);
        if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
        {
          if ((TextUtils.isEmpty(((Intent)localObject2).getPackage())) && (((List)localObject1).size() == 1)) {}
          for (localObject1 = g.b((ResolveInfo)((List)localObject1).get(0)); !bg.nl(ab.getPackageName()).equals(localObject1); localObject1 = ((Intent)localObject2).getPackage())
          {
            g.a(paramContext, (Intent)localObject2, null, new g.c()
            {
              public final void eP(boolean paramAnonymousBoolean)
              {
                GMTrace.i(17783580524544L, 132498);
                GameJsApiLaunchApplication.LaunchApplicationTask.this.success = true;
                parama.WW();
                GMTrace.o(17783580524544L, 132498);
              }
            }, this.eDm);
            GMTrace.o(17040148529152L, 126959);
            return;
          }
        }
        this.success = false;
        parama.WW();
      }
      GMTrace.o(17040148529152L, 126959);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(17040416964608L, 126961);
      this.showType = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.lHs = paramParcel.readString();
      this.extInfo = paramParcel.readString();
      this.eDm = paramParcel.readBundle();
      if (paramParcel.readByte() == 1) {}
      for (;;)
      {
        this.success = bool;
        GMTrace.o(17040416964608L, 126961);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(17040551182336L, 126962);
      paramParcel.writeInt(this.showType);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.lHs);
      paramParcel.writeString(this.extInfo);
      paramParcel.writeBundle(this.eDm);
      if (this.success) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        GMTrace.o(17040551182336L, 126962);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\GameJsApiLaunchApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */