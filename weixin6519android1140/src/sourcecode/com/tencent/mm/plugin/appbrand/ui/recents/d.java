package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.e;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;

final class d
{
  final boolean eDU;
  
  d(boolean paramBoolean)
  {
    GMTrace.i(16356980293632L, 121869);
    this.eDU = paramBoolean;
    GMTrace.o(16356980293632L, 121869);
  }
  
  final ArrayList<e> m(ArrayList<e> paramArrayList)
  {
    GMTrace.i(16357114511360L, 121870);
    if ((!this.eDU) || (bg.cc(paramArrayList)))
    {
      GMTrace.o(16357114511360L, 121870);
      return paramArrayList;
    }
    ArrayList localArrayList = new ArrayList(paramArrayList.size());
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      e locale = (e)paramArrayList.next();
      if (!locale.hMM) {
        localArrayList.add(locale);
      }
    }
    GMTrace.o(16357114511360L, 121870);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\recents\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */