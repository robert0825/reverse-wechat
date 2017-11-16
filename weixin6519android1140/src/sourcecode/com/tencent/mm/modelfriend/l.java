package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;

public final class l
  extends j
{
  public static final String[] fTX;
  private g goN;
  
  static
  {
    GMTrace.i(4439251353600L, 33075);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS friend_ext ( username text  PRIMARY KEY , sex int  , personalcard int  , province text  , city text  , signature text  , reserved1 text  , reserved2 text  , reserved3 text  , reserved4 text  , reserved5 int  , reserved6 int  , reserved7 int  , reserved8 int  ) " };
    GMTrace.o(4439251353600L, 33075);
  }
  
  public l(g paramg)
  {
    GMTrace.i(4438714482688L, 33071);
    this.goN = paramg;
    GMTrace.o(4438714482688L, 33071);
  }
  
  public final boolean A(List<k> paramList)
  {
    GMTrace.i(4438982918144L, 33073);
    if (paramList.size() <= 0)
    {
      GMTrace.o(4438982918144L, 33073);
      return false;
    }
    be localbe = new be("MicroMsg.FriendExtStorage", "batchSetFriendExt transaction");
    localbe.addSplit("transation begin");
    long l = this.goN.cE(Thread.currentThread().getId());
    int i = 0;
    try
    {
      while (i < paramList.size())
      {
        k localk = (k)paramList.get(i);
        if (localk != null) {
          a(localk);
        }
        i += 1;
      }
      bool = true;
    }
    catch (Exception paramList)
    {
      for (;;)
      {
        w.e("MicroMsg.FriendExtStorage", paramList.getMessage());
        boolean bool = false;
      }
    }
    this.goN.aL(l);
    localbe.addSplit("transation end");
    localbe.dumpToLog();
    doNotify();
    GMTrace.o(4438982918144L, 33073);
    return bool;
  }
  
  public final boolean a(k paramk)
  {
    boolean bool1 = true;
    GMTrace.i(4438848700416L, 33072);
    Object localObject = paramk.getUsername();
    localObject = "select friend_ext.username,friend_ext.sex,friend_ext.personalcard,friend_ext.province,friend_ext.city,friend_ext.signature from friend_ext   where friend_ext.username = \"" + bg.nk((String)localObject) + "\"";
    localObject = this.goN.a((String)localObject, null, 2);
    boolean bool2 = ((Cursor)localObject).moveToFirst();
    ((Cursor)localObject).close();
    if (bool2) {
      if (paramk != null)
      {
        paramk = paramk.qL();
        if (paramk.size() <= 0) {
          break label174;
        }
      }
    }
    label174:
    for (int i = this.goN.update("friend_ext", paramk, "username=?", new String[] { "username" });; i = 0)
    {
      if (i > 0) {}
      for (;;)
      {
        doNotify();
        GMTrace.o(4438848700416L, 33072);
        return bool1;
        bool1 = false;
        continue;
        if (paramk != null)
        {
          paramk.eQl = -1;
          paramk = paramk.qL();
          if ((int)this.goN.insert("friend_ext", "username", paramk) != -1) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public final k jQ(String paramString)
  {
    Object localObject = null;
    GMTrace.i(4439117135872L, 33074);
    paramString = "select friend_ext.username,friend_ext.sex,friend_ext.personalcard,friend_ext.province,friend_ext.city,friend_ext.signature from friend_ext   where friend_ext.username = \"" + bg.nk(paramString) + "\"";
    Cursor localCursor = this.goN.a(paramString, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(4439117135872L, 33074);
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new k();
      paramString.username = localCursor.getString(0);
      paramString.fja = localCursor.getInt(1);
      paramString.fjj = localCursor.getInt(2);
      paramString.fjk = localCursor.getString(3);
      paramString.fjl = localCursor.getString(4);
      paramString.signature = localCursor.getString(5);
    }
    localCursor.close();
    GMTrace.o(4439117135872L, 33074);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */