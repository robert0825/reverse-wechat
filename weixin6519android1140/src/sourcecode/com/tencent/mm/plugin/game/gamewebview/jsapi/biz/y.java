package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.im;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.model.app.g.c;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class y
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 52;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "launch3rdApp";
  
  public y()
  {
    GMTrace.i(17819148222464L, 132763);
    GMTrace.o(17819148222464L, 132763);
  }
  
  public final void a(Context paramContext, String paramString, final GameJsApiMMTask.a parama)
  {
    GMTrace.i(17819282440192L, 132764);
    w.i("MicroMsg.GameJsApiLaunchApplication", "invoke");
    Object localObject1 = d.qe(paramString);
    if (localObject1 == null)
    {
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:invalid_data", null));
      GMTrace.o(17819282440192L, 132764);
      return;
    }
    int i = ((JSONObject)localObject1).optInt("type");
    paramString = ((JSONObject)localObject1).optString("appID");
    Object localObject2;
    if (i == 0)
    {
      localObject1 = ((JSONObject)localObject1).optString("extInfo");
      w.i("MicroMsg.GameJsApiLaunchApplication", "appid:[%s], extinfo:[%s]", new Object[] { paramString, localObject1 });
      if (bg.nm(paramString))
      {
        w.e("MicroMsg.GameJsApiLaunchApplication", "appid is null or nil");
        parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:fail", null));
        GMTrace.o(17819282440192L, 132764);
        return;
      }
      if (!com.tencent.mm.plugin.webview.a.a.hnI.n(ab.getContext(), paramString))
      {
        w.e("MicroMsg.GameJsApiLaunchApplication", "app is not installed, appid:[%s]", new Object[] { paramString });
        parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:fail", null));
        GMTrace.o(17819282440192L, 132764);
        return;
      }
      localObject2 = new WXAppExtendObject();
      ((WXAppExtendObject)localObject2).extInfo = ((String)localObject1);
      localObject2 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject2);
      ((WXMediaMessage)localObject2).sdkVer = 620822528;
      ((WXMediaMessage)localObject2).messageExt = ((String)localObject1);
      localObject1 = new im();
      ((im)localObject1).eLS.eLU = ((WXMediaMessage)localObject2);
      ((im)localObject1).eLS.appId = paramString;
      ((im)localObject1).eLS.context = paramContext;
      ((im)localObject1).eLS.eLV = new g.c()
      {
        public final void eP(boolean paramAnonymousBoolean)
        {
          GMTrace.i(17818745569280L, 132760);
          GameJsApiMMTask.a locala = parama;
          y localy = y.this;
          locala.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:ok", null));
          GMTrace.o(17818745569280L, 132760);
        }
      };
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject1);
      GMTrace.o(17819282440192L, 132764);
      return;
    }
    if (i == 1)
    {
      String str = ((JSONObject)localObject1).optString("signature");
      localObject2 = ((JSONObject)localObject1).optString("packageName");
      paramString = ((JSONObject)localObject1).optString("param");
      w.i("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp, signature:[%s], packageName:[%s], param:[%s]", new Object[] { str, localObject2, paramString });
      if ((bg.nm(str)) || (bg.nm((String)localObject2)))
      {
        w.e("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp invalid_args");
        parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:fail_invalid_args", null));
        GMTrace.o(17819282440192L, 132764);
        return;
      }
      if (!p.n(paramContext, (String)localObject2))
      {
        w.e("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp not_install");
        parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:fail_not_install", null));
        GMTrace.o(17819282440192L, 132764);
        return;
      }
      Object localObject3 = p.aQ(paramContext, (String)localObject2);
      if ((localObject3 != null) && (localObject3[0] != null))
      {
        localObject3 = com.tencent.mm.a.g.n(localObject3[0].toByteArray());
        if ((localObject3 != null) && (((String)localObject3).equalsIgnoreCase(str)))
        {
          str = ((JSONObject)localObject1).optString("current_url");
          localObject1 = ((JSONObject)localObject1).optString("current_appid");
          try
          {
            localObject2 = paramContext.getPackageManager().getLaunchIntentForPackage((String)localObject2);
            if (localObject2 != null)
            {
              localObject3 = new Bundle();
              p.g((Bundle)localObject3, paramString);
              ((Intent)localObject2).putExtras((Bundle)localObject3);
              ((Intent)localObject2).addFlags(268435456);
              paramString = new Bundle();
              paramString.putString("current_page_url", str);
              paramString.putString("current_page_appid", (String)localObject1);
              com.tencent.mm.pluginsdk.model.app.g.a(paramContext, (Intent)localObject2, null, new g.c()
              {
                public final void eP(boolean paramAnonymousBoolean)
                {
                  GMTrace.i(17819014004736L, 132762);
                  GameJsApiMMTask.a locala = parama;
                  y localy = y.this;
                  locala.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:ok", null));
                  GMTrace.o(17819014004736L, 132762);
                }
              }, paramString);
              GMTrace.o(17819282440192L, 132764);
              return;
            }
          }
          catch (Exception paramContext)
          {
            w.e("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp getLaunchIntentForPackage, %s", new Object[] { paramContext.getMessage() });
            parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:fail", null));
            GMTrace.o(17819282440192L, 132764);
            return;
          }
        }
      }
      w.e("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp signature_mismatch");
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:fail_signature_mismatch", null));
      GMTrace.o(17819282440192L, 132764);
      return;
    }
    parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("launch_3rdApp:fail_invalid_type", null));
    GMTrace.o(17819282440192L, 132764);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */