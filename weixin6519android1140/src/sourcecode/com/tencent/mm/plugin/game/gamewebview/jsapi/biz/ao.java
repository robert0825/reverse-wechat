package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.webview.ui.tools.game.c;
import com.tencent.mm.plugin.webview.ui.tools.game.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class ao
  extends a
{
  public static final int CTRL_BYTE = 301;
  public static final String NAME = "reportGamePageTime";
  
  public ao()
  {
    GMTrace.i(19309233438720L, 143865);
    GMTrace.o(19309233438720L, 143865);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(19309367656448L, 143866);
    String str1 = paramJSONObject.optString("reportId");
    boolean bool1 = bg.nl(paramJSONObject.optString("reportInstantly")).equals("1");
    boolean bool2 = bg.nl(paramJSONObject.optString("reportTimeBegin")).equals("1");
    String str2 = paramJSONObject.optString("reportFormatData");
    paramJSONObject = paramJSONObject.optString("reportTabsFormatData");
    if (bg.nm(str1))
    {
      w.e("MicroMsg.GameJsApiReportGamePageTime", "reportId is null or nil");
      paramd.v(paramInt, a.d("reportGamePageTime:fail_invalid_reportId", null));
    }
    if ((bg.nm(str2)) && (bg.nm(paramJSONObject)))
    {
      w.e("MicroMsg.GameJsApiReportGamePageTime", "reportFormatData && reportTabsFormatData is null or nil");
      paramd.v(paramInt, a.d("reportGamePageTime:fail_invalid_reportFormatData_reportTabsFormatData", null));
    }
    w.i("MicroMsg.GameJsApiReportGamePageTime", "reportGamePageTime, reportId:%s, reportInstantly:%b, reportTimeBegin:%b, reportFormatData:(%s), reportTabsFormatData(%s)", new Object[] { str1, Boolean.valueOf(bool1), Boolean.valueOf(bool2), str2, paramJSONObject });
    Bundle localBundle = new Bundle();
    localBundle.putString("game_page_report_id", str1);
    localBundle.putBoolean("game_page_report_instantly", bool1);
    localBundle.putBoolean("game_page_report_time_begin", bool2);
    localBundle.putString("game_page_report_format_data", str2);
    localBundle.putString("game_page_report_tabs_format_data", paramJSONObject);
    paramd.lKa.rQG.ab(localBundle);
    paramd.v(paramInt, a.d("reportGamePageTime:ok", null));
    GMTrace.o(19309367656448L, 143866);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */