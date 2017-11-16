package com.tencent.mm.ui.widget.celltextview.a;

import android.util.LruCache;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.widget.celltextview.c.d;
import com.tencent.mm.ui.widget.celltextview.c.e;
import java.util.ArrayList;

public final class b
{
  private static b xtq;
  private static Object xts;
  public LruCache<a, a> xtr;
  
  static
  {
    GMTrace.i(18744176803840L, 139655);
    xts = new Object();
    GMTrace.o(18744176803840L, 139655);
  }
  
  private b()
  {
    GMTrace.i(18743774150656L, 139652);
    this.xtr = new LruCache(200);
    GMTrace.o(18743774150656L, 139652);
  }
  
  public static b cjy()
  {
    GMTrace.i(18743908368384L, 139653);
    if (xtq == null) {}
    synchronized (xts)
    {
      if (xtq == null) {
        xtq = new b();
      }
      ??? = xtq;
      GMTrace.o(18743908368384L, 139653);
      return (b)???;
    }
  }
  
  public final void a(CharSequence paramCharSequence, float paramFloat1, float paramFloat2, ArrayList<d> paramArrayList, ArrayList<e> paramArrayList1)
  {
    GMTrace.i(20302041972736L, 151262);
    if (paramCharSequence == null) {}
    for (paramCharSequence = "";; paramCharSequence = paramCharSequence.toString())
    {
      paramCharSequence = new a(paramCharSequence, paramFloat1, paramFloat2);
      if (paramArrayList != null)
      {
        if (paramCharSequence.xtn == null) {
          paramCharSequence.xtn = new ArrayList(paramArrayList.size());
        }
        paramCharSequence.xtn.addAll(paramArrayList);
      }
      paramCharSequence.am(paramArrayList1);
      this.xtr.put(paramCharSequence, paramCharSequence);
      GMTrace.o(20302041972736L, 151262);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */