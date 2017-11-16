package com.tencent.mm.plugin.backup.g;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.bu.g;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.aa;
import com.tencent.mm.g.a.bm;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.af.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.HashMap;
import junit.framework.Assert;

public final class a
  extends com.tencent.mm.plugin.backup.a.a
{
  public static String TAG;
  private static a jca;
  public static int jcd;
  private c jcb;
  private b jcc;
  
  static
  {
    GMTrace.i(14860586844160L, 110720);
    TAG = "MicroMsg.BackupTempDbModel";
    jcd = 0;
    GMTrace.o(14860586844160L, 110720);
  }
  
  public a()
  {
    GMTrace.i(14857902489600L, 110700);
    GMTrace.o(14857902489600L, 110700);
  }
  
  private static void AQ()
  {
    GMTrace.i(14859513102336L, 110712);
    aa localaa = new aa();
    com.tencent.mm.sdk.b.a.vgX.m(localaa);
    GMTrace.o(14859513102336L, 110712);
  }
  
  public static a afG()
  {
    GMTrace.i(14858036707328L, 110701);
    if (jca == null)
    {
      locala = new a();
      jca = locala;
      a(locala);
    }
    a locala = jca;
    GMTrace.o(14858036707328L, 110701);
    return locala;
  }
  
  public static void afK()
  {
    GMTrace.i(16050427002880L, 119585);
    long l = bg.Pv();
    at.AR();
    com.tencent.mm.y.c.yE();
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.xe() + ".tem";
    at.AR();
    j.r((String)localObject, com.tencent.mm.y.c.xe(), false);
    localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.xf() + ".tem";
    at.AR();
    j.r((String)localObject, com.tencent.mm.y.c.xf(), false);
    localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.xf() + ".tem-journal";
    StringBuilder localStringBuilder = new StringBuilder();
    at.AR();
    j.r((String)localObject, com.tencent.mm.y.c.xf() + "-journal", false);
    localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.xf() + ".tem-wal";
    localStringBuilder = new StringBuilder();
    at.AR();
    j.r((String)localObject, com.tencent.mm.y.c.xf() + "-wal", false);
    com.tencent.mm.sdk.b.a.vgX.m(new bm());
    com.tencent.mm.kernel.h.xw().release();
    com.tencent.mm.kernel.h.xw().initialize();
    afL();
    AQ();
    w.i(TAG, "recoverFromTempDBImp finish :%d", new Object[] { Long.valueOf(bg.aH(l)) });
    GMTrace.o(16050427002880L, 119585);
  }
  
  public static void afL()
  {
    GMTrace.i(14859378884608L, 110711);
    StringBuilder localStringBuilder = new StringBuilder();
    at.AR();
    com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.y.c.xe() + ".tem");
    localStringBuilder = new StringBuilder();
    at.AR();
    com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.y.c.xe() + ".ini.tem");
    localStringBuilder = new StringBuilder();
    at.AR();
    com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.y.c.xf() + ".tem");
    localStringBuilder = new StringBuilder();
    at.AR();
    com.tencent.mm.loader.stub.b.deleteFile(com.tencent.mm.y.c.xf() + ".ini.tem");
    GMTrace.o(14859378884608L, 110711);
  }
  
  public static boolean afM()
  {
    GMTrace.i(16050561220608L, 119586);
    com.tencent.mm.kernel.h.xw().wG();
    GMTrace.o(16050561220608L, 119586);
    return true;
  }
  
  public final void a(a parama, boolean paramBoolean, final int paramInt)
  {
    GMTrace.i(14858707795968L, 110706);
    final long l = bg.Pv();
    w.i(TAG, "initTempDB needSyncPauser:%b %s", new Object[] { Boolean.valueOf(paramBoolean), bg.bQW() });
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14857768271872L, 110699);
        a.afM();
        w.i(a.TAG, "initTempDB, initTempDBCount:%d  timediff:%d ", new Object[] { Integer.valueOf(a.jcd), Long.valueOf(bg.aH(l)) });
        a.jcd += 1;
        at.xB().a(new af.a()
        {
          public final boolean Dj()
          {
            GMTrace.i(14857097183232L, 110694);
            a.afL();
            PLong localPLong1 = new PLong();
            PLong localPLong2 = new PLong();
            PLong localPLong3 = new PLong();
            a.this.a(localPLong1, localPLong2, localPLong3, a.1.this.jce, a.1.this.jcf);
            GMTrace.o(14857097183232L, 110694);
            return true;
          }
          
          public final boolean Dk()
          {
            GMTrace.i(14856962965504L, 110693);
            w.i(a.TAG, "initTempDB onPostExecute");
            a.1.this.jce.run();
            a.jcd -= 1;
            GMTrace.o(14856962965504L, 110693);
            return false;
          }
          
          public final String toString()
          {
            GMTrace.i(14857231400960L, 110695);
            String str = super.toString() + "|initTempDB";
            GMTrace.o(14857231400960L, 110695);
            return str;
          }
        });
        GMTrace.o(14857768271872L, 110699);
      }
    }, 1000L);
    GMTrace.o(14858707795968L, 110706);
  }
  
  public final void a(final Runnable paramRunnable, final int paramInt)
  {
    GMTrace.i(14859244666880L, 110710);
    if ((paramInt < 0) || (jcd == 0))
    {
      if (paramInt < 0) {
        w.e(TAG, "closeTempDB no left tryCount!!");
      }
      w.i(TAG, "closeDB before");
      afH().yE();
      w.i(TAG, "closeDB after");
      if (paramRunnable != null)
      {
        paramRunnable.run();
        GMTrace.o(14859244666880L, 110710);
      }
    }
    else
    {
      new ae(Looper.getMainLooper()).postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14856426094592L, 110689);
          a.this.a(paramRunnable, paramInt - 1);
          GMTrace.o(14856426094592L, 110689);
        }
      }, 500L);
    }
    GMTrace.o(14859244666880L, 110710);
  }
  
  public final boolean a(PLong paramPLong1, PLong paramPLong2, PLong paramPLong3, a parama, int paramInt)
  {
    GMTrace.i(14858842013696L, 110707);
    at.AR();
    com.tencent.mm.y.c.yE();
    w.d(TAG, "initTempDBimp after close db");
    at.AR();
    int i = e.aY(com.tencent.mm.y.c.xe());
    at.AR();
    paramPLong3.value = (i + e.aY(com.tencent.mm.y.c.xf()));
    long l = paramPLong3.value;
    at.AR();
    if (!com.tencent.mm.plugin.backup.a.h.a(l, paramPLong1, paramPLong2, com.tencent.mm.y.c.zo()))
    {
      w.e(TAG, "data free error, len %d", new Object[] { Long.valueOf(paramPLong3.value) });
      parama.jco = false;
      parama.jcp = paramPLong1.value;
      parama.jcq = paramPLong2.value;
      parama.dbSize = paramPLong3.value;
      GMTrace.o(14858842013696L, 110707);
      return false;
    }
    at.AR();
    Object localObject1 = com.tencent.mm.y.c.xe();
    Object localObject2 = new StringBuilder();
    at.AR();
    j.r((String)localObject1, com.tencent.mm.y.c.xe() + ".tem", false);
    at.AR();
    localObject1 = com.tencent.mm.y.c.xf();
    localObject2 = new StringBuilder();
    at.AR();
    j.r((String)localObject1, com.tencent.mm.y.c.xf() + ".tem", false);
    localObject1 = new StringBuilder();
    at.AR();
    localObject1 = com.tencent.mm.y.c.xf() + "-journal";
    localObject2 = new StringBuilder();
    at.AR();
    j.r((String)localObject1, com.tencent.mm.y.c.xf() + ".tem-journal", false);
    localObject1 = new StringBuilder();
    at.AR();
    localObject1 = com.tencent.mm.y.c.xf() + "-wal";
    localObject2 = new StringBuilder();
    at.AR();
    j.r((String)localObject1, com.tencent.mm.y.c.xf() + ".tem-wal", false);
    w.i(TAG, "initTempDBimp before resetAccUin");
    com.tencent.mm.kernel.h.xw().release();
    com.tencent.mm.kernel.h.xw().initialize();
    w.i(TAG, "initTempDBimp before closeDB");
    w.i(TAG, "initTempDBimp before TemAccStg setAccInfo");
    localObject1 = afH();
    at.AR();
    localObject2 = com.tencent.mm.y.c.zo();
    at.AR();
    Object localObject3 = com.tencent.mm.y.c.zn();
    at.AR();
    ((c)localObject1).k((String)localObject2, (String)localObject3, com.tencent.mm.y.c.ww());
    w.i(TAG, "initTempDBimp before TemAccStg initDB");
    localObject1 = afH();
    localObject2 = new StringBuilder();
    at.AR();
    localObject2 = com.tencent.mm.y.c.xe() + ".tem";
    at.AR();
    i = com.tencent.mm.y.c.ww();
    localObject3 = new StringBuilder();
    at.AR();
    localObject3 = com.tencent.mm.y.c.xf() + ".tem";
    w.i("MicroMsg.TempStorage", "initDB isTempDB:%s  cache:%s uin:%s db:%s %s", new Object[] { ((c)localObject1).jcJ, localObject2, Integer.valueOf(i), localObject3, bg.bQW() });
    String str;
    if (paramInt > 0)
    {
      if ((((c)localObject1).jcJ != null) && (!((c)localObject1).jcJ.booleanValue()))
      {
        w.e("MicroMsg.TempStorage", "initDB isTempDB is false!!!");
        ((c)localObject1).yE();
      }
      str = "initDB here  isTempDb should null :" + ((c)localObject1).jcJ;
      if (((c)localObject1).jcJ != null) {
        break label729;
      }
    }
    label729:
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(str, bool);
      ((c)localObject1).jcJ = Boolean.valueOf(true);
      ((c)localObject1).fYV = new g(new c.1((c)localObject1));
      if (((c)localObject1).fYV.a((String)localObject2, (String)localObject3, "", i, p.sZ(), new HashMap(), false)) {
        break;
      }
      throw new com.tencent.mm.y.b((byte)0);
    }
    ((c)localObject1).afN();
    w.i(TAG, "initTempDBimp after TemAccStg initDB");
    AQ();
    parama.jco = true;
    parama.jcp = paramPLong1.value;
    parama.jcq = paramPLong2.value;
    parama.dbSize = paramPLong3.value;
    com.tencent.mm.plugin.backup.a.h.te(com.tencent.mm.plugin.backup.a.h.aer());
    GMTrace.o(14858842013696L, 110707);
    return true;
  }
  
  public final void aec()
  {
    GMTrace.i(14858170925056L, 110702);
    jca = null;
    GMTrace.o(14858170925056L, 110702);
  }
  
  public final c afH()
  {
    GMTrace.i(14858305142784L, 110703);
    if (this.jcb == null) {
      this.jcb = new c();
    }
    c localc = this.jcb;
    GMTrace.o(14858305142784L, 110703);
    return localc;
  }
  
  public final b afI()
  {
    GMTrace.i(14858439360512L, 110704);
    if (this.jcc == null) {
      this.jcc = new b();
    }
    b localb = this.jcc;
    GMTrace.o(14858439360512L, 110704);
    return localb;
  }
  
  public final void afJ()
  {
    GMTrace.i(14858573578240L, 110705);
    w.i(TAG, "backupInitTempDb");
    c localc = afH();
    at.AR();
    Object localObject = com.tencent.mm.y.c.zo();
    at.AR();
    String str = com.tencent.mm.y.c.zn();
    at.AR();
    localc.k((String)localObject, str, com.tencent.mm.y.c.ww());
    localc = afH();
    at.AR();
    localObject = com.tencent.mm.y.c.yH();
    w.i("MicroMsg.TempStorage", "setDataDB isTempDb:%s db:%s %s", new Object[] { localc.jcJ, localObject, bg.bQW() });
    localc.jcJ = Boolean.valueOf(false);
    localc.fYV = ((g)localObject);
    localc.afN();
    GMTrace.o(14858573578240L, 110705);
  }
  
  public final void m(final Runnable paramRunnable)
  {
    GMTrace.i(14858976231424L, 110708);
    a(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14857499836416L, 110697);
        w.i(a.TAG, "recoverFromTempDB closeTempDB ok");
        w.bPM();
        at.xB().a(new af.a()
        {
          public final boolean Dj()
          {
            GMTrace.i(14855755005952L, 110684);
            w.i(a.TAG, "doInBackground start");
            w.bPM();
            a.afK();
            e.f(new File(com.tencent.mm.plugin.backup.a.h.aer()));
            b localb = a.this.afI();
            localb.handler.post(new b.2(localb));
            w.i(a.TAG, "doInBackground end");
            w.bPM();
            GMTrace.o(14855755005952L, 110684);
            return true;
          }
          
          public final boolean Dk()
          {
            GMTrace.i(14855620788224L, 110683);
            a.2.this.jci.run();
            com.tencent.mm.sdk.b.a.vgX.m(new ox());
            GMTrace.o(14855620788224L, 110683);
            return false;
          }
          
          public final String toString()
          {
            GMTrace.i(14855889223680L, 110685);
            String str = super.toString() + "|recoverFromTempDB";
            GMTrace.o(14855889223680L, 110685);
            return str;
          }
        });
        GMTrace.o(14857499836416L, 110697);
      }
    }, 10);
    GMTrace.o(14858976231424L, 110708);
  }
  
  public final void n(final Runnable paramRunnable)
  {
    GMTrace.i(14859110449152L, 110709);
    w.i(TAG, "backupCloseTempDb");
    a(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14856694530048L, 110691);
        w.i(a.TAG, "backupFromTempDB closeTempDB ok");
        w.bPM();
        at.xB().a(new af.a()
        {
          public final boolean Dj()
          {
            GMTrace.i(14854681264128L, 110676);
            w.i(a.TAG, "doInBackground.");
            a.afL();
            GMTrace.o(14854681264128L, 110676);
            return true;
          }
          
          public final boolean Dk()
          {
            GMTrace.i(14854547046400L, 110675);
            a.3.this.jck.run();
            GMTrace.o(14854547046400L, 110675);
            return false;
          }
          
          public final String toString()
          {
            GMTrace.i(14854815481856L, 110677);
            String str = super.toString() + "|backupcloseTempDB";
            GMTrace.o(14854815481856L, 110677);
            return str;
          }
        });
        GMTrace.o(14856694530048L, 110691);
      }
    }, 10);
    GMTrace.o(14859110449152L, 110709);
  }
  
  public static class a
    implements Runnable
  {
    public long dbSize;
    public boolean jco;
    public long jcp;
    public long jcq;
    
    public a()
    {
      GMTrace.i(14854949699584L, 110678);
      this.jco = true;
      this.dbSize = 0L;
      this.jcp = 0L;
      this.jcq = 0L;
      GMTrace.o(14854949699584L, 110678);
    }
    
    public void run()
    {
      GMTrace.i(14855083917312L, 110679);
      GMTrace.o(14855083917312L, 110679);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */