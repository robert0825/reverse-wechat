package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.w;

public final class ae
  extends m
{
  public static final String[] fTX;
  public final g goN;
  
  static
  {
    GMTrace.i(4427440193536L, 32987);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS qqlist ( qq long  PRIMARY KEY , wexinstatus int  , groupid int  , username text  , nickname text  , pyinitial text  , quanpin text  , qqnickname text  , qqpyinitial text  , qqquanpin text  , qqremark text  , qqremarkpyinitial text  , qqremarkquanpin text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE INDEX IF NOT EXISTS groupid_index ON qqlist ( groupid ) ", "CREATE INDEX IF NOT EXISTS qq_index ON qqlist ( qq ) " };
    GMTrace.o(4427440193536L, 32987);
  }
  
  public ae(g paramg)
  {
    GMTrace.i(4426232233984L, 32978);
    this.goN = paramg;
    GMTrace.o(4426232233984L, 32978);
  }
  
  protected final boolean Hf()
  {
    GMTrace.i(4427171758080L, 32985);
    if ((this.goN == null) || (this.goN.bRk()))
    {
      if (this.goN == null) {}
      for (Object localObject = "null";; localObject = Boolean.valueOf(this.goN.bRk()))
      {
        w.w("MicroMsg.QQListStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        GMTrace.o(4427171758080L, 32985);
        return false;
      }
    }
    GMTrace.o(4427171758080L, 32985);
    return true;
  }
  
  public final int a(long paramLong, ad paramad)
  {
    int i = 0;
    GMTrace.i(4426903322624L, 32983);
    paramad = paramad.HV();
    if (paramad.size() > 0) {
      i = this.goN.update("qqlist", paramad, "qq=?", new String[] { String.valueOf(paramLong) });
    }
    if (i > 0) {
      b(3, this, String.valueOf(paramLong));
    }
    GMTrace.o(4426903322624L, 32983);
    return i;
  }
  
  public final boolean a(ad paramad)
  {
    GMTrace.i(4427037540352L, 32984);
    if (paramad == null)
    {
      GMTrace.o(4427037540352L, 32984);
      return false;
    }
    w.d("MicroMsg.QQListStorage", "insert: name:" + paramad.HX());
    paramad.eQl = -1;
    ContentValues localContentValues = paramad.HV();
    if ((int)this.goN.insert("qqlist", "qq", localContentValues) != -1)
    {
      b(2, this, paramad.gDV);
      GMTrace.o(4427037540352L, 32984);
      return true;
    }
    GMTrace.o(4427037540352L, 32984);
    return false;
  }
  
  public final ad am(long paramLong)
  {
    ad localad = null;
    GMTrace.i(4426634887168L, 32981);
    Object localObject = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.qq = \"" + paramLong + "\"";
    localObject = this.goN.a((String)localObject, null, 2);
    if (localObject == null)
    {
      GMTrace.o(4426634887168L, 32981);
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      localad = new ad();
      localad.b((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    GMTrace.o(4426634887168L, 32981);
    return localad;
  }
  
  public final Cursor b(int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(4426500669440L, 32980);
    w.d("MicroMsg.QQListStorage", "getByGroupID: GroupID:" + paramInt + ", searchby:" + paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramBoolean) {
      localStringBuilder.append("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt + "\" and ( ");
    }
    for (;;)
    {
      localStringBuilder.append("qqlist.qq like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.username like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.nickname like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.pyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.quanpin like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqnickname like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqpyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqquanpin like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqremark like '%" + paramString + "%' )");
      localStringBuilder.append(" order by reserved3");
      paramString = this.goN.a(localStringBuilder.toString(), null, 0);
      GMTrace.o(4426500669440L, 32980);
      return paramString;
      localStringBuilder.append("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt + "\" and (wexinstatus =\"1" + "\" or wexinstatus =\"2" + "\") and ( ");
    }
  }
  
  public final boolean gh(int paramInt)
  {
    bool3 = false;
    bool2 = false;
    GMTrace.i(4427305975808L, 32986);
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = this.goN.a("select reserved3 from qqlist where groupid=? and reserved3=?  limit 1", new String[] { String.valueOf(paramInt), "0" }, 2);
      boolean bool1 = bool2;
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject3 = localCursor;
        boolean bool4 = localCursor.moveToFirst();
        bool1 = bool2;
        if (bool4) {
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (localCursor != null)
      {
        localCursor.close();
        bool2 = bool1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject3 = localObject1;
        w.e("MicroMsg.QQListStorage", "[cpan] check qq list show head faild.:%s", new Object[] { localException.toString() });
        bool2 = bool3;
        if (localObject1 != null)
        {
          ((Cursor)localObject1).close();
          bool2 = bool3;
        }
      }
    }
    finally
    {
      if (localObject3 == null) {
        break label166;
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(4427305975808L, 32986);
    return bool2;
  }
  
  public final ad jV(String paramString)
  {
    Object localObject = null;
    GMTrace.i(4426769104896L, 32982);
    paramString = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.username = \"" + paramString + "\"";
    Cursor localCursor = this.goN.a(paramString, null, 2);
    if (localCursor == null)
    {
      GMTrace.o(4426769104896L, 32982);
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new ad();
      paramString.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(4426769104896L, 32982);
    return paramString;
  }
  
  public final Cursor n(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(4426366451712L, 32979);
    Object localObject;
    String[] arrayOfString;
    if (paramBoolean)
    {
      localObject = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid=?  order by reserved3";
      arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramInt);
    }
    for (;;)
    {
      localObject = this.goN.a((String)localObject, arrayOfString, 0);
      GMTrace.o(4426366451712L, 32979);
      return (Cursor)localObject;
      localObject = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid=? and (wexinstatus=? or wexinstatus=?) order by reserved3";
      arrayOfString = new String[3];
      arrayOfString[0] = String.valueOf(paramInt);
      arrayOfString[1] = "1";
      arrayOfString[2] = "2";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */