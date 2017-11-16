package com.tencent.mm.plugin.voip.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.tencent.gmtrace.GMTrace;

public class MMCheckBox
  extends CheckBox
{
  private Drawable qKW;
  private int qKX;
  
  public MMCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5341999792128L, 39801);
    GMTrace.o(5341999792128L, 39801);
  }
  
  public MMCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5341865574400L, 39800);
    GMTrace.o(5341865574400L, 39800);
  }
  
  protected void drawableStateChanged()
  {
    GMTrace.i(5342402445312L, 39804);
    super.drawableStateChanged();
    if (this.qKW != null)
    {
      int[] arrayOfInt = getDrawableState();
      this.qKW.setState(arrayOfInt);
      invalidate();
    }
    GMTrace.o(5342402445312L, 39804);
  }
  
  @TargetApi(11)
  public void jumpDrawablesToCurrentState()
  {
    GMTrace.i(5342670880768L, 39806);
    super.jumpDrawablesToCurrentState();
    if ((Build.VERSION.SDK_INT >= 11) && (this.qKW != null)) {
      this.qKW.jumpToCurrentState();
    }
    GMTrace.o(5342670880768L, 39806);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int j = 0;
    GMTrace.i(5342805098496L, 39807);
    super.onDraw(paramCanvas);
    Drawable localDrawable = this.qKW;
    int i;
    int k;
    int m;
    if (localDrawable != null)
    {
      i = getGravity();
      int n = getGravity();
      k = localDrawable.getIntrinsicHeight();
      m = localDrawable.getIntrinsicWidth();
      switch (i & 0x70)
      {
      default: 
        i = 0;
        switch (n & 0x7)
        {
        }
        break;
      }
    }
    for (;;)
    {
      localDrawable.setBounds(j, i, j + m, k + i);
      localDrawable.draw(paramCanvas);
      GMTrace.o(5342805098496L, 39807);
      return;
      i = getHeight() - k;
      break;
      i = (getHeight() - k) / 2;
      break;
      j = getWidth() - m;
      continue;
      j = (getWidth() - m) / 2;
    }
  }
  
  public void setButtonDrawable(int paramInt)
  {
    GMTrace.i(5342134009856L, 39802);
    if ((paramInt != 0) && (paramInt == this.qKX))
    {
      GMTrace.o(5342134009856L, 39802);
      return;
    }
    this.qKX = paramInt;
    Drawable localDrawable = null;
    if (this.qKX != 0) {
      localDrawable = getResources().getDrawable(this.qKX);
    }
    setButtonDrawable(localDrawable);
    GMTrace.o(5342134009856L, 39802);
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    GMTrace.i(5342268227584L, 39803);
    this.qKW = paramDrawable;
    GMTrace.o(5342268227584L, 39803);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    GMTrace.i(5342536663040L, 39805);
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.qKW))
    {
      GMTrace.o(5342536663040L, 39805);
      return true;
    }
    GMTrace.o(5342536663040L, 39805);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\ui\MMCheckBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */