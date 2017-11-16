package com.tencent.mapsdk.rastercore.tile.a;

import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.os.Environment;
import com.tencent.mapsdk.rastercore.d.a;
import com.tencent.mapsdk.rastercore.d.e;
import com.tencent.mapsdk.rastercore.tile.MapTile.MapSource;
import java.io.File;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public final class a
{
  private static final String g = "Qmap" + File.separator;
  private AtomicBoolean a = new AtomicBoolean(false);
  private volatile Context b;
  private AtomicInteger c = new AtomicInteger(0);
  private b d;
  private c e;
  private ReentrantReadWriteLock f = new ReentrantReadWriteLock();
  
  public static a a()
  {
    return a.a;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return "md5";
    }
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      byte[] arrayOfByte = ((MessageDigest)localObject).digest();
      StringBuilder localStringBuilder = new StringBuilder();
      int i = 0;
      while (i < arrayOfByte.length)
      {
        localObject = Integer.toHexString(arrayOfByte[i] & 0xFF);
        paramArrayOfByte = (byte[])localObject;
        if (((String)localObject).length() == 1) {
          paramArrayOfByte = "0" + (String)localObject;
        }
        localStringBuilder.append(paramArrayOfByte);
        i += 1;
      }
      paramArrayOfByte = localStringBuilder.toString();
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      new StringBuilder("CacheManager getMd5 failed:").append(paramArrayOfByte.toString());
    }
    return "md5";
  }
  
  public static byte[] c(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      int j = paramString.length + paramArrayOfByte.length;
      byte[] arrayOfByte = new byte[j];
      int i = 0;
      while (i < paramString.length)
      {
        arrayOfByte[i] = paramString[i];
        i += 1;
      }
      i = paramString.length;
      while (i < j)
      {
        arrayOfByte[i] = paramArrayOfByte[(i - paramString.length)];
        i += 1;
      }
      return arrayOfByte;
    }
    catch (Exception paramString)
    {
      new StringBuilder("CacheManager encode:").append(paramString.toString());
    }
    return paramArrayOfByte;
  }
  
  public static byte[] d(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      int j = paramString.getBytes("UTF-8").length;
      paramString = new byte[paramArrayOfByte.length - j];
      int i = j;
      while (i < paramArrayOfByte.length)
      {
        paramString[(i - j)] = paramArrayOfByte[i];
        i += 1;
      }
      return paramString;
    }
    catch (Exception paramString) {}
    return paramArrayOfByte;
  }
  
  public final c a(com.tencent.mapsdk.rastercore.tile.a parama)
  {
    c localc = new c(null, e.v(), "");
    if ((this.e == null) || (parama.m() == MapTile.MapSource.CUSTOMER) || (parama.m() == MapTile.MapSource.TRAFFIC)) {
      return localc;
    }
    this.f.readLock().lock();
    try
    {
      parama = this.e.a(parama);
      this.f.readLock().unlock();
      return parama;
    }
    catch (Throwable parama)
    {
      parama = parama;
      this.f.readLock().unlock();
      return localc;
    }
    finally
    {
      parama = finally;
      this.f.readLock().unlock();
      throw parama;
    }
  }
  
  public final void a(Context paramContext)
  {
    try
    {
      this.c.incrementAndGet();
      if (this.a.compareAndSet(false, true))
      {
        this.b = paramContext;
        this.d = new b(this.b);
        this.e = new c(this.d);
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public final boolean a(MapTile.MapSource paramMapSource)
  {
    if (this.e == null) {
      return false;
    }
    this.f.writeLock().lock();
    try
    {
      boolean bool = this.e.a(paramMapSource);
      return bool;
    }
    catch (Throwable paramMapSource)
    {
      new StringBuilder("clearCache error:").append(paramMapSource.toString());
      return false;
    }
    finally
    {
      this.f.writeLock().unlock();
    }
  }
  
  public final boolean a(MapTile.MapSource paramMapSource, int paramInt)
  {
    if (this.e == null) {
      return false;
    }
    this.f.writeLock().lock();
    try
    {
      boolean bool = this.e.a(paramMapSource, paramInt);
      return bool;
    }
    catch (Throwable paramMapSource)
    {
      new StringBuilder("deleteOlderMapCache error:").append(paramMapSource.toString());
      return false;
    }
    finally
    {
      this.f.writeLock().unlock();
    }
  }
  
  public final boolean a(c paramc, com.tencent.mapsdk.rastercore.tile.a parama)
  {
    if ((this.e == null) || (parama.m() == MapTile.MapSource.CUSTOMER) || (parama.m() == MapTile.MapSource.TRAFFIC)) {
      return false;
    }
    Object localObject = parama.m();
    int i;
    switch (1.a[localObject.ordinal()])
    {
    default: 
      i = -1;
    }
    for (;;)
    {
      this.f.writeLock().lock();
      new StringBuilder("CacheManager Put currentVersion:").append(i).append(",tileData.getVersion():").append(parama.l());
      try
      {
        if ((parama.g()) && (parama.l() == i))
        {
          localObject = this.e;
          if (localObject != null) {}
        }
        else
        {
          return false;
          i = e.s();
          continue;
          i = e.v();
          continue;
          i = e.w();
          continue;
        }
        new StringBuilder("Put: tileData.getVersion()=").append(parama.l()).append(",currentVersion=").append(i);
        if (!c.a(this.e, parama))
        {
          bool = this.e.a(parama, paramc.c());
          return bool;
        }
        boolean bool = this.e.a(parama, paramc.c(), false);
        return bool;
      }
      catch (Throwable paramc)
      {
        new StringBuilder("put error:").append(paramc.toString());
        return false;
      }
      finally
      {
        this.f.writeLock().unlock();
      }
    }
  }
  
  public final boolean a(com.tencent.mapsdk.rastercore.tile.a parama, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if ((this.e == null) || (parama.m() == MapTile.MapSource.CUSTOMER) || (parama.m() == MapTile.MapSource.TRAFFIC)) {
      return false;
    }
    this.f.writeLock().lock();
    try
    {
      paramBoolean = this.e.a(parama, null, true);
      return paramBoolean;
    }
    catch (Throwable parama)
    {
      new StringBuilder("updateTile error:").append(parama.toString());
      return false;
    }
    finally
    {
      this.f.writeLock().unlock();
    }
  }
  
  public final String b()
  {
    int j = 1;
    boolean bool = Environment.getExternalStorageState().equals("mounted");
    if (this.b == null) {
      return null;
    }
    int i = j;
    if (Build.VERSION.SDK_INT >= 23)
    {
      i = this.b.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
      int k = this.b.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
      if ((i != 0) || (k != 0)) {
        break label169;
      }
    }
    label169:
    for (i = j;; i = 0)
    {
      if ((bool) && (i != 0)) {}
      for (;;)
      {
        try
        {
          String str1 = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + g;
          d.a.b(str1);
          return str1;
        }
        catch (Exception localException)
        {
          System.out.println(localException.toString());
          return null;
        }
        String str2 = this.b.getFileStreamPath("") + File.separator + g;
      }
    }
  }
  
  public final void c()
  {
    if (this.c.decrementAndGet() == 0)
    {
      if (this.e != null) {
        this.e.close();
      }
      this.a.compareAndSet(true, false);
    }
  }
  
  static final class a
  {
    public static final a a = new a();
  }
  
  final class b
    extends ContextWrapper
  {
    public b(Context paramContext)
    {
      super();
    }
    
    public final SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory)
    {
      String str = a.this.b();
      if ((str == null) || (str.length() == 0)) {
        return super.openOrCreateDatabase(paramString, paramInt, paramCursorFactory);
      }
      return SQLiteDatabase.openOrCreateDatabase(str + paramString, null);
    }
    
    public final SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
    {
      String str = a.this.b();
      if ((str == null) || (str.length() == 0)) {
        return super.openOrCreateDatabase(paramString, paramInt, paramCursorFactory, paramDatabaseErrorHandler);
      }
      return SQLiteDatabase.openOrCreateDatabase(str + paramString, null);
    }
  }
  
  final class c
    extends SQLiteOpenHelper
  {
    private SQLiteDatabase a = null;
    
    public c(Context paramContext)
    {
      super("Cache.db", null, 1);
      if (Build.VERSION.SDK_INT > 10)
      {
        this.a.enableWriteAheadLogging();
        return;
      }
      this.a.setLockingEnabled(true);
    }
    
    private static void a(String paramString, SQLiteDatabase paramSQLiteDatabase)
    {
      paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + paramString + " (tile TEXT PRIMARY KEY UNIQUE,version TEXT,style TEXT,md5" + " TEXT,data BLOB )");
    }
    
    private static String b(MapTile.MapSource paramMapSource)
    {
      switch (a.1.a[paramMapSource.ordinal()])
      {
      default: 
        return "";
      case 2: 
        return "tct";
      case 1: 
        return "wmt";
      }
      return "stt";
    }
    
    private static String b(com.tencent.mapsdk.rastercore.tile.a parama)
    {
      switch (a.1.a[parama.m().ordinal()])
      {
      default: 
        return null;
      case 2: 
        return parama.d() + "-" + parama.b() + "-" + parama.c() + "-zh-" + e.y();
      case 1: 
        return parama.d() + "-" + parama.b() + "-" + parama.c() + "-" + e.u() + "-" + e.t();
      }
      return parama.d() + "-" + parama.b() + "-" + parama.c();
    }
    
    private static int c(MapTile.MapSource paramMapSource)
    {
      if (paramMapSource == MapTile.MapSource.BING) {
        return e.t();
      }
      if (paramMapSource == MapTile.MapSource.TENCENT) {
        return e.y();
      }
      return -1;
    }
    
    private boolean c(com.tencent.mapsdk.rastercore.tile.a parama)
    {
      localObject = null;
      Cursor localCursor = null;
      boolean bool2 = true;
      boolean bool1 = true;
      String str = b(parama);
      str = "select count(*) as ct from " + b(parama.m()) + " where " + "tile" + " = '" + str + "'";
      parama = localCursor;
      do
      {
        for (;;)
        {
          try
          {
            localCursor = this.a.rawQuery(str, null);
            if (localCursor == null) {
              continue;
            }
            parama = localCursor;
            localObject = localCursor;
            if (localCursor.getCount() <= 0) {
              continue;
            }
            parama = localCursor;
            localObject = localCursor;
            localCursor.moveToFirst();
            parama = localCursor;
            localObject = localCursor;
            int i = localCursor.getInt(localCursor.getColumnIndex("ct"));
            if (i <= 0) {
              continue;
            }
            bool2 = bool1;
            if (localCursor != null)
            {
              localCursor.close();
              bool2 = bool1;
            }
          }
          catch (Throwable localThrowable)
          {
            localObject = parama;
            new StringBuilder("tileExist error:").append(localThrowable.toString());
            if (parama == null) {
              continue;
            }
            parama.close();
            return true;
          }
          finally
          {
            if (localObject == null) {
              continue;
            }
            ((Cursor)localObject).close();
          }
          return bool2;
          bool1 = false;
        }
      } while (localCursor == null);
      localCursor.close();
      return true;
    }
    
    /* Error */
    public final c a(com.tencent.mapsdk.rastercore.tile.a parama)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 18	com/tencent/mapsdk/rastercore/tile/a/a$c:a	Landroid/database/sqlite/SQLiteDatabase;
      //   4: ifnonnull +5 -> 9
      //   7: aconst_null
      //   8: areturn
      //   9: new 42	java/lang/StringBuilder
      //   12: dup
      //   13: ldc -79
      //   15: invokespecial 47	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   18: aload_1
      //   19: invokevirtual 94	com/tencent/mapsdk/rastercore/tile/a:m	()Lcom/tencent/mapsdk/rastercore/tile/MapTile$MapSource;
      //   22: invokestatic 138	com/tencent/mapsdk/rastercore/tile/a/a$c:b	(Lcom/tencent/mapsdk/rastercore/tile/MapTile$MapSource;)Ljava/lang/String;
      //   25: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   28: ldc -77
      //   30: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   33: invokevirtual 59	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   36: astore_2
      //   37: aload_0
      //   38: getfield 18	com/tencent/mapsdk/rastercore/tile/a/a$c:a	Landroid/database/sqlite/SQLiteDatabase;
      //   41: aload_2
      //   42: iconst_1
      //   43: anewarray 181	java/lang/String
      //   46: dup
      //   47: iconst_0
      //   48: aload_1
      //   49: invokestatic 134	com/tencent/mapsdk/rastercore/tile/a/a$c:b	(Lcom/tencent/mapsdk/rastercore/tile/a;)Ljava/lang/String;
      //   52: aastore
      //   53: invokevirtual 150	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
      //   56: astore_2
      //   57: aload_2
      //   58: ifnull +102 -> 160
      //   61: aload_2
      //   62: astore_1
      //   63: aload_2
      //   64: invokeinterface 155 1 0
      //   69: ifle +91 -> 160
      //   72: aload_2
      //   73: astore_1
      //   74: aload_2
      //   75: invokeinterface 158 1 0
      //   80: pop
      //   81: aload_2
      //   82: astore_1
      //   83: aload_2
      //   84: aload_2
      //   85: ldc -73
      //   87: invokeinterface 164 2 0
      //   92: invokeinterface 187 2 0
      //   97: astore_3
      //   98: aload_2
      //   99: astore_1
      //   100: aload_2
      //   101: aload_2
      //   102: ldc -67
      //   104: invokeinterface 164 2 0
      //   109: invokeinterface 193 2 0
      //   114: astore 4
      //   116: aload_2
      //   117: astore_1
      //   118: new 195	com/tencent/mapsdk/rastercore/tile/a/c
      //   121: dup
      //   122: aload_3
      //   123: aload 4
      //   125: invokestatic 198	com/tencent/mapsdk/rastercore/tile/a/a:d	([BLjava/lang/String;)[B
      //   128: aload_2
      //   129: aload_2
      //   130: ldc -56
      //   132: invokeinterface 164 2 0
      //   137: invokeinterface 168 2 0
      //   142: aload 4
      //   144: invokespecial 203	com/tencent/mapsdk/rastercore/tile/a/c:<init>	([BILjava/lang/String;)V
      //   147: astore_3
      //   148: aload_2
      //   149: ifnull +9 -> 158
      //   152: aload_2
      //   153: invokeinterface 171 1 0
      //   158: aload_3
      //   159: areturn
      //   160: aload_2
      //   161: ifnull +9 -> 170
      //   164: aload_2
      //   165: invokeinterface 171 1 0
      //   170: new 195	com/tencent/mapsdk/rastercore/tile/a/c
      //   173: dup
      //   174: aconst_null
      //   175: invokestatic 206	com/tencent/mapsdk/rastercore/d/e:v	()I
      //   178: ldc 81
      //   180: invokespecial 203	com/tencent/mapsdk/rastercore/tile/a/c:<init>	([BILjava/lang/String;)V
      //   183: areturn
      //   184: astore_3
      //   185: aconst_null
      //   186: astore_2
      //   187: aload_2
      //   188: astore_1
      //   189: new 42	java/lang/StringBuilder
      //   192: dup
      //   193: ldc -48
      //   195: invokespecial 47	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   198: aload_3
      //   199: invokevirtual 174	java/lang/Throwable:toString	()Ljava/lang/String;
      //   202: invokevirtual 51	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   205: pop
      //   206: aload_2
      //   207: ifnull -37 -> 170
      //   210: aload_2
      //   211: invokeinterface 171 1 0
      //   216: goto -46 -> 170
      //   219: astore_1
      //   220: aconst_null
      //   221: astore_3
      //   222: aload_1
      //   223: astore_2
      //   224: aload_3
      //   225: ifnull +9 -> 234
      //   228: aload_3
      //   229: invokeinterface 171 1 0
      //   234: aload_2
      //   235: athrow
      //   236: astore_2
      //   237: aload_1
      //   238: astore_3
      //   239: goto -15 -> 224
      //   242: astore_3
      //   243: goto -56 -> 187
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	246	0	this	c
      //   0	246	1	parama	com.tencent.mapsdk.rastercore.tile.a
      //   36	199	2	localObject1	Object
      //   236	1	2	localObject2	Object
      //   97	62	3	localObject3	Object
      //   184	15	3	localThrowable1	Throwable
      //   221	18	3	locala	com.tencent.mapsdk.rastercore.tile.a
      //   242	1	3	localThrowable2	Throwable
      //   114	29	4	str	String
      // Exception table:
      //   from	to	target	type
      //   37	57	184	java/lang/Throwable
      //   37	57	219	finally
      //   63	72	236	finally
      //   74	81	236	finally
      //   83	98	236	finally
      //   100	116	236	finally
      //   118	148	236	finally
      //   189	206	236	finally
      //   63	72	242	java/lang/Throwable
      //   74	81	242	java/lang/Throwable
      //   83	98	242	java/lang/Throwable
      //   100	116	242	java/lang/Throwable
      //   118	148	242	java/lang/Throwable
    }
    
    public final boolean a(MapTile.MapSource paramMapSource)
    {
      if (this.a == null) {
        return false;
      }
      String str2 = "delete  from " + b(paramMapSource);
      String str1;
      if (paramMapSource != MapTile.MapSource.BING)
      {
        str1 = str2;
        if (paramMapSource != MapTile.MapSource.TENCENT) {}
      }
      else
      {
        str1 = str2 + " where style = '" + c(paramMapSource) + "'";
      }
      try
      {
        this.a.execSQL(str1);
        return true;
      }
      catch (Throwable paramMapSource)
      {
        new StringBuilder("cleanCache Error:").append(paramMapSource.toString());
      }
      return false;
    }
    
    public final boolean a(MapTile.MapSource paramMapSource, int paramInt)
    {
      try
      {
        StringBuilder localStringBuilder = new StringBuilder("delete from ");
        localStringBuilder.append(b(paramMapSource));
        if (paramMapSource == MapTile.MapSource.SATELLITE) {}
        for (paramMapSource = " where version != '" + paramInt + "'";; paramMapSource = " where style = '" + c(paramMapSource) + "' and version != '" + paramInt + "'")
        {
          localStringBuilder.append(paramMapSource);
          this.a.execSQL(localStringBuilder.toString());
          return true;
        }
        return false;
      }
      catch (Throwable paramMapSource)
      {
        new StringBuilder("deleteOlderCache error:").append(paramMapSource.toString());
      }
    }
    
    public final boolean a(com.tencent.mapsdk.rastercore.tile.a parama, byte[] paramArrayOfByte)
    {
      if (this.a == null) {}
      for (;;)
      {
        return false;
        try
        {
          Object localObject = a.a(paramArrayOfByte);
          byte[] arrayOfByte = a.c(paramArrayOfByte, (String)localObject);
          paramArrayOfByte = new ContentValues();
          paramArrayOfByte.put("tile", b(parama));
          paramArrayOfByte.put("data", arrayOfByte);
          paramArrayOfByte.put("md5", (String)localObject);
          localObject = parama.m();
          if (localObject == MapTile.MapSource.BING) {
            paramArrayOfByte.put("style", Integer.valueOf(e.t()));
          }
          if (localObject == MapTile.MapSource.TENCENT) {
            paramArrayOfByte.put("style", Integer.valueOf(e.y()));
          }
          paramArrayOfByte.put("version", Integer.valueOf(parama.l()));
          long l = this.a.insert(b(parama.m()), null, paramArrayOfByte);
          if (l != -1L) {
            return true;
          }
        }
        catch (Throwable parama)
        {
          new StringBuilder("putBitmap Error:").append(parama.toString());
        }
      }
      return false;
    }
    
    public final boolean a(com.tencent.mapsdk.rastercore.tile.a parama, byte[] paramArrayOfByte, boolean paramBoolean)
    {
      if (this.a == null) {}
      for (;;)
      {
        return false;
        try
        {
          ContentValues localContentValues = new ContentValues();
          String str1 = b(parama);
          localContentValues.put("version", Integer.valueOf(parama.l()));
          String str2 = a.a(paramArrayOfByte);
          if ((!paramBoolean) && (paramArrayOfByte != null))
          {
            localContentValues.put("md5", str2);
            localContentValues.put("data", paramArrayOfByte);
          }
          int i = this.a.update(b(parama.m()), localContentValues, "tile = ? ", new String[] { str1 });
          if (i > 0) {
            return true;
          }
        }
        catch (Throwable parama)
        {
          new StringBuilder("updateBitmap Error:").append(parama.toString());
        }
      }
      return false;
    }
    
    public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      a("tct", paramSQLiteDatabase);
      a("wmt", paramSQLiteDatabase);
      a("stt", paramSQLiteDatabase);
    }
    
    public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
    {
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS  tct");
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS  wmt");
      paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS  stt");
      onCreate(paramSQLiteDatabase);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\tile\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */