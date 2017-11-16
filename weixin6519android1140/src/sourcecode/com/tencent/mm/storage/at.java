package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class at
  extends m
{
  public static final String[] fTX;
  public com.tencent.mm.sdk.e.e fTZ;
  
  static
  {
    GMTrace.i(1578937352192L, 11764);
    fTX = new String[] { "CREATE TABLE IF NOT EXISTS  MediaDuplication  (md5 text , size int , path text , createtime long, remuxing text, duration int, status int);", "DROP INDEX IF EXISTS MediaDuplicationMD5Index ", "CREATE INDEX IF NOT EXISTS MD5Index ON MediaDuplication ( md5 )" };
    GMTrace.o(1578937352192L, 11764);
  }
  
  /* Error */
  public at(com.tencent.mm.bu.g paramg)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 11
    //   3: aload_0
    //   4: invokespecial 38	com/tencent/mm/sdk/e/m:<init>	()V
    //   7: ldc2_w 39
    //   10: sipush 11760
    //   13: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   16: aload_0
    //   17: aload_1
    //   18: putfield 42	com/tencent/mm/storage/at:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   21: aload_0
    //   22: getfield 42	com/tencent/mm/storage/at:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   25: new 44	java/lang/StringBuilder
    //   28: dup
    //   29: ldc 46
    //   31: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: ldc 51
    //   36: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: ldc 57
    //   41: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: aconst_null
    //   48: iconst_2
    //   49: invokeinterface 67 4 0
    //   54: astore 10
    //   56: aload 10
    //   58: astore_1
    //   59: aload 10
    //   61: ldc 69
    //   63: invokeinterface 75 2 0
    //   68: istore 5
    //   70: iconst_0
    //   71: istore 4
    //   73: iconst_0
    //   74: istore_3
    //   75: iconst_0
    //   76: istore_2
    //   77: aload 10
    //   79: astore_1
    //   80: aload 10
    //   82: invokeinterface 79 1 0
    //   87: ifeq +77 -> 164
    //   90: iload 5
    //   92: iflt -15 -> 77
    //   95: aload 10
    //   97: astore_1
    //   98: aload 10
    //   100: iload 5
    //   102: invokeinterface 83 2 0
    //   107: astore 12
    //   109: aload 10
    //   111: astore_1
    //   112: ldc 85
    //   114: aload 12
    //   116: invokevirtual 89	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   119: ifeq +8 -> 127
    //   122: iconst_1
    //   123: istore_2
    //   124: goto -47 -> 77
    //   127: aload 10
    //   129: astore_1
    //   130: ldc 91
    //   132: aload 12
    //   134: invokevirtual 89	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   137: ifeq +8 -> 145
    //   140: iconst_1
    //   141: istore_3
    //   142: goto -65 -> 77
    //   145: aload 10
    //   147: astore_1
    //   148: ldc 93
    //   150: aload 12
    //   152: invokevirtual 89	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   155: ifeq -78 -> 77
    //   158: iconst_1
    //   159: istore 4
    //   161: goto -84 -> 77
    //   164: aload 10
    //   166: astore_1
    //   167: aload 10
    //   169: invokeinterface 96 1 0
    //   174: invokestatic 102	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   177: getfield 108	com/tencent/mm/kernel/e:fYV	Lcom/tencent/mm/bu/g;
    //   180: invokestatic 114	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   183: invokevirtual 118	java/lang/Thread:getId	()J
    //   186: invokevirtual 124	com/tencent/mm/bu/g:cE	(J)J
    //   189: lstore 6
    //   191: iload_2
    //   192: ifne +24 -> 216
    //   195: ldc 126
    //   197: ldc -128
    //   199: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: aload_0
    //   203: getfield 42	com/tencent/mm/storage/at:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   206: ldc 51
    //   208: ldc -121
    //   210: invokeinterface 139 3 0
    //   215: pop
    //   216: iload_3
    //   217: ifne +24 -> 241
    //   220: ldc 126
    //   222: ldc -115
    //   224: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   227: aload_0
    //   228: getfield 42	com/tencent/mm/storage/at:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   231: ldc 51
    //   233: ldc -113
    //   235: invokeinterface 139 3 0
    //   240: pop
    //   241: iload 4
    //   243: ifne +24 -> 267
    //   246: ldc 126
    //   248: ldc -111
    //   250: invokestatic 133	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   253: aload_0
    //   254: getfield 42	com/tencent/mm/storage/at:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   257: ldc 51
    //   259: ldc -109
    //   261: invokeinterface 139 3 0
    //   266: pop
    //   267: lload 6
    //   269: lconst_0
    //   270: lcmp
    //   271: ifle +15 -> 286
    //   274: invokestatic 102	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   277: getfield 108	com/tencent/mm/kernel/e:fYV	Lcom/tencent/mm/bu/g;
    //   280: lload 6
    //   282: invokevirtual 151	com/tencent/mm/bu/g:aL	(J)I
    //   285: pop
    //   286: lconst_0
    //   287: lstore 8
    //   289: aload_0
    //   290: getfield 42	com/tencent/mm/storage/at:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   293: new 44	java/lang/StringBuilder
    //   296: dup
    //   297: ldc -103
    //   299: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   302: ldc 51
    //   304: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: aconst_null
    //   311: iconst_2
    //   312: invokeinterface 67 4 0
    //   317: astore 10
    //   319: aload 10
    //   321: astore 11
    //   323: aload 10
    //   325: invokeinterface 156 1 0
    //   330: ifeq +320 -> 650
    //   333: aload 10
    //   335: astore 11
    //   337: aload 10
    //   339: iconst_0
    //   340: invokeinterface 160 2 0
    //   345: istore_2
    //   346: aload 10
    //   348: astore 11
    //   350: aload 10
    //   352: invokeinterface 96 1 0
    //   357: iload_2
    //   358: istore_3
    //   359: lload 8
    //   361: lstore 6
    //   363: iload_2
    //   364: sipush 5000
    //   367: if_icmplt +23 -> 390
    //   370: aload_0
    //   371: getfield 42	com/tencent/mm/storage/at:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   374: ldc 51
    //   376: aconst_null
    //   377: aconst_null
    //   378: invokeinterface 164 4 0
    //   383: istore_3
    //   384: iload_3
    //   385: i2l
    //   386: lstore 6
    //   388: iload_2
    //   389: istore_3
    //   390: ldc 126
    //   392: ldc -90
    //   394: iconst_3
    //   395: anewarray 168	java/lang/Object
    //   398: dup
    //   399: iconst_0
    //   400: iload_3
    //   401: invokestatic 174	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   404: aastore
    //   405: dup
    //   406: iconst_1
    //   407: sipush 5000
    //   410: invokestatic 174	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   413: aastore
    //   414: dup
    //   415: iconst_2
    //   416: lload 6
    //   418: invokestatic 179	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   421: aastore
    //   422: invokestatic 182	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   425: ldc2_w 39
    //   428: sipush 11760
    //   431: invokestatic 31	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   434: return
    //   435: astore 11
    //   437: aconst_null
    //   438: astore 10
    //   440: aload 10
    //   442: astore_1
    //   443: ldc 126
    //   445: aload 11
    //   447: ldc -72
    //   449: iconst_0
    //   450: anewarray 168	java/lang/Object
    //   453: invokestatic 188	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   456: aload 10
    //   458: astore_1
    //   459: ldc 126
    //   461: new 44	java/lang/StringBuilder
    //   464: dup
    //   465: ldc -66
    //   467: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   470: aload 11
    //   472: invokevirtual 191	java/lang/Exception:toString	()Ljava/lang/String;
    //   475: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   481: invokestatic 194	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   484: aload 10
    //   486: ifnull -200 -> 286
    //   489: aload 10
    //   491: invokeinterface 96 1 0
    //   496: goto -210 -> 286
    //   499: astore_1
    //   500: aload 11
    //   502: astore 10
    //   504: aload 10
    //   506: ifnull +10 -> 516
    //   509: aload 10
    //   511: invokeinterface 96 1 0
    //   516: aload_1
    //   517: athrow
    //   518: astore_1
    //   519: aconst_null
    //   520: astore 10
    //   522: iconst_0
    //   523: istore_2
    //   524: aload 10
    //   526: astore 11
    //   528: ldc 126
    //   530: aload_1
    //   531: ldc -72
    //   533: iconst_0
    //   534: anewarray 168	java/lang/Object
    //   537: invokestatic 188	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   540: aload 10
    //   542: astore 11
    //   544: ldc 126
    //   546: new 44	java/lang/StringBuilder
    //   549: dup
    //   550: ldc -60
    //   552: invokespecial 49	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   555: aload_1
    //   556: invokevirtual 191	java/lang/Exception:toString	()Ljava/lang/String;
    //   559: invokevirtual 55	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   562: invokevirtual 61	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   565: invokestatic 194	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   568: iload_2
    //   569: istore_3
    //   570: lload 8
    //   572: lstore 6
    //   574: aload 10
    //   576: ifnull -186 -> 390
    //   579: aload 10
    //   581: invokeinterface 96 1 0
    //   586: iload_2
    //   587: istore_3
    //   588: lload 8
    //   590: lstore 6
    //   592: goto -202 -> 390
    //   595: astore_1
    //   596: aconst_null
    //   597: astore 11
    //   599: aload 11
    //   601: ifnull +10 -> 611
    //   604: aload 11
    //   606: invokeinterface 96 1 0
    //   611: aload_1
    //   612: athrow
    //   613: astore_1
    //   614: goto -15 -> 599
    //   617: astore_1
    //   618: iconst_0
    //   619: istore_2
    //   620: goto -96 -> 524
    //   623: astore_1
    //   624: goto -100 -> 524
    //   627: astore_1
    //   628: aconst_null
    //   629: astore 10
    //   631: goto -107 -> 524
    //   634: astore 11
    //   636: aload_1
    //   637: astore 10
    //   639: aload 11
    //   641: astore_1
    //   642: goto -138 -> 504
    //   645: astore 11
    //   647: goto -207 -> 440
    //   650: iconst_0
    //   651: istore_2
    //   652: goto -306 -> 346
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	655	0	this	at
    //   0	655	1	paramg	com.tencent.mm.bu.g
    //   76	576	2	i	int
    //   74	514	3	j	int
    //   71	171	4	k	int
    //   68	33	5	m	int
    //   189	402	6	l1	long
    //   287	302	8	l2	long
    //   54	584	10	localObject1	Object
    //   1	348	11	localObject2	Object
    //   435	66	11	localException1	Exception
    //   526	79	11	localObject3	Object
    //   634	6	11	localObject4	Object
    //   645	1	11	localException2	Exception
    //   107	44	12	str	String
    // Exception table:
    //   from	to	target	type
    //   21	56	435	java/lang/Exception
    //   174	191	435	java/lang/Exception
    //   195	216	435	java/lang/Exception
    //   220	241	435	java/lang/Exception
    //   246	267	435	java/lang/Exception
    //   274	286	435	java/lang/Exception
    //   21	56	499	finally
    //   174	191	499	finally
    //   195	216	499	finally
    //   220	241	499	finally
    //   246	267	499	finally
    //   274	286	499	finally
    //   289	319	518	java/lang/Exception
    //   289	319	595	finally
    //   370	384	595	finally
    //   323	333	613	finally
    //   337	346	613	finally
    //   350	357	613	finally
    //   528	540	613	finally
    //   544	568	613	finally
    //   323	333	617	java/lang/Exception
    //   337	346	617	java/lang/Exception
    //   350	357	623	java/lang/Exception
    //   370	384	627	java/lang/Exception
    //   59	70	634	finally
    //   80	90	634	finally
    //   98	109	634	finally
    //   112	122	634	finally
    //   130	140	634	finally
    //   148	158	634	finally
    //   167	174	634	finally
    //   443	456	634	finally
    //   459	484	634	finally
    //   59	70	645	java/lang/Exception
    //   80	90	645	java/lang/Exception
    //   98	109	645	java/lang/Exception
    //   112	122	645	java/lang/Exception
    //   130	140	645	java/lang/Exception
    //   148	158	645	java/lang/Exception
    //   167	174	645	java/lang/Exception
  }
  
  public final boolean H(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(17503602343936L, 130412);
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.w("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing info, but path is null. [%s, %s] ", new Object[] { paramString1, paramString2 });
      GMTrace.o(17503602343936L, 130412);
      return false;
    }
    int i = com.tencent.mm.a.e.aY(paramString1);
    int j = com.tencent.mm.a.e.aY(paramString2);
    if ((i <= 0) || (j <= 0))
    {
      w.w("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing info, but file size is zero.[%d, %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      GMTrace.o(17503602343936L, 130412);
      return false;
    }
    String str = g.bg(paramString1);
    if (bg.nm(str))
    {
      w.w("MicroMsg.MediaCheckDuplicationStorage", "import file is not null, but md5 is null, path " + paramString1 + " size : " + i);
      GMTrace.o(17503602343936L, 130412);
      return false;
    }
    long l1 = bg.Pw();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("md5", str);
    localContentValues.put("size", Integer.valueOf(i));
    localContentValues.put("createtime", Long.valueOf(bg.Pv()));
    localContentValues.put("remuxing", paramString2);
    localContentValues.put("duration", Integer.valueOf(paramInt));
    localContentValues.put("status", Integer.valueOf(100));
    long l2 = this.fTZ.insert("MediaDuplication", "", localContentValues);
    w.i("MicroMsg.MediaCheckDuplicationStorage", "insert video remuxing ret[%d], size[%d], md5[%s], remuxingPath[%s], importPath[%s], duration[%d], cost time[%d]", new Object[] { Long.valueOf(l2), Integer.valueOf(i), str, paramString2, paramString1, Integer.valueOf(paramInt), Long.valueOf(bg.aI(l1)) });
    if (l2 > 0L)
    {
      GMTrace.o(17503602343936L, 130412);
      return true;
    }
    GMTrace.o(17503602343936L, 130412);
    return false;
  }
  
  protected final boolean Hf()
  {
    GMTrace.i(1578266263552L, 11759);
    GMTrace.o(1578266263552L, 11759);
    return false;
  }
  
  public final boolean a(String paramString, PString paramPString, PInt paramPInt)
  {
    GMTrace.i(1578803134464L, 11763);
    if (bg.nm(paramString))
    {
      w.d("MicroMsg.MediaCheckDuplicationStorage", "check video remuxing, but import path is null.");
      GMTrace.o(1578803134464L, 11763);
      return false;
    }
    int i = com.tencent.mm.a.e.aY(paramString);
    if (i <= 0)
    {
      w.w("MicroMsg.MediaCheckDuplicationStorage", "check video remuxing, but file size is zero. path : " + paramString);
      GMTrace.o(1578803134464L, 11763);
      return false;
    }
    String str = g.bg(paramString);
    if (bg.nm(str))
    {
      w.w("MicroMsg.MediaCheckDuplicationStorage", "check video remuxing, but md5 is null. path : " + paramString);
      GMTrace.o(1578803134464L, 11763);
      return false;
    }
    Object localObject2 = "select remuxing, duration from MediaDuplication  where md5 = '" + str + "' AND  size = " + i + " AND status = 100";
    long l = bg.Pw();
    Object localObject1 = null;
    paramString = null;
    try
    {
      localObject2 = this.fTZ.a((String)localObject2, null, 2);
      if (localObject2 != null)
      {
        paramString = (String)localObject2;
        localObject1 = localObject2;
        if (((Cursor)localObject2).moveToFirst())
        {
          paramString = (String)localObject2;
          localObject1 = localObject2;
          paramPString.value = ((Cursor)localObject2).getString(0);
          paramString = (String)localObject2;
          localObject1 = localObject2;
          paramPInt.value = ((Cursor)localObject2).getInt(1);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject1 = paramString;
        w.printErrStackTrace("MicroMsg.MediaCheckDuplicationStorage", localException, "", new Object[0]);
        localObject1 = paramString;
        w.e("MicroMsg.MediaCheckDuplicationStorage", "check video remuxing error: " + localException.toString());
        if (paramString != null) {
          paramString.close();
        }
      }
    }
    finally
    {
      if (localObject1 == null) {
        break label362;
      }
      ((Cursor)localObject1).close();
    }
    if (bg.nm(paramPString.value))
    {
      w.d("MicroMsg.MediaCheckDuplicationStorage", "it has no remuxing path.");
      GMTrace.o(1578803134464L, 11763);
      return false;
    }
    label362:
    if (com.tencent.mm.a.e.aY(paramPString.value) <= 0)
    {
      w.w("MicroMsg.MediaCheckDuplicationStorage", "remuxing file size is zero, delete db record now. remuxing path : " + paramPString.value);
      this.fTZ.delete("MediaDuplication", "md5=? AND size=? AND status=?", new String[] { str, String.valueOf(i), "100" });
      paramPString.value = null;
      GMTrace.o(1578803134464L, 11763);
      return false;
    }
    w.i("MicroMsg.MediaCheckDuplicationStorage", "check remuxing file success. remuxing path[%s], duration [%d], cost time[%d]", new Object[] { paramPString.value, Integer.valueOf(paramPInt.value), Long.valueOf(bg.aI(l)) });
    GMTrace.o(1578803134464L, 11763);
    return true;
  }
  
  public final String cN(String paramString, int paramInt)
  {
    GMTrace.i(1578668916736L, 11762);
    if ((bg.nm(paramString)) || (paramInt <= 0))
    {
      w.e("MicroMsg.MediaCheckDuplicationStorage", "check  md5:%s size:%d", new Object[] { paramString, Integer.valueOf(paramInt) });
      GMTrace.o(1578668916736L, 11762);
      return "";
    }
    String str = "select path from MediaDuplication where md5 = '" + paramString + "' and  size = " + paramInt + " and status != 100";
    Object localObject = this.fTZ.a(str, null, 2);
    if (localObject == null)
    {
      w.e("MicroMsg.MediaCheckDuplicationStorage", "check query return null sql:%s", new Object[] { str });
      GMTrace.o(1578668916736L, 11762);
      return null;
    }
    str = "";
    if (((Cursor)localObject).moveToNext()) {
      str = ((Cursor)localObject).getString(0);
    }
    ((Cursor)localObject).close();
    localObject = str;
    if (!bg.nm(str))
    {
      int i = com.tencent.mm.a.e.aY(str);
      localObject = str;
      if (i <= 0)
      {
        w.w("MicroMsg.MediaCheckDuplicationStorage", "check file size is zero, delete db record now. path[%s], fileSize[%d], size[%d]", new Object[] { str, Integer.valueOf(i), Integer.valueOf(paramInt) });
        this.fTZ.delete("MediaDuplication", "md5=? AND size=? AND status!=?", new String[] { paramString, String.valueOf(paramInt), "100" });
        localObject = "";
      }
    }
    GMTrace.o(1578668916736L, 11762);
    return (String)localObject;
  }
  
  public final boolean u(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(1578534699008L, 11761);
    if (bg.nm(paramString2))
    {
      w.e("MicroMsg.MediaCheckDuplicationStorage", "insert path is null");
      GMTrace.o(1578534699008L, 11761);
      return false;
    }
    int i = paramInt;
    if (paramInt <= 0)
    {
      i = com.tencent.mm.a.e.aY(paramString2);
      if (i <= 0)
      {
        w.e("MicroMsg.MediaCheckDuplicationStorage", "insert path insize:%d size:%d  path:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramString2 });
        GMTrace.o(1578534699008L, 11761);
        return false;
      }
    }
    String str = paramString1;
    if (bg.nm(paramString1))
    {
      paramString1 = g.bg(paramString2);
      str = paramString1;
      if (bg.nm(paramString1))
      {
        w.e("MicroMsg.MediaCheckDuplicationStorage", "insert path read md5 failed  path:%s", new Object[] { paramString2 });
        GMTrace.o(1578534699008L, 11761);
        return false;
      }
    }
    paramString1 = new ContentValues();
    paramString1.put("md5", str);
    paramString1.put("size", Integer.valueOf(i));
    paramString1.put("path", paramString2);
    paramString1.put("createtime", Long.valueOf(bg.Pv()));
    paramString1.put("status", Integer.valueOf(101));
    long l = this.fTZ.insert("MediaDuplication", "", paramString1);
    w.i("MicroMsg.MediaCheckDuplicationStorage", "insert Ret:%d size:%d md5:%s path:%s", new Object[] { Long.valueOf(l), Integer.valueOf(i), str, paramString2 });
    if (l > 0L)
    {
      GMTrace.o(1578534699008L, 11761);
      return true;
    }
    GMTrace.o(1578534699008L, 11761);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */