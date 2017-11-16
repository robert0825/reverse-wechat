package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public final class m
{
  public static k a(k paramk, long paramLong)
  {
    GMTrace.i(11580171354112L, 86279);
    if (paramk == null)
    {
      GMTrace.o(11580171354112L, 86279);
      return null;
    }
    w.d("MicroMsg.IPCallRecordStorageLogic", "recordSelfShutdownCall, localId: %d, talkTime: %d", new Object[] { Long.valueOf(paramk.vmr), Long.valueOf(paramLong) });
    if (paramk.vmr != -1L)
    {
      paramk.field_status = 4;
      paramk.field_duration = paramLong;
      i.aIv().a(paramk);
    }
    GMTrace.o(11580171354112L, 86279);
    return paramk;
  }
  
  public static ArrayList<k> aIY()
  {
    GMTrace.i(11580305571840L, 86280);
    long l2 = System.currentTimeMillis();
    Object localObject1 = i.aIv();
    Object localObject2 = Calendar.getInstance();
    ((Calendar)localObject2).add(6, -30);
    long l1 = ((Calendar)localObject2).getTimeInMillis();
    localObject1 = ((l)localObject1).fTZ.query("IPCallRecord", l.mmY, "calltime>=?", new String[] { String.valueOf(l1) }, "addressId, phonenumber", null, "calltime desc");
    if (((Cursor)localObject1).getCount() < 30)
    {
      ((Cursor)localObject1).close();
      localObject1 = i.aIv().fTZ.query("IPCallRecord", l.mmY, null, null, "addressId, phonenumber", null, "calltime desc");
    }
    for (;;)
    {
      w.d("MicroMsg.IPCallRecordStorageLogic", "finish query used %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      HashMap localHashMap = new HashMap();
      localObject2 = new ArrayList();
      for (;;)
      {
        k localk1;
        try
        {
          if (!((Cursor)localObject1).moveToFirst()) {
            break label639;
          }
          if ((((Cursor)localObject1).isAfterLast()) || (((ArrayList)localObject2).size() > 30)) {
            break label639;
          }
          localk1 = new k();
          localk1.b((Cursor)localObject1);
          if (localk1.field_addressId != -1L)
          {
            if (!localHashMap.containsKey(localk1.field_addressId))
            {
              localHashMap.put(localk1.field_addressId, localk1);
              ((ArrayList)localObject2).add(localk1);
            }
            ((Cursor)localObject1).moveToNext();
            continue;
          }
          Object localObject5;
          k localk2;
          l1 = -1L;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser error: %s", new Object[] { localException.getMessage() });
          ((Cursor)localObject1).close();
          w.d("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser, used: %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
          GMTrace.o(11580305571840L, 86280);
          return (ArrayList<k>)localObject2;
          localObject4 = a.ai(ab.getContext(), localk1.field_phonenumber);
          localObject4 = i.aIu().Al((String)localObject4);
          if (localObject4 == null) {
            break label602;
          }
          localObject5 = i.aIv();
          if ((((l)localObject5).fTZ instanceof g))
          {
            l1 = ((g)((l)localObject5).fTZ).cE(-1L);
            localObject5 = i.aIv().Ao(localk1.field_phonenumber);
            if (!((Cursor)localObject5).moveToFirst()) {
              break label502;
            }
            if (((Cursor)localObject5).isAfterLast()) {
              break label502;
            }
            localk2 = new k();
            localk2.b((Cursor)localObject5);
            localk2.field_addressId = ((c)localObject4).vmr;
            i.aIv().a(localk2);
            ((Cursor)localObject5).moveToNext();
            continue;
          }
        }
        finally
        {
          ((Cursor)localObject1).close();
        }
        continue;
        label502:
        Object localObject4 = i.aIv();
        if (((((l)localObject4).fTZ instanceof g)) && (l1 != -1L)) {
          ((g)((l)localObject4).fTZ).aL(l1);
        }
        if (!localException.containsKey(localk1.field_addressId))
        {
          localException.put(localk1.field_addressId, localk1);
          ((ArrayList)localObject3).add(localk1);
          continue;
          label602:
          if (!localException.containsKey(localk1.field_phonenumber))
          {
            localException.put(localk1.field_phonenumber, localk1);
            ((ArrayList)localObject3).add(localk1);
            continue;
            label639:
            ((Cursor)localObject1).close();
          }
        }
      }
    }
  }
  
  public static k b(k paramk)
  {
    GMTrace.i(11580037136384L, 86278);
    if (paramk == null)
    {
      GMTrace.o(11580037136384L, 86278);
      return null;
    }
    w.d("MicroMsg.IPCallRecordStorageLogic", "recordCancelCall, localId: %d", new Object[] { Long.valueOf(paramk.vmr) });
    if (paramk.vmr != -1L)
    {
      paramk.field_status = 7;
      i.aIv().a(paramk);
    }
    GMTrace.o(11580037136384L, 86278);
    return paramk;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\a\g\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */