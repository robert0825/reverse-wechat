package com.tencent.mm.plugin.multitalk.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.as.b;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.pb.common.c.h;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public final class a
  extends i<b>
{
  public static final String[] fTX;
  public static LinkedHashMap<String, Class> lsh;
  
  static
  {
    GMTrace.i(4772916625408L, 35561);
    fTX = new String[] { i.a(b.fTp, "MultiTalkInfo"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkInfo_key  on MultiTalkInfo  (  wxGroupId )" };
    lsh = new LinkedHashMap() {};
    GMTrace.o(4772916625408L, 35561);
  }
  
  public a(e parame)
  {
    super(parame, b.fTp, "MultiTalkInfo", null);
    GMTrace.i(4772111319040L, 35555);
    GMTrace.o(4772111319040L, 35555);
  }
  
  public final b De(String paramString)
  {
    GMTrace.i(4772648189952L, 35559);
    w.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTaklInfo for wxGroupId = %s", new Object[] { paramString });
    paramString = rawQuery("select wxGroupId, groupId, roomId, roomKey, routeId, inviteUserName,memberCount,createTime,state from MultiTalkInfo where wxGroupId = '" + paramString + "'", new String[0]);
    if (paramString != null) {}
    try
    {
      if (paramString.moveToNext())
      {
        b localb = new b();
        localb.field_wxGroupId = paramString.getString(0);
        localb.field_groupId = paramString.getString(1);
        localb.field_roomId = paramString.getInt(2);
        localb.field_roomKey = paramString.getLong(3);
        localb.field_routeId = paramString.getInt(4);
        localb.field_inviteUserName = paramString.getString(5);
        localb.field_memberCount = paramString.getInt(6);
        localb.field_createTime = paramString.getLong(7);
        localb.field_state = paramString.getInt(8);
        w.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfo got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d,inviteUser=%s,memberCount=%d, createTime=%d,field_state=%d", new Object[] { localb.field_wxGroupId, localb.field_groupId, Integer.valueOf(localb.field_roomId), Long.valueOf(localb.field_roomKey), Integer.valueOf(localb.field_routeId), localb.field_inviteUserName, Integer.valueOf(localb.field_memberCount), Long.valueOf(localb.field_createTime), Integer.valueOf(localb.field_state) });
        if (paramString != null) {
          paramString.close();
        }
        GMTrace.o(4772648189952L, 35559);
        return localb;
      }
      if (paramString != null) {
        paramString.close();
      }
      GMTrace.o(4772648189952L, 35559);
      return null;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfo error! " + localException.toString());
      if (paramString != null) {
        paramString.close();
      }
      GMTrace.o(4772648189952L, 35559);
      return null;
    }
    finally
    {
      if (paramString != null) {
        paramString.close();
      }
    }
  }
  
  public final boolean a(b paramb)
  {
    GMTrace.i(4772379754496L, 35557);
    String str = paramb.field_wxGroupId;
    if (h.yp(str))
    {
      w.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. multiTalkInfo wxGroupId is empty!");
      GMTrace.o(4772379754496L, 35557);
      return false;
    }
    w.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d", new Object[] { str, paramb.field_groupId, Integer.valueOf(paramb.field_roomId), Long.valueOf(paramb.field_roomKey), Integer.valueOf(paramb.field_routeId), paramb.field_inviteUserName, Integer.valueOf(paramb.field_memberCount), Long.valueOf(paramb.field_createTime) });
    try
    {
      boolean bool = b(paramb);
      w.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "insert ret " + bool + " for id=%s" + str);
      GMTrace.o(4772379754496L, 35557);
      return bool;
    }
    catch (Exception paramb)
    {
      w.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + paramb.toString());
      GMTrace.o(4772379754496L, 35557);
    }
    return false;
  }
  
  public final LinkedList<b> aRV()
  {
    GMTrace.i(4772245536768L, 35556);
    Cursor localCursor = rawQuery("select wxGroupId, groupId, roomId, roomKey, routeId, createTime from MultiTalkInfo", new String[0]);
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      if (localCursor != null) {}
      try
      {
        if (localCursor.moveToNext())
        {
          b localb = new b();
          localb.field_wxGroupId = localCursor.getString(0);
          localb.field_groupId = localCursor.getString(1);
          localb.field_roomId = localCursor.getInt(2);
          localb.field_roomKey = localCursor.getLong(3);
          localb.field_routeId = localCursor.getInt(4);
          localb.field_createTime = localCursor.getLong(5);
          w.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfoList got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d, createTime=%d", new Object[] { localb.field_wxGroupId, localb.field_groupId, Integer.valueOf(localb.field_roomId), Long.valueOf(localb.field_roomKey), Integer.valueOf(localb.field_routeId), Long.valueOf(localb.field_createTime) });
          localLinkedList.add(localb);
          continue;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfoList error!");
        if (localCursor != null) {
          localCursor.close();
        }
        for (;;)
        {
          GMTrace.o(4772245536768L, 35556);
          return localLinkedList;
          if (localCursor != null) {
            localCursor.close();
          }
        }
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
  }
  
  public final boolean b(b paramb)
  {
    GMTrace.i(4772513972224L, 35558);
    String str = paramb.field_wxGroupId;
    if (h.yp(str))
    {
      w.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. multiTalkInfo wxGroupId is empty!");
      GMTrace.o(4772513972224L, 35558);
      return false;
    }
    w.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d,state=%d", new Object[] { str, paramb.field_groupId, Integer.valueOf(paramb.field_roomId), Long.valueOf(paramb.field_roomKey), Integer.valueOf(paramb.field_routeId), paramb.field_inviteUserName, Integer.valueOf(paramb.field_memberCount), Long.valueOf(paramb.field_createTime), Integer.valueOf(paramb.field_state) });
    try
    {
      boolean bool = c(paramb, new String[] { "wxGroupId" });
      w.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update ret " + bool + " for id=%s" + str);
      GMTrace.o(4772513972224L, 35558);
      return bool;
    }
    catch (Exception paramb)
    {
      w.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + paramb.toString());
      GMTrace.o(4772513972224L, 35558);
    }
    return false;
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(4772782407680L, 35560);
    w.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete id = %s", new Object[] { paramString });
    try
    {
      super.eZ("MultiTalkInfo", "delete from MultiTalkInfo where wxGroupId = \"" + paramString + "\"");
      GMTrace.o(4772782407680L, 35560);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete fail for wxGroupId = " + paramString);
      GMTrace.o(4772782407680L, 35560);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */