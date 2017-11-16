package com.tencent.mm.plugin.backup.c;

import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.backup.a.f;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.b.b.3;
import com.tencent.mm.plugin.backup.b.b.4;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b.b
{
  public com.tencent.mm.plugin.backup.b.b iXk;
  public b.b iXl;
  public long iXm;
  private LinkedList<com.tencent.mm.plugin.backup.a.d> iXn;
  private LinkedList<com.tencent.mm.plugin.backup.a.d> iXo;
  public LinkedList<com.tencent.mm.plugin.backup.a.d> iXp;
  public boolean iXq;
  boolean iXr;
  private Object lock;
  
  public a()
  {
    GMTrace.i(9544491073536L, 71112);
    this.lock = new Object();
    this.iXn = null;
    this.iXo = null;
    this.iXp = null;
    this.iXq = false;
    this.iXr = false;
    GMTrace.o(9544491073536L, 71112);
  }
  
  private static long y(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(18448092495872L, 137449);
    long l1 = 0L;
    long l2 = l1;
    if (paramLinkedList != null)
    {
      l2 = l1;
      if (paramLinkedList.size() > 0)
      {
        l1 = ((com.tencent.mm.plugin.backup.a.d)paramLinkedList.get(0)).iVi;
        paramLinkedList = paramLinkedList.iterator();
        l2 = l1;
        if (paramLinkedList.hasNext())
        {
          com.tencent.mm.plugin.backup.a.d locald = (com.tencent.mm.plugin.backup.a.d)paramLinkedList.next();
          if (l1 <= locald.iVi) {
            break label93;
          }
          l1 = locald.iVi;
        }
      }
    }
    label93:
    for (;;)
    {
      break;
      GMTrace.o(18448092495872L, 137449);
      return l2;
    }
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2, LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(18448360931328L, 137451);
    if (paramInt == 0)
    {
      this.iXo = new LinkedList(paramLinkedList);
      GMTrace.o(18448360931328L, 137451);
      return;
    }
    this.iXo = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      com.tencent.mm.plugin.backup.a.d locald = (com.tencent.mm.plugin.backup.a.d)paramLinkedList.next();
      if (com.tencent.mm.plugin.backup.g.a.afG().afH().yM().m(locald.iVh, paramLong1, paramLong2) > 0) {
        this.iXo.add(locald);
      }
    }
    GMTrace.o(18448360931328L, 137451);
  }
  
  public final void a(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList, com.tencent.mm.plugin.backup.a.d paramd, int paramInt)
  {
    GMTrace.i(18448897802240L, 137455);
    w.i("MicroMsg.BackupMoveChooseServer", "onCalcuSizeProgress.");
    this.iXn = paramLinkedList;
    if (this.iXo != null)
    {
      Iterator localIterator = this.iXo.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.backup.a.d locald = (com.tencent.mm.plugin.backup.a.d)localIterator.next();
        if (locald.iVh.equals(paramd.iVh))
        {
          locald.iVk = paramd.iVk;
          locald.iVl = paramd.iVl;
        }
      }
    }
    if (b.aeH().aeJ().iYs)
    {
      w.i("MicroMsg.BackupMoveChooseServer", "onCalcuChooseSizeFinish startRequestNotify");
      b.aeH().aei().x(13, paramInt, paramLinkedList.size());
      b.aeH().aeJ().a(b.aeH().aei());
    }
    if (this.iXl != null) {
      this.iXl.a(aeC(), paramd, paramInt);
    }
    GMTrace.o(18448897802240L, 137455);
  }
  
  public final LinkedList<com.tencent.mm.plugin.backup.a.d> aeB()
  {
    GMTrace.i(18447958278144L, 137448);
    if (this.iXn == null) {
      this.iXn = new LinkedList();
    }
    LinkedList localLinkedList = this.iXn;
    GMTrace.o(18447958278144L, 137448);
    return localLinkedList;
  }
  
  public final LinkedList<com.tencent.mm.plugin.backup.a.d> aeC()
  {
    GMTrace.i(18448226713600L, 137450);
    if (this.iXo == null) {
      this.iXo = new LinkedList();
    }
    LinkedList localLinkedList = this.iXo;
    GMTrace.o(18448226713600L, 137450);
    return localLinkedList;
  }
  
  public final LinkedList<com.tencent.mm.plugin.backup.a.d> aeD()
  {
    GMTrace.i(18448495149056L, 137452);
    if (this.iXp == null) {
      this.iXp = new LinkedList();
    }
    LinkedList localLinkedList = this.iXp;
    GMTrace.o(18448495149056L, 137452);
    return localLinkedList;
  }
  
  public final void aeE()
  {
    GMTrace.i(14822871662592L, 110439);
    this.iXn = null;
    this.iXp = null;
    this.iXo = null;
    this.iXr = false;
    this.iXq = false;
    GMTrace.o(14822871662592L, 110439);
  }
  
  public final void aeF()
  {
    GMTrace.i(18448763584512L, 137454);
    b.aeH();
    SharedPreferences localSharedPreferences = b.aen();
    a(localSharedPreferences.getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0), localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L), localSharedPreferences.getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L), aeB());
    GMTrace.o(18448763584512L, 137454);
  }
  
  public final long aeG()
  {
    GMTrace.i(9545296379904L, 71118);
    if (aeD() == null)
    {
      GMTrace.o(9545296379904L, 71118);
      return 0L;
    }
    Iterator localIterator = aeD().iterator();
    for (long l = 0L; localIterator.hasNext(); l = ((com.tencent.mm.plugin.backup.a.d)localIterator.next()).iVk + l) {}
    GMTrace.o(9545296379904L, 71118);
    return l;
  }
  
  public final void cancel()
  {
    GMTrace.i(18448629366784L, 137453);
    synchronized (this.lock)
    {
      if (this.iXk != null)
      {
        this.iXk.cancel();
        this.iXk = null;
      }
      e.f(new File(h.aer()));
      GMTrace.o(18448629366784L, 137453);
      return;
    }
  }
  
  public final void u(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(9544893726720L, 71115);
    w.i("MicroMsg.BackupMoveChooseServer", "onCalcuConvFinish.");
    this.iXq = true;
    this.iXn = new LinkedList(paramLinkedList);
    this.iXm = y(this.iXn);
    aeF();
    w.i("MicroMsg.BackupMoveChooseServer", "summerbak onCalcuConvFinish, calAllConvNames size[%d], showConvNames size[%d]", new Object[] { Integer.valueOf(aeB().size()), Integer.valueOf(aeC().size()) });
    if (this.iXl != null) {
      this.iXl.u(aeC());
    }
    GMTrace.o(9544893726720L, 71115);
  }
  
  public final void v(LinkedList<com.tencent.mm.plugin.backup.a.d> paramLinkedList)
  {
    GMTrace.i(9545162162176L, 71117);
    w.i("MicroMsg.BackupMoveChooseServer", "onCalcuSizeFinish.");
    this.iXr = true;
    this.iXn = ((LinkedList)paramLinkedList.clone());
    aeF();
    if (b.aeH().aeJ().iYs)
    {
      w.i("MicroMsg.BackupMoveChooseServer", "onCalcuChooseSizeFinish startRequestNotify");
      b.aeH().aeJ().aeT();
      GMTrace.o(9545162162176L, 71117);
      return;
    }
    if (this.iXl != null) {
      this.iXl.v(paramLinkedList);
    }
    GMTrace.o(9545162162176L, 71117);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */