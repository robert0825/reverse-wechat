package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.j.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ao
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 253;
  public static final String NAME = "insertImageView";
  
  public ao()
  {
    GMTrace.i(17670166544384L, 131653);
    GMTrace.o(17670166544384L, 131653);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(17670300762112L, 131654);
    paramAppBrandPageView = paramAppBrandPageView.mContext;
    paramJSONObject = new com.tencent.mm.plugin.appbrand.widget.e(paramAppBrandPageView);
    paramJSONObject.setScaleType(ImageView.ScaleType.FIT_XY);
    paramAppBrandPageView = new CoverViewContainer(paramAppBrandPageView, paramJSONObject);
    GMTrace.o(17670300762112L, 131654);
    return paramAppBrandPageView;
  }
  
  protected final void a(final AppBrandPageView paramAppBrandPageView, int paramInt, final View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17670569197568L, 131656);
    com.tencent.mm.plugin.appbrand.widget.e locale = (com.tencent.mm.plugin.appbrand.widget.e)((CoverViewContainer)paramView).J(com.tencent.mm.plugin.appbrand.widget.e.class);
    boolean bool1 = paramJSONObject.optBoolean("clickable");
    boolean bool2 = paramJSONObject.optBoolean("transEvt");
    String str1 = paramJSONObject.optString("sendTo", "appservice");
    String str2 = paramJSONObject.optString("data", "");
    d.a(paramView, paramJSONObject.optJSONObject("style"));
    com.tencent.mm.plugin.appbrand.jsapi.j.a.a(paramAppBrandPageView, locale, paramJSONObject);
    paramView = paramAppBrandPageView.ivh.t(paramInt, true);
    paramView.o("data", str2);
    paramView.o("sendTo", str1);
    paramView.o("transEvt", Boolean.valueOf(bool2));
    paramView.o("clickable", Boolean.valueOf(bool1));
    locale.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17672179810304L, 131668);
        if (!paramView.gz("clickable"))
        {
          GMTrace.o(17672179810304L, 131668);
          return;
        }
        paramAnonymousView = new ao.a();
        HashMap localHashMap = new HashMap();
        localHashMap.put("data", paramView.getString("data", ""));
        paramAnonymousView.a(paramAppBrandPageView);
        paramAnonymousView.r(localHashMap);
        if ("webview".equals(paramView.getString("sendTo", null)))
        {
          paramAnonymousView.f(new int[] { paramAppBrandPageView.hashCode() });
          GMTrace.o(17672179810304L, 131668);
          return;
        }
        paramAnonymousView.VR();
        GMTrace.o(17672179810304L, 131668);
      }
    });
    locale.setClickable(bool1);
    GMTrace.o(17670569197568L, 131656);
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(17670434979840L, 131655);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17670434979840L, 131655);
    return i;
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 256;
    private static final String NAME = "onImageViewClick";
    
    public a()
    {
      GMTrace.i(17669898108928L, 131651);
      GMTrace.o(17669898108928L, 131651);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */