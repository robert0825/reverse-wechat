package c.t.m.g;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class as
  extends SQLiteOpenHelper
{
  private static Map<String, as> a = new ConcurrentHashMap();
  private static final Object b = new Object();
  
  private as(Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 2);
  }
  
  /* Error */
  private int a(boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_0
    //   4: invokevirtual 37	c/t/m/g/as:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore 4
    //   9: iload_1
    //   10: ifeq +57 -> 67
    //   13: iload_2
    //   14: ifeq +53 -> 67
    //   17: aload 4
    //   19: ldc 39
    //   21: iconst_1
    //   22: anewarray 41	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: ldc 43
    //   29: aastore
    //   30: aconst_null
    //   31: aconst_null
    //   32: aconst_null
    //   33: aconst_null
    //   34: aconst_null
    //   35: invokevirtual 49	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   38: astore 4
    //   40: aload 4
    //   42: ifnull +155 -> 197
    //   45: aload 4
    //   47: invokeinterface 55 1 0
    //   52: istore_3
    //   53: aload 4
    //   55: ifnull +10 -> 65
    //   58: aload 4
    //   60: invokeinterface 58 1 0
    //   65: iload_3
    //   66: ireturn
    //   67: iload_1
    //   68: ifeq +38 -> 106
    //   71: aload 4
    //   73: ldc 39
    //   75: iconst_1
    //   76: anewarray 41	java/lang/String
    //   79: dup
    //   80: iconst_0
    //   81: ldc 43
    //   83: aastore
    //   84: ldc 60
    //   86: iconst_1
    //   87: anewarray 41	java/lang/String
    //   90: dup
    //   91: iconst_0
    //   92: ldc 62
    //   94: aastore
    //   95: aconst_null
    //   96: aconst_null
    //   97: aconst_null
    //   98: invokevirtual 49	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   101: astore 4
    //   103: goto -63 -> 40
    //   106: aload 4
    //   108: ldc 39
    //   110: iconst_1
    //   111: anewarray 41	java/lang/String
    //   114: dup
    //   115: iconst_0
    //   116: ldc 43
    //   118: aastore
    //   119: ldc 60
    //   121: iconst_1
    //   122: anewarray 41	java/lang/String
    //   125: dup
    //   126: iconst_0
    //   127: ldc 64
    //   129: aastore
    //   130: aconst_null
    //   131: aconst_null
    //   132: aconst_null
    //   133: invokevirtual 49	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   136: astore 4
    //   138: goto -98 -> 40
    //   141: astore 4
    //   143: aconst_null
    //   144: astore 4
    //   146: aload 4
    //   148: ifnull +47 -> 195
    //   151: aload 4
    //   153: invokeinterface 58 1 0
    //   158: iconst_0
    //   159: ireturn
    //   160: astore 4
    //   162: aload 5
    //   164: ifnull +10 -> 174
    //   167: aload 5
    //   169: invokeinterface 58 1 0
    //   174: aload 4
    //   176: athrow
    //   177: astore 6
    //   179: aload 4
    //   181: astore 5
    //   183: aload 6
    //   185: astore 4
    //   187: goto -25 -> 162
    //   190: astore 5
    //   192: goto -46 -> 146
    //   195: iconst_0
    //   196: ireturn
    //   197: iconst_0
    //   198: istore_3
    //   199: goto -146 -> 53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	as
    //   0	202	1	paramBoolean1	boolean
    //   0	202	2	paramBoolean2	boolean
    //   52	147	3	i	int
    //   7	130	4	localObject1	Object
    //   141	1	4	localThrowable1	Throwable
    //   144	8	4	localObject2	Object
    //   160	20	4	localObject3	Object
    //   185	1	4	localObject4	Object
    //   1	181	5	localObject5	Object
    //   190	1	5	localThrowable2	Throwable
    //   177	7	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   3	9	141	java/lang/Throwable
    //   17	40	141	java/lang/Throwable
    //   71	103	141	java/lang/Throwable
    //   106	138	141	java/lang/Throwable
    //   3	9	160	finally
    //   17	40	160	finally
    //   71	103	160	finally
    //   106	138	160	finally
    //   45	53	177	finally
    //   45	53	190	java/lang/Throwable
  }
  
  public static as a(String paramString)
  {
    synchronized (b)
    {
      as localas2 = (as)a.get(paramString);
      as localas1 = localas2;
      if (localas2 == null)
      {
        localas1 = new as(l.a(), "HalleyAction_" + l.b() + "_" + l.i() + "_" + paramString + ".db");
        a.put(paramString, localas1);
      }
      return localas1;
    }
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    try
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_action_tbl");
      return;
    }
    catch (SQLException paramSQLiteDatabase) {}
  }
  
  /* Error */
  public final List<a> a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: new 120	java/util/ArrayList
    //   6: dup
    //   7: invokespecial 121	java/util/ArrayList:<init>	()V
    //   10: astore 8
    //   12: aload_0
    //   13: invokevirtual 37	c/t/m/g/as:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   16: ldc 39
    //   18: aconst_null
    //   19: ldc 60
    //   21: iconst_1
    //   22: anewarray 41	java/lang/String
    //   25: dup
    //   26: iconst_0
    //   27: ldc 62
    //   29: aastore
    //   30: aconst_null
    //   31: aconst_null
    //   32: aconst_null
    //   33: invokevirtual 49	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   36: astore 7
    //   38: aload 7
    //   40: astore 6
    //   42: aload 6
    //   44: ifnull +122 -> 166
    //   47: aload 6
    //   49: invokeinterface 55 1 0
    //   54: bipush 10
    //   56: invokestatic 127	java/lang/Math:min	(II)I
    //   59: istore_2
    //   60: aload 6
    //   62: invokeinterface 131 1 0
    //   67: ifeq +99 -> 166
    //   70: iconst_0
    //   71: istore_1
    //   72: aload 6
    //   74: aload 6
    //   76: ldc 43
    //   78: invokeinterface 135 2 0
    //   83: invokeinterface 139 2 0
    //   88: lstore_3
    //   89: aload 6
    //   91: aload 6
    //   93: ldc -115
    //   95: invokeinterface 135 2 0
    //   100: invokeinterface 145 2 0
    //   105: astore 7
    //   107: aload 6
    //   109: aload 6
    //   111: ldc -109
    //   113: invokeinterface 135 2 0
    //   118: invokeinterface 145 2 0
    //   123: pop
    //   124: aload 8
    //   126: new 6	c/t/m/g/as$a
    //   129: dup
    //   130: lload_3
    //   131: aload 7
    //   133: iconst_0
    //   134: invokespecial 150	c/t/m/g/as$a:<init>	(JLjava/lang/String;B)V
    //   137: invokeinterface 155 2 0
    //   142: pop
    //   143: iload_1
    //   144: iconst_1
    //   145: iadd
    //   146: istore_1
    //   147: iload_1
    //   148: iload_2
    //   149: if_icmpge +17 -> 166
    //   152: aload 6
    //   154: invokeinterface 158 1 0
    //   159: istore 5
    //   161: iload 5
    //   163: ifne -91 -> 72
    //   166: aload 6
    //   168: ifnull +10 -> 178
    //   171: aload 6
    //   173: invokeinterface 58 1 0
    //   178: aload 8
    //   180: areturn
    //   181: astore 6
    //   183: aconst_null
    //   184: astore 6
    //   186: aload 6
    //   188: ifnull -10 -> 178
    //   191: aload 6
    //   193: invokeinterface 58 1 0
    //   198: aload 8
    //   200: areturn
    //   201: astore 7
    //   203: aload 6
    //   205: ifnull +10 -> 215
    //   208: aload 6
    //   210: invokeinterface 58 1 0
    //   215: aload 7
    //   217: athrow
    //   218: astore 7
    //   220: goto -17 -> 203
    //   223: astore 7
    //   225: goto -39 -> 186
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	228	0	this	as
    //   71	79	1	i	int
    //   59	91	2	j	int
    //   88	43	3	l	long
    //   159	3	5	bool	boolean
    //   1	171	6	localObject1	Object
    //   181	1	6	localThrowable1	Throwable
    //   184	25	6	localObject2	Object
    //   36	96	7	localObject3	Object
    //   201	15	7	localObject4	Object
    //   218	1	7	localObject5	Object
    //   223	1	7	localThrowable2	Throwable
    //   10	189	8	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   12	38	181	java/lang/Throwable
    //   12	38	201	finally
    //   47	70	218	finally
    //   72	143	218	finally
    //   152	161	218	finally
    //   47	70	223	java/lang/Throwable
    //   72	143	223	java/lang/Throwable
    //   152	161	223	java/lang/Throwable
  }
  
  public final void a(List<Long> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0)) {}
    for (;;)
    {
      return;
      try
      {
        SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("state", "remove");
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext()) {
          localSQLiteDatabase.update("halley_action_tbl", localContentValues, "key=?", new String[] { String.valueOf(((Long)localIterator.next()).longValue()) });
        }
        paramList = paramList.iterator();
        while (paramList.hasNext()) {
          localSQLiteDatabase.delete("halley_action_tbl", "key=?", new String[] { String.valueOf(((Long)paramList.next()).longValue()) });
        }
        if (a(false, true) <= 0) {
          continue;
        }
        int i = a(true, false);
        if (i > 0) {
          continue;
        }
        try
        {
          localSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_action_tbl");
          try
          {
            localSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
            return;
          }
          catch (SQLException paramList)
          {
            throw paramList;
          }
        }
        catch (SQLException paramList)
        {
          for (;;) {}
        }
        return;
      }
      catch (Exception paramList) {}
    }
  }
  
  public final boolean a(int paramInt)
  {
    if (a(true, true) > paramInt) {
      try
      {
        getWritableDatabase().delete("halley_action_tbl", null, null);
        return true;
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  /* Error */
  public final long b(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 218	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   4: ifeq +7 -> 11
    //   7: ldc2_w 219
    //   10: lreturn
    //   11: aload_0
    //   12: invokevirtual 37	c/t/m/g/as:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   15: astore 4
    //   17: new 168	android/content/ContentValues
    //   20: dup
    //   21: invokespecial 169	android/content/ContentValues:<init>	()V
    //   24: astore 5
    //   26: aload 5
    //   28: ldc -115
    //   30: aload_1
    //   31: invokevirtual 172	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   34: aload 5
    //   36: ldc -109
    //   38: ldc 62
    //   40: invokevirtual 172	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload 4
    //   45: ldc 39
    //   47: aconst_null
    //   48: aload 5
    //   50: invokevirtual 224	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   53: lstore_2
    //   54: lload_2
    //   55: lreturn
    //   56: astore_1
    //   57: aload_1
    //   58: athrow
    //   59: astore_1
    //   60: ldc2_w 219
    //   63: lreturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	as
    //   0	64	1	paramString	String
    //   53	2	2	l	long
    //   15	29	4	localSQLiteDatabase	SQLiteDatabase
    //   24	25	5	localContentValues	ContentValues
    // Exception table:
    //   from	to	target	type
    //   11	54	56	finally
    //   11	54	59	java/lang/Exception
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    try
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
      return;
    }
    catch (SQLException paramSQLiteDatabase)
    {
      throw paramSQLiteDatabase;
    }
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    try
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_action_tbl");
      try
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
        return;
      }
      catch (SQLException paramSQLiteDatabase)
      {
        throw paramSQLiteDatabase;
      }
    }
    catch (Exception paramSQLiteDatabase) {}catch (SQLException localSQLException)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 230	android/database/sqlite/SQLiteOpenHelper:onOpen	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   5: aload_1
    //   6: invokevirtual 233	android/database/sqlite/SQLiteDatabase:getVersion	()I
    //   9: istore_2
    //   10: iload_2
    //   11: ifeq +18 -> 29
    //   14: iload_2
    //   15: iconst_2
    //   16: if_icmpge +19 -> 35
    //   19: aload_1
    //   20: invokestatic 235	c/t/m/g/as:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   23: aload_1
    //   24: ldc -47
    //   26: invokevirtual 117	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   29: return
    //   30: astore_1
    //   31: aload_1
    //   32: athrow
    //   33: astore_1
    //   34: return
    //   35: iload_2
    //   36: iconst_2
    //   37: if_icmple -8 -> 29
    //   40: aload_1
    //   41: invokestatic 235	c/t/m/g/as:a	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   44: aload_1
    //   45: ldc -47
    //   47: invokevirtual 117	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   50: return
    //   51: astore_1
    //   52: aload_1
    //   53: athrow
    //   54: astore_1
    //   55: return
    //   56: astore_1
    //   57: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	as
    //   0	58	1	paramSQLiteDatabase	SQLiteDatabase
    //   9	29	2	i	int
    // Exception table:
    //   from	to	target	type
    //   23	29	30	android/database/SQLException
    //   19	23	33	java/lang/Exception
    //   23	29	33	java/lang/Exception
    //   31	33	33	java/lang/Exception
    //   44	50	51	android/database/SQLException
    //   40	44	54	java/lang/Exception
    //   44	50	54	java/lang/Exception
    //   52	54	54	java/lang/Exception
    //   5	10	56	java/lang/Exception
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    try
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_action_tbl");
      try
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_action_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,data TEXT,state TEXT);");
        return;
      }
      catch (SQLException paramSQLiteDatabase)
      {
        throw paramSQLiteDatabase;
      }
    }
    catch (Exception paramSQLiteDatabase) {}catch (SQLException localSQLException)
    {
      for (;;) {}
    }
  }
  
  public static final class a
  {
    public long a;
    public String b;
    
    public a(long paramLong, String paramString)
    {
      this.a = paramLong;
      this.b = paramString;
    }
    
    public a(long paramLong, String paramString, byte paramByte)
    {
      this(paramLong, paramString);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */