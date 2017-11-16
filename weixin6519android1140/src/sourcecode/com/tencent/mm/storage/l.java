package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.HashSet;

public final class l
  extends i<k>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(17949473636352L, 133734);
    fTX = new String[] { i.a(k.fTp, "BackupRecoverMsgListDataId") };
    GMTrace.o(17949473636352L, 133734);
  }
  
  public l(g paramg)
  {
    super(paramg, k.fTp, "BackupRecoverMsgListDataId", null);
    GMTrace.i(17948534112256L, 133727);
    this.fTZ = paramg;
    GMTrace.o(17948534112256L, 133727);
  }
  
  public final String Ti(String paramString)
  {
    GMTrace.i(17948668329984L, 133728);
    Object localObject = "SELECT * FROM BackupRecoverMsgListDataId WHERE msgListDataId = \"" + paramString + "\" ";
    w.d("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId:" + (String)localObject);
    localObject = this.fTZ.rawQuery((String)localObject, null);
    if (localObject == null)
    {
      w.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getSessionNameByMsgListDataId failed, msgListDataId:%s", new Object[] { paramString });
      GMTrace.o(17948668329984L, 133728);
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      paramString = new k();
      paramString.b((Cursor)localObject);
      ((Cursor)localObject).close();
      paramString = paramString.field_sessionName;
      GMTrace.o(17948668329984L, 133728);
      return paramString;
    }
    ((Cursor)localObject).close();
    GMTrace.o(17948668329984L, 133728);
    return null;
  }
  
  public final boolean bSj()
  {
    GMTrace.i(17949205200896L, 133732);
    boolean bool = this.fTZ.eZ("BackupRecoverMsgListDataId", "delete from BackupRecoverMsgListDataId");
    w.i("MicroMsg.BackupRecoverMsgListDataIdStorage", "deleteAllData, result:%b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(17949205200896L, 133732);
    return bool;
  }
  
  public final HashMap<String, String> bSk()
  {
    GMTrace.i(17948802547712L, 133729);
    HashMap localHashMap = new HashMap();
    Cursor localCursor = Mx();
    if (localCursor == null)
    {
      w.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getAllData failed.");
      GMTrace.o(17948802547712L, 133729);
      return localHashMap;
    }
    while (localCursor.moveToNext())
    {
      k localk = new k();
      localk.b(localCursor);
      localHashMap.put(localk.field_msgListDataId, localk.field_sessionName);
    }
    localCursor.close();
    GMTrace.o(17948802547712L, 133729);
    return localHashMap;
  }
  
  public final boolean bSl()
  {
    GMTrace.i(17948936765440L, 133730);
    w.d("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist:" + "SELECT * FROM BackupRecoverMsgListDataId");
    Cursor localCursor = this.fTZ.rawQuery("SELECT * FROM BackupRecoverMsgListDataId", null);
    if (localCursor == null)
    {
      w.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "isMsgListDataIdExist failed.");
      GMTrace.o(17948936765440L, 133730);
      return false;
    }
    if (localCursor.getCount() <= 0)
    {
      w.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "No data in BackupRecoverMsgListDataIdStorage.");
      localCursor.close();
      GMTrace.o(17948936765440L, 133730);
      return false;
    }
    localCursor.close();
    GMTrace.o(17948936765440L, 133730);
    return true;
  }
  
  public final HashSet<String> bSm()
  {
    GMTrace.i(17949070983168L, 133731);
    HashSet localHashSet = new HashSet();
    Cursor localCursor = Mx();
    if (localCursor == null)
    {
      w.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getAllData failed.");
      GMTrace.o(17949070983168L, 133731);
      return localHashSet;
    }
    while (localCursor.moveToNext())
    {
      k localk = new k();
      localk.b(localCursor);
      localHashSet.add(localk.field_sessionName);
    }
    localCursor.close();
    GMTrace.o(17949070983168L, 133731);
    return localHashSet;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */