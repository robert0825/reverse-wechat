package com.tencent.mm.q;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
  extends com.tencent.mm.plugin.fts.a.b
{
  public k fTu;
  public a fTv;
  private m.b fTw;
  
  public b()
  {
    GMTrace.i(17938199347200L, 133650);
    this.fTw = new m.b()
    {
      public final void a(int paramAnonymousInt, m paramAnonymousm, Object paramAnonymousObject)
      {
        GMTrace.i(17939407306752L, 133659);
        if (!b.vu())
        {
          GMTrace.o(17939407306752L, 133659);
          return;
        }
        if ((paramAnonymousObject != null) && ((paramAnonymousObject instanceof String)))
        {
          paramAnonymousm = (String)paramAnonymousObject;
          switch (paramAnonymousInt)
          {
          }
        }
        for (;;)
        {
          GMTrace.o(17939407306752L, 133659);
          return;
          paramAnonymousm = null;
          break;
          if (paramAnonymousm != null)
          {
            b.this.fTu.a(65636, new b.f(b.this, paramAnonymousm));
            GMTrace.o(17939407306752L, 133659);
            return;
            if (paramAnonymousm == null)
            {
              b.this.fTu.a(65636, new b.c(b.this));
              GMTrace.o(17939407306752L, 133659);
              return;
            }
            b.this.fTu.a(65636, new b.d(b.this, paramAnonymousm));
          }
        }
      }
    };
    GMTrace.o(17938199347200L, 133650);
  }
  
  public static boolean a(a parama)
  {
    GMTrace.i(17938870435840L, 133655);
    if (parama.type != 0)
    {
      GMTrace.o(17938870435840L, 133655);
      return false;
    }
    if (parama.status != 2)
    {
      GMTrace.o(17938870435840L, 133655);
      return true;
    }
    GMTrace.o(17938870435840L, 133655);
    return false;
  }
  
  public static boolean vu()
  {
    GMTrace.i(17939138871296L, 133657);
    at.AR();
    String str = (String)com.tencent.mm.y.c.xh().get(6, null);
    if ((str != null) && (str.length() > 0))
    {
      GMTrace.o(17939138871296L, 133657);
      return true;
    }
    GMTrace.o(17939138871296L, 133657);
    return false;
  }
  
  public final com.tencent.mm.plugin.fts.a.a.a a(f paramf)
  {
    GMTrace.i(17938736218112L, 133654);
    paramf = new g(paramf);
    paramf = this.fTu.a(-65536, paramf);
    GMTrace.o(17938736218112L, 133654);
    return paramf;
  }
  
  public final int b(a parama)
  {
    GMTrace.i(17939004653568L, 133656);
    long l = System.currentTimeMillis();
    String str3 = bg.nl(parama.userName);
    int k;
    if (parama.status != 0)
    {
      k = 131073;
      if ((parama.eMW == null) || (parama.eMW.length() <= 0)) {
        break label415;
      }
      this.fTv.a(k, 16, parama.id, parama.userName, l, parama.eMW);
    }
    label406:
    label412:
    label415:
    for (int j = 1;; j = 0)
    {
      String str4 = parama.fTy;
      String str1 = parama.fTz;
      String str2 = parama.fTA;
      int i = j;
      if (str4 != null)
      {
        i = j;
        if (str4.length() > 0)
        {
          if (!str4.equalsIgnoreCase(str1)) {
            break label412;
          }
          str1 = null;
        }
      }
      for (;;)
      {
        if ((str1 == null) || (str1.equalsIgnoreCase(str2))) {
          str2 = null;
        }
        for (;;)
        {
          this.fTv.a(k, 12, parama.id, str3, l, str4);
          i = j + 1;
          j = i;
          if (str1 != null)
          {
            this.fTv.a(k, 13, parama.id, str3, l, str1);
            j = i + 1;
          }
          i = j;
          if (str2 != null)
          {
            this.fTv.a(k, 14, parama.id, str3, l, str2);
            i = j + 1;
          }
          str4 = parama.aDn;
          str1 = parama.fTB;
          str2 = parama.fTC;
          j = i;
          if (str4 != null)
          {
            j = i;
            if (str4.length() > 0)
            {
              if (!str4.equalsIgnoreCase(str1)) {
                break label406;
              }
              str1 = null;
            }
          }
          for (;;)
          {
            if ((str1 == null) || (str1.equalsIgnoreCase(str2))) {
              str2 = null;
            }
            for (;;)
            {
              this.fTv.a(k, 5, parama.id, str3, l, str4);
              j = i + 1;
              i = j;
              if (str1 != null)
              {
                this.fTv.a(k, 6, parama.id, str3, l, str1);
                i = j + 1;
              }
              j = i;
              if (str2 != null)
              {
                this.fTv.a(k, 7, parama.id, str3, l, str2);
                j = i + 1;
              }
              GMTrace.o(17939004653568L, 133656);
              return j;
              k = 131074;
              break;
            }
          }
        }
      }
    }
  }
  
  public final String getName()
  {
    GMTrace.i(17938333564928L, 133651);
    GMTrace.o(17938333564928L, 133651);
    return "FTS5SearchFriendLogic";
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(17938467782656L, 133652);
    if (!((l)com.tencent.mm.kernel.h.j(l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTS5SearchFriendLogic", "Create Fail!");
      GMTrace.o(17938467782656L, 133652);
      return false;
    }
    w.i("MicroMsg.FTS.FTS5SearchFriendLogic", "Create Success!");
    this.fTv = ((a)((l)com.tencent.mm.kernel.h.j(l.class)).getFTSIndexStorage(1280));
    this.fTu = ((l)com.tencent.mm.kernel.h.j(l.class)).getFTSTaskDaemon();
    this.fTu.a(131172, new b());
    af.If().a(this.fTw);
    GMTrace.o(17938467782656L, 133652);
    return true;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(17938602000384L, 133653);
    af.If().b(this.fTw);
    GMTrace.o(17938602000384L, 133653);
    return true;
  }
  
  private static final class a
  {
    String aDn;
    String eMW;
    String fTA;
    String fTB;
    String fTC;
    String fTy;
    String fTz;
    long id;
    int status;
    int type;
    String userName;
    
    a()
    {
      GMTrace.i(17939675742208L, 133661);
      GMTrace.o(17939675742208L, 133661);
    }
    
    a(com.tencent.mm.modelfriend.b paramb)
    {
      GMTrace.i(17939809959936L, 133662);
      this.id = com.tencent.mm.modelfriend.b.jH(paramb.GS());
      this.fTy = paramb.GU();
      this.fTz = paramb.GW();
      this.fTA = paramb.GV();
      this.aDn = paramb.GX();
      this.fTB = paramb.GZ();
      this.fTC = paramb.GY();
      this.userName = paramb.getUsername();
      this.eMW = paramb.Ha();
      this.type = paramb.type;
      this.status = paramb.status;
      GMTrace.o(17939809959936L, 133662);
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public boolean fTD;
    private HashSet<Long> fTE;
    private long fTF;
    private int fTG;
    private HashMap<int[], b.e> fTH;
    
    public b()
    {
      GMTrace.i(17937125605376L, 133642);
      this.fTD = false;
      this.fTE = null;
      this.fTF = Long.MIN_VALUE;
      this.fTG = -1;
      this.fTH = new HashMap();
      GMTrace.o(17937125605376L, 133642);
    }
    
    public final boolean execute()
    {
      GMTrace.i(17937259823104L, 133643);
      w.i("MicroMsg.FTS.FTS5SearchFriendLogic", "Start building friend index.");
      this.fTD = b.vu();
      if (this.fTG < 0) {
        this.fTG = 0;
      }
      w.d("MicroMsg.FTS.FTS5SearchFriendLogic", "[BuildFriendIndexTask mBuildMobileIndex : %s, mCurrentTask : %d]", new Object[] { Boolean.valueOf(this.fTD), Integer.valueOf(this.fTG) });
      Object localObject1;
      long l;
      int i;
      Object localObject2;
      if (this.fTG == 0) {
        if (this.fTD)
        {
          if (!this.fTH.containsKey(com.tencent.mm.plugin.fts.a.c.lwf)) {
            this.fTH.put(com.tencent.mm.plugin.fts.a.c.lwf, new b.e());
          }
          if (this.fTE == null)
          {
            this.fTE = new HashSet();
            localObject1 = b.this.fTv.a(com.tencent.mm.plugin.fts.a.c.lwf, false, true, false, false, false);
            while (((Cursor)localObject1).moveToNext())
            {
              l = ((Cursor)localObject1).getLong(0);
              this.fTE.add(Long.valueOf(l));
            }
            ((Cursor)localObject1).close();
          }
          if (Thread.interrupted()) {
            throw new InterruptedException();
          }
          localObject1 = ((l)com.tencent.mm.kernel.h.j(l.class)).getFTSMainDB().g("SELECT id, realname, realnamequanpin, realnamepyinitial, nickname, nicknamequanpin, nicknamepyinitial, username, status, moblie FROM addr_upload2 WHERE id > ? AND type=0 ORDER BY id;", new String[] { Long.toString(this.fTF) });
          i = 50;
          while (((Cursor)localObject1).moveToNext())
          {
            if (Thread.interrupted())
            {
              ((Cursor)localObject1).close();
              b.this.fTv.commit();
              throw new InterruptedException();
            }
            l = ((Cursor)localObject1).getLong(0);
            this.fTF = l;
            localObject2 = new b.a();
            ((b.a)localObject2).id = l;
            ((b.a)localObject2).fTy = ((Cursor)localObject1).getString(1);
            ((b.a)localObject2).fTz = ((Cursor)localObject1).getString(2);
            ((b.a)localObject2).fTA = ((Cursor)localObject1).getString(3);
            ((b.a)localObject2).aDn = ((Cursor)localObject1).getString(4);
            ((b.a)localObject2).fTB = ((Cursor)localObject1).getString(5);
            ((b.a)localObject2).fTC = ((Cursor)localObject1).getString(6);
            ((b.a)localObject2).userName = ((Cursor)localObject1).getString(7);
            ((b.a)localObject2).status = ((Cursor)localObject1).getInt(8);
            ((b.a)localObject2).eMW = ((Cursor)localObject1).getString(9);
            ((b.a)localObject2).type = 0;
            if (((b.a)localObject2).status == 65536) {
              ((b.a)localObject2).status = 0;
            }
            if ((b.a((b.a)localObject2)) && (!this.fTE.remove(Long.valueOf(((b.a)localObject2).id))))
            {
              if (i < 50) {
                break label780;
              }
              b.this.fTv.commit();
              b.this.fTv.beginTransaction();
            }
          }
        }
      }
      label777:
      label780:
      for (int j = 0;; j = i)
      {
        i = j;
        b.e locale;
        try
        {
          j += b.this.b((b.a)localObject2);
          i = j;
          localObject2 = (b.e)this.fTH.get(com.tencent.mm.plugin.fts.a.c.lwf);
          i = j;
          ((b.e)localObject2).fTK += 1;
          i = j;
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.FTS.FTS5SearchFriendLogic", localException, "Build mobile friend index failed with exception.", new Object[0]);
          locale = (b.e)this.fTH.get(com.tencent.mm.plugin.fts.a.c.lwf);
          locale.mFailedCount += 1;
        }
        break;
        ((Cursor)localObject1).close();
        b.this.fTv.commit();
        localObject1 = this.fTE.iterator();
        i = 50;
        if (((Iterator)localObject1).hasNext())
        {
          if (i < 50) {
            break label777;
          }
          b.this.fTv.commit();
          b.this.fTv.beginTransaction();
          i = 0;
        }
        for (;;)
        {
          l = ((Long)((Iterator)localObject1).next()).longValue();
          b.this.fTv.b(com.tencent.mm.plugin.fts.a.c.lwf, l);
          locale = (b.e)this.fTH.get(com.tencent.mm.plugin.fts.a.c.lwf);
          locale.fTL += 1;
          ((Iterator)localObject1).remove();
          i += 1;
          break;
          b.this.fTv.commit();
          this.fTE = null;
          this.fTF = Long.MIN_VALUE;
          this.fTG = -1;
          GMTrace.o(17937259823104L, 133643);
          return true;
        }
      }
    }
    
    public final int getId()
    {
      GMTrace.i(17937528258560L, 133645);
      GMTrace.o(17937528258560L, 133645);
      return 2;
    }
    
    public final String getName()
    {
      GMTrace.i(17937662476288L, 133646);
      GMTrace.o(17937662476288L, 133646);
      return "BuildFriendIndexTask";
    }
    
    public final String toString()
    {
      GMTrace.i(17937394040832L, 133644);
      if (this.fTH.containsKey(com.tencent.mm.plugin.fts.a.c.lwf))
      {
        String str = "BuildFriendIndex IDXTYPE_SET_CONTACT_FRIEND [new: " + ((b.e)this.fTH.get(com.tencent.mm.plugin.fts.a.c.lwf)).fTK + ", removed: " + ((b.e)this.fTH.get(com.tencent.mm.plugin.fts.a.c.lwf)).fTL + ", failed: " + ((b.e)this.fTH.get(com.tencent.mm.plugin.fts.a.c.lwf)).mFailedCount + "]";
        GMTrace.o(17937394040832L, 133644);
        return str;
      }
      GMTrace.o(17937394040832L, 133644);
      return "";
    }
  }
  
  private final class c
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int fTI;
    private int mCount;
    
    public c()
    {
      GMTrace.i(17936722952192L, 133639);
      this.mCount = 0;
      this.fTI = 0;
      GMTrace.o(17936722952192L, 133639);
    }
    
    public final boolean execute()
    {
      GMTrace.i(17936857169920L, 133640);
      w.d("MicroMsg.FTS.FTS5SearchFriendLogic", "[DeleteAllFriendsTask mFriendType: %s]", new Object[] { Integer.valueOf(this.fTI) });
      if (this.fTI == 0) {
        this.mCount = b.this.fTv.e(com.tencent.mm.plugin.fts.a.c.lwf, -1).size();
      }
      GMTrace.o(17936857169920L, 133640);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(17936991387648L, 133641);
      String str = "DeleteAllFriends [" + this.mCount + ", " + this.fTI + "]";
      GMTrace.o(17936991387648L, 133641);
      return str;
    }
  }
  
  private final class d
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int fTI;
    private String fTJ;
    
    public d(String paramString)
    {
      GMTrace.i(17937796694016L, 133647);
      this.fTJ = paramString;
      this.fTI = 0;
      GMTrace.o(17937796694016L, 133647);
    }
    
    public final boolean execute()
    {
      GMTrace.i(17937930911744L, 133648);
      w.d("MicroMsg.FTS.FTS5SearchFriendLogic", "[DeleteFriendTask mEntityId: %s, mFriendType: %s]", new Object[] { this.fTJ, Integer.valueOf(this.fTI) });
      if (this.fTI == 0)
      {
        long l = com.tencent.mm.modelfriend.b.jH(this.fTJ);
        b.this.fTv.b(com.tencent.mm.plugin.fts.a.c.lwf, l);
      }
      GMTrace.o(17937930911744L, 133648);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(17938065129472L, 133649);
      String str = "DeleteFriend(\"" + this.fTJ + "\", " + this.fTI + ")";
      GMTrace.o(17938065129472L, 133649);
      return str;
    }
  }
  
  private static final class e
  {
    public int fTK;
    public int fTL;
    public int mFailedCount;
    
    public e()
    {
      GMTrace.i(17939541524480L, 133660);
      this.fTK = 0;
      this.fTL = 0;
      this.mFailedCount = 0;
      GMTrace.o(17939541524480L, 133660);
    }
  }
  
  private final class f
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int fTI;
    private String fTJ;
    private boolean fTM;
    
    public f(String paramString)
    {
      GMTrace.i(17934978121728L, 133626);
      this.fTM = false;
      this.fTJ = paramString;
      this.fTI = 0;
      GMTrace.o(17934978121728L, 133626);
    }
    
    public final boolean execute()
    {
      GMTrace.i(17935112339456L, 133627);
      w.d("MicroMsg.FTS.FTS5SearchFriendLogic", "[InsertFriendTask mEntityId: %s, mFriendType: %s]", new Object[] { this.fTJ, Integer.valueOf(this.fTI) });
      if (this.fTI == 0)
      {
        Object localObject = af.If().jK(this.fTJ);
        if (localObject == null)
        {
          this.fTM = true;
          GMTrace.o(17935112339456L, 133627);
          return true;
        }
        localObject = new b.a((com.tencent.mm.modelfriend.b)localObject);
        if (!b.a((b.a)localObject)) {
          break label108;
        }
        b.this.b((b.a)localObject);
      }
      for (;;)
      {
        GMTrace.o(17935112339456L, 133627);
        return true;
        label108:
        this.fTM = true;
      }
    }
    
    public final String toString()
    {
      GMTrace.i(17935246557184L, 133628);
      StringBuilder localStringBuilder = new StringBuilder("InsertFriend(\"").append(this.fTJ).append("\", ").append(this.fTI).append(")");
      if (this.fTM) {}
      for (String str = " [skipped]";; str = "")
      {
        str = str;
        GMTrace.o(17935246557184L, 133628);
        return str;
      }
    }
  }
  
  private final class g
    extends e
  {
    private int[] fTN;
    private int[] fTO;
    
    public g(f paramf)
    {
      super();
      GMTrace.i(17936320299008L, 133636);
      this.fTN = paramf.lwT;
      this.fTO = paramf.lwU;
      GMTrace.o(17936320299008L, 133636);
    }
    
    protected final List<i> a(String[] paramArrayOfString, f paramf)
    {
      GMTrace.i(17936454516736L, 133637);
      Object localObject = b.this.fTv.a(paramArrayOfString, this.fTN, this.fTO);
      paramArrayOfString = new HashMap();
      while (((Cursor)localObject).moveToNext())
      {
        j localj = new j().e((Cursor)localObject);
        if (!paramf.lwW.contains(localj.lwH))
        {
          i locali = (i)paramArrayOfString.get(Long.valueOf(localj.lxe));
          if ((locali == null) || (d.b(com.tencent.mm.plugin.fts.a.c.lwn, localj.gRk, locali.gRk) < 0))
          {
            localj.aCl();
            paramArrayOfString.put(Long.valueOf(localj.lxe), localj);
          }
        }
      }
      ((Cursor)localObject).close();
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      localObject = new ArrayList();
      ((ArrayList)localObject).addAll(paramArrayOfString.values());
      if (paramf.lwX != null) {
        Collections.sort((List)localObject, paramf.lwX);
      }
      GMTrace.o(17936454516736L, 133637);
      return (List<i>)localObject;
    }
    
    public final String getName()
    {
      GMTrace.i(17936588734464L, 133638);
      GMTrace.o(17936588734464L, 133638);
      return "FTS5SearchFriendLogic.NormalSearchTask";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\q\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */