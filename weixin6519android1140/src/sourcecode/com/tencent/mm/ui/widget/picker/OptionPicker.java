package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.bx.a.d;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;

public class OptionPicker
  extends NumberPicker
{
  private int JE;
  String[] iRL;
  private int iRM;
  private int ia;
  private Context mContext;
  
  public OptionPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18768604430336L, 139837);
    this.mContext = paramContext;
    init();
    GMTrace.o(18768604430336L, 139837);
  }
  
  public OptionPicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18768738648064L, 139838);
    this.mContext = paramContext;
    init();
    GMTrace.o(18768738648064L, 139838);
  }
  
  private static boolean b(NumberPicker paramNumberPicker, Drawable paramDrawable)
  {
    GMTrace.i(18949798363136L, 141187);
    Field[] arrayOfField = NumberPicker.class.getDeclaredFields();
    int j = arrayOfField.length;
    int i = 0;
    while (i < j)
    {
      Field localField = arrayOfField[i];
      if (localField.getName().equals("mSelectionDivider"))
      {
        localField.setAccessible(true);
        try
        {
          localField.set(paramNumberPicker, paramDrawable);
          GMTrace.o(18949798363136L, 141187);
          return true;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          w.printErrStackTrace("MicroMsg.MMoptionPicker", localIllegalAccessException, "", new Object[0]);
        }
      }
      i += 1;
    }
    GMTrace.o(18949798363136L, 141187);
    return false;
  }
  
  private void init()
  {
    GMTrace.i(18768872865792L, 139839);
    this.JE = a.fromDPToPix(this.mContext, 120);
    this.iRM = a.fromDPToPix(this.mContext, 20);
    b(this, getResources().getDrawable(a.d.xvd));
    setDescendantFocusability(393216);
    GMTrace.o(18768872865792L, 139839);
  }
  
  public final void i(String[] paramArrayOfString)
  {
    GMTrace.i(18915572842496L, 140932);
    if (paramArrayOfString == null)
    {
      GMTrace.o(18915572842496L, 140932);
      return;
    }
    this.iRL = paramArrayOfString;
    setDisplayedValues(null);
    setMinValue(0);
    setMaxValue(Math.max(paramArrayOfString.length - 1, 0));
    setWrapSelectorWheel(false);
    String[] arrayOfString = paramArrayOfString;
    if (paramArrayOfString.length <= 0) {
      arrayOfString = null;
    }
    super.setDisplayedValues(arrayOfString);
    GMTrace.o(18915572842496L, 140932);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(18769409736704L, 139843);
    super.onAttachedToWindow();
    GMTrace.o(18769409736704L, 139843);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(18769275518976L, 139842);
    if ((View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE) || (View.MeasureSpec.getMode(paramInt1) == 1073741824)) {
      this.ia = View.MeasureSpec.getSize(paramInt1);
    }
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), paramInt2);
    if ((getMeasuredWidth() <= this.JE) && ((this.ia <= 0) || (this.JE <= this.ia)))
    {
      setMeasuredDimension(this.JE, getMeasuredHeight());
      GMTrace.o(18769275518976L, 139842);
      return;
    }
    paramInt2 = getMeasuredWidth() + this.iRM * 2;
    paramInt1 = paramInt2;
    if (this.ia > 0) {
      if (this.ia <= paramInt2) {
        break label143;
      }
    }
    label143:
    for (paramInt1 = paramInt2;; paramInt1 = this.ia)
    {
      setMeasuredDimension(paramInt1, getMeasuredHeight());
      GMTrace.o(18769275518976L, 139842);
      return;
    }
  }
  
  @Deprecated
  public void setDisplayedValues(String[] paramArrayOfString)
  {
    GMTrace.i(18769141301248L, 139841);
    super.setDisplayedValues(paramArrayOfString);
    GMTrace.o(18769141301248L, 139841);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\widget\picker\OptionPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */