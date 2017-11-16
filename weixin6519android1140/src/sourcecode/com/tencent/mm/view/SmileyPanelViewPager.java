package com.tencent.mm.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.u;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.view.a.d;
import com.tencent.mm.view.f.a;

public class SmileyPanelViewPager
  extends CustomViewPager
{
  private final String TAG;
  private int iPM;
  private int iPN;
  public a xzM;
  private boolean xzN;
  public a xzl;
  
  public SmileyPanelViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(20102191775744L, 149773);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelViewPager";
    this.xzN = j.aN(getContext());
    this.iPM = 0;
    this.iPN = 0;
    if (bg.getInt(Build.VERSION.SDK, 0) >= 9) {
      setOverScrollMode(2);
    }
    GMTrace.o(20102191775744L, 149773);
  }
  
  public final void a(u paramu)
  {
    GMTrace.i(20102460211200L, 149775);
    super.a(paramu);
    GMTrace.o(20102460211200L, 149775);
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(20102594428928L, 149776);
    if (paramd != null)
    {
      paramd.ckK();
      paramd.xAm = false;
    }
    super.a(paramd);
    GMTrace.o(20102594428928L, 149776);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20102325993472L, 149774);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelViewPager", "alvinluo w: %d, h: %d, oldw: %d, oldh: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    boolean bool = j.aN(getContext());
    if ((this.xzl != null) && (((paramInt1 > 0) && (paramInt3 != paramInt1)) || ((paramInt2 > 0) && (paramInt4 != paramInt2) && (((paramInt2 > 0) && (paramInt2 != this.iPM)) || ((paramInt1 > 0) && (paramInt1 != this.iPN))))))
    {
      if (this.xzl.iPJ <= 0) {
        this.xzl.EI(paramInt2);
      }
      this.xzl.iPK = paramInt1;
      this.xzl.xdQ = 0;
      if ((this.xzM != null) && ((!this.xzl.xCH) || (this.xzl.xCI) || (this.xzN != bool)))
      {
        w.d("MicroMsg.emoji.SmileyPanel.SmileyPanelViewPager", "need deal cache size.");
        this.xzl.xCI = false;
        this.xzM.ED(paramInt2);
      }
    }
    this.xzN = bool;
    if (paramInt2 > 0) {
      this.iPM = paramInt2;
    }
    if (paramInt1 > 0) {
      this.iPN = paramInt1;
    }
    GMTrace.o(20102325993472L, 149774);
  }
  
  public static abstract interface a
  {
    public abstract void ED(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\SmileyPanelViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */