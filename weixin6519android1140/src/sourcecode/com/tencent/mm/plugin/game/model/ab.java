package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.game.c.as;
import com.tencent.mm.plugin.game.d.d;
import java.util.Iterator;
import java.util.LinkedList;

public final class ab
  extends aa
{
  public as lNT;
  public LinkedList<c> lNU;
  private int lNV;
  private int mType;
  
  public ab(a parama, int paramInt1, int paramInt2)
  {
    GMTrace.i(12633780518912L, 94129);
    this.mType = 0;
    this.lNV = 0;
    if (parama == null)
    {
      this.lNT = new as();
      GMTrace.o(12633780518912L, 94129);
      return;
    }
    this.lNT = ((as)parama);
    this.mType = paramInt1;
    this.lNV = paramInt2;
    parama = new LinkedList();
    if (this.lNT.lRH != null)
    {
      paramInt1 = this.lNV;
      Iterator localIterator = this.lNT.lRH.iterator();
      paramInt1 += 1;
      while (localIterator.hasNext())
      {
        c localc = a((com.tencent.mm.plugin.game.c.c)localIterator.next());
        if (localc != null)
        {
          switch (this.mType)
          {
          }
          for (;;)
          {
            parama.add(localc);
            break;
            localc.scene = 16;
            localc.eSa = 1601;
            paramInt2 = paramInt1 + 1;
            localc.position = paramInt1;
            paramInt1 = paramInt2;
            continue;
            localc.scene = 15;
            localc.eSa = 1501;
            paramInt2 = paramInt1 + 1;
            localc.position = paramInt1;
            paramInt1 = paramInt2;
          }
        }
      }
    }
    this.lNU = parama;
    d.V(this.lNU);
    GMTrace.o(12633780518912L, 94129);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */