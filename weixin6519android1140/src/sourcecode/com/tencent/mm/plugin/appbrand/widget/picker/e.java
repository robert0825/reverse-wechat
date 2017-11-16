package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.NumberPicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.j;
import com.tencent.mm.ui.widget.picker.b;

public class e
  extends NumberPicker
  implements i<String>
{
  private int JE;
  private String[] iRL;
  private int iRM;
  private int ia;
  
  @android.support.a.a
  public e(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, o.j.hHa));
    GMTrace.i(10113842675712L, 75354);
    b.a(this, getResources().getDrawable(o.e.hAu));
    b.c(this);
    b.e(this);
    j.a(this);
    this.JE = com.tencent.mm.br.a.fromDPToPix(paramContext, 100);
    this.iRM = com.tencent.mm.br.a.fromDPToPix(paramContext, 20);
    GMTrace.o(10113842675712L, 75354);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17649228578816L, 131497);
    GMTrace.o(17649228578816L, 131497);
  }
  
  public final void adH()
  {
    GMTrace.i(17649362796544L, 131498);
    GMTrace.o(17649362796544L, 131498);
  }
  
  public final void adI()
  {
    GMTrace.i(17649631232000L, 131500);
    GMTrace.o(17649631232000L, 131500);
  }
  
  public final String adL()
  {
    GMTrace.i(10114245328896L, 75357);
    if ((this.iRL == null) || (this.iRL.length <= 0))
    {
      GMTrace.o(10114245328896L, 75357);
      return "";
    }
    String str = this.iRL[getValue()];
    GMTrace.o(10114245328896L, 75357);
    return str;
  }
  
  public final void b(g paramg)
  {
    GMTrace.i(17649497014272L, 131499);
    GMTrace.o(17649497014272L, 131499);
  }
  
  public final View getView()
  {
    GMTrace.i(10114379546624L, 75358);
    GMTrace.o(10114379546624L, 75358);
    return this;
  }
  
  public final void i(String[] paramArrayOfString)
  {
    GMTrace.i(17285766971392L, 128789);
    if (paramArrayOfString == null)
    {
      GMTrace.o(17285766971392L, 128789);
      return;
    }
    this.iRL = paramArrayOfString;
    setDisplayedValues(null);
    setMinValue(0);
    setMaxValue(Math.max(paramArrayOfString.length - 1, 0));
    String[] arrayOfString = paramArrayOfString;
    if (paramArrayOfString.length <= 0) {
      arrayOfString = null;
    }
    super.setDisplayedValues(arrayOfString);
    GMTrace.o(17285766971392L, 128789);
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(10114111111168L, 75356);
    super.onAttachedToWindow();
    b.d(this);
    GMTrace.o(10114111111168L, 75356);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(10113976893440L, 75355);
    if ((View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE) || (View.MeasureSpec.getMode(paramInt1) == 1073741824)) {
      this.ia = View.MeasureSpec.getSize(paramInt1);
    }
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), paramInt2);
    if ((getMeasuredWidth() <= this.JE) && ((this.ia <= 0) || (this.JE <= this.ia)))
    {
      setMeasuredDimension(this.JE, getMeasuredHeight());
      GMTrace.o(10113976893440L, 75355);
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
      GMTrace.o(10113976893440L, 75355);
      return;
    }
  }
  
  @Deprecated
  public void setDisplayedValues(String[] paramArrayOfString)
  {
    GMTrace.i(17285901189120L, 128790);
    super.setDisplayedValues(paramArrayOfString);
    GMTrace.o(17285901189120L, 128790);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */