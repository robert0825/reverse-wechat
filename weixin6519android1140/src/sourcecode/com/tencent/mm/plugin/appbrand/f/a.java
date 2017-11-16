package com.tencent.mm.plugin.appbrand.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.c.j;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class a
  implements j.a
{
  a()
  {
    GMTrace.i(10655276990464L, 79388);
    GMTrace.o(10655276990464L, 79388);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(10655411208192L, 79389);
    if (e.Sj() == null)
    {
      w.w("MicroMsg.AppBrandSearchStorageChangeListener", "onNotifyChange by SysConfigStorage, but sLayoutStorage is null.");
      GMTrace.o(10655411208192L, 79389);
      return;
    }
    switch (paraml.iqq)
    {
    }
    for (;;)
    {
      GMTrace.o(10655411208192L, 79389);
      return;
      LinkedList localLinkedList = new LinkedList();
      if ("batch".equals(paramString))
      {
        if ((paraml.obj != null) && ((paraml.obj instanceof List)))
        {
          paramString = ((List)paraml.obj).iterator();
          while (paramString.hasNext())
          {
            paraml = (String)paramString.next();
            localLinkedList.addAll(e.Sj().oH(paraml));
          }
        }
      }
      else
      {
        localLinkedList.addAll(e.Sj().oH(paraml.obj.toString()));
        if (!localLinkedList.isEmpty())
        {
          e.Sj().a("batch", 3, localLinkedList);
          GMTrace.o(10655411208192L, 79389);
          return;
          localLinkedList = new LinkedList();
          if ("batch".equals(paramString))
          {
            if ((paraml.obj != null) && ((paraml.obj instanceof List)))
            {
              paramString = ((List)paraml.obj).iterator();
              while (paramString.hasNext())
              {
                paraml = (String)paramString.next();
                localLinkedList.addAll(e.Sj().oH(paraml));
              }
            }
          }
          else
          {
            localLinkedList.addAll(e.Sj().oH(paraml.obj.toString()));
            if (!localLinkedList.isEmpty()) {
              e.Sj().a("batch", 5, localLinkedList);
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */