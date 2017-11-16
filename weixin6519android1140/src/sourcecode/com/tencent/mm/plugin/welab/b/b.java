package com.tencent.mm.plugin.welab.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.az.e;
import com.tencent.mm.az.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.plugin.welab.a.a.b
{
  public b()
  {
    GMTrace.i(15361890058240L, 114455);
    GMTrace.o(15361890058240L, 114455);
  }
  
  public final String bGB()
  {
    GMTrace.i(17618626936832L, 131269);
    String str = l.kM("discoverSearchEntry").optString("labIcon");
    GMTrace.o(17618626936832L, 131269);
    return str;
  }
  
  public final String bGC()
  {
    GMTrace.i(17618761154560L, 131270);
    String str = l.kM("discoverSearchEntry").optString("wording");
    if (bg.nm(str))
    {
      str = ab.getContext().getString(R.l.dvB);
      GMTrace.o(17618761154560L, 131270);
      return str;
    }
    GMTrace.o(17618761154560L, 131270);
    return str;
  }
  
  public final void c(Activity paramActivity, String paramString)
  {
    GMTrace.i(15362024275968L, 114456);
    if (!e.Kr())
    {
      w.e("MicroMsg.FTS.SearchOneSearchOpener", "fts h5 template not avail");
      GMTrace.o(15362024275968L, 114456);
      return;
    }
    paramString = e.Kv();
    paramString.putExtra("ftsbizscene", 20);
    Map localMap = e.a(20, true, 0);
    paramString.putExtra("ftsneedkeyboard", true);
    paramString.putExtra("rawUrl", e.n(localMap));
    d.b(paramActivity, "webview", ".ui.tools.fts.FTSSearchOneSearchWebViewUI", paramString);
    GMTrace.o(15362024275968L, 114456);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */