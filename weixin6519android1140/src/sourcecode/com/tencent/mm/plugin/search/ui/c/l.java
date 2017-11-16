package com.tencent.mm.plugin.search.ui.c;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.d.b;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class l
  extends com.tencent.mm.plugin.fts.d.c
{
  private boolean oEM;
  
  public l(Context paramContext, i.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    GMTrace.i(16464354476032L, 122669);
    this.oEM = false;
    at.AR();
    paramContext = (String)com.tencent.mm.y.c.xh().get(6, null);
    if ((paramContext != null) && (paramContext.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.oEM = bool;
      this.oEM &= bg.Jw();
      GMTrace.o(16464354476032L, 122669);
      return;
    }
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ae paramae, HashSet<String> paramHashSet)
  {
    GMTrace.i(18365682810880L, 136835);
    f localf = new f();
    int[] arrayOfInt;
    if (this.oEM)
    {
      arrayOfInt = new int[6];
      int[] tmp30_29 = arrayOfInt;
      tmp30_29[0] = 131072;
      int[] tmp35_30 = tmp30_29;
      tmp35_30[1] = 131075;
      int[] tmp40_35 = tmp35_30;
      tmp40_35[2] = 131073;
      int[] tmp45_40 = tmp40_35;
      tmp45_40[3] = 131074;
      int[] tmp50_45 = tmp45_40;
      tmp50_45[4] = 262144;
      int[] tmp55_50 = tmp50_45;
      tmp55_50[5] = 131076;
      tmp55_50;
    }
    for (;;)
    {
      localf.lwT = arrayOfInt;
      localf.lwV = 3;
      localf.lwY = this;
      localf.handler = paramae;
      localf.scene = 0;
      localf.lwW = paramHashSet;
      if (!this.eQb.startsWith("@@")) {
        break;
      }
      localf.eQb = this.eQb.substring(2);
      paramae = ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).search(10000, localf);
      GMTrace.o(18365682810880L, 136835);
      return paramae;
      arrayOfInt = new int[4];
      int[] tmp156_155 = arrayOfInt;
      tmp156_155[0] = 131072;
      int[] tmp161_156 = tmp156_155;
      tmp161_156[1] = 131075;
      int[] tmp166_161 = tmp161_156;
      tmp166_161[2] = 262144;
      int[] tmp171_166 = tmp166_161;
      tmp171_166[3] = 131076;
      tmp171_166;
    }
    localf.eQb = this.eQb;
    paramae = ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).search(1, localf);
    GMTrace.o(18365682810880L, 136835);
    return paramae;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a a(int paramInt, i.a parama)
  {
    GMTrace.i(16464757129216L, 122672);
    int i = paramInt - parama.lzE - 1;
    i locali;
    com.tencent.mm.plugin.fts.d.c localc;
    if ((i < parama.lzI.size()) && (i >= 0))
    {
      locali = (i)parama.lzI.get(i);
      if (locali.type == 131075) {
        localc = (com.tencent.mm.plugin.fts.d.c)com.tencent.mm.plugin.fts.d.h.a(48, this.context, this.lzn, this.lzo);
      }
    }
    for (;;)
    {
      if (localc != null) {}
      for (parama = localc.a(paramInt, locali, parama.hWm);; parama = null)
      {
        if (parama != null) {
          parama.lzZ = (i + 1);
        }
        GMTrace.o(16464757129216L, 122672);
        return parama;
        if ((locali.type == 131072) || (locali.type == 131073) || (locali.type == 131074))
        {
          localc = (com.tencent.mm.plugin.fts.d.c)com.tencent.mm.plugin.fts.d.h.a(32, this.context, this.lzn, this.lzo);
          break;
        }
        if (locali.type == 262144)
        {
          localc = (com.tencent.mm.plugin.fts.d.c)com.tencent.mm.plugin.fts.d.h.a(64, this.context, this.lzn, this.lzo);
          break;
        }
        if (locali.type != 131076) {
          break label250;
        }
        localc = (com.tencent.mm.plugin.fts.d.c)com.tencent.mm.plugin.fts.d.h.a(96, this.context, this.lzn, this.lzo);
        break;
      }
      label250:
      localc = null;
    }
  }
  
  protected final void a(g paramg, HashSet<String> paramHashSet)
  {
    GMTrace.i(18365817028608L, 136836);
    List localList = paramg.lxb;
    paramg = localList.iterator();
    while (paramg.hasNext()) {
      paramHashSet.add(((i)paramg.next()).lwH);
    }
    if (aK(localList))
    {
      paramHashSet = new i.a();
      paramHashSet.gRj = -8;
      if ((!b.aK(localList)) || (localList.size() <= 3)) {
        break label138;
      }
    }
    label138:
    for (paramg = localList.subList(0, 3);; paramg = localList)
    {
      paramHashSet.lzI = paramg;
      paramHashSet.lzH = false;
      paramHashSet.hWm = this.hWm;
      this.lzp.add(paramHashSet);
      d.aI(localList);
      GMTrace.o(18365817028608L, 136836);
      return;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(11862833889280L, 88385);
    GMTrace.o(11862833889280L, 88385);
    return 16;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\c\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */