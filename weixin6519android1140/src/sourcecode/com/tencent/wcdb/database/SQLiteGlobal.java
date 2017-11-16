package com.tencent.wcdb.database;

import android.os.StatFs;
import java.lang.reflect.Method;

public final class SQLiteGlobal
{
  private static final String TAG = "WCDB.SQLiteGlobal";
  public static final String defaultJournalMode = "PERSIST";
  public static final int defaultPageSize;
  public static final String defaultSyncMode = "FULL";
  public static final int journalSizeLimit = 524288;
  public static final int walAutoCheckpoint = 100;
  public static final int walConnectionPoolSize = 4;
  public static final String walSyncMode = "FULL";
  
  static
  {
    try
    {
      defaultPageSize = ((Integer)Class.forName("android.os.SystemProperties").getMethod("getInt", new Class[] { String.class, Integer.TYPE }).invoke(null, new Object[] { "debug.sqlite.pagesize", Integer.valueOf(new StatFs("/data").getBlockSize()) })).intValue();
      return;
    }
    catch (Exception localException)
    {
      throw new NoClassDefFoundError();
    }
  }
  
  private static native int nativeReleaseMemory();
  
  static native void nativeTestJNIRegistration();
  
  public static int releaseMemory()
  {
    return nativeReleaseMemory();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteGlobal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */