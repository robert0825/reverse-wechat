package com.tencent.mm.plugin.brandservice.ui.base;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.brandservice.ui.c.b;
import java.util.List;

public abstract class a
  extends com.tencent.mm.ui.base.sortview.a
{
  public List<String> hWm;
  protected c.b jtP;
  protected int jvs;
  protected int position;
  
  public a(int paramInt, Object paramObject)
  {
    super(paramInt, paramObject);
    GMTrace.i(10894855634944L, 81173);
    GMTrace.o(10894855634944L, 81173);
  }
  
  public final void a(c.b paramb)
  {
    GMTrace.i(10894989852672L, 81174);
    this.jtP = paramb;
    GMTrace.o(10894989852672L, 81174);
  }
  
  public final c.b aiw()
  {
    GMTrace.i(10895124070400L, 81175);
    c.b localb = this.jtP;
    GMTrace.o(10895124070400L, 81175);
    return localb;
  }
  
  public final int aix()
  {
    GMTrace.i(10895392505856L, 81177);
    int i = this.jvs;
    GMTrace.o(10895392505856L, 81177);
    return i;
  }
  
  public final int getPosition()
  {
    GMTrace.i(10895660941312L, 81179);
    int i = this.position;
    GMTrace.o(10895660941312L, 81179);
    return i;
  }
  
  public final void lw(int paramInt)
  {
    GMTrace.i(10895258288128L, 81176);
    this.jvs = paramInt;
    GMTrace.o(10895258288128L, 81176);
  }
  
  public final void lx(int paramInt)
  {
    GMTrace.i(10895526723584L, 81178);
    this.position = paramInt;
    GMTrace.o(10895526723584L, 81178);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\base\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */