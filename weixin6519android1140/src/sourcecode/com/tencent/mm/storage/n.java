package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.protocal.c.ee;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.LinkedList;

public final class n
  extends i<m>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(17948399894528L, 133726);
    fTX = new String[] { i.a(m.fTp, "BackupTempMoveTime") };
    GMTrace.o(17948399894528L, 133726);
  }
  
  public n(g paramg)
  {
    super(paramg, m.fTp, "BackupTempMoveTime", null);
    GMTrace.i(17947863023616L, 133722);
    this.fTZ = paramg;
    GMTrace.o(17947863023616L, 133722);
  }
  
  public final void a(LinkedList<String> paramLinkedList1, LinkedList<Long> paramLinkedList2, LinkedList<String> paramLinkedList3, LinkedList<Long> paramLinkedList4)
  {
    GMTrace.i(17947997241344L, 133723);
    if (getCount() <= 0)
    {
      paramLinkedList3.addAll(paramLinkedList1);
      paramLinkedList4.addAll(paramLinkedList2);
      GMTrace.o(17947997241344L, 133723);
      return;
    }
    paramLinkedList2 = paramLinkedList2.iterator();
    Iterator localIterator = paramLinkedList1.iterator();
    label376:
    int j;
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      int i = 0;
      if (paramLinkedList2.hasNext())
      {
        long l1 = ((Long)paramLinkedList2.next()).longValue();
        if (paramLinkedList2.hasNext())
        {
          long l3 = ((Long)paramLinkedList2.next()).longValue();
          long l2 = l3;
          if (l3 == 0L) {
            l2 = Long.MAX_VALUE;
          }
          paramLinkedList1 = new LinkedList();
          Object localObject = "SELECT * FROM BackupTempMoveTime WHERE sessionName = \"" + str + "\" ";
          w.d("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession:" + (String)localObject);
          localObject = this.fTZ.rawQuery((String)localObject, null);
          if (localObject == null)
          {
            w.e("MicroMsg.BackupTempMoveTimeStorage", "getTempMoveTimeBySession failed, sessionName:%s ", new Object[] { str });
            paramLinkedList1 = null;
          }
          for (;;)
          {
            if ((paramLinkedList1 != null) && (paramLinkedList1.size() > 0) && (l2 >= ((ee)paramLinkedList1.getFirst()).startTime) && (l1 <= ((ee)paramLinkedList1.getLast()).endTime)) {
              break label376;
            }
            paramLinkedList3.add(str);
            paramLinkedList4.add(Long.valueOf(l1));
            paramLinkedList4.add(Long.valueOf(l2));
            break;
            while (((Cursor)localObject).moveToNext())
            {
              m localm = new m();
              localm.b((Cursor)localObject);
              ee localee = new ee();
              localee.startTime = localm.field_startTime;
              localee.endTime = localm.field_endTime;
              paramLinkedList1.add(localee);
            }
            ((Cursor)localObject).close();
          }
          j = 0;
          if ((j >= paramLinkedList1.size()) || (l1 > l2)) {
            break label598;
          }
          localObject = (ee)paramLinkedList1.get(j);
          if (l1 > ((ee)localObject).endTime) {
            break label601;
          }
          if (l1 < ((ee)localObject).startTime)
          {
            i = 1;
            paramLinkedList3.add(str);
            paramLinkedList4.add(Long.valueOf(l1));
            if (l2 < ((ee)localObject).startTime)
            {
              paramLinkedList4.add(Long.valueOf(l2));
              l1 = ((ee)localObject).startTime;
              i = 1;
              label482:
              if (l1 <= l2)
              {
                paramLinkedList3.add(str);
                paramLinkedList4.add(Long.valueOf(l1));
                paramLinkedList4.add(Long.valueOf(l2));
                i = 1;
              }
              if (i == 0)
              {
                paramLinkedList3.add(str);
                paramLinkedList4.add(Long.valueOf(l1));
                paramLinkedList4.add(Long.valueOf(l2));
              }
            }
            else
            {
              paramLinkedList4.add(Long.valueOf(((ee)localObject).startTime));
            }
          }
          else
          {
            l1 = ((ee)localObject).endTime;
          }
        }
      }
    }
    label598:
    label601:
    for (;;)
    {
      j += 1;
      break;
      GMTrace.o(17947997241344L, 133723);
      return;
      break label482;
    }
  }
  
  public final boolean bSj()
  {
    GMTrace.i(17948131459072L, 133724);
    boolean bool = this.fTZ.eZ("BackupTempMoveTime", "delete from BackupTempMoveTime");
    w.i("MicroMsg.BackupTempMoveTimeStorage", "deleteAllData, result:%b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(17948131459072L, 133724);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */