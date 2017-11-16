package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.gmtrace.GMTrace;

public class m
{
  private static volatile com.tencent.mm.jsapi.core.d hTQ;
  private static volatile com.tencent.mm.jsapi.core.d hTR;
  
  public m()
  {
    GMTrace.i(19926098116608L, 148461);
    GMTrace.o(19926098116608L, 148461);
  }
  
  private static com.tencent.mm.jsapi.core.d Vd()
  {
    GMTrace.i(19926366552064L, 148463);
    if (hTQ == null) {}
    try
    {
      if (hTQ == null)
      {
        locald = new com.tencent.mm.jsapi.core.d();
        locald.a(new k(312));
        locald.a(new c(306));
        locald.a(new d(306));
        locald.a(new a(305));
        locald.a(new b(307));
        locald.a(new j(309));
        locald.a(new i(310));
        locald.a(new e(311));
        locald.a(new l());
        hTQ = locald;
      }
      com.tencent.mm.jsapi.core.d locald = hTQ;
      GMTrace.o(19926366552064L, 148463);
      return locald;
    }
    finally {}
  }
  
  private static com.tencent.mm.jsapi.core.d Ve()
  {
    GMTrace.i(19926500769792L, 148464);
    if (hTR == null) {}
    try
    {
      if (hTR == null)
      {
        locald = new com.tencent.mm.jsapi.core.d();
        locald.a(new k(289));
        locald.a(new c(266));
        locald.a(new d(266));
        locald.a(new a(265));
        locald.a(new b(267));
        locald.a(new j(281));
        locald.a(new i(282));
        locald.a(new e(287));
        locald.a(new g());
        locald.a(new h());
        locald.a(new l());
        locald.a(new g());
        locald.a(new f());
        hTR = locald;
      }
      com.tencent.mm.jsapi.core.d locald = hTR;
      GMTrace.o(19926500769792L, 148464);
      return locald;
    }
    finally {}
  }
  
  public static com.tencent.mm.jsapi.core.d it(int paramInt)
  {
    GMTrace.i(19926232334336L, 148462);
    if (paramInt == 1)
    {
      locald = Ve();
      GMTrace.o(19926232334336L, 148462);
      return locald;
    }
    com.tencent.mm.jsapi.core.d locald = Vd();
    GMTrace.o(19926232334336L, 148462);
    return locald;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\d\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */