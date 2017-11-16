package c.t.m.g;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class bb
{
  private a a;
  
  public bb(String paramString)
  {
    this.a = new a(l.a(), "halley_schedule_" + l.b() + "_" + l.i() + "_" + paramString + ".db");
  }
  
  public final void a(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      if ((!TextUtils.isEmpty(paramString)) && (paramArrayOfByte != null)) {
        this.a.a(paramString, paramArrayOfByte);
      }
      return;
    }
    finally {}
  }
  
  public final byte[] a(String paramString)
  {
    try
    {
      paramString = this.a.a(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  final class a
    extends SQLiteOpenHelper
  {
    public a(Context paramContext, String paramString)
    {
      super(paramString, null, 1);
    }
    
    private void a()
    {
      for (;;)
      {
        ArrayList localArrayList;
        int i;
        SQLiteDatabase localSQLiteDatabase;
        Object localObject1;
        String str;
        boolean bool;
        try
        {
          localArrayList = new ArrayList();
          i = u.a("apn_cache_num", 1, 100, 8);
          localSQLiteDatabase = getWritableDatabase();
        }
        catch (Exception localException) {}
        try
        {
          localObject1 = localSQLiteDatabase.query("halley_schedule_tbl", new String[] { "apn" }, null, null, null, null, "key");
          if (localObject1 == null) {}
        }
        finally
        {
          Object localObject2 = null;
          continue;
        }
        try
        {
          i = ((Cursor)localObject1).getCount() - i;
          if ((i <= 0) || (!((Cursor)localObject1).moveToFirst())) {
            continue;
          }
        }
        finally
        {
          continue;
          i -= 1;
        }
      }
      str = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex("apn"));
      if ((!TextUtils.isEmpty(str)) && (!localArrayList.contains(str))) {
        localArrayList.add(str);
      }
      bool = ((Cursor)localObject1).moveToNext();
      if ((!bool) || (i <= 0))
      {
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
        if (localArrayList.size() <= 0) {
          break label228;
        }
        localObject1 = localArrayList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localSQLiteDatabase.delete("halley_schedule_tbl", "apn=?", new String[] { (String)((Iterator)localObject1).next() });
          continue;
          if (localObject1 != null) {
            ((Cursor)localObject1).close();
          }
          throw localSQLiteDatabase;
        }
      }
      label228:
    }
    
    private static void a(SQLiteDatabase paramSQLiteDatabase)
    {
      try
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_schedule_tbl");
        return;
      }
      catch (SQLException paramSQLiteDatabase) {}
    }
    
    /* Error */
    public final void a(String paramString, byte[] paramArrayOfByte)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokevirtual 34	c/t/m/g/bb$a:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
      //   6: astore 4
      //   8: aload 4
      //   10: ldc 36
      //   12: ldc 101
      //   14: iconst_1
      //   15: anewarray 38	java/lang/String
      //   18: dup
      //   19: iconst_0
      //   20: aload_1
      //   21: aastore
      //   22: invokevirtual 109	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
      //   25: istore_3
      //   26: new 123	android/content/ContentValues
      //   29: dup
      //   30: invokespecial 124	android/content/ContentValues:<init>	()V
      //   33: astore 5
      //   35: aload 5
      //   37: ldc 40
      //   39: aload_1
      //   40: invokevirtual 128	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
      //   43: aload 5
      //   45: ldc -126
      //   47: aload_2
      //   48: invokevirtual 132	android/content/ContentValues:put	(Ljava/lang/String;[B)V
      //   51: aload 5
      //   53: ldc -122
      //   55: invokestatic 140	java/lang/System:currentTimeMillis	()J
      //   58: invokestatic 146	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   61: invokevirtual 149	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
      //   64: ldc2_w 150
      //   67: aload 4
      //   69: ldc 36
      //   71: aconst_null
      //   72: aload 5
      //   74: invokevirtual 155	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
      //   77: lcmp
      //   78: ifeq +11 -> 89
      //   81: iload_3
      //   82: ifgt +7 -> 89
      //   85: aload_0
      //   86: invokespecial 157	c/t/m/g/bb$a:a	()V
      //   89: aload_0
      //   90: monitorexit
      //   91: return
      //   92: astore_1
      //   93: aload_0
      //   94: monitorexit
      //   95: aload_1
      //   96: athrow
      //   97: astore_1
      //   98: goto -9 -> 89
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	101	0	this	a
      //   0	101	1	paramString	String
      //   0	101	2	paramArrayOfByte	byte[]
      //   25	57	3	i	int
      //   6	62	4	localSQLiteDatabase	SQLiteDatabase
      //   33	40	5	localContentValues	android.content.ContentValues
      // Exception table:
      //   from	to	target	type
      //   2	81	92	finally
      //   85	89	92	finally
      //   2	81	97	java/lang/Throwable
      //   85	89	97	java/lang/Throwable
    }
    
    /* Error */
    public final byte[] a(String paramString)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokevirtual 161	c/t/m/g/bb$a:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
      //   6: astore_3
      //   7: aload_3
      //   8: ldc 36
      //   10: aconst_null
      //   11: ldc 101
      //   13: iconst_1
      //   14: anewarray 38	java/lang/String
      //   17: dup
      //   18: iconst_0
      //   19: aload_1
      //   20: aastore
      //   21: aconst_null
      //   22: aconst_null
      //   23: aconst_null
      //   24: invokevirtual 48	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   27: astore_1
      //   28: aload_1
      //   29: ifnull +58 -> 87
      //   32: aload_1
      //   33: invokeinterface 58 1 0
      //   38: ifeq +49 -> 87
      //   41: aload_1
      //   42: aload_1
      //   43: ldc -126
      //   45: invokeinterface 62 2 0
      //   50: invokeinterface 165 2 0
      //   55: astore 4
      //   57: aload 4
      //   59: invokestatic 170	c/t/m/g/ce:a	([B)Z
      //   62: istore_2
      //   63: iload_2
      //   64: ifne +23 -> 87
      //   67: aload 4
      //   69: astore_3
      //   70: aload_1
      //   71: ifnull +12 -> 83
      //   74: aload_1
      //   75: invokeinterface 87 1 0
      //   80: aload 4
      //   82: astore_3
      //   83: aload_0
      //   84: monitorexit
      //   85: aload_3
      //   86: areturn
      //   87: aload_1
      //   88: ifnull +37 -> 125
      //   91: aload_1
      //   92: invokeinterface 87 1 0
      //   97: goto +28 -> 125
      //   100: aload_1
      //   101: ifnull +9 -> 110
      //   104: aload_1
      //   105: invokeinterface 87 1 0
      //   110: aload_3
      //   111: athrow
      //   112: astore_1
      //   113: goto +12 -> 125
      //   116: astore_1
      //   117: aload_0
      //   118: monitorexit
      //   119: aload_1
      //   120: athrow
      //   121: astore_3
      //   122: goto -22 -> 100
      //   125: aconst_null
      //   126: astore_3
      //   127: goto -44 -> 83
      //   130: astore_3
      //   131: aconst_null
      //   132: astore_1
      //   133: goto -33 -> 100
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	136	0	this	a
      //   0	136	1	paramString	String
      //   62	2	2	bool	boolean
      //   6	105	3	localObject1	Object
      //   121	1	3	localObject2	Object
      //   126	1	3	localObject3	Object
      //   130	1	3	localObject4	Object
      //   55	26	4	arrayOfByte	byte[]
      // Exception table:
      //   from	to	target	type
      //   2	7	112	java/lang/Throwable
      //   74	80	112	java/lang/Throwable
      //   91	97	112	java/lang/Throwable
      //   104	110	112	java/lang/Throwable
      //   110	112	112	java/lang/Throwable
      //   2	7	116	finally
      //   74	80	116	finally
      //   91	97	116	finally
      //   104	110	116	finally
      //   110	112	116	finally
      //   32	63	121	finally
      //   7	28	130	finally
    }
    
    public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      try
      {
        paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_schedule_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,apn TEXT,result BLOB,timestamp INTEGER);");
        return;
      }
      catch (Exception paramSQLiteDatabase) {}
    }
    
    public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      try
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_schedule_tbl");
        try
        {
          paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_schedule_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,apn TEXT,result BLOB,timestamp INTEGER);");
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
      //   2: invokespecial 178	android/database/sqlite/SQLiteOpenHelper:onOpen	(Landroid/database/sqlite/SQLiteDatabase;)V
      //   5: aload_1
      //   6: invokevirtual 181	android/database/sqlite/SQLiteDatabase:getVersion	()I
      //   9: istore_2
      //   10: iload_2
      //   11: ifeq +17 -> 28
      //   14: iload_2
      //   15: ifgt +19 -> 34
      //   18: aload_1
      //   19: invokestatic 183	c/t/m/g/bb$a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
      //   22: aload_1
      //   23: ldc -83
      //   25: invokevirtual 118	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
      //   28: return
      //   29: astore_1
      //   30: aload_1
      //   31: athrow
      //   32: astore_1
      //   33: return
      //   34: iload_2
      //   35: iconst_1
      //   36: if_icmple -8 -> 28
      //   39: aload_1
      //   40: invokestatic 183	c/t/m/g/bb$a:a	(Landroid/database/sqlite/SQLiteDatabase;)V
      //   43: aload_1
      //   44: ldc -83
      //   46: invokevirtual 118	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
      //   49: return
      //   50: astore_1
      //   51: aload_1
      //   52: athrow
      //   53: astore_1
      //   54: return
      //   55: astore_1
      //   56: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	57	0	this	a
      //   0	57	1	paramSQLiteDatabase	SQLiteDatabase
      //   9	28	2	i	int
      // Exception table:
      //   from	to	target	type
      //   22	28	29	android/database/SQLException
      //   18	22	32	java/lang/Exception
      //   22	28	32	java/lang/Exception
      //   30	32	32	java/lang/Exception
      //   43	49	50	android/database/SQLException
      //   39	43	53	java/lang/Exception
      //   43	49	53	java/lang/Exception
      //   51	53	53	java/lang/Exception
      //   5	10	55	java/lang/Exception
    }
    
    public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      try
      {
        paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS halley_schedule_tbl");
        try
        {
          paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS halley_schedule_tbl (key INTEGER PRIMARY KEY AUTOINCREMENT,apn TEXT,result BLOB,timestamp INTEGER);");
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
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\c\t\m\g\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */