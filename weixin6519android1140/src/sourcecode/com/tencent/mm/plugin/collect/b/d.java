package com.tencent.mm.plugin.collect.b;

import com.tencent.gmtrace.GMTrace;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public enum d
{
  public List<a> jwK;
  
  static
  {
    GMTrace.i(5399847632896L, 40232);
    jVU = new d("INSTANCE");
    jVV = new d[] { jVU };
    GMTrace.o(5399847632896L, 40232);
  }
  
  private d()
  {
    GMTrace.i(5399579197440L, 40230);
    this.jwK = new LinkedList();
    GMTrace.o(5399579197440L, 40230);
  }
  
  public final void a(s params)
  {
    GMTrace.i(5399713415168L, 40231);
    Iterator localIterator = this.jwK.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala != null) {
        locala.b(params);
      }
    }
    GMTrace.o(5399713415168L, 40231);
  }
  
  public static abstract interface a
  {
    public abstract void b(s params);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */