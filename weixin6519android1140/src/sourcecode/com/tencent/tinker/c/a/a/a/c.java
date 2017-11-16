package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.t;
import com.tencent.tinker.a.a.t.a;

public final class c
  extends i<com.tencent.tinker.a.a.b>
{
  private t.a yex = null;
  private i.e yey = null;
  
  public c(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami1, com.tencent.tinker.a.a.i parami2, com.tencent.tinker.c.a.c.c paramc)
  {
    super(parama, parami1, paramc);
    if (parami2 != null)
    {
      this.yex = parami2.ycI.ydo;
      this.yey = parami2.a(this.yex);
    }
  }
  
  protected final t.a a(com.tencent.tinker.a.a.i parami)
  {
    return parami.ycI.ydo;
  }
  
  protected final void a(com.tencent.tinker.c.a.c.c paramc, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0) {
      paramc.yfW.FL(paramInt2);
    }
  }
  
  protected final void a(com.tencent.tinker.c.a.c.c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 != paramInt4) {
      paramc.yfI.put(paramInt2, paramInt4);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\c\a\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */