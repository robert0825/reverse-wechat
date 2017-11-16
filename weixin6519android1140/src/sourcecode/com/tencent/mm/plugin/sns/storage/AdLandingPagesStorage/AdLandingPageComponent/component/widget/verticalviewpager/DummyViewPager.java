package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager.h;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.b.a;
import java.io.Serializable;
import java.lang.reflect.Method;

public class DummyViewPager
  extends AdLandingViewPager
  implements Serializable
{
  protected int pKh;
  
  public DummyViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(17122826649600L, 127575);
    paramContext = new a();
    int i;
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (this.yu == null) {
        break label153;
      }
      i = 1;
    }
    for (;;)
    {
      if (1 != i) {
        j = 1;
      }
      this.yu = paramContext;
      if ((Build.VERSION.SDK_INT < 7) || (this.pKb == null)) {}
      try
      {
        this.pKb = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] { Boolean.TYPE });
        try
        {
          if (this.pKb != null) {
            this.pKb.invoke(this, new Object[] { Boolean.valueOf(true) });
          }
          this.yv = 1;
          if (j != 0) {
            populate();
          }
          this.yr = new ViewPager.h()
          {
            public final void W(int paramAnonymousInt)
            {
              GMTrace.i(17101217595392L, 127414);
              super.W(paramAnonymousInt);
              if (paramAnonymousInt == 0) {
                DummyViewPager.this.pKh = DummyViewPager.this.getScrollX();
              }
              GMTrace.o(17101217595392L, 127414);
            }
          };
          GMTrace.o(17122826649600L, 127575);
          return;
          label153:
          i = 0;
        }
        catch (Exception paramContext)
        {
          for (;;) {}
        }
      }
      catch (NoSuchMethodException paramContext)
      {
        for (;;) {}
      }
    }
  }
  
  public final int blj()
  {
    GMTrace.i(17122960867328L, 127576);
    int i = this.pKh;
    GMTrace.o(17122960867328L, 127576);
    return i;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(17123095085056L, 127577);
    GMTrace.o(17123095085056L, 127577);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\widget\verticalviewpager\DummyViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */