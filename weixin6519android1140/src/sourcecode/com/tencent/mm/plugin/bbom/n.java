package com.tencent.mm.plugin.bbom;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.pluginsdk.model.app.j;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.ay.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.am;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class n
  implements r
{
  private static List<am> jjW;
  private boolean jjX;
  private boolean jjY;
  private List<au> jjZ;
  
  static
  {
    GMTrace.i(8021388296192L, 59764);
    jjW = new ArrayList();
    GMTrace.o(8021388296192L, 59764);
  }
  
  public n()
  {
    this(false);
    GMTrace.i(8020851425280L, 59760);
    GMTrace.o(8020851425280L, 59760);
  }
  
  public n(boolean paramBoolean)
  {
    GMTrace.i(8020985643008L, 59761);
    this.jjX = false;
    this.jjY = false;
    this.jjZ = new LinkedList();
    this.jjX = paramBoolean;
    this.jjY = false;
    this.jjZ = new LinkedList();
    GMTrace.o(8020985643008L, 59761);
  }
  
  public static void a(am paramam)
  {
    GMTrace.i(8020582989824L, 59758);
    synchronized (jjW)
    {
      if (!jjW.contains(paramam)) {
        jjW.add(paramam);
      }
      GMTrace.o(8020582989824L, 59758);
      return;
    }
  }
  
  public static void b(am paramam)
  {
    GMTrace.i(8020717207552L, 59759);
    synchronized (jjW)
    {
      jjW.remove(paramam);
      GMTrace.o(8020717207552L, 59759);
      return;
    }
  }
  
  public final void a(final au paramau, final bu parambu)
  {
    GMTrace.i(8021254078464L, 59763);
    if (this.jjX)
    {
      w.i("MicroMsg.SyncMessageNotifier", "mDummy is true, do nothing and return.");
      GMTrace.o(8021254078464L, 59763);
      return;
    }
    synchronized (jjW)
    {
      if (jjW.isEmpty())
      {
        w.i("MicroMsg.SyncMessageNotifier", "no notifiers, ignore");
        GMTrace.o(8021254078464L, 59763);
        return;
      }
      if ((paramau.field_isSend != 0) || (paramau.field_status == 4))
      {
        w.i("MicroMsg.SyncMessageNotifier", "not new msg, ignore");
        GMTrace.o(8021254078464L, 59763);
        return;
      }
    }
    ??? = com.tencent.mm.platformtools.n.a(parambu.tPW);
    at.AR();
    ??? = c.yS().CB(new ay.a((String)???).Ux(""));
    if ((??? != null) && (!((ay)???).bUo()))
    {
      w.d("MicroMsg.SyncMessageNotifier", "account no notification");
      GMTrace.o(8021254078464L, 59763);
      return;
    }
    if (!this.jjY)
    {
      this.jjY = true;
      final Object localObject2 = new ArrayList();
      synchronized (jjW)
      {
        Iterator localIterator = jjW.iterator();
        if (localIterator.hasNext()) {
          ((List)localObject2).add((am)localIterator.next());
        }
      }
      ??? = ((List)localObject2).iterator();
      while (((Iterator)???).hasNext())
      {
        localObject2 = (am)((Iterator)???).next();
        new ae(((am)localObject2).getLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8027964964864L, 59813);
            if (parambu.lQc == 49)
            {
              f.a locala = f.a.eS(j.c(parambu));
              if ((locala.gjP == 1) && (!bg.nm(locala.gjQ)) && (!bg.nm(locala.gjR)))
              {
                localObject2.a(39, locala.gjR, "", locala.gjQ, null, null);
                GMTrace.o(8027964964864L, 59813);
                return;
              }
              localObject2.a(paramau);
              GMTrace.o(8027964964864L, 59813);
              return;
            }
            localObject2.a(paramau);
            GMTrace.o(8027964964864L, 59813);
          }
        });
      }
      GMTrace.o(8021254078464L, 59763);
      return;
    }
    this.jjZ.add(paramau);
    GMTrace.o(8021254078464L, 59763);
  }
  
  public final void agV()
  {
    GMTrace.i(8021119860736L, 59762);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.jjZ);
    this.jjZ.clear();
    if (localLinkedList.size() == 0)
    {
      GMTrace.o(8021119860736L, 59762);
      return;
    }
    final Object localObject2 = new ArrayList();
    synchronized (jjW)
    {
      Iterator localIterator = jjW.iterator();
      if (localIterator.hasNext()) {
        ((List)localObject2).add((am)localIterator.next());
      }
    }
    ??? = ((List)localObject2).iterator();
    while (((Iterator)???).hasNext())
    {
      localObject2 = (am)((Iterator)???).next();
      new ae(((am)localObject2).getLooper()).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8030649319424L, 59833);
          localObject2.q(localList);
          GMTrace.o(8030649319424L, 59833);
        }
      });
    }
    GMTrace.o(8021119860736L, 59762);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\bbom\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */