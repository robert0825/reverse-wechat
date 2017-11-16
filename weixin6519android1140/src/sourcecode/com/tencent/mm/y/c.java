package com.tencent.mm.y;

import android.content.SharedPreferences;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.e.a;
import com.tencent.mm.kernel.e.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.am;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.n;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.u;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class c
{
  public static HashMap<Integer, g.d> fIv;
  public bm glP;
  public bl glQ;
  com.tencent.mm.storage.h glR;
  com.tencent.mm.y.b.c glS;
  com.tencent.mm.y.b.d glT;
  com.tencent.mm.storage.ap glU;
  com.tencent.mm.storage.j glV;
  n glW;
  com.tencent.mm.storage.l glX;
  com.tencent.mm.y.b.b glY;
  
  static
  {
    GMTrace.i(679947010048L, 5066);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("BOTTLE_MESSAGE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(617535766528L, 4601);
        String[] arrayOfString = am.fTX;
        GMTrace.o(617535766528L, 4601);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("APPBRAND_MESSAGE_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(628004749312L, 4679);
        String[] arrayOfString = com.tencent.mm.storage.h.fTX;
        GMTrace.o(628004749312L, 4679);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("AddContactAntispamTicket".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(647332102144L, 4823);
        String[] arrayOfString = com.tencent.mm.storage.g.fTX;
        GMTrace.o(647332102144L, 4823);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("GetSysCmdMsgInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(680215445504L, 5068);
        String[] arrayOfString = com.tencent.mm.storage.ap.fTX;
        GMTrace.o(680215445504L, 5068);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("BackupMoveTime".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(670283333632L, 4994);
        String[] arrayOfString = com.tencent.mm.storage.j.fTX;
        GMTrace.o(670283333632L, 4994);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("BackupTempMoveTime".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(622770257920L, 4640);
        String[] arrayOfString = n.fTX;
        GMTrace.o(622770257920L, 4640);
        return arrayOfString;
      }
    });
    fIv.put(Integer.valueOf("BackupRecoverMsgListDataId".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(625320394752L, 4659);
        String[] arrayOfString = com.tencent.mm.storage.l.fTX;
        GMTrace.o(625320394752L, 4659);
        return arrayOfString;
      }
    });
    GMTrace.o(679947010048L, 5066);
  }
  
  public c()
  {
    GMTrace.i(670820204544L, 4998);
    com.tencent.mm.kernel.h.xz();
    ??? = com.tencent.mm.kernel.h.xy();
    Object localObject2 = new g.a()
    {
      public final void xo()
      {
        GMTrace.i(686255243264L, 5113);
        com.tencent.mm.kernel.h.xz();
        if (com.tencent.mm.kernel.h.xw().wL())
        {
          com.tencent.mm.modelstat.l locall = com.tencent.mm.modelstat.p.Mu();
          if (locall != null)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AccountStorage", "summer preCloseCallback netStatStg: " + locall);
            long l = System.currentTimeMillis();
            locall.gZe.kI(true);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.NetStat", "summer net appendAllToDisk end takes: " + (System.currentTimeMillis() - l) + " ms");
          }
        }
        GMTrace.o(686255243264L, 5113);
      }
      
      public final void xp()
      {
        GMTrace.i(686389460992L, 5114);
        GMTrace.o(686389460992L, 5114);
      }
      
      public final void xq()
      {
        GMTrace.i(686523678720L, 5115);
        GMTrace.o(686523678720L, 5115);
      }
    };
    ((com.tencent.mm.kernel.e)???).fYP.bT(localObject2);
    com.tencent.mm.kernel.h.xz();
    ??? = com.tencent.mm.kernel.h.xy();
    localObject2 = new com.tencent.mm.kernel.api.b()
    {
      public final List<String> collectStoragePaths()
      {
        GMTrace.i(644916183040L, 4805);
        LinkedList localLinkedList = new LinkedList();
        Collections.addAll(localLinkedList, new String[] { "image/shakeTranImg/", "emoji/", "locallog", "mailapp/", "mailapp/", "voice2/", "video/", "attachment/" });
        GMTrace.o(644916183040L, 4805);
        return localLinkedList;
      }
    };
    ((com.tencent.mm.kernel.e)???).fYO.bT(localObject2);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().a(new com.tencent.mm.kernel.api.g()
    {
      public final void be(boolean paramAnonymousBoolean)
      {
        GMTrace.i(641963393024L, 4783);
        if (paramAnonymousBoolean) {
          com.tencent.mm.s.c.vK().k(262145, false);
        }
        GMTrace.o(641963393024L, 4783);
      }
      
      public final void eO(String paramAnonymousString)
      {
        GMTrace.i(642366046208L, 4786);
        if (com.tencent.mm.compatible.util.f.ty())
        {
          com.tencent.mm.kernel.h.xz();
          if (com.tencent.mm.kernel.h.xy().fYT.equals(com.tencent.mm.compatible.util.e.ghz))
          {
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.sdk.f.e.post(new c.b(com.tencent.mm.kernel.h.xy().cachePath, paramAnonymousString), "AccountStorage_moveDataFiles");
          }
        }
        GMTrace.o(642366046208L, 4786);
      }
      
      public final void onDataBaseClosed(com.tencent.mm.bu.g paramAnonymousg1, com.tencent.mm.bu.g paramAnonymousg2)
      {
        GMTrace.i(642500263936L, 4787);
        GMTrace.o(642500263936L, 4787);
      }
      
      public final void onDataBaseOpened(com.tencent.mm.bu.g paramAnonymousg1, com.tencent.mm.bu.g paramAnonymousg2)
      {
        GMTrace.i(642097610752L, 4784);
        GMTrace.o(642097610752L, 4784);
      }
      
      public final void xr()
      {
        GMTrace.i(642231828480L, 4785);
        at.AK().aY(com.tencent.mm.compatible.util.f.ty());
        at.AQ();
        GMTrace.o(642231828480L, 4785);
      }
    });
    com.tencent.mm.kernel.h.xz();
    localObject2 = com.tencent.mm.kernel.h.xy();
    com.tencent.mm.kernel.api.a local7 = new com.tencent.mm.kernel.api.a()
    {
      public final HashMap<Integer, g.d> collectDatabaseFactory()
      {
        GMTrace.i(629078491136L, 4687);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AccountStorage", "Carl WTF --- collectDatabaseFactory ");
        HashMap localHashMap = new HashMap();
        localHashMap.putAll(c.fIv);
        localHashMap.putAll(at.AK().BL());
        GMTrace.o(629078491136L, 4687);
        return localHashMap;
      }
    };
    synchronized (((com.tencent.mm.kernel.e)localObject2).fYR)
    {
      ((com.tencent.mm.kernel.e)localObject2).fYR.add(local7);
      GMTrace.o(670820204544L, 4998);
      return;
    }
  }
  
  public static void a(ap paramap)
  {
    GMTrace.i(671893946368L, 5006);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.a locala = com.tencent.mm.kernel.h.xw();
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "UserStatusChange: add %s", new Object[] { paramap });
    synchronized (locala.fYd)
    {
      if (!locala.fYd.contains(paramap)) {
        locala.fYd.add(paramap);
      }
      GMTrace.o(671893946368L, 5006);
      return;
    }
  }
  
  public static void b(ap paramap)
  {
    GMTrace.i(672028164096L, 5007);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.a locala = com.tencent.mm.kernel.h.xw();
    com.tencent.mm.sdk.platformtools.w.i("MMKernel.CoreAccount", "UserStatusChange: remove %s", new Object[] { paramap });
    synchronized (locala.fYd)
    {
      locala.fYd.remove(paramap);
      GMTrace.o(672028164096L, 5007);
      return;
    }
  }
  
  public static void eI(int paramInt)
  {
    GMTrace.i(678604832768L, 5056);
    at.AK().fE(paramInt);
    if ((paramInt & 0x10) != 0)
    {
      bc.a("medianote", null);
      at.AR();
      yP().TN("medianote");
    }
    GMTrace.o(678604832768L, 5056);
  }
  
  public static SharedPreferences eN(String paramString)
  {
    GMTrace.i(672967688192L, 5014);
    com.tencent.mm.kernel.h.xz();
    paramString = com.tencent.mm.kernel.h.xy().eN(paramString);
    GMTrace.o(672967688192L, 5014);
    return paramString;
  }
  
  public static boolean fg(int paramInt)
  {
    GMTrace.i(672430817280L, 5010);
    boolean bool = com.tencent.mm.kernel.a.fg(paramInt);
    GMTrace.o(672430817280L, 5010);
    return bool;
  }
  
  public static String getAccSnsPath()
  {
    GMTrace.i(677128437760L, 5045);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath();
    GMTrace.o(677128437760L, 5045);
    return str;
  }
  
  public static String getAccSnsTmpPath()
  {
    GMTrace.i(677262655488L, 5046);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath();
    GMTrace.o(677262655488L, 5046);
    return str;
  }
  
  public static String getAccVideoPath()
  {
    GMTrace.i(676054695936L, 5037);
    com.tencent.mm.modelvideo.o.Ng();
    String str = com.tencent.mm.modelvideo.o.getAccVideoPath();
    GMTrace.o(676054695936L, 5037);
    return str;
  }
  
  public static boolean isSDCardAvailable()
  {
    GMTrace.i(671491293184L, 5003);
    com.tencent.mm.kernel.h.xz();
    boolean bool = com.tencent.mm.kernel.h.xy().isSDCardAvailable();
    GMTrace.o(671491293184L, 5003);
    return bool;
  }
  
  public static void wH()
  {
    GMTrace.i(672162381824L, 5008);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wH();
    GMTrace.o(672162381824L, 5008);
  }
  
  public static int ww()
  {
    GMTrace.i(670954422272L, 4999);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    int i = com.tencent.mm.kernel.a.ww();
    GMTrace.o(670954422272L, 4999);
    return i;
  }
  
  public static String xd()
  {
    GMTrace.i(671625510912L, 5004);
    com.tencent.mm.kernel.h.xz();
    String str = com.tencent.mm.kernel.h.xy().xd();
    GMTrace.o(671625510912L, 5004);
    return str;
  }
  
  public static String xe()
  {
    GMTrace.i(677799526400L, 5050);
    com.tencent.mm.kernel.h.xz();
    String str = com.tencent.mm.kernel.h.xy().xe();
    GMTrace.o(677799526400L, 5050);
    return str;
  }
  
  public static String xf()
  {
    GMTrace.i(677933744128L, 5051);
    com.tencent.mm.kernel.h.xz();
    String str = com.tencent.mm.kernel.h.xy().xf();
    GMTrace.o(677933744128L, 5051);
    return str;
  }
  
  public static t xh()
  {
    GMTrace.i(673101905920L, 5015);
    com.tencent.mm.kernel.h.xz();
    t localt = com.tencent.mm.kernel.h.xy().xh();
    GMTrace.o(673101905920L, 5015);
    return localt;
  }
  
  public static ba xi()
  {
    GMTrace.i(673236123648L, 5016);
    com.tencent.mm.kernel.h.xz();
    ba localba = com.tencent.mm.kernel.h.xy().xi();
    GMTrace.o(673236123648L, 5016);
    return localba;
  }
  
  public static void xj()
  {
    GMTrace.i(671222857728L, 5001);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xj();
    GMTrace.o(671222857728L, 5001);
  }
  
  public static String yD()
  {
    GMTrace.i(671088640000L, 5000);
    com.tencent.mm.kernel.h.xz();
    String str = com.tencent.mm.kernel.h.xy().fYT;
    GMTrace.o(671088640000L, 5000);
    return str;
  }
  
  public static void yE()
  {
    GMTrace.i(671759728640L, 5005);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().dk(null);
    GMTrace.o(671759728640L, 5005);
  }
  
  public static boolean yF()
  {
    GMTrace.i(672296599552L, 5009);
    com.tencent.mm.kernel.h.xz();
    boolean bool = com.tencent.mm.kernel.a.fg(com.tencent.mm.kernel.h.xw().fYb);
    GMTrace.o(672296599552L, 5009);
    return bool;
  }
  
  public static int yG()
  {
    GMTrace.i(672565035008L, 5011);
    com.tencent.mm.kernel.h.xz();
    int i = com.tencent.mm.kernel.h.xw().fYc;
    GMTrace.o(672565035008L, 5011);
    return i;
  }
  
  public static com.tencent.mm.bu.g yH()
  {
    GMTrace.i(672699252736L, 5012);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.bu.g localg = com.tencent.mm.kernel.h.xy().fYV;
    GMTrace.o(672699252736L, 5012);
    return localg;
  }
  
  public static com.tencent.mm.bu.g yI()
  {
    GMTrace.i(672833470464L, 5013);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.bu.g localg = com.tencent.mm.kernel.h.xy().fYW;
    GMTrace.o(672833470464L, 5013);
    return localg;
  }
  
  public static com.tencent.mm.plugin.messenger.foundation.a.a.d yJ()
  {
    GMTrace.i(673370341376L, 5017);
    com.tencent.mm.plugin.messenger.foundation.a.a.d locald = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ();
    GMTrace.o(673370341376L, 5017);
    return locald;
  }
  
  public static ar yK()
  {
    GMTrace.i(673504559104L, 5018);
    ar localar = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK();
    GMTrace.o(673504559104L, 5018);
    return localar;
  }
  
  public static com.tencent.mm.plugin.messenger.foundation.a.a.g yL()
  {
    GMTrace.i(673638776832L, 5019);
    com.tencent.mm.plugin.messenger.foundation.a.a.g localg = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL();
    GMTrace.o(673638776832L, 5019);
    return localg;
  }
  
  public static com.tencent.mm.plugin.messenger.foundation.a.a.c yM()
  {
    GMTrace.i(673772994560L, 5020);
    com.tencent.mm.plugin.messenger.foundation.a.a.c localc = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf();
    GMTrace.o(673772994560L, 5020);
    return localc;
  }
  
  public static com.tencent.mm.storage.o yN()
  {
    GMTrace.i(14456994136064L, 107713);
    com.tencent.mm.storage.o localo = ((com.tencent.mm.af.o)com.tencent.mm.kernel.h.h(com.tencent.mm.af.o.class)).yN();
    GMTrace.o(14456994136064L, 107713);
    return localo;
  }
  
  public static com.tencent.mm.storage.p yO()
  {
    GMTrace.i(14457128353792L, 107714);
    com.tencent.mm.storage.p localp = ((com.tencent.mm.af.o)com.tencent.mm.kernel.h.h(com.tencent.mm.af.o.class)).yO();
    GMTrace.o(14457128353792L, 107714);
    return localp;
  }
  
  public static as yP()
  {
    GMTrace.i(673907212288L, 5021);
    as localas = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP();
    GMTrace.o(673907212288L, 5021);
    return localas;
  }
  
  public static com.tencent.mm.plugin.downloader.e.b yQ()
  {
    GMTrace.i(17957795135488L, 133796);
    com.tencent.mm.plugin.downloader.e.b localb = ((com.tencent.mm.plugin.downloader.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.downloader.b.a.class)).yQ();
    GMTrace.o(17957795135488L, 133796);
    return localb;
  }
  
  public static com.tencent.mm.storage.at yR()
  {
    GMTrace.i(17443741237248L, 129966);
    com.tencent.mm.storage.at localat = ((com.tencent.mm.plugin.r.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.r.a.a.class)).yR();
    GMTrace.o(17443741237248L, 129966);
    return localat;
  }
  
  public static com.tencent.mm.plugin.messenger.foundation.a.a.f yS()
  {
    GMTrace.i(674309865472L, 5024);
    com.tencent.mm.plugin.messenger.foundation.a.a.f localf = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yS();
    GMTrace.o(674309865472L, 5024);
    return localf;
  }
  
  public static ae yT()
  {
    GMTrace.i(17957929353216L, 133797);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    ae localae = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.chatroom.b.b.class)).yT();
    GMTrace.o(17957929353216L, 133797);
    return localae;
  }
  
  public static String yU()
  {
    GMTrace.i(674578300928L, 5026);
    String str = com.tencent.mm.plugin.n.b.yU();
    GMTrace.o(674578300928L, 5026);
    return str;
  }
  
  public static String yV()
  {
    GMTrace.i(674712518656L, 5027);
    String str = com.tencent.mm.plugin.n.b.yV();
    GMTrace.o(674712518656L, 5027);
    return str;
  }
  
  public static String yW()
  {
    GMTrace.i(674980954112L, 5029);
    String str = com.tencent.mm.plugin.ac.a.yW();
    GMTrace.o(674980954112L, 5029);
    return str;
  }
  
  public static String yX()
  {
    GMTrace.i(675115171840L, 5030);
    String str = q.yX();
    GMTrace.o(675115171840L, 5030);
    return str;
  }
  
  public static String yY()
  {
    GMTrace.i(675249389568L, 5031);
    String str = q.yY();
    GMTrace.o(675249389568L, 5031);
    return str;
  }
  
  public static String yZ()
  {
    GMTrace.i(675383607296L, 5032);
    String str = com.tencent.mm.plugin.record.b.yZ();
    GMTrace.o(675383607296L, 5032);
    return str;
  }
  
  public static String za()
  {
    GMTrace.i(675517825024L, 5033);
    String str = u.za();
    GMTrace.o(675517825024L, 5033);
    return str;
  }
  
  public static String zb()
  {
    GMTrace.i(675786260480L, 5035);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().fYU + "emoji/";
    GMTrace.o(675786260480L, 5035);
    return (String)localObject;
  }
  
  public static String zc()
  {
    GMTrace.i(675920478208L, 5036);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().fYU + "mailapp/";
    GMTrace.o(675920478208L, 5036);
    return (String)localObject;
  }
  
  public static String zd()
  {
    GMTrace.i(676188913664L, 5038);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().fYU + "image/shakeTranImg/";
    GMTrace.o(676188913664L, 5038);
    return (String)localObject;
  }
  
  public static String ze()
  {
    GMTrace.i(676323131392L, 5039);
    String str = com.tencent.mm.plugin.l.a.ze();
    GMTrace.o(676323131392L, 5039);
    return str;
  }
  
  public static String zf()
  {
    GMTrace.i(676457349120L, 5040);
    String str = com.tencent.mm.plugin.x.a.zf();
    GMTrace.o(676457349120L, 5040);
    return str;
  }
  
  public static String zg()
  {
    GMTrace.i(676591566848L, 5041);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().fYU + "attachment/";
    GMTrace.o(676591566848L, 5041);
    return (String)localObject;
  }
  
  public static String zh()
  {
    GMTrace.i(676725784576L, 5042);
    String str = ((com.tencent.mm.af.o)com.tencent.mm.kernel.h.h(com.tencent.mm.af.o.class)).zh();
    GMTrace.o(676725784576L, 5042);
    return str;
  }
  
  public static String zi()
  {
    GMTrace.i(676860002304L, 5043);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().fYU + "record/";
    GMTrace.o(676860002304L, 5043);
    return (String)localObject;
  }
  
  public static String zj()
  {
    GMTrace.i(676994220032L, 5044);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().fYU + "draft/";
    GMTrace.o(676994220032L, 5044);
    return (String)localObject;
  }
  
  public static String zk()
  {
    GMTrace.i(677396873216L, 5047);
    String str = com.tencent.mm.plugin.n.b.zk();
    GMTrace.o(677396873216L, 5047);
    return str;
  }
  
  public static String zl()
  {
    GMTrace.i(677531090944L, 5048);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = zo() + "voiceremind/";
    GMTrace.o(677531090944L, 5048);
    return (String)localObject;
  }
  
  public static String zm()
  {
    GMTrace.i(677665308672L, 5049);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = zo() + "wenote/";
    GMTrace.o(677665308672L, 5049);
    return (String)localObject;
  }
  
  public static String zn()
  {
    GMTrace.i(678067961856L, 5052);
    com.tencent.mm.kernel.h.xz();
    String str = com.tencent.mm.kernel.h.xy().cachePath;
    GMTrace.o(678067961856L, 5052);
    return str;
  }
  
  public static String zo()
  {
    GMTrace.i(678202179584L, 5053);
    com.tencent.mm.kernel.h.xz();
    String str = com.tencent.mm.kernel.h.xy().fYU;
    GMTrace.o(678202179584L, 5053);
    return str;
  }
  
  public static void zq()
  {
    GMTrace.i(678470615040L, 5055);
    GMTrace.o(678470615040L, 5055);
  }
  
  public static com.tencent.mm.storage.g zu()
  {
    GMTrace.i(679007485952L, 5059);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    com.tencent.mm.storage.g localg = com.tencent.mm.plugin.d.a.Re().zu();
    GMTrace.o(679007485952L, 5059);
    return localg;
  }
  
  public static com.tencent.mm.plugin.messenger.foundation.a.a.b zv()
  {
    GMTrace.i(679141703680L, 5060);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    com.tencent.mm.plugin.messenger.foundation.a.a.b localb = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).zv();
    GMTrace.o(679141703680L, 5060);
    return localb;
  }
  
  public final void zp()
  {
    GMTrace.i(678336397312L, 5054);
    Object localObject = new StringBuilder("mm");
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    String str1 = com.tencent.mm.a.g.n(com.tencent.mm.kernel.a.ww().getBytes());
    localObject = com.tencent.mm.storage.w.ghv + str1 + "/";
    str1 = com.tencent.mm.compatible.util.e.ghz + str1 + "/";
    String[] arrayOfString = new File((String)localObject).list(new FilenameFilter()
    {
      public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        GMTrace.i(615656718336L, 4587);
        if ((paramAnonymousString.equals("EnMicroMsg.db")) || (paramAnonymousString.startsWith("EnMicroMsg.dberr")) || (paramAnonymousString.equals("FTS5IndexMicroMsg.db")))
        {
          GMTrace.o(615656718336L, 4587);
          return true;
        }
        GMTrace.o(615656718336L, 4587);
        return false;
      }
    });
    if (arrayOfString == null)
    {
      GMTrace.o(678336397312L, 5054);
      return;
    }
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str2 = arrayOfString[i];
      String str3 = str1 + str2 + ".dump";
      FileOp.deleteFile(str3);
      FileOp.o((String)localObject + str2, str3);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AccountStorage", "Exported: " + str3);
      i += 1;
    }
    GMTrace.o(678336397312L, 5054);
  }
  
  public final com.tencent.mm.y.b.c zr()
  {
    GMTrace.i(678739050496L, 5057);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    com.tencent.mm.y.b.c localc = this.glS;
    GMTrace.o(678739050496L, 5057);
    return localc;
  }
  
  public final com.tencent.mm.y.b.d zs()
  {
    GMTrace.i(678873268224L, 5058);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    com.tencent.mm.y.b.d locald = this.glT;
    GMTrace.o(678873268224L, 5058);
    return locald;
  }
  
  public final com.tencent.mm.y.b.b zt()
  {
    GMTrace.i(16260209311744L, 121148);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    com.tencent.mm.y.b.b localb = this.glY;
    GMTrace.o(16260209311744L, 121148);
    return localb;
  }
  
  public final com.tencent.mm.storage.ap zw()
  {
    GMTrace.i(679275921408L, 5061);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    com.tencent.mm.storage.ap localap = this.glU;
    GMTrace.o(679275921408L, 5061);
    return localap;
  }
  
  public final com.tencent.mm.storage.j zx()
  {
    GMTrace.i(17958063570944L, 133798);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    com.tencent.mm.storage.j localj = this.glV;
    GMTrace.o(17958063570944L, 133798);
    return localj;
  }
  
  public final n zy()
  {
    GMTrace.i(17958197788672L, 133799);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    n localn = this.glW;
    GMTrace.o(17958197788672L, 133799);
    return localn;
  }
  
  public final com.tencent.mm.storage.l zz()
  {
    GMTrace.i(17958332006400L, 133800);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw().wG();
    com.tencent.mm.storage.l locall = this.glX;
    GMTrace.o(17958332006400L, 133800);
    return locall;
  }
  
  public static abstract interface a
  {
    public abstract void a(c paramc, boolean paramBoolean);
    
    public abstract void aY(boolean paramBoolean);
    
    public abstract void zA();
  }
  
  static final class b
    implements Runnable
  {
    String eRB;
    String gma;
    
    public b(String paramString1, String paramString2)
    {
      GMTrace.i(617938419712L, 4604);
      this.eRB = paramString1;
      this.gma = paramString2;
      GMTrace.o(617938419712L, 4604);
    }
    
    public final void run()
    {
      GMTrace.i(618072637440L, 4605);
      if ((bg.nm(this.eRB)) || (bg.nm(this.gma)))
      {
        GMTrace.o(618072637440L, 4605);
        return;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AccountStorage", "MoveDataFiles :" + this.eRB + " to :" + this.gma);
      if (!com.tencent.mm.compatible.util.f.ty())
      {
        GMTrace.o(618072637440L, 4605);
        return;
      }
      if (!this.gma.substring(0, com.tencent.mm.compatible.util.e.ghz.length()).equals(com.tencent.mm.compatible.util.e.ghz))
      {
        GMTrace.o(618072637440L, 4605);
        return;
      }
      com.tencent.mm.sdk.platformtools.j.r(this.eRB + "image/", this.gma + "image/", true);
      com.tencent.mm.sdk.platformtools.j.r(this.eRB + "image2/", this.gma + "image2/", true);
      com.tencent.mm.sdk.platformtools.j.r(this.eRB + "video/", this.gma + "video/", true);
      com.tencent.mm.sdk.platformtools.j.r(this.eRB + "voice/", this.gma + "voice/", true);
      com.tencent.mm.sdk.platformtools.j.r(this.eRB + "voice2/", this.gma + "voice2/", true);
      com.tencent.mm.sdk.platformtools.j.r(this.eRB + "package/", this.gma + "package/", true);
      com.tencent.mm.sdk.platformtools.j.r(this.eRB + "emoji/", this.gma + "emoji/", true);
      com.tencent.mm.sdk.platformtools.j.r(this.eRB + "mailapp/", this.gma + "mailapp/", true);
      com.tencent.mm.sdk.platformtools.j.r(this.eRB + "brandicon/", this.gma + "brandicon/", true);
      GMTrace.o(618072637440L, 4605);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */