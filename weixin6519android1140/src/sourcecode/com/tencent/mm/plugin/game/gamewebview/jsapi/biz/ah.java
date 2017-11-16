package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.qi.b;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bqz;
import com.tencent.mm.protocal.c.bra;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ah
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 10000;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "openWeAppPage";
  
  public ah()
  {
    GMTrace.i(17041356488704L, 126968);
    GMTrace.o(17041356488704L, 126968);
  }
  
  public final void a(Context paramContext, final String paramString, GameJsApiMMTask.a parama)
  {
    GMTrace.i(17041490706432L, 126969);
    w.i("MicroMsg.GameJsApiOpenWeAppPage", "invoke");
    paramString = com.tencent.mm.plugin.game.gamewebview.a.d.qe(paramString);
    if (paramString == null)
    {
      w.e("MicroMsg.GameJsApiOpenWeAppPage", "data is null");
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeAppPage:fail_null_data", null));
      GMTrace.o(17041490706432L, 126969);
      return;
    }
    String str1 = paramString.optString("userName");
    String str2 = paramString.optString("relativeURL");
    int i = paramString.optInt("appVersion", 0);
    Object localObject1 = paramString.optString("searchId");
    Object localObject2 = paramString.optString("docId");
    int j = paramString.optInt("position", 1);
    int k = paramString.optInt("scene", 1000);
    paramContext = new qi();
    if (k == 201) {
      paramContext.eUY.scene = 1006;
    }
    for (;;)
    {
      paramContext.eUY.userName = str1;
      paramContext.eUY.eVa = str2;
      paramContext.eUY.eVc = i;
      paramContext.eUY.eVf = false;
      str1 = paramString.optString("statSessionId");
      str2 = paramString.optString("statKeywordId");
      String str3 = paramString.optString("subScene");
      paramContext.eUY.eAv = (str1 + ":" + str2 + ":" + (String)localObject1 + ":" + (String)localObject2 + ":" + j + ":" + str3);
      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
      localObject1 = new b.a();
      ((b.a)localObject1).gtF = new bqz();
      ((b.a)localObject1).gtG = new bra();
      ((b.a)localObject1).uri = "/cgi-bin/mmux-bin/weappsearchadclick";
      ((b.a)localObject1).gtE = 1873;
      localObject1 = ((b.a)localObject1).DA();
      localObject2 = (bqz)((b)localObject1).gtC.gtK;
      ((bqz)localObject2).vaK = paramString.optString("statSessionId");
      ((bqz)localObject2).vaL = paramString.optString("statKeywordId");
      ((bqz)localObject2).uBW = paramString.optString("searchId");
      ((bqz)localObject2).uMU = paramString.optString("docId");
      ((bqz)localObject2).vaM = paramString.optInt("position", 1);
      ((bqz)localObject2).nFA = paramString.optString("userName");
      ((bqz)localObject2).vaN = paramString.optInt("appVersion", 0);
      ((bqz)localObject2).vaO = paramString.optString("adBuffer");
      ((bqz)localObject2).vaP = paramString.optString("clickExtInfo");
      paramString = new com.tencent.mm.modelsns.d();
      paramString.q("20StatSessionId", ((bqz)localObject2).vaK + ",");
      paramString.q("21KeywordId", ((bqz)localObject2).vaL + ",");
      paramString.q("22SearchId", ((bqz)localObject2).uBW + ",");
      paramString.q("23DocId", ((bqz)localObject2).uMU + ",");
      paramString.q("24Pos", ((bqz)localObject2).vaM + ",");
      paramString.q("25AppUserName", ((bqz)localObject2).nFA + ",");
      paramString.q("26AppVersion", ((bqz)localObject2).vaN + ",");
      paramString.q("27AdBuffer", ((bqz)localObject2).vaO + ",");
      paramString.q("28AdClickBuffer", ((bqz)localObject2).vaP + ",");
      paramString.q("29scene", k + ",");
      w.i("MicroMsg.GameJsApiOpenWeAppPage", "doClickReportScene oreh" + paramString.LT());
      u.a((b)localObject1, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(17068871122944L, 127173);
          w.d("MicroMsg.GameJsApiOpenWeAppPage", "onGYNetEnd oreh errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.i("MicroMsg.GameJsApiOpenWeAppPage", "report oreh logbuffer(13927)");
            g.ork.i(13927, new Object[] { paramString });
            g.ork.a(457L, 0L, 1L, false);
          }
          GMTrace.o(17068871122944L, 127173);
          return 0;
        }
      });
      if (!paramContext.eUZ.eVk) {
        break;
      }
      parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeAppPage:ok", null));
      GMTrace.o(17041490706432L, 126969);
      return;
      if (k == 3) {
        paramContext.eUY.scene = 1005;
      } else if (k == 16) {
        paramContext.eUY.scene = 1042;
      } else {
        paramContext.eUY.scene = 1000;
      }
    }
    parama.qp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.d("openWeAppPage:fail:" + bg.nl(paramContext.eUZ.eVl), null));
    GMTrace.o(17041490706432L, 126969);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */