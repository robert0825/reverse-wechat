package com.tencent.mm.plugin.welab.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e;
import com.tencent.mm.az.k;
import com.tencent.mm.az.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.kt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONObject;

public final class a
  implements com.tencent.mm.plugin.welab.a.a.b
{
  public a()
  {
    GMTrace.i(16255780126720L, 121115);
    GMTrace.o(16255780126720L, 121115);
  }
  
  public final String bGB()
  {
    GMTrace.i(17618895372288L, 131271);
    String str = l.kM("discoverRecommendEntry").optString("labIcon");
    GMTrace.o(17618895372288L, 131271);
    return str;
  }
  
  public final String bGC()
  {
    GMTrace.i(17619029590016L, 131272);
    String str = l.kM("discoverRecommendEntry").optString("wording");
    if (bg.nm(str))
    {
      str = ab.getContext().getString(R.l.dvB);
      GMTrace.o(17619029590016L, 131272);
      return str;
    }
    GMTrace.o(17619029590016L, 131272);
    return str;
  }
  
  public final void c(Activity paramActivity, String paramString)
  {
    GMTrace.i(16255914344448L, 121116);
    if (!e.Kr())
    {
      w.e("MicroMsg.FTS.LookOneLookOpener", "fts h5 template not avail");
      GMTrace.o(16255914344448L, 121116);
      return;
    }
    paramString = l.kM("discoverRecommendEntry").optString("wording");
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.FTS.LookOneLookOpener", "empty query");
      GMTrace.o(16255914344448L, 121116);
      return;
    }
    Intent localIntent = e.Kv();
    localIntent.putExtra("ftsbizscene", 21);
    localIntent.putExtra("ftsQuery", paramString);
    localIntent.putExtra("title", paramString);
    localIntent.putExtra("isWebwx", paramString);
    localIntent.putExtra("ftscaneditable", false);
    Object localObject = e.a(21, false, 2);
    ((Map)localObject).put("query", paramString);
    ((Map)localObject).put("sceneActionType", "2");
    localIntent.putExtra("rawUrl", e.a((Map)localObject, 1));
    localObject = new kt();
    ((kt)localObject).eOU.scene = 0;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    d.b(paramActivity, "webview", ".ui.tools.fts.FTSWebViewUI", localIntent);
    k.p(21, paramString);
    GMTrace.o(16255914344448L, 121116);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */