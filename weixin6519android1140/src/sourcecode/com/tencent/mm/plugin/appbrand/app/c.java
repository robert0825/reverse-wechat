package com.tencent.mm.plugin.appbrand.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.k.e;
import com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI;
import java.util.ArrayList;
import java.util.List;

public final class c
  implements e
{
  public c()
  {
    GMTrace.i(19679405932544L, 146623);
    GMTrace.o(19679405932544L, 146623);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, List<WxaAttributes.WxaEntryInfo> paramList)
  {
    GMTrace.i(19679540150272L, 146624);
    Intent localIntent = new Intent(paramContext, BizBindWxaInfoUI.class);
    localIntent.putParcelableArrayListExtra("extra_wxa_entry_info_list", new ArrayList(paramList));
    localIntent.putExtra("extra_username", paramString1);
    localIntent.putExtra("extra_appid", paramString2);
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    paramContext.startActivity(localIntent);
    GMTrace.o(19679540150272L, 146624);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\app\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */