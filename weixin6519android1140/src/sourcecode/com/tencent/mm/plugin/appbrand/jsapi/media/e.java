package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;

public final class e
  extends a
{
  public static final int CTRL_INDEX = 216;
  public static final String NAME = "saveVideoToPhotosAlbum";
  
  public e()
  {
    GMTrace.i(15474901385216L, 115297);
    GMTrace.o(15474901385216L, 115297);
  }
  
  final boolean l(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(18204621537280L, 135635);
    String str = com.tencent.mm.platformtools.d.nd("mp4");
    paramString2 = str;
    if (!j.eR(paramString1, str)) {
      paramString2 = null;
    }
    if (!bg.nm(paramString2))
    {
      Toast.makeText(paramContext, com.tencent.mm.plugin.appbrand.o.d.e(o.i.egu, new Object[] { paramString2 }), 1).show();
      k.b(paramString2, paramContext);
      GMTrace.o(18204621537280L, 135635);
      return true;
    }
    GMTrace.o(18204621537280L, 135635);
    return false;
  }
  
  final boolean qx(String paramString)
  {
    GMTrace.i(15475169820672L, 115299);
    boolean bool = bg.nl(paramString).toLowerCase().contains("video");
    GMTrace.o(15475169820672L, 115299);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\media\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */