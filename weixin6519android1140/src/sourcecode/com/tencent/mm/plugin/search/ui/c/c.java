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

public final class c
  extends com.tencent.mm.plugin.fts.d.c
{
  public c(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16467173048320L, 122690);
    GMTrace.o(16467173048320L, 122690);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18363132674048L, 136816);
    f localf = new f();
    localf.lwS = 80;
    localf.lwV = 3;
    localf.eQb = this.eQb;
    localf.lwW = paramHashSet;
    localf.lwX = com.tencent.mm.plugin.fts.a.b.a.lxr;
    localf.lwY = this;
    localf.handler = paramae;
    paramae = ((l)h.j(l.class)).search(2, localf);
    GMTrace.o(18363132674048L, 136816);
    return paramae;
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i parami, List<String> paramList)
  {
    GMTrace.i(18363401109504L, 136818);
    k localk = new k(paramInt);
    localk.hWl = parami;
    localk.hWm = paramList;
    localk.ci(parami.type, parami.gRk);
    GMTrace.o(18363401109504L, 136818);
    return localk;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16467575701504L, 122693);
    int i = paramInt - parama.lzE - 1;
    Object localObject;
    if ((i < parama.lzI.size()) && (i >= 0))
    {
      localObject = (i)parama.lzI.get(i);
      if (((i)localObject).lwH.equals("create_chatroom​"))
      {
        localObject = new com.tencent.mm.plugin.search.ui.a.c(paramInt);
        ((com.tencent.mm.plugin.search.ui.a.c)localObject).hWm = parama.hWm;
        parama = (i.a)localObject;
      }
    }
    for (;;)
    {
      if (parama != null) {
        parama.lzZ = (i + 1);
      }
      GMTrace.o(16467575701504L, 122693);
      return parama;
      if (((i)localObject).type == 131075)
      {
        parama = a(paramInt, (i)localObject, parama.hWm);
        parama.ci(((i)localObject).type, ((i)localObject).gRk);
      }
      else
      {
        parama = null;
      }
    }
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18363266891776L, 136817);
    paramg = paramg.lxb;
    boolean bool;
    if (aK(paramg))
    {
      paramHashSet = new i.a();
      paramHashSet.lzI = paramg;
      paramHashSet.gRj = -3;
      paramHashSet.hWm = this.hWm;
      if (paramHashSet.lzI.size() > 3)
      {
        if (!((i)paramHashSet.lzI.get(3)).lwH.equals("create_chatroom​")) {
          break label144;
        }
        if (paramHashSet.lzI.size() <= 4) {
          break label139;
        }
        bool = true;
        paramHashSet.lzH = bool;
      }
    }
    for (paramHashSet.lzI = paramHashSet.lzI.subList(0, 4);; paramHashSet.lzI = paramHashSet.lzI.subList(0, 3))
    {
      this.lzp.add(paramHashSet);
      GMTrace.o(18363266891776L, 136817);
      return;
      label139:
      bool = false;
      break;
      label144:
      paramHashSet.lzH = true;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11862028582912L, 88379);
    GMTrace.o(11862028582912L, 88379);
    return 48;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */