package com.tencent.mm.modelvideo;

import android.content.ContentValues;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class t
{
  public static boolean N(String paramString, int paramInt)
  {
    int i = 0;
    GMTrace.i(358092898304L, 2668);
    r localr = mw(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " getinfo failed: " + paramString);
      GMTrace.o(358092898304L, 2668);
      return false;
    }
    if (paramInt != localr.gsL)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.VideoLogic", "download video finish, but file size is not equals db size[%d, %d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localr.gsL) });
      localr.gsL = paramInt;
      i = 32;
    }
    localr.hcp = paramInt;
    localr.hct = bg.Pu();
    d(localr);
    localr.status = 199;
    localr.eQl = (i | 0x510);
    boolean bool = e(localr);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "END!!!  updateRecv  file:" + paramString + " newsize:" + paramInt + " total:" + localr.gsL + " status:" + localr.status + " netTimes:" + localr.hcx + " update ret: " + bool);
    GMTrace.o(358092898304L, 2668);
    return bool;
  }
  
  public static void O(String paramString, int paramInt)
  {
    GMTrace.i(359971946496L, 2682);
    paramString = mw(paramString);
    if (paramString != null)
    {
      paramString.status = 122;
      paramString.hcu = bg.Pu();
      paramString.hct = bg.Pu();
      paramString.gAU = paramInt;
      paramString.eQl = 268438784;
      boolean bool = o.Nh().b(paramString);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "set online video Completion ret: " + bool + " status: " + paramString.status);
    }
    GMTrace.o(359971946496L, 2682);
  }
  
  public static boolean P(String paramString, int paramInt)
  {
    GMTrace.i(360240381952L, 2684);
    boolean bool = b(mw(paramString), paramInt);
    GMTrace.o(360240381952L, 2684);
    return bool;
  }
  
  public static long a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(356884938752L, 2659);
    if (bg.nm(paramString1))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.VideoLogic", "do prepare, but file name is null, type %d", new Object[] { Integer.valueOf(paramInt2) });
      GMTrace.o(356884938752L, 2659);
      return -1L;
    }
    if (bg.nm(paramString2))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.VideoLogic", "do prepare, but toUser is null, type %d", new Object[] { Integer.valueOf(paramInt2) });
      GMTrace.o(356884938752L, 2659);
      return -1L;
    }
    r localr = new r();
    localr.euR = paramString1;
    localr.hcv = 1;
    localr.eQu = paramString2;
    localr.hcn = ((String)com.tencent.mm.kernel.h.xy().xh().get(2, ""));
    localr.hcs = bg.Pu();
    localr.hct = bg.Pu();
    localr.hcB = null;
    localr.hac = paramString3;
    if (!bg.nm(paramString3)) {
      localr.hcz = 1;
    }
    if (62 == paramInt2)
    {
      localr.hcz = 0;
      paramInt1 = 3;
    }
    for (;;)
    {
      localr.hcC = paramInt1;
      localr.gsL = 0;
      localr.status = 106;
      paramString2 = new au();
      paramString2.db(localr.Nq());
      paramString2.setType(paramInt2);
      paramString2.dC(1);
      paramString2.dc(paramString1);
      paramString2.dB(8);
      paramString2.E(bc.gR(localr.Nq()));
      long l = bc.i(paramString2);
      localr.hcw = ((int)l);
      if (!o.Nh().a(localr)) {
        break;
      }
      GMTrace.o(356884938752L, 2659);
      return l;
      if (localr.hcz == 0) {
        paramInt1 = 1;
      } else {
        paramInt1 = -1;
      }
    }
    GMTrace.o(356884938752L, 2659);
    return -1L;
  }
  
  public static boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, int paramInt3)
  {
    GMTrace.i(356616503296L, 2657);
    boolean bool = a(paramString1, paramInt1, paramString2, paramString3, paramInt2, paramString4, paramInt3, null, "");
    GMTrace.o(356616503296L, 2657);
    return bool;
  }
  
  public static boolean a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, int paramInt3, bhr parambhr, String paramString5)
  {
    GMTrace.i(356750721024L, 2658);
    r localr = new r();
    localr.euR = paramString1;
    localr.hcv = paramInt1;
    localr.eQu = paramString2;
    localr.hcn = ((String)com.tencent.mm.kernel.h.xy().xh().get(2, ""));
    localr.hcs = bg.Pu();
    localr.hct = bg.Pu();
    localr.hcB = paramString4;
    localr.hac = paramString3;
    localr.hcE = parambhr;
    localr.eTv = paramString5;
    if (!bg.nm(paramString3)) {
      localr.hcz = 1;
    }
    if (paramInt2 > 0) {
      localr.hcz = 1;
    }
    if (62 == paramInt3) {
      localr.hcC = 3;
    }
    for (;;)
    {
      o.Nh();
      paramInt1 = s.mm(s.mk(paramString1));
      if (paramInt1 > 0) {
        break;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "get Video size failed :" + paramString1);
      GMTrace.o(356750721024L, 2658);
      return false;
      if (paramInt2 > 0) {
        localr.hcC = 2;
      } else {
        localr.hcC = 1;
      }
    }
    localr.gsL = paramInt1;
    o.Nh();
    paramString2 = s.ml(paramString1);
    paramInt1 = s.mm(paramString2);
    if (paramInt1 <= 0)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "get Thumb size failed :" + paramString2 + " size:" + paramInt1);
      GMTrace.o(356750721024L, 2658);
      return false;
    }
    localr.hcr = paramInt1;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "init record file:" + paramString1 + " thumbsize:" + localr.hcr + " videosize:" + localr.gsL + " msgType:" + paramInt3);
    localr.status = 102;
    paramString2 = new au();
    paramString2.db(localr.Nq());
    paramString2.setType(paramInt3);
    paramString2.dC(1);
    paramString2.dc(paramString1);
    paramString2.dB(1);
    paramString2.E(bc.gR(localr.Nq()));
    localr.hcw = ((int)bc.i(paramString2));
    boolean bool = o.Nh().a(localr);
    GMTrace.o(356750721024L, 2658);
    return bool;
  }
  
  /* Error */
  public static boolean a(String paramString, PInt paramPInt1, PInt paramPInt2)
  {
    // Byte code:
    //   0: ldc2_w 305
    //   3: sipush 2686
    //   6: invokestatic 14	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokestatic 159	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   13: ifeq +22 -> 35
    //   16: ldc 20
    //   18: ldc_w 308
    //   21: invokestatic 310	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: ldc2_w 305
    //   27: sipush 2686
    //   30: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: iconst_0
    //   34: ireturn
    //   35: new 312	android/media/MediaMetadataRetriever
    //   38: dup
    //   39: invokespecial 313	android/media/MediaMetadataRetriever:<init>	()V
    //   42: astore 4
    //   44: aload 4
    //   46: astore_3
    //   47: aload 4
    //   49: aload_0
    //   50: invokevirtual 316	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   53: aload 4
    //   55: astore_3
    //   56: aload_1
    //   57: aload 4
    //   59: bipush 9
    //   61: invokevirtual 320	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   64: iconst_0
    //   65: invokestatic 324	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   68: i2l
    //   69: invokestatic 328	com/tencent/mm/sdk/platformtools/bg:eN	(J)I
    //   72: putfield 333	com/tencent/mm/pointers/PInt:value	I
    //   75: aload 4
    //   77: astore_3
    //   78: aload_2
    //   79: aload 4
    //   81: bipush 20
    //   83: invokevirtual 320	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   86: iconst_0
    //   87: invokestatic 324	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   90: sipush 1000
    //   93: idiv
    //   94: putfield 333	com/tencent/mm/pointers/PInt:value	I
    //   97: aload 4
    //   99: invokevirtual 336	android/media/MediaMetadataRetriever:release	()V
    //   102: ldc 20
    //   104: ldc_w 338
    //   107: iconst_3
    //   108: anewarray 4	java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: aload_2
    //   114: getfield 333	com/tencent/mm/pointers/PInt:value	I
    //   117: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   120: aastore
    //   121: dup
    //   122: iconst_1
    //   123: aload_1
    //   124: getfield 333	com/tencent/mm/pointers/PInt:value	I
    //   127: invokestatic 66	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   130: aastore
    //   131: dup
    //   132: iconst_2
    //   133: aload_0
    //   134: aastore
    //   135: invokestatic 340	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: ldc2_w 305
    //   141: sipush 2686
    //   144: invokestatic 52	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   147: iconst_1
    //   148: ireturn
    //   149: astore 5
    //   151: aconst_null
    //   152: astore 4
    //   154: aload 4
    //   156: astore_3
    //   157: ldc 20
    //   159: aload 5
    //   161: ldc_w 342
    //   164: iconst_1
    //   165: anewarray 4	java/lang/Object
    //   168: dup
    //   169: iconst_0
    //   170: aload_0
    //   171: aastore
    //   172: invokestatic 346	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: aload 4
    //   177: ifnull -75 -> 102
    //   180: aload 4
    //   182: invokevirtual 336	android/media/MediaMetadataRetriever:release	()V
    //   185: goto -83 -> 102
    //   188: astore_0
    //   189: aconst_null
    //   190: astore_3
    //   191: aload_3
    //   192: ifnull +7 -> 199
    //   195: aload_3
    //   196: invokevirtual 336	android/media/MediaMetadataRetriever:release	()V
    //   199: aload_0
    //   200: athrow
    //   201: astore_0
    //   202: goto -11 -> 191
    //   205: astore 5
    //   207: goto -53 -> 154
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	210	0	paramString	String
    //   0	210	1	paramPInt1	PInt
    //   0	210	2	paramPInt2	PInt
    //   46	150	3	localMediaMetadataRetriever1	android.media.MediaMetadataRetriever
    //   42	139	4	localMediaMetadataRetriever2	android.media.MediaMetadataRetriever
    //   149	11	5	localException1	Exception
    //   205	1	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   35	44	149	java/lang/Exception
    //   35	44	188	finally
    //   47	53	201	finally
    //   56	75	201	finally
    //   78	97	201	finally
    //   157	175	201	finally
    //   47	53	205	java/lang/Exception
    //   56	75	205	java/lang/Exception
    //   78	97	205	java/lang/Exception
  }
  
  public static int aC(long paramLong)
  {
    GMTrace.i(357421809664L, 2663);
    Object localObject = o.Nh().aB(paramLong).iterator();
    while (((Iterator)localObject).hasNext())
    {
      r localr = (r)((Iterator)localObject).next();
      int i = localr.status;
      localr.status = 200;
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", com.tencent.mm.compatible.util.g.tC() + "startSend file:" + localr.getFileName() + " status:[" + i + "->" + localr.status + "]");
      localr.hcu = bg.Pu();
      localr.hct = bg.Pu();
      localr.eQl = 3328;
      if (!e(localr))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR on start MassSend:" + com.tencent.mm.compatible.util.g.tC() + " update failed: " + localr.getFileName());
        i = com.tencent.mm.compatible.util.g.tA();
        GMTrace.o(357421809664L, 2663);
        return 0 - i;
      }
    }
    localObject = o.Nn();
    com.tencent.mm.kernel.h.xB().A(new m.3((m)localObject));
    GMTrace.o(357421809664L, 2663);
    return 0;
  }
  
  public static boolean b(r paramr, int paramInt)
  {
    GMTrace.i(360374599680L, 2685);
    if (paramr != null)
    {
      paramr.gAU = paramInt;
      paramr.eQl = 268435456;
      boolean bool = e(paramr);
      GMTrace.o(360374599680L, 2685);
      return bool;
    }
    GMTrace.o(360374599680L, 2685);
    return false;
  }
  
  public static boolean b(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    GMTrace.i(356482285568L, 2656);
    boolean bool = a(paramString1, paramInt, paramString2, paramString3, 0, "", 43);
    GMTrace.o(356482285568L, 2656);
    return bool;
  }
  
  public static void c(r paramr)
  {
    GMTrace.i(357556027392L, 2664);
    if (paramr == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "video info is null");
      GMTrace.o(357556027392L, 2664);
      return;
    }
    au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramr.hcw);
    int i = localau.field_type;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "ashutest::updateWriteFinMsgInfo, msg type %d", new Object[] { Integer.valueOf(i) });
    if ((43 != i) && (62 != i))
    {
      GMTrace.o(357556027392L, 2664);
      return;
    }
    localau.dC(1);
    localau.db(paramr.Nq());
    localau.D(paramr.eSf);
    localau.dB(2);
    localau.setContent(p.b(paramr.Nr(), paramr.hcv, false));
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramr.hcw, localau);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "[oneliang][updateWriteFinMsgInfo], msgId:%d", new Object[] { Long.valueOf(localau.field_msgId) });
    GMTrace.o(357556027392L, 2664);
  }
  
  public static String d(long paramLong, int paramInt)
  {
    GMTrace.i(359703511040L, 2680);
    String str = paramLong + "_" + paramInt;
    GMTrace.o(359703511040L, 2680);
    return str;
  }
  
  public static void d(String paramString, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(359435075584L, 2678);
    if (bg.nm(paramString))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.VideoLogic", "noteVideoPlayHistory error filename[%s]", new Object[] { paramString });
      GMTrace.o(359435075584L, 2678);
      return;
    }
    int i = paramInt;
    if (paramInt < 0) {
      i = 0;
    }
    i /= 1000;
    long l1 = bg.Pw();
    w localw;
    ContentValues localContentValues;
    long l2;
    boolean bool;
    if (!o.Nk().mC(paramString))
    {
      localw = o.Nk();
      int j = (int)(bg.Pv() / 1000L);
      if (paramBoolean)
      {
        paramInt = 1;
        if (bg.nm(paramString)) {
          break label272;
        }
        localContentValues = new ContentValues();
        localContentValues.put("filename", paramString);
        localContentValues.put("starttime", Integer.valueOf(j));
        localContentValues.put("playduration", Integer.valueOf(i));
        localContentValues.put("downloadway", Integer.valueOf(paramInt));
        l2 = localw.fTZ.insert("VideoPlayHistory", "filename", localContentValues);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoPlayHistoryStorage", "insert video play history ret : " + l2);
        if (l2 <= 0L) {
          break label272;
        }
        bool = true;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "noteVideoPlayHistory ret %b filename %s playDuration %d isOnlinePlay %b cost %d", new Object[] { Boolean.valueOf(bool), paramString, Integer.valueOf(i), Boolean.valueOf(paramBoolean), Long.valueOf(bg.aI(l1)) });
      GMTrace.o(359435075584L, 2678);
      return;
      paramInt = 0;
      break;
      label272:
      bool = false;
      continue;
      localw = o.Nk();
      paramInt = (int)(bg.Pv() / 1000L);
      if (!bg.nm(paramString))
      {
        localContentValues = new ContentValues();
        localContentValues.put("starttime", Integer.valueOf(paramInt));
        localContentValues.put("playduration", Integer.valueOf(i));
        l2 = localw.fTZ.update("VideoPlayHistory", localContentValues, "filename=?", new String[] { paramString });
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoPlayHistoryStorage", "update video play history ret : " + l2);
        if (l2 > 0L)
        {
          bool = true;
          continue;
        }
      }
      bool = false;
    }
  }
  
  static boolean d(r paramr)
  {
    GMTrace.i(357690245120L, 2665);
    au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramr.hcw);
    int i = localau.field_type;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "ashutest::update read fin msg info, msg type %d", new Object[] { Integer.valueOf(i) });
    if ((43 != i) && (62 != i))
    {
      GMTrace.o(357690245120L, 2665);
      return false;
    }
    localau.D(paramr.eSf);
    localau.setContent(p.b(paramr.Nr(), paramr.hcv, false));
    localau.db(paramr.Nq());
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "set msg content :" + localau.field_content);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().b(paramr.eSf, localau);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "[oneliang][updateReadFinMsgInfo], msgId:%d", new Object[] { Long.valueOf(localau.field_msgId) });
    if (localau.bTH()) {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "on receive sight, sightFileSize %d bytes", new Object[] { Integer.valueOf(paramr.gsL) });
    }
    GMTrace.o(357690245120L, 2665);
    return true;
  }
  
  public static boolean e(r paramr)
  {
    GMTrace.i(358629769216L, 2672);
    if (paramr == null)
    {
      GMTrace.o(358629769216L, 2672);
      return false;
    }
    if (((paramr.getFileName() == null) || (paramr.getFileName().length() <= 0)) && (paramr.eQl == -1))
    {
      GMTrace.o(358629769216L, 2672);
      return false;
    }
    boolean bool = o.Nh().b(paramr);
    GMTrace.o(358629769216L, 2672);
    return bool;
  }
  
  public static int f(long paramLong, String paramString)
  {
    GMTrace.i(359837728768L, 2681);
    if (bg.nm(paramString))
    {
      GMTrace.o(359837728768L, 2681);
      return -1;
    }
    try
    {
      paramString = paramString.split("_");
      int i;
      if (paramString != null)
      {
        i = paramString.length;
        if (i == 2) {}
      }
      else
      {
        GMTrace.o(359837728768L, 2681);
        return -1;
      }
      if (bg.getLong(paramString[0], 0L) == paramLong)
      {
        i = bg.getInt(paramString[1], 0);
        GMTrace.o(359837728768L, 2681);
        return i;
      }
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "parseEnterVideoOpTips error: " + paramString.toString());
      GMTrace.o(359837728768L, 2681);
    }
    return -1;
  }
  
  public static int f(r paramr)
  {
    GMTrace.i(358898204672L, 2674);
    if (paramr.gsL == 0)
    {
      GMTrace.o(358898204672L, 2674);
      return 0;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "cdntra getDownloadProgress :" + paramr.hcp + " " + paramr.gsL);
    int i = paramr.hcp * 100 / paramr.gsL;
    GMTrace.o(358898204672L, 2674);
    return i;
  }
  
  public static int g(r paramr)
  {
    GMTrace.i(359032422400L, 2675);
    if (paramr.gsL == 0)
    {
      GMTrace.o(359032422400L, 2675);
      return 0;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "cdntra getUploadProgress :" + paramr.hbc + " " + paramr.gsL);
    int i = paramr.hbc * 100 / paramr.gsL;
    GMTrace.o(359032422400L, 2675);
    return i;
  }
  
  public static void i(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(357153374208L, 2661);
    r localr = mw(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.VideoLogic", "update, but video info is null, fileName %s, msgType %d", new Object[] { paramString, Integer.valueOf(paramInt2) });
      GMTrace.o(357153374208L, 2661);
      return;
    }
    o.Nh();
    int i = s.mm(s.mk(paramString));
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "update, video size %d, msgType %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2) });
    localr.gsL = i;
    localr.hcv = paramInt1;
    Object localObject = localr.hcF;
    ((anf)localObject).uBY = false;
    localr.hcF = ((anf)localObject);
    localr.status = 102;
    o.Nh();
    localr.hcr = s.mm(s.ml(paramString));
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "update prepare:" + paramString + " thumbsize:" + localr.hcr);
    localr.eQl = 4512;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "update to db, result %B, msgType %d", new Object[] { Boolean.valueOf(e(localr)), Integer.valueOf(paramInt2) });
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(localr.hcw);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "before update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((ce)localObject).field_msgId), Long.valueOf(((ce)localObject).field_msgSvrId), ((ce)localObject).field_talker, Integer.valueOf(((ce)localObject).field_type), Integer.valueOf(((ce)localObject).field_isSend), ((ce)localObject).field_imgPath, Integer.valueOf(((ce)localObject).field_status), Long.valueOf(((ce)localObject).field_createTime) });
    ((au)localObject).db(localr.Nq());
    ((au)localObject).setType(paramInt2);
    ((au)localObject).dC(1);
    ((au)localObject).dc(paramString);
    ((au)localObject).dB(1);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((ce)localObject).field_msgId), Long.valueOf(((ce)localObject).field_msgSvrId), ((ce)localObject).field_talker, Integer.valueOf(((ce)localObject).field_type), Integer.valueOf(((ce)localObject).field_isSend), ((ce)localObject).field_imgPath, Integer.valueOf(((ce)localObject).field_status), Long.valueOf(((ce)localObject).field_createTime) });
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(localr.hcw, (au)localObject);
    GMTrace.o(357153374208L, 2661);
  }
  
  public static int mA(String paramString)
  {
    GMTrace.i(360106164224L, 2683);
    r localr = mw(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " getinfo failed: " + paramString);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(360106164224L, 2683);
      return 0 - i;
    }
    if ((localr.status != 111) && (localr.status != 113) && (localr.status != 121) && (localr.status != 122) && (localr.status != 123))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " get status failed: " + paramString + " status:" + localr.status);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(360106164224L, 2683);
      return 0 - i;
    }
    int i = 256;
    com.tencent.mm.modelcontrol.d.Gv();
    if (com.tencent.mm.modelcontrol.d.GA()) {
      localr.status = 122;
    }
    for (;;)
    {
      localr.hcu = bg.Pu();
      localr.hct = bg.Pu();
      localr.eQl = (i | 0x800 | 0x400);
      if (e(localr)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " update failed: " + paramString);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(360106164224L, 2683);
      return 0 - i;
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.VideoLogic", "start complete online video, but can not stream video now!");
      localr.status = 112;
      localr.hcp = 0;
      i = 272;
    }
    o.Nm().NF();
    o.Nm().run();
    GMTrace.o(360106164224L, 2683);
    return 0;
  }
  
  public static boolean mo(String paramString)
  {
    GMTrace.i(355945414656L, 2652);
    if (paramString == null)
    {
      GMTrace.o(355945414656L, 2652);
      return false;
    }
    paramString = mw(paramString);
    if (paramString == null)
    {
      GMTrace.o(355945414656L, 2652);
      return false;
    }
    if (paramString.hcx >= 2500)
    {
      GMTrace.o(355945414656L, 2652);
      return false;
    }
    paramString.hcx += 1;
    paramString.eQl = 16384;
    boolean bool = e(paramString);
    GMTrace.o(355945414656L, 2652);
    return bool;
  }
  
  public static boolean mp(String paramString)
  {
    GMTrace.i(356079632384L, 2653);
    com.tencent.mm.plugin.report.service.g.ork.a(111L, 218L, 1L, false);
    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.VideoLogic", "setError file:%s stack:[%s]", new Object[] { paramString, bg.bQW() });
    o.Nm().eyW.remove(paramString);
    if (paramString == null)
    {
      GMTrace.o(356079632384L, 2653);
      return false;
    }
    r localr = mw(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "Set error failed file:" + paramString);
      GMTrace.o(356079632384L, 2653);
      return false;
    }
    localr.status = 198;
    localr.hct = (System.currentTimeMillis() / 1000L);
    localr.eQl = 1280;
    anf localanf = localr.hcF;
    localanf.uCa = 0;
    localr.hcF = localanf;
    boolean bool = e(localr);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "setError file:" + paramString + " msgid:" + localr.hcw + " old stat:" + localr.status);
    if ((localr == null) || (localr.hcw == 0))
    {
      GMTrace.o(356079632384L, 2653);
      return bool;
    }
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(localr.hcw);
    int i = paramString.field_type;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "set error, msg type %d", new Object[] { Integer.valueOf(i) });
    if ((43 != i) && (62 != i))
    {
      GMTrace.o(356079632384L, 2653);
      return bool;
    }
    com.tencent.mm.plugin.report.d.oqe.a(111L, 32L, 1L, true);
    paramString.db(localr.Nq());
    paramString.setContent(p.b(localr.Nr(), -1L, true));
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "[oneliang][setError]");
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramString.field_msgId, paramString);
    GMTrace.o(356079632384L, 2653);
    return bool;
  }
  
  public static boolean mq(String paramString)
  {
    GMTrace.i(356213850112L, 2654);
    paramString = mw(paramString);
    if ((paramString == null) || (paramString.hcw == 0))
    {
      GMTrace.o(356213850112L, 2654);
      return false;
    }
    au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramString.hcw);
    int i = localau.field_type;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "ashutest::setBlack, msg type %d", new Object[] { Integer.valueOf(i) });
    if ((43 != i) && (62 != i))
    {
      GMTrace.o(356213850112L, 2654);
      return false;
    }
    localau.setContent(p.b(paramString.Nr(), paramString.hcv, false));
    localau.dB(2);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramString.hcw, localau);
    paramString.status = 197;
    paramString.hct = bg.Pu();
    paramString.eQl = 1280;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "[oneliang][setBlack]");
    boolean bool = e(paramString);
    GMTrace.o(356213850112L, 2654);
    return bool;
  }
  
  public static int mr(String paramString)
  {
    GMTrace.i(357287591936L, 2662);
    r localr = mw(paramString);
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " getinfo failed: " + paramString);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(357287591936L, 2662);
      return 0 - i;
    }
    if ((localr.status != 102) && (localr.status != 105))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " get status failed: " + paramString + " status:" + localr.status);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(357287591936L, 2662);
      return 0 - i;
    }
    int i = localr.status;
    if ((localr.status != 102) && (localr.hcr == localr.hcq)) {}
    for (localr.status = 104;; localr.status = 103)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", com.tencent.mm.compatible.util.g.tC() + "startSend file:" + paramString + " status:[" + i + "->" + localr.status + "]");
      localr.hcu = bg.Pu();
      localr.hct = bg.Pu();
      localr.eQl = 3328;
      if (e(localr)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " update failed: " + paramString);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(357287591936L, 2662);
      return 0 - i;
    }
    o.Nm().run();
    GMTrace.o(357287591936L, 2662);
    return 0;
  }
  
  public static int ms(String paramString)
  {
    GMTrace.i(357824462848L, 2666);
    r localr = mw(paramString);
    int i;
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " getinfo failed: " + paramString);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(357824462848L, 2666);
      return 0 - i;
    }
    if ((localr.status != 111) && (localr.status != 113) && (localr.status != 121) && (localr.status != 122) && (localr.status != 123))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " get status failed: " + paramString + " status:" + localr.status);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(357824462848L, 2666);
      return 0 - i;
    }
    localr.status = 112;
    localr.hcu = bg.Pu();
    localr.hct = bg.Pu();
    localr.eQl = 3328;
    if (!e(localr))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " update failed: " + paramString);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(357824462848L, 2666);
      return 0 - i;
    }
    o.Nm().NF();
    o.Nm().run();
    GMTrace.o(357824462848L, 2666);
    return 0;
  }
  
  public static int mt(String paramString)
  {
    GMTrace.i(357958680576L, 2667);
    r localr = mw(paramString);
    int i;
    if (localr == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " getinfo failed: " + paramString);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(357958680576L, 2667);
      return 0 - i;
    }
    if ((localr.status != 112) && (localr.status != 120) && (localr.status != 122) && (localr.status != 123))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " get status failed: " + paramString + " status:" + localr.status);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(357958680576L, 2667);
      return 0 - i;
    }
    localr.status = 113;
    localr.hct = bg.Pu();
    localr.eQl = 1280;
    if (!e(localr))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.VideoLogic", "ERR:" + com.tencent.mm.compatible.util.g.tC() + " update failed: " + paramString);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(357958680576L, 2667);
      return 0 - i;
    }
    GMTrace.o(357958680576L, 2667);
    return 0;
  }
  
  public static boolean mu(String paramString)
  {
    GMTrace.i(358227116032L, 2669);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "resetMsgRecv fileName : " + paramString);
    r localr = new r();
    localr.status = 112;
    localr.hct = bg.Pu();
    localr.hcu = bg.Pu();
    localr.euR = paramString;
    localr.eQl = 3328;
    if (!e(localr))
    {
      GMTrace.o(358227116032L, 2669);
      return false;
    }
    o.Nm().run();
    GMTrace.o(358227116032L, 2669);
    return true;
  }
  
  public static boolean mv(String paramString)
  {
    GMTrace.i(358361333760L, 2670);
    r localr = mw(paramString);
    if (localr == null)
    {
      GMTrace.o(358361333760L, 2670);
      return false;
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "rsetMsgSend %s", new Object[] { paramString });
    paramString = localr.hcF;
    if (paramString != null)
    {
      paramString.uCa = 0;
      localr.hcF = paramString;
    }
    if (localr.hcq < localr.hcr) {}
    for (localr.status = 103;; localr.status = 104)
    {
      localr.hcs = bg.Pu();
      localr.hct = bg.Pu();
      localr.hcu = bg.Pu();
      localr.eQl = 536874752;
      if (e(localr)) {
        break;
      }
      GMTrace.o(358361333760L, 2670);
      return false;
    }
    o.Nm().run();
    GMTrace.o(358361333760L, 2670);
    return true;
  }
  
  public static r mw(String paramString)
  {
    GMTrace.i(358495551488L, 2671);
    if (bg.nm(paramString))
    {
      GMTrace.o(358495551488L, 2671);
      return null;
    }
    paramString = o.Nh().mh(paramString);
    GMTrace.o(358495551488L, 2671);
    return paramString;
  }
  
  public static String mx(String paramString)
  {
    GMTrace.i(358763986944L, 2673);
    String str = com.tencent.mm.compatible.util.e.fRZ + bg.Pv() + ".mp4";
    if (!j.eR(paramString, str))
    {
      GMTrace.o(358763986944L, 2673);
      return null;
    }
    GMTrace.o(358763986944L, 2673);
    return str;
  }
  
  public static boolean my(String paramString)
  {
    GMTrace.i(359166640128L, 2676);
    if (bg.nm(paramString))
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.VideoLogic", "check short video was replaced, but filename is null.");
      GMTrace.o(359166640128L, 2676);
      return false;
    }
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "checkShortVideoWasReplaced filename: " + paramString);
    Object localObject = mw(paramString);
    if ((localObject != null) && (((r)localObject).status == 199))
    {
      int i = ((r)localObject).gsL;
      o.Nh();
      int j = com.tencent.mm.a.e.aY(s.mk(paramString));
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "it short video file size[%d] infoLen[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      if ((j > 0) && (Math.abs(j - i) > 16))
      {
        com.tencent.mm.sdk.platformtools.w.w("MicroMsg.VideoLogic", "it error short video can not retransmit. file size[%d], video info size[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        paramString = ((r)localObject).getFileName();
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 217L, 1L, false);
        paramString = mw(paramString);
        if (paramString != null)
        {
          localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramString.hcw);
          i = ((ce)localObject).field_type;
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.VideoLogic", "ashutest::setBroken, msg type %d", new Object[] { Integer.valueOf(i) });
          if ((43 == i) || (62 == i))
          {
            ((au)localObject).setContent(p.b(paramString.Nr(), paramString.hcv, false));
            ((au)localObject).dB(2);
            ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramString.hcw, (au)localObject);
            paramString.status = 196;
            paramString.hct = bg.Pu();
            paramString.eQl = 1280;
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "[oneliang][setBroken]");
            e(paramString);
          }
        }
        GMTrace.o(359166640128L, 2676);
        return true;
      }
    }
    GMTrace.o(359166640128L, 2676);
    return false;
  }
  
  public static void mz(String paramString)
  {
    boolean bool = true;
    GMTrace.i(359569293312L, 2679);
    if (bg.nm(paramString))
    {
      GMTrace.o(359569293312L, 2679);
      return;
    }
    if (o.Nk().fTZ.delete("VideoPlayHistory", "filename= ?", new String[] { paramString }) > 0) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "delete video play history ret : " + bool + " filename : " + paramString);
      GMTrace.o(359569293312L, 2679);
      return;
      bool = false;
    }
  }
  
  public static int t(int paramInt, String paramString)
  {
    GMTrace.i(359300857856L, 2677);
    long l = bg.Pw();
    PInt localPInt1 = new PInt();
    PInt localPInt2 = new PInt();
    if ((o.Nk().b(paramString, localPInt1, localPInt2)) && (bg.aG(localPInt1.value) < 300L)) {}
    for (int i = localPInt2.value;; i = 0)
    {
      int j;
      if (i >= 0)
      {
        j = i;
        if (i < paramInt - 1) {}
      }
      else
      {
        j = 0;
      }
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.VideoLogic", "check last play duration result[%d] startTime[%d] filename[%s] cost %d", new Object[] { Integer.valueOf(j), Integer.valueOf(localPInt1.value), paramString, Long.valueOf(bg.aI(l)) });
      GMTrace.o(359300857856L, 2677);
      return j;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */