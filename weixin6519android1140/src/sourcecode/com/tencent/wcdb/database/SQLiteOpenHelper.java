package com.tencent.wcdb.database;

import android.content.Context;
import com.tencent.wcdb.DatabaseErrorHandler;
import com.tencent.wcdb.support.Log;

public abstract class SQLiteOpenHelper
{
  private static final boolean DEBUG_STRICT_READONLY = false;
  private static final String TAG = "WCDB.SQLiteOpenHelper";
  private SQLiteCipherSpec mCipher;
  private final Context mContext;
  private SQLiteDatabase mDatabase;
  private boolean mEnableWriteAheadLogging;
  private final DatabaseErrorHandler mErrorHandler;
  private final SQLiteDatabase.CursorFactory mFactory;
  private boolean mIsInitializing;
  private int mMode;
  private final String mName;
  private boolean mNeedMode;
  private final int mNewVersion;
  private byte[] mPassword;
  
  static {}
  
  public SQLiteOpenHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    this(paramContext, paramString, paramCursorFactory, paramInt, null);
  }
  
  public SQLiteOpenHelper(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString, null, null, paramCursorFactory, paramInt, paramDatabaseErrorHandler);
  }
  
  public SQLiteOpenHelper(Context paramContext, String paramString, byte[] paramArrayOfByte, SQLiteCipherSpec paramSQLiteCipherSpec, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("Version must be >= 1, was " + paramInt);
    }
    this.mContext = paramContext;
    this.mName = paramString;
    this.mFactory = paramCursorFactory;
    this.mNewVersion = paramInt;
    this.mErrorHandler = paramDatabaseErrorHandler;
    this.mPassword = paramArrayOfByte;
    if (paramSQLiteCipherSpec == null) {}
    for (paramContext = null;; paramContext = new SQLiteCipherSpec(paramSQLiteCipherSpec))
    {
      this.mCipher = paramContext;
      this.mNeedMode = false;
      return;
    }
  }
  
  public SQLiteOpenHelper(Context paramContext, String paramString, byte[] paramArrayOfByte, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    this(paramContext, paramString, paramArrayOfByte, null, paramCursorFactory, paramInt, paramDatabaseErrorHandler);
  }
  
  /* Error */
  private SQLiteDatabase getDatabaseLocked(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   4: ifnull +18 -> 22
    //   7: aload_0
    //   8: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   11: invokevirtual 98	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   14: ifne +25 -> 39
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   22: aload_0
    //   23: getfield 100	com/tencent/wcdb/database/SQLiteOpenHelper:mIsInitializing	Z
    //   26: ifeq +36 -> 62
    //   29: new 102	java/lang/IllegalStateException
    //   32: dup
    //   33: ldc 104
    //   35: invokespecial 105	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   38: athrow
    //   39: iload_1
    //   40: ifeq +13 -> 53
    //   43: aload_0
    //   44: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   47: invokevirtual 108	com/tencent/wcdb/database/SQLiteDatabase:isReadOnly	()Z
    //   50: ifne -28 -> 22
    //   53: aload_0
    //   54: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   57: astore 4
    //   59: aload 4
    //   61: areturn
    //   62: aload_0
    //   63: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   66: astore_3
    //   67: aload_0
    //   68: iconst_1
    //   69: putfield 100	com/tencent/wcdb/database/SQLiteOpenHelper:mIsInitializing	Z
    //   72: aload_3
    //   73: ifnull +57 -> 130
    //   76: iload_1
    //   77: ifeq +256 -> 333
    //   80: aload_3
    //   81: invokevirtual 108	com/tencent/wcdb/database/SQLiteDatabase:isReadOnly	()Z
    //   84: ifeq +249 -> 333
    //   87: aload_3
    //   88: invokevirtual 111	com/tencent/wcdb/database/SQLiteDatabase:reopenReadWrite	()V
    //   91: aload_0
    //   92: aload_3
    //   93: invokespecial 115	com/tencent/wcdb/database/SQLiteOpenHelper:getDatabaseLockedLast	(Lcom/tencent/wcdb/database/SQLiteDatabase;)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   96: astore 5
    //   98: aload_0
    //   99: iconst_0
    //   100: putfield 100	com/tencent/wcdb/database/SQLiteOpenHelper:mIsInitializing	Z
    //   103: aload 5
    //   105: astore 4
    //   107: aload_3
    //   108: ifnull -49 -> 59
    //   111: aload 5
    //   113: astore 4
    //   115: aload_3
    //   116: aload_0
    //   117: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   120: if_acmpeq -61 -> 59
    //   123: aload_3
    //   124: invokevirtual 118	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   127: aload 5
    //   129: areturn
    //   130: aload_0
    //   131: getfield 70	com/tencent/wcdb/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   134: ifnonnull +15 -> 149
    //   137: aconst_null
    //   138: invokestatic 122	com/tencent/wcdb/database/SQLiteDatabase:create	(Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   141: astore 4
    //   143: aload 4
    //   145: astore_3
    //   146: goto -55 -> 91
    //   149: aload_0
    //   150: iconst_1
    //   151: putfield 82	com/tencent/wcdb/database/SQLiteOpenHelper:mNeedMode	Z
    //   154: aload_0
    //   155: getfield 124	com/tencent/wcdb/database/SQLiteOpenHelper:mEnableWriteAheadLogging	Z
    //   158: ifeq +50 -> 208
    //   161: bipush 8
    //   163: istore_2
    //   164: aload_0
    //   165: iload_2
    //   166: putfield 126	com/tencent/wcdb/database/SQLiteOpenHelper:mMode	I
    //   169: aload_0
    //   170: getfield 68	com/tencent/wcdb/database/SQLiteOpenHelper:mContext	Landroid/content/Context;
    //   173: aload_0
    //   174: getfield 70	com/tencent/wcdb/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   177: aload_0
    //   178: getfield 78	com/tencent/wcdb/database/SQLiteOpenHelper:mPassword	[B
    //   181: aload_0
    //   182: getfield 80	com/tencent/wcdb/database/SQLiteOpenHelper:mCipher	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   185: aload_0
    //   186: getfield 126	com/tencent/wcdb/database/SQLiteOpenHelper:mMode	I
    //   189: aload_0
    //   190: getfield 72	com/tencent/wcdb/database/SQLiteOpenHelper:mFactory	Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;
    //   193: aload_0
    //   194: getfield 76	com/tencent/wcdb/database/SQLiteOpenHelper:mErrorHandler	Lcom/tencent/wcdb/DatabaseErrorHandler;
    //   197: invokestatic 132	com/tencent/wcdb/support/Context:openOrCreateDatabase	(Landroid/content/Context;Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;ILcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;Lcom/tencent/wcdb/DatabaseErrorHandler;)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   200: astore 4
    //   202: aload 4
    //   204: astore_3
    //   205: goto -114 -> 91
    //   208: iconst_0
    //   209: istore_2
    //   210: goto -46 -> 164
    //   213: astore 4
    //   215: iload_1
    //   216: ifeq +32 -> 248
    //   219: aload 4
    //   221: athrow
    //   222: astore 4
    //   224: aload_0
    //   225: iconst_0
    //   226: putfield 100	com/tencent/wcdb/database/SQLiteOpenHelper:mIsInitializing	Z
    //   229: aload_3
    //   230: ifnull +15 -> 245
    //   233: aload_3
    //   234: aload_0
    //   235: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   238: if_acmpeq +7 -> 245
    //   241: aload_3
    //   242: invokevirtual 118	com/tencent/wcdb/database/SQLiteDatabase:close	()V
    //   245: aload 4
    //   247: athrow
    //   248: ldc 11
    //   250: new 52	java/lang/StringBuilder
    //   253: dup
    //   254: ldc -122
    //   256: invokespecial 57	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   259: aload_0
    //   260: getfield 70	com/tencent/wcdb/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   263: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: ldc -117
    //   268: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   274: iconst_1
    //   275: anewarray 4	java/lang/Object
    //   278: dup
    //   279: iconst_0
    //   280: aload 4
    //   282: aastore
    //   283: invokestatic 145	com/tencent/wcdb/support/Log:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: aload_0
    //   287: getfield 68	com/tencent/wcdb/database/SQLiteOpenHelper:mContext	Landroid/content/Context;
    //   290: aload_0
    //   291: getfield 70	com/tencent/wcdb/database/SQLiteOpenHelper:mName	Ljava/lang/String;
    //   294: invokevirtual 151	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   297: invokevirtual 156	java/io/File:getPath	()Ljava/lang/String;
    //   300: aload_0
    //   301: getfield 78	com/tencent/wcdb/database/SQLiteOpenHelper:mPassword	[B
    //   304: aload_0
    //   305: getfield 80	com/tencent/wcdb/database/SQLiteOpenHelper:mCipher	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
    //   308: aload_0
    //   309: getfield 72	com/tencent/wcdb/database/SQLiteOpenHelper:mFactory	Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;
    //   312: iconst_1
    //   313: aload_0
    //   314: getfield 76	com/tencent/wcdb/database/SQLiteOpenHelper:mErrorHandler	Lcom/tencent/wcdb/DatabaseErrorHandler;
    //   317: invokestatic 160	com/tencent/wcdb/database/SQLiteDatabase:openDatabase	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;ILcom/tencent/wcdb/DatabaseErrorHandler;)Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   320: astore 4
    //   322: aload 4
    //   324: astore_3
    //   325: goto -234 -> 91
    //   328: astore 4
    //   330: goto -106 -> 224
    //   333: goto -242 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	336	0	this	SQLiteOpenHelper
    //   0	336	1	paramBoolean	boolean
    //   163	47	2	i	int
    //   66	259	3	localObject1	Object
    //   57	146	4	localObject2	Object
    //   213	7	4	localSQLiteException	SQLiteException
    //   222	59	4	localObject3	Object
    //   320	3	4	localSQLiteDatabase1	SQLiteDatabase
    //   328	1	4	localObject4	Object
    //   96	32	5	localSQLiteDatabase2	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   149	161	213	com/tencent/wcdb/database/SQLiteException
    //   164	202	213	com/tencent/wcdb/database/SQLiteException
    //   67	72	222	finally
    //   80	91	222	finally
    //   130	143	222	finally
    //   149	161	222	finally
    //   164	202	222	finally
    //   219	222	222	finally
    //   248	322	222	finally
    //   91	98	328	finally
  }
  
  private SQLiteDatabase getDatabaseLockedLast(SQLiteDatabase paramSQLiteDatabase)
  {
    onConfigure(paramSQLiteDatabase);
    int i = paramSQLiteDatabase.getVersion();
    if (i != this.mNewVersion)
    {
      if (paramSQLiteDatabase.isReadOnly()) {
        throw new SQLiteException("Can't upgrade read-only database from version " + paramSQLiteDatabase.getVersion() + " to " + this.mNewVersion + ": " + this.mName);
      }
      paramSQLiteDatabase.beginTransaction();
      if (i != 0) {
        break label153;
      }
    }
    for (;;)
    {
      try
      {
        onCreate(paramSQLiteDatabase);
        paramSQLiteDatabase.setVersion(this.mNewVersion);
        paramSQLiteDatabase.setTransactionSuccessful();
        paramSQLiteDatabase.endTransaction();
        onOpen(paramSQLiteDatabase);
        if (paramSQLiteDatabase.isReadOnly()) {
          Log.w("WCDB.SQLiteOpenHelper", "Opened " + this.mName + " in read-only mode");
        }
        this.mDatabase = paramSQLiteDatabase;
        return paramSQLiteDatabase;
      }
      finally
      {
        label153:
        paramSQLiteDatabase.endTransaction();
      }
      if (i > this.mNewVersion) {
        onDowngrade(paramSQLiteDatabase, i, this.mNewVersion);
      } else {
        onUpgrade(paramSQLiteDatabase, i, this.mNewVersion);
      }
    }
  }
  
  public void close()
  {
    try
    {
      if (this.mIsInitializing) {
        throw new IllegalStateException("Closed during initialization");
      }
    }
    finally {}
    if ((this.mDatabase != null) && (this.mDatabase.isOpen()))
    {
      this.mDatabase.close();
      this.mDatabase = null;
    }
  }
  
  public String getDatabaseName()
  {
    return this.mName;
  }
  
  public SQLiteDatabase getReadableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getDatabaseLocked(false);
      return localSQLiteDatabase;
    }
    finally {}
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = getDatabaseLocked(true);
      return localSQLiteDatabase;
    }
    finally {}
  }
  
  public void onConfigure(SQLiteDatabase paramSQLiteDatabase) {}
  
  public abstract void onCreate(SQLiteDatabase paramSQLiteDatabase);
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    throw new SQLiteException("Can't downgrade database from version " + paramInt1 + " to " + paramInt2);
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase) {}
  
  public abstract void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2);
  
  /* Error */
  public void setWriteAheadLoggingEnabled(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 124	com/tencent/wcdb/database/SQLiteOpenHelper:mEnableWriteAheadLogging	Z
    //   6: iload_1
    //   7: if_icmpeq +47 -> 54
    //   10: aload_0
    //   11: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   14: ifnull +35 -> 49
    //   17: aload_0
    //   18: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   21: invokevirtual 98	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
    //   24: ifeq +25 -> 49
    //   27: aload_0
    //   28: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   31: invokevirtual 108	com/tencent/wcdb/database/SQLiteDatabase:isReadOnly	()Z
    //   34: ifne +15 -> 49
    //   37: iload_1
    //   38: ifeq +19 -> 57
    //   41: aload_0
    //   42: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   45: invokevirtual 224	com/tencent/wcdb/database/SQLiteDatabase:enableWriteAheadLogging	()Z
    //   48: pop
    //   49: aload_0
    //   50: iload_1
    //   51: putfield 124	com/tencent/wcdb/database/SQLiteOpenHelper:mEnableWriteAheadLogging	Z
    //   54: aload_0
    //   55: monitorexit
    //   56: return
    //   57: aload_0
    //   58: getfield 94	com/tencent/wcdb/database/SQLiteOpenHelper:mDatabase	Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   61: invokevirtual 227	com/tencent/wcdb/database/SQLiteDatabase:disableWriteAheadLogging	()V
    //   64: goto -15 -> 49
    //   67: astore_2
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_2
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	SQLiteOpenHelper
    //   0	72	1	paramBoolean	boolean
    //   67	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	37	67	finally
    //   41	49	67	finally
    //   49	54	67	finally
    //   54	56	67	finally
    //   57	64	67	finally
    //   68	70	67	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\wcdb\database\SQLiteOpenHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */