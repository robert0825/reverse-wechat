package com.tencent.mm.modelappbrand;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class r
  implements q
{
  private f gre;
  protected Map<String, i> grf;
  
  public r(f paramf)
  {
    GMTrace.i(18934631759872L, 141074);
    this.grf = new HashMap();
    this.gre = paramf;
    GMTrace.o(18934631759872L, 141074);
  }
  
  public r(q paramq)
  {
    GMTrace.i(18934900195328L, 141076);
    this.grf = new HashMap();
    if (paramq == null)
    {
      GMTrace.o(18934900195328L, 141076);
      return;
    }
    this.gre = paramq.CQ();
    a(paramq);
    GMTrace.o(18934900195328L, 141076);
  }
  
  private void a(q paramq)
  {
    GMTrace.i(19987838271488L, 148921);
    paramq = paramq.CR().iterator();
    while (paramq.hasNext()) {
      a((i)paramq.next());
    }
    GMTrace.o(19987838271488L, 148921);
  }
  
  public final f CQ()
  {
    GMTrace.i(18935034413056L, 141077);
    f localf = this.gre;
    GMTrace.o(18935034413056L, 141077);
    return localf;
  }
  
  public final List<i> CR()
  {
    GMTrace.i(19988240924672L, 148924);
    ArrayList localArrayList = new ArrayList(this.grf.values());
    GMTrace.o(19988240924672L, 148924);
    return localArrayList;
  }
  
  public final void a(i parami)
  {
    GMTrace.i(19988106706944L, 148923);
    this.grf.put(parami.getName(), parami);
    GMTrace.o(19988106706944L, 148923);
  }
  
  public final <T> T ht(String paramString)
  {
    GMTrace.i(19987972489216L, 148922);
    paramString = this.grf.get(paramString);
    GMTrace.o(19987972489216L, 148922);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelappbrand\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */