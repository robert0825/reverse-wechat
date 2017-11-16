package com.tencent.mm.plugin.game.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.x.a.a.a;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends com.tencent.mm.plugin.fts.a.b
{
  public k fTu;
  private j.a hWj;
  public a lGe;
  
  public b()
  {
    GMTrace.i(17980075278336L, 133962);
    this.hWj = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(17979135754240L, 133955);
        w.i("MicroMsg.FTS.FTS5SearchGameLogic", "appinfo storage change: event=%s | eventData=%s", new Object[] { paramAnonymousString, paramAnonymousl });
        switch (paramAnonymousl.iqq)
        {
        }
        for (;;)
        {
          GMTrace.o(17979135754240L, 133955);
          return;
          b.this.fTu.a(65606, new b.b(b.this, paramAnonymousl.obj.toString()));
          GMTrace.o(17979135754240L, 133955);
          return;
          b.this.fTu.a(65606, new b.a(b.this, paramAnonymousl.obj.toString()));
        }
      }
    };
    GMTrace.o(17980075278336L, 133962);
  }
  
  public final com.tencent.mm.plugin.fts.a.a.a a(com.tencent.mm.plugin.fts.a.a.f paramf)
  {
    GMTrace.i(17980209496064L, 133963);
    paramf = new c(paramf);
    paramf = this.fTu.a(-65536, paramf);
    GMTrace.o(17980209496064L, 133963);
    return paramf;
  }
  
  public final String getName()
  {
    GMTrace.i(17980612149248L, 133966);
    GMTrace.o(17980612149248L, 133966);
    return "FTS5SearchGameLogic";
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(17980343713792L, 133964);
    if (!((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTS5SearchGameLogic", "Create Fail!");
      GMTrace.o(17980343713792L, 133964);
      return false;
    }
    w.i("MicroMsg.FTS.FTS5SearchGameLogic", "Create Success!");
    this.lGe = ((a)((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSIndexStorage(16));
    this.fTu = ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSTaskDaemon();
    this.fTu.a(65606, new d());
    a.a.aWD().aWB().c(this.hWj);
    GMTrace.o(17980343713792L, 133964);
    return true;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(17980477931520L, 133965);
    a.a.aWD().aWB().j(this.hWj);
    this.lGe = null;
    this.fTu = null;
    GMTrace.o(17980477931520L, 133965);
    return true;
  }
  
  final class a
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private String appId;
    
    public a(String paramString)
    {
      GMTrace.i(17979672625152L, 133959);
      this.appId = paramString;
      GMTrace.o(17979672625152L, 133959);
    }
    
    public final boolean execute()
    {
      GMTrace.i(17979806842880L, 133960);
      w.i("MicroMsg.FTS.FTS5SearchGameLogic", "delete app info appId=%s", new Object[] { this.appId });
      b.this.lGe.a(c.lvZ, this.appId);
      GMTrace.o(17979806842880L, 133960);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(17979941060608L, 133961);
      String str = String.format("DeleteGame [%s]", new Object[] { this.appId });
      GMTrace.o(17979941060608L, 133961);
      return str;
    }
  }
  
  final class b
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private String appId;
    private String name;
    
    public b(String paramString)
    {
      GMTrace.i(17979269971968L, 133956);
      this.appId = paramString;
      GMTrace.o(17979269971968L, 133956);
    }
    
    public final boolean execute()
    {
      GMTrace.i(17979404189696L, 133957);
      com.tencent.mm.pluginsdk.model.app.f localf = a.a.aWD().aWB().Ox(this.appId);
      if ((localf == null) || (!localf.bJs()))
      {
        GMTrace.o(17979404189696L, 133957);
        return true;
      }
      w.i("MicroMsg.FTS.FTS5SearchGameLogic", "insert app info appId=%s", new Object[] { this.appId });
      b.this.lGe.beginTransaction();
      b.this.lGe.a(c.lvZ, this.appId);
      long l = System.currentTimeMillis();
      b.this.lGe.a(327680, 1, 0L, localf.field_appId, l, localf.field_appName);
      b.this.lGe.commit();
      this.name = localf.field_appName;
      GMTrace.o(17979404189696L, 133957);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(17979538407424L, 133958);
      if (this.name == null) {}
      for (String str = "(skipped)";; str = this.name)
      {
        str = String.format("InsertGame [%s, %s]", new Object[] { str, this.appId });
        GMTrace.o(17979538407424L, 133958);
        return str;
      }
    }
  }
  
  final class c
    extends e
  {
    c(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(17977525141504L, 133943);
      GMTrace.o(17977525141504L, 133943);
    }
    
    protected final List<com.tencent.mm.plugin.fts.a.a.i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(17977659359232L, 133944);
      ArrayList localArrayList = new ArrayList();
      paramArrayOfString = b.this.lGe.a(paramArrayOfString, c.lvZ, true);
      try
      {
        while (paramArrayOfString.moveToNext())
        {
          j localj = new j();
          localj.e(paramArrayOfString);
          localj.aCl();
          localArrayList.add(localj);
        }
        if (paramArrayOfString == null) {
          break label100;
        }
      }
      catch (Throwable paramf)
      {
        throw paramf;
      }
      finally
      {
        if (paramArrayOfString != null) {
          paramArrayOfString.close();
        }
      }
      paramArrayOfString.close();
      label100:
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      if (paramf.lwX != null) {
        Collections.sort(localArrayList, paramf.lwX);
      }
      GMTrace.o(17977659359232L, 133944);
      return localArrayList;
    }
    
    public final int getId()
    {
      GMTrace.i(17977927794688L, 133946);
      GMTrace.o(17977927794688L, 133946);
      return 10;
    }
    
    public final String getName()
    {
      GMTrace.i(17977793576960L, 133945);
      GMTrace.o(17977793576960L, 133945);
      return "SearchGameTask";
    }
  }
  
  final class d
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    d()
    {
      GMTrace.i(17980746366976L, 133967);
      GMTrace.o(17980746366976L, 133967);
    }
    
    public final boolean execute()
    {
      GMTrace.i(17980880584704L, 133968);
      LinkedList localLinkedList = new LinkedList();
      Object localObject2 = a.a.aWD().aWB().bJz();
      if (localObject2 == null)
      {
        w.i("MicroMsg.FTS.FTS5SearchGameLogic", "Game cursor is null!");
        GMTrace.o(17980880584704L, 133968);
        return true;
      }
      try
      {
        com.tencent.mm.pluginsdk.model.app.f localf;
        if (((Cursor)localObject2).moveToFirst())
        {
          boolean bool;
          do
          {
            localf = new com.tencent.mm.pluginsdk.model.app.f();
            localf.b((Cursor)localObject2);
            localLinkedList.add(localf);
            bool = ((Cursor)localObject2).moveToNext();
          } while (bool);
        }
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        b.this.lGe.beginTransaction();
        b.this.lGe.h(c.lvZ);
        w.i("MicroMsg.FTS.FTS5SearchGameLogic", "current list size: %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
        localObject2 = localLinkedList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localf = (com.tencent.mm.pluginsdk.model.app.f)((Iterator)localObject2).next();
          long l = System.currentTimeMillis();
          b.this.lGe.a(327680, 1, 0L, localf.field_appId, l, localf.field_appName);
        }
        b.this.lGe.commit();
      }
      catch (Throwable localThrowable)
      {
        throw localThrowable;
      }
      finally
      {
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
      }
      w.d("MicroMsg.FTS.FTS5SearchGameLogic", "UpdateIndexTask %d", new Object[] { Integer.valueOf(((LinkedList)localObject1).size()) });
      GMTrace.o(17980880584704L, 133968);
      return true;
    }
    
    public final int getId()
    {
      GMTrace.i(17981149020160L, 133970);
      GMTrace.o(17981149020160L, 133970);
      return 7;
    }
    
    public final String getName()
    {
      GMTrace.i(17981014802432L, 133969);
      GMTrace.o(17981014802432L, 133969);
      return "UpdateGameIndexTask";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */