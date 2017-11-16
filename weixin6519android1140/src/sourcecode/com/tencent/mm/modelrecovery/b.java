package com.tencent.mm.modelrecovery;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.recovery.model.RecoveryStatusItem;
import com.tencent.recovery.report.RecoveryReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  public static HashMap<String, Integer> gQA;
  
  static
  {
    GMTrace.i(4514279063552L, 33634);
    HashMap localHashMap = new HashMap();
    gQA = localHashMap;
    localHashMap.put(ab.getPackageName(), Integer.valueOf(0));
    gQA.put(ab.getPackageName() + ":push", Integer.valueOf(20));
    gQA.put(ab.getPackageName() + ":tools", Integer.valueOf(40));
    gQA.put(ab.getPackageName() + ":exdevice", Integer.valueOf(60));
    gQA.put(ab.getPackageName() + ":sandbox", Integer.valueOf(80));
    GMTrace.o(4514279063552L, 33634);
  }
  
  private static void b(HashMap<String, a> paramHashMap)
  {
    GMTrace.i(4514010628096L, 33632);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      if (gQA.containsKey(((Map.Entry)localObject).getKey()))
      {
        int i = ((Integer)gQA.get(((Map.Entry)localObject).getKey())).intValue();
        localObject = (a)((Map.Entry)localObject).getValue();
        IDKey localIDKey;
        if (((a)localObject).gQB > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 0);
          localIDKey.SetValue(((a)localObject).gQB);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).gQC > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 1);
          localIDKey.SetValue(((a)localObject).gQC);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).gQD > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 2);
          localIDKey.SetValue(((a)localObject).gQD);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).gQE > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 3);
          localIDKey.SetValue(((a)localObject).gQE);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).gQF > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 4);
          localIDKey.SetValue(((a)localObject).gQF);
          localArrayList.add(localIDKey);
        }
        if (((a)localObject).gQG > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 5);
          localIDKey.SetValue(((a)localObject).gQG);
          localArrayList.add(localIDKey);
        }
      }
    }
    if (localArrayList.size() > 0) {
      g.ork.b(localArrayList, true);
    }
    w.i("MicroMsg.Recovery.WXRecoveryReporter", "report recovery generalObj %s %s", new Object[] { ab.vM(), paramHashMap.toString() });
    GMTrace.o(4514010628096L, 33632);
  }
  
  private static void c(HashMap<String, b> paramHashMap)
  {
    GMTrace.i(4514144845824L, 33633);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      if (gQA.containsKey(((Map.Entry)localObject).getKey()))
      {
        int i = ((Integer)gQA.get(((Map.Entry)localObject).getKey())).intValue();
        localObject = (b)((Map.Entry)localObject).getValue();
        IDKey localIDKey;
        if (((b)localObject).gQH > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 0);
          localIDKey.SetValue(((b)localObject).gQH);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQI > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 1);
          localIDKey.SetValue(((b)localObject).gQI);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQJ > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 2);
          localIDKey.SetValue(((b)localObject).gQJ);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQK > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 3);
          localIDKey.SetValue(((b)localObject).gQK);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQL > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 4);
          localIDKey.SetValue(((b)localObject).gQL);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQM > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 5);
          localIDKey.SetValue(((b)localObject).gQM);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQN > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 6);
          localIDKey.SetValue(((b)localObject).gQN);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQO > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 7);
          localIDKey.SetValue(((b)localObject).gQO);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQP > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 8);
          localIDKey.SetValue(((b)localObject).gQP);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQQ > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 9);
          localIDKey.SetValue(((b)localObject).gQQ);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQR > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 10);
          localIDKey.SetValue(((b)localObject).gQR);
          localArrayList.add(localIDKey);
        }
        if (((b)localObject).gQS > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 11);
          localIDKey.SetValue(((b)localObject).gQS);
          localArrayList.add(localIDKey);
        }
      }
    }
    if (localArrayList.size() > 0) {
      g.ork.b(localArrayList, true);
    }
    w.i("MicroMsg.Recovery.WXRecoveryReporter", "report recovery statusObj %s %s", new Object[] { ab.vM(), paramHashMap.toString() });
    GMTrace.o(4514144845824L, 33633);
  }
  
  public static void reportStatus()
  {
    GMTrace.i(4513876410368L, 33631);
    Object localObject = RecoveryReporter.a(ab.getContext(), "ProcessStatus", RecoveryStatusItem.class);
    w.i("MicroMsg.Recovery.WXRecoveryReporter", "reportStatus " + ((List)localObject).size());
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Iterator localIterator = ((List)localObject).iterator();
    if (localIterator.hasNext())
    {
      RecoveryStatusItem localRecoveryStatusItem = (RecoveryStatusItem)localIterator.next();
      label117:
      b localb;
      label144:
      label173:
      int i;
      if (localHashMap1.containsKey(localRecoveryStatusItem.processName))
      {
        localObject = (a)localHashMap1.get(localRecoveryStatusItem.processName);
        if (!localHashMap2.containsKey(localRecoveryStatusItem.processName)) {
          break label257;
        }
        localb = (b)localHashMap2.get(localRecoveryStatusItem.processName);
        ((a)localObject).gQB += 1;
        if (localRecoveryStatusItem.xPu != 1) {
          break label268;
        }
        ((a)localObject).gQE += 1;
        i = 0;
        switch (localRecoveryStatusItem.xPw)
        {
        }
      }
      for (;;)
      {
        if (i == 0) {
          w.i("MicroMsg.Recovery.WXRecoveryReporter", "recovery statics not set exception");
        }
        localHashMap1.put(localRecoveryStatusItem.processName, localObject);
        localHashMap2.put(localRecoveryStatusItem.processName, localb);
        break;
        localObject = new a();
        break label117;
        label257:
        localb = new b();
        break label144;
        label268:
        ((a)localObject).gQF += 1;
        break label173;
        if (localRecoveryStatusItem.xPu == 1)
        {
          localb.gQH += 1;
          switch (localRecoveryStatusItem.xPx)
          {
          default: 
            break;
          case 4096: 
            localb.gQP += 1;
            i = 1;
            break;
          case 65536: 
          case 1048576: 
            localb.gQL += 1;
            i = 1;
            break;
          }
        }
        else
        {
          localb.gQI += 1;
          switch (localRecoveryStatusItem.xPx)
          {
          default: 
            break;
          case 4096: 
            localb.gQQ += 1;
            i = 1;
            break;
          case 65536: 
          case 1048576: 
            localb.gQM += 1;
            i = 1;
            continue;
            if (localRecoveryStatusItem.xPu == 1)
            {
              localb.gQJ += 1;
              switch (localRecoveryStatusItem.xPx)
              {
              default: 
                break;
              case 4096: 
                localb.gQR += 1;
                i = 1;
                break;
              case 65536: 
              case 1048576: 
                localb.gQN += 1;
                i = 1;
                break;
              }
            }
            else
            {
              localb.gQK += 1;
              switch (localRecoveryStatusItem.xPx)
              {
              default: 
                break;
              case 4096: 
                localb.gQS += 1;
                i = 1;
                break;
              case 65536: 
              case 1048576: 
                localb.gQO += 1;
                i = 1;
              }
            }
            break;
          }
        }
      }
    }
    b(localHashMap1);
    c(localHashMap2);
    RecoveryReporter.bt(ab.getContext(), "ProcessStatus");
    GMTrace.o(4513876410368L, 33631);
  }
  
  public static final class a
  {
    public int gQB;
    public int gQC;
    public int gQD;
    public int gQE;
    public int gQF;
    public int gQG;
    
    public a()
    {
      GMTrace.i(4512131579904L, 33618);
      GMTrace.o(4512131579904L, 33618);
    }
    
    public final String toString()
    {
      GMTrace.i(4512265797632L, 33619);
      Object localObject = new StringBuffer();
      if (this.gQB > 0) {
        ((StringBuffer)localObject).append("totalCount:" + this.gQB + " ");
      }
      if (this.gQC > 0) {
        ((StringBuffer)localObject).append("enterRecoveryCount:" + this.gQC + " ");
      }
      if (this.gQD > 0) {
        ((StringBuffer)localObject).append("existRecoveryProcessCount:" + this.gQD + " ");
      }
      if (this.gQE > 0) {
        ((StringBuffer)localObject).append("foregroundExpCount:" + this.gQE + " ");
      }
      if (this.gQF > 0) {
        ((StringBuffer)localObject).append("backgroundExpCount:" + this.gQF + " ");
      }
      if (this.gQG > 0) {
        ((StringBuffer)localObject).append("normalCount:" + this.gQG + " ");
      }
      localObject = ((StringBuffer)localObject).toString();
      GMTrace.o(4512265797632L, 33619);
      return (String)localObject;
    }
  }
  
  public static final class b
  {
    public int gQH;
    public int gQI;
    public int gQJ;
    public int gQK;
    public int gQL;
    public int gQM;
    public int gQN;
    public int gQO;
    public int gQP;
    public int gQQ;
    public int gQR;
    public int gQS;
    
    public b()
    {
      GMTrace.i(4511863144448L, 33616);
      GMTrace.o(4511863144448L, 33616);
    }
    
    public final String toString()
    {
      GMTrace.i(4511997362176L, 33617);
      Object localObject = new StringBuffer();
      if (this.gQH > 0) {
        ((StringBuffer)localObject).append("appForegroundExpCount:" + this.gQH + " ");
      }
      if (this.gQI > 0) {
        ((StringBuffer)localObject).append("appBackgroundExpCount:" + this.gQI + " ");
      }
      if (this.gQJ > 0) {
        ((StringBuffer)localObject).append("componentForegroundExpCount:" + this.gQJ + " ");
      }
      if (this.gQK > 0) {
        ((StringBuffer)localObject).append("componentBackgroundExpCount:" + this.gQK + " ");
      }
      if (this.gQL > 0) {
        ((StringBuffer)localObject).append("appForegroundCrashOrAnrExpCount:" + this.gQL + " ");
      }
      if (this.gQM > 0) {
        ((StringBuffer)localObject).append("appBackgroundCrashOrAnrExpCount:" + this.gQM + " ");
      }
      if (this.gQN > 0) {
        ((StringBuffer)localObject).append("componentForegroundCrashOrAnrExpCount:" + this.gQN + " ");
      }
      if (this.gQO > 0) {
        ((StringBuffer)localObject).append("componentBackgroundCrashOrAnrExpCount:" + this.gQO + " ");
      }
      if (this.gQP > 0) {
        ((StringBuffer)localObject).append("appForegroundTimeoutExpCount:" + this.gQP + " ");
      }
      if (this.gQQ > 0) {
        ((StringBuffer)localObject).append("appBackgroundTimeoutExpCount:" + this.gQQ + " ");
      }
      if (this.gQR > 0) {
        ((StringBuffer)localObject).append("componentForegroundTimeoutExpCount:" + this.gQR + " ");
      }
      if (this.gQS > 0) {
        ((StringBuffer)localObject).append("componentBackgroundTimeoutExpCount:" + this.gQS + " ");
      }
      localObject = ((StringBuffer)localObject).toString();
      GMTrace.o(4511997362176L, 33617);
      return (String)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\modelrecovery\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */