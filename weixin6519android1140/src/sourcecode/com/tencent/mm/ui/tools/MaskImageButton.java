package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;

public class MaskImageButton
  extends ImageButton
{
  private int a;
  private int b;
  private int g;
  private ae pOE;
  private Runnable pOF;
  private int r;
  public Object xih;
  
  public MaskImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(2063731785728L, 15376);
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.pOE = new ae(Looper.getMainLooper());
    this.pOF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(1964276449280L, 14635);
        MaskImageButton.this.setPressed(false);
        MaskImageButton.this.invalidate();
        GMTrace.o(1964276449280L, 14635);
      }
    };
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1958639304704L, 14593);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        while ((!MaskImageButton.this.isClickable()) && (!MaskImageButton.this.isLongClickable()))
        {
          GMTrace.o(1958639304704L, 14593);
          return true;
          paramAnonymousView.setPressed(true);
          paramAnonymousView.invalidate();
          MaskImageButton.b(MaskImageButton.this).removeCallbacks(MaskImageButton.a(MaskImageButton.this));
          continue;
          MaskImageButton.b(MaskImageButton.this).post(MaskImageButton.a(MaskImageButton.this));
        }
        GMTrace.o(1958639304704L, 14593);
        return false;
      }
    });
    GMTrace.o(2063731785728L, 15376);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(2063866003456L, 15377);
    super.onDraw(paramCanvas);
    if (isPressed()) {
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
    }
    GMTrace.o(2063866003456L, 15377);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\tools\MaskImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */