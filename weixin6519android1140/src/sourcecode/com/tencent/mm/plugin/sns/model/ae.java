package com.tencent.mm.plugin.sns.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Looper;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.bj;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ci;
import com.tencent.mm.g.a.cj;
import com.tencent.mm.g.a.gu;
import com.tencent.mm.g.a.ho;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.g.a.kr;
import com.tencent.mm.g.a.kr.a;
import com.tencent.mm.g.a.ky;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.g.a.mx;
import com.tencent.mm.g.a.nc;
import com.tencent.mm.g.a.nl;
import com.tencent.mm.g.a.nm;
import com.tencent.mm.g.a.pf;
import com.tencent.mm.g.a.pi;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.qp;
import com.tencent.mm.g.a.qp.a;
import com.tencent.mm.g.a.rj;
import com.tencent.mm.g.a.rw;
import com.tencent.mm.memory.e.a;
import com.tencent.mm.memory.o;
import com.tencent.mm.memory.o.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.Builder;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.k;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.x;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.av.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.bt;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class ae
  implements com.tencent.mm.plugin.sns.b.j, com.tencent.mm.y.aq
{
  public static boolean ptG;
  private static int ptH;
  private static int ptI;
  private static int ptN;
  private static int ptO;
  private static String pum;
  protected static HashMap<Integer, g.d> pun;
  private static int puv;
  private static Point puw;
  private com.tencent.mm.bu.g fYV;
  private byte[] gCf;
  private String gtp;
  private com.tencent.mm.sdk.platformtools.ae handler;
  private boolean laE;
  private com.tencent.mm.sdk.b.c nqi;
  public com.tencent.mm.sdk.platformtools.ae[] ptJ;
  public com.tencent.mm.sdk.platformtools.ae[] ptK;
  public com.tencent.mm.sdk.platformtools.ae ptL;
  public com.tencent.mm.sdk.platformtools.ae ptM;
  private r ptP;
  private com.tencent.mm.plugin.sns.storage.n ptQ;
  private com.tencent.mm.plugin.sns.storage.f ptR;
  private com.tencent.mm.plugin.sns.storage.d ptS;
  private x ptT;
  private g ptU;
  private com.tencent.mm.plugin.sns.storage.l ptV;
  private com.tencent.mm.plugin.sns.storage.j ptW;
  private com.tencent.mm.plugin.sns.storage.t ptX;
  private ac ptY;
  private al.a ptZ;
  private com.tencent.mm.plugin.sns.p puA;
  private com.tencent.mm.plugin.sns.h puB;
  private com.tencent.mm.plugin.sns.g puC;
  private com.tencent.mm.plugin.sns.m puD;
  private com.tencent.mm.plugin.sns.j puE;
  private com.tencent.mm.plugin.sns.b puF;
  private com.tencent.mm.plugin.sns.c puG;
  private com.tencent.mm.plugin.sns.f puH;
  private com.tencent.mm.sdk.b.c puI;
  private com.tencent.mm.sdk.b.c puJ;
  private com.tencent.mm.sdk.b.c puK;
  private com.tencent.mm.sdk.b.c puL;
  private com.tencent.mm.sdk.b.c puM;
  private com.tencent.mm.sdk.b.c puN;
  private com.tencent.mm.sdk.b.c puO;
  private com.tencent.mm.sdk.b.c puP;
  private com.tencent.mm.sdk.b.c puQ;
  private com.tencent.mm.sdk.b.c puR;
  private com.tencent.mm.sdk.b.c puS;
  private com.tencent.mm.sdk.b.c puT;
  private com.tencent.mm.sdk.b.c puU;
  private com.tencent.mm.sdk.b.c puV;
  private com.tencent.mm.sdk.b.c puW;
  private com.tencent.mm.sdk.b.c puX;
  private com.tencent.mm.sdk.b.c puY;
  private com.tencent.mm.sdk.b.c puZ;
  private b pua;
  private av pub;
  private aj puc;
  private com.tencent.mm.plugin.sns.f.c pud;
  private com.tencent.mm.plugin.sns.f.g pue;
  private com.tencent.mm.plugin.sns.storage.p puf;
  public com.tencent.mm.plugin.sns.a.b.i pug;
  private an puh;
  private boolean pui;
  private com.tencent.mm.plugin.sns.storage.v puj;
  private boolean puk;
  private byte[] pul;
  private com.tencent.mm.plugin.sns.d puo;
  private com.tencent.mm.plugin.sns.e.a pup;
  private aq puq;
  private com.tencent.mm.plugin.sns.lucky.a.f pur;
  private com.tencent.mm.plugin.sns.lucky.a.j pus;
  private com.tencent.mm.plugin.sns.lucky.a.d put;
  private com.tencent.mm.plugin.sns.lucky.a.l puu;
  private com.tencent.mm.plugin.sns.n pux;
  private k puy;
  private com.tencent.mm.plugin.sns.e puz;
  boolean pva;
  private com.tencent.mm.sdk.b.c pvb;
  private com.tencent.mm.sdk.b.c pvc;
  
  static
  {
    GMTrace.i(8058566606848L, 60041);
    ptG = true;
    ptH = 0;
    ptI = 0;
    pum = "";
    pun = new HashMap();
    puv = 103;
    puw = new Point();
    pun.put(Integer.valueOf("CanvasInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(8040715649024L, 59908);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.d.fTX;
        GMTrace.o(8040715649024L, 59908);
        return arrayOfString;
      }
    });
    pun.put(Integer.valueOf("UxCanvasInfo".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(8106079682560L, 60395);
        String[] arrayOfString = x.fTX;
        GMTrace.o(8106079682560L, 60395);
        return arrayOfString;
      }
    });
    pun.put(Integer.valueOf("SNSMEDIA_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(8147284525056L, 60702);
        String[] arrayOfString = r.fTX;
        GMTrace.o(8147284525056L, 60702);
        return arrayOfString;
      }
    });
    pun.put(Integer.valueOf("SNSINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(8089570902016L, 60272);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.n.fTX;
        GMTrace.o(8089570902016L, 60272);
        return arrayOfString;
      }
    });
    pun.put(Integer.valueOf("SNSINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(8049171365888L, 59971);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.n.fTX;
        GMTrace.o(8049171365888L, 59971);
        return arrayOfString;
      }
    });
    pun.put(Integer.valueOf("ADSNSINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(8121246285824L, 60508);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.f.fTX;
        GMTrace.o(8121246285824L, 60508);
        return arrayOfString;
      }
    });
    pun.put(Integer.valueOf("SNSEXT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(8088497160192L, 60264);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.l.fTX;
        GMTrace.o(8088497160192L, 60264);
        return arrayOfString;
      }
    });
    pun.put(Integer.valueOf("SNSCOMMENT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(8073330556928L, 60151);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.j.fTX;
        GMTrace.o(8073330556928L, 60151);
        return arrayOfString;
      }
    });
    pun.put(Integer.valueOf("SNSTAGINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(16640716570624L, 123983);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.t.fTX;
        GMTrace.o(16640716570624L, 123983);
        return arrayOfString;
      }
    });
    pun.put(Integer.valueOf("SNSKVREPORT_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(20843744722944L, 155298);
        String[] arrayOfString = com.tencent.mm.plugin.sns.storage.p.fTX;
        GMTrace.o(20843744722944L, 155298);
        return arrayOfString;
      }
    });
    GMTrace.o(8058566606848L, 60041);
  }
  
  public ae()
  {
    GMTrace.i(8051989938176L, 59992);
    this.handler = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.ptJ = new com.tencent.mm.sdk.platformtools.ae[3];
    this.ptK = new com.tencent.mm.sdk.platformtools.ae[1];
    this.ptL = null;
    this.ptM = null;
    this.puh = new an();
    this.laE = false;
    this.pui = true;
    this.gCf = new byte[0];
    this.puj = new com.tencent.mm.plugin.sns.storage.v();
    this.puk = false;
    this.pul = new byte[0];
    this.pur = new com.tencent.mm.plugin.sns.lucky.a.f();
    this.pus = new com.tencent.mm.plugin.sns.lucky.a.j();
    this.put = new com.tencent.mm.plugin.sns.lucky.a.d();
    this.puu = new com.tencent.mm.plugin.sns.lucky.a.l();
    this.puI = new com.tencent.mm.sdk.b.c() {};
    this.puJ = new com.tencent.mm.sdk.b.c() {};
    this.puK = new com.tencent.mm.sdk.b.c() {};
    this.puL = new com.tencent.mm.sdk.b.c() {};
    this.puM = new com.tencent.mm.sdk.b.c() {};
    this.puN = new com.tencent.mm.sdk.b.c() {};
    this.puO = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(kr paramAnonymouskr)
      {
        GMTrace.i(20842402545664L, 155288);
        Object localObject2 = paramAnonymouskr.eOT.eJX;
        com.tencent.mm.plugin.sns.storage.n localn = ae.bjd();
        paramAnonymouskr = ae.yH();
        long l1 = paramAnonymouskr.cE(-1L);
        try
        {
          localObject2 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            long l2 = ((Long)((Iterator)localObject2).next()).longValue();
            com.tencent.mm.plugin.sns.storage.m localm = localn.va((int)l2);
            if (localm != null)
            {
              localm.field_localFlag |= 0x40;
              w.d("MicroMsg.SnsInfoStorage", "snsInfoId:%d, setOmitFailResend", new Object[] { Long.valueOf(l2) });
              localn.b((int)l2, localm);
            }
          }
        }
        finally
        {
          paramAnonymouskr.aL(l1);
        }
        GMTrace.o(20842402545664L, 155288);
        return false;
      }
    };
    this.puP = new com.tencent.mm.sdk.b.c() {};
    this.puQ = new com.tencent.mm.sdk.b.c() {};
    this.puR = new com.tencent.mm.sdk.b.c() {};
    this.puS = new com.tencent.mm.sdk.b.c() {};
    this.puT = new com.tencent.mm.sdk.b.c() {};
    this.puU = new com.tencent.mm.sdk.b.c() {};
    this.puV = new com.tencent.mm.sdk.b.c() {};
    this.puW = new com.tencent.mm.sdk.b.c() {};
    this.puX = new com.tencent.mm.sdk.b.c()
    {
      private static boolean bjt()
      {
        GMTrace.i(20842536763392L, 155289);
        com.tencent.mm.plugin.sns.lucky.a.g.bhW();
        w.a locala = w.a.vtx;
        com.tencent.mm.plugin.sns.g.i locali = new com.tencent.mm.plugin.sns.g.i();
        try
        {
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xy().xh().a(locala, new String(locali.toByteArray(), Charset.forName("ISO-8859-1")));
          GMTrace.o(20842536763392L, 155289);
          return false;
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            w.w("MicroMsg.RedDotUtil", "mardRedotList save exception:" + localIOException.getLocalizedMessage());
          }
        }
      }
    };
    this.puY = new com.tencent.mm.sdk.b.c() {};
    this.puZ = new com.tencent.mm.sdk.b.c() {};
    this.pva = false;
    this.nqi = new com.tencent.mm.sdk.b.c() {};
    this.pvb = new com.tencent.mm.sdk.b.c() {};
    this.pvc = new com.tencent.mm.sdk.b.c() {};
    w.i("MicroMsg.SnsCore", "snscore create! " + Thread.currentThread().getId());
    bjp();
    if (this.ptL == null) {
      com.tencent.mm.sdk.f.e.d(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16636421603328L, 123951);
          Looper.prepare();
          ae.this.ptL = new com.tencent.mm.sdk.platformtools.ae();
          Looper.loop();
          GMTrace.o(16636421603328L, 123951);
        }
      }, "SnsCore_fileTask_handler", 1).start();
    }
    if (this.ptM == null) {
      com.tencent.mm.sdk.f.e.d(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20843476287488L, 155296);
          Looper.prepare();
          ae.this.ptM = new com.tencent.mm.sdk.platformtools.ae();
          Looper.loop();
          GMTrace.o(20843476287488L, 155296);
        }
      }, "SnsCore_task_handler", 10).start();
    }
    com.tencent.mm.kiss.a.b.xK().a("R.layout.sns_timeline_item_photo_one3", i.g.pgy, new int[] { i.f.oZn, 0 });
    com.tencent.mm.kiss.a.b.xK().a("R.layout.sns_timeline_imagesline_one", i.g.pgy, new int[] { i.f.paR, i.g.pgx, i.f.oZn, 0 });
    com.tencent.mm.kiss.a.b.xK().a("R.layout.sns_timeline_imagesline1", i.g.pgy, new int[] { i.f.paR, i.g.pgu, i.f.oZn, 0 });
    com.tencent.mm.kiss.a.b.xK().a("R.layout.sns_timeline_imagesline2", i.g.pgy, new int[] { i.f.paR, i.g.pgv, i.f.oZn, 0 });
    com.tencent.mm.kiss.a.b.xK().a("R.layout.sns_timeline_imagesline3", i.g.pgy, new int[] { i.f.paR, i.g.pgw, i.f.oZn, 0 });
    com.tencent.mm.kiss.a.b.xK().a("R.layout.sns_media_sub_item2", i.g.pgy, new int[] { i.f.paR, i.g.pfT, i.f.oZn, 0 });
    com.tencent.mm.kiss.a.b.xK().a("R.layout.sns_media_sight_item", i.g.pgy, new int[] { i.f.paR, i.g.pdk, i.f.oZn, 0 });
    com.tencent.mm.kiss.a.b.xK().a("R.layout.sns_hb_reward_item", i.g.pgy, new int[] { i.f.paR, i.g.pfJ, i.f.oZn, 0 });
    GMTrace.o(8051989938176L, 59992);
  }
  
  public static com.tencent.mm.sdk.platformtools.ae aCY()
  {
    GMTrace.i(8052392591360L, 59995);
    if (ptI > 0) {
      ptI = 0;
    }
    Object localObject = biL().ptK;
    int i = ptI;
    ptI = i + 1;
    localObject = localObject[i];
    GMTrace.o(8052392591360L, 59995);
    return (com.tencent.mm.sdk.platformtools.ae)localObject;
  }
  
  public static com.tencent.mm.sdk.platformtools.ae aDa()
  {
    GMTrace.i(8052795244544L, 59998);
    com.tencent.mm.sdk.platformtools.ae localae = biL().handler;
    GMTrace.o(8052795244544L, 59998);
    return localae;
  }
  
  private static Point aON()
  {
    GMTrace.i(8055882252288L, 60021);
    Object localObject = (WindowManager)ab.getContext().getSystemService("window");
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)localObject).getDefaultDisplay().getMetrics(localDisplayMetrics);
    puw.x = localDisplayMetrics.widthPixels;
    puw.y = localDisplayMetrics.heightPixels;
    localObject = puw;
    GMTrace.o(8055882252288L, 60021);
    return (Point)localObject;
  }
  
  public static String biJ()
  {
    GMTrace.i(8051318849536L, 59987);
    com.tencent.mm.kernel.h.xz();
    String str = (String)com.tencent.mm.kernel.h.xy().xh().get(2, null);
    GMTrace.o(8051318849536L, 59987);
    return str;
  }
  
  public static int biK()
  {
    GMTrace.i(8051453067264L, 59988);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xw();
    int i = com.tencent.mm.kernel.a.ww();
    GMTrace.o(8051453067264L, 59988);
    return i;
  }
  
  private static ae biL()
  {
    GMTrace.i(8051721502720L, 59990);
    ae localae1 = (ae)com.tencent.mm.y.p.o(ae.class);
    if (!localae1.puk) {}
    for (;;)
    {
      Object localObject3;
      Object localObject2;
      synchronized (localae1.pul)
      {
        if (!localae1.puk)
        {
          w.i("MicroMsg.SnsCore", "onAccInit because bug!");
          localae1.aX(true);
        }
        if (!localae1.laE) {
          break label1579;
        }
        synchronized (localae1.gCf)
        {
          w.i("MicroMsg.SnsCore", "getCore need reset DB now " + Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " " + localae1.hashCode());
          if (!localae1.laE) {
            break label1576;
          }
          localae1.pui = false;
          localObject3 = localae1.puj;
          localObject2 = pun;
          if (((com.tencent.mm.plugin.sns.storage.v)localObject3).pMZ)
          {
            w.i("MicroMsg.TrimSnsDb", "pass hasTrim");
            if (localae1.fYV != null) {
              break;
            }
            localae1.fYV = new com.tencent.mm.bu.g();
            com.tencent.mm.kernel.h.xz();
            localObject2 = com.tencent.mm.kernel.h.xy().cachePath;
            localObject2 = (String)localObject2 + "SnsMicroMsg.db";
            if (localae1.fYV.b((String)localObject2, pun, true, true)) {
              break;
            }
            throw new SQLiteException("sns db init failed");
          }
        }
      }
      com.tencent.mm.kernel.h.xz();
      if (com.tencent.mm.kernel.h.xw().wL())
      {
        int i = bg.getInt(com.tencent.mm.k.g.ut().getValue("AndroidCleanSnsDb"), 0);
        w.i("MicroMsg.TrimSnsDb", "pass dynamic? " + i);
        if (i <= 0)
        {
          com.tencent.mm.kernel.h.xz();
          String str = com.tencent.mm.kernel.h.xy().cachePath;
          if (FileOp.aZ(str + "SnsMicroMsg2.db.ini"))
          {
            com.tencent.mm.plugin.sns.storage.v.IQ(str);
            FileOp.deleteFile(str + "SnsMicroMsg2.db.ini");
          }
          Object localObject4 = ab.getContext().getSharedPreferences(ab.bPU(), 0);
          if (bg.aG(((SharedPreferences)localObject4).getLong("check_trim_time", 0L)) < 604800L)
          {
            w.i("MicroMsg.TrimSnsDb", "trim sns pass because time short");
          }
          else
          {
            ((SharedPreferences)localObject4).edit().putLong("check_trim_time", bg.Pu()).commit();
            ((com.tencent.mm.plugin.sns.storage.v)localObject3).pMZ = true;
            long l1 = System.currentTimeMillis();
            i = com.tencent.mm.o.a.vp();
            if ((i == 1) || (i == 2))
            {
              w.i("MicroMsg.TrimSnsDb", "trim sns error space dangerous");
            }
            else if (FileOp.aZ(str + "sns_mark.ini"))
            {
              if (bg.aH(FileOp.kY(str + "sns_mark.ini")) < 2592000000L)
              {
                w.i("MicroMsg.TrimSnsDb", "mark file exist and return");
                com.tencent.mm.plugin.sns.storage.v.IQ(str);
              }
              else
              {
                FileOp.deleteFile(str + "sns_mark.ini");
              }
            }
            else
            {
              long l2 = FileOp.kX(str + "SnsMicroMsg.db");
              w.i("MicroMsg.TrimSnsDb", "trim sns " + l2);
              if (l2 < 52428800L)
              {
                w.i("MicroMsg.TrimSnsDb", "trim sns free pass: " + (System.currentTimeMillis() - l1));
              }
              else
              {
                FileOp.lb(str + "sns_mark.ini");
                localObject4 = str + "SnsMicroMsg2.db";
                localObject3 = new com.tencent.mm.bu.g();
                if (!((com.tencent.mm.bu.g)localObject3).b((String)localObject4, null, true, false)) {
                  throw new com.tencent.mm.y.b((byte)0);
                }
                localObject4 = new com.tencent.mm.bu.g();
                if (!((com.tencent.mm.bu.g)localObject4).b(str + "SnsMicroMsg.db", (HashMap)localObject2, true, true)) {
                  throw new com.tencent.mm.y.b((byte)0);
                }
                l2 = System.currentTimeMillis();
                if (!com.tencent.mm.plugin.sns.storage.v.a((com.tencent.mm.bu.g)localObject4, (com.tencent.mm.bu.g)localObject3)) {}
                for (i = -1;; i = 1)
                {
                  long l3 = System.currentTimeMillis() - l2;
                  w.i("MicroMsg.TrimSnsDb", "copysns insert all %d passed ret:" + i, new Object[] { Long.valueOf(l3) });
                  ((com.tencent.mm.bu.g)localObject4).yE();
                  ((com.tencent.mm.bu.g)localObject3).yE();
                  if (i >= 0)
                  {
                    com.tencent.mm.kernel.h.xz();
                    localObject2 = com.tencent.mm.kernel.h.xy().cachePath;
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db");
                    bool = FileOp.g((String)localObject2, "SnsMicroMsg2.db", "SnsMicroMsg.db");
                    w.i("MicroMsg.TrimSnsDb", "rename file " + bool);
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db-shm");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db-wal");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg.db.ini");
                    FileOp.o("SnsMicroMsg2.db.ini", "SnsMicroMsg.db.ini");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg2.db.ini");
                    FileOp.deleteFile((String)localObject2 + "SnsMicroMsg2.db");
                    FileOp.deleteFile((String)localObject2 + "sns_mark.ini");
                  }
                  l2 = System.currentTimeMillis() - l2;
                  w.i("MicroMsg.TrimSnsDb", "copysns data ret=%d all: %d copytime %d ", new Object[] { Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l2 - l3) });
                  w.i("MicroMsg.TrimSnsDb", "trim sns done pass: " + (System.currentTimeMillis() - l1));
                  break;
                  l3 = System.currentTimeMillis();
                  com.tencent.mm.plugin.sns.storage.v.a((com.tencent.mm.bu.g)localObject4, (com.tencent.mm.bu.g)localObject3, "snsExtInfo3");
                  boolean bool = ((com.tencent.mm.bu.g)localObject3).eZ("", "insert into " + "snsExtInfo3" + " select * from old." + "snsExtInfo3");
                  w.i("MicroMsg.TrimSnsDb", "copysns ret_ext:" + bool + " passed " + (System.currentTimeMillis() - l3));
                  com.tencent.mm.plugin.sns.storage.v.a((com.tencent.mm.bu.g)localObject4, (com.tencent.mm.bu.g)localObject3, "SnsComment");
                  bool = ((com.tencent.mm.bu.g)localObject3).eZ("", "insert into " + "SnsComment" + " select * from old." + "SnsComment");
                  w.i("MicroMsg.TrimSnsDb", "copysns ret_msg:" + bool + " passed " + (System.currentTimeMillis() - l3));
                  com.tencent.mm.plugin.sns.storage.v.a((com.tencent.mm.bu.g)localObject4, (com.tencent.mm.bu.g)localObject3, "SnsInfo");
                  bool = ((com.tencent.mm.bu.g)localObject3).eZ("", "insert into " + "SnsInfo" + " select * from old." + "SnsInfo" + " where  (sourceType & 2 != 0 ) " + com.tencent.mm.plugin.sns.storage.n.pMu + " limit 200");
                  w.i("MicroMsg.TrimSnsDb", "copysns ret_sns:" + bool + " passed " + (System.currentTimeMillis() - l3));
                  bool = ((com.tencent.mm.bu.g)localObject3).eZ("", "update snsExtinfo3 set md5 = '', faults = '';");
                  w.i("MicroMsg.TrimSnsDb", "update ext info  passed  %s  updateRet %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l3), Boolean.valueOf(bool) });
                  ((com.tencent.mm.bu.g)localObject3).eZ("", "DETACH DATABASE old");
                }
              }
            }
          }
        }
      }
    }
    localae2.laE = false;
    w.i("MicroMsg.SnsCore", "resetdb done");
    label1576:
    label1579:
    GMTrace.o(8051721502720L, 59990);
    return localae2;
  }
  
  public static boolean biM()
  {
    GMTrace.i(8051855720448L, 59991);
    biL();
    if (!com.tencent.mm.kernel.h.xw().wL())
    {
      GMTrace.o(8051855720448L, 59991);
      return true;
    }
    GMTrace.o(8051855720448L, 59991);
    return false;
  }
  
  public static com.tencent.mm.sdk.platformtools.ae biN()
  {
    GMTrace.i(8052124155904L, 59993);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.sdk.platformtools.ae localae = com.tencent.mm.kernel.h.xB().bQi();
    GMTrace.o(8052124155904L, 59993);
    return localae;
  }
  
  public static com.tencent.mm.sdk.platformtools.ae biO()
  {
    GMTrace.i(8052258373632L, 59994);
    if ((ptH >= com.tencent.mm.storage.v.vpz) || (ptH >= 3)) {
      ptH = 0;
    }
    Object localObject = biL().ptJ;
    int i = ptH;
    ptH = i + 1;
    localObject = localObject[i];
    GMTrace.o(8052258373632L, 59994);
    return (com.tencent.mm.sdk.platformtools.ae)localObject;
  }
  
  protected static com.tencent.mm.sdk.platformtools.ae biP()
  {
    GMTrace.i(8052526809088L, 59996);
    com.tencent.mm.sdk.platformtools.ae localae = biL().ptL;
    GMTrace.o(8052526809088L, 59996);
    return localae;
  }
  
  public static com.tencent.mm.sdk.platformtools.ae biQ()
  {
    GMTrace.i(8052661026816L, 59997);
    com.tencent.mm.sdk.platformtools.ae localae = biL().ptM;
    GMTrace.o(8052661026816L, 59997);
    return localae;
  }
  
  public static ar biR()
  {
    GMTrace.i(8053197897728L, 60001);
    com.tencent.mm.kernel.h.xz();
    ar localar = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK();
    GMTrace.o(8053197897728L, 60001);
    return localar;
  }
  
  public static r biS()
  {
    GMTrace.i(8053332115456L, 60002);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptP == null) {
      biL().ptP = new r(biL().fYV);
    }
    r localr = biL().ptP;
    GMTrace.o(8053332115456L, 60002);
    return localr;
  }
  
  public static al.a biT()
  {
    GMTrace.i(8053466333184L, 60003);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptZ == null)
    {
      biL().ptZ = new al.a();
      com.tencent.mm.plugin.sns.b.n.poT = biL().ptZ;
    }
    al.a locala = biL().ptZ;
    GMTrace.o(8053466333184L, 60003);
    return locala;
  }
  
  public static com.tencent.mm.plugin.sns.f.c biU()
  {
    GMTrace.i(8053600550912L, 60004);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().pud == null) {
      biL().pud = new com.tencent.mm.plugin.sns.f.c();
    }
    com.tencent.mm.plugin.sns.f.c localc = biL().pud;
    GMTrace.o(8053600550912L, 60004);
    return localc;
  }
  
  public static com.tencent.mm.plugin.sns.f.g biV()
  {
    GMTrace.i(8053734768640L, 60005);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().pue == null) {
      biL().pue = new com.tencent.mm.plugin.sns.f.g();
    }
    com.tencent.mm.plugin.sns.f.g localg = biL().pue;
    GMTrace.o(8053734768640L, 60005);
    return localg;
  }
  
  public static com.tencent.mm.plugin.sns.storage.p biW()
  {
    GMTrace.i(8053868986368L, 60006);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().puf == null) {
      biL().puf = new com.tencent.mm.plugin.sns.storage.p(biL().fYV);
    }
    com.tencent.mm.plugin.sns.storage.p localp = biL().puf;
    GMTrace.o(8053868986368L, 60006);
    return localp;
  }
  
  public static com.tencent.mm.plugin.sns.a.b.i biX()
  {
    GMTrace.i(8054003204096L, 60007);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().pug == null) {
      biL().pug = new com.tencent.mm.plugin.sns.a.b.i();
    }
    com.tencent.mm.plugin.sns.a.b.i locali = biL().pug;
    GMTrace.o(8054003204096L, 60007);
    return locali;
  }
  
  public static b biY()
  {
    GMTrace.i(8054137421824L, 60008);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().pua == null) {
      biL().pua = new b();
    }
    b localb = biL().pua;
    GMTrace.o(8054137421824L, 60008);
    return localb;
  }
  
  public static av biZ()
  {
    GMTrace.i(8054271639552L, 60009);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().pub == null)
    {
      biL().pub = new av();
      com.tencent.mm.plugin.sns.b.n.poN = biL().pub;
    }
    av localav = biL().pub;
    GMTrace.o(8054271639552L, 60009);
    return localav;
  }
  
  public static g bja()
  {
    GMTrace.i(8054405857280L, 60010);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptU == null)
    {
      biL().ptU = new g();
      com.tencent.mm.plugin.sns.b.n.poO = biL().ptU;
    }
    g localg = biL().ptU;
    GMTrace.o(8054405857280L, 60010);
    return localg;
  }
  
  public static aq bjb()
  {
    GMTrace.i(8054540075008L, 60011);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().puq == null) {
      biL().puq = new aq();
    }
    aq localaq = biL().puq;
    GMTrace.o(8054540075008L, 60011);
    return localaq;
  }
  
  public static ac bjc()
  {
    GMTrace.i(8054674292736L, 60012);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptY == null)
    {
      localObject = biL();
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.h.xz();
      ((ae)localObject).ptY = new ac(com.tencent.mm.kernel.h.xy().cachePath + "snsAsyncQueue.data");
    }
    Object localObject = biL().ptY;
    GMTrace.o(8054674292736L, 60012);
    return (ac)localObject;
  }
  
  public static com.tencent.mm.plugin.sns.storage.n bjd()
  {
    GMTrace.i(8054808510464L, 60013);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptQ == null)
    {
      biL().ptQ = new com.tencent.mm.plugin.sns.storage.n(biL().fYV);
      com.tencent.mm.plugin.sns.b.n.poU = biL().ptQ;
    }
    com.tencent.mm.plugin.sns.storage.n localn = biL().ptQ;
    GMTrace.o(8054808510464L, 60013);
    return localn;
  }
  
  public static com.tencent.mm.plugin.sns.storage.d bje()
  {
    GMTrace.i(16637092691968L, 123956);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptS == null) {
      biL().ptS = new com.tencent.mm.plugin.sns.storage.d(biL().fYV);
    }
    com.tencent.mm.plugin.sns.storage.d locald = biL().ptS;
    GMTrace.o(16637092691968L, 123956);
    return locald;
  }
  
  public static x bjf()
  {
    GMTrace.i(20842670981120L, 155290);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptT == null) {
      biL().ptT = new x(biL().fYV);
    }
    x localx = biL().ptT;
    GMTrace.o(20842670981120L, 155290);
    return localx;
  }
  
  public static com.tencent.mm.plugin.sns.storage.f bjg()
  {
    GMTrace.i(8054942728192L, 60014);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptR == null) {
      biL().ptR = new com.tencent.mm.plugin.sns.storage.f(biL().fYV);
    }
    com.tencent.mm.plugin.sns.storage.f localf = biL().ptR;
    GMTrace.o(8054942728192L, 60014);
    return localf;
  }
  
  public static com.tencent.mm.plugin.sns.storage.l bjh()
  {
    GMTrace.i(8055076945920L, 60015);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptV == null)
    {
      biL().ptV = new com.tencent.mm.plugin.sns.storage.l(biL().fYV, new ag());
      com.tencent.mm.plugin.sns.b.n.poP = biL().ptV;
    }
    com.tencent.mm.plugin.sns.storage.l locall = biL().ptV;
    GMTrace.o(8055076945920L, 60015);
    return locall;
  }
  
  public static com.tencent.mm.plugin.sns.storage.j bji()
  {
    GMTrace.i(8055211163648L, 60016);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptW == null)
    {
      biL().ptW = new com.tencent.mm.plugin.sns.storage.j(biL().fYV);
      com.tencent.mm.plugin.sns.b.n.poQ = biL().ptW;
    }
    com.tencent.mm.plugin.sns.storage.j localj = biL().ptW;
    GMTrace.o(8055211163648L, 60016);
    return localj;
  }
  
  public static com.tencent.mm.plugin.sns.storage.t bjj()
  {
    GMTrace.i(8055345381376L, 60017);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().ptX == null)
    {
      biL().ptX = new com.tencent.mm.plugin.sns.storage.t(biL().fYV);
      com.tencent.mm.plugin.sns.b.n.poR = biL().ptX;
    }
    com.tencent.mm.plugin.sns.storage.t localt = biL().ptX;
    GMTrace.o(8055345381376L, 60017);
    return localt;
  }
  
  public static aj bjk()
  {
    GMTrace.i(8055479599104L, 60018);
    com.tencent.mm.kernel.h.xw().wG();
    if (biL().puc == null) {
      biL().puc = new aj();
    }
    aj localaj = biL().puc;
    GMTrace.o(8055479599104L, 60018);
    return localaj;
  }
  
  public static int bjl()
  {
    GMTrace.i(8055613816832L, 60019);
    if (aON().y < aON().x) {}
    for (int i = aON().y;; i = aON().x - com.tencent.mm.br.a.fromDPToPix(ab.getContext(), puv))
    {
      i /= 3;
      ptN = i;
      if (i > 10) {
        break;
      }
      w.e("MicroMsg.SnsCore", "can not get multiThumbDisplaySize or the multiThumbDisplaySize < 10");
      GMTrace.o(8055613816832L, 60019);
      return 150;
    }
    i = ptN;
    GMTrace.o(8055613816832L, 60019);
    return i;
  }
  
  public static int bjm()
  {
    GMTrace.i(8055748034560L, 60020);
    if (ptO <= 0) {
      if (aON().x > 720) {
        break label60;
      }
    }
    label60:
    for (ptO = 200;; ptO = 100)
    {
      ptO = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), ptO);
      int i = ptO;
      GMTrace.o(8055748034560L, 60020);
      return i;
    }
  }
  
  public static boolean bjn()
  {
    GMTrace.i(8056016470016L, 60022);
    SharedPreferences localSharedPreferences = al.ba(ab.getContext(), "sp_sns_dynswitch_stg");
    boolean bool;
    if (localSharedPreferences.contains("st_sw_use_vcodec_img"))
    {
      bool = localSharedPreferences.getBoolean("st_sw_use_vcodec_img", false);
      w.w("MicroMsg.SnsCore", "isUseVCodecImg: %b (set statically outside)", new Object[] { Boolean.valueOf(bool) });
    }
    for (;;)
    {
      GMTrace.o(8056016470016L, 60022);
      return bool;
      bool = localSharedPreferences.getBoolean("sw_use_vcodec_img", false);
      w.d("MicroMsg.SnsCore", "isUseVCodecImg: %b", new Object[] { Boolean.valueOf(bool) });
    }
  }
  
  public static boolean bjo()
  {
    GMTrace.i(8056150687744L, 60023);
    SharedPreferences localSharedPreferences = al.ba(ab.getContext(), "sp_sns_dynswitch_stg");
    boolean bool;
    if (localSharedPreferences.contains("st_sw_use_wxpc_img"))
    {
      bool = localSharedPreferences.getBoolean("st_sw_use_wxpc_img", false);
      w.w("MicroMsg.SnsCore", "isUseWxpcImg: %b (set statically outside)", new Object[] { Boolean.valueOf(bool) });
    }
    for (;;)
    {
      GMTrace.o(8056150687744L, 60023);
      return bool;
      bool = localSharedPreferences.getBoolean("sw_use_wxpc_img", false);
      w.d("MicroMsg.SnsCore", "isUseWxpcImg: %b", new Object[] { Boolean.valueOf(bool) });
    }
  }
  
  private void bjp()
  {
    GMTrace.i(8056284905472L, 60024);
    final int i = 0;
    while (i < 3)
    {
      if (this.ptJ[i] == null) {
        com.tencent.mm.sdk.f.e.d(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8047426535424L, 59958);
            Looper.prepare();
            ae.this.ptJ[i] = new com.tencent.mm.sdk.platformtools.ae();
            Looper.loop();
            GMTrace.o(8047426535424L, 59958);
          }
        }, "SnsCore_CDNDownload_handler", 1).start();
      }
      i += 1;
    }
    i = 0;
    while (i <= 0)
    {
      if (this.ptK[0] == null) {
        com.tencent.mm.sdk.f.e.d(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8070109331456L, 60127);
            Looper.prepare();
            ae.this.ptK[this.val$id] = new com.tencent.mm.sdk.platformtools.ae();
            Looper.loop();
            GMTrace.o(8070109331456L, 60127);
          }
        }, "SnsCore_thumbDecode_handler", 1).start();
      }
      i += 1;
    }
    GMTrace.o(8056284905472L, 60024);
  }
  
  public static void bjq()
  {
    GMTrace.i(16041031761920L, 119515);
    w.i("MicroMsg.SnsCore", "dumptable");
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject = bjd();
    long l = System.currentTimeMillis();
    localObject = ((com.tencent.mm.plugin.sns.storage.n)localObject).fTZ.a("select count(*) from SnsInfo", null, 2);
    if (((Cursor)localObject).moveToFirst()) {}
    for (int i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      w.i("MicroMsg.SnsInfoStorage", "sns table count %d passed %d", new Object[] { Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - l) });
      localObject = biS();
      l = System.currentTimeMillis();
      localObject = ((r)localObject).goN.a("select count(*) from SnsMedia", null, 2);
      if (((Cursor)localObject).moveToFirst()) {}
      for (int j = ((Cursor)localObject).getInt(0);; j = 0)
      {
        ((Cursor)localObject).close();
        w.i("MicroMsg.snsMediaStorage", "media table count %d passed %d", new Object[] { Integer.valueOf(j), Long.valueOf(System.currentTimeMillis() - l) });
        localObject = bjh();
        l = System.currentTimeMillis();
        localObject = ((com.tencent.mm.plugin.sns.storage.l)localObject).fTZ.a("select count(*) from snsExtInfo3", null, 2);
        if (((Cursor)localObject).moveToFirst()) {}
        for (int k = ((Cursor)localObject).getInt(0);; k = 0)
        {
          ((Cursor)localObject).close();
          w.i("MicroMsg.SnsExtStorage", "ext table count %d passed %d", new Object[] { Integer.valueOf(k), Long.valueOf(System.currentTimeMillis() - l) });
          localStringBuffer.append(" snscount " + i);
          localStringBuffer.append(" mediacount " + j);
          localStringBuffer.append(" extcount " + k);
          w.i("MicroMsg.SnsCore", "dump table " + localStringBuffer.toString());
          GMTrace.o(16041031761920L, 119515);
          return;
        }
      }
    }
  }
  
  private static void bjr()
  {
    GMTrace.i(14556449472512L, 108454);
    FileOp.la(((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath());
    FileOp.la(((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath());
    GMTrace.o(14556449472512L, 108454);
  }
  
  public static String bjs()
  {
    GMTrace.i(8057358647296L, 60032);
    if (bg.nm(pum))
    {
      localObject = com.tencent.mm.sdk.platformtools.av.bQz().iterator();
      while (((Iterator)localObject).hasNext())
      {
        av.a locala = (av.a)((Iterator)localObject).next();
        if (com.tencent.mm.compatible.util.e.ghx.equals(locala.vkG)) {
          pum = locala.vkH;
        }
      }
      w.i("MicroMsg.SnsCore", "get filesys " + pum);
    }
    Object localObject = bg.aq(pum, "");
    GMTrace.o(8057358647296L, 60032);
    return (String)localObject;
  }
  
  public static String getAccSnsPath()
  {
    GMTrace.i(8052929462272L, 59999);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsPath();
    GMTrace.o(8052929462272L, 59999);
    return str;
  }
  
  public static String getAccSnsTmpPath()
  {
    GMTrace.i(8053063680000L, 60000);
    String str = ((com.tencent.mm.plugin.sns.b.b)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.sns.b.b.class)).getAccSnsTmpPath();
    GMTrace.o(8053063680000L, 60000);
    return str;
  }
  
  public static com.tencent.mm.bu.g yH()
  {
    GMTrace.i(8051587284992L, 59989);
    com.tencent.mm.bu.g localg = biL().fYV;
    GMTrace.o(8051587284992L, 59989);
    return localg;
  }
  
  public static String zo()
  {
    GMTrace.i(8051184631808L, 59986);
    com.tencent.mm.kernel.h.xw().wG();
    com.tencent.mm.kernel.h.xz();
    String str = com.tencent.mm.kernel.h.xy().fYU;
    GMTrace.o(8051184631808L, 59986);
    return str;
  }
  
  public final void a(com.tencent.mm.y.ao paramao)
  {
    GMTrace.i(8057090211840L, 60030);
    t.a(paramao);
    GMTrace.o(8057090211840L, 60030);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(8056821776384L, 60028);
    w.i("MicroMsg.SnsCore", "onAccountPostReset " + Thread.currentThread().getId() + " isAccInit: " + this.puk);
    if (this.puk)
    {
      GMTrace.o(8056821776384L, 60028);
      return;
    }
    this.puk = true;
    this.laE = true;
    FileOp.la(zo() + "sfs");
    this.gtp = getAccSnsPath();
    Object localObject1 = this.gtp;
    Object localObject2 = new SFSContext.Builder();
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject2 = ((SFSContext.Builder)localObject2).setDBDirectory(com.tencent.mm.kernel.h.xy().cachePath + "sfs").setStoragePath(com.tencent.mm.plugin.n.b.zk()).setName("sns");
    FileOp.a((String)localObject1, new String[] { "sight_*", "sns_tmp*", "sightad_*", "sns_tmpsad_*" }, (SFSContext.Builder)localObject2);
    bjr();
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("NewYearSNSCtrl2016", this.pur, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("NewYearSNSTips2016", this.pus, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("NewYearSNSAmountLevelCtrl2016", this.put, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().a("SnsAd", this.puu, true);
    com.tencent.mm.plugin.sns.b.n.poN = biZ();
    com.tencent.mm.plugin.sns.b.n.poO = bja();
    com.tencent.mm.plugin.sns.b.n.poP = bjh();
    com.tencent.mm.plugin.sns.b.n.poQ = bji();
    com.tencent.mm.plugin.sns.b.n.poR = bjj();
    com.tencent.mm.plugin.sns.b.n.poT = biT();
    com.tencent.mm.plugin.sns.b.n.poS = this;
    com.tencent.mm.plugin.sns.b.n.poU = bjd();
    com.tencent.mm.sdk.b.a.vgX.b(this.puY);
    com.tencent.mm.sdk.b.a.vgX.b(this.puZ);
    com.tencent.mm.sdk.b.a.vgX.b(this.puM);
    com.tencent.mm.sdk.b.a.vgX.b(this.puK);
    com.tencent.mm.sdk.b.a.vgX.b(this.puL);
    com.tencent.mm.sdk.b.a.vgX.b(this.puN);
    com.tencent.mm.sdk.b.a.vgX.b(this.puO);
    com.tencent.mm.sdk.b.a.vgX.b(this.puP);
    com.tencent.mm.sdk.b.a.vgX.b(this.puQ);
    com.tencent.mm.sdk.b.a.vgX.b(this.puR);
    com.tencent.mm.sdk.b.a.vgX.b(this.puS);
    com.tencent.mm.sdk.b.a.vgX.b(this.puT);
    com.tencent.mm.sdk.b.a.vgX.b(this.puU);
    com.tencent.mm.sdk.b.a.vgX.b(this.pvc);
    this.pux = new com.tencent.mm.plugin.sns.n();
    this.puy = new k();
    this.puz = new com.tencent.mm.plugin.sns.e();
    this.puA = new com.tencent.mm.plugin.sns.p();
    this.puB = new com.tencent.mm.plugin.sns.h();
    this.puC = new com.tencent.mm.plugin.sns.g();
    this.puD = new com.tencent.mm.plugin.sns.m();
    this.puE = new com.tencent.mm.plugin.sns.j();
    this.puF = new com.tencent.mm.plugin.sns.b();
    this.puG = new com.tencent.mm.plugin.sns.c();
    this.puH = new com.tencent.mm.plugin.sns.f();
    com.tencent.mm.sdk.b.a.vgX.b(this.puX);
    com.tencent.mm.sdk.b.a.vgX.b(this.puW);
    com.tencent.mm.sdk.b.a.vgX.b(this.puA);
    com.tencent.mm.sdk.b.a.vgX.b(this.pux);
    com.tencent.mm.sdk.b.a.vgX.b(this.puy);
    com.tencent.mm.sdk.b.a.vgX.b(this.puz);
    com.tencent.mm.sdk.b.a.vgX.b(this.puB);
    com.tencent.mm.sdk.b.a.vgX.b(this.puC);
    com.tencent.mm.sdk.b.a.vgX.b(this.puD);
    com.tencent.mm.sdk.b.a.vgX.b(this.puE);
    com.tencent.mm.sdk.b.a.vgX.b(this.puF);
    com.tencent.mm.sdk.b.a.vgX.b(this.puG);
    com.tencent.mm.sdk.b.a.vgX.b(this.puH);
    com.tencent.mm.sdk.b.a.vgX.b(this.nqi);
    this.puo = new com.tencent.mm.plugin.sns.d();
    com.tencent.mm.sdk.b.a.vgX.b(this.puo);
    com.tencent.mm.sdk.b.a.vgX.b(this.pvb);
    com.tencent.mm.sdk.b.a.vgX.b(this.puI);
    com.tencent.mm.sdk.b.a.vgX.b(this.puJ);
    com.tencent.mm.sdk.b.a.vgX.b(this.puV);
    localObject1 = biX();
    com.tencent.mm.plugin.sns.a.b.i.pnN = com.tencent.mm.k.g.ut().getInt("MMUxAdLog2GSendSize", 20480);
    com.tencent.mm.plugin.sns.a.b.i.pnO = com.tencent.mm.k.g.ut().getInt("MMUxAdLog3GSendSize", 30720);
    com.tencent.mm.plugin.sns.a.b.i.pnP = com.tencent.mm.k.g.ut().getInt("MMUxAdLogWifiSendSize", 51200);
    com.tencent.mm.plugin.sns.a.b.i.pnQ = com.tencent.mm.k.g.ut().getInt("MMUxAdLogMinRandTime", 60);
    com.tencent.mm.plugin.sns.a.b.i.pnR = com.tencent.mm.k.g.ut().getInt("MMUxAdLogMaxRandTime", 1800);
    com.tencent.mm.plugin.sns.a.b.i.pnS = com.tencent.mm.k.g.ut().getInt("MMUxAdLogMaxExceptionTime", 43200);
    w.i("MicroMsg.SnsLogMgr", "init " + com.tencent.mm.plugin.sns.a.b.i.pnN + ";" + com.tencent.mm.plugin.sns.a.b.i.pnO + ";" + com.tencent.mm.plugin.sns.a.b.i.pnP + ";" + com.tencent.mm.plugin.sns.a.b.i.pnQ + ";" + com.tencent.mm.plugin.sns.a.b.i.pnR + ";" + com.tencent.mm.plugin.sns.a.b.i.pnS);
    if (com.tencent.mm.plugin.sns.a.b.i.pnR - com.tencent.mm.plugin.sns.a.b.i.pnQ < 0) {
      com.tencent.mm.plugin.sns.a.b.i.pnR = com.tencent.mm.plugin.sns.a.b.i.pnQ;
    }
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(1802, (com.tencent.mm.ad.e)localObject1);
    localObject1 = biZ();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(207, (com.tencent.mm.ad.e)localObject1);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(209, (com.tencent.mm.ad.e)localObject1);
    localObject1 = this.puh;
    com.tencent.mm.sdk.b.a.vgX.b(((an)localObject1).pvJ);
    com.tencent.mm.sdk.b.a.vgX.b(((an)localObject1).pvK);
    com.tencent.mm.sdk.b.a.vgX.b(((an)localObject1).pvL);
    this.pup = new com.tencent.mm.plugin.sns.e.a();
    ao.init();
    localObject1 = com.tencent.mm.modelsns.c.gVM;
    com.tencent.mm.modelsns.c.LS();
    if (com.tencent.mm.memory.l.yo())
    {
      localObject1 = com.tencent.mm.memory.c.ghE;
      localObject2 = com.tencent.mm.memory.c.ghE;
      localObject2.getClass();
      ((com.tencent.mm.memory.c)localObject1).a(new e.a((com.tencent.mm.memory.c)localObject2)
      {
        final int pve;
        
        public final long yj()
        {
          GMTrace.i(8075746476032L, 60169);
          GMTrace.o(8075746476032L, 60169);
          return 10485760L;
        }
        
        public final int yk()
        {
          GMTrace.i(8075880693760L, 60170);
          GMTrace.o(8075880693760L, 60170);
          return -1;
        }
      });
    }
    localObject1 = o.gib;
    localObject2 = o.gib;
    localObject2.getClass();
    ((o)localObject1).a(new e.a((o)localObject2)
    {
      public final long yj()
      {
        GMTrace.i(16640179699712L, 123979);
        GMTrace.o(16640179699712L, 123979);
        return -1L;
      }
      
      public final int yk()
      {
        GMTrace.i(16640313917440L, 123980);
        GMTrace.o(16640313917440L, 123980);
        return 3;
      }
    });
    localObject1 = com.tencent.mm.memory.g.ghL;
    localObject2 = com.tencent.mm.memory.g.ghL;
    localObject2.getClass();
    ((com.tencent.mm.memory.g)localObject1).a(new e.a((com.tencent.mm.memory.g)localObject2)
    {
      public final long yj()
      {
        GMTrace.i(20844013158400L, 155300);
        GMTrace.o(20844013158400L, 155300);
        return 0L;
      }
      
      public final int yk()
      {
        GMTrace.i(20844147376128L, 155301);
        GMTrace.o(20844147376128L, 155301);
        return 5;
      }
    });
    bjb();
    GMTrace.o(8056821776384L, 60028);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(8056955994112L, 60029);
    FileOp.la(zo() + "sfs");
    if (this.gtp != null)
    {
      FileOp.kR(this.gtp);
      this.gtp = getAccSnsPath();
      String str = this.gtp;
      SFSContext.Builder localBuilder = new SFSContext.Builder();
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.h.xz();
      localBuilder = localBuilder.setDBDirectory(com.tencent.mm.kernel.h.xy().cachePath + "sfs").setStoragePath(com.tencent.mm.plugin.n.b.zk()).setName("sns");
      FileOp.a(str, new String[] { "sight_*", "sns_tmp*", "sightad_*", "sns_tmpsad_*" }, localBuilder);
    }
    bjr();
    GMTrace.o(8056955994112L, 60029);
  }
  
  public final void b(com.tencent.mm.y.ao paramao)
  {
    GMTrace.i(8057224429568L, 60031);
    t.b(paramao);
    GMTrace.o(8057224429568L, 60031);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(8056687558656L, 60027);
    GMTrace.o(8056687558656L, 60027);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(8056419123200L, 60025);
    ??? = biX();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(1802, (com.tencent.mm.ad.e)???);
    ??? = this.puh;
    com.tencent.mm.sdk.b.a.vgX.c(((an)???).pvJ);
    com.tencent.mm.sdk.b.a.vgX.c(((an)???).pvK);
    com.tencent.mm.sdk.b.a.vgX.c(((an)???).pvL);
    com.tencent.mm.sdk.b.a.vgX.c(this.puY);
    com.tencent.mm.sdk.b.a.vgX.c(this.puZ);
    com.tencent.mm.sdk.b.a.vgX.c(this.puX);
    com.tencent.mm.sdk.b.a.vgX.c(this.puW);
    com.tencent.mm.sdk.b.a.vgX.c(this.puM);
    com.tencent.mm.sdk.b.a.vgX.c(this.puK);
    com.tencent.mm.sdk.b.a.vgX.c(this.puL);
    com.tencent.mm.sdk.b.a.vgX.c(this.puN);
    com.tencent.mm.sdk.b.a.vgX.c(this.puO);
    com.tencent.mm.sdk.b.a.vgX.c(this.puP);
    com.tencent.mm.sdk.b.a.vgX.c(this.puA);
    com.tencent.mm.sdk.b.a.vgX.c(this.puB);
    com.tencent.mm.sdk.b.a.vgX.c(this.puR);
    com.tencent.mm.sdk.b.a.vgX.c(this.puS);
    com.tencent.mm.sdk.b.a.vgX.c(this.pux);
    com.tencent.mm.sdk.b.a.vgX.c(this.puy);
    com.tencent.mm.sdk.b.a.vgX.c(this.puz);
    com.tencent.mm.sdk.b.a.vgX.c(this.puC);
    com.tencent.mm.sdk.b.a.vgX.c(this.puD);
    com.tencent.mm.sdk.b.a.vgX.c(this.puE);
    com.tencent.mm.sdk.b.a.vgX.c(this.puF);
    com.tencent.mm.sdk.b.a.vgX.c(this.puG);
    com.tencent.mm.sdk.b.a.vgX.c(this.puH);
    com.tencent.mm.sdk.b.a.vgX.c(this.puQ);
    com.tencent.mm.sdk.b.a.vgX.c(this.puo);
    com.tencent.mm.sdk.b.a.vgX.c(this.puT);
    com.tencent.mm.sdk.b.a.vgX.c(this.puU);
    com.tencent.mm.sdk.b.a.vgX.c(this.nqi);
    com.tencent.mm.sdk.b.a.vgX.c(this.pvb);
    com.tencent.mm.sdk.b.a.vgX.c(this.puV);
    com.tencent.mm.sdk.b.a.vgX.c(this.puI);
    com.tencent.mm.sdk.b.a.vgX.c(this.puJ);
    com.tencent.mm.sdk.b.a.vgX.c(this.pvc);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("NewYearSNSCtrl2016", this.pur, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("NewYearSNSTips2016", this.pus, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("NewYearSNSAmountLevelCtrl2016", this.put, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.n)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.messenger.foundation.a.n.class)).getSysCmdMsgExtension().b("SnsAd", this.puu, true);
    ??? = biZ();
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(207, (com.tencent.mm.ad.e)???);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(209, (com.tencent.mm.ad.e)???);
    ??? = (ae)com.tencent.mm.y.p.o(ae.class);
    if (??? != null)
    {
      w.d("MicroMsg.SnsCore", "SnsCore close db");
      if (((ae)???).fYV != null)
      {
        ((ae)???).fYV.yE();
        ((ae)???).fYV = null;
      }
      int i = 0;
      while (i < 3)
      {
        if (???.ptJ[i] != null) {
          ???.ptJ[i].getLooper().quit();
        }
        i += 1;
      }
      i = 0;
      while (i <= 0)
      {
        if (???.ptK[0] != null) {
          ???.ptK[0].getLooper().quit();
        }
        i += 1;
      }
      if (((ae)???).ptL != null) {
        ((ae)???).ptL.getLooper().quit();
      }
      if (((ae)???).ptM != null) {
        ((ae)???).ptM.getLooper().quit();
      }
    }
    if (this.gtp != null)
    {
      FileOp.kR(this.gtp);
      this.gtp = null;
    }
    ??? = this.pup;
    biY().b((b.b)???);
    com.tencent.mm.sdk.b.a.vgX.c(((com.tencent.mm.plugin.sns.e.a)???).ppA);
    ao.unInit();
    com.tencent.mm.memory.g.ghL.ye();
    com.tencent.mm.memory.c.ghE.ye();
    o.gib.ye();
    aq localaq = bjb();
    localaq.pvU = null;
    localaq.hbw = null;
    localaq.pvW.clear();
    localaq.pvV.clear();
    synchronized (localaq.pvX)
    {
      localaq.pvX.clear();
      com.tencent.mm.sdk.b.a.vgX.c(localaq.pvY);
      com.tencent.mm.sdk.b.a.vgX.c(localaq.pvK);
      com.tencent.mm.sdk.b.a.vgX.c(localaq.pvL);
      GMTrace.o(8056419123200L, 60025);
      return;
    }
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(8056553340928L, 60026);
    GMTrace.o(8056553340928L, 60026);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */