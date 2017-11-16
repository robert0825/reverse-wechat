package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.support.a.a;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.j;
import com.tencent.mm.ui.widget.picker.YADatePicker;
import com.tencent.mm.ui.widget.picker.YADatePicker.c;
import com.tencent.mm.ui.widget.picker.YADatePicker.d;
import com.tencent.mm.ui.widget.picker.b;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class c
  extends YADatePicker
  implements i<String>
{
  private Date iRA;
  private final Calendar iRB;
  private final String[] iRC;
  public boolean iRt;
  public boolean iRu;
  public boolean iRv;
  public NumberPicker iRw;
  public NumberPicker iRx;
  public NumberPicker iRy;
  private Date iRz;
  
  @a
  public c(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, o.j.hHa));
    GMTrace.i(10125653835776L, 75442);
    this.iRt = true;
    this.iRu = true;
    this.iRv = true;
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
    paramContext = getResources().getDrawable(o.e.hAu);
    b.a(this.iRw, paramContext);
    b.a(this.iRx, paramContext);
    b.a(this.iRy, paramContext);
    b.c(this.iRw);
    b.c(this.iRx);
    b.c(this.iRy);
    j.a(this.iRw);
    j.a(this.iRx);
    j.a(this.iRy);
    paramContext = new NumberPicker.OnValueChangeListener()
    {
      public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(10130083020800L, 75475);
        c.a(c.this);
        GMTrace.o(10130083020800L, 75475);
      }
    };
    if (this.iRw != null)
    {
      this.iRw.setOnValueChangedListener(paramContext);
      this.iRw.setMinValue(1900);
    }
    if (this.iRx != null) {
      this.iRx.setOnValueChangedListener(paramContext);
    }
    if (this.iRy != null) {
      this.iRy.setOnValueChangedListener(paramContext);
    }
    adG();
    b.e(this.iRw);
    b.e(this.iRx);
    b.e(this.iRy);
    GMTrace.o(10125653835776L, 75442);
  }
  
  private void adG()
  {
    int j = 0;
    GMTrace.i(10125788053504L, 75443);
    if ((this.iRw == null) || (this.iRx == null) || (this.iRy == null))
    {
      GMTrace.o(10125788053504L, 75443);
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
      GMTrace.o(10125788053504L, 75443);
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
    GMTrace.i(18247302774784L, 135953);
    super.a(paramInt1, Math.max(paramInt2 - 1, 0), paramInt3, paramd);
    adG();
    GMTrace.o(18247302774784L, 135953);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17649765449728L, 131501);
    adG();
    GMTrace.o(17649765449728L, 131501);
  }
  
  public final void adH()
  {
    GMTrace.i(17649899667456L, 131502);
    GMTrace.o(17649899667456L, 131502);
  }
  
  public final void adI()
  {
    GMTrace.i(17650168102912L, 131504);
    GMTrace.o(17650168102912L, 131504);
  }
  
  public final void b(g paramg)
  {
    GMTrace.i(17650033885184L, 131503);
    GMTrace.o(17650033885184L, 131503);
  }
  
  public final int getDayOfMonth()
  {
    GMTrace.i(10127130230784L, 75453);
    if (this.iRy != null)
    {
      i = this.iRy.getValue();
      GMTrace.o(10127130230784L, 75453);
      return i;
    }
    int i = super.getDayOfMonth();
    GMTrace.o(10127130230784L, 75453);
    return i;
  }
  
  public final int getMonth()
  {
    GMTrace.i(10126996013056L, 75452);
    if (this.iRx != null) {}
    for (int i = this.iRx.getValue() + 1;; i = super.getMonth() + 1)
    {
      i = Math.max(Math.min(i, 12), 0);
      GMTrace.o(10126996013056L, 75452);
      return i;
    }
  }
  
  public final View getView()
  {
    GMTrace.i(10126459142144L, 75448);
    GMTrace.o(10126459142144L, 75448);
    return this;
  }
  
  public final int getYear()
  {
    GMTrace.i(10126861795328L, 75451);
    if (this.iRw != null)
    {
      i = this.iRw.getValue();
      GMTrace.o(10126861795328L, 75451);
      return i;
    }
    int i = super.getYear();
    GMTrace.o(10126861795328L, 75451);
    return i;
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(10126190706688L, 75446);
    super.onAttachedToWindow();
    b.d(this.iRw);
    b.d(this.iRx);
    b.d(this.iRy);
    GMTrace.o(10126190706688L, 75446);
  }
  
  public final void setMaxDate(long paramLong)
  {
    GMTrace.i(10125922271232L, 75444);
    super.setMaxDate(paramLong);
    this.iRA = new Date(paramLong);
    if (this.iRw != null) {
      this.iRw.setMaxValue(this.iRA.getYear() + 1900);
    }
    GMTrace.o(10125922271232L, 75444);
  }
  
  public final void setMinDate(long paramLong)
  {
    GMTrace.i(10126056488960L, 75445);
    super.setMinDate(paramLong);
    this.iRz = new Date(paramLong);
    if (this.iRw != null) {
      this.iRw.setMinValue(this.iRz.getYear() + 1900);
    }
    GMTrace.o(10126056488960L, 75445);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */