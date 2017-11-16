package com.tencent.mm.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;

public class MMSpinnerDatePicker
  extends DatePicker
  implements DatePicker.OnDateChangedListener
{
  public NumberPicker xri;
  public NumberPicker xrj;
  public NumberPicker xrk;
  public int xrl;
  
  public MMSpinnerDatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1640543289344L, 12223);
    this.xrl = 0;
    init();
    GMTrace.o(1640543289344L, 12223);
  }
  
  public MMSpinnerDatePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1640677507072L, 12224);
    this.xrl = 0;
    init();
    GMTrace.o(1640677507072L, 12224);
  }
  
  private void init()
  {
    GMTrace.i(1640811724800L, 12225);
    setCalendarViewShown(false);
    Object localObject = Resources.getSystem();
    int i = ((Resources)localObject).getIdentifier("year", "id", "android");
    int j = ((Resources)localObject).getIdentifier("month", "id", "android");
    int k = ((Resources)localObject).getIdentifier("day", "id", "android");
    this.xri = ((NumberPicker)findViewById(i));
    this.xrj = ((NumberPicker)findViewById(j));
    this.xrk = ((NumberPicker)findViewById(k));
    localObject = getChildAt(0);
    ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
    localLayoutParams.width = -1;
    ((View)localObject).setLayoutParams(localLayoutParams);
    localObject = (LinearLayout.LayoutParams)this.xri.getLayoutParams();
    ((LinearLayout.LayoutParams)localObject).topMargin = 0;
    ((LinearLayout.LayoutParams)localObject).bottomMargin = 0;
    ((LinearLayout.LayoutParams)localObject).leftMargin = 0;
    ((LinearLayout.LayoutParams)localObject).rightMargin = 0;
    ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
    this.xri.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.xrj.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.xrk.setLayoutParams((ViewGroup.LayoutParams)localObject);
    setDescendantFocusability(393216);
    Ek(2);
    GMTrace.o(1640811724800L, 12225);
  }
  
  public final void Ek(int paramInt)
  {
    GMTrace.i(1640945942528L, 12226);
    this.xrl = paramInt;
    if (this.xrl == 0)
    {
      this.xri.setVisibility(0);
      this.xrj.setVisibility(0);
      this.xrk.setVisibility(0);
      GMTrace.o(1640945942528L, 12226);
      return;
    }
    if (this.xrl == 1)
    {
      this.xri.setVisibility(0);
      this.xrj.setVisibility(0);
      this.xrk.setVisibility(8);
      GMTrace.o(1640945942528L, 12226);
      return;
    }
    this.xri.setVisibility(0);
    this.xrj.setVisibility(8);
    this.xrk.setVisibility(8);
    GMTrace.o(1640945942528L, 12226);
  }
  
  public final boolean El(int paramInt)
  {
    GMTrace.i(1641214377984L, 12228);
    try
    {
      Field localField = NumberPicker.class.getDeclaredField("mSelectionDivider");
      localField.setAccessible(true);
      ColorDrawable localColorDrawable = new ColorDrawable();
      localColorDrawable.setColor(getResources().getColor(paramInt));
      localField.set(this.xri, localColorDrawable);
      localField.set(this.xrj, localColorDrawable);
      localField.set(this.xrk, localColorDrawable);
      invalidate();
      GMTrace.o(1641214377984L, 12228);
      return true;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      w.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", localIllegalAccessException, "", new Object[0]);
      GMTrace.o(1641214377984L, 12228);
      return false;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", localNoSuchFieldException, "", new Object[0]);
      }
    }
  }
  
  public final void a(NumberPicker paramNumberPicker, int paramInt)
  {
    GMTrace.i(1641348595712L, 12229);
    if (paramNumberPicker == null)
    {
      GMTrace.o(1641348595712L, 12229);
      return;
    }
    Object localObject = (EditText)paramNumberPicker.findViewById(Resources.getSystem().getIdentifier("numberpicker_input", "id", "android"));
    ((EditText)localObject).setTextSize(0, getResources().getDimension(paramInt));
    paramInt = (int)((EditText)localObject).getTextSize();
    try
    {
      localObject = NumberPicker.class.getDeclaredField("mTextSize");
      ((Field)localObject).setAccessible(true);
      ((Field)localObject).set(paramNumberPicker, Integer.valueOf(paramInt));
      localObject = NumberPicker.class.getDeclaredField("mSelectorWheelPaint");
      ((Field)localObject).setAccessible(true);
      Paint localPaint = (Paint)((Field)localObject).get(paramNumberPicker);
      localPaint.setTextSize(paramInt);
      ((Field)localObject).set(paramNumberPicker, localPaint);
      GMTrace.o(1641348595712L, 12229);
      return;
    }
    catch (NoSuchFieldException paramNumberPicker)
    {
      w.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", paramNumberPicker, "", new Object[0]);
      GMTrace.o(1641348595712L, 12229);
      return;
    }
    catch (IllegalAccessException paramNumberPicker)
    {
      w.printErrStackTrace("MicroMsg.MMSpinnerDatePicker", paramNumberPicker, "", new Object[0]);
      GMTrace.o(1641348595712L, 12229);
    }
  }
  
  public void onDateChanged(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(1641080160256L, 12227);
    GMTrace.o(1641080160256L, 12227);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\widget\MMSpinnerDatePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */