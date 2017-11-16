package com.tencent.mm.plugin.appbrand.dynamic;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.jsapi.b.d;
import com.tencent.mm.jsapi.c.a;
import com.tencent.mm.jsapi.core.MiniJsBridge;
import com.tencent.mm.jsapi.core.MiniJsBridge.a;
import com.tencent.mm.jsapi.core.c.a;
import com.tencent.mm.plugin.appbrand.dynamic.i.b.b;
import com.tencent.mm.plugin.appbrand.widget.l;
import com.tencent.mm.protocal.c.qj;
import com.tencent.mm.protocal.c.qk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.u.b;
import java.util.Iterator;
import java.util.Set;

public final class c
  implements com.tencent.mm.plugin.appbrand.canvas.widget.b
{
  public String appId;
  String fXC;
  public volatile MiniJsBridge fXz;
  String gRc;
  String hNz;
  private com.tencent.mm.ipcinvoker.wx_extension.b.a hSA;
  public Runnable hSB;
  public int hSt;
  public l hSu;
  public String hSv;
  volatile boolean hSw;
  private volatile boolean hSx;
  public boolean hSy;
  public boolean hSz;
  Context mContext;
  boolean mRunning;
  String mUrl;
  
  public c(Context paramContext)
  {
    GMTrace.i(17751905140736L, 132262);
    this.hSy = false;
    this.hSz = false;
    this.mContext = paramContext;
    this.hSA = new com.tencent.mm.ipcinvoker.wx_extension.b.a()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb)
      {
        GMTrace.i(17720498192384L, 132028);
        w.d("MicroMsg.DynamicPageViewIPCProxy", "getDynamicData result(errType : %s, errCode : %s, errMsg : %s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        l locall = c.this.hSu;
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(638L, 0L, 1L, false);
          if ((c.this.hSt == 1) && (!c.this.hSy)) {
            com.tencent.mm.plugin.report.service.g.ork.i(14452, new Object[] { c.this.hSv + "-" + c.this.appId, Integer.valueOf(10), Long.valueOf(System.currentTimeMillis()) });
          }
          if (locall != null) {}
          for (long l = locall.field_interval;; l = 10L)
          {
            b.e(c.this.hSB, l * 1000L);
            GMTrace.o(17720498192384L, 132028);
            return;
          }
        }
        if ((c.this.hSt == 1) && (!c.this.hSy))
        {
          c.this.hSy = true;
          com.tencent.mm.plugin.report.service.g.ork.i(14452, new Object[] { c.this.hSv + "-" + c.this.appId, Integer.valueOf(9), Long.valueOf(System.currentTimeMillis()) });
        }
        paramAnonymousb = (qk)paramAnonymousb.gtD.gtK;
        if (paramAnonymousb.ugp != null) {}
        for (paramAnonymousString = paramAnonymousb.ugp.bNS(); locall == null; paramAnonymousString = "")
        {
          GMTrace.o(17720498192384L, 132028);
          return;
        }
        if (!bg.nm(paramAnonymousString)) {
          locall.field_data = paramAnonymousString;
        }
        locall.field_interval = paramAnonymousb.heG;
        locall.field_updateTime = System.currentTimeMillis();
        paramAnonymousString = (Bundle)com.tencent.mm.ipcinvoker.e.a("com.tencent.mm", locall.qL(), b.b.class);
        if (paramAnonymousString != null) {
          paramAnonymousString.getBoolean("result", false);
        }
        if (!c.this.mRunning)
        {
          w.i("MicroMsg.DynamicPageViewIPCProxy", "not running");
          GMTrace.o(17720498192384L, 132028);
          return;
        }
        c.a(c.this.fXz, locall);
        if ((c.this.hSt == 1) && (!c.this.hSz))
        {
          c.this.hSz = true;
          com.tencent.mm.plugin.report.service.g.ork.i(14452, new Object[] { c.this.hSv + "-" + c.this.appId, Integer.valueOf(11), Long.valueOf(System.currentTimeMillis()) });
        }
        if (locall.field_interval > 0) {
          c.this.UN();
        }
        GMTrace.o(17720498192384L, 132028);
      }
    };
    this.hSB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17729356562432L, 132094);
        c.this.UN();
        GMTrace.o(17729356562432L, 132094);
      }
    };
    GMTrace.o(17751905140736L, 132262);
  }
  
  public static void a(MiniJsBridge paramMiniJsBridge, l paraml)
  {
    boolean bool2 = false;
    GMTrace.i(19941667373056L, 148577);
    if ((paramMiniJsBridge == null) || (paraml == null) || (bg.nm(paraml.field_data)))
    {
      if (paramMiniJsBridge == null) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        if (paraml == null) {
          bool2 = true;
        }
        w.d("MicroMsg.DynamicPageViewIPCProxy", "pushData failed, jsBridge(isNull : %s) or cacheData(isNull : %s) or cacheData.field_data is null", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        GMTrace.o(19941667373056L, 148577);
        return;
      }
    }
    com.tencent.mm.plugin.appbrand.dynamic.e.c localc = new com.tencent.mm.plugin.appbrand.dynamic.e.c();
    localc.data = paraml.field_data;
    paramMiniJsBridge.a(localc);
    GMTrace.o(19941667373056L, 148577);
  }
  
  public final void UN()
  {
    GMTrace.i(17752173576192L, 132264);
    l locall = this.hSu;
    if ((locall == null) || (!this.mRunning))
    {
      GMTrace.o(17752173576192L, 132264);
      return;
    }
    if (this.hSw)
    {
      this.hSx = true;
      GMTrace.o(17752173576192L, 132264);
      return;
    }
    if (bg.nm(locall.field_appId))
    {
      w.e("MicroMsg.DynamicPageViewIPCProxy", "tryToRefresh(%s) failed, has no appId", new Object[] { this.fXC });
      GMTrace.o(17752173576192L, 132264);
      return;
    }
    this.hSx = false;
    long l = locall.field_updateTime + locall.field_interval * 1000L - System.currentTimeMillis();
    if (l > 0L)
    {
      w.d("MicroMsg.DynamicPageViewIPCProxy", "post delay refresh(%s) data.", new Object[] { Long.valueOf(l) });
      b.e(this.hSB, l);
      GMTrace.o(17752173576192L, 132264);
      return;
    }
    w.d("MicroMsg.DynamicPageViewIPCProxy", "refresh data(%s, %s, %s)", new Object[] { this.hSu.field_id, this.hSu.field_appId, this.hSu.field_cacheKey });
    com.tencent.mm.ad.b.a locala = new com.tencent.mm.ad.b.a();
    locala.gtE = 1193;
    locala.uri = "/cgi-bin/mmbiz-bin/wxaapp/getdynamicdata";
    qj localqj = new qj();
    localqj.eSd = locall.field_appId;
    localqj.amf = locall.field_cacheKey;
    localqj.scene = this.hSt;
    localqj.eQb = this.gRc;
    localqj.url = this.mUrl;
    locala.gtF = localqj;
    locala.gtG = new qk();
    com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.DA(), this.hSA);
    GMTrace.o(17752173576192L, 132264);
  }
  
  public final boolean aT(String paramString1, String paramString2)
  {
    GMTrace.i(19941533155328L, 148576);
    if ((this.fXz == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      GMTrace.o(19941533155328L, 148576);
      return false;
    }
    com.tencent.mm.jsapi.core.e locale = this.fXz.fXE;
    Object localObject = locale.fXI.ew(paramString1);
    if (localObject == null)
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) do not exist.", new Object[] { paramString1 });
      GMTrace.o(19941533155328L, 148576);
      return false;
    }
    if (!locale.fXu.eS(((com.tencent.mm.jsapi.b.e)localObject).getIndex()))
    {
      w.i("MicroMsg.MiniJsEventDispatcher", "JsEvent(%s) no permission.", new Object[] { paramString1 });
      GMTrace.o(19941533155328L, 148576);
      return false;
    }
    localObject = paramString2;
    if (bg.nm(paramString2)) {
      localObject = "{}";
    }
    w.d("MicroMsg.MiniJsEventDispatcher", "dispatch, event: %s, data size: %s, srcId: %d", new Object[] { paramString1, Integer.valueOf(((String)localObject).length()), Integer.valueOf(0) });
    locale.fXF.evaluateJavascript(String.format("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler(\"%s\", %s, %s, %s)", new Object[] { paramString1, localObject, "undefined", com.tencent.mm.jsapi.core.e.ws() }), null);
    GMTrace.o(19941533155328L, 148576);
    return true;
  }
  
  void cleanup()
  {
    GMTrace.i(17752039358464L, 132263);
    if (this.hSu != null) {
      w.i("MicroMsg.DynamicPageViewIPCProxy", "cleanup(%s, %s, %s)", new Object[] { this.hSu.field_id, this.hSu.field_appId, this.hSu.field_cacheKey });
    }
    for (;;)
    {
      if (this.fXz != null)
      {
        MiniJsBridge localMiniJsBridge = this.fXz;
        w.v("MicroMsg.MiniJsBridge", "onStop(%s)", new Object[] { localMiniJsBridge.fXC });
        localMiniJsBridge.mRunning = false;
        localMiniJsBridge.fXF.cleanup();
        com.tencent.mm.jsapi.core.c localc = localMiniJsBridge.fXD;
        localc.fXw.quit();
        localc.fXt.fXA.recycle();
        if (localMiniJsBridge.fXH != null)
        {
          localMiniJsBridge.fXH.r(localMiniJsBridge.fXC, 4);
          localMiniJsBridge.fXH = null;
        }
      }
      GMTrace.o(17752039358464L, 132263);
      return;
      w.i("MicroMsg.DynamicPageViewIPCProxy", "cleanup");
    }
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18854235340800L, 140475);
    boolean bool = this.hSw;
    GMTrace.o(18854235340800L, 140475);
    return bool;
  }
  
  public final void onPause()
  {
    GMTrace.i(18853966905344L, 140473);
    w.i("MicroMsg.DynamicPageViewIPCProxy", "onPause(%s)", new Object[] { this.fXC });
    this.hSw = true;
    if (this.fXz != null) {
      this.fXz.b(new com.tencent.mm.plugin.appbrand.dynamic.e.f());
    }
    GMTrace.o(18853966905344L, 140473);
  }
  
  public final void onResume()
  {
    GMTrace.i(18854101123072L, 140474);
    w.i("MicroMsg.DynamicPageViewIPCProxy", "onResume(%s)", new Object[] { this.fXC });
    boolean bool = this.hSw;
    if (this.fXz != null) {
      this.fXz.c(new com.tencent.mm.plugin.appbrand.dynamic.e.g());
    }
    this.hSw = false;
    if ((bool) && (this.hSx)) {
      UN();
    }
    GMTrace.o(18854101123072L, 140474);
  }
  
  public final void q(Bundle paramBundle)
  {
    GMTrace.i(17752442011648L, 132266);
    if (paramBundle == null)
    {
      GMTrace.o(17752442011648L, 132266);
      return;
    }
    u.b localb = this.fXz.fXD.fXt.fXA;
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localb.o(str, paramBundle.get(str));
    }
    GMTrace.o(17752442011648L, 132266);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */