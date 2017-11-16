package com.tencent.mm.plugin.fts.c;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.a.g;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public final class e
  extends a
{
  public SQLiteStatement lzk;
  public SQLiteStatement lzl;
  public SQLiteStatement lzm;
  
  public e()
  {
    GMTrace.i(18555466678272L, 138249);
    GMTrace.o(18555466678272L, 138249);
  }
  
  protected final String aCh()
  {
    GMTrace.i(18556540420096L, 138257);
    String str = String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0, query TEXT COLLATE NOCASE, score INT, scene INT, meta_content TEXT);", new Object[] { aCf() });
    GMTrace.o(18556540420096L, 138257);
    return str;
  }
  
  public final int aCv()
  {
    GMTrace.i(18556271984640L, 138255);
    Object localObject1 = String.format("SELECT docid, query, score, scene, aux_index, entity_id, type, subtype, timestamp, meta_content FROM %s WHERE status > 0;", new Object[] { aCf() });
    Object localObject2 = this.lvN.rawQuery((String)localObject1, null);
    localObject1 = new ArrayList();
    while (((Cursor)localObject2).moveToNext())
    {
      localObject3 = new com.tencent.mm.plugin.fts.a.a.h();
      ((com.tencent.mm.plugin.fts.a.a.h)localObject3).b((Cursor)localObject2);
      ((List)localObject1).add(localObject3);
    }
    ((Cursor)localObject2).close();
    Object localObject3 = new LinkedList();
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    Iterator localIterator = ((List)localObject1).iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fts.a.a.h localh = (com.tencent.mm.plugin.fts.a.a.h)localIterator.next();
      if (localh.type == 262144) {}
      String str1;
      for (localObject1 = ((l)com.tencent.mm.kernel.h.j(l.class)).getFTSIndexStorage(17);; localObject1 = ((l)com.tencent.mm.kernel.h.j(l.class)).getFTSIndexStorage(3))
      {
        str1 = ((g)localObject1).bc(localh.lwH, localh.gRk);
        if (bg.nm(str1)) {
          break label449;
        }
        if (!localh.eQb.equals("​chatroom_tophits")) {
          break label387;
        }
        String[] arrayOfString = c.a.lws.split(localh.lxf);
        int j = arrayOfString.length;
        localObject1 = "";
        i = 0;
        while (i < j)
        {
          String str2 = arrayOfString[i];
          localObject2 = localObject1;
          if (str1.indexOf(str2) >= 0) {
            localObject2 = (String)localObject1 + str2 + "​";
          }
          i += 1;
          localObject1 = localObject2;
        }
      }
      if (!localh.lxf.equals(localObject1))
      {
        localh.lxf = ((String)localObject1);
        localLinkedList1.add(Long.valueOf(localh.lxc));
        localLinkedList2.add(localh);
      }
      else
      {
        ((LinkedList)localObject3).add(Long.valueOf(localh.lxc));
        continue;
        label387:
        if (!localh.lxf.equals(str1))
        {
          localh.lxf = str1;
          localLinkedList1.add(Long.valueOf(localh.lxc));
          localLinkedList2.add(localh);
        }
        else
        {
          ((LinkedList)localObject3).add(Long.valueOf(localh.lxc));
          continue;
          label449:
          localLinkedList1.add(Long.valueOf(localh.lxc));
        }
      }
    }
    w.i("MicroMsg.FTS.FTS5TopHitsStorage", "updateTopHitsDirty deleteDocIdList=%d needToInsertTopHitListSize=%d normalDocIdList=%d", new Object[] { Integer.valueOf(localLinkedList1.size()), Integer.valueOf(localLinkedList2.size()), Integer.valueOf(((LinkedList)localObject3).size()) });
    if (localLinkedList1.size() > 0) {
      aH(localLinkedList1);
    }
    if (localLinkedList2.size() > 0)
    {
      boolean bool = this.lvN.inTransaction();
      if (!bool) {
        this.lvN.beginTransaction();
      }
      localObject1 = localLinkedList2.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.tencent.mm.plugin.fts.a.a.h)((Iterator)localObject1).next();
        if (!bg.nm(((com.tencent.mm.plugin.fts.a.a.h)localObject2).lxf))
        {
          this.lzk.bindString(1, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).lxf);
          this.lzk.execute();
          this.lzl.bindLong(1, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).type);
          this.lzl.bindLong(2, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).gRk);
          this.lzl.bindLong(3, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).lxe);
          this.lzl.bindString(4, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).lwH);
          this.lzl.bindLong(5, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).timestamp);
          this.lzl.bindString(6, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).eQb);
          this.lzl.bindLong(7, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).lxd);
          this.lzl.bindLong(8, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).gpK);
          this.lzl.bindString(9, ((com.tencent.mm.plugin.fts.a.a.h)localObject2).lxf);
          this.lzl.execute();
        }
      }
      if (!bool) {
        commit();
      }
    }
    if (((LinkedList)localObject3).size() > 0) {
      g((List)localObject3, 0);
    }
    int i = localLinkedList1.size();
    GMTrace.o(18556271984640L, 138255);
    return i;
  }
  
  public final String getName()
  {
    GMTrace.i(18555735113728L, 138251);
    GMTrace.o(18555735113728L, 138251);
    return "FTS5TopHitsStorage";
  }
  
  public final int getPriority()
  {
    GMTrace.i(18556003549184L, 138253);
    GMTrace.o(18556003549184L, 138253);
    return 768;
  }
  
  protected final String getTableName()
  {
    GMTrace.i(18555600896000L, 138250);
    GMTrace.o(18555600896000L, 138250);
    return "TopHits";
  }
  
  public final int getType()
  {
    GMTrace.i(18555869331456L, 138252);
    GMTrace.o(18555869331456L, 138252);
    return 1;
  }
  
  protected final void vr()
  {
    GMTrace.i(18556137766912L, 138254);
    if (vs()) {
      this.lvN.l(-100L, 2L);
    }
    this.lvN.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s_query ON %s(query);", new Object[] { aCf(), aCf() }));
    this.lvN.execSQL(String.format("CREATE INDEX IF NOT EXISTS %s_score ON %s(score);", new Object[] { aCf(), aCf() }));
    String str = String.format("INSERT INTO %s (content) VALUES (?);", new Object[] { aCg() });
    this.lzk = this.lvN.compileStatement(str);
    str = String.format("INSERT INTO %s (docid, type, subtype, entity_id, aux_index, timestamp, query, score, scene, meta_content) VALUES (last_insert_rowid(), ?, ?, ?, ?, ?, ?, ?, ?, ?);", new Object[] { aCf() });
    this.lzl = this.lvN.compileStatement(str);
    str = String.format("UPDATE %s SET status=? WHERE aux_index=?", new Object[] { aCf() });
    this.lzm = this.lvN.compileStatement(str);
    GMTrace.o(18556137766912L, 138254);
  }
  
  protected final boolean vs()
  {
    GMTrace.i(18556674637824L, 138258);
    if (!ch(-100, 2))
    {
      GMTrace.o(18556674637824L, 138258);
      return true;
    }
    GMTrace.o(18556674637824L, 138258);
    return false;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18556406202368L, 138256);
    super.vt();
    this.lzk.close();
    this.lzl.close();
    this.lzm.close();
    GMTrace.o(18556406202368L, 138256);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */