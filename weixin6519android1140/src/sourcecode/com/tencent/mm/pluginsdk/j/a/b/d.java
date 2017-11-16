package com.tencent.mm.pluginsdk.j.a.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.pluginsdk.j.a.c.e;
import com.tencent.mm.pluginsdk.j.a.d.k;
import com.tencent.mm.pluginsdk.j.a.d.l;
import com.tencent.mm.pluginsdk.j.a.d.m.a;
import com.tencent.mm.pluginsdk.j.a.e.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

final class d
  extends m.a<c>
{
  public d(c paramc)
  {
    super(paramc);
    GMTrace.i(856711757824L, 6383);
    GMTrace.o(856711757824L, 6383);
  }
  
  public final String SM()
  {
    GMTrace.i(856845975552L, 6384);
    GMTrace.o(856845975552L, 6384);
    return "CheckResUpdate";
  }
  
  public final boolean SS()
  {
    GMTrace.i(857114411008L, 6386);
    if (super.SS())
    {
      j.r(((c)ST()).tpL, 12L);
      GMTrace.o(857114411008L, 6386);
      return true;
    }
    j.r(((c)ST()).tpL, 27L);
    GMTrace.o(857114411008L, 6386);
    return false;
  }
  
  protected final l a(com.tencent.mm.pluginsdk.j.a.d.j paramj)
  {
    GMTrace.i(857248628736L, 6387);
    c localc = (c)ST();
    String str1 = i.OJ(localc.tpD);
    String str2 = localc.eDW;
    if ((localc.rCy) && (bg.nl(g.bg(i.OJ(localc.tpD))).equals(str2)))
    {
      w.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "file already cached and valid, send complete status");
      paramj = new l(localc, a.DI(str1));
      GMTrace.o(857248628736L, 6387);
      return paramj;
    }
    if ((!bg.bq(((c)ST()).tql)) && (a.u(i.OJ(((c)ST()).tpD), ((c)ST()).tql)) && (bg.nl(g.bg(i.OJ(((c)ST()).tpD))).equals(((c)ST()).eDW)))
    {
      paramj = new l((k)ST(), a.DI(i.OJ(((c)ST()).tpD)));
      GMTrace.o(857248628736L, 6387);
      return paramj;
    }
    paramj = super.a(paramj);
    w.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: network get over, received response = " + paramj, new Object[] { localc.tpD });
    if (paramj == null)
    {
      paramj = new l("CheckResUpdate", bJY(), getURL(), getFilePath(), 0L, "", new e());
      GMTrace.o(857248628736L, 6387);
      return paramj;
    }
    if (paramj.status == 2)
    {
      if ((!bg.nm(((c)ST()).eDW)) && (((c)ST()).eDW.equals(g.bg(getFilePath())))) {
        w.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: file valid, md5 ok", new Object[] { localc.tpD });
      }
    }
    else
    {
      GMTrace.o(857248628736L, 6387);
      return paramj;
    }
    w.i("MicroMsg.ResDownloader.CheckResUpdate.NetworkRequestRunner", "%s: file invalid, md5 not match", new Object[] { localc.tpD });
    paramj = new l("CheckResUpdate", bJY(), getURL(), getFilePath(), paramj.eYV, paramj.eYU, new com.tencent.mm.pluginsdk.j.a.c.c());
    GMTrace.o(857248628736L, 6387);
    return paramj;
  }
  
  public final boolean el(long paramLong)
  {
    GMTrace.i(856980193280L, 6385);
    if ((((c)ST()).fileSize > 0L) && (((c)ST()).fileSize != a.DI(getFilePath()) + paramLong))
    {
      GMTrace.o(856980193280L, 6385);
      return false;
    }
    boolean bool = super.el(paramLong);
    GMTrace.o(856980193280L, 6385);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\j\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */