package com.tencent.mm.plugin.appbrand.jsapi.h;

import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 106;
  private static final String NAME = "hideToast";
  
  public a()
  {
    GMTrace.i(17678756478976L, 131717);
    GMTrace.o(17678756478976L, 131717);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17678890696704L, 131718);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17677816954880L, 131710);
        a locala = a.this;
        j localj = paramj;
        int i = paramInt;
        Object localObject = u.Av().gx(localj.hashCode() + "toast_name");
        if (localObject != null)
        {
          localObject = (View)((u.b)localObject).get("toast_view", null);
          if (localObject != null)
          {
            ((View)localObject).setVisibility(8);
            localj.v(i, locala.d("ok", null));
            GMTrace.o(17677816954880L, 131710);
            return;
          }
        }
        localj.v(i, locala.d("fail", null));
        GMTrace.o(17677816954880L, 131710);
      }
    });
    GMTrace.o(17678890696704L, 131718);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */