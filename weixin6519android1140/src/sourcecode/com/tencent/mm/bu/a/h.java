package com.tencent.mm.bu.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectQuery;
import com.tencent.wcdb.support.CancellationSignal;

public final class h
  extends SQLiteDirectQuery
{
  h(SQLiteDatabase paramSQLiteDatabase, String paramString, CancellationSignal paramCancellationSignal)
  {
    super(paramSQLiteDatabase, paramString, null, paramCancellationSignal);
    GMTrace.i(17538767388672L, 130674);
    GMTrace.o(17538767388672L, 130674);
  }
  
  /* Error */
  final int a(b paramb, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 6
    //   3: ldc2_w 29
    //   6: ldc 31
    //   8: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: aload_0
    //   12: invokevirtual 35	com/tencent/mm/bu/a/h:acquireReference	()V
    //   15: aload_1
    //   16: invokevirtual 38	com/tencent/mm/bu/a/b:acquireReference	()V
    //   19: iload_2
    //   20: ifle +61 -> 81
    //   23: aload_0
    //   24: iload_2
    //   25: invokevirtual 42	com/tencent/mm/bu/a/h:step	(I)I
    //   28: istore 4
    //   30: iload 4
    //   32: iload_2
    //   33: if_icmpge +48 -> 81
    //   36: ldc 44
    //   38: ldc 46
    //   40: iconst_2
    //   41: anewarray 48	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: iload_2
    //   47: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   50: aastore
    //   51: dup
    //   52: iconst_1
    //   53: iload 4
    //   55: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: aastore
    //   59: invokestatic 60	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: aload_1
    //   63: invokevirtual 63	com/tencent/mm/bu/a/b:releaseReference	()V
    //   66: aload_0
    //   67: invokevirtual 64	com/tencent/mm/bu/a/h:releaseReference	()V
    //   70: ldc2_w 29
    //   73: ldc 31
    //   75: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   78: iload 4
    //   80: ireturn
    //   81: aload_0
    //   82: invokevirtual 68	com/tencent/mm/bu/a/h:getColumnNames	()[Ljava/lang/String;
    //   85: arraylength
    //   86: istore 7
    //   88: iload_2
    //   89: istore 4
    //   91: iload 4
    //   93: iload_3
    //   94: iload_2
    //   95: iadd
    //   96: if_icmpge +329 -> 425
    //   99: iload 6
    //   101: istore 5
    //   103: aload_0
    //   104: iconst_1
    //   105: invokevirtual 42	com/tencent/mm/bu/a/h:step	(I)I
    //   108: iconst_1
    //   109: if_icmpne +263 -> 372
    //   112: aload_1
    //   113: aload_1
    //   114: invokevirtual 72	com/tencent/mm/bu/a/b:bVm	()Lcom/tencent/mm/bu/a/a;
    //   117: putfield 76	com/tencent/mm/bu/a/b:vDR	Lcom/tencent/mm/bu/a/a;
    //   120: iconst_0
    //   121: istore 5
    //   123: iload 5
    //   125: iload 7
    //   127: if_icmpge +229 -> 356
    //   130: aload_0
    //   131: iload 5
    //   133: invokevirtual 79	com/tencent/mm/bu/a/h:getType	(I)I
    //   136: tableswitch	default:+277->413, 0:+280->416, 1:+106->242, 2:+179->315, 3:+75->211, 4:+189->325
    //   172: aload_1
    //   173: iload 4
    //   175: iconst_1
    //   176: invokevirtual 83	com/tencent/mm/bu/a/b:ef	(II)V
    //   179: new 28	com/tencent/wcdb/database/SQLiteException
    //   182: dup
    //   183: ldc 85
    //   185: invokespecial 88	com/tencent/wcdb/database/SQLiteException:<init>	(Ljava/lang/String;)V
    //   188: athrow
    //   189: astore 10
    //   191: aload_0
    //   192: invokevirtual 91	com/tencent/mm/bu/a/h:onCorruption	()V
    //   195: aload 10
    //   197: athrow
    //   198: astore 10
    //   200: aload_1
    //   201: invokevirtual 63	com/tencent/mm/bu/a/b:releaseReference	()V
    //   204: aload_0
    //   205: invokevirtual 64	com/tencent/mm/bu/a/h:releaseReference	()V
    //   208: aload 10
    //   210: athrow
    //   211: aload_0
    //   212: iload 5
    //   214: invokevirtual 95	com/tencent/mm/bu/a/h:getString	(I)Ljava/lang/String;
    //   217: astore 10
    //   219: aload_1
    //   220: getfield 76	com/tencent/mm/bu/a/b:vDR	Lcom/tencent/mm/bu/a/a;
    //   223: ifnull +193 -> 416
    //   226: aload_1
    //   227: getfield 76	com/tencent/mm/bu/a/b:vDR	Lcom/tencent/mm/bu/a/a;
    //   230: iload 5
    //   232: aload 10
    //   234: invokeinterface 101 3 0
    //   239: goto +177 -> 416
    //   242: aload_0
    //   243: iload 5
    //   245: invokevirtual 105	com/tencent/mm/bu/a/h:getLong	(I)J
    //   248: lstore 8
    //   250: aload_1
    //   251: getfield 76	com/tencent/mm/bu/a/b:vDR	Lcom/tencent/mm/bu/a/a;
    //   254: ifnull +162 -> 416
    //   257: aload_1
    //   258: getfield 76	com/tencent/mm/bu/a/b:vDR	Lcom/tencent/mm/bu/a/a;
    //   261: iload 5
    //   263: lload 8
    //   265: invokeinterface 109 4 0
    //   270: goto +146 -> 416
    //   273: astore 10
    //   275: ldc 44
    //   277: new 111	java/lang/StringBuilder
    //   280: dup
    //   281: ldc 113
    //   283: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   286: aload 10
    //   288: invokevirtual 118	com/tencent/wcdb/database/SQLiteException:getMessage	()Ljava/lang/String;
    //   291: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: ldc 124
    //   296: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: aload_0
    //   300: invokevirtual 127	com/tencent/mm/bu/a/h:getSql	()Ljava/lang/String;
    //   303: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   309: invokestatic 134	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   312: aload 10
    //   314: athrow
    //   315: aload_0
    //   316: iload 5
    //   318: invokevirtual 138	com/tencent/mm/bu/a/h:getDouble	(I)D
    //   321: pop2
    //   322: goto +94 -> 416
    //   325: aload_0
    //   326: iload 5
    //   328: invokevirtual 142	com/tencent/mm/bu/a/h:getBlob	(I)[B
    //   331: astore 10
    //   333: aload_1
    //   334: getfield 76	com/tencent/mm/bu/a/b:vDR	Lcom/tencent/mm/bu/a/a;
    //   337: ifnull +79 -> 416
    //   340: aload_1
    //   341: getfield 76	com/tencent/mm/bu/a/b:vDR	Lcom/tencent/mm/bu/a/a;
    //   344: iload 5
    //   346: aload 10
    //   348: invokeinterface 146 3 0
    //   353: goto +63 -> 416
    //   356: aload_1
    //   357: iload 4
    //   359: iconst_0
    //   360: invokevirtual 83	com/tencent/mm/bu/a/b:ef	(II)V
    //   363: iload 4
    //   365: iconst_1
    //   366: iadd
    //   367: istore 4
    //   369: goto -278 -> 91
    //   372: iload 4
    //   374: istore_2
    //   375: iload 5
    //   377: ifne +13 -> 390
    //   380: iload 4
    //   382: aload_0
    //   383: ldc -109
    //   385: invokevirtual 42	com/tencent/mm/bu/a/h:step	(I)I
    //   388: iadd
    //   389: istore_2
    //   390: aload_0
    //   391: iconst_1
    //   392: invokevirtual 151	com/tencent/mm/bu/a/h:reset	(Z)V
    //   395: aload_1
    //   396: invokevirtual 63	com/tencent/mm/bu/a/b:releaseReference	()V
    //   399: aload_0
    //   400: invokevirtual 64	com/tencent/mm/bu/a/h:releaseReference	()V
    //   403: ldc2_w 29
    //   406: ldc 31
    //   408: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   411: iload_2
    //   412: ireturn
    //   413: goto -241 -> 172
    //   416: iload 5
    //   418: iconst_1
    //   419: iadd
    //   420: istore 5
    //   422: goto -299 -> 123
    //   425: iconst_0
    //   426: istore 5
    //   428: goto -56 -> 372
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	431	0	this	h
    //   0	431	1	paramb	b
    //   0	431	2	paramInt1	int
    //   0	431	3	paramInt2	int
    //   28	361	4	i	int
    //   101	326	5	j	int
    //   1	99	6	k	int
    //   86	42	7	m	int
    //   248	16	8	l	long
    //   189	7	10	localSQLiteDatabaseCorruptException	com.tencent.wcdb.database.SQLiteDatabaseCorruptException
    //   198	11	10	localObject	Object
    //   217	16	10	str	String
    //   273	40	10	localSQLiteException	com.tencent.wcdb.database.SQLiteException
    //   331	16	10	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   23	30	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   36	62	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   81	88	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   103	120	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   130	172	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   172	189	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   211	239	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   242	270	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   315	322	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   325	353	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   356	363	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   380	390	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   390	395	189	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   23	30	198	finally
    //   36	62	198	finally
    //   81	88	198	finally
    //   103	120	198	finally
    //   130	172	198	finally
    //   172	189	198	finally
    //   191	198	198	finally
    //   211	239	198	finally
    //   242	270	198	finally
    //   275	315	198	finally
    //   315	322	198	finally
    //   325	353	198	finally
    //   356	363	198	finally
    //   380	390	198	finally
    //   390	395	198	finally
    //   23	30	273	com/tencent/wcdb/database/SQLiteException
    //   36	62	273	com/tencent/wcdb/database/SQLiteException
    //   81	88	273	com/tencent/wcdb/database/SQLiteException
    //   103	120	273	com/tencent/wcdb/database/SQLiteException
    //   130	172	273	com/tencent/wcdb/database/SQLiteException
    //   172	189	273	com/tencent/wcdb/database/SQLiteException
    //   211	239	273	com/tencent/wcdb/database/SQLiteException
    //   242	270	273	com/tencent/wcdb/database/SQLiteException
    //   315	322	273	com/tencent/wcdb/database/SQLiteException
    //   325	353	273	com/tencent/wcdb/database/SQLiteException
    //   356	363	273	com/tencent/wcdb/database/SQLiteException
    //   380	390	273	com/tencent/wcdb/database/SQLiteException
    //   390	395	273	com/tencent/wcdb/database/SQLiteException
  }
  
  /* Error */
  final int a(c paramc, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc2_w 153
    //   3: ldc -101
    //   5: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: invokevirtual 35	com/tencent/mm/bu/a/h:acquireReference	()V
    //   12: iload_2
    //   13: ifle +57 -> 70
    //   16: aload_0
    //   17: iload_2
    //   18: invokevirtual 42	com/tencent/mm/bu/a/h:step	(I)I
    //   21: istore 4
    //   23: iload 4
    //   25: iload_2
    //   26: if_icmpge +44 -> 70
    //   29: ldc 44
    //   31: ldc 46
    //   33: iconst_2
    //   34: anewarray 48	java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: iload_2
    //   40: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: aastore
    //   44: dup
    //   45: iconst_1
    //   46: iload 4
    //   48: invokestatic 54	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   51: aastore
    //   52: invokestatic 60	com/tencent/wcdb/support/Log:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: aload_0
    //   56: invokevirtual 64	com/tencent/mm/bu/a/h:releaseReference	()V
    //   59: ldc2_w 153
    //   62: ldc -101
    //   64: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: iload 4
    //   69: ireturn
    //   70: aload_0
    //   71: invokevirtual 68	com/tencent/mm/bu/a/h:getColumnNames	()[Ljava/lang/String;
    //   74: arraylength
    //   75: istore 6
    //   77: iload_2
    //   78: istore 4
    //   80: iload 4
    //   82: iload_3
    //   83: iload_2
    //   84: iadd
    //   85: if_icmpge +408 -> 493
    //   88: aload_0
    //   89: iconst_1
    //   90: invokevirtual 42	com/tencent/mm/bu/a/h:step	(I)I
    //   93: iconst_1
    //   94: if_icmpne +422 -> 516
    //   97: iload 4
    //   99: aload_1
    //   100: getfield 161	com/tencent/mm/bu/a/c:vDT	I
    //   103: idiv
    //   104: istore 5
    //   106: aload_1
    //   107: getfield 165	com/tencent/mm/bu/a/c:vDS	Landroid/util/SparseArray;
    //   110: iload 5
    //   112: invokevirtual 170	android/util/SparseArray:indexOfKey	(I)I
    //   115: ifge +165 -> 280
    //   118: aload_1
    //   119: getfield 161	com/tencent/mm/bu/a/c:vDT	I
    //   122: aload_1
    //   123: getfield 173	com/tencent/mm/bu/a/c:columnCount	I
    //   126: imul
    //   127: anewarray 48	java/lang/Object
    //   130: astore 9
    //   132: aload_1
    //   133: getfield 165	com/tencent/mm/bu/a/c:vDS	Landroid/util/SparseArray;
    //   136: iload 5
    //   138: aload 9
    //   140: invokevirtual 177	android/util/SparseArray:put	(ILjava/lang/Object;)V
    //   143: aload_1
    //   144: getfield 161	com/tencent/mm/bu/a/c:vDT	I
    //   147: istore 5
    //   149: aload_1
    //   150: getfield 173	com/tencent/mm/bu/a/c:columnCount	I
    //   153: iload 4
    //   155: iload 5
    //   157: irem
    //   158: imul
    //   159: istore 7
    //   161: aload_1
    //   162: getfield 173	com/tencent/mm/bu/a/c:columnCount	I
    //   165: istore 8
    //   167: iload 4
    //   169: iconst_1
    //   170: iadd
    //   171: istore 5
    //   173: iload 5
    //   175: aload_1
    //   176: getfield 180	com/tencent/mm/bu/a/c:vDU	I
    //   179: if_icmple +118 -> 297
    //   182: aload_1
    //   183: iload 5
    //   185: putfield 180	com/tencent/mm/bu/a/c:vDU	I
    //   188: new 182	com/tencent/mm/bu/a/c$a
    //   191: dup
    //   192: aload_1
    //   193: iload 7
    //   195: iload 7
    //   197: iload 8
    //   199: iadd
    //   200: aload 9
    //   202: invokespecial 185	com/tencent/mm/bu/a/c$a:<init>	(Lcom/tencent/mm/bu/a/c;II[Ljava/lang/Object;)V
    //   205: astore 10
    //   207: iconst_0
    //   208: istore 5
    //   210: iload 5
    //   212: iload 6
    //   214: if_icmpge +293 -> 507
    //   217: aload_0
    //   218: iload 5
    //   220: invokevirtual 79	com/tencent/mm/bu/a/h:getType	(I)I
    //   223: tableswitch	default:+275->498, 0:+278->501, 1:+153->376, 2:+167->390, 3:+83->306, 4:+181->404
    //   256: new 28	com/tencent/wcdb/database/SQLiteException
    //   259: dup
    //   260: ldc 85
    //   262: invokespecial 88	com/tencent/wcdb/database/SQLiteException:<init>	(Ljava/lang/String;)V
    //   265: athrow
    //   266: astore_1
    //   267: aload_0
    //   268: invokevirtual 91	com/tencent/mm/bu/a/h:onCorruption	()V
    //   271: aload_1
    //   272: athrow
    //   273: astore_1
    //   274: aload_0
    //   275: invokevirtual 64	com/tencent/mm/bu/a/h:releaseReference	()V
    //   278: aload_1
    //   279: athrow
    //   280: aload_1
    //   281: getfield 165	com/tencent/mm/bu/a/c:vDS	Landroid/util/SparseArray;
    //   284: iload 5
    //   286: invokevirtual 189	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   289: checkcast 191	[Ljava/lang/Object;
    //   292: astore 9
    //   294: goto -151 -> 143
    //   297: aload_1
    //   298: getfield 180	com/tencent/mm/bu/a/c:vDU	I
    //   301: istore 5
    //   303: goto -121 -> 182
    //   306: aload_0
    //   307: iload 5
    //   309: invokevirtual 95	com/tencent/mm/bu/a/h:getString	(I)Ljava/lang/String;
    //   312: astore 9
    //   314: aload 10
    //   316: getfield 194	com/tencent/mm/bu/a/c$a:index	I
    //   319: aload 10
    //   321: getfield 197	com/tencent/mm/bu/a/c$a:endIndex	I
    //   324: if_icmpne +91 -> 415
    //   327: new 199	android/database/CursorIndexOutOfBoundsException
    //   330: dup
    //   331: ldc -55
    //   333: invokespecial 202	android/database/CursorIndexOutOfBoundsException:<init>	(Ljava/lang/String;)V
    //   336: athrow
    //   337: astore_1
    //   338: ldc 44
    //   340: new 111	java/lang/StringBuilder
    //   343: dup
    //   344: ldc 113
    //   346: invokespecial 114	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   349: aload_1
    //   350: invokevirtual 118	com/tencent/wcdb/database/SQLiteException:getMessage	()Ljava/lang/String;
    //   353: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: ldc 124
    //   358: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: aload_0
    //   362: invokevirtual 127	com/tencent/mm/bu/a/h:getSql	()Ljava/lang/String;
    //   365: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   371: invokestatic 134	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   374: aload_1
    //   375: athrow
    //   376: aload_0
    //   377: iload 5
    //   379: invokevirtual 105	com/tencent/mm/bu/a/h:getLong	(I)J
    //   382: invokestatic 207	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   385: astore 9
    //   387: goto -73 -> 314
    //   390: aload_0
    //   391: iload 5
    //   393: invokevirtual 138	com/tencent/mm/bu/a/h:getDouble	(I)D
    //   396: invokestatic 212	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   399: astore 9
    //   401: goto -87 -> 314
    //   404: aload_0
    //   405: iload 5
    //   407: invokevirtual 142	com/tencent/mm/bu/a/h:getBlob	(I)[B
    //   410: astore 9
    //   412: goto -98 -> 314
    //   415: aload 10
    //   417: getfield 215	com/tencent/mm/bu/a/c$a:vDV	[Ljava/lang/Object;
    //   420: astore 11
    //   422: aload 10
    //   424: getfield 194	com/tencent/mm/bu/a/c$a:index	I
    //   427: istore 7
    //   429: aload 10
    //   431: iload 7
    //   433: iconst_1
    //   434: iadd
    //   435: putfield 194	com/tencent/mm/bu/a/c$a:index	I
    //   438: aload 11
    //   440: iload 7
    //   442: aload 9
    //   444: aastore
    //   445: iload 5
    //   447: iconst_1
    //   448: iadd
    //   449: istore 5
    //   451: goto -241 -> 210
    //   454: iload_2
    //   455: ifne +32 -> 487
    //   458: aload_0
    //   459: ldc -109
    //   461: invokevirtual 42	com/tencent/mm/bu/a/h:step	(I)I
    //   464: iload 4
    //   466: iadd
    //   467: istore_2
    //   468: aload_0
    //   469: iconst_1
    //   470: invokevirtual 151	com/tencent/mm/bu/a/h:reset	(Z)V
    //   473: aload_0
    //   474: invokevirtual 64	com/tencent/mm/bu/a/h:releaseReference	()V
    //   477: ldc2_w 153
    //   480: ldc -101
    //   482: invokestatic 21	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   485: iload_2
    //   486: ireturn
    //   487: iload 4
    //   489: istore_2
    //   490: goto -22 -> 468
    //   493: iconst_0
    //   494: istore_2
    //   495: goto -41 -> 454
    //   498: goto -242 -> 256
    //   501: aconst_null
    //   502: astore 9
    //   504: goto -190 -> 314
    //   507: iload 4
    //   509: iconst_1
    //   510: iadd
    //   511: istore 4
    //   513: goto -433 -> 80
    //   516: iconst_1
    //   517: istore_2
    //   518: goto -64 -> 454
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	521	0	this	h
    //   0	521	1	paramc	c
    //   0	521	2	paramInt1	int
    //   0	521	3	paramInt2	int
    //   21	491	4	i	int
    //   104	346	5	j	int
    //   75	140	6	k	int
    //   159	282	7	m	int
    //   165	35	8	n	int
    //   130	373	9	localObject	Object
    //   205	225	10	locala	c.a
    //   420	19	11	arrayOfObject	Object[]
    // Exception table:
    //   from	to	target	type
    //   16	23	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   29	55	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   70	77	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   88	143	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   143	167	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   173	182	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   182	207	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   217	256	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   256	266	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   280	294	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   297	303	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   306	314	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   314	337	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   376	387	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   390	401	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   404	412	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   415	438	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   458	468	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   468	473	266	com/tencent/wcdb/database/SQLiteDatabaseCorruptException
    //   16	23	273	finally
    //   29	55	273	finally
    //   70	77	273	finally
    //   88	143	273	finally
    //   143	167	273	finally
    //   173	182	273	finally
    //   182	207	273	finally
    //   217	256	273	finally
    //   256	266	273	finally
    //   267	273	273	finally
    //   280	294	273	finally
    //   297	303	273	finally
    //   306	314	273	finally
    //   314	337	273	finally
    //   338	376	273	finally
    //   376	387	273	finally
    //   390	401	273	finally
    //   404	412	273	finally
    //   415	438	273	finally
    //   458	468	273	finally
    //   468	473	273	finally
    //   16	23	337	com/tencent/wcdb/database/SQLiteException
    //   29	55	337	com/tencent/wcdb/database/SQLiteException
    //   70	77	337	com/tencent/wcdb/database/SQLiteException
    //   88	143	337	com/tencent/wcdb/database/SQLiteException
    //   143	167	337	com/tencent/wcdb/database/SQLiteException
    //   173	182	337	com/tencent/wcdb/database/SQLiteException
    //   182	207	337	com/tencent/wcdb/database/SQLiteException
    //   217	256	337	com/tencent/wcdb/database/SQLiteException
    //   256	266	337	com/tencent/wcdb/database/SQLiteException
    //   280	294	337	com/tencent/wcdb/database/SQLiteException
    //   297	303	337	com/tencent/wcdb/database/SQLiteException
    //   306	314	337	com/tencent/wcdb/database/SQLiteException
    //   314	337	337	com/tencent/wcdb/database/SQLiteException
    //   376	387	337	com/tencent/wcdb/database/SQLiteException
    //   390	401	337	com/tencent/wcdb/database/SQLiteException
    //   404	412	337	com/tencent/wcdb/database/SQLiteException
    //   415	438	337	com/tencent/wcdb/database/SQLiteException
    //   458	468	337	com/tencent/wcdb/database/SQLiteException
    //   468	473	337	com/tencent/wcdb/database/SQLiteException
  }
  
  public final String toString()
  {
    GMTrace.i(17538901606400L, 130675);
    String str = "SQLiteNewQuery: " + getSql();
    GMTrace.o(17538901606400L, 130675);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bu\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */