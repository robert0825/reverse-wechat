package com.tencent.mm.plugin.search.ui;

import android.os.Looper;
import android.os.Message;
import android.widget.AbsListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.az.d;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.g;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.a;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends b
  implements i.b
{
  private int lzX;
  private boolean mDI;
  private ae oBM;
  private i oCF;
  private d oCG;
  private boolean oCH;
  private boolean oCI;
  private ae oCJ;
  private boolean oCK;
  
  public e(c paramc, int paramInt1, int paramInt2)
  {
    super(paramc);
    GMTrace.i(11823105441792L, 88089);
    this.oBM = new ae(Looper.getMainLooper());
    this.oCJ = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(11843640754176L, 88242);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(11843640754176L, 88242);
          return;
          w.d("MicroMsg.FTS.FTSDetailAdapter", "ImageEngine attach is true");
          if ((!e.a(e.this)) && (e.this.getCount() > 0))
          {
            com.tencent.mm.plugin.search.a.c.bdC().aCB();
            n.poO.start();
            e.this.notifyDataSetChanged();
          }
        }
      }
    };
    this.lzX = paramInt1;
    paramc = getContext();
    int j = -1;
    int i = j;
    switch (paramInt1)
    {
    default: 
      i = j;
    }
    for (;;)
    {
      w.i("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | uiLogicType=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(i) });
      HashSet localHashSet = new HashSet();
      localHashSet.add(Integer.valueOf(i));
      this.oCF = ((i)com.tencent.mm.plugin.fts.d.h.a(localHashSet, paramc, this, paramInt2).get(0));
      this.oCG = new d();
      GMTrace.o(11823105441792L, 88089);
      return;
      i = 4112;
      continue;
      i = 4128;
      continue;
      i = 4160;
      continue;
      i = 4144;
      continue;
      i = 4176;
      continue;
      i = 4192;
      continue;
      i = 4208;
    }
  }
  
  public final void a(i parami, String paramString)
  {
    GMTrace.i(16462341210112L, 122654);
    if (paramString.equals(this.eQb)) {
      this.mDI = false;
    }
    tF(parami.oa(0));
    notifyDataSetChanged();
    C(getCount(), true);
    this.oCG.gRe = System.currentTimeMillis();
    paramString = this.oCG;
    parami = ((com.tencent.mm.plugin.fts.d.c)parami).lzp.iterator();
    while (parami.hasNext())
    {
      i.a locala = (i.a)parami.next();
      int i = paramString.gRf;
      paramString.gRf = (locala.lzI.size() + i);
    }
    GMTrace.o(16462341210112L, 122654);
  }
  
  protected final boolean a(a parama)
  {
    GMTrace.i(16462206992384L, 122653);
    if (parama.lAf)
    {
      w.d("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | searchScene=%d | kvPosition=%d | kvSubPosition=%d | kvSearchId=%s | kvDocId=%d", new Object[] { Integer.valueOf(parama.lzX), Integer.valueOf(parama.lzo), Integer.valueOf(parama.lzY), Integer.valueOf(parama.lzZ), parama.lAa, Long.valueOf(parama.lAb) });
      if (!this.oCH)
      {
        com.tencent.mm.az.h.a(this.eQb, true, bdK(), parama.lzX, false);
        this.oCH = true;
      }
      com.tencent.mm.az.h.a(parama, this.oCG);
    }
    for (;;)
    {
      GMTrace.o(16462206992384L, 122653);
      return false;
      if ((parama instanceof com.tencent.mm.plugin.search.ui.a.c))
      {
        this.oCK = true;
        com.tencent.mm.az.h.a(parama, this.oCG);
      }
    }
  }
  
  protected final void bdF()
  {
    GMTrace.i(11823373877248L, 88091);
    this.mDI = true;
    this.oCH = false;
    this.oCG.reset();
    this.oCF.a(this.eQb, this.oBM, new HashSet());
    GMTrace.o(11823373877248L, 88091);
  }
  
  protected final void clearCache()
  {
    GMTrace.i(11823508094976L, 88092);
    super.clearCache();
    this.oCF.Ty();
    this.oCF.aCw();
    this.oCJ.removeMessages(1);
    GMTrace.o(11823508094976L, 88092);
  }
  
  public final void finish()
  {
    GMTrace.i(11823776530432L, 88094);
    if (!this.oCH)
    {
      this.oCH = true;
      if (!this.oCK) {
        com.tencent.mm.az.h.a(this.eQb, false, bdK(), this.lzX, false);
      }
    }
    this.oCG.reset();
    super.finish();
    GMTrace.o(11823776530432L, 88094);
  }
  
  protected final a ob(int paramInt)
  {
    GMTrace.i(16462072774656L, 122652);
    a locala = this.oCF.ob(paramInt);
    if (locala != null) {
      locala.lzY = paramInt;
    }
    GMTrace.o(16462072774656L, 122652);
    return locala;
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(11824044965888L, 88096);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 2)
    {
      this.oCI = true;
      com.tencent.mm.plugin.search.a.c.bdC().aCz();
      n.poO.pause();
      w.d("MicroMsg.FTS.FTSDetailAdapter", "ImageEngine attach is false");
      GMTrace.o(11824044965888L, 88096);
      return;
    }
    this.oCI = false;
    if (!com.tencent.mm.plugin.search.a.c.bdC().aCA())
    {
      this.oCJ.removeMessages(1);
      this.oCJ.sendEmptyMessageDelayed(1, 200L);
    }
    GMTrace.o(11824044965888L, 88096);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */