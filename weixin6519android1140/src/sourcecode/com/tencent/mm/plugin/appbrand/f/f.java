package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.c;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.List;

public final class f
  extends c
{
  public f(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16547972120576L, 123292);
    GMTrace.o(16547972120576L, 123292);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18199252828160L, 135595);
    com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
    localf.eQb = this.eQb;
    localf.lwX = com.tencent.mm.plugin.fts.a.b.d.lxu;
    localf.lwY = this;
    localf.handler = paramae;
    localf.lwW = paramHashSet;
    paramae = ((l)h.j(l.class)).search(7, localf);
    GMTrace.o(18199252828160L, 135595);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16548374773760L, 123295);
    int i = paramInt - parama.lzE - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.lzI.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.lzI.get(i);
        localObject = new d(paramInt);
        ((d)localObject).hWl = locali;
        ((d)localObject).hWm = parama.hWm;
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzZ = (i + 1);
    }
    GMTrace.o(16548374773760L, 123295);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(com.tencent.mm.plugin.fts.a.a.g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18199387045888L, 135596);
    List localList = paramg.lxb;
    if ((localList != null) && (!localList.isEmpty()))
    {
      com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
      paramHashSet = this.eQb;
      paramg = paramHashSet;
      if (paramHashSet != null) {
        paramg = paramHashSet.replaceAll(",", " ");
      }
      locald.q("20KeyWordId", paramg + ",");
      locald.q("21ViewType", "2,");
      locald.q("22OpType", "1,");
      locald.q("23ResultCount", localList.size() + ",");
      locald.q("24ClickPos", ",");
      locald.q("25ClickAppUserName", ",");
      w.i("MicroMsg.FTSWeAppDetailUIUnit", "report oreh LocalSearchWeApp(13963), %s", new Object[] { locald.LT() });
      com.tencent.mm.plugin.report.service.g.ork.i(13963, new Object[] { locald });
    }
    if (aK(localList))
    {
      paramg = new i.a();
      paramg.gRj = -13;
      paramg.hWm = this.hWm;
      paramg.lzI = localList;
      this.lzp.add(paramg);
    }
    GMTrace.o(18199387045888L, 135596);
  }
  
  public final int getType()
  {
    GMTrace.i(10655142772736L, 79387);
    GMTrace.o(10655142772736L, 79387);
    return 4208;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */