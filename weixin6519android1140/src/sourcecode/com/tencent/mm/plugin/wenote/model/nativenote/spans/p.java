package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Spannable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import java.util.ArrayList;
import java.util.Iterator;

public final class p
{
  final ArrayList<a> shf;
  
  public p()
  {
    GMTrace.i(20627654180864L, 153688);
    this.shf = new ArrayList();
    GMTrace.o(20627654180864L, 153688);
  }
  
  public final void a(Object paramObject, n paramn)
  {
    GMTrace.i(20627922616320L, 153690);
    this.shf.add(new a(paramObject, paramn, false));
    GMTrace.o(20627922616320L, 153690);
  }
  
  public final void a(ArrayList<Object> paramArrayList, n paramn)
  {
    GMTrace.i(20627788398592L, 153689);
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Object localObject = paramArrayList.next();
      if ((localObject instanceof f)) {
        this.shf.add(new a(localObject, paramn, true));
      }
    }
    GMTrace.o(20627788398592L, 153689);
  }
  
  public final void c(Spannable paramSpannable)
  {
    GMTrace.i(20628056834048L, 153691);
    Iterator localIterator = this.shf.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      f localf = locala.shg;
      int m = locala.shh.Vw;
      int i;
      if (locala.shi)
      {
        i = paramSpannable.getSpanStart(localf);
        if ((i >= 0) && (i < m)) {
          paramSpannable.setSpan(localf.bIt(), i, m, 34);
        }
        paramSpannable.removeSpan(localf);
      }
      else
      {
        n localn = locala.shh;
        int k = locala.shh.vt;
        if ((localn.sgY) && (localn.isEmpty())) {
          i = 34;
        }
        for (;;)
        {
          int j = k;
          if (k > paramSpannable.length()) {
            j = paramSpannable.length();
          }
          paramSpannable.setSpan(localf, m, j, i);
          break;
          if ((localn.sgY) && (localn.sgX)) {
            i = 18;
          } else if (localn.sgY) {
            i = 34;
          } else {
            i = 33;
          }
        }
      }
    }
    GMTrace.o(20628056834048L, 153691);
  }
  
  private static final class a
  {
    final f shg;
    final n shh;
    final boolean shi;
    
    a(Object paramObject, n paramn, boolean paramBoolean)
    {
      GMTrace.i(20623359213568L, 153656);
      this.shg = ((f)paramObject);
      this.shh = paramn;
      this.shi = paramBoolean;
      GMTrace.o(20623359213568L, 153656);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\spans\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */