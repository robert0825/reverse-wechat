package com.tencent.mm.modelmulti;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Debug.MemoryInfo;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.plugin.report.kvdata.BDStatusInfo;
import com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo;
import com.tencent.mm.plugin.report.kvdata.SDStatusInfo;
import com.tencent.mm.plugin.report.kvdata.SubDirInfo;
import com.tencent.mm.plugin.report.kvdata.TableInfo;
import com.tencent.mm.plugin.report.kvdata.WeChatSDInfo;
import com.tencent.mm.plugin.report.kvdata.log_14375;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc.1;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

public class p
  implements aq
{
  private static final long startTime;
  long gNA;
  public long gNB;
  public long gNC;
  long gND;
  private BroadcastReceiver gNE;
  public boolean gNF;
  public boolean gNG;
  public long gNH;
  public Runnable gNI;
  public c.a gNJ;
  public long gNK;
  private com.tencent.mm.ad.e gNL;
  public Runnable gNM;
  public Runnable gNN;
  private com.tencent.mm.sdk.b.c gNO;
  private aj gNP;
  long gNt;
  long gNu;
  long gNv;
  long gNw;
  long gNx;
  long gNy;
  long gNz;
  private j.a gqa;
  
  static
  {
    GMTrace.i(401579442176L, 2992);
    startTime = System.currentTimeMillis();
    GMTrace.o(401579442176L, 2992);
  }
  
  public p()
  {
    GMTrace.i(397150257152L, 2959);
    this.gNt = 1024L;
    this.gNu = 10L;
    this.gNv = 1800L;
    this.gNw = 3000000L;
    this.gNx = 15000L;
    this.gNy = 100000L;
    this.gNz = 10000L;
    this.gNA = 1024L;
    this.gNB = 1L;
    this.gNC = 1L;
    this.gND = 1L;
    this.gNF = false;
    this.gNG = true;
    this.gNH = 0L;
    this.gNK = 0L;
    this.gNL = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(410706247680L, 3060);
        if (paramAnonymousk == null) {}
        for (int i = -1;; i = paramAnonymousk.getType())
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv onIDKeyCallback onSceneEnd[%d][%d, %d, %s]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
            com.tencent.mm.plugin.report.service.d.bbW();
          }
          GMTrace.o(410706247680L, 3060);
          return;
        }
      }
    };
    this.gqa = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(396613386240L, 2955);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv abTestListener onNotifyChange stack[%s]", new Object[] { bg.bQW() });
        if ((paramAnonymousString != null) && (paramAnonymousString.length() > 0)) {
          "event_updated".equals(paramAnonymousString);
        }
        GMTrace.o(396613386240L, 2955);
      }
    };
    this.gNM = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14449075290112L, 107654);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportAllRunnable run");
        p localp = p.this;
        at.AR();
        long l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vuZ, Long.valueOf(0L))).longValue();
        long l2 = System.currentTimeMillis();
        if ((l2 - l1 > 259200000L) || (l1 > l2))
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vuZ, Long.valueOf(l2));
          com.tencent.mm.sdk.f.e.post(new p.5(localp), "reportSDStatus");
        }
        localp = p.this;
        at.AR();
        l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vvH, Long.valueOf(0L))).longValue();
        l2 = System.currentTimeMillis();
        if ((l2 - l1 > localp.gND * 60000L) || (l1 > l2))
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vvH, Long.valueOf(l2));
          l1 = localp.gNv;
          l2 = localp.gNw;
          com.tencent.mm.sdk.f.e.post(new p.2(localp, l1 * 1024L * 1024L, localp.gNA * 1024L * 1024L, l2, localp.gNx, localp.gNy, localp.gNz), "reportDBInfo");
        }
        localp = p.this;
        at.AR();
        l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vvN, Long.valueOf(0L))).longValue();
        l2 = System.currentTimeMillis();
        if ((l2 - l1 > 259200000L) || (l1 > l2))
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vvN, Long.valueOf(l2));
          com.tencent.mm.sdk.f.e.post(new p.3(localp), "reportVersion");
        }
        p.this.JE();
        at.xB();
        af.F(p.this.gNN);
        at.xB().h(p.this.gNN, 10000L);
        GMTrace.o(14449075290112L, 107654);
      }
    };
    this.gNN = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14447196241920L, 107640);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportHeavyUserRunnable run");
        if (p.this.gNK != 0L)
        {
          at.AR();
          long l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwG, Long.valueOf(0L))).longValue();
          long l2 = System.currentTimeMillis();
          if ((l2 - l1 > 86400000L) || (l1 > l2))
          {
            com.tencent.mm.plugin.report.service.g.ork.a(509L, 17L, 1L, true);
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vwG, Long.valueOf(l2));
            at.AR();
            l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwF, Long.valueOf(0L))).longValue();
            log_14375 locallog_14375 = new log_14375();
            locallog_14375.type_ = 4;
            HeavyDetailInfo localHeavyDetailInfo = new HeavyDetailInfo();
            locallog_14375.heavyDetailInfo_ = localHeavyDetailInfo;
            localHeavyDetailInfo.flag_ = l1;
            at.AR();
            l2 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwH, Long.valueOf(0L))).longValue();
            localHeavyDetailInfo.sdFileSize_ = l2;
            String str = String.valueOf(l1) + ";" + l2;
            at.AR();
            l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwI, Long.valueOf(0L))).longValue();
            localHeavyDetailInfo.sdFileRatio_ = l1;
            str = str + ";" + l1;
            at.AR();
            l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwJ, Long.valueOf(0L))).longValue();
            localHeavyDetailInfo.dbSize_ = l1;
            str = str + ";" + l1;
            at.AR();
            l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwK, Long.valueOf(0L))).longValue();
            localHeavyDetailInfo.message_ = l1;
            str = str + ";" + l1;
            at.AR();
            l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwL, Long.valueOf(0L))).longValue();
            localHeavyDetailInfo.conversation_ = l1;
            str = str + ";" + l1;
            at.AR();
            l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwM, Long.valueOf(0L))).longValue();
            localHeavyDetailInfo.contact_ = l1;
            str = str + ";" + l1;
            at.AR();
            l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwN, Long.valueOf(0L))).longValue();
            localHeavyDetailInfo.chatroom_ = l1;
            str = str + ";" + l1;
            at.AR();
            l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwO, Long.valueOf(0L))).longValue();
            localHeavyDetailInfo.favDbSize_ = l1;
            str = str + ";" + l1;
            ab.getContext().getSharedPreferences("heavyDetailInfo", 0).edit().putLong("sdFileSize", localHeavyDetailInfo.sdFileSize_).putLong("sdFileRatio", localHeavyDetailInfo.sdFileRatio_).putLong("dbSize", localHeavyDetailInfo.dbSize_).putLong("message", localHeavyDetailInfo.message_).putLong("conversation", localHeavyDetailInfo.conversation_).putLong("contact", localHeavyDetailInfo.contact_).putLong("chatroom", localHeavyDetailInfo.chatroom_).putLong("favDbSize", localHeavyDetailInfo.favDbSize_).putLong("flag", localHeavyDetailInfo.flag_).apply();
            com.tencent.mm.plugin.report.service.g.ork.i(13778, new Object[] { Integer.valueOf(4), Integer.valueOf(1), str });
            com.tencent.mm.plugin.report.service.g.ork.b(14375, locallog_14375);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportHeavyUser report heavy result[%s]", new Object[] { str });
          }
        }
        GMTrace.o(14447196241920L, 107640);
      }
    };
    this.gNO = new com.tencent.mm.sdk.b.c() {};
    this.gNP = new aj(at.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(14448672636928L, 107651);
        p.this.JE();
        GMTrace.o(14448672636928L, 107651);
        return true;
      }
    }, true);
    GMTrace.o(397150257152L, 2959);
  }
  
  public final void JE()
  {
    GMTrace.i(16009222160384L, 119278);
    at.AR();
    int j = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwP, Integer.valueOf(0))).intValue();
    at.AR();
    long l1 = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwQ, Long.valueOf(0L))).longValue();
    at.AR();
    int k = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vwR, Integer.valueOf(0))).intValue();
    int m = Process.myPid();
    Object localObject = ((ActivityManager)ab.getContext().getSystemService("activity")).getProcessMemoryInfo(new int[] { m });
    if ((localObject != null) && (localObject.length > 0) && (localObject[0] != null)) {}
    for (int i = localObject[0].getTotalPss();; i = -1)
    {
      if (j == 0)
      {
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vwP, Integer.valueOf(m));
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vwQ, Long.valueOf(System.currentTimeMillis() - startTime));
        at.AR();
        localObject = com.tencent.mm.y.c.xh();
        w.a locala = w.a.vwR;
        if (i > 0) {
          ((t)localObject).a(locala, Integer.valueOf(i));
        }
      }
      for (;;)
      {
        this.gNP.z(180000L, 180000L);
        GMTrace.o(16009222160384L, 119278);
        return;
        i = 0;
        break;
        if (j != m)
        {
          com.tencent.mm.plugin.report.service.g.ork.i(13778, new Object[] { Integer.valueOf(5), Integer.valueOf(1), Long.valueOf(l1) });
          com.tencent.mm.plugin.report.service.g.ork.i(13778, new Object[] { Integer.valueOf(5), Integer.valueOf(2), Integer.valueOf(k) });
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vwP, Integer.valueOf(m));
          long l2 = System.currentTimeMillis() - startTime;
          if (i > 0) {}
          for (;;)
          {
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vwQ, Long.valueOf(l2));
            at.AR();
            com.tencent.mm.y.c.xh().a(w.a.vwR, Integer.valueOf(i));
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportLifeTime lifeTime[%d -> %d]ms,  pss[%d -> %d], pid[%d -> %d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(m) });
            break;
            i = 0;
          }
        }
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vwQ, Long.valueOf(System.currentTimeMillis() - startTime));
        if (i > k)
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vwR, Integer.valueOf(i));
        }
      }
    }
  }
  
  public final c.a a(File paramFile, c.a parama, c.b paramb, c.c paramc, Map<String, Integer> paramMap, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(398089781248L, 2966);
    if (parama.gLX)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summclean scanFile been canceled fileResult[%s], subDirResult[%s]", new Object[] { parama, paramb });
      GMTrace.o(398089781248L, 2966);
      return parama;
    }
    if (parama.gLU < paramInt) {
      parama.gLU += 1;
    }
    Object localObject;
    if (paramFile.isDirectory())
    {
      localObject = paramFile.getAbsolutePath();
      if ((paramb != null) || (paramMap == null) || (paramMap.size() <= 0) || (paramMap.get(localObject) == null)) {
        break label866;
      }
      paramb = new c.b((String)localObject, ((Integer)paramMap.get(localObject)).intValue());
      paramMap.remove(localObject);
      parama.gLV.add(paramb);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile start scan subDir[%s], fileResult[%s], newSubDirResult[%s]", new Object[] { localObject, parama, paramb });
    }
    label808:
    label863:
    label866:
    for (;;)
    {
      parama.gLR += 1L;
      if (paramb != null) {
        paramb.gLR += 1L;
      }
      if (paramc != null) {
        paramc.gLR += 1L;
      }
      if (paramInt > 15)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile been stopped as depth[%d] over limit path[%s], fileResult[%s]", new Object[] { Integer.valueOf(paramInt), paramFile.getAbsolutePath(), parama });
        GMTrace.o(398089781248L, 2966);
        return parama;
      }
      String[] arrayOfString = paramFile.list();
      int j;
      if (arrayOfString != null)
      {
        if (paramBoolean)
        {
          j = arrayOfString.length;
          i = 0;
          while (i < j)
          {
            String str = arrayOfString[i];
            localObject = paramc;
            if (!bg.nm(str))
            {
              localObject = paramc;
              if (Pattern.matches("[a-fA-F0-9]{32}temp[0-9]{13}", str))
              {
                localObject = new c.c(paramFile.getAbsolutePath() + File.separator + str);
                parama.gLW.add(localObject);
              }
            }
            a(new File(paramFile.getAbsolutePath() + File.separator + str), parama, paramb, (c.c)localObject, paramMap, false, paramInt + 1);
            i += 1;
            paramc = (c.c)localObject;
          }
        }
        int i = 1;
        int k = arrayOfString.length;
        j = 0;
        if (j >= k) {
          break label808;
        }
        localObject = arrayOfString[j];
        a(new File(paramFile.getAbsolutePath() + File.separator + (String)localObject), parama, paramb, paramc, paramMap, false, paramInt + 1);
        if ((i == 0) || (parama.gLU <= 15)) {
          break label863;
        }
        com.tencent.mm.plugin.report.service.g.ork.a(418L, 7L, 1L, true);
        com.tencent.mm.plugin.report.service.g.ork.i(13778, new Object[] { Integer.valueOf(2), Integer.valueOf(2), paramFile.getAbsolutePath() + File.separator + (String)localObject });
        i = 0;
      }
      for (;;)
      {
        j += 1;
        break;
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile dir is empty[%s] ret", new Object[] { paramFile.getAbsolutePath() });
        GMTrace.o(398089781248L, 2966);
        return parama;
        parama.gLS += 1L;
        if (paramb != null) {
          paramb.gLS += 1L;
        }
        if (paramc != null) {
          paramc.gLS += 1L;
        }
        if (!paramFile.exists())
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv scanFile file not exist[%s][%d] ret", new Object[] { paramFile.getAbsolutePath(), Long.valueOf(parama.gLS) });
          GMTrace.o(398089781248L, 2966);
          return parama;
        }
        long l = paramFile.length();
        if ((l > 0L) && (l < 2147483648L))
        {
          parama.eJe += l;
          if (paramb != null) {
            paramb.eJe += l;
          }
          if (paramc != null) {
            paramc.eJe = (l + paramc.eJe);
          }
        }
        for (;;)
        {
          GMTrace.o(398089781248L, 2966);
          return parama;
          parama.fileLenInvalidCount += 1L;
          if (paramb != null) {
            paramb.fileLenInvalidCount += 1L;
          }
          if (paramc != null) {
            paramc.gLY += 1L;
          }
        }
      }
    }
  }
  
  public final void a(int paramInt, final long paramLong1, long paramLong2)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(17613795098624L, 131233);
        if (paramLong1 > paramLong2)
        {
          bool = true;
          if (bool)
          {
            l = this.gNK | paramInt;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser type[%d] value[%d] limit[%d] heavy[%b] mHeavyUser[%d] newHeavyUser[%d] tid[%s]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(bool), Long.valueOf(this.gNK), Long.valueOf(l), Long.valueOf(Thread.currentThread().getId()) });
            if (l == this.gNK) {
              break label539;
            }
            if (this.gNK == 0L) {
              com.tencent.mm.plugin.report.service.g.ork.a(509L, 1L, 1L, true);
            }
            if (l != 0L) {
              break label539;
            }
            com.tencent.mm.plugin.report.service.g.ork.a(509L, 2L, 1L, true);
            break label539;
            this.gNK = l;
            if (l == 0L) {
              continue;
            }
            bool = true;
            com.tencent.mm.plugin.report.service.d.gW(bool);
            at.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(14447598895104L, 107643);
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vwF, Long.valueOf(l));
                if (paramLong1 != null)
                {
                  at.AR();
                  com.tencent.mm.y.c.xh().a(paramLong1, Long.valueOf(this.gNZ));
                }
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv resetHeavyUser heavyUser[%d, %d], fkey[%s], value[%d]", new Object[] { Long.valueOf(l), Long.valueOf(p.this.gNK), paramLong1, Long.valueOf(this.gNZ) });
                GMTrace.o(14447598895104L, 107643);
              }
            });
            GMTrace.o(17613795098624L, 131233);
          }
        }
        else
        {
          bool = false;
          continue;
        }
        final long l = this.gNK & (paramInt ^ 0xFFFFFFFF);
        continue;
        w.a locala = w.a.vwH;
        com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
        if (!bool) {
          break label619;
        }
        paramLong2 = 3L;
        localg.a(509L, paramLong2, 1L, true);
        continue;
        locala = w.a.vwI;
        localg = com.tencent.mm.plugin.report.service.g.ork;
        if (!bool) {
          break label627;
        }
        paramLong2 = 5L;
        localg.a(509L, paramLong2, 1L, true);
        continue;
        locala = w.a.vwJ;
        localg = com.tencent.mm.plugin.report.service.g.ork;
        if (!bool) {
          break label635;
        }
        paramLong2 = 7L;
        localg.a(509L, paramLong2, 1L, true);
        continue;
        locala = w.a.vwK;
        localg = com.tencent.mm.plugin.report.service.g.ork;
        if (!bool) {
          break label643;
        }
        paramLong2 = 9L;
        localg.a(509L, paramLong2, 1L, true);
        continue;
        locala = w.a.vwL;
        localg = com.tencent.mm.plugin.report.service.g.ork;
        if (!bool) {
          break label651;
        }
        paramLong2 = 11L;
        localg.a(509L, paramLong2, 1L, true);
        continue;
        locala = w.a.vwM;
        localg = com.tencent.mm.plugin.report.service.g.ork;
        if (!bool) {
          break label659;
        }
        paramLong2 = 13L;
        localg.a(509L, paramLong2, 1L, true);
        continue;
        locala = w.a.vwN;
        localg = com.tencent.mm.plugin.report.service.g.ork;
        if (!bool) {
          break label667;
        }
        paramLong2 = 15L;
        localg.a(509L, paramLong2, 1L, true);
        continue;
        locala = w.a.vwO;
        localg = com.tencent.mm.plugin.report.service.g.ork;
        if (bool)
        {
          paramLong2 = 19L;
          localg.a(509L, paramLong2, 1L, true);
          continue;
        }
        paramLong2 = 20L;
        continue;
        boolean bool = false;
        continue;
        Object localObject2 = null;
      }
      finally {}
      label539:
      switch (paramInt)
      {
      }
      continue;
      label619:
      paramLong2 = 4L;
      continue;
      label627:
      paramLong2 = 6L;
      continue;
      label635:
      paramLong2 = 8L;
      continue;
      label643:
      paramLong2 = 10L;
      continue;
      label651:
      paramLong2 = 12L;
      continue;
      label659:
      paramLong2 = 14L;
      continue;
      label667:
      paramLong2 = 16L;
    }
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(397687128064L, 2963);
    com.tencent.mm.sdk.b.a.vgX.a(this.gNO);
    com.tencent.mm.y.c.c.Ct().c(this.gqa);
    Object localObject1 = com.tencent.mm.y.c.c.Ct().er("100212");
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv reloadHeavyUserCfg update[%b] abTest[%s][%b][%s] default[%d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d]", new Object[] { Boolean.valueOf(false), localObject1, Boolean.valueOf(((com.tencent.mm.storage.c)localObject1).isValid()), ((com.tencent.mm.storage.c)localObject1).bSg(), Long.valueOf(1024L), Long.valueOf(10L), Long.valueOf(1800L), Long.valueOf(3000000L), Long.valueOf(15000L), Long.valueOf(15000L), Long.valueOf(100000L), Long.valueOf(10000L), Long.valueOf(1L), Long.valueOf(1L), Long.valueOf(1L) });
    if (((com.tencent.mm.storage.c)localObject1).isValid())
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv reloadHeavyUserCfg abTest valid!");
      localObject1 = ((com.tencent.mm.storage.c)localObject1).bSg();
      long l1 = bg.getLong((String)((Map)localObject1).get("sdsize"), 1024L);
      long l2 = bg.getLong((String)((Map)localObject1).get("sdratio"), 10L);
      long l3 = bg.getLong((String)((Map)localObject1).get("dbsize"), 1800L);
      long l4 = bg.getLong((String)((Map)localObject1).get("fdbsize"), 1024L);
      long l5 = bg.getLong((String)((Map)localObject1).get("msg"), 3000000L);
      long l6 = bg.getLong((String)((Map)localObject1).get("conv"), 15000L);
      long l7 = bg.getLong((String)((Map)localObject1).get("contact"), 100000L);
      long l8 = bg.getLong((String)((Map)localObject1).get("chatroom"), 10000L);
      long l9 = bg.getLong((String)((Map)localObject1).get("sditv"), 1L);
      long l10 = bg.getLong((String)((Map)localObject1).get("sdwait"), 1L);
      long l11 = bg.getLong((String)((Map)localObject1).get("dbitv"), 1L);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv reloadHeavyUserCfg sd[%d, %d] sdr[%d, %d] db[%d, %d] fdbsize[%d, %d] msg[%d, %d] conv[%d, %d] contact[%d, %d] chatroom[%d, %d] sditv[%d, %d] sdwait[%d, %d] dbitv[%d, %d]", new Object[] { Long.valueOf(this.gNt), Long.valueOf(l1), Long.valueOf(this.gNu), Long.valueOf(l2), Long.valueOf(this.gNv), Long.valueOf(l3), Long.valueOf(this.gNA), Long.valueOf(l4), Long.valueOf(this.gNw), Long.valueOf(l5), Long.valueOf(this.gNx), Long.valueOf(l6), Long.valueOf(this.gNy), Long.valueOf(l7), Long.valueOf(this.gNz), Long.valueOf(l8), Long.valueOf(this.gNB), Long.valueOf(l9), Long.valueOf(this.gNC), Long.valueOf(l10), Long.valueOf(this.gND), Long.valueOf(l11) });
      if (this.gNt != l1)
      {
        this.gNt = l1;
        paramBoolean = true;
        if (this.gNu != l2)
        {
          this.gNu = l2;
          paramBoolean = true;
        }
        if (this.gNv != l3)
        {
          this.gNv = l3;
          paramBoolean = true;
        }
        if (this.gNA != l4)
        {
          this.gNA = l4;
          paramBoolean = true;
        }
        if (this.gNw != l5)
        {
          this.gNw = l5;
          paramBoolean = true;
        }
        if (this.gNx != l6)
        {
          this.gNx = l6;
          paramBoolean = true;
        }
        if (this.gNy != l7)
        {
          this.gNy = l7;
          paramBoolean = true;
        }
        if (this.gNz != l8)
        {
          this.gNz = l8;
          paramBoolean = true;
        }
        if (this.gNB != l9)
        {
          this.gNB = l9;
          paramBoolean = true;
        }
        if (this.gNC != l10)
        {
          this.gNC = l10;
          paramBoolean = true;
        }
        if (this.gND != l11)
        {
          this.gND = l11;
          paramBoolean = true;
        }
      }
    }
    for (;;)
    {
      if (paramBoolean) {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 0L, 1L, true);
      }
      if (this.gNt <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 30L, 1L, true);
        this.gNt = 1024L;
      }
      if (this.gNu <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 31L, 1L, true);
        this.gNu = 10L;
      }
      if (this.gNv <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 32L, 1L, true);
        this.gNv = 1800L;
      }
      if (this.gNw <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 33L, 1L, true);
        this.gNw = 3000000L;
      }
      if (this.gNx <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 34L, 1L, true);
        this.gNx = 15000L;
      }
      if (this.gNy <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 35L, 1L, true);
        this.gNy = 100000L;
      }
      if (this.gNz <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 36L, 1L, true);
        this.gNz = 10000L;
      }
      if (this.gNB <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 37L, 1L, true);
        this.gNB = 1L;
      }
      if (this.gNC <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 38L, 1L, true);
        this.gNC = 1L;
      }
      if (this.gND <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 39L, 1L, true);
        this.gND = 1L;
      }
      if (this.gNA <= 0L)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(509L, 40L, 1L, true);
        this.gNA = 1024L;
      }
      at.AR();
      this.gNK = ((Long)com.tencent.mm.y.c.xh().get(w.a.vwF, Long.valueOf(0L))).longValue();
      boolean bool;
      Object localObject2;
      if (this.gNK != 0L)
      {
        bool = true;
        com.tencent.mm.plugin.report.service.d.gW(bool);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountPostReset heavyuser[%d], reloadHeavyUser[%b] abTestListener[%s]", new Object[] { Long.valueOf(this.gNK), Boolean.valueOf(paramBoolean), this.gqa });
        at.wS().a(989, this.gNL);
        at.wS().a(988, this.gNL);
        at.wS().a(987, this.gNL);
        at.wS().a(986, this.gNL);
        at.AR();
        this.gNH = ((Long)com.tencent.mm.y.c.xh().get(w.a.vvI, Long.valueOf(0L))).longValue();
        localObject1 = ab.getContext();
        localObject2 = ((Context)localObject1).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (localObject2 == null) {
          break label1629;
        }
        int i = ((Intent)localObject2).getIntExtra("status", -1);
        if ((i != 2) && (i != 5)) {
          break label1624;
        }
        paramBoolean = true;
        label1411:
        this.gNF = paramBoolean;
        label1416:
        this.gNG = ((PowerManager)((Context)localObject1).getSystemService("power")).isScreenOn();
        this.gNE = new BroadcastReceiver()
        {
          public final void onReceive(final Context paramAnonymousContext, Intent paramAnonymousIntent)
          {
            GMTrace.i(14444377669632L, 107619);
            paramAnonymousContext = paramAnonymousIntent.getAction();
            int i = -1;
            label92:
            boolean bool2;
            boolean bool3;
            long l;
            switch (paramAnonymousContext.hashCode())
            {
            default: 
              switch (i)
              {
              default: 
                bool2 = p.this.gNG;
                bool3 = p.this.gNF;
                l = p.this.gNH;
                if (p.this.gNI != null) {}
                break;
              }
              break;
            }
            for (boolean bool1 = true;; bool1 = false)
            {
              com.tencent.mm.sdk.platformtools.w.v("MicroMsg.SubCoreBaseMonitor", "summerhv Action received: %s, interactive: %s, charging: %s, lastScanTime:%d, delayTimerRunnable null[%b]", new Object[] { paramAnonymousContext, Boolean.valueOf(bool2), Boolean.valueOf(bool3), Long.valueOf(l), Boolean.valueOf(bool1) });
              if ((p.this.gNI != null) || (!p.this.gNF) || (p.this.gNG)) {
                break label457;
              }
              if (System.currentTimeMillis() - p.this.gNH >= p.this.gNB * 60000L) {
                break label374;
              }
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv last scan time not matched in [%d]min", new Object[] { Long.valueOf(p.this.gNB) });
              GMTrace.o(14444377669632L, 107619);
              return;
              if (!paramAnonymousContext.equals("android.intent.action.SCREEN_ON")) {
                break;
              }
              i = 0;
              break;
              if (!paramAnonymousContext.equals("android.intent.action.SCREEN_OFF")) {
                break;
              }
              i = 1;
              break;
              if (!paramAnonymousContext.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                break;
              }
              i = 2;
              break;
              if (!paramAnonymousContext.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                break;
              }
              i = 3;
              break;
              p.this.gNG = true;
              break label92;
              p.this.gNG = false;
              break label92;
              p.this.gNF = true;
              break label92;
              p.this.gNF = false;
              break label92;
            }
            label374:
            paramAnonymousContext = new c()
            {
              public final void a(int paramAnonymous2Int, c.a paramAnonymous2a)
              {
                GMTrace.i(14448941072384L, 107653);
                p.this.gNH = System.currentTimeMillis();
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv callback errType[%d] lastScanTime[%d], result[%s][%s]", new Object[] { Integer.valueOf(paramAnonymous2Int), Long.valueOf(p.this.gNH), p.this.gNJ, paramAnonymous2a });
                p.this.gNJ = null;
                p localp;
                log_14375 locallog_14375;
                SDStatusInfo localSDStatusInfo;
                if ((paramAnonymous2Int == 0) && (!paramAnonymous2a.gLX))
                {
                  at.AR();
                  com.tencent.mm.y.c.xh().a(w.a.vvI, Long.valueOf(p.this.gNH));
                  at.AR();
                  com.tencent.mm.y.c.xh().kL(false);
                  try
                  {
                    localp = p.this;
                    locallog_14375 = new log_14375();
                    locallog_14375.type_ = 2;
                    localSDStatusInfo = new SDStatusInfo();
                    locallog_14375.sdStatusInfo_ = localSDStatusInfo;
                    localObject2 = new c.c("total/temp/acc/");
                    localObject1 = paramAnonymous2a.gLW.iterator();
                    while (((Iterator)localObject1).hasNext())
                    {
                      localObject3 = (c.c)((Iterator)localObject1).next();
                      ((c.c)localObject2).gLR += ((c.c)localObject3).gLR;
                      ((c.c)localObject2).gLS += ((c.c)localObject3).gLS;
                      ((c.c)localObject2).eJe += ((c.c)localObject3).eJe;
                      ((c.c)localObject2).gLY += ((c.c)localObject3).gLY;
                    }
                    GMTrace.o(14448941072384L, 107653);
                  }
                  catch (Exception paramAnonymous2a)
                  {
                    com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.SubCoreBaseMonitor", paramAnonymous2a, "doReportSDInfo err!", new Object[0]);
                    com.tencent.mm.plugin.report.service.g.ork.a(418L, 6L, 1L, true);
                  }
                }
                else
                {
                  return;
                }
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv doReportSDInfo total tempAccDirResult[%d][%s]", new Object[] { Integer.valueOf(paramAnonymous2a.gLW.size()), localObject2 });
                Collections.sort(paramAnonymous2a.gLV, new p.14(localp));
                Object localObject1 = paramAnonymous2a.gLV.iterator();
                while (((Iterator)localObject1).hasNext()) {
                  com.tencent.mm.sdk.platformtools.w.d("MicroMsg.SubCoreBaseMonitor", "summerhv doReportSDInfo subDirResult[%s]", new Object[] { (c.b)((Iterator)localObject1).next() });
                }
                localObject1 = paramAnonymous2a.eJe + ":" + paramAnonymous2a.gLR + ":" + paramAnonymous2a.gLS + ":" + paramAnonymous2a.fileLenInvalidCount + ":" + paramAnonymous2a.gLV.size() + ":" + paramAnonymous2a.gLT + ":" + paramAnonymous2a.gLU + "|" + paramAnonymous2a.gLW.size() + ":" + ((c.c)localObject2).eJe + ":" + ((c.c)localObject2).gLR + ":" + ((c.c)localObject2).gLS + ":" + ((c.c)localObject2).gLY;
                Object localObject3 = new WeChatSDInfo();
                localSDStatusInfo.weChatSDInfo_ = ((WeChatSDInfo)localObject3);
                ((WeChatSDInfo)localObject3).totalSize_ = paramAnonymous2a.eJe;
                ((WeChatSDInfo)localObject3).fileCount_ = paramAnonymous2a.gLS;
                ((WeChatSDInfo)localObject3).fileLenInvalidCount_ = paramAnonymous2a.fileLenInvalidCount;
                ((WeChatSDInfo)localObject3).subDirResultsSize_ = paramAnonymous2a.gLV.size();
                ((WeChatSDInfo)localObject3).totalTime_ = paramAnonymous2a.gLT;
                ((WeChatSDInfo)localObject3).depth_ = paramAnonymous2a.gLU;
                ((WeChatSDInfo)localObject3).tempAccTotalSize_ = ((c.c)localObject2).eJe;
                ((WeChatSDInfo)localObject3).tempAccDirResultsSize_ = paramAnonymous2a.gLW.size();
                ((WeChatSDInfo)localObject3).tempAccDirCount_ = ((c.c)localObject2).gLR;
                ((WeChatSDInfo)localObject3).tempAccFileCount_ = ((c.c)localObject2).gLS;
                ((WeChatSDInfo)localObject3).tempAccFileLenInvalidCount_ = ((c.c)localObject2).gLY;
                Object localObject2 = new LinkedList();
                ((WeChatSDInfo)localObject3).subDirList_ = ((LinkedList)localObject2);
                localObject3 = paramAnonymous2a.gLV.iterator();
                while (((Iterator)localObject3).hasNext())
                {
                  localObject4 = (c.b)((Iterator)localObject3).next();
                  localObject1 = (String)localObject1 + "|" + ((c.b)localObject4).tag + ":" + ((c.b)localObject4).eJe + ":" + ((c.b)localObject4).gLR + ":" + ((c.b)localObject4).gLS + ":" + ((c.b)localObject4).fileLenInvalidCount;
                  SubDirInfo localSubDirInfo = new SubDirInfo();
                  ((LinkedList)localObject2).add(localSubDirInfo);
                  localSubDirInfo.tag_ = ((c.b)localObject4).tag;
                  localSubDirInfo.totalSize_ = ((c.b)localObject4).eJe;
                  localSubDirInfo.dirCount_ = ((c.b)localObject4).gLR;
                  localSubDirInfo.fileCount_ = ((c.b)localObject4).gLS;
                  localSubDirInfo.fileLenInvalidCount = ((c.b)localObject4).fileLenInvalidCount;
                }
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv doReportSDInfo wechatResult[%d][%s]", new Object[] { Integer.valueOf(((String)localObject1).length()), localObject1 });
                localObject2 = com.tencent.mm.compatible.util.h.getExternalStorageDirectory().getPath();
                boolean bool1 = av.bQC();
                localObject3 = av.Sd(com.tencent.mm.compatible.util.e.ghx);
                Object localObject4 = new StatFs((String)localObject2);
                long l6 = ((StatFs)localObject4).getBlockSize();
                long l7 = ((StatFs)localObject4).getBlockCount();
                long l8 = ((StatFs)localObject4).getAvailableBlocks();
                long l9 = l6 * l7;
                long l10 = l6 * l8;
                paramAnonymous2Int = -1;
                if (l7 > 0L) {
                  paramAnonymous2Int = Math.round((float)l8 * 100.0F / (float)l7);
                }
                boolean bool2 = com.tencent.mm.compatible.util.e.ghx.equals(localObject2);
                long l5;
                long l4;
                long l3;
                long l2;
                long l1;
                int i;
                if (!bool2)
                {
                  localObject4 = new StatFs(com.tencent.mm.compatible.util.e.ghx);
                  l5 = ((StatFs)localObject4).getBlockSize();
                  l4 = ((StatFs)localObject4).getBlockCount();
                  l3 = ((StatFs)localObject4).getAvailableBlocks();
                  l2 = l5 * l4;
                  l1 = l5 * l3;
                  if (l4 > 0L) {
                    i = Math.round((float)l3 * 100.0F / (float)l4);
                  }
                }
                for (;;)
                {
                  int k = Math.round((float)paramAnonymous2a.eJe * 100.0F / (float)l2);
                  localSDStatusInfo.weChatPer_ = k;
                  localp.a(1, paramAnonymous2a.eJe, localp.gNt * 1024L * 1024L);
                  if (paramAnonymous2a.eJe > localp.gNt * 1024L * 1024L)
                  {
                    j = 1;
                    localSDStatusInfo.sizeHeavy_ = j;
                    localp.a(2, k, localp.gNu);
                    if (k <= localp.gNu) {
                      break label1681;
                    }
                    j = 1;
                    label1209:
                    localSDStatusInfo.ratioHeavy_ = j;
                    paramAnonymous2a = new StringBuilder().append(k).append(";");
                    if (!bool2) {
                      break label1687;
                    }
                    j = 1;
                    label1243:
                    paramAnonymous2a = paramAnonymous2a.append(j).append(";");
                    if (!bool1) {
                      break label1693;
                    }
                  }
                  label1681:
                  label1687:
                  label1693:
                  for (int j = 1;; j = 0)
                  {
                    paramAnonymous2a = j + ";" + l5 + ":" + l4 + ":" + l3 + ":" + l2 + ":" + l1 + ":" + i + "|" + l6 + ":" + l7 + ":" + l8 + ":" + l9 + ":" + l10 + ":" + paramAnonymous2Int + ";" + (String)localObject2 + ";" + com.tencent.mm.compatible.util.e.ghx + ";" + (String)localObject3;
                    localSDStatusInfo.sBlockSize_ = l5;
                    localSDStatusInfo.sBlockCount_ = l4;
                    localSDStatusInfo.sAvailableBlockCount_ = l3;
                    localSDStatusInfo.sTotalSize_ = l2;
                    localSDStatusInfo.sAvailableSize_ = l1;
                    localSDStatusInfo.sAvailablePer_ = i;
                    localSDStatusInfo.eBlockSize_ = l6;
                    localSDStatusInfo.eBlockCount_ = l7;
                    localSDStatusInfo.eAvailableBlockCount_ = l8;
                    localSDStatusInfo.eTotalSize_ = l9;
                    localSDStatusInfo.eAvailableSize_ = l10;
                    localSDStatusInfo.eAvailablePer_ = paramAnonymous2Int;
                    localSDStatusInfo.ePath_ = ((String)localObject2);
                    localSDStatusInfo.root_ = com.tencent.mm.compatible.util.e.ghx;
                    localSDStatusInfo.fSystem_ = ((String)localObject3);
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv doReportSDInfo phoneResult[%d][%s]", new Object[] { Integer.valueOf(paramAnonymous2a.length()), paramAnonymous2a });
                    paramAnonymous2a = (String)localObject1 + ";" + paramAnonymous2a;
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv doReportSDInfo totalResult[%d][%s]", new Object[] { Integer.valueOf(paramAnonymous2a.length()), paramAnonymous2a });
                    com.tencent.mm.plugin.report.service.g.ork.a(418L, 5L, 1L, true);
                    com.tencent.mm.plugin.report.service.g.ork.i(13778, new Object[] { Integer.valueOf(2), Integer.valueOf(1), paramAnonymous2a });
                    com.tencent.mm.plugin.report.service.g.ork.b(14375, locallog_14375);
                    GMTrace.o(14448941072384L, 107653);
                    return;
                    j = 0;
                    break;
                    j = 0;
                    break label1209;
                    j = 0;
                    break label1243;
                  }
                  i = paramAnonymous2Int;
                  continue;
                  i = paramAnonymous2Int;
                  l1 = l10;
                  l2 = l9;
                  l3 = l8;
                  l4 = l7;
                  l5 = l6;
                }
              }
            };
            p.this.gNI = new Runnable()
            {
              public final void run()
              {
                GMTrace.i(14448001548288L, 107646);
                p.this.gNI = null;
                Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).zv().aOh();
                int i;
                p localp1;
                p localp2;
                c localc;
                if (bg.cc((List)localObject))
                {
                  com.tencent.mm.sdk.platformtools.w.i("MicroMsg.MsgInfoStorageLogic", "summerdel checkUnfinishedDeleteMsgTask all finished!");
                  i = 0;
                  com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerdel checkUnfinishedDeleteMsgTask ret[%s]", new Object[] { Integer.valueOf(i) });
                  if (i > 0) {
                    com.tencent.mm.plugin.report.service.g.ork.a(418L, 8L, 1L, true);
                  }
                  localp1 = p.this;
                  localp2 = p.this;
                  localc = paramAnonymousContext;
                  com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan");
                  at.AR();
                  if (com.tencent.mm.y.c.isSDCardAvailable()) {
                    break label209;
                  }
                  com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan failed as sdcard not available");
                  localc.a(-1, null);
                  localObject = null;
                }
                for (;;)
                {
                  localp1.gNJ = ((c.a)localObject);
                  com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan started[%s]", new Object[] { p.this.gNJ });
                  GMTrace.o(14448001548288L, 107646);
                  return;
                  com.tencent.mm.sdk.f.e.post(new bc.1((List)localObject), "checkUnfinishedDeleteMsgTask");
                  i = ((List)localObject).size();
                  break;
                  label209:
                  localObject = com.tencent.mm.compatible.util.e.ghz;
                  File localFile = new File((String)localObject);
                  if ((!localFile.exists()) || (!localFile.isDirectory()))
                  {
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan failed as path not exists[%s]", new Object[] { localObject });
                    localc.a(-1, null);
                    localObject = null;
                  }
                  else
                  {
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan root[%s] exist[%b], diretory[%b]", new Object[] { localObject, Boolean.valueOf(localFile.exists()), Boolean.valueOf(localFile.isDirectory()) });
                    HashMap localHashMap = new HashMap(26);
                    at.AR();
                    localObject = com.tencent.mm.y.c.yX();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.yX().length() - 1), Integer.valueOf(1));
                    at.AR();
                    localObject = com.tencent.mm.y.c.yY();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.yY().length() - 1), Integer.valueOf(2));
                    at.AR();
                    localObject = com.tencent.mm.y.c.yU();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.yU().length() - 1), Integer.valueOf(3));
                    at.AR();
                    localObject = com.tencent.mm.y.c.yV();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.yV().length() - 1), Integer.valueOf(4));
                    at.AR();
                    localHashMap.put(com.tencent.mm.y.c.zk(), Integer.valueOf(5));
                    localHashMap.put(com.tencent.mm.plugin.f.a.aea().substring(0, com.tencent.mm.plugin.f.a.aea().length() - 1), Integer.valueOf(6));
                    at.AR();
                    localObject = com.tencent.mm.y.c.zb();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.zb().length() - 1), Integer.valueOf(7));
                    at.AR();
                    localObject = com.tencent.mm.y.c.getAccVideoPath();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.getAccVideoPath().length() - 1), Integer.valueOf(8));
                    at.AR();
                    localObject = com.tencent.mm.y.c.ze();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.ze().length() - 1), Integer.valueOf(9));
                    at.AR();
                    localObject = com.tencent.mm.y.c.zc();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.zc().length() - 1), Integer.valueOf(10));
                    at.AR();
                    localObject = com.tencent.mm.y.c.zf();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.zf().length() - 1), Integer.valueOf(11));
                    at.AR();
                    localObject = com.tencent.mm.y.c.zg();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.zg().length() - 1), Integer.valueOf(12));
                    at.AR();
                    localObject = com.tencent.mm.y.c.zh();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.zh().length() - 1), Integer.valueOf(13));
                    at.AR();
                    localObject = com.tencent.mm.y.c.zl();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.zl().length() - 1), Integer.valueOf(14));
                    at.AR();
                    localObject = com.tencent.mm.y.c.yZ();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.yZ().length() - 1), Integer.valueOf(15));
                    localHashMap.put(com.tencent.mm.bb.b.LW().substring(0, com.tencent.mm.bb.b.LW().length() - 1), Integer.valueOf(16));
                    at.AR();
                    localObject = com.tencent.mm.y.c.za();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.za().length() - 1), Integer.valueOf(17));
                    at.AR();
                    localObject = com.tencent.mm.y.c.zj();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.zj().length() - 1), Integer.valueOf(18));
                    at.AR();
                    localObject = com.tencent.mm.y.c.zi();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.zi().length() - 1), Integer.valueOf(19));
                    at.AR();
                    localObject = com.tencent.mm.y.c.getAccSnsPath();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.getAccSnsPath().length() - 1), Integer.valueOf(20));
                    at.AR();
                    localObject = com.tencent.mm.y.c.zm();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.zm().length() - 1), Integer.valueOf(21));
                    at.AR();
                    localObject = com.tencent.mm.y.c.yW();
                    at.AR();
                    localHashMap.put(((String)localObject).substring(0, com.tencent.mm.y.c.yW().length() - 1), Integer.valueOf(22));
                    localHashMap.put(com.tencent.mm.compatible.util.e.fSf, Integer.valueOf(23));
                    localHashMap.put(com.tencent.mm.compatible.util.e.fRX.substring(0, com.tencent.mm.compatible.util.e.fRX.length() - 1), Integer.valueOf(24));
                    localHashMap.put(com.tencent.mm.compatible.util.e.fSb.substring(0, com.tencent.mm.compatible.util.e.fSb.length() - 1), Integer.valueOf(25));
                    localHashMap.put(com.tencent.mm.compatible.util.e.fRZ.substring(0, com.tencent.mm.compatible.util.e.fRZ.length() - 1), Integer.valueOf(26));
                    localObject = new c.a(localFile.getAbsolutePath());
                    com.tencent.mm.sdk.f.e.post(new p.13(localp2, localHashMap, (c.a)localObject, localFile, localc), "summerhv_scanFile");
                  }
                }
              }
            };
            at.xB().h(p.this.gNI, p.this.gNC * 60000L);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan post delay[%d]min", new Object[] { Long.valueOf(p.this.gNC) });
            GMTrace.o(14444377669632L, 107619);
            return;
            label457:
            if (p.this.gNI != null)
            {
              at.xB().bQi().removeCallbacks(p.this.gNI);
              p.this.gNI = null;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan remove[%s]", new Object[] { p.this.gNJ });
              GMTrace.o(14444377669632L, 107619);
              return;
            }
            if (p.this.gNJ != null)
            {
              p.this.gNJ.gLX = true;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan canceled[%s]", new Object[] { p.this.gNJ });
              p.this.gNJ = null;
            }
            GMTrace.o(14444377669632L, 107619);
          }
        };
        localObject2 = new IntentFilter();
        ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_ON");
        ((IntentFilter)localObject2).addAction("android.intent.action.SCREEN_OFF");
        ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_CONNECTED");
        ((IntentFilter)localObject2).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        ((Context)localObject1).registerReceiver(this.gNE, (IntentFilter)localObject2);
        if (this.gNJ == null) {
          break label1637;
        }
        localObject1 = "enabled";
        label1511:
        if (!this.gNG) {
          break label1645;
        }
        localObject2 = "";
        label1523:
        if (!this.gNF) {
          break label1653;
        }
      }
      label1624:
      label1629:
      label1637:
      label1645:
      label1653:
      for (String str = "";; str = " not")
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv registerReceiver auto scan %s. Device status:%s interactive,%s charging mLastAutoScanTime[%d], mAutoScanInterval[%d], mAutoScanWaitTime[%d].", new Object[] { localObject1, localObject2, str, Long.valueOf(this.gNH), Long.valueOf(this.gNB * 60000L), Long.valueOf(this.gNC * 60000L) });
        this.gNP.stopTimer();
        GMTrace.o(397687128064L, 2963);
        return;
        bool = false;
        break;
        paramBoolean = false;
        break label1411;
        this.gNF = false;
        break label1416;
        localObject1 = "disabled";
        break label1511;
        localObject2 = " not";
        break label1523;
      }
      continue;
      paramBoolean = false;
      break;
      paramBoolean = false;
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(397821345792L, 2964);
    GMTrace.o(397821345792L, 2964);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(397552910336L, 2962);
    GMTrace.o(397552910336L, 2962);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(397955563520L, 2965);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv onAccountRelease [%d]", new Object[] { Long.valueOf(startTime), Long.valueOf(System.currentTimeMillis()) });
    if (this.gNE != null)
    {
      ab.getContext().unregisterReceiver(this.gNE);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver mChargeAndInteractiveReceiver[%s]", new Object[] { this.gNE });
      this.gNE = null;
    }
    if (this.gNI != null)
    {
      at.xB().bQi().removeCallbacks(this.gNI);
      this.gNI = null;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver remove[%s]", new Object[] { this.gNJ });
    }
    if (this.gNJ != null)
    {
      this.gNJ.gLX = true;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SubCoreBaseMonitor", "summerhv unregisterReceiver canceled[%s]", new Object[] { this.gNJ });
      this.gNJ = null;
    }
    at.wS().b(989, this.gNL);
    at.wS().b(988, this.gNL);
    at.wS().b(987, this.gNL);
    at.wS().b(986, this.gNL);
    com.tencent.mm.y.c.c.Ct().j(this.gqa);
    com.tencent.mm.sdk.b.a.vgX.c(this.gNO);
    GMTrace.o(397955563520L, 2965);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(397418692608L, 2961);
    GMTrace.o(397418692608L, 2961);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */