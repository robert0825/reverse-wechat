package com.tencent.mm.plugin.downloader.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.ResultReceiver;
import android.support.v4.app.y.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.downloader.b.a;
import java.io.File;

public class DownloadFileService
  extends IntentService
{
  private static final String TAG;
  private ResultReceiver kem;
  private int ken;
  private int keo;
  
  static
  {
    GMTrace.i(18592510771200L, 138525);
    TAG = DownloadFileService.class.getSimpleName();
    GMTrace.o(18592510771200L, 138525);
  }
  
  public DownloadFileService()
  {
    super("com.tencent.mm.plugin.downloader.intentservice.DownloadFileService");
    GMTrace.i(18591973900288L, 138521);
    GMTrace.o(18591973900288L, 138521);
  }
  
  /* Error */
  private void a(String paramString, File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 56
    //   3: ldc 58
    //   5: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 60	java/io/FileOutputStream
    //   11: dup
    //   12: aload_2
    //   13: invokespecial 63	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   16: astore 12
    //   18: aconst_null
    //   19: astore 9
    //   21: aconst_null
    //   22: astore 10
    //   24: aconst_null
    //   25: astore 11
    //   27: aconst_null
    //   28: astore 8
    //   30: aload 8
    //   32: astore 5
    //   34: aload 9
    //   36: astore 6
    //   38: aload 10
    //   40: astore 7
    //   42: aload 11
    //   44: astore_2
    //   45: new 65	java/net/URL
    //   48: dup
    //   49: aload_1
    //   50: invokespecial 66	java/net/URL:<init>	(Ljava/lang/String;)V
    //   53: invokevirtual 70	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   56: checkcast 72	java/net/HttpURLConnection
    //   59: astore 13
    //   61: aload 8
    //   63: astore 5
    //   65: aload 9
    //   67: astore 6
    //   69: aload 10
    //   71: astore 7
    //   73: aload 11
    //   75: astore_2
    //   76: aload 13
    //   78: ldc 74
    //   80: invokevirtual 77	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   83: aload 8
    //   85: astore 5
    //   87: aload 9
    //   89: astore 6
    //   91: aload 10
    //   93: astore 7
    //   95: aload 11
    //   97: astore_2
    //   98: aload 13
    //   100: sipush 10000
    //   103: invokevirtual 81	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   106: aload 8
    //   108: astore 5
    //   110: aload 9
    //   112: astore 6
    //   114: aload 10
    //   116: astore 7
    //   118: aload 11
    //   120: astore_2
    //   121: aload 13
    //   123: sipush 3000
    //   126: invokevirtual 84	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   129: aload 8
    //   131: astore 5
    //   133: aload 9
    //   135: astore 6
    //   137: aload 10
    //   139: astore 7
    //   141: aload 11
    //   143: astore_2
    //   144: aload 13
    //   146: ldc 86
    //   148: invokevirtual 90	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   151: invokestatic 96	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   154: invokevirtual 100	java/lang/Integer:intValue	()I
    //   157: istore_3
    //   158: aload 8
    //   160: astore 5
    //   162: aload 9
    //   164: astore 6
    //   166: aload 10
    //   168: astore 7
    //   170: aload 11
    //   172: astore_2
    //   173: aload 13
    //   175: invokevirtual 104	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   178: astore_1
    //   179: aload_1
    //   180: astore 5
    //   182: aload_1
    //   183: astore 6
    //   185: aload_1
    //   186: astore 7
    //   188: aload_1
    //   189: astore_2
    //   190: aload 13
    //   192: invokevirtual 107	java/net/HttpURLConnection:getResponseCode	()I
    //   195: istore 4
    //   197: iload 4
    //   199: sipush 200
    //   202: if_icmpne +298 -> 500
    //   205: aload_1
    //   206: astore 5
    //   208: aload_1
    //   209: astore 6
    //   211: aload_1
    //   212: astore 7
    //   214: aload_1
    //   215: astore_2
    //   216: sipush 8192
    //   219: newarray <illegal type>
    //   221: astore 8
    //   223: aload_1
    //   224: astore 5
    //   226: aload_1
    //   227: astore 6
    //   229: aload_1
    //   230: astore 7
    //   232: aload_1
    //   233: astore_2
    //   234: aload_1
    //   235: aload 8
    //   237: invokevirtual 113	java/io/InputStream:read	([B)I
    //   240: istore 4
    //   242: iload 4
    //   244: iconst_m1
    //   245: if_icmpeq +289 -> 534
    //   248: aload_1
    //   249: astore 5
    //   251: aload_1
    //   252: astore 6
    //   254: aload_1
    //   255: astore 7
    //   257: aload_1
    //   258: astore_2
    //   259: aload 12
    //   261: aload 8
    //   263: iconst_0
    //   264: iload 4
    //   266: invokevirtual 117	java/io/FileOutputStream:write	([BII)V
    //   269: aload_1
    //   270: astore 5
    //   272: aload_1
    //   273: astore 6
    //   275: aload_1
    //   276: astore 7
    //   278: aload_1
    //   279: astore_2
    //   280: aload_0
    //   281: iload 4
    //   283: aload_0
    //   284: getfield 119	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:ken	I
    //   287: iadd
    //   288: putfield 119	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:ken	I
    //   291: aload_1
    //   292: astore 5
    //   294: aload_1
    //   295: astore 6
    //   297: aload_1
    //   298: astore 7
    //   300: aload_1
    //   301: astore_2
    //   302: new 121	android/os/Bundle
    //   305: dup
    //   306: invokespecial 123	android/os/Bundle:<init>	()V
    //   309: astore 9
    //   311: aload_1
    //   312: astore 5
    //   314: aload_1
    //   315: astore 6
    //   317: aload_1
    //   318: astore 7
    //   320: aload_1
    //   321: astore_2
    //   322: aload_0
    //   323: getfield 119	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:ken	I
    //   326: i2l
    //   327: ldc2_w 124
    //   330: lmul
    //   331: iload_3
    //   332: i2l
    //   333: ldiv
    //   334: l2i
    //   335: istore 4
    //   337: aload_1
    //   338: astore 5
    //   340: aload_1
    //   341: astore 6
    //   343: aload_1
    //   344: astore 7
    //   346: aload_1
    //   347: astore_2
    //   348: iload 4
    //   350: aload_0
    //   351: getfield 127	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:keo	I
    //   354: if_icmple -131 -> 223
    //   357: aload_1
    //   358: astore 5
    //   360: aload_1
    //   361: astore 6
    //   363: aload_1
    //   364: astore 7
    //   366: aload_1
    //   367: astore_2
    //   368: aload 9
    //   370: ldc -127
    //   372: iload 4
    //   374: invokevirtual 133	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   377: aload_1
    //   378: astore 5
    //   380: aload_1
    //   381: astore 6
    //   383: aload_1
    //   384: astore 7
    //   386: aload_1
    //   387: astore_2
    //   388: aload_0
    //   389: getfield 135	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:kem	Landroid/os/ResultReceiver;
    //   392: sipush 4657
    //   395: aload 9
    //   397: invokevirtual 141	android/os/ResultReceiver:send	(ILandroid/os/Bundle;)V
    //   400: aload_1
    //   401: astore 5
    //   403: aload_1
    //   404: astore 6
    //   406: aload_1
    //   407: astore 7
    //   409: aload_1
    //   410: astore_2
    //   411: aload_0
    //   412: iload 4
    //   414: putfield 127	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:keo	I
    //   417: goto -194 -> 223
    //   420: astore_1
    //   421: aload 5
    //   423: astore_2
    //   424: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   427: aload_1
    //   428: ldc -113
    //   430: iconst_0
    //   431: anewarray 145	java/lang/Object
    //   434: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   437: aload 12
    //   439: invokevirtual 155	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   442: invokevirtual 160	java/io/FileDescriptor:sync	()V
    //   445: aload 12
    //   447: invokevirtual 163	java/io/FileOutputStream:close	()V
    //   450: aload 5
    //   452: ifnull +8 -> 460
    //   455: aload 5
    //   457: invokevirtual 164	java/io/InputStream:close	()V
    //   460: ldc2_w 56
    //   463: ldc 58
    //   465: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   468: return
    //   469: astore_1
    //   470: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   473: ldc -90
    //   475: invokestatic 170	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   478: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   481: aload_1
    //   482: ldc -113
    //   484: iconst_0
    //   485: anewarray 145	java/lang/Object
    //   488: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   491: ldc2_w 56
    //   494: ldc 58
    //   496: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   499: return
    //   500: aload_1
    //   501: astore 5
    //   503: aload_1
    //   504: astore 6
    //   506: aload_1
    //   507: astore 7
    //   509: aload_1
    //   510: astore_2
    //   511: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   514: new 172	java/lang/StringBuilder
    //   517: dup
    //   518: ldc -82
    //   520: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   523: iload 4
    //   525: invokevirtual 179	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   528: invokevirtual 182	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   531: invokestatic 170	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   534: aload 12
    //   536: invokevirtual 155	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   539: invokevirtual 160	java/io/FileDescriptor:sync	()V
    //   542: aload 12
    //   544: invokevirtual 163	java/io/FileOutputStream:close	()V
    //   547: aload_1
    //   548: ifnull +7 -> 555
    //   551: aload_1
    //   552: invokevirtual 164	java/io/InputStream:close	()V
    //   555: ldc2_w 56
    //   558: ldc 58
    //   560: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   563: return
    //   564: astore_1
    //   565: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   568: aload_1
    //   569: ldc -113
    //   571: iconst_0
    //   572: anewarray 145	java/lang/Object
    //   575: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   578: ldc2_w 56
    //   581: ldc 58
    //   583: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   586: return
    //   587: astore_1
    //   588: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   591: aload_1
    //   592: ldc -113
    //   594: iconst_0
    //   595: anewarray 145	java/lang/Object
    //   598: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   601: ldc2_w 56
    //   604: ldc 58
    //   606: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   609: return
    //   610: astore_1
    //   611: aload 6
    //   613: astore_2
    //   614: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   617: aload_1
    //   618: ldc -113
    //   620: iconst_0
    //   621: anewarray 145	java/lang/Object
    //   624: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   627: aload 12
    //   629: invokevirtual 155	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   632: invokevirtual 160	java/io/FileDescriptor:sync	()V
    //   635: aload 12
    //   637: invokevirtual 163	java/io/FileOutputStream:close	()V
    //   640: aload 6
    //   642: ifnull +8 -> 650
    //   645: aload 6
    //   647: invokevirtual 164	java/io/InputStream:close	()V
    //   650: ldc2_w 56
    //   653: ldc 58
    //   655: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   658: return
    //   659: astore_1
    //   660: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   663: aload_1
    //   664: ldc -113
    //   666: iconst_0
    //   667: anewarray 145	java/lang/Object
    //   670: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   673: ldc2_w 56
    //   676: ldc 58
    //   678: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   681: return
    //   682: astore_1
    //   683: aload 7
    //   685: astore_2
    //   686: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   689: aload_1
    //   690: ldc -113
    //   692: iconst_0
    //   693: anewarray 145	java/lang/Object
    //   696: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   699: aload 12
    //   701: invokevirtual 155	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   704: invokevirtual 160	java/io/FileDescriptor:sync	()V
    //   707: aload 12
    //   709: invokevirtual 163	java/io/FileOutputStream:close	()V
    //   712: aload 7
    //   714: ifnull +8 -> 722
    //   717: aload 7
    //   719: invokevirtual 164	java/io/InputStream:close	()V
    //   722: ldc2_w 56
    //   725: ldc 58
    //   727: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   730: return
    //   731: astore_1
    //   732: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   735: aload_1
    //   736: ldc -113
    //   738: iconst_0
    //   739: anewarray 145	java/lang/Object
    //   742: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   745: ldc2_w 56
    //   748: ldc 58
    //   750: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   753: return
    //   754: astore_1
    //   755: aload 12
    //   757: invokevirtual 155	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   760: invokevirtual 160	java/io/FileDescriptor:sync	()V
    //   763: aload 12
    //   765: invokevirtual 163	java/io/FileOutputStream:close	()V
    //   768: aload_2
    //   769: ifnull +7 -> 776
    //   772: aload_2
    //   773: invokevirtual 164	java/io/InputStream:close	()V
    //   776: aload_1
    //   777: athrow
    //   778: astore_2
    //   779: getstatic 30	com/tencent/mm/plugin/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   782: aload_2
    //   783: ldc -113
    //   785: iconst_0
    //   786: anewarray 145	java/lang/Object
    //   789: invokestatic 151	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   792: goto -16 -> 776
    //   795: astore 5
    //   797: goto -34 -> 763
    //   800: astore_1
    //   801: goto -94 -> 707
    //   804: astore_1
    //   805: goto -170 -> 635
    //   808: astore_1
    //   809: goto -364 -> 445
    //   812: astore_2
    //   813: goto -271 -> 542
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	816	0	this	DownloadFileService
    //   0	816	1	paramString	String
    //   0	816	2	paramFile	File
    //   157	175	3	i	int
    //   195	329	4	j	int
    //   32	470	5	localObject1	Object
    //   795	1	5	localException	Exception
    //   36	610	6	localObject2	Object
    //   40	678	7	localObject3	Object
    //   28	234	8	arrayOfByte	byte[]
    //   19	377	9	localBundle	Bundle
    //   22	145	10	localObject4	Object
    //   25	146	11	localObject5	Object
    //   16	748	12	localFileOutputStream	java.io.FileOutputStream
    //   59	132	13	localHttpURLConnection	java.net.HttpURLConnection
    // Exception table:
    //   from	to	target	type
    //   45	61	420	java/net/ProtocolException
    //   76	83	420	java/net/ProtocolException
    //   98	106	420	java/net/ProtocolException
    //   121	129	420	java/net/ProtocolException
    //   144	158	420	java/net/ProtocolException
    //   173	179	420	java/net/ProtocolException
    //   190	197	420	java/net/ProtocolException
    //   216	223	420	java/net/ProtocolException
    //   234	242	420	java/net/ProtocolException
    //   259	269	420	java/net/ProtocolException
    //   280	291	420	java/net/ProtocolException
    //   302	311	420	java/net/ProtocolException
    //   322	337	420	java/net/ProtocolException
    //   348	357	420	java/net/ProtocolException
    //   368	377	420	java/net/ProtocolException
    //   388	400	420	java/net/ProtocolException
    //   411	417	420	java/net/ProtocolException
    //   511	534	420	java/net/ProtocolException
    //   8	18	469	java/io/FileNotFoundException
    //   534	542	564	java/io/IOException
    //   542	547	564	java/io/IOException
    //   551	555	564	java/io/IOException
    //   437	445	587	java/io/IOException
    //   445	450	587	java/io/IOException
    //   455	460	587	java/io/IOException
    //   45	61	610	java/net/MalformedURLException
    //   76	83	610	java/net/MalformedURLException
    //   98	106	610	java/net/MalformedURLException
    //   121	129	610	java/net/MalformedURLException
    //   144	158	610	java/net/MalformedURLException
    //   173	179	610	java/net/MalformedURLException
    //   190	197	610	java/net/MalformedURLException
    //   216	223	610	java/net/MalformedURLException
    //   234	242	610	java/net/MalformedURLException
    //   259	269	610	java/net/MalformedURLException
    //   280	291	610	java/net/MalformedURLException
    //   302	311	610	java/net/MalformedURLException
    //   322	337	610	java/net/MalformedURLException
    //   348	357	610	java/net/MalformedURLException
    //   368	377	610	java/net/MalformedURLException
    //   388	400	610	java/net/MalformedURLException
    //   411	417	610	java/net/MalformedURLException
    //   511	534	610	java/net/MalformedURLException
    //   627	635	659	java/io/IOException
    //   635	640	659	java/io/IOException
    //   645	650	659	java/io/IOException
    //   45	61	682	java/io/IOException
    //   76	83	682	java/io/IOException
    //   98	106	682	java/io/IOException
    //   121	129	682	java/io/IOException
    //   144	158	682	java/io/IOException
    //   173	179	682	java/io/IOException
    //   190	197	682	java/io/IOException
    //   216	223	682	java/io/IOException
    //   234	242	682	java/io/IOException
    //   259	269	682	java/io/IOException
    //   280	291	682	java/io/IOException
    //   302	311	682	java/io/IOException
    //   322	337	682	java/io/IOException
    //   348	357	682	java/io/IOException
    //   368	377	682	java/io/IOException
    //   388	400	682	java/io/IOException
    //   411	417	682	java/io/IOException
    //   511	534	682	java/io/IOException
    //   699	707	731	java/io/IOException
    //   707	712	731	java/io/IOException
    //   717	722	731	java/io/IOException
    //   45	61	754	finally
    //   76	83	754	finally
    //   98	106	754	finally
    //   121	129	754	finally
    //   144	158	754	finally
    //   173	179	754	finally
    //   190	197	754	finally
    //   216	223	754	finally
    //   234	242	754	finally
    //   259	269	754	finally
    //   280	291	754	finally
    //   302	311	754	finally
    //   322	337	754	finally
    //   348	357	754	finally
    //   368	377	754	finally
    //   388	400	754	finally
    //   411	417	754	finally
    //   424	437	754	finally
    //   511	534	754	finally
    //   614	627	754	finally
    //   686	699	754	finally
    //   755	763	778	java/io/IOException
    //   763	768	778	java/io/IOException
    //   772	776	778	java/io/IOException
    //   755	763	795	java/lang/Exception
    //   699	707	800	java/lang/Exception
    //   627	635	804	java/lang/Exception
    //   437	445	808	java/lang/Exception
    //   534	542	812	java/lang/Exception
  }
  
  public void onCreate()
  {
    GMTrace.i(18592108118016L, 138522);
    super.onCreate();
    y.d locald = new y.d(this);
    locald.a("Something Download").b("Download in progress").L(b.a.icon);
    startForeground(4657, locald.build());
    GMTrace.o(18592108118016L, 138522);
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    GMTrace.i(18592242335744L, 138523);
    String str = paramIntent.getExtras().getString("url");
    this.kem = ((ResultReceiver)paramIntent.getParcelableExtra("receiver"));
    paramIntent = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download");
    if (!paramIntent.exists()) {
      paramIntent.mkdirs();
    }
    a(str, new File(paramIntent, "file11.apk"));
    GMTrace.o(18592242335744L, 138523);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\downloader\intentservice\DownloadFileService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */