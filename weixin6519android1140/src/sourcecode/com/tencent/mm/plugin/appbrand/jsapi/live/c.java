package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 360;
  public static final String NAME = "insertLivePusher";
  private int ifG;
  
  public c()
  {
    GMTrace.i(20732478226432L, 154469);
    GMTrace.o(20732478226432L, 154469);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(20732746661888L, 154471);
    paramJSONObject = new AppBrandLivePusherView(paramAppBrandPageView.mContext);
    paramAppBrandPageView = new CoverViewContainer(paramAppBrandPageView.mContext, paramJSONObject);
    GMTrace.o(20732746661888L, 154471);
    return paramAppBrandPageView;
  }
  
  public final void a(final Activity paramActivity, final AppBrandPageView paramAppBrandPageView, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(20733149315072L, 154474);
    int i = this.ifG;
    this.ifG = (i + 1);
    if (i > 5)
    {
      w.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, avoid dead loop");
      GMTrace.o(20733149315072L, 154474);
      return;
    }
    com.tencent.mm.plugin.appbrand.a.a(paramAppBrandPageView.hyD, new android.support.v4.app.a.a()
    {
      public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(21061311660032L, 156919);
        w.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback requestCode:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousInt == 117)
        {
          if ((paramAnonymousArrayOfInt != null) && (paramAnonymousArrayOfInt.length > 0) && (paramAnonymousArrayOfInt[0] == 0))
          {
            af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(21059029958656L, 156902);
                c.this.a(c.6.this.na, c.6.this.hYF, c.6.this.hXZ, c.6.this.fXx);
                GMTrace.o(21059029958656L, 156902);
              }
            }, 50L);
            GMTrace.o(21061311660032L, 156919);
            return;
          }
          w.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback not grant");
          paramAppBrandPageView.v(paramInt, c.this.d("fail:system permission denied", null));
          GMTrace.o(21061311660032L, 156919);
          return;
        }
        if (paramAnonymousInt == 118)
        {
          if ((paramAnonymousArrayOfInt != null) && (paramAnonymousArrayOfInt.length > 0) && (paramAnonymousArrayOfInt[0] == 0))
          {
            af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(21059432611840L, 156905);
                c.this.a(c.6.this.na, c.6.this.hYF, c.6.this.hXZ, c.6.this.fXx);
                GMTrace.o(21059432611840L, 156905);
              }
            }, 50L);
            GMTrace.o(21061311660032L, 156919);
            return;
          }
          w.i("MicroMsg.JsApiInsertLivePusher", "onRequestPermissionsResult callback not grant");
          paramAppBrandPageView.v(paramInt, c.this.d("fail:system permission denied", null));
        }
        GMTrace.o(21061311660032L, 156919);
      }
    });
    if (!com.tencent.mm.pluginsdk.h.a.a(paramActivity, "android.permission.CAMERA", 117, "", ""))
    {
      w.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retCameraPermission");
      GMTrace.o(20733149315072L, 154474);
      return;
    }
    if (!com.tencent.mm.pluginsdk.h.a.a(paramActivity, "android.permission.RECORD_AUDIO", 118, "", ""))
    {
      w.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, !retMicrophonePermission");
      GMTrace.o(20733149315072L, 154474);
      return;
    }
    w.i("MicroMsg.JsApiInsertLivePusher", "doInvokeAfterRequestPermission, super.invoke");
    super.a(paramAppBrandPageView, paramJSONObject, paramInt);
    GMTrace.o(20733149315072L, 154474);
  }
  
  protected final void a(final AppBrandPageView paramAppBrandPageView, final int paramInt, final View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(20733015097344L, 154473);
    w.i("MicroMsg.JsApiInsertLivePusher", "onInsertView livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiInsertLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20733015097344L, 154473);
      return;
    }
    paramView = (AppBrandLivePusherView)((CoverViewContainer)paramView).J(AppBrandLivePusherView.class);
    final Object localObject = new AppBrandPageView.d()
    {
      public final void Wz()
      {
        GMTrace.i(20734223056896L, 154482);
        Object localObject = paramView.ifz;
        if (((m)localObject).igc) {}
        for (localObject = ((m)localObject).qw("resume");; localObject = new j())
        {
          w.i("MicroMsg.AppBrandLivePusherView", "onForeground code:%d info:%s", new Object[] { Integer.valueOf(((j)localObject).errorCode), ((j)localObject).errorInfo });
          GMTrace.o(20734223056896L, 154482);
          return;
        }
      }
    };
    final AppBrandPageView.b local2 = new AppBrandPageView.b()
    {
      public final void Wb()
      {
        GMTrace.i(20734491492352L, 154484);
        Object localObject = paramView.ifz;
        ((m)localObject).igc = ((m)localObject).ifZ.isPushing();
        if (((m)localObject).igc) {}
        for (localObject = ((m)localObject).qw("pause");; localObject = new j())
        {
          w.i("MicroMsg.AppBrandLivePusherView", "onBackground code:%d info:%s", new Object[] { Integer.valueOf(((j)localObject).errorCode), ((j)localObject).errorInfo });
          GMTrace.o(20734491492352L, 154484);
          return;
        }
      }
    };
    AppBrandPageView.c local3 = new AppBrandPageView.c()
    {
      public final void onDestroy()
      {
        GMTrace.i(20726438428672L, 154424);
        paramView.ow();
        paramAppBrandPageView.b(localObject);
        paramAppBrandPageView.b(local2);
        paramAppBrandPageView.b(this);
        GMTrace.o(20726438428672L, 154424);
      }
    };
    paramAppBrandPageView.a((AppBrandPageView.d)localObject);
    paramAppBrandPageView.a(local2);
    paramAppBrandPageView.a(local3);
    paramAppBrandPageView = new ITXLivePushListener()
    {
      public final void onNetStatus(Bundle paramAnonymousBundle)
      {
        GMTrace.i(21062116966400L, 156925);
        GMTrace.o(21062116966400L, 156925);
      }
      
      public final void onPushEvent(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(21061982748672L, 156924);
        w.i("MicroMsg.JsApiInsertLivePusher", "onPushEvent errCode:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        Object localObject = new c.a();
        paramAnonymousBundle = new JSONObject();
        try
        {
          paramAnonymousBundle.put("errCode", paramAnonymousInt);
          paramAnonymousBundle.put("livePusherId", paramInt);
          localObject = ((c.a)localObject).ai(paramAppBrandPageView.hyD, paramAppBrandPageView.hashCode());
          ((e)localObject).mData = paramAnonymousBundle.toString();
          ((e)localObject).VR();
          GMTrace.o(21061982748672L, 156924);
          return;
        }
        catch (JSONException localJSONException)
        {
          for (;;) {}
        }
      }
    };
    paramView.ifz.iga = paramAppBrandPageView;
    paramAppBrandPageView = new Bundle();
    paramAppBrandPageView.putString("pushUrl", paramJSONObject.optString("pushUrl"));
    paramAppBrandPageView.putInt("mode", paramJSONObject.optInt("mode", 0));
    paramAppBrandPageView.putBoolean("autopush", paramJSONObject.optBoolean("autopush", false));
    paramAppBrandPageView.putBoolean("muted", paramJSONObject.optBoolean("muted", false));
    paramAppBrandPageView.putBoolean("enableCamera", paramJSONObject.optBoolean("enableCamera", true));
    paramAppBrandPageView.putInt("focusMode", paramJSONObject.optInt("focusMode", 0));
    paramAppBrandPageView.putString("orientation", paramJSONObject.optString("orientation"));
    paramAppBrandPageView.putInt("beauty", paramJSONObject.optInt("beauty", 0));
    paramAppBrandPageView.putInt("whiteness", paramJSONObject.optInt("whiteness", 0));
    paramAppBrandPageView.putString("audioQuality", paramJSONObject.optString("audioQuality", "low"));
    paramAppBrandPageView.putInt("aspect", paramJSONObject.optInt("aspect", 0));
    paramAppBrandPageView.putInt("minBitrate", paramJSONObject.optInt("minBitrate", 0));
    paramAppBrandPageView.putInt("maxBitrate", paramJSONObject.optInt("maxBitrate", 0));
    paramAppBrandPageView.putBoolean("backgroundMute", paramJSONObject.optBoolean("backgroundMute", false));
    paramAppBrandPageView.putBoolean("needEvent", paramJSONObject.optBoolean("needEvent", false));
    paramAppBrandPageView.putBoolean("debug", paramJSONObject.optBoolean("debug", false));
    w.i("MicroMsg.JsApiInsertLivePusher", "convertParams pushUrl:%s", new Object[] { paramJSONObject.optString("pushUrl") });
    localObject = paramView.ifz;
    if (paramView == null) {}
    for (paramAppBrandPageView = new j(-1, "invalid params");; paramAppBrandPageView = new j())
    {
      w.i("MicroMsg.AppBrandLivePusherView", "onInsert code:%d info:%s", new Object[] { Integer.valueOf(paramAppBrandPageView.errorCode), paramAppBrandPageView.errorInfo });
      a.a(paramJSONObject.optString("backgroundImage"), paramJSONObject.optString("backgroundMD5"), new a.a()
      {
        public final void qu(String paramAnonymousString)
        {
          GMTrace.i(21061714313216L, 156922);
          w.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath onDownload localPath:%s", new Object[] { paramAnonymousString });
          Bundle localBundle = new Bundle();
          localBundle.putString("backgroundImage", paramAnonymousString);
          paramView.w(localBundle);
          GMTrace.o(21061714313216L, 156922);
        }
      });
      GMTrace.o(20733015097344L, 154473);
      return;
      ((TelephonyManager)((m)localObject).mContext.getSystemService("phone")).listen((PhoneStateListener)localObject, 32);
      m.b("InitLivePusher", paramAppBrandPageView);
      ((m)localObject).ifM = paramView;
      ((m)localObject).ifM.disableLog(false);
      ((m)localObject).igb = paramAppBrandPageView.getString("pushUrl", "");
      ((m)localObject).c(paramAppBrandPageView, true);
      if ((paramAppBrandPageView.getBoolean("autopush", false)) && (((m)localObject).igb != null) && (!((m)localObject).igb.isEmpty()) && (!((m)localObject).ifZ.isPushing()))
      {
        w.i("TXLivePusherJSAdapter", "initLivePusher: startPusher");
        ((m)localObject).ifM.setVisibility(0);
        ((m)localObject).ifZ.startCameraPreview(((m)localObject).ifM);
        ((m)localObject).ifZ.startPusher(((m)localObject).igb);
      }
      ((m)localObject).fVS = true;
    }
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(20732612444160L, 154470);
    k.WV();
    if (!(paramAppBrandPageView.mContext instanceof Activity))
    {
      w.w("MicroMsg.JsApiInsertLivePusher", "invokeAfterRequestPermission pageContext not activity");
      paramAppBrandPageView.v(paramInt, d("fail", null));
      com.tencent.mm.plugin.appbrand.a.nJ(paramAppBrandPageView.hyD);
      GMTrace.o(20732612444160L, 154470);
      return;
    }
    this.ifG = 0;
    a((Activity)paramAppBrandPageView.mContext, paramAppBrandPageView, paramJSONObject, paramInt);
    GMTrace.o(20732612444160L, 154470);
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(20732880879616L, 154472);
    int i = paramJSONObject.getInt("livePusherId");
    GMTrace.o(20732880879616L, 154472);
    return i;
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 368;
    private static final String NAME = "onLivePusherEvent";
    
    public a()
    {
      GMTrace.i(20733417750528L, 154476);
      GMTrace.o(20733417750528L, 154476);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */