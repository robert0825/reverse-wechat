package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.search.ui.a.k;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class b
  extends com.tencent.mm.plugin.fts.d.c
{
  public b(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16466636177408L, 122686);
    GMTrace.o(16466636177408L, 122686);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18363535327232L, 136819);
    f localf = new f();
    localf.lwS = 32;
    localf.eQb = this.eQb;
    localf.lwW = paramHashSet;
    localf.lwX = com.tencent.mm.plugin.fts.a.b.a.lxr;
    localf.lwY = this;
    localf.handler = paramae;
    paramae = ((l)h.j(l.class)).search(2, localf);
    GMTrace.o(18363535327232L, 136819);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16467038830592L, 122689);
    int i = paramInt - parama.lzE - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.lzI.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.lzI.get(i);
        if (!locali.lwH.equals("create_chatroom​")) {
          break label116;
        }
        localObject = new com.tencent.mm.plugin.search.ui.a.c(paramInt);
        ((com.tencent.mm.plugin.search.ui.a.c)localObject).hWm = parama.hWm;
      }
    }
    for (;;)
    {
      if (localObject != null) {
        ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzZ = (i + 1);
      }
      GMTrace.o(16467038830592L, 122689);
      return (com.tencent.mm.plugin.fts.d.a.a)localObject;
      label116:
      localObject = new k(paramInt);
      ((k)localObject).hWl = locali;
      ((k)localObject).hWm = parama.hWm;
      ((k)localObject).ci(locali.type, locali.gRk);
    }
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18363669544960L, 136820);
    paramg = paramg.lxb;
    if (aK(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.gRj = -3;
      paramHashSet.lzI = paramg;
      paramHashSet.hWm = this.hWm;
      paramHashSet.lzH = false;
      this.lzp.add(paramHashSet);
    }
    GMTrace.o(18363669544960L, 136820);
  }
  
  public final int getType()
  {
    GMTrace.i(11860686405632L, 88369);
    GMTrace.o(11860686405632L, 88369);
    return 4128;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */