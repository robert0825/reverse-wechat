package com.tencent.mm.plugin.search.ui;

import android.os.Looper;
import android.os.Message;
import android.widget.AbsListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.az.j;
import com.tencent.mm.az.k;
import com.tencent.mm.g.a.oy;
import com.tencent.mm.g.a.oy.b;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import com.tencent.mm.y.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
  extends b
  implements i.b
{
  private ae oBM;
  private boolean oCH;
  private boolean oCI;
  boolean oCK;
  private List<i> oCS;
  private j oCT;
  private b oCU;
  private long oCV;
  private long oCW;
  private long oCX;
  private long oCY;
  private ae oCZ;
  int oCb;
  private int oDa;
  boolean oDb;
  private boolean oDc;
  
  public g(c paramc, int paramInt, b paramb)
  {
    super(paramc);
    GMTrace.i(19516062957568L, 145406);
    this.oCU = null;
    this.oCb = 1;
    this.oCZ = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11842432794624L, 88233);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11842432794624L, 88233);
          return;
          if ((!g.f(g.this)) && (g.this.getCount() > 0))
          {
            com.tencent.mm.plugin.search.a.c.bdC().aCB();
            n.poO.start();
            g.this.notifyDataSetChanged();
          }
        }
      }
    };
    this.oBM = new ae(Looper.getMainLooper());
    this.oDa = -1;
    this.oCT = new j();
    paramc = new HashSet();
    paramc.add(Integer.valueOf(16));
    paramc.add(Integer.valueOf(32));
    paramc.add(Integer.valueOf(48));
    paramc.add(Integer.valueOf(64));
    paramc.add(Integer.valueOf(80));
    paramc.add(Integer.valueOf(128));
    paramc.add(Integer.valueOf(96));
    paramc.add(Integer.valueOf(112));
    if (com.tencent.mm.kernel.h.xw().wL())
    {
      oy localoy = new oy();
      com.tencent.mm.sdk.b.a.vgX.m(localoy);
      com.tencent.mm.storage.c localc = com.tencent.mm.y.c.c.Ct().er("100193");
      if ((!localc.isValid()) || (!"1".equals(localc.bSg().get("isOpenLocalSearch"))) || (!localoy.eTP.eTR)) {}
    }
    for (;;)
    {
      if (i != 0) {
        paramc.add(Integer.valueOf(144));
      }
      this.oCS = com.tencent.mm.plugin.fts.d.h.a(paramc, getContext(), this, paramInt);
      this.oCU = paramb;
      GMTrace.o(19516062957568L, 145406);
      return;
      i = 0;
    }
  }
  
  private void d(HashSet<String> paramHashSet)
  {
    GMTrace.i(11880416411648L, 88516);
    this.oDa += 1;
    if (this.oDa < this.oCS.size()) {
      ((i)this.oCS.get(this.oDa)).a(this.eQb, this.oBM, paramHashSet);
    }
    GMTrace.o(11880416411648L, 88516);
  }
  
  public final void a(i parami, String paramString)
  {
    GMTrace.i(16477239377920L, 122765);
    Object localObject = (com.tencent.mm.plugin.fts.d.c)parami;
    if (paramString.equals(this.eQb)) {
      d(((com.tencent.mm.plugin.fts.d.c)localObject).lwW);
    }
    int k = ((com.tencent.mm.plugin.fts.d.c)localObject).lzp.size();
    int j = 0;
    int i = 0;
    while (i < k)
    {
      j += ((i.a)((com.tencent.mm.plugin.fts.d.c)localObject).lzp.get(i)).lzI.size();
      i += 1;
    }
    if ((j > 0) && (this.oCV == 0L))
    {
      this.oCV = (System.currentTimeMillis() - this.oCl);
      com.tencent.mm.az.h.j(9, this.oCV);
      w.i("MicroMsg.FTS.FTSMainAdapter", "firstItemTime=%d", new Object[] { Long.valueOf(this.oCV) });
    }
    j localj;
    switch (((com.tencent.mm.plugin.fts.d.c)localObject).getType())
    {
    default: 
      localj = this.oCT;
      localObject = ((com.tencent.mm.plugin.fts.d.c)localObject).lzp.iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject).hasNext()) {
        break label623;
      }
      i.a locala = (i.a)((Iterator)localObject).next();
      switch (locala.gRj)
      {
      case -10: 
      case -9: 
      default: 
        break;
      case -11: 
        localj.gRM = locala.lzI.size();
        continue;
        if (this.oCW != 0L) {
          break;
        }
        this.oCW = (System.currentTimeMillis() - this.oCl);
        w.i("MicroMsg.FTS.FTSMainAdapter", "firstGetTopHitsTime=%d", new Object[] { Long.valueOf(this.oCW) });
        com.tencent.mm.az.h.j(0, this.oCW);
        break;
        if (this.oCX != 0L) {
          break;
        }
        this.oCX = (System.currentTimeMillis() - this.oCl);
        w.i("MicroMsg.FTS.FTSMainAdapter", "firstGetContactTime=%d", new Object[] { Long.valueOf(this.oCX) });
        com.tencent.mm.az.h.j(3, this.oCX);
        break;
        if (this.oCY != 0L) {
          break;
        }
        this.oCY = (System.currentTimeMillis() - this.oCl);
        w.i("MicroMsg.FTS.FTSMainAdapter", "firstGetChatroomTime=%d", new Object[] { Long.valueOf(this.oCY) });
        com.tencent.mm.az.h.j(6, this.oCY);
        break;
      case -2: 
        localj.gRI = locala.lzI.size();
        break;
      case -4: 
        localj.gRF = locala.lzI.size();
        break;
      case -6: 
        localj.gRJ = locala.lzI.size();
        break;
      case -3: 
        localj.gRG = locala.lzI.size();
        break;
      case -1: 
        localj.gRK = locala.lzI.size();
        break;
      case -7: 
        localj.gRH = locala.lzI.size();
        break;
      case -5: 
        localj.gRL = locala.lzI.size();
        break;
      case -8: 
        localj.gRE = locala.lzI.size();
      }
    }
    label623:
    new a(parami, paramString).run();
    GMTrace.o(16477239377920L, 122765);
  }
  
  protected final boolean a(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16477105160192L, 122764);
    if (parama.lAf)
    {
      this.oDc = true;
      w.d("MicroMsg.FTS.FTSMainAdapter", "searchType=%d | searchScene=%d | kvPosition=%d | kvSubPosition=%d | kvSearchId=%s | kvDocId=%d", new Object[] { Integer.valueOf(parama.lzX), Integer.valueOf(parama.lzo), Integer.valueOf(parama.lzY), Integer.valueOf(parama.lzZ), parama.lAa, Long.valueOf(parama.lAb) });
      String str;
      int i;
      if (!this.oCH)
      {
        str = this.eQb;
        i = bdK();
        if (this.oCT.gRE <= 0) {
          break label178;
        }
      }
      label178:
      for (boolean bool = true;; bool = false)
      {
        com.tencent.mm.az.h.a(str, true, i, 0, bool);
        this.oCH = true;
        if (!bg.nm(this.eQb)) {
          k.d(this.eQb, this.oCb, 1, 3);
        }
        com.tencent.mm.az.h.a(parama, this.oCT);
        GMTrace.o(16477105160192L, 122764);
        return true;
      }
    }
    if ((parama instanceof com.tencent.mm.plugin.search.ui.a.c))
    {
      this.oCK = true;
      if (!bg.nm(this.eQb)) {
        k.d(this.eQb, this.oCb, 1, 3);
      }
      com.tencent.mm.az.h.a(parama, this.oCT);
    }
    GMTrace.o(16477105160192L, 122764);
    return false;
  }
  
  protected final void bdF()
  {
    GMTrace.i(11879611105280L, 88510);
    this.oCH = false;
    this.oCK = false;
    this.oDa = -1;
    this.oDb = false;
    this.oCT.reset();
    this.oCb = 1;
    this.oCV = 0L;
    this.oCW = 0L;
    this.oCX = 0L;
    this.oCY = 0L;
    HashSet localHashSet = new HashSet();
    localHashSet.add("filehelper");
    boolean bool2 = q.Al();
    boolean bool1 = bool2;
    if (!bool2) {
      if (bg.getInt(com.tencent.mm.k.g.ut().getValue("BindQQSwitch"), 1) != 1) {
        break label173;
      }
    }
    label173:
    for (bool1 = true;; bool1 = false)
    {
      if (!bool1)
      {
        w.i("MicroMsg.FTS.FTSMainAdapter", "summerqq BindQQSwitch off");
        localHashSet.add("22");
        localHashSet.add("23");
      }
      w.d("MicroMsg.FTS.FTSMainAdapter", "summerqq doSearch blockSet[%d]", new Object[] { Integer.valueOf(localHashSet.size()) });
      d(localHashSet);
      GMTrace.o(11879611105280L, 88510);
      return;
    }
  }
  
  protected final void clearCache()
  {
    GMTrace.i(11879879540736L, 88512);
    super.clearCache();
    Iterator localIterator = this.oCS.iterator();
    while (localIterator.hasNext())
    {
      i locali = (i)localIterator.next();
      locali.aCw();
      locali.Ty();
    }
    GMTrace.o(11879879540736L, 88512);
  }
  
  public final void finish()
  {
    boolean bool = true;
    GMTrace.i(11879745323008L, 88511);
    String str;
    int i;
    if (!this.oCH)
    {
      this.oCH = true;
      if (!this.oCK)
      {
        str = this.eQb;
        i = bdK();
        if (this.oCT.gRE <= 0) {
          break label106;
        }
      }
    }
    for (;;)
    {
      com.tencent.mm.az.h.a(str, false, i, 0, bool);
      if ((!this.oCK) && (!this.oDc)) {
        k.d(this.eQb, this.oCb, 3, 3);
      }
      this.oCT.reset();
      super.finish();
      GMTrace.o(11879745323008L, 88511);
      return;
      label106:
      bool = false;
    }
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a ob(int paramInt)
  {
    GMTrace.i(16476970942464L, 122763);
    Object localObject1 = null;
    Iterator localIterator = this.oCS.iterator();
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject2 = ((i)localIterator.next()).ob(paramInt);
      localObject1 = localObject2;
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    int i;
    if (localObject1 != null)
    {
      localObject2 = new LinkedList();
      localIterator = this.oCS.iterator();
      while (localIterator.hasNext()) {
        ((LinkedList)localObject2).addAll(((i)localIterator.next()).aCx());
      }
      i = ((LinkedList)localObject2).size() - 1;
    }
    for (;;)
    {
      int j = paramInt;
      if (i >= 0)
      {
        if (paramInt > ((Integer)((LinkedList)localObject2).get(i)).intValue()) {
          j = paramInt - i;
        }
      }
      else
      {
        ((com.tencent.mm.plugin.fts.d.a.a)localObject1).lzY = j;
        if (((com.tencent.mm.plugin.fts.d.a.a)localObject1).position == getCount() - 1) {
          ((com.tencent.mm.plugin.fts.d.a.a)localObject1).lzW = true;
        }
        GMTrace.o(16476970942464L, 122763);
        return (com.tencent.mm.plugin.fts.d.a.a)localObject1;
      }
      i -= 1;
    }
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(11880550629376L, 88517);
    super.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    if ((paramAbsListView.getLastVisiblePosition() == getCount()) && (this.oDb))
    {
      this.oCb = 2;
      if (this.oCU != null) {
        this.oCU.bdX();
      }
    }
    GMTrace.o(11880550629376L, 88517);
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11880684847104L, 88518);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 2)
    {
      this.oCI = true;
      com.tencent.mm.plugin.fts.d.h.aCF().aCz();
      n.poO.pause();
      GMTrace.o(11880684847104L, 88518);
      return;
    }
    this.oCI = false;
    if (!com.tencent.mm.plugin.fts.d.h.aCF().aCA())
    {
      this.oCZ.removeMessages(1);
      this.oCZ.sendEmptyMessageDelayed(1, 200L);
    }
    GMTrace.o(11880684847104L, 88518);
  }
  
  public final void stopSearch()
  {
    GMTrace.i(11880013758464L, 88513);
    this.oCZ.removeMessages(1);
    super.stopSearch();
    GMTrace.o(11880013758464L, 88513);
  }
  
  private final class a
    implements Runnable
  {
    private String eQb;
    private i oDe;
    
    a(i parami, String paramString)
    {
      GMTrace.i(16483816046592L, 122814);
      this.eQb = paramString;
      this.oDe = parami;
      GMTrace.o(16483816046592L, 122814);
    }
    
    public final void run()
    {
      GMTrace.i(11822031699968L, 88081);
      if ((!g.a(g.this)) && (((i)g.b(g.this).get(g.b(g.this).size() - 1)).getType() == this.oDe.getType())) {
        g.c(g.this);
      }
      Iterator localIterator = g.b(g.this).iterator();
      for (int i = 0; localIterator.hasNext(); i = ((i)localIterator.next()).oa(i)) {}
      g.this.tF(i);
      g.this.notifyDataSetChanged();
      g.this.C(i, g.d(g.this));
      if (g.d(g.this)) {
        g.e(g.this).gRe = System.currentTimeMillis();
      }
      GMTrace.o(11822031699968L, 88081);
    }
  }
  
  public static abstract interface b
  {
    public abstract void bdX();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */