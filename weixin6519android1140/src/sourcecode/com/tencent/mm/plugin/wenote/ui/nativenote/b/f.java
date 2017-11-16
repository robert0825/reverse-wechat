package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.util.SparseArray;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;

public final class f
{
  public static final int sjq;
  public static final int sjr;
  public static final int sjs;
  public SparseArray<Integer> sjt;
  
  static
  {
    GMTrace.i(17157991694336L, 127837);
    sjq = R.i.cDl;
    sjr = R.i.cDk;
    sjs = R.i.cDi;
    GMTrace.o(17157991694336L, 127837);
  }
  
  public f()
  {
    GMTrace.i(17157723258880L, 127835);
    this.sjt = new SparseArray();
    this.sjt.put(1, Integer.valueOf(sjq));
    this.sjt.put(2, Integer.valueOf(sjr));
    this.sjt.put(4, Integer.valueOf(sjr));
    this.sjt.put(3, Integer.valueOf(sjr));
    this.sjt.put(5, Integer.valueOf(sjr));
    this.sjt.put(6, Integer.valueOf(sjr));
    this.sjt.put(0, Integer.valueOf(sjr));
    this.sjt.put(-1, Integer.valueOf(sjr));
    this.sjt.put(-3, Integer.valueOf(sjs));
    this.sjt.put(-2, Integer.valueOf(sjr));
    this.sjt.put(-4, Integer.valueOf(sjr));
    GMTrace.o(17157723258880L, 127835);
  }
  
  public static a a(int paramInt, View paramView, com.tencent.mm.plugin.wenote.model.nativenote.manager.k paramk)
  {
    GMTrace.i(17157857476608L, 127836);
    switch (paramInt)
    {
    default: 
      GMTrace.o(17157857476608L, 127836);
      return null;
    case 1: 
      paramView = new k(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    case 0: 
      paramView = new l(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    case 2: 
      paramView = new e(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    case 4: 
      paramView = new n(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    case 3: 
      paramView = new g(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    case 5: 
      paramView = new c(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    case 6: 
      paramView = new m(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    case -1: 
      paramView = new j(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    case -3: 
      paramView = new d(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    case -2: 
      paramView = new b(paramView, paramk);
      GMTrace.o(17157857476608L, 127836);
      return paramView;
    }
    paramView = new i(paramView, paramk);
    GMTrace.o(17157857476608L, 127836);
    return paramView;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */