package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.c.v;
import com.google.android.gms.c.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class ap
  implements c.c
{
  public static final String azV = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] { "datalayer", "ID", "key", "value", "expires" });
  private v acz;
  private final Executor azW;
  private a azX;
  private int azY;
  public final Context mContext;
  
  public ap(Context paramContext)
  {
    this(paramContext, w.lt(), "google_tagmanager.db", Executors.newSingleThreadExecutor());
  }
  
  private ap(Context paramContext, v paramv, String paramString, Executor paramExecutor)
  {
    this.mContext = paramContext;
    this.acz = paramv;
    this.azY = 2000;
    this.azW = paramExecutor;
    this.azX = new a(this.mContext, paramString);
  }
  
  private SQLiteDatabase aB(String paramString)
  {
    try
    {
      paramString = this.azX.getWritableDatabase();
      return paramString;
    }
    catch (SQLiteException paramString)
    {
      m.mq();
    }
    return null;
  }
  
  /* Error */
  private static byte[] ai(Object paramObject)
  {
    // Byte code:
    //   0: new 104	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 105	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_2
    //   8: new 107	java/io/ObjectOutputStream
    //   11: dup
    //   12: aload_2
    //   13: invokespecial 110	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   16: astore_1
    //   17: aload_1
    //   18: aload_0
    //   19: invokevirtual 114	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   22: aload_2
    //   23: invokevirtual 118	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   26: astore_0
    //   27: aload_1
    //   28: invokevirtual 121	java/io/ObjectOutputStream:close	()V
    //   31: aload_2
    //   32: invokevirtual 122	java/io/ByteArrayOutputStream:close	()V
    //   35: aload_0
    //   36: areturn
    //   37: astore_0
    //   38: aconst_null
    //   39: astore_1
    //   40: aload_1
    //   41: ifnull +7 -> 48
    //   44: aload_1
    //   45: invokevirtual 121	java/io/ObjectOutputStream:close	()V
    //   48: aload_2
    //   49: invokevirtual 122	java/io/ByteArrayOutputStream:close	()V
    //   52: aconst_null
    //   53: areturn
    //   54: astore_0
    //   55: aconst_null
    //   56: areturn
    //   57: astore_0
    //   58: aconst_null
    //   59: astore_1
    //   60: aload_1
    //   61: ifnull +7 -> 68
    //   64: aload_1
    //   65: invokevirtual 121	java/io/ObjectOutputStream:close	()V
    //   68: aload_2
    //   69: invokevirtual 122	java/io/ByteArrayOutputStream:close	()V
    //   72: aload_0
    //   73: athrow
    //   74: astore_1
    //   75: goto -3 -> 72
    //   78: astore_0
    //   79: goto -19 -> 60
    //   82: astore_0
    //   83: goto -43 -> 40
    //   86: astore_1
    //   87: aload_0
    //   88: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	paramObject	Object
    //   16	49	1	localObjectOutputStream	java.io.ObjectOutputStream
    //   74	1	1	localIOException1	java.io.IOException
    //   86	1	1	localIOException2	java.io.IOException
    //   7	62	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   8	17	37	java/io/IOException
    //   44	48	54	java/io/IOException
    //   48	52	54	java/io/IOException
    //   8	17	57	finally
    //   64	68	74	java/io/IOException
    //   68	72	74	java/io/IOException
    //   17	27	78	finally
    //   17	27	82	java/io/IOException
    //   27	35	86	java/io/IOException
  }
  
  private void c(List<b> paramList, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = aB("Error opening database for writeEntryToDatabase.");
    if (localSQLiteDatabase == null) {}
    for (;;)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        b localb = (b)paramList.next();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("expires", Long.valueOf(paramLong));
        localContentValues.put("key", localb.aut);
        localContentValues.put("value", localb.aAd);
        localSQLiteDatabase.insert("datalayer", null, localContentValues);
      }
    }
  }
  
  /* Error */
  private List<String> cz(int paramInt)
  {
    // Byte code:
    //   0: new 182	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 183	java/util/ArrayList:<init>	()V
    //   7: astore 6
    //   9: iload_1
    //   10: ifgt +9 -> 19
    //   13: invokestatic 98	com/google/android/gms/tagmanager/m:mq	()V
    //   16: aload 6
    //   18: areturn
    //   19: aload_0
    //   20: ldc -71
    //   22: invokespecial 128	com/google/android/gms/tagmanager/ap:aB	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   25: astore_3
    //   26: aload_3
    //   27: ifnonnull +6 -> 33
    //   30: aload 6
    //   32: areturn
    //   33: ldc -69
    //   35: iconst_1
    //   36: anewarray 4	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: ldc 36
    //   43: aastore
    //   44: invokestatic 48	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   47: astore 4
    //   49: iload_1
    //   50: invokestatic 193	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   53: astore 5
    //   55: aload_3
    //   56: ldc 34
    //   58: iconst_1
    //   59: anewarray 44	java/lang/String
    //   62: dup
    //   63: iconst_0
    //   64: ldc 36
    //   66: aastore
    //   67: aconst_null
    //   68: aconst_null
    //   69: aconst_null
    //   70: aconst_null
    //   71: aload 4
    //   73: aload 5
    //   75: invokevirtual 197	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore 4
    //   80: aload 4
    //   82: astore_3
    //   83: aload 4
    //   85: invokeinterface 202 1 0
    //   90: ifeq +40 -> 130
    //   93: aload 4
    //   95: astore_3
    //   96: aload 6
    //   98: aload 4
    //   100: iconst_0
    //   101: invokeinterface 206 2 0
    //   106: invokestatic 209	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   109: invokeinterface 213 2 0
    //   114: pop
    //   115: aload 4
    //   117: astore_3
    //   118: aload 4
    //   120: invokeinterface 216 1 0
    //   125: istore_2
    //   126: iload_2
    //   127: ifne -34 -> 93
    //   130: aload 4
    //   132: ifnull +10 -> 142
    //   135: aload 4
    //   137: invokeinterface 217 1 0
    //   142: aload 6
    //   144: areturn
    //   145: astore 5
    //   147: aconst_null
    //   148: astore 4
    //   150: aload 4
    //   152: astore_3
    //   153: new 219	java/lang/StringBuilder
    //   156: dup
    //   157: ldc -35
    //   159: invokespecial 224	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   162: aload 5
    //   164: invokevirtual 228	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   167: invokevirtual 232	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload 4
    //   173: astore_3
    //   174: invokestatic 98	com/google/android/gms/tagmanager/m:mq	()V
    //   177: aload 4
    //   179: ifnull -37 -> 142
    //   182: aload 4
    //   184: invokeinterface 217 1 0
    //   189: goto -47 -> 142
    //   192: astore 4
    //   194: aconst_null
    //   195: astore_3
    //   196: aload_3
    //   197: ifnull +9 -> 206
    //   200: aload_3
    //   201: invokeinterface 217 1 0
    //   206: aload 4
    //   208: athrow
    //   209: astore 4
    //   211: goto -15 -> 196
    //   214: astore 5
    //   216: goto -66 -> 150
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	this	ap
    //   0	219	1	paramInt	int
    //   125	2	2	bool	boolean
    //   25	176	3	localObject1	Object
    //   47	136	4	localObject2	Object
    //   192	15	4	localObject3	Object
    //   209	1	4	localObject4	Object
    //   53	21	5	str	String
    //   145	18	5	localSQLiteException1	SQLiteException
    //   214	1	5	localSQLiteException2	SQLiteException
    //   7	136	6	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   33	80	145	android/database/sqlite/SQLiteException
    //   33	80	192	finally
    //   83	93	209	finally
    //   96	115	209	finally
    //   118	126	209	finally
    //   153	171	209	finally
    //   174	177	209	finally
    //   83	93	214	android/database/sqlite/SQLiteException
    //   96	115	214	android/database/sqlite/SQLiteException
    //   118	126	214	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  private static Object h(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 239	java/io/ByteArrayInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 242	java/io/ByteArrayInputStream:<init>	([B)V
    //   8: astore_2
    //   9: new 244	java/io/ObjectInputStream
    //   12: dup
    //   13: aload_2
    //   14: invokespecial 247	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   17: astore_0
    //   18: aload_0
    //   19: invokevirtual 250	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   22: astore_1
    //   23: aload_0
    //   24: invokevirtual 251	java/io/ObjectInputStream:close	()V
    //   27: aload_2
    //   28: invokevirtual 252	java/io/ByteArrayInputStream:close	()V
    //   31: aload_1
    //   32: areturn
    //   33: astore_0
    //   34: aconst_null
    //   35: astore_0
    //   36: aload_0
    //   37: ifnull +7 -> 44
    //   40: aload_0
    //   41: invokevirtual 251	java/io/ObjectInputStream:close	()V
    //   44: aload_2
    //   45: invokevirtual 252	java/io/ByteArrayInputStream:close	()V
    //   48: aconst_null
    //   49: areturn
    //   50: astore_0
    //   51: aconst_null
    //   52: areturn
    //   53: astore_0
    //   54: aconst_null
    //   55: astore_0
    //   56: aload_0
    //   57: ifnull +7 -> 64
    //   60: aload_0
    //   61: invokevirtual 251	java/io/ObjectInputStream:close	()V
    //   64: aload_2
    //   65: invokevirtual 252	java/io/ByteArrayInputStream:close	()V
    //   68: aconst_null
    //   69: areturn
    //   70: astore_0
    //   71: aconst_null
    //   72: areturn
    //   73: astore_1
    //   74: aconst_null
    //   75: astore_0
    //   76: aload_0
    //   77: ifnull +7 -> 84
    //   80: aload_0
    //   81: invokevirtual 251	java/io/ObjectInputStream:close	()V
    //   84: aload_2
    //   85: invokevirtual 252	java/io/ByteArrayInputStream:close	()V
    //   88: aload_1
    //   89: athrow
    //   90: astore_0
    //   91: goto -3 -> 88
    //   94: astore_1
    //   95: goto -19 -> 76
    //   98: astore_1
    //   99: goto -43 -> 56
    //   102: astore_1
    //   103: goto -67 -> 36
    //   106: astore_0
    //   107: aload_1
    //   108: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	paramArrayOfByte	byte[]
    //   22	10	1	localObject1	Object
    //   73	16	1	localObject2	Object
    //   94	1	1	localObject3	Object
    //   98	1	1	localClassNotFoundException	ClassNotFoundException
    //   102	6	1	localIOException	java.io.IOException
    //   8	77	2	localByteArrayInputStream	java.io.ByteArrayInputStream
    // Exception table:
    //   from	to	target	type
    //   9	18	33	java/io/IOException
    //   40	44	50	java/io/IOException
    //   44	48	50	java/io/IOException
    //   9	18	53	java/lang/ClassNotFoundException
    //   60	64	70	java/io/IOException
    //   64	68	70	java/io/IOException
    //   9	18	73	finally
    //   80	84	90	java/io/IOException
    //   84	88	90	java/io/IOException
    //   18	23	94	finally
    //   18	23	98	java/lang/ClassNotFoundException
    //   18	23	102	java/io/IOException
    //   23	31	106	java/io/IOException
  }
  
  private List<b> mW()
  {
    Object localObject = aB("Error opening database for loadSerialized.");
    ArrayList localArrayList = new ArrayList();
    if (localObject == null) {
      return localArrayList;
    }
    localObject = ((SQLiteDatabase)localObject).query("datalayer", new String[] { "key", "value" }, null, null, null, null, "ID", null);
    try
    {
      if (((Cursor)localObject).moveToNext()) {
        localArrayList.add(new b(((Cursor)localObject).getString(0), ((Cursor)localObject).getBlob(1)));
      }
      return localList;
    }
    finally
    {
      ((Cursor)localObject).close();
    }
  }
  
  private int mX()
  {
    Object localObject3 = null;
    Object localObject1 = null;
    int i = 0;
    int j = 0;
    Object localObject5 = aB("Error opening database for getNumStoredEntries.");
    if (localObject5 == null) {}
    for (;;)
    {
      return j;
      try
      {
        localObject5 = ((SQLiteDatabase)localObject5).rawQuery("SELECT COUNT(*) from datalayer", null);
        localObject1 = localObject5;
        localObject3 = localObject5;
        if (((Cursor)localObject5).moveToFirst())
        {
          localObject1 = localObject5;
          localObject3 = localObject5;
          long l = ((Cursor)localObject5).getLong(0);
          i = (int)l;
        }
        j = i;
        return i;
      }
      catch (SQLiteException localSQLiteException)
      {
        localObject4 = localObject1;
        m.mq();
        return 0;
      }
      finally
      {
        Object localObject4;
        if (localObject4 != null) {
          ((Cursor)localObject4).close();
        }
      }
    }
  }
  
  private void mY()
  {
    try
    {
      this.azX.close();
      return;
    }
    catch (SQLiteException localSQLiteException) {}
  }
  
  private void p(long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = aB("Error opening database for deleteOlderThan.");
    if (localSQLiteDatabase == null) {
      return;
    }
    try
    {
      int i = localSQLiteDatabase.delete("datalayer", "expires <= ?", new String[] { Long.toString(paramLong) });
      new StringBuilder("Deleted ").append(i).append(" expired items");
      m.ms();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      m.mq();
    }
  }
  
  public final void a(final c.c.a parama)
  {
    this.azW.execute(new Runnable()
    {
      public final void run()
      {
        parama.m(ap.this.mV());
      }
    });
  }
  
  public final void a(List<c.a> paramList, final long paramLong)
  {
    final ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      c.a locala = (c.a)paramList.next();
      localArrayList.add(new b(locala.aut, ai(locala.ayu)));
    }
    this.azW.execute(new Runnable()
    {
      public final void run()
      {
        ap.this.b(localArrayList, paramLong);
      }
    });
  }
  
  public final void b(List<b> paramList, long paramLong)
  {
    for (;;)
    {
      try
      {
        long l = this.acz.currentTimeMillis();
        p(l);
        int i = paramList.size() + (mX() - this.azY);
        if (i > 0)
        {
          localObject = cz(i);
          new StringBuilder("DataLayer store full, deleting ").append(((List)localObject).size()).append(" entries to make room.");
          m.mr();
          localObject = (String[])((List)localObject).toArray(new String[0]);
          if ((localObject != null) && (localObject.length != 0)) {}
        }
        else
        {
          c(paramList, l + paramLong);
        }
      }
      finally
      {
        Object localObject;
        SQLiteDatabase localSQLiteDatabase;
        String str;
        mY();
      }
      try
      {
        mY();
        return;
      }
      finally {}
      localSQLiteDatabase = aB("Error opening database for deleteEntries.");
      if (localSQLiteDatabase != null)
      {
        str = String.format("%s in (%s)", new Object[] { "ID", TextUtils.join(",", Collections.nCopies(localObject.length, "?")) });
        try
        {
          localSQLiteDatabase.delete("datalayer", str, (String[])localObject);
        }
        catch (SQLiteException localSQLiteException)
        {
          new StringBuilder("Error deleting entries ").append(Arrays.toString((Object[])localObject));
          m.mq();
        }
      }
    }
  }
  
  public final List<c.a> mV()
  {
    try
    {
      p(this.acz.currentTimeMillis());
      Object localObject = mW();
      ArrayList localArrayList = new ArrayList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        b localb = (b)((Iterator)localObject).next();
        localArrayList.add(new c.a(localb.aut, h(localb.aAd)));
      }
    }
    finally
    {
      mY();
    }
    return localList;
  }
  
  final class a
    extends SQLiteOpenHelper
  {
    a(Context paramContext, String paramString)
    {
      super(paramString, null, 1);
    }
    
    /* Error */
    private static boolean b(String paramString, SQLiteDatabase paramSQLiteDatabase)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore_3
      //   2: aload_1
      //   3: ldc 23
      //   5: iconst_1
      //   6: anewarray 25	java/lang/String
      //   9: dup
      //   10: iconst_0
      //   11: ldc 27
      //   13: aastore
      //   14: ldc 29
      //   16: iconst_1
      //   17: anewarray 25	java/lang/String
      //   20: dup
      //   21: iconst_0
      //   22: aload_0
      //   23: aastore
      //   24: aconst_null
      //   25: aconst_null
      //   26: aconst_null
      //   27: invokevirtual 35	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   30: astore_1
      //   31: aload_1
      //   32: invokeinterface 41 1 0
      //   37: istore_2
      //   38: aload_1
      //   39: ifnull +9 -> 48
      //   42: aload_1
      //   43: invokeinterface 45 1 0
      //   48: iload_2
      //   49: ireturn
      //   50: astore_1
      //   51: aconst_null
      //   52: astore_1
      //   53: new 47	java/lang/StringBuilder
      //   56: dup
      //   57: ldc 49
      //   59: invokespecial 52	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   62: aload_0
      //   63: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   66: pop
      //   67: invokestatic 61	com/google/android/gms/tagmanager/m:mq	()V
      //   70: aload_1
      //   71: ifnull +9 -> 80
      //   74: aload_1
      //   75: invokeinterface 45 1 0
      //   80: iconst_0
      //   81: ireturn
      //   82: astore_0
      //   83: aload_3
      //   84: astore_1
      //   85: aload_1
      //   86: ifnull +9 -> 95
      //   89: aload_1
      //   90: invokeinterface 45 1 0
      //   95: aload_0
      //   96: athrow
      //   97: astore_0
      //   98: goto -13 -> 85
      //   101: astore_0
      //   102: goto -17 -> 85
      //   105: astore_3
      //   106: goto -53 -> 53
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	109	0	paramString	String
      //   0	109	1	paramSQLiteDatabase	SQLiteDatabase
      //   37	12	2	bool	boolean
      //   1	83	3	localObject	Object
      //   105	1	3	localSQLiteException	SQLiteException
      // Exception table:
      //   from	to	target	type
      //   2	31	50	android/database/sqlite/SQLiteException
      //   2	31	82	finally
      //   31	38	97	finally
      //   53	70	101	finally
      //   31	38	105	android/database/sqlite/SQLiteException
    }
    
    public final SQLiteDatabase getWritableDatabase()
    {
      Object localObject1 = null;
      try
      {
        localObject2 = super.getWritableDatabase();
        localObject1 = localObject2;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          Object localObject2;
          ap.this.mContext.getDatabasePath("google_tagmanager.db").delete();
        }
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = super.getWritableDatabase();
      }
      return (SQLiteDatabase)localObject2;
    }
    
    public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      paramSQLiteDatabase = paramSQLiteDatabase.getPath();
      if (h.version() >= 9)
      {
        paramSQLiteDatabase = new File(paramSQLiteDatabase);
        paramSQLiteDatabase.setReadable(false, false);
        paramSQLiteDatabase.setWritable(false, false);
        paramSQLiteDatabase.setReadable(true, true);
        paramSQLiteDatabase.setWritable(true, true);
      }
    }
    
    public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
    {
      Object localObject1;
      if (Build.VERSION.SDK_INT < 15) {
        localObject1 = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
      }
      do
      {
        try
        {
          ((Cursor)localObject1).moveToFirst();
          ((Cursor)localObject1).close();
          if (!b("datalayer", paramSQLiteDatabase))
          {
            paramSQLiteDatabase.execSQL(ap.azV);
            return;
          }
        }
        finally
        {
          ((Cursor)localObject1).close();
        }
        paramSQLiteDatabase = paramSQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
        localObject1 = new HashSet();
        try
        {
          String[] arrayOfString = paramSQLiteDatabase.getColumnNames();
          int i = 0;
          while (i < arrayOfString.length)
          {
            ((Set)localObject1).add(arrayOfString[i]);
            i += 1;
          }
          paramSQLiteDatabase.close();
          if ((!((Set)localObject1).remove("key")) || (!((Set)localObject1).remove("value")) || (!((Set)localObject1).remove("ID")) || (!((Set)localObject1).remove("expires"))) {
            throw new SQLiteException("Database column missing");
          }
        }
        finally
        {
          paramSQLiteDatabase.close();
        }
      } while (((Set)localObject2).isEmpty());
      throw new SQLiteException("Database has extra columns");
    }
    
    public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  }
  
  private static final class b
  {
    final byte[] aAd;
    final String aut;
    
    b(String paramString, byte[] paramArrayOfByte)
    {
      this.aut = paramString;
      this.aAd = paramArrayOfByte;
    }
    
    public final String toString()
    {
      return "KeyAndSerialized: key = " + this.aut + " serialized hash = " + Arrays.hashCode(this.aAd);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */