package com.tencent.mm.plugin.fts.a.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.List;

public abstract class a
  implements Comparable<a>
{
  public boolean hy;
  private List<a> lwC;
  public Object lwD;
  public int mPriority;
  
  public a()
  {
    GMTrace.i(18634655137792L, 138839);
    this.mPriority = Integer.MAX_VALUE;
    this.hy = false;
    GMTrace.o(18634655137792L, 138839);
  }
  
  public abstract boolean execute();
  
  public int getId()
  {
    GMTrace.i(18635192008704L, 138843);
    GMTrace.o(18635192008704L, 138843);
    return -1;
  }
  
  public String getName()
  {
    GMTrace.i(18635594661888L, 138846);
    GMTrace.o(18635594661888L, 138846);
    return "";
  }
  
  public int getPriority()
  {
    GMTrace.i(18634923573248L, 138841);
    int i = this.mPriority;
    GMTrace.o(18634923573248L, 138841);
    return i;
  }
  
  public boolean isCancelled()
  {
    GMTrace.i(18635057790976L, 138842);
    boolean bool = this.hy;
    GMTrace.o(18635057790976L, 138842);
    return bool;
  }
  
  public String toString()
  {
    GMTrace.i(18635460444160L, 138845);
    String str = getName();
    if (bg.nm(str)) {
      str = getClass().getSimpleName();
    }
    for (;;)
    {
      if ((this.lwC != null) && (this.lwC.size() > 1))
      {
        StringBuffer localStringBuffer = new StringBuffer();
        int i = 1;
        while (i < this.lwC.size())
        {
          a locala1 = (a)this.lwC.get(i - 1);
          a locala2 = (a)this.lwC.get(i);
          localStringBuffer.append(" ");
          localStringBuffer.append(locala2.lwE);
          localStringBuffer.append(" : ");
          localStringBuffer.append(locala2.timestamp - locala1.timestamp);
          i += 1;
        }
        str = String.format("%s ##### %s", new Object[] { str, localStringBuffer.toString() });
        GMTrace.o(18635460444160L, 138845);
        return str;
      }
      str = String.format("%s", new Object[] { str });
      GMTrace.o(18635460444160L, 138845);
      return str;
    }
  }
  
  public final void yS(String paramString)
  {
    GMTrace.i(18635326226432L, 138844);
    if (this.lwC == null) {
      this.lwC = new ArrayList();
    }
    a locala = new a();
    locala.lwE = paramString;
    locala.timestamp = System.currentTimeMillis();
    this.lwC.add(locala);
    GMTrace.o(18635326226432L, 138844);
  }
  
  public final class a
  {
    public String lwE;
    public long timestamp;
    
    public a()
    {
      GMTrace.i(18635863097344L, 138848);
      GMTrace.o(18635863097344L, 138848);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */