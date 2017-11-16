package com.tencent.mm.ui.friend;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.o;

public final class c
  implements View.OnClickListener
{
  private Context context;
  public a xbE;
  
  public c(Context paramContext, a parama)
  {
    GMTrace.i(2803003031552L, 20884);
    this.context = paramContext;
    this.xbE = parama;
    GMTrace.o(2803003031552L, 20884);
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(2803137249280L, 20885);
    paramView = (b)paramView.getTag();
    String str = paramView.xbG;
    final int i = paramView.position;
    int j = o.bj(str);
    new g(this.context, new g.a()
    {
      public final void n(boolean paramAnonymousBoolean, String paramAnonymousString)
      {
        GMTrace.i(2806358474752L, 20909);
        c.this.xbE.mu(paramAnonymousBoolean);
        GMTrace.o(2806358474752L, 20909);
      }
    }).r(new int[] { j });
    GMTrace.o(2803137249280L, 20885);
  }
  
  public static abstract interface a
  {
    public abstract void mu(boolean paramBoolean);
  }
  
  public static final class b
  {
    public int position;
    public String xbG;
    
    public b()
    {
      GMTrace.i(2824477868032L, 21044);
      GMTrace.o(2824477868032L, 21044);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\friend\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */