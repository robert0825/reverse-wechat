package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.a.a;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.TimePicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.j;
import com.tencent.mm.ui.widget.picker.b;

public final class h
  extends TimePicker
  implements i<String>
{
  public NumberPicker iRX;
  private NumberPicker iRY;
  public int ijZ;
  public int ika;
  public int ikb;
  public int ikc;
  
  @a
  public h(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, o.j.hHa));
    GMTrace.i(10108876619776L, 75317);
    this.ijZ = -1;
    this.ika = -1;
    this.ikb = -1;
    this.ikc = -1;
    setIs24HourView(Boolean.valueOf(true));
    this.iRX = sY("mHourSpinner");
    this.iRY = sY("mMinuteSpinner");
    b.c(this.iRX);
    b.c(this.iRY);
    j.a(this.iRX);
    j.a(this.iRY);
    paramContext = getResources().getDrawable(o.e.hAu);
    b.a(this.iRX, paramContext);
    b.a(this.iRY, paramContext);
    if (this.iRX != null) {
      this.iRX.setOnValueChangedListener(new NumberPicker.OnValueChangeListener()
      {
        public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(10130351456256L, 75477);
          h.a(h.this);
          GMTrace.o(10130351456256L, 75477);
        }
      });
    }
    if ((this.iRY != null) && (Build.VERSION.SDK_INT >= 21)) {
      this.iRY.setOnValueChangedListener(new NumberPicker.OnValueChangeListener()
      {
        public final void onValueChange(NumberPicker paramAnonymousNumberPicker, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(10125116964864L, 75438);
          GMTrace.o(10125116964864L, 75438);
        }
      });
    }
    b.e(this.iRX);
    b.e(this.iRY);
    GMTrace.o(10108876619776L, 75317);
  }
  
  private NumberPicker sY(String paramString)
  {
    GMTrace.i(10109413490688L, 75321);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramString = ta(paramString);
      GMTrace.o(10109413490688L, 75321);
      return paramString;
    }
    paramString = sZ(paramString);
    GMTrace.o(10109413490688L, 75321);
    return paramString;
  }
  
  private NumberPicker sZ(String paramString)
  {
    GMTrace.i(10109547708416L, 75322);
    try
    {
      paramString = (NumberPicker)new c(this, paramString, null).get();
      GMTrace.o(10109547708416L, 75322);
      return paramString;
    }
    catch (Exception paramString)
    {
      GMTrace.o(10109547708416L, 75322);
    }
    return null;
  }
  
  private NumberPicker ta(String paramString)
  {
    GMTrace.i(10109681926144L, 75323);
    try
    {
      Object localObject = new c(this, "mDelegate", null).get();
      if (localObject != null)
      {
        paramString = (NumberPicker)new c(localObject, paramString, null).get();
        GMTrace.o(10109681926144L, 75323);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(10109681926144L, 75323);
    }
    return null;
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17641041297408L, 131436);
    GMTrace.o(17641041297408L, 131436);
  }
  
  public final void adH()
  {
    GMTrace.i(17641175515136L, 131437);
    GMTrace.o(17641175515136L, 131437);
  }
  
  public final void adI()
  {
    GMTrace.i(17641443950592L, 131439);
    GMTrace.o(17641443950592L, 131439);
  }
  
  public final void adN()
  {
    GMTrace.i(10109010837504L, 75318);
    if ((k.kp(this.ijZ)) && (k.ko(this.ika)) && (this.iRX != null) && (this.iRY != null))
    {
      if (this.iRX.getValue() != this.ijZ) {
        break label125;
      }
      this.iRY.setMinValue(this.ika);
    }
    while ((k.kp(this.ikb)) && (this.iRX != null) && (this.iRY != null)) {
      if (this.iRX.getValue() == this.ikb)
      {
        this.iRY.setMaxValue(this.ikc);
        GMTrace.o(10109010837504L, 75318);
        return;
        label125:
        this.iRY.setMinValue(0);
      }
      else
      {
        this.iRY.setMaxValue(59);
      }
    }
    GMTrace.o(10109010837504L, 75318);
  }
  
  public final void b(g paramg)
  {
    GMTrace.i(17641309732864L, 131438);
    GMTrace.o(17641309732864L, 131438);
  }
  
  public final View getView()
  {
    GMTrace.i(10110084579328L, 75326);
    GMTrace.o(10110084579328L, 75326);
    return this;
  }
  
  protected final void onAttachedToWindow()
  {
    GMTrace.i(10109816143872L, 75324);
    super.onAttachedToWindow();
    b.d(this.iRX);
    b.d(this.iRY);
    GMTrace.o(10109816143872L, 75324);
  }
  
  public final void setCurrentHour(Integer paramInteger)
  {
    GMTrace.i(10109279272960L, 75320);
    if (paramInteger == null) {}
    for (int i = 0;; i = paramInteger.intValue())
    {
      super.setCurrentHour(Integer.valueOf(i));
      adN();
      GMTrace.o(10109279272960L, 75320);
      return;
    }
  }
  
  public final void setCurrentMinute(Integer paramInteger)
  {
    GMTrace.i(10109145055232L, 75319);
    if (paramInteger == null) {}
    for (int i = 0;; i = paramInteger.intValue())
    {
      super.setCurrentMinute(Integer.valueOf(i));
      adN();
      GMTrace.o(10109145055232L, 75319);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */