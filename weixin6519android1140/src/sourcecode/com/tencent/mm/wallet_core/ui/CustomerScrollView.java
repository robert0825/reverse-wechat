package com.tencent.mm.wallet_core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.tencent.gmtrace.GMTrace;

public class CustomerScrollView
  extends ScrollView
{
  private float xEo;
  private float xEp;
  private float xEq;
  private float xEr;
  
  public CustomerScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1470355210240L, 10955);
    GMTrace.o(1470355210240L, 10955);
  }
  
  public CustomerScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1470220992512L, 10954);
    GMTrace.o(1470220992512L, 10954);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1470489427968L, 10956);
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      for (;;)
      {
        boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
        GMTrace.o(1470489427968L, 10956);
        return bool;
        this.xEp = 0.0F;
        this.xEo = 0.0F;
        this.xEq = paramMotionEvent.getX();
        this.xEr = paramMotionEvent.getY();
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.xEo += Math.abs(f1 - this.xEq);
      this.xEp += Math.abs(f2 - this.xEr);
      this.xEq = f1;
      this.xEr = f2;
    } while (this.xEo <= this.xEp);
    GMTrace.o(1470489427968L, 10956);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\wallet_core\ui\CustomerScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */