package com.tencent.xweb.xwalk.a;

import android.os.AsyncTask;
import android.webkit.ValueCallback;
import com.tencent.xweb.util.e;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;

public final class b
  extends AsyncTask<String, Integer, c.a>
{
  private static String yqj;
  long mStartTimestamp = 0L;
  ValueCallback<c.a> yqf;
  String yqg;
  String yqh;
  String yqi;
  
  public b(ValueCallback<c.a> paramValueCallback)
  {
    this.yqf = paramValueCallback;
    this.yqg = XWalkEnvironment.getUpdateConfigDir();
    this.yqh = "updateConfg.xml";
    if (yqj == null)
    {
      paramValueCallback = XWalkEnvironment.getTestDownLoadUrl(XWalkEnvironment.getApplicationContext());
      if ((paramValueCallback == null) || (paramValueCallback.isEmpty())) {
        break label84;
      }
      yqj = paramValueCallback;
      XWalkInitializer.addXWalkInitializeLog("use test config url : " + yqj);
    }
    for (;;)
    {
      this.yqi = yqj;
      return;
      label84:
      yqj = "http://dldir1.qq.com/weixin/android/wxweb/updateConfig.xml";
    }
  }
  
  /* Error */
  private c.a csz()
  {
    // Byte code:
    //   0: invokestatic 96	com/tencent/xweb/xwalk/a/e:csI	()Z
    //   3: ifeq +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: invokestatic 99	com/tencent/xweb/xwalk/a/e:csJ	()V
    //   11: ldc 101
    //   13: invokestatic 78	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   16: aconst_null
    //   17: astore 16
    //   19: aconst_null
    //   20: astore 10
    //   22: aconst_null
    //   23: astore 12
    //   25: aconst_null
    //   26: astore 13
    //   28: aconst_null
    //   29: astore 11
    //   31: aconst_null
    //   32: astore 5
    //   34: aconst_null
    //   35: astore 9
    //   37: aconst_null
    //   38: astore 14
    //   40: aconst_null
    //   41: astore 15
    //   43: aconst_null
    //   44: astore 8
    //   46: aconst_null
    //   47: astore 7
    //   49: aconst_null
    //   50: astore 17
    //   52: new 103	java/net/URL
    //   55: dup
    //   56: aload_0
    //   57: getfield 80	com/tencent/xweb/xwalk/a/b:yqi	Ljava/lang/String;
    //   60: invokespecial 104	java/net/URL:<init>	(Ljava/lang/String;)V
    //   63: invokevirtual 108	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   66: checkcast 110	java/net/HttpURLConnection
    //   69: astore 6
    //   71: aload 14
    //   73: astore 7
    //   75: aload 12
    //   77: astore 10
    //   79: aload 15
    //   81: astore 8
    //   83: aload 13
    //   85: astore 11
    //   87: aload 6
    //   89: ldc 112
    //   91: invokevirtual 115	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   94: aload 14
    //   96: astore 7
    //   98: aload 12
    //   100: astore 10
    //   102: aload 15
    //   104: astore 8
    //   106: aload 13
    //   108: astore 11
    //   110: aload 6
    //   112: instanceof 117
    //   115: ifeq +105 -> 220
    //   118: aload 14
    //   120: astore 7
    //   122: aload 12
    //   124: astore 10
    //   126: aload 15
    //   128: astore 8
    //   130: aload 13
    //   132: astore 11
    //   134: invokestatic 121	com/tencent/xweb/xwalk/a/b$a:csA	()Ljavax/net/ssl/SSLContext;
    //   137: astore 9
    //   139: aload 9
    //   141: ifnull +79 -> 220
    //   144: aload 14
    //   146: astore 7
    //   148: aload 12
    //   150: astore 10
    //   152: aload 15
    //   154: astore 8
    //   156: aload 13
    //   158: astore 11
    //   160: aload 9
    //   162: invokevirtual 127	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   165: astore 9
    //   167: aload 14
    //   169: astore 7
    //   171: aload 12
    //   173: astore 10
    //   175: aload 15
    //   177: astore 8
    //   179: aload 13
    //   181: astore 11
    //   183: aload 6
    //   185: checkcast 117	javax/net/ssl/HttpsURLConnection
    //   188: aload 9
    //   190: invokevirtual 131	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   193: aload 14
    //   195: astore 7
    //   197: aload 12
    //   199: astore 10
    //   201: aload 15
    //   203: astore 8
    //   205: aload 13
    //   207: astore 11
    //   209: aload 6
    //   211: checkcast 117	javax/net/ssl/HttpsURLConnection
    //   214: getstatic 135	com/tencent/xweb/xwalk/a/b$a:yql	Ljavax/net/ssl/HostnameVerifier;
    //   217: invokevirtual 139	javax/net/ssl/HttpsURLConnection:setHostnameVerifier	(Ljavax/net/ssl/HostnameVerifier;)V
    //   220: aload 14
    //   222: astore 7
    //   224: aload 12
    //   226: astore 10
    //   228: aload 15
    //   230: astore 8
    //   232: aload 13
    //   234: astore 11
    //   236: aload 6
    //   238: sipush 8000
    //   241: invokevirtual 143	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   244: aload 14
    //   246: astore 7
    //   248: aload 12
    //   250: astore 10
    //   252: aload 15
    //   254: astore 8
    //   256: aload 13
    //   258: astore 11
    //   260: aload 6
    //   262: sipush 8000
    //   265: invokevirtual 146	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   268: aload 16
    //   270: astore 9
    //   272: aload 14
    //   274: astore 7
    //   276: aload 12
    //   278: astore 10
    //   280: aload 15
    //   282: astore 8
    //   284: aload 13
    //   286: astore 11
    //   288: aload 6
    //   290: invokevirtual 150	java/net/HttpURLConnection:getResponseCode	()I
    //   293: sipush 200
    //   296: if_icmpne +404 -> 700
    //   299: aload 14
    //   301: astore 7
    //   303: aload 12
    //   305: astore 10
    //   307: aload 15
    //   309: astore 8
    //   311: aload 13
    //   313: astore 11
    //   315: aload 6
    //   317: invokevirtual 154	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   320: astore 5
    //   322: aload 5
    //   324: astore 7
    //   326: aload 12
    //   328: astore 10
    //   330: aload 5
    //   332: astore 8
    //   334: aload 13
    //   336: astore 11
    //   338: aload 6
    //   340: invokevirtual 157	java/net/HttpURLConnection:getContentLength	()I
    //   343: istore_1
    //   344: aload 5
    //   346: astore 7
    //   348: aload 12
    //   350: astore 10
    //   352: aload 5
    //   354: astore 8
    //   356: aload 13
    //   358: astore 11
    //   360: new 61	java/lang/StringBuilder
    //   363: dup
    //   364: invokespecial 158	java/lang/StringBuilder:<init>	()V
    //   367: aload_0
    //   368: getfield 39	com/tencent/xweb/xwalk/a/b:yqg	Ljava/lang/String;
    //   371: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: getstatic 163	java/io/File:separator	Ljava/lang/String;
    //   377: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: aload_0
    //   381: getfield 43	com/tencent/xweb/xwalk/a/b:yqh	Ljava/lang/String;
    //   384: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   390: astore 9
    //   392: aload 5
    //   394: astore 7
    //   396: aload 12
    //   398: astore 10
    //   400: aload 5
    //   402: astore 8
    //   404: aload 13
    //   406: astore 11
    //   408: new 160	java/io/File
    //   411: dup
    //   412: aload 9
    //   414: invokespecial 164	java/io/File:<init>	(Ljava/lang/String;)V
    //   417: astore 14
    //   419: aload 5
    //   421: astore 7
    //   423: aload 12
    //   425: astore 10
    //   427: aload 5
    //   429: astore 8
    //   431: aload 13
    //   433: astore 11
    //   435: aload 14
    //   437: invokevirtual 167	java/io/File:exists	()Z
    //   440: ifeq +25 -> 465
    //   443: aload 5
    //   445: astore 7
    //   447: aload 12
    //   449: astore 10
    //   451: aload 5
    //   453: astore 8
    //   455: aload 13
    //   457: astore 11
    //   459: aload 14
    //   461: invokevirtual 170	java/io/File:delete	()Z
    //   464: pop
    //   465: aload 5
    //   467: astore 7
    //   469: aload 12
    //   471: astore 10
    //   473: aload 5
    //   475: astore 8
    //   477: aload 13
    //   479: astore 11
    //   481: new 172	java/io/FileOutputStream
    //   484: dup
    //   485: aload 9
    //   487: invokespecial 173	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   490: astore 9
    //   492: sipush 4096
    //   495: newarray <illegal type>
    //   497: astore 7
    //   499: lconst_0
    //   500: lstore_3
    //   501: aload 5
    //   503: aload 7
    //   505: invokevirtual 179	java/io/InputStream:read	([B)I
    //   508: istore_2
    //   509: iload_2
    //   510: iconst_m1
    //   511: if_icmpeq +189 -> 700
    //   514: aload_0
    //   515: invokevirtual 182	com/tencent/xweb/xwalk/a/b:isCancelled	()Z
    //   518: ifeq +38 -> 556
    //   521: aload 5
    //   523: invokevirtual 185	java/io/InputStream:close	()V
    //   526: invokestatic 190	com/tencent/xweb/util/e:csq	()V
    //   529: aload 9
    //   531: invokevirtual 193	java/io/OutputStream:close	()V
    //   534: aload 5
    //   536: ifnull +8 -> 544
    //   539: aload 5
    //   541: invokevirtual 185	java/io/InputStream:close	()V
    //   544: aload 6
    //   546: ifnull +8 -> 554
    //   549: aload 6
    //   551: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   554: aconst_null
    //   555: areturn
    //   556: lload_3
    //   557: iload_2
    //   558: i2l
    //   559: ladd
    //   560: lstore_3
    //   561: iload_1
    //   562: ifle +26 -> 588
    //   565: aload_0
    //   566: iconst_1
    //   567: anewarray 198	java/lang/Integer
    //   570: dup
    //   571: iconst_0
    //   572: ldc2_w 199
    //   575: lload_3
    //   576: lmul
    //   577: iload_1
    //   578: i2l
    //   579: ldiv
    //   580: l2i
    //   581: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   584: aastore
    //   585: invokevirtual 208	com/tencent/xweb/xwalk/a/b:publishProgress	([Ljava/lang/Object;)V
    //   588: aload 9
    //   590: aload 7
    //   592: iconst_0
    //   593: iload_2
    //   594: invokevirtual 212	java/io/OutputStream:write	([BII)V
    //   597: goto -96 -> 501
    //   600: astore 12
    //   602: aload 6
    //   604: astore 7
    //   606: aload 9
    //   608: astore 6
    //   610: aload 5
    //   612: astore 8
    //   614: aload 7
    //   616: astore 5
    //   618: aload 5
    //   620: astore 7
    //   622: aload 8
    //   624: astore 9
    //   626: aload 6
    //   628: astore 10
    //   630: new 61	java/lang/StringBuilder
    //   633: dup
    //   634: ldc -42
    //   636: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   639: aload 12
    //   641: invokevirtual 215	java/lang/Exception:toString	()Ljava/lang/String;
    //   644: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   650: invokestatic 78	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   653: aload 5
    //   655: astore 7
    //   657: aload 8
    //   659: astore 9
    //   661: aload 6
    //   663: astore 10
    //   665: invokestatic 190	com/tencent/xweb/util/e:csq	()V
    //   668: aload 6
    //   670: ifnull +8 -> 678
    //   673: aload 6
    //   675: invokevirtual 193	java/io/OutputStream:close	()V
    //   678: aload 8
    //   680: ifnull +8 -> 688
    //   683: aload 8
    //   685: invokevirtual 185	java/io/InputStream:close	()V
    //   688: aload 5
    //   690: ifnull +8 -> 698
    //   693: aload 5
    //   695: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   698: aconst_null
    //   699: areturn
    //   700: aload 5
    //   702: astore 7
    //   704: aload 9
    //   706: astore 10
    //   708: aload 5
    //   710: astore 8
    //   712: aload 9
    //   714: astore 11
    //   716: aload 6
    //   718: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   721: aload 9
    //   723: ifnull +8 -> 731
    //   726: aload 9
    //   728: invokevirtual 193	java/io/OutputStream:close	()V
    //   731: aload 5
    //   733: ifnull +8 -> 741
    //   736: aload 5
    //   738: invokevirtual 185	java/io/InputStream:close	()V
    //   741: aload 6
    //   743: ifnull +8 -> 751
    //   746: aload 6
    //   748: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   751: new 61	java/lang/StringBuilder
    //   754: dup
    //   755: invokespecial 158	java/lang/StringBuilder:<init>	()V
    //   758: aload_0
    //   759: getfield 39	com/tencent/xweb/xwalk/a/b:yqg	Ljava/lang/String;
    //   762: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   765: getstatic 163	java/io/File:separator	Ljava/lang/String;
    //   768: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   771: aload_0
    //   772: getfield 43	com/tencent/xweb/xwalk/a/b:yqh	Ljava/lang/String;
    //   775: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   778: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   781: astore 5
    //   783: aload 5
    //   785: ifnonnull +70 -> 855
    //   788: ldc -39
    //   790: invokestatic 78	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   793: aconst_null
    //   794: astore 5
    //   796: aload 5
    //   798: ifnonnull +108 -> 906
    //   801: ldc2_w 218
    //   804: invokestatic 223	com/tencent/xweb/util/e:fx	(J)V
    //   807: invokestatic 190	com/tencent/xweb/util/e:csq	()V
    //   810: aconst_null
    //   811: areturn
    //   812: astore 6
    //   814: aload 9
    //   816: astore 5
    //   818: aload 7
    //   820: astore 8
    //   822: aload 10
    //   824: ifnull +8 -> 832
    //   827: aload 10
    //   829: invokevirtual 193	java/io/OutputStream:close	()V
    //   832: aload 5
    //   834: ifnull +8 -> 842
    //   837: aload 5
    //   839: invokevirtual 185	java/io/InputStream:close	()V
    //   842: aload 8
    //   844: ifnull +8 -> 852
    //   847: aload 8
    //   849: invokevirtual 196	java/net/HttpURLConnection:disconnect	()V
    //   852: aload 6
    //   854: athrow
    //   855: new 160	java/io/File
    //   858: dup
    //   859: aload 5
    //   861: invokespecial 164	java/io/File:<init>	(Ljava/lang/String;)V
    //   864: astore 5
    //   866: aload 5
    //   868: invokevirtual 167	java/io/File:exists	()Z
    //   871: ifne +14 -> 885
    //   874: ldc -31
    //   876: invokestatic 78	org/xwalk/core/XWalkInitializer:addXWalkInitializeLog	(Ljava/lang/String;)V
    //   879: aconst_null
    //   880: astore 5
    //   882: goto -86 -> 796
    //   885: aload 5
    //   887: aload 5
    //   889: aload 5
    //   891: invokevirtual 229	java/io/File:length	()J
    //   894: l2i
    //   895: invokestatic 235	com/tencent/xweb/xwalk/a/a:h	(Ljava/io/File;I)Ljava/lang/String;
    //   898: invokestatic 239	com/tencent/xweb/xwalk/a/a:i	(Ljava/io/File;Ljava/lang/String;)Lcom/tencent/xweb/xwalk/a/a$a;
    //   901: astore 5
    //   903: goto -107 -> 796
    //   906: aload 5
    //   908: getfield 245	com/tencent/xweb/xwalk/a/a$a:ypQ	[Lcom/tencent/xweb/a$a;
    //   911: aload 5
    //   913: getfield 248	com/tencent/xweb/xwalk/a/a$a:ypO	Ljava/lang/String;
    //   916: invokestatic 253	com/tencent/xweb/a:a	([Lcom/tencent/xweb/a$a;Ljava/lang/String;)V
    //   919: invokestatic 258	java/lang/System:currentTimeMillis	()J
    //   922: aload_0
    //   923: getfield 29	com/tencent/xweb/xwalk/a/b:mStartTimestamp	J
    //   926: lsub
    //   927: invokestatic 261	com/tencent/xweb/util/e:fB	(J)V
    //   930: invokestatic 267	com/tencent/xweb/xwalk/a/c:csB	()Lcom/tencent/xweb/xwalk/a/c;
    //   933: pop
    //   934: aload 5
    //   936: invokestatic 270	com/tencent/xweb/xwalk/a/c:a	(Lcom/tencent/xweb/xwalk/a/a$a;)Lcom/tencent/xweb/xwalk/a/c$a;
    //   939: areturn
    //   940: astore 6
    //   942: ldc_w 272
    //   945: new 61	java/lang/StringBuilder
    //   948: dup
    //   949: ldc_w 274
    //   952: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   955: aload 6
    //   957: invokevirtual 277	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   960: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   963: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   966: invokestatic 280	org/xwalk/core/XWalkEnvironment:addXWalkInitializeLog	(Ljava/lang/String;Ljava/lang/String;)V
    //   969: goto -50 -> 919
    //   972: astore 5
    //   974: goto -132 -> 842
    //   977: astore 5
    //   979: aload 6
    //   981: astore 8
    //   983: aload 5
    //   985: astore 6
    //   987: aload 7
    //   989: astore 5
    //   991: goto -169 -> 822
    //   994: astore 7
    //   996: aload 6
    //   998: astore 8
    //   1000: aload 7
    //   1002: astore 6
    //   1004: aload 9
    //   1006: astore 10
    //   1008: goto -186 -> 822
    //   1011: astore 6
    //   1013: goto -325 -> 688
    //   1016: astore 12
    //   1018: aload 17
    //   1020: astore 5
    //   1022: aload 11
    //   1024: astore 6
    //   1026: goto -408 -> 618
    //   1029: astore 12
    //   1031: aload 6
    //   1033: astore 5
    //   1035: aload 11
    //   1037: astore 6
    //   1039: goto -421 -> 618
    //   1042: astore 5
    //   1044: goto -303 -> 741
    //   1047: astore 5
    //   1049: goto -505 -> 544
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1052	0	this	b
    //   343	235	1	i	int
    //   508	86	2	j	int
    //   500	76	3	l	long
    //   32	903	5	localObject1	Object
    //   972	1	5	localIOException1	java.io.IOException
    //   977	7	5	localObject2	Object
    //   989	45	5	localObject3	Object
    //   1042	1	5	localIOException2	java.io.IOException
    //   1047	1	5	localIOException3	java.io.IOException
    //   69	678	6	localObject4	Object
    //   812	41	6	localObject5	Object
    //   940	40	6	localException1	Exception
    //   985	18	6	localObject6	Object
    //   1011	1	6	localIOException4	java.io.IOException
    //   1024	14	6	localObject7	Object
    //   47	941	7	localObject8	Object
    //   994	7	7	localObject9	Object
    //   44	955	8	localObject10	Object
    //   35	970	9	localObject11	Object
    //   20	987	10	localObject12	Object
    //   29	1007	11	localObject13	Object
    //   23	447	12	localObject14	Object
    //   600	40	12	localException2	Exception
    //   1016	1	12	localException3	Exception
    //   1029	1	12	localException4	Exception
    //   26	452	13	localObject15	Object
    //   38	422	14	localFile	java.io.File
    //   41	267	15	localObject16	Object
    //   17	252	16	localObject17	Object
    //   50	969	17	localObject18	Object
    // Exception table:
    //   from	to	target	type
    //   492	499	600	java/lang/Exception
    //   501	509	600	java/lang/Exception
    //   514	529	600	java/lang/Exception
    //   565	588	600	java/lang/Exception
    //   588	597	600	java/lang/Exception
    //   52	71	812	finally
    //   630	653	812	finally
    //   665	668	812	finally
    //   906	919	940	java/lang/Exception
    //   827	832	972	java/io/IOException
    //   837	842	972	java/io/IOException
    //   87	94	977	finally
    //   110	118	977	finally
    //   134	139	977	finally
    //   160	167	977	finally
    //   183	193	977	finally
    //   209	220	977	finally
    //   236	244	977	finally
    //   260	268	977	finally
    //   288	299	977	finally
    //   315	322	977	finally
    //   338	344	977	finally
    //   360	392	977	finally
    //   408	419	977	finally
    //   435	443	977	finally
    //   459	465	977	finally
    //   481	492	977	finally
    //   716	721	977	finally
    //   492	499	994	finally
    //   501	509	994	finally
    //   514	529	994	finally
    //   565	588	994	finally
    //   588	597	994	finally
    //   673	678	1011	java/io/IOException
    //   683	688	1011	java/io/IOException
    //   52	71	1016	java/lang/Exception
    //   87	94	1029	java/lang/Exception
    //   110	118	1029	java/lang/Exception
    //   134	139	1029	java/lang/Exception
    //   160	167	1029	java/lang/Exception
    //   183	193	1029	java/lang/Exception
    //   209	220	1029	java/lang/Exception
    //   236	244	1029	java/lang/Exception
    //   260	268	1029	java/lang/Exception
    //   288	299	1029	java/lang/Exception
    //   315	322	1029	java/lang/Exception
    //   338	344	1029	java/lang/Exception
    //   360	392	1029	java/lang/Exception
    //   408	419	1029	java/lang/Exception
    //   435	443	1029	java/lang/Exception
    //   459	465	1029	java/lang/Exception
    //   481	492	1029	java/lang/Exception
    //   716	721	1029	java/lang/Exception
    //   726	731	1042	java/io/IOException
    //   736	741	1042	java/io/IOException
    //   529	534	1047	java/io/IOException
    //   539	544	1047	java/io/IOException
  }
  
  protected final void onPreExecute()
  {
    super.onPreExecute();
    c.csF();
    this.mStartTimestamp = System.currentTimeMillis();
    e.csp();
  }
  
  static final class a
  {
    private static TrustManager yqk = new X509TrustManager()
    {
      public final void checkClientTrusted(X509Certificate[] paramAnonymousArrayOfX509Certificate, String paramAnonymousString) {}
      
      public final void checkServerTrusted(X509Certificate[] paramAnonymousArrayOfX509Certificate, String paramAnonymousString) {}
      
      public final X509Certificate[] getAcceptedIssuers()
      {
        return new X509Certificate[0];
      }
    };
    public static final HostnameVerifier yql = new HostnameVerifier()
    {
      public final boolean verify(String paramAnonymousString, SSLSession paramAnonymousSSLSession)
      {
        return true;
      }
    };
    
    public static SSLContext csA()
    {
      Object localObject = null;
      try
      {
        SSLContext localSSLContext = SSLContext.getInstance("TLS");
        localObject = localSSLContext;
        TrustManager localTrustManager = yqk;
        localObject = localSSLContext;
        SecureRandom localSecureRandom = new SecureRandom();
        localObject = localSSLContext;
        localSSLContext.init(null, new TrustManager[] { localTrustManager }, localSecureRandom);
        return localSSLContext;
      }
      catch (Exception localException) {}
      return (SSLContext)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\xwalk\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */