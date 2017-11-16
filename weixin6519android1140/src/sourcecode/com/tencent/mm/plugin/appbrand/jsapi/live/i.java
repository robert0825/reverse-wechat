package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
  extends c
{
  private static final int CTRL_INDEX = 361;
  public static final String NAME = "updateLivePusher";
  
  public i()
  {
    GMTrace.i(20722680332288L, 154396);
    GMTrace.o(20722680332288L, 154396);
  }
  
  private static Bundle k(JSONObject paramJSONObject)
  {
    GMTrace.i(20723082985472L, 154399);
    Bundle localBundle = new Bundle();
    try
    {
      if (paramJSONObject.has("pushUrl"))
      {
        localBundle.putString("pushUrl", paramJSONObject.getString("pushUrl"));
        w.i("MicroMsg.JsApiUpdateLivePusher", "convertParams pushUrl:%s", new Object[] { paramJSONObject.getString("pushUrl") });
      }
    }
    catch (JSONException localJSONException14)
    {
      try
      {
        if (paramJSONObject.has("mode")) {
          localBundle.putInt("mode", paramJSONObject.getInt("mode"));
        }
      }
      catch (JSONException localJSONException14)
      {
        try
        {
          if (paramJSONObject.has("autopush")) {
            localBundle.putBoolean("autopush", paramJSONObject.getBoolean("autopush"));
          }
        }
        catch (JSONException localJSONException14)
        {
          try
          {
            if (paramJSONObject.has("audioQuality")) {
              localBundle.putString("audioQuality", paramJSONObject.getString("audioQuality"));
            }
          }
          catch (JSONException localJSONException14)
          {
            try
            {
              if (paramJSONObject.has("muted")) {
                localBundle.putBoolean("muted", paramJSONObject.getBoolean("muted"));
              }
            }
            catch (JSONException localJSONException14)
            {
              try
              {
                if (paramJSONObject.has("enableCamera")) {
                  localBundle.putBoolean("enableCamera", paramJSONObject.getBoolean("enableCamera"));
                }
              }
              catch (JSONException localJSONException14)
              {
                try
                {
                  if (paramJSONObject.has("focusMode")) {
                    localBundle.putInt("focusMode", paramJSONObject.getInt("focusMode"));
                  }
                }
                catch (JSONException localJSONException14)
                {
                  try
                  {
                    if (paramJSONObject.has("orientation")) {
                      localBundle.putString("orientation", paramJSONObject.getString("orientation"));
                    }
                  }
                  catch (JSONException localJSONException14)
                  {
                    try
                    {
                      if (paramJSONObject.has("beauty")) {
                        localBundle.putInt("beauty", paramJSONObject.getInt("beauty"));
                      }
                    }
                    catch (JSONException localJSONException14)
                    {
                      try
                      {
                        if (paramJSONObject.has("whiteness")) {
                          localBundle.putInt("whiteness", paramJSONObject.getInt("whiteness"));
                        }
                      }
                      catch (JSONException localJSONException14)
                      {
                        try
                        {
                          if (paramJSONObject.has("aspect")) {
                            localBundle.putInt("aspect", paramJSONObject.getInt("aspect"));
                          }
                        }
                        catch (JSONException localJSONException14)
                        {
                          try
                          {
                            if (paramJSONObject.has("minBitrate")) {
                              localBundle.putInt("minBitrate", paramJSONObject.getInt("minBitrate"));
                            }
                          }
                          catch (JSONException localJSONException14)
                          {
                            try
                            {
                              if (paramJSONObject.has("maxBitrate")) {
                                localBundle.putInt("maxBitrate", paramJSONObject.getInt("maxBitrate"));
                              }
                            }
                            catch (JSONException localJSONException14)
                            {
                              try
                              {
                                if (paramJSONObject.has("backgroundImage")) {
                                  localBundle.putString("backgroundImage", paramJSONObject.getString("backgroundImage"));
                                }
                              }
                              catch (JSONException localJSONException14)
                              {
                                try
                                {
                                  for (;;)
                                  {
                                    if (paramJSONObject.has("debug")) {
                                      localBundle.putBoolean("debug", paramJSONObject.getBoolean("debug"));
                                    }
                                    GMTrace.o(20723082985472L, 154399);
                                    return localBundle;
                                    localJSONException1 = localJSONException1;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "pushUrl", localJSONException1.getLocalizedMessage() });
                                    continue;
                                    localJSONException2 = localJSONException2;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "mode", localJSONException2.getLocalizedMessage() });
                                    continue;
                                    localJSONException3 = localJSONException3;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "autopush", localJSONException3.getLocalizedMessage() });
                                    continue;
                                    localJSONException4 = localJSONException4;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "audioQuality", localJSONException4.getLocalizedMessage() });
                                    continue;
                                    localJSONException5 = localJSONException5;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "muted", localJSONException5.getLocalizedMessage() });
                                    continue;
                                    localJSONException6 = localJSONException6;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "enableCamera", localJSONException6.getLocalizedMessage() });
                                    continue;
                                    localJSONException7 = localJSONException7;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "focusMode", localJSONException7.getLocalizedMessage() });
                                    continue;
                                    localJSONException8 = localJSONException8;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "orientation", localJSONException8.getLocalizedMessage() });
                                    continue;
                                    localJSONException9 = localJSONException9;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "beauty", localJSONException9.getLocalizedMessage() });
                                    continue;
                                    localJSONException10 = localJSONException10;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "whiteness", localJSONException10.getLocalizedMessage() });
                                    continue;
                                    localJSONException11 = localJSONException11;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "aspect", localJSONException11.getLocalizedMessage() });
                                    continue;
                                    localJSONException12 = localJSONException12;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "minBitrate", localJSONException12.getLocalizedMessage() });
                                    continue;
                                    localJSONException13 = localJSONException13;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "maxBitrate", localJSONException13.getLocalizedMessage() });
                                    continue;
                                    localJSONException14 = localJSONException14;
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "pushUrl", localJSONException14.getLocalizedMessage() });
                                  }
                                }
                                catch (JSONException paramJSONObject)
                                {
                                  for (;;)
                                  {
                                    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "debug", paramJSONObject.getLocalizedMessage() });
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
        }
      }
    }
  }
  
  protected final boolean c(final AppBrandPageView paramAppBrandPageView, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(20722948767744L, 154398);
    w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView : livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      w.w("MicroMsg.JsApiUpdateLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(20722948767744L, 154398);
      return false;
    }
    paramAppBrandPageView = ((CoverViewContainer)paramView).J(View.class);
    if (!(paramAppBrandPageView instanceof AppBrandLivePusherView))
    {
      w.e("MicroMsg.JsApiUpdateLivePusher", "targetView not AppBrandLivePusherView");
      GMTrace.o(20722948767744L, 154398);
      return false;
    }
    paramAppBrandPageView = (AppBrandLivePusherView)paramAppBrandPageView;
    paramAppBrandPageView.w(k(paramJSONObject));
    try
    {
      if (paramJSONObject.has("backgroundImage")) {
        a.a(paramJSONObject.getString("backgroundImage"), paramJSONObject.optString("backgroundMD5"), new a.a()
        {
          public final void qu(String paramAnonymousString)
          {
            GMTrace.i(20729659654144L, 154448);
            w.i("MicroMsg.JsApiUpdateLivePusher", "convertBackgroundImageToLocalPath onDownload localPath:%s", new Object[] { paramAnonymousString });
            Bundle localBundle = new Bundle();
            localBundle.putString("backgroundImage", paramAnonymousString);
            paramAppBrandPageView.w(localBundle);
            GMTrace.o(20729659654144L, 154448);
          }
        });
      }
      GMTrace.o(20722948767744L, 154398);
      return true;
    }
    catch (JSONException paramAppBrandPageView)
    {
      for (;;)
      {
        w.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "backgroundMute", paramAppBrandPageView.getLocalizedMessage() });
      }
    }
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(20722814550016L, 154397);
    int i = paramJSONObject.optInt("livePusherId");
    GMTrace.o(20722814550016L, 154397);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\live\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */