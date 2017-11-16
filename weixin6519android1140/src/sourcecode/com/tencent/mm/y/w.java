package com.tencent.mm.y;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.n.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class w
{
  private a gmK;
  public boolean gmL;
  public BlockingQueue<c> gmM;
  public b gmN;
  ae handler;
  
  public w(boolean paramBoolean)
  {
    GMTrace.i(694174089216L, 5172);
    this.gmK = null;
    this.gmL = false;
    this.gmM = new ArrayBlockingQueue(80);
    this.gmN = null;
    h.xz();
    this.handler = new ae(h.xB().ngv.getLooper())
    {
      public final void handleMessage(final Message paramAnonymousMessage)
      {
        GMTrace.i(630420668416L, 4697);
        for (;;)
        {
          try
          {
            Bitmap localBitmap;
            if (w.this.gmN != null)
            {
              paramAnonymousMessage = (w.c)paramAnonymousMessage.obj;
              if ((paramAnonymousMessage.gmS) && (p.Jh()))
              {
                String str = p.kq(paramAnonymousMessage.url);
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetPicService", "convert webp, originPicFormat:%s, file:%s, url:%s", new Object[] { str, paramAnonymousMessage.filename, paramAnonymousMessage.url });
                localBitmap = d.RD(paramAnonymousMessage.filename);
                if (localBitmap == null) {
                  break label239;
                }
                if (!bg.nm(str))
                {
                  if (!str.toLowerCase().contains("png")) {
                    continue;
                  }
                  com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetPicService", "convert webp to png");
                  d.a(localBitmap, 100, Bitmap.CompressFormat.PNG, paramAnonymousMessage.filename, true);
                }
              }
              int i = com.tencent.mm.a.e.aY(paramAnonymousMessage.filename);
              if ((i > 0) && (h.xw().wL())) {
                ak.a.gmY.aI(i, 0);
              }
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(598342631424L, 4458);
                  if (w.this.gmN != null) {
                    w.this.gmN.c(paramAnonymousMessage.url, paramAnonymousMessage.filename, paramAnonymousMessage.pos);
                  }
                  GMTrace.o(598342631424L, 4458);
                }
              });
            }
            else
            {
              GMTrace.o(630420668416L, 4697);
              return;
            }
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetPicService", "convert webp to jpg");
            d.a(localBitmap, 100, Bitmap.CompressFormat.JPEG, paramAnonymousMessage.filename, true);
            continue;
            com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetPicService", "decode webp picture failed");
          }
          catch (Exception paramAnonymousMessage)
          {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GetPicService", "exception:%s", new Object[] { bg.f(paramAnonymousMessage) });
            GMTrace.o(630420668416L, 4697);
            return;
          }
          label239:
          w.this.e(14L, 1L);
        }
      }
    };
    this.gmK = null;
    this.gmL = paramBoolean;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetPicService", "getPicService, isFromWebView:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    GMTrace.o(694174089216L, 5172);
  }
  
  public final void Ax()
  {
    GMTrace.i(694308306944L, 5173);
    if (this.gmK != null) {
      this.gmK.gmR = true;
    }
    this.gmK = null;
    GMTrace.o(694308306944L, 5173);
  }
  
  public final String c(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    GMTrace.i(694442524672L, 5174);
    Object localObject;
    if (paramString1 == null) {
      localObject = null;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetPicService", "getPicfileByUrl type:" + paramInt1 + " url:" + paramString1);
      try
      {
        boolean bool = com.tencent.mm.a.e.aZ((String)localObject);
        if (!bool) {
          break;
        }
        GMTrace.o(694442524672L, 5174);
        return (String)localObject;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GetPicService", "exception:%s", new Object[] { bg.f(localException) });
      }
      if (!h.xw().wL())
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GetPicService", "genFileName, account not ready");
        localObject = new File(h.xy().fYT + "/imagecache");
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdirs();
        }
        localObject = ((File)localObject).getAbsolutePath() + "/reader_" + paramInt1 + "_" + com.tencent.mm.a.g.n(paramString1.getBytes()) + ".jpg";
      }
      else
      {
        localObject = b.yU() + "/reader_" + paramInt1 + "_" + com.tencent.mm.a.g.n(paramString1.getBytes()) + ".jpg";
      }
    }
    try
    {
      this.gmM.add(new c(paramString1, (String)localObject, paramInt2, paramString2));
      if ((this.gmK == null) || (!com.tencent.mm.sdk.f.e.Q(this.gmK)))
      {
        com.tencent.mm.sdk.f.e.remove(this.gmK);
        this.gmK = new a();
        com.tencent.mm.sdk.f.e.post(this.gmK, "GetPicService_getPic");
      }
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GetPicService", "exception:%s", new Object[] { bg.f(paramString1) });
      }
    }
    GMTrace.o(694442524672L, 5174);
    return null;
  }
  
  public final void e(long paramLong1, long paramLong2)
  {
    GMTrace.i(16010430119936L, 119287);
    if (this.gmL)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetPicService", "doIdKeyStat, key:%d, val:%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
      com.tencent.mm.plugin.report.service.g.ork.a(86L, paramLong1, paramLong2, false);
    }
    GMTrace.o(16010430119936L, 119287);
  }
  
  final class a
    implements Runnable
  {
    boolean gmR;
    
    a()
    {
      GMTrace.i(599819026432L, 4469);
      this.gmR = true;
      GMTrace.o(599819026432L, 4469);
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 11
      //   3: ldc2_w 38
      //   6: sipush 4470
      //   9: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   12: aload_0
      //   13: iconst_0
      //   14: putfield 30	com/tencent/mm/y/w$a:gmR	Z
      //   17: iconst_0
      //   18: istore_1
      //   19: aload_0
      //   20: getfield 30	com/tencent/mm/y/w$a:gmR	Z
      //   23: ifne +1367 -> 1390
      //   26: iload_1
      //   27: bipush 10
      //   29: if_icmple +18 -> 47
      //   32: aload_0
      //   33: iconst_1
      //   34: putfield 30	com/tencent/mm/y/w$a:gmR	Z
      //   37: ldc2_w 38
      //   40: sipush 4470
      //   43: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   46: return
      //   47: aload_0
      //   48: getfield 17	com/tencent/mm/y/w$a:gmO	Lcom/tencent/mm/y/w;
      //   51: getfield 43	com/tencent/mm/y/w:gmM	Ljava/util/concurrent/BlockingQueue;
      //   54: ldc2_w 44
      //   57: getstatic 51	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
      //   60: invokeinterface 57 4 0
      //   65: checkcast 59	com/tencent/mm/y/w$c
      //   68: astore 5
      //   70: aload 5
      //   72: ifnull +16 -> 88
      //   75: aload 5
      //   77: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   80: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   83: istore_2
      //   84: iload_2
      //   85: ifeq +10 -> 95
      //   88: iload_1
      //   89: iconst_1
      //   90: iadd
      //   91: istore_1
      //   92: goto -73 -> 19
      //   95: ldc 71
      //   97: new 73	java/lang/StringBuilder
      //   100: dup
      //   101: ldc 75
      //   103: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   106: aload 5
      //   108: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   111: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   114: ldc 84
      //   116: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   119: aload 5
      //   121: getfield 87	com/tencent/mm/y/w$c:filename	Ljava/lang/String;
      //   124: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   127: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   130: invokestatic 97	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   133: aload 5
      //   135: getfield 87	com/tencent/mm/y/w$c:filename	Ljava/lang/String;
      //   138: invokestatic 102	com/tencent/mm/a/e:aZ	(Ljava/lang/String;)Z
      //   141: ifeq +33 -> 174
      //   144: ldc 71
      //   146: new 73	java/lang/StringBuilder
      //   149: dup
      //   150: ldc 104
      //   152: invokespecial 78	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   155: aload 5
      //   157: getfield 87	com/tencent/mm/y/w$c:filename	Ljava/lang/String;
      //   160: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   163: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   166: invokestatic 97	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   169: iconst_0
      //   170: istore_1
      //   171: goto -152 -> 19
      //   174: aload_0
      //   175: getfield 17	com/tencent/mm/y/w$a:gmO	Lcom/tencent/mm/y/w;
      //   178: lconst_0
      //   179: lconst_1
      //   180: invokevirtual 108	com/tencent/mm/y/w:e	(JJ)V
      //   183: invokestatic 112	com/tencent/mm/sdk/platformtools/bg:Pv	()J
      //   186: lstore_3
      //   187: ldc 71
      //   189: ldc 114
      //   191: iconst_1
      //   192: anewarray 4	java/lang/Object
      //   195: dup
      //   196: iconst_0
      //   197: aload 5
      //   199: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   202: aastore
      //   203: invokestatic 117	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   206: aload 5
      //   208: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   211: invokestatic 122	android/webkit/URLUtil:isHttpsUrl	(Ljava/lang/String;)Z
      //   214: ifeq +766 -> 980
      //   217: aload 5
      //   219: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   222: invokestatic 128	com/tencent/mm/network/b:mX	(Ljava/lang/String;)Lcom/tencent/mm/network/v;
      //   225: astore 10
      //   227: invokestatic 134	com/tencent/mm/ao/p:Jh	()Z
      //   230: ifeq +50 -> 280
      //   233: aload 5
      //   235: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   238: invokestatic 137	com/tencent/mm/ao/p:kp	(Ljava/lang/String;)Z
      //   241: ifeq +39 -> 280
      //   244: getstatic 143	com/tencent/mm/protocal/d:tJC	I
      //   247: invokestatic 147	com/tencent/mm/ao/p:gz	(I)Ljava/lang/String;
      //   250: astore 6
      //   252: ldc 71
      //   254: ldc -107
      //   256: iconst_1
      //   257: anewarray 4	java/lang/Object
      //   260: dup
      //   261: iconst_0
      //   262: aload 6
      //   264: aastore
      //   265: invokestatic 117	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   268: aload 10
      //   270: getfield 155	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
      //   273: ldc -99
      //   275: aload 6
      //   277: invokevirtual 162	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   280: ldc 71
      //   282: ldc -92
      //   284: iconst_2
      //   285: anewarray 4	java/lang/Object
      //   288: dup
      //   289: iconst_0
      //   290: aload 5
      //   292: getfield 167	com/tencent/mm/y/w$c:gmT	Ljava/lang/String;
      //   295: aastore
      //   296: dup
      //   297: iconst_1
      //   298: aload 5
      //   300: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   303: aastore
      //   304: invokestatic 169	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   307: aload 5
      //   309: getfield 167	com/tencent/mm/y/w$c:gmT	Ljava/lang/String;
      //   312: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   315: ifne +22 -> 337
      //   318: aload 5
      //   320: getfield 167	com/tencent/mm/y/w$c:gmT	Ljava/lang/String;
      //   323: astore 6
      //   325: aload 10
      //   327: getfield 155	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
      //   330: ldc -85
      //   332: aload 6
      //   334: invokevirtual 162	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   337: aload 10
      //   339: getfield 155	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
      //   342: iconst_1
      //   343: invokevirtual 175	javax/net/ssl/HttpsURLConnection:setUseCaches	(Z)V
      //   346: aload 10
      //   348: getfield 155	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
      //   351: sipush 3000
      //   354: invokevirtual 179	javax/net/ssl/HttpsURLConnection:setConnectTimeout	(I)V
      //   357: aload 10
      //   359: getfield 155	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
      //   362: sipush 3000
      //   365: invokevirtual 182	javax/net/ssl/HttpsURLConnection:setReadTimeout	(I)V
      //   368: aload 10
      //   370: getfield 155	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
      //   373: invokevirtual 186	javax/net/ssl/HttpsURLConnection:getInputStream	()Ljava/io/InputStream;
      //   376: astore 6
      //   378: aload 6
      //   380: astore 7
      //   382: aload 6
      //   384: astore 8
      //   386: sipush 1024
      //   389: newarray <illegal type>
      //   391: astore 12
      //   393: aload 6
      //   395: astore 7
      //   397: aload 6
      //   399: astore 8
      //   401: new 188	java/io/FileOutputStream
      //   404: dup
      //   405: new 73	java/lang/StringBuilder
      //   408: dup
      //   409: invokespecial 189	java/lang/StringBuilder:<init>	()V
      //   412: aload 5
      //   414: getfield 87	com/tencent/mm/y/w$c:filename	Ljava/lang/String;
      //   417: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   420: ldc -65
      //   422: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   425: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   428: invokespecial 192	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
      //   431: astore 9
      //   433: aload 6
      //   435: astore 8
      //   437: aload 9
      //   439: astore 7
      //   441: aload 6
      //   443: aload 12
      //   445: invokevirtual 198	java/io/InputStream:read	([B)I
      //   448: istore_1
      //   449: iload_1
      //   450: iconst_m1
      //   451: if_icmpeq +127 -> 578
      //   454: aload 6
      //   456: astore 8
      //   458: aload 9
      //   460: astore 7
      //   462: aload 9
      //   464: aload 12
      //   466: iconst_0
      //   467: iload_1
      //   468: invokevirtual 204	java/io/OutputStream:write	([BII)V
      //   471: goto -38 -> 433
      //   474: astore 10
      //   476: aload 6
      //   478: astore 7
      //   480: aload 5
      //   482: astore 8
      //   484: iconst_0
      //   485: istore_1
      //   486: aload 9
      //   488: astore 6
      //   490: aload 7
      //   492: astore 5
      //   494: aload 10
      //   496: astore 7
      //   498: ldc 71
      //   500: ldc -50
      //   502: iconst_1
      //   503: anewarray 4	java/lang/Object
      //   506: dup
      //   507: iconst_0
      //   508: aload 7
      //   510: invokestatic 210	com/tencent/mm/sdk/platformtools/bg:f	(Ljava/lang/Throwable;)Ljava/lang/String;
      //   513: aastore
      //   514: invokestatic 212	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   517: aload_0
      //   518: getfield 17	com/tencent/mm/y/w$a:gmO	Lcom/tencent/mm/y/w;
      //   521: ldc2_w 213
      //   524: lconst_1
      //   525: invokevirtual 108	com/tencent/mm/y/w:e	(JJ)V
      //   528: aload 8
      //   530: ifnull +25 -> 555
      //   533: aload 8
      //   535: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   538: invokestatic 137	com/tencent/mm/ao/p:kp	(Ljava/lang/String;)Z
      //   541: ifeq +14 -> 555
      //   544: aload_0
      //   545: getfield 17	com/tencent/mm/y/w$a:gmO	Lcom/tencent/mm/y/w;
      //   548: ldc2_w 215
      //   551: lconst_1
      //   552: invokevirtual 108	com/tencent/mm/y/w:e	(JJ)V
      //   555: aload 6
      //   557: ifnull +8 -> 565
      //   560: aload 6
      //   562: invokevirtual 219	java/io/OutputStream:close	()V
      //   565: aload 5
      //   567: ifnull +8 -> 575
      //   570: aload 5
      //   572: invokevirtual 220	java/io/InputStream:close	()V
      //   575: goto -556 -> 19
      //   578: aload 6
      //   580: astore 8
      //   582: aload 9
      //   584: astore 7
      //   586: new 222	java/io/File
      //   589: dup
      //   590: new 73	java/lang/StringBuilder
      //   593: dup
      //   594: invokespecial 189	java/lang/StringBuilder:<init>	()V
      //   597: aload 5
      //   599: getfield 87	com/tencent/mm/y/w$c:filename	Ljava/lang/String;
      //   602: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   605: ldc -65
      //   607: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   610: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   613: invokespecial 223	java/io/File:<init>	(Ljava/lang/String;)V
      //   616: new 222	java/io/File
      //   619: dup
      //   620: aload 5
      //   622: getfield 87	com/tencent/mm/y/w$c:filename	Ljava/lang/String;
      //   625: invokespecial 223	java/io/File:<init>	(Ljava/lang/String;)V
      //   628: invokevirtual 227	java/io/File:renameTo	(Ljava/io/File;)Z
      //   631: pop
      //   632: aload 6
      //   634: astore 8
      //   636: aload 9
      //   638: astore 7
      //   640: aload 10
      //   642: getfield 155	com/tencent/mm/network/v:hhk	Ljavax/net/ssl/HttpsURLConnection;
      //   645: invokevirtual 230	javax/net/ssl/HttpsURLConnection:getContentType	()Ljava/lang/String;
      //   648: astore 10
      //   650: aload 6
      //   652: astore 8
      //   654: aload 9
      //   656: astore 7
      //   658: ldc 71
      //   660: ldc -24
      //   662: iconst_1
      //   663: anewarray 4	java/lang/Object
      //   666: dup
      //   667: iconst_0
      //   668: aload 10
      //   670: aastore
      //   671: invokestatic 117	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   674: aload 6
      //   676: astore 8
      //   678: aload 9
      //   680: astore 7
      //   682: invokestatic 134	com/tencent/mm/ao/p:Jh	()Z
      //   685: ifeq +657 -> 1342
      //   688: aload 6
      //   690: astore 8
      //   692: aload 9
      //   694: astore 7
      //   696: aload 5
      //   698: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   701: invokestatic 137	com/tencent/mm/ao/p:kp	(Ljava/lang/String;)Z
      //   704: ifeq +638 -> 1342
      //   707: aload 6
      //   709: astore 8
      //   711: aload 9
      //   713: astore 7
      //   715: aload 10
      //   717: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   720: ifne +622 -> 1342
      //   723: aload 6
      //   725: astore 8
      //   727: aload 9
      //   729: astore 7
      //   731: aload 10
      //   733: ldc -22
      //   735: invokevirtual 240	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   738: ifeq +604 -> 1342
      //   741: aload 6
      //   743: astore 8
      //   745: aload 9
      //   747: astore 7
      //   749: ldc 71
      //   751: ldc -14
      //   753: invokestatic 97	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   756: aload 6
      //   758: astore 8
      //   760: aload 9
      //   762: astore 7
      //   764: aload 5
      //   766: iconst_1
      //   767: putfield 245	com/tencent/mm/y/w$c:gmS	Z
      //   770: aload 6
      //   772: astore 8
      //   774: aload 9
      //   776: astore 7
      //   778: aload_0
      //   779: getfield 17	com/tencent/mm/y/w$a:gmO	Lcom/tencent/mm/y/w;
      //   782: ldc2_w 246
      //   785: lconst_1
      //   786: invokevirtual 108	com/tencent/mm/y/w:e	(JJ)V
      //   789: aload 6
      //   791: astore 8
      //   793: aload 9
      //   795: astore 7
      //   797: new 249	android/os/Message
      //   800: dup
      //   801: invokespecial 250	android/os/Message:<init>	()V
      //   804: astore 10
      //   806: aload 6
      //   808: astore 8
      //   810: aload 9
      //   812: astore 7
      //   814: aload 10
      //   816: aload 5
      //   818: putfield 254	android/os/Message:obj	Ljava/lang/Object;
      //   821: aload 6
      //   823: astore 8
      //   825: aload 9
      //   827: astore 7
      //   829: aload 10
      //   831: aload 5
      //   833: getfield 257	com/tencent/mm/y/w$c:pos	I
      //   836: putfield 260	android/os/Message:arg1	I
      //   839: aload 6
      //   841: astore 8
      //   843: aload 9
      //   845: astore 7
      //   847: aload_0
      //   848: getfield 17	com/tencent/mm/y/w$a:gmO	Lcom/tencent/mm/y/w;
      //   851: getfield 264	com/tencent/mm/y/w:handler	Lcom/tencent/mm/sdk/platformtools/ae;
      //   854: aload 10
      //   856: invokevirtual 270	com/tencent/mm/sdk/platformtools/ae:sendMessage	(Landroid/os/Message;)Z
      //   859: pop
      //   860: aload 6
      //   862: astore 8
      //   864: aload 9
      //   866: astore 7
      //   868: invokestatic 112	com/tencent/mm/sdk/platformtools/bg:Pv	()J
      //   871: lload_3
      //   872: lsub
      //   873: lstore_3
      //   874: aload 6
      //   876: astore 8
      //   878: aload 9
      //   880: astore 7
      //   882: ldc 71
      //   884: ldc_w 272
      //   887: iconst_1
      //   888: anewarray 4	java/lang/Object
      //   891: dup
      //   892: iconst_0
      //   893: lload_3
      //   894: invokestatic 278	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   897: aastore
      //   898: invokestatic 117	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   901: aload 6
      //   903: astore 8
      //   905: aload 9
      //   907: astore 7
      //   909: aload_0
      //   910: getfield 17	com/tencent/mm/y/w$a:gmO	Lcom/tencent/mm/y/w;
      //   913: ldc2_w 279
      //   916: lload_3
      //   917: invokevirtual 108	com/tencent/mm/y/w:e	(JJ)V
      //   920: aload 5
      //   922: ifnull +38 -> 960
      //   925: aload 6
      //   927: astore 8
      //   929: aload 9
      //   931: astore 7
      //   933: aload 5
      //   935: getfield 245	com/tencent/mm/y/w$c:gmS	Z
      //   938: ifeq +22 -> 960
      //   941: aload 6
      //   943: astore 8
      //   945: aload 9
      //   947: astore 7
      //   949: aload_0
      //   950: getfield 17	com/tencent/mm/y/w$a:gmO	Lcom/tencent/mm/y/w;
      //   953: ldc2_w 281
      //   956: lload_3
      //   957: invokevirtual 108	com/tencent/mm/y/w:e	(JJ)V
      //   960: aload 9
      //   962: invokevirtual 219	java/io/OutputStream:close	()V
      //   965: aload 6
      //   967: ifnull +8 -> 975
      //   970: aload 6
      //   972: invokevirtual 220	java/io/InputStream:close	()V
      //   975: iconst_0
      //   976: istore_1
      //   977: goto -958 -> 19
      //   980: aload 5
      //   982: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   985: aconst_null
      //   986: invokestatic 285	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
      //   989: astore 10
      //   991: invokestatic 134	com/tencent/mm/ao/p:Jh	()Z
      //   994: ifeq +45 -> 1039
      //   997: aload 5
      //   999: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   1002: invokestatic 137	com/tencent/mm/ao/p:kp	(Ljava/lang/String;)Z
      //   1005: ifeq +34 -> 1039
      //   1008: getstatic 143	com/tencent/mm/protocal/d:tJC	I
      //   1011: invokestatic 147	com/tencent/mm/ao/p:gz	(I)Ljava/lang/String;
      //   1014: astore 6
      //   1016: ldc 71
      //   1018: ldc -107
      //   1020: iconst_1
      //   1021: anewarray 4	java/lang/Object
      //   1024: dup
      //   1025: iconst_0
      //   1026: aload 6
      //   1028: aastore
      //   1029: invokestatic 117	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1032: aload 10
      //   1034: aload 6
      //   1036: invokevirtual 290	com/tencent/mm/network/u:mY	(Ljava/lang/String;)V
      //   1039: ldc 71
      //   1041: ldc -92
      //   1043: iconst_2
      //   1044: anewarray 4	java/lang/Object
      //   1047: dup
      //   1048: iconst_0
      //   1049: aload 5
      //   1051: getfield 167	com/tencent/mm/y/w$c:gmT	Ljava/lang/String;
      //   1054: aastore
      //   1055: dup
      //   1056: iconst_1
      //   1057: aload 5
      //   1059: getfield 63	com/tencent/mm/y/w$c:url	Ljava/lang/String;
      //   1062: aastore
      //   1063: invokestatic 169	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1066: aload 5
      //   1068: getfield 167	com/tencent/mm/y/w$c:gmT	Ljava/lang/String;
      //   1071: invokestatic 69	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
      //   1074: ifne +15 -> 1089
      //   1077: aload 10
      //   1079: ldc -85
      //   1081: aload 5
      //   1083: getfield 167	com/tencent/mm/y/w$c:gmT	Ljava/lang/String;
      //   1086: invokevirtual 291	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
      //   1089: aload 10
      //   1091: iconst_1
      //   1092: invokevirtual 292	com/tencent/mm/network/u:setUseCaches	(Z)V
      //   1095: aload 10
      //   1097: sipush 3000
      //   1100: invokevirtual 293	com/tencent/mm/network/u:setConnectTimeout	(I)V
      //   1103: aload 10
      //   1105: sipush 3000
      //   1108: invokevirtual 294	com/tencent/mm/network/u:setReadTimeout	(I)V
      //   1111: aload 10
      //   1113: invokevirtual 295	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
      //   1116: astore 6
      //   1118: aload 6
      //   1120: astore 7
      //   1122: aload 6
      //   1124: astore 8
      //   1126: sipush 1024
      //   1129: newarray <illegal type>
      //   1131: astore 12
      //   1133: aload 6
      //   1135: astore 7
      //   1137: aload 6
      //   1139: astore 8
      //   1141: new 188	java/io/FileOutputStream
      //   1144: dup
      //   1145: new 73	java/lang/StringBuilder
      //   1148: dup
      //   1149: invokespecial 189	java/lang/StringBuilder:<init>	()V
      //   1152: aload 5
      //   1154: getfield 87	com/tencent/mm/y/w$c:filename	Ljava/lang/String;
      //   1157: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1160: ldc -65
      //   1162: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1165: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1168: invokespecial 192	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
      //   1171: astore 9
      //   1173: aload 6
      //   1175: astore 8
      //   1177: aload 9
      //   1179: astore 7
      //   1181: aload 6
      //   1183: aload 12
      //   1185: invokevirtual 198	java/io/InputStream:read	([B)I
      //   1188: istore_1
      //   1189: iload_1
      //   1190: iconst_m1
      //   1191: if_icmpeq +23 -> 1214
      //   1194: aload 6
      //   1196: astore 8
      //   1198: aload 9
      //   1200: astore 7
      //   1202: aload 9
      //   1204: aload 12
      //   1206: iconst_0
      //   1207: iload_1
      //   1208: invokevirtual 204	java/io/OutputStream:write	([BII)V
      //   1211: goto -38 -> 1173
      //   1214: aload 6
      //   1216: astore 8
      //   1218: aload 9
      //   1220: astore 7
      //   1222: new 222	java/io/File
      //   1225: dup
      //   1226: new 73	java/lang/StringBuilder
      //   1229: dup
      //   1230: invokespecial 189	java/lang/StringBuilder:<init>	()V
      //   1233: aload 5
      //   1235: getfield 87	com/tencent/mm/y/w$c:filename	Ljava/lang/String;
      //   1238: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1241: ldc -65
      //   1243: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1246: invokevirtual 91	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   1249: invokespecial 223	java/io/File:<init>	(Ljava/lang/String;)V
      //   1252: new 222	java/io/File
      //   1255: dup
      //   1256: aload 5
      //   1258: getfield 87	com/tencent/mm/y/w$c:filename	Ljava/lang/String;
      //   1261: invokespecial 223	java/io/File:<init>	(Ljava/lang/String;)V
      //   1264: invokevirtual 227	java/io/File:renameTo	(Ljava/io/File;)Z
      //   1267: pop
      //   1268: aload 6
      //   1270: astore 8
      //   1272: aload 9
      //   1274: astore 7
      //   1276: aload 10
      //   1278: getfield 299	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
      //   1281: invokevirtual 302	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
      //   1284: astore 10
      //   1286: aload 6
      //   1288: astore 8
      //   1290: aload 9
      //   1292: astore 7
      //   1294: ldc 71
      //   1296: ldc -24
      //   1298: iconst_1
      //   1299: anewarray 4	java/lang/Object
      //   1302: dup
      //   1303: iconst_0
      //   1304: aload 10
      //   1306: aastore
      //   1307: invokestatic 117	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1310: goto -636 -> 674
      //   1313: astore 5
      //   1315: aload 8
      //   1317: astore 6
      //   1319: aload 7
      //   1321: ifnull +8 -> 1329
      //   1324: aload 7
      //   1326: invokevirtual 219	java/io/OutputStream:close	()V
      //   1329: aload 6
      //   1331: ifnull +8 -> 1339
      //   1334: aload 6
      //   1336: invokevirtual 220	java/io/InputStream:close	()V
      //   1339: aload 5
      //   1341: athrow
      //   1342: aload 6
      //   1344: astore 8
      //   1346: aload 9
      //   1348: astore 7
      //   1350: aload 5
      //   1352: iconst_0
      //   1353: putfield 245	com/tencent/mm/y/w$c:gmS	Z
      //   1356: goto -567 -> 789
      //   1359: astore 7
      //   1361: iconst_0
      //   1362: istore_1
      //   1363: aload 5
      //   1365: astore 8
      //   1367: aload 6
      //   1369: astore 5
      //   1371: aload 9
      //   1373: astore 6
      //   1375: goto -877 -> 498
      //   1378: astore 5
      //   1380: iconst_0
      //   1381: istore_1
      //   1382: goto -1363 -> 19
      //   1385: astore 5
      //   1387: goto -1368 -> 19
      //   1390: ldc2_w 38
      //   1393: sipush 4470
      //   1396: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   1399: return
      //   1400: astore 6
      //   1402: goto -63 -> 1339
      //   1405: astore 5
      //   1407: aconst_null
      //   1408: astore 7
      //   1410: aload 11
      //   1412: astore 6
      //   1414: goto -95 -> 1319
      //   1417: astore 5
      //   1419: aconst_null
      //   1420: astore 8
      //   1422: aload 7
      //   1424: astore 6
      //   1426: aload 8
      //   1428: astore 7
      //   1430: goto -111 -> 1319
      //   1433: astore 9
      //   1435: aload 5
      //   1437: astore 7
      //   1439: aload 6
      //   1441: astore 8
      //   1443: aload 9
      //   1445: astore 5
      //   1447: aload 7
      //   1449: astore 6
      //   1451: aload 8
      //   1453: astore 7
      //   1455: goto -136 -> 1319
      //   1458: astore 7
      //   1460: aconst_null
      //   1461: astore 8
      //   1463: aconst_null
      //   1464: astore 5
      //   1466: aconst_null
      //   1467: astore 6
      //   1469: goto -971 -> 498
      //   1472: astore 7
      //   1474: aconst_null
      //   1475: astore 9
      //   1477: aconst_null
      //   1478: astore 6
      //   1480: aload 5
      //   1482: astore 8
      //   1484: aload 9
      //   1486: astore 5
      //   1488: goto -990 -> 498
      //   1491: astore 7
      //   1493: aconst_null
      //   1494: astore 9
      //   1496: aconst_null
      //   1497: astore 6
      //   1499: iconst_0
      //   1500: istore_1
      //   1501: aload 5
      //   1503: astore 8
      //   1505: aload 9
      //   1507: astore 5
      //   1509: goto -1011 -> 498
      //   1512: astore 7
      //   1514: aload 8
      //   1516: astore 6
      //   1518: aconst_null
      //   1519: astore 9
      //   1521: iconst_0
      //   1522: istore_1
      //   1523: aload 5
      //   1525: astore 8
      //   1527: aload 6
      //   1529: astore 5
      //   1531: aload 9
      //   1533: astore 6
      //   1535: goto -1037 -> 498
      //   1538: astore 7
      //   1540: iconst_0
      //   1541: istore_1
      //   1542: aload 5
      //   1544: astore 8
      //   1546: aload 6
      //   1548: astore 5
      //   1550: aload 9
      //   1552: astore 6
      //   1554: goto -1056 -> 498
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1557	0	this	a
      //   18	1524	1	i	int
      //   83	2	2	bool	boolean
      //   186	771	3	l	long
      //   68	1189	5	localObject1	Object
      //   1313	51	5	localObject2	Object
      //   1369	1	5	localObject3	Object
      //   1378	1	5	localException1	Exception
      //   1385	1	5	localException2	Exception
      //   1405	1	5	localObject4	Object
      //   1417	19	5	localObject5	Object
      //   1445	104	5	localObject6	Object
      //   250	1124	6	localObject7	Object
      //   1400	1	6	localException3	Exception
      //   1412	141	6	localObject8	Object
      //   380	969	7	localObject9	Object
      //   1359	1	7	localException4	Exception
      //   1408	46	7	localObject10	Object
      //   1458	1	7	localException5	Exception
      //   1472	1	7	localException6	Exception
      //   1491	1	7	localException7	Exception
      //   1512	1	7	localException8	Exception
      //   1538	1	7	localException9	Exception
      //   384	1161	8	localObject11	Object
      //   431	941	9	localFileOutputStream	java.io.FileOutputStream
      //   1433	11	9	localObject12	Object
      //   1475	76	9	localObject13	Object
      //   225	144	10	localv	com.tencent.mm.network.v
      //   474	167	10	localException10	Exception
      //   648	657	10	localObject14	Object
      //   1	1410	11	localObject15	Object
      //   391	814	12	arrayOfByte	byte[]
      // Exception table:
      //   from	to	target	type
      //   441	449	474	java/lang/Exception
      //   462	471	474	java/lang/Exception
      //   586	632	474	java/lang/Exception
      //   640	650	474	java/lang/Exception
      //   658	674	474	java/lang/Exception
      //   441	449	1313	finally
      //   462	471	1313	finally
      //   586	632	1313	finally
      //   640	650	1313	finally
      //   658	674	1313	finally
      //   682	688	1313	finally
      //   696	707	1313	finally
      //   715	723	1313	finally
      //   731	741	1313	finally
      //   749	756	1313	finally
      //   764	770	1313	finally
      //   778	789	1313	finally
      //   797	806	1313	finally
      //   814	821	1313	finally
      //   829	839	1313	finally
      //   847	860	1313	finally
      //   868	874	1313	finally
      //   882	901	1313	finally
      //   909	920	1313	finally
      //   933	941	1313	finally
      //   949	960	1313	finally
      //   1181	1189	1313	finally
      //   1202	1211	1313	finally
      //   1222	1268	1313	finally
      //   1276	1286	1313	finally
      //   1294	1310	1313	finally
      //   1350	1356	1313	finally
      //   682	688	1359	java/lang/Exception
      //   696	707	1359	java/lang/Exception
      //   715	723	1359	java/lang/Exception
      //   731	741	1359	java/lang/Exception
      //   749	756	1359	java/lang/Exception
      //   764	770	1359	java/lang/Exception
      //   778	789	1359	java/lang/Exception
      //   797	806	1359	java/lang/Exception
      //   814	821	1359	java/lang/Exception
      //   829	839	1359	java/lang/Exception
      //   847	860	1359	java/lang/Exception
      //   868	874	1359	java/lang/Exception
      //   882	901	1359	java/lang/Exception
      //   909	920	1359	java/lang/Exception
      //   933	941	1359	java/lang/Exception
      //   949	960	1359	java/lang/Exception
      //   1350	1356	1359	java/lang/Exception
      //   960	965	1378	java/lang/Exception
      //   970	975	1378	java/lang/Exception
      //   560	565	1385	java/lang/Exception
      //   570	575	1385	java/lang/Exception
      //   1324	1329	1400	java/lang/Exception
      //   1334	1339	1400	java/lang/Exception
      //   47	70	1405	finally
      //   75	84	1405	finally
      //   95	169	1405	finally
      //   174	280	1405	finally
      //   280	337	1405	finally
      //   337	378	1405	finally
      //   980	1039	1405	finally
      //   1039	1089	1405	finally
      //   1089	1118	1405	finally
      //   386	393	1417	finally
      //   401	433	1417	finally
      //   1126	1133	1417	finally
      //   1141	1173	1417	finally
      //   498	528	1433	finally
      //   533	555	1433	finally
      //   47	70	1458	java/lang/Exception
      //   75	84	1472	java/lang/Exception
      //   95	169	1491	java/lang/Exception
      //   174	280	1491	java/lang/Exception
      //   280	337	1491	java/lang/Exception
      //   337	378	1491	java/lang/Exception
      //   980	1039	1491	java/lang/Exception
      //   1039	1089	1491	java/lang/Exception
      //   1089	1118	1491	java/lang/Exception
      //   386	393	1512	java/lang/Exception
      //   401	433	1512	java/lang/Exception
      //   1126	1133	1512	java/lang/Exception
      //   1141	1173	1512	java/lang/Exception
      //   1181	1189	1538	java/lang/Exception
      //   1202	1211	1538	java/lang/Exception
      //   1222	1268	1538	java/lang/Exception
      //   1276	1286	1538	java/lang/Exception
      //   1294	1310	1538	java/lang/Exception
    }
  }
  
  public static abstract interface b
  {
    public abstract void c(String paramString1, String paramString2, int paramInt);
  }
  
  final class c
  {
    String filename;
    boolean gmS;
    String gmT;
    int pos;
    String url;
    
    public c(String paramString1, String paramString2, int paramInt, String paramString3)
    {
      GMTrace.i(648942714880L, 4835);
      this.gmS = false;
      this.url = paramString1;
      if ((p.Jh()) && (w.this.gmL)) {
        this.url = p.ko(this.url);
      }
      this.filename = paramString2;
      this.pos = paramInt;
      this.gmS = false;
      this.gmT = paramString3;
      GMTrace.o(648942714880L, 4835);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\y\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */