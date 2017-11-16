package com.tencent.mm.sdk.platformtools;

import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import java.io.File;

public final class bf
{
  private static long vli;
  private static long vlj;
  private static long vlk;
  private static long vll;
  private static long vlm;
  private static long vln;
  private static long vlo;
  private static long vlp;
  private static long vlq;
  private static long vlr;
  private static long vls;
  private static long vlt;
  private static long vlu;
  private static long vlv;
  private static long vlw;
  private static long vlx;
  private static final File vly;
  private static final File vlz;
  
  static
  {
    Object localObject2 = null;
    GMTrace.i(13880126341120L, 103415);
    Object localObject1 = new File("/proc/" + Process.myPid() + "/net/dev");
    if (((File)localObject1).isFile()) {}
    for (;;)
    {
      vly = (File)localObject1;
      File localFile = new File("/proc/net/xt_qtaguid/stats");
      localObject1 = localObject2;
      if (localFile.isFile()) {
        localObject1 = localFile;
      }
      vlz = (File)localObject1;
      GMTrace.o(13880126341120L, 103415);
      return;
      localObject1 = null;
    }
  }
  
  public static long bQF()
  {
    GMTrace.i(13878784163840L, 103405);
    if (vls > 0L)
    {
      long l = vls;
      GMTrace.o(13878784163840L, 103405);
      return l;
    }
    GMTrace.o(13878784163840L, 103405);
    return 0L;
  }
  
  public static long bQG()
  {
    GMTrace.i(13878918381568L, 103406);
    if (vlt > 0L)
    {
      long l = vlt;
      GMTrace.o(13878918381568L, 103406);
      return l;
    }
    GMTrace.o(13878918381568L, 103406);
    return 0L;
  }
  
  public static long bQH()
  {
    GMTrace.i(13879052599296L, 103407);
    if (vlq > 0L)
    {
      long l = vlq;
      GMTrace.o(13879052599296L, 103407);
      return l;
    }
    GMTrace.o(13879052599296L, 103407);
    return 0L;
  }
  
  public static long bQI()
  {
    GMTrace.i(13879186817024L, 103408);
    if (vlr > 0L)
    {
      long l = vlr;
      GMTrace.o(13879186817024L, 103408);
      return l;
    }
    GMTrace.o(13879186817024L, 103408);
    return 0L;
  }
  
  public static long bQJ()
  {
    GMTrace.i(13879321034752L, 103409);
    if (vlw > 0L)
    {
      long l = vlw;
      GMTrace.o(13879321034752L, 103409);
      return l;
    }
    GMTrace.o(13879321034752L, 103409);
    return 0L;
  }
  
  public static long bQK()
  {
    GMTrace.i(13879455252480L, 103410);
    if (vlx > 0L)
    {
      long l = vlx;
      GMTrace.o(13879455252480L, 103410);
      return l;
    }
    GMTrace.o(13879455252480L, 103410);
    return 0L;
  }
  
  public static long bQL()
  {
    GMTrace.i(13879589470208L, 103411);
    if (vlu > 0L)
    {
      long l = vlu;
      GMTrace.o(13879589470208L, 103411);
      return l;
    }
    GMTrace.o(13879589470208L, 103411);
    return 0L;
  }
  
  public static long bQM()
  {
    GMTrace.i(13879723687936L, 103412);
    if (vlv > 0L)
    {
      long l = vlv;
      GMTrace.o(13879723687936L, 103412);
      return l;
    }
    GMTrace.o(13879723687936L, 103412);
    return 0L;
  }
  
  public static void reset()
  {
    GMTrace.i(13879857905664L, 103413);
    vli = -1L;
    vlj = -1L;
    vlk = -1L;
    vll = -1L;
    vln = -1L;
    vlm = -1L;
    vlp = -1L;
    vlo = -1L;
    update();
    GMTrace.o(13879857905664L, 103413);
  }
  
  /* Error */
  public static void update()
  {
    // Byte code:
    //   0: ldc2_w 156
    //   3: ldc -98
    //   5: invokestatic 35	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: lconst_0
    //   9: lstore_3
    //   10: lconst_0
    //   11: lstore_1
    //   12: getstatic 71	com/tencent/mm/sdk/platformtools/bf:vly	Ljava/io/File;
    //   15: ifnull +649 -> 664
    //   18: new 160	java/util/Scanner
    //   21: dup
    //   22: getstatic 71	com/tencent/mm/sdk/platformtools/bf:vly	Ljava/io/File;
    //   25: invokespecial 163	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   28: astore 14
    //   30: aload 14
    //   32: astore 13
    //   34: aload 14
    //   36: invokevirtual 166	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   39: pop
    //   40: aload 14
    //   42: astore 13
    //   44: aload 14
    //   46: invokevirtual 166	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   49: pop
    //   50: lconst_0
    //   51: lstore 5
    //   53: lconst_0
    //   54: lstore 7
    //   56: aload 14
    //   58: astore 13
    //   60: aload 14
    //   62: invokevirtual 169	java/util/Scanner:hasNext	()Z
    //   65: ifeq +165 -> 230
    //   68: aload 14
    //   70: astore 13
    //   72: aload 14
    //   74: invokevirtual 166	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   77: ldc -85
    //   79: invokevirtual 177	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   82: astore 15
    //   84: aload 14
    //   86: astore 13
    //   88: aload 15
    //   90: iconst_0
    //   91: aaload
    //   92: invokevirtual 180	java/lang/String:length	()I
    //   95: ifne +1227 -> 1322
    //   98: iconst_1
    //   99: istore_0
    //   100: aload 14
    //   102: astore 13
    //   104: aload 15
    //   106: iload_0
    //   107: iconst_0
    //   108: iadd
    //   109: aaload
    //   110: ldc -74
    //   112: invokevirtual 186	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   115: ifne -59 -> 56
    //   118: aload 14
    //   120: astore 13
    //   122: aload 15
    //   124: iload_0
    //   125: iconst_0
    //   126: iadd
    //   127: aaload
    //   128: ldc -68
    //   130: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   133: ifne +21 -> 154
    //   136: aload 14
    //   138: astore 13
    //   140: aload 15
    //   142: iload_0
    //   143: iconst_0
    //   144: iadd
    //   145: aaload
    //   146: ldc -62
    //   148: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   151: ifeq +39 -> 190
    //   154: aload 14
    //   156: astore 13
    //   158: lload_3
    //   159: aload 15
    //   161: iload_0
    //   162: bipush 9
    //   164: iadd
    //   165: aaload
    //   166: invokestatic 200	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   169: ladd
    //   170: lstore_3
    //   171: aload 14
    //   173: astore 13
    //   175: lload_1
    //   176: aload 15
    //   178: iload_0
    //   179: iconst_1
    //   180: iadd
    //   181: aaload
    //   182: invokestatic 200	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   185: ladd
    //   186: lstore_1
    //   187: goto -131 -> 56
    //   190: aload 14
    //   192: astore 13
    //   194: lload 7
    //   196: aload 15
    //   198: iload_0
    //   199: bipush 9
    //   201: iadd
    //   202: aaload
    //   203: invokestatic 200	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   206: ladd
    //   207: lstore 7
    //   209: aload 14
    //   211: astore 13
    //   213: lload 5
    //   215: aload 15
    //   217: iload_0
    //   218: iconst_1
    //   219: iadd
    //   220: aaload
    //   221: invokestatic 200	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   224: ladd
    //   225: lstore 5
    //   227: goto -171 -> 56
    //   230: aload 14
    //   232: astore 13
    //   234: aload 14
    //   236: invokevirtual 203	java/util/Scanner:close	()V
    //   239: aconst_null
    //   240: astore 14
    //   242: aload 14
    //   244: astore 13
    //   246: getstatic 136	com/tencent/mm/sdk/platformtools/bf:vli	J
    //   249: lconst_0
    //   250: lcmp
    //   251: ifge +33 -> 284
    //   254: aload 14
    //   256: astore 13
    //   258: lload_3
    //   259: putstatic 136	com/tencent/mm/sdk/platformtools/bf:vli	J
    //   262: aload 14
    //   264: astore 13
    //   266: ldc -51
    //   268: ldc -49
    //   270: iconst_1
    //   271: anewarray 4	java/lang/Object
    //   274: dup
    //   275: iconst_0
    //   276: lload_3
    //   277: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   280: aastore
    //   281: invokestatic 217	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: aload 14
    //   286: astore 13
    //   288: getstatic 138	com/tencent/mm/sdk/platformtools/bf:vlj	J
    //   291: lconst_0
    //   292: lcmp
    //   293: ifge +33 -> 326
    //   296: aload 14
    //   298: astore 13
    //   300: lload_1
    //   301: putstatic 138	com/tencent/mm/sdk/platformtools/bf:vlj	J
    //   304: aload 14
    //   306: astore 13
    //   308: ldc -51
    //   310: ldc -37
    //   312: iconst_1
    //   313: anewarray 4	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: lload_1
    //   319: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   322: aastore
    //   323: invokestatic 217	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: aload 14
    //   328: astore 13
    //   330: getstatic 140	com/tencent/mm/sdk/platformtools/bf:vlk	J
    //   333: lconst_0
    //   334: lcmp
    //   335: ifge +35 -> 370
    //   338: aload 14
    //   340: astore 13
    //   342: lload 7
    //   344: putstatic 140	com/tencent/mm/sdk/platformtools/bf:vlk	J
    //   347: aload 14
    //   349: astore 13
    //   351: ldc -51
    //   353: ldc -35
    //   355: iconst_1
    //   356: anewarray 4	java/lang/Object
    //   359: dup
    //   360: iconst_0
    //   361: lload 7
    //   363: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   366: aastore
    //   367: invokestatic 217	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   370: aload 14
    //   372: astore 13
    //   374: getstatic 142	com/tencent/mm/sdk/platformtools/bf:vll	J
    //   377: lconst_0
    //   378: lcmp
    //   379: ifge +35 -> 414
    //   382: aload 14
    //   384: astore 13
    //   386: lload 5
    //   388: putstatic 142	com/tencent/mm/sdk/platformtools/bf:vll	J
    //   391: aload 14
    //   393: astore 13
    //   395: ldc -51
    //   397: ldc -33
    //   399: iconst_1
    //   400: anewarray 4	java/lang/Object
    //   403: dup
    //   404: iconst_0
    //   405: lload 5
    //   407: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   410: aastore
    //   411: invokestatic 217	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   414: aload 14
    //   416: astore 13
    //   418: lload 5
    //   420: getstatic 142	com/tencent/mm/sdk/platformtools/bf:vll	J
    //   423: lsub
    //   424: lconst_0
    //   425: lcmp
    //   426: ifge +30 -> 456
    //   429: aload 14
    //   431: astore 13
    //   433: ldc -51
    //   435: ldc -31
    //   437: iconst_1
    //   438: anewarray 4	java/lang/Object
    //   441: dup
    //   442: iconst_0
    //   443: lload 5
    //   445: getstatic 142	com/tencent/mm/sdk/platformtools/bf:vll	J
    //   448: lsub
    //   449: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   452: aastore
    //   453: invokestatic 217	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   456: aload 14
    //   458: astore 13
    //   460: lload 7
    //   462: getstatic 140	com/tencent/mm/sdk/platformtools/bf:vlk	J
    //   465: lsub
    //   466: lconst_0
    //   467: lcmp
    //   468: ifge +30 -> 498
    //   471: aload 14
    //   473: astore 13
    //   475: ldc -51
    //   477: ldc -31
    //   479: iconst_1
    //   480: anewarray 4	java/lang/Object
    //   483: dup
    //   484: iconst_0
    //   485: lload 7
    //   487: getstatic 140	com/tencent/mm/sdk/platformtools/bf:vlk	J
    //   490: lsub
    //   491: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   494: aastore
    //   495: invokestatic 217	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   498: aload 14
    //   500: astore 13
    //   502: lload_3
    //   503: getstatic 136	com/tencent/mm/sdk/platformtools/bf:vli	J
    //   506: lcmp
    //   507: iflt +833 -> 1340
    //   510: aload 14
    //   512: astore 13
    //   514: lload_3
    //   515: getstatic 136	com/tencent/mm/sdk/platformtools/bf:vli	J
    //   518: lsub
    //   519: lstore 9
    //   521: aload 14
    //   523: astore 13
    //   525: lload 9
    //   527: putstatic 98	com/tencent/mm/sdk/platformtools/bf:vlq	J
    //   530: aload 14
    //   532: astore 13
    //   534: lload_1
    //   535: getstatic 138	com/tencent/mm/sdk/platformtools/bf:vlj	J
    //   538: lcmp
    //   539: iflt +807 -> 1346
    //   542: aload 14
    //   544: astore 13
    //   546: lload_1
    //   547: getstatic 138	com/tencent/mm/sdk/platformtools/bf:vlj	J
    //   550: lsub
    //   551: lstore 9
    //   553: aload 14
    //   555: astore 13
    //   557: lload 9
    //   559: putstatic 104	com/tencent/mm/sdk/platformtools/bf:vlr	J
    //   562: aload 14
    //   564: astore 13
    //   566: lload 7
    //   568: getstatic 140	com/tencent/mm/sdk/platformtools/bf:vlk	J
    //   571: lcmp
    //   572: iflt +780 -> 1352
    //   575: aload 14
    //   577: astore 13
    //   579: lload 7
    //   581: getstatic 140	com/tencent/mm/sdk/platformtools/bf:vlk	J
    //   584: lsub
    //   585: lstore 9
    //   587: aload 14
    //   589: astore 13
    //   591: lload 9
    //   593: putstatic 86	com/tencent/mm/sdk/platformtools/bf:vls	J
    //   596: aload 14
    //   598: astore 13
    //   600: lload 5
    //   602: getstatic 142	com/tencent/mm/sdk/platformtools/bf:vll	J
    //   605: lcmp
    //   606: iflt +753 -> 1359
    //   609: aload 14
    //   611: astore 13
    //   613: lload 5
    //   615: getstatic 142	com/tencent/mm/sdk/platformtools/bf:vll	J
    //   618: lsub
    //   619: lstore 9
    //   621: aload 14
    //   623: astore 13
    //   625: lload 9
    //   627: putstatic 92	com/tencent/mm/sdk/platformtools/bf:vlt	J
    //   630: aload 14
    //   632: astore 13
    //   634: lload_3
    //   635: putstatic 136	com/tencent/mm/sdk/platformtools/bf:vli	J
    //   638: aload 14
    //   640: astore 13
    //   642: lload_1
    //   643: putstatic 138	com/tencent/mm/sdk/platformtools/bf:vlj	J
    //   646: aload 14
    //   648: astore 13
    //   650: lload 7
    //   652: putstatic 140	com/tencent/mm/sdk/platformtools/bf:vlk	J
    //   655: aload 14
    //   657: astore 13
    //   659: lload 5
    //   661: putstatic 142	com/tencent/mm/sdk/platformtools/bf:vll	J
    //   664: getstatic 75	com/tencent/mm/sdk/platformtools/bf:vlz	Ljava/io/File;
    //   667: ifnull +649 -> 1316
    //   670: invokestatic 228	android/os/Process:myUid	()I
    //   673: istore_0
    //   674: new 160	java/util/Scanner
    //   677: dup
    //   678: getstatic 75	com/tencent/mm/sdk/platformtools/bf:vlz	Ljava/io/File;
    //   681: invokespecial 163	java/util/Scanner:<init>	(Ljava/io/File;)V
    //   684: astore 14
    //   686: aload 14
    //   688: astore 13
    //   690: aload 14
    //   692: invokevirtual 166	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   695: pop
    //   696: lconst_0
    //   697: lstore 7
    //   699: lconst_0
    //   700: lstore 5
    //   702: lconst_0
    //   703: lstore_3
    //   704: lconst_0
    //   705: lstore_1
    //   706: aload 14
    //   708: astore 13
    //   710: aload 14
    //   712: invokevirtual 169	java/util/Scanner:hasNext	()Z
    //   715: ifeq +129 -> 844
    //   718: aload 14
    //   720: astore 13
    //   722: aload 14
    //   724: invokevirtual 166	java/util/Scanner:nextLine	()Ljava/lang/String;
    //   727: ldc -26
    //   729: invokevirtual 177	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   732: astore 15
    //   734: aload 14
    //   736: astore 13
    //   738: aload 15
    //   740: iconst_3
    //   741: aaload
    //   742: invokestatic 236	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   745: iload_0
    //   746: if_icmpne -40 -> 706
    //   749: aload 15
    //   751: iconst_1
    //   752: aaload
    //   753: astore 16
    //   755: aload 14
    //   757: astore 13
    //   759: aload 15
    //   761: iconst_5
    //   762: aaload
    //   763: invokestatic 200	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   766: lstore 11
    //   768: aload 14
    //   770: astore 13
    //   772: aload 15
    //   774: bipush 7
    //   776: aaload
    //   777: invokestatic 200	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   780: lstore 9
    //   782: aload 14
    //   784: astore 13
    //   786: aload 16
    //   788: ldc -68
    //   790: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   793: ifne +534 -> 1327
    //   796: aload 14
    //   798: astore 13
    //   800: aload 16
    //   802: ldc -62
    //   804: invokevirtual 192	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   807: ifeq +6 -> 813
    //   810: goto +517 -> 1327
    //   813: aload 14
    //   815: astore 13
    //   817: aload 16
    //   819: ldc -74
    //   821: invokevirtual 186	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   824: ifne -118 -> 706
    //   827: lload 7
    //   829: lload 11
    //   831: ladd
    //   832: lstore 7
    //   834: lload 5
    //   836: lload 9
    //   838: ladd
    //   839: lstore 5
    //   841: goto -135 -> 706
    //   844: aload 14
    //   846: astore 13
    //   848: getstatic 144	com/tencent/mm/sdk/platformtools/bf:vln	J
    //   851: lconst_0
    //   852: lcmp
    //   853: ifge +11 -> 864
    //   856: aload 14
    //   858: astore 13
    //   860: lload_3
    //   861: putstatic 144	com/tencent/mm/sdk/platformtools/bf:vln	J
    //   864: aload 14
    //   866: astore 13
    //   868: getstatic 146	com/tencent/mm/sdk/platformtools/bf:vlm	J
    //   871: lconst_0
    //   872: lcmp
    //   873: ifge +11 -> 884
    //   876: aload 14
    //   878: astore 13
    //   880: lload_1
    //   881: putstatic 146	com/tencent/mm/sdk/platformtools/bf:vlm	J
    //   884: aload 14
    //   886: astore 13
    //   888: getstatic 148	com/tencent/mm/sdk/platformtools/bf:vlp	J
    //   891: lconst_0
    //   892: lcmp
    //   893: ifge +12 -> 905
    //   896: aload 14
    //   898: astore 13
    //   900: lload 7
    //   902: putstatic 148	com/tencent/mm/sdk/platformtools/bf:vlp	J
    //   905: aload 14
    //   907: astore 13
    //   909: getstatic 150	com/tencent/mm/sdk/platformtools/bf:vlo	J
    //   912: lconst_0
    //   913: lcmp
    //   914: ifge +12 -> 926
    //   917: aload 14
    //   919: astore 13
    //   921: lload 5
    //   923: putstatic 150	com/tencent/mm/sdk/platformtools/bf:vlo	J
    //   926: aload 14
    //   928: astore 13
    //   930: lload_1
    //   931: getstatic 146	com/tencent/mm/sdk/platformtools/bf:vlm	J
    //   934: lcmp
    //   935: iflt +262 -> 1197
    //   938: aload 14
    //   940: astore 13
    //   942: lload_1
    //   943: getstatic 146	com/tencent/mm/sdk/platformtools/bf:vlm	J
    //   946: lsub
    //   947: lstore 9
    //   949: aload 14
    //   951: astore 13
    //   953: lload 9
    //   955: putstatic 122	com/tencent/mm/sdk/platformtools/bf:vlu	J
    //   958: aload 14
    //   960: astore 13
    //   962: lload_3
    //   963: getstatic 144	com/tencent/mm/sdk/platformtools/bf:vln	J
    //   966: lcmp
    //   967: iflt +236 -> 1203
    //   970: aload 14
    //   972: astore 13
    //   974: lload_3
    //   975: getstatic 144	com/tencent/mm/sdk/platformtools/bf:vln	J
    //   978: lsub
    //   979: lstore 9
    //   981: aload 14
    //   983: astore 13
    //   985: lload 9
    //   987: putstatic 128	com/tencent/mm/sdk/platformtools/bf:vlv	J
    //   990: aload 14
    //   992: astore 13
    //   994: lload 5
    //   996: getstatic 150	com/tencent/mm/sdk/platformtools/bf:vlo	J
    //   999: lcmp
    //   1000: iflt +209 -> 1209
    //   1003: aload 14
    //   1005: astore 13
    //   1007: lload 5
    //   1009: getstatic 150	com/tencent/mm/sdk/platformtools/bf:vlo	J
    //   1012: lsub
    //   1013: lstore 9
    //   1015: aload 14
    //   1017: astore 13
    //   1019: lload 9
    //   1021: putstatic 110	com/tencent/mm/sdk/platformtools/bf:vlw	J
    //   1024: aload 14
    //   1026: astore 13
    //   1028: lload 7
    //   1030: getstatic 148	com/tencent/mm/sdk/platformtools/bf:vlp	J
    //   1033: lcmp
    //   1034: iflt +182 -> 1216
    //   1037: aload 14
    //   1039: astore 13
    //   1041: lload 7
    //   1043: getstatic 148	com/tencent/mm/sdk/platformtools/bf:vlp	J
    //   1046: lsub
    //   1047: lstore 9
    //   1049: aload 14
    //   1051: astore 13
    //   1053: lload 9
    //   1055: putstatic 116	com/tencent/mm/sdk/platformtools/bf:vlx	J
    //   1058: aload 14
    //   1060: astore 13
    //   1062: lload_1
    //   1063: putstatic 146	com/tencent/mm/sdk/platformtools/bf:vlm	J
    //   1066: aload 14
    //   1068: astore 13
    //   1070: lload_3
    //   1071: putstatic 144	com/tencent/mm/sdk/platformtools/bf:vln	J
    //   1074: aload 14
    //   1076: astore 13
    //   1078: lload 5
    //   1080: putstatic 150	com/tencent/mm/sdk/platformtools/bf:vlo	J
    //   1083: aload 14
    //   1085: astore 13
    //   1087: lload 7
    //   1089: putstatic 148	com/tencent/mm/sdk/platformtools/bf:vlp	J
    //   1092: aload 14
    //   1094: ifnull +8 -> 1102
    //   1097: aload 14
    //   1099: invokevirtual 203	java/util/Scanner:close	()V
    //   1102: ldc -51
    //   1104: ldc -18
    //   1106: bipush 8
    //   1108: anewarray 4	java/lang/Object
    //   1111: dup
    //   1112: iconst_0
    //   1113: getstatic 92	com/tencent/mm/sdk/platformtools/bf:vlt	J
    //   1116: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1119: aastore
    //   1120: dup
    //   1121: iconst_1
    //   1122: getstatic 86	com/tencent/mm/sdk/platformtools/bf:vls	J
    //   1125: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1128: aastore
    //   1129: dup
    //   1130: iconst_2
    //   1131: getstatic 104	com/tencent/mm/sdk/platformtools/bf:vlr	J
    //   1134: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1137: aastore
    //   1138: dup
    //   1139: iconst_3
    //   1140: getstatic 98	com/tencent/mm/sdk/platformtools/bf:vlq	J
    //   1143: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1146: aastore
    //   1147: dup
    //   1148: iconst_4
    //   1149: getstatic 116	com/tencent/mm/sdk/platformtools/bf:vlx	J
    //   1152: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1155: aastore
    //   1156: dup
    //   1157: iconst_5
    //   1158: getstatic 110	com/tencent/mm/sdk/platformtools/bf:vlw	J
    //   1161: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1164: aastore
    //   1165: dup
    //   1166: bipush 6
    //   1168: getstatic 128	com/tencent/mm/sdk/platformtools/bf:vlv	J
    //   1171: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1174: aastore
    //   1175: dup
    //   1176: bipush 7
    //   1178: getstatic 122	com/tencent/mm/sdk/platformtools/bf:vlu	J
    //   1181: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1184: aastore
    //   1185: invokestatic 240	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1188: ldc2_w 156
    //   1191: ldc -98
    //   1193: invokestatic 78	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1196: return
    //   1197: lload_1
    //   1198: lstore 9
    //   1200: goto -251 -> 949
    //   1203: lload_3
    //   1204: lstore 9
    //   1206: goto -225 -> 981
    //   1209: lload 5
    //   1211: lstore 9
    //   1213: goto -198 -> 1015
    //   1216: lload 7
    //   1218: lstore 9
    //   1220: goto -171 -> 1049
    //   1223: aconst_null
    //   1224: astore 13
    //   1226: astore 14
    //   1228: ldc -51
    //   1230: aload 14
    //   1232: ldc -14
    //   1234: iconst_0
    //   1235: anewarray 4	java/lang/Object
    //   1238: invokestatic 246	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1241: aload 13
    //   1243: ifnull -141 -> 1102
    //   1246: aload 13
    //   1248: invokevirtual 203	java/util/Scanner:close	()V
    //   1251: goto -149 -> 1102
    //   1254: astore 14
    //   1256: aconst_null
    //   1257: astore 13
    //   1259: aload 13
    //   1261: ifnull +8 -> 1269
    //   1264: aload 13
    //   1266: invokevirtual 203	java/util/Scanner:close	()V
    //   1269: aload 14
    //   1271: athrow
    //   1272: astore 14
    //   1274: goto -15 -> 1259
    //   1277: astore 14
    //   1279: goto -20 -> 1259
    //   1282: astore 15
    //   1284: aload 14
    //   1286: astore 13
    //   1288: aload 15
    //   1290: astore 14
    //   1292: goto -64 -> 1228
    //   1295: astore 14
    //   1297: aconst_null
    //   1298: astore 13
    //   1300: goto -72 -> 1228
    //   1303: astore 15
    //   1305: aload 14
    //   1307: astore 13
    //   1309: aload 15
    //   1311: astore 14
    //   1313: goto -85 -> 1228
    //   1316: aconst_null
    //   1317: astore 14
    //   1319: goto -227 -> 1092
    //   1322: iconst_0
    //   1323: istore_0
    //   1324: goto -1224 -> 100
    //   1327: lload_3
    //   1328: lload 11
    //   1330: ladd
    //   1331: lstore_3
    //   1332: lload_1
    //   1333: lload 9
    //   1335: ladd
    //   1336: lstore_1
    //   1337: goto -631 -> 706
    //   1340: lload_3
    //   1341: lstore 9
    //   1343: goto -822 -> 521
    //   1346: lload_1
    //   1347: lstore 9
    //   1349: goto -796 -> 553
    //   1352: lload 7
    //   1354: lstore 9
    //   1356: goto -769 -> 587
    //   1359: lload 5
    //   1361: lstore 9
    //   1363: goto -742 -> 621
    // Local variable table:
    //   start	length	slot	name	signature
    //   99	1225	0	i	int
    //   11	1336	1	l1	long
    //   9	1332	3	l2	long
    //   51	1309	5	l3	long
    //   54	1299	7	l4	long
    //   519	843	9	l5	long
    //   766	563	11	l6	long
    //   32	1276	13	localObject1	Object
    //   28	1070	14	localScanner	java.util.Scanner
    //   1226	5	14	localException1	Exception
    //   1254	16	14	localObject2	Object
    //   1272	1	14	localObject3	Object
    //   1277	8	14	localObject4	Object
    //   1290	1	14	localObject5	Object
    //   1295	11	14	localException2	Exception
    //   1311	7	14	localObject6	Object
    //   82	691	15	arrayOfString	String[]
    //   1282	7	15	localException3	Exception
    //   1303	7	15	localException4	Exception
    //   753	65	16	str	String
    // Exception table:
    //   from	to	target	type
    //   12	30	1223	java/lang/Exception
    //   664	686	1223	java/lang/Exception
    //   12	30	1254	finally
    //   664	686	1254	finally
    //   34	40	1272	finally
    //   44	50	1272	finally
    //   60	68	1272	finally
    //   72	84	1272	finally
    //   88	98	1272	finally
    //   104	118	1272	finally
    //   122	136	1272	finally
    //   140	154	1272	finally
    //   158	171	1272	finally
    //   175	187	1272	finally
    //   194	209	1272	finally
    //   213	227	1272	finally
    //   234	239	1272	finally
    //   246	254	1272	finally
    //   258	262	1272	finally
    //   266	284	1272	finally
    //   288	296	1272	finally
    //   300	304	1272	finally
    //   308	326	1272	finally
    //   330	338	1272	finally
    //   342	347	1272	finally
    //   351	370	1272	finally
    //   374	382	1272	finally
    //   386	391	1272	finally
    //   395	414	1272	finally
    //   418	429	1272	finally
    //   433	456	1272	finally
    //   460	471	1272	finally
    //   475	498	1272	finally
    //   502	510	1272	finally
    //   514	521	1272	finally
    //   525	530	1272	finally
    //   534	542	1272	finally
    //   546	553	1272	finally
    //   557	562	1272	finally
    //   566	575	1272	finally
    //   579	587	1272	finally
    //   591	596	1272	finally
    //   600	609	1272	finally
    //   613	621	1272	finally
    //   625	630	1272	finally
    //   634	638	1272	finally
    //   642	646	1272	finally
    //   650	655	1272	finally
    //   659	664	1272	finally
    //   690	696	1272	finally
    //   710	718	1272	finally
    //   722	734	1272	finally
    //   738	749	1272	finally
    //   759	768	1272	finally
    //   772	782	1272	finally
    //   786	796	1272	finally
    //   800	810	1272	finally
    //   817	827	1272	finally
    //   848	856	1272	finally
    //   860	864	1272	finally
    //   868	876	1272	finally
    //   880	884	1272	finally
    //   888	896	1272	finally
    //   900	905	1272	finally
    //   909	917	1272	finally
    //   921	926	1272	finally
    //   930	938	1272	finally
    //   942	949	1272	finally
    //   953	958	1272	finally
    //   962	970	1272	finally
    //   974	981	1272	finally
    //   985	990	1272	finally
    //   994	1003	1272	finally
    //   1007	1015	1272	finally
    //   1019	1024	1272	finally
    //   1028	1037	1272	finally
    //   1041	1049	1272	finally
    //   1053	1058	1272	finally
    //   1062	1066	1272	finally
    //   1070	1074	1272	finally
    //   1078	1083	1272	finally
    //   1087	1092	1272	finally
    //   1228	1241	1277	finally
    //   34	40	1282	java/lang/Exception
    //   44	50	1282	java/lang/Exception
    //   60	68	1282	java/lang/Exception
    //   72	84	1282	java/lang/Exception
    //   88	98	1282	java/lang/Exception
    //   104	118	1282	java/lang/Exception
    //   122	136	1282	java/lang/Exception
    //   140	154	1282	java/lang/Exception
    //   158	171	1282	java/lang/Exception
    //   175	187	1282	java/lang/Exception
    //   194	209	1282	java/lang/Exception
    //   213	227	1282	java/lang/Exception
    //   234	239	1282	java/lang/Exception
    //   246	254	1295	java/lang/Exception
    //   258	262	1295	java/lang/Exception
    //   266	284	1295	java/lang/Exception
    //   288	296	1295	java/lang/Exception
    //   300	304	1295	java/lang/Exception
    //   308	326	1295	java/lang/Exception
    //   330	338	1295	java/lang/Exception
    //   342	347	1295	java/lang/Exception
    //   351	370	1295	java/lang/Exception
    //   374	382	1295	java/lang/Exception
    //   386	391	1295	java/lang/Exception
    //   395	414	1295	java/lang/Exception
    //   418	429	1295	java/lang/Exception
    //   433	456	1295	java/lang/Exception
    //   460	471	1295	java/lang/Exception
    //   475	498	1295	java/lang/Exception
    //   502	510	1295	java/lang/Exception
    //   514	521	1295	java/lang/Exception
    //   525	530	1295	java/lang/Exception
    //   534	542	1295	java/lang/Exception
    //   546	553	1295	java/lang/Exception
    //   557	562	1295	java/lang/Exception
    //   566	575	1295	java/lang/Exception
    //   579	587	1295	java/lang/Exception
    //   591	596	1295	java/lang/Exception
    //   600	609	1295	java/lang/Exception
    //   613	621	1295	java/lang/Exception
    //   625	630	1295	java/lang/Exception
    //   634	638	1295	java/lang/Exception
    //   642	646	1295	java/lang/Exception
    //   650	655	1295	java/lang/Exception
    //   659	664	1295	java/lang/Exception
    //   690	696	1303	java/lang/Exception
    //   710	718	1303	java/lang/Exception
    //   722	734	1303	java/lang/Exception
    //   738	749	1303	java/lang/Exception
    //   759	768	1303	java/lang/Exception
    //   772	782	1303	java/lang/Exception
    //   786	796	1303	java/lang/Exception
    //   800	810	1303	java/lang/Exception
    //   817	827	1303	java/lang/Exception
    //   848	856	1303	java/lang/Exception
    //   860	864	1303	java/lang/Exception
    //   868	876	1303	java/lang/Exception
    //   880	884	1303	java/lang/Exception
    //   888	896	1303	java/lang/Exception
    //   900	905	1303	java/lang/Exception
    //   909	917	1303	java/lang/Exception
    //   921	926	1303	java/lang/Exception
    //   930	938	1303	java/lang/Exception
    //   942	949	1303	java/lang/Exception
    //   953	958	1303	java/lang/Exception
    //   962	970	1303	java/lang/Exception
    //   974	981	1303	java/lang/Exception
    //   985	990	1303	java/lang/Exception
    //   994	1003	1303	java/lang/Exception
    //   1007	1015	1303	java/lang/Exception
    //   1019	1024	1303	java/lang/Exception
    //   1028	1037	1303	java/lang/Exception
    //   1041	1049	1303	java/lang/Exception
    //   1053	1058	1303	java/lang/Exception
    //   1062	1066	1303	java/lang/Exception
    //   1070	1074	1303	java/lang/Exception
    //   1078	1083	1303	java/lang/Exception
    //   1087	1092	1303	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */