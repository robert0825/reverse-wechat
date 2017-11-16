package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import junit.framework.Assert;

public class AsyncMaskImageView
  extends ImageView
{
  private int a;
  private int b;
  private boolean eDU;
  private int g;
  ae pOE;
  Runnable pOF;
  private int r;
  
  public AsyncMaskImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8686839791616L, 64722);
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.eDU = true;
    this.pOE = new ae();
    this.pOF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8350624382976L, 62217);
        AsyncMaskImageView.this.setPressed(false);
        AsyncMaskImageView.this.invalidate();
        GMTrace.o(8350624382976L, 62217);
      }
    };
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8539602944000L, 63625);
        if (!AsyncMaskImageView.a(AsyncMaskImageView.this))
        {
          GMTrace.o(8539602944000L, 63625);
          return false;
        }
        AsyncMaskImageView localAsyncMaskImageView = AsyncMaskImageView.this;
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        while ((!localAsyncMaskImageView.isClickable()) && (!localAsyncMaskImageView.isLongClickable()))
        {
          GMTrace.o(8539602944000L, 63625);
          return true;
          paramAnonymousView.setPressed(true);
          paramAnonymousView.invalidate();
          localAsyncMaskImageView.pOE.removeCallbacks(localAsyncMaskImageView.pOF);
          continue;
          localAsyncMaskImageView.pOE.post(localAsyncMaskImageView.pOF);
        }
        GMTrace.o(8539602944000L, 63625);
        return false;
      }
    });
    GMTrace.o(8686839791616L, 64722);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(8687242444800L, 64725);
    super.onAttachedToWindow();
    w.d("MicroMsg.MaskImageView", "onAttachedToWindow");
    GMTrace.o(8687242444800L, 64725);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(8687376662528L, 64726);
    super.onDetachedFromWindow();
    w.d("MicroMsg.MaskImageView", "onDetachedFromWindow");
    GMTrace.o(8687376662528L, 64726);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8686974009344L, 64723);
    super.onDraw(paramCanvas);
    if (isPressed()) {
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
    }
    GMTrace.o(8686974009344L, 64723);
  }
  
  @Deprecated
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    GMTrace.i(8687108227072L, 64724);
    Assert.assertTrue(false);
    GMTrace.o(8687108227072L, 64724);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\AsyncMaskImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */