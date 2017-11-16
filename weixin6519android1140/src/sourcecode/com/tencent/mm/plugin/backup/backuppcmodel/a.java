package com.tencent.mm.plugin.backup.backuppcmodel;

import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.backup.a.d;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.b.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b.a
{
  public long iXm;
  private LinkedList<d> iXn;
  private LinkedList<d> iXo;
  private LinkedList<d> iXp;
  public boolean iXq;
  public com.tencent.mm.plugin.backup.b.b iYo;
  public boolean jaj;
  public b.a jak;
  private Object lock;
  
  public a()
  {
    GMTrace.i(18464735494144L, 137573);
    this.jaj = false;
    this.lock = new Object();
    this.iXn = null;
    this.iXo = null;
    this.iXp = null;
    this.iXq = false;
    GMTrace.o(18464735494144L, 137573);
  }
  
  private LinkedList<d> aeD()
  {
    GMTrace.i(18465540800512L, 137579);
    if (this.iXp == null) {
      this.iXp = new LinkedList();
    }
    LinkedList localLinkedList = this.iXp;
    GMTrace.o(18465540800512L, 137579);
    return localLinkedList;
  }
  
  private static long y(LinkedList<d> paramLinkedList)
  {
    GMTrace.i(18464869711872L, 137574);
    long l1 = 0L;
    long l2 = l1;
    if (paramLinkedList != null)
    {
      l2 = l1;
      if (paramLinkedList.size() > 0)
      {
        l1 = ((d)paramLinkedList.get(0)).iVi;
        paramLinkedList = paramLinkedList.iterator();
        l2 = l1;
        if (paramLinkedList.hasNext())
        {
          d locald = (d)paramLinkedList.next();
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
      GMTrace.o(18464869711872L, 137574);
      return l2;
    }
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2, LinkedList<d> paramLinkedList)
  {
    GMTrace.i(18465272365056L, 137577);
    if (paramInt == 0)
    {
      this.iXo = new LinkedList(paramLinkedList);
      GMTrace.o(18465272365056L, 137577);
      return;
    }
    if (this.iXo == null) {
      this.iXo = new LinkedList();
    }
    for (;;)
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        d locald = (d)paramLinkedList.next();
        if (com.tencent.mm.plugin.backup.g.a.afG().afH().yM().m(locald.iVh, paramLong1, paramLong2) > 0) {
          this.iXo.add(locald);
        }
      }
      this.iXo.clear();
    }
    GMTrace.o(18465272365056L, 137577);
  }
  
  public final LinkedList<d> aeB()
  {
    GMTrace.i(18465003929600L, 137575);
    if (this.iXn == null) {
      this.iXn = new LinkedList();
    }
    LinkedList localLinkedList = this.iXn;
    GMTrace.o(18465003929600L, 137575);
    return localLinkedList;
  }
  
  public final LinkedList<d> aeC()
  {
    GMTrace.i(18465138147328L, 137576);
    if (this.iXo == null) {
      this.iXo = new LinkedList();
    }
    LinkedList localLinkedList = this.iXo;
    GMTrace.o(18465138147328L, 137576);
    return localLinkedList;
  }
  
  public final void aeE()
  {
    GMTrace.i(18465943453696L, 137582);
    this.iXn = null;
    this.iXp = null;
    this.iXo = null;
    this.iXq = false;
    GMTrace.o(18465943453696L, 137582);
  }
  
  public final void cancel()
  {
    GMTrace.i(18466077671424L, 137583);
    w.i("MicroMsg.BackupPcChooseServer", "cancel, stack:%s", new Object[] { bg.bQW() });
    synchronized (this.lock)
    {
      if (this.iYo != null)
      {
        this.iYo.cancel();
        this.iYo = null;
      }
      com.tencent.mm.a.e.f(new File(h.aer()));
      this.iXq = false;
      GMTrace.o(18466077671424L, 137583);
      return;
    }
  }
  
  public final void dc(boolean paramBoolean)
  {
    GMTrace.i(18465675018240L, 137580);
    w.i("MicroMsg.BackupPcChooseServer", "calculateToChoose, isChooseAllRecords[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jaj = paramBoolean;
    com.tencent.mm.plugin.backup.g.a.afG().afJ();
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18462990663680L, 137560);
        if (a.this.iYo != null) {
          a.this.iYo.cancel();
        }
        a.this.iYo = new com.tencent.mm.plugin.backup.b.b();
        a.this.iYo.a(a.this);
        GMTrace.o(18462990663680L, 137560);
      }
    }, "BackupPcChooseServer.calculateToChoose");
    GMTrace.o(18465675018240L, 137580);
  }
  
  public final void u(LinkedList<d> paramLinkedList)
  {
    GMTrace.i(18465809235968L, 137581);
    if (paramLinkedList == null) {}
    for (int i = -1;; i = paramLinkedList.size())
    {
      w.i("MicroMsg.BackupPcChooseServer", "onCalcuConvFinish, conv size[%d]", new Object[] { Integer.valueOf(i) });
      this.iXq = true;
      if ((paramLinkedList != null) && (paramLinkedList.size() != 0)) {
        break;
      }
      if (this.jak != null) {
        this.jak.u(paramLinkedList);
      }
      if (this.jaj)
      {
        b.afh().afj().iYp.aeu();
        b.afh().aeI().stop();
        b.afh().aei().iVu = -23;
        b.afh().afj().c(b.afh().aei());
      }
      GMTrace.o(18465809235968L, 137581);
      return;
    }
    this.iXn = new LinkedList(paramLinkedList);
    this.iXm = y(this.iXn);
    b.afh();
    SharedPreferences localSharedPreferences = b.aen();
    a(localSharedPreferences.getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0), localSharedPreferences.getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L), localSharedPreferences.getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L), aeB());
    w.i("MicroMsg.BackupPcChooseServer", "onCalcuConvFinish, calAllConvNames size[%d], showConvNames size[%d]", new Object[] { Integer.valueOf(paramLinkedList.size()), Integer.valueOf(aeC().size()) });
    if (this.jaj)
    {
      z(aeC());
      b.afh().afj().A(h.t(aeD()));
      b.afh().afj().aQ(aeD().size());
    }
    if (this.jak != null) {
      this.jak.u(aeC());
    }
    GMTrace.o(18465809235968L, 137581);
  }
  
  public final void z(LinkedList<d> paramLinkedList)
  {
    GMTrace.i(18465406582784L, 137578);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      this.iXp = new LinkedList();
      GMTrace.o(18465406582784L, 137578);
      return;
    }
    this.iXp = new LinkedList(paramLinkedList.subList(paramLinkedList.size() * 3 / 4, paramLinkedList.size()));
    this.iXp.addAll(paramLinkedList.subList(0, paramLinkedList.size() * 3 / 4));
    GMTrace.o(18465406582784L, 137578);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\backuppcmodel\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */