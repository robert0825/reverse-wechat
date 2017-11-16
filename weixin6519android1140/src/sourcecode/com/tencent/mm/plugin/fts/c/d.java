package com.tencent.mm.plugin.fts.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.a.g;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteStatement;

public final class d
  implements g
{
  private boolean evm;
  private boolean lvL;
  public f lvN;
  public SQLiteStatement lvO;
  public SQLiteStatement lvP;
  public SQLiteStatement lzj;
  
  public d()
  {
    GMTrace.i(18548621574144L, 138198);
    w.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create %s", new Object[] { "FTS5SOSHistoryStorage" });
    GMTrace.o(18548621574144L, 138198);
  }
  
  public static String aCf()
  {
    GMTrace.i(18549426880512L, 138204);
    String str = "FTS5MetaSOSHistory";
    GMTrace.o(18549426880512L, 138204);
    return str;
  }
  
  public static String aCg()
  {
    GMTrace.i(18549561098240L, 138205);
    String str = "FTS5IndexSOSHistory";
    GMTrace.o(18549561098240L, 138205);
    return str;
  }
  
  public final String bc(String paramString, int paramInt)
  {
    GMTrace.i(18549695315968L, 138206);
    GMTrace.o(18549695315968L, 138206);
    return null;
  }
  
  public final void create()
  {
    GMTrace.i(18548755791872L, 138199);
    w.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnCreate %s | isCreated =%b", new Object[] { "FTS5SOSHistoryStorage", Boolean.valueOf(this.evm) });
    int i;
    if (!this.evm)
    {
      if (((l)h.j(l.class)).isFTSContextReady()) {
        break label91;
      }
      w.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Fail!");
      i = 0;
      if (i != 0)
      {
        w.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetCreated");
        this.evm = true;
      }
    }
    GMTrace.o(18548755791872L, 138199);
    return;
    label91:
    this.lvN = ((l)h.j(l.class)).getFTSIndexDB();
    w.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Success!");
    if ((this.lvN.yL(aCg())) && (this.lvN.yL(aCf()))) {
      w.d("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Exist, Not Need To Create");
    }
    for (;;)
    {
      String str1 = String.format("INSERT INTO %s (content) VALUES (?);", new Object[] { aCg() });
      this.lvO = this.lvN.compileStatement(str1);
      str1 = String.format("INSERT INTO %s (docid, history, timestamp) VALUES (last_insert_rowid(), ?, ?);", new Object[] { aCf() });
      this.lvP = this.lvN.compileStatement(str1);
      str1 = String.format("UPDATE %s SET timestamp=? WHERE docid = ?", new Object[] { aCf() });
      this.lzj = this.lvN.compileStatement(str1);
      i = 1;
      break;
      w.d("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Not Exist, Need To Create");
      str1 = String.format("DROP TABLE IF EXISTS %s;", new Object[] { aCg() });
      String str2 = String.format("DROP TABLE IF EXISTS %s;", new Object[] { aCf() });
      this.lvN.execSQL(str1);
      this.lvN.execSQL(str2);
      str1 = String.format("CREATE VIRTUAL TABLE %s USING fts5(content, tokenize='mmSimple', prefix='1 2 3 4 5');", new Object[] { aCg() });
      this.lvN.execSQL(str1);
      str1 = String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, history TEXT, timestamp INTEGER);", new Object[] { aCf() });
      this.lvN.execSQL(str1);
      this.lvN.execSQL(String.format("CREATE INDEX IF NOT EXISTS SOSHistory_history ON %s(history);", new Object[] { aCf() }));
      this.lvN.execSQL(String.format("CREATE INDEX IF NOT EXISTS SOSHistory_timestamp ON %s(timestamp);", new Object[] { aCf() }));
    }
  }
  
  public final void destroy()
  {
    GMTrace.i(18548890009600L, 138200);
    w.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnDestroy %s | isDestroyed %b | isCreated %b", new Object[] { "FTS5SOSHistoryStorage", Boolean.valueOf(this.lvL), Boolean.valueOf(this.evm) });
    if ((!this.lvL) && (this.evm))
    {
      this.lvO.close();
      this.lzj.close();
      this.lvP.close();
      w.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetDestroyed");
      this.lvL = true;
    }
    GMTrace.o(18548890009600L, 138200);
  }
  
  public final String getName()
  {
    GMTrace.i(18549024227328L, 138201);
    GMTrace.o(18549024227328L, 138201);
    return "FTS5SOSHistoryStorage";
  }
  
  public final int getPriority()
  {
    GMTrace.i(18549292662784L, 138203);
    GMTrace.o(18549292662784L, 138203);
    return 1024;
  }
  
  public final int getType()
  {
    GMTrace.i(18549158445056L, 138202);
    GMTrace.o(18549158445056L, 138202);
    return 1024;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */