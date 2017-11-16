package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.text.Spanned;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j
  implements Serializable
{
  private static final Pattern sfo;
  int sfp;
  public final ArrayList<n> sfq;
  
  static
  {
    GMTrace.i(17218926542848L, 128291);
    sfo = Pattern.compile("\\r\\n|\\r|\\n");
    GMTrace.o(17218926542848L, 128291);
  }
  
  public j(Spanned paramSpanned)
  {
    GMTrace.i(17218658107392L, 128289);
    this.sfp = 0;
    this.sfq = new ArrayList();
    if (paramSpanned != null)
    {
      paramSpanned = paramSpanned.toString();
      this.sfp = 1;
      Matcher localMatcher = sfo.matcher(paramSpanned);
      int i = 0;
      int j;
      boolean bool1;
      if (localMatcher.find())
      {
        j = localMatcher.end();
        if (this.sfp == 1) {}
        for (bool1 = true;; bool1 = false)
        {
          n localn = new n(i, j, bool1, false);
          this.sfq.add(localn);
          i = localMatcher.end();
          this.sfp += 1;
          break;
        }
      }
      if (this.sfq.size() < this.sfp)
      {
        j = paramSpanned.length();
        bool1 = bool2;
        if (this.sfp == 1) {
          bool1 = true;
        }
        paramSpanned = new n(i, j, bool1, true);
        this.sfq.add(paramSpanned);
      }
    }
    GMTrace.o(17218658107392L, 128289);
  }
  
  public final int getLineForOffset(int paramInt)
  {
    GMTrace.i(20643491872768L, 153806);
    int i = 0;
    while ((i < this.sfp) && (paramInt >= ((n)this.sfq.get(i)).vt)) {
      i += 1;
    }
    paramInt = Math.min(Math.max(0, i), this.sfq.size() - 1);
    GMTrace.o(20643491872768L, 153806);
    return paramInt;
  }
  
  public final String toString()
  {
    GMTrace.i(17218792325120L, 128290);
    StringBuilder localStringBuilder1 = new StringBuilder();
    Iterator localIterator = this.sfq.iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      localObject = (n)localIterator.next();
      StringBuilder localStringBuilder2 = localStringBuilder1.append(i).append(": ").append(((e)localObject).Vw).append("-").append(((e)localObject).vt);
      if (((n)localObject).sgY) {}
      for (localObject = "";; localObject = ", ")
      {
        localStringBuilder2.append((String)localObject);
        i += 1;
        break;
      }
    }
    Object localObject = localStringBuilder1.toString();
    GMTrace.o(17218792325120L, 128290);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */