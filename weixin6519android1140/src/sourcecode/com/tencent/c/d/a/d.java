package com.tencent.c.d.a;

import com.tencent.c.d.b.d.a;
import com.tencent.c.f.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class d
  implements b
{
  private final HashSet<Integer> xRA = new HashSet();
  private final List<d.a> xRB = new ArrayList();
  
  public final void a(d.a parama)
  {
    if (parama.uid != 0) {}
    do
    {
      return;
      if ((parama.xRG == 1) && (!"/sbin/adbd".equals(parama.name)))
      {
        h.XX("ProcessRelationAnalyzer parent : " + parama.toString());
        this.xRA.add(Integer.valueOf(parama.pid));
        return;
      }
    } while ((parama.xRG <= 1) || (!"sh".equals(parama.name)) || (!"/system/bin/sh".equals(parama.name)));
    h.XX("ProcessRelationAnalyzer child : " + parama.toString());
    this.xRB.add(parama);
  }
  
  public final boolean cns()
  {
    Iterator localIterator = this.xRB.iterator();
    while (localIterator.hasNext())
    {
      d.a locala = (d.a)localIterator.next();
      if (this.xRA.contains(Integer.valueOf(locala.xRG)))
      {
        h.XW("ProcessRelationAnalyzer match : " + locala.toString());
        return true;
      }
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */