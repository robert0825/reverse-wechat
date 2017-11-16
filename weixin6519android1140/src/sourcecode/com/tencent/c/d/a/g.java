package com.tencent.c.d.a;

import com.tencent.c.d.b.d.a;
import com.tencent.c.f.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g
  implements b
{
  private final Pattern wIe = Pattern.compile("^/system/xbin/ku\\.sud$|^daemonsu:|^k_worker/[1-9]\\d*:[1-9]\\d*$|^kr_worker/[1-9]\\d*:[1-9]\\d*$|^km_worker/[1-9]\\d*:[1-9]\\d*$|^tworker/[1-9]\\d*:[1-9]\\d*$|^tu_worker/[1-9]\\d*:[1-9]\\d*$|^tq_worker/[1-9]\\d*:[1-9]\\d*$|^kworker/[1-9]\\d{2}$|^permmgrd$|^360sguard$|^/data/data/[\\w\\-\\.]+/");
  private final List<d.a> xRz = new ArrayList();
  
  public final void a(d.a parama)
  {
    if (parama.uid != 0) {}
    while (parama.xRG != 1) {
      return;
    }
    this.xRz.add(parama);
  }
  
  public final boolean cns()
  {
    Iterator localIterator = this.xRz.iterator();
    while (localIterator.hasNext())
    {
      d.a locala = (d.a)localIterator.next();
      h.XX("SingleProcessAnalyzer : " + locala.toString());
      if ((locala.name != null) && (this.wIe.matcher(locala.name).find()))
      {
        h.XW("SingleProcessAnalyzer match : " + locala.toString());
        return true;
      }
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\c\d\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */