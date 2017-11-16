package com.tencent.mm.plugin.wenote.model.nativenote.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;

public final class d
{
  public int endPos;
  public int gsM;
  public int sge;
  public int startOffset;
  
  public d()
  {
    GMTrace.i(20610071658496L, 153557);
    this.gsM = -1;
    this.startOffset = -1;
    this.endPos = -1;
    this.sge = -1;
    set(-1, -1, -1, -1);
    GMTrace.o(20610071658496L, 153557);
  }
  
  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20610205876224L, 153558);
    this.gsM = -1;
    this.startOffset = -1;
    this.endPos = -1;
    this.sge = -1;
    set(paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(20610205876224L, 153558);
  }
  
  public final int bIa()
  {
    GMTrace.i(20610474311680L, 153560);
    if ((this.gsM < 0) || (this.startOffset < 0) || (this.endPos < 0) || (this.sge < 0) || (this.gsM > this.endPos) || ((this.gsM == this.endPos) && (this.startOffset > this.sge)))
    {
      GMTrace.o(20610474311680L, 153560);
      return 0;
    }
    b localb1 = c.bHo().yD(this.gsM);
    b localb2 = c.bHo().yD(this.endPos);
    if ((localb1 == null) || (localb2 == null))
    {
      GMTrace.o(20610474311680L, 153560);
      return 0;
    }
    if ((this.gsM == this.endPos) && (this.startOffset == this.sge))
    {
      GMTrace.o(20610474311680L, 153560);
      return 1;
    }
    if ((this.gsM == this.endPos) && (localb1.getType() == 1))
    {
      GMTrace.o(20610474311680L, 153560);
      return 2;
    }
    GMTrace.o(20610474311680L, 153560);
    return 3;
  }
  
  public final void set(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(20610340093952L, 153559);
    this.gsM = paramInt1;
    this.startOffset = paramInt2;
    this.endPos = paramInt3;
    this.sge = paramInt4;
    GMTrace.o(20610340093952L, 153559);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */