package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class MaskLinearLayout
  extends LinearLayout
{
  boolean eDU;
  private List<MaskImageView> ePZ;
  private ae pOE;
  private Runnable pOF;
  
  public MaskLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8360824930304L, 62293);
    this.eDU = false;
    this.ePZ = new LinkedList();
    this.pOE = new ae();
    this.pOF = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8425249439744L, 62773);
        MaskLinearLayout.this.setPressed(false);
        MaskLinearLayout.a(MaskLinearLayout.this);
        MaskLinearLayout.this.invalidate();
        GMTrace.o(8425249439744L, 62773);
      }
    };
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(8658251415552L, 64509);
        w.e("test", "touch: " + paramAnonymousMotionEvent.getAction());
        if (!MaskLinearLayout.b(MaskLinearLayout.this))
        {
          GMTrace.o(8658251415552L, 64509);
          return false;
        }
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        while (MaskLinearLayout.e(MaskLinearLayout.this) != null)
        {
          paramAnonymousView = MaskLinearLayout.e(MaskLinearLayout.this).iterator();
          while (paramAnonymousView.hasNext())
          {
            MaskImageView localMaskImageView = (MaskImageView)paramAnonymousView.next();
            localMaskImageView.d(localMaskImageView, paramAnonymousMotionEvent);
          }
          paramAnonymousView.setPressed(true);
          MaskLinearLayout.a(MaskLinearLayout.this);
          paramAnonymousView.invalidate();
          MaskLinearLayout.d(MaskLinearLayout.this).removeCallbacks(MaskLinearLayout.c(MaskLinearLayout.this));
          continue;
          MaskLinearLayout.d(MaskLinearLayout.this).post(MaskLinearLayout.c(MaskLinearLayout.this));
        }
        GMTrace.o(8658251415552L, 64509);
        return false;
      }
    });
    GMTrace.o(8360824930304L, 62293);
  }
  
  public final void b(MaskImageView paramMaskImageView)
  {
    GMTrace.i(8360959148032L, 62294);
    this.ePZ.add(paramMaskImageView);
    GMTrace.o(8360959148032L, 62294);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(8361093365760L, 62295);
    super.onDraw(paramCanvas);
    GMTrace.o(8361093365760L, 62295);
  }
  
  @Deprecated
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    GMTrace.i(8361227583488L, 62296);
    Assert.assertTrue(false);
    GMTrace.o(8361227583488L, 62296);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\MaskLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */