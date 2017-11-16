package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.ae;

public class MaskImageView
  extends TagImageView
{
  private int a;
  private int b;
  boolean eDU;
  private int g;
  private ae pOE;
  private Runnable pOF;
  private int r;
  
  public MaskImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8737305657344L, 65098);
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.eDU = true;
    this.pOE = new ae(Looper.getMainLooper());
    this.pOF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8510343479296L, 63407);
        MaskImageView.this.setPressed(false);
        MaskImageView.this.invalidate();
        GMTrace.o(8510343479296L, 63407);
      }
    };
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8677310332928L, 64651);
        if (!MaskImageView.a(MaskImageView.this))
        {
          GMTrace.o(8677310332928L, 64651);
          return false;
        }
        boolean bool = MaskImageView.this.d(paramAnonymousView, paramAnonymousMotionEvent);
        GMTrace.o(8677310332928L, 64651);
        return bool;
      }
    });
    super.setContentDescription(getContext().getResources().getString(i.j.pjy));
    GMTrace.o(8737305657344L, 65098);
  }
  
  public final boolean d(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(8737439875072L, 65099);
    switch (paramMotionEvent.getAction())
    {
    }
    while ((!isClickable()) && (!isLongClickable()))
    {
      GMTrace.o(8737439875072L, 65099);
      return true;
      paramView.setPressed(true);
      paramView.invalidate();
      this.pOE.removeCallbacks(this.pOF);
      continue;
      this.pOE.post(this.pOF);
    }
    GMTrace.o(8737439875072L, 65099);
    return false;
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(8737842528256L, 65102);
    super.onAttachedToWindow();
    GMTrace.o(8737842528256L, 65102);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(8737976745984L, 65103);
    super.onDetachedFromWindow();
    GMTrace.o(8737976745984L, 65103);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8737574092800L, 65100);
    super.onDraw(paramCanvas);
    if (isPressed()) {
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
    }
    GMTrace.o(8737574092800L, 65100);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\MaskImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */