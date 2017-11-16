package com.tencent.wcdb;

import android.util.Pair;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteTrace;
import com.tencent.wcdb.support.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class DefaultDatabaseErrorHandler
  implements DatabaseErrorHandler
{
  private static final String[] SUFFIX_TO_BACKUP = { "", "-journal", "-wal", ".sm", ".bak", "-vfslog", "-vfslo1" };
  private static final String TAG = "WCDB.DefaultDatabaseErrorHandler";
  private final boolean mNoCorruptionBackup;
  
  public DefaultDatabaseErrorHandler()
  {
    this.mNoCorruptionBackup = false;
  }
  
  public DefaultDatabaseErrorHandler(boolean paramBoolean)
  {
    this.mNoCorruptionBackup = paramBoolean;
  }
  
  private void deleteDatabaseFile(String paramString)
  {
    int j = 0;
    int i = 0;
    if ((paramString.equalsIgnoreCase(":memory:")) || (paramString.trim().length() == 0)) {}
    for (;;)
    {
      return;
      Log.e("WCDB.DefaultDatabaseErrorHandler", "Remove database file: " + paramString);
      Object localObject1;
      Object localObject2;
      if (!this.mNoCorruptionBackup)
      {
        localObject1 = new File(paramString);
        localObject2 = new File(((File)localObject1).getParentFile(), "corrupted");
        if (!((File)localObject2).mkdirs()) {
          Log.e("WCDB.DefaultDatabaseErrorHandler", "Could not create directory for corrupted database. Corruption backup may be unavailable.");
        }
        localObject1 = ((File)localObject2).getPath() + "/" + ((File)localObject1).getName();
        localObject2 = SUFFIX_TO_BACKUP;
        j = localObject2.length;
        while (i < j)
        {
          String str = localObject2[i];
          moveOrDeleteFile(paramString + str, (String)localObject1 + str);
          i += 1;
        }
      }
      else
      {
        localObject1 = SUFFIX_TO_BACKUP;
        int k = localObject1.length;
        i = j;
        while (i < k)
        {
          localObject2 = localObject1[i];
          deleteFile(paramString + (String)localObject2);
          i += 1;
        }
      }
    }
  }
  
  private static boolean deleteFile(String paramString)
  {
    return new File(paramString).delete();
  }
  
  private static boolean moveOrDeleteFile(String paramString1, String paramString2)
  {
    paramString1 = new File(paramString1);
    boolean bool = paramString1.renameTo(new File(paramString2));
    if (!bool) {
      paramString1.delete();
    }
    return bool;
  }
  
  public final void onCorruption(SQLiteDatabase paramSQLiteDatabase)
  {
    Log.e("WCDB.DefaultDatabaseErrorHandler", "Corruption reported by sqlite on database: " + paramSQLiteDatabase.getPath());
    if (!paramSQLiteDatabase.isOpen()) {
      deleteDatabaseFile(paramSQLiteDatabase.getPath());
    }
    for (;;)
    {
      return;
      Object localObject1 = null;
      try
      {
        localObject2 = paramSQLiteDatabase.getAttachedDbs();
        localObject1 = localObject2;
      }
      catch (SQLiteException localSQLiteException2)
      {
        Object localObject2;
        for (;;) {}
      }
      localObject2 = paramSQLiteDatabase.getTraceCallback();
      if (localObject2 != null) {
        ((SQLiteTrace)localObject2).onDatabaseCorrupted(paramSQLiteDatabase);
      }
      try
      {
        paramSQLiteDatabase.close();
        if (localObject1 != null)
        {
          paramSQLiteDatabase = ((List)localObject1).iterator();
          while (paramSQLiteDatabase.hasNext()) {
            deleteDatabaseFile((String)((Pair)paramSQLiteDatabase.next()).second);
          }
        }
        deleteDatabaseFile(paramSQLiteDatabase.getPath());
        return;
      }
      catch (SQLiteException localSQLiteException1)
      {
        localSQLiteException1 = localSQLiteException1;
        if (localObject1 != null)
        {
          paramSQLiteDatabase = ((List)localObject1).iterator();
          while (paramSQLiteDatabase.hasNext()) {
            deleteDatabaseFile((String)((Pair)paramSQLiteDatabase.next()).second);
          }
        }
        deleteDatabaseFile(paramSQLiteDatabase.getPath());
        return;
      }
      finally
      {
        localObject3 = finally;
        if (localObject1 != null)
        {
          paramSQLiteDatabase = ((List)localObject1).iterator();
          while (paramSQLiteDatabase.hasNext()) {
            deleteDatabaseFile((String)((Pair)paramSQLiteDatabase.next()).second);
          }
        }
        deleteDatabaseFile(paramSQLiteDatabase.getPath());
        throw ((Throwable)localObject3);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\DefaultDatabaseErrorHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */