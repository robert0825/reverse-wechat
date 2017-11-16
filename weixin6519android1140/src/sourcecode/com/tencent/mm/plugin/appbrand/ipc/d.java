package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  private static final HashMap<String, MMToClientEvent> hXj;
  
  static
  {
    GMTrace.i(10286178238464L, 76638);
    hXj = new HashMap();
    GMTrace.o(10286178238464L, 76638);
  }
  
  public static <T extends Parcelable> void a(T paramT)
  {
    GMTrace.i(10286044020736L, 76637);
    if (paramT != null)
    {
      Object localObject2 = new LinkedList();
      synchronized (hXj)
      {
        Iterator localIterator = hXj.values().iterator();
        if (localIterator.hasNext()) {
          ((LinkedList)localObject2).add((MMToClientEvent)localIterator.next());
        }
      }
      localObject2 = ((LinkedList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ??? = (MMToClientEvent)((Iterator)localObject2).next();
        if (paramT != null) {
          try
          {
            ((MMToClientEvent)???).hXb = 5;
            ((MMToClientEvent)???).hXc = paramT.getClass().getName();
            ((MMToClientEvent)???).hXd = paramT;
            ((MMToClientEvent)???).VL();
          }
          finally {}
        }
      }
    }
    GMTrace.o(10286044020736L, 76637);
  }
  
  public static void a(MMToClientEvent paramMMToClientEvent)
  {
    GMTrace.i(10285507149824L, 76633);
    w.i("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId:%s, MMToClientEvent.hash:%d", new Object[] { paramMMToClientEvent.appId, Integer.valueOf(paramMMToClientEvent.hashCode()) });
    if (paramMMToClientEvent.appId == null)
    {
      w.e("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId is null!!!");
      GMTrace.o(10285507149824L, 76633);
      return;
    }
    synchronized (hXj)
    {
      if (hXj.get(paramMMToClientEvent.appId) == null)
      {
        hXj.put(paramMMToClientEvent.appId, paramMMToClientEvent);
        GMTrace.o(10285507149824L, 76633);
        return;
      }
      w.d("MicroMsg.MMToClientEventCenter", "The CommonConfig is already exist!~ so replace it");
      hXj.remove(paramMMToClientEvent.appId);
      hXj.put(paramMMToClientEvent.appId, paramMMToClientEvent);
    }
  }
  
  public static void ah(String paramString, int paramInt)
  {
    GMTrace.i(10285909803008L, 76636);
    w.i("MicroMsg.MMToClientEventCenter", "notify unread:%d", new Object[] { Integer.valueOf(paramInt) });
    synchronized (hXj)
    {
      paramString = (MMToClientEvent)hXj.get(paramString);
      if (paramString == null) {}
    }
    w.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
    GMTrace.o(10285909803008L, 76636);
  }
  
  public static void b(MMToClientEvent paramMMToClientEvent)
  {
    GMTrace.i(10285641367552L, 76634);
    w.i("MicroMsg.MMToClientEventCenter", "unregister MMToClientEvent.appId:%s", new Object[] { paramMMToClientEvent.appId });
    synchronized (hXj)
    {
      hXj.remove(paramMMToClientEvent.appId);
      GMTrace.o(10285641367552L, 76634);
      return;
    }
  }
  
  public static void h(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(10285775585280L, 76635);
    w.i("MicroMsg.MMToClientEventCenter", "notify appId:%s, type:%d, config:%s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2 });
    MMToClientEvent localMMToClientEvent;
    synchronized (hXj)
    {
      localMMToClientEvent = (MMToClientEvent)hXj.get(paramString1);
      if (localMMToClientEvent == null) {}
    }
    w.e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
    GMTrace.o(10285775585280L, 76635);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */