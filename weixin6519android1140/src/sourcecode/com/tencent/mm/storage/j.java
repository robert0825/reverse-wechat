package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.protocal.c.ee;
import com.tencent.mm.protocal.c.ef;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(17947728805888L, 133721);
    fTX = new String[] { com.tencent.mm.sdk.e.i.a(i.fTp, "BackupMoveTime") };
    GMTrace.o(17947728805888L, 133721);
  }
  
  public j(g paramg)
  {
    super(paramg, i.fTp, "BackupMoveTime", null);
    GMTrace.i(17947057717248L, 133716);
    this.fTZ = paramg;
    long l1 = System.currentTimeMillis();
    long l2 = paramg.cE(Thread.currentThread().getId());
    long l3 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(Arrays.asList(new String[] { "CREATE INDEX IF NOT EXISTS BackupMoveTime DeviceIdSessionIndex ON BackupMoveTime ( deviceId,sessionName )" }));
    int i = 0;
    while (i < localArrayList.size())
    {
      paramg.eZ("BackupMoveTime", (String)localArrayList.get(i));
      i += 1;
    }
    w.d("MicroMsg.BackupMoveTimeStorage", "build new index last time[%d]", new Object[] { Long.valueOf(System.currentTimeMillis() - l3) });
    paramg.aL(l2);
    w.i("MicroMsg.BackupMoveTimeStorage", "executeInitSQL last time[%d]", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    GMTrace.o(17947057717248L, 133716);
  }
  
  private static void a(LinkedList<ee> paramLinkedList, m paramm)
  {
    GMTrace.i(17947460370432L, 133719);
    if (paramm.field_startTime > paramm.field_endTime)
    {
      GMTrace.o(17947460370432L, 133719);
      return;
    }
    Object localObject = paramLinkedList.iterator();
    ee localee1;
    int i;
    for (;;)
    {
      if (((Iterator)localObject).hasNext())
      {
        localee1 = (ee)((Iterator)localObject).next();
        if (paramm.field_startTime < localee1.endTime) {
          if (paramm.field_endTime < localee1.startTime)
          {
            localObject = new ee();
            ((ee)localObject).startTime = paramm.field_startTime;
            ((ee)localObject).endTime = paramm.field_endTime;
            paramLinkedList.add(localObject);
            i = 1;
          }
        }
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        localObject = new ee();
        ((ee)localObject).startTime = paramm.field_startTime;
        ((ee)localObject).endTime = paramm.field_endTime;
        paramLinkedList.add(localObject);
      }
      GMTrace.o(17947460370432L, 133719);
      return;
      if (paramm.field_startTime < localee1.startTime) {
        localee1.startTime = paramm.field_startTime;
      }
      if (paramm.field_endTime > localee1.endTime)
      {
        localee1.endTime = paramm.field_endTime;
        for (;;)
        {
          if (!((Iterator)localObject).hasNext()) {
            break label275;
          }
          ee localee2 = (ee)((Iterator)localObject).next();
          if (paramm.field_endTime <= localee2.startTime) {
            break label275;
          }
          if (paramm.field_endTime <= localee2.endTime)
          {
            localee1.endTime = localee2.endTime;
            ((Iterator)localObject).remove();
            i = 1;
            break;
          }
          ((Iterator)localObject).remove();
        }
      }
      label275:
      i = 1;
      continue;
      i = 0;
    }
  }
  
  public final void a(String paramString, LinkedList<String> paramLinkedList1, LinkedList<Long> paramLinkedList2, LinkedList<String> paramLinkedList3, LinkedList<Long> paramLinkedList4)
  {
    GMTrace.i(17947191934976L, 133717);
    paramLinkedList2 = paramLinkedList2.iterator();
    Iterator localIterator = paramLinkedList1.iterator();
    label332:
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
          paramLinkedList1 = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + paramString + "\" AND sessionName = \"" + str + "\" ";
          w.d("MicroMsg.BackupMoveTimeStorage", "getMoveTimeByDeviceIdSession:" + paramLinkedList1);
          paramLinkedList1 = this.fTZ.rawQuery(paramLinkedList1, null);
          if (paramLinkedList1 == null)
          {
            w.e("MicroMsg.BackupMoveTimeStorage", "getMoveTimeByDeviceIdSession failed, deviceid:%s, sessionName:%s ", new Object[] { paramString, str });
            paramLinkedList1 = null;
          }
          for (;;)
          {
            if ((paramLinkedList1 != null) && (paramLinkedList1.tSM.size() > 0) && (l2 >= ((ee)paramLinkedList1.tSM.getFirst()).startTime) && (l1 <= ((ee)paramLinkedList1.tSM.getLast()).endTime)) {
              break label332;
            }
            paramLinkedList3.add(str);
            paramLinkedList4.add(Long.valueOf(l1));
            paramLinkedList4.add(Long.valueOf(l2));
            break;
            if (paramLinkedList1.moveToFirst())
            {
              localObject = new i();
              ((i)localObject).b(paramLinkedList1);
              paramLinkedList1.close();
              paramLinkedList1 = ((i)localObject).field_moveTime;
            }
            else
            {
              paramLinkedList1.close();
              paramLinkedList1 = null;
            }
          }
          paramLinkedList1 = paramLinkedList1.tSM;
          j = 0;
          if ((j >= paramLinkedList1.size()) || (l1 > l2)) {
            break label562;
          }
          Object localObject = (ee)paramLinkedList1.get(j);
          if (l1 > ((ee)localObject).endTime) {
            break label565;
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
              label444:
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
    label562:
    label565:
    for (;;)
    {
      j += 1;
      break;
      GMTrace.o(17947191934976L, 133717);
      return;
      break label444;
    }
  }
  
  public final boolean bSj()
  {
    GMTrace.i(19250982944768L, 143431);
    boolean bool = this.fTZ.eZ("BackupMoveTime", "delete from BackupMoveTime");
    w.i("MicroMsg.BackupMoveTimeStorage", "deleteAllData, result:%b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(19250982944768L, 143431);
    return bool;
  }
  
  public final void d(String paramString, LinkedList<m> paramLinkedList)
  {
    GMTrace.i(17947326152704L, 133718);
    w.i("MicroMsg.BackupMoveTimeStorage", "start mergeDataByDeviceIdSession.");
    HashMap localHashMap = new HashMap();
    Object localObject1 = "SELECT * FROM BackupMoveTime WHERE deviceId = \"" + paramString + "\" ";
    w.d("MicroMsg.BackupMoveTimeStorage", "getAllDataByDevice:" + (String)localObject1);
    localObject1 = this.fTZ.rawQuery((String)localObject1, null);
    if (localObject1 == null) {
      w.e("MicroMsg.BackupMoveTimeStorage", "getAllDataByDevice failed, deviceid:%s", new Object[] { paramString });
    }
    Object localObject2;
    while (this.fTZ.delete("BackupMoveTime", "deviceId= ? ", new String[] { paramString }) < 0)
    {
      w.e("MicroMsg.BackupMoveTimeStorage", "mergeDataByDeviceId delete db failed, deviceid:%s", new Object[] { paramString });
      GMTrace.o(17947326152704L, 133718);
      return;
      while (((Cursor)localObject1).moveToNext())
      {
        localObject2 = new i();
        ((i)localObject2).b((Cursor)localObject1);
        localHashMap.put(((i)localObject2).field_sessionName, localObject2);
      }
      ((Cursor)localObject1).close();
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      localObject1 = (m)paramLinkedList.next();
      localObject2 = (i)localHashMap.get(((m)localObject1).field_sessionName);
      if (localObject2 == null)
      {
        localObject2 = new ee();
        ((ee)localObject2).startTime = ((m)localObject1).field_startTime;
        ((ee)localObject2).endTime = ((m)localObject1).field_endTime;
        i locali = new i();
        locali.field_deviceId = paramString;
        locali.field_sessionName = ((m)localObject1).field_sessionName;
        locali.field_moveTime = new ef();
        locali.field_moveTime.tSM = new LinkedList();
        locali.field_moveTime.tSM.add(localObject2);
        localHashMap.put(((m)localObject1).field_sessionName, locali);
      }
      else
      {
        a(((i)localObject2).field_moveTime.tSM, (m)localObject1);
      }
    }
    paramString = localHashMap.keySet().iterator();
    while (paramString.hasNext())
    {
      paramLinkedList = (String)paramString.next();
      w.i("MicroMsg.BackupMoveTimeStorage", "summerbak insert BackupMoveTimeStorage ret[%b], sessionName:%s", new Object[] { Boolean.valueOf(b((c)localHashMap.get(paramLinkedList))), paramLinkedList });
    }
    GMTrace.o(17947326152704L, 133718);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */