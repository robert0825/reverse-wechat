package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;

public final class s
  extends i<r>
{
  public static final String[] hIQ;
  public static final String[] iKd;
  
  static
  {
    GMTrace.i(19992535891968L, 148956);
    hIQ = new String[] { i.a(r.hJW, "WxaWidgetInfo") };
    iKd = new String[0];
    GMTrace.o(19992535891968L, 148956);
  }
  
  public s(e parame)
  {
    super(parame, r.hJW, "WxaWidgetInfo", iKd);
    GMTrace.i(19992267456512L, 148954);
    GMTrace.o(19992267456512L, 148954);
  }
  
  public final r sO(String paramString)
  {
    GMTrace.i(19992401674240L, 148955);
    if (bg.nm(paramString))
    {
      GMTrace.o(19992401674240L, 148955);
      return null;
    }
    r localr = new r();
    localr.field_appId = paramString;
    localr.field_appIdHash = paramString.hashCode();
    if (!b(localr, new String[] { "appIdHash" }))
    {
      GMTrace.o(19992401674240L, 148955);
      return null;
    }
    GMTrace.o(19992401674240L, 148955);
    return localr;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */