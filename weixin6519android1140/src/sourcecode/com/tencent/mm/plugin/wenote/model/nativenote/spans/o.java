package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class o<V, C extends g<V>>
  extends t<V, C>
{
  public o()
  {
    GMTrace.i(20622151254016L, 153647);
    GMTrace.o(20622151254016L, 153647);
  }
  
  protected final s<ArrayList> a(Spannable paramSpannable, e parame, int paramInt)
  {
    GMTrace.i(20622822342656L, 153652);
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments();
    if (localObject1 == null)
    {
      GMTrace.o(20622822342656L, 153652);
      return null;
    }
    localObject1 = (Class)localObject1[(localObject1.length - 1)];
    localObject1 = paramSpannable.getSpans(parame.Vw, parame.vt, (Class)localObject1);
    int j = localObject1.length;
    int i = 0;
    if (i < j)
    {
      Object localObject2 = localObject1[i];
      int n = paramSpannable.getSpanStart(localObject2);
      int k = paramSpannable.getSpanEnd(localObject2);
      int m = parame.Vw;
      int i1 = parame.vt;
      int i2 = Math.max(n, m);
      int i3 = Math.min(k, i1);
      boolean bool;
      if (i2 > i3) {
        bool = false;
      }
      for (;;)
      {
        if (bool) {
          localArrayList.add(localObject2);
        }
        i += 1;
        break;
        if (i2 < i3)
        {
          bool = true;
        }
        else if (((n > m) && (k < i1)) || ((m > n) && (i1 < k)))
        {
          bool = true;
        }
        else if (paramInt == s.shw)
        {
          if ((n == m) && (k == i1) && (m == i1)) {
            bool = true;
          } else {
            bool = false;
          }
        }
        else
        {
          n = paramSpannable.getSpanFlags(localObject2) & 0x33;
          if (k == m) {
            bool = c(n, new int[] { 34, 18 });
          } else {
            bool = c(n, new int[] { 17, 18 });
          }
        }
      }
    }
    GMTrace.o(20622822342656L, 153652);
    return localArrayList;
  }
  
  protected final void a(Spannable paramSpannable, n paramn, p paramp)
  {
    GMTrace.i(20622688124928L, 153651);
    paramp.a(a(paramSpannable, paramn, s.shw), paramn);
    GMTrace.o(20622688124928L, 153651);
  }
  
  public abstract void a(WXRTEditText paramWXRTEditText, e parame, V paramV);
  
  public final void a(WXRTEditText paramWXRTEditText, V paramV)
  {
    GMTrace.i(20622419689472L, 153649);
    e locale = paramWXRTEditText.bHS();
    if ((paramWXRTEditText.seX) && (paramWXRTEditText.bHL().Vw == locale.Vw) && (locale.Vw > 1))
    {
      Object localObject1 = a(paramWXRTEditText.getText(), locale, s.shx);
      if ((!((ArrayList)localObject1).isEmpty()) && (paramWXRTEditText.getLayout().getPrimaryHorizontal(paramWXRTEditText.bHL().Vw) == b.bHn()))
      {
        localObject1 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = ((Iterator)localObject1).next();
          paramWXRTEditText.getText().removeSpan(localObject2);
        }
        paramWXRTEditText.getText().insert(locale.Vw - 1, "\n");
      }
    }
    a(paramWXRTEditText, locale, paramV);
    u.a(paramWXRTEditText, new t[] { this });
    GMTrace.o(20622419689472L, 153649);
  }
  
  protected final e p(WXRTEditText paramWXRTEditText)
  {
    GMTrace.i(20622285471744L, 153648);
    paramWXRTEditText = paramWXRTEditText.bHS();
    GMTrace.o(20622285471744L, 153648);
    return paramWXRTEditText;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */