package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 217;
  public static final String NAME = "saveImageToPhotosAlbum";
  
  public d()
  {
    GMTrace.i(15476243562496L, 115307);
    GMTrace.o(15476243562496L, 115307);
  }
  
  final boolean l(final Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(18204487319552L, 135634);
    if (bg.nm(paramString1))
    {
      GMTrace.o(18204487319552L, 135634);
      return false;
    }
    String str = s.OV(paramString2);
    paramString2 = str;
    if (bg.nm(str)) {
      paramString2 = "jpg";
    }
    paramString2 = com.tencent.mm.platformtools.d.nd(paramString2);
    boolean bool = j.r(paramString1, paramString2, false);
    if (bool)
    {
      com.tencent.mm.platformtools.d.b(paramString2, paramContext);
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18205024190464L, 135638);
          Toast.makeText(paramContext, paramContext.getString(o.i.dmf, new Object[] { com.tencent.mm.platformtools.d.Pk() }), 1).show();
          GMTrace.o(18205024190464L, 135638);
        }
      });
    }
    GMTrace.o(18204487319552L, 135634);
    return bool;
  }
  
  final boolean qx(String paramString)
  {
    GMTrace.i(15476511997952L, 115309);
    boolean bool = bg.nl(paramString).toLowerCase().contains("image");
    GMTrace.o(15476511997952L, 115309);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\media\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */