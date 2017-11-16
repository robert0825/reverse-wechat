package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
  extends a
{
  public SQLiteStatement lzh;
  private SQLiteStatement lzi;
  
  public c()
  {
    GMTrace.i(18551708581888L, 138221);
    GMTrace.o(18551708581888L, 138221);
  }
  
  public final void a(int paramInt, long paramLong1, String paramString1, long paramLong2, String paramString2, String paramString3)
  {
    GMTrace.i(18553184976896L, 138232);
    try
    {
      this.lvO.bindString(1, paramString2);
      this.lvO.execute();
      this.lzi.bindLong(1, 65536L);
      this.lzi.bindLong(2, paramInt);
      this.lzi.bindLong(3, paramLong1);
      this.lzi.bindString(4, paramString1);
      this.lzi.bindLong(5, paramLong2);
      this.lzi.bindString(6, paramString3);
      this.lzi.execute();
      GMTrace.o(18553184976896L, 138232);
      return;
    }
    catch (SQLiteException paramString2)
    {
      w.e("MicroMsg.FTS.FTS5MessageStorage", String.format("Failed inserting index: 0x%x, %d, %d, %s, %d", new Object[] { Integer.valueOf(65536), Integer.valueOf(paramInt), Long.valueOf(paramLong1), paramString1, Long.valueOf(paramLong2) }));
      paramString1 = this.lvV.simpleQueryForString();
      if ((paramString1 != null) && (paramString1.length() > 0)) {
        w.e("MicroMsg.FTS.FTS5MessageStorage", ">> " + paramString1);
      }
      throw paramString2;
    }
  }
  
  public final void a(int[] paramArrayOfInt, long paramLong1, long paramLong2)
  {
    GMTrace.i(18552648105984L, 138228);
    ArrayList localArrayList = new ArrayList(4);
    paramArrayOfInt = String.format("SELECT docid FROM %s WHERE type IN " + d.j(paramArrayOfInt) + " AND entity_id=? AND timestamp=?;", new Object[] { aCf() });
    paramArrayOfInt = this.lvN.rawQuery(paramArrayOfInt, new String[] { Long.toString(paramLong1), Long.toString(paramLong2) });
    while (paramArrayOfInt.moveToNext()) {
      localArrayList.add(Long.valueOf(paramArrayOfInt.getLong(0)));
    }
    paramArrayOfInt.close();
    aH(localArrayList);
    GMTrace.o(18552648105984L, 138228);
  }
  
  protected final String aCh()
  {
    GMTrace.i(18553050759168L, 138231);
    String str = String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, talker TEXT);", new Object[] { aCf() });
    GMTrace.o(18553050759168L, 138231);
    return str;
  }
  
  public final Cursor b(String[] paramArrayOfString, List<String> paramList)
  {
    GMTrace.i(18552782323712L, 138229);
    paramArrayOfString = d.t(paramArrayOfString);
    Object localObject = new StringBuffer();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ((StringBuffer)localObject).append("'");
      ((StringBuffer)localObject).append(str);
      ((StringBuffer)localObject).append("',");
    }
    localObject = ((StringBuffer)localObject).substring(0, ((StringBuffer)localObject).length() - 1);
    paramArrayOfString = String.format("SELECT MessageCount(%d, aux_index) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index IN (%s) AND status >= 0;", new Object[] { Integer.valueOf(paramList.size()), aCf(), aCg(), aCf(), aCg(), aCg(), paramArrayOfString, localObject });
    paramArrayOfString = this.lvN.rawQuery(paramArrayOfString, null);
    GMTrace.o(18552782323712L, 138229);
    return paramArrayOfString;
  }
  
  public final String getName()
  {
    GMTrace.i(18552245452800L, 138225);
    GMTrace.o(18552245452800L, 138225);
    return "FTS5MessageStorage";
  }
  
  public final int getPriority()
  {
    GMTrace.i(18552513888256L, 138227);
    GMTrace.o(18552513888256L, 138227);
    return 4;
  }
  
  protected final String getTableName()
  {
    GMTrace.i(18552111235072L, 138224);
    GMTrace.o(18552111235072L, 138224);
    return "Message";
  }
  
  public final int getType()
  {
    GMTrace.i(18552379670528L, 138226);
    GMTrace.o(18552379670528L, 138226);
    return 4;
  }
  
  protected final void vr()
  {
    GMTrace.i(18551842799616L, 138222);
    if (vs())
    {
      this.lvN.l(-105L, 3L);
      this.lvN.l(-200L, Long.MAX_VALUE);
    }
    this.lvN.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s_timestamp ON %s(timestamp);", new Object[] { aCf(), aCf() }));
    String str = String.format("UPDATE %s SET status = ? WHERE aux_index = ? AND status <> ?", new Object[] { aCf() });
    this.lzh = this.lvN.compileStatement(str);
    str = String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, talker) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?);", new Object[] { aCf() });
    this.lzi = this.lvN.compileStatement(str);
    GMTrace.o(18551842799616L, 138222);
  }
  
  protected final boolean vs()
  {
    GMTrace.i(18552916541440L, 138230);
    if (!ch(-105, 3))
    {
      GMTrace.o(18552916541440L, 138230);
      return true;
    }
    GMTrace.o(18552916541440L, 138230);
    return false;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18551977017344L, 138223);
    this.lzh.close();
    this.lzi.close();
    boolean bool = super.vt();
    GMTrace.o(18551977017344L, 138223);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */