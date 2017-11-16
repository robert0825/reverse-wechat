package com.tencent.mm.plugin.i.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class b
  extends i<a>
{
  public static final String[] eZt;
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(20659598000128L, 153926);
    fTX = new String[] { i.a(a.fTp, "WxFileIndex2"), "DROP TABLE IF EXISTS WxFileIndex" };
    eZt = new String[] { "CREATE  INDEX IF NOT EXISTS msgid_username_index ON WxFileIndex2 ( msgId,username,msgSubType ) ", "CREATE  INDEX IF NOT EXISTS username_type_index ON WxFileIndex2 ( username,msgtime,msgSubType ) " };
    GMTrace.o(20659598000128L, 153926);
  }
  
  public b(e parame)
  {
    super(parame, a.fTp, "WxFileIndex2", eZt);
    GMTrace.i(20658121605120L, 153915);
    this.fTZ = parame;
    GMTrace.o(20658121605120L, 153915);
  }
  
  /* Error */
  public final List<a> K(com.tencent.mm.storage.au paramau)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc2_w 64
    //   5: ldc 66
    //   7: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_1
    //   11: ifnonnull +13 -> 24
    //   14: ldc2_w 64
    //   17: ldc 66
    //   19: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   22: aconst_null
    //   23: areturn
    //   24: new 68	java/lang/StringBuilder
    //   27: dup
    //   28: ldc 70
    //   30: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   33: aload_1
    //   34: getfield 79	com/tencent/mm/g/b/ce:field_msgId	J
    //   37: invokevirtual 83	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   40: ldc 85
    //   42: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: aload_1
    //   46: getfield 92	com/tencent/mm/g/b/ce:field_talker	Ljava/lang/String;
    //   49: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: ldc 94
    //   54: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: astore_1
    //   61: new 100	java/util/ArrayList
    //   64: dup
    //   65: invokespecial 102	java/util/ArrayList:<init>	()V
    //   68: astore_3
    //   69: aload_0
    //   70: getfield 59	com/tencent/mm/plugin/i/b/b:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   73: aload_1
    //   74: aconst_null
    //   75: invokeinterface 108 3 0
    //   80: astore_1
    //   81: aload_1
    //   82: astore_2
    //   83: aload_1
    //   84: invokeinterface 114 1 0
    //   89: ifeq +57 -> 146
    //   92: aload_1
    //   93: astore_2
    //   94: new 25	com/tencent/mm/plugin/i/b/a
    //   97: dup
    //   98: invokespecial 115	com/tencent/mm/plugin/i/b/a:<init>	()V
    //   101: astore 4
    //   103: aload_1
    //   104: astore_2
    //   105: aload 4
    //   107: aload_1
    //   108: invokevirtual 119	com/tencent/mm/plugin/i/b/a:b	(Landroid/database/Cursor;)V
    //   111: aload_1
    //   112: astore_2
    //   113: aload_3
    //   114: aload 4
    //   116: invokeinterface 125 2 0
    //   121: pop
    //   122: goto -41 -> 81
    //   125: astore_1
    //   126: aload_2
    //   127: ifnull +9 -> 136
    //   130: aload_2
    //   131: invokeinterface 128 1 0
    //   136: ldc2_w 64
    //   139: ldc 66
    //   141: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   144: aload_3
    //   145: areturn
    //   146: aload_1
    //   147: ifnull -11 -> 136
    //   150: aload_1
    //   151: invokeinterface 128 1 0
    //   156: goto -20 -> 136
    //   159: astore_1
    //   160: aconst_null
    //   161: astore_3
    //   162: aload_1
    //   163: astore_2
    //   164: aload_3
    //   165: ifnull +9 -> 174
    //   168: aload_3
    //   169: invokeinterface 128 1 0
    //   174: aload_2
    //   175: athrow
    //   176: astore_2
    //   177: aload_1
    //   178: astore_3
    //   179: goto -15 -> 164
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	b
    //   0	182	1	paramau	com.tencent.mm.storage.au
    //   1	174	2	localau	com.tencent.mm.storage.au
    //   176	1	2	localObject1	Object
    //   68	111	3	localObject2	Object
    //   101	14	4	locala	a
    // Exception table:
    //   from	to	target	type
    //   69	81	125	java/lang/Exception
    //   83	92	125	java/lang/Exception
    //   94	103	125	java/lang/Exception
    //   105	111	125	java/lang/Exception
    //   113	122	125	java/lang/Exception
    //   69	81	159	finally
    //   83	92	176	finally
    //   94	103	176	finally
    //   105	111	176	finally
    //   113	122	176	finally
  }
  
  public final int Z(List<a> paramList)
  {
    GMTrace.i(20659329564672L, 153924);
    if (paramList.isEmpty())
    {
      GMTrace.o(20659329564672L, 153924);
      return 0;
    }
    long l = bg.Pw();
    Iterator localIterator = paramList.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      if (a((a)localIterator.next(), false)) {}
      for (int j = 1;; j = 0)
      {
        i = j + i;
        break;
      }
    }
    w.d("MicroMsg.WxFileIndexStorage", "insert list result[%d %d] cost[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramList.size()), Long.valueOf(bg.aI(l)) });
    GMTrace.o(20659329564672L, 153924);
    return i;
  }
  
  public final int aa(List<a> paramList)
  {
    GMTrace.i(20659463782400L, 153925);
    if (paramList.isEmpty())
    {
      GMTrace.o(20659463782400L, 153925);
      return 0;
    }
    long l = bg.Pw();
    Iterator localIterator = paramList.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (a(locala.vmr, locala, false)) {}
      for (int j = 1;; j = 0)
      {
        i = j + i;
        break;
      }
    }
    w.d("MicroMsg.WxFileIndexStorage", "update list result[%d %d] cost[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramList.size()), Long.valueOf(bg.aI(l)) });
    GMTrace.o(20659463782400L, 153925);
    return i;
  }
  
  public final long aiK()
  {
    Object localObject1 = null;
    GMTrace.i(20658658476032L, 153919);
    long l2 = 0L;
    try
    {
      Cursor localCursor = this.fTZ.rawQuery("select sum(size)  from WxFileIndex2 where msgSubType in (1,20,23,30,32,34 )", null);
      long l1 = l2;
      if (localCursor != null)
      {
        l1 = l2;
        localObject1 = localCursor;
        if (localCursor.moveToFirst())
        {
          localObject1 = localCursor;
          l1 = localCursor.getLong(0);
        }
      }
      if (localCursor != null) {
        localCursor.close();
      }
      GMTrace.o(20658658476032L, 153919);
      return l1;
    }
    finally
    {
      if (localObject1 != null) {
        ((Cursor)localObject1).close();
      }
    }
  }
  
  public final Cursor aiL()
  {
    Object localObject = null;
    GMTrace.i(20658792693760L, 153920);
    try
    {
      Cursor localCursor = this.fTZ.rawQuery("select username,  sum(size) as total from WxFileIndex2 where size > 0  and msgSubType in (1,20,23,30,32,34 ) group by username order by total desc", null);
      localObject = localCursor;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    GMTrace.o(20658792693760L, 153920);
    return (Cursor)localObject;
  }
  
  public final boolean delete()
  {
    GMTrace.i(20658255822848L, 153916);
    try
    {
      int i = this.fTZ.delete("WxFileIndex2", null, null);
      l = i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        long l = 0L;
      }
      GMTrace.o(20658255822848L, 153916);
    }
    if (l > 0L)
    {
      GMTrace.o(20658255822848L, 153916);
      return true;
    }
    return false;
  }
  
  /* Error */
  public final List<a> f(String paramString, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: ldc2_w 234
    //   3: ldc -20
    //   5: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: invokestatic 144	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   11: lstore 6
    //   13: new 68	java/lang/StringBuilder
    //   16: dup
    //   17: ldc -18
    //   19: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   22: aload_1
    //   23: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: ldc -16
    //   28: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: lload_2
    //   32: invokevirtual 83	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   35: ldc -14
    //   37: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: lload 4
    //   42: invokevirtual 83	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   45: ldc -12
    //   47: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: ldc -10
    //   52: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 11
    //   60: new 100	java/util/ArrayList
    //   63: dup
    //   64: invokespecial 102	java/util/ArrayList:<init>	()V
    //   67: astore 12
    //   69: aconst_null
    //   70: astore 9
    //   72: aconst_null
    //   73: astore 8
    //   75: aload_0
    //   76: getfield 59	com/tencent/mm/plugin/i/b/b:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   79: aload 11
    //   81: aconst_null
    //   82: invokeinterface 108 3 0
    //   87: astore 10
    //   89: aload 10
    //   91: ifnull +160 -> 251
    //   94: aload 10
    //   96: astore 8
    //   98: aload 10
    //   100: astore 9
    //   102: aload 10
    //   104: invokeinterface 114 1 0
    //   109: ifeq +142 -> 251
    //   112: aload 10
    //   114: astore 8
    //   116: aload 10
    //   118: astore 9
    //   120: new 25	com/tencent/mm/plugin/i/b/a
    //   123: dup
    //   124: invokespecial 115	com/tencent/mm/plugin/i/b/a:<init>	()V
    //   127: astore 13
    //   129: aload 10
    //   131: astore 8
    //   133: aload 10
    //   135: astore 9
    //   137: aload 13
    //   139: aload 10
    //   141: invokevirtual 119	com/tencent/mm/plugin/i/b/a:b	(Landroid/database/Cursor;)V
    //   144: aload 10
    //   146: astore 8
    //   148: aload 10
    //   150: astore 9
    //   152: aload 12
    //   154: aload 13
    //   156: invokeinterface 125 2 0
    //   161: pop
    //   162: goto -68 -> 94
    //   165: astore 10
    //   167: aload 8
    //   169: astore 9
    //   171: ldc -94
    //   173: aload 10
    //   175: ldc -8
    //   177: iconst_1
    //   178: anewarray 166	java/lang/Object
    //   181: dup
    //   182: iconst_0
    //   183: aload 11
    //   185: aastore
    //   186: invokestatic 252	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: aload 8
    //   191: ifnull +10 -> 201
    //   194: aload 8
    //   196: invokeinterface 128 1 0
    //   201: ldc -94
    //   203: ldc -2
    //   205: iconst_3
    //   206: anewarray 166	java/lang/Object
    //   209: dup
    //   210: iconst_0
    //   211: aload_1
    //   212: aastore
    //   213: dup
    //   214: iconst_1
    //   215: aload 12
    //   217: invokeinterface 176 1 0
    //   222: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   225: aastore
    //   226: dup
    //   227: iconst_2
    //   228: lload 6
    //   230: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   233: invokestatic 185	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   236: aastore
    //   237: invokestatic 256	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   240: ldc2_w 234
    //   243: ldc -20
    //   245: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   248: aload 12
    //   250: areturn
    //   251: aload 10
    //   253: ifnull -52 -> 201
    //   256: aload 10
    //   258: invokeinterface 128 1 0
    //   263: goto -62 -> 201
    //   266: astore_1
    //   267: aload 9
    //   269: ifnull +10 -> 279
    //   272: aload 9
    //   274: invokeinterface 128 1 0
    //   279: aload_1
    //   280: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	281	0	this	b
    //   0	281	1	paramString	String
    //   0	281	2	paramLong1	long
    //   0	281	4	paramLong2	long
    //   11	218	6	l	long
    //   73	122	8	localObject1	Object
    //   70	203	9	localObject2	Object
    //   87	62	10	localCursor	Cursor
    //   165	92	10	localException	Exception
    //   58	126	11	str	String
    //   67	182	12	localArrayList	java.util.ArrayList
    //   127	28	13	locala	a
    // Exception table:
    //   from	to	target	type
    //   75	89	165	java/lang/Exception
    //   102	112	165	java/lang/Exception
    //   120	129	165	java/lang/Exception
    //   137	144	165	java/lang/Exception
    //   152	162	165	java/lang/Exception
    //   75	89	266	finally
    //   102	112	266	finally
    //   120	129	266	finally
    //   137	144	266	finally
    //   152	162	266	finally
    //   171	189	266	finally
  }
  
  public final long lA(int paramInt)
  {
    Object localObject1 = null;
    GMTrace.i(20658524258304L, 153918);
    long l2 = 0L;
    Object localObject2 = "select count(*)  from WxFileIndex2  where msgType=" + paramInt + " and size>0";
    try
    {
      localObject2 = this.fTZ.rawQuery((String)localObject2, null);
      long l1 = l2;
      if (localObject2 != null)
      {
        l1 = l2;
        localObject1 = localObject2;
        if (((Cursor)localObject2).moveToFirst())
        {
          localObject1 = localObject2;
          l1 = ((Cursor)localObject2).getLong(0);
        }
      }
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
      GMTrace.o(20658524258304L, 153918);
      return l1;
    }
    finally
    {
      if (localObject1 != null) {
        ((Cursor)localObject1).close();
      }
    }
  }
  
  public final long lz(int paramInt)
  {
    Object localObject1 = null;
    GMTrace.i(20658390040576L, 153917);
    long l2 = 0L;
    Object localObject2 = "select sum(size)  from WxFileIndex2  where msgType=" + paramInt;
    try
    {
      localObject2 = this.fTZ.rawQuery((String)localObject2, null);
      long l1 = l2;
      if (localObject2 != null)
      {
        l1 = l2;
        localObject1 = localObject2;
        if (((Cursor)localObject2).moveToFirst())
        {
          localObject1 = localObject2;
          l1 = ((Cursor)localObject2).getLong(0);
        }
      }
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
      GMTrace.o(20658390040576L, 153917);
      return l1;
    }
    finally
    {
      if (localObject1 != null) {
        ((Cursor)localObject1).close();
      }
    }
  }
  
  /* Error */
  public final List<a> u(String paramString, long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: ldc2_w 276
    //   3: ldc_w 278
    //   6: invokestatic 21	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: invokestatic 144	com/tencent/mm/sdk/platformtools/bg:Pw	()J
    //   12: lstore 6
    //   14: new 68	java/lang/StringBuilder
    //   17: dup
    //   18: ldc -18
    //   20: invokespecial 73	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   23: aload_1
    //   24: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: ldc -16
    //   29: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: lload_2
    //   33: invokevirtual 83	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   36: ldc -14
    //   38: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: lload 4
    //   43: invokevirtual 83	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   46: ldc_w 280
    //   49: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: ldc_w 282
    //   55: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: ldc_w 284
    //   61: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore 11
    //   69: new 100	java/util/ArrayList
    //   72: dup
    //   73: invokespecial 102	java/util/ArrayList:<init>	()V
    //   76: astore 12
    //   78: aconst_null
    //   79: astore 9
    //   81: aconst_null
    //   82: astore 8
    //   84: aload_0
    //   85: getfield 59	com/tencent/mm/plugin/i/b/b:fTZ	Lcom/tencent/mm/sdk/e/e;
    //   88: aload 11
    //   90: aconst_null
    //   91: invokeinterface 108 3 0
    //   96: astore 10
    //   98: aload 10
    //   100: ifnull +162 -> 262
    //   103: aload 10
    //   105: astore 8
    //   107: aload 10
    //   109: astore 9
    //   111: aload 10
    //   113: invokeinterface 114 1 0
    //   118: ifeq +144 -> 262
    //   121: aload 10
    //   123: astore 8
    //   125: aload 10
    //   127: astore 9
    //   129: new 25	com/tencent/mm/plugin/i/b/a
    //   132: dup
    //   133: invokespecial 115	com/tencent/mm/plugin/i/b/a:<init>	()V
    //   136: astore 13
    //   138: aload 10
    //   140: astore 8
    //   142: aload 10
    //   144: astore 9
    //   146: aload 13
    //   148: aload 10
    //   150: invokevirtual 119	com/tencent/mm/plugin/i/b/a:b	(Landroid/database/Cursor;)V
    //   153: aload 10
    //   155: astore 8
    //   157: aload 10
    //   159: astore 9
    //   161: aload 12
    //   163: aload 13
    //   165: invokeinterface 125 2 0
    //   170: pop
    //   171: goto -68 -> 103
    //   174: astore 10
    //   176: aload 8
    //   178: astore 9
    //   180: ldc -94
    //   182: aload 10
    //   184: ldc -8
    //   186: iconst_1
    //   187: anewarray 166	java/lang/Object
    //   190: dup
    //   191: iconst_0
    //   192: aload 11
    //   194: aastore
    //   195: invokestatic 252	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   198: aload 8
    //   200: ifnull +10 -> 210
    //   203: aload 8
    //   205: invokeinterface 128 1 0
    //   210: ldc -94
    //   212: ldc_w 286
    //   215: iconst_3
    //   216: anewarray 166	java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: aload_1
    //   222: aastore
    //   223: dup
    //   224: iconst_1
    //   225: aload 12
    //   227: invokeinterface 176 1 0
    //   232: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   235: aastore
    //   236: dup
    //   237: iconst_2
    //   238: lload 6
    //   240: invokestatic 180	com/tencent/mm/sdk/platformtools/bg:aI	(J)J
    //   243: invokestatic 185	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   246: aastore
    //   247: invokestatic 256	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: ldc2_w 276
    //   253: ldc_w 278
    //   256: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   259: aload 12
    //   261: areturn
    //   262: aload 10
    //   264: ifnull -54 -> 210
    //   267: aload 10
    //   269: invokeinterface 128 1 0
    //   274: goto -64 -> 210
    //   277: astore_1
    //   278: aload 9
    //   280: ifnull +10 -> 290
    //   283: aload 9
    //   285: invokeinterface 128 1 0
    //   290: aload_1
    //   291: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	292	0	this	b
    //   0	292	1	paramString	String
    //   0	292	2	paramLong1	long
    //   0	292	4	paramLong2	long
    //   12	227	6	l	long
    //   82	122	8	localObject1	Object
    //   79	205	9	localObject2	Object
    //   96	62	10	localCursor	Cursor
    //   174	94	10	localException	Exception
    //   67	126	11	str	String
    //   76	184	12	localArrayList	java.util.ArrayList
    //   136	28	13	locala	a
    // Exception table:
    //   from	to	target	type
    //   84	98	174	java/lang/Exception
    //   111	121	174	java/lang/Exception
    //   129	138	174	java/lang/Exception
    //   146	153	174	java/lang/Exception
    //   161	171	174	java/lang/Exception
    //   84	98	277	finally
    //   111	121	277	finally
    //   129	138	277	finally
    //   146	153	277	finally
    //   161	171	277	finally
    //   180	198	277	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\i\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */