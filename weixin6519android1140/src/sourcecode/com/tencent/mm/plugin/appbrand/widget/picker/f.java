package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;

public class f
  extends YANumberPicker
  implements i<String>
{
  private String[] iRL;
  private int iRN;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17652449804288L, 131521);
    setDividerHeight(a.fromDPToPix(paramContext, 2));
    int i = Color.parseColor("#1AAD19");
    if (this.iSn != i)
    {
      this.iSn = i;
      this.iST.setColor(this.iSn);
      postInvalidate();
    }
    i = a.fromDPToPix(paramContext, 8);
    if (this.iSl != i)
    {
      this.iSl = i;
      postInvalidate();
    }
    i = Color.parseColor("#A5A5A5");
    if (this.iSb != i)
    {
      this.iSb = i;
      postInvalidate();
    }
    if (this.iSc != -16777216)
    {
      this.iSc = -16777216;
      postInvalidate();
    }
    GMTrace.o(17652449804288L, 131521);
  }
  
  public final void a(g paramg)
  {
    GMTrace.i(17652986675200L, 131525);
    GMTrace.o(17652986675200L, 131525);
  }
  
  public final void adH()
  {
    GMTrace.i(17653120892928L, 131526);
    adU();
    GMTrace.o(17653120892928L, 131526);
  }
  
  public final void adI()
  {
    GMTrace.i(17653389328384L, 131528);
    GMTrace.o(17653389328384L, 131528);
  }
  
  public final void b(g paramg)
  {
    GMTrace.i(17653255110656L, 131527);
    GMTrace.o(17653255110656L, 131527);
  }
  
  public final View getView()
  {
    GMTrace.i(17652852457472L, 131524);
    GMTrace.o(17652852457472L, 131524);
    return this;
  }
  
  public final void i(String[] paramArrayOfString)
  {
    GMTrace.i(17652584022016L, 131522);
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      setEnabled(false);
      setVisibility(4);
      GMTrace.o(17652584022016L, 131522);
      return;
    }
    setEnabled(true);
    setVisibility(0);
    this.iRL = paramArrayOfString;
    int i = this.iSv;
    int j = this.iSw;
    int k = paramArrayOfString.length - 1;
    if (k - i + 1 > j - i + 1)
    {
      setDisplayedValues(paramArrayOfString);
      setMaxValue(k);
      GMTrace.o(17652584022016L, 131522);
      return;
    }
    setMaxValue(k);
    setDisplayedValues(paramArrayOfString);
    GMTrace.o(17652584022016L, 131522);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(17652718239744L, 131523);
    if (this.iRN > 0) {
      paramInt1 = View.MeasureSpec.makeMeasureSpec(this.iRN, 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(17652718239744L, 131523);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */