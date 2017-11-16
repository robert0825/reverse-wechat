package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.b;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends b
{
  private k fTu;
  public com.tencent.mm.plugin.fts.c.d lyK;
  
  public d()
  {
    GMTrace.i(18542179123200L, 138150);
    GMTrace.o(18542179123200L, 138150);
  }
  
  public final a a(com.tencent.mm.plugin.fts.a.a.f paramf)
  {
    GMTrace.i(18542850211840L, 138155);
    paramf = new d(paramf);
    this.fTu.a(-65536, paramf);
    GMTrace.o(18542850211840L, 138155);
    return paramf;
  }
  
  public final void addSOSHistory(String paramString)
  {
    GMTrace.i(18542581776384L, 138153);
    a locala = new a();
    locala.lyL = paramString;
    this.fTu.a(132072, locala);
    GMTrace.o(18542581776384L, 138153);
  }
  
  public final void deleteSOSHistory()
  {
    GMTrace.i(20669798547456L, 154002);
    b localb = new b();
    this.fTu.a(132072, localb);
    GMTrace.o(20669798547456L, 154002);
  }
  
  public final void deleteSOSHistory(String paramString)
  {
    GMTrace.i(18542715994112L, 138154);
    c localc = new c();
    localc.lyL = paramString;
    this.fTu.a(132072, localc);
    GMTrace.o(18542715994112L, 138154);
  }
  
  public final String getName()
  {
    GMTrace.i(18542313340928L, 138151);
    GMTrace.o(18542313340928L, 138151);
    return "FTS5SearchSOSHistoryLogic";
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(18542447558656L, 138152);
    if (!((l)h.j(l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Fail!");
      GMTrace.o(18542447558656L, 138152);
      return false;
    }
    w.i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Success!");
    this.lyK = ((com.tencent.mm.plugin.fts.c.d)((l)h.j(l.class)).getFTSIndexStorage(1024));
    this.fTu = ((l)h.j(l.class)).getFTSTaskDaemon();
    GMTrace.o(18542447558656L, 138152);
    return true;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18542984429568L, 138156);
    this.lyK = null;
    this.fTu = null;
    GMTrace.o(18542984429568L, 138156);
    return true;
  }
  
  public final class a
    extends a
  {
    public String lyL;
    
    public a()
    {
      GMTrace.i(18520033198080L, 137985);
      GMTrace.o(18520033198080L, 137985);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18520167415808L, 137986);
      Object localObject = new StringBuffer();
      ((StringBuffer)localObject).append(this.lyL);
      ((StringBuffer)localObject).append("​");
      ((StringBuffer)localObject).append(com.tencent.mm.plugin.fts.a.d.ad(this.lyL, false));
      ((StringBuffer)localObject).append("​");
      ((StringBuffer)localObject).append(com.tencent.mm.plugin.fts.a.d.ad(this.lyL, true));
      com.tencent.mm.plugin.fts.c.d locald = d.this.lyK;
      String str = this.lyL;
      localObject = ((StringBuffer)localObject).toString();
      Cursor localCursor = locald.lvN.rawQuery(String.format("SELECT docid FROM %s WHERE history = ?", new Object[] { com.tencent.mm.plugin.fts.c.d.aCf() }), new String[] { str });
      long l = -1L;
      if (localCursor.moveToNext()) {
        l = localCursor.getLong(0);
      }
      localCursor.close();
      if (l >= 0L)
      {
        locald.lzj.bindLong(1, System.currentTimeMillis());
        locald.lzj.bindLong(2, l);
        locald.lzj.execute();
      }
      for (;;)
      {
        GMTrace.o(18520167415808L, 137986);
        return true;
        if (!locald.lvN.inTransaction()) {
          locald.lvN.beginTransaction();
        }
        locald.lvO.bindString(1, (String)localObject);
        locald.lvO.execute();
        locald.lvP.bindString(1, str);
        locald.lvP.bindLong(2, System.currentTimeMillis());
        locald.lvP.execute();
        if (locald.lvN.inTransaction()) {
          locald.lvN.commit();
        }
      }
    }
    
    public final String getName()
    {
      GMTrace.i(18520301633536L, 137987);
      GMTrace.o(18520301633536L, 137987);
      return "AddSOSHistoryTask";
    }
  }
  
  public final class b
    extends a
  {
    public b()
    {
      GMTrace.i(20669395894272L, 153999);
      GMTrace.o(20669395894272L, 153999);
    }
    
    public final boolean execute()
    {
      GMTrace.i(20669530112000L, 154000);
      d.this.lyK.lvN.execSQL(String.format("DELETE FROM %s ;", new Object[] { com.tencent.mm.plugin.fts.c.d.aCf() }));
      GMTrace.o(20669530112000L, 154000);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(20669664329728L, 154001);
      GMTrace.o(20669664329728L, 154001);
      return "DeleteSOSHistoryTask";
    }
  }
  
  public final class c
    extends a
  {
    public String lyL;
    
    public c()
    {
      GMTrace.i(18522314899456L, 138002);
      GMTrace.o(18522314899456L, 138002);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18522449117184L, 138003);
      com.tencent.mm.plugin.fts.c.d locald = d.this.lyK;
      String str = this.lyL;
      locald.lvN.execSQL(String.format("DELETE FROM %s WHERE history = ?;", new Object[] { com.tencent.mm.plugin.fts.c.d.aCf() }), new String[] { str });
      GMTrace.o(18522449117184L, 138003);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18522583334912L, 138004);
      GMTrace.o(18522583334912L, 138004);
      return "DeleteSOSHistoryTask";
    }
  }
  
  public final class d
    extends e
  {
    public d(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18516409319424L, 137958);
      GMTrace.o(18516409319424L, 137958);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18516543537152L, 137959);
      ArrayList localArrayList = new ArrayList();
      paramArrayOfString = d.this.lyK;
      Object localObject = paramf.eQb;
      int i = paramf.lwV;
      if (((String)localObject).trim().length() > 0)
      {
        paramf = com.tencent.mm.plugin.fts.a.d.t(new String[] { localObject });
        paramf = String.format("SELECT history FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' ORDER BY timestamp desc LIMIT " + i, new Object[] { com.tencent.mm.plugin.fts.c.d.aCf(), com.tencent.mm.plugin.fts.c.d.aCg(), com.tencent.mm.plugin.fts.c.d.aCf(), com.tencent.mm.plugin.fts.c.d.aCg(), com.tencent.mm.plugin.fts.c.d.aCg(), paramf });
        paramArrayOfString = paramArrayOfString.lvN.rawQuery(paramf, null);
      }
      while ((paramArrayOfString != null) && (paramArrayOfString.moveToNext()))
      {
        paramf = paramArrayOfString.getString(0);
        localObject = new j();
        ((i)localObject).content = paramf;
        localArrayList.add(localObject);
        continue;
        paramf = String.format("SELECT history FROM %s ORDER BY timestamp desc LIMIT " + i, new Object[] { com.tencent.mm.plugin.fts.c.d.aCf() });
        paramArrayOfString = paramArrayOfString.lvN.rawQuery(paramf, null);
      }
      paramArrayOfString.close();
      GMTrace.o(18516543537152L, 137959);
      return localArrayList;
    }
    
    public final String getName()
    {
      GMTrace.i(18516677754880L, 137960);
      GMTrace.o(18516677754880L, 137960);
      return "SearchSOSHistoryTask";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */