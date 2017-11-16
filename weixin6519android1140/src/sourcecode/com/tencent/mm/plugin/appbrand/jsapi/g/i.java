package com.tencent.mm.plugin.appbrand.jsapi.g;

import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.widget.picker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import com.tencent.mm.plugin.appbrand.widget.picker.g.a;
import com.tencent.mm.plugin.appbrand.widget.picker.h;
import com.tencent.mm.plugin.appbrand.widget.picker.k;
import org.json.JSONObject;

final class i
  extends c
{
  int ijZ;
  int ika;
  int ikb;
  int ikc;
  int ikd;
  int ike;
  
  i()
  {
    GMTrace.i(10377580511232L, 77319);
    this.ijZ = -1;
    this.ika = -1;
    this.ikb = Integer.MAX_VALUE;
    this.ikc = Integer.MAX_VALUE;
    this.ikd = -1;
    this.ike = -1;
    GMTrace.o(10377580511232L, 77319);
  }
  
  final void l(JSONObject paramJSONObject)
  {
    GMTrace.i(10377714728960L, 77320);
    Object localObject2 = paramJSONObject.optJSONObject("range");
    if (localObject2 != null)
    {
      Object localObject1 = ((JSONObject)localObject2).optString("start");
      localObject2 = ((JSONObject)localObject2).optString("end");
      localObject1 = k.tb((String)localObject1);
      if (localObject1 != null)
      {
        this.ijZ = localObject1[0];
        this.ika = localObject1[1];
      }
      localObject1 = k.tb((String)localObject2);
      if (localObject1 != null)
      {
        this.ikb = localObject1[0];
        this.ikc = localObject1[1];
      }
    }
    this.ijZ = Math.max(this.ijZ, 0);
    this.ika = Math.max(this.ika, 0);
    this.ikb = Math.min(this.ikb, 23);
    this.ikc = Math.min(this.ikc, 59);
    paramJSONObject = k.tb(paramJSONObject.optString("current"));
    if (paramJSONObject != null)
    {
      this.ikd = paramJSONObject[0];
      this.ike = paramJSONObject[1];
    }
    d.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10377983164416L, 77322);
        i locali = i.this;
        h localh = (h)locali.r(h.class);
        if (localh == null)
        {
          locali.e("fail cant init view", null);
          GMTrace.o(10377983164416L, 77322);
          return;
        }
        a locala = locali.iRs;
        int i = locali.ijZ;
        int j = locali.ika;
        localh.ijZ = i;
        localh.ika = j;
        if ((k.kp(localh.ijZ)) && (localh.iRX != null)) {
          localh.iRX.setMinValue(localh.ijZ);
        }
        i = locali.ikb;
        j = locali.ikc;
        localh.ikb = i;
        localh.ikc = j;
        if ((k.kp(localh.ikb)) && (localh.iRX != null)) {
          localh.iRX.setMaxValue(localh.ikb);
        }
        i = locali.ikd;
        j = locali.ike;
        if ((k.kp(i)) && (k.ko(j)))
        {
          localh.setCurrentHour(Integer.valueOf(i));
          localh.setCurrentMinute(Integer.valueOf(j));
        }
        localh.adN();
        locala.iRS = new i.2(locali);
        locala.show();
        GMTrace.o(10377983164416L, 77322);
      }
    });
    GMTrace.o(10377714728960L, 77320);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\g\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */