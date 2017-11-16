package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.c;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class i
  extends c
{
  public i(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16465428217856L, 122677);
    GMTrace.o(16465428217856L, 122677);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18363803762688L, 136821);
    com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
    localf.eQb = this.eQb;
    localf.lwW = paramHashSet;
    localf.lwY = this;
    localf.handler = paramae;
    paramae = ((l)h.j(l.class)).search(3, localf);
    GMTrace.o(18363803762688L, 136821);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16465830871040L, 122680);
    int i = paramInt - parama.lzE - 1;
    com.tencent.mm.plugin.fts.a.a.i locali = null;
    Object localObject = locali;
    if (i < parama.lzI.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (com.tencent.mm.plugin.fts.a.a.i)parama.lzI.get(i);
        localObject = new com.tencent.mm.plugin.search.ui.a.f(paramInt);
        ((com.tencent.mm.plugin.search.ui.a.f)localObject).hWl = locali;
        ((com.tencent.mm.plugin.search.ui.a.f)localObject).hWm = parama.hWm;
        ((com.tencent.mm.plugin.search.ui.a.f)localObject).ci(locali.type, locali.gRk);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzZ = (i + 1);
    }
    GMTrace.o(16465830871040L, 122680);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18363937980416L, 136822);
    paramg = paramg.lxb;
    if (aK(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.gRj = -2;
      paramHashSet.hWm = this.hWm;
      paramHashSet.lzI = paramg;
      this.lzp.add(paramHashSet);
    }
    GMTrace.o(18363937980416L, 136822);
  }
  
  public final int getType()
  {
    GMTrace.i(11865115590656L, 88402);
    GMTrace.o(11865115590656L, 88402);
    return 4160;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */