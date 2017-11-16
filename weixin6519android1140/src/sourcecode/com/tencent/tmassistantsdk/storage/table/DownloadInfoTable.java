package com.tencent.tmassistantsdk.storage.table;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask;
import com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2;
import com.tencent.tmassistantsdk.storage.helper.SqliteHelper;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;

public class DownloadInfoTable
  implements ITableBase
{
  public static final String CREATE_TABLE_SQL = "CREATE TABLE if not exists downloadInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, taskId INTEGER , uId TEXT, taskUrl TEXT, secondaryUrl TEXT, finalUrl TEXT, requestFileSize INTEGER, fileName TEXT, contentType TEXT, redirectCnt INTEGER, retryCnt INTEGER, totalBytes INTEGER,status INTEGER,receivedBytes INTEGER,priority INTEGER,netType TEXT,downloadFailedErrCode INTEGER,downloadFailedTime INTEGER,headerParams TEXT);";
  public static final String QUERY_ALL = "select * from downloadInfo";
  public static final String QUERY_DOWNLOADINFO_URL = "select * from downloadInfo where taskUrl = ?";
  public static final String QUERY_UNFINISHED_TASK = "select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)";
  public static final String TABLE_NAME = "downloadInfo";
  private static final String TAG = "DownloadInfoTable";
  
  public static void add(DownloadInfo paramDownloadInfo)
  {
    if (paramDownloadInfo != null) {}
    try
    {
      SQLiteDatabase localSQLiteDatabase = AstSDKDBHelper_V2.getInstance().getWritableDatabase();
      if (update(paramDownloadInfo, localSQLiteDatabase) <= 0)
      {
        ContentValues localContentValues = new ContentValues();
        DownloadInfo.writeToContentValues(localContentValues, paramDownloadInfo);
        localSQLiteDatabase.insert("downloadInfo", null, localContentValues);
      }
      return;
    }
    catch (Exception paramDownloadInfo)
    {
      w.printErrStackTrace("DownloadInfoTable", paramDownloadInfo, "", new Object[0]);
    }
  }
  
  public static void del(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {}
    try
    {
      AstSDKDBHelper_V2.getInstance().getWritableDatabase().delete("downloadInfo", "taskUrl = ?", new String[] { paramString });
      return;
    }
    catch (Exception paramString)
    {
      w.printErrStackTrace("DownloadInfoTable", paramString, "", new Object[0]);
    }
  }
  
  public static ArrayList<DownloadInfo> load()
  {
    localObject3 = null;
    localObject1 = null;
    localArrayList = new ArrayList();
    Object localObject4 = AstSDKDBHelper_V2.getInstance().getReadableDatabase();
    try
    {
      localObject4 = ((SQLiteDatabase)localObject4).rawQuery("select * from downloadInfo", null);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(DownloadInfo.readFromCursor((Cursor)localObject4));
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      w.printErrStackTrace("DownloadInfoTable", localException, "", new Object[0]);
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label126;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  /* Error */
  public static DownloadInfo query(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_3
    //   3: astore_1
    //   4: aload_0
    //   5: ifnull +68 -> 73
    //   8: aload_3
    //   9: astore_1
    //   10: aload_0
    //   11: invokevirtual 81	java/lang/String:length	()I
    //   14: ifle +59 -> 73
    //   17: invokestatic 40	com/tencent/tmassistantsdk/storage/helper/AstSDKDBHelper_V2:getInstance	()Lcom/tencent/tmassistantsdk/storage/helper/SqliteHelper;
    //   20: invokevirtual 95	com/tencent/tmassistantsdk/storage/helper/SqliteHelper:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   23: ldc 16
    //   25: iconst_1
    //   26: anewarray 77	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: aload_0
    //   32: aastore
    //   33: invokevirtual 99	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   36: astore_0
    //   37: aload_0
    //   38: ifnull +37 -> 75
    //   41: aload_0
    //   42: astore_1
    //   43: aload_0
    //   44: invokeinterface 105 1 0
    //   49: ifeq +26 -> 75
    //   52: aload_0
    //   53: astore_1
    //   54: aload_0
    //   55: invokestatic 109	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:readFromCursor	(Landroid/database/Cursor;)Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;
    //   58: astore_2
    //   59: aload_2
    //   60: astore_1
    //   61: aload_0
    //   62: ifnull +11 -> 73
    //   65: aload_0
    //   66: invokeinterface 118 1 0
    //   71: aload_2
    //   72: astore_1
    //   73: aload_1
    //   74: areturn
    //   75: aload_3
    //   76: astore_1
    //   77: aload_0
    //   78: ifnull -5 -> 73
    //   81: aload_0
    //   82: invokeinterface 118 1 0
    //   87: aconst_null
    //   88: areturn
    //   89: astore_2
    //   90: aconst_null
    //   91: astore_0
    //   92: aload_0
    //   93: astore_1
    //   94: ldc 25
    //   96: aload_2
    //   97: ldc 67
    //   99: iconst_0
    //   100: anewarray 4	java/lang/Object
    //   103: invokestatic 73	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: aload_3
    //   107: astore_1
    //   108: aload_0
    //   109: ifnull -36 -> 73
    //   112: aload_0
    //   113: invokeinterface 118 1 0
    //   118: aconst_null
    //   119: areturn
    //   120: astore_0
    //   121: aconst_null
    //   122: astore_1
    //   123: aload_1
    //   124: ifnull +9 -> 133
    //   127: aload_1
    //   128: invokeinterface 118 1 0
    //   133: aload_0
    //   134: athrow
    //   135: astore_0
    //   136: goto -13 -> 123
    //   139: astore_2
    //   140: goto -48 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	paramString	String
    //   3	125	1	localObject1	Object
    //   58	14	2	localDownloadInfo	DownloadInfo
    //   89	8	2	localException1	Exception
    //   139	1	2	localException2	Exception
    //   1	106	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   17	37	89	java/lang/Exception
    //   17	37	120	finally
    //   43	52	135	finally
    //   54	59	135	finally
    //   94	106	135	finally
    //   43	52	139	java/lang/Exception
    //   54	59	139	java/lang/Exception
  }
  
  public static ArrayList<ServiceDownloadTask> query()
  {
    localObject3 = null;
    localObject1 = null;
    localArrayList = new ArrayList();
    Object localObject4 = AstSDKDBHelper_V2.getInstance().getReadableDatabase();
    try
    {
      localObject4 = ((SQLiteDatabase)localObject4).rawQuery("select a.taskUrl,a.status,b.clientId from downloadInfo as a left outer join clientinfo as b on a.taskUrl = b.taskUrl where b.clientId is not null and (a.status = 2 or a.status = 1)", null);
      if (localObject4 != null)
      {
        localObject1 = localObject4;
        localObject3 = localObject4;
        if (((Cursor)localObject4).moveToFirst())
        {
          boolean bool;
          do
          {
            localObject1 = localObject4;
            localObject3 = localObject4;
            Object localObject5 = ((Cursor)localObject4).getString(((Cursor)localObject4).getColumnIndex("clientId"));
            localObject1 = localObject4;
            localObject3 = localObject4;
            String str = ((Cursor)localObject4).getString(((Cursor)localObject4).getColumnIndex("taskUrl"));
            localObject1 = localObject4;
            localObject3 = localObject4;
            int i = ((Cursor)localObject4).getInt(((Cursor)localObject4).getColumnIndex("status"));
            localObject1 = localObject4;
            localObject3 = localObject4;
            localObject5 = new ServiceDownloadTask((String)localObject5, str);
            localObject1 = localObject4;
            localObject3 = localObject4;
            ((ServiceDownloadTask)localObject5).mState = i;
            localObject1 = localObject4;
            localObject3 = localObject4;
            localArrayList.add(localObject5);
            localObject1 = localObject4;
            localObject3 = localObject4;
            bool = ((Cursor)localObject4).moveToNext();
          } while (bool);
        }
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      w.printErrStackTrace("DownloadInfoTable", localException, "", new Object[0]);
      return localArrayList;
    }
    finally
    {
      if (localObject3 == null) {
        break label242;
      }
      ((Cursor)localObject3).close();
    }
    return localArrayList;
  }
  
  /* Error */
  public static void save(ArrayList<DownloadInfo> paramArrayList)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +88 -> 89
    //   4: invokestatic 40	com/tencent/tmassistantsdk/storage/helper/AstSDKDBHelper_V2:getInstance	()Lcom/tencent/tmassistantsdk/storage/helper/SqliteHelper;
    //   7: invokevirtual 46	com/tencent/tmassistantsdk/storage/helper/SqliteHelper:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore_1
    //   11: aload_1
    //   12: invokevirtual 155	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   15: aload_0
    //   16: invokevirtual 159	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   19: astore_0
    //   20: aload_0
    //   21: invokeinterface 164 1 0
    //   26: ifeq +64 -> 90
    //   29: aload_0
    //   30: invokeinterface 168 1 0
    //   35: checkcast 55	com/tencent/tmassistantsdk/downloadservice/DownloadInfo
    //   38: astore_2
    //   39: aload_2
    //   40: aload_1
    //   41: invokestatic 50	com/tencent/tmassistantsdk/storage/table/DownloadInfoTable:update	(Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;Landroid/database/sqlite/SQLiteDatabase;)I
    //   44: ifgt -24 -> 20
    //   47: new 52	android/content/ContentValues
    //   50: dup
    //   51: invokespecial 53	android/content/ContentValues:<init>	()V
    //   54: astore_3
    //   55: aload_3
    //   56: aload_2
    //   57: invokestatic 59	com/tencent/tmassistantsdk/downloadservice/DownloadInfo:writeToContentValues	(Landroid/content/ContentValues;Lcom/tencent/tmassistantsdk/downloadservice/DownloadInfo;)V
    //   60: aload_1
    //   61: ldc 22
    //   63: aconst_null
    //   64: aload_3
    //   65: invokevirtual 65	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   68: pop2
    //   69: goto -49 -> 20
    //   72: astore_0
    //   73: ldc 25
    //   75: aload_0
    //   76: ldc 67
    //   78: iconst_0
    //   79: anewarray 4	java/lang/Object
    //   82: invokestatic 73	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: aload_1
    //   86: invokevirtual 171	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   89: return
    //   90: aload_1
    //   91: invokevirtual 174	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   94: aload_1
    //   95: invokevirtual 171	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   98: return
    //   99: astore_0
    //   100: aload_1
    //   101: invokevirtual 171	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   104: aload_0
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	paramArrayList	ArrayList<DownloadInfo>
    //   10	91	1	localSQLiteDatabase	SQLiteDatabase
    //   38	19	2	localDownloadInfo	DownloadInfo
    //   54	11	3	localContentValues	ContentValues
    // Exception table:
    //   from	to	target	type
    //   11	20	72	java/lang/Exception
    //   20	69	72	java/lang/Exception
    //   90	94	72	java/lang/Exception
    //   11	20	99	finally
    //   20	69	99	finally
    //   73	85	99	finally
    //   90	94	99	finally
  }
  
  private static int update(DownloadInfo paramDownloadInfo, SQLiteDatabase paramSQLiteDatabase)
  {
    int i;
    if (paramDownloadInfo == null) {
      i = -1;
    }
    for (;;)
    {
      return i;
      try
      {
        ContentValues localContentValues = new ContentValues();
        DownloadInfo.writeToContentValues(localContentValues, paramDownloadInfo);
        int j = paramSQLiteDatabase.update("downloadInfo", localContentValues, "taskUrl = ?", new String[] { paramDownloadInfo.mURL });
        i = j;
        if (j <= 0) {
          return 0;
        }
      }
      catch (Exception paramDownloadInfo)
      {
        w.printErrStackTrace("DownloadInfoTable", paramDownloadInfo, "", new Object[0]);
      }
    }
    return -2;
  }
  
  public String createTableSQL()
  {
    return "CREATE TABLE if not exists downloadInfo( _id INTEGER PRIMARY KEY AUTOINCREMENT, taskId INTEGER , uId TEXT, taskUrl TEXT, secondaryUrl TEXT, finalUrl TEXT, requestFileSize INTEGER, fileName TEXT, contentType TEXT, redirectCnt INTEGER, retryCnt INTEGER, totalBytes INTEGER,status INTEGER,receivedBytes INTEGER,priority INTEGER,netType TEXT,downloadFailedErrCode INTEGER,downloadFailedTime INTEGER,headerParams TEXT);";
  }
  
  public void dataMovement(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2)
  {
    localObject = null;
    localSQLiteDatabase = null;
    if ((paramSQLiteDatabase2 != null) && (paramSQLiteDatabase1 != null)) {
      paramSQLiteDatabase2.beginTransaction();
    }
    try
    {
      paramSQLiteDatabase1 = paramSQLiteDatabase1.rawQuery("select * from downloadInfo", null);
      if (paramSQLiteDatabase1 != null)
      {
        localSQLiteDatabase = paramSQLiteDatabase1;
        localObject = paramSQLiteDatabase1;
        if (paramSQLiteDatabase1.moveToFirst())
        {
          localSQLiteDatabase = paramSQLiteDatabase1;
          localObject = paramSQLiteDatabase1;
          TMLog.i("downloadInfo", "start move data!");
          boolean bool;
          do
          {
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            ContentValues localContentValues = new ContentValues();
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            DownloadInfo.writeToContentValues(localContentValues, DownloadInfo.readFromSimpleCursor(paramSQLiteDatabase1));
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            paramSQLiteDatabase2.insert("downloadInfo", null, localContentValues);
            localSQLiteDatabase = paramSQLiteDatabase1;
            localObject = paramSQLiteDatabase1;
            bool = paramSQLiteDatabase1.moveToNext();
          } while (bool);
        }
      }
      if (paramSQLiteDatabase1 != null) {
        paramSQLiteDatabase1.close();
      }
    }
    catch (Exception paramSQLiteDatabase1)
    {
      for (;;)
      {
        localObject = localSQLiteDatabase;
        w.printErrStackTrace("DownloadInfoTable", paramSQLiteDatabase1, "", new Object[0]);
        localObject = localSQLiteDatabase;
        TMLog.i("downloadInfo", "move data exception!");
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
      }
    }
    finally
    {
      if (localObject == null) {
        break label196;
      }
      ((Cursor)localObject).close();
    }
    paramSQLiteDatabase2.setTransactionSuccessful();
    paramSQLiteDatabase2.endTransaction();
  }
  
  public String[] getAlterSQL(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 1) && (paramInt2 == 2)) {
      return new String[] { "alter table downloadInfo add column headerParams TEXT;" };
    }
    return new String[] { "alter table downloadInfo add column netType TEXT;", "alter table downloadInfo add column downloadFailedErrCode INTEGER;", "alter table downloadInfo add column downloadFailedTime INTEGER;" };
  }
  
  public SqliteHelper getHelper()
  {
    return AstSDKDBHelper_V2.getInstance();
  }
  
  public String tableName()
  {
    return "downloadInfo";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\tmassistantsdk\storage\table\DownloadInfoTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */