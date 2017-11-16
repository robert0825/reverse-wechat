package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.base.sortview.a;
import com.tencent.mm.ui.base.sortview.a.a;
import com.tencent.mm.ui.base.sortview.a.b;

public final class g
  extends a
{
  private static a.b jtx;
  
  public g(Object paramObject)
  {
    super(0, paramObject);
    GMTrace.i(10860093243392L, 80914);
    this.wln = true;
    GMTrace.o(10860093243392L, 80914);
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(20422166839296L, 152157);
    GMTrace.o(20422166839296L, 152157);
  }
  
  public final a.b aig()
  {
    GMTrace.i(20421898403840L, 152155);
    if (jtx == null) {
      jtx = new a.b()
      {
        public final void a(Context paramAnonymousContext, a.a paramAnonymousa, a paramAnonymousVarArgs)
        {
          GMTrace.i(20416932347904L, 152118);
          GMTrace.o(20416932347904L, 152118);
        }
        
        public final void a(View paramAnonymousView, a.a paramAnonymousa)
        {
          GMTrace.i(20417066565632L, 152119);
          GMTrace.o(20417066565632L, 152119);
        }
        
        public final boolean a(Context paramAnonymousContext, a paramAnonymousa, Object... paramAnonymousVarArgs)
        {
          GMTrace.i(20416798130176L, 152117);
          GMTrace.o(20416798130176L, 152117);
          return true;
        }
        
        public final View b(Context paramAnonymousContext, View paramAnonymousView)
        {
          GMTrace.i(10888413184000L, 81125);
          View localView = paramAnonymousView;
          if (paramAnonymousView == null) {
            localView = new View(paramAnonymousContext);
          }
          GMTrace.o(10888413184000L, 81125);
          return localView;
        }
      };
    }
    a.b localb = jtx;
    GMTrace.o(20421898403840L, 152155);
    return localb;
  }
  
  public final a.a aih()
  {
    GMTrace.i(20422032621568L, 152156);
    a locala = new a();
    GMTrace.o(20422032621568L, 152156);
    return locala;
  }
  
  public static final class a
    implements a.a
  {
    public a()
    {
      GMTrace.i(10865193517056L, 80952);
      GMTrace.o(10865193517056L, 80952);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */