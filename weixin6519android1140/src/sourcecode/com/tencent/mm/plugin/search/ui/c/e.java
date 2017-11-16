package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b.b;
import com.tencent.mm.plugin.fts.d.c;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class e
  extends c
{
  public e(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16463683387392L, 122664);
    GMTrace.o(16463683387392L, 122664);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18365280157696L, 136832);
    f localf = new f();
    localf.lwS = 48;
    localf.eQb = this.eQb;
    localf.lwT = new int[] { 131072 };
    localf.lwV = 3;
    localf.lwX = b.lxs;
    localf.lwW = paramHashSet;
    localf.lwY = this;
    localf.handler = paramae;
    paramae = ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).search(2, localf);
    GMTrace.o(18365280157696L, 136832);
    return paramae;
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i parami, List<String> paramList)
  {
    GMTrace.i(18365548593152L, 136834);
    Object localObject = null;
    if (parami.type == 131072)
    {
      localObject = new com.tencent.mm.plugin.search.ui.a.l(paramInt);
      ((com.tencent.mm.plugin.search.ui.a.l)localObject).hWl = parami;
      ((com.tencent.mm.plugin.search.ui.a.l)localObject).hWm = paramList;
      ((com.tencent.mm.plugin.search.ui.a.l)localObject).ci(parami.type, parami.gRk);
    }
    for (;;)
    {
      GMTrace.o(18365548593152L, 136834);
      return (com.tencent.mm.plugin.fts.d.a.a)localObject;
      if ((parami.type == 131073) || (parami.type == 131074))
      {
        localObject = new com.tencent.mm.plugin.search.ui.a.g(paramInt);
        ((com.tencent.mm.plugin.search.ui.a.g)localObject).hWl = parami;
        ((com.tencent.mm.plugin.search.ui.a.g)localObject).hWm = paramList;
        ((com.tencent.mm.plugin.search.ui.a.g)localObject).ci(parami.type, parami.gRk);
      }
    }
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16464086040576L, 122667);
    int i = 0;
    if (parama.lzF)
    {
      i = paramInt - parama.lzE - 1;
      if ((i < parama.lzI.size()) && (i >= 0))
      {
        i locali = (i)parama.lzI.get(i);
        parama = a(paramInt, locali, parama.hWm);
        if (parama != null) {
          parama.ci(locali.type, locali.gRk);
        }
        paramInt = i;
      }
    }
    for (;;)
    {
      if (parama != null) {
        parama.lzZ = (paramInt + 1);
      }
      GMTrace.o(16464086040576L, 122667);
      return parama;
      paramInt = i;
      parama = null;
      continue;
      parama = null;
      paramInt = i;
    }
  }
  
  protected final void a(com.tencent.mm.plugin.fts.a.a.g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18365414375424L, 136833);
    paramg = paramg.lxb;
    paramHashSet = new i.a();
    paramHashSet.gRj = -4;
    paramHashSet.lzI = paramg;
    paramHashSet.lzF = aK(paramg);
    paramHashSet.hWm = this.hWm;
    if (paramHashSet.lzI.size() > 3)
    {
      paramHashSet.lzH = true;
      paramHashSet.lzI = paramHashSet.lzI.subList(0, 3);
    }
    if (aK(paramg)) {
      this.lzp.add(paramHashSet);
    }
    GMTrace.o(18365414375424L, 136833);
  }
  
  public final int getType()
  {
    GMTrace.i(11864310284288L, 88396);
    GMTrace.o(11864310284288L, 88396);
    return 32;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */