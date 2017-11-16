package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.g.a;
import com.tencent.mm.ad.g.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.compat.a.e;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.b;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView.c;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiStartPlayVoice
  extends a
{
  public static final int CTRL_INDEX = 33;
  public static final String NAME = "playVoice";
  public static String iaS;
  private StartPlayVoice iaT;
  
  static
  {
    GMTrace.i(19735240507392L, 147039);
    iaS = null;
    GMTrace.o(19735240507392L, 147039);
  }
  
  public JsApiStartPlayVoice()
  {
    GMTrace.i(19734972071936L, 147037);
    GMTrace.o(19734972071936L, 147037);
  }
  
  public final void a(j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19735106289664L, 147038);
    String str = bg.aq(paramJSONObject.optString("filePath", null), paramJSONObject.optString("localId"));
    w.i("MicroMsg.JsApiStartPlayVoice", "doPlayVoice, appId : %s, localId : %s", new Object[] { paramj.hyD, str });
    if (bg.nm(str))
    {
      paramj.v(paramInt, d("fail_missing arguments", null));
      GMTrace.o(19735106289664L, 147038);
      return;
    }
    AppBrandLocalMediaObject localAppBrandLocalMediaObject = c.aJ(paramj.hyD, str);
    final AppBrandPageView localAppBrandPageView = b(paramj);
    if ((localAppBrandLocalMediaObject == null) || (bg.nm(localAppBrandLocalMediaObject.gpy)) || (localAppBrandPageView == null))
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19735106289664L, 147038);
      return;
    }
    u.b localb1 = u.Av().p("JsApi@" + localAppBrandPageView.hashCode(), true);
    AppBrandPageView.b localb = (AppBrandPageView.b)localb1.get("onBackgroundListener", null);
    paramJSONObject = localb;
    if (localb == null)
    {
      paramJSONObject = new AppBrandPageView.b()
      {
        public final void Wb()
        {
          GMTrace.i(19732153499648L, 147016);
          JsApiStopPlayVoice.Wc();
          localAppBrandPageView.b(this);
          GMTrace.o(19732153499648L, 147016);
        }
      };
      localb1.o("onBackgroundListener", paramJSONObject);
    }
    localAppBrandPageView.a(paramJSONObject);
    if ((AppBrandPageView.c)localb1.get("onDestroyListener", null) == null)
    {
      paramJSONObject = new AppBrandPageView.c()
      {
        public final void onDestroy()
        {
          GMTrace.i(19730140233728L, 147001);
          JsApiStopPlayVoice.Wc();
          localAppBrandPageView.b(this);
          u.b localb = u.Av().gx("JsApi@" + localAppBrandPageView.hashCode());
          if (localb != null) {
            localb.recycle();
          }
          GMTrace.o(19730140233728L, 147001);
        }
      };
      localb1.o("onDestroyListener", paramJSONObject);
      localAppBrandPageView.a(paramJSONObject);
    }
    if (this.iaT == null) {
      this.iaT = new StartPlayVoice(this, paramj, paramInt);
    }
    if (iaS != null)
    {
      paramJSONObject = new HashMap();
      paramJSONObject.put("localId", this.iaT.eHy);
      paramj.v(this.iaT.hYL, d("fail", paramJSONObject));
      GMTrace.o(19735106289664L, 147038);
      return;
    }
    this.iaT.hYJ = this;
    this.iaT.hYK = paramj;
    this.iaT.hYL = paramInt;
    this.iaT.eHy = str;
    this.iaT.filePath = localAppBrandLocalMediaObject.gpy;
    AppBrandMainProcessService.a(this.iaT);
    iaS = str;
    GMTrace.o(19735106289664L, 147038);
  }
  
  private static class StartPlayVoice
    extends MainProcessTask
  {
    public static final Parcelable.Creator<StartPlayVoice> CREATOR;
    public String eHy;
    public String filePath;
    public d hYJ;
    public j hYK;
    public int hYL;
    public boolean hZR;
    
    static
    {
      GMTrace.i(19716584243200L, 146900);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19716584243200L, 146900);
    }
    
    public StartPlayVoice(Parcel paramParcel)
    {
      GMTrace.i(19715644719104L, 146893);
      this.hZR = false;
      f(paramParcel);
      GMTrace.o(19715644719104L, 146893);
    }
    
    public StartPlayVoice(d paramd, j paramj, int paramInt)
    {
      GMTrace.i(19715510501376L, 146892);
      this.hZR = false;
      this.hYJ = paramd;
      this.hYK = paramj;
      this.hYL = paramInt;
      GMTrace.o(19715510501376L, 146892);
    }
    
    public final void RY()
    {
      GMTrace.i(19715778936832L, 146894);
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19748125409280L, 147135);
          ((e)h.h(e.class)).a(JsApiStartPlayVoice.StartPlayVoice.this.filePath, new g.a()new g.b
          {
            public final void onCompletion()
            {
              GMTrace.i(19729603362816L, 146997);
              JsApiStartPlayVoice.StartPlayVoice.this.hZR = false;
              JsApiStartPlayVoice.StartPlayVoice.a(JsApiStartPlayVoice.StartPlayVoice.this);
              GMTrace.o(19729603362816L, 146997);
            }
          }, new g.b()
          {
            public final void onError()
            {
              GMTrace.i(19747588538368L, 147131);
              JsApiStartPlayVoice.StartPlayVoice.this.hZR = true;
              JsApiStartPlayVoice.StartPlayVoice.b(JsApiStartPlayVoice.StartPlayVoice.this);
              GMTrace.o(19747588538368L, 147131);
            }
          });
          GMTrace.o(19748125409280L, 147135);
        }
      });
      GMTrace.o(19715778936832L, 146894);
    }
    
    public final void VK()
    {
      GMTrace.i(19715913154560L, 146895);
      HashMap localHashMap = new HashMap();
      localHashMap.put("localId", this.eHy);
      j localj = this.hYK;
      int i = this.hYL;
      d locald = this.hYJ;
      if (this.hZR) {}
      for (String str = "fail";; str = "ok")
      {
        localj.v(i, locald.d(str, localHashMap));
        JsApiStartPlayVoice.iaS = null;
        GMTrace.o(19715913154560L, 146895);
        return;
      }
    }
    
    public final void f(Parcel paramParcel)
    {
      GMTrace.i(19716047372288L, 146896);
      this.eHy = paramParcel.readString();
      this.filePath = paramParcel.readString();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.hZR = bool;
        GMTrace.o(19716047372288L, 146896);
        return;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19716181590016L, 146897);
      paramParcel.writeString(this.eHy);
      paramParcel.writeString(this.filePath);
      if (this.hZR) {}
      for (byte b = 1;; b = 0)
      {
        paramParcel.writeByte(b);
        GMTrace.o(19716181590016L, 146897);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiStartPlayVoice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */