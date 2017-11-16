package com.tencent.map.geolocation.internal;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.format.DateFormat;
import c.t.m.g.b.a;
import java.io.File;
import java.io.IOException;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public final class TencentLogImpl
  implements TencentLog
{
  private static boolean DEBUG = false;
  private static final String TAG = "TencentLogImpl";
  public final File mBackupDir;
  public Handler mHandler;
  private final Runnable mKiller;
  public boolean mPrepared;
  public HandlerThread mWorker;
  
  public TencentLogImpl(Context paramContext, @Nullable File paramFile)
  {
    this.mBackupDir = paramFile;
    if ((paramFile != null) && ((paramFile.exists()) || (paramFile.mkdirs()))) {}
    for (boolean bool = true;; bool = false)
    {
      this.mPrepared = bool;
      if (this.mPrepared)
      {
        this.mWorker = new HandlerThread("log_worker", 10);
        this.mWorker.start();
        this.mHandler = new LogHandler(this.mWorker.getLooper(), null);
      }
      this.mKiller = new Runnable()
      {
        public void run()
        {
          if (TencentLogImpl.this._isPrepared())
          {
            TencentLogImpl.this.mPrepared = false;
            TencentLogImpl.this.mHandler.removeCallbacksAndMessages(null);
            TencentLogImpl.this.mWorker.quit();
          }
        }
      };
      if (DEBUG)
      {
        new StringBuilder("log dir=").append(this.mBackupDir);
        if (!this.mPrepared) {
          new StringBuilder("init failed: mPrepared=").append(this.mPrepared);
        }
      }
      return;
    }
  }
  
  public static boolean isDebugEnabled()
  {
    return DEBUG;
  }
  
  public static void setDebugEnabled(boolean paramBoolean)
  {
    DEBUG = paramBoolean;
  }
  
  public final boolean _isPrepared()
  {
    return (this.mPrepared) && (this.mHandler != null);
  }
  
  public final String getDirString()
  {
    if (this.mBackupDir != null) {
      return this.mBackupDir.getName();
    }
    return null;
  }
  
  final boolean isPrepared()
  {
    return this.mPrepared;
  }
  
  public final void println(String paramString1, int paramInt, @NonNull String paramString2)
  {
    if (_isPrepared())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(DateFormat.format("yyyy-MM-dd kk:mm:ss", System.currentTimeMillis()));
      localStringBuilder.append(":").append(paramString1);
      localStringBuilder.append(":").append(paramString2).append("\n");
      this.mHandler.obtainMessage(1, localStringBuilder.toString()).sendToTarget();
    }
  }
  
  public final void shutdown(long paramLong)
  {
    if (_isPrepared())
    {
      this.mHandler.removeCallbacks(this.mKiller);
      this.mHandler.postDelayed(this.mKiller, paramLong);
    }
  }
  
  public final boolean tryRestart()
  {
    boolean bool = false;
    if (_isPrepared())
    {
      this.mHandler.removeCallbacks(this.mKiller);
      bool = true;
    }
    return bool;
  }
  
  final class LogHandler
    extends Handler
  {
    private static final String TXWATCHDOG = "txwatchdog";
    private File mDest = makeSureDest();
    
    private LogHandler(Looper paramLooper)
    {
      super();
    }
    
    private File makeSureDest()
    {
      File localFile = TencentLogImpl.this.mBackupDir;
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      return new File(localFile, "txwatchdog");
    }
    
    public final void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      if ((this.mDest == null) || (!"txwatchdog".equals(this.mDest.getName()))) {
        this.mDest = makeSureDest();
      }
      File localFile;
      long l;
      do
      {
        try
        {
          b.a.a(paramMessage.obj.toString().getBytes("GBK"), this.mDest);
          paramMessage = TencentLogImpl.this.mBackupDir;
          localFile = this.mDest;
          if ((paramMessage == null) || (localFile == null)) {
            return;
          }
        }
        catch (IOException paramMessage)
        {
          this.mDest = null;
          return;
        }
        l = System.currentTimeMillis();
      } while (localFile.length() <= 409600L);
      localFile.renameTo(new File(paramMessage, "txwatchdog_" + l));
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\map\geolocation\internal\TencentLogImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */