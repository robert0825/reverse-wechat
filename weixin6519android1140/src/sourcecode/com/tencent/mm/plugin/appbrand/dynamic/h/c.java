package com.tencent.mm.plugin.appbrand.dynamic.h;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
  implements a
{
  private String appId;
  private String hSv;
  private String hVd;
  private Map<String, Integer> hVe;
  
  public c(String paramString1, String paramString2)
  {
    GMTrace.i(19985422352384L, 148903);
    this.hVe = new HashMap();
    this.appId = paramString1;
    this.hSv = paramString2;
    this.hVd = (this.hSv + "-" + this.appId);
    GMTrace.o(19985422352384L, 148903);
  }
  
  public final void pO(String paramString)
  {
    GMTrace.i(19985556570112L, 148904);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(19985556570112L, 148904);
      return;
    }
    Integer localInteger2 = (Integer)this.hVe.get(paramString);
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    this.hVe.put(paramString, Integer.valueOf(localInteger1.intValue() + 1));
    GMTrace.o(19985556570112L, 148904);
  }
  
  public final void rw()
  {
    GMTrace.i(19985690787840L, 148905);
    Iterator localIterator = this.hVe.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      g.ork.i(14705, new Object[] { localEntry.getKey(), localEntry.getValue(), this.hVd, this.hSv, this.appId });
    }
    this.hVe.clear();
    GMTrace.o(19985690787840L, 148905);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */