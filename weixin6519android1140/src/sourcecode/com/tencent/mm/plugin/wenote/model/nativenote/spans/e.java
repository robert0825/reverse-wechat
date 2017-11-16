package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Spannable;
import android.text.style.CharacterStyle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class e<V, C extends g<V>>
  extends t<V, C>
{
  public e()
  {
    GMTrace.i(20630070099968L, 153706);
    GMTrace.o(20630070099968L, 153706);
  }
  
  protected final s<ArrayList> a(Spannable paramSpannable, com.tencent.mm.plugin.wenote.model.nativenote.manager.e parame, int paramInt)
  {
    GMTrace.i(20630741188608L, 153711);
    ArrayList localArrayList = new ArrayList();
    Object[] arrayOfObject = paramSpannable.getSpans(Math.max(0, parame.Vw - 1), Math.min(paramSpannable.length(), parame.vt + 1), CharacterStyle.class);
    int j = arrayOfObject.length;
    int i = 0;
    if (i < j)
    {
      Object localObject = arrayOfObject[i];
      int n;
      int k;
      int m;
      int i1;
      int i2;
      int i3;
      boolean bool;
      if (bv(localObject))
      {
        n = paramSpannable.getSpanStart(localObject);
        k = paramSpannable.getSpanEnd(localObject);
        m = parame.Vw;
        i1 = parame.vt;
        i2 = Math.max(n, m);
        i3 = Math.min(k, i1);
        if (i2 <= i3) {
          break label165;
        }
        bool = false;
      }
      for (;;)
      {
        if (bool) {
          localArrayList.add(localObject);
        }
        i += 1;
        break;
        label165:
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
          bool = false;
        }
        else
        {
          n = paramSpannable.getSpanFlags(localObject) & 0x33;
          if (k == m) {
            bool = c(n, new int[] { 34, 18 });
          } else {
            bool = c(n, new int[] { 17, 18 });
          }
        }
      }
    }
    GMTrace.o(20630741188608L, 153711);
    return localArrayList;
  }
  
  public void a(WXRTEditText paramWXRTEditText, V paramV)
  {
    GMTrace.i(20630338535424L, 153708);
    com.tencent.mm.plugin.wenote.model.nativenote.manager.e locale = p(paramWXRTEditText);
    int i;
    int j;
    label49:
    Object localObject;
    int k;
    if (locale.isEmpty())
    {
      i = 18;
      paramWXRTEditText = paramWXRTEditText.getText();
      Iterator localIterator = a(paramWXRTEditText, locale, s.shx).iterator();
      j = i;
      if (!localIterator.hasNext()) {
        break label247;
      }
      localObject = localIterator.next();
      boolean bool = bw(localObject).equals(paramV);
      k = paramWXRTEditText.getSpanStart(localObject);
      i = j;
      if (k < locale.Vw)
      {
        if (!bool) {
          break label186;
        }
        i = 34;
        locale.dO(locale.Vw - k, 0);
      }
      label126:
      j = paramWXRTEditText.getSpanEnd(localObject);
      if (j > locale.vt)
      {
        if (!bool) {
          break label218;
        }
        locale.dO(0, j - locale.vt);
      }
    }
    for (;;)
    {
      paramWXRTEditText.removeSpan(localObject);
      j = i;
      break label49;
      i = 34;
      break;
      label186:
      bw(localObject);
      paramWXRTEditText.setSpan(bIr(), k, locale.Vw, 33);
      i = j;
      break label126;
      label218:
      bw(localObject);
      paramWXRTEditText.setSpan(bIr(), locale.vt, j, 34);
    }
    label247:
    if (paramV != null) {
      paramWXRTEditText.setSpan(bIr(), locale.Vw, locale.vt, j);
    }
    GMTrace.o(20630338535424L, 153708);
  }
  
  protected abstract g<V> bIr();
  
  public abstract boolean bv(Object paramObject);
  
  protected abstract V bw(Object paramObject);
  
  protected final com.tencent.mm.plugin.wenote.model.nativenote.manager.e p(WXRTEditText paramWXRTEditText)
  {
    GMTrace.i(20630204317696L, 153707);
    paramWXRTEditText = new com.tencent.mm.plugin.wenote.model.nativenote.manager.e(paramWXRTEditText);
    GMTrace.o(20630204317696L, 153707);
    return paramWXRTEditText;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */