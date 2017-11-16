package com.tencent.mm.plugin.brandservice.ui.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b.b;
import com.tencent.mm.plugin.fts.a.l;
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
    GMTrace.i(16570118045696L, 123457);
    GMTrace.o(16570118045696L, 123457);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18049063190528L, 134476);
    String str = this.eQb;
    b localb = b.lxs;
    paramae = f.a(str, new int[] { 131076 }, null, 4, paramHashSet, localb, this, paramae);
    paramae = ((l)h.j(l.class)).search(2, paramae);
    GMTrace.o(18049063190528L, 134476);
    return paramae;
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i parami, List<String> paramList)
  {
    GMTrace.i(18049331625984L, 134478);
    a locala = new a(paramInt);
    locala.hWl = parami;
    locala.hWm = paramList;
    locala.ci(parami.type, parami.gRk);
    GMTrace.o(18049331625984L, 134478);
    return locala;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16570520698880L, 123460);
    int i = paramInt - parama.lzE - 1;
    i locali = null;
    Object localObject = locali;
    if (i < parama.lzI.size())
    {
      localObject = locali;
      if (i >= 0)
      {
        locali = (i)parama.lzI.get(i);
        localObject = a(paramInt, locali, parama.hWm);
        ((com.tencent.mm.plugin.fts.d.a.a)localObject).ci(locali.type, locali.gRk);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.d.a.a)localObject).lzZ = (i + 1);
    }
    GMTrace.o(16570520698880L, 123460);
    return (com.tencent.mm.plugin.fts.d.a.a)localObject;
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18049197408256L, 134477);
    paramg = paramg.lxb;
    if (aK(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.gRj = -7;
      paramHashSet.hWm = this.hWm;
      paramHashSet.lzI = paramg;
      if (paramHashSet.lzI.size() > 3)
      {
        paramHashSet.lzH = true;
        paramHashSet.lzI = paramHashSet.lzI.subList(0, 3);
      }
      this.lzp.add(paramHashSet);
    }
    GMTrace.o(18049197408256L, 134477);
  }
  
  public final int getType()
  {
    GMTrace.i(10879420596224L, 81058);
    GMTrace.o(10879420596224L, 81058);
    return 96;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */