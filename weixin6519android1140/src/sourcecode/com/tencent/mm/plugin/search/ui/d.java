package com.tencent.mm.plugin.search.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b.e;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class d
  extends b
  implements j
{
  private String eDs;
  private List<String> hWm;
  private ae irz;
  private com.tencent.mm.plugin.fts.a.a.a lwZ;
  private List<i> lzI;
  
  public d(c paramc, String paramString)
  {
    super(paramc);
    GMTrace.i(11872766001152L, 88459);
    this.irz = new ae();
    this.eDs = paramString;
    GMTrace.o(11872766001152L, 88459);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(18368098729984L, 136853);
    switch (paramg.aGY)
    {
    }
    for (;;)
    {
      GMTrace.o(18368098729984L, 136853);
      return;
      this.lzI = paramg.lxb;
      this.hWm = bg.g(paramg.lxa);
      tF(this.lzI.size());
      notifyDataSetChanged();
      C(getCount(), true);
      GMTrace.o(18368098729984L, 136853);
      return;
      tF(0);
      notifyDataSetChanged();
      C(getCount(), true);
    }
  }
  
  protected final boolean a(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16482339651584L, 122803);
    GMTrace.o(16482339651584L, 122803);
    return false;
  }
  
  protected final void bdF()
  {
    GMTrace.i(11873034436608L, 88461);
    if (this.lwZ != null) {
      ((l)h.j(l.class)).cancelSearchTask(this.lwZ);
    }
    com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
    localf.eQb = this.eQb;
    localf.eDs = this.eDs;
    localf.lwX = e.lxv;
    localf.lwY = this;
    localf.handler = this.irz;
    localf.lwS = 3;
    this.lwZ = ((l)h.j(l.class)).search(3, localf);
    w.i("MicroMSsg.FTS.FTSChattingTalkerAdapter", "do search %s", new Object[] { this.eQb });
    GMTrace.o(11873034436608L, 88461);
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a ob(int paramInt)
  {
    GMTrace.i(16482071216128L, 122801);
    com.tencent.mm.plugin.search.ui.a.f localf = new com.tencent.mm.plugin.search.ui.a.f(paramInt);
    localf.hWl = ((i)this.lzI.get(paramInt));
    localf.hWm = this.hWm;
    localf.lzX = -12;
    localf.eQb = this.eQb;
    localf.lzY = paramInt;
    if (localf.position == getCount() - 1) {
      localf.lzW = true;
    }
    GMTrace.o(16482071216128L, 122801);
    return localf;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */