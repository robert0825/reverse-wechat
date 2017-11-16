package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;

public class FirstScreenFrameLayout
  extends FrameLayout
{
  a vHV;
  
  public FirstScreenFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(19149380124672L, 142674);
    GMTrace.o(19149380124672L, 142674);
  }
  
  public FirstScreenFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(19149514342400L, 142675);
    GMTrace.o(19149514342400L, 142675);
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    GMTrace.i(19149648560128L, 142676);
    super.dispatchDraw(paramCanvas);
    if (this.vHV != null) {
      new ae(Looper.getMainLooper()).postAtFrontOfQueueV2(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19245480017920L, 143390);
          if (FirstScreenFrameLayout.a(FirstScreenFrameLayout.this) != null)
          {
            FirstScreenFrameLayout.a(FirstScreenFrameLayout.this).bWP();
            FirstScreenFrameLayout.b(FirstScreenFrameLayout.this);
          }
          GMTrace.o(19245480017920L, 143390);
        }
      });
    }
    GMTrace.o(19149648560128L, 142676);
  }
  
  public static abstract interface a
  {
    public abstract void bWP();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\FirstScreenFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */