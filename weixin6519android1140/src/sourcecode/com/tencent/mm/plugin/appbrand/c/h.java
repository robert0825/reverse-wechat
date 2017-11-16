package com.tencent.mm.plugin.appbrand.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.protocal.c.bup;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.vending.j.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

 enum h
{
  static
  {
    GMTrace.i(10016400605184L, 74628);
    hMZ = new h[0];
    GMTrace.o(10016400605184L, 74628);
  }
  
  static void r(LinkedList<bup> paramLinkedList)
  {
    GMTrace.i(10016266387456L, 74627);
    HashSet localHashSet = new HashSet();
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bup localbup = (bup)paramLinkedList.next();
      if (!bg.nm(localbup.username))
      {
        localHashSet.add(localbup.username);
        localLinkedList.add(a.w(localbup.username, Integer.valueOf(localbup.tWR)));
      }
    }
    paramLinkedList = new ArrayList(localHashSet.size());
    paramLinkedList.addAll(localHashSet);
    r.S(paramLinkedList);
    GMTrace.o(10016266387456L, 74627);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */