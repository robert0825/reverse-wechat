package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ae;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class r
  extends i<q>
  implements f.a, ae
{
  public static final String[] eZt;
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(1577058304000L, 11750);
    fTX = new String[] { i.a(q.fTp, "chatroom") };
    eZt = new String[] { "CREATE INDEX IF NOT EXISTS serverChatRoomUserIndex ON chatroom ( chatroomname )" };
    GMTrace.o(1577058304000L, 11750);
  }
  
  public r(e parame)
  {
    super(parame, q.fTp, "chatroom", eZt);
    GMTrace.i(1575581908992L, 11739);
    this.fTZ = parame;
    GMTrace.o(1575581908992L, 11739);
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1576789868544L, 11748);
    GMTrace.o(1576789868544L, 11748);
    return 0;
  }
  
  public final String fs(String paramString)
  {
    GMTrace.i(1576387215360L, 11745);
    boolean bool;
    Cursor localCursor;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = "select displayname from chatroom where chatroomname='" + bg.nk(paramString) + "'";
      localCursor = this.fTZ.a(paramString, null, 2);
      if (!localCursor.moveToFirst()) {
        break label124;
      }
      paramString = new q();
      paramString.b(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      if (paramString == null)
      {
        GMTrace.o(1576387215360L, 11745);
        return null;
        bool = false;
        break;
      }
      paramString = paramString.field_displayname;
      GMTrace.o(1576387215360L, 11745);
      return paramString;
      label124:
      paramString = null;
    }
  }
  
  public final q gC(String paramString)
  {
    GMTrace.i(1575716126720L, 11740);
    q localq = new q();
    localq.field_chatroomname = paramString;
    if (super.b(localq, new String[] { "chatroomname" }))
    {
      GMTrace.o(1575716126720L, 11740);
      return localq;
    }
    GMTrace.o(1575716126720L, 11740);
    return null;
  }
  
  public final q gD(String paramString)
  {
    GMTrace.i(1575850344448L, 11741);
    q localq = new q();
    localq.field_chatroomname = paramString;
    if (super.b(localq, new String[] { "chatroomname" }))
    {
      GMTrace.o(1575850344448L, 11741);
      return localq;
    }
    GMTrace.o(1575850344448L, 11741);
    return localq;
  }
  
  public final String gE(String paramString)
  {
    GMTrace.i(17856326533120L, 133040);
    if (paramString.length() > 0) {}
    Cursor localCursor;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      paramString = "select roomowner from chatroom where chatroomname='" + bg.nk(paramString) + "'";
      localCursor = this.fTZ.a(paramString, null, 2);
      if (localCursor != null) {
        break;
      }
      w.e("MicroMsg.ChatroomStorage", "getChatroomOwner fail, cursor is null");
      GMTrace.o(17856326533120L, 133040);
      return null;
    }
    if (localCursor.moveToFirst())
    {
      paramString = new q();
      paramString.b(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      if (paramString == null)
      {
        GMTrace.o(17856326533120L, 133040);
        return null;
      }
      paramString = paramString.field_roomowner;
      GMTrace.o(17856326533120L, 133040);
      return paramString;
      paramString = null;
    }
  }
  
  public final String gF(String paramString)
  {
    GMTrace.i(1576252997632L, 11744);
    boolean bool;
    Cursor localCursor;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      paramString = "select memberlist from chatroom where chatroomname='" + bg.nk(paramString) + "'";
      localCursor = this.fTZ.a(paramString, null, 2);
      if (!localCursor.moveToFirst()) {
        break label124;
      }
      paramString = new q();
      paramString.b(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      if (paramString == null)
      {
        GMTrace.o(1576252997632L, 11744);
        return null;
        bool = false;
        break;
      }
      paramString = paramString.field_memberlist;
      GMTrace.o(1576252997632L, 11744);
      return paramString;
      label124:
      paramString = null;
    }
  }
  
  public final List<String> gG(String paramString)
  {
    GMTrace.i(1576521433088L, 11746);
    Object localObject = gF(paramString);
    if (localObject == null)
    {
      GMTrace.o(1576521433088L, 11746);
      return null;
    }
    paramString = new LinkedList();
    if (!((String)localObject).equals(""))
    {
      localObject = ((String)localObject).split(";");
      int i = 0;
      while (i < localObject.length)
      {
        paramString.add(localObject[i]);
        i += 1;
      }
    }
    GMTrace.o(1576521433088L, 11746);
    return paramString;
  }
  
  public final boolean gH(String paramString)
  {
    Object localObject = null;
    GMTrace.i(17856460750848L, 133041);
    paramString = "select * from chatroom where chatroomname='" + bg.nk(paramString) + "'";
    Cursor localCursor = this.fTZ.a(paramString, null, 2);
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new q();
      paramString.b(localCursor);
    }
    localCursor.close();
    if ((paramString != null) && ((paramString.field_roomflag & 0x1) == 0))
    {
      GMTrace.o(17856460750848L, 133041);
      return true;
    }
    GMTrace.o(17856460750848L, 133041);
    return false;
  }
  
  public final boolean gI(String paramString)
  {
    GMTrace.i(1576655650816L, 11747);
    if (paramString.length() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if (this.fTZ.delete("chatroom", "chatroomname=?", new String[] { paramString }) != 0) {
        break;
      }
      GMTrace.o(1576655650816L, 11747);
      return false;
    }
    SS(paramString);
    GMTrace.o(1576655650816L, 11747);
    return true;
  }
  
  public final void i(String paramString, long paramLong)
  {
    GMTrace.i(17856192315392L, 133039);
    paramString = "update chatroom set modifytime = " + paramLong + " where chatroomname = '" + bg.nk(paramString) + "'";
    this.fTZ.eZ("chatroom", paramString);
    GMTrace.o(17856192315392L, 133039);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */