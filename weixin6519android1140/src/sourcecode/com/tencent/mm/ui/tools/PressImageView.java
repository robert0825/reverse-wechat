package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import junit.framework.Assert;

public class PressImageView
  extends ImageView
{
  private int a;
  private int b;
  private int g;
  private ae pOE;
  private Runnable pOF;
  private int r;
  
  public PressImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2031787966464L, 15138);
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.pOE = new ae();
    this.pOF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1924145348608L, 14336);
        PressImageView.this.setPressed(false);
        PressImageView.this.invalidate();
        GMTrace.o(1924145348608L, 14336);
      }
    };
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1925890179072L, 14349);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        while ((!PressImageView.this.isClickable()) && (!PressImageView.this.isLongClickable()))
        {
          GMTrace.o(1925890179072L, 14349);
          return true;
          paramAnonymousView.setPressed(true);
          paramAnonymousView.invalidate();
          PressImageView.b(PressImageView.this).removeCallbacks(PressImageView.a(PressImageView.this));
          continue;
          PressImageView.b(PressImageView.this).post(PressImageView.a(PressImageView.this));
        }
        GMTrace.o(1925890179072L, 14349);
        return false;
      }
    });
    GMTrace.o(2031787966464L, 15138);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2031922184192L, 15139);
    super.onDraw(paramCanvas);
    if (isPressed()) {
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
    }
    GMTrace.o(2031922184192L, 15139);
  }
  
  @Deprecated
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    GMTrace.i(2032056401920L, 15140);
    Assert.assertTrue(false);
    GMTrace.o(2032056401920L, 15140);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\PressImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */