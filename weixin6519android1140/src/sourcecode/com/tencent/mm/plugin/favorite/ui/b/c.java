package com.tencent.mm.plugin.favorite.ui.b;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b.d;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import java.util.HashSet;
import java.util.List;

public final class c
  extends com.tencent.mm.plugin.fts.d.c
{
  public c(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16649038069760L, 124045);
    GMTrace.o(16649038069760L, 124045);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18032285974528L, 134351);
    f localf = new f();
    localf.lwS = 2;
    localf.eQb = this.eQb;
    localf.lwW = paramHashSet;
    localf.handler = paramae;
    localf.lwY = this;
    localf.lwX = d.lxu;
    paramae = ((l)h.j(l.class)).search(6, localf);
    GMTrace.o(18032285974528L, 134351);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16649440722944L, 124048);
    int i = paramInt - parama.lzE - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.lzI.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.lzI.get(i);
        localObject = new a(paramInt);
        ((a)localObject).hWl = locali;
        ((a)localObject).hWm = parama.hWm;
        ((a)localObject).ci(locali.type, locali.gRk);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzZ = (i + 1);
    }
    GMTrace.o(16649440722944L, 124048);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18032420192256L, 134352);
    paramg = paramg.lxb;
    if (aK(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.gRj = -1;
      paramHashSet.hWm = this.hWm;
      paramHashSet.lzI = paramg;
      this.lzp.add(paramHashSet);
    }
    GMTrace.o(18032420192256L, 134352);
  }
  
  public final int getType()
  {
    GMTrace.i(6437484888064L, 47963);
    GMTrace.o(6437484888064L, 47963);
    return 4176;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */