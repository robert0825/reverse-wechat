package com.tencent.mm.plugin.backup.f;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.backup.h.i;
import com.tencent.mm.plugin.backup.h.j;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  extends b
{
  private i jbH;
  public j jbI;
  
  public f(LinkedList<String> paramLinkedList, long paramLong1, long paramLong2)
  {
    GMTrace.i(18462185357312L, 137554);
    this.jbH = new i();
    this.jbI = new j();
    w.i("MicroMsg.BackupRequestSessionScene", "init sessionName[%d], startTime[%d], endTime[%d]", new Object[] { Integer.valueOf(paramLinkedList.size()), Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    this.jbH.jhe = paramLinkedList;
    this.jbH.jhf = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      paramLinkedList.next();
      this.jbH.jhf.add(Long.valueOf(paramLong1));
      this.jbH.jhf.add(Long.valueOf(paramLong2));
    }
    GMTrace.o(18462185357312L, 137554);
  }
  
  public final a afr()
  {
    GMTrace.i(9509862899712L, 70854);
    j localj = this.jbI;
    GMTrace.o(9509862899712L, 70854);
    return localj;
  }
  
  public final a afs()
  {
    GMTrace.i(9509997117440L, 70855);
    i locali = this.jbH;
    GMTrace.o(9509997117440L, 70855);
    return locali;
  }
  
  public final void aft()
  {
    GMTrace.i(9510131335168L, 70856);
    if ((this.jbI.jhe == null) || (this.jbI.jhf == null) || (this.jbI.jhe.isEmpty()) || (this.jbI.jhe.size() * 2 != this.jbI.jhf.size()))
    {
      if ((this.jbI.jhe != null) && (this.jbI.jhf != null)) {
        w.e("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName and TimeInterval size error. sessionName size[%d], timeInterval size[%d]", new Object[] { Integer.valueOf(this.jbI.jhe.size()), Integer.valueOf(this.jbI.jhf.size()) });
      }
      f(4, -1, "BackupRequestSession failed");
      GMTrace.o(9510131335168L, 70856);
      return;
    }
    w.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName size[%d], name:%s", new Object[] { Integer.valueOf(this.jbI.jhe.size()), this.jbI.jhe.toString() });
    w.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd requestsession resp, TimeInterval:%s", new Object[] { this.jbI.jhf.toString() });
    f(0, 0, "BackupRequestSession success");
    GMTrace.o(9510131335168L, 70856);
  }
  
  public final int getType()
  {
    GMTrace.i(9509728681984L, 70853);
    GMTrace.o(9509728681984L, 70853);
    return 11;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\f\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */