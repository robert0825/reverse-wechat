package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.d.d;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
  extends i
{
  protected j(String paramString)
  {
    super(paramString);
    GMTrace.i(12595662684160L, 93845);
    GMTrace.o(12595662684160L, 93845);
  }
  
  public final void aFm()
  {
    GMTrace.i(12595796901888L, 93846);
    LinkedList localLinkedList = n(optJSONArray("items"));
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      localc.bY(localc.lLw);
    }
    d.V(localLinkedList);
    GMTrace.o(12595796901888L, 93846);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */