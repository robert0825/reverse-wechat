package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.a.a;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.d;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.y;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.rtmp.ITXLivePlayListener;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 364;
  public static final String NAME = "insertLivePlayer";
  
  public b()
  {
    GMTrace.i(20735833669632L, 154494);
    GMTrace.o(20735833669632L, 154494);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(20736236322816L, 154497);
    paramJSONObject = new AppBrandLivePlayerView(paramAppBrandPageView.mContext);
    paramAppBrandPageView = new CoverViewContainer(paramAppBrandPageView.mContext, paramJSONObject);
    GMTrace.o(20736236322816L, 154497);
    return paramAppBrandPageView;
  }
  
  protected final void a(final AppBrandPageView paramAppBrandPageView, final int paramInt, final View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(20736370540544L, 154498);
    w.i("MicroMsg.JsApiInsertLivePlayer", "onInsertView livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiInsertLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20736370540544L, 154498);
      return;
    }
    final AppBrandLivePlayerView localAppBrandLivePlayerView = (AppBrandLivePlayerView)((CoverViewContainer)paramView).J(AppBrandLivePlayerView.class);
    paramView = new y()
    {
      public final void WU()
      {
        GMTrace.i(20731001831424L, 154458);
        AppBrandLivePlayerView localAppBrandLivePlayerView = localAppBrandLivePlayerView;
        w.i("MicroMsg.AppBrandLivePlayerView", "onExitFullScreen");
        localAppBrandLivePlayerView.cg(false);
        GMTrace.o(20731001831424L, 154458);
      }
    };
    final AppBrandPageView.d local2 = new AppBrandPageView.d()
    {
      public final void Wz()
      {
        GMTrace.i(20719995977728L, 154376);
        Object localObject = localAppBrandLivePlayerView.ifu;
        if ((((l)localObject).ifR) && (((l)localObject).ifW)) {}
        for (localObject = ((l)localObject).qv("resume");; localObject = new j())
        {
          w.i("MicroMsg.AppBrandLivePlayerView", "onForeground code:%d info:%s", new Object[] { Integer.valueOf(((j)localObject).errorCode), ((j)localObject).errorInfo });
          GMTrace.o(20719995977728L, 154376);
          return;
        }
      }
    };
    final AppBrandPageView.b local3 = new AppBrandPageView.b()
    {
      public final void Wb()
      {
        GMTrace.i(20731270266880L, 154460);
        Object localObject = localAppBrandLivePlayerView.ifu;
        ((l)localObject).ifR = ((l)localObject).ifO.isPlaying();
        if ((((l)localObject).ifR) && (((l)localObject).ifW)) {}
        for (localObject = ((l)localObject).qv("pause");; localObject = new j())
        {
          w.i("MicroMsg.AppBrandLivePlayerView", "onBackground code:%d info:%s", new Object[] { Integer.valueOf(((j)localObject).errorCode), ((j)localObject).errorInfo });
          GMTrace.o(20731270266880L, 154460);
          return;
        }
      }
    };
    AppBrandPageView.c local4 = new AppBrandPageView.c()
    {
      public final void onDestroy()
      {
        GMTrace.i(20731538702336L, 154462);
        localAppBrandLivePlayerView.ow();
        paramAppBrandPageView.b(local2);
        paramAppBrandPageView.b(local3);
        paramAppBrandPageView.b(this);
        GMTrace.o(20731538702336L, 154462);
      }
    };
    paramAppBrandPageView.a(local2);
    paramAppBrandPageView.a(local3);
    paramAppBrandPageView.a(local4);
    localAppBrandLivePlayerView.ifv = new AppBrandLivePlayerView.a()
    {
      public final void WT()
      {
        GMTrace.i(21060506353664L, 156913);
        paramAppBrandPageView.ivh.ju(paramInt);
        GMTrace.o(21060506353664L, 156913);
      }
      
      public final void iE(int paramAnonymousInt)
      {
        GMTrace.i(21060372135936L, 156912);
        paramAppBrandPageView.ivh.a(paramInt, paramView, paramAnonymousInt);
        GMTrace.o(21060372135936L, 156912);
      }
      
      public final boolean isFullScreen()
      {
        GMTrace.i(21060640571392L, 156914);
        boolean bool = paramAppBrandPageView.ivh.jt(paramInt);
        GMTrace.o(21060640571392L, 156914);
        return bool;
      }
    };
    localAppBrandLivePlayerView.ify = paramJSONObject.optBoolean("needEvent", false);
    localAppBrandLivePlayerView.ifw = new AppBrandLivePlayerView.b()
    {
      public final void d(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
        GMTrace.i(21059701047296L, 156907);
        Object localObject = new b.a();
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("fullScreen", paramAnonymousBoolean);
          localJSONObject.put("direction", paramAnonymousInt);
          localJSONObject.put("livePlayerId", paramInt);
          localObject = ((b.a)localObject).ai(paramAppBrandPageView.hyD, paramAppBrandPageView.hashCode());
          ((e)localObject).mData = localJSONObject.toString();
          ((e)localObject).VR();
          GMTrace.o(21059701047296L, 156907);
          return;
        }
        catch (JSONException localJSONException)
        {
          for (;;) {}
        }
      }
    };
    paramView = new Bundle();
    paramView.putString("playUrl", paramJSONObject.optString("playUrl"));
    paramView.putInt("mode", paramJSONObject.optInt("mode", 0));
    paramView.putBoolean("autoplay", paramJSONObject.optBoolean("autoplay", false));
    paramView.putBoolean("muted", paramJSONObject.optBoolean("muted", false));
    paramView.putString("orientation", paramJSONObject.optString("orientation"));
    paramView.putString("objectFit", paramJSONObject.optString("objectFit"));
    paramView.putBoolean("backgroundMute", paramJSONObject.optBoolean("backgroundMute", true));
    paramView.putInt("minCache", paramJSONObject.optInt("minCache", 1));
    paramView.putInt("maxCache", paramJSONObject.optInt("maxCache", 3));
    paramView.putBoolean("needEvent", paramJSONObject.optBoolean("needEvent", false));
    paramView.putBoolean("debug", paramJSONObject.optBoolean("debug", false));
    w.i("MicroMsg.JsApiInsertLivePlayer", "convertParams playUrl:%s", new Object[] { paramJSONObject.optString("playUrl") });
    paramJSONObject = localAppBrandLivePlayerView.ifu;
    if (localAppBrandLivePlayerView == null) {}
    for (paramView = new j(-1, "invalid params");; paramView = new j())
    {
      w.i("MicroMsg.AppBrandLivePlayerView", "onInsert code:%d info:%s", new Object[] { Integer.valueOf(paramView.errorCode), paramView.errorInfo });
      paramAppBrandPageView = new ITXLivePlayListener()
      {
        public final void onNetStatus(Bundle paramAnonymousBundle)
        {
          GMTrace.i(21060103700480L, 156910);
          GMTrace.o(21060103700480L, 156910);
        }
        
        public final void onPlayEvent(int paramAnonymousInt, Bundle paramAnonymousBundle)
        {
          GMTrace.i(21059969482752L, 156909);
          w.i("MicroMsg.JsApiInsertLivePlayer", "onPlayEvent errCode:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          Object localObject = new b.b();
          paramAnonymousBundle = new JSONObject();
          try
          {
            paramAnonymousBundle.put("errCode", paramAnonymousInt);
            paramAnonymousBundle.put("livePlayerId", paramInt);
            localObject = ((b.b)localObject).ai(paramAppBrandPageView.hyD, paramAppBrandPageView.hashCode());
            ((e)localObject).mData = paramAnonymousBundle.toString();
            ((e)localObject).VR();
            GMTrace.o(21059969482752L, 156909);
            return;
          }
          catch (JSONException localJSONException)
          {
            for (;;) {}
          }
        }
      };
      localAppBrandLivePlayerView.ifu.ifP = paramAppBrandPageView;
      GMTrace.o(20736370540544L, 154498);
      return;
      l.b("initLivePlayer", paramView);
      paramJSONObject.ifM = localAppBrandLivePlayerView;
      paramJSONObject.ifM.disableLog(false);
      paramJSONObject.ifO.setPlayerView(localAppBrandLivePlayerView);
      paramJSONObject.ifQ = paramView.getString("playUrl", paramJSONObject.ifQ);
      paramJSONObject.mPlayType = paramJSONObject.x(paramView);
      paramJSONObject.y(paramView);
      if ((paramView.getBoolean("autoplay", false)) && (paramJSONObject.ifQ != null) && (!paramJSONObject.ifQ.isEmpty()))
      {
        w.i("TXLivePlayerJSAdapter", "initLivePlayer: startPlay");
        paramJSONObject.ifO.startPlay(paramJSONObject.ifQ, paramJSONObject.mPlayType);
      }
      paramJSONObject.fVS = true;
    }
  }
  
  public final void a(final AppBrandPageView paramAppBrandPageView, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(20735967887360L, 154495);
    k.WV();
    if (paramJSONObject.optInt("mode", 0) == 2)
    {
      if (!(paramAppBrandPageView.mContext instanceof Activity))
      {
        w.w("MicroMsg.JsApiInsertLivePlayer", "invokeAfterRequestPermission pageContext not activity");
        paramAppBrandPageView.v(paramInt, d("fail", null));
        com.tencent.mm.plugin.appbrand.a.nJ(paramAppBrandPageView.hyD);
        GMTrace.o(20735967887360L, 154495);
        return;
      }
      Activity localActivity = (Activity)paramAppBrandPageView.mContext;
      com.tencent.mm.plugin.appbrand.a.a(paramAppBrandPageView.hyD, new a.a()
      {
        public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
        {
          GMTrace.i(21060909006848L, 156916);
          w.i("MicroMsg.JsApiInsertLivePlayer", "onRequestPermissionsResult callback requestCode:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          if (paramAnonymousInt == 118) {
            b.a(b.this, paramAppBrandPageView, paramJSONObject, paramInt);
          }
          GMTrace.o(21060909006848L, 156916);
        }
      });
      if (!com.tencent.mm.pluginsdk.h.a.a(localActivity, "android.permission.RECORD_AUDIO", 118, "", ""))
      {
        w.i("MicroMsg.JsApiInsertLivePlayer", "doInvokeAfterRequestPermission, !retMicrophonePermission");
        GMTrace.o(20735967887360L, 154495);
        return;
      }
      w.i("MicroMsg.JsApiInsertLivePlayer", "doInvokeAfterRequestPermission, super.invoke");
      super.a(paramAppBrandPageView, paramJSONObject, paramInt);
      GMTrace.o(20735967887360L, 154495);
      return;
    }
    super.a(paramAppBrandPageView, paramJSONObject, paramInt);
    GMTrace.o(20735967887360L, 154495);
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(20736102105088L, 154496);
    int i = paramJSONObject.getInt("livePlayerId");
    GMTrace.o(20736102105088L, 154496);
    return i;
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 371;
    private static final String NAME = "onLivePlayerFullScreenChange";
    
    public a()
    {
      GMTrace.i(20722546114560L, 154395);
      GMTrace.o(20722546114560L, 154395);
    }
  }
  
  private static final class b
    extends e
  {
    private static final int CTRL_INDEX = 369;
    private static final String NAME = "onLivePlayerEvent";
    
    public b()
    {
      GMTrace.i(20722411896832L, 154394);
      GMTrace.o(20722411896832L, 154394);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */