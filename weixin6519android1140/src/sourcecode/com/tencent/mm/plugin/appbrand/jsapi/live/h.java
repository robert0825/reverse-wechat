package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.rtmp.TXLivePlayer;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
  extends c
{
  private static final int CTRL_INDEX = 365;
  public static final String NAME = "updateLivePlayer";
  
  public h()
  {
    GMTrace.i(20725230469120L, 154415);
    GMTrace.o(20725230469120L, 154415);
  }
  
  private static Bundle k(JSONObject paramJSONObject)
  {
    GMTrace.i(20725633122304L, 154418);
    Bundle localBundle = new Bundle();
    try
    {
      if (paramJSONObject.has("playUrl"))
      {
        localBundle.putString("playUrl", paramJSONObject.getString("playUrl"));
        w.i("MicroMsg.JsApiUpdateLivePlayer", "convertParams playUrl:%s", new Object[] { paramJSONObject.getString("playUrl") });
      }
    }
    catch (JSONException localJSONException10)
    {
      try
      {
        if (paramJSONObject.has("mode")) {
          localBundle.putInt("mode", paramJSONObject.getInt("mode"));
        }
      }
      catch (JSONException localJSONException10)
      {
        try
        {
          if (paramJSONObject.has("autoplay")) {
            localBundle.putBoolean("autoplay", paramJSONObject.getBoolean("autoplay"));
          }
        }
        catch (JSONException localJSONException10)
        {
          try
          {
            if (paramJSONObject.has("muted")) {
              localBundle.putBoolean("muted", paramJSONObject.getBoolean("muted"));
            }
          }
          catch (JSONException localJSONException10)
          {
            try
            {
              if (paramJSONObject.has("orientation")) {
                localBundle.putString("orientation", paramJSONObject.getString("orientation"));
              }
            }
            catch (JSONException localJSONException10)
            {
              try
              {
                if (paramJSONObject.has("objectFit")) {
                  localBundle.putString("objectFit", paramJSONObject.getString("objectFit"));
                }
              }
              catch (JSONException localJSONException10)
              {
                try
                {
                  if (paramJSONObject.has("backgroundMute")) {
                    localBundle.putBoolean("backgroundMute", paramJSONObject.getBoolean("backgroundMute"));
                  }
                }
                catch (JSONException localJSONException10)
                {
                  try
                  {
                    if (paramJSONObject.has("minCache")) {
                      localBundle.putInt("minCache", paramJSONObject.getInt("minCache"));
                    }
                  }
                  catch (JSONException localJSONException10)
                  {
                    try
                    {
                      if (paramJSONObject.has("maxCache")) {
                        localBundle.putInt("maxCache", paramJSONObject.getInt("maxCache"));
                      }
                    }
                    catch (JSONException localJSONException10)
                    {
                      try
                      {
                        if (paramJSONObject.has("needEvent")) {
                          localBundle.putBoolean("needEvent", paramJSONObject.getBoolean("needEvent"));
                        }
                      }
                      catch (JSONException localJSONException10)
                      {
                        try
                        {
                          for (;;)
                          {
                            if (paramJSONObject.has("debug")) {
                              localBundle.putBoolean("debug", paramJSONObject.getBoolean("debug"));
                            }
                            GMTrace.o(20725633122304L, 154418);
                            return localBundle;
                            localJSONException1 = localJSONException1;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "playUrl", localJSONException1.getLocalizedMessage() });
                            continue;
                            localJSONException2 = localJSONException2;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "mode", localJSONException2.getLocalizedMessage() });
                            continue;
                            localJSONException3 = localJSONException3;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "autoplay", localJSONException3.getLocalizedMessage() });
                            continue;
                            localJSONException4 = localJSONException4;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "muted", localJSONException4.getLocalizedMessage() });
                            continue;
                            localJSONException5 = localJSONException5;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "orientation", localJSONException5.getLocalizedMessage() });
                            continue;
                            localJSONException6 = localJSONException6;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "objectFit", localJSONException6.getLocalizedMessage() });
                            continue;
                            localJSONException7 = localJSONException7;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "backgroundMute", localJSONException7.getLocalizedMessage() });
                            continue;
                            localJSONException8 = localJSONException8;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "minCache", localJSONException8.getLocalizedMessage() });
                            continue;
                            localJSONException9 = localJSONException9;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "maxCache", localJSONException9.getLocalizedMessage() });
                            continue;
                            localJSONException10 = localJSONException10;
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "needEvent", localJSONException10.getLocalizedMessage() });
                          }
                        }
                        catch (JSONException paramJSONObject)
                        {
                          for (;;)
                          {
                            w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "debug", paramJSONObject.getLocalizedMessage() });
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected final boolean c(AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(20725498904576L, 154417);
    w.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView : livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiUpdateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20725498904576L, 154417);
      return false;
    }
    paramAppBrandPageView = ((CoverViewContainer)paramView).J(View.class);
    if (!(paramAppBrandPageView instanceof AppBrandLivePlayerView))
    {
      w.e("MicroMsg.JsApiUpdateLivePlayer", "targetView not AppBrandLivePlayerView");
      GMTrace.o(20725498904576L, 154417);
      return false;
    }
    paramView = (AppBrandLivePlayerView)paramAppBrandPageView;
    paramAppBrandPageView = k(paramJSONObject);
    paramView.ify = paramAppBrandPageView.getBoolean("needEvent", paramView.ify);
    paramView = paramView.ifu;
    if (!paramView.fVS) {}
    for (paramAppBrandPageView = new j(-3, "uninited livePlayer");; paramAppBrandPageView = new j())
    {
      w.i("MicroMsg.AppBrandLivePlayerView", "onUpdate code:%d info:%s", new Object[] { Integer.valueOf(paramAppBrandPageView.errorCode), paramAppBrandPageView.errorInfo });
      GMTrace.o(20725498904576L, 154417);
      return true;
      l.b("updateLivePlayer", paramAppBrandPageView);
      paramView.y(paramAppBrandPageView);
      paramJSONObject = paramAppBrandPageView.getString("playUrl", paramView.ifQ);
      if ((paramJSONObject != null) && (!paramJSONObject.isEmpty()) && (paramView.ifQ != null) && (!paramView.ifQ.equalsIgnoreCase(paramJSONObject)) && (paramView.ifO.isPlaying()))
      {
        w.i("TXLivePlayerJSAdapter", "updateLivePlayer: stopPlay");
        paramView.ifO.stopPlay(true);
      }
      paramView.ifQ = paramJSONObject;
      paramView.mPlayType = paramView.x(paramAppBrandPageView);
      if ((paramAppBrandPageView.getBoolean("autoplay", false)) && (paramView.ifQ != null) && (!paramView.ifQ.isEmpty()) && (!paramView.ifO.isPlaying()))
      {
        w.i("TXLivePlayerJSAdapter", "updateLivePlayer: startPlay");
        paramView.ifO.startPlay(paramView.ifQ, paramView.mPlayType);
      }
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(20725364686848L, 154416);
    int i = paramJSONObject.optInt("livePlayerId");
    GMTrace.o(20725364686848L, 154416);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */