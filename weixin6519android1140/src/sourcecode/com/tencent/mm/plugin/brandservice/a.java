package com.tencent.mm.plugin.brandservice;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class a
  implements o
{
  public static m hnH;
  public static l hnI;
  
  public a()
  {
    GMTrace.i(10914988294144L, 81323);
    GMTrace.o(10914988294144L, 81323);
  }
  
  public static void d(int paramInt, Object paramObject)
  {
    GMTrace.i(10915390947328L, 81326);
    if (paramObject == null) {}
    for (String str = "null";; str = paramObject.toString())
    {
      w.i("MicroMsg.BrandService.BrandServiceApplication", "set config, key[%d], value[%s]", new Object[] { Integer.valueOf(paramInt), str });
      at.AR();
      c.xh().set(paramInt, paramObject);
      GMTrace.o(10915390947328L, 81326);
      return;
    }
  }
  
  public final void a(l paraml)
  {
    GMTrace.i(10915256729600L, 81325);
    hnI = paraml;
    GMTrace.o(10915256729600L, 81325);
  }
  
  public final void a(m paramm)
  {
    GMTrace.i(10915122511872L, 81324);
    hnH = paramm;
    GMTrace.o(10915122511872L, 81324);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\brandservice\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */