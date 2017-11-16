package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.share.d;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.n;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public final class h
  extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  h()
  {
    super(l.iso - 1);
    GMTrace.i(15551271272448L, 115866);
    GMTrace.o(15551271272448L, 115866);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, n paramn, String paramString)
  {
    GMTrace.i(17666140012544L, 131623);
    GMTrace.o(17666140012544L, 131623);
  }
  
  public final void a(Context paramContext, AppBrandPageView paramAppBrandPageView, String paramString, k paramk)
  {
    int j = 1;
    GMTrace.i(15551539707904L, 115868);
    paramk = com.tencent.mm.plugin.appbrand.a.nK(paramString);
    int i = j;
    if (paramk != null)
    {
      if (paramContext != null) {
        break label48;
      }
      i = j;
    }
    while (i != 0)
    {
      GMTrace.o(15551539707904L, 115868);
      return;
      label48:
      if ((paramk.UA() & 0x40) > 0L)
      {
        paramk = new com.tencent.mm.plugin.appbrand.ui.a(paramContext);
        paramk.VA(paramContext.getString(o.i.hEz));
        paramk.lz(false);
        paramk.BQ(o.i.hEr).a(new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(15554895151104L, 115893);
            paramAnonymousDialogInterface.dismiss();
            GMTrace.o(15554895151104L, 115893);
          }
        });
        paramk.aax().show();
        i = j;
      }
      else
      {
        i = 0;
      }
    }
    paramContext = new a();
    paramk = new HashMap();
    paramk.put("title", com.tencent.mm.plugin.appbrand.a.nK(paramString).eEs);
    paramk.put("desc", "");
    paramk.put("path", paramAppBrandPageView.ivj.hZo);
    paramk.put("imgUrl", com.tencent.mm.plugin.appbrand.a.nK(paramString).hQJ);
    paramContext.a(paramAppBrandPageView).r(paramk).VR();
    d.Xf();
    GMTrace.o(15551539707904L, 115868);
  }
  
  public static final class a
    extends e
  {
    private static final int CTRL_INDEX = 76;
    public static final String NAME = "onMenuShareTimeline";
    
    public a()
    {
      GMTrace.i(15552210796544L, 115873);
      GMTrace.o(15552210796544L, 115873);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\menu\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */