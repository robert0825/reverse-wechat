package com.tencent.mm.plugin.fts;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.jni.FTSJNIUtils;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteDoneException;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.CancellationSignal;
import java.io.File;

public final class c
  implements f
{
  private SQLiteDatabase lvc;
  private SQLiteStatement lvd;
  private SQLiteStatement lve;
  private SQLiteStatement lvf;
  
  public c(String paramString)
  {
    GMTrace.i(18557077291008L, 138261);
    w.i("MicroMsg.FTS.FTSIndexDB", "Create SearchStorage: %s", new Object[] { paramString });
    if (this.lvc != null)
    {
      w.w("MicroMsg.FTS.FTSIndexDB", "before initDB, pre DB is not close, why?");
      this.lvc.close();
    }
    paramString = new File(paramString, "FTS5IndexMicroMsg.db").getAbsolutePath();
    long l1 = System.currentTimeMillis();
    this.lvc = SQLiteDatabase.openOrCreateDatabase(paramString, null);
    Object localObject = p.sZ();
    h.xz();
    h.xw();
    long l2 = com.tencent.mm.kernel.a.ww();
    localObject = g.o(((String)localObject + l2).getBytes());
    SQLiteDatabase localSQLiteDatabase = this.lvc;
    l2 = localSQLiteDatabase.acquireNativeConnectionHandle("initFTS", false, false);
    FTSJNIUtils.nativeInitFts(l2, (byte[])localObject);
    localSQLiteDatabase.releaseNativeConnection(l2, null);
    l2 = System.currentTimeMillis();
    com.tencent.mm.plugin.fts.a.e.t(18, l2 - l1);
    w.i("MicroMsg.FTS.FTSIndexDB", "initDB index params %d %s", new Object[] { Long.valueOf(l2 - l1), bg.eL(com.tencent.mm.a.e.aY(paramString)) });
    this.lvc.rawQuery("PRAGMA journal_mode=WAL;", null).close();
    this.lvc.execSQL("PRAGMA synchronous=NORMAL;");
    this.lvc.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (type INTEGER PRIMARY KEY, version INTEGER);", new Object[] { "FTS5IndexVersion" }));
    this.lvd = this.lvc.compileStatement(String.format("SELECT version FROM %s WHERE type=?;", new Object[] { "FTS5IndexVersion" }));
    this.lve = this.lvc.compileStatement(String.format("INSERT OR REPLACE INTO %s (type, version) VALUES (?, ?);", new Object[] { "FTS5IndexVersion" }));
    this.lvf = this.lvc.compileStatement(String.format("DELETE FROM %s WHERE type=?", new Object[] { "FTS5IndexVersion" }));
    GMTrace.o(18557077291008L, 138261);
  }
  
  protected static final void aCc()
  {
    GMTrace.i(18559090556928L, 138276);
    h.xz();
    new File(h.xy().cachePath, "FTS5IndexMicroMsg.db").delete();
    GMTrace.o(18559090556928L, 138276);
  }
  
  public final Cursor a(String paramString, String[] paramArrayOfString, CancellationSignal paramCancellationSignal)
  {
    GMTrace.i(18557345726464L, 138263);
    w.d("MicroMsg.FTS.FTSIndexDB", "rawQuery: execute sql = %s", new Object[] { paramString });
    paramString = new a(this.lvc.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, paramString, paramArrayOfString, null, null));
    GMTrace.o(18557345726464L, 138263);
    return paramString;
  }
  
  /* Error */
  public final void beginTransaction()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 242
    //   5: ldc -12
    //   7: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: getfield 37	com/tencent/mm/plugin/fts/c:lvc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   14: ifnull +13 -> 27
    //   17: aload_0
    //   18: getfield 37	com/tencent/mm/plugin/fts/c:lvc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   21: invokevirtual 247	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   24: ifeq +14 -> 38
    //   27: ldc2_w 242
    //   30: ldc -12
    //   32: invokestatic 196	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: aload_0
    //   39: getfield 37	com/tencent/mm/plugin/fts/c:lvc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   42: invokevirtual 249	com/tencent/wcdb/database/SQLiteDatabase:beginTransaction	()V
    //   45: ldc2_w 242
    //   48: ldc -12
    //   50: invokestatic 196	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   53: goto -18 -> 35
    //   56: astore_1
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	c
    //   56	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	27	56	finally
    //   27	35	56	finally
    //   38	53	56	finally
  }
  
  public final boolean ch(int paramInt1, int paramInt2)
  {
    GMTrace.i(18557614161920L, 138265);
    if ((yL("FTS5IndexVersion")) && (this.lvd != null)) {}
    for (paramInt1 = (int)k(paramInt1, 0L);; paramInt1 = 0)
    {
      w.i("MicroMsg.FTS.FTSIndexDB", "dbVersion=%d | targetVersion=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt1 == paramInt2)
      {
        GMTrace.o(18557614161920L, 138265);
        return true;
      }
      GMTrace.o(18557614161920L, 138265);
      return false;
    }
  }
  
  public final void close()
  {
    GMTrace.i(18558419468288L, 138271);
    SQLiteDatabase localSQLiteDatabase = this.lvc;
    if (this.lvc == null) {}
    for (boolean bool = false;; bool = this.lvc.isOpen())
    {
      w.w("MicroMsg.FTS.FTSIndexDB", "close db:%s isOpen:%b ", new Object[] { localSQLiteDatabase, Boolean.valueOf(bool) });
      if ((this.lvc == null) || (!this.lvc.isOpen())) {
        break label145;
      }
      w.w("MicroMsg.FTS.FTSIndexDB", "close in trans :%b ", new Object[] { Boolean.valueOf(this.lvc.inTransaction()) });
      while (this.lvc.inTransaction()) {
        this.lvc.endTransaction();
      }
    }
    this.lvd.close();
    this.lve.close();
    this.lvc.close();
    this.lvc = null;
    label145:
    GMTrace.o(18558419468288L, 138271);
  }
  
  /* Error */
  public final void commit()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 294
    //   5: ldc_w 296
    //   8: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: getfield 37	com/tencent/mm/plugin/fts/c:lvc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   15: ifnull +13 -> 28
    //   18: aload_0
    //   19: getfield 37	com/tencent/mm/plugin/fts/c:lvc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   22: invokevirtual 247	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   25: ifne +15 -> 40
    //   28: ldc2_w 294
    //   31: ldc_w 296
    //   34: invokestatic 196	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: getfield 37	com/tencent/mm/plugin/fts/c:lvc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   44: invokevirtual 299	com/tencent/wcdb/database/SQLiteDatabase:setTransactionSuccessful	()V
    //   47: aload_0
    //   48: getfield 37	com/tencent/mm/plugin/fts/c:lvc	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   51: invokevirtual 289	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   54: ldc2_w 294
    //   57: ldc_w 296
    //   60: invokestatic 196	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   63: goto -26 -> 37
    //   66: astore_1
    //   67: aload_0
    //   68: monitorexit
    //   69: aload_1
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	c
    //   66	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	28	66	finally
    //   28	37	66	finally
    //   40	63	66	finally
  }
  
  public final SQLiteStatement compileStatement(String paramString)
  {
    GMTrace.i(18557479944192L, 138264);
    w.d("MicroMsg.FTS.FTSIndexDB", "compileStatement sql = %s", new Object[] { paramString });
    paramString = this.lvc.compileStatement(paramString);
    GMTrace.o(18557479944192L, 138264);
    return paramString;
  }
  
  public final void execSQL(String paramString)
  {
    GMTrace.i(18558151032832L, 138269);
    w.d("MicroMsg.FTS.FTSIndexDB", "execSQL: execute sql = %s", new Object[] { paramString });
    this.lvc.execSQL(paramString);
    GMTrace.o(18558151032832L, 138269);
  }
  
  public final void execSQL(String paramString, Object[] paramArrayOfObject)
  {
    GMTrace.i(18558285250560L, 138270);
    w.d("MicroMsg.FTS.FTSIndexDB", "execSQL: execute sql = %s", new Object[] { paramString });
    this.lvc.execSQL(paramString, paramArrayOfObject);
    GMTrace.o(18558285250560L, 138270);
  }
  
  public final boolean inTransaction()
  {
    GMTrace.i(18558687903744L, 138273);
    if ((this.lvc == null) || (!this.lvc.inTransaction()))
    {
      GMTrace.o(18558687903744L, 138273);
      return false;
    }
    GMTrace.o(18558687903744L, 138273);
    return true;
  }
  
  public final long k(long paramLong1, long paramLong2)
  {
    GMTrace.i(18557748379648L, 138266);
    this.lvd.bindLong(1, paramLong1);
    try
    {
      paramLong1 = this.lvd.simpleQueryForLong();
      GMTrace.o(18557748379648L, 138266);
      return paramLong1;
    }
    catch (SQLiteDoneException localSQLiteDoneException)
    {
      GMTrace.o(18557748379648L, 138266);
    }
    return paramLong2;
  }
  
  public final void l(long paramLong1, long paramLong2)
  {
    GMTrace.i(18557882597376L, 138267);
    this.lve.bindLong(1, paramLong1);
    this.lve.bindLong(2, paramLong2);
    this.lve.execute();
    GMTrace.o(18557882597376L, 138267);
  }
  
  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(18557211508736L, 138262);
    w.d("MicroMsg.FTS.FTSIndexDB", "rawQuery: execute sql = %s", new Object[] { paramString });
    paramString = new a(this.lvc.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, paramString, paramArrayOfString, null));
    GMTrace.o(18557211508736L, 138262);
    return paramString;
  }
  
  public final void rollback()
  {
    for (;;)
    {
      try
      {
        GMTrace.i(18558956339200L, 138275);
        if ((this.lvc != null) && (this.lvc.isOpen()) && (this.lvc.inTransaction())) {
          continue;
        }
        GMTrace.o(18558956339200L, 138275);
      }
      finally
      {
        try
        {
          this.lvc.endTransaction();
          GMTrace.o(18558956339200L, 138275);
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.FTS.FTSIndexDB", localException, "occur error \n%s", new Object[] { localException });
          GMTrace.o(18558956339200L, 138275);
        }
        localObject = finally;
      }
      return;
      w.i("MicroMsg.FTS.FTSIndexDB", "rollback");
    }
  }
  
  public final boolean yL(String paramString)
  {
    GMTrace.i(18558016815104L, 138268);
    paramString = this.lvc.rawQuery("SELECT 1 FROM sqlite_master WHERE type='table' AND name=?;", new String[] { paramString });
    boolean bool = paramString.moveToNext();
    paramString.close();
    GMTrace.o(18558016815104L, 138268);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */