package com.tencent.mm.modelstat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.g.a.iw;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.axq;
import com.tencent.mm.protocal.c.axr;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.util.Comparator;
import java.util.HashMap;

public final class n
{
  private static aj euU;
  private static final byte[] gCf;
  private static long gZh;
  private static HashMap<String, Long> gZi;
  private static String gZj;
  public static long gZk;
  public static int gZl;
  public static long gZm;
  private static long gZn;
  private static float gZo;
  private static float gZp;
  private static int gZq;
  private static int gZr;
  private static long gZs;
  private static String gZt;
  
  static
  {
    GMTrace.i(1373315792896L, 10232);
    gZh = 86400000L;
    gZi = new HashMap();
    gZj = null;
    gCf = new byte[0];
    gZk = Long.MAX_VALUE;
    gZl = 0;
    euU = new aj(h.xB().ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(1400561991680L, 10435);
        try
        {
          n.gZk = Long.MAX_VALUE;
          if ((n.gZl < 2000) && (n.gZl > 1000)) {
            n.hi(n.gZl);
          }
          for (;;)
          {
            GMTrace.o(1400561991680L, 10435);
            return false;
            n.a(n.gZl, 0.0F, 0.0F, 0, 0L);
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.NetTypeReporter", "run :%s", new Object[] { bg.f(localException) });
          }
        }
      }
    }, false);
    gZm = 0L;
    gZn = 0L;
    gZo = 0.0F;
    gZp = 0.0F;
    gZq = 0;
    gZr = 0;
    gZs = 0L;
    gZt = "";
    GMTrace.o(1373315792896L, 10232);
  }
  
  private static long Mr()
  {
    GMTrace.i(1371705180160L, 10220);
    synchronized (gCf)
    {
      try
      {
        long l = bg.a((Long)h.xy().xh().get(w.a.vqB, null), 1L);
        h.xy().xh().a(w.a.vqB, Long.valueOf(1L + l));
        h.xy().xh().kL(true);
        w.i("MicroMsg.NetTypeReporter", "incSeq after write  old:%d new:%d", new Object[] { Long.valueOf(l), Long.valueOf(bg.a((Long)h.xy().xh().get(w.a.vqB, null), 1L)) });
        GMTrace.o(1371705180160L, 10220);
        return l;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.NetTypeReporter", "incSeq :%s", new Object[] { bg.f(localException) });
        GMTrace.o(1371705180160L, 10220);
        return -1L;
      }
    }
  }
  
  public static void a(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(1372376268800L, 10225);
        if ((paramInt1 < 2000) || (paramFloat1 == 0.0F) || (paramFloat2 == 0.0F))
        {
          w.e("MicroMsg.NetTypeReporter", "reportGps, invalid args, scene = %d, lon = %f, lat = %f, pre = %d", new Object[] { Integer.valueOf(paramInt1), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt2) });
          GMTrace.o(1372376268800L, 10225);
          return;
        }
        if (bg.aH(gZs) < 60000L)
        {
          w.e("MicroMsg.NetTypeReporter", "reportGps, hit lastReportGpsLimit, request dropped, scene = %d, lon = %f, lat = %f, pre = %d", new Object[] { Integer.valueOf(paramInt1), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt2) });
          GMTrace.o(1372376268800L, 10225);
          continue;
        }
      }
      finally {}
      tmp163_160[0] = Integer.valueOf(paramInt1);
      Object[] tmp170_163 = tmp163_160;
      tmp170_163[1] = Float.valueOf(paramFloat1);
      Object[] tmp177_170 = tmp170_163;
      tmp177_170[2] = Float.valueOf(paramFloat2);
      Object[] tmp184_177 = tmp177_170;
      tmp184_177[3] = Integer.valueOf(paramInt2);
      Object[] tmp191_184 = tmp184_177;
      tmp191_184[4] = Long.valueOf(bg.aH(gZs));
      w.i("MicroMsg.NetTypeReporter", "reportGps scene:%d lon:%f lat:%f pre:%d last:%d", tmp191_184);
      gZs = bg.Pv();
      gZr = paramInt1;
      gZn = bg.Pv();
      gZq = paramInt2;
      gZo = paramFloat2;
      gZp = paramFloat1;
      try
      {
        ((WifiManager)ab.getContext().getSystemService("wifi")).startScan();
        h.xB().h(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(1378147631104L, 10268);
            n.hj(1005);
            GMTrace.o(1378147631104L, 10268);
          }
        }, 5000L);
        GMTrace.o(1372376268800L, 10225);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.NetTypeReporter", "reportGps :%s", new Object[] { bg.f(localException) });
        GMTrace.o(1372376268800L, 10225);
      }
    }
  }
  
  public static void a(int paramInt1, final float paramFloat1, final float paramFloat2, final int paramInt2, final long paramLong)
  {
    GMTrace.i(1371839397888L, 10221);
    long l1 = bg.Pv();
    if ((gZm > 0L) && (l1 - gZm > 5000L))
    {
      w.e("MicroMsg.NetTypeReporter", "never  report  at  background :%d diff:%d", new Object[] { Long.valueOf(gZm), Long.valueOf(l1 - gZm) });
      GMTrace.o(1371839397888L, 10221);
      return;
    }
    final String[] arrayOfString = hh(paramInt1);
    if ((arrayOfString == null) || (arrayOfString.length != 4) || (bg.nm(arrayOfString[0])))
    {
      w.e("MicroMsg.NetTypeReporter", "report get failed val");
      GMTrace.o(1371839397888L, 10221);
      return;
    }
    w.d("MicroMsg.NetTypeReporter", "report scene:%d time:%d lon:%f lat:%f pre:%d scanuse:%d [%s]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(bg.aH(l1)), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt2), Long.valueOf(paramLong), arrayOfString[0] });
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new axq();
    ((b.a)localObject).gtG = new axr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rtkvreport";
    ((b.a)localObject).gtE = 716;
    com.tencent.mm.ad.b localb = ((b.a)localObject).DA();
    axq localaxq = (axq)localb.gtC.gtK;
    localaxq.tWD = d.tJw;
    localaxq.tWE = d.tJv;
    localaxq.tWF = d.tJy;
    localaxq.tWG = d.tJz;
    localaxq.tWH = v.bPK();
    localaxq.uzM = 11747;
    long l2 = bg.aH(gZm);
    if (l2 <= 600000L)
    {
      l1 = l2;
      if (l2 >= 0L) {}
    }
    else
    {
      l1 = 0L;
    }
    StringBuilder localStringBuilder = new StringBuilder().append(arrayOfString[0]).append("0,").append(paramFloat1).append(",").append(paramFloat2).append(",").append(paramInt2).append(",").append(paramLong).append(",");
    if (com.tencent.mm.sdk.a.b.foreground) {}
    for (localObject = "1";; localObject = String.valueOf(l1))
    {
      localaxq.oqQ = ((String)localObject + "," + arrayOfString[1] + "," + arrayOfString[2] + "," + arrayOfString[3]);
      u.a(localb, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(1386200694784L, 10328);
          w.d("MicroMsg.NetTypeReporter", "onGYNetEnd errType:%d errCode:%d msg:%s  %d val:%s ", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Long.valueOf(bg.aH(this.gZu)), arrayOfString.oqQ });
          long l1;
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            long l2 = bg.aH(n.gZm);
            if (l2 <= 600000L)
            {
              l1 = l2;
              if (l2 >= 0L) {}
            }
            else
            {
              l1 = 0L;
            }
            paramAnonymousb = g.ork;
            paramAnonymousk = new StringBuilder().append(paramFloat1[0]).append("1,").append(paramFloat2).append(",").append(paramInt2).append(",").append(paramLong).append(",").append(this.gZx).append(",");
            if (!com.tencent.mm.sdk.a.b.foreground) {
              break label273;
            }
          }
          label273:
          for (paramAnonymousString = "1";; paramAnonymousString = String.valueOf(l1))
          {
            paramAnonymousb.A(11747, paramAnonymousString + "," + paramFloat1[1] + "," + paramFloat1[2] + "," + paramFloat1[3]);
            h.xy().xh().a(w.a.vqC, Long.valueOf(bg.Pv()));
            GMTrace.o(1386200694784L, 10328);
            return 0;
          }
        }
      }, true);
      GMTrace.o(1371839397888L, 10221);
      return;
    }
  }
  
  private static void b(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, long paramLong)
  {
    GMTrace.i(1372107833344L, 10223);
    try
    {
      w.i("MicroMsg.NetTypeReporter", "checkTimeReport scene:%d diff:%d  time:%d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(bg.aH(gZk)), Long.valueOf(gZk) });
      if ((paramInt1 > 2000) || (bg.aH(gZk) > 300000L))
      {
        w.i("MicroMsg.NetTypeReporter", "force Run, scene:%d diff:%d time:%d ", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(bg.aH(gZk)), Long.valueOf(gZk) });
        gZl = paramInt1;
        gZk = Long.MAX_VALUE;
        a(paramInt1, paramFloat1, paramFloat2, paramInt2, paramLong);
        GMTrace.o(1372107833344L, 10223);
        return;
      }
      if (gZk == Long.MAX_VALUE) {
        gZk = bg.Pv() + 60000L;
      }
      gZl = paramInt1;
      euU.z(60000L, 60000L);
      GMTrace.o(1372107833344L, 10223);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.e("MicroMsg.NetTypeReporter", "checkTimeReport error: %s", new Object[] { bg.f(localThrowable) });
      GMTrace.o(1372107833344L, 10223);
    }
  }
  
  public static void bD(boolean paramBoolean)
  {
    GMTrace.i(1372242051072L, 10224);
    if (paramBoolean)
    {
      gZm = 0L;
      GMTrace.o(1372242051072L, 10224);
      return;
    }
    if (euU.bQn())
    {
      GMTrace.o(1372242051072L, 10224);
      return;
    }
    w.i("MicroMsg.NetTypeReporter", "setToForeground user turn to background run report now");
    gZm = bg.Pv();
    euU.z(0L, 0L);
    GMTrace.o(1372242051072L, 10224);
  }
  
  public static void bt(Context paramContext)
  {
    GMTrace.i(1371168309248L, 10216);
    if (paramContext == null) {}
    try
    {
      w.e("MicroMsg.NetTypeReporter", "registerReceiver ctx == null");
      GMTrace.o(1371168309248L, 10216);
      return;
    }
    catch (Throwable paramContext)
    {
      a locala;
      IntentFilter localIntentFilter;
      w.e("MicroMsg.NetTypeReporter", "registerReceiver : %s", new Object[] { bg.f(paramContext) });
      GMTrace.o(1371168309248L, 10216);
    }
    locala = new a((byte)0);
    localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.supplicant.CONNECTION_CHANGE");
    localIntentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.SCAN_RESULTS");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    paramContext.registerReceiver(locala, localIntentFilter);
    w.i("MicroMsg.NetTypeReporter", "registerReceiver finish");
    GMTrace.o(1371168309248L, 10216);
    return;
  }
  
  /* Error */
  private static boolean h(java.util.ArrayList<String> paramArrayList)
  {
    // Byte code:
    //   0: ldc2_w 458
    //   3: sipush 10217
    //   6: invokestatic 50	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokevirtual 465	java/util/ArrayList:size	()I
    //   13: ifne +22 -> 35
    //   16: ldc -89
    //   18: ldc_w 467
    //   21: invokestatic 470	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: ldc2_w 458
    //   27: sipush 10217
    //   30: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: iconst_0
    //   34: ireturn
    //   35: getstatic 63	com/tencent/mm/modelstat/n:gZj	Ljava/lang/String;
    //   38: invokestatic 255	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   41: ifeq +31 -> 72
    //   44: new 346	java/lang/StringBuilder
    //   47: dup
    //   48: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   51: invokestatic 129	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   54: getfield 473	com/tencent/mm/kernel/e:cachePath	Ljava/lang/String;
    //   57: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: ldc_w 475
    //   63: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: putstatic 63	com/tencent/mm/modelstat/n:gZj	Ljava/lang/String;
    //   72: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   75: invokevirtual 476	java/util/HashMap:size	()I
    //   78: ifne +129 -> 207
    //   81: new 478	java/io/FileInputStream
    //   84: dup
    //   85: getstatic 63	com/tencent/mm/modelstat/n:gZj	Ljava/lang/String;
    //   88: invokespecial 480	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   91: astore 5
    //   93: new 482	java/io/ObjectInputStream
    //   96: dup
    //   97: aload 5
    //   99: invokespecial 485	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   102: astore 4
    //   104: aload 4
    //   106: invokevirtual 489	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   109: checkcast 56	java/util/HashMap
    //   112: putstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   115: ldc -89
    //   117: ldc_w 491
    //   120: iconst_1
    //   121: anewarray 4	java/lang/Object
    //   124: dup
    //   125: iconst_0
    //   126: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   129: invokevirtual 476	java/util/HashMap:size	()I
    //   132: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   135: aastore
    //   136: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   139: aload 4
    //   141: invokevirtual 494	java/io/ObjectInputStream:close	()V
    //   144: aload 5
    //   146: invokevirtual 495	java/io/FileInputStream:close	()V
    //   149: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   152: invokevirtual 476	java/util/HashMap:size	()I
    //   155: ifle +15 -> 170
    //   158: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   161: invokevirtual 476	java/util/HashMap:size	()I
    //   164: sipush 1000
    //   167: if_icmple +40 -> 207
    //   170: ldc -89
    //   172: ldc_w 497
    //   175: iconst_2
    //   176: anewarray 4	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   184: invokevirtual 476	java/util/HashMap:size	()I
    //   187: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: getstatic 63	com/tencent/mm/modelstat/n:gZj	Ljava/lang/String;
    //   196: aastore
    //   197: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: getstatic 63	com/tencent/mm/modelstat/n:gZj	Ljava/lang/String;
    //   203: invokestatic 502	com/tencent/mm/loader/stub/b:deleteFile	(Ljava/lang/String;)Z
    //   206: pop
    //   207: aload_0
    //   208: invokevirtual 506	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   211: astore_0
    //   212: iconst_0
    //   213: istore_1
    //   214: aload_0
    //   215: invokeinterface 511 1 0
    //   220: ifeq +282 -> 502
    //   223: aload_0
    //   224: invokeinterface 514 1 0
    //   229: checkcast 388	java/lang/String
    //   232: astore 4
    //   234: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   237: aload 4
    //   239: invokevirtual 517	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   242: invokestatic 521	com/tencent/mm/sdk/platformtools/bg:bH	(Ljava/lang/Object;)J
    //   245: invokestatic 204	com/tencent/mm/sdk/platformtools/bg:aH	(J)J
    //   248: lstore_2
    //   249: ldc -89
    //   251: ldc_w 523
    //   254: iconst_2
    //   255: anewarray 4	java/lang/Object
    //   258: dup
    //   259: iconst_0
    //   260: aload 4
    //   262: aastore
    //   263: dup
    //   264: iconst_1
    //   265: lload_2
    //   266: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   269: aastore
    //   270: invokestatic 265	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: lload_2
    //   274: lconst_0
    //   275: lcmp
    //   276: ifle +11 -> 287
    //   279: lload_2
    //   280: getstatic 54	com/tencent/mm/modelstat/n:gZh	J
    //   283: lcmp
    //   284: ifle +20 -> 304
    //   287: iconst_1
    //   288: istore_1
    //   289: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   292: aload 4
    //   294: invokestatic 213	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   297: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   300: invokevirtual 527	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   303: pop
    //   304: goto -90 -> 214
    //   307: astore 4
    //   309: ldc -89
    //   311: ldc_w 529
    //   314: iconst_1
    //   315: anewarray 4	java/lang/Object
    //   318: dup
    //   319: iconst_0
    //   320: aload 4
    //   322: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   325: aastore
    //   326: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   329: new 56	java/util/HashMap
    //   332: dup
    //   333: invokespecial 59	java/util/HashMap:<init>	()V
    //   336: putstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   339: goto -190 -> 149
    //   342: astore 6
    //   344: aconst_null
    //   345: astore 5
    //   347: aconst_null
    //   348: astore 4
    //   350: ldc -89
    //   352: ldc_w 529
    //   355: iconst_1
    //   356: anewarray 4	java/lang/Object
    //   359: dup
    //   360: iconst_0
    //   361: aload 6
    //   363: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   366: aastore
    //   367: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   370: new 56	java/util/HashMap
    //   373: dup
    //   374: invokespecial 59	java/util/HashMap:<init>	()V
    //   377: putstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   380: aload 4
    //   382: ifnull +8 -> 390
    //   385: aload 4
    //   387: invokevirtual 494	java/io/ObjectInputStream:close	()V
    //   390: aload 5
    //   392: ifnull -243 -> 149
    //   395: aload 5
    //   397: invokevirtual 495	java/io/FileInputStream:close	()V
    //   400: goto -251 -> 149
    //   403: astore 4
    //   405: ldc -89
    //   407: ldc_w 529
    //   410: iconst_1
    //   411: anewarray 4	java/lang/Object
    //   414: dup
    //   415: iconst_0
    //   416: aload 4
    //   418: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   421: aastore
    //   422: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   425: new 56	java/util/HashMap
    //   428: dup
    //   429: invokespecial 59	java/util/HashMap:<init>	()V
    //   432: putstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   435: goto -286 -> 149
    //   438: astore_0
    //   439: aconst_null
    //   440: astore 5
    //   442: aconst_null
    //   443: astore 4
    //   445: aload 4
    //   447: ifnull +8 -> 455
    //   450: aload 4
    //   452: invokevirtual 494	java/io/ObjectInputStream:close	()V
    //   455: aload 5
    //   457: ifnull +8 -> 465
    //   460: aload 5
    //   462: invokevirtual 495	java/io/FileInputStream:close	()V
    //   465: aload_0
    //   466: athrow
    //   467: astore 4
    //   469: ldc -89
    //   471: ldc_w 529
    //   474: iconst_1
    //   475: anewarray 4	java/lang/Object
    //   478: dup
    //   479: iconst_0
    //   480: aload 4
    //   482: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   485: aastore
    //   486: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   489: new 56	java/util/HashMap
    //   492: dup
    //   493: invokespecial 59	java/util/HashMap:<init>	()V
    //   496: putstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   499: goto -34 -> 465
    //   502: iload_1
    //   503: ifeq +79 -> 582
    //   506: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   509: invokevirtual 476	java/util/HashMap:size	()I
    //   512: ifle +70 -> 582
    //   515: new 531	java/io/FileOutputStream
    //   518: dup
    //   519: getstatic 63	com/tencent/mm/modelstat/n:gZj	Ljava/lang/String;
    //   522: invokespecial 532	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   525: astore 5
    //   527: new 534	java/io/ObjectOutputStream
    //   530: dup
    //   531: aload 5
    //   533: invokespecial 537	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   536: astore_0
    //   537: aload_0
    //   538: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   541: invokevirtual 541	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   544: aload 5
    //   546: invokevirtual 544	java/io/FileOutputStream:flush	()V
    //   549: ldc -89
    //   551: ldc_w 546
    //   554: iconst_1
    //   555: anewarray 4	java/lang/Object
    //   558: dup
    //   559: iconst_0
    //   560: getstatic 61	com/tencent/mm/modelstat/n:gZi	Ljava/util/HashMap;
    //   563: invokevirtual 476	java/util/HashMap:size	()I
    //   566: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   569: aastore
    //   570: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   573: aload_0
    //   574: invokevirtual 547	java/io/ObjectOutputStream:close	()V
    //   577: aload 5
    //   579: invokevirtual 548	java/io/FileOutputStream:close	()V
    //   582: ldc2_w 458
    //   585: sipush 10217
    //   588: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   591: iload_1
    //   592: ireturn
    //   593: astore_0
    //   594: ldc -89
    //   596: ldc_w 550
    //   599: iconst_1
    //   600: anewarray 4	java/lang/Object
    //   603: dup
    //   604: iconst_0
    //   605: aload_0
    //   606: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   609: aastore
    //   610: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   613: goto -31 -> 582
    //   616: astore 5
    //   618: aconst_null
    //   619: astore 4
    //   621: aconst_null
    //   622: astore_0
    //   623: ldc -89
    //   625: ldc_w 550
    //   628: iconst_1
    //   629: anewarray 4	java/lang/Object
    //   632: dup
    //   633: iconst_0
    //   634: aload 5
    //   636: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   639: aastore
    //   640: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   643: aload_0
    //   644: ifnull +7 -> 651
    //   647: aload_0
    //   648: invokevirtual 547	java/io/ObjectOutputStream:close	()V
    //   651: aload 4
    //   653: ifnull -71 -> 582
    //   656: aload 4
    //   658: invokevirtual 548	java/io/FileOutputStream:close	()V
    //   661: goto -79 -> 582
    //   664: astore_0
    //   665: ldc -89
    //   667: ldc_w 550
    //   670: iconst_1
    //   671: anewarray 4	java/lang/Object
    //   674: dup
    //   675: iconst_0
    //   676: aload_0
    //   677: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   680: aastore
    //   681: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   684: goto -102 -> 582
    //   687: astore 4
    //   689: aconst_null
    //   690: astore 5
    //   692: aconst_null
    //   693: astore_0
    //   694: aload_0
    //   695: ifnull +7 -> 702
    //   698: aload_0
    //   699: invokevirtual 547	java/io/ObjectOutputStream:close	()V
    //   702: aload 5
    //   704: ifnull +8 -> 712
    //   707: aload 5
    //   709: invokevirtual 548	java/io/FileOutputStream:close	()V
    //   712: aload 4
    //   714: athrow
    //   715: astore_0
    //   716: ldc -89
    //   718: ldc_w 550
    //   721: iconst_1
    //   722: anewarray 4	java/lang/Object
    //   725: dup
    //   726: iconst_0
    //   727: aload_0
    //   728: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   731: aastore
    //   732: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   735: goto -23 -> 712
    //   738: astore 4
    //   740: aconst_null
    //   741: astore_0
    //   742: goto -48 -> 694
    //   745: astore 4
    //   747: goto -53 -> 694
    //   750: astore 6
    //   752: aload 4
    //   754: astore 5
    //   756: aload 6
    //   758: astore 4
    //   760: goto -66 -> 694
    //   763: astore 6
    //   765: aconst_null
    //   766: astore_0
    //   767: aload 5
    //   769: astore 4
    //   771: aload 6
    //   773: astore 5
    //   775: goto -152 -> 623
    //   778: astore 6
    //   780: aload 5
    //   782: astore 4
    //   784: aload 6
    //   786: astore 5
    //   788: goto -165 -> 623
    //   791: astore_0
    //   792: aconst_null
    //   793: astore 4
    //   795: goto -350 -> 445
    //   798: astore_0
    //   799: goto -354 -> 445
    //   802: astore_0
    //   803: goto -358 -> 445
    //   806: astore 6
    //   808: aconst_null
    //   809: astore 4
    //   811: goto -461 -> 350
    //   814: astore 6
    //   816: goto -466 -> 350
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	819	0	paramArrayList	java.util.ArrayList<String>
    //   213	379	1	bool	boolean
    //   248	32	2	l	long
    //   102	191	4	localObject1	Object
    //   307	14	4	localException1	Exception
    //   348	38	4	localObject2	Object
    //   403	14	4	localException2	Exception
    //   443	8	4	localObject3	Object
    //   467	14	4	localException3	Exception
    //   619	38	4	localObject4	Object
    //   687	26	4	localObject5	Object
    //   738	1	4	localObject6	Object
    //   745	8	4	localObject7	Object
    //   758	52	4	localObject8	Object
    //   91	487	5	localObject9	Object
    //   616	19	5	localException4	Exception
    //   690	97	5	localObject10	Object
    //   342	20	6	localException5	Exception
    //   750	7	6	localObject11	Object
    //   763	9	6	localException6	Exception
    //   778	7	6	localException7	Exception
    //   806	1	6	localException8	Exception
    //   814	1	6	localException9	Exception
    // Exception table:
    //   from	to	target	type
    //   139	149	307	java/lang/Exception
    //   81	93	342	java/lang/Exception
    //   385	390	403	java/lang/Exception
    //   395	400	403	java/lang/Exception
    //   81	93	438	finally
    //   450	455	467	java/lang/Exception
    //   460	465	467	java/lang/Exception
    //   573	582	593	java/lang/Exception
    //   515	527	616	java/lang/Exception
    //   647	651	664	java/lang/Exception
    //   656	661	664	java/lang/Exception
    //   515	527	687	finally
    //   698	702	715	java/lang/Exception
    //   707	712	715	java/lang/Exception
    //   527	537	738	finally
    //   537	573	745	finally
    //   623	643	750	finally
    //   527	537	763	java/lang/Exception
    //   537	573	778	java/lang/Exception
    //   93	104	791	finally
    //   104	139	798	finally
    //   350	380	802	finally
    //   93	104	806	java/lang/Exception
    //   104	139	814	java/lang/Exception
  }
  
  /* Error */
  private static String[] hh(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 553
    //   3: sipush 10218
    //   6: invokestatic 50	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc -89
    //   11: ldc_w 556
    //   14: iconst_4
    //   15: anewarray 4	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: iload_0
    //   21: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: getstatic 370	com/tencent/mm/sdk/a/b:foreground	Z
    //   30: invokestatic 561	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   33: aastore
    //   34: dup
    //   35: iconst_2
    //   36: getstatic 99	com/tencent/mm/modelstat/n:gZm	J
    //   39: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   42: aastore
    //   43: dup
    //   44: iconst_3
    //   45: getstatic 99	com/tencent/mm/modelstat/n:gZm	J
    //   48: invokestatic 204	com/tencent/mm/sdk/platformtools/bg:aH	(J)J
    //   51: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   54: aastore
    //   55: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: iload_0
    //   59: ifgt +33 -> 92
    //   62: ldc -89
    //   64: ldc_w 563
    //   67: iconst_1
    //   68: anewarray 4	java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: iload_0
    //   74: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   77: aastore
    //   78: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: ldc2_w 553
    //   84: sipush 10218
    //   87: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   90: aconst_null
    //   91: areturn
    //   92: invokestatic 219	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   95: astore 21
    //   97: aload 21
    //   99: ifnonnull +33 -> 132
    //   102: ldc -89
    //   104: ldc_w 565
    //   107: iconst_1
    //   108: anewarray 4	java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: iload_0
    //   114: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   117: aastore
    //   118: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: ldc2_w 553
    //   124: sipush 10218
    //   127: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   130: aconst_null
    //   131: areturn
    //   132: ldc -89
    //   134: ldc_w 567
    //   137: iconst_2
    //   138: anewarray 4	java/lang/Object
    //   141: dup
    //   142: iconst_0
    //   143: iload_0
    //   144: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   147: aastore
    //   148: dup
    //   149: iconst_1
    //   150: getstatic 370	com/tencent/mm/sdk/a/b:foreground	Z
    //   153: invokestatic 561	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   156: aastore
    //   157: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: invokestatic 572	com/tencent/mm/compatible/d/v:tq	()I
    //   163: istore_2
    //   164: ldc -89
    //   166: ldc_w 574
    //   169: iconst_1
    //   170: anewarray 4	java/lang/Object
    //   173: dup
    //   174: iconst_0
    //   175: iload_2
    //   176: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   179: aastore
    //   180: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: ldc 113
    //   185: astore 10
    //   187: ldc 113
    //   189: astore 9
    //   191: ldc 113
    //   193: astore 17
    //   195: aload 9
    //   197: astore 7
    //   199: aload 10
    //   201: astore 8
    //   203: aload 21
    //   205: ldc -35
    //   207: invokevirtual 227	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   210: checkcast 229	android/net/wifi/WifiManager
    //   213: astore 16
    //   215: aload 9
    //   217: astore 7
    //   219: aload 10
    //   221: astore 8
    //   223: aload 16
    //   225: invokevirtual 578	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   228: astore 15
    //   230: aload 9
    //   232: astore 7
    //   234: aload 10
    //   236: astore 8
    //   238: new 580	java/lang/StringBuffer
    //   241: dup
    //   242: invokespecial 581	java/lang/StringBuffer:<init>	()V
    //   245: astore 13
    //   247: aload 9
    //   249: astore 7
    //   251: aload 10
    //   253: astore 8
    //   255: new 580	java/lang/StringBuffer
    //   258: dup
    //   259: invokespecial 581	java/lang/StringBuffer:<init>	()V
    //   262: astore 12
    //   264: aload 9
    //   266: astore 7
    //   268: aload 10
    //   270: astore 8
    //   272: new 580	java/lang/StringBuffer
    //   275: dup
    //   276: invokespecial 581	java/lang/StringBuffer:<init>	()V
    //   279: astore 11
    //   281: iconst_0
    //   282: istore 4
    //   284: iconst_0
    //   285: istore_1
    //   286: aload 9
    //   288: astore 7
    //   290: aload 10
    //   292: astore 8
    //   294: new 461	java/util/ArrayList
    //   297: dup
    //   298: invokespecial 582	java/util/ArrayList:<init>	()V
    //   301: astore 14
    //   303: aload 9
    //   305: astore 7
    //   307: aload 10
    //   309: astore 8
    //   311: aload 13
    //   313: aload 15
    //   315: invokevirtual 587	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   318: invokevirtual 590	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   321: pop
    //   322: aload 9
    //   324: astore 7
    //   326: aload 10
    //   328: astore 8
    //   330: aload 12
    //   332: aload 15
    //   334: invokevirtual 593	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   337: invokevirtual 590	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   340: pop
    //   341: aload 9
    //   343: astore 7
    //   345: aload 10
    //   347: astore 8
    //   349: aload 15
    //   351: invokevirtual 593	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   354: astore 15
    //   356: aload 9
    //   358: astore 7
    //   360: aload 10
    //   362: astore 8
    //   364: aload 14
    //   366: aload 15
    //   368: invokevirtual 597	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   371: pop
    //   372: aload 9
    //   374: astore 7
    //   376: aload 10
    //   378: astore 8
    //   380: aload 16
    //   382: invokevirtual 601	android/net/wifi/WifiManager:getScanResults	()Ljava/util/List;
    //   385: astore 16
    //   387: aload 16
    //   389: ifnull +352 -> 741
    //   392: aload 9
    //   394: astore 7
    //   396: aload 10
    //   398: astore 8
    //   400: aload 16
    //   402: new 6	com/tencent/mm/modelstat/n$1
    //   405: dup
    //   406: invokespecial 602	com/tencent/mm/modelstat/n$1:<init>	()V
    //   409: invokestatic 608	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
    //   412: aload 9
    //   414: astore 7
    //   416: aload 10
    //   418: astore 8
    //   420: aload 16
    //   422: invokeinterface 611 1 0
    //   427: astore 16
    //   429: bipush 20
    //   431: istore_3
    //   432: iload_1
    //   433: istore 4
    //   435: aload 9
    //   437: astore 7
    //   439: aload 10
    //   441: astore 8
    //   443: aload 16
    //   445: invokeinterface 511 1 0
    //   450: ifeq +291 -> 741
    //   453: aload 9
    //   455: astore 7
    //   457: aload 10
    //   459: astore 8
    //   461: aload 16
    //   463: invokeinterface 514 1 0
    //   468: checkcast 613	android/net/wifi/ScanResult
    //   471: astore 18
    //   473: aload 18
    //   475: ifnull -43 -> 432
    //   478: aload 9
    //   480: astore 7
    //   482: aload 10
    //   484: astore 8
    //   486: aload 18
    //   488: getfield 616	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   491: invokestatic 255	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   494: ifne -62 -> 432
    //   497: aload 9
    //   499: astore 7
    //   501: aload 10
    //   503: astore 8
    //   505: aload 18
    //   507: getfield 616	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   510: aload 15
    //   512: invokevirtual 619	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   515: ifeq +47 -> 562
    //   518: aload 9
    //   520: astore 7
    //   522: aload 10
    //   524: astore 8
    //   526: aload 18
    //   528: getfield 622	android/net/wifi/ScanResult:level	I
    //   531: istore_1
    //   532: goto -100 -> 432
    //   535: astore 7
    //   537: ldc -89
    //   539: ldc_w 624
    //   542: iconst_1
    //   543: anewarray 4	java/lang/Object
    //   546: dup
    //   547: iconst_0
    //   548: aload 7
    //   550: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   553: aastore
    //   554: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   557: iconst_0
    //   558: istore_2
    //   559: goto -395 -> 164
    //   562: iload_1
    //   563: istore 4
    //   565: iload_3
    //   566: ifle +175 -> 741
    //   569: aload 9
    //   571: astore 7
    //   573: aload 10
    //   575: astore 8
    //   577: aload 13
    //   579: ldc_w 626
    //   582: invokevirtual 590	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   585: pop
    //   586: aload 9
    //   588: astore 7
    //   590: aload 10
    //   592: astore 8
    //   594: aload 13
    //   596: aload 18
    //   598: getfield 629	android/net/wifi/ScanResult:SSID	Ljava/lang/String;
    //   601: invokestatic 633	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   604: ldc_w 626
    //   607: ldc 113
    //   609: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   612: ldc_w 639
    //   615: ldc 113
    //   617: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   620: invokevirtual 590	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   623: pop
    //   624: aload 9
    //   626: astore 7
    //   628: aload 10
    //   630: astore 8
    //   632: aload 12
    //   634: ldc_w 626
    //   637: invokevirtual 590	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   640: pop
    //   641: aload 9
    //   643: astore 7
    //   645: aload 10
    //   647: astore 8
    //   649: aload 12
    //   651: aload 18
    //   653: getfield 616	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   656: invokestatic 633	com/tencent/mm/sdk/platformtools/bg:nl	(Ljava/lang/String;)Ljava/lang/String;
    //   659: ldc_w 626
    //   662: ldc 113
    //   664: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   667: ldc_w 639
    //   670: ldc 113
    //   672: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   675: invokevirtual 590	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   678: pop
    //   679: aload 9
    //   681: astore 7
    //   683: aload 10
    //   685: astore 8
    //   687: aload 14
    //   689: aload 18
    //   691: getfield 616	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   694: invokevirtual 597	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   697: pop
    //   698: aload 9
    //   700: astore 7
    //   702: aload 10
    //   704: astore 8
    //   706: aload 11
    //   708: ldc_w 626
    //   711: invokevirtual 590	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   714: pop
    //   715: aload 9
    //   717: astore 7
    //   719: aload 10
    //   721: astore 8
    //   723: aload 11
    //   725: aload 18
    //   727: getfield 622	android/net/wifi/ScanResult:level	I
    //   730: invokevirtual 642	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   733: pop
    //   734: iload_3
    //   735: iconst_1
    //   736: isub
    //   737: istore_3
    //   738: goto -306 -> 432
    //   741: iload_0
    //   742: sipush 2000
    //   745: if_icmpge +57 -> 802
    //   748: aload 9
    //   750: astore 7
    //   752: aload 10
    //   754: astore 8
    //   756: aload 14
    //   758: invokestatic 644	com/tencent/mm/modelstat/n:h	(Ljava/util/ArrayList;)Z
    //   761: ifne +41 -> 802
    //   764: aload 9
    //   766: astore 7
    //   768: aload 10
    //   770: astore 8
    //   772: ldc -89
    //   774: ldc_w 646
    //   777: iconst_1
    //   778: anewarray 4	java/lang/Object
    //   781: dup
    //   782: iconst_0
    //   783: iload_0
    //   784: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   787: aastore
    //   788: invokestatic 648	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   791: ldc2_w 553
    //   794: sipush 10218
    //   797: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   800: aconst_null
    //   801: areturn
    //   802: aload 9
    //   804: astore 7
    //   806: aload 10
    //   808: astore 8
    //   810: aload 13
    //   812: invokevirtual 649	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   815: astore 19
    //   817: aload 9
    //   819: astore 7
    //   821: aload 19
    //   823: astore 8
    //   825: aload 12
    //   827: invokevirtual 649	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   830: astore 18
    //   832: aload 18
    //   834: astore 7
    //   836: aload 19
    //   838: astore 8
    //   840: new 346	java/lang/StringBuilder
    //   843: dup
    //   844: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   847: iload 4
    //   849: invokevirtual 361	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   852: aload 11
    //   854: invokevirtual 649	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   857: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   860: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   863: astore 9
    //   865: aload 9
    //   867: astore 17
    //   869: ldc -89
    //   871: ldc_w 651
    //   874: iconst_2
    //   875: anewarray 4	java/lang/Object
    //   878: dup
    //   879: iconst_0
    //   880: aload 18
    //   882: aastore
    //   883: dup
    //   884: iconst_1
    //   885: aload 19
    //   887: aastore
    //   888: invokestatic 265	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   891: ldc 113
    //   893: astore 20
    //   895: aload 21
    //   897: ldc_w 653
    //   900: invokevirtual 227	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   903: checkcast 655	android/telephony/TelephonyManager
    //   906: astore 7
    //   908: aload 7
    //   910: ifnull +1265 -> 2175
    //   913: aload 7
    //   915: invokevirtual 658	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   918: astore 7
    //   920: aload 7
    //   922: astore 20
    //   924: ldc -89
    //   926: ldc_w 660
    //   929: iconst_1
    //   930: anewarray 4	java/lang/Object
    //   933: dup
    //   934: iconst_0
    //   935: aload 20
    //   937: aastore
    //   938: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   941: ldc 113
    //   943: astore 15
    //   945: ldc 113
    //   947: astore 16
    //   949: ldc 113
    //   951: astore 11
    //   953: ldc 113
    //   955: astore 10
    //   957: ldc 113
    //   959: astore 9
    //   961: aload 9
    //   963: astore 14
    //   965: aload 10
    //   967: astore 8
    //   969: aload 11
    //   971: astore 7
    //   973: aload 16
    //   975: astore 13
    //   977: aload 15
    //   979: astore 12
    //   981: aload 21
    //   983: invokestatic 666	com/tencent/mm/sdk/platformtools/am:ez	(Landroid/content/Context;)Ljava/util/List;
    //   986: astore 22
    //   988: iconst_0
    //   989: istore_1
    //   990: aload 9
    //   992: astore 14
    //   994: aload 10
    //   996: astore 8
    //   998: aload 11
    //   1000: astore 7
    //   1002: aload 16
    //   1004: astore 13
    //   1006: aload 15
    //   1008: astore 12
    //   1010: iload_1
    //   1011: aload 22
    //   1013: invokeinterface 667 1 0
    //   1018: if_icmpge +756 -> 1774
    //   1021: aload 9
    //   1023: astore 14
    //   1025: aload 10
    //   1027: astore 8
    //   1029: aload 11
    //   1031: astore 7
    //   1033: aload 16
    //   1035: astore 13
    //   1037: aload 15
    //   1039: astore 12
    //   1041: aload 22
    //   1043: iload_1
    //   1044: invokeinterface 670 2 0
    //   1049: checkcast 672	com/tencent/mm/sdk/platformtools/am$a
    //   1052: astore 23
    //   1054: aload 9
    //   1056: astore 14
    //   1058: aload 10
    //   1060: astore 8
    //   1062: aload 11
    //   1064: astore 7
    //   1066: aload 16
    //   1068: astore 13
    //   1070: aload 15
    //   1072: astore 12
    //   1074: aload 23
    //   1076: getfield 675	com/tencent/mm/sdk/platformtools/am$a:vjH	Ljava/lang/String;
    //   1079: ldc 113
    //   1081: invokestatic 679	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1084: astore 21
    //   1086: aload 9
    //   1088: astore 14
    //   1090: aload 10
    //   1092: astore 8
    //   1094: aload 11
    //   1096: astore 7
    //   1098: aload 16
    //   1100: astore 13
    //   1102: aload 21
    //   1104: astore 12
    //   1106: aload 23
    //   1108: getfield 682	com/tencent/mm/sdk/platformtools/am$a:vjI	Ljava/lang/String;
    //   1111: ldc 113
    //   1113: invokestatic 679	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1116: astore 16
    //   1118: aload 11
    //   1120: astore 15
    //   1122: aload 9
    //   1124: astore 14
    //   1126: aload 10
    //   1128: astore 8
    //   1130: aload 11
    //   1132: astore 7
    //   1134: aload 16
    //   1136: astore 13
    //   1138: aload 21
    //   1140: astore 12
    //   1142: aload 11
    //   1144: invokevirtual 685	java/lang/String:length	()I
    //   1147: ifle +81 -> 1228
    //   1150: aload 11
    //   1152: astore 15
    //   1154: aload 9
    //   1156: astore 14
    //   1158: aload 10
    //   1160: astore 8
    //   1162: aload 11
    //   1164: astore 7
    //   1166: aload 16
    //   1168: astore 13
    //   1170: aload 21
    //   1172: astore 12
    //   1174: aload 23
    //   1176: getfield 688	com/tencent/mm/sdk/platformtools/am$a:vjK	Ljava/lang/String;
    //   1179: invokestatic 255	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   1182: ifne +46 -> 1228
    //   1185: aload 9
    //   1187: astore 14
    //   1189: aload 10
    //   1191: astore 8
    //   1193: aload 11
    //   1195: astore 7
    //   1197: aload 16
    //   1199: astore 13
    //   1201: aload 21
    //   1203: astore 12
    //   1205: new 346	java/lang/StringBuilder
    //   1208: dup
    //   1209: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   1212: aload 11
    //   1214: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1217: ldc_w 626
    //   1220: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1223: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1226: astore 15
    //   1228: aload 15
    //   1230: astore 11
    //   1232: aload 9
    //   1234: astore 14
    //   1236: aload 10
    //   1238: astore 8
    //   1240: aload 15
    //   1242: astore 7
    //   1244: aload 16
    //   1246: astore 13
    //   1248: aload 21
    //   1250: astore 12
    //   1252: aload 23
    //   1254: getfield 688	com/tencent/mm/sdk/platformtools/am$a:vjK	Ljava/lang/String;
    //   1257: invokestatic 255	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   1260: ifne +48 -> 1308
    //   1263: aload 9
    //   1265: astore 14
    //   1267: aload 10
    //   1269: astore 8
    //   1271: aload 15
    //   1273: astore 7
    //   1275: aload 16
    //   1277: astore 13
    //   1279: aload 21
    //   1281: astore 12
    //   1283: new 346	java/lang/StringBuilder
    //   1286: dup
    //   1287: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   1290: aload 15
    //   1292: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1295: aload 23
    //   1297: getfield 688	com/tencent/mm/sdk/platformtools/am$a:vjK	Ljava/lang/String;
    //   1300: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1303: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1306: astore 11
    //   1308: aload 10
    //   1310: astore 15
    //   1312: aload 9
    //   1314: astore 14
    //   1316: aload 10
    //   1318: astore 8
    //   1320: aload 11
    //   1322: astore 7
    //   1324: aload 16
    //   1326: astore 13
    //   1328: aload 21
    //   1330: astore 12
    //   1332: aload 10
    //   1334: invokevirtual 685	java/lang/String:length	()I
    //   1337: ifle +81 -> 1418
    //   1340: aload 10
    //   1342: astore 15
    //   1344: aload 9
    //   1346: astore 14
    //   1348: aload 10
    //   1350: astore 8
    //   1352: aload 11
    //   1354: astore 7
    //   1356: aload 16
    //   1358: astore 13
    //   1360: aload 21
    //   1362: astore 12
    //   1364: aload 23
    //   1366: getfield 691	com/tencent/mm/sdk/platformtools/am$a:vjJ	Ljava/lang/String;
    //   1369: invokestatic 255	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   1372: ifne +46 -> 1418
    //   1375: aload 9
    //   1377: astore 14
    //   1379: aload 10
    //   1381: astore 8
    //   1383: aload 11
    //   1385: astore 7
    //   1387: aload 16
    //   1389: astore 13
    //   1391: aload 21
    //   1393: astore 12
    //   1395: new 346	java/lang/StringBuilder
    //   1398: dup
    //   1399: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   1402: aload 10
    //   1404: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1407: ldc_w 626
    //   1410: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1413: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1416: astore 15
    //   1418: aload 15
    //   1420: astore 10
    //   1422: aload 9
    //   1424: astore 14
    //   1426: aload 15
    //   1428: astore 8
    //   1430: aload 11
    //   1432: astore 7
    //   1434: aload 16
    //   1436: astore 13
    //   1438: aload 21
    //   1440: astore 12
    //   1442: aload 23
    //   1444: getfield 691	com/tencent/mm/sdk/platformtools/am$a:vjJ	Ljava/lang/String;
    //   1447: invokestatic 255	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   1450: ifne +48 -> 1498
    //   1453: aload 9
    //   1455: astore 14
    //   1457: aload 15
    //   1459: astore 8
    //   1461: aload 11
    //   1463: astore 7
    //   1465: aload 16
    //   1467: astore 13
    //   1469: aload 21
    //   1471: astore 12
    //   1473: new 346	java/lang/StringBuilder
    //   1476: dup
    //   1477: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   1480: aload 15
    //   1482: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1485: aload 23
    //   1487: getfield 691	com/tencent/mm/sdk/platformtools/am$a:vjJ	Ljava/lang/String;
    //   1490: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1493: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1496: astore 10
    //   1498: aload 9
    //   1500: astore 15
    //   1502: aload 9
    //   1504: astore 14
    //   1506: aload 10
    //   1508: astore 8
    //   1510: aload 11
    //   1512: astore 7
    //   1514: aload 16
    //   1516: astore 13
    //   1518: aload 21
    //   1520: astore 12
    //   1522: aload 9
    //   1524: invokevirtual 685	java/lang/String:length	()I
    //   1527: ifle +46 -> 1573
    //   1530: aload 9
    //   1532: astore 14
    //   1534: aload 10
    //   1536: astore 8
    //   1538: aload 11
    //   1540: astore 7
    //   1542: aload 16
    //   1544: astore 13
    //   1546: aload 21
    //   1548: astore 12
    //   1550: new 346	java/lang/StringBuilder
    //   1553: dup
    //   1554: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   1557: aload 9
    //   1559: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1562: ldc_w 626
    //   1565: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1568: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1571: astore 15
    //   1573: aload 15
    //   1575: astore 14
    //   1577: aload 10
    //   1579: astore 8
    //   1581: aload 11
    //   1583: astore 7
    //   1585: aload 16
    //   1587: astore 13
    //   1589: aload 21
    //   1591: astore 12
    //   1593: new 346	java/lang/StringBuilder
    //   1596: dup
    //   1597: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   1600: aload 15
    //   1602: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1605: astore 24
    //   1607: aload 15
    //   1609: astore 14
    //   1611: aload 10
    //   1613: astore 8
    //   1615: aload 11
    //   1617: astore 7
    //   1619: aload 16
    //   1621: astore 13
    //   1623: aload 21
    //   1625: astore 12
    //   1627: aload 23
    //   1629: getfield 694	com/tencent/mm/sdk/platformtools/am$a:vjN	Ljava/lang/String;
    //   1632: invokestatic 255	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   1635: ifeq +109 -> 1744
    //   1638: ldc_w 696
    //   1641: astore 9
    //   1643: aload 15
    //   1645: astore 14
    //   1647: aload 10
    //   1649: astore 8
    //   1651: aload 11
    //   1653: astore 7
    //   1655: aload 16
    //   1657: astore 13
    //   1659: aload 21
    //   1661: astore 12
    //   1663: aload 24
    //   1665: aload 9
    //   1667: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1670: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1673: astore 9
    //   1675: iload_1
    //   1676: iconst_1
    //   1677: iadd
    //   1678: istore_1
    //   1679: aload 21
    //   1681: astore 15
    //   1683: goto -693 -> 990
    //   1686: astore 9
    //   1688: ldc -89
    //   1690: ldc_w 698
    //   1693: iconst_1
    //   1694: anewarray 4	java/lang/Object
    //   1697: dup
    //   1698: iconst_0
    //   1699: aload 9
    //   1701: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1704: aastore
    //   1705: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1708: aload 7
    //   1710: astore 18
    //   1712: aload 8
    //   1714: astore 19
    //   1716: goto -847 -> 869
    //   1719: astore 7
    //   1721: ldc -89
    //   1723: ldc_w 624
    //   1726: iconst_1
    //   1727: anewarray 4	java/lang/Object
    //   1730: dup
    //   1731: iconst_0
    //   1732: aload 7
    //   1734: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1737: aastore
    //   1738: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1741: goto -817 -> 924
    //   1744: aload 15
    //   1746: astore 14
    //   1748: aload 10
    //   1750: astore 8
    //   1752: aload 11
    //   1754: astore 7
    //   1756: aload 16
    //   1758: astore 13
    //   1760: aload 21
    //   1762: astore 12
    //   1764: aload 23
    //   1766: getfield 694	com/tencent/mm/sdk/platformtools/am$a:vjN	Ljava/lang/String;
    //   1769: astore 9
    //   1771: goto -128 -> 1643
    //   1774: aload 10
    //   1776: astore 7
    //   1778: aload 11
    //   1780: astore 8
    //   1782: aload 16
    //   1784: astore 10
    //   1786: aload 15
    //   1788: astore 11
    //   1790: ldc -89
    //   1792: ldc_w 700
    //   1795: iconst_3
    //   1796: anewarray 4	java/lang/Object
    //   1799: dup
    //   1800: iconst_0
    //   1801: aload 11
    //   1803: aastore
    //   1804: dup
    //   1805: iconst_1
    //   1806: aload 10
    //   1808: aastore
    //   1809: dup
    //   1810: iconst_2
    //   1811: aload 8
    //   1813: aastore
    //   1814: invokestatic 265	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1817: new 346	java/lang/StringBuilder
    //   1820: dup
    //   1821: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   1824: astore 12
    //   1826: aload 12
    //   1828: invokestatic 703	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   1831: invokevirtual 364	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1834: ldc_w 358
    //   1837: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1840: pop
    //   1841: aload 12
    //   1843: iload_0
    //   1844: invokevirtual 361	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1847: ldc_w 358
    //   1850: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1853: pop
    //   1854: aload 12
    //   1856: iload_2
    //   1857: invokevirtual 361	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1860: ldc_w 358
    //   1863: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1866: pop
    //   1867: aload 12
    //   1869: aload 19
    //   1871: ldc_w 358
    //   1874: ldc_w 639
    //   1877: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1880: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1883: ldc_w 358
    //   1886: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1889: pop
    //   1890: aload 12
    //   1892: aload 18
    //   1894: ldc_w 358
    //   1897: ldc_w 639
    //   1900: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1903: invokestatic 706	com/tencent/mm/modelstat/n:lF	(Ljava/lang/String;)Ljava/lang/String;
    //   1906: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1909: ldc_w 358
    //   1912: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1915: pop
    //   1916: aload 12
    //   1918: aload 20
    //   1920: ldc_w 358
    //   1923: ldc_w 639
    //   1926: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1929: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1932: ldc_w 358
    //   1935: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1938: pop
    //   1939: aload 12
    //   1941: aload 11
    //   1943: ldc_w 358
    //   1946: ldc_w 639
    //   1949: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1952: invokestatic 706	com/tencent/mm/modelstat/n:lF	(Ljava/lang/String;)Ljava/lang/String;
    //   1955: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1958: ldc_w 358
    //   1961: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1964: pop
    //   1965: aload 12
    //   1967: aload 10
    //   1969: ldc_w 358
    //   1972: ldc_w 639
    //   1975: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1978: invokestatic 706	com/tencent/mm/modelstat/n:lF	(Ljava/lang/String;)Ljava/lang/String;
    //   1981: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1984: ldc_w 358
    //   1987: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1990: pop
    //   1991: aload 12
    //   1993: aload 8
    //   1995: ldc_w 358
    //   1998: ldc_w 639
    //   2001: invokevirtual 637	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   2004: invokestatic 706	com/tencent/mm/modelstat/n:lF	(Ljava/lang/String;)Ljava/lang/String;
    //   2007: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2010: ldc_w 358
    //   2013: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2016: pop
    //   2017: invokestatic 708	com/tencent/mm/modelstat/n:Mr	()J
    //   2020: lstore 5
    //   2022: lload 5
    //   2024: lconst_0
    //   2025: lcmp
    //   2026: ifge +63 -> 2089
    //   2029: ldc2_w 553
    //   2032: sipush 10218
    //   2035: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2038: aconst_null
    //   2039: areturn
    //   2040: astore 15
    //   2042: aload 14
    //   2044: astore 9
    //   2046: aload 7
    //   2048: astore 10
    //   2050: aload 12
    //   2052: astore 11
    //   2054: ldc -89
    //   2056: ldc_w 624
    //   2059: iconst_1
    //   2060: anewarray 4	java/lang/Object
    //   2063: dup
    //   2064: iconst_0
    //   2065: aload 15
    //   2067: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   2070: aastore
    //   2071: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2074: aload 8
    //   2076: astore 7
    //   2078: aload 10
    //   2080: astore 8
    //   2082: aload 13
    //   2084: astore 10
    //   2086: goto -296 -> 1790
    //   2089: new 346	java/lang/StringBuilder
    //   2092: dup
    //   2093: invokespecial 347	java/lang/StringBuilder:<init>	()V
    //   2096: lload 5
    //   2098: invokevirtual 364	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2101: ldc_w 358
    //   2104: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2107: aload 12
    //   2109: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2112: invokevirtual 351	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2115: invokevirtual 375	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2118: astore 8
    //   2120: aload 17
    //   2122: invokestatic 706	com/tencent/mm/modelstat/n:lF	(Ljava/lang/String;)Ljava/lang/String;
    //   2125: astore 10
    //   2127: aload 7
    //   2129: invokestatic 706	com/tencent/mm/modelstat/n:lF	(Ljava/lang/String;)Ljava/lang/String;
    //   2132: astore 7
    //   2134: aload 9
    //   2136: invokestatic 706	com/tencent/mm/modelstat/n:lF	(Ljava/lang/String;)Ljava/lang/String;
    //   2139: astore 9
    //   2141: ldc2_w 553
    //   2144: sipush 10218
    //   2147: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   2150: iconst_4
    //   2151: anewarray 388	java/lang/String
    //   2154: dup
    //   2155: iconst_0
    //   2156: aload 8
    //   2158: aastore
    //   2159: dup
    //   2160: iconst_1
    //   2161: aload 10
    //   2163: aastore
    //   2164: dup
    //   2165: iconst_2
    //   2166: aload 7
    //   2168: aastore
    //   2169: dup
    //   2170: iconst_3
    //   2171: aload 9
    //   2173: aastore
    //   2174: areturn
    //   2175: ldc 113
    //   2177: astore 7
    //   2179: goto -1259 -> 920
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2182	0	paramInt	int
    //   285	1394	1	i	int
    //   163	1694	2	j	int
    //   431	307	3	k	int
    //   282	566	4	m	int
    //   2020	77	5	l	long
    //   197	324	7	str1	String
    //   535	14	7	localException1	Exception
    //   571	1138	7	localObject1	Object
    //   1719	14	7	localException2	Exception
    //   1754	424	7	localObject2	Object
    //   201	1956	8	localObject3	Object
    //   189	1485	9	str2	String
    //   1686	14	9	localException3	Exception
    //   1769	403	9	localObject4	Object
    //   185	1977	10	localObject5	Object
    //   279	1774	11	localObject6	Object
    //   262	1846	12	localObject7	Object
    //   245	1838	13	localObject8	Object
    //   301	1742	14	localObject9	Object
    //   228	1559	15	localObject10	Object
    //   2040	26	15	localException4	Exception
    //   213	1570	16	localObject11	Object
    //   193	1928	17	str3	String
    //   471	1422	18	localObject12	Object
    //   815	1055	19	localObject13	Object
    //   893	1026	20	localObject14	Object
    //   95	1666	21	localObject15	Object
    //   986	56	22	localList	java.util.List
    //   1052	713	23	locala	com.tencent.mm.sdk.platformtools.am.a
    //   1605	59	24	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   160	164	535	java/lang/Exception
    //   203	215	1686	java/lang/Exception
    //   223	230	1686	java/lang/Exception
    //   238	247	1686	java/lang/Exception
    //   255	264	1686	java/lang/Exception
    //   272	281	1686	java/lang/Exception
    //   294	303	1686	java/lang/Exception
    //   311	322	1686	java/lang/Exception
    //   330	341	1686	java/lang/Exception
    //   349	356	1686	java/lang/Exception
    //   364	372	1686	java/lang/Exception
    //   380	387	1686	java/lang/Exception
    //   400	412	1686	java/lang/Exception
    //   420	429	1686	java/lang/Exception
    //   443	453	1686	java/lang/Exception
    //   461	473	1686	java/lang/Exception
    //   486	497	1686	java/lang/Exception
    //   505	518	1686	java/lang/Exception
    //   526	532	1686	java/lang/Exception
    //   577	586	1686	java/lang/Exception
    //   594	624	1686	java/lang/Exception
    //   632	641	1686	java/lang/Exception
    //   649	679	1686	java/lang/Exception
    //   687	698	1686	java/lang/Exception
    //   706	715	1686	java/lang/Exception
    //   723	734	1686	java/lang/Exception
    //   756	764	1686	java/lang/Exception
    //   772	791	1686	java/lang/Exception
    //   810	817	1686	java/lang/Exception
    //   825	832	1686	java/lang/Exception
    //   840	865	1686	java/lang/Exception
    //   895	908	1719	java/lang/Exception
    //   913	920	1719	java/lang/Exception
    //   981	988	2040	java/lang/Exception
    //   1010	1021	2040	java/lang/Exception
    //   1041	1054	2040	java/lang/Exception
    //   1074	1086	2040	java/lang/Exception
    //   1106	1118	2040	java/lang/Exception
    //   1142	1150	2040	java/lang/Exception
    //   1174	1185	2040	java/lang/Exception
    //   1205	1228	2040	java/lang/Exception
    //   1252	1263	2040	java/lang/Exception
    //   1283	1308	2040	java/lang/Exception
    //   1332	1340	2040	java/lang/Exception
    //   1364	1375	2040	java/lang/Exception
    //   1395	1418	2040	java/lang/Exception
    //   1442	1453	2040	java/lang/Exception
    //   1473	1498	2040	java/lang/Exception
    //   1522	1530	2040	java/lang/Exception
    //   1550	1573	2040	java/lang/Exception
    //   1593	1607	2040	java/lang/Exception
    //   1627	1638	2040	java/lang/Exception
    //   1663	1675	2040	java/lang/Exception
    //   1764	1771	2040	java/lang/Exception
  }
  
  public static void hi(int paramInt)
  {
    GMTrace.i(16087202660352L, 119859);
    long l1 = bg.Pv();
    if ((gZm > 0L) && (l1 - gZm > 5000L))
    {
      w.e("MicroMsg.NetTypeReporter", "never  report (reportKV) at  background :%d diff:%d", new Object[] { Long.valueOf(gZm), Long.valueOf(l1 - gZm) });
      GMTrace.o(16087202660352L, 119859);
      return;
    }
    String[] arrayOfString = hh(paramInt);
    if ((arrayOfString == null) || (arrayOfString.length != 4) || (bg.nm(arrayOfString[0])))
    {
      w.e("MicroMsg.NetTypeReporter", "report get failed val");
      GMTrace.o(16087202660352L, 119859);
      return;
    }
    w.d("MicroMsg.NetTypeReporter", "report scene:%d time:%d lon:%f lat:%f pre:%d scanuse:%d [%s]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(bg.aH(l1)), Float.valueOf(0.0F), Float.valueOf(0.0F), Integer.valueOf(0), Long.valueOf(0L), arrayOfString[0] });
    long l2 = bg.aH(gZm);
    if (l2 <= 600000L)
    {
      l1 = l2;
      if (l2 >= 0L) {}
    }
    else
    {
      l1 = 0L;
    }
    g localg = g.ork;
    StringBuilder localStringBuilder = new StringBuilder().append(arrayOfString[0]).append("1,0.0,0.0").append(",0,0").append(",");
    if (com.tencent.mm.sdk.a.b.foreground) {}
    for (String str = "1";; str = String.valueOf(l1))
    {
      localg.A(11747, str + "," + arrayOfString[1] + "," + arrayOfString[2] + "," + arrayOfString[3]);
      h.xy().xh().a(w.a.vqC, Long.valueOf(bg.Pv()));
      GMTrace.o(16087202660352L, 119859);
      return;
    }
  }
  
  /* Error */
  public static void hj(int paramInt)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 734
    //   6: sipush 10226
    //   9: invokestatic 50	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: ldc -89
    //   14: ldc_w 737
    //   17: iconst_4
    //   18: anewarray 4	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: iload_0
    //   24: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: getstatic 370	com/tencent/mm/sdk/a/b:foreground	Z
    //   33: invokestatic 561	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   36: aastore
    //   37: dup
    //   38: iconst_2
    //   39: getstatic 101	com/tencent/mm/modelstat/n:gZn	J
    //   42: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   45: aastore
    //   46: dup
    //   47: iconst_3
    //   48: getstatic 115	com/tencent/mm/modelstat/n:gZt	Ljava/lang/String;
    //   51: aastore
    //   52: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: iload_0
    //   56: sipush 1005
    //   59: if_icmpne +142 -> 201
    //   62: getstatic 101	com/tencent/mm/modelstat/n:gZn	J
    //   65: lconst_0
    //   66: lcmp
    //   67: ifle +134 -> 201
    //   70: ldc -89
    //   72: ldc_w 739
    //   75: bipush 6
    //   77: anewarray 4	java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: iload_0
    //   83: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   86: aastore
    //   87: dup
    //   88: iconst_1
    //   89: getstatic 109	com/tencent/mm/modelstat/n:gZr	I
    //   92: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   95: aastore
    //   96: dup
    //   97: iconst_2
    //   98: getstatic 105	com/tencent/mm/modelstat/n:gZp	F
    //   101: invokestatic 200	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   104: aastore
    //   105: dup
    //   106: iconst_3
    //   107: getstatic 103	com/tencent/mm/modelstat/n:gZo	F
    //   110: invokestatic 200	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   113: aastore
    //   114: dup
    //   115: iconst_4
    //   116: getstatic 107	com/tencent/mm/modelstat/n:gZq	I
    //   119: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   122: aastore
    //   123: dup
    //   124: iconst_5
    //   125: getstatic 101	com/tencent/mm/modelstat/n:gZn	J
    //   128: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   131: aastore
    //   132: invokestatic 265	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: getstatic 101	com/tencent/mm/modelstat/n:gZn	J
    //   138: invokestatic 204	com/tencent/mm/sdk/platformtools/bg:aH	(J)J
    //   141: lstore 4
    //   143: getstatic 109	com/tencent/mm/modelstat/n:gZr	I
    //   146: istore_0
    //   147: getstatic 103	com/tencent/mm/modelstat/n:gZo	F
    //   150: fstore_1
    //   151: getstatic 105	com/tencent/mm/modelstat/n:gZp	F
    //   154: fstore_2
    //   155: getstatic 107	com/tencent/mm/modelstat/n:gZq	I
    //   158: istore_3
    //   159: lconst_0
    //   160: putstatic 101	com/tencent/mm/modelstat/n:gZn	J
    //   163: fconst_0
    //   164: putstatic 103	com/tencent/mm/modelstat/n:gZo	F
    //   167: fconst_0
    //   168: putstatic 105	com/tencent/mm/modelstat/n:gZp	F
    //   171: iconst_0
    //   172: putstatic 107	com/tencent/mm/modelstat/n:gZq	I
    //   175: iconst_0
    //   176: putstatic 109	com/tencent/mm/modelstat/n:gZr	I
    //   179: iload_0
    //   180: fload_2
    //   181: fload_1
    //   182: iload_3
    //   183: lload 4
    //   185: invokestatic 741	com/tencent/mm/modelstat/n:b	(IFFIJ)V
    //   188: ldc2_w 734
    //   191: sipush 10226
    //   194: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   197: ldc 2
    //   199: monitorexit
    //   200: return
    //   201: getstatic 370	com/tencent/mm/sdk/a/b:foreground	Z
    //   204: ifne +42 -> 246
    //   207: ldc -89
    //   209: ldc_w 743
    //   212: iconst_1
    //   213: anewarray 4	java/lang/Object
    //   216: dup
    //   217: iconst_0
    //   218: iload_0
    //   219: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   222: aastore
    //   223: invokestatic 648	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   226: ldc2_w 734
    //   229: sipush 10226
    //   232: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   235: goto -38 -> 197
    //   238: astore 6
    //   240: ldc 2
    //   242: monitorexit
    //   243: aload 6
    //   245: athrow
    //   246: iload_0
    //   247: iconst_3
    //   248: if_icmpne +96 -> 344
    //   251: invokestatic 219	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   254: ldc -35
    //   256: invokevirtual 227	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   259: checkcast 229	android/net/wifi/WifiManager
    //   262: invokevirtual 578	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   265: invokevirtual 593	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   268: astore 6
    //   270: ldc -89
    //   272: ldc_w 745
    //   275: iconst_3
    //   276: anewarray 4	java/lang/Object
    //   279: dup
    //   280: iconst_0
    //   281: iload_0
    //   282: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   285: aastore
    //   286: dup
    //   287: iconst_1
    //   288: aload 6
    //   290: aastore
    //   291: dup
    //   292: iconst_2
    //   293: getstatic 115	com/tencent/mm/modelstat/n:gZt	Ljava/lang/String;
    //   296: aastore
    //   297: invokestatic 265	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   300: aload 6
    //   302: invokestatic 255	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   305: ifne +27 -> 332
    //   308: aload 6
    //   310: getstatic 115	com/tencent/mm/modelstat/n:gZt	Ljava/lang/String;
    //   313: invokevirtual 619	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   316: ifne +16 -> 332
    //   319: aload 6
    //   321: putstatic 115	com/tencent/mm/modelstat/n:gZt	Ljava/lang/String;
    //   324: iload_0
    //   325: fconst_0
    //   326: fconst_0
    //   327: iconst_0
    //   328: lconst_0
    //   329: invokestatic 741	com/tencent/mm/modelstat/n:b	(IFFIJ)V
    //   332: ldc2_w 734
    //   335: sipush 10226
    //   338: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   341: goto -144 -> 197
    //   344: iload_0
    //   345: iconst_4
    //   346: if_icmpne +84 -> 430
    //   349: invokestatic 129	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   352: invokevirtual 135	com/tencent/mm/kernel/e:xh	()Lcom/tencent/mm/storage/t;
    //   355: getstatic 732	com/tencent/mm/storage/w$a:vqC	Lcom/tencent/mm/storage/w$a;
    //   358: aconst_null
    //   359: invokevirtual 147	com/tencent/mm/storage/t:get	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   362: checkcast 149	java/lang/Long
    //   365: lconst_0
    //   366: invokestatic 154	com/tencent/mm/sdk/platformtools/bg:a	(Ljava/lang/Long;J)J
    //   369: invokestatic 204	com/tencent/mm/sdk/platformtools/bg:aH	(J)J
    //   372: lstore 4
    //   374: ldc -89
    //   376: ldc_w 747
    //   379: iconst_2
    //   380: anewarray 4	java/lang/Object
    //   383: dup
    //   384: iconst_0
    //   385: iload_0
    //   386: invokestatic 195	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   389: aastore
    //   390: dup
    //   391: iconst_1
    //   392: lload 4
    //   394: invokestatic 158	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   397: aastore
    //   398: invokestatic 174	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   401: lload 4
    //   403: ldc2_w 748
    //   406: lcmp
    //   407: iflt +11 -> 418
    //   410: iload_0
    //   411: fconst_0
    //   412: fconst_0
    //   413: iconst_0
    //   414: lconst_0
    //   415: invokestatic 741	com/tencent/mm/modelstat/n:b	(IFFIJ)V
    //   418: ldc2_w 734
    //   421: sipush 10226
    //   424: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   427: goto -230 -> 197
    //   430: iload_0
    //   431: fconst_0
    //   432: fconst_0
    //   433: iconst_0
    //   434: lconst_0
    //   435: invokestatic 741	com/tencent/mm/modelstat/n:b	(IFFIJ)V
    //   438: ldc2_w 734
    //   441: sipush 10226
    //   444: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   447: goto -250 -> 197
    //   450: astore 6
    //   452: ldc -89
    //   454: ldc_w 751
    //   457: iconst_1
    //   458: anewarray 4	java/lang/Object
    //   461: dup
    //   462: iconst_0
    //   463: aload 6
    //   465: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   468: aastore
    //   469: invokestatic 183	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   472: ldc2_w 734
    //   475: sipush 10226
    //   478: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   481: goto -284 -> 197
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	484	0	paramInt	int
    //   150	32	1	f1	float
    //   154	27	2	f2	float
    //   158	25	3	i	int
    //   141	261	4	l	long
    //   238	6	6	localObject	Object
    //   268	52	6	str	String
    //   450	14	6	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   3	55	238	finally
    //   62	188	238	finally
    //   188	197	238	finally
    //   201	226	238	finally
    //   226	235	238	finally
    //   251	332	238	finally
    //   332	341	238	finally
    //   349	401	238	finally
    //   410	418	238	finally
    //   418	427	238	finally
    //   430	438	238	finally
    //   438	447	238	finally
    //   452	481	238	finally
    //   62	188	450	java/lang/Throwable
    //   201	226	450	java/lang/Throwable
    //   251	332	450	java/lang/Throwable
    //   349	401	450	java/lang/Throwable
    //   410	418	450	java/lang/Throwable
    //   430	438	450	java/lang/Throwable
  }
  
  private static String lF(String paramString)
  {
    GMTrace.i(1371570962432L, 10219);
    if (TextUtils.isEmpty(paramString))
    {
      GMTrace.o(1371570962432L, 10219);
      return "";
    }
    char[] arrayOfChar = paramString.toCharArray();
    int j = arrayOfChar.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfChar[i];
      if (((k < 97) || (k > 122)) && ((k < 65) || (k > 90)) && ((k < 48) || (k > 57)) && (k != 124) && (k != 45) && (k != 32) && (k != 58))
      {
        GMTrace.o(1371570962432L, 10219);
        return "";
      }
      i += 1;
    }
    GMTrace.o(1371570962432L, 10219);
    return paramString;
  }
  
  public static void r(int paramInt, String paramString)
  {
    GMTrace.i(1371973615616L, 10222);
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new axq();
    ((b.a)localObject).gtG = new axr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rtkvreport";
    ((b.a)localObject).gtE = 716;
    localObject = ((b.a)localObject).DA();
    axq localaxq = (axq)((com.tencent.mm.ad.b)localObject).gtC.gtK;
    localaxq.tWD = d.tJw;
    localaxq.tWE = d.tJv;
    localaxq.tWF = d.tJy;
    localaxq.tWG = d.tJz;
    localaxq.tWH = v.bPK();
    localaxq.uzM = paramInt;
    localaxq.oqQ = paramString;
    w.i("MicroMsg.NetTypeReporter", "reportCgi logId:%d, value:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    u.a((com.tencent.mm.ad.b)localObject, new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, k paramAnonymousk)
      {
        GMTrace.i(1370765656064L, 10213);
        w.d("MicroMsg.NetTypeReporter", "onGYNetEnd errType:%d errCode:%d msg:%s  %d val:%s ", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Long.valueOf(bg.aH(this.gZu)), this.gZv.oqQ });
        GMTrace.o(1370765656064L, 10213);
        return 0;
      }
    });
    GMTrace.o(1371973615616L, 10222);
  }
  
  private static final class a
    extends BroadcastReceiver
  {
    private a()
    {
      GMTrace.i(1402172604416L, 10447);
      GMTrace.o(1402172604416L, 10447);
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      GMTrace.i(1402306822144L, 10448);
      try
      {
        if (h.xw().wL())
        {
          h.xw();
          if (!com.tencent.mm.kernel.a.wF()) {}
        }
        else
        {
          bool = h.xw().wL();
          h.xw();
          w.e("MicroMsg.NetTypeReporter", "onReceive acc not ready .%b %b", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(com.tencent.mm.kernel.a.wF()) });
          GMTrace.o(1402306822144L, 10448);
          return;
        }
        if ((paramIntent == null) || (bg.nm(paramIntent.getAction())))
        {
          if (paramIntent == null) {}
          for (paramContext = "intent is null";; paramContext = "action is null")
          {
            w.e("MicroMsg.NetTypeReporter", "onReceive %s  ", new Object[] { paramContext });
            GMTrace.o(1402306822144L, 10448);
            return;
          }
        }
        paramContext = paramIntent.getAction();
        w.i("MicroMsg.NetTypeReporter", "onReceive action:%s foreground:%b", new Object[] { paramContext, Boolean.valueOf(com.tencent.mm.sdk.a.b.foreground) });
        boolean bool = com.tencent.mm.sdk.a.b.foreground;
        if (!bool)
        {
          GMTrace.o(1402306822144L, 10448);
          return;
        }
        if (paramContext.equals("android.net.wifi.supplicant.CONNECTION_CHANGE"))
        {
          n.hj(1001);
          GMTrace.o(1402306822144L, 10448);
          return;
        }
      }
      catch (Throwable paramContext)
      {
        w.e("MicroMsg.NetTypeReporter", "onReceive : %s", new Object[] { bg.f(paramContext) });
        GMTrace.o(1402306822144L, 10448);
        return;
      }
      if (paramContext.equals("android.net.wifi.supplicant.STATE_CHANGE"))
      {
        n.hj(1002);
        GMTrace.o(1402306822144L, 10448);
        return;
      }
      if (paramContext.equals("android.net.wifi.STATE_CHANGE"))
      {
        n.hj(1003);
        GMTrace.o(1402306822144L, 10448);
        return;
      }
      if (paramContext.equals("android.net.wifi.WIFI_STATE_CHANGED"))
      {
        n.hj(1004);
        GMTrace.o(1402306822144L, 10448);
        return;
      }
      if (paramContext.equals("android.net.wifi.SCAN_RESULTS"))
      {
        n.hj(1005);
        GMTrace.o(1402306822144L, 10448);
        return;
      }
      if (paramContext.equals("android.net.conn.CONNECTIVITY_CHANGE"))
      {
        n.hj(1006);
        com.tencent.mm.sdk.b.a.vgX.m(new iw());
      }
      GMTrace.o(1402306822144L, 10448);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelstat\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */