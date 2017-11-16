package com.tencent.mm.plugin.appbrand.collector;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class h
  implements b
{
  private Map<String, CollectSession> hOK;
  private Map<String, Set<CollectSession>> hOL;
  
  public h()
  {
    GMTrace.i(20007031406592L, 149064);
    this.hOK = new a();
    this.hOL = new a();
    GMTrace.o(20007031406592L, 149064);
  }
  
  private boolean a(String paramString, CollectSession paramCollectSession)
  {
    GMTrace.i(20007165624320L, 149065);
    if ((paramString == null) || (paramString.length() == 0) || (paramCollectSession == null))
    {
      GMTrace.o(20007165624320L, 149065);
      return false;
    }
    Set localSet = (Set)this.hOL.get(paramString);
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new LinkedHashSet();
      this.hOL.put(paramString, localObject);
    }
    boolean bool = ((Set)localObject).add(paramCollectSession);
    GMTrace.o(20007165624320L, 149065);
    return bool;
  }
  
  private Set<CollectSession> oX(String paramString)
  {
    GMTrace.i(20007299842048L, 149066);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(20007299842048L, 149066);
      return null;
    }
    paramString = (Set)this.hOL.get(paramString);
    GMTrace.o(20007299842048L, 149066);
    return paramString;
  }
  
  private CollectSession oY(String paramString)
  {
    GMTrace.i(20007568277504L, 149068);
    CollectSession localCollectSession2 = (CollectSession)this.hOK.get(paramString);
    CollectSession localCollectSession1 = localCollectSession2;
    if (localCollectSession2 == null)
    {
      localCollectSession1 = new CollectSession(paramString);
      this.hOK.put(paramString, localCollectSession1);
    }
    GMTrace.o(20007568277504L, 149068);
    return localCollectSession1;
  }
  
  public final void a(CollectSession paramCollectSession)
  {
    GMTrace.i(20007702495232L, 149069);
    String str = paramCollectSession.id;
    CollectSession localCollectSession = (CollectSession)this.hOK.get(str);
    if (localCollectSession == null)
    {
      this.hOK.put(str, paramCollectSession);
      a(paramCollectSession.groupId, paramCollectSession);
      GMTrace.o(20007702495232L, 149069);
      return;
    }
    Object localObject = paramCollectSession.hOA;
    paramCollectSession = (CollectSession)localObject;
    if (localCollectSession.hOA == null)
    {
      localCollectSession.hOA = ((TimePoint)localObject);
      GMTrace.o(20007702495232L, 149069);
      return;
    }
    if (paramCollectSession != null)
    {
      localObject = paramCollectSession.name;
      long l = paramCollectSession.hON.get();
      if ((str == null) || (str.length() == 0)) {}
      for (;;)
      {
        paramCollectSession = (TimePoint)paramCollectSession.hOO.get();
        break;
        localCollectSession = oY(str);
        if (localCollectSession.hOA == null)
        {
          localCollectSession.oN((String)localObject);
          localCollectSession.hOA.hON.set(l);
        }
        else
        {
          TimePoint localTimePoint = (TimePoint)localCollectSession.hOC.get(localObject);
          if (localTimePoint == null)
          {
            localCollectSession.oO((String)localObject);
            localCollectSession.hOB.hON.set(l);
          }
          else
          {
            localTimePoint.hON.set((l + localTimePoint.hON.get() * localTimePoint.hOM.get()) / (localTimePoint.hOM.get() + 1));
            localTimePoint.hOM.getAndIncrement();
          }
        }
      }
    }
    GMTrace.o(20007702495232L, 149069);
  }
  
  public final CollectSession aM(String paramString1, String paramString2)
  {
    GMTrace.i(20007836712960L, 149070);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      w.i("MicroMsg.SumCostTimeCollector", "join(%s) failed, sessionId is null or nil.", new Object[] { paramString2 });
      GMTrace.o(20007836712960L, 149070);
      return null;
    }
    paramString1 = oY(paramString1);
    if (paramString1.hOA == null) {
      paramString1.oN(paramString2);
    }
    for (;;)
    {
      GMTrace.o(20007836712960L, 149070);
      return paramString1;
      paramString1.oO(paramString2);
    }
  }
  
  public final void aN(String paramString1, String paramString2)
  {
    GMTrace.i(20008507801600L, 149075);
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      w.i("MicroMsg.SumCostTimeCollector", "setLastPointName(%s, %s) failed, sessionId is null or nil.", new Object[] { paramString1, paramString2 });
      GMTrace.o(20008507801600L, 149075);
      return;
    }
    CollectSession localCollectSession = (CollectSession)this.hOK.get(paramString1);
    if (localCollectSession == null)
    {
      w.i("MicroMsg.SumCostTimeCollector", "setLastPointName(%s, %s) failed,", new Object[] { paramString1, paramString2 });
      GMTrace.o(20008507801600L, 149075);
      return;
    }
    localCollectSession.hOD = paramString2;
    GMTrace.o(20008507801600L, 149075);
  }
  
  public final int aO(String paramString1, String paramString2)
  {
    GMTrace.i(20008910454784L, 149078);
    Set localSet = oX(paramString1);
    if ((localSet == null) || (localSet.isEmpty()))
    {
      w.i("MicroMsg.SumCostTimeCollector", "printAverage failed, set(%s) is empty.", new Object[] { paramString1 });
      GMTrace.o(20008910454784L, 149078);
      return 0;
    }
    paramString1 = new LinkedHashSet(localSet).iterator();
    int i = 0;
    int j = 0;
    while (paramString1.hasNext())
    {
      int k = ((CollectSession)paramString1.next()).eJV.getInt(paramString2);
      if (k != 0)
      {
        j += k;
        i += 1;
      }
    }
    if (i == 0)
    {
      GMTrace.o(20008910454784L, 149078);
      return 0;
    }
    i = j / i;
    GMTrace.o(20008910454784L, 149078);
    return i;
  }
  
  public final void c(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    GMTrace.i(20008105148416L, 149072);
    if (!paramBoolean)
    {
      GMTrace.o(20008105148416L, 149072);
      return;
    }
    if ((paramString2 == null) || (paramString2.length() == 0))
    {
      w.i("MicroMsg.SumCostTimeCollector", "tryToJoin(%s) failed, sessionId is null or nil.", new Object[] { paramString3 });
      GMTrace.o(20008105148416L, 149072);
      return;
    }
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      w.i("MicroMsg.SumCostTimeCollector", "tryToJoin(%s) failed, groupId is null or nil.", new Object[] { paramString3 });
      GMTrace.o(20008105148416L, 149072);
      return;
    }
    paramString2 = oY(paramString2);
    if (paramString2.hOA == null)
    {
      paramString2.groupId = paramString1;
      a(paramString1, paramString2);
      paramString2.oN(paramString3);
      GMTrace.o(20008105148416L, 149072);
      return;
    }
    paramString2.oO(paramString3);
    GMTrace.o(20008105148416L, 149072);
  }
  
  public final void clear()
  {
    GMTrace.i(20007434059776L, 149067);
    this.hOK.clear();
    this.hOL.clear();
    GMTrace.o(20007434059776L, 149067);
  }
  
  public final void f(String paramString1, String paramString2, boolean paramBoolean)
  {
    GMTrace.i(20007970930688L, 149071);
    if (!paramBoolean)
    {
      GMTrace.o(20007970930688L, 149071);
      return;
    }
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      w.i("MicroMsg.SumCostTimeCollector", "tryToJoin(%s) failed, sessionId is null or nil.", new Object[] { paramString2 });
      GMTrace.o(20007970930688L, 149071);
      return;
    }
    paramString1 = oY(paramString1);
    if (paramString1.hOA == null)
    {
      paramString1.oN(paramString2);
      GMTrace.o(20007970930688L, 149071);
      return;
    }
    paramString1.oO(paramString2);
    GMTrace.o(20007970930688L, 149071);
  }
  
  public final CollectSession oP(String paramString)
  {
    GMTrace.i(20008239366144L, 149073);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(20008239366144L, 149073);
      return null;
    }
    paramString = (CollectSession)this.hOK.get(paramString);
    GMTrace.o(20008239366144L, 149073);
    return paramString;
  }
  
  public final CollectSession oQ(String paramString)
  {
    GMTrace.i(20008373583872L, 149074);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(20008373583872L, 149074);
      return null;
    }
    paramString = (CollectSession)this.hOK.remove(paramString);
    GMTrace.o(20008373583872L, 149074);
    return paramString;
  }
  
  public final StringBuilder oR(String paramString)
  {
    GMTrace.i(20008776237056L, 149077);
    Object localObject = oX(paramString);
    if ((localObject == null) || (((Set)localObject).isEmpty()))
    {
      w.i("MicroMsg.SumCostTimeCollector", "printAverage failed, set(%s) is empty.", new Object[] { paramString });
      paramString = new StringBuilder().append(String.format("GroupId : %s, size : 0\n", new Object[] { paramString }));
      GMTrace.o(20008776237056L, 149077);
      return paramString;
    }
    LinkedHashSet localLinkedHashSet = new LinkedHashSet((Collection)localObject);
    TimePoint localTimePoint2 = new TimePoint();
    Iterator localIterator = localLinkedHashSet.iterator();
    while (localIterator.hasNext())
    {
      localObject = (CollectSession)localIterator.next();
      if ((((CollectSession)localObject).hOB == null) || ((((CollectSession)localObject).hOD != null) && (!((CollectSession)localObject).hOB.name.equals(((CollectSession)localObject).hOD))))
      {
        w.e("MicroMsg.SumCostTimeCollector", "error(%s), incorrect point count", new Object[] { ((CollectSession)localObject).id });
      }
      else
      {
        TimePoint localTimePoint1 = ((CollectSession)localObject).hOA;
        for (localObject = localTimePoint2; localTimePoint1 != null; localObject = (TimePoint)((TimePoint)localObject).hOO.get())
        {
          ((TimePoint)localObject).hON.set((((TimePoint)localObject).hON.get() * ((TimePoint)localObject).hOM.get() + localTimePoint1.hON.get()) / ((TimePoint)localObject).hOM.incrementAndGet());
          ((TimePoint)localObject).name = localTimePoint1.name;
          localTimePoint1 = (TimePoint)localTimePoint1.hOO.get();
          if ((((TimePoint)localObject).hOO.get() == null) && (localTimePoint1 != null)) {
            ((TimePoint)localObject).hOO.set(new TimePoint());
          }
        }
      }
    }
    localObject = e.a(localTimePoint2);
    ((StringBuilder)localObject).insert(0, String.format("GroupId : %s, size : %d\n", new Object[] { paramString, Integer.valueOf(localLinkedHashSet.size()) }));
    GMTrace.o(20008776237056L, 149077);
    return (StringBuilder)localObject;
  }
  
  public final void print(String paramString)
  {
    GMTrace.i(20008642019328L, 149076);
    CollectSession localCollectSession = (CollectSession)this.hOK.get(paramString);
    if (localCollectSession == null)
    {
      w.i("MicroMsg.SumCostTimeCollector", "print failed, session(%s) is null", new Object[] { paramString });
      GMTrace.o(20008642019328L, 149076);
      return;
    }
    TimePoint localTimePoint = localCollectSession.hOA;
    if (localTimePoint == null)
    {
      w.i("MicroMsg.SumCostTimeCollector", "print failed, the session(%s) do not have any point.", new Object[] { paramString });
      GMTrace.o(20008642019328L, 149076);
      return;
    }
    paramString = e.a(localTimePoint);
    paramString.insert(0, String.format("session : %s\n", new Object[] { localCollectSession.id }));
    w.i("MicroMsg.SumCostTimeCollector", "%s", new Object[] { paramString.toString() });
    GMTrace.o(20008642019328L, 149076);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\collector\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */