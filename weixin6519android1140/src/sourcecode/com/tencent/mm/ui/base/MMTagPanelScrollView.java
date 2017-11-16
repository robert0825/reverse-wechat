package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.e;
import java.util.LinkedList;

public class MMTagPanelScrollView
  extends ScrollView
{
  private Runnable lhb;
  private int lhd;
  private a wfD;
  public int wfE;
  
  public MMTagPanelScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3339471290368L, 24881);
    this.lhb = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3290884472832L, 24519);
        MMTagPanelScrollView.this.scrollTo(0, MMTagPanelScrollView.this.getBottom());
        GMTrace.o(3290884472832L, 24519);
      }
    };
    this.wfD = new a();
    this.lhd = 0;
    this.wfE = 2;
    GMTrace.o(3339471290368L, 24881);
  }
  
  public MMTagPanelScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3339337072640L, 24880);
    this.lhb = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(3290884472832L, 24519);
        MMTagPanelScrollView.this.scrollTo(0, MMTagPanelScrollView.this.getBottom());
        GMTrace.o(3290884472832L, 24519);
      }
    };
    this.wfD = new a();
    this.lhd = 0;
    this.wfE = 2;
    GMTrace.o(3339337072640L, 24880);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(3339739725824L, 24883);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    scrollBy(0, paramInt4);
    GMTrace.o(3339739725824L, 24883);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(3339605508096L, 24882);
    super.onMeasure(paramInt1, paramInt2);
    if (getChildCount() <= 0)
    {
      GMTrace.o(3339605508096L, 24882);
      return;
    }
    if ((getChildAt(0) instanceof MMTagPanel))
    {
      MMTagPanel localMMTagPanel = (MMTagPanel)getChildAt(0);
      boolean bool = localMMTagPanel.cao();
      if (localMMTagPanel.vZl.size() == this.wfE) {
        this.lhd = (localMMTagPanel.getMeasuredHeight() + getResources().getDimensionPixelOffset(a.e.aQO));
      }
      if (localMMTagPanel.vZl.size() >= this.wfE)
      {
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
        paramInt2 = Math.max(localMMTagPanel.BC(this.wfE), this.lhd);
        w.d("MicroMsg.FavTagPanelScrollView", "height %d", new Object[] { Integer.valueOf(paramInt2) });
        setMeasuredDimension(paramInt1, paramInt2);
        if (bool)
        {
          this.wfD.wfG = localMMTagPanel;
          removeCallbacks(this.wfD);
          post(this.wfD);
        }
      }
    }
    GMTrace.o(3339605508096L, 24882);
  }
  
  private static final class a
    implements Runnable
  {
    public MMTagPanel wfG;
    
    public a()
    {
      GMTrace.i(3365241094144L, 25073);
      GMTrace.o(3365241094144L, 25073);
    }
    
    public final void run()
    {
      GMTrace.i(3365375311872L, 25074);
      if (this.wfG != null) {
        this.wfG.cap();
      }
      this.wfG = null;
      GMTrace.o(3365375311872L, 25074);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMTagPanelScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */