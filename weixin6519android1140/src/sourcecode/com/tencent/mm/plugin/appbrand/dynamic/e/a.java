package com.tencent.mm.plugin.appbrand.dynamic.e;

import com.tencent.gmtrace.GMTrace;

public class a
{
  private static volatile com.tencent.mm.jsapi.core.f hUq;
  private static volatile com.tencent.mm.jsapi.core.f hUr;
  
  public a()
  {
    GMTrace.i(19924219068416L, 148447);
    GMTrace.o(19924219068416L, 148447);
  }
  
  private static com.tencent.mm.jsapi.core.f Vf()
  {
    GMTrace.i(19924487503872L, 148449);
    if (hUq == null) {}
    try
    {
      if (hUq == null)
      {
        localf = new com.tencent.mm.jsapi.core.f();
        localf.a(new b(302));
        localf.a(new c(303));
        localf.a(new d(308));
        localf.a(new f());
        localf.a(new g());
        hUq = localf;
      }
      com.tencent.mm.jsapi.core.f localf = hUq;
      GMTrace.o(19924487503872L, 148449);
      return localf;
    }
    finally {}
  }
  
  private static com.tencent.mm.jsapi.core.f Vg()
  {
    GMTrace.i(19924621721600L, 148450);
    if (hUr == null) {}
    try
    {
      if (hUr == null)
      {
        localf = new com.tencent.mm.jsapi.core.f();
        localf.a(new b(262));
        localf.a(new c(263));
        localf.a(new d(268));
        localf.a(new f());
        localf.a(new g());
        localf.a(new e((byte)0));
        hUr = localf;
      }
      com.tencent.mm.jsapi.core.f localf = hUr;
      GMTrace.o(19924621721600L, 148450);
      return localf;
    }
    finally {}
  }
  
  public static com.tencent.mm.jsapi.core.f iu(int paramInt)
  {
    GMTrace.i(19924353286144L, 148448);
    if (paramInt == 1)
    {
      localf = Vg();
      GMTrace.o(19924353286144L, 148448);
      return localf;
    }
    com.tencent.mm.jsapi.core.f localf = Vf();
    GMTrace.o(19924353286144L, 148448);
    return localf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */