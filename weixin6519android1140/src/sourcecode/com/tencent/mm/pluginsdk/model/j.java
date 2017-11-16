package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.i.a.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public final class j
  extends Thread
{
  private static HashMap<String, b> sem;
  private static Object sen;
  private static ar seo;
  private Context context;
  private String eDs;
  private Intent intent;
  private boolean isStop;
  private List<String> sec;
  private List<Integer> sed;
  private List<String> see;
  private List<String> sef;
  private List<Integer> seg;
  private int tmT;
  private a tmU;
  
  static
  {
    GMTrace.i(838458146816L, 6247);
    sem = new HashMap();
    sen = new byte[0];
    GMTrace.o(838458146816L, 6247);
  }
  
  public j(Context paramContext, List<String> paramList, Intent paramIntent, String paramString, int paramInt, a parama)
  {
    GMTrace.i(835102703616L, 6222);
    this.context = paramContext;
    this.sec = paramList;
    this.intent = paramIntent;
    this.sed = new ArrayList();
    this.see = new ArrayList();
    this.sef = new ArrayList();
    this.seg = new ArrayList();
    this.tmU = parama;
    this.eDs = paramString;
    this.tmT = paramInt;
    GMTrace.o(835102703616L, 6222);
  }
  
  public static boolean Ol(String paramString)
  {
    GMTrace.i(836176445440L, 6230);
    synchronized (sen)
    {
      boolean bool = sem.containsKey(paramString);
      w.i("MicroMsg.ImportMultiVideo", "check %s is remuxing, ret %B", new Object[] { paramString, Boolean.valueOf(bool) });
      GMTrace.o(836176445440L, 6230);
      return bool;
    }
  }
  
  public static void Om(String paramString)
  {
    boolean bool = true;
    GMTrace.i(836310663168L, 6231);
    synchronized (sen)
    {
      if (sem.remove(paramString) != null)
      {
        w.i("MicroMsg.ImportMultiVideo", "remove remuxing job, filename %s, ret %B", new Object[] { paramString, Boolean.valueOf(bool) });
        GMTrace.o(836310663168L, 6231);
        return;
      }
      bool = false;
    }
  }
  
  private void a(int paramInt1, String paramString1, String paramString2, int paramInt2, VideoTransPara paramVideoTransPara, Intent arg6)
  {
    GMTrace.i(14908099919872L, 111074);
    w.i("MicroMsg.ImportMultiVideo", "finish to import %s to %s | ret %d | duration %d", new Object[] { paramString2, paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    d(paramInt1, paramString1, paramString2, paramInt2);
    if (paramInt1 == -50002)
    {
      if (this.tmT == 1) {}
      for (paramInt1 = 230;; paramInt1 = 245)
      {
        w.d("MicroMsg.ImportMultiVideo", "report video too big reportId : " + paramInt1 + " importType : " + this.tmT);
        g.ork.a(106L, paramInt1, 1L, false);
        a(this.eDs, paramString1, paramString2, ???, paramInt2, 141);
        GMTrace.o(14908099919872L, 111074);
        return;
      }
    }
    if (paramInt1 == -50008)
    {
      g.ork.a(106L, 210L, 1L, false);
      a(this.eDs, paramString1, paramString2, ???, paramInt2, 140);
      GMTrace.o(14908099919872L, 111074);
      return;
    }
    if (paramInt1 == -50006)
    {
      if (com.tencent.mm.modelvideo.t.a(paramString1, 1, this.eDs, paramString2, 43) < 0L)
      {
        a(this.eDs, paramString1, paramString2, ???, paramInt2, 142);
        w.e("MicroMsg.ImportMultiVideo", "prepare");
        GMTrace.o(14908099919872L, 111074);
        return;
      }
      if (seo == null) {
        seo = new ar(5, "remuxing-thread-" + System.currentTimeMillis(), 1, Looper.getMainLooper());
      }
      b localb = new b();
      synchronized (sen)
      {
        sem.put(paramString1, localb);
        localb.euR = paramString1;
        localb.hac = paramString2;
        o.Nh();
        localb.ser = s.mk(paramString1);
        localb.tmT = this.tmT;
        localb.toUser = this.eDs;
        localb.set = paramVideoTransPara;
        seo.c(localb);
        GMTrace.o(14908099919872L, 111074);
        return;
      }
    }
    if (paramInt1 < 0)
    {
      if (this.tmT == 1) {}
      for (paramInt1 = 229;; paramInt1 = 244)
      {
        w.d("MicroMsg.ImportMultiVideo", "report video file error reportId : " + paramInt1 + " importType : " + this.tmT);
        g.ork.a(106L, paramInt1, 1L, false);
        a(this.eDs, paramString1, paramString2, ???, paramInt2, 142);
        GMTrace.o(14908099919872L, 111074);
        return;
      }
    }
    com.tencent.mm.modelvideo.t.b(paramString1, paramInt2, this.eDs, paramString2);
    com.tencent.mm.modelvideo.t.mr(paramString1);
    if (this.tmT == 1) {}
    for (paramInt1 = 8;; paramInt1 = 1)
    {
      o.Nh();
      paramString1 = s.mk(paramString1);
      n.Nf().a(paramString2, paramString1, this.eDs, "", "", paramInt1, 2);
      GMTrace.o(14908099919872L, 111074);
      return;
    }
  }
  
  private void a(String paramString1, String paramString2, String paramString3, Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(16286650204160L, 121345);
    Object localObject = new au();
    ((au)localObject).dB(5);
    ((au)localObject).db(paramString1);
    ((au)localObject).E(bc.gR(paramString1));
    ((au)localObject).dC(1);
    ((au)localObject).dc(paramString2);
    ((au)localObject).setType(43);
    long l = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().P((au)localObject);
    w.i("MicroMsg.ImportMultiVideo", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((ce)localObject).field_msgId), Long.valueOf(((ce)localObject).field_msgSvrId), ((ce)localObject).field_talker, Integer.valueOf(((ce)localObject).field_type), Integer.valueOf(((ce)localObject).field_isSend), ((ce)localObject).field_imgPath, Integer.valueOf(((ce)localObject).field_status), Long.valueOf(((ce)localObject).field_createTime) });
    if (-1L == l)
    {
      w.e("MicroMsg.ImportMultiVideo", "[insertErrMsg] :%s", new Object[] { paramString1 });
      GMTrace.o(16286650204160L, 121345);
      return;
    }
    if (com.tencent.mm.modelvideo.t.mw(paramString2) == null)
    {
      o.Nh();
      localObject = s.ml(paramString2);
      i = paramInt1;
    }
    for (;;)
    {
      try
      {
        paramIntent = com.tencent.mm.compatible.i.a.i(this.context, paramIntent);
        if (paramIntent == null) {
          continue;
        }
        i = paramInt1;
        if (paramIntent.bitmap == null) {
          continue;
        }
        i = paramInt1;
        paramInt1 = bg.eN(paramIntent.duration);
        i = paramInt1;
        com.tencent.mm.sdk.platformtools.d.a(paramIntent.bitmap, 60, Bitmap.CompressFormat.JPEG, (String)localObject, true);
      }
      catch (Exception paramIntent)
      {
        int j;
        w.printErrStackTrace("MicroMsg.ImportMultiVideo", paramIntent, "", new Object[0]);
        paramInt1 = i;
        continue;
        i = 0;
        continue;
      }
      j = s.mm((String)localObject);
      o.Nh();
      i = s.mm(s.mk(paramString2));
      paramIntent = new r();
      paramIntent.euR = paramString2;
      if (i <= 0) {
        continue;
      }
      paramIntent.gsL = i;
      paramIntent.hcr = j;
      paramIntent.hcv = paramInt1;
      paramIntent.eQu = paramString1;
      paramIntent.hcn = ((String)com.tencent.mm.kernel.h.xy().xh().get(2, ""));
      paramIntent.hcs = bg.Pu();
      paramIntent.hct = bg.Pu();
      paramIntent.hcB = null;
      paramIntent.hac = paramString3;
      if (!bg.nm(paramString3)) {
        paramIntent.hcz = 1;
      }
      paramIntent.hcC = -1;
      paramIntent.status = paramInt2;
      paramIntent.hcw = ((int)l);
      if (!o.Nh().a(paramIntent)) {
        w.e("MicroMsg.ImportMultiVideo", "[insertErrMsg] localMsgId:%s", new Object[] { Long.valueOf(l) });
      }
      GMTrace.o(16286650204160L, 121345);
      return;
      i = paramInt1;
      com.tencent.mm.sdk.platformtools.d.a(com.tencent.mm.sdk.platformtools.d.X(-16777216, 320, 480), 60, Bitmap.CompressFormat.JPEG, (String)localObject, true);
    }
  }
  
  /* Error */
  public static void b(String paramString, int[] paramArrayOfInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc2_w 511
    //   5: sipush 6227
    //   8: invokestatic 49	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: new 514	android/media/MediaMetadataRetriever
    //   14: dup
    //   15: invokespecial 515	android/media/MediaMetadataRetriever:<init>	()V
    //   18: astore 5
    //   20: aload 5
    //   22: aload_0
    //   23: invokevirtual 518	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   26: aload 5
    //   28: bipush 18
    //   30: invokevirtual 522	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   33: iconst_0
    //   34: invokestatic 526	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   37: istore 4
    //   39: aload 5
    //   41: bipush 19
    //   43: invokevirtual 522	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   46: iconst_0
    //   47: invokestatic 526	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   50: istore_3
    //   51: aload_1
    //   52: iconst_0
    //   53: iload 4
    //   55: iastore
    //   56: aload_1
    //   57: iconst_1
    //   58: iload_3
    //   59: iastore
    //   60: iload_2
    //   61: iconst_3
    //   62: if_icmpge +73 -> 135
    //   65: iload 4
    //   67: iconst_2
    //   68: irem
    //   69: ifne +9 -> 78
    //   72: iload_3
    //   73: iconst_2
    //   74: irem
    //   75: ifeq +18 -> 93
    //   78: aload 5
    //   80: invokevirtual 529	android/media/MediaMetadataRetriever:release	()V
    //   83: ldc2_w 511
    //   86: sipush 6227
    //   89: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   92: return
    //   93: iload 4
    //   95: iload_3
    //   96: if_icmplt +18 -> 114
    //   99: iload 4
    //   101: sipush 640
    //   104: if_icmple +31 -> 135
    //   107: iload_3
    //   108: sipush 480
    //   111: if_icmple +24 -> 135
    //   114: iload 4
    //   116: iload_3
    //   117: if_icmpgt +42 -> 159
    //   120: iload 4
    //   122: sipush 480
    //   125: if_icmple +10 -> 135
    //   128: iload_3
    //   129: sipush 640
    //   132: if_icmpgt +27 -> 159
    //   135: aload_1
    //   136: iconst_0
    //   137: iload 4
    //   139: iastore
    //   140: aload_1
    //   141: iconst_1
    //   142: iload_3
    //   143: iastore
    //   144: aload 5
    //   146: invokevirtual 529	android/media/MediaMetadataRetriever:release	()V
    //   149: ldc2_w 511
    //   152: sipush 6227
    //   155: invokestatic 61	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   158: return
    //   159: iload 4
    //   161: iconst_2
    //   162: idiv
    //   163: istore 4
    //   165: iload_3
    //   166: iconst_2
    //   167: idiv
    //   168: istore_3
    //   169: iload_2
    //   170: iconst_1
    //   171: iadd
    //   172: istore_2
    //   173: goto -113 -> 60
    //   176: astore_0
    //   177: aconst_null
    //   178: astore_1
    //   179: aload_1
    //   180: ifnull +7 -> 187
    //   183: aload_1
    //   184: invokevirtual 529	android/media/MediaMetadataRetriever:release	()V
    //   187: aload_0
    //   188: athrow
    //   189: astore_0
    //   190: aload 5
    //   192: astore_1
    //   193: goto -14 -> 179
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	paramString	String
    //   0	196	1	paramArrayOfInt	int[]
    //   1	172	2	i	int
    //   50	119	3	j	int
    //   37	127	4	k	int
    //   18	173	5	localMediaMetadataRetriever	android.media.MediaMetadataRetriever
    // Exception table:
    //   from	to	target	type
    //   11	20	176	finally
    //   20	51	189	finally
    //   159	169	189	finally
  }
  
  public static void bJi()
  {
    GMTrace.i(836042227712L, 6229);
    int i;
    synchronized (sen)
    {
      i = sem.size();
      sem.clear();
      if (seo == null)
      {
        w.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, worker is null, setCount %d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(836042227712L, 6229);
        return;
      }
    }
    w.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, setCount %d, workerJobCount %d", new Object[] { Integer.valueOf(i), Integer.valueOf(seo.vkh.size()) });
    seo.vkh.clear();
    seo = null;
    GMTrace.o(836042227712L, 6229);
  }
  
  private static void cx(String paramString, int paramInt)
  {
    GMTrace.i(836579098624L, 6233);
    int i;
    if (paramInt == 1)
    {
      paramInt = 219;
      i = 228;
    }
    for (int j = 220;; j = 234)
    {
      long l = com.tencent.mm.a.e.aY(paramString);
      i = bg.e((Integer)g.a((int)(l / 1024L), new int[] { 512, 1024, 2048, 5120, 8192, 10240, 15360, 20480 }, j, i));
      g.ork.a(106L, i, 1L, false);
      g.ork.a(106L, paramInt, 1L, false);
      w.d("MicroMsg.ImportMultiVideo", "report no compress video report id : " + i + " file len : " + l / 1024L + "K");
      GMTrace.o(836579098624L, 6233);
      return;
      paramInt = 233;
      i = 242;
    }
  }
  
  private void d(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    try
    {
      GMTrace.i(835908009984L, 6228);
      this.sed.add(Integer.valueOf(paramInt1));
      this.see.add(paramString1);
      this.sef.add(paramString2);
      this.seg.add(Integer.valueOf(paramInt2));
      GMTrace.o(835908009984L, 6228);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  private static void d(boolean paramBoolean, String paramString1, String paramString2)
  {
    int i = 1;
    GMTrace.i(836713316352L, 6234);
    if (paramBoolean) {}
    while ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.w("MicroMsg.AtomStatUtil", "report video remuxing but path is null.");
      GMTrace.o(836713316352L, 6234);
      return;
      i = 0;
    }
    try
    {
      long l1 = com.tencent.mm.a.e.aY(paramString1);
      long l2 = com.tencent.mm.a.e.aY(paramString2);
      int j = (int)(100L * l2 / l1);
      paramString1 = new StringBuilder();
      paramString1.append(i).append(";").append(l1).append(";");
      paramString1.append(l2).append(";").append(j);
      paramString1 = paramString1.toString();
      w.d("MicroMsg.AtomStatUtil", "report video remuxing : " + paramString1);
      g.ork.i(11098, new Object[] { Integer.valueOf(8001), paramString1 });
      GMTrace.o(836713316352L, 6234);
      return;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.AtomStatUtil", paramString1, "", new Object[0]);
      w.e("MicroMsg.AtomStatUtil", "reportVideoRemuxing error : " + paramString1.toString());
      GMTrace.o(836713316352L, 6234);
    }
  }
  
  private void jU(boolean paramBoolean)
  {
    GMTrace.i(836444880896L, 6232);
    int i;
    if (this.tmT == 1) {
      if (paramBoolean) {
        i = 217;
      }
    }
    for (;;)
    {
      w.d("MicroMsg.ImportMultiVideo", "report video thumb reportId : " + i + " had Thumb : " + paramBoolean + " importType : " + this.tmT);
      g.ork.a(106L, i, 1L, false);
      GMTrace.o(836444880896L, 6232);
      return;
      i = 218;
      continue;
      if (paramBoolean) {
        i = 231;
      } else {
        i = 232;
      }
    }
  }
  
  private void v(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(835371139072L, 6224);
    String str1 = s.mj((String)com.tencent.mm.kernel.h.xy().xh().get(2, ""));
    o.Nh();
    String str2 = s.ml(str1);
    o.Nh();
    String str3 = s.mk(str1);
    boolean bool2 = am.is2G(ab.getContext());
    String str4 = com.tencent.mm.compatible.i.a.h(paramContext, paramIntent);
    if (bg.nm(str4))
    {
      w.e("MicroMsg.ImportMultiVideo", "GetVideoMetadata filed.");
      a(-50005, str1, str4, 0, null, paramIntent);
      GMTrace.o(835371139072L, 6224);
      return;
    }
    boolean bool1 = com.tencent.mm.plugin.a.c.np(str4);
    int j = com.tencent.mm.a.e.aY(str4);
    PInt localPInt1;
    Object localObject;
    label186:
    int i;
    if (bool1)
    {
      localPInt1 = new PInt();
      if (com.tencent.mm.modelcontrol.d.Gv().jF(str4))
      {
        w.i("MicroMsg.ImportMultiVideo", "check remuxing, this video had wx meta do not remuxing. %s ", new Object[] { str4 });
        localPInt1.value = 1;
        g.ork.a(422L, 51L, 1L, false);
        localObject = null;
        i = localPInt1.value;
      }
    }
    int k;
    int m;
    for (;;)
    {
      w.i("MicroMsg.ImportMultiVideo", "check remuxing, ret %d isMp4 %b length %d", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Integer.valueOf(j) });
      switch (i)
      {
      default: 
        w.e("MicroMsg.ImportMultiVideo", "unknown check type");
        a(-50001, str1, str4, 0, null, paramIntent);
        GMTrace.o(835371139072L, 6224);
        return;
        VideoTransPara localVideoTransPara = new VideoTransPara();
        localObject = new PInt();
        PInt localPInt2 = new PInt();
        PInt localPInt3 = new PInt();
        PInt localPInt4 = new PInt();
        PInt localPInt5 = new PInt();
        com.tencent.mm.plugin.sight.base.d.a(str4, (PInt)localObject, localPInt2, localPInt3, localPInt4, localPInt5);
        localVideoTransPara.duration = (((PInt)localObject).value / 1000);
        localVideoTransPara.width = localPInt2.value;
        localVideoTransPara.height = localPInt3.value;
        localVideoTransPara.fps = localPInt4.value;
        localVideoTransPara.videoBitrate = localPInt5.value;
        w.d("MicroMsg.ImportMultiVideo", "check remuxing old para %s", new Object[] { localVideoTransPara });
        localObject = com.tencent.mm.modelcontrol.d.Gv().a(localVideoTransPara);
        if (localObject == null)
        {
          w.i("MicroMsg.ImportMultiVideo", "get C2C album video para is null. old para %s", new Object[] { localVideoTransPara });
          localPInt1.value = -5;
          localObject = null;
          break label186;
        }
        w.d("MicroMsg.ImportMultiVideo", "check remuxing new para %s", new Object[] { localObject });
        if ((localVideoTransPara.videoBitrate <= 640000) || (((VideoTransPara)localObject).videoBitrate > localVideoTransPara.videoBitrate))
        {
          w.i("MicroMsg.ImportMultiVideo", "new bitrate is bigger than old bitrate %s %s", new Object[] { localObject, localVideoTransPara });
          localPInt1.value = 1;
          localObject = null;
          break label186;
        }
        if ((localVideoTransPara.fps >= 45) && (localVideoTransPara.duration * 1000 >= 180000))
        {
          localPInt1.value = -6;
          localObject = null;
          break label186;
        }
        bool2 = am.is2G(ab.getContext());
        k = ((VideoTransPara)localObject).width;
        m = ((VideoTransPara)localObject).height;
        if (bool2)
        {
          i = 10485760;
          label655:
          if (!bool2) {
            break label695;
          }
        }
        label695:
        for (double d = 60000.0D;; d = 300000.0D)
        {
          localPInt1.value = SightVideoJNI.shouldRemuxing(str4, k, m, i, d, 1000000);
          break;
          i = 20971520;
          break label655;
        }
        if (bool2) {}
        for (i = 10485760;; i = 20971520)
        {
          if (j <= i) {
            break label737;
          }
          i = -5;
          localObject = null;
          break;
        }
        label737:
        i = 1;
        localObject = null;
      }
    }
    if (j > 20971520)
    {
      a(-50002, str1, str4, 0, null, paramIntent);
      j = 0;
      i = -50002;
    }
    try
    {
      for (;;)
      {
        paramContext = com.tencent.mm.compatible.i.a.i(paramContext, paramIntent);
        if (paramContext != null) {
          break;
        }
        w.e("MicroMsg.ImportMultiVideo", "GetVideoMetadata filed.");
        a(-50005, str1, str4, 0, null, paramIntent);
        GMTrace.o(835371139072L, 6224);
        return;
        j = 0;
        i = 0;
        continue;
        j = 1;
        i = 0;
      }
      a(-50007, str1, str4, 0, null, paramIntent);
      GMTrace.o(835371139072L, 6224);
      return;
      a(-50002, str1, str4, 0, null, paramIntent);
      GMTrace.o(835371139072L, 6224);
      return;
      a(-50008, str1, str4, 0, null, paramIntent);
      GMTrace.o(835371139072L, 6224);
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ImportMultiVideo", paramContext, "", new Object[0]);
        paramContext = null;
      }
    }
    if (j == 0)
    {
      com.tencent.mm.sdk.platformtools.j.r(str4, str3, false);
      cx(str3, this.tmT);
      d(false, str4, str3);
    }
    for (;;)
    {
      int n = bg.eN(paramContext.duration);
      m = 1;
      k = 1;
      if (paramContext.bitmap != null) {
        k = m;
      }
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramContext.bitmap, 60, Bitmap.CompressFormat.JPEG, str2, true);
        k = 0;
        m = 0;
        jU(true);
        k = m;
        if (k == 0) {}
      }
      catch (Exception paramContext)
      {
        try
        {
          jU(false);
          com.tencent.mm.sdk.platformtools.d.a(com.tencent.mm.sdk.platformtools.d.X(-16777216, 320, 480), 60, Bitmap.CompressFormat.JPEG, str2, true);
          k = i;
          if (j == 0)
          {
            k = i;
            if (!com.tencent.mm.a.e.aZ(str3)) {
              k = -50003;
            }
          }
          if (!com.tencent.mm.a.e.aZ(str2)) {
            k = -50004;
          }
          a(k, str1, str4, n, (VideoTransPara)localObject, paramIntent);
          GMTrace.o(835371139072L, 6224);
          return;
          i = -50006;
          continue;
          paramContext = paramContext;
          w.printErrStackTrace("MicroMsg.ImportMultiVideo", paramContext, "", new Object[0]);
        }
        catch (Exception paramContext)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.ImportMultiVideo", paramContext, "", new Object[0]);
          }
        }
      }
    }
  }
  
  public final void bJh()
  {
    GMTrace.i(835505356800L, 6225);
    this.isStop = true;
    interrupt();
    GMTrace.o(835505356800L, 6225);
  }
  
  public final void run()
  {
    GMTrace.i(835236921344L, 6223);
    int i;
    if ((this.sec != null) && (this.sec.size() > 0)) {
      i = 0;
    }
    while ((i < this.sec.size()) && (!this.isStop))
    {
      w.i("MicroMsg.ImportMultiVideo", "start to import %s", new Object[] { this.sec.get(i) });
      Intent localIntent = new Intent();
      localIntent.setData(Uri.parse("file://" + (String)this.sec.get(i)));
      v(this.context, localIntent);
      i += 1;
      continue;
      v(this.context, this.intent);
    }
    if ((this.tmU != null) && (!this.isStop)) {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(750679752704L, 5593);
          j.a locala = j.e(j.this);
          j.a(j.this);
          j.b(j.this);
          j.c(j.this);
          j.d(j.this);
          locala.bJj();
          GMTrace.o(750679752704L, 5593);
        }
      });
    }
    GMTrace.o(835236921344L, 6223);
  }
  
  public static abstract interface a
  {
    public abstract void bJj();
  }
  
  private static final class b
    implements ar.a
  {
    String euR;
    String hac;
    private int outputHeight;
    private int outputWidth;
    String ser;
    int ses;
    VideoTransPara set;
    private boolean seu;
    private int sev;
    int tmT;
    String toUser;
    
    public b()
    {
      GMTrace.i(725715255296L, 5407);
      this.sev = 0;
      GMTrace.o(725715255296L, 5407);
    }
    
    public final boolean Dj()
    {
      GMTrace.i(725849473024L, 5408);
      for (;;)
      {
        synchronized (j.bHA())
        {
          int i;
          if (!j.bHB().containsKey(this.euR))
          {
            i = 1;
            j = i;
            if (i == 0)
            {
              if (com.tencent.mm.modelvideo.t.mw(this.euR) == null) {
                j = 1;
              }
            }
            else
            {
              if (j == 0) {
                break;
              }
              w.w("MicroMsg.ImportMultiVideo", "remuxing job has been removed, filename %s", new Object[] { this.euR });
              GMTrace.o(725849473024L, 5408);
              return true;
            }
          }
          else
          {
            i = 0;
          }
        }
        int j = 0;
      }
      if ((this.set != null) && (!this.set.isDefault)) {
        this.outputWidth = this.set.width;
      }
      Object localObject3;
      for (this.outputHeight = this.set.height;; this.outputHeight = ???[1])
      {
        ??? = new PString();
        localObject3 = new PInt();
        if ((!((com.tencent.mm.plugin.r.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.r.a.a.class)).yR().a(this.hac, (PString)???, (PInt)localObject3)) || (!com.tencent.mm.sdk.platformtools.j.eR(((PString)???).value, this.ser))) {
          break;
        }
        w.i("MicroMsg.ImportMultiVideo", "copy remuxing file success, do not remuxing again.");
        this.ses = ((PInt)localObject3).value;
        this.seu = true;
        GMTrace.o(725849473024L, 5408);
        return true;
        ??? = new int[2];
        j.b(this.hac, (int[])???);
        this.outputWidth = ???[0];
      }
      long l = bg.Pw();
      boolean bool;
      if (this.set != null)
      {
        w.i("MicroMsg.ImportMultiVideo", "remuxing new para %s", new Object[] { this.set });
        if (com.tencent.mm.plugin.sight.base.b.oRC) {
          this.set.videoBitrate = ((int)(this.set.videoBitrate * 0.915D));
        }
        this.ses = SightVideoJNI.remuxing(this.hac, this.ser, this.outputWidth, this.outputHeight, this.set.videoBitrate, this.set.gBn, 8, this.set.gBm, 25.0F, this.set.fps, null, 0, com.tencent.mm.plugin.sight.base.b.oRC);
        this.sev = ((int)bg.aI(l));
        w.i("MicroMsg.ImportMultiVideo", "remuxing [%s] to [%s], result %d, resolution:[%d, %d]", new Object[] { this.hac, this.ser, Integer.valueOf(this.ses), Integer.valueOf(this.outputWidth), Integer.valueOf(this.outputHeight) });
        if (this.ses < 0) {
          break label632;
        }
        bool = true;
        label458:
        this.seu = bool;
        ??? = new PInt();
        localObject3 = new PInt();
        if (com.tencent.mm.modelvideo.t.a(this.ser, (PInt)???, (PInt)localObject3)) {
          this.ses = ((PInt)???).value;
        }
        if (this.seu) {
          break label638;
        }
        w.w("MicroMsg.ImportMultiVideo", "remuxing video error, copy source video to send.");
        com.tencent.mm.loader.stub.b.deleteFile(this.ser);
        com.tencent.mm.sdk.platformtools.j.r(this.hac, this.ser, false);
      }
      label632:
      label638:
      PInt localPInt;
      for (;;)
      {
        GMTrace.o(725849473024L, 5408);
        return true;
        w.w("MicroMsg.ImportMultiVideo", "remuxing but new para is null. %s", new Object[] { this.euR });
        if (com.tencent.mm.plugin.sight.base.b.oRC) {
          com.tencent.mm.plugin.sight.base.b.oRE = (int)(com.tencent.mm.plugin.sight.base.b.oRE * 0.915D);
        }
        this.ses = SightVideoJNI.remuxing(this.hac, this.ser, this.outputWidth, this.outputHeight, com.tencent.mm.plugin.sight.base.b.oRE, com.tencent.mm.plugin.sight.base.b.oRD, 8, 2, 25.0F, com.tencent.mm.plugin.sight.base.b.oRF, null, 0, com.tencent.mm.plugin.sight.base.b.oRC);
        break;
        bool = false;
        break label458;
        w.i("MicroMsg.ImportMultiVideo", "remuxing video sucess,insert to media duplication storage");
        try
        {
          ??? = new File(this.ser).getName();
          localObject3 = this.ser + ".tmp";
          localPInt = new PInt(0);
          if (!com.tencent.mm.plugin.a.d.b(this.ser, (String)localObject3, localPInt)) {
            break label875;
          }
          bool = com.tencent.mm.loader.stub.b.deleteFile(this.ser);
          localObject3 = new File((String)localObject3);
          w.i("MicroMsg.ImportMultiVideo", "fast start success. delOld[%b] rename[%b] path[%s] target[%s]", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(com.tencent.mm.a.e.g(((File)localObject3).getParent() + File.separator, ((File)localObject3).getName(), (String)???)), ((File)localObject3).getAbsolutePath(), this.ser });
          g.ork.a(354L, 30L, 1L, false);
          ((com.tencent.mm.plugin.r.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.r.a.a.class)).yR().H(this.hac, this.ser, this.ses);
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.ImportMultiVideo", "fast start exception e[%s]", new Object[] { localException.toString() });
        }
      }
      label875:
      if (localPInt.value != 1) {
        g.ork.a(354L, 31L, 1L, false);
      }
      for (;;)
      {
        w.i("MicroMsg.ImportMultiVideo", "fast start fail. msg[%d] importpath[%s] targetPath[%s]", new Object[] { Integer.valueOf(localPInt.value), this.hac, this.ser });
        break;
        g.ork.a(354L, 32L, 1L, false);
        g.ork.i(13836, new Object[] { Integer.valueOf(600), Long.valueOf(bg.Pu()), this.ser });
      }
    }
    
    public final boolean Dk()
    {
      GMTrace.i(725983690752L, 5409);
      for (;;)
      {
        synchronized (j.bHA())
        {
          j.bHB().remove(this.euR);
          if (this.seu)
          {
            j.cy(this.ser, this.tmT);
            j.e(this.seu, this.hac, this.ser);
            if (!com.tencent.mm.plugin.sight.base.b.oRC) {
              break label188;
            }
            i = 1;
            j.a(i, this.sev, this.hac, this.ser, this.ses);
            if (this.tmT != 1) {
              break label193;
            }
            i = 8;
            if (!this.seu) {
              break label198;
            }
            j = 1;
            n.Nf().a(this.hac, this.ser, this.toUser, "", "", i, j);
            com.tencent.mm.modelvideo.t.i(this.euR, this.ses, 43);
            com.tencent.mm.modelvideo.t.mr(this.euR);
            GMTrace.o(725983690752L, 5409);
            return false;
          }
        }
        j.cz(this.ser, this.tmT);
        continue;
        label188:
        int i = 0;
        continue;
        label193:
        i = 1;
        continue;
        label198:
        int j = 3;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */