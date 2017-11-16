package com.tencent.mm.sdk.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class z
{
  public static b fIF;
  private static int vic;
  public static Map<Integer, z> vie;
  private static boolean vig;
  public static boolean vih;
  private final boolean grS;
  public long gra;
  public long qPW;
  public final int vid;
  private final a vif;
  
  static
  {
    GMTrace.i(13870328446976L, 103342);
    vie = new HashMap();
    vig = false;
    GMTrace.o(13870328446976L, 103342);
  }
  
  public z(a parama)
  {
    GMTrace.i(13869791576064L, 103338);
    this.gra = 0L;
    this.qPW = 0L;
    Assert.assertTrue("bumper not initialized", vig);
    this.vif = parama;
    this.grS = true;
    if (vic >= 8192) {
      vic = 0;
    }
    int i = vic + 1;
    vic = i;
    this.vid = i;
    GMTrace.o(13869791576064L, 103338);
  }
  
  public static void a(b paramb)
  {
    GMTrace.i(13869523140608L, 103336);
    vig = true;
    fIF = paramb;
    GMTrace.o(13869523140608L, 103336);
  }
  
  public static long bPP()
  {
    GMTrace.i(13869925793792L, 103339);
    vih = false;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new HashSet();
    ((Set)localObject).addAll(vie.keySet());
    localObject = ((Set)localObject).iterator();
    long l1 = Long.MAX_VALUE;
    if (((Iterator)localObject).hasNext())
    {
      Integer localInteger = (Integer)((Iterator)localObject).next();
      z localz = (z)vie.get(localInteger);
      if (localz == null) {
        break label289;
      }
      long l3 = bg.aI(localz.gra);
      long l2 = l3;
      if (l3 < 0L) {
        l2 = 0L;
      }
      if (l2 > localz.qPW)
      {
        if ((!localz.vif.pM()) || (!localz.grS)) {
          localLinkedList.add(localInteger);
        }
        for (;;)
        {
          localz.gra = bg.Pw();
          break;
          l1 = localz.qPW;
        }
      }
      if (localz.qPW - l2 >= l1) {
        break label289;
      }
      l1 = localz.qPW - l2;
    }
    label289:
    for (;;)
    {
      break;
      int i = 0;
      while (i < localLinkedList.size())
      {
        vie.remove(localLinkedList.get(i));
        i += 1;
      }
      if ((!vih) && (l1 == Long.MAX_VALUE) && (fIF != null))
      {
        fIF.cancel();
        w.v("MicroMsg.MAlarmHandler", "cancel bumper for no more handler");
      }
      GMTrace.o(13869925793792L, 103339);
      return l1;
    }
  }
  
  public static boolean eI(long paramLong)
  {
    GMTrace.i(13870194229248L, 103341);
    w.d("MicroMsg.MAlarmHandler", "check need prepare: check=" + paramLong);
    Iterator localIterator = vie.entrySet().iterator();
    long l1 = Long.MAX_VALUE;
    while (localIterator.hasNext())
    {
      z localz = (z)((Map.Entry)localIterator.next()).getValue();
      if (localz == null) {
        break label178;
      }
      long l3 = bg.aI(localz.gra);
      long l2 = l3;
      if (l3 < 0L) {
        l2 = 0L;
      }
      if (l2 > localz.qPW)
      {
        l1 = localz.qPW;
      }
      else
      {
        if (localz.qPW - l2 >= l1) {
          break label178;
        }
        l1 = localz.qPW - l2;
      }
    }
    label178:
    for (;;)
    {
      break;
      if (l1 > paramLong)
      {
        GMTrace.o(13870194229248L, 103341);
        return true;
      }
      GMTrace.o(13870194229248L, 103341);
      return false;
    }
  }
  
  protected final void finalize()
  {
    GMTrace.i(13869657358336L, 103337);
    stopTimer();
    super.finalize();
    GMTrace.o(13869657358336L, 103337);
  }
  
  public final void stopTimer()
  {
    GMTrace.i(13870060011520L, 103340);
    vie.remove(Integer.valueOf(this.vid));
    GMTrace.o(13870060011520L, 103340);
  }
  
  public static abstract interface a
  {
    public abstract boolean pM();
  }
  
  public static abstract interface b
  {
    public abstract void cancel();
    
    public abstract void prepare();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */