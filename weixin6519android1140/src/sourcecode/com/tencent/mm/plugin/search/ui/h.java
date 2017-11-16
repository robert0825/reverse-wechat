package com.tencent.mm.plugin.search.ui;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.d.a.a;
import com.tencent.mm.plugin.fts.d.i;
import com.tencent.mm.plugin.fts.d.i.b;
import com.tencent.mm.plugin.search.ui.c.k;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.HashSet;
import java.util.LinkedList;

public final class h
  extends b
  implements i.b
{
  private com.tencent.mm.sdk.platformtools.ae oBM;
  private k oDB;
  
  public h(c paramc, String paramString, int paramInt)
  {
    super(paramc);
    GMTrace.i(16487439925248L, 122841);
    this.oBM = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    paramc = paramc.getContext();
    HashSet localHashSet = new HashSet();
    localHashSet.add(Integer.valueOf(160));
    paramc = (k)com.tencent.mm.plugin.fts.d.h.a(localHashSet, paramc, this, paramInt).get(0);
    paramc.eDs = paramString;
    if (s.eb(paramString))
    {
      at.AR();
      paramc.oEz = com.tencent.mm.y.c.yT().gC(paramString);
    }
    this.oDB = paramc;
    GMTrace.o(16487439925248L, 122841);
  }
  
  public final void a(i parami, String paramString)
  {
    GMTrace.i(16487574142976L, 122842);
    tF(parami.oa(0));
    notifyDataSetChanged();
    C(getCount(), true);
    GMTrace.o(16487574142976L, 122842);
  }
  
  protected final boolean a(a parama)
  {
    GMTrace.i(16487842578432L, 122844);
    GMTrace.o(16487842578432L, 122844);
    return false;
  }
  
  protected final void bdF()
  {
    GMTrace.i(11824850272256L, 88102);
    this.oDB.a(this.eQb, this.oBM, new HashSet());
    GMTrace.o(11824850272256L, 88102);
  }
  
  protected final a ob(int paramInt)
  {
    GMTrace.i(16487708360704L, 122843);
    a locala = this.oDB.ob(paramInt);
    if (locala != null) {
      locala.lzY = paramInt;
    }
    GMTrace.o(16487708360704L, 122843);
    return locala;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\search\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */