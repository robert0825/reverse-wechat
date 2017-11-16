package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b
  extends a
{
  public static final int CTRL_INDEX = 103;
  public static final String NAME = "chooseLocation";
  public int hXU;
  
  public b()
  {
    GMTrace.i(19707323219968L, 146831);
    this.hXU = 0;
    GMTrace.o(19707323219968L, 146831);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19707457437696L, 146832);
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("map_view_type", 8);
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      paramj.v(paramInt, d("fail", null));
      w.e("MicroMsg.JsApiChooseLocation", "mmActivity is null, invoke fail!");
      GMTrace.o(19707457437696L, 146832);
      return;
    }
    this.hXU = paramInt;
    localMMActivity.vKC = new MMActivity.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        GMTrace.i(19707725873152L, 146834);
        if (paramAnonymousInt1 == 1)
        {
          if (paramAnonymousInt2 == -1)
          {
            if (paramAnonymousIntent == null)
            {
              paramj.v(b.this.hXU, b.this.d("fail", null));
              w.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
              GMTrace.o(19707725873152L, 146834);
              return;
            }
            paramAnonymousIntent = (Addr)paramAnonymousIntent.getParcelableExtra("key_pick_addr");
            HashMap localHashMap = new HashMap();
            if (paramAnonymousIntent != null)
            {
              w.i("MicroMsg.JsApiChooseLocation", "addr: " + paramAnonymousIntent.toString());
              StringBuilder localStringBuilder = new StringBuilder();
              if (!TextUtils.isEmpty(paramAnonymousIntent.gEy))
              {
                localStringBuilder.append(paramAnonymousIntent.gEy);
                localHashMap.put("address", localStringBuilder.toString());
                if (TextUtils.isEmpty(paramAnonymousIntent.gEH)) {
                  break label271;
                }
                localHashMap.put("name", paramAnonymousIntent.gEH);
              }
              for (;;)
              {
                localHashMap.put("latitude", Float.valueOf(paramAnonymousIntent.gEJ));
                localHashMap.put("longitude", Float.valueOf(paramAnonymousIntent.gEK));
                paramj.v(b.this.hXU, b.this.d("ok", localHashMap));
                GMTrace.o(19707725873152L, 146834);
                return;
                localStringBuilder.append(paramAnonymousIntent.Io());
                break;
                label271:
                localHashMap.put("name", localStringBuilder.toString());
              }
            }
            paramj.v(b.this.hXU, b.this.d("fail", null));
            w.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
            GMTrace.o(19707725873152L, 146834);
            return;
          }
          if (paramAnonymousInt2 == 0)
          {
            paramj.v(b.this.hXU, b.this.d("cancel", null));
            w.e("MicroMsg.JsApiChooseLocation", "location result is cancel!");
            GMTrace.o(19707725873152L, 146834);
            return;
          }
          paramj.v(b.this.hXU, b.this.d("fail", null));
          w.e("MicroMsg.JsApiChooseLocation", "location result is fail!");
        }
        GMTrace.o(19707725873152L, 146834);
      }
    };
    com.tencent.mm.bj.d.b(localMMActivity, "location", ".ui.RedirectUI", paramJSONObject, 1);
    GMTrace.o(19707457437696L, 146832);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\lbs\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */