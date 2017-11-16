package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.location_soso.SoSoMapView;
import com.tencent.mm.plugin.location_soso.SoSoProxyUI;
import com.tencent.mm.plugin.p.a;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  implements com.tencent.mm.plugin.p.c
{
  public d()
  {
    GMTrace.i(9696291323904L, 72243);
    GMTrace.o(9696291323904L, 72243);
  }
  
  public static View cK(Context paramContext)
  {
    GMTrace.i(9696559759360L, 72245);
    paramContext = new SoSoMapView(paramContext);
    paramContext.setId(R.h.bCr);
    GMTrace.o(9696559759360L, 72245);
    return paramContext;
  }
  
  public static Intent v(Activity paramActivity)
  {
    GMTrace.i(9696425541632L, 72244);
    paramActivity = new Intent(paramActivity, SoSoProxyUI.class);
    GMTrace.o(9696425541632L, 72244);
    return paramActivity;
  }
  
  public final a d(Activity paramActivity, int paramInt)
  {
    GMTrace.i(9696693977088L, 72246);
    switch (paramInt)
    {
    case 3: 
    default: 
      GMTrace.o(9696693977088L, 72246);
      return null;
    case 2: 
      paramActivity = new c(paramActivity);
    }
    for (;;)
    {
      GMTrace.o(9696693977088L, 72246);
      return paramActivity;
      paramActivity = new h(paramActivity);
      continue;
      w.i("MicroMsg.MapFactoryImp", "share map");
      paramActivity = new g(paramActivity);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\impl\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */