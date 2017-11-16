package com.tencent.mm.plugin.scanner.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class k
{
  public static boolean a(a.a parama)
  {
    GMTrace.i(6054293274624L, 45108);
    if (!bg.nm(parama.amf))
    {
      GMTrace.o(6054293274624L, 45108);
      return true;
    }
    GMTrace.o(6054293274624L, 45108);
    return false;
  }
  
  public static boolean b(List<a> paramList, Map<String, a.a> paramMap)
  {
    GMTrace.i(6054159056896L, 45107);
    if ((paramMap == null) || (paramMap.size() <= 0) || (paramList == null))
    {
      GMTrace.o(6054159056896L, 45107);
      return false;
    }
    int i = 0;
    boolean bool2;
    for (boolean bool1 = false; i < paramList.size(); bool1 = bool2)
    {
      bool2 = bool1;
      if (paramList.get(i) != null)
      {
        LinkedList localLinkedList = ((a)paramList.get(i)).gVg;
        int j = 0;
        bool2 = false;
        if (j < localLinkedList.size())
        {
          a.a locala1 = (a.a)localLinkedList.get(j);
          boolean bool3;
          if (a(locala1))
          {
            a.a locala2 = (a.a)paramMap.get(locala1.amf);
            if (locala2 != null)
            {
              w.i("MicroMsg.ProductUpdateLogic", "Updating action , info: key=" + locala1.amf);
              localLinkedList.remove(j);
              localLinkedList.add(j, locala2);
              bool2 = true;
              bool1 = true;
            }
            bool3 = bool2;
            bool2 = bool1;
          }
          for (bool1 = bool3;; bool1 = bool3)
          {
            j += 1;
            bool3 = bool2;
            bool2 = bool1;
            bool1 = bool3;
            break;
            bool3 = true;
            bool2 = bool1;
          }
        }
        ((a)paramList.get(i)).osM = bool2;
        bool2 = bool1;
      }
      i += 1;
    }
    GMTrace.o(6054159056896L, 45107);
    return bool1;
  }
  
  public static LinkedList<String> bn(List<a> paramList)
  {
    GMTrace.i(6053890621440L, 45105);
    LinkedList localLinkedList1 = new LinkedList();
    int i = 0;
    while (i < paramList.size())
    {
      LinkedList localLinkedList2 = ((a)paramList.get(i)).gVg;
      int j = 0;
      while (j < localLinkedList2.size())
      {
        a.a locala = (a.a)localLinkedList2.get(j);
        if (a(locala)) {
          localLinkedList1.add(locala.amf);
        }
        j += 1;
      }
      i += 1;
    }
    GMTrace.o(6053890621440L, 45105);
    return localLinkedList1;
  }
  
  public static Map<String, a.a> bo(List<String> paramList)
  {
    GMTrace.i(6054024839168L, 45106);
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramList.size())
    {
      Object localObject = (String)paramList.get(i);
      w.d("MicroMsg.ProductUpdateLogic", "toUpdateXmlList info: i=" + i + ";" + bg.nl((String)localObject));
      localObject = a.k(bh.q((String)localObject, "action"), ".action");
      if ((localObject != null) && (((a.a)localObject).showType != 2)) {
        localHashMap.put(((a.a)localObject).amf, localObject);
      }
      i += 1;
    }
    GMTrace.o(6054024839168L, 45106);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */