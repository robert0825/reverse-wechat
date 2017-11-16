package com.tencent.mm.plugin.multitalk.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class c
  extends i<b>
{
  public static final String[] fTX;
  
  static
  {
    GMTrace.i(4771977101312L, 35554);
    fTX = new String[] { i.a(b.fTp, "MultiTalkMember"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkMember  on MultiTalkMember  (  wxGroupId )" };
    GMTrace.o(4771977101312L, 35554);
  }
  
  public c(e parame)
  {
    super(parame, b.fTp, "MultiTalkMember", null);
    GMTrace.i(4771171794944L, 35548);
    GMTrace.o(4771171794944L, 35548);
  }
  
  public final LinkedList<b> Df(String paramString)
  {
    GMTrace.i(4771440230400L, 35550);
    paramString = rawQuery("select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '" + paramString + "'", new String[0]);
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      if (paramString != null) {}
      try
      {
        if (paramString.moveToNext())
        {
          b localb = new b();
          localb.field_memberUuid = paramString.getInt(0);
          localb.field_wxGroupId = paramString.getString(1);
          localb.field_userName = paramString.getString(2);
          localb.field_inviteUserName = paramString.getString(3);
          localb.field_memberId = paramString.getLong(4);
          localb.field_status = paramString.getInt(5);
          localb.field_createTime = paramString.getLong(6);
          w.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "getMultiTalkMemberList get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d", new Object[] { Long.valueOf(localb.field_memberUuid), localb.field_wxGroupId, localb.field_userName, localb.field_inviteUserName, Long.valueOf(localb.field_memberId), Integer.valueOf(localb.field_status), Long.valueOf(localb.field_createTime) });
          localLinkedList.add(localb);
          continue;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", localException.toString());
        if (paramString != null) {
          paramString.close();
        }
        for (;;)
        {
          GMTrace.o(4771440230400L, 35550);
          return localLinkedList;
          if (paramString != null) {
            paramString.close();
          }
        }
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
    }
  }
  
  public final boolean a(b paramb)
  {
    GMTrace.i(4771574448128L, 35551);
    long l = paramb.field_memberUuid;
    Cursor localCursor = rawQuery("select * from MultiTalkMember where memberUuid = '" + l + "' and wxGroupId = '" + paramb.field_wxGroupId + "'", new String[0]);
    try
    {
      if (localCursor.getCount() == 0)
      {
        bool = b(paramb);
        w.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "insert ret " + bool + " for memberUuid = " + l);
        localCursor.close();
        GMTrace.o(4771574448128L, 35551);
        return bool;
      }
      boolean bool = c(paramb, new String[0]);
      w.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "update ret " + bool + " for memberUuid = " + l);
      localCursor.close();
      GMTrace.o(4771574448128L, 35551);
      return bool;
    }
    catch (Exception paramb)
    {
      w.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", paramb.toString());
      localCursor.close();
      GMTrace.o(4771574448128L, 35551);
      return false;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public final boolean bA(String paramString1, String paramString2)
  {
    GMTrace.i(4771708665856L, 35552);
    w.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + paramString1 + ",member = " + paramString2);
    try
    {
      super.eZ("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + paramString1 + "\" and userName = \"" + paramString2 + "\"");
      GMTrace.o(4771708665856L, 35552);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + paramString1 + ",member = " + paramString2);
      GMTrace.o(4771708665856L, 35552);
    }
    return false;
  }
  
  public final b da(String paramString1, String paramString2)
  {
    GMTrace.i(4771306012672L, 35549);
    paramString1 = rawQuery("select memberUuid, wxGroupId, userName, inviteUserName, memberId, status,createTime  from MultiTalkMember  where wxGroupId = '" + paramString1 + "' and userName ='" + paramString2 + "'", new String[0]);
    if (paramString1 != null) {}
    try
    {
      if (paramString1.moveToNext())
      {
        paramString2 = new b();
        paramString2.field_memberUuid = paramString1.getInt(0);
        paramString2.field_wxGroupId = paramString1.getString(1);
        paramString2.field_userName = paramString1.getString(2);
        paramString2.field_inviteUserName = paramString1.getString(3);
        paramString2.field_memberId = paramString1.getLong(4);
        paramString2.field_status = paramString1.getInt(5);
        paramString2.field_createTime = paramString1.getLong(6);
        w.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "getMultiTalkMember get value for memberUuid = %s, wxGroupId = %s, userName = %s, inviteUserName = %s, memberId = %d, status = %d,createTime = %d", new Object[] { Long.valueOf(paramString2.field_memberUuid), paramString2.field_wxGroupId, paramString2.field_userName, paramString2.field_inviteUserName, Long.valueOf(paramString2.field_memberId), Integer.valueOf(paramString2.field_status), Long.valueOf(paramString2.field_createTime) });
        if (paramString1 != null) {
          paramString1.close();
        }
        GMTrace.o(4771306012672L, 35549);
        return paramString2;
      }
    }
    catch (Exception paramString2)
    {
      for (;;)
      {
        w.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", paramString2.toString());
        if (paramString1 != null) {
          paramString1.close();
        }
      }
    }
    finally
    {
      if (paramString1 == null) {
        break label295;
      }
      paramString1.close();
    }
    GMTrace.o(4771306012672L, 35549);
    return null;
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(4771842883584L, 35553);
    w.i("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete where wxGroupId = " + paramString);
    try
    {
      super.eZ("MultiTalkMember", "delete from MultiTalkMember where wxGroupId = \"" + paramString + "\"");
      GMTrace.o(4771842883584L, 35553);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MultiTalk.storage.MultiTalkMemberStorage", "delete fail for wxGroupId = " + paramString);
      GMTrace.o(4771842883584L, 35553);
    }
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */