package com.tencent.mm.plugin.fps_lighter.c;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public final class d
{
  public int gLU;
  public int gZW;
  public a lnA;
  public Stack<Long> lnB;
  public long lnq;
  public boolean lnr;
  public long lns;
  public long lnt;
  public List<String> lnx;
  public List<String> lny;
  public long lnz;
  
  public d(a parama, c paramc)
  {
    GMTrace.i(5219593224192L, 38889);
    this.lnB = new Stack();
    this.lnx = paramc.lnx;
    this.lny = paramc.lny;
    this.lns = paramc.lns;
    this.lnt = paramc.lnt;
    this.lnz = paramc.lnz;
    this.gLU = paramc.gLU;
    this.gZW = paramc.gZW;
    this.lnA = parama;
    this.lnq = parama.lnq;
    this.lnr = parama.lnr;
    GMTrace.o(5219593224192L, 38889);
  }
  
  public final void a(Stack<Long> paramStack)
  {
    GMTrace.i(5219861659648L, 38891);
    this.lnB.clear();
    paramStack = paramStack.iterator();
    while (paramStack.hasNext())
    {
      long l = ((Long)paramStack.next()).longValue();
      this.lnB.push(Long.valueOf(l));
    }
    GMTrace.o(5219861659648L, 38891);
  }
  
  public final String aAo()
  {
    GMTrace.i(5219995877376L, 38892);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(this.lnt);
    ((StringBuilder)localObject).append(" > ");
    ListIterator localListIterator = this.lnB.listIterator(this.lnB.size());
    while (localListIterator.hasPrevious())
    {
      ((StringBuilder)localObject).append(localListIterator.previous());
      ((StringBuilder)localObject).append(" > ");
    }
    ((StringBuilder)localObject).delete(((StringBuilder)localObject).length() - 3, ((StringBuilder)localObject).length());
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(5219995877376L, 38892);
    return (String)localObject;
  }
  
  public final void cy(long paramLong)
  {
    GMTrace.i(5219727441920L, 38890);
    this.lnB.push(Long.valueOf(paramLong));
    GMTrace.o(5219727441920L, 38890);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(5220264312832L, 38894);
    if (!(paramObject instanceof d))
    {
      GMTrace.o(5220264312832L, 38894);
      return false;
    }
    paramObject = (d)paramObject;
    if (((d)paramObject).lnt != this.lnt)
    {
      GMTrace.o(5220264312832L, 38894);
      return false;
    }
    if (this.lnB.size() != ((d)paramObject).lnB.size())
    {
      GMTrace.o(5220264312832L, 38894);
      return false;
    }
    int i = 0;
    while (i < this.lnB.size())
    {
      if (this.lnB.elementAt(i) != ((d)paramObject).lnB.elementAt(i))
      {
        GMTrace.o(5220264312832L, 38894);
        return false;
      }
      i += 1;
    }
    GMTrace.o(5220264312832L, 38894);
    return false;
  }
  
  public final String toString()
  {
    GMTrace.i(5220130095104L, 38893);
    Object localObject = new StringBuilder(36);
    ((StringBuilder)localObject).append("\t");
    ((StringBuilder)localObject).append("scene:");
    ((StringBuilder)localObject).append(this.lnA.scene);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("preMs:");
    ((StringBuilder)localObject).append(this.lnA.lnl);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("dropCount:");
    ((StringBuilder)localObject).append(this.lnA.lnn);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("dropTime:");
    ((StringBuilder)localObject).append(this.lnA.aAm());
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("cpu:");
    ((StringBuilder)localObject).append(this.lnA.lno + "%");
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("isOnCreate:");
    ((StringBuilder)localObject).append(this.lnA.lnm);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("methodId:");
    ((StringBuilder)localObject).append(this.lnt);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("costTime:");
    ((StringBuilder)localObject).append(this.lnz);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("percent:");
    ((StringBuilder)localObject).append(Math.round(this.lnz * 1.0D / this.lnA.aAm() * 100.0D) + "%");
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("exec num:");
    ((StringBuilder)localObject).append(this.gZW);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("inputHandlingTime:");
    ((StringBuilder)localObject).append(this.lnq);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("isInputHandling:");
    ((StringBuilder)localObject).append(this.lnr);
    ((StringBuilder)localObject).append(" ");
    ((StringBuilder)localObject).append("stack:");
    ((StringBuilder)localObject).append(aAo());
    ((StringBuilder)localObject).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(5220130095104L, 38893);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fps_lighter\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */