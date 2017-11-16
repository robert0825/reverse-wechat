package com.tencent.mm.ao.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.a.c.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class d
  implements f
{
  public d()
  {
    GMTrace.i(13721615204352L, 102234);
    GMTrace.o(13721615204352L, 102234);
  }
  
  public final String kt(String paramString)
  {
    GMTrace.i(13721749422080L, 102235);
    String str = null;
    if (!bg.nm(paramString))
    {
      str = g.n(paramString.getBytes());
      w.d("MicroMsg.imageloader.DefaultImageFileNameCreater", "[cpan] create image file name :%s", new Object[] { str });
    }
    GMTrace.o(13721749422080L, 102235);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */