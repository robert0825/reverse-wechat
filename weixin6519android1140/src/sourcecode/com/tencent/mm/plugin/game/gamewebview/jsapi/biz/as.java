package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONObject;

public final class as
  extends a
{
  public static final int CTRL_BYTE = 77;
  public static final String NAME = "setCloseWindowConfirmDialogInfo";
  
  public as()
  {
    GMTrace.i(17044980367360L, 126995);
    GMTrace.o(17044980367360L, 126995);
  }
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    GMTrace.i(17045114585088L, 126996);
    w.i("MicroMsg.GameJsApiSetCloseWindowConfirmDialogInfo", "invoke");
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.GameJsApiSetCloseWindowConfirmDialogInfo", "data is null");
      paramd.v(paramInt, a.d("setCloseWindowConfirmDialogInfo:fail_invalid_data", null));
      GMTrace.o(17045114585088L, 126996);
      return;
    }
    boolean bool = paramJSONObject.optBoolean("switch");
    String str1 = paramJSONObject.optString("title_cn");
    String str2 = paramJSONObject.optString("title_eng");
    String str3 = paramJSONObject.optString("ok_cn");
    String str4 = paramJSONObject.optString("ok_eng");
    String str5 = paramJSONObject.optString("cancel_cn");
    paramJSONObject = paramJSONObject.optString("cancel_eng");
    e locale = paramd.lJm;
    if (locale == null)
    {
      GMTrace.o(17045114585088L, 126996);
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("close_window_confirm_dialog_switch", Boolean.valueOf(bool).booleanValue());
    localBundle.putString("close_window_confirm_dialog_title_cn", str1);
    localBundle.putString("close_window_confirm_dialog_title_eng", str2);
    localBundle.putString("close_window_confirm_dialog_ok_cn", str3);
    localBundle.putString("close_window_confirm_dialog_ok_eng", str4);
    localBundle.putString("close_window_confirm_dialog_cancel_cn", str5);
    localBundle.putString("close_window_confirm_dialog_cancel_eng", paramJSONObject);
    locale.C(localBundle);
    paramd.v(paramInt, a.d("setCloseWindowConfirmDialogInfo:ok", null));
    GMTrace.o(17045114585088L, 126996);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\jsapi\biz\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */