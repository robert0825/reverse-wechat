package com.tencent.mm.ui.widget;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

public final class k
{
  private static LinkedList<WeakReference<a>> xsC;
  
  static
  {
    GMTrace.i(1647522611200L, 12275);
    xsC = new LinkedList();
    GMTrace.o(1647522611200L, 12275);
  }
  
  public static void a(a parama)
  {
    GMTrace.i(1646985740288L, 12271);
    w.d("MicroMsg.SwipeBackHelper", "pushCallback size %d, %s", new Object[] { Integer.valueOf(xsC.size()), parama });
    parama = new WeakReference(parama);
    xsC.add(0, parama);
    GMTrace.o(1646985740288L, 12271);
  }
  
  public static void aA(float paramFloat)
  {
    GMTrace.i(1647254175744L, 12273);
    if (xsC.size() <= 0)
    {
      w.w("MicroMsg.SwipeBackHelper", "notifySwipe callback stack empty!, scrollParent:%f", new Object[] { Float.valueOf(paramFloat) });
      GMTrace.o(1647254175744L, 12273);
      return;
    }
    a locala = (a)((WeakReference)xsC.get(0)).get();
    if (locala == null)
    {
      w.w("MicroMsg.SwipeBackHelper", "notifySwipe null, scrollParent:%f", new Object[] { Float.valueOf(paramFloat) });
      GMTrace.o(1647254175744L, 12273);
      return;
    }
    locala.U(paramFloat);
    w.v("MicroMsg.SwipeBackHelper", "notifySwipe scrollParent:%f, callback:%s ", new Object[] { Float.valueOf(paramFloat), locala });
    GMTrace.o(1647254175744L, 12273);
  }
  
  public static boolean b(a parama)
  {
    GMTrace.i(1647119958016L, 12272);
    int j = xsC.size();
    w.d("MicroMsg.SwipeBackHelper", "popCallback size %d, %s", new Object[] { Integer.valueOf(j), parama });
    if (parama == null)
    {
      GMTrace.o(1647119958016L, 12272);
      return true;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    for (;;)
    {
      if (i < xsC.size())
      {
        if (parama == ((WeakReference)xsC.get(i)).get())
        {
          xsC.remove(i);
          w.d("MicroMsg.SwipeBackHelper", "popCallback directly, index %d", new Object[] { Integer.valueOf(i) });
        }
      }
      else
      {
        if ((parama.Zo()) || (localLinkedList.size() != j)) {
          break;
        }
        w.d("MicroMsg.SwipeBackHelper", "popCallback Fail! Maybe Top Activity");
        GMTrace.o(1647119958016L, 12272);
        return false;
      }
      localLinkedList.add(0, Integer.valueOf(i));
      i += 1;
    }
    Iterator localIterator = localLinkedList.iterator();
    if (localIterator.hasNext())
    {
      parama = (Integer)localIterator.next();
      parama = (WeakReference)xsC.remove(parama.intValue());
      if (parama != null) {}
      for (parama = parama.get();; parama = "NULL-CALLBACK")
      {
        w.d("MicroMsg.SwipeBackHelper", "popCallback, popup %s", new Object[] { parama });
        break;
      }
    }
    boolean bool = localLinkedList.isEmpty();
    GMTrace.o(1647119958016L, 12272);
    return bool;
  }
  
  public static void x(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(1647388393472L, 12274);
    if (xsC.size() <= 0)
    {
      w.w("MicroMsg.SwipeBackHelper", "notifySettle callback stack empty!, open:%B, speed:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
      GMTrace.o(1647388393472L, 12274);
      return;
    }
    a locala = (a)((WeakReference)xsC.get(0)).get();
    if (locala == null)
    {
      w.w("MicroMsg.SwipeBackHelper", "notifySettle null, open:%B, speed:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
      GMTrace.o(1647388393472L, 12274);
      return;
    }
    locala.f(paramBoolean, paramInt);
    w.v("MicroMsg.SwipeBackHelper", "notifySettle, open:%B speed:%d callback:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), locala });
    GMTrace.o(1647388393472L, 12274);
  }
  
  public static abstract interface a
  {
    public abstract void U(float paramFloat);
    
    public abstract boolean Zo();
    
    public abstract void f(boolean paramBoolean, int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */