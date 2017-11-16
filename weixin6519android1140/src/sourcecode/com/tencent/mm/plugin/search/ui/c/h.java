package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.search.ui.a.e;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class h
  extends com.tencent.mm.plugin.fts.d.c
{
  public h(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16465965088768L, 122681);
    GMTrace.o(16465965088768L, 122681);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18362595803136L, 136812);
    f localf = new f();
    localf.eQb = this.eQb;
    localf.lwY = this;
    localf.handler = paramae;
    localf.lwW = paramHashSet;
    localf.lwX = com.tencent.mm.plugin.fts.a.b.c.lxt;
    localf.lwV = 3;
    paramae = ((l)com.tencent.mm.kernel.h.j(l.class)).search(5, localf);
    GMTrace.o(18362595803136L, 136812);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16466367741952L, 122684);
    int i = paramInt - parama.lzE - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.lzI.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.lzI.get(i);
        localObject = new e(paramInt);
        ((e)localObject).hWl = locali;
        ((e)localObject).hWm = parama.hWm;
        ((e)localObject).ci(locali.type, locali.gRk);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzZ = (i + 1);
    }
    GMTrace.o(16466367741952L, 122684);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18362730020864L, 136813);
    paramg = paramg.lxb;
    if (aK(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.gRj = -5;
      paramHashSet.hWm = this.hWm;
      paramHashSet.lzI = paramg;
      if (paramHashSet.lzI.size() > 3)
      {
        paramHashSet.lzH = true;
        paramHashSet.lzI = paramHashSet.lzI.subList(0, 3);
      }
      this.lzp.add(paramHashSet);
    }
    GMTrace.o(18362730020864L, 136813);
  }
  
  public final int getType()
  {
    GMTrace.i(16466501959680L, 122685);
    GMTrace.o(16466501959680L, 122685);
    return 80;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */