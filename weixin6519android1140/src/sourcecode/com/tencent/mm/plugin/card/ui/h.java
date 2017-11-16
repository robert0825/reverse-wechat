package com.tencent.mm.plugin.card.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.base.c;
import java.util.List;

public final class h
  implements a
{
  private g jHD;
  
  public h(g paramg)
  {
    GMTrace.i(5037459767296L, 37532);
    this.jHD = paramg;
    GMTrace.o(5037459767296L, 37532);
  }
  
  public final void Bf()
  {
    GMTrace.i(5037862420480L, 37535);
    if (this.jHD != null) {
      this.jHD.notifyDataSetChanged();
    }
    GMTrace.o(5037862420480L, 37535);
  }
  
  public final void onCreate()
  {
    GMTrace.i(5037593985024L, 37533);
    this.jHD.notifyDataSetChanged();
    GMTrace.o(5037593985024L, 37533);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(5037728202752L, 37534);
    if (this.jHD != null)
    {
      g localg = this.jHD;
      localg.jCu.release();
      localg.jCu = null;
      localg.jCF.clear();
      localg.mContext = null;
      localg.jHB = null;
      this.jHD = null;
    }
    GMTrace.o(5037728202752L, 37534);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */