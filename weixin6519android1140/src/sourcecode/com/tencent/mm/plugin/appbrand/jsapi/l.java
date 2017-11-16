package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import com.tencent.mm.plugin.appbrand.jsapi.e.b;
import com.tencent.mm.plugin.appbrand.jsapi.e.c;
import com.tencent.mm.plugin.appbrand.jsapi.e.d;
import com.tencent.mm.plugin.appbrand.jsapi.e.e;
import com.tencent.mm.plugin.appbrand.jsapi.e.f;

public abstract interface l
{
  public static final Class[] hXR;
  public static final Class[] hXS;
  public static final Class[] hXT;
  
  static
  {
    GMTrace.i(18838531866624L, 140358);
    hXR = new Class[] { w.a.class, x.a.class };
    hXS = new Class[] { v.class, ab.class, JsApiGetAudioState.class, JsApiGetMusicPlayerState.class, JsApiGetBackgroundAudioState.class };
    hXT = new Class[] { b.class, e.class, c.class, d.class, f.class };
    GMTrace.o(18838531866624L, 140358);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */