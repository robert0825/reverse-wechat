package com.tencent.wcdb.repair;

import com.tencent.wcdb.database.SQLiteDatabase;
import java.io.PrintStream;
import java.util.ArrayList;

public class DBDumpUtil
{
  private static final String TAG = "WCDB.DBDumpUtil";
  
  public static String buildColumnsString(ArrayList<String> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0)) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    int i = 0;
    while (i < paramArrayList.size())
    {
      localStringBuilder.append((String)paramArrayList.get(i));
      if (i != paramArrayList.size() - 1) {
        localStringBuilder.append(",");
      }
      i += 1;
    }
    localStringBuilder.append(")");
    paramArrayList = localStringBuilder.toString();
    System.out.println(paramArrayList);
    return paramArrayList;
  }
  
  public static boolean doRecoveryDb(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3)
  {
    return doRecoveryDb(paramSQLiteDatabase, paramString1, paramString2, paramString3, null, null, null, true);
  }
  
  /* Error */
  public static boolean doRecoveryDb(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, java.util.List<String> paramList1, java.util.List<String> paramList2, ExecuteSqlCallback paramExecuteSqlCallback, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +10 -> 11
    //   4: aload_0
    //   5: invokevirtual 80	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   8: ifne +12 -> 20
    //   11: ldc 11
    //   13: ldc 82
    //   15: invokestatic 88	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   18: iconst_0
    //   19: ireturn
    //   20: aload_1
    //   21: aload_2
    //   22: aload_3
    //   23: invokestatic 92	com/tencent/wcdb/repair/DBDumpUtil:nativeDumpDB	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    //   26: ifne +5 -> 31
    //   29: iconst_0
    //   30: ireturn
    //   31: new 94	java/io/BufferedReader
    //   34: dup
    //   35: new 96	java/io/FileReader
    //   38: dup
    //   39: aload_3
    //   40: invokespecial 98	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   43: invokespecial 101	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: astore 16
    //   48: aload_0
    //   49: ldc 103
    //   51: invokevirtual 106	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   54: aload_0
    //   55: invokevirtual 109	com/tencent/wcdb/database/SQLiteDatabase:beginTransaction	()V
    //   58: iconst_0
    //   59: istore 11
    //   61: iconst_0
    //   62: istore 10
    //   64: iconst_0
    //   65: istore 9
    //   67: aconst_null
    //   68: astore_2
    //   69: new 111	java/util/HashMap
    //   72: dup
    //   73: invokespecial 112	java/util/HashMap:<init>	()V
    //   76: astore 17
    //   78: iconst_0
    //   79: istore 8
    //   81: aload 16
    //   83: invokevirtual 115	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   86: astore 14
    //   88: aload 14
    //   90: ifnull +619 -> 709
    //   93: iload 8
    //   95: ifeq +165 -> 260
    //   98: new 28	java/lang/StringBuilder
    //   101: dup
    //   102: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   105: aload_2
    //   106: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: ldc 117
    //   111: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: aload 14
    //   116: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   122: astore 14
    //   124: aload 14
    //   126: astore_2
    //   127: aload 14
    //   129: ldc 119
    //   131: invokevirtual 123	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   134: ifeq -53 -> 81
    //   137: aload 14
    //   139: astore_2
    //   140: aload 14
    //   142: invokestatic 126	com/tencent/wcdb/repair/DBDumpUtil:nativeIsSqlComplete	(Ljava/lang/String;)Z
    //   145: ifeq -64 -> 81
    //   148: aload 14
    //   150: astore_2
    //   151: iconst_0
    //   152: istore 8
    //   154: aload 5
    //   156: ifnull +183 -> 339
    //   159: aload 5
    //   161: invokeinterface 129 1 0
    //   166: ifle +173 -> 339
    //   169: aload_2
    //   170: invokestatic 133	com/tencent/wcdb/repair/DBDumpUtil:getTableNameFromSql	(Ljava/lang/String;)Ljava/lang/String;
    //   173: astore 14
    //   175: aload 5
    //   177: invokeinterface 137 1 0
    //   182: astore 15
    //   184: aload 15
    //   186: invokeinterface 142 1 0
    //   191: ifeq +707 -> 898
    //   194: aload 14
    //   196: aload 15
    //   198: invokeinterface 146 1 0
    //   203: checkcast 41	java/lang/String
    //   206: invokevirtual 150	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   209: ifeq -25 -> 184
    //   212: iconst_0
    //   213: istore 8
    //   215: iload 8
    //   217: ifeq +189 -> 406
    //   220: ldc 11
    //   222: ldc -104
    //   224: iconst_1
    //   225: anewarray 4	java/lang/Object
    //   228: dup
    //   229: iconst_0
    //   230: aload 14
    //   232: aastore
    //   233: invokestatic 156	com/tencent/wcdb/support/Log:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   236: iconst_0
    //   237: istore 8
    //   239: goto -158 -> 81
    //   242: astore_0
    //   243: ldc 11
    //   245: ldc -98
    //   247: iconst_1
    //   248: anewarray 4	java/lang/Object
    //   251: dup
    //   252: iconst_0
    //   253: aload_3
    //   254: aastore
    //   255: invokestatic 160	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   258: iconst_0
    //   259: ireturn
    //   260: aload 14
    //   262: ldc -94
    //   264: invokevirtual 165	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   267: ifne +13 -> 280
    //   270: aload 14
    //   272: ldc -89
    //   274: invokevirtual 165	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   277: ifeq -196 -> 81
    //   280: aload 14
    //   282: ldc 119
    //   284: invokevirtual 123	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   287: ifeq +11 -> 298
    //   290: aload 14
    //   292: invokestatic 126	com/tencent/wcdb/repair/DBDumpUtil:nativeIsSqlComplete	(Ljava/lang/String;)Z
    //   295: ifne +597 -> 892
    //   298: aload_2
    //   299: invokestatic 173	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   302: ifeq +9 -> 311
    //   305: aload 14
    //   307: astore_2
    //   308: goto +578 -> 886
    //   311: new 28	java/lang/StringBuilder
    //   314: dup
    //   315: invokespecial 29	java/lang/StringBuilder:<init>	()V
    //   318: aload_2
    //   319: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: ldc 117
    //   324: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: aload 14
    //   329: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   335: astore_2
    //   336: goto +550 -> 886
    //   339: aload 4
    //   341: ifnull +539 -> 880
    //   344: aload 4
    //   346: invokeinterface 129 1 0
    //   351: ifle +529 -> 880
    //   354: aload_2
    //   355: invokestatic 133	com/tencent/wcdb/repair/DBDumpUtil:getTableNameFromSql	(Ljava/lang/String;)Ljava/lang/String;
    //   358: astore 14
    //   360: aload 4
    //   362: invokeinterface 137 1 0
    //   367: astore 15
    //   369: aload 15
    //   371: invokeinterface 142 1 0
    //   376: ifeq +498 -> 874
    //   379: aload 14
    //   381: aload 15
    //   383: invokeinterface 146 1 0
    //   388: checkcast 41	java/lang/String
    //   391: invokevirtual 150	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   394: ifeq -25 -> 369
    //   397: iconst_1
    //   398: istore 8
    //   400: ldc 26
    //   402: astore_2
    //   403: goto -188 -> 215
    //   406: iload 10
    //   408: istore 8
    //   410: aload_2
    //   411: ldc -89
    //   413: invokevirtual 165	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   416: ifeq +144 -> 560
    //   419: iload 10
    //   421: istore 8
    //   423: aload 17
    //   425: aload 14
    //   427: aload_2
    //   428: invokestatic 177	com/tencent/wcdb/repair/DBDumpUtil:getColumnNamesFromSql	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   431: invokestatic 179	com/tencent/wcdb/repair/DBDumpUtil:buildColumnsString	(Ljava/util/ArrayList;)Ljava/lang/String;
    //   434: invokevirtual 183	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   437: pop
    //   438: aload_2
    //   439: astore 15
    //   441: aconst_null
    //   442: astore_2
    //   443: aload 6
    //   445: ifnull +17 -> 462
    //   448: iload 10
    //   450: istore 8
    //   452: aload 6
    //   454: aload 15
    //   456: invokeinterface 186 2 0
    //   461: astore_2
    //   462: iload 10
    //   464: istore 8
    //   466: aload_2
    //   467: invokestatic 173	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   470: ifne +398 -> 868
    //   473: iload 10
    //   475: iconst_1
    //   476: iadd
    //   477: istore 10
    //   479: iload 10
    //   481: istore 8
    //   483: aload_0
    //   484: aload_2
    //   485: invokevirtual 106	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   488: iload 9
    //   490: iconst_1
    //   491: iadd
    //   492: istore 13
    //   494: iload 13
    //   496: istore 8
    //   498: iload 10
    //   500: istore 9
    //   502: iload 11
    //   504: istore 12
    //   506: iload 13
    //   508: bipush 100
    //   510: if_icmplt +26 -> 536
    //   513: aload_0
    //   514: invokevirtual 189	com/tencent/wcdb/database/SQLiteDatabase:setTransactionSuccessful	()V
    //   517: aload_0
    //   518: invokevirtual 192	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   521: aload_0
    //   522: invokevirtual 109	com/tencent/wcdb/database/SQLiteDatabase:beginTransaction	()V
    //   525: iconst_0
    //   526: istore 8
    //   528: iload 11
    //   530: istore 12
    //   532: iload 10
    //   534: istore 9
    //   536: aconst_null
    //   537: astore_2
    //   538: iconst_0
    //   539: istore 13
    //   541: iload 9
    //   543: istore 10
    //   545: iload 12
    //   547: istore 11
    //   549: iload 8
    //   551: istore 9
    //   553: iload 13
    //   555: istore 8
    //   557: goto -476 -> 81
    //   560: aload_2
    //   561: astore 15
    //   563: iload 10
    //   565: istore 8
    //   567: aload_2
    //   568: ldc -62
    //   570: invokevirtual 165	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   573: ifeq -132 -> 441
    //   576: iload 10
    //   578: istore 8
    //   580: aload 17
    //   582: aload 14
    //   584: invokevirtual 197	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   587: checkcast 41	java/lang/String
    //   590: astore 18
    //   592: aload_2
    //   593: astore 15
    //   595: iload 10
    //   597: istore 8
    //   599: aload 18
    //   601: invokestatic 173	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   604: ifne -163 -> 441
    //   607: iload 10
    //   609: istore 8
    //   611: new 28	java/lang/StringBuilder
    //   614: dup
    //   615: ldc -57
    //   617: invokespecial 200	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   620: astore 15
    //   622: iload 10
    //   624: istore 8
    //   626: aload 15
    //   628: ldc -54
    //   630: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   633: aload 14
    //   635: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: ldc -54
    //   640: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   643: pop
    //   644: iload 10
    //   646: istore 8
    //   648: aload 15
    //   650: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   653: astore 14
    //   655: iload 10
    //   657: istore 8
    //   659: aload 15
    //   661: aload 18
    //   663: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   666: pop
    //   667: iload 10
    //   669: istore 8
    //   671: aload_2
    //   672: aload 14
    //   674: aload 15
    //   676: invokevirtual 49	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   679: invokevirtual 206	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   682: astore 15
    //   684: goto -243 -> 441
    //   687: astore_2
    //   688: iload 9
    //   690: istore 10
    //   692: iload 8
    //   694: istore 9
    //   696: iload 10
    //   698: istore 8
    //   700: iload 11
    //   702: iconst_1
    //   703: iadd
    //   704: istore 12
    //   706: goto -170 -> 536
    //   709: aload 16
    //   711: invokevirtual 209	java/io/BufferedReader:close	()V
    //   714: iload 10
    //   716: iload 11
    //   718: if_icmple +124 -> 842
    //   721: aload_0
    //   722: invokevirtual 212	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   725: ifeq +7 -> 732
    //   728: aload_0
    //   729: invokevirtual 189	com/tencent/wcdb/database/SQLiteDatabase:setTransactionSuccessful	()V
    //   732: aload_0
    //   733: invokevirtual 212	com/tencent/wcdb/database/SQLiteDatabase:inTransaction	()Z
    //   736: ifeq +7 -> 743
    //   739: aload_0
    //   740: invokevirtual 192	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
    //   743: iload 7
    //   745: ifeq +45 -> 790
    //   748: new 214	java/io/File
    //   751: dup
    //   752: aload_3
    //   753: invokespecial 215	java/io/File:<init>	(Ljava/lang/String;)V
    //   756: astore_0
    //   757: aload_0
    //   758: invokevirtual 218	java/io/File:exists	()Z
    //   761: ifeq +8 -> 769
    //   764: aload_0
    //   765: invokevirtual 221	java/io/File:delete	()Z
    //   768: pop
    //   769: new 214	java/io/File
    //   772: dup
    //   773: aload_1
    //   774: invokespecial 215	java/io/File:<init>	(Ljava/lang/String;)V
    //   777: astore_0
    //   778: aload_0
    //   779: invokevirtual 218	java/io/File:exists	()Z
    //   782: ifeq +8 -> 790
    //   785: aload_0
    //   786: invokevirtual 221	java/io/File:delete	()Z
    //   789: pop
    //   790: ldc 11
    //   792: ldc -33
    //   794: iconst_2
    //   795: anewarray 4	java/lang/Object
    //   798: dup
    //   799: iconst_0
    //   800: iload 10
    //   802: invokestatic 229	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   805: aastore
    //   806: dup
    //   807: iconst_1
    //   808: iload 11
    //   810: invokestatic 229	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   813: aastore
    //   814: invokestatic 156	com/tencent/wcdb/support/Log:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   817: iconst_1
    //   818: ireturn
    //   819: astore_0
    //   820: ldc 11
    //   822: ldc -25
    //   824: invokestatic 88	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   827: aload 16
    //   829: invokevirtual 209	java/io/BufferedReader:close	()V
    //   832: iconst_0
    //   833: ireturn
    //   834: astore_0
    //   835: aload 16
    //   837: invokevirtual 209	java/io/BufferedReader:close	()V
    //   840: aload_0
    //   841: athrow
    //   842: iconst_0
    //   843: ireturn
    //   844: astore_2
    //   845: goto -131 -> 714
    //   848: astore_0
    //   849: goto -17 -> 832
    //   852: astore_1
    //   853: goto -13 -> 840
    //   856: astore_2
    //   857: iload 13
    //   859: istore 8
    //   861: iload 10
    //   863: istore 9
    //   865: goto -165 -> 700
    //   868: aload 15
    //   870: astore_2
    //   871: goto -398 -> 473
    //   874: iconst_0
    //   875: istore 8
    //   877: goto -662 -> 215
    //   880: aconst_null
    //   881: astore 14
    //   883: goto -668 -> 215
    //   886: iconst_1
    //   887: istore 8
    //   889: goto -808 -> 81
    //   892: aload 14
    //   894: astore_2
    //   895: goto -744 -> 151
    //   898: iconst_1
    //   899: istore 8
    //   901: goto -686 -> 215
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	904	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	904	1	paramString1	String
    //   0	904	2	paramString2	String
    //   0	904	3	paramString3	String
    //   0	904	4	paramList1	java.util.List<String>
    //   0	904	5	paramList2	java.util.List<String>
    //   0	904	6	paramExecuteSqlCallback	ExecuteSqlCallback
    //   0	904	7	paramBoolean	boolean
    //   79	821	8	i	int
    //   65	799	9	j	int
    //   62	800	10	k	int
    //   59	750	11	m	int
    //   504	201	12	n	int
    //   492	366	13	i1	int
    //   86	807	14	str1	String
    //   182	687	15	localObject	Object
    //   46	790	16	localBufferedReader	java.io.BufferedReader
    //   76	505	17	localHashMap	java.util.HashMap
    //   590	72	18	str2	String
    // Exception table:
    //   from	to	target	type
    //   31	48	242	java/io/FileNotFoundException
    //   410	419	687	java/lang/Exception
    //   423	438	687	java/lang/Exception
    //   452	462	687	java/lang/Exception
    //   466	473	687	java/lang/Exception
    //   483	488	687	java/lang/Exception
    //   567	576	687	java/lang/Exception
    //   580	592	687	java/lang/Exception
    //   599	607	687	java/lang/Exception
    //   611	622	687	java/lang/Exception
    //   626	644	687	java/lang/Exception
    //   648	655	687	java/lang/Exception
    //   659	667	687	java/lang/Exception
    //   671	684	687	java/lang/Exception
    //   69	78	819	java/io/IOException
    //   81	88	819	java/io/IOException
    //   98	124	819	java/io/IOException
    //   127	137	819	java/io/IOException
    //   140	148	819	java/io/IOException
    //   159	184	819	java/io/IOException
    //   184	212	819	java/io/IOException
    //   220	236	819	java/io/IOException
    //   260	280	819	java/io/IOException
    //   280	298	819	java/io/IOException
    //   298	305	819	java/io/IOException
    //   311	336	819	java/io/IOException
    //   344	369	819	java/io/IOException
    //   369	397	819	java/io/IOException
    //   410	419	819	java/io/IOException
    //   423	438	819	java/io/IOException
    //   452	462	819	java/io/IOException
    //   466	473	819	java/io/IOException
    //   483	488	819	java/io/IOException
    //   513	525	819	java/io/IOException
    //   567	576	819	java/io/IOException
    //   580	592	819	java/io/IOException
    //   599	607	819	java/io/IOException
    //   611	622	819	java/io/IOException
    //   626	644	819	java/io/IOException
    //   648	655	819	java/io/IOException
    //   659	667	819	java/io/IOException
    //   671	684	819	java/io/IOException
    //   69	78	834	finally
    //   81	88	834	finally
    //   98	124	834	finally
    //   127	137	834	finally
    //   140	148	834	finally
    //   159	184	834	finally
    //   184	212	834	finally
    //   220	236	834	finally
    //   260	280	834	finally
    //   280	298	834	finally
    //   298	305	834	finally
    //   311	336	834	finally
    //   344	369	834	finally
    //   369	397	834	finally
    //   410	419	834	finally
    //   423	438	834	finally
    //   452	462	834	finally
    //   466	473	834	finally
    //   483	488	834	finally
    //   513	525	834	finally
    //   567	576	834	finally
    //   580	592	834	finally
    //   599	607	834	finally
    //   611	622	834	finally
    //   626	644	834	finally
    //   648	655	834	finally
    //   659	667	834	finally
    //   671	684	834	finally
    //   820	827	834	finally
    //   709	714	844	java/io/IOException
    //   827	832	848	java/io/IOException
    //   835	840	852	java/io/IOException
    //   513	525	856	java/lang/Exception
  }
  
  public static ArrayList<String> getColumnNamesFromSql(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.substring(paramString.indexOf("(") + 1, paramString.lastIndexOf(")")).trim().split(",");
    int i = 0;
    while (i < paramString.length)
    {
      paramString[i] = paramString[i].trim();
      int j = paramString[i].indexOf(" ");
      localArrayList.add(paramString[i].substring(0, j));
      i += 1;
    }
    return localArrayList;
  }
  
  public static String getTableNameFromSql(String paramString)
  {
    String str = paramString;
    if (paramString.length() > 100) {
      str = paramString.substring(0, 100);
    }
    paramString = str.split("\\s");
    if ((paramString != null) && (paramString.length > 1)) {
      return paramString[2].replaceAll("\"", "");
    }
    return null;
  }
  
  private static native boolean nativeDumpDB(String paramString1, String paramString2, String paramString3);
  
  private static native boolean nativeIsSqlComplete(String paramString);
  
  /* Error */
  public static byte[] readFromFile(String paramString)
  {
    // Byte code:
    //   0: new 214	java/io/File
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 215	java/io/File:<init>	(Ljava/lang/String;)V
    //   8: astore_3
    //   9: aload_3
    //   10: invokevirtual 218	java/io/File:exists	()Z
    //   13: ifne +21 -> 34
    //   16: ldc 11
    //   18: ldc_w 270
    //   21: iconst_1
    //   22: anewarray 4	java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: aload_0
    //   28: aastore
    //   29: invokestatic 160	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: aconst_null
    //   33: areturn
    //   34: aload_3
    //   35: invokevirtual 273	java/io/File:length	()J
    //   38: l2i
    //   39: istore_1
    //   40: new 275	java/io/FileInputStream
    //   43: dup
    //   44: aload_3
    //   45: invokespecial 278	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   48: astore_3
    //   49: iload_1
    //   50: newarray <illegal type>
    //   52: astore 4
    //   54: aload_3
    //   55: aload 4
    //   57: invokevirtual 282	java/io/FileInputStream:read	([B)I
    //   60: istore_2
    //   61: iload_2
    //   62: iload_1
    //   63: if_icmpeq +42 -> 105
    //   66: ldc 11
    //   68: ldc_w 284
    //   71: iconst_3
    //   72: anewarray 4	java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload_0
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: iload_1
    //   82: invokestatic 229	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   85: aastore
    //   86: dup
    //   87: iconst_2
    //   88: iload_2
    //   89: invokestatic 229	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   92: aastore
    //   93: invokestatic 160	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: aload_3
    //   97: invokevirtual 285	java/io/FileInputStream:close	()V
    //   100: aconst_null
    //   101: areturn
    //   102: astore_0
    //   103: aconst_null
    //   104: areturn
    //   105: aload_3
    //   106: invokevirtual 285	java/io/FileInputStream:close	()V
    //   109: aload 4
    //   111: areturn
    //   112: astore_0
    //   113: aconst_null
    //   114: astore_0
    //   115: aload_0
    //   116: ifnull +7 -> 123
    //   119: aload_0
    //   120: invokevirtual 285	java/io/FileInputStream:close	()V
    //   123: ldc 11
    //   125: ldc_w 287
    //   128: invokestatic 290	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   131: aconst_null
    //   132: areturn
    //   133: astore_0
    //   134: aconst_null
    //   135: astore_3
    //   136: aload_3
    //   137: ifnull +7 -> 144
    //   140: aload_3
    //   141: invokevirtual 285	java/io/FileInputStream:close	()V
    //   144: aload_0
    //   145: athrow
    //   146: astore_0
    //   147: goto -38 -> 109
    //   150: astore_0
    //   151: goto -28 -> 123
    //   154: astore_3
    //   155: goto -11 -> 144
    //   158: astore_0
    //   159: goto -23 -> 136
    //   162: astore_0
    //   163: aload_3
    //   164: astore_0
    //   165: goto -50 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	paramString	String
    //   39	43	1	i	int
    //   60	29	2	j	int
    //   8	133	3	localObject	Object
    //   154	10	3	localIOException	java.io.IOException
    //   52	58	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   96	100	102	java/io/IOException
    //   34	49	112	java/lang/Exception
    //   34	49	133	finally
    //   105	109	146	java/io/IOException
    //   119	123	150	java/io/IOException
    //   140	144	154	java/io/IOException
    //   49	61	158	finally
    //   66	96	158	finally
    //   49	61	162	java/lang/Exception
    //   66	96	162	java/lang/Exception
  }
  
  public static abstract interface ExecuteSqlCallback
  {
    public abstract String preExecute(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\repair\DBDumpUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */