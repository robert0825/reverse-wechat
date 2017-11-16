package com.tencent.mm.plugin.game.gamewebview.jsapi;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.GameJsApiGetGameCommInfo;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.GameJsApiGetOpenDeviceId;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.GameJsApiLaunchApplication;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.GameJsApiOperateGameCenterMsg;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.GameJsApiSendAppMessage;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.aa;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ab;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ac;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ad;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ae;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.af;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ag;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ah;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ai;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.aj;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ak;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.al;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.am;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.an;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ao;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ap;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.aq;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ar;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.as;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.at;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.au;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.av;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.aw;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ax;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ay;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.az;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.b;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.ba;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.bb;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.bc;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.bd;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.e;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.f;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.g;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.h;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.i;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.j;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.k;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.l;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.m;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.n;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.o;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.p;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.q;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.r;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.s;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.t;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.u;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.v;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.w;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.x;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.y;
import com.tencent.mm.plugin.game.gamewebview.jsapi.biz.z;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  private static Map<String, c> lGK;
  
  private static void a(c paramc)
  {
    GMTrace.i(17025787232256L, 126852);
    if (bg.nm(paramc.getName()))
    {
      GMTrace.o(17025787232256L, 126852);
      return;
    }
    lGK.put(paramc.getName(), paramc);
    GMTrace.o(17025787232256L, 126852);
  }
  
  public static Map<String, c> aDS()
  {
    GMTrace.i(17025653014528L, 126851);
    if ((lGK == null) || (lGK.size() == 0))
    {
      lGK = new HashMap();
      a(new a());
      a(new b());
      a(new com.tencent.mm.plugin.game.gamewebview.jsapi.biz.c());
      a(new com.tencent.mm.plugin.game.gamewebview.jsapi.biz.d());
      a(new e());
      a(new f());
      a(new g());
      a(new h());
      a(new i());
      a(new j());
      a(new k());
      a(new l());
      a(new m());
      a(new n());
      a(new o());
      a(new GameJsApiGetGameCommInfo());
      a(new p());
      a(new q());
      a(new r());
      a(new s());
      a(new GameJsApiGetOpenDeviceId());
      a(new t());
      a(new u());
      a(new v());
      a(new w());
      a(new x());
      a(new y());
      a(new GameJsApiLaunchApplication());
      a(new z());
      a(new aa());
      a(new ab());
      a(new ad());
      a(new ae());
      a(new ac());
      a(new af());
      a(new ag());
      a(new ah());
      a(new GameJsApiOperateGameCenterMsg());
      a(new ai());
      a(new aj());
      a(new ak());
      a(new al());
      a(new am());
      a(new an());
      a(new ap());
      a(new aq());
      a(new GameJsApiSendAppMessage());
      a(new ar());
      a(new as());
      a(new at());
      a(new au());
      a(new av());
      a(new aw());
      a(new ax());
      a(new ay());
      a(new az());
      a(new ba());
      a(new bb());
      a(new bc());
      a(new bd());
      a(new ao());
    }
    Map localMap = lGK;
    GMTrace.o(17025653014528L, 126851);
    return localMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */