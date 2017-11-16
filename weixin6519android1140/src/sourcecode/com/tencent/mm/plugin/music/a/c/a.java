package com.tencent.mm.plugin.music.a.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.network.b;
import com.tencent.mm.network.u;
import com.tencent.mm.plugin.music.a.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  implements Runnable
{
  public com.tencent.mm.at.a eNq;
  public int glO;
  public boolean isStop;
  public boolean lcN;
  public String mimeType;
  public float nrn;
  private long nro;
  public int nrp;
  public b nrq;
  
  public a(com.tencent.mm.at.a parama)
  {
    GMTrace.i(4844588892160L, 36095);
    this.nro = 307200L;
    this.isStop = true;
    this.mimeType = "";
    this.nrp = -1;
    this.glO = 0;
    this.eNq = parama;
    this.lcN = am.isWifi(ab.getContext());
    GMTrace.o(4844588892160L, 36095);
  }
  
  private static long[] DL(String paramString)
  {
    GMTrace.i(4845394198528L, 36101);
    if (bg.nm(paramString))
    {
      GMTrace.o(4845394198528L, 36101);
      return null;
    }
    try
    {
      paramString = paramString.replace("bytes", "").trim().split("-");
      long l1 = Long.valueOf(paramString[0]).longValue();
      paramString = paramString[1].split("/");
      long l2 = Long.valueOf(paramString[0]).longValue();
      long l3 = Long.valueOf(paramString[1]).longValue();
      GMTrace.o(4845394198528L, 36101);
      return new long[] { l1, l2, l3 };
    }
    catch (Exception paramString)
    {
      GMTrace.o(4845394198528L, 36101);
    }
    return null;
  }
  
  private void cT(long paramLong)
  {
    GMTrace.i(4845125763072L, 36099);
    if (this.lcN)
    {
      this.eNq.field_wifiDownloadedLength = paramLong;
      h.aSt().P(this.eNq.field_musicId, paramLong);
      h.aSt().bw(this.eNq.field_musicId, 1);
      h.aSt().Q(this.eNq.field_musicId, paramLong);
    }
    for (;;)
    {
      af.t(new a(2));
      GMTrace.o(4845125763072L, 36099);
      return;
      this.eNq.field_downloadedLength = paramLong;
      h.aSt().R(this.eNq.field_musicId, paramLong);
      h.aSt().bx(this.eNq.field_musicId, 1);
      h.aSt().S(this.eNq.field_musicId, paramLong);
    }
  }
  
  private static u h(String paramString, Map<String, String> paramMap)
  {
    GMTrace.i(16285979115520L, 121340);
    Object localObject2 = null;
    int i = 0;
    Object localObject1 = paramString;
    paramString = (String)localObject2;
    for (;;)
    {
      if (paramString != null) {
        paramString.hhh.disconnect();
      }
      w.i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect, downloadUrl:%s", new Object[] { localObject1 });
      paramString = b.a((String)localObject1, null);
      paramString.setRequestMethod("GET");
      paramString.setConnectTimeout(25000);
      paramString.hhh.setInstanceFollowRedirects(true);
      localObject1 = paramMap.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        paramString.setRequestProperty((String)((Map.Entry)localObject2).getKey(), (String)((Map.Entry)localObject2).getValue());
      }
      int j = paramString.getResponseCode();
      w.i("MicroMsg.Music.MusicDownloadTask", "getUrlConnect response:%d, redirectCount:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      if ((j != 300) && (j != 301) && (j != 302) && (j != 303)) {
        break;
      }
      rw(j);
      localObject1 = paramString.getHeaderField("Location");
      if (localObject1 == null)
      {
        w.e("MicroMsg.Music.MusicDownloadTask", "Invalid redirect,  response:%d", new Object[] { Integer.valueOf(j) });
        GMTrace.o(16285979115520L, 121340);
        return paramString;
      }
      localObject2 = new URL(paramString.hhh.getURL(), (String)localObject1);
      w.i("MicroMsg.Music.MusicDownloadTask", "location:%s", new Object[] { localObject1 });
      w.i("MicroMsg.Music.MusicDownloadTask", "tempUrl:%s", new Object[] { ((URL)localObject2).toString() });
      if ((!((URL)localObject2).getProtocol().equals("https")) && (!((URL)localObject2).getProtocol().equals("http")))
      {
        w.e("MicroMsg.Music.MusicDownloadTask", "Unsupported protocol redirect,  response:%d", new Object[] { Integer.valueOf(j) });
        GMTrace.o(16285979115520L, 121340);
        return paramString;
      }
      i += 1;
      if (i > 5)
      {
        w.e("MicroMsg.Music.MusicDownloadTask", "Too many redirects: " + i);
        GMTrace.o(16285979115520L, 121340);
        return paramString;
      }
      localObject1 = ((URL)localObject2).toString();
    }
    GMTrace.o(16285979115520L, 121340);
    return paramString;
  }
  
  private void q(long paramLong1, long paramLong2)
  {
    GMTrace.i(4845259980800L, 36100);
    if (this.lcN)
    {
      this.eNq.field_wifiDownloadedLength = paramLong1;
      h.aSt().P(this.eNq.field_musicId, paramLong1);
      h.aSt().bw(this.eNq.field_musicId, 0);
      h.aSt().Q(this.eNq.field_musicId, paramLong2);
    }
    for (;;)
    {
      af.t(new a(3));
      GMTrace.o(4845259980800L, 36100);
      return;
      this.eNq.field_downloadedLength = paramLong1;
      h.aSt().R(this.eNq.field_musicId, paramLong1);
      h.aSt().bx(this.eNq.field_musicId, 0);
      h.aSt().S(this.eNq.field_musicId, paramLong2);
    }
  }
  
  private static void rw(int paramInt)
  {
    GMTrace.i(16286113333248L, 121341);
    if ((paramInt == 300) || (paramInt == 301) || (paramInt == 302) || (paramInt == 303))
    {
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(558);
      localIDKey.SetKey(15);
      localIDKey.SetValue(1L);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localIDKey);
      g.ork.b(localArrayList, true);
    }
    GMTrace.o(16286113333248L, 121341);
  }
  
  private void rx(int paramInt)
  {
    GMTrace.i(4844991545344L, 36098);
    af.t(new a(paramInt));
    GMTrace.o(4844991545344L, 36098);
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: ldc2_w 368
    //   3: ldc_w 370
    //   6: invokestatic 42	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   13: ifeq +13 -> 26
    //   16: ldc2_w 368
    //   19: ldc_w 370
    //   22: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   25: return
    //   26: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   29: invokestatic 373	com/tencent/mm/sdk/platformtools/am:isNetworkConnected	(Landroid/content/Context;)Z
    //   32: istore 32
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield 56	com/tencent/mm/plugin/music/a/c/a:glO	I
    //   39: aload_0
    //   40: iconst_0
    //   41: putfield 54	com/tencent/mm/plugin/music/a/c/a:nrp	I
    //   44: iload 32
    //   46: ifeq +529 -> 575
    //   49: aload_0
    //   50: getfield 72	com/tencent/mm/plugin/music/a/c/a:lcN	Z
    //   53: ifeq +367 -> 420
    //   56: new 375	com/tencent/mm/pointers/PBool
    //   59: dup
    //   60: invokespecial 376	com/tencent/mm/pointers/PBool:<init>	()V
    //   63: astore 35
    //   65: aload_0
    //   66: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   69: getfield 379	com/tencent/mm/at/a:field_songWifiUrl	Ljava/lang/String;
    //   72: invokestatic 89	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   75: ifeq +307 -> 382
    //   78: aload_0
    //   79: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   82: getfield 382	com/tencent/mm/at/a:field_songWebUrl	Ljava/lang/String;
    //   85: astore 33
    //   87: aload 33
    //   89: aload_0
    //   90: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   93: getfield 385	com/tencent/mm/at/a:field_songWapLinkUrl	Ljava/lang/String;
    //   96: iconst_1
    //   97: aload 35
    //   99: invokestatic 390	com/tencent/mm/plugin/music/a/g:a	(Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/pointers/PBool;)Ljava/lang/String;
    //   102: astore 34
    //   104: aload 35
    //   106: getfield 393	com/tencent/mm/pointers/PBool:value	Z
    //   109: istore 32
    //   111: aload_0
    //   112: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   115: getfield 129	com/tencent/mm/at/a:field_wifiDownloadedLength	J
    //   118: lstore 6
    //   120: aload_0
    //   121: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   124: getfield 396	com/tencent/mm/at/a:field_songWifiFileLength	J
    //   127: lstore 4
    //   129: lload 4
    //   131: lconst_0
    //   132: lcmp
    //   133: ifeq +13 -> 146
    //   136: aload_0
    //   137: lload 4
    //   139: ldc2_w 397
    //   142: ldiv
    //   143: putfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   146: lload 6
    //   148: aload_0
    //   149: getfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   152: lcmp
    //   153: ifge +241 -> 394
    //   156: aload_0
    //   157: getfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   160: lstore_2
    //   161: aload_0
    //   162: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   165: getfield 401	com/tencent/mm/at/a:field_wifiEndFlag	I
    //   168: iconst_1
    //   169: if_icmpne +246 -> 415
    //   172: iconst_1
    //   173: istore_1
    //   174: aload_0
    //   175: getfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   178: ldc2_w 402
    //   181: lcmp
    //   182: ifge +18 -> 200
    //   185: aload_0
    //   186: ldc2_w 402
    //   189: putfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   192: ldc -66
    //   194: ldc_w 405
    //   197: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   200: new 409	java/io/File
    //   203: dup
    //   204: aload_0
    //   205: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   208: aload_0
    //   209: getfield 72	com/tencent/mm/plugin/music/a/c/a:lcN	Z
    //   212: invokestatic 412	com/tencent/mm/plugin/music/a/g:b	(Lcom/tencent/mm/at/a;Z)Ljava/lang/String;
    //   215: invokespecial 413	java/io/File:<init>	(Ljava/lang/String;)V
    //   218: astore 43
    //   220: lload_2
    //   221: lstore 8
    //   223: lload 6
    //   225: lstore_2
    //   226: aload 43
    //   228: invokevirtual 416	java/io/File:exists	()Z
    //   231: ifne +56 -> 287
    //   234: ldc -66
    //   236: ldc_w 418
    //   239: iconst_1
    //   240: anewarray 4	java/lang/Object
    //   243: dup
    //   244: iconst_0
    //   245: aload 43
    //   247: invokevirtual 421	java/io/File:createNewFile	()Z
    //   250: invokestatic 426	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   253: aastore
    //   254: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   257: lconst_0
    //   258: lstore_2
    //   259: aload_0
    //   260: getfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   263: lstore 8
    //   265: iconst_0
    //   266: istore_1
    //   267: ldc -66
    //   269: ldc_w 428
    //   272: iconst_1
    //   273: anewarray 4	java/lang/Object
    //   276: dup
    //   277: iconst_0
    //   278: lload 8
    //   280: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   283: aastore
    //   284: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   287: ldc -66
    //   289: ldc_w 433
    //   292: iconst_3
    //   293: anewarray 4	java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: lload_2
    //   299: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   302: aastore
    //   303: dup
    //   304: iconst_1
    //   305: aload 43
    //   307: invokevirtual 436	java/io/File:length	()J
    //   310: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   313: aastore
    //   314: dup
    //   315: iconst_2
    //   316: lload 8
    //   318: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   321: aastore
    //   322: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   325: lload_2
    //   326: aload_0
    //   327: getfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   330: lcmp
    //   331: iflt +12 -> 343
    //   334: aload_0
    //   335: getfield 438	com/tencent/mm/plugin/music/a/c/a:nrn	F
    //   338: fconst_0
    //   339: fcmpl
    //   340: ifeq +7 -> 347
    //   343: iload_1
    //   344: ifeq +478 -> 822
    //   347: ldc -66
    //   349: ldc_w 440
    //   352: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   355: aload_0
    //   356: iconst_1
    //   357: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   360: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   363: dup
    //   364: aload_0
    //   365: iconst_1
    //   366: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   369: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   372: ldc2_w 368
    //   375: ldc_w 370
    //   378: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   381: return
    //   382: aload_0
    //   383: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   386: getfield 379	com/tencent/mm/at/a:field_songWifiUrl	Ljava/lang/String;
    //   389: astore 33
    //   391: goto -304 -> 87
    //   394: lload 6
    //   396: l2f
    //   397: ldc_w 441
    //   400: aload_0
    //   401: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   404: getfield 396	com/tencent/mm/at/a:field_songWifiFileLength	J
    //   407: l2f
    //   408: fmul
    //   409: fadd
    //   410: f2l
    //   411: lstore_2
    //   412: goto -251 -> 161
    //   415: iconst_0
    //   416: istore_1
    //   417: goto -243 -> 174
    //   420: new 375	com/tencent/mm/pointers/PBool
    //   423: dup
    //   424: invokespecial 376	com/tencent/mm/pointers/PBool:<init>	()V
    //   427: astore 34
    //   429: aload_0
    //   430: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   433: getfield 379	com/tencent/mm/at/a:field_songWifiUrl	Ljava/lang/String;
    //   436: invokestatic 89	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   439: ifeq +98 -> 537
    //   442: aload_0
    //   443: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   446: getfield 382	com/tencent/mm/at/a:field_songWebUrl	Ljava/lang/String;
    //   449: astore 33
    //   451: aload 33
    //   453: aload_0
    //   454: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   457: getfield 385	com/tencent/mm/at/a:field_songWapLinkUrl	Ljava/lang/String;
    //   460: iconst_0
    //   461: aload 34
    //   463: invokestatic 390	com/tencent/mm/plugin/music/a/g:a	(Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/pointers/PBool;)Ljava/lang/String;
    //   466: astore 34
    //   468: aload_0
    //   469: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   472: getfield 163	com/tencent/mm/at/a:field_downloadedLength	J
    //   475: lstore 6
    //   477: aload_0
    //   478: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   481: getfield 444	com/tencent/mm/at/a:field_songFileLength	J
    //   484: lstore 4
    //   486: lload 4
    //   488: lconst_0
    //   489: lcmp
    //   490: ifeq +13 -> 503
    //   493: aload_0
    //   494: lload 4
    //   496: ldc2_w 397
    //   499: ldiv
    //   500: putfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   503: lload 6
    //   505: aload_0
    //   506: getfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   509: lcmp
    //   510: ifge +39 -> 549
    //   513: aload_0
    //   514: getfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   517: lstore_2
    //   518: aload_0
    //   519: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   522: getfield 447	com/tencent/mm/at/a:field_endFlag	I
    //   525: iconst_1
    //   526: if_icmpne +44 -> 570
    //   529: iconst_1
    //   530: istore_1
    //   531: iconst_0
    //   532: istore 32
    //   534: goto -360 -> 174
    //   537: aload_0
    //   538: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   541: getfield 379	com/tencent/mm/at/a:field_songWifiUrl	Ljava/lang/String;
    //   544: astore 33
    //   546: goto -95 -> 451
    //   549: lload 6
    //   551: l2f
    //   552: ldc_w 441
    //   555: aload_0
    //   556: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   559: getfield 444	com/tencent/mm/at/a:field_songFileLength	J
    //   562: l2f
    //   563: fmul
    //   564: fadd
    //   565: f2l
    //   566: lstore_2
    //   567: goto -49 -> 518
    //   570: iconst_0
    //   571: istore_1
    //   572: goto -41 -> 531
    //   575: aload_0
    //   576: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   579: getfield 129	com/tencent/mm/at/a:field_wifiDownloadedLength	J
    //   582: lconst_0
    //   583: lcmp
    //   584: ifeq +87 -> 671
    //   587: aload_0
    //   588: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   591: getfield 129	com/tencent/mm/at/a:field_wifiDownloadedLength	J
    //   594: aload_0
    //   595: getfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   598: lcmp
    //   599: iflt +72 -> 671
    //   602: aload_0
    //   603: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   606: getfield 129	com/tencent/mm/at/a:field_wifiDownloadedLength	J
    //   609: l2f
    //   610: aload_0
    //   611: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   614: getfield 396	com/tencent/mm/at/a:field_songWifiFileLength	J
    //   617: l2f
    //   618: fdiv
    //   619: aload_0
    //   620: getfield 438	com/tencent/mm/plugin/music/a/c/a:nrn	F
    //   623: fsub
    //   624: ldc_w 441
    //   627: fcmpl
    //   628: iflt +43 -> 671
    //   631: ldc -66
    //   633: ldc_w 440
    //   636: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   639: aload_0
    //   640: iconst_1
    //   641: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   644: aload_0
    //   645: iconst_1
    //   646: putfield 72	com/tencent/mm/plugin/music/a/c/a:lcN	Z
    //   649: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   652: dup
    //   653: aload_0
    //   654: iconst_1
    //   655: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   658: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   661: ldc2_w 368
    //   664: ldc_w 370
    //   667: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   670: return
    //   671: aload_0
    //   672: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   675: getfield 163	com/tencent/mm/at/a:field_downloadedLength	J
    //   678: lconst_0
    //   679: lcmp
    //   680: ifeq +87 -> 767
    //   683: aload_0
    //   684: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   687: getfield 163	com/tencent/mm/at/a:field_downloadedLength	J
    //   690: aload_0
    //   691: getfield 46	com/tencent/mm/plugin/music/a/c/a:nro	J
    //   694: lcmp
    //   695: iflt +72 -> 767
    //   698: aload_0
    //   699: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   702: getfield 163	com/tencent/mm/at/a:field_downloadedLength	J
    //   705: l2f
    //   706: aload_0
    //   707: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   710: getfield 444	com/tencent/mm/at/a:field_songFileLength	J
    //   713: l2f
    //   714: fdiv
    //   715: aload_0
    //   716: getfield 438	com/tencent/mm/plugin/music/a/c/a:nrn	F
    //   719: fsub
    //   720: ldc_w 441
    //   723: fcmpl
    //   724: iflt +43 -> 767
    //   727: ldc -66
    //   729: ldc_w 440
    //   732: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   735: aload_0
    //   736: iconst_1
    //   737: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   740: aload_0
    //   741: iconst_0
    //   742: putfield 72	com/tencent/mm/plugin/music/a/c/a:lcN	Z
    //   745: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   748: dup
    //   749: aload_0
    //   750: iconst_1
    //   751: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   754: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   757: ldc2_w 368
    //   760: ldc_w 370
    //   763: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   766: return
    //   767: ldc -66
    //   769: ldc_w 449
    //   772: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   775: aload_0
    //   776: iconst_1
    //   777: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   780: aload_0
    //   781: iconst_4
    //   782: invokespecial 451	com/tencent/mm/plugin/music/a/c/a:rx	(I)V
    //   785: ldc2_w 368
    //   788: ldc_w 370
    //   791: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   794: return
    //   795: astore 33
    //   797: ldc -66
    //   799: aload 33
    //   801: ldc_w 453
    //   804: iconst_1
    //   805: anewarray 4	java/lang/Object
    //   808: dup
    //   809: iconst_0
    //   810: aload 43
    //   812: invokevirtual 456	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   815: aastore
    //   816: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   819: goto -562 -> 257
    //   822: aload 34
    //   824: invokestatic 89	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   827: ifeq +39 -> 866
    //   830: ldc -66
    //   832: ldc_w 462
    //   835: invokestatic 317	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   838: aload_0
    //   839: iconst_1
    //   840: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   843: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   846: dup
    //   847: aload_0
    //   848: bipush -2
    //   850: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   853: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   856: ldc2_w 368
    //   859: ldc_w 370
    //   862: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   865: return
    //   866: aconst_null
    //   867: astore 41
    //   869: aconst_null
    //   870: astore 42
    //   872: aconst_null
    //   873: astore 39
    //   875: aconst_null
    //   876: astore 35
    //   878: aconst_null
    //   879: astore 38
    //   881: aconst_null
    //   882: astore 40
    //   884: aload 43
    //   886: invokevirtual 416	java/io/File:exists	()Z
    //   889: ifne +262 -> 1151
    //   892: aload_0
    //   893: iconst_1
    //   894: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   897: ldc -66
    //   899: ldc_w 464
    //   902: iconst_1
    //   903: anewarray 4	java/lang/Object
    //   906: dup
    //   907: iconst_0
    //   908: aload 43
    //   910: invokevirtual 456	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   913: aastore
    //   914: invokestatic 275	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   917: aload_0
    //   918: bipush 19
    //   920: invokespecial 451	com/tencent/mm/plugin/music/a/c/a:rx	(I)V
    //   923: lload 4
    //   925: lconst_0
    //   926: lcmp
    //   927: ifne +92 -> 1019
    //   930: lload_2
    //   931: lconst_0
    //   932: lcmp
    //   933: ifle +86 -> 1019
    //   936: ldc -66
    //   938: ldc_w 466
    //   941: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   944: new 468	java/lang/NullPointerException
    //   947: dup
    //   948: invokespecial 469	java/lang/NullPointerException:<init>	()V
    //   951: athrow
    //   952: aload_0
    //   953: lload_2
    //   954: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   957: lload_2
    //   958: ldc2_w 402
    //   961: lcmp
    //   962: ifge +15 -> 977
    //   965: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   968: dup
    //   969: aload_0
    //   970: iconst_1
    //   971: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   974: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   977: aload_0
    //   978: iconst_1
    //   979: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   982: ldc -66
    //   984: ldc_w 473
    //   987: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   990: ldc2_w 368
    //   993: ldc_w 370
    //   996: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   999: return
    //   1000: astore 33
    //   1002: ldc -66
    //   1004: aload 33
    //   1006: ldc_w 475
    //   1009: iconst_0
    //   1010: anewarray 4	java/lang/Object
    //   1013: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1016: goto -64 -> 952
    //   1019: lload 4
    //   1021: lconst_0
    //   1022: lcmp
    //   1023: ifeq +47 -> 1070
    //   1026: lload_2
    //   1027: lload 4
    //   1029: lcmp
    //   1030: ifeq +40 -> 1070
    //   1033: ldc -66
    //   1035: ldc_w 477
    //   1038: iconst_2
    //   1039: anewarray 4	java/lang/Object
    //   1042: dup
    //   1043: iconst_0
    //   1044: lload 4
    //   1046: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1049: aastore
    //   1050: dup
    //   1051: iconst_1
    //   1052: lload_2
    //   1053: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1056: aastore
    //   1057: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1060: aload_0
    //   1061: lload_2
    //   1062: lload 4
    //   1064: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   1067: goto -90 -> 977
    //   1070: lload 4
    //   1072: lconst_0
    //   1073: lcmp
    //   1074: ifeq +66 -> 1140
    //   1077: lload_2
    //   1078: lload 4
    //   1080: lcmp
    //   1081: ifne +59 -> 1140
    //   1084: ldc -66
    //   1086: ldc_w 481
    //   1089: iconst_2
    //   1090: anewarray 4	java/lang/Object
    //   1093: dup
    //   1094: iconst_0
    //   1095: lload 4
    //   1097: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1100: aastore
    //   1101: dup
    //   1102: iconst_1
    //   1103: lload_2
    //   1104: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1107: aastore
    //   1108: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1111: aload_0
    //   1112: lload 4
    //   1114: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   1117: lload_2
    //   1118: ldc2_w 402
    //   1121: lcmp
    //   1122: ifge -145 -> 977
    //   1125: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   1128: dup
    //   1129: aload_0
    //   1130: iconst_1
    //   1131: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   1134: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   1137: goto -160 -> 977
    //   1140: ldc -66
    //   1142: ldc_w 483
    //   1145: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1148: goto -171 -> 977
    //   1151: new 485	java/io/RandomAccessFile
    //   1154: dup
    //   1155: aload 43
    //   1157: ldc_w 487
    //   1160: invokespecial 490	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1163: astore 33
    //   1165: ldc -66
    //   1167: ldc_w 492
    //   1170: iconst_1
    //   1171: anewarray 4	java/lang/Object
    //   1174: dup
    //   1175: iconst_0
    //   1176: aload 34
    //   1178: aastore
    //   1179: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1182: new 494	java/util/HashMap
    //   1185: dup
    //   1186: bipush 10
    //   1188: invokespecial 496	java/util/HashMap:<init>	(I)V
    //   1191: astore 36
    //   1193: aload 36
    //   1195: ldc_w 498
    //   1198: ldc_w 500
    //   1201: invokeinterface 504 3 0
    //   1206: pop
    //   1207: lload 8
    //   1209: lload_2
    //   1210: lcmp
    //   1211: ifle +68 -> 1279
    //   1214: ldc -66
    //   1216: ldc_w 506
    //   1219: iconst_2
    //   1220: anewarray 4	java/lang/Object
    //   1223: dup
    //   1224: iconst_0
    //   1225: lload_2
    //   1226: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1229: aastore
    //   1230: dup
    //   1231: iconst_1
    //   1232: lload 8
    //   1234: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1237: aastore
    //   1238: invokestatic 509	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1241: aload 36
    //   1243: ldc_w 511
    //   1246: new 306	java/lang/StringBuilder
    //   1249: dup
    //   1250: ldc_w 513
    //   1253: invokespecial 310	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1256: lload_2
    //   1257: invokevirtual 516	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1260: ldc 103
    //   1262: invokevirtual 519	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1265: lload 8
    //   1267: invokevirtual 516	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1270: invokevirtual 315	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1273: invokeinterface 504 3 0
    //   1278: pop
    //   1279: iload 32
    //   1281: ifne +11 -> 1292
    //   1284: aload 34
    //   1286: invokestatic 522	com/tencent/mm/plugin/music/a/g:Dl	(Ljava/lang/String;)Z
    //   1289: ifeq +39 -> 1328
    //   1292: ldc -66
    //   1294: ldc_w 524
    //   1297: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1300: aload 36
    //   1302: ldc_w 526
    //   1305: ldc_w 528
    //   1308: invokeinterface 504 3 0
    //   1313: pop
    //   1314: aload 36
    //   1316: ldc_w 530
    //   1319: ldc_w 532
    //   1322: invokeinterface 504 3 0
    //   1327: pop
    //   1328: aload 36
    //   1330: ldc_w 534
    //   1333: new 306	java/lang/StringBuilder
    //   1336: dup
    //   1337: invokespecial 535	java/lang/StringBuilder:<init>	()V
    //   1340: ldc_w 537
    //   1343: invokestatic 542	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   1346: invokevirtual 519	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1349: ldc_w 544
    //   1352: invokevirtual 519	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1355: invokestatic 64	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   1358: invokestatic 547	com/tencent/mm/plugin/music/a/g:cT	(Landroid/content/Context;)Ljava/lang/String;
    //   1361: invokevirtual 519	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1364: invokevirtual 315	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1367: invokeinterface 504 3 0
    //   1372: pop
    //   1373: aload 34
    //   1375: aload 36
    //   1377: invokestatic 549	com/tencent/mm/plugin/music/a/c/a:h	(Ljava/lang/String;Ljava/util/Map;)Lcom/tencent/mm/network/u;
    //   1380: astore 34
    //   1382: lload 4
    //   1384: lstore 8
    //   1386: lload_2
    //   1387: lstore 6
    //   1389: aload 34
    //   1391: astore 37
    //   1393: aload 33
    //   1395: astore 36
    //   1397: aload 38
    //   1399: astore 35
    //   1401: lload 4
    //   1403: lstore 22
    //   1405: lload_2
    //   1406: lstore 16
    //   1408: lload 4
    //   1410: lstore 24
    //   1412: lload_2
    //   1413: lstore 14
    //   1415: lload 4
    //   1417: lstore 26
    //   1419: lload_2
    //   1420: lstore 10
    //   1422: lload 4
    //   1424: lstore 20
    //   1426: lload_2
    //   1427: lstore 18
    //   1429: lload 4
    //   1431: lstore 28
    //   1433: lload_2
    //   1434: lstore 12
    //   1436: aload 34
    //   1438: invokevirtual 254	com/tencent/mm/network/u:getResponseCode	()I
    //   1441: istore_1
    //   1442: iload_1
    //   1443: sipush 200
    //   1446: if_icmpeq +522 -> 1968
    //   1449: iload_1
    //   1450: sipush 206
    //   1453: if_icmpeq +515 -> 1968
    //   1456: lload 4
    //   1458: lstore 8
    //   1460: lload_2
    //   1461: lstore 6
    //   1463: aload 34
    //   1465: astore 37
    //   1467: aload 33
    //   1469: astore 36
    //   1471: aload 38
    //   1473: astore 35
    //   1475: lload 4
    //   1477: lstore 22
    //   1479: lload_2
    //   1480: lstore 16
    //   1482: lload 4
    //   1484: lstore 24
    //   1486: lload_2
    //   1487: lstore 14
    //   1489: lload 4
    //   1491: lstore 26
    //   1493: lload_2
    //   1494: lstore 10
    //   1496: lload 4
    //   1498: lstore 20
    //   1500: lload_2
    //   1501: lstore 18
    //   1503: lload 4
    //   1505: lstore 28
    //   1507: lload_2
    //   1508: lstore 12
    //   1510: iload_1
    //   1511: invokestatic 264	com/tencent/mm/plugin/music/a/c/a:rw	(I)V
    //   1514: lload 4
    //   1516: lstore 8
    //   1518: lload_2
    //   1519: lstore 6
    //   1521: aload 34
    //   1523: astore 37
    //   1525: aload 33
    //   1527: astore 36
    //   1529: aload 38
    //   1531: astore 35
    //   1533: lload 4
    //   1535: lstore 22
    //   1537: lload_2
    //   1538: lstore 16
    //   1540: lload 4
    //   1542: lstore 24
    //   1544: lload_2
    //   1545: lstore 14
    //   1547: lload 4
    //   1549: lstore 26
    //   1551: lload_2
    //   1552: lstore 10
    //   1554: lload 4
    //   1556: lstore 20
    //   1558: lload_2
    //   1559: lstore 18
    //   1561: lload 4
    //   1563: lstore 28
    //   1565: lload_2
    //   1566: lstore 12
    //   1568: ldc -66
    //   1570: ldc_w 551
    //   1573: iconst_1
    //   1574: anewarray 4	java/lang/Object
    //   1577: dup
    //   1578: iconst_0
    //   1579: iload_1
    //   1580: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1583: aastore
    //   1584: invokestatic 275	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1587: lload 4
    //   1589: lstore 8
    //   1591: lload_2
    //   1592: lstore 6
    //   1594: aload 34
    //   1596: astore 37
    //   1598: aload 33
    //   1600: astore 36
    //   1602: aload 38
    //   1604: astore 35
    //   1606: lload 4
    //   1608: lstore 22
    //   1610: lload_2
    //   1611: lstore 16
    //   1613: lload 4
    //   1615: lstore 24
    //   1617: lload_2
    //   1618: lstore 14
    //   1620: lload 4
    //   1622: lstore 26
    //   1624: lload_2
    //   1625: lstore 10
    //   1627: lload 4
    //   1629: lstore 20
    //   1631: lload_2
    //   1632: lstore 18
    //   1634: lload 4
    //   1636: lstore 28
    //   1638: lload_2
    //   1639: lstore 12
    //   1641: aload_0
    //   1642: iload_1
    //   1643: putfield 54	com/tencent/mm/plugin/music/a/c/a:nrp	I
    //   1646: lload 4
    //   1648: lstore 8
    //   1650: lload_2
    //   1651: lstore 6
    //   1653: aload 34
    //   1655: astore 37
    //   1657: aload 33
    //   1659: astore 36
    //   1661: aload 38
    //   1663: astore 35
    //   1665: lload 4
    //   1667: lstore 22
    //   1669: lload_2
    //   1670: lstore 16
    //   1672: lload 4
    //   1674: lstore 24
    //   1676: lload_2
    //   1677: lstore 14
    //   1679: lload 4
    //   1681: lstore 26
    //   1683: lload_2
    //   1684: lstore 10
    //   1686: lload 4
    //   1688: lstore 20
    //   1690: lload_2
    //   1691: lstore 18
    //   1693: lload 4
    //   1695: lstore 28
    //   1697: lload_2
    //   1698: lstore 12
    //   1700: aload_0
    //   1701: iconst_m1
    //   1702: invokespecial 451	com/tencent/mm/plugin/music/a/c/a:rx	(I)V
    //   1705: lload 4
    //   1707: lconst_0
    //   1708: lcmp
    //   1709: ifne +108 -> 1817
    //   1712: lload_2
    //   1713: lconst_0
    //   1714: lcmp
    //   1715: ifle +102 -> 1817
    //   1718: ldc -66
    //   1720: ldc_w 466
    //   1723: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1726: aload 33
    //   1728: lload_2
    //   1729: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   1732: aload_0
    //   1733: lload_2
    //   1734: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   1737: lload_2
    //   1738: ldc2_w 402
    //   1741: lcmp
    //   1742: ifge +15 -> 1757
    //   1745: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   1748: dup
    //   1749: aload_0
    //   1750: iconst_1
    //   1751: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   1754: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   1757: aload 33
    //   1759: invokevirtual 557	java/io/RandomAccessFile:close	()V
    //   1762: aload 34
    //   1764: ifnull +11 -> 1775
    //   1767: aload 34
    //   1769: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   1772: invokevirtual 188	java/net/HttpURLConnection:disconnect	()V
    //   1775: aload_0
    //   1776: iconst_1
    //   1777: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   1780: ldc -66
    //   1782: ldc_w 473
    //   1785: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1788: ldc2_w 368
    //   1791: ldc_w 370
    //   1794: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1797: return
    //   1798: astore 35
    //   1800: ldc -66
    //   1802: aload 35
    //   1804: ldc_w 475
    //   1807: iconst_0
    //   1808: anewarray 4	java/lang/Object
    //   1811: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1814: goto -82 -> 1732
    //   1817: lload 4
    //   1819: lconst_0
    //   1820: lcmp
    //   1821: ifeq +47 -> 1868
    //   1824: lload_2
    //   1825: lload 4
    //   1827: lcmp
    //   1828: ifeq +40 -> 1868
    //   1831: ldc -66
    //   1833: ldc_w 477
    //   1836: iconst_2
    //   1837: anewarray 4	java/lang/Object
    //   1840: dup
    //   1841: iconst_0
    //   1842: lload 4
    //   1844: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1847: aastore
    //   1848: dup
    //   1849: iconst_1
    //   1850: lload_2
    //   1851: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1854: aastore
    //   1855: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1858: aload_0
    //   1859: lload_2
    //   1860: lload 4
    //   1862: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   1865: goto -108 -> 1757
    //   1868: lload 4
    //   1870: lconst_0
    //   1871: lcmp
    //   1872: ifeq +66 -> 1938
    //   1875: lload_2
    //   1876: lload 4
    //   1878: lcmp
    //   1879: ifne +59 -> 1938
    //   1882: ldc -66
    //   1884: ldc_w 481
    //   1887: iconst_2
    //   1888: anewarray 4	java/lang/Object
    //   1891: dup
    //   1892: iconst_0
    //   1893: lload 4
    //   1895: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1898: aastore
    //   1899: dup
    //   1900: iconst_1
    //   1901: lload_2
    //   1902: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1905: aastore
    //   1906: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1909: aload_0
    //   1910: lload 4
    //   1912: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   1915: lload_2
    //   1916: ldc2_w 402
    //   1919: lcmp
    //   1920: ifge -163 -> 1757
    //   1923: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   1926: dup
    //   1927: aload_0
    //   1928: iconst_1
    //   1929: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   1932: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   1935: goto -178 -> 1757
    //   1938: ldc -66
    //   1940: ldc_w 483
    //   1943: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1946: goto -189 -> 1757
    //   1949: astore 33
    //   1951: ldc -66
    //   1953: aload 33
    //   1955: ldc_w 475
    //   1958: iconst_0
    //   1959: anewarray 4	java/lang/Object
    //   1962: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1965: goto -203 -> 1762
    //   1968: lload 4
    //   1970: lstore 8
    //   1972: lload_2
    //   1973: lstore 6
    //   1975: aload 34
    //   1977: astore 37
    //   1979: aload 33
    //   1981: astore 36
    //   1983: aload 38
    //   1985: astore 35
    //   1987: lload 4
    //   1989: lstore 22
    //   1991: lload_2
    //   1992: lstore 16
    //   1994: lload 4
    //   1996: lstore 24
    //   1998: lload_2
    //   1999: lstore 14
    //   2001: lload 4
    //   2003: lstore 26
    //   2005: lload_2
    //   2006: lstore 10
    //   2008: lload 4
    //   2010: lstore 20
    //   2012: lload_2
    //   2013: lstore 18
    //   2015: lload 4
    //   2017: lstore 28
    //   2019: lload_2
    //   2020: lstore 12
    //   2022: ldc -66
    //   2024: ldc_w 559
    //   2027: iconst_1
    //   2028: anewarray 4	java/lang/Object
    //   2031: dup
    //   2032: iconst_0
    //   2033: iload_1
    //   2034: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2037: aastore
    //   2038: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2041: lload 4
    //   2043: lstore 8
    //   2045: lload_2
    //   2046: lstore 6
    //   2048: aload 34
    //   2050: astore 37
    //   2052: aload 33
    //   2054: astore 36
    //   2056: aload 38
    //   2058: astore 35
    //   2060: lload 4
    //   2062: lstore 22
    //   2064: lload_2
    //   2065: lstore 16
    //   2067: lload 4
    //   2069: lstore 24
    //   2071: lload_2
    //   2072: lstore 14
    //   2074: lload 4
    //   2076: lstore 26
    //   2078: lload_2
    //   2079: lstore 10
    //   2081: lload 4
    //   2083: lstore 20
    //   2085: lload_2
    //   2086: lstore 18
    //   2088: lload 4
    //   2090: lstore 28
    //   2092: lload_2
    //   2093: lstore 12
    //   2095: ldc -66
    //   2097: new 306	java/lang/StringBuilder
    //   2100: dup
    //   2101: ldc_w 561
    //   2104: invokespecial 310	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2107: aload 34
    //   2109: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   2112: ldc_w 534
    //   2115: invokevirtual 564	java/net/HttpURLConnection:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   2118: invokevirtual 519	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2121: invokevirtual 315	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2124: invokestatic 566	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2127: lload 4
    //   2129: lstore 8
    //   2131: lload_2
    //   2132: lstore 6
    //   2134: aload 34
    //   2136: astore 37
    //   2138: aload 33
    //   2140: astore 36
    //   2142: aload 38
    //   2144: astore 35
    //   2146: lload 4
    //   2148: lstore 22
    //   2150: lload_2
    //   2151: lstore 16
    //   2153: lload 4
    //   2155: lstore 24
    //   2157: lload_2
    //   2158: lstore 14
    //   2160: lload 4
    //   2162: lstore 26
    //   2164: lload_2
    //   2165: lstore 10
    //   2167: lload 4
    //   2169: lstore 20
    //   2171: lload_2
    //   2172: lstore 18
    //   2174: lload 4
    //   2176: lstore 28
    //   2178: lload_2
    //   2179: lstore 12
    //   2181: aload 34
    //   2183: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   2186: invokevirtual 569	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   2189: astore 44
    //   2191: lload 4
    //   2193: lstore 8
    //   2195: lload_2
    //   2196: lstore 6
    //   2198: aload 34
    //   2200: astore 37
    //   2202: aload 33
    //   2204: astore 36
    //   2206: aload 38
    //   2208: astore 35
    //   2210: lload 4
    //   2212: lstore 22
    //   2214: lload_2
    //   2215: lstore 16
    //   2217: lload 4
    //   2219: lstore 24
    //   2221: lload_2
    //   2222: lstore 14
    //   2224: lload 4
    //   2226: lstore 26
    //   2228: lload_2
    //   2229: lstore 10
    //   2231: lload 4
    //   2233: lstore 20
    //   2235: lload_2
    //   2236: lstore 18
    //   2238: lload 4
    //   2240: lstore 28
    //   2242: lload_2
    //   2243: lstore 12
    //   2245: ldc -66
    //   2247: ldc_w 571
    //   2250: iconst_1
    //   2251: anewarray 4	java/lang/Object
    //   2254: dup
    //   2255: iconst_0
    //   2256: aload 44
    //   2258: aastore
    //   2259: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2262: lload 4
    //   2264: lstore 8
    //   2266: lload_2
    //   2267: lstore 6
    //   2269: aload 34
    //   2271: astore 37
    //   2273: aload 33
    //   2275: astore 36
    //   2277: aload 38
    //   2279: astore 35
    //   2281: lload 4
    //   2283: lstore 22
    //   2285: lload_2
    //   2286: lstore 16
    //   2288: lload 4
    //   2290: lstore 24
    //   2292: lload_2
    //   2293: lstore 14
    //   2295: lload 4
    //   2297: lstore 26
    //   2299: lload_2
    //   2300: lstore 10
    //   2302: lload 4
    //   2304: lstore 20
    //   2306: lload_2
    //   2307: lstore 18
    //   2309: lload 4
    //   2311: lstore 28
    //   2313: lload_2
    //   2314: lstore 12
    //   2316: aload_0
    //   2317: aload 44
    //   2319: putfield 52	com/tencent/mm/plugin/music/a/c/a:mimeType	Ljava/lang/String;
    //   2322: lload 4
    //   2324: lstore 8
    //   2326: lload_2
    //   2327: lstore 6
    //   2329: aload 34
    //   2331: astore 37
    //   2333: aload 33
    //   2335: astore 36
    //   2337: aload 38
    //   2339: astore 35
    //   2341: lload 4
    //   2343: lstore 22
    //   2345: lload_2
    //   2346: lstore 16
    //   2348: lload 4
    //   2350: lstore 24
    //   2352: lload_2
    //   2353: lstore 14
    //   2355: lload 4
    //   2357: lstore 26
    //   2359: lload_2
    //   2360: lstore 10
    //   2362: lload 4
    //   2364: lstore 20
    //   2366: lload_2
    //   2367: lstore 18
    //   2369: lload 4
    //   2371: lstore 28
    //   2373: lload_2
    //   2374: lstore 12
    //   2376: aload_0
    //   2377: getfield 52	com/tencent/mm/plugin/music/a/c/a:mimeType	Ljava/lang/String;
    //   2380: invokestatic 577	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2383: ifne +661 -> 3044
    //   2386: lload 4
    //   2388: lstore 8
    //   2390: lload_2
    //   2391: lstore 6
    //   2393: aload 34
    //   2395: astore 37
    //   2397: aload 33
    //   2399: astore 36
    //   2401: aload 38
    //   2403: astore 35
    //   2405: lload 4
    //   2407: lstore 22
    //   2409: lload_2
    //   2410: lstore 16
    //   2412: lload 4
    //   2414: lstore 24
    //   2416: lload_2
    //   2417: lstore 14
    //   2419: lload 4
    //   2421: lstore 26
    //   2423: lload_2
    //   2424: lstore 10
    //   2426: lload 4
    //   2428: lstore 20
    //   2430: lload_2
    //   2431: lstore 18
    //   2433: lload 4
    //   2435: lstore 28
    //   2437: lload_2
    //   2438: lstore 12
    //   2440: aload_0
    //   2441: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   2444: getfield 580	com/tencent/mm/at/a:field_mimetype	Ljava/lang/String;
    //   2447: invokestatic 577	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2450: ifeq +594 -> 3044
    //   2453: lload 4
    //   2455: lstore 8
    //   2457: lload_2
    //   2458: lstore 6
    //   2460: aload 34
    //   2462: astore 37
    //   2464: aload 33
    //   2466: astore 36
    //   2468: aload 38
    //   2470: astore 35
    //   2472: lload 4
    //   2474: lstore 22
    //   2476: lload_2
    //   2477: lstore 16
    //   2479: lload 4
    //   2481: lstore 24
    //   2483: lload_2
    //   2484: lstore 14
    //   2486: lload 4
    //   2488: lstore 26
    //   2490: lload_2
    //   2491: lstore 10
    //   2493: lload 4
    //   2495: lstore 20
    //   2497: lload_2
    //   2498: lstore 18
    //   2500: lload 4
    //   2502: lstore 28
    //   2504: lload_2
    //   2505: lstore 12
    //   2507: aload_0
    //   2508: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   2511: aload_0
    //   2512: getfield 52	com/tencent/mm/plugin/music/a/c/a:mimeType	Ljava/lang/String;
    //   2515: putfield 580	com/tencent/mm/at/a:field_mimetype	Ljava/lang/String;
    //   2518: lload 4
    //   2520: lstore 8
    //   2522: lload_2
    //   2523: lstore 6
    //   2525: aload 34
    //   2527: astore 37
    //   2529: aload 33
    //   2531: astore 36
    //   2533: aload 38
    //   2535: astore 35
    //   2537: lload 4
    //   2539: lstore 22
    //   2541: lload_2
    //   2542: lstore 16
    //   2544: lload 4
    //   2546: lstore 24
    //   2548: lload_2
    //   2549: lstore 14
    //   2551: lload 4
    //   2553: lstore 26
    //   2555: lload_2
    //   2556: lstore 10
    //   2558: lload 4
    //   2560: lstore 20
    //   2562: lload_2
    //   2563: lstore 18
    //   2565: lload 4
    //   2567: lstore 28
    //   2569: lload_2
    //   2570: lstore 12
    //   2572: invokestatic 135	com/tencent/mm/plugin/music/a/h:aSt	()Lcom/tencent/mm/plugin/music/a/g/a;
    //   2575: astore 47
    //   2577: lload 4
    //   2579: lstore 8
    //   2581: lload_2
    //   2582: lstore 6
    //   2584: aload 34
    //   2586: astore 37
    //   2588: aload 33
    //   2590: astore 36
    //   2592: aload 38
    //   2594: astore 35
    //   2596: lload 4
    //   2598: lstore 22
    //   2600: lload_2
    //   2601: lstore 16
    //   2603: lload 4
    //   2605: lstore 24
    //   2607: lload_2
    //   2608: lstore 14
    //   2610: lload 4
    //   2612: lstore 26
    //   2614: lload_2
    //   2615: lstore 10
    //   2617: lload 4
    //   2619: lstore 20
    //   2621: lload_2
    //   2622: lstore 18
    //   2624: lload 4
    //   2626: lstore 28
    //   2628: lload_2
    //   2629: lstore 12
    //   2631: aload_0
    //   2632: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   2635: getfield 138	com/tencent/mm/at/a:field_musicId	Ljava/lang/String;
    //   2638: astore 46
    //   2640: lload 4
    //   2642: lstore 8
    //   2644: lload_2
    //   2645: lstore 6
    //   2647: aload 34
    //   2649: astore 37
    //   2651: aload 33
    //   2653: astore 36
    //   2655: aload 38
    //   2657: astore 35
    //   2659: lload 4
    //   2661: lstore 22
    //   2663: lload_2
    //   2664: lstore 16
    //   2666: lload 4
    //   2668: lstore 24
    //   2670: lload_2
    //   2671: lstore 14
    //   2673: lload 4
    //   2675: lstore 26
    //   2677: lload_2
    //   2678: lstore 10
    //   2680: lload 4
    //   2682: lstore 20
    //   2684: lload_2
    //   2685: lstore 18
    //   2687: lload 4
    //   2689: lstore 28
    //   2691: lload_2
    //   2692: lstore 12
    //   2694: aload_0
    //   2695: getfield 52	com/tencent/mm/plugin/music/a/c/a:mimeType	Ljava/lang/String;
    //   2698: astore 44
    //   2700: lload 4
    //   2702: lstore 8
    //   2704: lload_2
    //   2705: lstore 6
    //   2707: aload 34
    //   2709: astore 37
    //   2711: aload 33
    //   2713: astore 36
    //   2715: aload 38
    //   2717: astore 35
    //   2719: lload 4
    //   2721: lstore 22
    //   2723: lload_2
    //   2724: lstore 16
    //   2726: lload 4
    //   2728: lstore 24
    //   2730: lload_2
    //   2731: lstore 14
    //   2733: lload 4
    //   2735: lstore 26
    //   2737: lload_2
    //   2738: lstore 10
    //   2740: lload 4
    //   2742: lstore 20
    //   2744: lload_2
    //   2745: lstore 18
    //   2747: lload 4
    //   2749: lstore 28
    //   2751: lload_2
    //   2752: lstore 12
    //   2754: new 582	android/content/ContentValues
    //   2757: dup
    //   2758: invokespecial 583	android/content/ContentValues:<init>	()V
    //   2761: astore 45
    //   2763: lload 4
    //   2765: lstore 8
    //   2767: lload_2
    //   2768: lstore 6
    //   2770: aload 34
    //   2772: astore 37
    //   2774: aload 33
    //   2776: astore 36
    //   2778: aload 38
    //   2780: astore 35
    //   2782: lload 4
    //   2784: lstore 22
    //   2786: lload_2
    //   2787: lstore 16
    //   2789: lload 4
    //   2791: lstore 24
    //   2793: lload_2
    //   2794: lstore 14
    //   2796: lload 4
    //   2798: lstore 26
    //   2800: lload_2
    //   2801: lstore 10
    //   2803: lload 4
    //   2805: lstore 20
    //   2807: lload_2
    //   2808: lstore 18
    //   2810: lload 4
    //   2812: lstore 28
    //   2814: lload_2
    //   2815: lstore 12
    //   2817: aload 45
    //   2819: ldc_w 585
    //   2822: aload 44
    //   2824: invokevirtual 587	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   2827: lload 4
    //   2829: lstore 8
    //   2831: lload_2
    //   2832: lstore 6
    //   2834: aload 34
    //   2836: astore 37
    //   2838: aload 33
    //   2840: astore 36
    //   2842: aload 38
    //   2844: astore 35
    //   2846: lload 4
    //   2848: lstore 22
    //   2850: lload_2
    //   2851: lstore 16
    //   2853: lload 4
    //   2855: lstore 24
    //   2857: lload_2
    //   2858: lstore 14
    //   2860: lload 4
    //   2862: lstore 26
    //   2864: lload_2
    //   2865: lstore 10
    //   2867: lload 4
    //   2869: lstore 20
    //   2871: lload_2
    //   2872: lstore 18
    //   2874: lload 4
    //   2876: lstore 28
    //   2878: lload_2
    //   2879: lstore 12
    //   2881: aload 47
    //   2883: getfield 591	com/tencent/mm/plugin/music/a/g/a:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   2886: ldc_w 593
    //   2889: aload 45
    //   2891: ldc_w 595
    //   2894: iconst_1
    //   2895: anewarray 93	java/lang/String
    //   2898: dup
    //   2899: iconst_0
    //   2900: aload 46
    //   2902: aastore
    //   2903: invokeinterface 601 5 0
    //   2908: pop
    //   2909: lload 4
    //   2911: lstore 8
    //   2913: lload_2
    //   2914: lstore 6
    //   2916: aload 34
    //   2918: astore 37
    //   2920: aload 33
    //   2922: astore 36
    //   2924: aload 38
    //   2926: astore 35
    //   2928: lload 4
    //   2930: lstore 22
    //   2932: lload_2
    //   2933: lstore 16
    //   2935: lload 4
    //   2937: lstore 24
    //   2939: lload_2
    //   2940: lstore 14
    //   2942: lload 4
    //   2944: lstore 26
    //   2946: lload_2
    //   2947: lstore 10
    //   2949: lload 4
    //   2951: lstore 20
    //   2953: lload_2
    //   2954: lstore 18
    //   2956: lload 4
    //   2958: lstore 28
    //   2960: lload_2
    //   2961: lstore 12
    //   2963: aload 47
    //   2965: getfield 605	com/tencent/mm/plugin/music/a/g/a:nsm	Lcom/tencent/mm/a/f;
    //   2968: aload 46
    //   2970: invokevirtual 611	com/tencent/mm/a/f:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   2973: checkcast 126	com/tencent/mm/at/a
    //   2976: astore 45
    //   2978: aload 45
    //   2980: ifnull +64 -> 3044
    //   2983: lload 4
    //   2985: lstore 8
    //   2987: lload_2
    //   2988: lstore 6
    //   2990: aload 34
    //   2992: astore 37
    //   2994: aload 33
    //   2996: astore 36
    //   2998: aload 38
    //   3000: astore 35
    //   3002: lload 4
    //   3004: lstore 22
    //   3006: lload_2
    //   3007: lstore 16
    //   3009: lload 4
    //   3011: lstore 24
    //   3013: lload_2
    //   3014: lstore 14
    //   3016: lload 4
    //   3018: lstore 26
    //   3020: lload_2
    //   3021: lstore 10
    //   3023: lload 4
    //   3025: lstore 20
    //   3027: lload_2
    //   3028: lstore 18
    //   3030: lload 4
    //   3032: lstore 28
    //   3034: lload_2
    //   3035: lstore 12
    //   3037: aload 45
    //   3039: aload 44
    //   3041: putfield 580	com/tencent/mm/at/a:field_mimetype	Ljava/lang/String;
    //   3044: lload 4
    //   3046: lstore 8
    //   3048: lload_2
    //   3049: lstore 6
    //   3051: aload 34
    //   3053: astore 37
    //   3055: aload 33
    //   3057: astore 36
    //   3059: aload 38
    //   3061: astore 35
    //   3063: lload 4
    //   3065: lstore 22
    //   3067: lload_2
    //   3068: lstore 16
    //   3070: lload 4
    //   3072: lstore 24
    //   3074: lload_2
    //   3075: lstore 14
    //   3077: lload 4
    //   3079: lstore 26
    //   3081: lload_2
    //   3082: lstore 10
    //   3084: lload 4
    //   3086: lstore 20
    //   3088: lload_2
    //   3089: lstore 18
    //   3091: lload 4
    //   3093: lstore 28
    //   3095: lload_2
    //   3096: lstore 12
    //   3098: aload 34
    //   3100: ldc_w 613
    //   3103: invokevirtual 270	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   3106: astore 44
    //   3108: lload 4
    //   3110: lstore 8
    //   3112: lload_2
    //   3113: lstore 6
    //   3115: aload 34
    //   3117: astore 37
    //   3119: aload 33
    //   3121: astore 36
    //   3123: aload 38
    //   3125: astore 35
    //   3127: lload 4
    //   3129: lstore 22
    //   3131: lload_2
    //   3132: lstore 16
    //   3134: lload 4
    //   3136: lstore 24
    //   3138: lload_2
    //   3139: lstore 14
    //   3141: lload 4
    //   3143: lstore 26
    //   3145: lload_2
    //   3146: lstore 10
    //   3148: lload 4
    //   3150: lstore 20
    //   3152: lload_2
    //   3153: lstore 18
    //   3155: lload 4
    //   3157: lstore 28
    //   3159: lload_2
    //   3160: lstore 12
    //   3162: aload 44
    //   3164: invokestatic 615	com/tencent/mm/plugin/music/a/c/a:DL	(Ljava/lang/String;)[J
    //   3167: astore 45
    //   3169: lload 4
    //   3171: lstore 8
    //   3173: lload_2
    //   3174: lstore 6
    //   3176: aload 34
    //   3178: astore 37
    //   3180: aload 33
    //   3182: astore 36
    //   3184: aload 38
    //   3186: astore 35
    //   3188: lload 4
    //   3190: lstore 22
    //   3192: lload_2
    //   3193: lstore 16
    //   3195: lload 4
    //   3197: lstore 24
    //   3199: lload_2
    //   3200: lstore 14
    //   3202: lload 4
    //   3204: lstore 26
    //   3206: lload_2
    //   3207: lstore 10
    //   3209: lload 4
    //   3211: lstore 20
    //   3213: lload_2
    //   3214: lstore 18
    //   3216: lload 4
    //   3218: lstore 28
    //   3220: lload_2
    //   3221: lstore 12
    //   3223: aload 34
    //   3225: ldc_w 617
    //   3228: invokevirtual 270	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   3231: lconst_0
    //   3232: invokestatic 621	com/tencent/mm/sdk/platformtools/bg:getLong	(Ljava/lang/String;J)J
    //   3235: lstore 30
    //   3237: lload 4
    //   3239: lstore 8
    //   3241: lload_2
    //   3242: lstore 6
    //   3244: aload 34
    //   3246: astore 37
    //   3248: aload 33
    //   3250: astore 36
    //   3252: aload 38
    //   3254: astore 35
    //   3256: lload 4
    //   3258: lstore 22
    //   3260: lload_2
    //   3261: lstore 16
    //   3263: lload 4
    //   3265: lstore 24
    //   3267: lload_2
    //   3268: lstore 14
    //   3270: lload 4
    //   3272: lstore 26
    //   3274: lload_2
    //   3275: lstore 10
    //   3277: lload 4
    //   3279: lstore 20
    //   3281: lload_2
    //   3282: lstore 18
    //   3284: lload 4
    //   3286: lstore 28
    //   3288: lload_2
    //   3289: lstore 12
    //   3291: ldc -66
    //   3293: ldc_w 623
    //   3296: iconst_2
    //   3297: anewarray 4	java/lang/Object
    //   3300: dup
    //   3301: iconst_0
    //   3302: aload 44
    //   3304: aastore
    //   3305: dup
    //   3306: iconst_1
    //   3307: lload 30
    //   3309: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3312: aastore
    //   3313: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3316: aload 45
    //   3318: ifnonnull +810 -> 4128
    //   3321: lload 4
    //   3323: lstore 8
    //   3325: lload_2
    //   3326: lstore 6
    //   3328: aload 34
    //   3330: astore 37
    //   3332: aload 33
    //   3334: astore 36
    //   3336: aload 38
    //   3338: astore 35
    //   3340: lload 4
    //   3342: lstore 22
    //   3344: lload_2
    //   3345: lstore 16
    //   3347: lload 4
    //   3349: lstore 24
    //   3351: lload_2
    //   3352: lstore 14
    //   3354: lload 4
    //   3356: lstore 26
    //   3358: lload_2
    //   3359: lstore 10
    //   3361: lload 4
    //   3363: lstore 20
    //   3365: lload_2
    //   3366: lstore 18
    //   3368: lload 4
    //   3370: lstore 28
    //   3372: lload_2
    //   3373: lstore 12
    //   3375: ldc -66
    //   3377: ldc_w 625
    //   3380: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3383: lload_2
    //   3384: lstore 4
    //   3386: lload_2
    //   3387: lconst_0
    //   3388: lcmp
    //   3389: ifeq +3919 -> 7308
    //   3392: lconst_0
    //   3393: lstore 4
    //   3395: goto +3913 -> 7308
    //   3398: lload 4
    //   3400: lstore 8
    //   3402: lload_2
    //   3403: lstore 6
    //   3405: aload 34
    //   3407: astore 37
    //   3409: aload 33
    //   3411: astore 36
    //   3413: aload 38
    //   3415: astore 35
    //   3417: lload 4
    //   3419: lstore 22
    //   3421: lload_2
    //   3422: lstore 16
    //   3424: lload 4
    //   3426: lstore 24
    //   3428: lload_2
    //   3429: lstore 14
    //   3431: lload 4
    //   3433: lstore 26
    //   3435: lload_2
    //   3436: lstore 10
    //   3438: lload 4
    //   3440: lstore 20
    //   3442: lload_2
    //   3443: lstore 18
    //   3445: lload 4
    //   3447: lstore 28
    //   3449: lload_2
    //   3450: lstore 12
    //   3452: ldc -66
    //   3454: ldc_w 627
    //   3457: iconst_2
    //   3458: anewarray 4	java/lang/Object
    //   3461: dup
    //   3462: iconst_0
    //   3463: lload 30
    //   3465: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3468: aastore
    //   3469: dup
    //   3470: iconst_1
    //   3471: lload_2
    //   3472: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3475: aastore
    //   3476: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3479: lload 4
    //   3481: lstore 8
    //   3483: lload_2
    //   3484: lstore 6
    //   3486: aload 34
    //   3488: astore 37
    //   3490: aload 33
    //   3492: astore 36
    //   3494: aload 38
    //   3496: astore 35
    //   3498: lload 4
    //   3500: lstore 22
    //   3502: lload_2
    //   3503: lstore 16
    //   3505: lload 4
    //   3507: lstore 24
    //   3509: lload_2
    //   3510: lstore 14
    //   3512: lload 4
    //   3514: lstore 26
    //   3516: lload_2
    //   3517: lstore 10
    //   3519: lload 4
    //   3521: lstore 20
    //   3523: lload_2
    //   3524: lstore 18
    //   3526: lload 4
    //   3528: lstore 28
    //   3530: lload_2
    //   3531: lstore 12
    //   3533: aload 33
    //   3535: lload 30
    //   3537: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   3540: lload 4
    //   3542: lstore 8
    //   3544: lload_2
    //   3545: lstore 6
    //   3547: aload 34
    //   3549: astore 37
    //   3551: aload 33
    //   3553: astore 36
    //   3555: aload 38
    //   3557: astore 35
    //   3559: lload 4
    //   3561: lstore 22
    //   3563: lload_2
    //   3564: lstore 16
    //   3566: lload 4
    //   3568: lstore 24
    //   3570: lload_2
    //   3571: lstore 14
    //   3573: lload 4
    //   3575: lstore 26
    //   3577: lload_2
    //   3578: lstore 10
    //   3580: lload 4
    //   3582: lstore 20
    //   3584: lload_2
    //   3585: lstore 18
    //   3587: lload 4
    //   3589: lstore 28
    //   3591: lload_2
    //   3592: lstore 12
    //   3594: aload 33
    //   3596: lload_2
    //   3597: invokevirtual 630	java/io/RandomAccessFile:seek	(J)V
    //   3600: lload 4
    //   3602: lstore 8
    //   3604: lload_2
    //   3605: lstore 6
    //   3607: aload 34
    //   3609: astore 37
    //   3611: aload 33
    //   3613: astore 36
    //   3615: aload 38
    //   3617: astore 35
    //   3619: lload 4
    //   3621: lstore 22
    //   3623: lload_2
    //   3624: lstore 16
    //   3626: lload 4
    //   3628: lstore 24
    //   3630: lload_2
    //   3631: lstore 14
    //   3633: lload 4
    //   3635: lstore 26
    //   3637: lload_2
    //   3638: lstore 10
    //   3640: lload 4
    //   3642: lstore 20
    //   3644: lload_2
    //   3645: lstore 18
    //   3647: lload 4
    //   3649: lstore 28
    //   3651: lload_2
    //   3652: lstore 12
    //   3654: aload 34
    //   3656: invokevirtual 634	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   3659: astore 38
    //   3661: lload_2
    //   3662: lstore 18
    //   3664: lload_2
    //   3665: lstore 16
    //   3667: lload_2
    //   3668: lstore 14
    //   3670: lload_2
    //   3671: lstore 10
    //   3673: lload_2
    //   3674: lstore 8
    //   3676: lload_2
    //   3677: lstore 12
    //   3679: sipush 4096
    //   3682: newarray <illegal type>
    //   3684: astore 35
    //   3686: lload_2
    //   3687: lstore 18
    //   3689: lload_2
    //   3690: lstore 16
    //   3692: lload_2
    //   3693: lstore 14
    //   3695: lload_2
    //   3696: lstore 10
    //   3698: lload_2
    //   3699: lstore 8
    //   3701: lload_2
    //   3702: lstore 12
    //   3704: aload_0
    //   3705: getfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   3708: ifne +1172 -> 4880
    //   3711: lload_2
    //   3712: lstore 18
    //   3714: lload_2
    //   3715: lstore 16
    //   3717: lload_2
    //   3718: lstore 14
    //   3720: lload_2
    //   3721: lstore 10
    //   3723: lload_2
    //   3724: lstore 8
    //   3726: lload_2
    //   3727: lstore 12
    //   3729: aload 38
    //   3731: aload 35
    //   3733: invokevirtual 640	java/io/InputStream:read	([B)I
    //   3736: istore_1
    //   3737: iload_1
    //   3738: ifle +1080 -> 4818
    //   3741: lload_2
    //   3742: lstore 18
    //   3744: lload_2
    //   3745: lstore 16
    //   3747: lload_2
    //   3748: lstore 14
    //   3750: lload_2
    //   3751: lstore 10
    //   3753: lload_2
    //   3754: lstore 8
    //   3756: lload_2
    //   3757: lstore 12
    //   3759: aload 33
    //   3761: aload 35
    //   3763: iconst_0
    //   3764: iload_1
    //   3765: invokevirtual 644	java/io/RandomAccessFile:write	([BII)V
    //   3768: lload_2
    //   3769: iload_1
    //   3770: i2l
    //   3771: ladd
    //   3772: lstore 6
    //   3774: lload 6
    //   3776: lstore 18
    //   3778: lload 6
    //   3780: lstore 16
    //   3782: lload 6
    //   3784: lstore 14
    //   3786: lload 6
    //   3788: lstore 10
    //   3790: lload 6
    //   3792: lstore 8
    //   3794: lload 6
    //   3796: lstore 12
    //   3798: ldc -66
    //   3800: ldc_w 646
    //   3803: iconst_2
    //   3804: anewarray 4	java/lang/Object
    //   3807: dup
    //   3808: iconst_0
    //   3809: lload 6
    //   3811: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3814: aastore
    //   3815: dup
    //   3816: iconst_1
    //   3817: lload 30
    //   3819: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3822: aastore
    //   3823: invokestatic 649	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3826: lload 6
    //   3828: lstore 18
    //   3830: lload 6
    //   3832: lstore 16
    //   3834: lload 6
    //   3836: lstore 14
    //   3838: lload 6
    //   3840: lstore 10
    //   3842: lload 6
    //   3844: lstore 8
    //   3846: lload 6
    //   3848: lstore 12
    //   3850: aload_0
    //   3851: getfield 72	com/tencent/mm/plugin/music/a/c/a:lcN	Z
    //   3854: ifeq +683 -> 4537
    //   3857: lload 6
    //   3859: lstore 18
    //   3861: lload 6
    //   3863: lstore 16
    //   3865: lload 6
    //   3867: lstore 14
    //   3869: lload 6
    //   3871: lstore 10
    //   3873: lload 6
    //   3875: lstore 8
    //   3877: lload 6
    //   3879: lstore 12
    //   3881: aload_0
    //   3882: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   3885: lload 6
    //   3887: putfield 129	com/tencent/mm/at/a:field_wifiDownloadedLength	J
    //   3890: lload 6
    //   3892: lstore 18
    //   3894: lload 6
    //   3896: lstore 16
    //   3898: lload 6
    //   3900: lstore 14
    //   3902: lload 6
    //   3904: lstore 10
    //   3906: lload 6
    //   3908: lstore 8
    //   3910: lload 6
    //   3912: lstore 12
    //   3914: aload_0
    //   3915: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   3918: lload 30
    //   3920: putfield 396	com/tencent/mm/at/a:field_songWifiFileLength	J
    //   3923: lload 6
    //   3925: lstore_2
    //   3926: lload 6
    //   3928: ldc2_w 402
    //   3931: lcmp
    //   3932: iflt -246 -> 3686
    //   3935: lload 6
    //   3937: lstore 18
    //   3939: lload 6
    //   3941: lstore 16
    //   3943: lload 6
    //   3945: lstore 14
    //   3947: lload 6
    //   3949: lstore 10
    //   3951: lload 6
    //   3953: lstore 8
    //   3955: lload 6
    //   3957: lstore 12
    //   3959: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   3962: dup
    //   3963: aload_0
    //   3964: iconst_1
    //   3965: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   3968: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   3971: lload 6
    //   3973: lstore_2
    //   3974: goto -288 -> 3686
    //   3977: astore 36
    //   3979: aload 38
    //   3981: astore 35
    //   3983: lload 18
    //   3985: lstore_2
    //   3986: ldc -66
    //   3988: aload 36
    //   3990: ldc_w 651
    //   3993: iconst_1
    //   3994: anewarray 4	java/lang/Object
    //   3997: dup
    //   3998: iconst_0
    //   3999: aload 43
    //   4001: invokevirtual 456	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   4004: aastore
    //   4005: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4008: aload_0
    //   4009: sipush 750
    //   4012: putfield 56	com/tencent/mm/plugin/music/a/c/a:glO	I
    //   4015: aload_0
    //   4016: iconst_5
    //   4017: invokespecial 451	com/tencent/mm/plugin/music/a/c/a:rx	(I)V
    //   4020: lload 4
    //   4022: lconst_0
    //   4023: lcmp
    //   4024: ifne +1167 -> 5191
    //   4027: lload_2
    //   4028: lconst_0
    //   4029: lcmp
    //   4030: ifle +1161 -> 5191
    //   4033: ldc -66
    //   4035: ldc_w 466
    //   4038: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4041: aload 33
    //   4043: lload_2
    //   4044: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   4047: aload_0
    //   4048: lload_2
    //   4049: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   4052: lload_2
    //   4053: ldc2_w 402
    //   4056: lcmp
    //   4057: ifge +15 -> 4072
    //   4060: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   4063: dup
    //   4064: aload_0
    //   4065: iconst_1
    //   4066: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   4069: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   4072: aload 35
    //   4074: ifnull +8 -> 4082
    //   4077: aload 35
    //   4079: invokevirtual 652	java/io/InputStream:close	()V
    //   4082: aload 33
    //   4084: ifnull +8 -> 4092
    //   4087: aload 33
    //   4089: invokevirtual 557	java/io/RandomAccessFile:close	()V
    //   4092: aload 34
    //   4094: ifnull +11 -> 4105
    //   4097: aload 34
    //   4099: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   4102: invokevirtual 188	java/net/HttpURLConnection:disconnect	()V
    //   4105: aload_0
    //   4106: iconst_1
    //   4107: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   4110: ldc -66
    //   4112: ldc_w 473
    //   4115: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4118: ldc2_w 368
    //   4121: ldc_w 370
    //   4124: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4127: return
    //   4128: lload_2
    //   4129: lconst_0
    //   4130: lcmp
    //   4131: ifle +397 -> 4528
    //   4134: lload_2
    //   4135: aload 45
    //   4137: iconst_0
    //   4138: laload
    //   4139: lcmp
    //   4140: ifeq +388 -> 4528
    //   4143: lload 4
    //   4145: lstore 8
    //   4147: lload_2
    //   4148: lstore 6
    //   4150: aload 34
    //   4152: astore 37
    //   4154: aload 33
    //   4156: astore 36
    //   4158: aload 38
    //   4160: astore 35
    //   4162: lload 4
    //   4164: lstore 22
    //   4166: lload_2
    //   4167: lstore 16
    //   4169: lload 4
    //   4171: lstore 24
    //   4173: lload_2
    //   4174: lstore 14
    //   4176: lload 4
    //   4178: lstore 26
    //   4180: lload_2
    //   4181: lstore 10
    //   4183: lload 4
    //   4185: lstore 20
    //   4187: lload_2
    //   4188: lstore 18
    //   4190: lload 4
    //   4192: lstore 28
    //   4194: lload_2
    //   4195: lstore 12
    //   4197: ldc -66
    //   4199: ldc_w 654
    //   4202: invokestatic 317	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   4205: lload 4
    //   4207: lstore 8
    //   4209: lload_2
    //   4210: lstore 6
    //   4212: aload 34
    //   4214: astore 37
    //   4216: aload 33
    //   4218: astore 36
    //   4220: aload 38
    //   4222: astore 35
    //   4224: lload 4
    //   4226: lstore 22
    //   4228: lload_2
    //   4229: lstore 16
    //   4231: lload 4
    //   4233: lstore 24
    //   4235: lload_2
    //   4236: lstore 14
    //   4238: lload 4
    //   4240: lstore 26
    //   4242: lload_2
    //   4243: lstore 10
    //   4245: lload 4
    //   4247: lstore 20
    //   4249: lload_2
    //   4250: lstore 18
    //   4252: lload 4
    //   4254: lstore 28
    //   4256: lload_2
    //   4257: lstore 12
    //   4259: aload_0
    //   4260: bipush 6
    //   4262: invokespecial 451	com/tencent/mm/plugin/music/a/c/a:rx	(I)V
    //   4265: lload 4
    //   4267: lconst_0
    //   4268: lcmp
    //   4269: ifne +108 -> 4377
    //   4272: lload_2
    //   4273: lconst_0
    //   4274: lcmp
    //   4275: ifle +102 -> 4377
    //   4278: ldc -66
    //   4280: ldc_w 466
    //   4283: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4286: aload 33
    //   4288: lload_2
    //   4289: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   4292: aload_0
    //   4293: lload_2
    //   4294: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   4297: lload_2
    //   4298: ldc2_w 402
    //   4301: lcmp
    //   4302: ifge +15 -> 4317
    //   4305: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   4308: dup
    //   4309: aload_0
    //   4310: iconst_1
    //   4311: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   4314: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   4317: aload 33
    //   4319: invokevirtual 557	java/io/RandomAccessFile:close	()V
    //   4322: aload 34
    //   4324: ifnull +11 -> 4335
    //   4327: aload 34
    //   4329: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   4332: invokevirtual 188	java/net/HttpURLConnection:disconnect	()V
    //   4335: aload_0
    //   4336: iconst_1
    //   4337: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   4340: ldc -66
    //   4342: ldc_w 473
    //   4345: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4348: ldc2_w 368
    //   4351: ldc_w 370
    //   4354: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4357: return
    //   4358: astore 35
    //   4360: ldc -66
    //   4362: aload 35
    //   4364: ldc_w 475
    //   4367: iconst_0
    //   4368: anewarray 4	java/lang/Object
    //   4371: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4374: goto -82 -> 4292
    //   4377: lload 4
    //   4379: lconst_0
    //   4380: lcmp
    //   4381: ifeq +47 -> 4428
    //   4384: lload_2
    //   4385: lload 4
    //   4387: lcmp
    //   4388: ifeq +40 -> 4428
    //   4391: ldc -66
    //   4393: ldc_w 477
    //   4396: iconst_2
    //   4397: anewarray 4	java/lang/Object
    //   4400: dup
    //   4401: iconst_0
    //   4402: lload 4
    //   4404: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4407: aastore
    //   4408: dup
    //   4409: iconst_1
    //   4410: lload_2
    //   4411: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4414: aastore
    //   4415: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4418: aload_0
    //   4419: lload_2
    //   4420: lload 4
    //   4422: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   4425: goto -108 -> 4317
    //   4428: lload 4
    //   4430: lconst_0
    //   4431: lcmp
    //   4432: ifeq +66 -> 4498
    //   4435: lload_2
    //   4436: lload 4
    //   4438: lcmp
    //   4439: ifne +59 -> 4498
    //   4442: ldc -66
    //   4444: ldc_w 481
    //   4447: iconst_2
    //   4448: anewarray 4	java/lang/Object
    //   4451: dup
    //   4452: iconst_0
    //   4453: lload 4
    //   4455: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4458: aastore
    //   4459: dup
    //   4460: iconst_1
    //   4461: lload_2
    //   4462: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4465: aastore
    //   4466: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4469: aload_0
    //   4470: lload 4
    //   4472: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   4475: lload_2
    //   4476: ldc2_w 402
    //   4479: lcmp
    //   4480: ifge -163 -> 4317
    //   4483: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   4486: dup
    //   4487: aload_0
    //   4488: iconst_1
    //   4489: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   4492: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   4495: goto -178 -> 4317
    //   4498: ldc -66
    //   4500: ldc_w 483
    //   4503: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4506: goto -189 -> 4317
    //   4509: astore 33
    //   4511: ldc -66
    //   4513: aload 33
    //   4515: ldc_w 475
    //   4518: iconst_0
    //   4519: anewarray 4	java/lang/Object
    //   4522: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4525: goto -203 -> 4322
    //   4528: aload 45
    //   4530: iconst_2
    //   4531: laload
    //   4532: lstore 4
    //   4534: goto +2785 -> 7319
    //   4537: lload 6
    //   4539: lstore 18
    //   4541: lload 6
    //   4543: lstore 16
    //   4545: lload 6
    //   4547: lstore 14
    //   4549: lload 6
    //   4551: lstore 10
    //   4553: lload 6
    //   4555: lstore 8
    //   4557: lload 6
    //   4559: lstore 12
    //   4561: aload_0
    //   4562: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   4565: lload 6
    //   4567: putfield 163	com/tencent/mm/at/a:field_downloadedLength	J
    //   4570: lload 6
    //   4572: lstore 18
    //   4574: lload 6
    //   4576: lstore 16
    //   4578: lload 6
    //   4580: lstore 14
    //   4582: lload 6
    //   4584: lstore 10
    //   4586: lload 6
    //   4588: lstore 8
    //   4590: lload 6
    //   4592: lstore 12
    //   4594: aload_0
    //   4595: getfield 58	com/tencent/mm/plugin/music/a/c/a:eNq	Lcom/tencent/mm/at/a;
    //   4598: lload 30
    //   4600: putfield 444	com/tencent/mm/at/a:field_songFileLength	J
    //   4603: goto -680 -> 3923
    //   4606: astore 35
    //   4608: aload 38
    //   4610: astore 39
    //   4612: lload 16
    //   4614: lstore_2
    //   4615: aload 35
    //   4617: astore 38
    //   4619: lload 4
    //   4621: lstore 8
    //   4623: lload_2
    //   4624: lstore 6
    //   4626: aload 34
    //   4628: astore 37
    //   4630: aload 33
    //   4632: astore 36
    //   4634: aload 39
    //   4636: astore 35
    //   4638: ldc -66
    //   4640: aload 38
    //   4642: ldc_w 651
    //   4645: iconst_1
    //   4646: anewarray 4	java/lang/Object
    //   4649: dup
    //   4650: iconst_0
    //   4651: aload 43
    //   4653: invokevirtual 456	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   4656: aastore
    //   4657: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4660: lload 4
    //   4662: lstore 8
    //   4664: lload_2
    //   4665: lstore 6
    //   4667: aload 34
    //   4669: astore 37
    //   4671: aload 33
    //   4673: astore 36
    //   4675: aload 39
    //   4677: astore 35
    //   4679: aload_0
    //   4680: sipush 751
    //   4683: putfield 56	com/tencent/mm/plugin/music/a/c/a:glO	I
    //   4686: lload 4
    //   4688: lstore 8
    //   4690: lload_2
    //   4691: lstore 6
    //   4693: aload 34
    //   4695: astore 37
    //   4697: aload 33
    //   4699: astore 36
    //   4701: aload 39
    //   4703: astore 35
    //   4705: aload_0
    //   4706: iconst_5
    //   4707: invokespecial 451	com/tencent/mm/plugin/music/a/c/a:rx	(I)V
    //   4710: lload 4
    //   4712: lconst_0
    //   4713: lcmp
    //   4714: ifne +666 -> 5380
    //   4717: lload_2
    //   4718: lconst_0
    //   4719: lcmp
    //   4720: ifle +660 -> 5380
    //   4723: ldc -66
    //   4725: ldc_w 466
    //   4728: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4731: aload 33
    //   4733: lload_2
    //   4734: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   4737: aload_0
    //   4738: lload_2
    //   4739: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   4742: lload_2
    //   4743: ldc2_w 402
    //   4746: lcmp
    //   4747: ifge +15 -> 4762
    //   4750: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   4753: dup
    //   4754: aload_0
    //   4755: iconst_1
    //   4756: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   4759: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   4762: aload 39
    //   4764: ifnull +8 -> 4772
    //   4767: aload 39
    //   4769: invokevirtual 652	java/io/InputStream:close	()V
    //   4772: aload 33
    //   4774: ifnull +8 -> 4782
    //   4777: aload 33
    //   4779: invokevirtual 557	java/io/RandomAccessFile:close	()V
    //   4782: aload 34
    //   4784: ifnull +11 -> 4795
    //   4787: aload 34
    //   4789: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   4792: invokevirtual 188	java/net/HttpURLConnection:disconnect	()V
    //   4795: aload_0
    //   4796: iconst_1
    //   4797: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   4800: ldc -66
    //   4802: ldc_w 473
    //   4805: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4808: ldc2_w 368
    //   4811: ldc_w 370
    //   4814: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4817: return
    //   4818: lload_2
    //   4819: lstore 18
    //   4821: lload_2
    //   4822: lstore 16
    //   4824: lload_2
    //   4825: lstore 14
    //   4827: lload_2
    //   4828: lstore 10
    //   4830: lload_2
    //   4831: lstore 8
    //   4833: lload_2
    //   4834: lstore 12
    //   4836: ldc -66
    //   4838: ldc_w 656
    //   4841: iconst_4
    //   4842: anewarray 4	java/lang/Object
    //   4845: dup
    //   4846: iconst_0
    //   4847: iload_1
    //   4848: invokestatic 261	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   4851: aastore
    //   4852: dup
    //   4853: iconst_1
    //   4854: aload_0
    //   4855: getfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   4858: invokestatic 426	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   4861: aastore
    //   4862: dup
    //   4863: iconst_2
    //   4864: lload_2
    //   4865: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4868: aastore
    //   4869: dup
    //   4870: iconst_3
    //   4871: lload 30
    //   4873: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   4876: aastore
    //   4877: invokestatic 275	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4880: lload 4
    //   4882: lconst_0
    //   4883: lcmp
    //   4884: ifne +118 -> 5002
    //   4887: lload_2
    //   4888: lconst_0
    //   4889: lcmp
    //   4890: ifle +112 -> 5002
    //   4893: ldc -66
    //   4895: ldc_w 466
    //   4898: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4901: aload 33
    //   4903: lload_2
    //   4904: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   4907: aload_0
    //   4908: lload_2
    //   4909: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   4912: lload_2
    //   4913: ldc2_w 402
    //   4916: lcmp
    //   4917: ifge +15 -> 4932
    //   4920: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   4923: dup
    //   4924: aload_0
    //   4925: iconst_1
    //   4926: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   4929: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   4932: aload 38
    //   4934: ifnull +8 -> 4942
    //   4937: aload 38
    //   4939: invokevirtual 652	java/io/InputStream:close	()V
    //   4942: aload 33
    //   4944: invokevirtual 557	java/io/RandomAccessFile:close	()V
    //   4947: aload 34
    //   4949: ifnull +11 -> 4960
    //   4952: aload 34
    //   4954: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   4957: invokevirtual 188	java/net/HttpURLConnection:disconnect	()V
    //   4960: aload_0
    //   4961: iconst_1
    //   4962: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   4965: ldc -66
    //   4967: ldc_w 473
    //   4970: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   4973: ldc2_w 368
    //   4976: ldc_w 370
    //   4979: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   4982: return
    //   4983: astore 35
    //   4985: ldc -66
    //   4987: aload 35
    //   4989: ldc_w 475
    //   4992: iconst_0
    //   4993: anewarray 4	java/lang/Object
    //   4996: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4999: goto -92 -> 4907
    //   5002: lload 4
    //   5004: lconst_0
    //   5005: lcmp
    //   5006: ifeq +47 -> 5053
    //   5009: lload_2
    //   5010: lload 4
    //   5012: lcmp
    //   5013: ifeq +40 -> 5053
    //   5016: ldc -66
    //   5018: ldc_w 477
    //   5021: iconst_2
    //   5022: anewarray 4	java/lang/Object
    //   5025: dup
    //   5026: iconst_0
    //   5027: lload 4
    //   5029: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5032: aastore
    //   5033: dup
    //   5034: iconst_1
    //   5035: lload_2
    //   5036: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5039: aastore
    //   5040: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5043: aload_0
    //   5044: lload_2
    //   5045: lload 4
    //   5047: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   5050: goto -118 -> 4932
    //   5053: lload 4
    //   5055: lconst_0
    //   5056: lcmp
    //   5057: ifeq +66 -> 5123
    //   5060: lload_2
    //   5061: lload 4
    //   5063: lcmp
    //   5064: ifne +59 -> 5123
    //   5067: ldc -66
    //   5069: ldc_w 481
    //   5072: iconst_2
    //   5073: anewarray 4	java/lang/Object
    //   5076: dup
    //   5077: iconst_0
    //   5078: lload 4
    //   5080: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5083: aastore
    //   5084: dup
    //   5085: iconst_1
    //   5086: lload_2
    //   5087: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5090: aastore
    //   5091: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5094: aload_0
    //   5095: lload 4
    //   5097: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   5100: lload_2
    //   5101: ldc2_w 402
    //   5104: lcmp
    //   5105: ifge -173 -> 4932
    //   5108: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   5111: dup
    //   5112: aload_0
    //   5113: iconst_1
    //   5114: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   5117: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   5120: goto -188 -> 4932
    //   5123: ldc -66
    //   5125: ldc_w 483
    //   5128: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5131: goto -199 -> 4932
    //   5134: astore 35
    //   5136: ldc -66
    //   5138: aload 35
    //   5140: ldc_w 658
    //   5143: iconst_0
    //   5144: anewarray 4	java/lang/Object
    //   5147: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5150: goto -208 -> 4942
    //   5153: astore 33
    //   5155: ldc -66
    //   5157: aload 33
    //   5159: ldc_w 475
    //   5162: iconst_0
    //   5163: anewarray 4	java/lang/Object
    //   5166: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5169: goto -222 -> 4947
    //   5172: astore 36
    //   5174: ldc -66
    //   5176: aload 36
    //   5178: ldc_w 475
    //   5181: iconst_0
    //   5182: anewarray 4	java/lang/Object
    //   5185: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5188: goto -1141 -> 4047
    //   5191: lload 4
    //   5193: lconst_0
    //   5194: lcmp
    //   5195: ifeq +47 -> 5242
    //   5198: lload_2
    //   5199: lload 4
    //   5201: lcmp
    //   5202: ifeq +40 -> 5242
    //   5205: ldc -66
    //   5207: ldc_w 477
    //   5210: iconst_2
    //   5211: anewarray 4	java/lang/Object
    //   5214: dup
    //   5215: iconst_0
    //   5216: lload 4
    //   5218: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5221: aastore
    //   5222: dup
    //   5223: iconst_1
    //   5224: lload_2
    //   5225: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5228: aastore
    //   5229: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5232: aload_0
    //   5233: lload_2
    //   5234: lload 4
    //   5236: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   5239: goto -1167 -> 4072
    //   5242: lload 4
    //   5244: lconst_0
    //   5245: lcmp
    //   5246: ifeq +66 -> 5312
    //   5249: lload_2
    //   5250: lload 4
    //   5252: lcmp
    //   5253: ifne +59 -> 5312
    //   5256: ldc -66
    //   5258: ldc_w 481
    //   5261: iconst_2
    //   5262: anewarray 4	java/lang/Object
    //   5265: dup
    //   5266: iconst_0
    //   5267: lload 4
    //   5269: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5272: aastore
    //   5273: dup
    //   5274: iconst_1
    //   5275: lload_2
    //   5276: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5279: aastore
    //   5280: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5283: aload_0
    //   5284: lload 4
    //   5286: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   5289: lload_2
    //   5290: ldc2_w 402
    //   5293: lcmp
    //   5294: ifge -1222 -> 4072
    //   5297: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   5300: dup
    //   5301: aload_0
    //   5302: iconst_1
    //   5303: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   5306: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   5309: goto -1237 -> 4072
    //   5312: ldc -66
    //   5314: ldc_w 483
    //   5317: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5320: goto -1248 -> 4072
    //   5323: astore 35
    //   5325: ldc -66
    //   5327: aload 35
    //   5329: ldc_w 658
    //   5332: iconst_0
    //   5333: anewarray 4	java/lang/Object
    //   5336: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5339: goto -1257 -> 4082
    //   5342: astore 33
    //   5344: ldc -66
    //   5346: aload 33
    //   5348: ldc_w 475
    //   5351: iconst_0
    //   5352: anewarray 4	java/lang/Object
    //   5355: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5358: goto -1266 -> 4092
    //   5361: astore 35
    //   5363: ldc -66
    //   5365: aload 35
    //   5367: ldc_w 475
    //   5370: iconst_0
    //   5371: anewarray 4	java/lang/Object
    //   5374: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5377: goto -640 -> 4737
    //   5380: lload 4
    //   5382: lconst_0
    //   5383: lcmp
    //   5384: ifeq +47 -> 5431
    //   5387: lload_2
    //   5388: lload 4
    //   5390: lcmp
    //   5391: ifeq +40 -> 5431
    //   5394: ldc -66
    //   5396: ldc_w 477
    //   5399: iconst_2
    //   5400: anewarray 4	java/lang/Object
    //   5403: dup
    //   5404: iconst_0
    //   5405: lload 4
    //   5407: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5410: aastore
    //   5411: dup
    //   5412: iconst_1
    //   5413: lload_2
    //   5414: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5417: aastore
    //   5418: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5421: aload_0
    //   5422: lload_2
    //   5423: lload 4
    //   5425: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   5428: goto -666 -> 4762
    //   5431: lload 4
    //   5433: lconst_0
    //   5434: lcmp
    //   5435: ifeq +66 -> 5501
    //   5438: lload_2
    //   5439: lload 4
    //   5441: lcmp
    //   5442: ifne +59 -> 5501
    //   5445: ldc -66
    //   5447: ldc_w 481
    //   5450: iconst_2
    //   5451: anewarray 4	java/lang/Object
    //   5454: dup
    //   5455: iconst_0
    //   5456: lload 4
    //   5458: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5461: aastore
    //   5462: dup
    //   5463: iconst_1
    //   5464: lload_2
    //   5465: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5468: aastore
    //   5469: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5472: aload_0
    //   5473: lload 4
    //   5475: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   5478: lload_2
    //   5479: ldc2_w 402
    //   5482: lcmp
    //   5483: ifge -721 -> 4762
    //   5486: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   5489: dup
    //   5490: aload_0
    //   5491: iconst_1
    //   5492: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   5495: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   5498: goto -736 -> 4762
    //   5501: ldc -66
    //   5503: ldc_w 483
    //   5506: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5509: goto -747 -> 4762
    //   5512: astore 35
    //   5514: ldc -66
    //   5516: aload 35
    //   5518: ldc_w 658
    //   5521: iconst_0
    //   5522: anewarray 4	java/lang/Object
    //   5525: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5528: goto -756 -> 4772
    //   5531: astore 33
    //   5533: ldc -66
    //   5535: aload 33
    //   5537: ldc_w 475
    //   5540: iconst_0
    //   5541: anewarray 4	java/lang/Object
    //   5544: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5547: goto -765 -> 4782
    //   5550: astore 38
    //   5552: aconst_null
    //   5553: astore 33
    //   5555: aconst_null
    //   5556: astore 34
    //   5558: aload 41
    //   5560: astore 39
    //   5562: lload 4
    //   5564: lstore 8
    //   5566: lload_2
    //   5567: lstore 6
    //   5569: aload 34
    //   5571: astore 37
    //   5573: aload 33
    //   5575: astore 36
    //   5577: aload 39
    //   5579: astore 35
    //   5581: ldc -66
    //   5583: aload 38
    //   5585: ldc_w 651
    //   5588: iconst_1
    //   5589: anewarray 4	java/lang/Object
    //   5592: dup
    //   5593: iconst_0
    //   5594: aload 43
    //   5596: invokevirtual 456	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   5599: aastore
    //   5600: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5603: lload 4
    //   5605: lstore 8
    //   5607: lload_2
    //   5608: lstore 6
    //   5610: aload 34
    //   5612: astore 37
    //   5614: aload 33
    //   5616: astore 36
    //   5618: aload 39
    //   5620: astore 35
    //   5622: aload_0
    //   5623: sipush 752
    //   5626: putfield 56	com/tencent/mm/plugin/music/a/c/a:glO	I
    //   5629: lload 4
    //   5631: lstore 8
    //   5633: lload_2
    //   5634: lstore 6
    //   5636: aload 34
    //   5638: astore 37
    //   5640: aload 33
    //   5642: astore 36
    //   5644: aload 39
    //   5646: astore 35
    //   5648: aload_0
    //   5649: iconst_5
    //   5650: invokespecial 451	com/tencent/mm/plugin/music/a/c/a:rx	(I)V
    //   5653: lload 4
    //   5655: lconst_0
    //   5656: lcmp
    //   5657: ifne +123 -> 5780
    //   5660: lload_2
    //   5661: lconst_0
    //   5662: lcmp
    //   5663: ifle +117 -> 5780
    //   5666: ldc -66
    //   5668: ldc_w 466
    //   5671: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5674: aload 33
    //   5676: lload_2
    //   5677: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   5680: aload_0
    //   5681: lload_2
    //   5682: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   5685: lload_2
    //   5686: ldc2_w 402
    //   5689: lcmp
    //   5690: ifge +15 -> 5705
    //   5693: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   5696: dup
    //   5697: aload_0
    //   5698: iconst_1
    //   5699: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   5702: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   5705: aload 39
    //   5707: ifnull +8 -> 5715
    //   5710: aload 39
    //   5712: invokevirtual 652	java/io/InputStream:close	()V
    //   5715: aload 33
    //   5717: ifnull +8 -> 5725
    //   5720: aload 33
    //   5722: invokevirtual 557	java/io/RandomAccessFile:close	()V
    //   5725: aload 34
    //   5727: ifnull +11 -> 5738
    //   5730: aload 34
    //   5732: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   5735: invokevirtual 188	java/net/HttpURLConnection:disconnect	()V
    //   5738: aload_0
    //   5739: iconst_1
    //   5740: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   5743: ldc -66
    //   5745: ldc_w 473
    //   5748: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5751: ldc2_w 368
    //   5754: ldc_w 370
    //   5757: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   5760: return
    //   5761: astore 35
    //   5763: ldc -66
    //   5765: aload 35
    //   5767: ldc_w 475
    //   5770: iconst_0
    //   5771: anewarray 4	java/lang/Object
    //   5774: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5777: goto -97 -> 5680
    //   5780: lload 4
    //   5782: lconst_0
    //   5783: lcmp
    //   5784: ifeq +47 -> 5831
    //   5787: lload_2
    //   5788: lload 4
    //   5790: lcmp
    //   5791: ifeq +40 -> 5831
    //   5794: ldc -66
    //   5796: ldc_w 477
    //   5799: iconst_2
    //   5800: anewarray 4	java/lang/Object
    //   5803: dup
    //   5804: iconst_0
    //   5805: lload 4
    //   5807: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5810: aastore
    //   5811: dup
    //   5812: iconst_1
    //   5813: lload_2
    //   5814: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5817: aastore
    //   5818: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5821: aload_0
    //   5822: lload_2
    //   5823: lload 4
    //   5825: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   5828: goto -123 -> 5705
    //   5831: lload 4
    //   5833: lconst_0
    //   5834: lcmp
    //   5835: ifeq +66 -> 5901
    //   5838: lload_2
    //   5839: lload 4
    //   5841: lcmp
    //   5842: ifne +59 -> 5901
    //   5845: ldc -66
    //   5847: ldc_w 481
    //   5850: iconst_2
    //   5851: anewarray 4	java/lang/Object
    //   5854: dup
    //   5855: iconst_0
    //   5856: lload 4
    //   5858: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5861: aastore
    //   5862: dup
    //   5863: iconst_1
    //   5864: lload_2
    //   5865: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5868: aastore
    //   5869: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5872: aload_0
    //   5873: lload 4
    //   5875: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   5878: lload_2
    //   5879: ldc2_w 402
    //   5882: lcmp
    //   5883: ifge -178 -> 5705
    //   5886: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   5889: dup
    //   5890: aload_0
    //   5891: iconst_1
    //   5892: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   5895: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   5898: goto -193 -> 5705
    //   5901: ldc -66
    //   5903: ldc_w 483
    //   5906: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   5909: goto -204 -> 5705
    //   5912: astore 35
    //   5914: ldc -66
    //   5916: aload 35
    //   5918: ldc_w 658
    //   5921: iconst_0
    //   5922: anewarray 4	java/lang/Object
    //   5925: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5928: goto -213 -> 5715
    //   5931: astore 33
    //   5933: ldc -66
    //   5935: aload 33
    //   5937: ldc_w 475
    //   5940: iconst_0
    //   5941: anewarray 4	java/lang/Object
    //   5944: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   5947: goto -222 -> 5725
    //   5950: astore 38
    //   5952: aconst_null
    //   5953: astore 33
    //   5955: aconst_null
    //   5956: astore 34
    //   5958: aload 42
    //   5960: astore 39
    //   5962: lload 4
    //   5964: lstore 8
    //   5966: lload_2
    //   5967: lstore 6
    //   5969: aload 34
    //   5971: astore 37
    //   5973: aload 33
    //   5975: astore 36
    //   5977: aload 39
    //   5979: astore 35
    //   5981: ldc -66
    //   5983: aload 38
    //   5985: ldc_w 651
    //   5988: iconst_1
    //   5989: anewarray 4	java/lang/Object
    //   5992: dup
    //   5993: iconst_0
    //   5994: aload 43
    //   5996: invokevirtual 456	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   5999: aastore
    //   6000: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6003: lload 4
    //   6005: lstore 8
    //   6007: lload_2
    //   6008: lstore 6
    //   6010: aload 34
    //   6012: astore 37
    //   6014: aload 33
    //   6016: astore 36
    //   6018: aload 39
    //   6020: astore 35
    //   6022: aload_0
    //   6023: sipush 753
    //   6026: putfield 56	com/tencent/mm/plugin/music/a/c/a:glO	I
    //   6029: lload 4
    //   6031: lstore 8
    //   6033: lload_2
    //   6034: lstore 6
    //   6036: aload 34
    //   6038: astore 37
    //   6040: aload 33
    //   6042: astore 36
    //   6044: aload 39
    //   6046: astore 35
    //   6048: aload_0
    //   6049: iconst_5
    //   6050: invokespecial 451	com/tencent/mm/plugin/music/a/c/a:rx	(I)V
    //   6053: lload 4
    //   6055: lconst_0
    //   6056: lcmp
    //   6057: ifne +123 -> 6180
    //   6060: lload_2
    //   6061: lconst_0
    //   6062: lcmp
    //   6063: ifle +117 -> 6180
    //   6066: ldc -66
    //   6068: ldc_w 466
    //   6071: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6074: aload 33
    //   6076: lload_2
    //   6077: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   6080: aload_0
    //   6081: lload_2
    //   6082: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   6085: lload_2
    //   6086: ldc2_w 402
    //   6089: lcmp
    //   6090: ifge +15 -> 6105
    //   6093: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   6096: dup
    //   6097: aload_0
    //   6098: iconst_1
    //   6099: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   6102: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   6105: aload 39
    //   6107: ifnull +8 -> 6115
    //   6110: aload 39
    //   6112: invokevirtual 652	java/io/InputStream:close	()V
    //   6115: aload 33
    //   6117: ifnull +8 -> 6125
    //   6120: aload 33
    //   6122: invokevirtual 557	java/io/RandomAccessFile:close	()V
    //   6125: aload 34
    //   6127: ifnull +11 -> 6138
    //   6130: aload 34
    //   6132: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   6135: invokevirtual 188	java/net/HttpURLConnection:disconnect	()V
    //   6138: aload_0
    //   6139: iconst_1
    //   6140: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   6143: ldc -66
    //   6145: ldc_w 473
    //   6148: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6151: ldc2_w 368
    //   6154: ldc_w 370
    //   6157: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   6160: return
    //   6161: astore 35
    //   6163: ldc -66
    //   6165: aload 35
    //   6167: ldc_w 475
    //   6170: iconst_0
    //   6171: anewarray 4	java/lang/Object
    //   6174: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6177: goto -97 -> 6080
    //   6180: lload 4
    //   6182: lconst_0
    //   6183: lcmp
    //   6184: ifeq +47 -> 6231
    //   6187: lload_2
    //   6188: lload 4
    //   6190: lcmp
    //   6191: ifeq +40 -> 6231
    //   6194: ldc -66
    //   6196: ldc_w 477
    //   6199: iconst_2
    //   6200: anewarray 4	java/lang/Object
    //   6203: dup
    //   6204: iconst_0
    //   6205: lload 4
    //   6207: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6210: aastore
    //   6211: dup
    //   6212: iconst_1
    //   6213: lload_2
    //   6214: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6217: aastore
    //   6218: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6221: aload_0
    //   6222: lload_2
    //   6223: lload 4
    //   6225: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   6228: goto -123 -> 6105
    //   6231: lload 4
    //   6233: lconst_0
    //   6234: lcmp
    //   6235: ifeq +66 -> 6301
    //   6238: lload_2
    //   6239: lload 4
    //   6241: lcmp
    //   6242: ifne +59 -> 6301
    //   6245: ldc -66
    //   6247: ldc_w 481
    //   6250: iconst_2
    //   6251: anewarray 4	java/lang/Object
    //   6254: dup
    //   6255: iconst_0
    //   6256: lload 4
    //   6258: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6261: aastore
    //   6262: dup
    //   6263: iconst_1
    //   6264: lload_2
    //   6265: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6268: aastore
    //   6269: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6272: aload_0
    //   6273: lload 4
    //   6275: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   6278: lload_2
    //   6279: ldc2_w 402
    //   6282: lcmp
    //   6283: ifge -178 -> 6105
    //   6286: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   6289: dup
    //   6290: aload_0
    //   6291: iconst_1
    //   6292: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   6295: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   6298: goto -193 -> 6105
    //   6301: ldc -66
    //   6303: ldc_w 483
    //   6306: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6309: goto -204 -> 6105
    //   6312: astore 35
    //   6314: ldc -66
    //   6316: aload 35
    //   6318: ldc_w 658
    //   6321: iconst_0
    //   6322: anewarray 4	java/lang/Object
    //   6325: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6328: goto -213 -> 6115
    //   6331: astore 33
    //   6333: ldc -66
    //   6335: aload 33
    //   6337: ldc_w 475
    //   6340: iconst_0
    //   6341: anewarray 4	java/lang/Object
    //   6344: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6347: goto -222 -> 6125
    //   6350: astore 38
    //   6352: aconst_null
    //   6353: astore 33
    //   6355: aconst_null
    //   6356: astore 34
    //   6358: lload 4
    //   6360: lstore 8
    //   6362: lload_2
    //   6363: lstore 6
    //   6365: aload 34
    //   6367: astore 37
    //   6369: aload 33
    //   6371: astore 36
    //   6373: aload 39
    //   6375: astore 35
    //   6377: ldc -66
    //   6379: aload 38
    //   6381: ldc_w 651
    //   6384: iconst_1
    //   6385: anewarray 4	java/lang/Object
    //   6388: dup
    //   6389: iconst_0
    //   6390: aload 43
    //   6392: invokevirtual 456	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   6395: aastore
    //   6396: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6399: lload 4
    //   6401: lstore 8
    //   6403: lload_2
    //   6404: lstore 6
    //   6406: aload 34
    //   6408: astore 37
    //   6410: aload 33
    //   6412: astore 36
    //   6414: aload 39
    //   6416: astore 35
    //   6418: aload_0
    //   6419: sipush 754
    //   6422: putfield 56	com/tencent/mm/plugin/music/a/c/a:glO	I
    //   6425: lload 4
    //   6427: lstore 8
    //   6429: lload_2
    //   6430: lstore 6
    //   6432: aload 34
    //   6434: astore 37
    //   6436: aload 33
    //   6438: astore 36
    //   6440: aload 39
    //   6442: astore 35
    //   6444: aload_0
    //   6445: iconst_5
    //   6446: invokespecial 451	com/tencent/mm/plugin/music/a/c/a:rx	(I)V
    //   6449: lload 4
    //   6451: lconst_0
    //   6452: lcmp
    //   6453: ifne +123 -> 6576
    //   6456: lload_2
    //   6457: lconst_0
    //   6458: lcmp
    //   6459: ifle +117 -> 6576
    //   6462: ldc -66
    //   6464: ldc_w 466
    //   6467: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6470: aload 33
    //   6472: lload_2
    //   6473: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   6476: aload_0
    //   6477: lload_2
    //   6478: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   6481: lload_2
    //   6482: ldc2_w 402
    //   6485: lcmp
    //   6486: ifge +15 -> 6501
    //   6489: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   6492: dup
    //   6493: aload_0
    //   6494: iconst_1
    //   6495: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   6498: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   6501: aload 39
    //   6503: ifnull +8 -> 6511
    //   6506: aload 39
    //   6508: invokevirtual 652	java/io/InputStream:close	()V
    //   6511: aload 33
    //   6513: ifnull +8 -> 6521
    //   6516: aload 33
    //   6518: invokevirtual 557	java/io/RandomAccessFile:close	()V
    //   6521: aload 34
    //   6523: ifnull +11 -> 6534
    //   6526: aload 34
    //   6528: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   6531: invokevirtual 188	java/net/HttpURLConnection:disconnect	()V
    //   6534: aload_0
    //   6535: iconst_1
    //   6536: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   6539: ldc -66
    //   6541: ldc_w 473
    //   6544: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6547: ldc2_w 368
    //   6550: ldc_w 370
    //   6553: invokestatic 75	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   6556: return
    //   6557: astore 35
    //   6559: ldc -66
    //   6561: aload 35
    //   6563: ldc_w 475
    //   6566: iconst_0
    //   6567: anewarray 4	java/lang/Object
    //   6570: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6573: goto -97 -> 6476
    //   6576: lload 4
    //   6578: lconst_0
    //   6579: lcmp
    //   6580: ifeq +47 -> 6627
    //   6583: lload_2
    //   6584: lload 4
    //   6586: lcmp
    //   6587: ifeq +40 -> 6627
    //   6590: ldc -66
    //   6592: ldc_w 477
    //   6595: iconst_2
    //   6596: anewarray 4	java/lang/Object
    //   6599: dup
    //   6600: iconst_0
    //   6601: lload 4
    //   6603: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6606: aastore
    //   6607: dup
    //   6608: iconst_1
    //   6609: lload_2
    //   6610: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6613: aastore
    //   6614: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6617: aload_0
    //   6618: lload_2
    //   6619: lload 4
    //   6621: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   6624: goto -123 -> 6501
    //   6627: lload 4
    //   6629: lconst_0
    //   6630: lcmp
    //   6631: ifeq +66 -> 6697
    //   6634: lload_2
    //   6635: lload 4
    //   6637: lcmp
    //   6638: ifne +59 -> 6697
    //   6641: ldc -66
    //   6643: ldc_w 481
    //   6646: iconst_2
    //   6647: anewarray 4	java/lang/Object
    //   6650: dup
    //   6651: iconst_0
    //   6652: lload 4
    //   6654: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6657: aastore
    //   6658: dup
    //   6659: iconst_1
    //   6660: lload_2
    //   6661: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6664: aastore
    //   6665: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6668: aload_0
    //   6669: lload 4
    //   6671: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   6674: lload_2
    //   6675: ldc2_w 402
    //   6678: lcmp
    //   6679: ifge -178 -> 6501
    //   6682: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   6685: dup
    //   6686: aload_0
    //   6687: iconst_1
    //   6688: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   6691: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   6694: goto -193 -> 6501
    //   6697: ldc -66
    //   6699: ldc_w 483
    //   6702: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6705: goto -204 -> 6501
    //   6708: astore 35
    //   6710: ldc -66
    //   6712: aload 35
    //   6714: ldc_w 658
    //   6717: iconst_0
    //   6718: anewarray 4	java/lang/Object
    //   6721: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6724: goto -213 -> 6511
    //   6727: astore 33
    //   6729: ldc -66
    //   6731: aload 33
    //   6733: ldc_w 475
    //   6736: iconst_0
    //   6737: anewarray 4	java/lang/Object
    //   6740: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6743: goto -222 -> 6521
    //   6746: astore 38
    //   6748: aconst_null
    //   6749: astore 33
    //   6751: aconst_null
    //   6752: astore 34
    //   6754: lload 4
    //   6756: lconst_0
    //   6757: lcmp
    //   6758: ifne +116 -> 6874
    //   6761: lload_2
    //   6762: lconst_0
    //   6763: lcmp
    //   6764: ifle +110 -> 6874
    //   6767: ldc -66
    //   6769: ldc_w 466
    //   6772: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6775: aload 33
    //   6777: lload_2
    //   6778: invokevirtual 554	java/io/RandomAccessFile:setLength	(J)V
    //   6781: aload_0
    //   6782: lload_2
    //   6783: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   6786: lload_2
    //   6787: ldc2_w 402
    //   6790: lcmp
    //   6791: ifge +15 -> 6806
    //   6794: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   6797: dup
    //   6798: aload_0
    //   6799: iconst_1
    //   6800: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   6803: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   6806: aload 35
    //   6808: ifnull +8 -> 6816
    //   6811: aload 35
    //   6813: invokevirtual 652	java/io/InputStream:close	()V
    //   6816: aload 33
    //   6818: ifnull +8 -> 6826
    //   6821: aload 33
    //   6823: invokevirtual 557	java/io/RandomAccessFile:close	()V
    //   6826: aload 34
    //   6828: ifnull +11 -> 6839
    //   6831: aload 34
    //   6833: getfield 183	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   6836: invokevirtual 188	java/net/HttpURLConnection:disconnect	()V
    //   6839: aload_0
    //   6840: iconst_1
    //   6841: putfield 48	com/tencent/mm/plugin/music/a/c/a:isStop	Z
    //   6844: ldc -66
    //   6846: ldc_w 473
    //   6849: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   6852: aload 38
    //   6854: athrow
    //   6855: astore 36
    //   6857: ldc -66
    //   6859: aload 36
    //   6861: ldc_w 475
    //   6864: iconst_0
    //   6865: anewarray 4	java/lang/Object
    //   6868: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6871: goto -90 -> 6781
    //   6874: lload 4
    //   6876: lconst_0
    //   6877: lcmp
    //   6878: ifeq +47 -> 6925
    //   6881: lload_2
    //   6882: lload 4
    //   6884: lcmp
    //   6885: ifeq +40 -> 6925
    //   6888: ldc -66
    //   6890: ldc_w 477
    //   6893: iconst_2
    //   6894: anewarray 4	java/lang/Object
    //   6897: dup
    //   6898: iconst_0
    //   6899: lload 4
    //   6901: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6904: aastore
    //   6905: dup
    //   6906: iconst_1
    //   6907: lload_2
    //   6908: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6911: aastore
    //   6912: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6915: aload_0
    //   6916: lload_2
    //   6917: lload 4
    //   6919: invokespecial 479	com/tencent/mm/plugin/music/a/c/a:q	(JJ)V
    //   6922: goto -116 -> 6806
    //   6925: lload 4
    //   6927: lconst_0
    //   6928: lcmp
    //   6929: ifeq +66 -> 6995
    //   6932: lload_2
    //   6933: lload 4
    //   6935: lcmp
    //   6936: ifne +59 -> 6995
    //   6939: ldc -66
    //   6941: ldc_w 481
    //   6944: iconst_2
    //   6945: anewarray 4	java/lang/Object
    //   6948: dup
    //   6949: iconst_0
    //   6950: lload 4
    //   6952: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6955: aastore
    //   6956: dup
    //   6957: iconst_1
    //   6958: lload_2
    //   6959: invokestatic 431	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6962: aastore
    //   6963: invokestatic 197	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   6966: aload_0
    //   6967: lload 4
    //   6969: invokespecial 471	com/tencent/mm/plugin/music/a/c/a:cT	(J)V
    //   6972: lload_2
    //   6973: ldc2_w 402
    //   6976: lcmp
    //   6977: ifge -171 -> 6806
    //   6980: new 8	com/tencent/mm/plugin/music/a/c/a$a
    //   6983: dup
    //   6984: aload_0
    //   6985: iconst_1
    //   6986: invokespecial 154	com/tencent/mm/plugin/music/a/c/a$a:<init>	(Lcom/tencent/mm/plugin/music/a/c/a;I)V
    //   6989: invokestatic 160	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   6992: goto -186 -> 6806
    //   6995: ldc -66
    //   6997: ldc_w 483
    //   7000: invokestatic 407	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   7003: goto -197 -> 6806
    //   7006: astore 35
    //   7008: ldc -66
    //   7010: aload 35
    //   7012: ldc_w 658
    //   7015: iconst_0
    //   7016: anewarray 4	java/lang/Object
    //   7019: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   7022: goto -206 -> 6816
    //   7025: astore 33
    //   7027: ldc -66
    //   7029: aload 33
    //   7031: ldc_w 475
    //   7034: iconst_0
    //   7035: anewarray 4	java/lang/Object
    //   7038: invokestatic 460	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   7041: goto -215 -> 6826
    //   7044: astore 38
    //   7046: aconst_null
    //   7047: astore 34
    //   7049: goto -295 -> 6754
    //   7052: astore 38
    //   7054: lload 8
    //   7056: lstore 4
    //   7058: lload 6
    //   7060: lstore_2
    //   7061: aload 37
    //   7063: astore 34
    //   7065: aload 36
    //   7067: astore 33
    //   7069: goto -315 -> 6754
    //   7072: astore 36
    //   7074: aload 38
    //   7076: astore 35
    //   7078: aload 36
    //   7080: astore 38
    //   7082: lload 14
    //   7084: lstore_2
    //   7085: goto -331 -> 6754
    //   7088: astore 38
    //   7090: goto -336 -> 6754
    //   7093: astore 38
    //   7095: aconst_null
    //   7096: astore 34
    //   7098: goto -740 -> 6358
    //   7101: astore 38
    //   7103: lload 22
    //   7105: lstore 4
    //   7107: lload 16
    //   7109: lstore_2
    //   7110: goto -752 -> 6358
    //   7113: astore 35
    //   7115: aload 38
    //   7117: astore 39
    //   7119: aload 35
    //   7121: astore 38
    //   7123: lload 10
    //   7125: lstore_2
    //   7126: goto -768 -> 6358
    //   7129: astore 38
    //   7131: aconst_null
    //   7132: astore 34
    //   7134: aload 42
    //   7136: astore 39
    //   7138: goto -1176 -> 5962
    //   7141: astore 38
    //   7143: lload 24
    //   7145: lstore 4
    //   7147: lload 14
    //   7149: lstore_2
    //   7150: aload 42
    //   7152: astore 39
    //   7154: goto -1192 -> 5962
    //   7157: astore 35
    //   7159: aload 38
    //   7161: astore 39
    //   7163: aload 35
    //   7165: astore 38
    //   7167: lload 8
    //   7169: lstore_2
    //   7170: goto -1208 -> 5962
    //   7173: astore 38
    //   7175: aconst_null
    //   7176: astore 34
    //   7178: aload 41
    //   7180: astore 39
    //   7182: goto -1620 -> 5562
    //   7185: astore 38
    //   7187: lload 26
    //   7189: lstore 4
    //   7191: lload 10
    //   7193: lstore_2
    //   7194: aload 41
    //   7196: astore 39
    //   7198: goto -1636 -> 5562
    //   7201: astore 35
    //   7203: aload 38
    //   7205: astore 39
    //   7207: aload 35
    //   7209: astore 38
    //   7211: lload 12
    //   7213: lstore_2
    //   7214: goto -1652 -> 5562
    //   7217: astore 38
    //   7219: aconst_null
    //   7220: astore 33
    //   7222: aconst_null
    //   7223: astore 34
    //   7225: aload 40
    //   7227: astore 39
    //   7229: goto -2610 -> 4619
    //   7232: astore 38
    //   7234: aconst_null
    //   7235: astore 34
    //   7237: aload 40
    //   7239: astore 39
    //   7241: goto -2622 -> 4619
    //   7244: astore 38
    //   7246: lload 20
    //   7248: lstore 4
    //   7250: lload 18
    //   7252: lstore_2
    //   7253: aload 40
    //   7255: astore 39
    //   7257: goto -2638 -> 4619
    //   7260: astore 36
    //   7262: aconst_null
    //   7263: astore 33
    //   7265: aconst_null
    //   7266: astore 35
    //   7268: aconst_null
    //   7269: astore 34
    //   7271: goto -3285 -> 3986
    //   7274: astore 36
    //   7276: aconst_null
    //   7277: astore 35
    //   7279: aconst_null
    //   7280: astore 34
    //   7282: goto -3296 -> 3986
    //   7285: astore 36
    //   7287: aconst_null
    //   7288: astore 35
    //   7290: lload 28
    //   7292: lstore 4
    //   7294: lload 12
    //   7296: lstore_2
    //   7297: goto -3311 -> 3986
    //   7300: ldc2_w 659
    //   7303: lstore 30
    //   7305: goto -3907 -> 3398
    //   7308: lload 30
    //   7310: lstore 6
    //   7312: lload 4
    //   7314: lstore_2
    //   7315: lload 6
    //   7317: lstore 4
    //   7319: lload 4
    //   7321: lconst_0
    //   7322: lcmp
    //   7323: ifeq -23 -> 7300
    //   7326: lload 4
    //   7328: lstore 30
    //   7330: goto -3932 -> 3398
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	7333	0	this	a
    //   173	4675	1	i	int
    //   160	7155	2	l1	long
    //   127	7200	4	l2	long
    //   118	7198	6	l3	long
    //   221	6947	8	l4	long
    //   1420	5772	10	l5	long
    //   1434	5861	12	l6	long
    //   1413	5735	14	l7	long
    //   1406	5702	16	l8	long
    //   1427	5824	18	l9	long
    //   1424	5823	20	l10	long
    //   1403	5701	22	l11	long
    //   1410	5734	24	l12	long
    //   1417	5771	26	l13	long
    //   1431	5860	28	l14	long
    //   3235	4094	30	l15	long
    //   32	1248	32	bool	boolean
    //   85	460	33	str1	String
    //   795	5	33	localIOException1	java.io.IOException
    //   1000	5	33	localIOException2	java.io.IOException
    //   1163	595	33	localRandomAccessFile	java.io.RandomAccessFile
    //   1949	2369	33	localIOException3	java.io.IOException
    //   4509	434	33	localIOException4	java.io.IOException
    //   5153	5	33	localIOException5	java.io.IOException
    //   5342	5	33	localIOException6	java.io.IOException
    //   5531	5	33	localIOException7	java.io.IOException
    //   5553	168	33	localObject1	Object
    //   5931	5	33	localIOException8	java.io.IOException
    //   5953	168	33	localObject2	Object
    //   6331	5	33	localIOException9	java.io.IOException
    //   6353	164	33	localObject3	Object
    //   6727	5	33	localIOException10	java.io.IOException
    //   6749	73	33	localObject4	Object
    //   7025	5	33	localIOException11	java.io.IOException
    //   7067	197	33	localObject5	Object
    //   102	7179	34	localObject6	Object
    //   63	1601	35	localObject7	Object
    //   1798	5	35	localIOException12	java.io.IOException
    //   1985	2238	35	localObject8	Object
    //   4358	5	35	localIOException13	java.io.IOException
    //   4606	10	35	localNoRouteToHostException1	java.net.NoRouteToHostException
    //   4636	68	35	localObject9	Object
    //   4983	5	35	localIOException14	java.io.IOException
    //   5134	5	35	localIOException15	java.io.IOException
    //   5323	5	35	localIOException16	java.io.IOException
    //   5361	5	35	localIOException17	java.io.IOException
    //   5512	5	35	localIOException18	java.io.IOException
    //   5579	68	35	localObject10	Object
    //   5761	5	35	localIOException19	java.io.IOException
    //   5912	5	35	localIOException20	java.io.IOException
    //   5979	68	35	localObject11	Object
    //   6161	5	35	localIOException21	java.io.IOException
    //   6312	5	35	localIOException22	java.io.IOException
    //   6375	68	35	localObject12	Object
    //   6557	5	35	localIOException23	java.io.IOException
    //   6708	104	35	localIOException24	java.io.IOException
    //   7006	5	35	localIOException25	java.io.IOException
    //   7076	1	35	localObject13	Object
    //   7113	7	35	localException1	Exception
    //   7157	7	35	localIOException26	java.io.IOException
    //   7201	7	35	localUnknownServiceException1	java.net.UnknownServiceException
    //   7266	23	35	localObject14	Object
    //   1191	2423	36	localObject15	Object
    //   3977	12	36	localProtocolException1	java.net.ProtocolException
    //   4156	544	36	localIOException27	java.io.IOException
    //   5172	5	36	localIOException28	java.io.IOException
    //   5575	864	36	localObject16	Object
    //   6855	211	36	localIOException29	java.io.IOException
    //   7072	7	36	localObject17	Object
    //   7260	1	36	localProtocolException2	java.net.ProtocolException
    //   7274	1	36	localProtocolException3	java.net.ProtocolException
    //   7285	1	36	localProtocolException4	java.net.ProtocolException
    //   1391	5671	37	localObject18	Object
    //   879	4059	38	localObject19	Object
    //   5550	34	38	localUnknownServiceException2	java.net.UnknownServiceException
    //   5950	34	38	localIOException30	java.io.IOException
    //   6350	30	38	localException2	Exception
    //   6746	107	38	localObject20	Object
    //   7044	1	38	localObject21	Object
    //   7052	23	38	localObject22	Object
    //   7080	1	38	localObject23	Object
    //   7088	1	38	localObject24	Object
    //   7093	1	38	localException3	Exception
    //   7101	15	38	localException4	Exception
    //   7121	1	38	localException5	Exception
    //   7129	1	38	localIOException31	java.io.IOException
    //   7141	19	38	localIOException32	java.io.IOException
    //   7165	1	38	localIOException33	java.io.IOException
    //   7173	1	38	localUnknownServiceException3	java.net.UnknownServiceException
    //   7185	19	38	localUnknownServiceException4	java.net.UnknownServiceException
    //   7209	1	38	localUnknownServiceException5	java.net.UnknownServiceException
    //   7217	1	38	localNoRouteToHostException2	java.net.NoRouteToHostException
    //   7232	1	38	localNoRouteToHostException3	java.net.NoRouteToHostException
    //   7244	1	38	localNoRouteToHostException4	java.net.NoRouteToHostException
    //   873	6383	39	localObject25	Object
    //   882	6372	40	localObject26	Object
    //   867	6328	41	localObject27	Object
    //   870	6281	42	localObject28	Object
    //   218	6173	43	localFile	java.io.File
    //   2189	1114	44	str2	String
    //   2761	1768	45	localObject29	Object
    //   2638	331	46	str3	String
    //   2575	389	47	locala	com.tencent.mm.plugin.music.a.g.a
    // Exception table:
    //   from	to	target	type
    //   234	257	795	java/io/IOException
    //   944	952	1000	java/io/IOException
    //   1726	1732	1798	java/io/IOException
    //   1757	1762	1949	java/io/IOException
    //   3679	3686	3977	java/net/ProtocolException
    //   3704	3711	3977	java/net/ProtocolException
    //   3729	3737	3977	java/net/ProtocolException
    //   3759	3768	3977	java/net/ProtocolException
    //   3798	3826	3977	java/net/ProtocolException
    //   3850	3857	3977	java/net/ProtocolException
    //   3881	3890	3977	java/net/ProtocolException
    //   3914	3923	3977	java/net/ProtocolException
    //   3959	3971	3977	java/net/ProtocolException
    //   4561	4570	3977	java/net/ProtocolException
    //   4594	4603	3977	java/net/ProtocolException
    //   4836	4880	3977	java/net/ProtocolException
    //   4286	4292	4358	java/io/IOException
    //   4317	4322	4509	java/io/IOException
    //   3679	3686	4606	java/net/NoRouteToHostException
    //   3704	3711	4606	java/net/NoRouteToHostException
    //   3729	3737	4606	java/net/NoRouteToHostException
    //   3759	3768	4606	java/net/NoRouteToHostException
    //   3798	3826	4606	java/net/NoRouteToHostException
    //   3850	3857	4606	java/net/NoRouteToHostException
    //   3881	3890	4606	java/net/NoRouteToHostException
    //   3914	3923	4606	java/net/NoRouteToHostException
    //   3959	3971	4606	java/net/NoRouteToHostException
    //   4561	4570	4606	java/net/NoRouteToHostException
    //   4594	4603	4606	java/net/NoRouteToHostException
    //   4836	4880	4606	java/net/NoRouteToHostException
    //   4901	4907	4983	java/io/IOException
    //   4937	4942	5134	java/io/IOException
    //   4942	4947	5153	java/io/IOException
    //   4041	4047	5172	java/io/IOException
    //   4077	4082	5323	java/io/IOException
    //   4087	4092	5342	java/io/IOException
    //   4731	4737	5361	java/io/IOException
    //   4767	4772	5512	java/io/IOException
    //   4777	4782	5531	java/io/IOException
    //   884	923	5550	java/net/UnknownServiceException
    //   1151	1165	5550	java/net/UnknownServiceException
    //   5674	5680	5761	java/io/IOException
    //   5710	5715	5912	java/io/IOException
    //   5720	5725	5931	java/io/IOException
    //   884	923	5950	java/io/IOException
    //   1151	1165	5950	java/io/IOException
    //   6074	6080	6161	java/io/IOException
    //   6110	6115	6312	java/io/IOException
    //   6120	6125	6331	java/io/IOException
    //   884	923	6350	java/lang/Exception
    //   1151	1165	6350	java/lang/Exception
    //   6470	6476	6557	java/io/IOException
    //   6506	6511	6708	java/io/IOException
    //   6516	6521	6727	java/io/IOException
    //   884	923	6746	finally
    //   1151	1165	6746	finally
    //   6775	6781	6855	java/io/IOException
    //   6811	6816	7006	java/io/IOException
    //   6821	6826	7025	java/io/IOException
    //   1165	1207	7044	finally
    //   1214	1279	7044	finally
    //   1284	1292	7044	finally
    //   1292	1328	7044	finally
    //   1328	1382	7044	finally
    //   1436	1442	7052	finally
    //   1510	1514	7052	finally
    //   1568	1587	7052	finally
    //   1641	1646	7052	finally
    //   1700	1705	7052	finally
    //   2022	2041	7052	finally
    //   2095	2127	7052	finally
    //   2181	2191	7052	finally
    //   2245	2262	7052	finally
    //   2316	2322	7052	finally
    //   2376	2386	7052	finally
    //   2440	2453	7052	finally
    //   2507	2518	7052	finally
    //   2572	2577	7052	finally
    //   2631	2640	7052	finally
    //   2694	2700	7052	finally
    //   2754	2763	7052	finally
    //   2817	2827	7052	finally
    //   2881	2909	7052	finally
    //   2963	2978	7052	finally
    //   3037	3044	7052	finally
    //   3098	3108	7052	finally
    //   3162	3169	7052	finally
    //   3223	3237	7052	finally
    //   3291	3316	7052	finally
    //   3375	3383	7052	finally
    //   3452	3479	7052	finally
    //   3533	3540	7052	finally
    //   3594	3600	7052	finally
    //   3654	3661	7052	finally
    //   4197	4205	7052	finally
    //   4259	4265	7052	finally
    //   4638	4660	7052	finally
    //   4679	4686	7052	finally
    //   4705	4710	7052	finally
    //   5581	5603	7052	finally
    //   5622	5629	7052	finally
    //   5648	5653	7052	finally
    //   5981	6003	7052	finally
    //   6022	6029	7052	finally
    //   6048	6053	7052	finally
    //   6377	6399	7052	finally
    //   6418	6425	7052	finally
    //   6444	6449	7052	finally
    //   3679	3686	7072	finally
    //   3704	3711	7072	finally
    //   3729	3737	7072	finally
    //   3759	3768	7072	finally
    //   3798	3826	7072	finally
    //   3850	3857	7072	finally
    //   3881	3890	7072	finally
    //   3914	3923	7072	finally
    //   3959	3971	7072	finally
    //   4561	4570	7072	finally
    //   4594	4603	7072	finally
    //   4836	4880	7072	finally
    //   3986	4020	7088	finally
    //   1165	1207	7093	java/lang/Exception
    //   1214	1279	7093	java/lang/Exception
    //   1284	1292	7093	java/lang/Exception
    //   1292	1328	7093	java/lang/Exception
    //   1328	1382	7093	java/lang/Exception
    //   1436	1442	7101	java/lang/Exception
    //   1510	1514	7101	java/lang/Exception
    //   1568	1587	7101	java/lang/Exception
    //   1641	1646	7101	java/lang/Exception
    //   1700	1705	7101	java/lang/Exception
    //   2022	2041	7101	java/lang/Exception
    //   2095	2127	7101	java/lang/Exception
    //   2181	2191	7101	java/lang/Exception
    //   2245	2262	7101	java/lang/Exception
    //   2316	2322	7101	java/lang/Exception
    //   2376	2386	7101	java/lang/Exception
    //   2440	2453	7101	java/lang/Exception
    //   2507	2518	7101	java/lang/Exception
    //   2572	2577	7101	java/lang/Exception
    //   2631	2640	7101	java/lang/Exception
    //   2694	2700	7101	java/lang/Exception
    //   2754	2763	7101	java/lang/Exception
    //   2817	2827	7101	java/lang/Exception
    //   2881	2909	7101	java/lang/Exception
    //   2963	2978	7101	java/lang/Exception
    //   3037	3044	7101	java/lang/Exception
    //   3098	3108	7101	java/lang/Exception
    //   3162	3169	7101	java/lang/Exception
    //   3223	3237	7101	java/lang/Exception
    //   3291	3316	7101	java/lang/Exception
    //   3375	3383	7101	java/lang/Exception
    //   3452	3479	7101	java/lang/Exception
    //   3533	3540	7101	java/lang/Exception
    //   3594	3600	7101	java/lang/Exception
    //   3654	3661	7101	java/lang/Exception
    //   4197	4205	7101	java/lang/Exception
    //   4259	4265	7101	java/lang/Exception
    //   3679	3686	7113	java/lang/Exception
    //   3704	3711	7113	java/lang/Exception
    //   3729	3737	7113	java/lang/Exception
    //   3759	3768	7113	java/lang/Exception
    //   3798	3826	7113	java/lang/Exception
    //   3850	3857	7113	java/lang/Exception
    //   3881	3890	7113	java/lang/Exception
    //   3914	3923	7113	java/lang/Exception
    //   3959	3971	7113	java/lang/Exception
    //   4561	4570	7113	java/lang/Exception
    //   4594	4603	7113	java/lang/Exception
    //   4836	4880	7113	java/lang/Exception
    //   1165	1207	7129	java/io/IOException
    //   1214	1279	7129	java/io/IOException
    //   1284	1292	7129	java/io/IOException
    //   1292	1328	7129	java/io/IOException
    //   1328	1382	7129	java/io/IOException
    //   1436	1442	7141	java/io/IOException
    //   1510	1514	7141	java/io/IOException
    //   1568	1587	7141	java/io/IOException
    //   1641	1646	7141	java/io/IOException
    //   1700	1705	7141	java/io/IOException
    //   2022	2041	7141	java/io/IOException
    //   2095	2127	7141	java/io/IOException
    //   2181	2191	7141	java/io/IOException
    //   2245	2262	7141	java/io/IOException
    //   2316	2322	7141	java/io/IOException
    //   2376	2386	7141	java/io/IOException
    //   2440	2453	7141	java/io/IOException
    //   2507	2518	7141	java/io/IOException
    //   2572	2577	7141	java/io/IOException
    //   2631	2640	7141	java/io/IOException
    //   2694	2700	7141	java/io/IOException
    //   2754	2763	7141	java/io/IOException
    //   2817	2827	7141	java/io/IOException
    //   2881	2909	7141	java/io/IOException
    //   2963	2978	7141	java/io/IOException
    //   3037	3044	7141	java/io/IOException
    //   3098	3108	7141	java/io/IOException
    //   3162	3169	7141	java/io/IOException
    //   3223	3237	7141	java/io/IOException
    //   3291	3316	7141	java/io/IOException
    //   3375	3383	7141	java/io/IOException
    //   3452	3479	7141	java/io/IOException
    //   3533	3540	7141	java/io/IOException
    //   3594	3600	7141	java/io/IOException
    //   3654	3661	7141	java/io/IOException
    //   4197	4205	7141	java/io/IOException
    //   4259	4265	7141	java/io/IOException
    //   3679	3686	7157	java/io/IOException
    //   3704	3711	7157	java/io/IOException
    //   3729	3737	7157	java/io/IOException
    //   3759	3768	7157	java/io/IOException
    //   3798	3826	7157	java/io/IOException
    //   3850	3857	7157	java/io/IOException
    //   3881	3890	7157	java/io/IOException
    //   3914	3923	7157	java/io/IOException
    //   3959	3971	7157	java/io/IOException
    //   4561	4570	7157	java/io/IOException
    //   4594	4603	7157	java/io/IOException
    //   4836	4880	7157	java/io/IOException
    //   1165	1207	7173	java/net/UnknownServiceException
    //   1214	1279	7173	java/net/UnknownServiceException
    //   1284	1292	7173	java/net/UnknownServiceException
    //   1292	1328	7173	java/net/UnknownServiceException
    //   1328	1382	7173	java/net/UnknownServiceException
    //   1436	1442	7185	java/net/UnknownServiceException
    //   1510	1514	7185	java/net/UnknownServiceException
    //   1568	1587	7185	java/net/UnknownServiceException
    //   1641	1646	7185	java/net/UnknownServiceException
    //   1700	1705	7185	java/net/UnknownServiceException
    //   2022	2041	7185	java/net/UnknownServiceException
    //   2095	2127	7185	java/net/UnknownServiceException
    //   2181	2191	7185	java/net/UnknownServiceException
    //   2245	2262	7185	java/net/UnknownServiceException
    //   2316	2322	7185	java/net/UnknownServiceException
    //   2376	2386	7185	java/net/UnknownServiceException
    //   2440	2453	7185	java/net/UnknownServiceException
    //   2507	2518	7185	java/net/UnknownServiceException
    //   2572	2577	7185	java/net/UnknownServiceException
    //   2631	2640	7185	java/net/UnknownServiceException
    //   2694	2700	7185	java/net/UnknownServiceException
    //   2754	2763	7185	java/net/UnknownServiceException
    //   2817	2827	7185	java/net/UnknownServiceException
    //   2881	2909	7185	java/net/UnknownServiceException
    //   2963	2978	7185	java/net/UnknownServiceException
    //   3037	3044	7185	java/net/UnknownServiceException
    //   3098	3108	7185	java/net/UnknownServiceException
    //   3162	3169	7185	java/net/UnknownServiceException
    //   3223	3237	7185	java/net/UnknownServiceException
    //   3291	3316	7185	java/net/UnknownServiceException
    //   3375	3383	7185	java/net/UnknownServiceException
    //   3452	3479	7185	java/net/UnknownServiceException
    //   3533	3540	7185	java/net/UnknownServiceException
    //   3594	3600	7185	java/net/UnknownServiceException
    //   3654	3661	7185	java/net/UnknownServiceException
    //   4197	4205	7185	java/net/UnknownServiceException
    //   4259	4265	7185	java/net/UnknownServiceException
    //   3679	3686	7201	java/net/UnknownServiceException
    //   3704	3711	7201	java/net/UnknownServiceException
    //   3729	3737	7201	java/net/UnknownServiceException
    //   3759	3768	7201	java/net/UnknownServiceException
    //   3798	3826	7201	java/net/UnknownServiceException
    //   3850	3857	7201	java/net/UnknownServiceException
    //   3881	3890	7201	java/net/UnknownServiceException
    //   3914	3923	7201	java/net/UnknownServiceException
    //   3959	3971	7201	java/net/UnknownServiceException
    //   4561	4570	7201	java/net/UnknownServiceException
    //   4594	4603	7201	java/net/UnknownServiceException
    //   4836	4880	7201	java/net/UnknownServiceException
    //   884	923	7217	java/net/NoRouteToHostException
    //   1151	1165	7217	java/net/NoRouteToHostException
    //   1165	1207	7232	java/net/NoRouteToHostException
    //   1214	1279	7232	java/net/NoRouteToHostException
    //   1284	1292	7232	java/net/NoRouteToHostException
    //   1292	1328	7232	java/net/NoRouteToHostException
    //   1328	1382	7232	java/net/NoRouteToHostException
    //   1436	1442	7244	java/net/NoRouteToHostException
    //   1510	1514	7244	java/net/NoRouteToHostException
    //   1568	1587	7244	java/net/NoRouteToHostException
    //   1641	1646	7244	java/net/NoRouteToHostException
    //   1700	1705	7244	java/net/NoRouteToHostException
    //   2022	2041	7244	java/net/NoRouteToHostException
    //   2095	2127	7244	java/net/NoRouteToHostException
    //   2181	2191	7244	java/net/NoRouteToHostException
    //   2245	2262	7244	java/net/NoRouteToHostException
    //   2316	2322	7244	java/net/NoRouteToHostException
    //   2376	2386	7244	java/net/NoRouteToHostException
    //   2440	2453	7244	java/net/NoRouteToHostException
    //   2507	2518	7244	java/net/NoRouteToHostException
    //   2572	2577	7244	java/net/NoRouteToHostException
    //   2631	2640	7244	java/net/NoRouteToHostException
    //   2694	2700	7244	java/net/NoRouteToHostException
    //   2754	2763	7244	java/net/NoRouteToHostException
    //   2817	2827	7244	java/net/NoRouteToHostException
    //   2881	2909	7244	java/net/NoRouteToHostException
    //   2963	2978	7244	java/net/NoRouteToHostException
    //   3037	3044	7244	java/net/NoRouteToHostException
    //   3098	3108	7244	java/net/NoRouteToHostException
    //   3162	3169	7244	java/net/NoRouteToHostException
    //   3223	3237	7244	java/net/NoRouteToHostException
    //   3291	3316	7244	java/net/NoRouteToHostException
    //   3375	3383	7244	java/net/NoRouteToHostException
    //   3452	3479	7244	java/net/NoRouteToHostException
    //   3533	3540	7244	java/net/NoRouteToHostException
    //   3594	3600	7244	java/net/NoRouteToHostException
    //   3654	3661	7244	java/net/NoRouteToHostException
    //   4197	4205	7244	java/net/NoRouteToHostException
    //   4259	4265	7244	java/net/NoRouteToHostException
    //   884	923	7260	java/net/ProtocolException
    //   1151	1165	7260	java/net/ProtocolException
    //   1165	1207	7274	java/net/ProtocolException
    //   1214	1279	7274	java/net/ProtocolException
    //   1284	1292	7274	java/net/ProtocolException
    //   1292	1328	7274	java/net/ProtocolException
    //   1328	1382	7274	java/net/ProtocolException
    //   1436	1442	7285	java/net/ProtocolException
    //   1510	1514	7285	java/net/ProtocolException
    //   1568	1587	7285	java/net/ProtocolException
    //   1641	1646	7285	java/net/ProtocolException
    //   1700	1705	7285	java/net/ProtocolException
    //   2022	2041	7285	java/net/ProtocolException
    //   2095	2127	7285	java/net/ProtocolException
    //   2181	2191	7285	java/net/ProtocolException
    //   2245	2262	7285	java/net/ProtocolException
    //   2316	2322	7285	java/net/ProtocolException
    //   2376	2386	7285	java/net/ProtocolException
    //   2440	2453	7285	java/net/ProtocolException
    //   2507	2518	7285	java/net/ProtocolException
    //   2572	2577	7285	java/net/ProtocolException
    //   2631	2640	7285	java/net/ProtocolException
    //   2694	2700	7285	java/net/ProtocolException
    //   2754	2763	7285	java/net/ProtocolException
    //   2817	2827	7285	java/net/ProtocolException
    //   2881	2909	7285	java/net/ProtocolException
    //   2963	2978	7285	java/net/ProtocolException
    //   3037	3044	7285	java/net/ProtocolException
    //   3098	3108	7285	java/net/ProtocolException
    //   3162	3169	7285	java/net/ProtocolException
    //   3223	3237	7285	java/net/ProtocolException
    //   3291	3316	7285	java/net/ProtocolException
    //   3375	3383	7285	java/net/ProtocolException
    //   3452	3479	7285	java/net/ProtocolException
    //   3533	3540	7285	java/net/ProtocolException
    //   3594	3600	7285	java/net/ProtocolException
    //   3654	3661	7285	java/net/ProtocolException
    //   4197	4205	7285	java/net/ProtocolException
    //   4259	4265	7285	java/net/ProtocolException
  }
  
  public final void start()
  {
    GMTrace.i(4844723109888L, 36096);
    if (!this.isStop)
    {
      GMTrace.o(4844723109888L, 36096);
      return;
    }
    this.isStop = false;
    e.post(this, "music_download_thread");
    GMTrace.o(4844723109888L, 36096);
  }
  
  private final class a
    implements Runnable
  {
    int action;
    
    a(int paramInt)
    {
      GMTrace.i(4844454674432L, 36094);
      this.action = paramInt;
      GMTrace.o(4844454674432L, 36094);
    }
    
    public final void run()
    {
      GMTrace.i(4844320456704L, 36093);
      if (a.this.nrq != null) {
        a.this.nrq.ry(this.action);
      }
      GMTrace.o(4844320456704L, 36093);
    }
  }
  
  public static abstract interface b
  {
    public abstract void ry(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */