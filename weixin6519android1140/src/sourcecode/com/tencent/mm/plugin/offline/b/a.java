package com.tencent.mm.plugin.offline.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.offline.a.q;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;

public final class a
  extends i<q>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(15376788226048L, 114566);
    fTX = new String[] { i.a(q.fTp, "OfflineOrderStatus") };
    GMTrace.o(15376788226048L, 114566);
  }
  
  public a(e parame)
  {
    super(parame, q.fTp, "OfflineOrderStatus", null);
    GMTrace.i(15376251355136L, 114562);
    this.fTZ = parame;
    GMTrace.o(15376251355136L, 114562);
  }
  
  public final q Ef(String paramString)
  {
    Object localObject = null;
    GMTrace.i(15376519790592L, 114564);
    Cursor localCursor = this.fTZ.a("select * from OfflineOrderStatus where reqkey=?", new String[] { paramString }, 2);
    if (localCursor == null)
    {
      GMTrace.o(15376519790592L, 114564);
      return null;
    }
    localCursor.moveToFirst();
    w.i("MicroMsg.OfflineOrderStatusStorage", "in getOrderStatusByTranId: cursor.isAfterLast() = " + localCursor.isAfterLast());
    paramString = (String)localObject;
    if (!localCursor.isAfterLast())
    {
      paramString = new q();
      paramString.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(15376519790592L, 114564);
    return paramString;
  }
  
  public final void Eg(String paramString)
  {
    GMTrace.i(16593606148096L, 123632);
    q localq = Ef(paramString);
    if (localq != null) {
      localq.field_status = -1;
    }
    for (paramString = localq;; paramString = localq)
    {
      b(paramString);
      GMTrace.o(16593606148096L, 123632);
      return;
      localq = new q();
      localq.field_reqkey = paramString;
      localq.field_status = -1;
    }
  }
  
  public final q aVq()
  {
    int i = 1;
    q localq = null;
    GMTrace.i(15376385572864L, 114563);
    w.i("MicroMsg.OfflineOrderStatusStorage", "in getLastestOrder: orders count: %d, latest 3 orders: %s", new Object[] { Integer.valueOf(aVs()), aVr() });
    Cursor localCursor = this.fTZ.a("SELECT * FROM OfflineOrderStatus WHERE status!=-1 ORDER BY rowid DESC LIMIT 1", null, 2);
    if (localCursor == null)
    {
      GMTrace.o(15376385572864L, 114563);
      return null;
    }
    localCursor.moveToFirst();
    if (!localCursor.isAfterLast())
    {
      if (i != 0)
      {
        localq = new q();
        localq.b(localCursor);
      }
      localCursor.close();
      if (localq == null) {
        break label150;
      }
      w.i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder status = " + localq.field_status);
    }
    for (;;)
    {
      GMTrace.o(15376385572864L, 114563);
      return localq;
      i = 0;
      break;
      label150:
      w.i("MicroMsg.OfflineOrderStatusStorage", "getLastestOrder null");
    }
  }
  
  public final String aVr()
  {
    GMTrace.i(19263465193472L, 143524);
    String str = String.format("SELECT * FROM %s ORDER BY %s DESC LIMIT %d;", new Object[] { "OfflineOrderStatus", "rowid", Integer.valueOf(3) });
    Cursor localCursor = this.fTZ.a(str, null, 2);
    str = "";
    if (localCursor == null)
    {
      w.e("MicroMsg.OfflineOrderStatusStorage", "getAllOrdersInfo: error.cursor is null\n");
      GMTrace.o(19263465193472L, 143524);
      return str;
      label74:
      str = str + ";";
    }
    int j;
    for (int i = j;; i = 0)
    {
      if (localCursor.moveToNext())
      {
        j = i + 1;
        if (j <= 3)
        {
          i = 0;
          while (i < localCursor.getColumnCount())
          {
            str = str + localCursor.getColumnName(i) + ": " + localCursor.getString(i) + ", ";
            i += 1;
          }
          break label74;
        }
      }
      localCursor.close();
      break;
    }
  }
  
  public final int aVs()
  {
    int j = 0;
    int i = 0;
    GMTrace.i(19263599411200L, 143525);
    Object localObject = String.format("SELECT COUNT(*) FROM %s;", new Object[] { "OfflineOrderStatus" });
    localObject = this.fTZ.a((String)localObject, null, 2);
    if (localObject == null) {
      w.e("MicroMsg.OfflineOrderStatusStorage", "getOrdersCount: error.cursor is null\n");
    }
    for (;;)
    {
      GMTrace.o(19263599411200L, 143525);
      return i;
      i = j;
      if (((Cursor)localObject).moveToNext())
      {
        i = j;
        if (((Cursor)localObject).getColumnCount() > 0) {
          i = ((Cursor)localObject).getInt(0);
        }
      }
      ((Cursor)localObject).close();
    }
  }
  
  public final void b(q paramq)
  {
    GMTrace.i(15376654008320L, 114565);
    if (paramq.field_reqkey == null)
    {
      w.e("MicroMsg.OfflineOrderStatusStorage", "status.field_reqkey is null");
      GMTrace.o(15376654008320L, 114565);
      return;
    }
    Cursor localCursor = this.fTZ.a("select * from OfflineOrderStatus where reqkey=?", new String[] { paramq.field_reqkey }, 2);
    int i;
    if (localCursor == null)
    {
      i = 0;
      if (i == 0)
      {
        w.i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: insert reqKey: %s,  status: %d ", new Object[] { paramq.field_reqkey, Integer.valueOf(paramq.field_status) });
        b(paramq);
        GMTrace.o(15376654008320L, 114565);
      }
    }
    else
    {
      localCursor.moveToFirst();
      if (!localCursor.isAfterLast()) {}
      for (i = 1;; i = 0)
      {
        localCursor.close();
        break;
      }
    }
    w.i("MicroMsg.OfflineOrderStatusStorage", "saveOfflineOrderStatus: update reqKey: %s,  status: %d ", new Object[] { paramq.field_reqkey, Integer.valueOf(paramq.field_status) });
    c(paramq, new String[0]);
    GMTrace.o(15376654008320L, 114565);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */