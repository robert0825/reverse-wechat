package com.tencent.mm.plugin.welab.d;

import android.app.Activity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.b.ca;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.welab.a.a.b;
import com.tencent.mm.plugin.welab.a.a.d;
import com.tencent.mm.storage.t;

public final class a
  implements b
{
  public a()
  {
    GMTrace.i(15362158493696L, 114457);
    GMTrace.o(15362158493696L, 114457);
  }
  
  public final String bGB()
  {
    GMTrace.i(17618358501376L, 131267);
    GMTrace.o(17618358501376L, 131267);
    return null;
  }
  
  public final String bGC()
  {
    GMTrace.i(17618492719104L, 131268);
    GMTrace.o(17618492719104L, 131268);
    return null;
  }
  
  public final void c(Activity paramActivity, String paramString)
  {
    GMTrace.i(15362292711424L, 114458);
    paramActivity = ((d)h.h(d.class)).Nm(paramString);
    paramString = new qi();
    paramString.eUY.userName = paramActivity.field_WeAppUser;
    paramString.eUY.eVa = paramActivity.field_WeAppPath;
    paramString.eUY.scene = 1051;
    paramString.eUY.eVb = paramActivity.field_WeAppDebugMode;
    paramString.eUY.eAv = String.format("%s:%s:%s:%s", new Object[] { (String)h.xy().xh().get(2, null), paramActivity.field_expId, paramActivity.field_LabsAppId, Long.valueOf(System.currentTimeMillis() / 1000L) });
    com.tencent.mm.sdk.b.a.vgX.m(paramString);
    GMTrace.o(15362292711424L, 114458);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\welab\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */