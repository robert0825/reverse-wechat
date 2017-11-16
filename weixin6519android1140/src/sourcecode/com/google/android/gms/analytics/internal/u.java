package com.google.android.gms.analytics.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.c.v;
import com.google.android.gms.common.internal.w;
import java.io.Closeable;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

final class u
  extends o
  implements Closeable
{
  public static final String adw = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] { "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id" });
  private static final String adx = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] { "hit_time", "hits2" });
  public final j adA = new j(this.ack.acz);
  private final a ady;
  private final j adz = new j(this.ack.acz);
  
  u(q paramq)
  {
    super(paramq);
    String str = iS();
    this.ady = new a(paramq.mContext, str);
  }
  
  private long S(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    Object localObject3 = getWritableDatabase();
    try
    {
      localObject3 = ((SQLiteDatabase)localObject3).rawQuery(paramString, null);
      localObject1 = localObject3;
      localObject2 = localObject3;
      if (((Cursor)localObject3).moveToFirst())
      {
        localObject1 = localObject3;
        localObject2 = localObject3;
        long l = ((Cursor)localObject3).getLong(0);
        return l;
      }
      localObject1 = localObject3;
      localObject2 = localObject3;
      throw new SQLiteException("Database returned empty set");
    }
    catch (SQLiteException localSQLiteException)
    {
      localObject2 = localObject1;
      d("Database error", paramString, localSQLiteException);
      localObject2 = localObject1;
      throw localSQLiteException;
    }
    finally
    {
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
    }
  }
  
  private Map<String, String> T(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return new HashMap(0);
    }
    for (;;)
    {
      try
      {
        if (paramString.startsWith("?"))
        {
          Object localObject = URLEncodedUtils.parse(new URI(paramString), "UTF-8");
          paramString = new HashMap(((List)localObject).size());
          localObject = ((List)localObject).iterator();
          if (!((Iterator)localObject).hasNext()) {
            break;
          }
          NameValuePair localNameValuePair = (NameValuePair)((Iterator)localObject).next();
          paramString.put(localNameValuePair.getName(), localNameValuePair.getValue());
          continue;
        }
        paramString = "?" + paramString;
      }
      catch (URISyntaxException paramString)
      {
        f("Error parsing hit parameters", paramString);
        return new HashMap(0);
      }
    }
    return paramString;
  }
  
  private Map<String, String> U(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return new HashMap(0);
    }
    try
    {
      Object localObject = URLEncodedUtils.parse(new URI("?" + paramString), "UTF-8");
      paramString = new HashMap(((List)localObject).size());
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        NameValuePair localNameValuePair = (NameValuePair)((Iterator)localObject).next();
        paramString.put(localNameValuePair.getName(), localNameValuePair.getValue());
      }
      return paramString;
    }
    catch (URISyntaxException paramString)
    {
      f("Error parsing property parameters", paramString);
      return new HashMap(0);
    }
  }
  
  /* Error */
  private long a(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 94	com/google/android/gms/analytics/internal/u:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 7
    //   6: aconst_null
    //   7: astore 5
    //   9: aconst_null
    //   10: astore 6
    //   12: aload 7
    //   14: aload_1
    //   15: aload_2
    //   16: invokevirtual 100	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface 106 1 0
    //   26: ifeq +23 -> 49
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 110 2 0
    //   36: lstore_3
    //   37: aload_2
    //   38: ifnull +9 -> 47
    //   41: aload_2
    //   42: invokeinterface 113 1 0
    //   47: lload_3
    //   48: lreturn
    //   49: aload_2
    //   50: ifnull +9 -> 59
    //   53: aload_2
    //   54: invokeinterface 113 1 0
    //   59: lconst_0
    //   60: lreturn
    //   61: astore 5
    //   63: aload 6
    //   65: astore_2
    //   66: aload 5
    //   68: astore 6
    //   70: aload_2
    //   71: astore 5
    //   73: aload_0
    //   74: ldc 120
    //   76: aload_1
    //   77: aload 6
    //   79: invokevirtual 124	com/google/android/gms/analytics/internal/u:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   82: aload_2
    //   83: astore 5
    //   85: aload 6
    //   87: athrow
    //   88: astore_1
    //   89: aload 5
    //   91: ifnull +10 -> 101
    //   94: aload 5
    //   96: invokeinterface 113 1 0
    //   101: aload_1
    //   102: athrow
    //   103: astore_1
    //   104: aload_2
    //   105: astore 5
    //   107: goto -18 -> 89
    //   110: astore 6
    //   112: goto -42 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	u
    //   0	115	1	paramString	String
    //   0	115	2	paramArrayOfString	String[]
    //   36	12	3	l	long
    //   7	1	5	localObject	Object
    //   61	6	5	localSQLiteException1	SQLiteException
    //   71	35	5	arrayOfString	String[]
    //   10	76	6	localSQLiteException2	SQLiteException
    //   110	1	6	localSQLiteException3	SQLiteException
    //   4	9	7	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   12	20	61	android/database/sqlite/SQLiteException
    //   12	20	88	finally
    //   73	82	88	finally
    //   85	88	88	finally
    //   20	37	103	finally
    //   20	37	110	android/database/sqlite/SQLiteException
  }
  
  private SQLiteDatabase getWritableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.ady.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      e("Error opening database", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  private long iO()
  {
    q.iK();
    iC();
    return S("SELECT COUNT(*) FROM hits2");
  }
  
  /* Error */
  private List<Long> j(long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: invokestatic 222	com/google/android/gms/analytics/internal/q:iK	()V
    //   6: aload_0
    //   7: invokevirtual 225	com/google/android/gms/analytics/internal/u:iC	()V
    //   10: lload_1
    //   11: lconst_0
    //   12: lcmp
    //   13: ifgt +7 -> 20
    //   16: invokestatic 237	java/util/Collections:emptyList	()Ljava/util/List;
    //   19: areturn
    //   20: aload_0
    //   21: invokespecial 94	com/google/android/gms/analytics/internal/u:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   24: astore 4
    //   26: new 239	java/util/ArrayList
    //   29: dup
    //   30: invokespecial 241	java/util/ArrayList:<init>	()V
    //   33: astore 7
    //   35: ldc -13
    //   37: iconst_1
    //   38: anewarray 23	java/lang/Object
    //   41: dup
    //   42: iconst_0
    //   43: ldc 27
    //   45: aastore
    //   46: invokestatic 41	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   49: astore 6
    //   51: lload_1
    //   52: invokestatic 248	java/lang/Long:toString	(J)Ljava/lang/String;
    //   55: astore 8
    //   57: aload 4
    //   59: ldc 25
    //   61: iconst_1
    //   62: anewarray 37	java/lang/String
    //   65: dup
    //   66: iconst_0
    //   67: ldc 27
    //   69: aastore
    //   70: aconst_null
    //   71: aconst_null
    //   72: aconst_null
    //   73: aconst_null
    //   74: aload 6
    //   76: aload 8
    //   78: invokevirtual 252	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   81: astore 4
    //   83: aload 4
    //   85: astore 5
    //   87: aload 5
    //   89: astore 4
    //   91: aload 5
    //   93: invokeinterface 106 1 0
    //   98: ifeq +42 -> 140
    //   101: aload 5
    //   103: astore 4
    //   105: aload 7
    //   107: aload 5
    //   109: iconst_0
    //   110: invokeinterface 110 2 0
    //   115: invokestatic 256	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   118: invokeinterface 260 2 0
    //   123: pop
    //   124: aload 5
    //   126: astore 4
    //   128: aload 5
    //   130: invokeinterface 263 1 0
    //   135: istore_3
    //   136: iload_3
    //   137: ifne -36 -> 101
    //   140: aload 5
    //   142: ifnull +10 -> 152
    //   145: aload 5
    //   147: invokeinterface 113 1 0
    //   152: aload 7
    //   154: areturn
    //   155: astore 6
    //   157: aconst_null
    //   158: astore 5
    //   160: aload 5
    //   162: astore 4
    //   164: aload_0
    //   165: ldc_w 265
    //   168: aload 6
    //   170: invokevirtual 217	com/google/android/gms/analytics/internal/u:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   173: aload 5
    //   175: ifnull -23 -> 152
    //   178: aload 5
    //   180: invokeinterface 113 1 0
    //   185: goto -33 -> 152
    //   188: astore 4
    //   190: aload 5
    //   192: ifnull +10 -> 202
    //   195: aload 5
    //   197: invokeinterface 113 1 0
    //   202: aload 4
    //   204: athrow
    //   205: astore 6
    //   207: aload 4
    //   209: astore 5
    //   211: aload 6
    //   213: astore 4
    //   215: goto -25 -> 190
    //   218: astore 6
    //   220: goto -60 -> 160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	223	0	this	u
    //   0	223	1	paramLong	long
    //   135	2	3	bool	boolean
    //   24	139	4	localObject1	Object
    //   188	20	4	localObject2	Object
    //   213	1	4	localObject3	Object
    //   1	209	5	localObject4	Object
    //   49	26	6	str1	String
    //   155	14	6	localSQLiteException1	SQLiteException
    //   205	7	6	localObject5	Object
    //   218	1	6	localSQLiteException2	SQLiteException
    //   33	120	7	localArrayList	ArrayList
    //   55	22	8	str2	String
    // Exception table:
    //   from	to	target	type
    //   35	83	155	android/database/sqlite/SQLiteException
    //   35	83	188	finally
    //   91	101	205	finally
    //   105	124	205	finally
    //   128	136	205	finally
    //   164	173	205	finally
    //   91	101	218	android/database/sqlite/SQLiteException
    //   105	124	218	android/database/sqlite/SQLiteException
    //   128	136	218	android/database/sqlite/SQLiteException
  }
  
  public final long a(long paramLong, String paramString1, String paramString2)
  {
    w.af(paramString1);
    w.af(paramString2);
    iC();
    q.iK();
    return a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] { String.valueOf(paramLong), paramString1, paramString2 });
  }
  
  public final void b(long paramLong, String paramString)
  {
    w.af(paramString);
    iC();
    q.iK();
    int i = getWritableDatabase().delete("properties", "app_uid=? AND cid<>?", new String[] { String.valueOf(paramLong), paramString });
    if (i > 0) {
      c("Deleted property records", Integer.valueOf(i));
    }
  }
  
  public final void b(s params)
  {
    w.aa(params);
    iC();
    q.iK();
    SQLiteDatabase localSQLiteDatabase = getWritableDatabase();
    Object localObject2 = params.abX;
    w.aa(localObject2);
    Object localObject1 = new Uri.Builder();
    localObject2 = ((Map)localObject2).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
      ((Uri.Builder)localObject1).appendQueryParameter((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    localObject2 = ((Uri.Builder)localObject1).build().getEncodedQuery();
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "";
    }
    localObject2 = new ContentValues();
    ((ContentValues)localObject2).put("app_uid", Long.valueOf(params.adh));
    ((ContentValues)localObject2).put("cid", params.adi);
    ((ContentValues)localObject2).put("tid", params.adj);
    if (params.adk) {}
    for (int i = 1;; i = 0)
    {
      ((ContentValues)localObject2).put("adid", Integer.valueOf(i));
      ((ContentValues)localObject2).put("hits_count", Long.valueOf(params.adl));
      ((ContentValues)localObject2).put("params", (String)localObject1);
      try
      {
        if (localSQLiteDatabase.insertWithOnConflict("properties", null, (ContentValues)localObject2, 5) == -1L) {
          R("Failed to insert/update a property (got -1)");
        }
        return;
      }
      catch (SQLiteException params)
      {
        f("Error storing a property", params);
      }
    }
  }
  
  public final void beginTransaction()
  {
    iC();
    getWritableDatabase().beginTransaction();
  }
  
  public final void close()
  {
    try
    {
      this.ady.close();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      f("Sql error closing database", localSQLiteException);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      f("Error closing database", localIllegalStateException);
    }
  }
  
  public final void e(c paramc)
  {
    w.aa(paramc);
    q.iK();
    iC();
    w.aa(paramc);
    Object localObject1 = new Uri.Builder();
    Object localObject2 = paramc.abX.entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      String str = (String)((Map.Entry)localObject3).getKey();
      if ((!"ht".equals(str)) && (!"qt".equals(str)) && (!"AppUID".equals(str))) {
        ((Uri.Builder)localObject1).appendQueryParameter(str, (String)((Map.Entry)localObject3).getValue());
      }
    }
    localObject1 = ((Uri.Builder)localObject1).build().getEncodedQuery();
    if (localObject1 == null) {
      localObject1 = "";
    }
    while (((String)localObject1).length() > 8192)
    {
      this.ack.iE().a(paramc, "Hit length exceeds the maximum allowed size");
      return;
    }
    int i = ((Integer)aj.aet.get()).intValue();
    long l = iO();
    if (l > i - 1)
    {
      localObject2 = j(l - i + 1L);
      e("Store full, deleting hits to make room, count", Integer.valueOf(((List)localObject2).size()));
      l((List)localObject2);
    }
    localObject2 = getWritableDatabase();
    Object localObject3 = new ContentValues();
    ((ContentValues)localObject3).put("hit_string", (String)localObject1);
    ((ContentValues)localObject3).put("hit_time", Long.valueOf(paramc.aca));
    ((ContentValues)localObject3).put("hit_app_id", Integer.valueOf(paramc.acb));
    if (paramc.acc) {}
    for (localObject1 = ac.jo();; localObject1 = ac.jp())
    {
      ((ContentValues)localObject3).put("hit_url", (String)localObject1);
      try
      {
        l = ((SQLiteDatabase)localObject2).insert("hits2", null, (ContentValues)localObject3);
        if (l != -1L) {
          break;
        }
        R("Failed to insert a hit (got -1)");
        return;
      }
      catch (SQLiteException paramc)
      {
        f("Error storing a hit", paramc);
        return;
      }
    }
    b("Hit saved to database. db-id, hit", Long.valueOf(l), paramc);
  }
  
  public final void endTransaction()
  {
    iC();
    getWritableDatabase().endTransaction();
  }
  
  protected final void hS() {}
  
  public final int iP()
  {
    q.iK();
    iC();
    if (!this.adz.i(86400000L)) {
      return 0;
    }
    this.adz.start();
    N("Deleting stale hits (if any)");
    int i = getWritableDatabase().delete("hits2", "hit_time < ?", new String[] { Long.toString(this.ack.acz.currentTimeMillis() - 2592000000L) });
    c("Deleted stale hits, count", Integer.valueOf(i));
    return i;
  }
  
  public final long iQ()
  {
    q.iK();
    iC();
    return a(adx, null);
  }
  
  /* Error */
  public final List<s> iR()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_0
    //   4: invokevirtual 225	com/google/android/gms/analytics/internal/u:iC	()V
    //   7: invokestatic 222	com/google/android/gms/analytics/internal/q:iK	()V
    //   10: aload_0
    //   11: invokespecial 94	com/google/android/gms/analytics/internal/u:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   14: astore 7
    //   16: aload 6
    //   18: astore 5
    //   20: getstatic 522	com/google/android/gms/analytics/internal/aj:aev	Lcom/google/android/gms/analytics/internal/aj$a;
    //   23: invokevirtual 444	com/google/android/gms/analytics/internal/aj$a:get	()Ljava/lang/Object;
    //   26: checkcast 293	java/lang/Integer
    //   29: invokevirtual 447	java/lang/Integer:intValue	()I
    //   32: istore_1
    //   33: aload 6
    //   35: astore 5
    //   37: aload 7
    //   39: ldc_w 283
    //   42: iconst_5
    //   43: anewarray 37	java/lang/String
    //   46: dup
    //   47: iconst_0
    //   48: ldc_w 356
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: ldc_w 364
    //   57: aastore
    //   58: dup
    //   59: iconst_2
    //   60: ldc_w 373
    //   63: aastore
    //   64: dup
    //   65: iconst_3
    //   66: ldc_w 378
    //   69: aastore
    //   70: dup
    //   71: iconst_4
    //   72: ldc_w 383
    //   75: aastore
    //   76: ldc_w 524
    //   79: iconst_1
    //   80: anewarray 37	java/lang/String
    //   83: dup
    //   84: iconst_0
    //   85: ldc_w 526
    //   88: aastore
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: iload_1
    //   93: invokestatic 529	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   96: invokevirtual 252	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   99: astore 6
    //   101: aload 6
    //   103: astore 5
    //   105: new 239	java/util/ArrayList
    //   108: dup
    //   109: invokespecial 241	java/util/ArrayList:<init>	()V
    //   112: astore 7
    //   114: aload 6
    //   116: astore 5
    //   118: aload 6
    //   120: invokeinterface 106 1 0
    //   125: ifeq +133 -> 258
    //   128: aload 6
    //   130: astore 5
    //   132: aload 6
    //   134: iconst_0
    //   135: invokeinterface 532 2 0
    //   140: astore 8
    //   142: aload 6
    //   144: astore 5
    //   146: aload 6
    //   148: iconst_1
    //   149: invokeinterface 532 2 0
    //   154: astore 9
    //   156: aload 6
    //   158: astore 5
    //   160: aload 6
    //   162: iconst_2
    //   163: invokeinterface 536 2 0
    //   168: ifeq +131 -> 299
    //   171: iconst_1
    //   172: istore_2
    //   173: aload 6
    //   175: astore 5
    //   177: aload 6
    //   179: iconst_3
    //   180: invokeinterface 536 2 0
    //   185: i2l
    //   186: lstore_3
    //   187: aload 6
    //   189: astore 5
    //   191: aload_0
    //   192: aload 6
    //   194: iconst_4
    //   195: invokeinterface 532 2 0
    //   200: invokespecial 538	com/google/android/gms/analytics/internal/u:U	(Ljava/lang/String;)Ljava/util/Map;
    //   203: astore 10
    //   205: aload 6
    //   207: astore 5
    //   209: aload 8
    //   211: invokestatic 134	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   214: ifne +15 -> 229
    //   217: aload 6
    //   219: astore 5
    //   221: aload 9
    //   223: invokestatic 134	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   226: ifeq +78 -> 304
    //   229: aload 6
    //   231: astore 5
    //   233: aload_0
    //   234: ldc_w 540
    //   237: aload 8
    //   239: aload 9
    //   241: invokevirtual 542	com/google/android/gms/analytics/internal/u:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   244: aload 6
    //   246: astore 5
    //   248: aload 6
    //   250: invokeinterface 263 1 0
    //   255: ifne -127 -> 128
    //   258: aload 6
    //   260: astore 5
    //   262: aload 7
    //   264: invokeinterface 162 1 0
    //   269: iload_1
    //   270: if_icmplt +14 -> 284
    //   273: aload 6
    //   275: astore 5
    //   277: aload_0
    //   278: ldc_w 544
    //   281: invokevirtual 547	com/google/android/gms/analytics/internal/u:Q	(Ljava/lang/String;)V
    //   284: aload 6
    //   286: ifnull +10 -> 296
    //   289: aload 6
    //   291: invokeinterface 113 1 0
    //   296: aload 7
    //   298: areturn
    //   299: iconst_0
    //   300: istore_2
    //   301: goto -128 -> 173
    //   304: aload 6
    //   306: astore 5
    //   308: aload 7
    //   310: new 306	com/google/android/gms/analytics/internal/s
    //   313: dup
    //   314: lconst_0
    //   315: aload 8
    //   317: aload 9
    //   319: iload_2
    //   320: lload_3
    //   321: aload 10
    //   323: invokespecial 550	com/google/android/gms/analytics/internal/s:<init>	(JLjava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V
    //   326: invokeinterface 260 2 0
    //   331: pop
    //   332: goto -88 -> 244
    //   335: astore 7
    //   337: aload 6
    //   339: astore 5
    //   341: aload 7
    //   343: astore 6
    //   345: aload_0
    //   346: ldc_w 552
    //   349: aload 6
    //   351: invokevirtual 195	com/google/android/gms/analytics/internal/u:f	(Ljava/lang/String;Ljava/lang/Object;)V
    //   354: aload 6
    //   356: athrow
    //   357: astore 6
    //   359: aload 5
    //   361: ifnull +10 -> 371
    //   364: aload 5
    //   366: invokeinterface 113 1 0
    //   371: aload 6
    //   373: athrow
    //   374: astore 6
    //   376: goto -17 -> 359
    //   379: astore 6
    //   381: aconst_null
    //   382: astore 5
    //   384: goto -39 -> 345
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	this	u
    //   32	239	1	i	int
    //   172	148	2	bool	boolean
    //   186	135	3	l	long
    //   18	365	5	localObject1	Object
    //   1	354	6	localObject2	Object
    //   357	15	6	localObject3	Object
    //   374	1	6	localObject4	Object
    //   379	1	6	localSQLiteException1	SQLiteException
    //   14	295	7	localObject5	Object
    //   335	7	7	localSQLiteException2	SQLiteException
    //   140	176	8	str1	String
    //   154	164	9	str2	String
    //   203	119	10	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   105	114	335	android/database/sqlite/SQLiteException
    //   118	128	335	android/database/sqlite/SQLiteException
    //   132	142	335	android/database/sqlite/SQLiteException
    //   146	156	335	android/database/sqlite/SQLiteException
    //   160	171	335	android/database/sqlite/SQLiteException
    //   177	187	335	android/database/sqlite/SQLiteException
    //   191	205	335	android/database/sqlite/SQLiteException
    //   209	217	335	android/database/sqlite/SQLiteException
    //   221	229	335	android/database/sqlite/SQLiteException
    //   233	244	335	android/database/sqlite/SQLiteException
    //   248	258	335	android/database/sqlite/SQLiteException
    //   262	273	335	android/database/sqlite/SQLiteException
    //   277	284	335	android/database/sqlite/SQLiteException
    //   308	332	335	android/database/sqlite/SQLiteException
    //   345	357	357	finally
    //   20	33	374	finally
    //   37	101	374	finally
    //   105	114	374	finally
    //   118	128	374	finally
    //   132	142	374	finally
    //   146	156	374	finally
    //   160	171	374	finally
    //   177	187	374	finally
    //   191	205	374	finally
    //   209	217	374	finally
    //   221	229	374	finally
    //   233	244	374	finally
    //   248	258	374	finally
    //   262	273	374	finally
    //   277	284	374	finally
    //   308	332	374	finally
    //   20	33	379	android/database/sqlite/SQLiteException
    //   37	101	379	android/database/sqlite/SQLiteException
  }
  
  public final String iS()
  {
    if (!com.google.android.gms.common.internal.f.akn) {
      return "google_analytics_v4.db";
    }
    if (this.ack.acS.jh()) {
      return "google_analytics_v4.db";
    }
    return "google_analytics2_v4.db";
  }
  
  final boolean isEmpty()
  {
    return iO() == 0L;
  }
  
  public final List<c> k(long paramLong)
  {
    boolean bool = true;
    Cursor localCursor = null;
    if (paramLong >= 0L) {}
    for (;;)
    {
      w.af(bool);
      q.iK();
      iC();
      Object localObject5 = getWritableDatabase();
      localObject1 = localCursor;
      for (;;)
      {
        try
        {
          str1 = String.format("%s ASC", new Object[] { "hit_id" });
          localObject1 = localCursor;
          str2 = Long.toString(paramLong);
          localObject1 = localCursor;
          localCursor = ((SQLiteDatabase)localObject5).query("hits2", new String[] { "hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id" }, null, null, null, null, str1, str2);
          localObject1 = localCursor;
        }
        catch (SQLiteException localSQLiteException1)
        {
          String str1;
          String str2;
          localObject1 = null;
          try
          {
            f("Error loading hits from the database", localSQLiteException1);
            throw localSQLiteException1;
          }
          finally
          {
            if (localObject1 != null) {
              ((Cursor)localObject1).close();
            }
          }
        }
        finally
        {
          continue;
        }
        try
        {
          localObject5 = new ArrayList();
          localObject1 = localCursor;
          if (localCursor.moveToFirst())
          {
            localObject1 = localCursor;
            paramLong = localCursor.getLong(0);
            localObject1 = localCursor;
            long l = localCursor.getLong(1);
            localObject1 = localCursor;
            str1 = localCursor.getString(2);
            localObject1 = localCursor;
            str2 = localCursor.getString(3);
            localObject1 = localCursor;
            int i = localCursor.getInt(4);
            localObject1 = localCursor;
            ((List)localObject5).add(new c(this, T(str1), l, k.M(str2), paramLong, i));
            localObject1 = localCursor;
            bool = localCursor.moveToNext();
            if (bool) {
              continue;
            }
          }
          if (localCursor != null) {
            localCursor.close();
          }
          return (List<c>)localObject5;
        }
        catch (SQLiteException localSQLiteException2)
        {
          localObject1 = localObject3;
          Object localObject4 = localSQLiteException2;
        }
      }
      bool = false;
    }
  }
  
  public final void l(long paramLong)
  {
    q.iK();
    iC();
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(Long.valueOf(paramLong));
    c("Deleting hit, id", Long.valueOf(paramLong));
    l(localArrayList);
  }
  
  public final void l(List<Long> paramList)
  {
    w.aa(paramList);
    q.iK();
    iC();
    if (paramList.isEmpty()) {}
    for (;;)
    {
      return;
      Object localObject1 = new StringBuilder("hit_id");
      ((StringBuilder)localObject1).append(" in (");
      int i = 0;
      Object localObject2;
      while (i < paramList.size())
      {
        localObject2 = (Long)paramList.get(i);
        if ((localObject2 == null) || (((Long)localObject2).longValue() == 0L)) {
          throw new SQLiteException("Invalid hit id");
        }
        if (i > 0) {
          ((StringBuilder)localObject1).append(",");
        }
        ((StringBuilder)localObject1).append(localObject2);
        i += 1;
      }
      ((StringBuilder)localObject1).append(")");
      localObject1 = ((StringBuilder)localObject1).toString();
      try
      {
        localObject2 = getWritableDatabase();
        c("Deleting dispatched hits. count", Integer.valueOf(paramList.size()));
        i = ((SQLiteDatabase)localObject2).delete("hits2", (String)localObject1, null);
        if (i == paramList.size()) {
          continue;
        }
        a(5, "Deleted fewer hits then expected", Integer.valueOf(paramList.size()), Integer.valueOf(i), localObject1);
        return;
      }
      catch (SQLiteException paramList)
      {
        f("Error deleting hits", paramList);
        throw paramList;
      }
    }
  }
  
  public final void setTransactionSuccessful()
  {
    iC();
    getWritableDatabase().setTransactionSuccessful();
  }
  
  final class a
    extends SQLiteOpenHelper
  {
    a(Context paramContext, String paramString)
    {
      super(paramString, null, 1);
    }
    
    /* Error */
    private boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: aload_1
      //   4: ldc 22
      //   6: iconst_1
      //   7: anewarray 24	java/lang/String
      //   10: dup
      //   11: iconst_0
      //   12: ldc 26
      //   14: aastore
      //   15: ldc 28
      //   17: iconst_1
      //   18: anewarray 24	java/lang/String
      //   21: dup
      //   22: iconst_0
      //   23: aload_2
      //   24: aastore
      //   25: aconst_null
      //   26: aconst_null
      //   27: aconst_null
      //   28: invokevirtual 34	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   31: astore_1
      //   32: aload_1
      //   33: astore 4
      //   35: aload 4
      //   37: astore_1
      //   38: aload 4
      //   40: invokeinterface 40 1 0
      //   45: istore_3
      //   46: aload 4
      //   48: ifnull +10 -> 58
      //   51: aload 4
      //   53: invokeinterface 44 1 0
      //   58: iload_3
      //   59: ireturn
      //   60: astore 5
      //   62: aconst_null
      //   63: astore 4
      //   65: aload 4
      //   67: astore_1
      //   68: aload_0
      //   69: getfield 13	com/google/android/gms/analytics/internal/u$a:adB	Lcom/google/android/gms/analytics/internal/u;
      //   72: ldc 46
      //   74: aload_2
      //   75: aload 5
      //   77: invokevirtual 50	com/google/android/gms/analytics/internal/u:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
      //   80: aload 4
      //   82: ifnull +10 -> 92
      //   85: aload 4
      //   87: invokeinterface 44 1 0
      //   92: iconst_0
      //   93: ireturn
      //   94: astore_1
      //   95: aload 4
      //   97: astore_2
      //   98: aload_2
      //   99: ifnull +9 -> 108
      //   102: aload_2
      //   103: invokeinterface 44 1 0
      //   108: aload_1
      //   109: athrow
      //   110: astore 4
      //   112: aload_1
      //   113: astore_2
      //   114: aload 4
      //   116: astore_1
      //   117: goto -19 -> 98
      //   120: astore 5
      //   122: goto -57 -> 65
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	125	0	this	a
      //   0	125	1	paramSQLiteDatabase	SQLiteDatabase
      //   0	125	2	paramString	String
      //   45	14	3	bool	boolean
      //   1	95	4	localSQLiteDatabase	SQLiteDatabase
      //   110	5	4	localObject	Object
      //   60	16	5	localSQLiteException1	SQLiteException
      //   120	1	5	localSQLiteException2	SQLiteException
      // Exception table:
      //   from	to	target	type
      //   3	32	60	android/database/sqlite/SQLiteException
      //   3	32	94	finally
      //   38	46	110	finally
      //   68	80	110	finally
      //   38	46	120	android/database/sqlite/SQLiteException
    }
    
    private static Set<String> b(SQLiteDatabase paramSQLiteDatabase, String paramString)
    {
      HashSet localHashSet = new HashSet();
      paramSQLiteDatabase = paramSQLiteDatabase.rawQuery("SELECT * FROM " + paramString + " LIMIT 0", null);
      try
      {
        paramString = paramSQLiteDatabase.getColumnNames();
        int i = 0;
        while (i < paramString.length)
        {
          localHashSet.add(paramString[i]);
          i += 1;
        }
        return localHashSet;
      }
      finally
      {
        paramSQLiteDatabase.close();
      }
    }
    
    private static void b(SQLiteDatabase paramSQLiteDatabase)
    {
      int i = 0;
      paramSQLiteDatabase = b(paramSQLiteDatabase, "properties");
      while (i < 6)
      {
        String str = new String[] { "app_uid", "cid", "tid", "params", "adid", "hits_count" }[i];
        if (!paramSQLiteDatabase.remove(str)) {
          throw new SQLiteException("Database properties is missing required column: " + str);
        }
        i += 1;
      }
      if (!paramSQLiteDatabase.isEmpty()) {
        throw new SQLiteException("Database properties table has extra columns");
      }
    }
    
    public final SQLiteDatabase getWritableDatabase()
    {
      if (!u.this.adA.i(3600000L)) {
        throw new SQLiteException("Database open failed");
      }
      try
      {
        SQLiteDatabase localSQLiteDatabase = super.getWritableDatabase();
        return localSQLiteDatabase;
      }
      catch (SQLiteException localSQLiteException1)
      {
        u.this.adA.start();
        u.this.R("Opening the database failed, dropping the table and recreating it");
        Object localObject = u.this.iS();
        u.this.ack.mContext.getDatabasePath((String)localObject).delete();
        try
        {
          localObject = super.getWritableDatabase();
          u.this.adA.acA = 0L;
          return (SQLiteDatabase)localObject;
        }
        catch (SQLiteException localSQLiteException2)
        {
          u.this.f("Failed to open freshly created database", localSQLiteException2);
          throw localSQLiteException2;
        }
      }
    }
    
    public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      paramSQLiteDatabase = paramSQLiteDatabase.getPath();
      if (ai.version() >= 9)
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
      int j = 1;
      Object localObject;
      if (Build.VERSION.SDK_INT < 15) {
        localObject = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
      }
      for (;;)
      {
        try
        {
          ((Cursor)localObject).moveToFirst();
          ((Cursor)localObject).close();
          if (!a(paramSQLiteDatabase, "hits2"))
          {
            paramSQLiteDatabase.execSQL(u.adw);
            if (a(paramSQLiteDatabase, "properties")) {
              break;
            }
            paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
          }
        }
        finally
        {
          ((Cursor)localObject).close();
        }
        localObject = b(paramSQLiteDatabase, "hits2");
        int i = 0;
        while (i < 4)
        {
          String str = new String[] { "hit_id", "hit_string", "hit_time", "hit_url" }[i];
          if (!((Set)localObject).remove(str)) {
            throw new SQLiteException("Database hits2 is missing required column: " + str);
          }
          i += 1;
        }
        if (!((Set)localObject).remove("hit_app_id")) {}
        for (i = j; !((Set)localObject).isEmpty(); i = 0) {
          throw new SQLiteException("Database hits2 has extra columns");
        }
        if (i != 0) {
          paramSQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
        }
      }
      b(paramSQLiteDatabase);
    }
    
    public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */