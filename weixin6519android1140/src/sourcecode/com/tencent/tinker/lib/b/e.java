package com.tencent.tinker.lib.b;

public final class e
  extends b
{
  /* Error */
  private static boolean a(android.content.Context paramContext, String paramString, java.io.File paramFile1, java.io.File paramFile2, com.tencent.tinker.loader.shareutil.ShareResPatchInfo paramShareResPatchInfo, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   3: lstore 6
    //   5: aload_0
    //   6: invokestatic 20	com/tencent/tinker/lib/d/a:hQ	(Landroid/content/Context;)Lcom/tencent/tinker/lib/d/a;
    //   9: astore 12
    //   11: aconst_null
    //   12: astore_0
    //   13: aconst_null
    //   14: astore 11
    //   16: new 22	java/util/zip/ZipFile
    //   19: dup
    //   20: aload_1
    //   21: invokespecial 26	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   24: astore 10
    //   26: aload 10
    //   28: ldc 28
    //   30: invokevirtual 32	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   33: astore_1
    //   34: new 34	java/io/File
    //   37: dup
    //   38: aload_2
    //   39: ldc 28
    //   41: invokespecial 37	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   44: astore_0
    //   45: aload_1
    //   46: ifnonnull +41 -> 87
    //   49: ldc 39
    //   51: ldc 41
    //   53: iconst_0
    //   54: anewarray 43	java/lang/Object
    //   57: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: aload 12
    //   62: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   65: aload_3
    //   66: aload_0
    //   67: ldc 28
    //   69: bipush 6
    //   71: invokeinterface 58 5 0
    //   76: aload 10
    //   78: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   81: aconst_null
    //   82: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   85: iconst_0
    //   86: ireturn
    //   87: aload_1
    //   88: invokevirtual 68	java/util/zip/ZipEntry:getCrc	()J
    //   91: invokestatic 74	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   94: astore_1
    //   95: aload_1
    //   96: aload 4
    //   98: getfield 80	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiL	Ljava/lang/String;
    //   101: invokevirtual 84	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   104: ifne +53 -> 157
    //   107: ldc 39
    //   109: ldc 86
    //   111: iconst_2
    //   112: anewarray 43	java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: aload 4
    //   119: getfield 80	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiL	Ljava/lang/String;
    //   122: aastore
    //   123: dup
    //   124: iconst_1
    //   125: aload_1
    //   126: aastore
    //   127: invokestatic 89	com/tencent/tinker/lib/e/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload 12
    //   132: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   135: aload_3
    //   136: aload_0
    //   137: ldc 28
    //   139: bipush 6
    //   141: invokeinterface 58 5 0
    //   146: aload 10
    //   148: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   151: aconst_null
    //   152: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   155: iconst_0
    //   156: ireturn
    //   157: aload 4
    //   159: getfield 93	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiQ	Ljava/util/ArrayList;
    //   162: invokevirtual 99	java/util/ArrayList:isEmpty	()Z
    //   165: ifeq +25 -> 190
    //   168: ldc 39
    //   170: ldc 101
    //   172: iconst_0
    //   173: anewarray 43	java/lang/Object
    //   176: invokestatic 104	com/tencent/tinker/lib/e/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: aload 10
    //   181: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   184: aconst_null
    //   185: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   188: iconst_1
    //   189: ireturn
    //   190: aload 4
    //   192: getfield 93	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiQ	Ljava/util/ArrayList;
    //   195: invokevirtual 108	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   198: astore 13
    //   200: aconst_null
    //   201: astore_0
    //   202: aload 13
    //   204: invokeinterface 113 1 0
    //   209: ifeq +587 -> 796
    //   212: aload 13
    //   214: invokeinterface 117 1 0
    //   219: checkcast 70	java/lang/String
    //   222: astore 14
    //   224: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   227: lstore 8
    //   229: aload 4
    //   231: getfield 121	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiR	Ljava/util/HashMap;
    //   234: aload 14
    //   236: invokevirtual 127	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   239: checkcast 129	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   242: astore 15
    //   244: aload 15
    //   246: ifnonnull +54 -> 300
    //   249: ldc 39
    //   251: ldc -125
    //   253: iconst_2
    //   254: anewarray 43	java/lang/Object
    //   257: dup
    //   258: iconst_0
    //   259: bipush 6
    //   261: invokestatic 137	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Gg	(I)Ljava/lang/String;
    //   264: aastore
    //   265: dup
    //   266: iconst_1
    //   267: aload 14
    //   269: aastore
    //   270: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: aload 12
    //   275: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   278: aload_3
    //   279: bipush 6
    //   281: invokestatic 141	com/tencent/tinker/lib/b/b:Gc	(I)I
    //   284: invokeinterface 145 3 0
    //   289: aload 10
    //   291: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   294: aload_0
    //   295: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   298: iconst_0
    //   299: ireturn
    //   300: aload 15
    //   302: new 34	java/io/File
    //   305: dup
    //   306: aload_2
    //   307: aload 14
    //   309: invokespecial 37	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   312: putfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   315: aload 15
    //   317: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   320: invokestatic 153	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ad	(Ljava/io/File;)V
    //   323: aload 15
    //   325: getfield 156	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:eDW	Ljava/lang/String;
    //   328: invokestatic 160	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:YI	(Ljava/lang/String;)Z
    //   331: ifne +62 -> 393
    //   334: ldc 39
    //   336: ldc -94
    //   338: iconst_3
    //   339: anewarray 43	java/lang/Object
    //   342: dup
    //   343: iconst_0
    //   344: bipush 6
    //   346: invokestatic 137	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Gg	(I)Ljava/lang/String;
    //   349: aastore
    //   350: dup
    //   351: iconst_1
    //   352: aload 14
    //   354: aastore
    //   355: dup
    //   356: iconst_2
    //   357: aload 15
    //   359: getfield 156	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:eDW	Ljava/lang/String;
    //   362: aastore
    //   363: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   366: aload 12
    //   368: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   371: aload_3
    //   372: bipush 6
    //   374: invokestatic 141	com/tencent/tinker/lib/b/b:Gc	(I)I
    //   377: invokeinterface 145 3 0
    //   382: aload 10
    //   384: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   387: aload_0
    //   388: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   391: iconst_0
    //   392: ireturn
    //   393: new 22	java/util/zip/ZipFile
    //   396: dup
    //   397: aload_3
    //   398: invokespecial 164	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   401: astore_1
    //   402: aload_1
    //   403: aload 14
    //   405: invokevirtual 32	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   408: astore 11
    //   410: aload 11
    //   412: ifnonnull +60 -> 472
    //   415: ldc 39
    //   417: new 166	java/lang/StringBuilder
    //   420: dup
    //   421: ldc -88
    //   423: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   426: aload 14
    //   428: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   431: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   434: iconst_0
    //   435: anewarray 43	java/lang/Object
    //   438: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   441: aload 12
    //   443: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   446: aload_3
    //   447: aload 15
    //   449: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   452: aload 14
    //   454: bipush 6
    //   456: invokeinterface 58 5 0
    //   461: aload 10
    //   463: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   466: aload_1
    //   467: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   470: iconst_0
    //   471: ireturn
    //   472: aload 10
    //   474: aload 14
    //   476: invokevirtual 32	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   479: astore_0
    //   480: aload_0
    //   481: ifnonnull +60 -> 541
    //   484: ldc 39
    //   486: new 166	java/lang/StringBuilder
    //   489: dup
    //   490: ldc -77
    //   492: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   495: aload 14
    //   497: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   503: iconst_0
    //   504: anewarray 43	java/lang/Object
    //   507: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   510: aload 12
    //   512: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   515: aload_3
    //   516: aload 15
    //   518: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   521: aload 14
    //   523: bipush 6
    //   525: invokeinterface 58 5 0
    //   530: aload 10
    //   532: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   535: aload_1
    //   536: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   539: iconst_0
    //   540: ireturn
    //   541: aload 10
    //   543: aload_0
    //   544: invokevirtual 183	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   547: astore_0
    //   548: aload_1
    //   549: aload 11
    //   551: invokevirtual 183	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   554: astore 11
    //   556: aload_0
    //   557: aload 11
    //   559: aload 15
    //   561: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   564: invokestatic 188	com/tencent/tinker/b/a:a	(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/File;)I
    //   567: pop
    //   568: aload_0
    //   569: invokestatic 192	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   572: aload 11
    //   574: invokestatic 192	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   577: aload 15
    //   579: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   582: aload 15
    //   584: getfield 156	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:eDW	Ljava/lang/String;
    //   587: invokestatic 196	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:f	(Ljava/io/File;Ljava/lang/String;)Z
    //   590: ifne +153 -> 743
    //   593: ldc 39
    //   595: ldc -58
    //   597: iconst_1
    //   598: anewarray 43	java/lang/Object
    //   601: dup
    //   602: iconst_0
    //   603: aload 15
    //   605: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   608: invokevirtual 201	java/io/File:getPath	()Ljava/lang/String;
    //   611: aastore
    //   612: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   615: aload 15
    //   617: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   620: invokestatic 205	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   623: pop
    //   624: aload 12
    //   626: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   629: aload_3
    //   630: aload 15
    //   632: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   635: aload 14
    //   637: bipush 6
    //   639: invokeinterface 58 5 0
    //   644: aload 10
    //   646: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   649: aload_1
    //   650: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   653: iconst_0
    //   654: ireturn
    //   655: astore_0
    //   656: aconst_null
    //   657: astore_2
    //   658: aconst_null
    //   659: astore_3
    //   660: aload_3
    //   661: invokestatic 192	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   664: aload_2
    //   665: invokestatic 192	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/Closeable;)V
    //   668: aload_0
    //   669: athrow
    //   670: astore_3
    //   671: aload 10
    //   673: astore_0
    //   674: aload_1
    //   675: astore_2
    //   676: aload_3
    //   677: astore_1
    //   678: new 207	com/tencent/tinker/loader/TinkerRuntimeException
    //   681: dup
    //   682: new 166	java/lang/StringBuilder
    //   685: dup
    //   686: ldc -47
    //   688: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   691: bipush 6
    //   693: invokestatic 137	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Gg	(I)Ljava/lang/String;
    //   696: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: ldc -45
    //   701: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   704: aload_1
    //   705: invokevirtual 214	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   708: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   711: ldc -40
    //   713: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   716: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   719: aload_1
    //   720: invokespecial 219	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   723: athrow
    //   724: astore_3
    //   725: aload_2
    //   726: astore_1
    //   727: aload_0
    //   728: astore 10
    //   730: aload_3
    //   731: astore_0
    //   732: aload 10
    //   734: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   737: aload_1
    //   738: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   741: aload_0
    //   742: athrow
    //   743: ldc 39
    //   745: ldc -35
    //   747: iconst_3
    //   748: anewarray 43	java/lang/Object
    //   751: dup
    //   752: iconst_0
    //   753: aload 15
    //   755: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   758: invokevirtual 201	java/io/File:getPath	()Ljava/lang/String;
    //   761: aastore
    //   762: dup
    //   763: iconst_1
    //   764: aload 15
    //   766: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   769: invokevirtual 224	java/io/File:length	()J
    //   772: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   775: aastore
    //   776: dup
    //   777: iconst_2
    //   778: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   781: lload 8
    //   783: lsub
    //   784: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   787: aastore
    //   788: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   791: aload_1
    //   792: astore_0
    //   793: goto -591 -> 202
    //   796: ldc 39
    //   798: ldc -25
    //   800: iconst_1
    //   801: anewarray 43	java/lang/Object
    //   804: dup
    //   805: iconst_0
    //   806: invokestatic 14	java/lang/System:currentTimeMillis	()J
    //   809: lload 6
    //   811: lsub
    //   812: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   815: aastore
    //   816: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   819: aload 10
    //   821: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   824: aload_0
    //   825: invokestatic 63	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   828: iconst_1
    //   829: ireturn
    //   830: astore_0
    //   831: aconst_null
    //   832: astore_1
    //   833: aconst_null
    //   834: astore 10
    //   836: goto -104 -> 732
    //   839: astore_0
    //   840: aconst_null
    //   841: astore_1
    //   842: goto -110 -> 732
    //   845: astore_0
    //   846: goto -114 -> 732
    //   849: astore_2
    //   850: aload_0
    //   851: astore_1
    //   852: aload_2
    //   853: astore_0
    //   854: goto -122 -> 732
    //   857: astore_1
    //   858: aload 11
    //   860: astore_2
    //   861: goto -183 -> 678
    //   864: astore_1
    //   865: aload 10
    //   867: astore_0
    //   868: aload 11
    //   870: astore_2
    //   871: goto -193 -> 678
    //   874: astore_1
    //   875: aload_0
    //   876: astore_2
    //   877: aload 10
    //   879: astore_0
    //   880: goto -202 -> 678
    //   883: astore 4
    //   885: aconst_null
    //   886: astore_2
    //   887: aload_0
    //   888: astore_3
    //   889: aload 4
    //   891: astore_0
    //   892: goto -232 -> 660
    //   895: astore 4
    //   897: aload 11
    //   899: astore_2
    //   900: aload_0
    //   901: astore_3
    //   902: aload 4
    //   904: astore_0
    //   905: goto -245 -> 660
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	908	0	paramContext	android.content.Context
    //   0	908	1	paramString	String
    //   0	908	2	paramFile1	java.io.File
    //   0	908	3	paramFile2	java.io.File
    //   0	908	4	paramShareResPatchInfo	com.tencent.tinker.loader.shareutil.ShareResPatchInfo
    //   0	908	5	paramInt	int
    //   3	807	6	l1	long
    //   227	555	8	l2	long
    //   24	854	10	localObject1	Object
    //   14	884	11	localObject2	Object
    //   9	616	12	locala	com.tencent.tinker.lib.d.a
    //   198	15	13	localIterator	java.util.Iterator
    //   222	414	14	str	String
    //   242	523	15	localLargeModeInfo	com.tencent.tinker.loader.shareutil.ShareResPatchInfo.LargeModeInfo
    // Exception table:
    //   from	to	target	type
    //   541	548	655	finally
    //   402	410	670	java/lang/Throwable
    //   415	461	670	java/lang/Throwable
    //   472	480	670	java/lang/Throwable
    //   484	530	670	java/lang/Throwable
    //   568	644	670	java/lang/Throwable
    //   660	670	670	java/lang/Throwable
    //   743	791	670	java/lang/Throwable
    //   678	724	724	finally
    //   16	26	830	finally
    //   26	45	839	finally
    //   49	76	839	finally
    //   87	146	839	finally
    //   157	179	839	finally
    //   190	200	839	finally
    //   402	410	845	finally
    //   415	461	845	finally
    //   472	480	845	finally
    //   484	530	845	finally
    //   568	644	845	finally
    //   660	670	845	finally
    //   743	791	845	finally
    //   202	244	849	finally
    //   249	289	849	finally
    //   300	382	849	finally
    //   393	402	849	finally
    //   796	819	849	finally
    //   16	26	857	java/lang/Throwable
    //   26	45	864	java/lang/Throwable
    //   49	76	864	java/lang/Throwable
    //   87	146	864	java/lang/Throwable
    //   157	179	864	java/lang/Throwable
    //   190	200	864	java/lang/Throwable
    //   202	244	874	java/lang/Throwable
    //   249	289	874	java/lang/Throwable
    //   300	382	874	java/lang/Throwable
    //   393	402	874	java/lang/Throwable
    //   796	819	874	java/lang/Throwable
    //   548	556	883	finally
    //   556	568	895	finally
  }
  
  /* Error */
  static boolean c(android.content.Context paramContext, String paramString1, String paramString2, java.io.File paramFile)
  {
    // Byte code:
    //   0: new 76	com/tencent/tinker/loader/shareutil/ShareResPatchInfo
    //   3: dup
    //   4: invokespecial 237	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:<init>	()V
    //   7: astore 8
    //   9: aload_2
    //   10: aload 8
    //   12: invokestatic 240	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:a	(Ljava/lang/String;Lcom/tencent/tinker/loader/shareutil/ShareResPatchInfo;)V
    //   15: ldc 39
    //   17: ldc -14
    //   19: iconst_2
    //   20: anewarray 43	java/lang/Object
    //   23: dup
    //   24: iconst_0
    //   25: aload_1
    //   26: aastore
    //   27: dup
    //   28: iconst_1
    //   29: aload 8
    //   31: invokevirtual 243	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:toString	()Ljava/lang/String;
    //   34: aastore
    //   35: invokestatic 104	com/tencent/tinker/lib/e/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: aload_0
    //   39: invokestatic 20	com/tencent/tinker/lib/d/a:hQ	(Landroid/content/Context;)Lcom/tencent/tinker/lib/d/a;
    //   42: astore_2
    //   43: aload 8
    //   45: getfield 246	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiM	Ljava/lang/String;
    //   48: invokestatic 160	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:YI	(Ljava/lang/String;)Z
    //   51: ifne +47 -> 98
    //   54: ldc 39
    //   56: ldc -8
    //   58: iconst_2
    //   59: anewarray 43	java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: bipush 6
    //   66: invokestatic 137	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Gg	(I)Ljava/lang/String;
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: aload 8
    //   74: getfield 246	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiM	Ljava/lang/String;
    //   77: aastore
    //   78: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: aload_2
    //   82: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   85: aload_3
    //   86: bipush 6
    //   88: invokestatic 141	com/tencent/tinker/lib/b/b:Gc	(I)I
    //   91: invokeinterface 145 3 0
    //   96: iconst_0
    //   97: ireturn
    //   98: new 34	java/io/File
    //   101: dup
    //   102: aload_1
    //   103: invokespecial 249	java/io/File:<init>	(Ljava/lang/String;)V
    //   106: astore 6
    //   108: new 34	java/io/File
    //   111: dup
    //   112: aload 6
    //   114: ldc -5
    //   116: invokespecial 37	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   119: astore 9
    //   121: aload 9
    //   123: invokevirtual 254	java/io/File:exists	()Z
    //   126: ifeq +97 -> 223
    //   129: aload 9
    //   131: aload 8
    //   133: getfield 246	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiM	Ljava/lang/String;
    //   136: invokestatic 257	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:h	(Ljava/io/File;Ljava/lang/String;)Z
    //   139: ifeq +25 -> 164
    //   142: ldc 39
    //   144: ldc_w 259
    //   147: iconst_1
    //   148: anewarray 43	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload 9
    //   155: invokevirtual 201	java/io/File:getPath	()Ljava/lang/String;
    //   158: aastore
    //   159: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: iconst_1
    //   163: ireturn
    //   164: ldc 39
    //   166: new 166	java/lang/StringBuilder
    //   169: dup
    //   170: ldc_w 261
    //   173: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   176: aload 9
    //   178: invokevirtual 201	java/io/File:getPath	()Ljava/lang/String;
    //   181: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: iconst_0
    //   188: anewarray 43	java/lang/Object
    //   191: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload 9
    //   196: invokevirtual 264	java/io/File:delete	()Z
    //   199: pop
    //   200: aload_0
    //   201: invokevirtual 270	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   204: astore_1
    //   205: aload_1
    //   206: ifnonnull +29 -> 235
    //   209: ldc 39
    //   211: ldc_w 272
    //   214: iconst_0
    //   215: anewarray 43	java/lang/Object
    //   218: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   221: iconst_0
    //   222: ireturn
    //   223: aload 9
    //   225: invokevirtual 276	java/io/File:getParentFile	()Ljava/io/File;
    //   228: invokevirtual 279	java/io/File:mkdirs	()Z
    //   231: pop
    //   232: goto -32 -> 200
    //   235: aload_1
    //   236: getfield 284	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   239: astore_1
    //   240: aload_0
    //   241: aload_1
    //   242: aload 6
    //   244: aload_3
    //   245: aload 8
    //   247: bipush 6
    //   249: invokestatic 286	com/tencent/tinker/lib/b/e:a	(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Lcom/tencent/tinker/loader/shareutil/ShareResPatchInfo;I)Z
    //   252: istore 5
    //   254: iload 5
    //   256: ifne +5 -> 261
    //   259: iconst_0
    //   260: ireturn
    //   261: aconst_null
    //   262: astore 6
    //   264: new 288	com/tencent/tinker/d/a/h
    //   267: dup
    //   268: new 290	java/io/BufferedOutputStream
    //   271: dup
    //   272: new 292	java/io/FileOutputStream
    //   275: dup
    //   276: aload 9
    //   278: invokespecial 293	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   281: invokespecial 296	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   284: invokespecial 297	com/tencent/tinker/d/a/h:<init>	(Ljava/io/OutputStream;)V
    //   287: astore_0
    //   288: new 299	com/tencent/tinker/d/a/g
    //   291: dup
    //   292: aload_1
    //   293: invokespecial 300	com/tencent/tinker/d/a/g:<init>	(Ljava/lang/String;)V
    //   296: astore_1
    //   297: new 299	com/tencent/tinker/d/a/g
    //   300: dup
    //   301: aload_3
    //   302: invokespecial 301	com/tencent/tinker/d/a/g:<init>	(Ljava/io/File;)V
    //   305: astore 7
    //   307: aload_1
    //   308: invokevirtual 304	com/tencent/tinker/d/a/g:cqS	()V
    //   311: new 306	com/tencent/tinker/d/a/g$1
    //   314: dup
    //   315: aload_1
    //   316: aload_1
    //   317: getfield 310	com/tencent/tinker/d/a/g:yjk	Ljava/util/LinkedHashMap;
    //   320: invokevirtual 316	java/util/LinkedHashMap:values	()Ljava/util/Collection;
    //   323: invokeinterface 319 1 0
    //   328: invokespecial 322	com/tencent/tinker/d/a/g$1:<init>	(Lcom/tencent/tinker/d/a/g;Ljava/util/Iterator;)V
    //   331: astore 6
    //   333: iconst_0
    //   334: istore 4
    //   336: aload 6
    //   338: invokeinterface 327 1 0
    //   343: ifeq +253 -> 596
    //   346: aload 6
    //   348: invokeinterface 330 1 0
    //   353: checkcast 332	com/tencent/tinker/d/a/f
    //   356: astore 10
    //   358: aload 10
    //   360: ifnonnull +139 -> 499
    //   363: new 207	com/tencent/tinker/loader/TinkerRuntimeException
    //   366: dup
    //   367: ldc_w 334
    //   370: invokespecial 335	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;)V
    //   373: athrow
    //   374: astore 6
    //   376: aload_0
    //   377: astore_2
    //   378: aload 7
    //   380: astore_0
    //   381: aload_1
    //   382: astore_3
    //   383: aload 6
    //   385: astore_1
    //   386: aload_2
    //   387: ifnull +7 -> 394
    //   390: aload_2
    //   391: invokevirtual 338	com/tencent/tinker/d/a/h:close	()V
    //   394: aload_3
    //   395: ifnull +7 -> 402
    //   398: aload_3
    //   399: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   402: aload_0
    //   403: ifnull +7 -> 410
    //   406: aload_0
    //   407: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   410: aload 8
    //   412: getfield 121	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiR	Ljava/util/HashMap;
    //   415: invokevirtual 340	java/util/HashMap:values	()Ljava/util/Collection;
    //   418: invokeinterface 319 1 0
    //   423: astore_0
    //   424: aload_0
    //   425: invokeinterface 113 1 0
    //   430: ifeq +894 -> 1324
    //   433: aload_0
    //   434: invokeinterface 117 1 0
    //   439: checkcast 129	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   442: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   445: invokestatic 205	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   448: pop
    //   449: goto -25 -> 424
    //   452: astore_0
    //   453: new 207	com/tencent/tinker/loader/TinkerRuntimeException
    //   456: dup
    //   457: new 166	java/lang/StringBuilder
    //   460: dup
    //   461: ldc -47
    //   463: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   466: bipush 6
    //   468: invokestatic 137	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Gg	(I)Ljava/lang/String;
    //   471: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: ldc -45
    //   476: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   479: aload_0
    //   480: invokevirtual 214	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   483: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: ldc -40
    //   488: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   491: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   494: aload_0
    //   495: invokespecial 219	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   498: athrow
    //   499: aload 10
    //   501: getfield 343	com/tencent/tinker/d/a/f:name	Ljava/lang/String;
    //   504: astore 11
    //   506: aload 11
    //   508: ldc_w 345
    //   511: invokevirtual 349	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   514: ifne -178 -> 336
    //   517: aload 8
    //   519: getfield 353	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiS	Ljava/util/HashSet;
    //   522: aload 11
    //   524: invokestatic 356	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:a	(Ljava/util/HashSet;Ljava/lang/String;)Z
    //   527: ifeq +958 -> 1485
    //   530: aload 8
    //   532: getfield 359	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiO	Ljava/util/ArrayList;
    //   535: aload 11
    //   537: invokevirtual 361	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   540: ifne +945 -> 1485
    //   543: aload 8
    //   545: getfield 364	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiP	Ljava/util/ArrayList;
    //   548: aload 11
    //   550: invokevirtual 361	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   553: ifne +932 -> 1485
    //   556: aload 8
    //   558: getfield 93	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiQ	Ljava/util/ArrayList;
    //   561: aload 11
    //   563: invokevirtual 361	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   566: ifne +919 -> 1485
    //   569: aload 11
    //   571: ldc_w 366
    //   574: invokevirtual 84	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   577: ifne +908 -> 1485
    //   580: aload_1
    //   581: aload 10
    //   583: aload_0
    //   584: invokestatic 371	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/g;Lcom/tencent/tinker/d/a/f;Lcom/tencent/tinker/d/a/h;)V
    //   587: iload 4
    //   589: iconst_1
    //   590: iadd
    //   591: istore 4
    //   593: goto +892 -> 1485
    //   596: aload_1
    //   597: ldc_w 366
    //   600: invokevirtual 375	com/tencent/tinker/d/a/g:YM	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   603: astore 6
    //   605: aload 6
    //   607: ifnonnull +89 -> 696
    //   610: ldc 39
    //   612: ldc_w 377
    //   615: iconst_0
    //   616: anewarray 43	java/lang/Object
    //   619: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   622: aload_2
    //   623: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   626: aload_3
    //   627: aload 9
    //   629: ldc_w 366
    //   632: bipush 6
    //   634: invokeinterface 58 5 0
    //   639: aload_0
    //   640: invokevirtual 338	com/tencent/tinker/d/a/h:close	()V
    //   643: aload_1
    //   644: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   647: aload 7
    //   649: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   652: aload 8
    //   654: getfield 121	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiR	Ljava/util/HashMap;
    //   657: invokevirtual 340	java/util/HashMap:values	()Ljava/util/Collection;
    //   660: invokeinterface 319 1 0
    //   665: astore_0
    //   666: aload_0
    //   667: invokeinterface 113 1 0
    //   672: ifeq +22 -> 694
    //   675: aload_0
    //   676: invokeinterface 117 1 0
    //   681: checkcast 129	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   684: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   687: invokestatic 205	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   690: pop
    //   691: goto -25 -> 666
    //   694: iconst_0
    //   695: ireturn
    //   696: aload_1
    //   697: aload 6
    //   699: aload_0
    //   700: invokestatic 371	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/g;Lcom/tencent/tinker/d/a/f;Lcom/tencent/tinker/d/a/h;)V
    //   703: iload 4
    //   705: iconst_1
    //   706: iadd
    //   707: istore 4
    //   709: aload 8
    //   711: getfield 93	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiQ	Ljava/util/ArrayList;
    //   714: invokevirtual 108	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   717: astore 6
    //   719: aload 6
    //   721: invokeinterface 113 1 0
    //   726: ifeq +168 -> 894
    //   729: aload 6
    //   731: invokeinterface 117 1 0
    //   736: checkcast 70	java/lang/String
    //   739: astore 11
    //   741: aload_1
    //   742: aload 11
    //   744: invokevirtual 375	com/tencent/tinker/d/a/g:YM	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   747: astore 10
    //   749: aload 10
    //   751: ifnonnull +103 -> 854
    //   754: ldc 39
    //   756: new 166	java/lang/StringBuilder
    //   759: dup
    //   760: ldc_w 379
    //   763: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   766: aload 11
    //   768: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   771: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   774: iconst_0
    //   775: anewarray 43	java/lang/Object
    //   778: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   781: aload_2
    //   782: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   785: aload_3
    //   786: aload 9
    //   788: aload 11
    //   790: bipush 6
    //   792: invokeinterface 58 5 0
    //   797: aload_0
    //   798: invokevirtual 338	com/tencent/tinker/d/a/h:close	()V
    //   801: aload_1
    //   802: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   805: aload 7
    //   807: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   810: aload 8
    //   812: getfield 121	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiR	Ljava/util/HashMap;
    //   815: invokevirtual 340	java/util/HashMap:values	()Ljava/util/Collection;
    //   818: invokeinterface 319 1 0
    //   823: astore_0
    //   824: aload_0
    //   825: invokeinterface 113 1 0
    //   830: ifeq +22 -> 852
    //   833: aload_0
    //   834: invokeinterface 117 1 0
    //   839: checkcast 129	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   842: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   845: invokestatic 205	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   848: pop
    //   849: goto -25 -> 824
    //   852: iconst_0
    //   853: ireturn
    //   854: aload 8
    //   856: getfield 121	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiR	Ljava/util/HashMap;
    //   859: aload 11
    //   861: invokevirtual 127	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   864: checkcast 129	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   867: astore 11
    //   869: aload 10
    //   871: aload 11
    //   873: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   876: aload 11
    //   878: getfield 383	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:yiT	J
    //   881: aload_0
    //   882: invokestatic 386	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/f;Ljava/io/File;JLcom/tencent/tinker/d/a/h;)V
    //   885: iload 4
    //   887: iconst_1
    //   888: iadd
    //   889: istore 4
    //   891: goto -172 -> 719
    //   894: aload 8
    //   896: getfield 389	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiN	Ljava/util/ArrayList;
    //   899: invokevirtual 108	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   902: astore 6
    //   904: aload 6
    //   906: invokeinterface 113 1 0
    //   911: ifeq +146 -> 1057
    //   914: aload 6
    //   916: invokeinterface 117 1 0
    //   921: checkcast 70	java/lang/String
    //   924: astore 10
    //   926: aload 7
    //   928: aload 10
    //   930: invokevirtual 375	com/tencent/tinker/d/a/g:YM	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   933: astore 11
    //   935: aload 11
    //   937: ifnonnull +103 -> 1040
    //   940: ldc 39
    //   942: new 166	java/lang/StringBuilder
    //   945: dup
    //   946: ldc_w 391
    //   949: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   952: aload 10
    //   954: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   957: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   960: iconst_0
    //   961: anewarray 43	java/lang/Object
    //   964: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   967: aload_2
    //   968: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   971: aload_3
    //   972: aload 9
    //   974: aload 10
    //   976: bipush 6
    //   978: invokeinterface 58 5 0
    //   983: aload_0
    //   984: invokevirtual 338	com/tencent/tinker/d/a/h:close	()V
    //   987: aload_1
    //   988: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   991: aload 7
    //   993: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   996: aload 8
    //   998: getfield 121	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiR	Ljava/util/HashMap;
    //   1001: invokevirtual 340	java/util/HashMap:values	()Ljava/util/Collection;
    //   1004: invokeinterface 319 1 0
    //   1009: astore_0
    //   1010: aload_0
    //   1011: invokeinterface 113 1 0
    //   1016: ifeq +22 -> 1038
    //   1019: aload_0
    //   1020: invokeinterface 117 1 0
    //   1025: checkcast 129	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   1028: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   1031: invokestatic 205	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   1034: pop
    //   1035: goto -25 -> 1010
    //   1038: iconst_0
    //   1039: ireturn
    //   1040: aload 7
    //   1042: aload 11
    //   1044: aload_0
    //   1045: invokestatic 371	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/g;Lcom/tencent/tinker/d/a/f;Lcom/tencent/tinker/d/a/h;)V
    //   1048: iload 4
    //   1050: iconst_1
    //   1051: iadd
    //   1052: istore 4
    //   1054: goto -150 -> 904
    //   1057: aload 8
    //   1059: getfield 364	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiP	Ljava/util/ArrayList;
    //   1062: invokevirtual 108	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   1065: astore 6
    //   1067: aload 6
    //   1069: invokeinterface 113 1 0
    //   1074: ifeq +146 -> 1220
    //   1077: aload 6
    //   1079: invokeinterface 117 1 0
    //   1084: checkcast 70	java/lang/String
    //   1087: astore 10
    //   1089: aload 7
    //   1091: aload 10
    //   1093: invokevirtual 375	com/tencent/tinker/d/a/g:YM	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   1096: astore 11
    //   1098: aload 11
    //   1100: ifnonnull +103 -> 1203
    //   1103: ldc 39
    //   1105: new 166	java/lang/StringBuilder
    //   1108: dup
    //   1109: ldc_w 393
    //   1112: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1115: aload 10
    //   1117: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1120: invokevirtual 177	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1123: iconst_0
    //   1124: anewarray 43	java/lang/Object
    //   1127: invokestatic 49	com/tencent/tinker/lib/e/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1130: aload_2
    //   1131: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   1134: aload_3
    //   1135: aload 9
    //   1137: aload 10
    //   1139: bipush 6
    //   1141: invokeinterface 58 5 0
    //   1146: aload_0
    //   1147: invokevirtual 338	com/tencent/tinker/d/a/h:close	()V
    //   1150: aload_1
    //   1151: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   1154: aload 7
    //   1156: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   1159: aload 8
    //   1161: getfield 121	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiR	Ljava/util/HashMap;
    //   1164: invokevirtual 340	java/util/HashMap:values	()Ljava/util/Collection;
    //   1167: invokeinterface 319 1 0
    //   1172: astore_0
    //   1173: aload_0
    //   1174: invokeinterface 113 1 0
    //   1179: ifeq +22 -> 1201
    //   1182: aload_0
    //   1183: invokeinterface 117 1 0
    //   1188: checkcast 129	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   1191: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   1194: invokestatic 205	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   1197: pop
    //   1198: goto -25 -> 1173
    //   1201: iconst_0
    //   1202: ireturn
    //   1203: aload 7
    //   1205: aload 11
    //   1207: aload_0
    //   1208: invokestatic 371	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/g;Lcom/tencent/tinker/d/a/f;Lcom/tencent/tinker/d/a/h;)V
    //   1211: iload 4
    //   1213: iconst_1
    //   1214: iadd
    //   1215: istore 4
    //   1217: goto -150 -> 1067
    //   1220: aload_1
    //   1221: invokevirtual 304	com/tencent/tinker/d/a/g:cqS	()V
    //   1224: aload_1
    //   1225: getfield 396	com/tencent/tinker/d/a/g:uPE	Ljava/lang/String;
    //   1228: astore 6
    //   1230: aload 6
    //   1232: ifnonnull +65 -> 1297
    //   1235: aload_0
    //   1236: getstatic 400	com/tencent/tinker/d/a/h:yjq	[B
    //   1239: putfield 403	com/tencent/tinker/d/a/h:yju	[B
    //   1242: aload_0
    //   1243: invokevirtual 338	com/tencent/tinker/d/a/h:close	()V
    //   1246: aload_1
    //   1247: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   1250: aload 7
    //   1252: invokevirtual 339	com/tencent/tinker/d/a/g:close	()V
    //   1255: aload 8
    //   1257: getfield 121	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiR	Ljava/util/HashMap;
    //   1260: invokevirtual 340	java/util/HashMap:values	()Ljava/util/Collection;
    //   1263: invokeinterface 319 1 0
    //   1268: astore_0
    //   1269: aload_0
    //   1270: invokeinterface 113 1 0
    //   1275: ifeq +51 -> 1326
    //   1278: aload_0
    //   1279: invokeinterface 117 1 0
    //   1284: checkcast 129	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo
    //   1287: getfield 149	com/tencent/tinker/loader/shareutil/ShareResPatchInfo$LargeModeInfo:file	Ljava/io/File;
    //   1290: invokestatic 205	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   1293: pop
    //   1294: goto -25 -> 1269
    //   1297: aload 6
    //   1299: getstatic 409	com/tencent/tinker/d/a/d:UTF_8	Ljava/nio/charset/Charset;
    //   1302: invokevirtual 413	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   1305: astore 6
    //   1307: ldc_w 415
    //   1310: aload 6
    //   1312: invokestatic 419	com/tencent/tinker/d/a/h:x	(Ljava/lang/String;[B)V
    //   1315: aload_0
    //   1316: aload 6
    //   1318: putfield 403	com/tencent/tinker/d/a/h:yju	[B
    //   1321: goto -79 -> 1242
    //   1324: aload_1
    //   1325: athrow
    //   1326: aload 9
    //   1328: aload 8
    //   1330: getfield 246	com/tencent/tinker/loader/shareutil/ShareResPatchInfo:yiM	Ljava/lang/String;
    //   1333: invokestatic 257	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:h	(Ljava/io/File;Ljava/lang/String;)Z
    //   1336: ifne +66 -> 1402
    //   1339: ldc 39
    //   1341: ldc_w 421
    //   1344: iconst_3
    //   1345: anewarray 43	java/lang/Object
    //   1348: dup
    //   1349: iconst_0
    //   1350: aload 9
    //   1352: invokevirtual 424	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1355: aastore
    //   1356: dup
    //   1357: iconst_1
    //   1358: iload 4
    //   1360: invokestatic 429	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1363: aastore
    //   1364: dup
    //   1365: iconst_2
    //   1366: aload 9
    //   1368: invokevirtual 224	java/io/File:length	()J
    //   1371: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1374: aastore
    //   1375: invokestatic 104	com/tencent/tinker/lib/e/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1378: aload 9
    //   1380: invokestatic 205	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ab	(Ljava/io/File;)Z
    //   1383: pop
    //   1384: aload_2
    //   1385: getfield 53	com/tencent/tinker/lib/d/a:ygt	Lcom/tencent/tinker/lib/c/d;
    //   1388: aload_3
    //   1389: aload 9
    //   1391: ldc -5
    //   1393: bipush 6
    //   1395: invokeinterface 58 5 0
    //   1400: iconst_0
    //   1401: ireturn
    //   1402: ldc 39
    //   1404: ldc_w 431
    //   1407: iconst_3
    //   1408: anewarray 43	java/lang/Object
    //   1411: dup
    //   1412: iconst_0
    //   1413: aload 9
    //   1415: invokevirtual 424	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   1418: aastore
    //   1419: dup
    //   1420: iconst_1
    //   1421: iload 4
    //   1423: invokestatic 429	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1426: aastore
    //   1427: dup
    //   1428: iconst_2
    //   1429: aload 9
    //   1431: invokevirtual 224	java/io/File:length	()J
    //   1434: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1437: aastore
    //   1438: invokestatic 104	com/tencent/tinker/lib/e/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1441: iconst_1
    //   1442: ireturn
    //   1443: astore_1
    //   1444: aconst_null
    //   1445: astore_0
    //   1446: aconst_null
    //   1447: astore_2
    //   1448: aload 6
    //   1450: astore_3
    //   1451: goto -1065 -> 386
    //   1454: astore_1
    //   1455: aconst_null
    //   1456: astore_3
    //   1457: aload_0
    //   1458: astore_2
    //   1459: aload_3
    //   1460: astore_0
    //   1461: aload 6
    //   1463: astore_3
    //   1464: goto -1078 -> 386
    //   1467: astore_2
    //   1468: aload_1
    //   1469: astore_3
    //   1470: aconst_null
    //   1471: astore_1
    //   1472: aload_0
    //   1473: astore 6
    //   1475: aload_1
    //   1476: astore_0
    //   1477: aload_2
    //   1478: astore_1
    //   1479: aload 6
    //   1481: astore_2
    //   1482: goto -1096 -> 386
    //   1485: goto -1149 -> 336
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1488	0	paramContext	android.content.Context
    //   0	1488	1	paramString1	String
    //   0	1488	2	paramString2	String
    //   0	1488	3	paramFile	java.io.File
    //   334	1088	4	i	int
    //   252	3	5	bool	boolean
    //   106	241	6	localObject1	Object
    //   374	10	6	localObject2	Object
    //   603	877	6	localObject3	Object
    //   305	946	7	localg	com.tencent.tinker.d.a.g
    //   7	1322	8	localShareResPatchInfo	com.tencent.tinker.loader.shareutil.ShareResPatchInfo
    //   119	1311	9	localFile	java.io.File
    //   356	782	10	localObject4	Object
    //   504	702	11	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   307	333	374	finally
    //   336	358	374	finally
    //   363	374	374	finally
    //   499	587	374	finally
    //   596	605	374	finally
    //   610	639	374	finally
    //   696	703	374	finally
    //   709	719	374	finally
    //   719	749	374	finally
    //   754	797	374	finally
    //   854	885	374	finally
    //   894	904	374	finally
    //   904	935	374	finally
    //   940	983	374	finally
    //   1040	1048	374	finally
    //   1057	1067	374	finally
    //   1067	1098	374	finally
    //   1103	1146	374	finally
    //   1203	1211	374	finally
    //   1220	1230	374	finally
    //   1235	1242	374	finally
    //   1297	1321	374	finally
    //   200	205	452	java/lang/Throwable
    //   209	221	452	java/lang/Throwable
    //   235	254	452	java/lang/Throwable
    //   390	394	452	java/lang/Throwable
    //   398	402	452	java/lang/Throwable
    //   406	410	452	java/lang/Throwable
    //   410	424	452	java/lang/Throwable
    //   424	449	452	java/lang/Throwable
    //   639	666	452	java/lang/Throwable
    //   666	691	452	java/lang/Throwable
    //   797	824	452	java/lang/Throwable
    //   824	849	452	java/lang/Throwable
    //   983	1010	452	java/lang/Throwable
    //   1010	1035	452	java/lang/Throwable
    //   1146	1173	452	java/lang/Throwable
    //   1173	1198	452	java/lang/Throwable
    //   1242	1269	452	java/lang/Throwable
    //   1269	1294	452	java/lang/Throwable
    //   1324	1326	452	java/lang/Throwable
    //   1326	1400	452	java/lang/Throwable
    //   1402	1441	452	java/lang/Throwable
    //   264	288	1443	finally
    //   288	297	1454	finally
    //   297	307	1467	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */