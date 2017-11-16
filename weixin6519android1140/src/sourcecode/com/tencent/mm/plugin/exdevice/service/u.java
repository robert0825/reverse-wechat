package com.tencent.mm.plugin.exdevice.service;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.exdevice.model.c;

public final class u
{
  private static u kDg;
  private c kDh;
  private f kDi;
  
  static
  {
    GMTrace.i(11168659800064L, 83213);
    kDg = null;
    GMTrace.o(11168659800064L, 83213);
  }
  
  public u()
  {
    GMTrace.i(11167988711424L, 83208);
    GMTrace.o(11167988711424L, 83208);
  }
  
  public static void a(m paramm)
  {
    GMTrace.i(11168391364608L, 83211);
    aut().kxo = paramm;
    GMTrace.o(11168391364608L, 83211);
  }
  
  private static u aur()
  {
    GMTrace.i(11168122929152L, 83209);
    if (kDg == null) {
      kDg = new u();
    }
    u localu = kDg;
    GMTrace.o(11168122929152L, 83209);
    return localu;
  }
  
  public static f aus()
  {
    GMTrace.i(11168257146880L, 83210);
    if (aur().kDi == null) {
      aur().kDi = new f();
    }
    f localf = aur().kDi;
    GMTrace.o(11168257146880L, 83210);
    return localf;
  }
  
  public static c aut()
  {
    GMTrace.i(11168525582336L, 83212);
    if (aur().kDh == null)
    {
      localObject = aur();
      if (c.kxn == null) {
        c.kxn = new c();
      }
      ((u)localObject).kDh = c.kxn;
    }
    Object localObject = aur().kDh;
    GMTrace.o(11168525582336L, 83212);
    return (c)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\service\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */