package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 332;
  public static final String NAME = "operateCamera";
  
  public h()
  {
    GMTrace.i(19836709109760L, 147795);
    GMTrace.o(19836709109760L, 147795);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19836843327488L, 147796);
    if (paramJSONObject == null)
    {
      paramj.v(paramInt, d("fail:data is null or nil", null));
      GMTrace.o(19836843327488L, 147796);
      return;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19837648633856L, 147802);
        int i = paramJSONObject.optInt("cameraId");
        Object localObject2 = paramJSONObject.optString("type");
        w.i("MicroMsg.JsApiOperateCamera", "cameraId=%d type=%s", new Object[] { Integer.valueOf(i), localObject2 });
        Object localObject1 = a.a.idv;
        Integer localInteger = Integer.valueOf(i);
        if (((a)localObject1).idu.containsKey(localInteger)) {}
        for (localObject1 = (AppBrandCameraView)((a)localObject1).idu.get(localInteger); localObject1 == null; localObject1 = null)
        {
          paramj.v(paramInt, h.this.d("fail:no such camera", null));
          GMTrace.o(19837648633856L, 147802);
          return;
        }
        ((AppBrandCameraView)localObject1).idH = new c()
        {
          public final void b(int paramAnonymous2Int1, String paramAnonymous2String1, String paramAnonymous2String2, int paramAnonymous2Int2, int paramAnonymous2Int3)
          {
            GMTrace.i(19845299044352L, 147859);
            if (paramAnonymous2Int1 == 0)
            {
              paramAnonymous2String2 = new HashMap();
              paramAnonymous2String2.put("tempImagePath", paramAnonymous2String1);
              paramAnonymous2String2.put("width", Integer.valueOf(paramAnonymous2Int2));
              paramAnonymous2String2.put("height", Integer.valueOf(paramAnonymous2Int3));
              h.1.this.hXV.v(h.1.this.fXx, h.this.d("ok", paramAnonymous2String2));
              GMTrace.o(19845299044352L, 147859);
              return;
            }
            h.1.this.hXV.v(h.1.this.fXx, h.this.d("fail:" + paramAnonymous2String2, null));
            GMTrace.o(19845299044352L, 147859);
          }
          
          public final void b(int paramAnonymous2Int, String paramAnonymous2String1, String paramAnonymous2String2, String paramAnonymous2String3)
          {
            GMTrace.i(19845567479808L, 147861);
            w.d("MicroMsg.JsApiOperateCamera", "onStopRecord ret %d, thumbPath %s,tempVideoPath %s", new Object[] { Integer.valueOf(paramAnonymous2Int), paramAnonymous2String2, paramAnonymous2String3 });
            if (paramAnonymous2Int == 0)
            {
              paramAnonymous2String1 = new HashMap();
              paramAnonymous2String1.put("tempThumbPath", paramAnonymous2String2);
              paramAnonymous2String1.put("tempVideoPath", paramAnonymous2String3);
              h.1.this.hXV.v(h.1.this.fXx, h.this.d("ok", paramAnonymous2String1));
              GMTrace.o(19845567479808L, 147861);
              return;
            }
            h.1.this.hXV.v(h.1.this.fXx, h.this.d("fail:" + paramAnonymous2String1, null));
            GMTrace.o(19845567479808L, 147861);
          }
          
          public final void x(int paramAnonymous2Int, String paramAnonymous2String)
          {
            GMTrace.i(19845433262080L, 147860);
            if (paramAnonymous2Int == 0)
            {
              h.1.this.hXV.v(h.1.this.fXx, h.this.d("ok", null));
              GMTrace.o(19845433262080L, 147860);
              return;
            }
            h.1.this.hXV.v(h.1.this.fXx, h.this.d("fail:" + paramAnonymous2String, null));
            GMTrace.o(19845433262080L, 147860);
          }
        };
        i = -1;
        switch (((String)localObject2).hashCode())
        {
        }
        for (;;)
        {
          switch (i)
          {
          default: 
            w.w("MicroMsg.JsApiOperateCamera", "operateType not supported: %s", new Object[] { localObject2 });
            paramj.v(paramInt, h.this.d("fail:operateType not supported", null));
            GMTrace.o(19837648633856L, 147802);
            return;
            if (((String)localObject2).equals("takePhoto"))
            {
              i = 0;
              continue;
              if (((String)localObject2).equals("startRecord"))
              {
                i = 1;
                continue;
                if (((String)localObject2).equals("stopRecord")) {
                  i = 2;
                }
              }
            }
            break;
          }
        }
        localObject2 = paramJSONObject.optString("quality", "high");
        if (!bg.eW(((AppBrandCameraView)localObject1).idA, (String)localObject2)) {
          ((AppBrandCameraView)localObject1).idA = ((String)localObject2);
        }
        w.i("MicroMsg.AppBrandCameraView", "takePicture.");
        if (((AppBrandCameraView)localObject1).idJ == null)
        {
          w.i("MicroMsg.AppBrandCameraView", "recordView is null");
          GMTrace.o(19837648633856L, 147802);
          return;
        }
        if (((AppBrandCameraView)localObject1).idN == 2)
        {
          w.w("MicroMsg.AppBrandCameraView", "takePicture is recording!!");
          GMTrace.o(19837648633856L, 147802);
          return;
        }
        if ((((AppBrandCameraView)localObject1).idO) || (bg.aI(((AppBrandCameraView)localObject1).idP) < 300L))
        {
          w.i("MicroMsg.AppBrandCameraView", "not the right time to take picture.");
          GMTrace.o(19837648633856L, 147802);
          return;
        }
        ((AppBrandCameraView)localObject1).idP = bg.Pw();
        ((AppBrandCameraView)localObject1).idO = true;
        ((AppBrandCameraView)localObject1).idN = 3;
        ((AppBrandCameraView)localObject1).idJ.a(new AppBrandCameraView.1((AppBrandCameraView)localObject1), "on".equals(((AppBrandCameraView)localObject1).idz));
        GMTrace.o(19837648633856L, 147802);
        return;
        w.i("MicroMsg.AppBrandCameraView", "startRecord.");
        localObject2 = a.a.idv;
        if ((!((a)localObject2).ids) || (!((a)localObject2).idt)) {
          w.i("MicroMsg.AppBrandCameraMrg", "no all permission");
        }
        if ((((a)localObject2).ids) && (((a)localObject2).idt)) {}
        for (i = 1; i == 0; i = 0)
        {
          Toast.makeText(((AppBrandCameraView)localObject1).mContext, o.i.hGW, 1).show();
          w.w("MicroMsg.AppBrandCameraView", "no micro phone permission");
          ((AppBrandCameraView)localObject1).x(-1, "permission");
          GMTrace.o(19837648633856L, 147802);
          return;
        }
        if (((AppBrandCameraView)localObject1).idN == 2)
        {
          w.w("MicroMsg.AppBrandCameraView", "startRecord is recording!!");
          ((AppBrandCameraView)localObject1).x(-1, "is recording");
          GMTrace.o(19837648633856L, 147802);
          return;
        }
        ((AppBrandCameraView)localObject1).idQ = bg.Pw();
        ((AppBrandCameraView)localObject1).idJ.mXc.qw();
        ((AppBrandCameraView)localObject1).idN = 2;
        ((AppBrandCameraView)localObject1).x(0, "");
        ((AppBrandCameraView)localObject1).WE();
        GMTrace.o(19837648633856L, 147802);
        return;
        long l = bg.aI(((AppBrandCameraView)localObject1).idQ);
        if (l < 1500L)
        {
          w.i("MicroMsg.AppBrandCameraView", "stopRecord in %d ms later", new Object[] { Long.valueOf(1500L - l) });
          af.i(new AppBrandCameraView.4((AppBrandCameraView)localObject1), 1500L - l);
          GMTrace.o(19837648633856L, 147802);
          return;
        }
        ((AppBrandCameraView)localObject1).pL();
        GMTrace.o(19837648633856L, 147802);
      }
    });
    GMTrace.o(19836843327488L, 147796);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\camera\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */