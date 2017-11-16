package com.tencent.mm.ui.conversation;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;

public final class k
{
  com.tencent.mm.pluginsdk.ui.d jNJ;
  public ListView wVF;
  public g wWm;
  public boolean wYP;
  private af wYQ;
  private Runnable wYR;
  public int wYS;
  
  public k()
  {
    GMTrace.i(14516318371840L, 108155);
    this.wYP = false;
    this.wYS = -1;
    this.jNJ = new com.tencent.mm.pluginsdk.ui.d(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(14480348020736L, 107887);
        GMTrace.o(14480348020736L, 107887);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(14480482238464L, 107888);
        if (paramAnonymousInt == 2) {
          com.tencent.mm.bw.d.bVG().cP(j.class.getName() + ".Listview", 4);
        }
        if (paramAnonymousInt == 0)
        {
          if (k.this.wVF == null)
          {
            GMTrace.o(14480482238464L, 107888);
            return;
          }
          k.this.DG(-1);
          GMTrace.o(14480482238464L, 107888);
          return;
        }
        k.this.chm();
        GMTrace.o(14480482238464L, 107888);
      }
    });
    GMTrace.o(14516318371840L, 108155);
  }
  
  public final void DG(int paramInt)
  {
    GMTrace.i(16021167538176L, 119367);
    int i = paramInt;
    if (paramInt < 0) {
      i = 300;
    }
    chm();
    if (this.wYQ == null) {
      this.wYQ = new af("pre load mainui avatar");
    }
    this.wYP = false;
    af localaf = this.wYQ;
    Runnable local3 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14475918835712L, 107854);
        if (k.this.wYP)
        {
          GMTrace.o(14475918835712L, 107854);
          return;
        }
        int m = k.this.wVF.getLastVisiblePosition();
        int j = k.this.wVF.getFirstVisiblePosition();
        int k = m - j;
        if (j == k.this.wYS)
        {
          GMTrace.o(14475918835712L, 107854);
          return;
        }
        k.this.wYS = j;
        w.d("MicroMsg.PreLoadHelper", "Jacks PreLod to Show, fistVisibleItem: %d, visibleItemCout: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
        int i = m + 1;
        while ((i < k.this.wWm.getCount()) && (i < k * 1 + m))
        {
          k.this.wWm.DG(i);
          i += 1;
        }
        i = j - 1;
        while ((i >= 0) && (i > j - k * 1))
        {
          k.this.wWm.DG(i);
          i -= 1;
        }
        GMTrace.o(14475918835712L, 107854);
      }
    };
    this.wYR = local3;
    localaf.h(local3, i);
    GMTrace.o(16021167538176L, 119367);
  }
  
  public final void chm()
  {
    GMTrace.i(14516452589568L, 108156);
    if (!this.wYP)
    {
      w.d("MicroMsg.PreLoadHelper", "Jacks cancel PreLoad.");
      this.wYP = true;
    }
    if ((this.wYQ != null) && (this.wYR != null)) {
      this.wYQ.bQi().removeCallbacks(this.wYR);
    }
    GMTrace.o(14516452589568L, 108156);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */