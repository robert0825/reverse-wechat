package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import com.tencent.gmtrace.GMTrace;

final class k
  extends PasswordTransformationMethod
{
  k()
  {
    GMTrace.i(18255490056192L, 136014);
    GMTrace.o(18255490056192L, 136014);
  }
  
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    GMTrace.i(18255624273920L, 136015);
    paramCharSequence = new a(paramCharSequence);
    GMTrace.o(18255624273920L, 136015);
    return paramCharSequence;
  }
  
  private static final class a
    implements CharSequence
  {
    private CharSequence iMe;
    
    a(CharSequence paramCharSequence)
    {
      GMTrace.i(18255892709376L, 136017);
      this.iMe = paramCharSequence;
      GMTrace.o(18255892709376L, 136017);
    }
    
    public final char charAt(int paramInt)
    {
      GMTrace.i(18256161144832L, 136019);
      GMTrace.o(18256161144832L, 136019);
      return '●';
    }
    
    public final int length()
    {
      GMTrace.i(18256026927104L, 136018);
      int i = this.iMe.length();
      GMTrace.o(18256026927104L, 136018);
      return i;
    }
    
    public final CharSequence subSequence(int paramInt1, int paramInt2)
    {
      GMTrace.i(18256295362560L, 136020);
      CharSequence localCharSequence = this.iMe.subSequence(paramInt1, paramInt2);
      GMTrace.o(18256295362560L, 136020);
      return localCharSequence;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */