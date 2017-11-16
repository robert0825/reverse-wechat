package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.compat.a.d.b;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 340;
  private static final String NAME = "enableLocationUpdate";
  public int ieW;
  
  public c()
  {
    GMTrace.i(19707860090880L, 146835);
    this.ieW = 0;
    GMTrace.o(19707860090880L, 146835);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19707994308608L, 146836);
    if (paramJSONObject.optBoolean("enable"))
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19709604921344L, 146848);
          c.this.ieW = com.tencent.mm.plugin.appbrand.page.a.j(paramj.hzM).je(o.i.hFn);
          GMTrace.o(19709604921344L, 146848);
        }
      });
      a.a(String.valueOf(paramj.hashCode()), new a(paramj));
      paramJSONObject = paramj.hyD;
      com.tencent.mm.plugin.appbrand.c.a(paramJSONObject, new c.b()
      {
        public final void onDestroy()
        {
          GMTrace.i(19708799614976L, 146842);
          com.tencent.mm.plugin.appbrand.c.b(paramJSONObject, this);
          a.qi(String.valueOf(paramj.hashCode()));
          GMTrace.o(19708799614976L, 146842);
        }
      });
    }
    for (;;)
    {
      paramj.v(paramInt, d("ok", null));
      GMTrace.o(19707994308608L, 146836);
      return;
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19709068050432L, 146844);
          com.tencent.mm.plugin.appbrand.page.a.j(paramj.hzM).jf(c.this.ieW);
          GMTrace.o(19709068050432L, 146844);
        }
      });
      a.qi(String.valueOf(paramj.hashCode()));
    }
  }
  
  private static final class a
    extends e
    implements a.a
  {
    private static final int CTRL_INDEX = 341;
    private static final String NAME = "onLocationChange";
    private final j hYK;
    
    a(j paramj)
    {
      GMTrace.i(19704504647680L, 146810);
      this.hYK = paramj;
      GMTrace.o(19704504647680L, 146810);
    }
    
    public final void a(double paramDouble1, double paramDouble2, d.b paramb, double paramDouble3, double paramDouble4, double paramDouble5)
    {
      GMTrace.i(19704638865408L, 146811);
      Object localObject = new HashMap(7);
      ((Map)localObject).put("longitude", Double.valueOf(paramDouble2));
      ((Map)localObject).put("latitude", Double.valueOf(paramDouble1));
      ((Map)localObject).put("speed", Double.valueOf(paramDouble3));
      ((Map)localObject).put("accuracy", Double.valueOf(paramDouble4));
      ((Map)localObject).put("altitude", Double.valueOf(paramDouble5));
      ((Map)localObject).put("verticalAccuracy", Float.valueOf(0.0F));
      ((Map)localObject).put("horizontalAccuracy", Double.valueOf(paramDouble4));
      localObject = new JSONObject((Map)localObject).toString();
      w.v("MicroMsg.AppBrand.EventOnLocationChange", "onLocationChanged %s, %s, %s", new Object[] { this.hYK.hyD, paramb.name(), localObject });
      try
      {
        paramb = a(this.hYK);
        paramb.mData = ((String)localObject);
        paramb.VR();
        GMTrace.o(19704638865408L, 146811);
        return;
      }
      finally {}
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\lbs\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */