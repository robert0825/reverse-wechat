package com.tencent.wcdb.database;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashSet;

public class SQLiteAsyncCheckpointer
  implements Handler.Callback, SQLiteCheckpointListener
{
  private static final int DEFAULT_BLOCKING_THRESHOLD = 100;
  private static final int DEFAULT_THRESHOLD = 0;
  private static HandlerThread gDefaultThread;
  private static final Object gDefaultThreadLock = new Object();
  private static int gDefaultThreadRefCount = 0;
  private int mBlockingThreshold;
  private Handler mHandler;
  private int mLastSyncMode;
  private Looper mLooper;
  private final HashSet<Pair<SQLiteDatabase, String>> mPendingCheckpoints;
  private int mThreshold;
  private boolean mUseDefaultLooper;
  
  public SQLiteAsyncCheckpointer()
  {
    this(null, 0, 100);
  }
  
  public SQLiteAsyncCheckpointer(Looper paramLooper)
  {
    this(paramLooper, 0, 100);
  }
  
  public SQLiteAsyncCheckpointer(Looper paramLooper, int paramInt1, int paramInt2)
  {
    this.mLooper = paramLooper;
    this.mThreshold = paramInt1;
    this.mBlockingThreshold = paramInt2;
    this.mPendingCheckpoints = new HashSet();
  }
  
  private static Looper acquireDefaultLooper()
  {
    synchronized (gDefaultThreadLock)
    {
      int i = gDefaultThreadRefCount;
      gDefaultThreadRefCount = i + 1;
      if (i != 0) {
        break label60;
      }
      if (gDefaultThread != null) {
        throw new AssertionError("gDefaultThread == null");
      }
    }
    Object localObject3 = new HandlerThread("WCDB.AsyncCheckpointer", 4);
    gDefaultThread = (HandlerThread)localObject3;
    ((HandlerThread)localObject3).start();
    label60:
    localObject3 = gDefaultThread.getLooper();
    return (Looper)localObject3;
  }
  
  private static void releaseDefaultLooper()
  {
    synchronized (gDefaultThreadLock)
    {
      int i = gDefaultThreadRefCount - 1;
      gDefaultThreadRefCount = i;
      if (i > 0) {
        break label52;
      }
      if (gDefaultThreadRefCount < 0) {
        throw new AssertionError("gDefaultThreadRefCount == 0");
      }
    }
    gDefaultThread.quit();
    gDefaultThread = null;
    label52:
  }
  
  public boolean handleMessage(Message arg1)
  {
    Pair localPair = (Pair)???.obj;
    SQLiteDatabase localSQLiteDatabase = (SQLiteDatabase)localPair.first;
    String str = (String)localPair.second;
    boolean bool;
    if (???.arg1 != 0) {
      bool = true;
    }
    try
    {
      long l = SystemClock.uptimeMillis();
      ??? = localSQLiteDatabase.walCheckpoint(str, bool);
      onCheckpointResult(localSQLiteDatabase, ((Integer)???.first).intValue(), ((Integer)???.second).intValue(), SystemClock.uptimeMillis() - l);
      localSQLiteDatabase.releaseReference();
      synchronized (this.mPendingCheckpoints)
      {
        if (this.mPendingCheckpoints.remove(localPair)) {
          break label136;
        }
        throw new AssertionError("mPendingCheckpoints.remove(p)");
      }
      bool = false;
      label136:
      return true;
    }
    finally
    {
      localSQLiteDatabase.releaseReference();
    }
  }
  
  public void onAttach(SQLiteDatabase paramSQLiteDatabase)
  {
    if (this.mLooper == null)
    {
      this.mLooper = acquireDefaultLooper();
      this.mUseDefaultLooper = true;
    }
    this.mHandler = new Handler(this.mLooper, this);
    this.mLastSyncMode = paramSQLiteDatabase.getSynchronousMode();
    paramSQLiteDatabase.setSynchronousMode(1);
  }
  
  public void onCheckpointResult(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2, long paramLong) {}
  
  public void onDetach(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.setSynchronousMode(this.mLastSyncMode);
    this.mHandler = null;
    if (this.mUseDefaultLooper)
    {
      this.mLooper = null;
      releaseDefaultLooper();
      this.mUseDefaultLooper = false;
    }
  }
  
  public void onWALCommit(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt)
  {
    int i = 1;
    if (paramInt < this.mThreshold) {
      return;
    }
    if (paramInt >= this.mBlockingThreshold)
    {
      paramInt = 1;
      paramString = new Pair(paramSQLiteDatabase, paramString);
    }
    for (;;)
    {
      synchronized (this.mPendingCheckpoints)
      {
        boolean bool = this.mPendingCheckpoints.add(paramString);
        if (!bool) {
          break;
        }
        paramSQLiteDatabase.acquireReference();
        paramSQLiteDatabase = this.mHandler;
        if (paramInt != 0)
        {
          paramInt = i;
          paramSQLiteDatabase = paramSQLiteDatabase.obtainMessage(0, paramInt, 0, paramString);
          this.mHandler.sendMessage(paramSQLiteDatabase);
          return;
          paramInt = 0;
        }
      }
      paramInt = 0;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\wcdb\database\SQLiteAsyncCheckpointer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */