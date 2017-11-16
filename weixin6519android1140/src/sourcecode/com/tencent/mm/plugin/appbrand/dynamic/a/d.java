package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.h;
import com.tencent.mm.modelappbrand.h.a;
import com.tencent.mm.plugin.appbrand.appcache.c.a;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetInitializer;
import com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetDebugUI;

public final class d
  implements h
{
  boolean hTg;
  
  public d()
  {
    GMTrace.i(18313203679232L, 136444);
    GMTrace.o(18313203679232L, 136444);
  }
  
  public final boolean CJ()
  {
    GMTrace.i(18314008985600L, 136450);
    boolean bool = this.hTg;
    GMTrace.o(18314008985600L, 136450);
    return bool;
  }
  
  public final boolean CK()
  {
    GMTrace.i(18314143203328L, 136451);
    boolean bool = com.tencent.mm.sdk.a.b.bPq();
    GMTrace.o(18314143203328L, 136451);
    return bool;
  }
  
  public final boolean a(String paramString, h.a parama)
  {
    GMTrace.i(18313606332416L, 136447);
    boolean bool = com.tencent.mm.plugin.appbrand.dynamic.debugger.b.c(paramString, parama);
    GMTrace.o(18313606332416L, 136447);
    return bool;
  }
  
  public final void b(Context paramContext, Bundle paramBundle)
  {
    GMTrace.i(18313337896960L, 136445);
    Intent localIntent = new Intent(paramContext, WxaWidgetDebugUI.class);
    String str = WxaWidgetInitializer.aU(paramBundle.getString("app_id"), paramBundle.getString("msg_id"));
    localIntent.putExtras(paramBundle);
    localIntent.putExtra("id", str);
    paramContext.startActivity(localIntent);
    GMTrace.o(18313337896960L, 136445);
  }
  
  public final boolean b(String paramString, h.a parama)
  {
    GMTrace.i(18313740550144L, 136448);
    boolean bool = com.tencent.mm.plugin.appbrand.dynamic.debugger.b.d(paramString, parama);
    GMTrace.o(18313740550144L, 136448);
    return bool;
  }
  
  public final void bh(boolean paramBoolean)
  {
    GMTrace.i(18313874767872L, 136449);
    this.hTg = paramBoolean;
    GMTrace.o(18313874767872L, 136449);
  }
  
  public final boolean fI(int paramInt)
  {
    GMTrace.i(18313472114688L, 136446);
    boolean bool = c.a.fI(paramInt);
    GMTrace.o(18313472114688L, 136446);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */