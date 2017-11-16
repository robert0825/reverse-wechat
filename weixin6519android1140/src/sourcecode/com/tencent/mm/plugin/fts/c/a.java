package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.Iterator;
import java.util.List;

public final class a
  extends com.tencent.mm.plugin.fts.a.a
{
  public SQLiteStatement lyY;
  public SQLiteStatement lyZ;
  private SQLiteStatement lza;
  public SQLiteStatement lzb;
  public SQLiteStatement lzc;
  private SQLiteStatement lzd;
  public SQLiteStatement lze;
  
  public a()
  {
    GMTrace.i(18553319194624L, 138233);
    GMTrace.o(18553319194624L, 138233);
  }
  
  protected final String aCh()
  {
    GMTrace.i(18554929807360L, 138245);
    String str = String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", new Object[] { aCf() });
    GMTrace.o(18554929807360L, 138245);
    return str;
  }
  
  protected final boolean aCi()
  {
    GMTrace.i(18555332460544L, 138248);
    GMTrace.o(18555332460544L, 138248);
    return true;
  }
  
  public final void g(String paramString, List<Long> paramList)
  {
    GMTrace.i(18553721847808L, 138236);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(18553721847808L, 138236);
      return;
    }
    boolean bool = this.lvN.inTransaction();
    if (!bool) {
      this.lvN.beginTransaction();
    }
    this.lzb.bindString(1, paramString);
    paramString = paramList.iterator();
    while (paramString.hasNext())
    {
      long l = ((Long)paramString.next()).longValue();
      this.lzb.bindLong(2, l);
      this.lzb.execute();
    }
    if (!bool) {
      this.lvN.commit();
    }
    GMTrace.o(18553721847808L, 138236);
  }
  
  public final String getName()
  {
    GMTrace.i(18554527154176L, 138242);
    GMTrace.o(18554527154176L, 138242);
    return "FTS5ContactStorage";
  }
  
  public final int getPriority()
  {
    GMTrace.i(18554795589632L, 138244);
    GMTrace.o(18554795589632L, 138244);
    return 3;
  }
  
  protected final String getTableName()
  {
    GMTrace.i(18554392936448L, 138241);
    GMTrace.o(18554392936448L, 138241);
    return "Contact";
  }
  
  public final int getType()
  {
    GMTrace.i(18554661371904L, 138243);
    GMTrace.o(18554661371904L, 138243);
    return 3;
  }
  
  public final void i(String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(18554124500992L, 138239);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      GMTrace.o(18554124500992L, 138239);
      return;
    }
    boolean bool = this.lvN.inTransaction();
    if (!bool) {
      this.lvN.beginTransaction();
    }
    this.lyY.bindString(1, paramString);
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      paramString = paramArrayOfString[i];
      this.lyY.bindString(2, paramString);
      this.lyY.execute();
      i += 1;
    }
    if (!bool) {
      this.lvN.commit();
    }
    GMTrace.o(18554124500992L, 138239);
  }
  
  protected final void vr()
  {
    GMTrace.i(18553453412352L, 138234);
    if (vs()) {
      this.lvN.l(-102L, 2L);
    }
    this.lvN.execSQL("CREATE TABLE IF NOT EXISTS FTS5ChatRoomMembers (chatroom TEXT, member TEXT);");
    this.lvN.execSQL("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_chatroom ON FTS5ChatRoomMembers(chatroom);");
    this.lvN.execSQL("CREATE INDEX IF NOT EXISTS FTS5ChatRoomMembers_member ON FTS5ChatRoomMembers(member);");
    this.lvN.execSQL("CREATE TABLE IF NOT EXISTS FTS5ContactLabels (user TEXT, label_id INTEGER);");
    this.lvN.execSQL("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_user ON FTS5ContactLabels(user);");
    this.lvN.execSQL("CREATE INDEX IF NOT EXISTS FTS5ContactLabels_label ON FTS5ContactLabels(label_id);");
    this.lyY = this.lvN.compileStatement("INSERT INTO FTS5ChatRoomMembers (chatroom, member) VALUES (?, ?);");
    this.lyZ = this.lvN.compileStatement("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=? AND member=?;");
    this.lza = this.lvN.compileStatement("DELETE FROM FTS5ChatRoomMembers WHERE chatroom=?;");
    this.lzb = this.lvN.compileStatement("INSERT INTO FTS5ContactLabels (user, label_id) VALUES (?, ?);");
    this.lzc = this.lvN.compileStatement("DELETE FROM FTS5ContactLabels WHERE user=? AND label_id=?;");
    this.lzd = this.lvN.compileStatement("DELETE FROM FTS5ContactLabels WHERE user=?;");
    this.lze = this.lvN.compileStatement("SELECT changes();");
    GMTrace.o(18553453412352L, 138234);
  }
  
  protected final boolean vs()
  {
    GMTrace.i(18555064025088L, 138246);
    if (!ch(-102, 2))
    {
      GMTrace.o(18555064025088L, 138246);
      return true;
    }
    GMTrace.o(18555064025088L, 138246);
    return false;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18553587630080L, 138235);
    super.vt();
    this.lyY.close();
    this.lyZ.close();
    this.lza.close();
    this.lzb.close();
    this.lzc.close();
    this.lzd.close();
    this.lze.close();
    GMTrace.o(18553587630080L, 138235);
    return true;
  }
  
  public final boolean w(String[] paramArrayOfString)
  {
    GMTrace.i(18555198242816L, 138247);
    StringBuilder localStringBuilder = new StringBuilder(32);
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      localStringBuilder.append(paramArrayOfString[i]);
      localStringBuilder.append("*");
      if (i != paramArrayOfString.length - 1) {
        localStringBuilder.append(" OR ");
      }
      i += 1;
    }
    paramArrayOfString = String.format("SELECT 1 FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND type=131072 LIMIT 1;", new Object[] { aCf(), aCg(), aCf(), aCg(), aCg(), localStringBuilder.toString() });
    paramArrayOfString = this.lvN.rawQuery(paramArrayOfString, null);
    boolean bool = paramArrayOfString.moveToNext();
    paramArrayOfString.close();
    GMTrace.o(18555198242816L, 138247);
    return bool;
  }
  
  public final void yY(String paramString)
  {
    GMTrace.i(18553856065536L, 138237);
    this.lzd.bindString(1, paramString);
    this.lzd.execute();
    GMTrace.o(18553856065536L, 138237);
  }
  
  public final Cursor yZ(String paramString)
  {
    GMTrace.i(18553990283264L, 138238);
    paramString = this.lvN.rawQuery("SELECT DISTINCT chatroom FROM FTS5ChatRoomMembers WHERE member=?;", new String[] { paramString });
    GMTrace.o(18553990283264L, 138238);
    return paramString;
  }
  
  public final void za(String paramString)
  {
    GMTrace.i(18554258718720L, 138240);
    this.lza.bindString(1, paramString);
    this.lza.execute();
    GMTrace.o(18554258718720L, 138240);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */