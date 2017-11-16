package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bx.a.d;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CustomDatePicker
  extends YADatePicker
{
  private Date iRA;
  private Calendar iRB;
  private String[] iRC;
  private boolean iRt;
  private boolean iRu;
  private boolean iRv;
  private NumberPicker iRw;
  private NumberPicker iRx;
  private NumberPicker iRy;
  private Date iRz;
  
  public CustomDatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(18769543954432L, 139844);
    this.iRt = true;
    this.iRu = true;
    this.iRv = true;
    MP();
    GMTrace.o(18769543954432L, 139844);
  }
  
  public CustomDatePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(18769678172160L, 139845);
    this.iRt = true;
    this.iRu = true;
    this.iRv = true;
    MP();
    GMTrace.o(18769678172160L, 139845);
  }
  
  private void MP()
  {
    GMTrace.i(18769812389888L, 139846);
    this.iRC = new String[12];
    int i = 0;
    while (i < this.iRC.length)
    {
      this.iRC[i] = (i + 1);
      i += 1;
    }
    this.iRB = Calendar.getInstance(Locale.US);
    cjL();
    cjM();
    this.iRw = ((YADatePicker.c)getUIDelegate()).xuD;
    this.iRx = ((YADatePicker.c)getUIDelegate()).xuC;
    this.iRy = ((YADatePicker.c)getUIDelegate()).xuB;
    Object localObject = getResources().getDrawable(a.d.xvd);
    b.a(this.iRw, (Drawable)localObject);
    b.a(this.iRx, (Drawable)localObject);
    b.a(this.iRy, (Drawable)localObject);
    b.c(this.iRw);
    b.c(this.iRx);
    b.c(this.iRy);
    localObject = new NumberPicker.OnValueChangeListener()
    {
      public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(18771959873536L, 139862);
        CustomDatePicker.a(CustomDatePicker.this);
        GMTrace.o(18771959873536L, 139862);
      }
    };
    if (this.iRw != null)
    {
      this.iRw.setOnValueChangedListener((NumberPicker.OnValueChangeListener)localObject);
      this.iRw.setMinValue(1900);
    }
    if (this.iRx != null) {
      this.iRx.setOnValueChangedListener((NumberPicker.OnValueChangeListener)localObject);
    }
    if (this.iRy != null) {
      this.iRy.setOnValueChangedListener((NumberPicker.OnValueChangeListener)localObject);
    }
    adG();
    b.e(this.iRw);
    b.e(this.iRx);
    b.e(this.iRy);
    GMTrace.o(18769812389888L, 139846);
  }
  
  private void adG()
  {
    int j = 0;
    GMTrace.i(18769946607616L, 139847);
    if ((this.iRw == null) || (this.iRx == null) || (this.iRy == null))
    {
      GMTrace.o(18769946607616L, 139847);
      return;
    }
    this.iRx.setDisplayedValues(null);
    if ((this.iRw.getValue() == this.iRw.getMaxValue()) && (this.iRA != null))
    {
      this.iRx.setMaxValue(this.iRA.getMonth());
      if ((this.iRx.getValue() != this.iRx.getMaxValue()) || (this.iRA == null)) {
        break label342;
      }
      this.iRy.setMaxValue(this.iRA.getDate());
      i = 1;
      if (i == 0)
      {
        i = this.iRw.getValue();
        int k = this.iRx.getValue();
        this.iRB.set(i, k, 1);
        i = this.iRB.getActualMaximum(5);
        this.iRy.setMaxValue(i);
      }
      if ((this.iRw.getValue() != this.iRw.getMinValue()) || (this.iRz == null)) {
        break label347;
      }
      this.iRx.setMinValue(this.iRz.getMonth());
      i = j;
      if (this.iRx.getValue() == this.iRx.getMinValue())
      {
        i = j;
        if (this.iRz != null) {
          this.iRy.setMinValue(this.iRz.getDate());
        }
      }
    }
    for (int i = 1;; i = j)
    {
      if (i == 0) {
        this.iRy.setMinValue(1);
      }
      this.iRx.setDisplayedValues((String[])Arrays.copyOfRange(this.iRC, this.iRx.getMinValue(), this.iRx.getMaxValue() + 1));
      this.iRw.setWrapSelectorWheel(true);
      this.iRx.setWrapSelectorWheel(true);
      this.iRy.setWrapSelectorWheel(true);
      GMTrace.o(18769946607616L, 139847);
      return;
      this.iRx.setMaxValue(11);
      label342:
      i = 0;
      break;
      label347:
      this.iRx.setMinValue(0);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
  {
    GMTrace.i(18770349260800L, 139850);
    super.a(paramInt1, Math.max(paramInt2 - 1, 0), paramInt3, paramd);
    adG();
    GMTrace.o(18770349260800L, 139850);
  }
  
  public final int getDayOfMonth()
  {
    GMTrace.i(18770751913984L, 139853);
    if (this.iRy != null)
    {
      i = this.iRy.getValue();
      GMTrace.o(18770751913984L, 139853);
      return i;
    }
    int i = super.getDayOfMonth();
    GMTrace.o(18770751913984L, 139853);
    return i;
  }
  
  public final int getMonth()
  {
    GMTrace.i(18770617696256L, 139852);
    if (this.iRx != null) {}
    for (int i = this.iRx.getValue() + 1;; i = super.getMonth() + 1)
    {
      i = Math.max(Math.min(i, 12), 0);
      GMTrace.o(18770617696256L, 139852);
      return i;
    }
  }
  
  public final int getYear()
  {
    GMTrace.i(18770483478528L, 139851);
    if (this.iRw != null)
    {
      i = this.iRw.getValue();
      GMTrace.o(18770483478528L, 139851);
      return i;
    }
    int i = super.getYear();
    GMTrace.o(18770483478528L, 139851);
    return i;
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(18770886131712L, 139854);
    super.onAttachedToWindow();
    b.d(this.iRw);
    b.d(this.iRx);
    b.d(this.iRy);
    GMTrace.o(18770886131712L, 139854);
  }
  
  public final void setMaxDate(long paramLong)
  {
    GMTrace.i(18770080825344L, 139848);
    super.setMaxDate(paramLong);
    this.iRA = new Date(paramLong);
    if (this.iRw != null) {
      this.iRw.setMaxValue(this.iRA.getYear() + 1900);
    }
    adG();
    GMTrace.o(18770080825344L, 139848);
  }
  
  public final void setMinDate(long paramLong)
  {
    GMTrace.i(18770215043072L, 139849);
    super.setMinDate(paramLong);
    this.iRz = new Date(paramLong);
    if (this.iRw != null) {
      this.iRw.setMinValue(this.iRz.getYear() + 1900);
    }
    GMTrace.o(18770215043072L, 139849);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\widget\picker\CustomDatePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */