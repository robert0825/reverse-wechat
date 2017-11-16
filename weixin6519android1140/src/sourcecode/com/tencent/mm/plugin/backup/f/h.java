package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.backup.e.a.c;
import com.tencent.mm.plugin.backup.h.af;
import com.tencent.mm.plugin.backup.h.ag;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class h
  extends b
{
  private af jbL;
  private ag jbM;
  private a jbN;
  
  public h(String paramString, HashMap<Long, a.c> paramHashMap, a parama)
  {
    GMTrace.i(9510265552896L, 70857);
    this.jbL = new af();
    this.jbM = new ag();
    this.jbN = parama;
    this.jbL.jha = paramString;
    w.i("MicroMsg.BackupSvrIdScene", "init sessionName:%s", new Object[] { paramString });
    this.jbL.jiw = new LinkedList();
    this.jbL.jix = new LinkedList();
    this.jbL.jiy = new LinkedList();
    paramString = paramHashMap.keySet().iterator();
    while (paramString.hasNext())
    {
      parama = (a.c)paramHashMap.get((Long)paramString.next());
      this.jbL.jiw.add(Long.valueOf(parama.iZG));
      this.jbL.jix.add(parama.iZH);
      this.jbL.jiy.add(parama.eDW);
    }
    GMTrace.o(9510265552896L, 70857);
  }
  
  public final a afr()
  {
    GMTrace.i(9510533988352L, 70859);
    ag localag = this.jbM;
    GMTrace.o(9510533988352L, 70859);
    return localag;
  }
  
  public final a afs()
  {
    GMTrace.i(9510668206080L, 70860);
    af localaf = this.jbL;
    GMTrace.o(9510668206080L, 70860);
    return localaf;
  }
  
  public final void aft()
  {
    GMTrace.i(9510802423808L, 70861);
    w.i("MicroMsg.BackupSvrIdScene", "onSceneEnd");
    f(0, 0, "success");
    this.jbN.x(this.jbM.jiw);
    GMTrace.o(9510802423808L, 70861);
  }
  
  public final int getType()
  {
    GMTrace.i(9510399770624L, 70858);
    GMTrace.o(9510399770624L, 70858);
    return 13;
  }
  
  public static abstract interface a
  {
    public abstract void x(LinkedList<Long> paramLinkedList);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\f\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */