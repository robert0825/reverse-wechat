package com.tencent.mm.ui.applet;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.gmtrace.GMTrace;

public final class a
  implements AbsListView.OnScrollListener
{
  private AbsListView.OnScrollListener tsN;
  
  public a()
  {
    this((byte)0);
    GMTrace.i(1847104372736L, 13762);
    GMTrace.o(1847104372736L, 13762);
  }
  
  private a(byte paramByte)
  {
    GMTrace.i(1847238590464L, 13763);
    this.tsN = null;
    GMTrace.o(1847238590464L, 13763);
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1847372808192L, 13764);
    if (this.tsN != null) {
      this.tsN.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
    }
    GMTrace.o(1847372808192L, 13764);
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    GMTrace.i(1847507025920L, 13765);
    if (this.tsN != null) {
      this.tsN.onScrollStateChanged(paramAbsListView, paramInt);
    }
    GMTrace.o(1847507025920L, 13765);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\applet\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */