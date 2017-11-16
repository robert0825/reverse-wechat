package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import android.os.HandlerThread;
import android.util.Pair;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nu;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.b;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.jni.FTSJNIUtils;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class c
  extends b
  implements com.tencent.mm.plugin.messenger.foundation.a.a.c.a, j.a
{
  public k fTu;
  public com.tencent.mm.plugin.fts.a.h laK;
  public com.tencent.mm.plugin.fts.c.c lyp;
  public boolean lyq;
  private com.tencent.mm.sdk.b.c lyr;
  private com.tencent.mm.sdk.b.c lys;
  private com.tencent.mm.sdk.b.c lyt;
  public com.tencent.mm.sdk.b.c lyu;
  aj lyv;
  
  public c()
  {
    GMTrace.i(18546876743680L, 138185);
    this.lyq = false;
    this.lyr = new com.tencent.mm.sdk.b.c() {};
    this.lys = new com.tencent.mm.sdk.b.c() {};
    this.lyt = new com.tencent.mm.sdk.b.c() {};
    this.lyu = new com.tencent.mm.sdk.b.c() {};
    this.lyv = new aj(com.tencent.mm.kernel.h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(18541508034560L, 138145);
        if (!c.this.lyq)
        {
          c.this.lyq = true;
          c.this.fTu.a(131112, new c.a(c.this));
        }
        com.tencent.mm.sdk.b.a.vgX.c(c.this.lyu);
        GMTrace.o(18541508034560L, 138145);
        return false;
      }
      
      public final String toString()
      {
        GMTrace.i(18541642252288L, 138146);
        String str = super.toString() + "|mBackgroundTimer";
        GMTrace.o(18541642252288L, 138146);
        return str;
      }
    }, false);
    GMTrace.o(18546876743680L, 138185);
  }
  
  public static boolean a(f paramf)
  {
    GMTrace.i(18547816267776L, 138192);
    if ((bg.nm(paramf.eDs)) || (bg.nm(paramf.content)))
    {
      GMTrace.o(18547816267776L, 138192);
      return false;
    }
    if (paramf.eDs.endsWith("@app"))
    {
      GMTrace.o(18547816267776L, 138192);
      return false;
    }
    if ((!paramf.aCq()) && (!paramf.aCp()))
    {
      GMTrace.o(18547816267776L, 138192);
      return false;
    }
    GMTrace.o(18547816267776L, 138192);
    return true;
  }
  
  public static List<String> yW(String paramString)
  {
    GMTrace.i(18547950485504L, 138193);
    localObject1 = paramString;
    if (paramString.length() > 16) {
      localObject1 = paramString.substring(0, 16);
    }
    String str1 = SpellMap.nj((String)localObject1);
    ArrayList localArrayList = new ArrayList();
    String str2 = FTSJNIUtils.icuTokenizer(str1);
    String[] arrayOfString = str2.split(" ");
    paramString = new StringBuffer();
    int i = 0;
    for (;;)
    {
      if (i < arrayOfString.length) {
        localObject1 = paramString;
      }
      try
      {
        int j = Integer.valueOf(arrayOfString[i]).intValue();
        localObject1 = paramString;
        int k = Integer.valueOf(arrayOfString[(i + 1)]).intValue();
        localObject1 = paramString;
        int m = Integer.valueOf(arrayOfString[(i + 2)]).intValue();
        localObject1 = paramString;
        String str3 = str1.substring(j, k);
        Object localObject2;
        if ((m >= 400) && (m < 500))
        {
          if (k - j == 1)
          {
            localObject1 = paramString;
            paramString.append(str3);
          }
          else
          {
            localObject2 = paramString;
            localObject1 = paramString;
            if (paramString.length() > 0)
            {
              localObject1 = paramString;
              localArrayList.add(paramString.toString());
              localObject1 = paramString;
              localObject2 = new StringBuffer();
            }
            localObject1 = localObject2;
            localArrayList.add(str3);
            paramString = (String)localObject2;
          }
        }
        else
        {
          localObject2 = paramString;
          localObject1 = paramString;
          if (paramString.length() > 0)
          {
            localObject1 = paramString;
            localArrayList.add(paramString.toString());
            localObject1 = paramString;
            localObject2 = new StringBuffer();
          }
          paramString = (String)localObject2;
          localObject1 = localObject2;
          if (!str3.equals("*"))
          {
            paramString = (String)localObject2;
            localObject1 = localObject2;
            if (!str3.equals(" "))
            {
              localObject1 = localObject2;
              localArrayList.add(str3);
              paramString = (String)localObject2;
            }
          }
        }
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          paramString = (String)localObject1;
        }
      }
      if (paramString.length() > 0) {
        localArrayList.add(paramString.toString());
      }
      w.i("MicroMsg.FTS.FTS5SearchMessageLogic", "mmICUTokenize Query-tokenList: %s indexes: %s", new Object[] { localArrayList, str2 });
      GMTrace.o(18547950485504L, 138193);
      return localArrayList;
      i += 3;
    }
  }
  
  public final com.tencent.mm.plugin.fts.a.a.a a(com.tencent.mm.plugin.fts.a.a.f paramf)
  {
    GMTrace.i(18547010961408L, 138186);
    switch (paramf.lwS)
    {
    case 2: 
    default: 
      paramf = new i(paramf);
    }
    for (;;)
    {
      paramf = this.fTu.a(-65536, paramf);
      GMTrace.o(18547010961408L, 138186);
      return paramf;
      paramf = new h(paramf);
      continue;
      paramf = new g(paramf);
    }
  }
  
  public final void a(com.tencent.mm.plugin.messenger.foundation.a.a.c paramc, com.tencent.mm.plugin.messenger.foundation.a.a.c.c paramc1)
  {
    GMTrace.i(18547547832320L, 138190);
    if (paramc1.mUZ.equals("insert"))
    {
      paramc = new ArrayList();
      int j = 0;
      if (j < paramc1.mVa.size())
      {
        au localau = (au)paramc1.mVa.get(j);
        int i;
        if ((localau == null) || (bg.nm(localau.field_talker)) || (bg.nm(localau.field_content))) {
          i = 0;
        }
        for (;;)
        {
          if (i != 0) {
            paramc.add(localau);
          }
          j += 1;
          break;
          if (localau.field_talker.endsWith("@app")) {
            i = 0;
          } else if ((localau.field_type != 1) && (!localau.aCp())) {
            i = 0;
          } else {
            i = 1;
          }
        }
      }
      if (paramc.size() > 0) {
        this.fTu.a(65576, new e(paramc));
      }
    }
    GMTrace.o(18547547832320L, 138190);
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(18547682050048L, 138191);
    paramString = paramString.split(" ");
    if ((paramString == null) || (paramString.length == 0))
    {
      GMTrace.o(18547682050048L, 138191);
      return;
    }
    if (paramString[0].equals("delete_id"))
    {
      long l = bg.getLong(paramString[1], 0L);
      this.fTu.a(65576, new c(l));
      GMTrace.o(18547682050048L, 138191);
      return;
    }
    if (paramString[0].equals("delete_talker"))
    {
      paramString = paramString[1];
      this.fTu.a(65576, new d(paramString));
      GMTrace.o(18547682050048L, 138191);
      return;
    }
    if ((paramString[0].equals("delete_all")) && (paramString[1].equals("message"))) {
      this.fTu.a(65576, new b());
    }
    GMTrace.o(18547682050048L, 138191);
  }
  
  public final String getName()
  {
    GMTrace.i(18547413614592L, 138189);
    GMTrace.o(18547413614592L, 138189);
    return "FTS5SearchMessageLogic";
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(18547145179136L, 138187);
    if (!((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTS5SearchMessageLogic", "Create Fail!");
      GMTrace.o(18547145179136L, 138187);
      return false;
    }
    w.i("MicroMsg.FTS.FTS5SearchMessageLogic", "Create Success!");
    this.lyp = ((com.tencent.mm.plugin.fts.c.c)((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSIndexStorage(4));
    this.fTu = ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSTaskDaemon();
    this.laK = ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSMainDB();
    this.lyu.bPu();
    this.lyt.bPu();
    this.lys.bPu();
    this.lyr.bPu();
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().c(this);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this, null);
    GMTrace.o(18547145179136L, 138187);
    return true;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18547279396864L, 138188);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().j(this);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(this);
    this.lyu.dead();
    this.lyt.dead();
    this.lys.dead();
    this.lyr.dead();
    this.lyp = null;
    this.fTu = null;
    GMTrace.o(18547279396864L, 138188);
    return true;
  }
  
  private final class a
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int laR;
    private int laS;
    private long lyA;
    private int lyB;
    private HashSet<Pair<Long, Long>> lyy;
    private ArrayList<Long> lyz;
    private int mFailedCount;
    
    public a()
    {
      GMTrace.i(18530233745408L, 138061);
      this.lyy = null;
      this.lyz = null;
      this.lyA = Long.MAX_VALUE;
      this.lyB = 0;
      this.laR = 0;
      this.laS = 0;
      this.mFailedCount = 0;
      GMTrace.o(18530233745408L, 138061);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18530367963136L, 138062);
      this.lyA = c.this.lyp.lvN.k(-200L, Long.MAX_VALUE);
      w.i("MicroMsg.FTS.FTS5SearchMessageLogic", "Start building message index, last createTime: " + this.lyA);
      long l1;
      long l2;
      if (this.lyy == null)
      {
        this.lyy = new HashSet();
        this.lyz = new ArrayList();
        localObject1 = c.this.lyp.a(com.tencent.mm.plugin.fts.a.c.lvW, true, true, false, true, true);
        while (((Cursor)localObject1).moveToNext())
        {
          l1 = ((Cursor)localObject1).getLong(0);
          l2 = ((Cursor)localObject1).getLong(1);
          long l3 = ((Cursor)localObject1).getLong(2);
          if (((Cursor)localObject1).getInt(3) == -1) {
            this.lyz.add(Long.valueOf(l1));
          } else if (l3 <= this.lyA) {
            this.lyy.add(new Pair(Long.valueOf(l2), Long.valueOf(l3)));
          }
        }
        ((Cursor)localObject1).close();
      }
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      int i = Integer.MAX_VALUE;
      Object localObject1 = new String[2];
      Object localObject2 = new ArrayList();
      while (i >= 50)
      {
        localObject1[0] = Long.toString(this.lyA);
        localObject1[1] = Integer.toString(this.lyB);
        Object localObject3 = c.this.laK.rawQuery("SELECT msgId, talker, createTime, content, type, isSend FROM message WHERE createTime<=? AND createTime!=0 AND type in (1, 49) ORDER BY createTime DESC, msgId DESC LIMIT 50 OFFSET ?;", (String[])localObject1);
        i = 0;
        c.f localf;
        while (((Cursor)localObject3).moveToNext())
        {
          localf = new c.f(c.this);
          localf.eDr = ((Cursor)localObject3).getLong(0);
          localf.eDs = ((Cursor)localObject3).getString(1);
          localf.hcs = ((Cursor)localObject3).getLong(2);
          localf.content = ((Cursor)localObject3).getString(3);
          localf.msgType = ((Cursor)localObject3).getInt(4);
          localf.lyF = ((Cursor)localObject3).getInt(5);
          localf.lyE = 41;
          if (c.a(localf))
          {
            localf.aCr();
            if (localf.isAvailable()) {
              ((List)localObject2).add(localf);
            }
          }
          i += 1;
        }
        ((Cursor)localObject3).close();
        if (Thread.interrupted()) {
          throw new InterruptedException();
        }
        int j = ((List)localObject2).size();
        if (j == 0)
        {
          w.i("MicroMsg.FTS.FTS5SearchMessageLogic", "build msgRecList size %d", new Object[] { Integer.valueOf(j) });
          if (j <= 0) {
            break label790;
          }
          c.this.lyp.beginTransaction();
          localObject3 = ((List)localObject2).iterator();
          label517:
          if (!((Iterator)localObject3).hasNext()) {
            break label763;
          }
          localf = (c.f)((Iterator)localObject3).next();
          l1 = localf.eDr;
          l2 = localf.hcs;
          if (l2 != this.lyA) {
            break label749;
          }
        }
        for (this.lyB += 1;; this.lyB = 0)
        {
          Pair localPair = new Pair(Long.valueOf(l1), Long.valueOf(l2));
          if (this.lyy.remove(localPair)) {
            break label517;
          }
          try
          {
            c.this.lyp.a(localf.lyE, l1, localf.eDs, l2, localf.lyG, localf.lyH);
            this.laR += 1;
          }
          catch (Exception localException)
          {
            w.printErrStackTrace("MicroMsg.FTS.FTS5SearchMessageLogic", localException, "Build message index failed with exception. \n%s", new Object[] { localf.lyG });
            this.mFailedCount += 1;
          }
          break label517;
          w.i("MicroMsg.FTS.FTS5SearchMessageLogic", "build msgRecList size %d FROM %d to %d", new Object[] { Integer.valueOf(j), Long.valueOf(((c.f)((List)localObject2).get(0)).eDr), Long.valueOf(((c.f)((List)localObject2).get(j - 1)).eDr) });
          break;
          label749:
          this.lyA = l2;
        }
        label763:
        c.this.lyp.commit();
        c.this.lyp.l(-200L, this.lyA);
        label790:
        ((List)localObject2).clear();
        if (Thread.interrupted()) {
          throw new InterruptedException();
        }
      }
      i = 50;
      localObject1 = this.lyy.iterator();
      if (((Iterator)localObject1).hasNext())
      {
        if (Thread.interrupted())
        {
          c.this.lyp.commit();
          throw new InterruptedException();
        }
        if (i < 50) {
          break label1149;
        }
        c.this.lyp.commit();
        c.this.lyp.beginTransaction();
        i = 0;
      }
      label1146:
      label1149:
      for (;;)
      {
        localObject2 = (Pair)((Iterator)localObject1).next();
        c.this.lyp.a(com.tencent.mm.plugin.fts.a.c.lvW, ((Long)((Pair)localObject2).first).longValue(), ((Long)((Pair)localObject2).second).longValue());
        i += 1;
        this.laS += 1;
        ((Iterator)localObject1).remove();
        break;
        c.this.lyp.commit();
        i = 50;
        localObject1 = this.lyz.listIterator(this.lyz.size());
        if (((ListIterator)localObject1).hasPrevious())
        {
          if (Thread.interrupted())
          {
            c.this.lyp.commit();
            throw new InterruptedException();
          }
          if (i < 50) {
            break label1146;
          }
          c.this.lyp.commit();
          c.this.lyp.beginTransaction();
          i = 0;
        }
        for (;;)
        {
          l1 = ((Long)((ListIterator)localObject1).previous()).longValue();
          c.this.lyp.h(Long.valueOf(l1));
          i += 1;
          this.laS += 1;
          ((ListIterator)localObject1).remove();
          break;
          c.this.lyp.l(-200L, this.lyA - 1L);
          c.this.lyp.commit();
          c.this.lyq = false;
          GMTrace.o(18530367963136L, 138062);
          return true;
        }
      }
    }
    
    public final int getId()
    {
      GMTrace.i(18530636398592L, 138064);
      GMTrace.o(18530636398592L, 138064);
      return 4;
    }
    
    public final String getName()
    {
      GMTrace.i(18530770616320L, 138065);
      GMTrace.o(18530770616320L, 138065);
      return "BuildMessageIndexTask";
    }
    
    public final String toString()
    {
      GMTrace.i(18530502180864L, 138063);
      String str = "BuildMessageIndex [new: " + this.laR + ", removed: " + this.laS + ", failed: " + this.mFailedCount + "]";
      GMTrace.o(18530502180864L, 138063);
      return str;
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int mCount;
    
    public b()
    {
      GMTrace.i(18533320753152L, 138084);
      this.mCount = 0;
      GMTrace.o(18533320753152L, 138084);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18533454970880L, 138085);
      this.mCount = c.this.lyp.e(com.tencent.mm.plugin.fts.a.c.lvW, -1).size();
      GMTrace.o(18533454970880L, 138085);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(18533589188608L, 138086);
      String str = "DeleteAllMessages [" + this.mCount + "]";
      GMTrace.o(18533589188608L, 138086);
      return str;
    }
  }
  
  private final class c
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private long fKQ;
    
    public c(long paramLong)
    {
      GMTrace.i(18520704286720L, 137990);
      this.fKQ = paramLong;
      GMTrace.o(18520704286720L, 137990);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18520838504448L, 137991);
      c.this.lyp.b(com.tencent.mm.plugin.fts.a.c.lvW, this.fKQ);
      GMTrace.o(18520838504448L, 137991);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(18520972722176L, 137992);
      String str = "DeleteMessage(" + this.fKQ + ")";
      GMTrace.o(18520972722176L, 137992);
      return str;
    }
  }
  
  private final class d
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private String iGc;
    
    public d(String paramString)
    {
      GMTrace.i(18523120205824L, 138008);
      this.iGc = paramString;
      GMTrace.o(18523120205824L, 138008);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18523254423552L, 138009);
      com.tencent.mm.plugin.fts.c.c localc = c.this.lyp;
      String str = this.iGc;
      localc.lzh.bindLong(1, -1L);
      localc.lzh.bindString(2, str);
      localc.lzh.bindLong(3, -1L);
      localc.lzh.execute();
      GMTrace.o(18523254423552L, 138009);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(18523388641280L, 138010);
      String str = "DeleteMessageByTalker(\"" + this.iGc + "\")";
      GMTrace.o(18523388641280L, 138010);
      return str;
    }
  }
  
  private final class e
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private List<au> lyC;
    private StringBuffer lyD;
    
    public e()
    {
      GMTrace.i(18533723406336L, 138087);
      this.lyC = new ArrayList();
      Collection localCollection;
      this.lyC.addAll(localCollection);
      this.lyD = new StringBuffer();
      GMTrace.o(18533723406336L, 138087);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18533857624064L, 138088);
      Object localObject1 = new ArrayList();
      Object localObject2 = this.lyC.iterator();
      Object localObject3;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (au)((Iterator)localObject2).next();
        c.f localf = new c.f(c.this);
        localf.eDr = ((ce)localObject3).field_msgId;
        localf.eDs = ((ce)localObject3).field_talker;
        localf.hcs = ((ce)localObject3).field_createTime;
        localf.content = ((ce)localObject3).field_content;
        localf.msgType = ((ce)localObject3).field_type;
        localf.lyF = ((ce)localObject3).field_isSend;
        if (c.a(localf))
        {
          localf.aCr();
          if (localf.isAvailable()) {
            ((List)localObject1).add(localf);
          }
        }
      }
      this.lyD.append("InsertMessage: ");
      localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (c.f)((Iterator)localObject2).next();
        this.lyD.append(((c.f)localObject3).eDr);
        this.lyD.append(",");
        this.lyD.append(((c.f)localObject3).hcs);
        this.lyD.append(" ");
      }
      this.lyD.append("count: ");
      this.lyD.append(((List)localObject1).size());
      if (((List)localObject1).size() > 0)
      {
        c.this.lyp.beginTransaction();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (c.f)((Iterator)localObject1).next();
          c.this.lyp.a(((c.f)localObject2).lyE, ((c.f)localObject2).eDr, ((c.f)localObject2).eDs, ((c.f)localObject2).hcs, ((c.f)localObject2).lyG, ((c.f)localObject2).lyH);
        }
        c.this.lyp.commit();
      }
      GMTrace.o(18533857624064L, 138088);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(18533991841792L, 138089);
      String str = this.lyD.toString();
      GMTrace.o(18533991841792L, 138089);
      return str;
    }
  }
  
  private final class f
  {
    String content;
    long eDr;
    String eDs;
    long hcs;
    int lyE;
    int lyF;
    String lyG;
    String lyH;
    int msgType;
    
    public f()
    {
      GMTrace.i(18517080408064L, 137963);
      GMTrace.o(18517080408064L, 137963);
    }
    
    public final boolean aCp()
    {
      GMTrace.i(18517214625792L, 137964);
      if ((this.msgType & 0xFFFF) == 49)
      {
        GMTrace.o(18517214625792L, 137964);
        return true;
      }
      GMTrace.o(18517214625792L, 137964);
      return false;
    }
    
    public final boolean aCq()
    {
      GMTrace.i(18517348843520L, 137965);
      if (this.msgType == 1)
      {
        GMTrace.o(18517348843520L, 137965);
        return true;
      }
      GMTrace.o(18517348843520L, 137965);
      return false;
    }
    
    public final void aCr()
    {
      GMTrace.i(18517483061248L, 137966);
      if (aCq())
      {
        this.lyE = 41;
        if (s.eb(this.eDs)) {
          this.lyG = bc.gQ(this.content);
        }
      }
      for (;;)
      {
        if (!bg.nm(this.lyG)) {
          this.lyG = d.yR(this.lyG);
        }
        if (this.lyF != 1) {
          break;
        }
        this.lyH = q.zE();
        GMTrace.o(18517483061248L, 137966);
        return;
        this.lyG = this.content;
        continue;
        if (aCp())
        {
          f.a locala = f.a.eS(this.content);
          if (locala != null) {
            switch (locala.type)
            {
            default: 
              break;
            case 3: 
            case 4: 
            case 5: 
            case 8: 
            case 10: 
            case 13: 
            case 15: 
            case 16: 
            case 20: 
            case 25: 
              this.lyG = bg.aq(locala.getTitle(), "");
              this.lyE = 43;
              break;
            case 6: 
              this.lyG = bg.aq(locala.getTitle(), "");
              this.lyE = 42;
              break;
            case 19: 
              this.lyG = bg.aq(locala.getDescription(), "");
              if (this.lyG != null) {
                this.lyG = this.lyG.replace(":", "​");
              }
              this.lyE = 44;
              break;
            case 2000: 
              this.lyG = (bg.aq(locala.title, "") + "​" + bg.aq(locala.description, ""));
              this.lyE = 45;
              break;
            case 2001: 
              if ("1001".equals(locala.gka))
              {
                this.lyE = 47;
                if (this.lyF == 1) {
                  this.lyG = (bg.aq(locala.gjY, "") + "​" + bg.aq(locala.gjV, ""));
                } else {
                  this.lyG = (bg.aq(locala.gjY, "") + "​" + bg.aq(locala.gjU, ""));
                }
              }
              else if ("1002".equals(locala.gka))
              {
                this.lyE = 46;
                if (this.lyF == 1) {
                  this.lyG = (bg.aq(locala.gjY, "") + "​" + bg.aq(locala.gjV, ""));
                } else {
                  this.lyG = (bg.aq(locala.gjY, "") + "​" + bg.aq(locala.gjU, ""));
                }
              }
              break;
            }
          }
        }
      }
      if (s.eb(this.eDs))
      {
        this.lyH = bg.aq(bc.gP(this.content), this.eDs);
        GMTrace.o(18517483061248L, 137966);
        return;
      }
      this.lyH = this.eDs;
      GMTrace.o(18517483061248L, 137966);
    }
    
    public final boolean isAvailable()
    {
      GMTrace.i(18517617278976L, 137967);
      if (!bg.nm(this.lyG))
      {
        GMTrace.o(18517617278976L, 137967);
        return true;
      }
      GMTrace.o(18517617278976L, 137967);
      return false;
    }
  }
  
  private final class g
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public g(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18521643810816L, 137997);
      GMTrace.o(18521643810816L, 137997);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18521778028544L, 137998);
      yS("start");
      Object localObject1 = c.this.lyp;
      Object localObject2 = d.t(paramArrayOfString);
      localObject2 = String.format("SELECT type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0 ORDER BY timestamp desc;", new Object[] { ((com.tencent.mm.plugin.fts.c.c)localObject1).aCf(), ((com.tencent.mm.plugin.fts.c.c)localObject1).aCg(), ((com.tencent.mm.plugin.fts.c.c)localObject1).aCf(), ((com.tencent.mm.plugin.fts.c.c)localObject1).aCg(), ((com.tencent.mm.plugin.fts.c.c)localObject1).aCg(), localObject2 });
      Object localObject3 = ((com.tencent.mm.plugin.fts.a.a)localObject1).lvN.rawQuery((String)localObject2, null);
      localObject1 = new ArrayList();
      Object localObject4 = new HashSet();
      localObject2 = new ArrayList();
      do
      {
        if (!((Cursor)localObject3).moveToNext()) {
          break;
        }
        String str = ((Cursor)localObject3).getString(3);
        if (((HashSet)localObject4).add(str))
        {
          a locala = new a();
          locala.type = ((Cursor)localObject3).getInt(0);
          locala.gRk = ((Cursor)localObject3).getInt(1);
          locala.lxe = ((Cursor)localObject3).getLong(2);
          locala.lwH = ((Cursor)localObject3).getString(3);
          locala.timestamp = ((Cursor)localObject3).getLong(4);
          ((List)localObject1).add(locala);
          ((List)localObject2).add(str);
        }
      } while (((List)localObject1).size() <= paramf.lwV);
      ((Cursor)localObject3).close();
      paramf = new LinkedList();
      yS("findUsername");
      if (((List)localObject2).size() > 0)
      {
        paramArrayOfString = c.this.lyp.b(paramArrayOfString, (List)localObject2);
        localObject2 = new HashMap();
        if (paramArrayOfString.moveToNext())
        {
          localObject3 = paramArrayOfString.getString(0).split(" ");
          int i = 0;
          while (i < localObject3.length)
          {
            ((HashMap)localObject2).put(localObject3[i], Integer.valueOf(localObject3[(i + 1)]));
            i += 2;
          }
        }
        paramArrayOfString.close();
        localObject1 = ((List)localObject1).iterator();
        if (((Iterator)localObject1).hasNext())
        {
          localObject3 = (a)((Iterator)localObject1).next();
          localObject4 = new i();
          ((i)localObject4).type = ((a)localObject3).type;
          ((i)localObject4).gRk = ((a)localObject3).gRk;
          ((i)localObject4).lxe = ((a)localObject3).lxe;
          ((i)localObject4).lwH = ((a)localObject3).lwH;
          ((i)localObject4).timestamp = ((a)localObject3).timestamp;
          if (((HashMap)localObject2).containsKey(((i)localObject4).lwH)) {}
          for (((i)localObject4).userData = ((HashMap)localObject2).get(((i)localObject4).lwH);; ((i)localObject4).userData = Integer.valueOf(1))
          {
            paramArrayOfString.close();
            paramf.add(localObject4);
            break;
          }
        }
        yS("findCount");
      }
      GMTrace.o(18521778028544L, 137998);
      return paramf;
    }
    
    public final int getId()
    {
      GMTrace.i(18522180681728L, 138001);
      GMTrace.o(18522180681728L, 138001);
      return 24;
    }
    
    public final String getName()
    {
      GMTrace.i(18522046464000L, 138000);
      GMTrace.o(18522046464000L, 138000);
      return "SearchLimitGroupMessage";
    }
    
    protected final String[] yT(String paramString)
    {
      GMTrace.i(18521912246272L, 137999);
      paramString = bg.cb(c.yW(paramString));
      GMTrace.o(18521912246272L, 137999);
      return paramString;
    }
    
    private final class a
    {
      int gRk;
      String lwH;
      long lxe;
      long timestamp;
      int type;
      
      public a()
      {
        GMTrace.i(18517751496704L, 137968);
        GMTrace.o(18517751496704L, 137968);
      }
    }
  }
  
  private final class h
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    h(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18515201359872L, 137949);
      GMTrace.o(18515201359872L, 137949);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18515335577600L, 137950);
      Object localObject = c.this.lyp;
      paramf = paramf.eDs;
      paramArrayOfString = d.t(paramArrayOfString);
      paramArrayOfString = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, content, talker FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index = ? AND status >= 0 ORDER BY timestamp desc;", new Object[] { ((com.tencent.mm.plugin.fts.c.c)localObject).aCf(), ((com.tencent.mm.plugin.fts.c.c)localObject).aCf(), ((com.tencent.mm.plugin.fts.c.c)localObject).aCg(), ((com.tencent.mm.plugin.fts.c.c)localObject).aCf(), ((com.tencent.mm.plugin.fts.c.c)localObject).aCg(), ((com.tencent.mm.plugin.fts.c.c)localObject).aCg(), paramArrayOfString });
      paramArrayOfString = ((com.tencent.mm.plugin.fts.a.a)localObject).lvN.rawQuery(paramArrayOfString, new String[] { paramf });
      paramf = new ArrayList();
      while (paramArrayOfString.moveToNext())
      {
        localObject = new j();
        ((j)localObject).lxc = paramArrayOfString.getLong(0);
        ((j)localObject).type = paramArrayOfString.getInt(1);
        ((j)localObject).gRk = paramArrayOfString.getInt(2);
        ((j)localObject).lxe = paramArrayOfString.getLong(3);
        ((j)localObject).lwH = paramArrayOfString.getString(4);
        ((j)localObject).timestamp = paramArrayOfString.getLong(5);
        ((j)localObject).content = paramArrayOfString.getString(6);
        ((j)localObject).eDs = paramArrayOfString.getString(7);
        paramf.add(localObject);
      }
      paramArrayOfString.close();
      GMTrace.o(18515335577600L, 137950);
      return paramf;
    }
    
    public final int getId()
    {
      GMTrace.i(18515738230784L, 137953);
      GMTrace.o(18515738230784L, 137953);
      return 14;
    }
    
    public final String getName()
    {
      GMTrace.i(18515604013056L, 137952);
      GMTrace.o(18515604013056L, 137952);
      return "SearchTalkerMessageTask";
    }
    
    protected final String[] yT(String paramString)
    {
      GMTrace.i(18515469795328L, 137951);
      paramString = bg.cb(c.yW(paramString));
      GMTrace.o(18515469795328L, 137951);
      return paramString;
    }
  }
  
  private final class i
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    private int lyJ;
    
    public i(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18529025785856L, 138052);
      this.lyJ = 0;
      GMTrace.o(18529025785856L, 138052);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18529160003584L, 138053);
      Object localObject = c.this.lyp;
      int i = paramf.lwV;
      paramf = d.t(paramArrayOfString);
      if (i != Integer.MAX_VALUE) {}
      for (paramArrayOfString = " LIMIT " + (i + 1);; paramArrayOfString = "")
      {
        paramArrayOfString = String.format("SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, content, count(aux_index) as msgCount FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0 GROUP BY aux_index ORDER BY timestamp desc" + paramArrayOfString + ";", new Object[] { ((com.tencent.mm.plugin.fts.c.c)localObject).aCf(), ((com.tencent.mm.plugin.fts.c.c)localObject).aCg(), ((com.tencent.mm.plugin.fts.c.c)localObject).aCf(), ((com.tencent.mm.plugin.fts.c.c)localObject).aCg(), ((com.tencent.mm.plugin.fts.c.c)localObject).aCg(), paramf });
        paramArrayOfString = ((com.tencent.mm.plugin.fts.a.a)localObject).lvN.rawQuery(paramArrayOfString, null);
        paramf = new LinkedList();
        while (paramArrayOfString.moveToNext())
        {
          localObject = new i();
          ((i)localObject).type = paramArrayOfString.getInt(0);
          ((i)localObject).gRk = paramArrayOfString.getInt(1);
          ((i)localObject).lxe = paramArrayOfString.getLong(2);
          ((i)localObject).lwH = paramArrayOfString.getString(3);
          ((i)localObject).timestamp = paramArrayOfString.getLong(4);
          ((i)localObject).content = paramArrayOfString.getString(5);
          ((i)localObject).userData = Integer.valueOf(paramArrayOfString.getInt(6));
          paramf.add(localObject);
          i = this.lyJ;
          this.lyJ = (((Integer)((i)localObject).userData).intValue() + i);
        }
      }
      paramArrayOfString.close();
      GMTrace.o(18529160003584L, 138053);
      return paramf;
    }
    
    public final int getId()
    {
      GMTrace.i(18529696874496L, 138057);
      GMTrace.o(18529696874496L, 138057);
      return 15;
    }
    
    public final String getName()
    {
      GMTrace.i(18529428439040L, 138055);
      GMTrace.o(18529428439040L, 138055);
      return "SearchTopGroupMessageTask";
    }
    
    public final String toString()
    {
      GMTrace.i(18529562656768L, 138056);
      String str = String.format("%s[%s] ConvCount: %d MessageCount: %d", new Object[] { "SearchTopGroupMessageTask", this.lwP.eQb, Integer.valueOf(this.lwQ), Integer.valueOf(this.lyJ) });
      GMTrace.o(18529562656768L, 138056);
      return str;
    }
    
    protected final String[] yT(String paramString)
    {
      GMTrace.i(18529294221312L, 138054);
      paramString = bg.cb(c.yW(paramString));
      GMTrace.o(18529294221312L, 138054);
      return paramString;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */