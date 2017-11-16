package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Spannable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import java.util.ArrayList;

public abstract class t<V, C extends g<V>>
{
  public t()
  {
    GMTrace.i(20632083365888L, 153721);
    GMTrace.o(20632083365888L, 153721);
  }
  
  protected static boolean c(int paramInt, int... paramVarArgs)
  {
    GMTrace.i(20632754454528L, 153726);
    int i = 0;
    while (i < 2)
    {
      int j = paramVarArgs[i];
      if ((paramInt & j) == j)
      {
        GMTrace.o(20632754454528L, 153726);
        return true;
      }
      i += 1;
    }
    GMTrace.o(20632754454528L, 153726);
    return false;
  }
  
  protected abstract s<ArrayList> a(Spannable paramSpannable, e parame, int paramInt);
  
  public abstract void a(WXRTEditText paramWXRTEditText, V paramV);
  
  public abstract int bIq();
  
  protected abstract e p(WXRTEditText paramWXRTEditText);
  
  public final boolean q(WXRTEditText paramWXRTEditText)
  {
    GMTrace.i(20632217583616L, 153722);
    e locale = p(paramWXRTEditText);
    if (!a(paramWXRTEditText.getText(), locale, s.shx).isEmpty())
    {
      GMTrace.o(20632217583616L, 153722);
      return true;
    }
    GMTrace.o(20632217583616L, 153722);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */