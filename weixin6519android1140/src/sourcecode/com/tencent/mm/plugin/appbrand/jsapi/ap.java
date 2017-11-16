package com.tencent.mm.plugin.appbrand.jsapi;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.j.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.h;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ap
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 253;
  public static final String NAME = "insertTextView";
  
  public ap()
  {
    GMTrace.i(17683051446272L, 131749);
    GMTrace.o(17683051446272L, 131749);
  }
  
  protected final View a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject)
  {
    GMTrace.i(17683185664000L, 131750);
    paramAppBrandPageView = paramAppBrandPageView.mContext;
    paramAppBrandPageView = new CoverViewContainer(paramAppBrandPageView, new h(paramAppBrandPageView));
    GMTrace.o(17683185664000L, 131750);
    return paramAppBrandPageView;
  }
  
  protected final void a(final AppBrandPageView paramAppBrandPageView, int paramInt, final View paramView, JSONObject paramJSONObject)
  {
    GMTrace.i(17683454099456L, 131752);
    h localh = (h)((CoverViewContainer)paramView).J(h.class);
    boolean bool1 = paramJSONObject.optBoolean("clickable");
    boolean bool2 = paramJSONObject.optBoolean("transEvt");
    String str1 = paramJSONObject.optString("sendTo", "appservice");
    String str2 = paramJSONObject.optString("data", "");
    com.tencent.mm.plugin.appbrand.jsapi.j.a.a(localh, paramJSONObject.optJSONObject("label"));
    d.a(paramView, paramJSONObject.optJSONObject("style"));
    paramView = paramAppBrandPageView.ivh.t(paramInt, true);
    paramView.o("data", str2);
    paramView.o("sendTo", str1);
    paramView.o("transEvt", Boolean.valueOf(bool2));
    paramView.o("clickable", Boolean.valueOf(bool1));
    localh.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(17682917228544L, 131748);
        if (!paramView.gz("clickable"))
        {
          GMTrace.o(17682917228544L, 131748);
          return;
        }
        paramAnonymousView = new ap.a();
        HashMap localHashMap = new HashMap();
        localHashMap.put("data", paramView.getString("data", ""));
        paramAnonymousView.a(paramAppBrandPageView);
        paramAnonymousView.r(localHashMap);
        if ("webview".equals(paramView.getString("sendTo", null)))
        {
          paramAnonymousView.f(new int[] { paramAppBrandPageView.hashCode() });
          GMTrace.o(17682917228544L, 131748);
          return;
        }
        paramAnonymousView.VR();
        GMTrace.o(17682917228544L, 131748);
      }
    });
    localh.setClickable(bool1);
    GMTrace.o(17683454099456L, 131752);
  }
  
  protected final int h(JSONObject paramJSONObject)
  {
    GMTrace.i(17683319881728L, 131751);
    int i = paramJSONObject.getInt("viewId");
    GMTrace.o(17683319881728L, 131751);
    return i;
  }
  
  private static final class a
    extends e
  {
    private static final int CTRL_INDEX = 256;
    private static final String NAME = "onTextViewClick";
    
    public a()
    {
      GMTrace.i(17669763891200L, 131650);
      GMTrace.o(17669763891200L, 131650);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */