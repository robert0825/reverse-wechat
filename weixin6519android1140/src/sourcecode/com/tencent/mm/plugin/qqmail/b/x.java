package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.u;
import com.tencent.mm.sdk.platformtools.w;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class x
  extends h
{
  private u nTQ;
  
  private static void a(h.b paramb, OutputStream paramOutputStream)
  {
    GMTrace.i(5474204254208L, 40786);
    if (paramb.nSp == null)
    {
      GMTrace.o(5474204254208L, 40786);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramb.nSp.keySet().iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      if (i != 0) {}
      for (String str1 = "";; str1 = "&")
      {
        localStringBuilder.append(str1).append(URLEncoder.encode(str2, "utf-8")).append('=').append(URLEncoder.encode((String)paramb.nSp.get(str2), "utf-8"));
        i = 0;
        break;
      }
    }
    paramOutputStream.write(localStringBuilder.toString().getBytes());
    GMTrace.o(5474204254208L, 40786);
  }
  
  /* Error */
  public final h.c a(String paramString1, String paramString2, h.b paramb, h.a parama)
  {
    // Byte code:
    //   0: ldc2_w 100
    //   3: ldc 102
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: ldc 104
    //   10: new 28	java/lang/StringBuilder
    //   13: dup
    //   14: ldc 106
    //   16: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: aload_2
    //   20: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: ldc 111
    //   25: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_3
    //   29: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokestatic 120	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   38: aconst_null
    //   39: astore 15
    //   41: aconst_null
    //   42: astore 11
    //   44: aconst_null
    //   45: astore 12
    //   47: aconst_null
    //   48: astore 16
    //   50: aconst_null
    //   51: astore 14
    //   53: aconst_null
    //   54: astore 13
    //   56: iconst_0
    //   57: istore 6
    //   59: aload 16
    //   61: astore 8
    //   63: aload 15
    //   65: astore 9
    //   67: aload_3
    //   68: getfield 124	com/tencent/mm/plugin/qqmail/b/h$b:nSo	I
    //   71: ifne +794 -> 865
    //   74: aload 16
    //   76: astore 8
    //   78: aload 15
    //   80: astore 9
    //   82: aload_3
    //   83: getfield 23	com/tencent/mm/plugin/qqmail/b/h$b:nSp	Ljava/util/Map;
    //   86: astore 10
    //   88: aload 16
    //   90: astore 8
    //   92: aload 15
    //   94: astore 9
    //   96: aload_0
    //   97: aload_1
    //   98: aload_2
    //   99: aload 10
    //   101: invokestatic 128	com/tencent/mm/plugin/qqmail/b/x:c	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   104: aconst_null
    //   105: invokestatic 133	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
    //   108: putfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   111: aload 16
    //   113: astore 8
    //   115: aload 15
    //   117: astore 9
    //   119: aload_0
    //   120: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   123: getstatic 138	com/tencent/mm/plugin/qqmail/b/x:itI	I
    //   126: invokevirtual 144	com/tencent/mm/network/u:setConnectTimeout	(I)V
    //   129: aload 16
    //   131: astore 8
    //   133: aload 15
    //   135: astore 9
    //   137: aload_0
    //   138: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   141: astore 10
    //   143: aload 16
    //   145: astore 8
    //   147: aload 15
    //   149: astore 9
    //   151: aload_3
    //   152: getfield 124	com/tencent/mm/plugin/qqmail/b/h$b:nSo	I
    //   155: ifne +716 -> 871
    //   158: ldc -110
    //   160: astore_1
    //   161: aload 16
    //   163: astore 8
    //   165: aload 15
    //   167: astore 9
    //   169: aload 10
    //   171: aload_1
    //   172: invokevirtual 149	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
    //   175: aload 16
    //   177: astore 8
    //   179: aload 15
    //   181: astore 9
    //   183: aload_0
    //   184: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   187: invokevirtual 152	com/tencent/mm/network/u:OK	()V
    //   190: aload 16
    //   192: astore 8
    //   194: aload 15
    //   196: astore 9
    //   198: aload_0
    //   199: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   202: invokevirtual 155	com/tencent/mm/network/u:OL	()V
    //   205: aload 16
    //   207: astore 8
    //   209: aload 15
    //   211: astore 9
    //   213: aload_0
    //   214: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   217: iconst_0
    //   218: invokevirtual 159	com/tencent/mm/network/u:setUseCaches	(Z)V
    //   221: aload 16
    //   223: astore 8
    //   225: aload 15
    //   227: astore 9
    //   229: aload_0
    //   230: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   233: ldc -95
    //   235: getstatic 165	com/tencent/mm/plugin/qqmail/b/x:log	Ljava/lang/String;
    //   238: invokevirtual 168	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   241: aload 16
    //   243: astore 8
    //   245: aload 15
    //   247: astore 9
    //   249: aload_0
    //   250: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   253: ldc -86
    //   255: getstatic 173	com/tencent/mm/plugin/qqmail/b/x:host	Ljava/lang/String;
    //   258: invokevirtual 168	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   261: aload 16
    //   263: astore 8
    //   265: aload 15
    //   267: astore 9
    //   269: ldc -81
    //   271: ldc -79
    //   273: invokestatic 182	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   276: pop
    //   277: aload 16
    //   279: astore 8
    //   281: aload 15
    //   283: astore 9
    //   285: aload_0
    //   286: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   289: ldc -72
    //   291: ldc 64
    //   293: invokevirtual 168	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   296: aload 16
    //   298: astore 8
    //   300: aload 15
    //   302: astore 9
    //   304: aload_0
    //   305: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   308: ldc -70
    //   310: ldc -68
    //   312: invokevirtual 168	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   315: aload 16
    //   317: astore 8
    //   319: aload 15
    //   321: astore 9
    //   323: aload_0
    //   324: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   327: ldc -66
    //   329: aload_3
    //   330: getfield 193	com/tencent/mm/plugin/qqmail/b/h$b:nSq	Ljava/util/Map;
    //   333: invokestatic 197	com/tencent/mm/plugin/qqmail/b/x:G	(Ljava/util/Map;)Ljava/lang/String;
    //   336: invokevirtual 168	com/tencent/mm/network/u:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   339: aload 16
    //   341: astore 8
    //   343: aload 15
    //   345: astore 9
    //   347: aload_0
    //   348: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   351: invokevirtual 200	com/tencent/mm/network/u:connect	()V
    //   354: aload 16
    //   356: astore 8
    //   358: aload 15
    //   360: astore 9
    //   362: aload_0
    //   363: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   366: invokevirtual 204	com/tencent/mm/network/u:getOutputStream	()Ljava/io/OutputStream;
    //   369: astore_1
    //   370: aload 14
    //   372: astore 11
    //   374: aload_3
    //   375: getfield 124	com/tencent/mm/plugin/qqmail/b/h$b:nSo	I
    //   378: iconst_1
    //   379: if_icmpne +12 -> 391
    //   382: aload 14
    //   384: astore 11
    //   386: aload_3
    //   387: aload_1
    //   388: invokestatic 206	com/tencent/mm/plugin/qqmail/b/x:a	(Lcom/tencent/mm/plugin/qqmail/b/h$b;Ljava/io/OutputStream;)V
    //   391: aload 14
    //   393: astore 11
    //   395: aload_1
    //   396: invokevirtual 209	java/io/OutputStream:flush	()V
    //   399: aload 14
    //   401: astore 11
    //   403: aload_0
    //   404: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   407: invokevirtual 213	com/tencent/mm/network/u:getResponseCode	()I
    //   410: istore 5
    //   412: aload 13
    //   414: astore 12
    //   416: aload 14
    //   418: astore 11
    //   420: aload_0
    //   421: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   424: ldc -41
    //   426: invokevirtual 219	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   429: astore 15
    //   431: aload 13
    //   433: astore 12
    //   435: aload 14
    //   437: astore 11
    //   439: aload_0
    //   440: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   443: ldc -35
    //   445: invokevirtual 219	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   448: astore 9
    //   450: aload 13
    //   452: astore 12
    //   454: aload 14
    //   456: astore 11
    //   458: aload_0
    //   459: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   462: ldc -33
    //   464: invokevirtual 219	com/tencent/mm/network/u:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   467: astore 8
    //   469: aload 8
    //   471: ifnull +407 -> 878
    //   474: aload 13
    //   476: astore 12
    //   478: aload 14
    //   480: astore 11
    //   482: aload 8
    //   484: ldc -31
    //   486: invokevirtual 229	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   489: ifeq +389 -> 878
    //   492: aload 13
    //   494: astore 12
    //   496: aload 14
    //   498: astore 11
    //   500: aload_2
    //   501: ldc -25
    //   503: invokevirtual 229	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   506: ifeq +372 -> 878
    //   509: iconst_1
    //   510: istore 6
    //   512: aload 13
    //   514: astore 12
    //   516: aload 14
    //   518: astore 11
    //   520: aload_0
    //   521: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   524: invokevirtual 235	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
    //   527: astore 8
    //   529: aload 9
    //   531: ifnull +946 -> 1477
    //   534: aload 9
    //   536: ldc -19
    //   538: invokevirtual 229	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   541: ifeq +936 -> 1477
    //   544: new 239	java/util/zip/GZIPInputStream
    //   547: dup
    //   548: aload 8
    //   550: invokespecial 242	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   553: astore 9
    //   555: aload 9
    //   557: astore 8
    //   559: aconst_null
    //   560: astore 12
    //   562: aconst_null
    //   563: astore 11
    //   565: iload 6
    //   567: ifeq +343 -> 910
    //   570: aload 11
    //   572: astore 10
    //   574: aload 12
    //   576: astore 9
    //   578: getstatic 245	com/tencent/mm/plugin/qqmail/b/x:nSn	Ljava/lang/String;
    //   581: astore 13
    //   583: aload 11
    //   585: astore 10
    //   587: aload 12
    //   589: astore 9
    //   591: new 28	java/lang/StringBuilder
    //   594: dup
    //   595: invokespecial 32	java/lang/StringBuilder:<init>	()V
    //   598: astore 14
    //   600: aload 11
    //   602: astore 10
    //   604: aload 12
    //   606: astore 9
    //   608: aload_3
    //   609: getfield 23	com/tencent/mm/plugin/qqmail/b/h$b:nSp	Ljava/util/Map;
    //   612: ldc -9
    //   614: invokeinterface 77 2 0
    //   619: ifnonnull +265 -> 884
    //   622: aload 11
    //   624: astore 10
    //   626: aload 12
    //   628: astore 9
    //   630: invokestatic 251	java/lang/System:currentTimeMillis	()J
    //   633: invokestatic 257	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   636: astore_3
    //   637: aload 11
    //   639: astore 10
    //   641: aload 12
    //   643: astore 9
    //   645: new 259	java/io/FileOutputStream
    //   648: dup
    //   649: new 261	java/io/File
    //   652: dup
    //   653: aload 13
    //   655: aload 14
    //   657: aload_3
    //   658: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   661: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   664: invokespecial 263	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   667: iconst_1
    //   668: invokespecial 266	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   671: astore_3
    //   672: aload_3
    //   673: astore 10
    //   675: aload_3
    //   676: astore 9
    //   678: sipush 1024
    //   681: newarray <illegal type>
    //   683: astore 11
    //   685: aload_3
    //   686: astore 10
    //   688: aload_3
    //   689: astore 9
    //   691: aload 8
    //   693: aload 11
    //   695: invokevirtual 272	java/io/InputStream:read	([B)I
    //   698: istore 7
    //   700: iload 7
    //   702: ifle +227 -> 929
    //   705: aload_3
    //   706: astore 10
    //   708: aload_3
    //   709: astore 9
    //   711: aload_3
    //   712: aload 11
    //   714: iconst_0
    //   715: iload 7
    //   717: invokevirtual 275	java/io/OutputStream:write	([BII)V
    //   720: aload_3
    //   721: astore 10
    //   723: aload_3
    //   724: astore 9
    //   726: aload_3
    //   727: invokevirtual 209	java/io/OutputStream:flush	()V
    //   730: aload_3
    //   731: astore 10
    //   733: aload_3
    //   734: astore 9
    //   736: aload 4
    //   738: invokeinterface 280 1 0
    //   743: goto -58 -> 685
    //   746: astore_2
    //   747: aload 10
    //   749: astore 9
    //   751: ldc 104
    //   753: aload_2
    //   754: ldc 58
    //   756: iconst_0
    //   757: anewarray 282	java/lang/Object
    //   760: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   763: iload 5
    //   765: ifne +371 -> 1136
    //   768: sipush 503
    //   771: istore 6
    //   773: aload 10
    //   775: astore 9
    //   777: new 288	com/tencent/mm/plugin/qqmail/b/h$c
    //   780: dup
    //   781: iload 6
    //   783: aconst_null
    //   784: aconst_null
    //   785: invokespecial 291	com/tencent/mm/plugin/qqmail/b/h$c:<init>	(ILjava/util/Map;Ljava/lang/String;)V
    //   788: astore_2
    //   789: aload 10
    //   791: ifnull +29 -> 820
    //   794: aload 8
    //   796: astore 12
    //   798: aload 8
    //   800: astore 11
    //   802: aload 10
    //   804: invokevirtual 209	java/io/OutputStream:flush	()V
    //   807: aload 8
    //   809: astore 12
    //   811: aload 8
    //   813: astore 11
    //   815: aload 10
    //   817: invokevirtual 294	java/io/OutputStream:close	()V
    //   820: aload_1
    //   821: ifnull +7 -> 828
    //   824: aload_1
    //   825: invokevirtual 294	java/io/OutputStream:close	()V
    //   828: aload 8
    //   830: ifnull +8 -> 838
    //   833: aload 8
    //   835: invokevirtual 295	java/io/InputStream:close	()V
    //   838: aload_0
    //   839: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   842: ifnull +13 -> 855
    //   845: aload_0
    //   846: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   849: getfield 299	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   852: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   855: ldc2_w 100
    //   858: ldc 102
    //   860: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   863: aload_2
    //   864: areturn
    //   865: aconst_null
    //   866: astore 10
    //   868: goto -780 -> 88
    //   871: ldc_w 306
    //   874: astore_1
    //   875: goto -714 -> 161
    //   878: iconst_0
    //   879: istore 6
    //   881: goto -369 -> 512
    //   884: aload 11
    //   886: astore 10
    //   888: aload 12
    //   890: astore 9
    //   892: aload_3
    //   893: getfield 23	com/tencent/mm/plugin/qqmail/b/h$b:nSp	Ljava/util/Map;
    //   896: ldc -9
    //   898: invokeinterface 77 2 0
    //   903: checkcast 308	java/io/Serializable
    //   906: astore_3
    //   907: goto -270 -> 637
    //   910: aload 11
    //   912: astore 10
    //   914: aload 12
    //   916: astore 9
    //   918: new 310	java/io/ByteArrayOutputStream
    //   921: dup
    //   922: invokespecial 311	java/io/ByteArrayOutputStream:<init>	()V
    //   925: astore_3
    //   926: goto -254 -> 672
    //   929: aload_3
    //   930: astore 10
    //   932: aload_3
    //   933: astore 9
    //   935: aload 15
    //   937: invokestatic 315	com/tencent/mm/plugin/qqmail/b/x:EV	(Ljava/lang/String;)Ljava/util/Map;
    //   940: astore 11
    //   942: iload 6
    //   944: ifeq +135 -> 1079
    //   947: ldc 58
    //   949: astore 4
    //   951: aload_3
    //   952: astore 10
    //   954: aload_3
    //   955: astore 9
    //   957: new 288	com/tencent/mm/plugin/qqmail/b/h$c
    //   960: dup
    //   961: iload 5
    //   963: aload 11
    //   965: aload 4
    //   967: invokespecial 291	com/tencent/mm/plugin/qqmail/b/h$c:<init>	(ILjava/util/Map;Ljava/lang/String;)V
    //   970: astore 4
    //   972: aload_3
    //   973: astore 10
    //   975: aload_3
    //   976: astore 9
    //   978: ldc 104
    //   980: new 28	java/lang/StringBuilder
    //   983: dup
    //   984: ldc 106
    //   986: invokespecial 109	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   989: aload_2
    //   990: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   993: ldc 111
    //   995: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   998: aload 4
    //   1000: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1003: invokevirtual 83	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1006: invokestatic 120	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1009: aload 8
    //   1011: astore 12
    //   1013: aload 8
    //   1015: astore 11
    //   1017: aload_3
    //   1018: invokevirtual 209	java/io/OutputStream:flush	()V
    //   1021: aload 8
    //   1023: astore 12
    //   1025: aload 8
    //   1027: astore 11
    //   1029: aload_3
    //   1030: invokevirtual 294	java/io/OutputStream:close	()V
    //   1033: aload_1
    //   1034: ifnull +7 -> 1041
    //   1037: aload_1
    //   1038: invokevirtual 294	java/io/OutputStream:close	()V
    //   1041: aload 8
    //   1043: ifnull +8 -> 1051
    //   1046: aload 8
    //   1048: invokevirtual 295	java/io/InputStream:close	()V
    //   1051: aload_0
    //   1052: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   1055: ifnull +13 -> 1068
    //   1058: aload_0
    //   1059: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   1062: getfield 299	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   1065: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   1068: ldc2_w 100
    //   1071: ldc 102
    //   1073: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1076: aload 4
    //   1078: areturn
    //   1079: aload_3
    //   1080: astore 10
    //   1082: aload_3
    //   1083: astore 9
    //   1085: new 56	java/lang/String
    //   1088: dup
    //   1089: aload_3
    //   1090: checkcast 310	java/io/ByteArrayOutputStream
    //   1093: invokevirtual 318	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   1096: invokespecial 320	java/lang/String:<init>	([B)V
    //   1099: astore 4
    //   1101: goto -150 -> 951
    //   1104: astore_1
    //   1105: ldc 104
    //   1107: aload_1
    //   1108: ldc 58
    //   1110: iconst_0
    //   1111: anewarray 282	java/lang/Object
    //   1114: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1117: goto -76 -> 1041
    //   1120: astore_1
    //   1121: ldc 104
    //   1123: aload_1
    //   1124: ldc 58
    //   1126: iconst_0
    //   1127: anewarray 282	java/lang/Object
    //   1130: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1133: goto -82 -> 1051
    //   1136: sipush 500
    //   1139: istore 6
    //   1141: goto -368 -> 773
    //   1144: astore_1
    //   1145: ldc 104
    //   1147: aload_1
    //   1148: ldc 58
    //   1150: iconst_0
    //   1151: anewarray 282	java/lang/Object
    //   1154: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1157: goto -329 -> 828
    //   1160: astore_1
    //   1161: ldc 104
    //   1163: aload_1
    //   1164: ldc 58
    //   1166: iconst_0
    //   1167: anewarray 282	java/lang/Object
    //   1170: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1173: goto -335 -> 838
    //   1176: astore_2
    //   1177: aload 9
    //   1179: ifnull +29 -> 1208
    //   1182: aload 8
    //   1184: astore 12
    //   1186: aload 8
    //   1188: astore 11
    //   1190: aload 9
    //   1192: invokevirtual 209	java/io/OutputStream:flush	()V
    //   1195: aload 8
    //   1197: astore 12
    //   1199: aload 8
    //   1201: astore 11
    //   1203: aload 9
    //   1205: invokevirtual 294	java/io/OutputStream:close	()V
    //   1208: aload 8
    //   1210: astore 12
    //   1212: aload 8
    //   1214: astore 11
    //   1216: aload_2
    //   1217: athrow
    //   1218: astore_3
    //   1219: aload 12
    //   1221: astore_2
    //   1222: aload_2
    //   1223: astore 8
    //   1225: aload_1
    //   1226: astore 9
    //   1228: ldc 104
    //   1230: aload_3
    //   1231: ldc 58
    //   1233: iconst_0
    //   1234: anewarray 282	java/lang/Object
    //   1237: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1240: iload 5
    //   1242: ifne +69 -> 1311
    //   1245: sipush 503
    //   1248: istore 5
    //   1250: aload_2
    //   1251: astore 8
    //   1253: aload_1
    //   1254: astore 9
    //   1256: new 288	com/tencent/mm/plugin/qqmail/b/h$c
    //   1259: dup
    //   1260: iload 5
    //   1262: aconst_null
    //   1263: aconst_null
    //   1264: invokespecial 291	com/tencent/mm/plugin/qqmail/b/h$c:<init>	(ILjava/util/Map;Ljava/lang/String;)V
    //   1267: astore_3
    //   1268: aload_1
    //   1269: ifnull +7 -> 1276
    //   1272: aload_1
    //   1273: invokevirtual 294	java/io/OutputStream:close	()V
    //   1276: aload_2
    //   1277: ifnull +7 -> 1284
    //   1280: aload_2
    //   1281: invokevirtual 295	java/io/InputStream:close	()V
    //   1284: aload_0
    //   1285: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   1288: ifnull +13 -> 1301
    //   1291: aload_0
    //   1292: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   1295: getfield 299	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   1298: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   1301: ldc2_w 100
    //   1304: ldc 102
    //   1306: invokestatic 26	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1309: aload_3
    //   1310: areturn
    //   1311: sipush 500
    //   1314: istore 5
    //   1316: goto -66 -> 1250
    //   1319: astore_1
    //   1320: ldc 104
    //   1322: aload_1
    //   1323: ldc 58
    //   1325: iconst_0
    //   1326: anewarray 282	java/lang/Object
    //   1329: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1332: goto -56 -> 1276
    //   1335: astore_1
    //   1336: ldc 104
    //   1338: aload_1
    //   1339: ldc 58
    //   1341: iconst_0
    //   1342: anewarray 282	java/lang/Object
    //   1345: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1348: goto -64 -> 1284
    //   1351: astore_1
    //   1352: aload 9
    //   1354: ifnull +8 -> 1362
    //   1357: aload 9
    //   1359: invokevirtual 294	java/io/OutputStream:close	()V
    //   1362: aload 8
    //   1364: ifnull +8 -> 1372
    //   1367: aload 8
    //   1369: invokevirtual 295	java/io/InputStream:close	()V
    //   1372: aload_0
    //   1373: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   1376: ifnull +13 -> 1389
    //   1379: aload_0
    //   1380: getfield 135	com/tencent/mm/plugin/qqmail/b/x:nTQ	Lcom/tencent/mm/network/u;
    //   1383: getfield 299	com/tencent/mm/network/u:hhh	Ljava/net/HttpURLConnection;
    //   1386: invokevirtual 304	java/net/HttpURLConnection:disconnect	()V
    //   1389: aload_1
    //   1390: athrow
    //   1391: astore_2
    //   1392: ldc 104
    //   1394: aload_2
    //   1395: ldc 58
    //   1397: iconst_0
    //   1398: anewarray 282	java/lang/Object
    //   1401: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1404: goto -42 -> 1362
    //   1407: astore_2
    //   1408: ldc 104
    //   1410: aload_2
    //   1411: ldc 58
    //   1413: iconst_0
    //   1414: anewarray 282	java/lang/Object
    //   1417: invokestatic 286	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1420: goto -48 -> 1372
    //   1423: astore_2
    //   1424: aload_1
    //   1425: astore 9
    //   1427: aload_2
    //   1428: astore_1
    //   1429: aload 11
    //   1431: astore 8
    //   1433: goto -81 -> 1352
    //   1436: astore_2
    //   1437: aload_1
    //   1438: astore 9
    //   1440: aload_2
    //   1441: astore_1
    //   1442: goto -90 -> 1352
    //   1445: astore_3
    //   1446: iload 6
    //   1448: istore 5
    //   1450: aload 12
    //   1452: astore_2
    //   1453: aload 11
    //   1455: astore_1
    //   1456: goto -234 -> 1222
    //   1459: astore_3
    //   1460: iload 6
    //   1462: istore 5
    //   1464: aload 12
    //   1466: astore_2
    //   1467: goto -245 -> 1222
    //   1470: astore_3
    //   1471: aload 8
    //   1473: astore_2
    //   1474: goto -252 -> 1222
    //   1477: goto -918 -> 559
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1480	0	this	x
    //   0	1480	1	paramString1	String
    //   0	1480	2	paramString2	String
    //   0	1480	3	paramb	h.b
    //   0	1480	4	parama	h.a
    //   410	1053	5	i	int
    //   57	1404	6	j	int
    //   698	18	7	k	int
    //   61	1411	8	localObject1	Object
    //   65	1374	9	localObject2	Object
    //   86	995	10	localObject3	Object
    //   42	1412	11	localObject4	Object
    //   45	1420	12	localObject5	Object
    //   54	600	13	str1	String
    //   51	605	14	localStringBuilder	StringBuilder
    //   39	897	15	str2	String
    //   48	307	16	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   578	583	746	java/lang/Exception
    //   591	600	746	java/lang/Exception
    //   608	622	746	java/lang/Exception
    //   630	637	746	java/lang/Exception
    //   645	672	746	java/lang/Exception
    //   678	685	746	java/lang/Exception
    //   691	700	746	java/lang/Exception
    //   711	720	746	java/lang/Exception
    //   726	730	746	java/lang/Exception
    //   736	743	746	java/lang/Exception
    //   892	907	746	java/lang/Exception
    //   918	926	746	java/lang/Exception
    //   935	942	746	java/lang/Exception
    //   957	972	746	java/lang/Exception
    //   978	1009	746	java/lang/Exception
    //   1085	1101	746	java/lang/Exception
    //   1037	1041	1104	java/io/IOException
    //   1046	1051	1120	java/io/IOException
    //   824	828	1144	java/io/IOException
    //   833	838	1160	java/io/IOException
    //   578	583	1176	finally
    //   591	600	1176	finally
    //   608	622	1176	finally
    //   630	637	1176	finally
    //   645	672	1176	finally
    //   678	685	1176	finally
    //   691	700	1176	finally
    //   711	720	1176	finally
    //   726	730	1176	finally
    //   736	743	1176	finally
    //   751	763	1176	finally
    //   777	789	1176	finally
    //   892	907	1176	finally
    //   918	926	1176	finally
    //   935	942	1176	finally
    //   957	972	1176	finally
    //   978	1009	1176	finally
    //   1085	1101	1176	finally
    //   420	431	1218	java/lang/Exception
    //   439	450	1218	java/lang/Exception
    //   458	469	1218	java/lang/Exception
    //   482	492	1218	java/lang/Exception
    //   500	509	1218	java/lang/Exception
    //   520	529	1218	java/lang/Exception
    //   802	807	1218	java/lang/Exception
    //   815	820	1218	java/lang/Exception
    //   1017	1021	1218	java/lang/Exception
    //   1029	1033	1218	java/lang/Exception
    //   1190	1195	1218	java/lang/Exception
    //   1203	1208	1218	java/lang/Exception
    //   1216	1218	1218	java/lang/Exception
    //   1272	1276	1319	java/io/IOException
    //   1280	1284	1335	java/io/IOException
    //   67	74	1351	finally
    //   82	88	1351	finally
    //   96	111	1351	finally
    //   119	129	1351	finally
    //   137	143	1351	finally
    //   151	158	1351	finally
    //   169	175	1351	finally
    //   183	190	1351	finally
    //   198	205	1351	finally
    //   213	221	1351	finally
    //   229	241	1351	finally
    //   249	261	1351	finally
    //   269	277	1351	finally
    //   285	296	1351	finally
    //   304	315	1351	finally
    //   323	339	1351	finally
    //   347	354	1351	finally
    //   362	370	1351	finally
    //   1228	1240	1351	finally
    //   1256	1268	1351	finally
    //   1357	1362	1391	java/io/IOException
    //   1367	1372	1407	java/io/IOException
    //   374	382	1423	finally
    //   386	391	1423	finally
    //   395	399	1423	finally
    //   403	412	1423	finally
    //   420	431	1423	finally
    //   439	450	1423	finally
    //   458	469	1423	finally
    //   482	492	1423	finally
    //   500	509	1423	finally
    //   520	529	1423	finally
    //   802	807	1423	finally
    //   815	820	1423	finally
    //   1017	1021	1423	finally
    //   1029	1033	1423	finally
    //   1190	1195	1423	finally
    //   1203	1208	1423	finally
    //   1216	1218	1423	finally
    //   534	555	1436	finally
    //   67	74	1445	java/lang/Exception
    //   82	88	1445	java/lang/Exception
    //   96	111	1445	java/lang/Exception
    //   119	129	1445	java/lang/Exception
    //   137	143	1445	java/lang/Exception
    //   151	158	1445	java/lang/Exception
    //   169	175	1445	java/lang/Exception
    //   183	190	1445	java/lang/Exception
    //   198	205	1445	java/lang/Exception
    //   213	221	1445	java/lang/Exception
    //   229	241	1445	java/lang/Exception
    //   249	261	1445	java/lang/Exception
    //   269	277	1445	java/lang/Exception
    //   285	296	1445	java/lang/Exception
    //   304	315	1445	java/lang/Exception
    //   323	339	1445	java/lang/Exception
    //   347	354	1445	java/lang/Exception
    //   362	370	1445	java/lang/Exception
    //   374	382	1459	java/lang/Exception
    //   386	391	1459	java/lang/Exception
    //   395	399	1459	java/lang/Exception
    //   403	412	1459	java/lang/Exception
    //   534	555	1470	java/lang/Exception
  }
  
  public final void cancel()
  {
    GMTrace.i(5474070036480L, 40785);
    w.d("MicroMsg.URLConnectionUtil", "cancel conection.");
    if (this.nTQ != null) {
      this.nTQ.hhh.disconnect();
    }
    GMTrace.o(5474070036480L, 40785);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */