package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.d;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.y;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 6;
  public static final String NAME = "insertVideoPlayer";
  
  public a()
  {
    GMTrace.i(17356499714048L, 129316);
    GMTrace.o(17356499714048L, 129316);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(17356633931776L, 129317);
    boolean bool1 = paramJSONObject.optBoolean("showDanmuBtn", false);
    boolean bool2 = paramJSONObject.optBoolean("enableDanmu", false);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("danmuList");
    String str1 = paramJSONObject.optString("objectFit");
    String str2 = paramJSONObject.optString("poster");
    boolean bool3 = paramJSONObject.optBoolean("showBasicControls", true);
    String str3 = paramJSONObject.optString("data");
    int i = paramJSONObject.optInt("direction", 90);
    boolean bool4 = paramJSONObject.optBoolean("disableScroll", false);
    boolean bool5 = paramJSONObject.optBoolean("loop", false);
    boolean bool6 = paramJSONObject.optBoolean("pageGesture", false);
    int j = paramJSONObject.optInt("initialTime", 0);
    w.i("MicroMsg.JsApiInsertVideoPlayer", "inflateView enableDanmu=%b showDanmuBtn=%b disableScroll=%b direction=%d objectFit=%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(bool4), Integer.valueOf(i), str1 });
    Context localContext = paramAppBrandPageView.mContext;
    AppBrandVideoView localAppBrandVideoView = new AppBrandVideoView(localContext);
    paramAppBrandPageView = paramAppBrandPageView.hyD;
    w.i("MicroMsg.AppBrandVideoView", "setAppId appid=%s", new Object[] { paramAppBrandPageView });
    localAppBrandVideoView.hyD = paramAppBrandPageView;
    localAppBrandVideoView.ilT = str3;
    localAppBrandVideoView.cj(bool3);
    localAppBrandVideoView.qO(str2);
    localAppBrandVideoView.iI(i);
    localAppBrandVideoView.cl(bool4);
    localAppBrandVideoView.qP(str1);
    localAppBrandVideoView.ci(bool5);
    localAppBrandVideoView.cm(bool6);
    try
    {
      localAppBrandVideoView.ilU = h(paramJSONObject);
      localAppBrandVideoView.ck(bool1);
      w.i("MicroMsg.AppBrandVideoView", "setDanmakuEnable isEnable=%b", new Object[] { Boolean.valueOf(bool2) });
      paramAppBrandPageView = localAppBrandVideoView.ilK;
      paramAppBrandPageView.imr = bool2;
      paramAppBrandPageView.Xy();
      localAppBrandVideoView.h(localJSONArray);
      localAppBrandVideoView.iJ(j);
      paramAppBrandPageView = new CoverViewContainer(localContext, localAppBrandVideoView);
      GMTrace.o(17356633931776L, 129317);
      return paramAppBrandPageView;
    }
    catch (JSONException paramAppBrandPageView)
    {
      for (;;)
      {
        w.e("MicroMsg.JsApiInsertVideoPlayer", "inflateView setVideoPlayerId exp=%s", new Object[] { paramAppBrandPageView });
      }
    }
  }
  
  protected final void a(final AppBrandPageView paramAppBrandPageView, final int paramInt, final View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17356902367232L, 129319);
    w.i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    paramView = (AppBrandVideoView)((CoverViewContainer)paramView).J(AppBrandVideoView.class);
    final y local1 = new y()
    {
      public final void WU()
      {
        GMTrace.i(17344956989440L, 129230);
        AppBrandVideoView localAppBrandVideoView = paramView;
        w.i("MicroMsg.AppBrandVideoView", "onExitFullScreen");
        if (localAppBrandVideoView.ilK.imq) {
          localAppBrandVideoView.ilK.WT();
        }
        localAppBrandVideoView.cn(false);
        GMTrace.o(17344956989440L, 129230);
      }
    };
    final AppBrandPageView.d local2 = new AppBrandPageView.d()
    {
      public final void Wz()
      {
        GMTrace.i(17342675288064L, 129213);
        AppBrandVideoView localAppBrandVideoView = paramView;
        w.i("MicroMsg.AppBrandVideoView", "onUIResume");
        localAppBrandVideoView.ilH.MS();
        GMTrace.o(17342675288064L, 129213);
      }
    };
    final AppBrandPageView.b local3 = new AppBrandPageView.b()
    {
      public final void Wb()
      {
        GMTrace.i(17376498155520L, 129465);
        AppBrandVideoView localAppBrandVideoView = paramView;
        w.i("MicroMsg.AppBrandVideoView", "onUIPause");
        localAppBrandVideoView.ilH.MR();
        GMTrace.o(17376498155520L, 129465);
      }
    };
    final AppBrandPageView.c local4 = new AppBrandPageView.c()
    {
      public final void onDestroy()
      {
        GMTrace.i(17346567602176L, 129242);
        AppBrandVideoView localAppBrandVideoView = paramView;
        w.i("MicroMsg.AppBrandVideoView", "onUIDestroy");
        localAppBrandVideoView.clean();
        GMTrace.o(17346567602176L, 129242);
      }
    };
    paramView.ima = new AppBrandVideoView.a()
    {
      public final void WT()
      {
        GMTrace.i(17345359642624L, 129233);
        paramAppBrandPageView.ivh.ju(paramInt);
        GMTrace.o(17345359642624L, 129233);
      }
      
      public final void iE(int paramAnonymousInt)
      {
        GMTrace.i(20742678773760L, 154545);
        paramAppBrandPageView.ivh.a(paramInt, local1, paramAnonymousInt);
        GMTrace.o(20742678773760L, 154545);
      }
      
      public final boolean isFullScreen()
      {
        GMTrace.i(17345493860352L, 129234);
        boolean bool = paramAppBrandPageView.ivh.jt(paramInt);
        GMTrace.o(17345493860352L, 129234);
        return bool;
      }
    };
    paramAppBrandPageView.a(local2);
    paramAppBrandPageView.a(local3);
    paramAppBrandPageView.a(local4);
    c.a(paramAppBrandPageView.hyD, new c.b()
    {
      public final void a(c.c paramAnonymousc)
      {
        GMTrace.i(17370458357760L, 129420);
        GMTrace.o(17370458357760L, 129420);
      }
      
      public final void onDestroy()
      {
        GMTrace.i(17370592575488L, 129421);
        paramAppBrandPageView.b(local2);
        paramAppBrandPageView.b(local3);
        paramAppBrandPageView.b(local4);
        GMTrace.o(17370592575488L, 129421);
      }
      
      public final void onResume()
      {
        GMTrace.i(17370324140032L, 129419);
        GMTrace.o(17370324140032L, 129419);
      }
    });
    paramView.setMute(paramJSONObject.optBoolean("muted", false));
    boolean bool = paramJSONObject.optBoolean("needEvent", false);
    w.i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView autoPlay=%b needEvent=%b", new Object[] { Boolean.valueOf(paramJSONObject.optBoolean("autoplay", false)), Boolean.valueOf(bool) });
    if (bool) {
      paramView.ilW = new e(paramView, paramAppBrandPageView);
    }
    paramInt = paramJSONObject.optInt("duration", -1);
    paramAppBrandPageView = paramJSONObject.optString("filePath");
    bool = paramJSONObject.optBoolean("live", false);
    w.i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView filePath=%s live=%b", new Object[] { paramAppBrandPageView, Boolean.valueOf(bool) });
    paramView.e(paramAppBrandPageView, bool, paramInt);
    GMTrace.o(17356902367232L, 129319);
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(17356768149504L, 129318);
    int i = paramJSONObject.getInt("videoPlayerId");
    GMTrace.o(17356768149504L, 129318);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\video\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */