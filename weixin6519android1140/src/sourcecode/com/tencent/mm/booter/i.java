package com.tencent.mm.booter;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.akt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.s;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import java.util.LinkedList;

public final class i
{
  public static void run()
  {
    GMTrace.i(497276682240L, 3705);
    LinkedList localLinkedList = new LinkedList();
    int j = bg.a((Integer)at.AP().get(19), 0);
    int i = 0;
    akt localakt;
    while (i < j)
    {
      localakt = new akt();
      localakt.oqG = 31;
      localakt.oqQ = "0";
      localLinkedList.add(localakt);
      i += 1;
    }
    j = bg.a((Integer)at.AP().get(20), 0);
    i = 0;
    while (i < j)
    {
      localakt = new akt();
      localakt.oqG = 31;
      localakt.oqQ = "1";
      localLinkedList.add(localakt);
      i += 1;
    }
    if (localLinkedList.size() > 0)
    {
      bq.a(localLinkedList);
      at.AP().set(19, Integer.valueOf(0));
      at.AP().set(20, Integer.valueOf(0));
    }
    GMTrace.o(497276682240L, 3705);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\booter\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */