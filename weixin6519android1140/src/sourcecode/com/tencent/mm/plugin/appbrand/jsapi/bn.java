package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class bn
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "setKeepScreenOn";
  public static boolean hZp;
  j hYK;
  PowerManager.WakeLock wakeLock;
  
  static
  {
    GMTrace.i(17390859452416L, 129572);
    hZp = false;
    GMTrace.o(17390859452416L, 129572);
  }
  
  public bn()
  {
    GMTrace.i(17390188363776L, 129567);
    GMTrace.o(17390188363776L, 129567);
  }
  
  public final boolean VW()
  {
    GMTrace.i(17390456799232L, 129569);
    if (this.hYK.mContext == null)
    {
      w.e("MicroMsg.JsApiSetKeepScreenOn", "acquire fail, server context is nul");
      GMTrace.o(17390456799232L, 129569);
      return false;
    }
    w.e("MicroMsg.JsApiSetKeepScreenOn", "acquire ok");
    MMActivity localMMActivity = (MMActivity)this.hYK.mContext;
    if (this.wakeLock == null) {
      this.wakeLock = ((PowerManager)localMMActivity.getSystemService("power")).newWakeLock(536870922, "MicroMsg.JsApiSetKeepScreenOn");
    }
    if (!this.wakeLock.isHeld())
    {
      this.wakeLock.acquire();
      w.i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock acquire");
    }
    for (;;)
    {
      GMTrace.o(17390456799232L, 129569);
      return true;
      w.i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock has held ");
    }
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17390322581504L, 129568);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(17390322581504L, 129568);
      return;
    }
    if (paramj.mContext == null)
    {
      w.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, server context is nul");
      paramj.v(paramInt, d("fail:context is null", null));
      GMTrace.o(17390322581504L, 129568);
      return;
    }
    boolean bool = paramJSONObject.optBoolean("keepScreenOn", false);
    hZp = bool;
    w.i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, keepScreenOn:%b, appId:%s", new Object[] { Boolean.valueOf(bool), paramj.hyD });
    this.hYK = paramj;
    if (bool)
    {
      paramJSONObject = new c.b()
      {
        public final void a(c.c paramAnonymousc)
        {
          GMTrace.i(17394751766528L, 129601);
          w.i("MicroMsg.JsApiSetKeepScreenOn", "onPause");
          if (bn.this.isHeld()) {
            bn.this.release();
          }
          GMTrace.o(17394751766528L, 129601);
        }
        
        public final void onDestroy()
        {
          GMTrace.i(17394617548800L, 129600);
          w.i("MicroMsg.JsApiSetKeepScreenOn", "onDestroy");
          if (bn.this.isHeld()) {
            bn.this.release();
          }
          c.b(paramj.hyD, this);
          GMTrace.o(17394617548800L, 129600);
        }
        
        public final void onResume()
        {
          GMTrace.i(17394885984256L, 129602);
          w.i("MicroMsg.JsApiSetKeepScreenOn", "onResume");
          if (bn.hZp) {
            bn.this.VW();
          }
          GMTrace.o(17394885984256L, 129602);
        }
      };
      c.a(paramj.hyD, paramJSONObject);
      bool = VW();
    }
    while (bool)
    {
      w.i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn ok");
      paramj.v(paramInt, d("ok", null));
      GMTrace.o(17390322581504L, 129568);
      return;
      if (isHeld())
      {
        w.i("MicroMsg.JsApiSetKeepScreenOn", "reset screen off");
        bool = release();
      }
      else
      {
        w.e("MicroMsg.JsApiSetKeepScreenOn", "fail, has not set screen");
        paramj.v(paramInt, d("fail:has not set screen", null));
        GMTrace.o(17390322581504L, 129568);
        return;
      }
    }
    w.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn fail");
    paramj.v(paramInt, d("fail", null));
    GMTrace.o(17390322581504L, 129568);
  }
  
  public final boolean isHeld()
  {
    GMTrace.i(17390725234688L, 129571);
    if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
    {
      GMTrace.o(17390725234688L, 129571);
      return true;
    }
    GMTrace.o(17390725234688L, 129571);
    return false;
  }
  
  public final boolean release()
  {
    GMTrace.i(17390591016960L, 129570);
    w.e("MicroMsg.JsApiSetKeepScreenOn", "release");
    if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
    {
      this.wakeLock.release();
      this.wakeLock = null;
      GMTrace.o(17390591016960L, 129570);
      return true;
    }
    w.e("MicroMsg.JsApiSetKeepScreenOn", "wakeLock is  null");
    GMTrace.o(17390591016960L, 129570);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */