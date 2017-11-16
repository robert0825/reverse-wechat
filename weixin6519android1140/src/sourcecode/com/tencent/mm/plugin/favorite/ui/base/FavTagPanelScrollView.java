package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.FlowLayout;
import java.util.LinkedList;

public class FavTagPanelScrollView
  extends ScrollView
{
  private Runnable lhb;
  private a lhc;
  private int lhd;
  
  public FavTagPanelScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6444866863104L, 48018);
    this.lhb = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6448222306304L, 48043);
        FavTagPanelScrollView.this.fullScroll(130);
        GMTrace.o(6448222306304L, 48043);
      }
    };
    this.lhc = new a();
    this.lhd = 0;
    GMTrace.o(6444866863104L, 48018);
  }
  
  public FavTagPanelScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6444732645376L, 48017);
    this.lhb = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6448222306304L, 48043);
        FavTagPanelScrollView.this.fullScroll(130);
        GMTrace.o(6448222306304L, 48043);
      }
    };
    this.lhc = new a();
    this.lhd = 0;
    GMTrace.o(6444732645376L, 48017);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(6445001080832L, 48019);
    super.onMeasure(paramInt1, paramInt2);
    if (getChildCount() <= 0)
    {
      GMTrace.o(6445001080832L, 48019);
      return;
    }
    if ((getChildAt(0) instanceof FavTagPanel))
    {
      FavTagPanel localFavTagPanel = (FavTagPanel)getChildAt(0);
      boolean bool = localFavTagPanel.cao();
      if (localFavTagPanel.vZl.size() == 2) {
        this.lhd = (localFavTagPanel.getMeasuredHeight() + getResources().getDimensionPixelOffset(R.f.aQO));
      }
      if (localFavTagPanel.vZl.size() >= 2)
      {
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
        paramInt2 = Math.max(localFavTagPanel.BC(2), this.lhd);
        w.d("MicroMsg.FavTagPanelScrollView", "height %d", new Object[] { Integer.valueOf(paramInt2) });
        setMeasuredDimension(paramInt1, paramInt2);
        removeCallbacks(this.lhb);
        post(this.lhb);
        if (bool)
        {
          this.lhc.lhf = localFavTagPanel;
          removeCallbacks(this.lhc);
          post(this.lhc);
        }
      }
    }
    GMTrace.o(6445001080832L, 48019);
  }
  
  private static final class a
    implements Runnable
  {
    public FavTagPanel lhf;
    
    public a()
    {
      GMTrace.i(6444329992192L, 48014);
      GMTrace.o(6444329992192L, 48014);
    }
    
    public final void run()
    {
      GMTrace.i(6444464209920L, 48015);
      if (this.lhf != null) {
        this.lhf.cap();
      }
      this.lhf = null;
      GMTrace.o(6444464209920L, 48015);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\FavTagPanelScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */