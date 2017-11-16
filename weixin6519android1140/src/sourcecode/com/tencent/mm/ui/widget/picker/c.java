package com.tencent.mm.ui.widget.picker;

import android.widget.NumberPicker.Formatter;
import com.tencent.gmtrace.GMTrace;
import java.util.Formatter;
import java.util.Locale;

final class c
  implements NumberPicker.Formatter
{
  final StringBuilder mBuilder;
  char xut;
  Formatter xuu;
  final Object[] xuv;
  
  c()
  {
    GMTrace.i(18771423002624L, 139858);
    this.mBuilder = new StringBuilder();
    this.xuv = new Object[1];
    d(Locale.getDefault());
    GMTrace.o(18771423002624L, 139858);
  }
  
  private void d(Locale paramLocale)
  {
    GMTrace.i(18771557220352L, 139859);
    this.xuu = new Formatter(this.mBuilder, paramLocale);
    this.xut = '0';
    GMTrace.o(18771557220352L, 139859);
  }
  
  public final String format(int paramInt)
  {
    GMTrace.i(18771691438080L, 139860);
    Object localObject = Locale.getDefault();
    if (this.xut != '0') {
      d((Locale)localObject);
    }
    this.xuv[0] = Integer.valueOf(paramInt);
    this.mBuilder.delete(0, this.mBuilder.length());
    this.xuu.format("%02d", this.xuv);
    localObject = this.xuu.toString();
    GMTrace.o(18771691438080L, 139860);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ui\widget\picker\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */