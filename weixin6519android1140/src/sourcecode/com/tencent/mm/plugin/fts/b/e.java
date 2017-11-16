package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

public final class e
  extends com.tencent.mm.plugin.fts.a.b
{
  private k fTu;
  public com.tencent.mm.plugin.fts.c.e lyN;
  HashSet<String> lyO;
  
  public e()
  {
    GMTrace.i(18535468236800L, 138100);
    GMTrace.o(18535468236800L, 138100);
  }
  
  public final com.tencent.mm.plugin.fts.a.a.a a(com.tencent.mm.plugin.fts.a.a.f paramf)
  {
    GMTrace.i(18535870889984L, 138103);
    paramf = new b(paramf);
    paramf = this.fTu.a(-65536, paramf);
    GMTrace.o(18535870889984L, 138103);
    return paramf;
  }
  
  public final void a(String paramString, i parami, int paramInt, HashMap<String, String> paramHashMap)
  {
    GMTrace.i(18536407760896L, 138107);
    c localc = new c();
    localc.eQb = paramString;
    localc.lyS = parami;
    localc.scene = paramInt;
    localc.lwy = paramHashMap;
    this.fTu.a(65626, localc);
    GMTrace.o(18536407760896L, 138107);
  }
  
  public final void c(int[] paramArrayOfInt, String paramString)
  {
    GMTrace.i(18536139325440L, 138105);
    this.lyN.a(paramArrayOfInt, paramString);
    GMTrace.o(18536139325440L, 138105);
  }
  
  public final String getName()
  {
    GMTrace.i(18536273543168L, 138106);
    GMTrace.o(18536273543168L, 138106);
    return "FTS5SearchTopHitsLogic";
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(18535602454528L, 138101);
    if (!((l)com.tencent.mm.kernel.h.j(l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Fail!");
      GMTrace.o(18535602454528L, 138101);
      return false;
    }
    w.i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Success!");
    this.lyO = new HashSet();
    this.lyN = ((com.tencent.mm.plugin.fts.c.e)((l)com.tencent.mm.kernel.h.j(l.class)).getFTSIndexStorage(1));
    this.fTu = ((l)com.tencent.mm.kernel.h.j(l.class)).getFTSTaskDaemon();
    this.fTu.a(65626, new a());
    GMTrace.o(18535602454528L, 138101);
    return true;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18535736672256L, 138102);
    if (this.lyO != null) {
      this.lyO.clear();
    }
    this.lyN = null;
    this.fTu = null;
    GMTrace.o(18535736672256L, 138102);
    return true;
  }
  
  public final void yX(String paramString)
  {
    GMTrace.i(18536005107712L, 138104);
    if (this.lyO.add(paramString))
    {
      com.tencent.mm.plugin.fts.c.e locale = this.lyN;
      locale.lzm.bindLong(1, 1L);
      locale.lzm.bindString(2, paramString);
      locale.lzm.execute();
    }
    GMTrace.o(18536005107712L, 138104);
  }
  
  private final class a
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    int lyP;
    int lyQ;
    
    public a()
    {
      GMTrace.i(18515872448512L, 137954);
      GMTrace.o(18515872448512L, 137954);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18516006666240L, 137955);
      this.lyQ = e.this.lyN.aCv();
      long l = System.currentTimeMillis();
      com.tencent.mm.plugin.fts.c.e locale = e.this.lyN;
      Object localObject = String.format("SELECT docid FROM %s WHERE timestamp < ? OR score = 0;", new Object[] { locale.aCf() });
      localObject = locale.lvN.rawQuery((String)localObject, new String[] { String.valueOf(l - 5184000000L) });
      LinkedList localLinkedList = new LinkedList();
      while (((Cursor)localObject).moveToNext()) {
        localLinkedList.add(Long.valueOf(((Cursor)localObject).getLong(0)));
      }
      ((Cursor)localObject).close();
      locale.aH(localLinkedList);
      this.lyP = localLinkedList.size();
      GMTrace.o(18516006666240L, 137955);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18516275101696L, 137957);
      GMTrace.o(18516275101696L, 137957);
      return "BuildTopHitsIndexTask";
    }
    
    public final String toString()
    {
      GMTrace.i(18516140883968L, 137956);
      String str = String.format("BuildTopHitsIndexTask [%d] [%d]", new Object[] { Integer.valueOf(this.lyQ), Integer.valueOf(this.lyP) });
      GMTrace.o(18516140883968L, 137956);
      return str;
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    private int[] fTN;
    private int scene;
    
    public b(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18526341431296L, 138032);
      this.fTN = paramf.lwT;
      this.scene = paramf.scene;
      GMTrace.o(18526341431296L, 138032);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18526475649024L, 138033);
      Object localObject3 = new HashSet();
      Object localObject1 = new LinkedList();
      Object localObject4 = e.this.lyN;
      Object localObject5 = this.lwP.eQb;
      Object localObject2 = this.fTN;
      int i = this.scene;
      int j = paramf.lwV + paramf.lwW.size();
      localObject5 = ((String)localObject5).trim() + '%';
      Object localObject6 = com.tencent.mm.plugin.fts.a.d.t(paramArrayOfString);
      localObject6 = String.format("AND %s MATCH '%s'", new Object[] { ((com.tencent.mm.plugin.fts.c.e)localObject4).aCg(), localObject6 });
      String str = "AND type IN " + com.tencent.mm.plugin.fts.a.d.j((int[])localObject2);
      if (j > 0)
      {
        localObject2 = "LIMIT " + j;
        localObject2 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, 1, type, subtype), query, scene FROM %s, %s WHERE %s %s %s %s %s AND %s.docid = %s.rowid ORDER BY score desc %s;", new Object[] { ((com.tencent.mm.plugin.fts.c.e)localObject4).aCf(), ((com.tencent.mm.plugin.fts.c.e)localObject4).aCg(), ((com.tencent.mm.plugin.fts.c.e)localObject4).aCg(), ((com.tencent.mm.plugin.fts.c.e)localObject4).aCf(), "query LIKE ?", localObject6, str, "AND scene=?", "AND status >= 0 AND score >= 3", ((com.tencent.mm.plugin.fts.c.e)localObject4).aCf(), ((com.tencent.mm.plugin.fts.c.e)localObject4).aCg(), localObject2 });
        localObject2 = ((com.tencent.mm.plugin.fts.a.a)localObject4).lvN.rawQuery((String)localObject2, new String[] { localObject5, String.valueOf(i) });
      }
      label1068:
      label1083:
      for (;;)
      {
        try
        {
          if (((Cursor)localObject2).moveToNext())
          {
            localObject4 = new j().e((Cursor)localObject2);
            if (!((HashSet)localObject3).add(((j)localObject4).lwH)) {
              continue;
            }
            ((j)localObject4).aCl();
            ((j)localObject4).userData = "";
            if (((j)localObject4).type == 262144)
            {
              ((j)localObject4).userData = ((com.tencent.mm.plugin.fts.c.b)((l)com.tencent.mm.kernel.h.j(l.class)).getFTSIndexStorage(17)).nZ((int)((j)localObject4).lxe);
              if (((j)localObject4).userData == null) {
                continue;
              }
            }
            ((List)localObject1).add(localObject4);
            i = ((List)localObject1).size();
            j = paramf.lwV;
            if (i < j) {
              continue;
            }
          }
          ((Cursor)localObject2).close();
          w.d("MicroMsg.FTS.FTS5SearchTopHitsLogic", "History TopHits %s", new Object[] { Integer.valueOf(((List)localObject1).size()) });
          if (paramArrayOfString.length <= 1) {
            break label1068;
          }
          if (((List)localObject1).size() <= 2) {
            break label1083;
          }
          localObject1 = ((List)localObject1).subList(0, 2);
          ((HashSet)localObject3).clear();
          i = 0;
          if (i < ((List)localObject1).size())
          {
            ((HashSet)localObject3).add(((i)((List)localObject1).get(i)).lwH);
            i += 1;
            continue;
            localObject2 = "";
            break;
          }
        }
        finally
        {
          ((Cursor)localObject2).close();
        }
        localObject2 = new HashSet();
        localObject4 = e.this.lyN;
        localObject6 = this.fTN;
        i = this.scene;
        j = paramf.lwV;
        int k = paramf.lwW.size();
        localObject5 = com.tencent.mm.plugin.fts.a.d.t(paramArrayOfString);
        localObject6 = " AND type IN " + com.tencent.mm.plugin.fts.a.d.j((int[])localObject6);
        localObject5 = String.format("SELECT aux_index FROM %s, %s WHERE %s.docid = %s.rowid AND query = ? AND scene = " + i + (String)localObject6 + " AND status >= 0 AND score >= 2" + String.format(" AND %s MATCH '%s'", new Object[] { ((com.tencent.mm.plugin.fts.c.e)localObject4).aCg(), localObject5 }) + " ORDER BY score desc limit " + (j + k) + ";", new Object[] { ((com.tencent.mm.plugin.fts.c.e)localObject4).aCf(), ((com.tencent.mm.plugin.fts.c.e)localObject4).aCg(), ((com.tencent.mm.plugin.fts.c.e)localObject4).aCf(), ((com.tencent.mm.plugin.fts.c.e)localObject4).aCg(), ((com.tencent.mm.plugin.fts.c.e)localObject4).aCf(), ((com.tencent.mm.plugin.fts.c.e)localObject4).aCg() });
        localObject4 = ((com.tencent.mm.plugin.fts.a.a)localObject4).lvN.rawQuery((String)localObject5, new String[] { "​chatroom_tophits" });
        while (((Cursor)localObject4).moveToNext())
        {
          localObject5 = ((Cursor)localObject4).getString(0);
          if (!((HashSet)localObject3).contains(localObject5)) {
            ((HashSet)localObject2).add(localObject5);
          }
        }
        ((Cursor)localObject4).close();
        localObject3 = (com.tencent.mm.plugin.fts.c.a)((l)com.tencent.mm.kernel.h.j(l.class)).getFTSIndexStorage(3);
        localObject4 = ((HashSet)localObject2).iterator();
        for (;;)
        {
          localObject2 = localObject1;
          if (!((Iterator)localObject4).hasNext()) {
            break;
          }
          localObject2 = (String)((Iterator)localObject4).next();
          localObject5 = com.tencent.mm.plugin.fts.a.d.t(paramArrayOfString);
          localObject5 = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, MMHighlight(%s, 1, type, subtype) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index = ? AND type = 131075 AND subtype= 38" + ";", new Object[] { ((com.tencent.mm.plugin.fts.c.a)localObject3).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject3).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject3).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject3).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject3).aCf(), ((com.tencent.mm.plugin.fts.c.a)localObject3).aCg(), ((com.tencent.mm.plugin.fts.c.a)localObject3).aCg(), localObject5 });
          localObject5 = ((com.tencent.mm.plugin.fts.a.a)localObject3).lvN.rawQuery((String)localObject5, new String[] { localObject2 });
          if (((Cursor)localObject5).moveToNext())
          {
            localObject2 = new j().e((Cursor)localObject5);
            ((j)localObject2).userData = "​chatroom_tophits";
            ((j)localObject2).aCl();
            ((List)localObject1).add(localObject2);
            localObject2 = localObject1;
            if (((List)localObject1).size() >= paramf.lwV) {
              break;
            }
          }
          ((Cursor)localObject5).close();
        }
        localObject2 = localObject1;
        GMTrace.o(18526475649024L, 138033);
        return (List<i>)localObject2;
      }
    }
    
    public final int getId()
    {
      GMTrace.i(18526744084480L, 138035);
      GMTrace.o(18526744084480L, 138035);
      return 8;
    }
    
    public final String getName()
    {
      GMTrace.i(18526609866752L, 138034);
      GMTrace.o(18526609866752L, 138034);
      return "SearchTopHitsTask";
    }
  }
  
  private final class c
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public String eQb;
    public HashMap<String, String> lwy;
    public i lyS;
    public int scene;
    
    public c()
    {
      GMTrace.i(18546339872768L, 138181);
      GMTrace.o(18546339872768L, 138181);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18546474090496L, 138182);
      com.tencent.mm.plugin.fts.c.e locale = e.this.lyN;
      Object localObject1 = this.eQb;
      i locali = this.lyS;
      int k = this.scene;
      Object localObject3 = this.lwy;
      Object localObject2 = ((String)localObject1).trim();
      ((HashMap)localObject3).remove(locali.lwH);
      boolean bool = locale.lvN.inTransaction();
      if (!bool) {
        locale.lvN.beginTransaction();
      }
      long l = System.currentTimeMillis();
      localObject1 = locali.lwH;
      int i = locali.gRk;
      Object localObject4 = String.format("SELECT docid, score FROM %s WHERE query=? AND aux_index=? AND subtype = ? AND scene=?;", new Object[] { locale.aCf() });
      localObject1 = locale.lvN.rawQuery((String)localObject4, new String[] { localObject2, localObject1, String.valueOf(i), String.valueOf(k) });
      int j;
      if (((Cursor)localObject1).moveToNext())
      {
        i = ((Cursor)localObject1).getInt(0);
        j = ((Cursor)localObject1).getInt(1);
      }
      for (;;)
      {
        ((Cursor)localObject1).close();
        localObject1 = "";
        localObject4 = ((HashMap)localObject3).entrySet().iterator();
        Object localObject5;
        if (((Iterator)localObject4).hasNext())
        {
          localObject5 = (Map.Entry)((Iterator)localObject4).next();
          if (((String)((Map.Entry)localObject5).getValue()).equals("​chatroom_tophits")) {
            break label1397;
          }
          localObject1 = (String)localObject1 + "'" + (String)((Map.Entry)localObject5).getKey() + "',";
        }
        label653:
        label876:
        label1394:
        label1397:
        for (;;)
        {
          break;
          if (((String)localObject1).length() > 0)
          {
            localObject1 = "AND aux_index IN (" + ((String)localObject1).substring(0, ((String)localObject1).length() - 1) + ")";
            localObject1 = String.format("UPDATE %s SET score=CASE WHEN score > 6 THEN 6 WHEN score > 2 THEN (score - 1) ELSE score END WHERE scene = %d %s;", new Object[] { locale.aCf(), Integer.valueOf(k), localObject1 });
            locale.lvN.execSQL((String)localObject1);
          }
          localObject1 = "";
          localObject3 = ((HashMap)localObject3).entrySet().iterator();
          if (((Iterator)localObject3).hasNext())
          {
            localObject4 = (Map.Entry)((Iterator)localObject3).next();
            if (!((String)((Map.Entry)localObject4).getValue()).equals("​chatroom_tophits")) {
              break label1394;
            }
            localObject1 = (String)localObject1 + "'" + (String)((Map.Entry)localObject4).getKey() + "',";
          }
          for (;;)
          {
            break;
            if (((String)localObject1).length() > 0)
            {
              localObject1 = "AND aux_index IN(" + ((String)localObject1).substring(0, ((String)localObject1).length() - 1) + ")";
              localObject1 = String.format("UPDATE %s SET score=CASE WHEN score = 1 THEN 0 WHEN score < 5 THEN (score - 1) ELSE 4 END WHERE query = ? AND scene = %d %s;", new Object[] { locale.aCf(), Integer.valueOf(k), localObject1 });
              locale.lvN.execSQL((String)localObject1, new String[] { "​chatroom_tophits" });
            }
            if ((i >= 0) && (j >= 0)) {
              if (j > 6)
              {
                j += 1;
                localObject1 = String.format("UPDATE %s SET score=?, timestamp=? WHERE docid=?", new Object[] { locale.aCf() });
                locale.lvN.execSQL((String)localObject1, new String[] { String.valueOf(j), String.valueOf(l), String.valueOf(i) });
                if (!bool) {
                  locale.lvN.commit();
                }
                localObject1 = c.a.lww.split((CharSequence)localObject2);
                if ((localObject1.length > 1) && (locali.type == 131075) && (locali.gRk == 38)) {
                  break label876;
                }
              }
            }
            for (;;)
            {
              GMTrace.o(18546474090496L, 138182);
              return true;
              j += 3;
              break;
              locale.lzk.bindString(1, locali.content);
              locale.lzk.execute();
              locale.lzl.bindLong(1, locali.type);
              locale.lzl.bindLong(2, locali.gRk);
              locale.lzl.bindLong(3, locali.lxe);
              locale.lzl.bindString(4, locali.lwH);
              locale.lzl.bindLong(5, l);
              locale.lzl.bindString(6, (String)localObject2);
              locale.lzl.bindLong(7, 3L);
              locale.lzl.bindLong(8, k);
              locale.lzl.bindString(9, locali.content);
              locale.lzl.execute();
              break label653;
              localObject2 = new HashSet();
              localObject3 = new com.tencent.mm.plugin.fts.a.a.h();
              localObject4 = String.format("SELECT docid, query, score, scene, aux_index, entity_id, type, subtype, timestamp, meta_content FROM %s WHERE aux_index=? AND query=?;", new Object[] { locale.aCf() });
              localObject4 = locale.lvN.rawQuery((String)localObject4, new String[] { locali.lwH, "​chatroom_tophits" });
              if (((Cursor)localObject4).moveToNext())
              {
                ((com.tencent.mm.plugin.fts.a.a.h)localObject3).b((Cursor)localObject4);
                localObject5 = c.a.lws.split(((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxf);
                j = localObject5.length;
                i = 0;
                while (i < j)
                {
                  ((HashSet)localObject2).add(localObject5[i]);
                  i += 1;
                }
              }
              ((Cursor)localObject4).close();
              i = 0;
              while ((i < locali.lxl.size()) && (i < localObject1.length))
              {
                localObject4 = (com.tencent.mm.plugin.fts.a.a.d)locali.lxl.get(i);
                if (((HashSet)localObject2).add(((com.tencent.mm.plugin.fts.a.a.d)localObject4).content)) {
                  ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxf = (((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxf + ((com.tencent.mm.plugin.fts.a.a.d)localObject4).content + "​");
                }
                i += 1;
              }
              w.i("MicroMsg.FTS.FTS5TopHitsStorage", "update tophits content=%s", new Object[] { ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxf });
              if (((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxc > 0L) {
                locale.h(Long.valueOf(((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxc));
              }
              ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxc = 0L;
              ((com.tencent.mm.plugin.fts.a.a.h)localObject3).eQb = "​chatroom_tophits";
              ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxd += 1L;
              ((com.tencent.mm.plugin.fts.a.a.h)localObject3).gpK = k;
              ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lwH = locali.lwH;
              ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxe = locali.lxe;
              ((com.tencent.mm.plugin.fts.a.a.h)localObject3).type = locali.type;
              ((com.tencent.mm.plugin.fts.a.a.h)localObject3).gRk = locali.gRk;
              ((com.tencent.mm.plugin.fts.a.a.h)localObject3).timestamp = l;
              locale.lzk.bindString(1, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxf);
              locale.lzk.execute();
              locale.lzl.bindLong(1, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).type);
              locale.lzl.bindLong(2, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).gRk);
              locale.lzl.bindLong(3, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxe);
              locale.lzl.bindString(4, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lwH);
              locale.lzl.bindLong(5, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).timestamp);
              locale.lzl.bindString(6, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).eQb);
              locale.lzl.bindLong(7, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxd);
              locale.lzl.bindLong(8, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).gpK);
              locale.lzl.bindString(9, ((com.tencent.mm.plugin.fts.a.a.h)localObject3).lxf);
              locale.lzl.execute();
            }
          }
        }
        j = -1;
        i = -1;
      }
    }
    
    public final String getName()
    {
      GMTrace.i(18546742525952L, 138184);
      GMTrace.o(18546742525952L, 138184);
      return "UpdateTopHitsWithQueryTask";
    }
    
    public final String toString()
    {
      GMTrace.i(18546608308224L, 138183);
      String str = String.format("%s : query=%s scene=%d", new Object[] { super.toString(), this.eQb, Integer.valueOf(this.scene) });
      GMTrace.o(18546608308224L, 138183);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */