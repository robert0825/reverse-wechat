package com.tencent.mm.view.a;

import android.content.Context;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;

public abstract class a
  extends BaseAdapter
{
  public int jtJ;
  public int lYU;
  public Context mContext;
  public int xAe;
  public int xAf;
  public String xAg;
  public int xAh;
  public int xze;
  public int xzg;
  public com.tencent.mm.view.f.a xzn;
  
  public a(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    GMTrace.i(20105949872128L, 149801);
    this.mContext = paramContext;
    this.xzn = parama;
    GMTrace.o(20105949872128L, 149801);
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    GMTrace.i(20106084089856L, 149802);
    this.xze = paramInt1;
    this.jtJ = paramInt2;
    this.xAe = paramInt3;
    this.xzg = paramInt4;
    this.xAf = paramInt5;
    this.xAh = paramInt6;
    this.lYU = paramInt7;
    GMTrace.o(20106084089856L, 149802);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\view\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */