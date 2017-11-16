package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.Scroller;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.CustomViewPager;

public class MusicViewPager
  extends CustomViewPager
{
  private GestureDetector mHA;
  
  public MusicViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(4874787880960L, 36320);
    this.mHA = new GestureDetector(getContext(), new b((byte)0));
    this.xM = new a(getContext());
    GMTrace.o(4874787880960L, 36320);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(4874922098688L, 36321);
    if ((super.onInterceptTouchEvent(paramMotionEvent)) && (this.mHA.onTouchEvent(paramMotionEvent)))
    {
      GMTrace.o(4874922098688L, 36321);
      return true;
    }
    GMTrace.o(4874922098688L, 36321);
    return false;
  }
  
  public final class a
    extends Scroller
  {
    private int duration;
    
    public a(Context paramContext)
    {
      super();
      GMTrace.i(4881096114176L, 36367);
      this.duration = 1000;
      GMTrace.o(4881096114176L, 36367);
    }
    
    public final void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(4881364549632L, 36369);
      super.startScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.duration);
      GMTrace.o(4881364549632L, 36369);
    }
    
    public final void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      GMTrace.i(4881230331904L, 36368);
      super.startScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.duration);
      GMTrace.o(4881230331904L, 36368);
    }
  }
  
  private final class b
    extends GestureDetector.SimpleOnGestureListener
  {
    private b()
    {
      GMTrace.i(4880693460992L, 36364);
      GMTrace.o(4880693460992L, 36364);
    }
    
    public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
    {
      GMTrace.i(4880827678720L, 36365);
      if (Math.abs(paramFloat2) < Math.abs(paramFloat1))
      {
        GMTrace.o(4880827678720L, 36365);
        return true;
      }
      GMTrace.o(4880827678720L, 36365);
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\ui\MusicViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */