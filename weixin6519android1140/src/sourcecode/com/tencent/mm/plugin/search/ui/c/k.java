package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.d.a.b;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.search.ui.a.j;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.storage.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class k
  extends com.tencent.mm.plugin.fts.d.c
{
  public String eDs;
  public q oEz;
  
  public k(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16462475427840L, 122655);
    GMTrace.o(16462475427840L, 122655);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18362864238592L, 136814);
    paramHashSet = new f();
    paramHashSet.eQb = this.eQb;
    paramHashSet.eDs = this.eDs;
    paramHashSet.lwY = this;
    paramHashSet.handler = paramae;
    paramHashSet.lwS = 3;
    paramae = ((l)h.j(l.class)).search(3, paramHashSet);
    GMTrace.o(18362864238592L, 136814);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16463012298752L, 122659);
    if (parama.lzF) {}
    for (int i = paramInt - 1;; i = 0)
    {
      com.tencent.mm.plugin.fts.a.a.i locali1;
      if ((i < parama.lzI.size()) && (i >= 0))
      {
        locali1 = (com.tencent.mm.plugin.fts.a.a.i)parama.lzI.get(i);
        if (locali1.lwH.equals("no_result​")) {
          parama = new com.tencent.mm.plugin.fts.d.a.c(paramInt);
        }
      }
      for (;;)
      {
        if (parama != null) {
          parama.lzZ = (paramInt + 1);
        }
        GMTrace.o(16463012298752L, 122659);
        return parama;
        com.tencent.mm.plugin.search.ui.a.i locali = new com.tencent.mm.plugin.search.ui.a.i(i);
        locali.hWl = locali1;
        locali.hWm = parama.hWm;
        locali.oEz = this.oEz;
        locali.ci(locali1.type, locali1.gRk);
        parama = locali;
        continue;
        parama = null;
      }
    }
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18362998456320L, 136815);
    paramHashSet = paramg.lxb;
    paramg = new i.a();
    paramg.gRj = -2;
    paramg.hWm = this.hWm;
    if (paramHashSet.size() == 0)
    {
      paramg.lzF = false;
      paramHashSet = new com.tencent.mm.plugin.fts.a.a.i();
      paramHashSet.lwH = "no_result​";
      paramg.lzI = new ArrayList();
      paramg.lzI.add(paramHashSet);
    }
    for (;;)
    {
      this.lzp.add(paramg);
      GMTrace.o(18362998456320L, 136815);
      return;
      paramg.lzI = paramHashSet;
    }
  }
  
  protected final b b(int paramInt, i.a parama)
  {
    GMTrace.i(17433003819008L, 129886);
    j localj = new j(paramInt);
    localj.eDs = this.eDs;
    localj.count = parama.lzI.size();
    GMTrace.o(17433003819008L, 129886);
    return localj;
  }
  
  public final int getType()
  {
    GMTrace.i(16462609645568L, 122656);
    GMTrace.o(16462609645568L, 122656);
    return 160;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */